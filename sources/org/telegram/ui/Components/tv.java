package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, hg.z1, GenericProvider, p90, of0, yl0, org.telegram.ui.xx, ci.q7, MessagesStorage.StringCallback, e91, LanguageDetector.StringCallback, mw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        lk0 lk0Var;
        switch (this.a) {
            case 15:
                mk0 mk0Var = (mk0) this.b;
                ArrayList arrayList = mk0Var.n;
                if (mk0Var.f.j(i10) != 0 || (lk0Var = mk0Var.F) == null) {
                    return true;
                }
                lk0Var.c(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                tn0 tn0Var = (tn0) this.b;
                sn0 sn0Var = tn0Var.c;
                MessageObject E = sn0Var.E(i10);
                tn0 tn0Var2 = sn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!tn0Var.I.g()) {
                    tn0Var.I.a();
                    sn0Var.q(0, tn0Var2.r);
                }
                if (tn0Var.I.g()) {
                    tn0Var.I.d(E, view, 0);
                    if (!tn0Var.I.g()) {
                        sn0Var.q(0, tn0Var2.r);
                    }
                    org.telegram.ui.y00 y00Var = tn0Var.J;
                    int id2 = E.getId();
                    y00Var.a = E.getDialogId();
                    y00Var.b = id2;
                }
                return true;
        }
    }

    @Override // ci.q7
    public void b(boolean z10) {
        ci.a7 a7Var = (ci.a7) this.b;
        if (z10) {
            a7Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.p90
    public void d() {
        ((te0) this.b).q(true);
    }

    @Override // org.telegram.ui.Components.e91
    public void e(int i10, int i11) {
        jw0 jw0Var = (jw0) this.b;
        jw0Var.w = i10;
        jw0Var.x = i11;
        ai.ic icVar = jw0Var.L;
        if (icVar != null) {
            icVar.invalidate();
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        r70 r70Var = (r70) this.b;
        v70 v70Var = r70Var.n;
        v70Var.K(r70Var.f - 1);
        if (r70Var.h == null && !r70Var.e.e() && r70Var.h() <= 2) {
            v70Var.s.e(false, true);
        }
        r70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((kz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((org.telegram.ui.i4) this.b).run();
                break;
            case 5:
                ((w20) this.b).o();
                break;
            case 7:
                v70.R((v70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                qy0 qy0Var = (qy0) this.b;
                qy0Var.e.presentFragment(new StickersActivity(qy0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((ry0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
        Utilities.Callback callback = ((f61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        aw.Q((aw) this.b, i10);
    }

    @Override // org.telegram.ui.Components.of0
    public void l(int i10, int i11) {
        cg0 cg0Var = ((bg0) this.b).d;
        if (i10 == cg0Var.b) {
            cg0Var.G = i11;
        } else if (i10 == cg0Var.r) {
            cg0Var.P = i11;
        } else if (i10 == cg0Var.d) {
            cg0Var.I = i11;
        } else if (i10 == cg0Var.c) {
            cg0Var.H = i11;
        } else if (i10 == cg0Var.f) {
            cg0Var.J = i11;
        } else if (i10 == cg0Var.e) {
            cg0Var.K = i11;
        } else if (i10 == cg0Var.v) {
            cg0Var.R = i11;
        } else if (i10 == cg0Var.s) {
            cg0Var.Q = i11;
        } else if (i10 == cg0Var.w) {
            cg0Var.S = i11;
        } else if (i10 == cg0Var.x) {
            cg0Var.U = i11;
        } else if (i10 == cg0Var.h) {
            cg0Var.L = i11;
        } else if (i10 == cg0Var.n) {
            cg0Var.M = i11;
        }
        e00 e00Var = cg0Var.l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        cg0Var.g();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ci.i7 storiesController;
        ci.i7 storiesController2;
        switch (this.a) {
            case 20:
                final sv0 sv0Var = ((ms0) this.b).d;
                storiesController = sv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(sv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ks0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 7;
                        sv0 sv0Var2 = sv0Var;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = sv0.d2;
                                AndroidUtilities.runOnUIThread(new go0(i12, sv0Var2, b7Var), 100L);
                                break;
                            default:
                                int[] iArr2 = sv0.d2;
                                AndroidUtilities.runOnUIThread(new go0(i12, sv0Var2, b7Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final sv0 sv0Var2 = ((wt0) this.b).d;
                storiesController2 = sv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(sv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ks0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 7;
                        sv0 sv0Var22 = sv0Var2;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = sv0.d2;
                                AndroidUtilities.runOnUIThread(new go0(i12, sv0Var22, b7Var), 100L);
                                break;
                            default:
                                int[] iArr2 = sv0.d2;
                                AndroidUtilities.runOnUIThread(new go0(i12, sv0Var22, b7Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                c51 c51Var = (c51) this.b;
                c51Var.e0 = str;
                c51Var.j0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        long j10;
        vo0 vo0Var = (vo0) this.b;
        int i12 = vo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = vo0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.y00) it.next()));
        }
        hashMap.clear();
        vo0Var.Q(false);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(i12).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                if (charSequence != null) {
                    j10 = j11;
                    AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j10 = j11;
                }
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
            }
            eyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle h = a1.g.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            h.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                h.putLong("user_id", j12);
            } else {
                h.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, eyVar)) {
                return true;
            }
        }
        org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
        eyVar.presentFragment(snVar, true);
        snVar.Eb(arrayList2);
        return true;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0285  */
    @Override // org.telegram.messenger.Utilities.Callback5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i10;
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        int childCount2;
        int i11;
        TLRPC.Document document2;
        ArrayList arrayList2;
        TLRPC.TL_messages_stickerSet stickerSet4;
        switch (this.a) {
            case 1:
                ty tyVar = (ty) this.b;
                f61 f61Var = (f61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                my myVar = tyVar.c;
                tz tzVar = tyVar.F;
                Object obj6 = f61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    ky kyVar = (ky) f61Var.H;
                    long j10 = tyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        tyVar.d = 0L;
                        stickerSet = null;
                        childCount = myVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            oh.c cVar = (oh.c) myVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (tyVar.d != 0 && tyVar.f.size() < tyVar.e.count && (stickerSet2 = MediaDataController.getInstance(tzVar.c1).getStickerSet(tyVar.e, false)) != null) {
                            tyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) f61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        oh.b bVar = tzVar.L;
                        ne.b bVar2 = tzVar.b;
                        arrayList = tyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) tyVar.f.get(0);
                        }
                        tzVar.J(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((oh.c) view).a(tyVar.d == 0, true);
                        bVar2.a(tyVar.d != 0, true);
                        tyVar.l();
                        tzVar.V.b();
                        if (tyVar.d == 0) {
                            myVar.J1(view);
                            break;
                        }
                    } else {
                        tyVar.d = j11;
                        tyVar.f = kyVar.d;
                        tyVar.e = stickerSet;
                        childCount = myVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (tyVar.d != 0) {
                            tyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) f61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        oh.b bVar3 = tzVar.L;
                        ne.b bVar22 = tzVar.b;
                        arrayList = tyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) tyVar.f.get(0);
                        }
                        tzVar.J(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((oh.c) view).a(tyVar.d == 0, true);
                        bVar22.a(tyVar.d != 0, true);
                        tyVar.l();
                        tzVar.V.b();
                        if (tyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = tyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            tyVar.d = 0L;
                        } else {
                            tyVar.d = j13;
                            tyVar.f = tL_messages_stickerSet.documents;
                            tyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = myVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (tyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) f61Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            oh.b bVar32 = tzVar.L;
                            ne.b bVar222 = tzVar.b;
                            arrayList = tyVar.f;
                            if (arrayList != null) {
                            }
                            tzVar.J(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((oh.c) view).a(tyVar.d == 0, true);
                            bVar222.a(tyVar.d != 0, true);
                            tyVar.l();
                            tzVar.V.b();
                            if (tyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = myVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (tyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) f61Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    oh.b bVar322 = tzVar.L;
                    ne.b bVar2222 = tzVar.b;
                    arrayList = tyVar.f;
                    if (arrayList != null) {
                    }
                    tzVar.J(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((oh.c) view).a(tyVar.d == 0, true);
                    bVar2222.a(tyVar.d != 0, true);
                    tyVar.l();
                    tzVar.V.b();
                    if (tyVar.d == 0) {
                    }
                }
                break;
            case 3:
                oz ozVar = (oz) this.b;
                f61 f61Var2 = (f61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                nz nzVar = ozVar.c;
                tz tzVar2 = ozVar.Q;
                Object obj7 = f61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    ky kyVar2 = (ky) f61Var2.H;
                    long j14 = ozVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        ozVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = nzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            oh.c cVar2 = (oh.c) nzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (ozVar.d != 0 && ozVar.f.size() < ozVar.e.count && (stickerSet4 = MediaDataController.getInstance(tzVar2.c1).getStickerSet(ozVar.e, false)) != null) {
                            ozVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) f61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        oh.b bVar4 = tzVar2.N;
                        ne.b bVar5 = tzVar2.a;
                        arrayList2 = ozVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) ozVar.f.get(0);
                        }
                        tzVar2.J(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((oh.c) view2).a(ozVar.d == 0, true);
                        bVar5.a(ozVar.d != 0, true);
                        ozVar.l();
                        tzVar2.G0.b();
                        if (ozVar.d == 0) {
                            nzVar.J1(view2);
                            break;
                        }
                    } else {
                        ozVar.d = j15;
                        ozVar.f = kyVar2.d;
                        ozVar.e = stickerSet3;
                        childCount2 = nzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (ozVar.d != 0) {
                            ozVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) f61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        oh.b bVar42 = tzVar2.N;
                        ne.b bVar52 = tzVar2.a;
                        arrayList2 = ozVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) ozVar.f.get(0);
                        }
                        tzVar2.J(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((oh.c) view2).a(ozVar.d == 0, true);
                        bVar52.a(ozVar.d != 0, true);
                        ozVar.l();
                        tzVar2.G0.b();
                        if (ozVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = ozVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            ozVar.d = 0L;
                        } else {
                            ozVar.d = j17;
                            ozVar.f = tL_messages_stickerSet2.documents;
                            ozVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = nzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (ozVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) f61Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            oh.b bVar422 = tzVar2.N;
                            ne.b bVar522 = tzVar2.a;
                            arrayList2 = ozVar.f;
                            if (arrayList2 != null) {
                            }
                            tzVar2.J(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((oh.c) view2).a(ozVar.d == 0, true);
                            bVar522.a(ozVar.d != 0, true);
                            ozVar.l();
                            tzVar2.G0.b();
                            if (ozVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = nzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (ozVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) f61Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    oh.b bVar4222 = tzVar2.N;
                    ne.b bVar5222 = tzVar2.a;
                    arrayList2 = ozVar.f;
                    if (arrayList2 != null) {
                    }
                    tzVar2.J(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((oh.c) view2).a(ozVar.d == 0, true);
                    bVar5222.a(ozVar.d != 0, true);
                    ozVar.l();
                    tzVar2.G0.b();
                    if (ozVar.d == 0) {
                    }
                }
                break;
            case 12:
                th0 th0Var = (th0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((f61) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle);
                    org.telegram.ui.ey eyVar = th0Var.a;
                    org.telegram.ui.ey.b4(snVar, messageObject);
                    eyVar.presentFragment(snVar);
                    break;
                }
                break;
            case 16:
                im0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((im0) this.b).n2);
                break;
            default:
                im0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((a71) this.b).n2);
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
    }
}
