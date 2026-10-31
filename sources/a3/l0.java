package a3;

import ag.h2;
import ag.j1;
import ag.n3;
import ag.s0;
import ag.v1;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.car.app.IOnDoneCallback;
import b2.f1;
import b2.l1;
import bi.d4;
import bi.i6;
import bi.k6;
import bi.m3;
import bi.n6;
import bi.p6;
import bi.q3;
import bi.q6;
import bi.s6;
import bi.z5;
import e9.x1;
import i2.a1;
import i2.i1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import m4.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.me;
import org.telegram.messenger.x0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        androidx.biometric.s sVar = (androidx.biometric.s) this.b;
        v7.t tVar = (v7.t) this.c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
        try {
            androidx.emoji2.text.r a2 = v7.s.a(sVar.a);
            if (a2 == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
            synchronized (qVar.d) {
                qVar.f = threadPoolExecutor;
            }
            ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(tVar, threadPoolExecutor));
        } catch (Throwable th2) {
            tVar.a(th2);
            threadPoolExecutor.shutdown();
        }
    }

    private final void b() {
        ji.k kVar = (ji.k) this.b;
        WebView webView = (WebView) this.c;
        b5.h hVar = (b5.h) this.d;
        synchronized (kVar.a) {
            if (!kVar.u && kVar.o == webView && kVar.p == hVar && !kVar.r) {
                if (kVar.s) {
                    f8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    kVar.q();
                } else {
                    kVar.s = true;
                    f8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                    kVar.h();
                }
            }
        }
    }

    private final void c() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        Handler handler = (Handler) this.c;
        e2.r rVar = (e2.r) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.c(rVar, 20));
            }
            synchronized (k2.j0.t) {
                try {
                    int i10 = k2.j0.v - 1;
                    k2.j0.v = i10;
                    if (i10 == 0) {
                        ScheduledExecutorService scheduledExecutorService = k2.j0.u;
                        scheduledExecutorService.getClass();
                        scheduledExecutorService.shutdown();
                        k2.j0.u = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.c(rVar, 20));
            }
            synchronized (k2.j0.t) {
                try {
                    int i11 = k2.j0.v - 1;
                    k2.j0.v = i11;
                    if (i11 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = k2.j0.u;
                        scheduledExecutorService2.getClass();
                        scheduledExecutorService2.shutdown();
                        k2.j0.u = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = null;
        boolean z10 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                hf.b bVar = (hf.b) this.b;
                b2.x xVar = (b2.x) this.c;
                i2.e eVar = (i2.e) this.d;
                m0 m0Var = (m0) bVar.c;
                String str = e2.l0.a;
                i2.i0 i0Var = ((i2.c0) m0Var).a;
                i0Var.S = xVar;
                j2.g gVar = i0Var.s;
                j2.a U = gVar.U();
                gVar.V(U, 1017, new j2.c(U, xVar, eVar, 29));
                return;
            case 1:
                ag.f fVar = (ag.f) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    fVar.a.b(false);
                    cc.d0(tL_error);
                    return;
                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                    fVar.finishFragment();
                    return;
                } else {
                    fVar.a.b(false);
                    m5.o(null, 2131743904, cc.a0(fVar), null);
                    return;
                }
            case 2:
                ag.w wVar = (ag.w) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 != null) {
                    wVar.f.b(false);
                    cc.d0(tL_error2);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    wVar.f.b(false);
                    m5.o(null, 2131743904, cc.a0(wVar), null);
                    return;
                } else {
                    if (wVar.E != null) {
                        wVar.getMessagesController().U2(wVar.getUserConfig().f(), 0, true, null);
                    }
                    wVar.finishFragment();
                    return;
                }
            case 3:
                s0 s0Var = (s0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList = s0Var.b;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    f8.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList.contains(tL_businessChatLink)) {
                    arrayList.remove(tL_businessChatLink);
                    zs.f(s0Var.a).k(zs.J1, new Object[0]);
                }
                s0Var.f();
                return;
            case 4:
                s0 s0Var2 = (s0) this.b;
                String str2 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str2;
                ConnectionsManager.getInstance(s0Var2.a).sendRequest(deletebusinesschatlink, new ag.k0(i10, s0Var2, tL_businessChatLink2));
                return;
            case 5:
                j1 j1Var = (j1) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                ag.k.a(j1Var.a).b();
                j1Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).Q(R.raw.contact_check, 36, cd.a0(null, null, 2131752784, h20.p(j1Var.Q1))).j();
                    return;
                }
                return;
            case 6:
                v1 v1Var = (v1) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    v1Var.a.b(false);
                    cc.d0(tL_error3);
                    return;
                } else if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                    v1Var.finishFragment();
                    return;
                } else {
                    v1Var.a.b(false);
                    m5.o(null, 2131743904, cc.a0(v1Var), null);
                    return;
                }
            case 7:
                h2.Y((h2) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 8:
                n3 n3Var = (n3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList2 = n3Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    zs.f(n3Var.a).k(zs.r3, new Object[0]);
                }
                n3Var.c = true;
                n3Var.b = false;
                return;
            case 9:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.b bVar2 = (androidx.car.app.utils.b) this.c;
                String str3 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            z10 = false;
                        }
                        if (z10) {
                            bVar2.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str3), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + bVar2);
                return;
            case 10:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str4 = (String) this.c;
                try {
                    androidx.car.app.utils.h.d(str4.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.b) this.d).a(), str4, i10));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str4, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.h.f(iOnDoneCallback, str4, e10);
                    return;
                }
            case 11:
                a();
                return;
            case 12:
                d4 d4Var = (d4) this.b;
                z60 z60Var = (z60) this.c;
                z5 z5Var = (z5) this.d;
                if (d4Var.q4 != z60Var) {
                    return;
                }
                d4Var.q4 = null;
                if (d4Var.J3 && d4Var.p4 == z5Var && !z5Var.H.isEmpty()) {
                    d4Var.P2();
                    return;
                }
                return;
            case 13:
                d4 d4Var2 = (d4) this.b;
                bi.a aVar = (bi.a) this.c;
                bi.a aVar2 = (bi.a) this.d;
                ArrayList arrayList3 = d4Var2.w4;
                q3 q3Var = d4Var2.u3;
                if (q3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList3.indexOf(aVar);
                int indexOf2 = arrayList3.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i10 < arrayList3.size()) {
                    bi.a aVar3 = (bi.a) arrayList3.get(i10);
                    long j10 = aVar3.t;
                    if (j10 != 0) {
                        q3Var.X(i10, s6.l((TL_iv.RichText) d4Var2.t3.get(Long.valueOf(j10))));
                    } else {
                        q3Var.X(i10, q6.z(aVar3.b));
                    }
                    i10++;
                }
                q3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 14:
                ((d4) this.b).c5((bi.a) this.c, (String) this.d);
                return;
            case 15:
                k6 k6Var = (k6) this.b;
                bi.a aVar4 = (bi.a) this.c;
                p6 p6Var = (p6) this.d;
                n6 n6Var = k6Var.a.D;
                if (n6Var != null) {
                    ((m3) n6Var).d(aVar4, p6Var.a, p6Var.b, p6Var.c, p6Var.d, p6Var.e);
                    return;
                }
                return;
            case 16:
                ci.o oVar2 = (ci.o) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                oVar2.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (oVar2.A.removeAll(arrayList5)) {
                    while (i10 < arrayList5.size()) {
                        oVar2.d((c1) arrayList5.get(i10));
                        i10++;
                    }
                    oVar2.G();
                }
                oVar2.K.removeAll(arrayList4);
                return;
            case 17:
                ci.o oVar3 = (ci.o) this.b;
                View view = (View) this.c;
                c1 c1Var = (c1) this.d;
                oVar3.getClass();
                view.setVisibility(0);
                if (oVar3.A.remove(c1Var)) {
                    oVar3.d(c1Var);
                    oVar3.G();
                }
                oVar3.K.remove(view);
                return;
            case 18:
                SpannableString spannableString = (SpannableString) this.b;
                n4.q qVar = (n4.q) this.c;
                org.telegram.ui.h0 h0Var = (org.telegram.ui.h0) this.d;
                di.l.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) qVar.a);
                h0Var.run();
                return;
            case 19:
                SpannableString spannableString2 = (SpannableString) this.b;
                n4.q qVar2 = (n4.q) this.c;
                i6 i6Var = (i6) this.d;
                di.l.a(spannableString2, spannableString2.length(), (com.google.android.gms.internal.play_billing.s0) qVar2.a);
                i6Var.a(spannableString2);
                return;
            case 20:
                j9.y yVar = (j9.y) this.b;
                j9.e0 e0Var = (j9.e0) this.c;
                try {
                    try {
                        e0Var.o(((j9.q) this.d).apply(p8.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 21:
                j9.e0 e0Var2 = (j9.e0) this.b;
                k2.u uVar = (k2.u) this.c;
                t1 t1Var = (t1) this.d;
                try {
                    if (e0Var2.a instanceof j9.a) {
                        return;
                    }
                    uVar.run();
                    e0Var2.m(t1Var);
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 22:
                a1 a1Var = (a1) this.b;
                e9.k0 k0Var = (e9.k0) this.c;
                u2.g0 g0Var = (u2.g0) this.d;
                j2.g gVar2 = a1Var.c;
                x1 f7 = k0Var.f();
                j2.f fVar2 = gVar2.d;
                f1 f1Var = gVar2.h;
                f1Var.getClass();
                fVar2.getClass();
                fVar2.b = e9.n0.u(f7);
                if (!f7.isEmpty()) {
                    fVar2.e = (u2.g0) f7.get(0);
                    g0Var.getClass();
                    fVar2.f = g0Var;
                }
                if (((u2.g0) fVar2.d) == null) {
                    fVar2.d = j2.f.o(f1Var, (e9.n0) fVar2.b, (u2.g0) fVar2.e, (l1) fVar2.a);
                }
                fVar2.G(f1Var.y0());
                return;
            case 23:
                i1 i1Var = (i1) this.b;
                Pair pair = (Pair) this.c;
                i1Var.b.h.l(((Integer) pair.first).intValue(), (u2.g0) pair.second, (oa.d) this.d);
                return;
            case 24:
                i1 i1Var2 = (i1) this.b;
                Pair pair2 = (Pair) this.c;
                i1Var2.b.h.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (Exception) this.d);
                return;
            case 25:
                b();
                return;
            case 26:
                hf.b bVar3 = (hf.b) this.b;
                b2.x xVar2 = (b2.x) this.c;
                i2.e eVar2 = (i2.e) this.d;
                k2.w wVar2 = (k2.w) bVar3.c;
                String str5 = e2.l0.a;
                j2.g gVar3 = ((i2.c0) wVar2).a.s;
                j2.a U2 = gVar3.U();
                gVar3.V(U2, 1009, new j2.e(U2, xVar2, eVar2));
                return;
            case 27:
                c();
                return;
            case 28:
                ki.k kVar = (ki.k) this.b;
                ki.j jVar = (ki.j) this.c;
                byte[] bArr2 = (byte[]) this.d;
                File file = jVar.b;
                if (kVar.G != 4) {
                    return;
                }
                kVar.B = bArr2;
                try {
                    kVar.p();
                    if (kVar.e) {
                        i2.i0 a2 = new i2.n(kVar.a).a();
                        kVar.A = a2;
                        a2.o0(kVar.F);
                        kVar.A.s0(b2.p0.b(Uri.fromFile(file)));
                        kVar.A.a();
                    }
                    kVar.s(5);
                    m5.e eVar3 = kVar.f;
                    long j11 = kVar.j();
                    byte[] bArr3 = kVar.B;
                    if (bArr3 != null) {
                        bArr = (byte[]) bArr3.clone();
                    }
                    eVar3.T(j11, bArr);
                    return;
                } catch (Throwable th4) {
                    kVar.g(th4 instanceof Exception ? th4 : new RuntimeException(th4));
                    return;
                }
            default:
                ki.k kVar2 = (ki.k) this.b;
                ki.j jVar2 = (ki.j) this.c;
                File file2 = (File) this.d;
                m4.c cVar = kVar2.g;
                long j12 = jVar2.a;
                synchronized (((e0.h) cVar.c).f) {
                    ((HashMap) ((e0.h) cVar.c).g).put(Long.valueOf(j12), file2);
                }
                ((Handler) ((e0.h) cVar.c).d).post(new x0(cVar, j12, (me) cVar.b, file2, 1));
                return;
        }
    }
}
