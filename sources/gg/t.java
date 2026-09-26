package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ii.b6;
import ii.d6;
import ii.e6;
import ii.f3;
import ii.g6;
import ii.k3;
import ii.p5;
import ii.x3;
import ii.y5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10 = 1;
        switch (this.a) {
            case 0:
                ((g0) this.b).a((a0.i) this.d, (ArrayList) this.c);
                return;
            case 1:
                k1 k1Var = (k1) this.b;
                String str = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                k1Var.E0 = 0;
                if (str.equals(k1Var.D0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                    ArrayList arrayList2 = k1Var.A0;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    k1Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
                    ArrayList arrayList3 = k1Var.A0;
                    int size2 = arrayList3 != null ? arrayList3.size() : 0;
                    if (!k1Var.o0 && (arrayList = k1Var.A0) != null && !arrayList.isEmpty()) {
                        k1Var.H();
                        k1Var.V.a(k1Var.K() > 0);
                        k1Var.o0 = true;
                    }
                    if (size != size2) {
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k1 k1Var2 = (k1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                a0.i iVar = (a0.i) this.d;
                k1Var2.p0 = null;
                k1Var2.Y(iVar, arrayList4, true);
                return;
            case 3:
                c2 c2Var = (c2) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.d;
                c2Var.q = arrayList5;
                c2Var.r = hashMap;
                c2Var.s = true;
                c2Var.a.F(arrayList5);
                return;
            case 4:
                e2 e2Var = (e2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = tL_messages_searchStickerSets.q;
                g2 g2Var = e2Var.a;
                String str3 = g2Var.R;
                f51 f51Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    f51Var.b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    f51Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    dVar.a.a(0.0f);
                    xc.b0(tL_error);
                    return;
                } else if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                    dVar.finishFragment();
                    return;
                } else {
                    dVar.a.a(0.0f);
                    ok.p(R.string.UnknownError, xc.a0(dVar), null);
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    nVar.e.a(0.0f);
                    xc.b0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    ok.p(R.string.UnknownError, xc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.a0 a0Var = (hg.a0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList6 = a0Var.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    return;
                }
                if (arrayList6.contains(tL_businessChatLink)) {
                    arrayList6.remove(tL_businessChatLink);
                    NotificationCenter.getInstance(a0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                }
                a0Var.f();
                return;
            case 8:
                hg.a0 a0Var2 = (hg.a0) this.b;
                String str4 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str4;
                ConnectionsManager.getInstance(a0Var2.a).sendRequest(deletebusinesschatlink, new ai.v1(13, a0Var2, tL_businessChatLink2));
                return;
            case 9:
                hg.m0.P((hg.m0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.x0 x0Var = (hg.x0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error3 != null) {
                    x0Var.a.a(0.0f);
                    xc.b0(tL_error3);
                    return;
                } else if (!(tLObject5 instanceof TLRPC.TL_boolFalse)) {
                    x0Var.finishFragment();
                    return;
                } else {
                    x0Var.a.a(0.0f);
                    ok.p(R.string.UnknownError, xc.a0(x0Var), null);
                    return;
                }
            case 11:
                hg.h1.U((hg.h1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 12:
                hg.g2 g2Var2 = (hg.g2) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList7 = g2Var2.d;
                if (tLObject6 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList7.clear();
                    arrayList7.addAll(((TLRPC.TL_help_timezonesList) tLObject6).timezones);
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var2.c = true;
                g2Var2.b = false;
                return;
            case 13:
                i2.w0 w0Var = (i2.w0) this.b;
                e9.f0 f0Var = (e9.f0) this.c;
                u2.f0 f0Var2 = (u2.f0) this.d;
                j2.f fVar = w0Var.c;
                e9.a1 i11 = f0Var.i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.b = e9.i0.v(i11);
                if (!i11.isEmpty()) {
                    nVar2.e = (u2.f0) i11.get(0);
                    f0Var2.getClass();
                    nVar2.f = f0Var2;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.b, (u2.f0) nVar2.e, (b2.h1) nVar2.a);
                }
                nVar2.H(b1Var.w0());
                return;
            case 14:
                i2.d1 d1Var = (i2.d1) this.b;
                Pair pair = (Pair) this.c;
                d1Var.b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.b;
                y70 y70Var = (y70) this.c;
                p5 p5Var = (p5) this.d;
                if (x3Var.j4 != y70Var) {
                    return;
                }
                x3Var.j4 = null;
                if (x3Var.C3 && x3Var.i4 == p5Var && !p5Var.H.isEmpty()) {
                    x3Var.M2();
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.b;
                ii.a aVar = (ii.a) this.c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList8 = x3Var2.p4;
                k3 k3Var = x3Var2.n3;
                if (k3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList8.indexOf(aVar);
                int indexOf2 = arrayList8.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                    ii.a aVar3 = (ii.a) arrayList8.get(i12);
                    long j3 = aVar3.t;
                    if (j3 != 0) {
                        k3Var.Y(i12, g6.l((TL_iv.RichText) x3Var2.m3.get(Long.valueOf(j3))));
                    } else {
                        k3Var.Y(i12, e6.z(aVar3.b));
                    }
                }
                k3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 17:
                ((x3) this.b).Z4((ii.a) this.c, (String) this.d);
                return;
            case 18:
                y5 y5Var = (y5) this.b;
                ii.a aVar4 = (ii.a) this.c;
                d6 d6Var = (d6) this.d;
                b6 b6Var = y5Var.a.y;
                if (b6Var != null) {
                    ((f3) b6Var).d(aVar4, d6Var.a, d6Var.b, d6Var.c, d6Var.d, d6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                nVar3.getClass();
                for (int i13 = 0; i13 < arrayList9.size(); i13++) {
                    ((View) arrayList9.get(i13)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList10)) {
                    for (int i14 = 0; i14 < arrayList10.size(); i14++) {
                        nVar3.d((s4.c1) arrayList10.get(i14));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList9);
                return;
            case 20:
                ji.n nVar4 = (ji.n) this.b;
                View view = (View) this.c;
                s4.c1 c1Var = (s4.c1) this.d;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(c1Var)) {
                    nVar4.d(c1Var);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                return;
            case 21:
                n4.y yVar = (n4.y) this.b;
                b2.s sVar = (b2.s) this.c;
                i2.h hVar = (i2.h) this.d;
                k2.j jVar = (k2.j) yVar.c;
                String str5 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, sVar, hVar, 20));
                return;
            case 22:
                ki.q qVar = (ki.q) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                qVar.getClass();
                try {
                    qVar.f();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                ki.s0 s0Var = (ki.s0) this.b;
                ki.t tVar = (ki.t) this.c;
                File file = (File) this.d;
                Handler handler = s0Var.h;
                try {
                    tVar.d(file);
                    s0Var.f();
                    long e = w7.k.e(file) / 1000;
                    s0Var.l.b("preview snapshot completed: durationMs=" + e + ", size=" + file.length() + ", elapsedMs=" + ki.s0.e(s0Var.I));
                    handler.post(new ki.d0(s0Var, e, i10));
                    return;
                } catch (Exception e7) {
                    handler.post(new ki.c0(s0Var, e7, 3));
                    return;
                }
            case 24:
                ki.s0 s0Var2 = (ki.s0) this.b;
                ki.o0 o0Var = (ki.o0) this.c;
                File file2 = (File) this.d;
                ki.p0 p0Var = s0Var2.d;
                long j10 = o0Var.a;
                o01 o01Var = (o01) p0Var;
                synchronized (o01Var) {
                    if (o01Var.d) {
                        return;
                    }
                    o01Var.c.put(Long.valueOf(j10), new m01(file2));
                    return;
                }
            case 25:
                m4.w wVar = (m4.w) this.b;
                m4.r rVar = (m4.r) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.a0 a0Var3 = wVar.b;
                if (a0Var3.i(rVar)) {
                    a0Var3.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var3.h;
                    n4.a0 a0Var4 = rVar.a;
                    a0Var4.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var4, true);
                }
                wVar.a = null;
                return;
            case 26:
                m4.a0 a0Var5 = (m4.a0) this.b;
                m4.o0 o0Var2 = (m4.o0) this.c;
                m4.s sVar2 = (m4.s) this.d;
                if (a0Var5.j()) {
                    return;
                }
                m4.e1 e1Var = a0Var5.t;
                o0Var2.getClass();
                w7.u.b(e1Var, sVar2);
                return;
            case 27:
                n2.k kVar = (n2.k) this.b;
                this.c.b(kVar.a, kVar.b, (Exception) this.d);
                return;
            case 28:
                ((VideoAds) this.b).lambda$show$3((qc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            default:
                ((VideoAds) this.b).lambda$show$5((qc) this.c, (boolean[]) this.d);
                return;
        }
    }
}
