package hg;

import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.SpannableString;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ig.f2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import ji.c6;
import ji.f3;
import ji.f6;
import ji.h6;
import ji.i6;
import ji.k3;
import ji.k6;
import ji.u5;
import ji.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Object, n2.k] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10 = 13;
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
                a0.h hVar = (a0.h) this.d;
                j1Var2.p0 = null;
                j1Var2.Y(hVar, arrayList4, true);
                return;
            case 3:
                a2 a2Var = (a2) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.d;
                a2Var.q = arrayList5;
                a2Var.r = hashMap;
                a2Var.s = true;
                a2Var.a.O0(arrayList5);
                return;
            case 4:
                c2 c2Var = (c2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = tL_messages_searchStickerSets.q;
                e2 e2Var = c2Var.a;
                String str3 = e2Var.R;
                w51 w51Var = e2Var.e;
                if (str2.equals(str3)) {
                    c2Var.a();
                    w51Var.b.h.getProgressDrawable().e = false;
                    e2Var.N = 0;
                    w51Var.b(true);
                    e2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    e2Var.l();
                    return;
                }
                return;
            case 5:
                i2.z0 z0Var = (i2.z0) this.b;
                e9.k0 k0Var = (e9.k0) this.c;
                u2.g0 g0Var = (u2.g0) this.d;
                j2.f fVar = z0Var.c;
                e9.x1 f7 = k0Var.f();
                com.google.firebase.messaging.m mVar = fVar.d;
                b2.g1 g1Var = fVar.h;
                g1Var.getClass();
                mVar.getClass();
                mVar.b = e9.n0.u(f7);
                if (!f7.isEmpty()) {
                    mVar.e = (u2.g0) f7.get(0);
                    g0Var.getClass();
                    mVar.f = g0Var;
                }
                if (((u2.g0) mVar.d) == null) {
                    mVar.d = com.google.firebase.messaging.m.p(g1Var, (e9.n0) mVar.b, (u2.g0) mVar.e, (b2.m1) mVar.a);
                }
                mVar.H(g1Var.y0());
                return;
            case 6:
                i2.g1 g1Var2 = (i2.g1) this.b;
                Pair pair2 = (Pair) this.c;
                g1Var2.b.h.c(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (oa.d) this.d);
                return;
            case 7:
                i2.g1 g1Var3 = (i2.g1) this.b;
                Pair pair3 = (Pair) this.c;
                g1Var3.b.h.b(((Integer) pair3.first).intValue(), (u2.g0) pair3.second, (Exception) this.d);
                return;
            case 8:
                ig.c cVar = (ig.c) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.a.a(0.0f);
                    zc.d0(tL_error);
                    return;
                } else if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                    cVar.finishFragment();
                    return;
                } else {
                    cVar.a.a(0.0f);
                    sk.q(R.string.UnknownError, zc.a0(cVar), null);
                    return;
                }
            case 9:
                ig.m mVar2 = (ig.m) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    mVar2.e.a(0.0f);
                    zc.d0(tL_error2);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar2.e.a(0.0f);
                    sk.q(R.string.UnknownError, zc.a0(mVar2), null);
                    return;
                } else {
                    if (mVar2.E != null) {
                        mVar2.getMessagesController().loadFullUser(mVar2.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar2.finishFragment();
                    return;
                }
            case 10:
                ig.y yVar = (ig.y) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList6 = yVar.b;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    return;
                }
                if (arrayList6.contains(tL_businessChatLink)) {
                    arrayList6.remove(tL_businessChatLink);
                    NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                }
                yVar.f();
                return;
            case 11:
                ig.y yVar2 = (ig.y) this.b;
                String str4 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str4;
                ConnectionsManager.getInstance(yVar2.a).sendRequest(deletebusinesschatlink, new bi.m1(i10, yVar2, tL_businessChatLink2));
                return;
            case 12:
                ig.k0.Q((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                return;
            case 13:
                ig.w0 w0Var = (ig.w0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error3 != null) {
                    w0Var.a.a(0.0f);
                    zc.d0(tL_error3);
                    return;
                } else if (!(tLObject5 instanceof TLRPC.TL_boolFalse)) {
                    w0Var.finishFragment();
                    return;
                } else {
                    w0Var.a.a(0.0f);
                    sk.q(R.string.UnknownError, zc.a0(w0Var), null);
                    return;
                }
            case 14:
                ig.g1.U((ig.g1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 15:
                f2 f2Var = (f2) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList7 = f2Var.d;
                if (tLObject6 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList7.clear();
                    arrayList7.addAll(((TLRPC.TL_help_timezonesList) tLObject6).timezones);
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var.c = true;
                f2Var.b = false;
                return;
            case 16:
                x3 x3Var = (x3) this.b;
                l80 l80Var = (l80) this.c;
                u5 u5Var = (u5) this.d;
                if (x3Var.h4 != l80Var) {
                    return;
                }
                x3Var.h4 = null;
                if (x3Var.A3 && x3Var.g4 == u5Var && !u5Var.H.isEmpty()) {
                    x3Var.N2();
                    return;
                }
                return;
            case 17:
                x3 x3Var2 = (x3) this.b;
                ji.a aVar = (ji.a) this.c;
                ji.a aVar2 = (ji.a) this.d;
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
                for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                    ji.a aVar3 = (ji.a) arrayList8.get(i12);
                    long j10 = aVar3.t;
                    if (j10 != 0) {
                        k3Var.X(i12, k6.l((TL_iv.RichText) x3Var2.k3.get(Long.valueOf(j10))));
                    } else {
                        k3Var.X(i12, i6.z(aVar3.b));
                    }
                }
                k3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 18:
                ((x3) this.b).a5((String) this.d, (ji.a) this.c);
                return;
            case 19:
                c6 c6Var = (c6) this.b;
                ji.a aVar4 = (ji.a) this.c;
                h6 h6Var = (h6) this.d;
                f6 f6Var = c6Var.a.y;
                if (f6Var != null) {
                    ((f3) f6Var).d(aVar4, h6Var.a, h6Var.b, h6Var.c, h6Var.d, h6Var.e);
                    return;
                }
                return;
            case 20:
                qf.b bVar = (qf.b) this.b;
                b2.x xVar = (b2.x) this.c;
                i2.f fVar2 = (i2.f) this.d;
                k2.u uVar = (k2.u) bVar.c;
                String str5 = e2.m0.a;
                j2.f fVar3 = ((i2.b0) uVar).a.s;
                j2.a p5 = fVar3.p();
                fVar3.q(p5, 1009, new j2.e(p5, xVar, fVar2));
                return;
            case 21:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                e2.r rVar = (e2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new ig.t0(rVar, i10));
                    }
                    synchronized (k2.h0.t) {
                        try {
                            int i13 = k2.h0.v - 1;
                            k2.h0.v = i13;
                            if (i13 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.h0.u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.h0.u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new ig.t0(rVar, i10));
                    }
                    synchronized (k2.h0.t) {
                        try {
                            int i14 = k2.h0.v - 1;
                            k2.h0.v = i14;
                            if (i14 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.h0.u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.h0.u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 22:
                ki.n nVar = (ki.n) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                nVar.getClass();
                for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                    ((View) arrayList9.get(i15)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList10)) {
                    for (int i16 = 0; i16 < arrayList10.size(); i16++) {
                        nVar.d((s4.b1) arrayList10.get(i16));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList9);
                return;
            case 23:
                ki.n nVar2 = (ki.n) this.b;
                View view = (View) this.c;
                s4.b1 b1Var = (s4.b1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(b1Var)) {
                    nVar2.d(b1Var);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                return;
            case 24:
                SpannableString spannableString = (SpannableString) this.b;
                n4.s sVar2 = (n4.s) this.c;
                gi.m0 m0Var = (gi.m0) this.d;
                li.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) sVar2.b);
                m0Var.run(spannableString);
                return;
            case 25:
                m4.a0 a0Var = (m4.a0) this.b;
                m4.v vVar = (m4.v) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.e0 e0Var = a0Var.b;
                if (e0Var.i(vVar)) {
                    e0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = e0Var.h;
                    n4.t tVar = vVar.a;
                    tVar.getClass();
                    p0Var.getClass();
                    p0Var.H(1, new m4.h0(p0Var, 9), tVar, true);
                }
                a0Var.a = null;
                return;
            case 26:
                m4.e0 e0Var2 = (m4.e0) this.b;
                m4.v0 v0Var = (m4.v0) this.c;
                m4.w wVar = (m4.w) this.d;
                if (e0Var2.j()) {
                    return;
                }
                m4.m1 m1Var = e0Var2.t;
                v0Var.getClass();
                w7.v.b(m1Var, wVar);
                return;
            case 27:
                n2.j jVar = (n2.j) this.b;
                this.c.b(jVar.a, jVar.b, (Exception) this.d);
                return;
            case 28:
                n2.j jVar2 = (n2.j) this.b;
                this.c.c(jVar2.a, jVar2.b, (oa.d) this.d);
                return;
            default:
                ((VideoAds) this.b).lambda$show$3((sc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
        }
    }
}
