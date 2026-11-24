// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gpc extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final dpc[] y = new dpc[3];
    public final dpc a;
    public final Rect b;
    public final Runnable c;
    public final short d;
    public fpc e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;

    public gpc(Context context, Runnable runnable, int i) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        dpc[] dpcVarArr = y;
        if (dpcVarArr[i] == null) {
            dpcVarArr[i] = new dpc(context.getApplicationContext(), i);
        }
        dpc dpcVar = dpcVarArr[i];
        this.a = dpcVar;
        dpcVar.getClass();
        this.d = (short) 378;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.f || this.h) {
            return;
        }
        this.c.run();
        if (this.e != null) {
            boolean z = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b);
            this.e.e = z ? new epc(this.r, this.s, this.w, this.x) : null;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.n = false;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        fpc fpcVar = new fpc(this, new Surface(surfaceTexture), this.d);
        this.e = fpcVar;
        dpc dpcVar = this.a;
        dpcVar.e.add(fpcVar);
        dpcVar.f = (fpc[]) dpcVar.e.toArray(new fpc[0]);
        dpcVar.c();
        setPaused(this.h);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        fpc fpcVar = this.e;
        this.e = null;
        if (fpcVar == null) {
            return true;
        }
        dpc dpcVar = this.a;
        dpcVar.getClass();
        fpcVar.c = false;
        dpcVar.e.remove(fpcVar);
        dpcVar.f = (fpc[]) dpcVar.e.toArray(new fpc[0]);
        dpcVar.b.post(new qhc((Object) dpcVar, (Object) fpcVar, (byte) 20));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        fpc fpcVar;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        if (this.n || (fpcVar = this.e) == null || !fpcVar.d) {
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

    public void setPaused(boolean z) {
        this.h = z;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f && !z) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        fpc fpcVar = this.e;
        if (fpcVar != null) {
            fpcVar.e = null;
            this.a.c();
        }
    }
}
