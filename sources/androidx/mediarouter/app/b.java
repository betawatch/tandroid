package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;
import v7.q7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ MediaRouteButton c;

    public b(MediaRouteButton mediaRouteButton, int i10, Context context) {
        this.c = mediaRouteButton;
        this.a = i10;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray<Drawable.ConstantState> sparseArray = MediaRouteButton.sRemoteIndicatorCache;
        int i10 = this.a;
        if (sparseArray.get(i10) == null) {
            return q7.b(this.b, i10);
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
        int i10 = this.a;
        MediaRouteButton mediaRouteButton = this.c;
        if (drawable != null) {
            MediaRouteButton.sRemoteIndicatorCache.put(i10, drawable.getConstantState());
            mediaRouteButton.mRemoteIndicatorLoader = null;
        } else {
            Drawable.ConstantState constantState = MediaRouteButton.sRemoteIndicatorCache.get(i10);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.mRemoteIndicatorLoader = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
