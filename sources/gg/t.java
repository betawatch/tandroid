package gg;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import ii.a6;
import ii.c6;
import ii.d6;
import ii.e3;
import ii.f6;
import ii.j3;
import ii.o5;
import ii.w3;
import ii.x5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10 = this.a;
        Object obj = this.d;
        ?? r62 = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((g0) obj2).a((a0.i) obj, (ArrayList) r62);
                break;
            case 1:
                k1 k1Var = (k1) obj2;
                String str = (String) r62;
                TLObject tLObject = (TLObject) obj;
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
                        break;
                    }
                }
                break;
            case 2:
                k1 k1Var2 = (k1) obj2;
                k1Var2.p0 = null;
                k1Var2.Y((a0.i) obj, (ArrayList) r62, true);
                break;
            case 3:
                c2 c2Var = (c2) obj2;
                ArrayList arrayList4 = (ArrayList) r62;
                c2Var.q = arrayList4;
                c2Var.r = (HashMap) obj;
                c2Var.s = true;
                c2Var.a.Q(arrayList4);
                break;
            case 4:
                e2 e2Var = (e2) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) r62).q;
                g2 g2Var = e2Var.a;
                String str3 = g2Var.R;
                s41 s41Var = g2Var.e;
                if (str2.equals(str3)) {
                    e2Var.a();
                    s41Var.b.h.getProgressDrawable().e = false;
                    g2Var.N = 0;
                    s41Var.b(true);
                    g2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    g2Var.l();
                    break;
                }
                break;
            case 5:
                hg.d dVar = (hg.d) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r62;
                TLObject tLObject2 = (TLObject) obj;
                if (tL_error != null) {
                    dVar.a.a(0.0f);
                    vc.b0(tL_error);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    dVar.a.a(0.0f);
                    org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(dVar), null);
                    break;
                } else {
                    dVar.finishFragment();
                    break;
                }
            case 6:
                hg.n nVar = (hg.n) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) r62;
                TLObject tLObject3 = (TLObject) obj;
                if (tL_error2 != null) {
                    nVar.e.a(0.0f);
                    vc.b0(tL_error2);
                    break;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(nVar), null);
                    break;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    break;
                }
            case 7:
                hg.a0 a0Var = (hg.a0) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList5 = a0Var.b;
                if (((TLObject) r62) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(a0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    a0Var.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 8:
                hg.a0 a0Var2 = (hg.a0) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r62;
                ConnectionsManager.getInstance(a0Var2.a).sendRequest(deletebusinesschatlink, new ai.v1(13, a0Var2, (TL_account.TL_businessChatLink) obj));
                break;
            case 9:
                hg.m0.P((hg.m0) obj2, (TL_account.TL_connectedBot) r62, (TL_account.TL_businessBotRecipients) obj);
                break;
            case 10:
                hg.x0 x0Var = (hg.x0) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) r62;
                TLObject tLObject4 = (TLObject) obj;
                if (tL_error3 != null) {
                    x0Var.a.a(0.0f);
                    vc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    x0Var.a.a(0.0f);
                    org.telegram.messenger.y0.p(R.string.UnknownError, vc.a0(x0Var), null);
                    break;
                } else {
                    x0Var.finishFragment();
                    break;
                }
            case 11:
                hg.h1.U((hg.h1) obj2, (TLRPC.TL_error) r62, (TLObject) obj);
                break;
            case 12:
                hg.g2 g2Var2 = (hg.g2) obj2;
                TLObject tLObject5 = (TLObject) r62;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList6 = g2Var2.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var2.c = true;
                g2Var2.b = false;
                break;
            case 13:
                u2.f0 f0Var = (u2.f0) obj;
                j2.f fVar = ((i2.v0) obj2).c;
                e9.a1 i11 = ((e9.f0) r62).i();
                com.google.firebase.messaging.n nVar2 = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar2.getClass();
                nVar2.b = e9.i0.v(i11);
                if (!i11.isEmpty()) {
                    nVar2.e = (u2.f0) i11.get(0);
                    f0Var.getClass();
                    nVar2.f = f0Var;
                }
                if (((u2.f0) nVar2.d) == null) {
                    nVar2.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar2.b, (u2.f0) nVar2.e, (b2.h1) nVar2.a);
                }
                nVar2.H(b1Var.w0());
                break;
            case 14:
                Pair pair = (Pair) r62;
                ((i2.c1) obj2).b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) obj);
                break;
            case 15:
                w3 w3Var = (w3) obj2;
                o5 o5Var = (o5) obj;
                if (w3Var.j4 == ((n70) r62)) {
                    w3Var.j4 = null;
                    if (w3Var.C3 && w3Var.i4 == o5Var && !o5Var.H.isEmpty()) {
                        w3Var.M2();
                        break;
                    }
                }
                break;
            case 16:
                w3 w3Var2 = (w3) obj2;
                ii.a aVar = (ii.a) r62;
                ii.a aVar2 = (ii.a) obj;
                ArrayList arrayList7 = w3Var2.p4;
                j3 j3Var = w3Var2.n3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                            ii.a aVar3 = (ii.a) arrayList7.get(i12);
                            long j3 = aVar3.t;
                            if (j3 != 0) {
                                j3Var.Y(i12, f6.l((TL_iv.RichText) w3Var2.m3.get(Long.valueOf(j3))));
                            } else {
                                j3Var.Y(i12, d6.z(aVar3.b));
                            }
                        }
                        j3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 17:
                ((w3) obj2).Z4((ii.a) r62, (String) obj);
                break;
            case 18:
                ii.a aVar4 = (ii.a) r62;
                c6 c6Var = (c6) obj;
                a6 a6Var = ((x5) obj2).a.y;
                if (a6Var != null) {
                    ((e3) a6Var).d(aVar4, c6Var.a, c6Var.b, c6Var.c, c6Var.d, c6Var.e);
                    break;
                }
                break;
            case 19:
                ji.n nVar3 = (ji.n) obj2;
                ArrayList arrayList8 = (ArrayList) r62;
                ArrayList arrayList9 = (ArrayList) obj;
                nVar3.getClass();
                for (int i13 = 0; i13 < arrayList8.size(); i13++) {
                    ((View) arrayList8.get(i13)).setVisibility(0);
                }
                if (nVar3.A.removeAll(arrayList9)) {
                    for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                        nVar3.d((s4.c1) arrayList9.get(i14));
                    }
                    nVar3.G();
                }
                nVar3.K.removeAll(arrayList8);
                break;
            case 20:
                ji.n nVar4 = (ji.n) obj2;
                View view = (View) r62;
                s4.c1 c1Var = (s4.c1) obj;
                nVar4.getClass();
                view.setVisibility(0);
                if (nVar4.A.remove(c1Var)) {
                    nVar4.d(c1Var);
                    nVar4.G();
                }
                nVar4.K.remove(view);
                break;
            case 21:
                k2.j jVar = (k2.j) ((n4.y) obj2).c;
                String str4 = e2.d0.a;
                j2.f fVar2 = ((i2.b0) jVar).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) r62, (i2.h) obj, 20));
                break;
            case 22:
                m4.w wVar = (m4.w) obj2;
                m4.r rVar = (m4.r) r62;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.a0 a0Var3 = wVar.b;
                if (a0Var3.i(rVar)) {
                    a0Var3.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = a0Var3.h;
                    n4.a0 a0Var4 = rVar.a;
                    a0Var4.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.b0(l0Var, 7), a0Var4, true);
                }
                wVar.a = null;
                break;
            case 23:
                m4.a0 a0Var5 = (m4.a0) obj2;
                m4.u0 u0Var = (m4.u0) r62;
                m4.s sVar = (m4.s) obj;
                if (!a0Var5.j()) {
                    m4.k1 k1Var3 = a0Var5.t;
                    u0Var.getClass();
                    w7.t.b(k1Var3, sVar);
                    break;
                }
                break;
            case 24:
                n2.j jVar2 = (n2.j) obj2;
                r62.b(jVar2.a, jVar2.b, (Exception) obj);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$3((oc) r62, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 26:
                ((VideoAds) obj2).lambda$show$5((oc) r62, (boolean[]) obj);
                break;
            case 27:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r62, (Runnable) obj);
                break;
            case 28:
                ((Utilities.Callback2) obj2).run((TLObject) r62, (TLRPC.TL_error) obj);
                break;
            default:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r62, (TLRPC.TL_error) obj);
                break;
        }
    }
}
