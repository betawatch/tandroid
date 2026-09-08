package hg;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import ji.a6;
import ji.d3;
import ji.d6;
import ji.f6;
import ji.g6;
import ji.i3;
import ji.i6;
import ji.s5;
import ji.v3;
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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ((g0) obj2).b((a0.i) obj, (ArrayList) r62);
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
                b2 b2Var = (b2) obj2;
                ArrayList arrayList4 = (ArrayList) r62;
                b2Var.q = arrayList4;
                b2Var.r = (HashMap) obj;
                b2Var.s = true;
                b2Var.a.Y(arrayList4);
                break;
            case 4:
                d2 d2Var = (d2) obj2;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj;
                String str2 = ((TLRPC.TL_messages_searchStickerSets) r62).q;
                f2 f2Var = d2Var.a;
                String str3 = f2Var.R;
                r41 r41Var = f2Var.e;
                if (str2.equals(str3)) {
                    d2Var.a();
                    r41Var.b.h.getProgressDrawable().e = false;
                    f2Var.N = 0;
                    r41Var.b(true);
                    f2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    f2Var.l();
                    break;
                }
                break;
            case 5:
                u2.f0 f0Var = (u2.f0) obj;
                j2.f fVar = ((i2.v0) obj2).c;
                e9.a1 i11 = ((e9.f0) r62).i();
                com.google.firebase.messaging.n nVar = fVar.d;
                b2.b1 b1Var = fVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.b = e9.i0.v(i11);
                if (!i11.isEmpty()) {
                    nVar.e = (u2.f0) i11.get(0);
                    f0Var.getClass();
                    nVar.f = f0Var;
                }
                if (((u2.f0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.b, (u2.f0) nVar.e, (b2.h1) nVar.a);
                }
                nVar.H(b1Var.w0());
                break;
            case 6:
                Pair pair = (Pair) r62;
                ((i2.c1) obj2).b.h.b(((Integer) pair.first).intValue(), (u2.f0) pair.second, (Exception) obj);
                break;
            case 7:
                ig.c cVar = (ig.c) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r62;
                TLObject tLObject2 = (TLObject) obj;
                if (tL_error != null) {
                    cVar.a.a(0.0f);
                    yc.b0(tL_error);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    cVar.a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(cVar), null);
                    break;
                } else {
                    cVar.finishFragment();
                    break;
                }
            case 8:
                ig.m mVar = (ig.m) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) r62;
                TLObject tLObject3 = (TLObject) obj;
                if (tL_error2 != null) {
                    mVar.e.a(0.0f);
                    yc.b0(tL_error2);
                    break;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    mVar.e.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(mVar), null);
                    break;
                } else {
                    if (mVar.E != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    break;
                }
            case 9:
                ig.y yVar = (ig.y) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList5 = yVar.b;
                if (((TLObject) r62) instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.contains(tL_businessChatLink)) {
                        arrayList5.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    yVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 10:
                ig.y yVar2 = (ig.y) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r62;
                ConnectionsManager.getInstance(yVar2.a).sendRequest(deletebusinesschatlink, new bi.m1(13, yVar2, (TL_account.TL_businessChatLink) obj));
                break;
            case 11:
                ig.k0.P((ig.k0) obj2, (TL_account.TL_connectedBot) r62, (TL_account.TL_businessBotRecipients) obj);
                break;
            case 12:
                ig.w0 w0Var = (ig.w0) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) r62;
                TLObject tLObject4 = (TLObject) obj;
                if (tL_error3 != null) {
                    w0Var.a.a(0.0f);
                    yc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w0Var.a.a(0.0f);
                    org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(w0Var), null);
                    break;
                } else {
                    w0Var.finishFragment();
                    break;
                }
            case 13:
                ig.g1.U((ig.g1) obj2, (TLRPC.TL_error) r62, (TLObject) obj);
                break;
            case 14:
                ig.f2 f2Var2 = (ig.f2) obj2;
                TLObject tLObject5 = (TLObject) r62;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList6 = f2Var2.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList6.clear();
                    arrayList6.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(f2Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                f2Var2.c = true;
                f2Var2.b = false;
                break;
            case 15:
                v3 v3Var = (v3) obj2;
                s5 s5Var = (s5) obj;
                if (v3Var.j4 == ((n70) r62)) {
                    v3Var.j4 = null;
                    if (v3Var.C3 && v3Var.i4 == s5Var && !s5Var.H.isEmpty()) {
                        v3Var.L2();
                        break;
                    }
                }
                break;
            case 16:
                v3 v3Var2 = (v3) obj2;
                ji.a aVar = (ji.a) r62;
                ji.a aVar2 = (ji.a) obj;
                ArrayList arrayList7 = v3Var2.p4;
                i3 i3Var = v3Var2.n3;
                if (i3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList7.indexOf(aVar);
                    int indexOf2 = arrayList7.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                            ji.a aVar3 = (ji.a) arrayList7.get(i12);
                            long j3 = aVar3.t;
                            if (j3 != 0) {
                                i3Var.Y(i12, i6.l((TL_iv.RichText) v3Var2.m3.get(Long.valueOf(j3))));
                            } else {
                                i3Var.Y(i12, g6.z(aVar3.b));
                            }
                        }
                        i3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 17:
                ((v3) obj2).Y4((String) obj, (ji.a) r62);
                break;
            case 18:
                ji.a aVar4 = (ji.a) r62;
                f6 f6Var = (f6) obj;
                d6 d6Var = ((a6) obj2).a.y;
                if (d6Var != null) {
                    ((d3) d6Var).d(aVar4, f6Var.a, f6Var.b, f6Var.c, f6Var.d, f6Var.e);
                    break;
                }
                break;
            case 19:
                k2.j jVar = (k2.j) ((n4.y) obj2).c;
                String str4 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1009, new j2.c(p5, (b2.s) r62, (i2.i) obj, 19));
                break;
            case 20:
                ki.o oVar = (ki.o) obj2;
                ArrayList arrayList8 = (ArrayList) r62;
                ArrayList arrayList9 = (ArrayList) obj;
                oVar.getClass();
                for (int i13 = 0; i13 < arrayList8.size(); i13++) {
                    ((View) arrayList8.get(i13)).setVisibility(0);
                }
                if (oVar.A.removeAll(arrayList9)) {
                    for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                        oVar.d((s4.c1) arrayList9.get(i14));
                    }
                    oVar.G();
                }
                oVar.K.removeAll(arrayList8);
                break;
            case 21:
                ki.o oVar2 = (ki.o) obj2;
                View view = (View) r62;
                s4.c1 c1Var = (s4.c1) obj;
                oVar2.getClass();
                view.setVisibility(0);
                if (oVar2.A.remove(c1Var)) {
                    oVar2.d(c1Var);
                    oVar2.G();
                }
                oVar2.K.remove(view);
                break;
            case 22:
                m4.w wVar = (m4.w) obj2;
                m4.r rVar = (m4.r) r62;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.a0 a0Var = wVar.b;
                if (a0Var.i(rVar)) {
                    a0Var.b(keyEvent, false, false);
                } else {
                    m4.k0 k0Var = a0Var.h;
                    n4.a0 a0Var2 = rVar.a;
                    a0Var2.getClass();
                    k0Var.getClass();
                    k0Var.H(1, new m4.b0(k0Var, 7), a0Var2, true);
                }
                wVar.a = null;
                break;
            case 23:
                m4.a0 a0Var3 = (m4.a0) obj2;
                m4.t0 t0Var = (m4.t0) r62;
                m4.s sVar = (m4.s) obj;
                if (!a0Var3.j()) {
                    m4.j1 j1Var = a0Var3.t;
                    t0Var.getClass();
                    w7.t.b(j1Var, sVar);
                    break;
                }
                break;
            case 24:
                n2.j jVar2 = (n2.j) obj2;
                r62.b(jVar2.a, jVar2.b, (Exception) obj);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$3((qc) r62, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 26:
                ((VideoAds) obj2).lambda$show$5((qc) r62, (boolean[]) obj);
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
