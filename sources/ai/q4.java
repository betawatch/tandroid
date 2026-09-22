package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q4 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public q4(com.google.android.gms.common.api.internal.m1 m1Var, c5.b0 b0Var) {
        this.a = 17;
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

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        m.h hVar;
        int i10 = 0;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                if (f6Var.K1 && f6Var.b1) {
                    jc jcVar = ((ac) f6Var.Q1).d;
                    jcVar.l1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                ((zb) this.b).L0 = false;
                return;
            case 2:
                oa oaVar = (oa) this.b;
                oaVar.b = false;
                oaVar.invalidate();
                return;
            case 3:
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
            case 4:
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    e0Var.C0.f(1);
                    e0Var.C0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 5:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.n0.onDismiss(pVar.v0);
                return;
            case 6:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.Y != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 7:
                ((androidx.fragment.app.k0) this.b).A(true);
                return;
            case 8:
                synchronized (((androidx.lifecycle.z) this.b).a) {
                    obj = ((androidx.lifecycle.z) this.b).f;
                    ((androidx.lifecycle.z) this.b).f = androidx.lifecycle.z.k;
                }
                ((androidx.lifecycle.z) this.b).j(obj);
                return;
            case 9:
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, i10));
                return;
            case 10:
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
            case 11:
                c5.y yVar = (c5.y) this.b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = c5.g0.i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
                qg.j jVar = ((ci.qb) this.b).J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
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
            case 14:
                ((com.google.android.gms.common.api.internal.p0) this.b).f();
                return;
            case 15:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.p0) ((a6.m) this.b).b).b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((com.google.android.gms.common.api.internal.d1) this.b).j.b(new k6.a(4));
                return;
            case 17:
                return;
            case 18:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 19:
                ((f6.i) this.b).g(false);
                return;
            case 20:
                a();
                return;
            case 21:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 22:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                kg.e eVar3 = (kg.e) this.b;
                eVar3.f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                m.r1 r1Var = (m.r1) this.b;
                r1Var.w = null;
                r1Var.drawableStateChanged();
                return;
            case 25:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.J) == null) {
                    return;
                }
                hVar.l();
                return;
            case 26:
                Object obj2 = ((a6.i) this.b).b;
                return;
            case 27:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) this.b;
                if (a0Var.b == null) {
                    a0Var.b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar2 = a0Var.b;
                int i11 = a0Var.c + 1;
                a0Var.c = i11;
                jVar2.b = i11;
                a0Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.b;
                TextView textView = v5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new org.telegram.ui.t4(this, 9));
                v5Var.d.start();
                return;
            default:
                org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) this.b;
                t6Var.a();
                RectF rectF = t6Var.f;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.v, 1000L);
                return;
        }
    }

    public /* synthetic */ q4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public q4(a6.i iVar, int i10) {
        this.a = 26;
        this.b = iVar;
    }
}
