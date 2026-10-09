package gg;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import hg.g2;
import ii.c6;
import ii.e6;
import ii.f3;
import ii.f6;
import ii.h6;
import ii.k3;
import ii.q5;
import ii.x3;
import ii.z5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    private final void a() {
        oi.k kVar = (oi.k) this.b;
        WebView webView = (WebView) this.c;
        b5.h hVar = (b5.h) this.d;
        synchronized (kVar.a) {
            if (!kVar.u && kVar.o == webView && kVar.p == hVar && !kVar.r) {
                if (kVar.s) {
                    FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    kVar.o();
                } else {
                    kVar.s = true;
                    FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                    kVar.f();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10 = 1;
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.b;
                HashSet hashSet = (HashSet) this.c;
                s sVar = (s) this.d;
                int i11 = h0Var.s0;
                MessagesController messagesController = MessagesController.getInstance(i11);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    Long l4 = (Long) pair.second;
                    (booleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l4, Integer.valueOf(MessagesStorage.getInstance(i11).getDialogReadMaxSync(booleanValue, l4.longValue())));
                }
                AndroidUtilities.runOnUIThread(sVar);
                return;
            case 1:
                j1 j1Var = (j1) this.b;
                String str = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                j1Var.E0 = 0;
                if (str.equals(j1Var.D0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                    ArrayList arrayList2 = j1Var.A0;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    j1Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
                    ArrayList arrayList3 = j1Var.A0;
                    int size2 = arrayList3 != null ? arrayList3.size() : 0;
                    if (!j1Var.o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        j1Var.V.a(j1Var.K() > 0);
                        j1Var.o0 = true;
                    }
                    if (size != size2) {
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                j1 j1Var2 = (j1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                a0.i iVar = (a0.i) this.d;
                j1Var2.p0 = null;
                j1Var2.Y(iVar, arrayList4, true);
                return;
            case 3:
                b2 b2Var = (b2) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.d;
                b2Var.q = arrayList5;
                b2Var.r = hashMap;
                b2Var.s = true;
                b2Var.a.x0(arrayList5);
                return;
            case 4:
                d2 d2Var = (d2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = tL_messages_searchStickerSets.q;
                f2 f2Var = d2Var.a;
                String str3 = f2Var.R;
                z51 z51Var = f2Var.e;
                if (str2.equals(str3)) {
                    d2Var.a();
                    z51Var.b.h.getProgressDrawable().e = false;
                    f2Var.N = 0;
                    z51Var.b(true);
                    f2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    f2Var.l();
                    return;
                }
                return;
            case 5:
                hg.d dVar = (hg.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    dVar.a.a(0.0f);
                    ad.d0(tL_error);
                    return;
                } else if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                    dVar.finishFragment();
                    return;
                } else {
                    dVar.a.a(0.0f);
                    bi.q(R.string.UnknownError, ad.a0(dVar), null);
                    return;
                }
            case 6:
                hg.n nVar = (hg.n) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    nVar.e.a(0.0f);
                    ad.d0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    bi.q(R.string.UnknownError, ad.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            case 7:
                hg.z zVar = (hg.z) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList6 = zVar.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    return;
                }
                if (arrayList6.contains(tL_businessChatLink)) {
                    arrayList6.remove(tL_businessChatLink);
                    NotificationCenter.getInstance(zVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                }
                zVar.f();
                return;
            case 8:
                hg.z zVar2 = (hg.z) this.b;
                String str4 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str4;
                ConnectionsManager.getInstance(zVar2.a).sendRequest(deletebusinesschatlink, new ai.v1(13, zVar2, tL_businessChatLink2));
                return;
            case 9:
                hg.l0.Q((hg.l0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 10:
                hg.w0 w0Var = (hg.w0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.a.a(0.0f);
                    ad.d0(tL_error3);
                    return;
                } else if (!(tLObject5 instanceof TLRPC.TL_boolFalse)) {
                    w0Var.finishFragment();
                    return;
                } else {
                    w0Var.a.a(0.0f);
                    bi.q(R.string.UnknownError, ad.a0(w0Var), null);
                    return;
                }
            case 11:
                hg.g1.U((hg.g1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 12:
                g2 g2Var = (g2) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList7 = g2Var.d;
                if (tLObject6 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList7.clear();
                    arrayList7.addAll(((TLRPC.TL_help_timezonesList) tLObject6).timezones);
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var.c = true;
                g2Var.b = false;
                return;
            case 13:
                i2.w0 w0Var2 = (i2.w0) this.b;
                e9.f0 f0Var = (e9.f0) this.c;
                u2.f0 f0Var2 = (u2.f0) this.d;
                j2.f fVar = w0Var2.c;
                e9.a1 i12 = f0Var.i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.b = e9.i0.v(i12);
                if (!i12.isEmpty()) {
                    nVar2.e = (u2.f0) i12.get(0);
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
                Pair pair2 = (Pair) this.c;
                d1Var.b.h.b(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, (Exception) this.d);
                return;
            case 15:
                x3 x3Var = (x3) this.b;
                p80 p80Var = (p80) this.c;
                q5 q5Var = (q5) this.d;
                if (x3Var.h4 != p80Var) {
                    return;
                }
                x3Var.h4 = null;
                if (x3Var.A3 && x3Var.g4 == q5Var && !q5Var.H.isEmpty()) {
                    x3Var.N2();
                    return;
                }
                return;
            case 16:
                x3 x3Var2 = (x3) this.b;
                ii.a aVar = (ii.a) this.c;
                ii.a aVar2 = (ii.a) this.d;
                ArrayList arrayList8 = x3Var2.n4;
                k3 k3Var = x3Var2.l3;
                if (k3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList8.indexOf(aVar);
                int indexOf2 = arrayList8.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                for (int i13 = 0; i13 < arrayList8.size(); i13++) {
                    ii.a aVar3 = (ii.a) arrayList8.get(i13);
                    long j3 = aVar3.t;
                    if (j3 != 0) {
                        k3Var.X(i13, h6.l((TL_iv.RichText) x3Var2.k3.get(Long.valueOf(j3))));
                    } else {
                        k3Var.X(i13, f6.z(aVar3.b));
                    }
                }
                k3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 17:
                ((x3) this.b).a5((ii.a) this.c, (String) this.d);
                return;
            case 18:
                z5 z5Var = (z5) this.b;
                ii.a aVar4 = (ii.a) this.c;
                e6 e6Var = (e6) this.d;
                c6 c6Var = z5Var.a.y;
                if (c6Var != null) {
                    ((f3) c6Var).d(aVar4, e6Var.a, e6Var.b, e6Var.c, e6Var.d, e6Var.e);
                    return;
                }
                return;
            case 19:
                ji.n nVar3 = (ji.n) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                nVar3.getClass();
                for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                    ((View) arrayList9.get(i14)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList10)) {
                    for (int i15 = 0; i15 < arrayList10.size(); i15++) {
                        nVar3.d((s4.d1) arrayList10.get(i15));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList9);
                return;
            case 20:
                ji.n nVar4 = (ji.n) this.b;
                View view = (View) this.c;
                s4.d1 d1Var2 = (s4.d1) this.d;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(d1Var2)) {
                    nVar4.d(d1Var2);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                return;
            case 21:
                n4.x xVar = (n4.x) this.b;
                b2.s sVar2 = (b2.s) this.c;
                i2.h hVar = (i2.h) this.d;
                k2.j jVar = (k2.j) xVar.c;
                String str5 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, sVar2, hVar, 19));
                return;
            case 22:
                ki.r rVar = (ki.r) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                rVar.getClass();
                try {
                    rVar.f();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 23:
                ki.t0 t0Var = (ki.t0) this.b;
                ki.u uVar = (ki.u) this.c;
                File file = (File) this.d;
                Handler handler = t0Var.i;
                try {
                    uVar.c(file);
                    t0Var.g();
                    long e7 = w7.j.e(file) / 1000;
                    t0Var.m.b("preview snapshot completed: durationMs=" + e7 + ", size=" + file.length() + ", elapsedMs=" + ki.t0.f(t0Var.J));
                    handler.post(new ki.e0(t0Var, e7, i10));
                    return;
                } catch (Exception e10) {
                    handler.post(new ki.d0(t0Var, e10, 3));
                    return;
                }
            case 24:
                ki.t0 t0Var2 = (ki.t0) this.b;
                ki.p0 p0Var = (ki.p0) this.c;
                File file2 = (File) this.d;
                ki.q0 q0Var = t0Var2.e;
                long j10 = p0Var.a;
                g11 g11Var = (g11) q0Var;
                synchronized (g11Var) {
                    if (g11Var.d) {
                        return;
                    }
                    g11Var.c.put(Long.valueOf(j10), new e11(file2));
                    return;
                }
            case 25:
                m4.x xVar2 = (m4.x) this.b;
                m4.r rVar2 = (m4.r) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.b0 b0Var = xVar2.b;
                if (b0Var.i(rVar2)) {
                    b0Var.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = b0Var.h;
                    n4.z zVar3 = rVar2.a;
                    zVar3.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.c0(l0Var, 7), zVar3, true);
                }
                xVar2.a = null;
                return;
            case 26:
                m4.b0 b0Var2 = (m4.b0) this.b;
                m4.q0 q0Var2 = (m4.q0) this.c;
                m4.s sVar3 = (m4.s) this.d;
                if (b0Var2.j()) {
                    return;
                }
                m4.f1 f1Var = b0Var2.t;
                q0Var2.getClass();
                w7.s.b(f1Var, sVar3);
                return;
            case 27:
                n2.j jVar2 = (n2.j) this.b;
                this.c.b(jVar2.a, jVar2.b, (Exception) this.d);
                return;
            case 28:
                a();
                return;
            default:
                ((VideoAds) this.b).lambda$show$3((tc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
        }
    }
}
