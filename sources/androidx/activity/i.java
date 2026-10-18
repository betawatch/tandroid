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
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import c5.b0;
import c5.g0;
import c5.y;
import ci.aa;
import ci.j8;
import ci.q4;
import ci.q9;
import ci.r9;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.xa;
import java.io.IOException;
import m.s1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u5;
import rg.v2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(l1 l1Var, b0 b0Var) {
        this.a = 16;
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
                y yVar = (y) this.b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.i iVar2 = g0.i;
                cVar.j(24, iVar2);
                yVar.c(iVar2);
                return;
            case 9:
                q4 q4Var = (q4) this.b;
                if (q4Var.K1 && q4Var.b1) {
                    aa aaVar = ((r9) q4Var.Q1).d;
                    aaVar.l1 = false;
                    aaVar.P();
                    return;
                }
                return;
            case 10:
                ((q9) this.b).L0 = false;
                return;
            case 11:
                j8 j8Var = (j8) this.b;
                j8Var.b = false;
                j8Var.invalidate();
                return;
            case 12:
                com.google.android.gms.common.api.internal.f0 f0Var2 = (com.google.android.gms.common.api.internal.f0) this.b;
                k6.e eVar = f0Var2.d;
                Context context = f0Var2.c;
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
                ((o0) this.b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar2 = ((o0) ((ag.b) this.b).b).b;
                cVar2.d(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((c1) this.b).j.b(new k6.a(4));
                return;
            case 16:
                return;
            case 17:
                com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
                wVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.w.l(wVar);
                    return;
                } finally {
                    wVar.o.unlock();
                }
            case 18:
                rg.j jVar = ((xa) this.b).J0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
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
                s1 s1Var = (s1) this.b;
                s1Var.w = null;
                s1Var.drawableStateChanged();
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
                u5 u5Var = (u5) this.b;
                TextView textView = u5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                u5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(u5Var.a, (Property<TextView, Float>) property, 1.0f));
                u5Var.d.setDuration(250L);
                u5Var.d.setInterpolator(new DecelerateInterpolator());
                u5Var.d.addListener(new m.a(this, 14));
                u5Var.d.start();
                return;
            default:
                s6 s6Var = (s6) this.b;
                s6Var.a();
                RectF rectF = s6Var.f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
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
