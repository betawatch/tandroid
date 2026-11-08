package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ MediaRouteButton c;

    public b(MediaRouteButton mediaRouteButton, int i7, Context context) {
        this.c = mediaRouteButton;
        this.a = i7;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray<Drawable.ConstantState> sparseArray = MediaRouteButton.sRemoteIndicatorCache;
        int i7 = this.a;
        if (sparseArray.get(i7) == null) {
            return b5.a.b(this.b, i7);
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
        int i7 = this.a;
        MediaRouteButton mediaRouteButton = this.c;
        if (drawable != null) {
            MediaRouteButton.sRemoteIndicatorCache.put(i7, drawable.getConstantState());
            mediaRouteButton.mRemoteIndicatorLoader = null;
        } else {
            Drawable.ConstantState constantState = MediaRouteButton.sRemoteIndicatorCache.get(i7);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.mRemoteIndicatorLoader = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
