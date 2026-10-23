package androidx.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import c5.c0;
import c5.h0;
import ci.i8;
import ci.p4;
import ci.p9;
import ci.q9;
import ci.z9;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.xa;
import java.io.IOException;
import ki.g0;
import ki.h1;
import m.s1;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import rg.w2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(l1 l1Var, c0 c0Var) {
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
                c5.z zVar = (c5.z) this.b;
                c5.c cVar = zVar.d;
                cVar.k(0);
                c5.i iVar2 = h0.i;
                cVar.j(24, iVar2);
                zVar.c(iVar2);
                return;
            case 9:
                p4 p4Var = (p4) this.b;
                if (p4Var.K1 && p4Var.b1) {
                    z9 z9Var = ((q9) p4Var.Q1).d;
                    z9Var.l1 = false;
                    z9Var.P();
                    return;
                }
                return;
            case 10:
                ((p9) this.b).L0 = false;
                return;
            case 11:
                i8 i8Var = (i8) this.b;
                i8Var.b = false;
                i8Var.invalidate();
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
                com.google.android.gms.common.api.c cVar2 = ((o0) ((a4.l) this.b).b).b;
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
                if (jVar instanceof w2) {
                    ((w2) jVar).getEditText();
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
                ((g0) this.b).h();
                return;
            case 24:
                h1 h1Var = (h1) this.b;
                if (k6.g1()) {
                    h1Var.postDelayed(this, 100L);
                    return;
                } else {
                    h1Var.m();
                    return;
                }
            case 25:
                lg.e eVar3 = (lg.e) this.b;
                eVar3.f.animate().setDuration(120L).alpha(0.0f);
                eVar3.h.animate().setListener(null).start();
                if (eVar3.h.getVisibility() != 0) {
                    eVar3.h.setVisibility(0);
                    eVar3.h.setAlpha(0.0f);
                }
                eVar3.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 26:
                s1 s1Var = (s1) this.b;
                s1Var.w = null;
                s1Var.drawableStateChanged();
                return;
            case 27:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (iVar = actionMenuView.J) == null) {
                    return;
                }
                iVar.l();
                return;
            case 28:
                Object obj2 = ((a6.i) this.b).b;
                return;
            default:
                org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.b;
                if (zVar2.b == null) {
                    zVar2.b = new androidx.emoji2.text.j(zVar2, 3);
                }
                androidx.emoji2.text.j jVar2 = zVar2.b;
                int i11 = zVar2.c + 1;
                zVar2.c = i11;
                jVar2.b = i11;
                zVar2.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(a6.i iVar, int i10) {
        this.a = 28;
        this.b = iVar;
    }
}
