package org.telegram.ui.Components;

import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i10;
        yf.z0 z0Var = (yf.z0) this.b;
        if (!z0Var.f || z0Var.y.y) {
            return;
        }
        yf.z0.b(z0Var);
        GLES20.glBindFramebuffer(36160, 0);
        yf.z0 z0Var2 = (yf.z0) this.b;
        GLES20.glViewport(0, 0, z0Var2.n, z0Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        yf.p0 p0Var = ((yf.z0) this.b).y.c;
        if (p0Var.r != null) {
            if (p0Var.D != null && p0Var.F != null && p0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                yf.c1 c1Var = (yf.c1) p0Var.r.get("videoBlur");
                if (c1Var != null) {
                    GLES20.glUseProgram(c1Var.a);
                    GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(p0Var.y));
                    GLES20.glUniform1f(c1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, p0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(c1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    fa faVar = p0Var.F.m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.s[2] : -1);
                    if (p0Var.b == null || !(p0Var.i instanceof yf.d)) {
                        GLES20.glUniform1f(c1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(c1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(c1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, p0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) p0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) p0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (p0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (p0Var.b != null) {
                p0Var.n(p0Var.g(), p0Var.b, (1.0f - (p0Var.I * 0.5f)) - (p0Var.J * 0.5f));
            } else if (p0Var.c != null) {
                p0Var.o(p0Var.j(), p0Var.g(), p0Var.c, 1.0f);
            } else {
                int j10 = p0Var.j();
                f10 = 0.0f;
                yf.c1 c1Var2 = (yf.c1) p0Var.r.get(p0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && c1Var2 != null) {
                    GLES20.glUseProgram(c1Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(c1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(p0Var.y));
                    GLES20.glUniform1f(c1Var2.d("alpha"), 1.0f);
                    if (p0Var.G) {
                        GLES20.glUniform1i(c1Var2.d("texture"), 1);
                        GLES20.glUniform1i(c1Var2.d("mask"), 0);
                        GLES20.glUniform1f(c1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, p0Var.l.c());
                    } else {
                        GLES20.glUniform1i(c1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) p0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) p0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    h7.n8.a();
                    i10 = p0Var.q;
                    if (i10 != 0 && p0Var.d != null && p0Var.I > f10) {
                        p0Var.o(i10, p0Var.g(), p0Var.d, (p0Var.J * f11) + (p0Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i10 = p0Var.q;
                if (i10 != 0) {
                    p0Var.o(i10, p0Var.g(), p0Var.d, (p0Var.J * f11) + (p0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i10 = p0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        yf.z0 z0Var3 = (yf.z0) this.b;
        z0Var3.b.eglSwapBuffers(z0Var3.c, z0Var3.e);
        yf.b1 b1Var = ((yf.z0) this.b).y;
        if (!b1Var.s) {
            b1Var.s = true;
            AndroidUtilities.runOnUIThread(new qf.b(this, 21));
        }
        if (((yf.z0) this.b).h) {
            return;
        }
        ((yf.z0) this.b).h = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ShutterButton shutterButton = (ShutterButton) this.b;
                nu0 nu0Var = shutterButton.e;
                if (nu0Var == null || ((el) nu0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 1:
                iw0 iw0Var = (iw0) this.b;
                View view = iw0Var.s;
                if (view == null) {
                    iw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    iw0Var.s.setVisibility(0);
                    iw0Var.s.setAlpha(0.0f);
                }
                iw0Var.s.animate().setListener(null).cancel();
                iw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 2:
                o71 o71Var = (o71) this.b;
                if (o71Var.F) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = o71Var.b0 + (elapsedRealtime / 200.0f);
                    o71Var.b0 = f10;
                    o71Var.setAnimationIdicatorProgress(o71Var.T.getInterpolation(f10));
                    if (o71Var.b0 > 1.0f) {
                        o71Var.b0 = 1.0f;
                    }
                    if (o71Var.b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(o71Var.e0);
                        return;
                    }
                    o71Var.F = false;
                    o71Var.setEnabled(true);
                    n71 n71Var = o71Var.y;
                    if (n71Var != null) {
                        ((m5.o) n71Var).x(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.b;
                if (!j30Var.b || j30Var.M0.v0 != null) {
                    AndroidUtilities.runOnUIThread(j30Var.d0, 3000L);
                    return;
                } else {
                    j30Var.c0 = false;
                    j30Var.setUiVisible(false);
                    return;
                }
            case 4:
                ((p5.h) this.b).g(false);
                return;
            case 5:
                r5.p pVar = (r5.p) this.b;
                synchronized (r5.p.i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 6:
                tf.e eVar = (tf.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 7:
                u0.d dVar = (u0.d) this.b;
                m.s1 s1Var = dVar.c;
                u0.a aVar = dVar.a;
                if (dVar.A) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !dVar.e()) {
                        dVar.A = false;
                        return;
                    }
                    if (dVar.y) {
                        dVar.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.C.scrollListBy((int) (j10 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = r0.j0.a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 9:
                a();
                return;
            default:
                zf.j jVar = ((org.telegram.ui.ys0) this.b).O0;
                if (jVar instanceof zf.v2) {
                    ((zf.v2) jVar).getEditText();
                    return;
                }
                return;
        }
    }
}
