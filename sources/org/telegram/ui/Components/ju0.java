package org.telegram.ui.Components;

import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ju0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ju0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i9;
        xf.a1 a1Var = (xf.a1) this.b;
        if (!a1Var.f || a1Var.y.y) {
            return;
        }
        xf.a1.b(a1Var);
        GLES20.glBindFramebuffer(36160, 0);
        xf.a1 a1Var2 = (xf.a1) this.b;
        GLES20.glViewport(0, 0, a1Var2.n, a1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        xf.q0 q0Var = ((xf.a1) this.b).y.c;
        if (q0Var.r != null) {
            if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                xf.d1 d1Var = (xf.d1) q0Var.r.get("videoBlur");
                if (d1Var != null) {
                    GLES20.glUseProgram(d1Var.a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, q0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = q0Var.F.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
                    if (q0Var.b == null || !(q0Var.i instanceof xf.d)) {
                        GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(d1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, q0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (q0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (q0Var.b != null) {
                q0Var.n(q0Var.g(), q0Var.b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
            } else if (q0Var.c != null) {
                q0Var.o(q0Var.j(), q0Var.g(), q0Var.c, 1.0f);
            } else {
                int j10 = q0Var.j();
                f10 = 0.0f;
                xf.d1 d1Var2 = (xf.d1) q0Var.r.get(q0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && d1Var2 != null) {
                    GLES20.glUseProgram(d1Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                    if (q0Var.G) {
                        GLES20.glUniform1i(d1Var2.d("texture"), 1);
                        GLES20.glUniform1i(d1Var2.d("mask"), 0);
                        GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, q0Var.l.c());
                    } else {
                        GLES20.glUniform1i(d1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    g7.j8.a();
                    i9 = q0Var.q;
                    if (i9 != 0 && q0Var.d != null && q0Var.I > f10) {
                        q0Var.o(i9, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i9 = q0Var.q;
                if (i9 != 0) {
                    q0Var.o(i9, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i9 = q0Var.q;
            if (i9 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        xf.a1 a1Var3 = (xf.a1) this.b;
        a1Var3.b.eglSwapBuffers(a1Var3.c, a1Var3.e);
        xf.c1 c1Var = ((xf.a1) this.b).y;
        if (!c1Var.s) {
            c1Var.s = true;
            AndroidUtilities.runOnUIThread(new pf.o1(this, 13));
        }
        if (((xf.a1) this.b).h) {
            return;
        }
        ((xf.a1) this.b).h = true;
    }

    private final void b() {
        z7.a aVar = (z7.a) this.b;
        synchronized (aVar.a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int R;
        switch (this.a) {
            case 0:
                ShutterButton shutterButton = (ShutterButton) this.b;
                ku0 ku0Var = shutterButton.e;
                if (ku0Var == null || ((il) ku0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 1:
                gw0 gw0Var = (gw0) this.b;
                View view = gw0Var.s;
                if (view == null) {
                    gw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    gw0Var.s.setVisibility(0);
                    gw0Var.s.setAlpha(0.0f);
                }
                gw0Var.s.animate().setListener(null).cancel();
                gw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 2:
                m71 m71Var = (m71) this.b;
                if (m71Var.F) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = m71Var.b0 + (elapsedRealtime / 200.0f);
                    m71Var.b0 = f10;
                    m71Var.setAnimationIdicatorProgress(m71Var.T.getInterpolation(f10));
                    if (m71Var.b0 > 1.0f) {
                        m71Var.b0 = 1.0f;
                    }
                    if (m71Var.b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(m71Var.e0);
                        return;
                    }
                    m71Var.F = false;
                    m71Var.setEnabled(true);
                    l71 l71Var = m71Var.y;
                    if (l71Var != null) {
                        ((n2.p) l71Var).F(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) this.b;
                if (!g30Var.b || g30Var.M0.v0 != null) {
                    AndroidUtilities.runOnUIThread(g30Var.d0, 3000L);
                    return;
                } else {
                    g30Var.c0 = false;
                    g30Var.setUiVisible(false);
                    return;
                }
            case 4:
                ((p5.h) this.b).g(false);
                return;
            case 5:
                q5.p pVar = (q5.p) this.b;
                synchronized (q5.p.i) {
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
                sf.e eVar = (sf.e) this.b;
                eVar.f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 7:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
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
            case 9:
                a();
                return;
            case 10:
                yf.j jVar = ((org.telegram.ui.xs0) this.b).O0;
                if (jVar instanceof yf.v2) {
                    ((yf.v2) jVar).getEditText();
                    return;
                }
                return;
            case 11:
                b();
                return;
            default:
                zf.s0 s0Var = (zf.s0) this.b;
                ArrayList arrayList = s0Var.c3;
                if (s0Var.j3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((zf.n1) j3.r0.j(1, arrayList))) >= 0) {
                        View m10 = s0Var.U2.m(R + 1);
                        if (m10 != null) {
                            s0Var.Z2 = false;
                            s0Var.w1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.x1();
                    return;
                }
                return;
        }
    }
}
