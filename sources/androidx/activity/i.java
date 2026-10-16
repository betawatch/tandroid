package androidx.activity;

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
import androidx.biometric.g0;
import androidx.fragment.app.i0;
import androidx.lifecycle.z;
import bi.ib;
import bi.jb;
import bi.q5;
import bi.sb;
import bi.y9;
import c5.c0;
import c5.h0;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.mb;
import java.io.IOException;
import m.t1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.u0;
import rg.x2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(m1 m1Var, c0 c0Var) {
        this.a = 16;
        this.b = c0Var;
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
        m.i iVar;
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
                g0 g0Var = (g0) this.b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    g0Var.C0.f(1);
                    g0Var.C0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 2:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.b;
                oVar.n0.onDismiss(oVar.v0);
                return;
            case 3:
                androidx.fragment.app.r rVar = (androidx.fragment.app.r) this.b;
                if (rVar.Y != null) {
                    rVar.j().getClass();
                    return;
                }
                return;
            case 4:
                ((i0) this.b).A(true);
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
                q5 q5Var = (q5) this.b;
                if (q5Var.K1 && q5Var.b1) {
                    sb sbVar = ((jb) q5Var.Q1).d;
                    sbVar.l1 = false;
                    sbVar.P();
                    return;
                }
                return;
            case 9:
                ((ib) this.b).L0 = false;
                return;
            case 10:
                y9 y9Var = (y9) this.b;
                y9Var.b = false;
                y9Var.invalidate();
                return;
            case 11:
                c5.z zVar = (c5.z) this.b;
                c5.c cVar = zVar.d;
                cVar.k(0);
                c5.i iVar2 = h0.i;
                cVar.j(24, iVar2);
                zVar.c(iVar2);
                return;
            case 12:
                com.google.android.gms.common.api.internal.g0 g0Var2 = (com.google.android.gms.common.api.internal.g0) this.b;
                k6.e eVar = g0Var2.d;
                Context context = g0Var2.c;
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
            case 13:
                ((p0) this.b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar2 = ((p0) ((a6.i) this.b).b).b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((d1) this.b).j.b(new k6.a(4));
                return;
            case 16:
                return;
            case 17:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 18:
                rg.j jVar = ((mb) this.b).J0;
                if (jVar instanceof x2) {
                    ((x2) jVar).getEditText();
                    return;
                }
                return;
            case 19:
                ((f6.h) this.b).g(false);
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
                lg.e eVar3 = (lg.e) this.b;
                eVar3.f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 24:
                t1 t1Var = (t1) this.b;
                t1Var.w = null;
                t1Var.drawableStateChanged();
                return;
            case 25:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (iVar = actionMenuView.J) == null) {
                    return;
                }
                iVar.l();
                return;
            case 26:
                Object obj2 = ((a6.i) this.b).b;
                return;
            case 27:
                a0 a0Var = (a0) this.b;
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
                v5 v5Var = (v5) this.b;
                TextView textView = v5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new u0(this, 12));
                v5Var.d.start();
                return;
            default:
                t6 t6Var = (t6) this.b;
                t6Var.a();
                RectF rectF = t6Var.f;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.v, 1000L);
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(a6.i iVar, int i10) {
        this.a = 26;
        this.b = iVar;
    }
}
