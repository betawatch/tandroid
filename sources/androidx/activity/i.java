package androidx.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.f0;
import androidx.lifecycle.z;
import bi.ad;
import c5.b0;
import c5.g0;
import c5.y;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.v1;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import m.r1;
import og.f1;
import og.h1;
import og.i1;
import og.v0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.v6;
import org.telegram.ui.Cells.w5;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.oa;
import pg.v2;
import w7.j0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(m1 m1Var, b0 b0Var) {
        this.a = 14;
        this.b = b0Var;
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        float f7;
        float f10;
        int i10;
        f1 f1Var = (f1) this.b;
        if (!f1Var.f || f1Var.y.y) {
            return;
        }
        f1.b(f1Var);
        GLES20.glBindFramebuffer(36160, 0);
        f1 f1Var2 = (f1) this.b;
        GLES20.glViewport(0, 0, f1Var2.n, f1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        v0 v0Var = ((f1) this.b).y.c;
        if (v0Var.r != null) {
            if (v0Var.D != null && v0Var.F != null && v0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                i1 i1Var = (i1) v0Var.r.get("videoBlur");
                if (i1Var != null) {
                    GLES20.glUseProgram(i1Var.a);
                    GLES20.glUniformMatrix4fv(i1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(v0Var.y));
                    GLES20.glUniform1f(i1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(i1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, v0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(i1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    oa oaVar = v0Var.F.m;
                    GLES20.glBindTexture(3553, oaVar != null ? oaVar.s[2] : -1);
                    if (v0Var.b == null || !(v0Var.i instanceof og.d)) {
                        GLES20.glUniform1f(i1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(i1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(i1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, v0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) v0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) v0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (v0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (v0Var.b != null) {
                v0Var.n(v0Var.g(), v0Var.b, (1.0f - (v0Var.I * 0.5f)) - (v0Var.J * 0.5f));
            } else if (v0Var.c != null) {
                v0Var.o(v0Var.j(), v0Var.g(), v0Var.c, 1.0f);
            } else {
                int j3 = v0Var.j();
                f7 = 0.0f;
                i1 i1Var2 = (i1) v0Var.r.get(v0Var.G ? "maskingBlit" : "blit");
                if (j3 != 0 && i1Var2 != null) {
                    GLES20.glUseProgram(i1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(i1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(v0Var.y));
                    GLES20.glUniform1f(i1Var2.d("alpha"), 1.0f);
                    if (v0Var.G) {
                        GLES20.glUniform1i(i1Var2.d("texture"), 1);
                        GLES20.glUniform1i(i1Var2.d("mask"), 0);
                        GLES20.glUniform1f(i1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, v0Var.l.c());
                    } else {
                        GLES20.glUniform1i(i1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) v0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) v0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    j0.a();
                    i10 = v0Var.q;
                    if (i10 != 0 && v0Var.d != null && v0Var.I > f7) {
                        v0Var.o(i10, v0Var.g(), v0Var.d, (v0Var.J * f10) + (v0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = v0Var.q;
                if (i10 != 0) {
                    v0Var.o(i10, v0Var.g(), v0Var.d, (v0Var.J * f10) + (v0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = v0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        f1 f1Var3 = (f1) this.b;
        f1Var3.b.eglSwapBuffers(f1Var3.c, f1Var3.e);
        h1 h1Var = ((f1) this.b).y;
        if (!h1Var.s) {
            h1Var.s = true;
            AndroidUtilities.runOnUIThread(new v1(this, 26));
        }
        if (((f1) this.b).h) {
            return;
        }
        ((f1) this.b).h = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        m.h hVar;
        int i10 = 4;
        int i11 = 0;
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
                ((androidx.fragment.app.j0) this.b).A(true);
                return;
            case 5:
                synchronized (((z) this.b).a) {
                    obj = ((z) this.b).f;
                    ((z) this.b).f = z.k;
                }
                ((z) this.b).j(obj);
                return;
            case 6:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, i11));
                return;
            case 7:
                androidx.mediarouter.app.u uVar2 = ((androidx.mediarouter.app.s) this.b).b;
                if (uVar2.c0 != null) {
                    uVar2.c0 = null;
                    if (uVar2.s0) {
                        uVar2.q(uVar2.t0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                pg.j jVar = ((ad) this.b).J0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            case 9:
                y yVar = (y) this.b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = g0.i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 10:
                com.google.android.gms.common.api.internal.g0 g0Var = (com.google.android.gms.common.api.internal.g0) this.b;
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
            case 11:
                ((p0) this.b).f();
                return;
            case 12:
                com.google.android.gms.common.api.c cVar2 = ((p0) ((a6.i) this.b).b).b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((d1) this.b).j.b(new k6.a(4));
                return;
            case 14:
                return;
            case 15:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 16:
                ((f6.i) this.b).g(false);
                return;
            case 17:
                a();
                return;
            case 18:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 19:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 20:
                jg.e eVar3 = (jg.e) this.b;
                eVar3.f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 21:
                r1 r1Var = (r1) this.b;
                r1Var.w = null;
                r1Var.drawableStateChanged();
                return;
            case 22:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.J) == null) {
                    return;
                }
                hVar.l();
                return;
            case 23:
                Object obj2 = ((pb.c) this.b).b;
                return;
            case 24:
                b();
                return;
            case 25:
                a0 a0Var = (a0) this.b;
                if (a0Var.b == null) {
                    a0Var.b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.b;
                int i12 = a0Var.c + 1;
                a0Var.c = i12;
                jVar2.b = i12;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 26:
                w5 w5Var = (w5) this.b;
                TextView textView = w5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                w5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(w5Var.a, (Property<TextView, Float>) property, 1.0f));
                w5Var.d.setDuration(250L);
                w5Var.d.setInterpolator(new DecelerateInterpolator());
                w5Var.d.addListener(new bi.h(this, 29));
                w5Var.d.start();
                return;
            case 27:
                v6 v6Var = (v6) this.b;
                v6Var.a();
                RectF rectF = v6Var.f;
                v6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v6Var.v, 1000L);
                return;
            case 28:
                o7 o7Var = (o7) this.b;
                if (o7Var.b == null) {
                    o7Var.b = new androidx.emoji2.text.j(o7Var, i10);
                }
                androidx.emoji2.text.j jVar3 = o7Var.b;
                int i13 = o7Var.c + 1;
                o7Var.c = i13;
                jVar3.b = i13;
                o7Var.postDelayed(jVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            default:
                x7 x7Var = (x7) this.b;
                RectF rectF2 = x7Var.n;
                x7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(x7Var.y, 1000L);
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(pb.c cVar, int i10) {
        this.a = 23;
        this.b = cVar;
    }
}
