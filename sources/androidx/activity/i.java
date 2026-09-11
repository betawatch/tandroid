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
import androidx.fragment.app.i0;
import androidx.lifecycle.z;
import bi.fb;
import bi.gb;
import bi.o5;
import bi.pb;
import bi.v9;
import c5.b0;
import c5.g0;
import c5.y;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.rb;
import java.io.IOException;
import m.r1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.s0;
import rg.x2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(m1 m1Var, b0 b0Var) {
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
        m.h hVar;
        int i10 = 0;
        switch (this.a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e7) {
                    if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e7;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
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
                androidx.mediarouter.app.u uVar = (androidx.mediarouter.app.u) this.b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, i10));
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
                o5 o5Var = (o5) this.b;
                if (o5Var.K1 && o5Var.b1) {
                    pb pbVar = ((gb) o5Var.Q1).d;
                    pbVar.l1 = false;
                    pbVar.P();
                    return;
                }
                return;
            case 9:
                ((fb) this.b).L0 = false;
                return;
            case 10:
                v9 v9Var = (v9) this.b;
                v9Var.b = false;
                v9Var.invalidate();
                return;
            case 11:
                y yVar = (y) this.b;
                c5.c cVar = yVar.d;
                cVar.k(0);
                c5.h hVar2 = g0.i;
                cVar.j(24, hVar2);
                yVar.c(hVar2);
                return;
            case 12:
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
                } catch (SecurityException e11) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e11);
                    return;
                }
            case 13:
                ((p0) this.b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar2 = ((p0) ((a4.m) this.b).b).b;
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
                rg.k kVar = ((rb) this.b).J0;
                if (kVar instanceof x2) {
                    ((x2) kVar).getEditText();
                    return;
                }
                return;
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
                r1 r1Var = (r1) this.b;
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
                Object obj2 = ((xa.c) this.b).b;
                return;
            case 27:
                a0 a0Var = (a0) this.b;
                if (a0Var.b == null) {
                    a0Var.b = new androidx.emoji2.text.j(a0Var, 3);
                }
                androidx.emoji2.text.j jVar = a0Var.b;
                int i11 = a0Var.c + 1;
                a0Var.c = i11;
                jVar.b = i11;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
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
                u5Var.d.addListener(new s0(this, 12));
                u5Var.d.start();
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

    public i(xa.c cVar, int i10) {
        this.a = 26;
        this.b = cVar;
    }
}
