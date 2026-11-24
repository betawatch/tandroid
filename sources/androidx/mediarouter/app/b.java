package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ MediaRouteButton c;

    public b(MediaRouteButton mediaRouteButton, int i, Context context) {
        this.c = mediaRouteButton;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray<Drawable.ConstantState> sparseArray = MediaRouteButton.sRemoteIndicatorCache;
        int i = this.a;
        if (sparseArray.get(i) == null) {
            return kod.a(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.sRemoteIndicatorCache.put(this.a, drawable.getConstantState());
        }
        this.c.mRemoteIndicatorLoader = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        MediaRouteButton mediaRouteButton = this.c;
        if (drawable != null) {
            MediaRouteButton.sRemoteIndicatorCache.put(i, drawable.getConstantState());
            mediaRouteButton.mRemoteIndicatorLoader = null;
        } else {
            Drawable.ConstantState constantState = MediaRouteButton.sRemoteIndicatorCache.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.mRemoteIndicatorLoader = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
