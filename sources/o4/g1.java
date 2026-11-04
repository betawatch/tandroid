package o4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g1 implements SurfaceHolder {
    public final Surface a;
    public final Rect b;
    public SurfaceHolder.Callback c;

    public g1(Surface surface) {
        this.b = new Rect();
        this.a = surface;
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.c = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.a;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.b;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.c == callback) {
            this.c = null;
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i3, int i10) {
        this.b.set(0, 0, i3, i10);
        SurfaceHolder.Callback callback = this.c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i3, i10);
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public g1(Surface surface, int i3, int i10) {
        Rect rect = new Rect();
        this.b = rect;
        this.a = surface;
        rect.set(0, 0, i3, i10);
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i3) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z10) {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int i3) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
