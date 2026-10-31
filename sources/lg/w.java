package lg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class w extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final t[] y = new t[3];
    public final t a;
    public final Rect b;
    public final Runnable c;
    public final int d;
    public v e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;

    public w(Context context, Runnable runnable, int i10) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        t[] tVarArr = y;
        if (tVarArr[i10] == null) {
            tVarArr[i10] = new t(context.getApplicationContext(), i10);
        }
        t tVar = tVarArr[i10];
        this.a = tVar;
        this.d = tVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (!this.f || this.h) {
            return;
        }
        this.c.run();
        if (this.e != null) {
            boolean z10 = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b);
            this.e.e = z10 ? new u(this.r, this.s, this.w, this.x) : null;
            this.a.c();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        setPaused(this.h);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.n = false;
        this.f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        v vVar = new v(this, new Surface(surfaceTexture), this.d);
        this.e = vVar;
        t tVar = this.a;
        tVar.f.add(vVar);
        tVar.g = (v[]) tVar.f.toArray(new v[0]);
        tVar.c();
        setPaused(this.h);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        v vVar = this.e;
        this.e = null;
        if (vVar == null) {
            return true;
        }
        t tVar = this.a;
        tVar.getClass();
        vVar.c = false;
        tVar.f.remove(vVar);
        tVar.g = (v[]) tVar.f.toArray(new v[0]);
        tVar.b.post(new k2.u(11, tVar, vVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        v vVar;
        int i10 = this.d;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (this.n || (vVar = this.e) == null || !vVar.d) {
            return;
        }
        this.n = true;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z10) {
        this.h = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        v vVar = this.e;
        if (vVar != null) {
            vVar.e = null;
            this.a.c();
        }
    }
}
