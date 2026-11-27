// default package

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bva implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public bva(z6d z6dVar) {
        this.a = (byte) 21;
        Objects.requireNonNull(z6dVar);
        this.b = z6dVar;
    }

    private final void a() {
        ned nedVar = (ned) this.b;
        synchronized (ned.i) {
            if (nedVar.d()) {
                nedVar.f(15);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        c9 c9Var;
        ox7 ox7Var;
        wc8 wc8Var;
        int i;
        prd prdVar;
        cod codVar;
        o7b o7bVar = null;
        switch (this.a) {
            case 0:
                eva evaVar = (eva) this.b;
                try {
                    dva dvaVar = evaVar.a;
                    if (dvaVar != null) {
                        dvaVar.g();
                        evaVar.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                ((w1b) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                return;
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                a2b a2bVar = (a2b) this.b;
                int[][] iArr = a2bVar.f;
                int[][] iArr2 = a2bVar.e;
                long[][] jArr = a2bVar.d;
                long[][] jArr2 = a2bVar.c;
                RandomAccessFile randomAccessFile = a2bVar.r;
                go5 go5Var = a2bVar.s;
                if (Math.abs(currentTimeMillis - a2bVar.b) < 2000) {
                    return;
                }
                a2bVar.b = currentTimeMillis;
                try {
                    go5Var.b();
                    int i2 = 0;
                    while (true) {
                        int i3 = 7;
                        if (i2 >= 3) {
                            int[][] iArr3 = iArr2;
                            for (int i4 = 0; i4 < 3; i4++) {
                                go5Var.write(a2bVar.k(jArr2[i4][7]), 0, 8);
                                go5Var.write(a2bVar.k(jArr[i4][7]), 0, 8);
                                go5Var.write(a2bVar.j(iArr3[i4][7]), 0, 4);
                                go5Var.write(a2bVar.j(iArr[i4][7]), 0, 4);
                            }
                            randomAccessFile.seek(0L);
                            randomAccessFile.write(go5Var.a, 0, go5Var.b);
                            randomAccessFile.getFD().sync();
                            return;
                        }
                        int i5 = 0;
                        while (i5 < i3) {
                            int[][] iArr4 = iArr2;
                            go5Var.write(a2bVar.k(jArr2[i2][i5]), 0, 8);
                            go5Var.write(a2bVar.k(jArr[i2][i5]), 0, 8);
                            go5Var.write(a2bVar.j(iArr4[i2][i5]), 0, 4);
                            go5Var.write(a2bVar.j(iArr[i2][i5]), 0, 4);
                            i5++;
                            i3 = i3;
                            iArr2 = iArr4;
                        }
                        go5Var.write(a2bVar.j(a2bVar.n[i2]), 0, 4);
                        go5Var.write(a2bVar.k(a2bVar.h[i2]), 0, 8);
                        i2++;
                        iArr2 = iArr2;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 3:
                z2b z2bVar = (z2b) this.b;
                View view = z2bVar.s;
                if (view == null) {
                    z2bVar.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                }
                view.animate().setListener(null).cancel();
                view.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 4:
                ((acb) this.b).M0 = false;
                return;
            case 5:
                y6b y6bVar = (y6b) this.b;
                y6bVar.b = false;
                y6bVar.invalidate();
                return;
            case 6:
                ((ThemeEditorView) this.b).a = false;
                try {
                    aob.k();
                    aob.n();
                    aob.p();
                    aob.j(false, false);
                    yob.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.b0();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 7:
                axb axbVar = (axb) this.b;
                axbVar.G.setVisibility(0);
                axbVar.G.setAlpha(0.0f);
                axbVar.G.animate().alpha(1.0f).start();
                return;
            case 8:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (c9Var = actionMenuView.K) == null) {
                    return;
                }
                c9Var.l();
                return;
            case 9:
                sbc sbcVar = (sbc) this.b;
                String str = sbcVar.i2;
                if (str != null) {
                    if (sbcVar.q2 >= 0) {
                        ConnectionsManager.getInstance(sbcVar.a).cancelRequest(sbcVar.q2, true);
                        sbcVar.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    sbcVar.q2 = ConnectionsManager.getInstance(sbcVar.a).sendRequest(tL_contacts_search, new yp9(sbcVar, (byte) 22));
                    return;
                }
                return;
            case 10:
                lfc lfcVar = (lfc) this.b;
                if (lfcVar.d && (ox7Var = lfcVar.f) != null && ox7Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = lfcVar.a.a;
                    kfc kfcVar = photoViewer.G2;
                    long S = kfcVar != null ? kfcVar.S() : 0L;
                    r7b r7bVar = lfcVar.b;
                    if (r7bVar != null && r7bVar.o && !r7bVar.h && !r7bVar.e(r7b.a(S))) {
                        r7bVar.f();
                    }
                    if (lfcVar.g != null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 < lfcVar.g.size()) {
                                o7b o7bVar2 = (o7b) lfcVar.g.get(i6);
                                if (S < o7bVar2.a || S >= o7bVar2.b) {
                                    i6++;
                                } else {
                                    o7bVar = o7bVar2;
                                }
                            }
                        }
                    }
                    r8 = (o7bVar == null || TextUtils.isEmpty(o7bVar.c)) ? false : true;
                    if (r8) {
                        if (o7bVar != lfcVar.h || !TextUtils.equals(o7bVar.c, lfcVar.f.getText())) {
                            lfcVar.h = o7bVar;
                            lfcVar.f.setText(o7bVar.c);
                        }
                        lfcVar.f.setSpokenWords(o7bVar.d);
                        lfcVar.f.A(S);
                    }
                    if (r8 != lfcVar.i) {
                        lfcVar.i = r8;
                        lfcVar.f.animate().cancel();
                        lfcVar.f.animate().alpha(r8 ? 1.0f : 0.0f).setDuration(r8 ? 120L : 180L).start();
                    }
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - hl.L(8.0f);
                    kd8 kd8Var = photoViewer.i3;
                    if (kd8Var != null && kd8Var.getVisibility() == 0) {
                        height = hl.R1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    ic8 ic8Var = photoViewer.U1;
                    if (ic8Var != null && photoViewer.a2 != null && ic8Var.getVisibility() == 0 && (wc8Var = photoViewer.R1) != null && wc8Var.getVisibility() == 0) {
                        height = hl.R1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L = (height - hl.L(8.0f)) - lfcVar.f.getHeight();
                    if (lfcVar.f.getTranslationY() != L) {
                        lfcVar.f.setTranslationY(L);
                    }
                    lfcVar.f.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                fic ficVar = (fic) this.b;
                ficVar.setScrollState(0);
                ficVar.s();
                return;
            case 12:
                uic uicVar = (uic) this.b;
                if (uicVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f = (elapsedRealtime / 200.0f) + uicVar.g0;
                    uicVar.g0 = f;
                    uicVar.setAnimationIdicatorProgress(uicVar.b0.getInterpolation(f));
                    float f2 = uicVar.g0;
                    if (f2 > 1.0f) {
                        uicVar.g0 = 1.0f;
                        f2 = 1.0f;
                    }
                    if (f2 < 1.0f) {
                        hl.c3(uicVar.j0);
                        return;
                    }
                    uicVar.K = false;
                    uicVar.setEnabled(true);
                    tic ticVar = uicVar.E;
                    if (ticVar != null) {
                        ticVar.a(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                elc elcVar = (elc) this.b;
                q91 q91Var = elcVar.b;
                if (q91Var != null) {
                    q91Var.b();
                }
                long c = k91.c();
                boolean a = q91.a(VoIPService.getSharedInstance());
                if (c != elcVar.c || a != elcVar.d) {
                    elcVar.c = c;
                    elcVar.d = a;
                    me8 me8Var = elcVar.a;
                    if (me8Var != null) {
                        me8Var.e();
                    }
                }
                hl.d3(this, 500L);
                return;
            case 14:
                uqc uqcVar = (uqc) this.b;
                if (uqcVar.a == null || uqcVar.e == null) {
                    return;
                }
                uqcVar.a1();
                if (uqcVar.s) {
                    uqcVar.a.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                zqc zqcVar = (zqc) this.b;
                irc ircVar = zqcVar.H;
                if (zqcVar.b0) {
                    long nanoTime = System.nanoTime();
                    if (ircVar.a) {
                        if (ircVar.j == 0) {
                            ircVar.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r9) * 1.0E-9f));
                            ircVar.j = nanoTime;
                            if (ircVar.i - ircVar.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f3 = ircVar.d;
                                ircVar.d = qd4.A(ircVar.b, f3, exp, f3);
                                float f4 = ircVar.e;
                                ircVar.e = qd4.A(ircVar.c, f4, exp, f4);
                            }
                        }
                    }
                    zqcVar.L = ircVar.a ? Math.max(-15.0f, Math.min(15.0f, ircVar.b - ircVar.d)) : 0.0f;
                    float c2 = zqc.c((ircVar.a ? Math.max(-15.0f, Math.min(15.0f, ircVar.c - ircVar.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f5 = zqcVar.M;
                    float A = qd4.A(zqcVar.L, f5, 1.0f, f5);
                    zqcVar.M = A;
                    float f6 = zqcVar.N;
                    float A2 = qd4.A(c2, f6, 1.0f, f6);
                    zqcVar.N = A2;
                    float f7 = zqcVar.f0;
                    zqcVar.b((A * f7) + zqcVar.O + zqcVar.e0, (A2 * f7) + zqcVar.P);
                    zqcVar.postOnAnimation(this);
                    return;
                }
                return;
            case 16:
                jzc jzcVar = (jzc) this.b;
                r47 r47Var = jzcVar.n;
                if (r47Var == null || jzcVar.getParentActivity() == null || jzcVar.s == null) {
                    return;
                }
                i = ((e) jzcVar).currentAccount;
                uc7.s1(i).P4(6, 0, r47.B0(r47Var.k), 0L, null);
                hl.d3(jzcVar.s, 25000L);
                return;
            case 17:
                if (k0d.h.remove(this)) {
                    hl.r(this);
                    ((hm1) this.b).run();
                    return;
                }
                return;
            case 18:
                a6d a6dVar = (a6d) this.b;
                j05 j05Var = a6dVar.d;
                Context context = a6dVar.c;
                j05Var.getClass();
                if (c15.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e3) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e3);
                    return;
                }
            case 19:
                ((l6d) this.b).a();
                return;
            case 20:
                d05 d05Var = ((l6d) ((ve9) this.b).b).b;
                d05Var.d(d05Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 21:
                ((z6d) this.b).k.b(new ws2(4, null, null));
                return;
            case 22:
                return;
            case 23:
                b8d b8dVar = (b8d) this.b;
                ReentrantLock reentrantLock = b8dVar.o;
                reentrantLock.lock();
                try {
                    b8dVar.j();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 24:
                poc pocVar = (poc) this.b;
                synchronized (pocVar.a) {
                    if (pocVar.b()) {
                        Log.e("WakeLock", String.valueOf(pocVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        pocVar.d();
                        if (pocVar.b()) {
                            pocVar.c = 1;
                            pocVar.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 25:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                nhd nhdVar = (nhd) this.b;
                vh0 vh0Var = nhdVar.d;
                vh0Var.k(0);
                gi0 gi0Var = hod.i;
                vh0Var.j(24, gi0Var);
                nhdVar.c(gi0Var);
                return;
            case 28:
                jtd jtdVar = (jtd) this.b;
                if (jtdVar == null || (prdVar = jtdVar.n) == null) {
                    return;
                }
                this.b = null;
                if (prdVar.isDone()) {
                    Object obj = jtdVar.a;
                    if (obj == null) {
                        if (prdVar.isDone()) {
                            if (rod.h.f(jtdVar, null, jtd.h(prdVar))) {
                                jtd.j(jtdVar);
                                return;
                            }
                            return;
                        }
                        aod aodVar = new aod(jtdVar, prdVar);
                        if (rod.h.f(jtdVar, null, aodVar)) {
                            try {
                                prdVar.c(aodVar, rpd.a);
                                return;
                            } catch (Throwable th) {
                                try {
                                    codVar = new cod(th);
                                } catch (Error | Exception unused2) {
                                    codVar = cod.b;
                                }
                                rod.h.f(jtdVar, aodVar, codVar);
                                return;
                            }
                        }
                        obj = jtdVar.a;
                    }
                    if (obj instanceof znd) {
                        prdVar.cancel(((znd) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = jtdVar.r;
                    jtdVar.r = null;
                    String str2 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str2 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            if (rod.h.f(jtdVar, null, new cod(new wsd(str2)))) {
                                jtd.j(jtdVar);
                            }
                            throw th2;
                        }
                    }
                    if (rod.h.f(jtdVar, null, new cod(new wsd(str2 + ": " + prdVar.toString())))) {
                        jtd.j(jtdVar);
                    }
                    return;
                } finally {
                    prdVar.cancel(true);
                }
            default:
                List list = ((etd) this.b).e;
                if (list == null) {
                    throw null;
                }
                list.isEmpty();
                throw null;
        }
    }

    public /* synthetic */ bva(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ bva() {
        this.a = (byte) 28;
    }

    public bva(w7d w7dVar, ed edVar) {
        this.a = (byte) 22;
        this.b = edVar;
    }
}
