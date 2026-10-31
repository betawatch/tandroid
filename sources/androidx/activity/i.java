package androidx.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import c5.c0;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.a1;
import ig.c1;
import ig.d1;
import ig.q0;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import jg.g3;
import kg.b1;
import kg.f2;
import kg.g2;
import kg.y1;
import li.x0;
import m.r1;
import mg.v1;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.x9;
import org.telegram.ui.er0;
import v7.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(n1 n1Var, c5.x xVar) {
        this.a = 15;
        this.b = xVar;
    }

    private final void a() {
        g6.o oVar = (g6.o) this.b;
        synchronized (g6.o.i) {
            try {
                if (oVar.d()) {
                    oVar.f(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        float f7;
        float f10;
        int i10;
        a1 a1Var = (a1) this.b;
        if (!a1Var.f || a1Var.D.D) {
            return;
        }
        a1.a(a1Var);
        GLES20.glBindFramebuffer(36160, 0);
        a1 a1Var2 = (a1) this.b;
        GLES20.glViewport(0, 0, a1Var2.n, a1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(TLObject.FLAG_14);
        q0 q0Var = ((a1) this.b).D.c;
        if (q0Var.r != null) {
            if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                d1 d1Var = (d1) q0Var.r.get("videoBlur");
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
                    x9 x9Var = q0Var.F.m;
                    GLES20.glBindTexture(3553, x9Var != null ? x9Var.s[2] : -1);
                    if (q0Var.b == null || !(q0Var.i instanceof ig.d)) {
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
                f7 = 0.0f;
                d1 d1Var2 = (d1) q0Var.r.get(q0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && d1Var2 != null) {
                    GLES20.glUseProgram(d1Var2.a);
                    f10 = 0.5f;
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
                    h8.a();
                    i10 = q0Var.q;
                    if (i10 != 0 && q0Var.d != null && q0Var.I > f7) {
                        q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = q0Var.q;
                if (i10 != 0) {
                    q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = q0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        a1 a1Var3 = (a1) this.b;
        a1Var3.b.eglSwapBuffers(a1Var3.c, a1Var3.e);
        c1 c1Var = ((a1) this.b).D;
        if (!c1Var.s) {
            c1Var.s = true;
            i0.g3(new gg.c(this, 8));
        }
        if (((a1) this.b).h) {
            return;
        }
        ((a1) this.b).h = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int R;
        i2.i0 i0Var;
        m.h hVar;
        int i10 = 0;
        switch (this.a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!TextUtils.equals(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
            case 1:
                f0 f0Var = (f0) this.b;
                Context n10 = f0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    f0Var.C0.f(1);
                    f0Var.C0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 2:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.n0.onDismiss(pVar.v0);
                return;
            case 3:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 4:
                ((j0) this.b).A(true);
                return;
            case 5:
                synchronized (((z) this.b).a) {
                    obj = ((z) this.b).f;
                    ((z) this.b).f = z.k;
                }
                ((z) this.b).j(obj);
                return;
            case 6:
                androidx.mediarouter.app.t tVar = (androidx.mediarouter.app.t) this.b;
                tVar.i(true);
                tVar.U.requestLayout();
                tVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(tVar, i10));
                return;
            case 7:
                androidx.mediarouter.app.t tVar2 = ((androidx.mediarouter.app.r) this.b).b;
                if (tVar2.c0 != null) {
                    tVar2.c0 = null;
                    if (tVar2.s0) {
                        tVar2.q(tVar2.t0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((bi.j0) this.b).j();
                return;
            case 9:
                bi.n1 n1Var = (bi.n1) this.b;
                if (t6.h1()) {
                    n1Var.postDelayed(this, 100L);
                    return;
                } else {
                    n1Var.I();
                    return;
                }
            case 10:
                c5.u uVar = (c5.u) this.b;
                c5.b bVar = uVar.d;
                bVar.k(0);
                c5.g gVar = c0.i;
                bVar.j(24, gVar);
                uVar.c(gVar);
                return;
            case 11:
                g0 g0Var = (g0) this.b;
                k6.e eVar = g0Var.d;
                Context context = g0Var.c;
                eVar.getClass();
                if (k6.g.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e10) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
                    return;
                }
            case 12:
                ((com.google.android.gms.common.api.internal.q0) this.b).f();
                return;
            case 13:
                com.google.android.gms.common.api.c cVar = ((com.google.android.gms.common.api.internal.q0) ((k6.h) this.b).b).b;
                cVar.e(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                ((e1) this.b).j.b(new k6.a(4));
                return;
            case 15:
                return;
            case 16:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 17:
                dg.f fVar = (dg.f) this.b;
                fVar.f.animate().setDuration(120L).alpha(0.0f);
                fVar.h.animate().setListener(null).start();
                if (fVar.h.getVisibility() != 0) {
                    fVar.h.setVisibility(0);
                    fVar.h.setAlpha(0.0f);
                }
                fVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 18:
                ((f6.i) this.b).g(false);
                return;
            case 19:
                a();
                return;
            case 20:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 21:
                b();
                return;
            case 22:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                jg.j jVar = ((er0) this.b).B0;
                if (jVar instanceof g3) {
                    ((g3) jVar).getEditText();
                    return;
                }
                return;
            case 24:
                b1 b1Var = (b1) this.b;
                ArrayList arrayList = b1Var.n3;
                if (b1Var.u3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((y1) i0.a.g(1, arrayList))) >= 0) {
                        View m10 = b1Var.f3.m(R + 1);
                        if (m10 != null) {
                            b1Var.k3 = false;
                            b1Var.z1(m10, true);
                            b1Var.w0(0, m10.getTop() - ((b1Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), i0.H);
                        }
                    }
                    b1Var.A1();
                    return;
                }
                return;
            case 25:
                g2 g2Var = (g2) this.b;
                try {
                    f2 f2Var = g2Var.a;
                    if (f2Var != null) {
                        f2Var.g();
                        g2Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
            case 26:
                x0 x0Var = (x0) this.b;
                if (x0Var.Z == 5 && (i0Var = x0Var.V) != null && x0Var.z) {
                    long M0 = i0Var.M0();
                    long j10 = x0Var.J;
                    if (M0 < j10 || M0 >= x0Var.K) {
                        x0Var.V.Z0(5, j10);
                    }
                    x0Var.d.getClass();
                    x0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 27:
                r1 r1Var = (r1) this.b;
                r1Var.x = null;
                r1Var.drawableStateChanged();
                return;
            case 28:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.J) == null) {
                    return;
                }
                hVar.l();
                return;
            default:
                v1 v1Var = (v1) this.b;
                String str = v1Var.f2;
                if (str != null) {
                    v1Var.f1(v1Var.j2, str, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
