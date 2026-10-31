package a3;

import ag.h2;
import ag.i3;
import ag.j1;
import ag.m2;
import ag.t1;
import ag.v1;
import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.fragment.app.u0;
import bi.o2;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import m.p3;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.m3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
import org.telegram.ui.LaunchActivity;
import v7.r6;
import v7.x7;
import v7.y7;
import w7.m8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(androidx.fragment.app.l lVar, u0 u0Var) {
        this.a = 15;
        this.b = lVar;
    }

    private final void a() {
        androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) this.b;
        synchronized (qVar.d) {
            try {
                if (qVar.h == null) {
                    return;
                }
                try {
                    o0.h d = qVar.d();
                    int i10 = d.e;
                    if (i10 == 2) {
                        synchronized (qVar.d) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = n0.g.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        jb.b bVar = qVar.c;
                        Context context = qVar.a;
                        bVar.getClass();
                        o0.h[] hVarArr = {d};
                        x7 x7Var = i0.f.a;
                        m8.a("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface b10 = i0.f.a.b(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer e = y7.e(qVar.a, d.a);
                            if (e == null || b10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                ji.f fVar = new ji.f(b10, v7.u.a(e));
                                Trace.endSection();
                                synchronized (qVar.d) {
                                    try {
                                        v7.t tVar = qVar.h;
                                        if (tVar != null) {
                                            tVar.b(fVar);
                                        }
                                    } finally {
                                    }
                                }
                                qVar.b();
                            } finally {
                                int i12 = n0.g.a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (qVar.d) {
                        try {
                            v7.t tVar2 = qVar.h;
                            if (tVar2 != null) {
                                tVar2.a(th3);
                            }
                            qVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String d;
        TelephonyManager telephonyManager;
        switch (this.a) {
            case 0:
                ((f) this.b).h.X();
                return;
            case 1:
                ((w) this.b).m--;
                return;
            case 2:
                r0.a.postVsyncCallback((e0) this.b);
                return;
            case 3:
                ag.f fVar = (ag.f) this.b;
                fVar.b.f3.O(true);
                fVar.Z(true);
                return;
            case 4:
                org.telegram.messenger.i0.g(((TL_account.TL_businessChatLink) this.b).link);
                cc.a0(LaunchActivity.Q()).k(false).j();
                return;
            case 5:
                j1 j1Var = (j1) this.b;
                p51 p51Var = j1Var.W1;
                if (p51Var != null) {
                    p51Var.O(true);
                }
                j1Var.d1(true);
                return;
            case 6:
                t1 t1Var = (t1) ((a6.i) this.b).b;
                t1Var.c.f3.O(true);
                t1Var.f0();
                return;
            case 7:
                v1 v1Var = (v1) this.b;
                v1Var.b.f3.O(true);
                v1Var.Z(true);
                return;
            case 8:
                h2 h2Var = (h2) this.b;
                h2Var.a.f3.O(true);
                h2Var.c0(true);
                return;
            case 9:
                ((m2) this.b).a(Boolean.FALSE);
                return;
            case 10:
                zs.f(((i3) this.b).a).k(zs.F1, new Object[0]);
                return;
            case 11:
                ((androidx.activity.m) this.b).invalidateOptionsMenu();
                return;
            case 12:
                androidx.activity.l lVar = (androidx.activity.l) this.b;
                Runnable runnable = lVar.b;
                if (runnable != null) {
                    runnable.run();
                    lVar.b = null;
                    return;
                }
                return;
            case 13:
                androidx.activity.n.a((androidx.activity.n) this.b);
                return;
            case 14:
                a();
                return;
            case 15:
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 16:
                Iterator it = ((androidx.fragment.app.j0) this.b).n.iterator();
                if (it.hasNext()) {
                    throw a1.g.h(it);
                }
                return;
            case 17:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 18:
                k3 k3Var = ((m3) this.b).d;
                k3Var.requestFocus();
                org.telegram.messenger.i0.J3(k3Var);
                return;
            case 19:
                org.telegram.messenger.i0.J3(((bi.z) this.b).W1.d);
                return;
            case 20:
                ((bi.g0) this.b).invalidate();
                return;
            case 21:
                p3 p3Var = (p3) this.b;
                p3Var.c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f = null;
                p3Var.e(null);
                return;
            case 22:
                ((bi.h2) this.b).invalidateSelf();
                return;
            case 23:
                ((o2) this.b).c();
                return;
            case 24:
                ((c1.d) this.b).e().g(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 25:
                ac.a aVar = (ac.a) this.b;
                ((Context) aVar.b).unregisterReceiver((c2.a) aVar.c);
                return;
            case 26:
                c2.a aVar2 = (c2.a) this.b;
                if (aVar2.c.a) {
                    aVar2.a.a.C1(3, false);
                    return;
                }
                return;
            case 27:
                ((ch.b) this.b).invalidate();
                return;
            case 28:
                dh.d dVar = (dh.d) this.b;
                GroupCallMessage groupCallMessage = dVar.H;
                if (groupCallMessage != null) {
                    dVar.a.a(groupCallMessage.isSendDelayed(), true);
                    dVar.b.a(dVar.H.isSendError(), true);
                    return;
                }
                return;
            default:
                e2.v vVar2 = (e2.v) this.b;
                y2.e eVar = (y2.e) vVar2.a.get();
                if (eVar != null) {
                    int b10 = vVar2.c.b();
                    y2.f fVar2 = eVar.a;
                    synchronized (fVar2) {
                        synchronized (fVar2) {
                            int i10 = fVar2.n;
                            if (i10 == 0 || fVar2.e) {
                                if (i10 != b10 || fVar2.o == null) {
                                    fVar2.n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (fVar2.o == null) {
                                            Context context = fVar2.a;
                                            String str = e2.l0.a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = r6.d(networkCountryIso);
                                                    fVar2.o = d;
                                                }
                                            }
                                            d = r6.d(Locale.getDefault().getCountry());
                                            fVar2.o = d;
                                        }
                                        fVar2.l = fVar2.b(b10);
                                        fVar2.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        fVar2.d(fVar2.i, fVar2.g > 0 ? (int) (elapsedRealtime - fVar2.h) : 0, fVar2.l);
                                        fVar2.h = elapsedRealtime;
                                        fVar2.i = 0L;
                                        fVar2.k = 0L;
                                        fVar2.j = 0L;
                                        y2.q qVar = fVar2.f;
                                        qVar.a.clear();
                                        qVar.c = -1;
                                        qVar.d = 0;
                                        qVar.e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
