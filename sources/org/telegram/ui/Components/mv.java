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
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, f90, gf0, ol0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, b91, LanguageDetector.StringCallback, fw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override // gg.b2
    public /* synthetic */ boolean L(int i10) {
        return true;
    }

    @Override // ai.t9
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.f90
    public void c() {
        ((le0) this.b).p(true);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        bk0 bk0Var;
        switch (this.a) {
            case 15:
                ck0 ck0Var = (ck0) this.b;
                ArrayList arrayList = ck0Var.n;
                if (ck0Var.f.j(i10) != 0 || (bk0Var = ck0Var.F) == null) {
                    return true;
                }
                bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                kn0 kn0Var = (kn0) this.b;
                jn0 jn0Var = kn0Var.c;
                MessageObject E = jn0Var.E(i10);
                kn0 kn0Var2 = jn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!kn0Var.I.g()) {
                    kn0Var.I.a();
                    jn0Var.q(0, kn0Var2.r);
                }
                if (kn0Var.I.g()) {
                    kn0Var.I.e(E, view, 0);
                    if (!kn0Var.I.g()) {
                        jn0Var.q(0, kn0Var2.r);
                    }
                    org.telegram.ui.p10 p10Var = kn0Var.J;
                    int id2 = E.getId();
                    p10Var.a = E.getDialogId();
                    p10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.b91
    public void e(int i10, int i11) {
        cw0 cw0Var = (cw0) this.b;
        cw0Var.w = i10;
        cw0Var.x = i11;
        ci.eb ebVar = cw0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override // gg.b2
    public void f(int i10) {
        i70 i70Var = (i70) this.b;
        m70 m70Var = i70Var.n;
        m70Var.J(i70Var.f - 1);
        if (i70Var.h == null && !i70Var.e.e() && i70Var.h() <= 2) {
            m70Var.s.e(false, true);
        }
        i70Var.l();
    }

    @Override // org.telegram.ui.Components.fw0
    public void g(int i10) {
        Utilities.Callback callback = ((y51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.gf0
    public void j(int i10, int i11) {
        uf0 uf0Var = ((tf0) this.b).d;
        if (i10 == uf0Var.b) {
            uf0Var.G = i11;
        } else if (i10 == uf0Var.r) {
            uf0Var.P = i11;
        } else if (i10 == uf0Var.d) {
            uf0Var.I = i11;
        } else if (i10 == uf0Var.c) {
            uf0Var.H = i11;
        } else if (i10 == uf0Var.f) {
            uf0Var.J = i11;
        } else if (i10 == uf0Var.e) {
            uf0Var.K = i11;
        } else if (i10 == uf0Var.v) {
            uf0Var.R = i11;
        } else if (i10 == uf0Var.s) {
            uf0Var.Q = i11;
        } else if (i10 == uf0Var.w) {
            uf0Var.S = i11;
        } else if (i10 == uf0Var.x) {
            uf0Var.U = i11;
        } else if (i10 == uf0Var.h) {
            uf0Var.L = i11;
        } else if (i10 == uf0Var.n) {
            uf0Var.M = i11;
        }
        vz vzVar = uf0Var.l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        uf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((bz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((wm) this.b).run();
                break;
            case 5:
                ((n20) this.b).n();
                break;
            case 7:
                m70.Q((m70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                ky0 ky0Var = (ky0) this.b;
                ky0Var.e.presentFragment(new StickersActivity(ky0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((my0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        tv.P((tv) this.b, i10);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ai.l9 storiesController;
        ai.l9 storiesController2;
        switch (this.a) {
            case 20:
                final lv0 lv0Var = ((fs0) this.b).d;
                storiesController = lv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(lv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ds0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 7;
                        lv0 lv0Var2 = lv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = lv0.d2;
                                AndroidUtilities.runOnUIThread(new yn0(i12, lv0Var2, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = lv0.d2;
                                AndroidUtilities.runOnUIThread(new yn0(i12, lv0Var2, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final lv0 lv0Var2 = ((pt0) this.b).d;
                storiesController2 = lv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(lv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ds0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 7;
                        lv0 lv0Var22 = lv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = lv0.d2;
                                AndroidUtilities.runOnUIThread(new yn0(i12, lv0Var22, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = lv0.d2;
                                AndroidUtilities.runOnUIThread(new yn0(i12, lv0Var22, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                w41 w41Var = (w41) this.b;
                w41Var.e0 = str;
                w41Var.j0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.oy
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        no0 no0Var = (no0) this.b;
        int i12 = no0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = no0Var.A0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.p10) it.next()));
        }
        hashMap.clear();
        no0Var.R(false);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(i12).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                if (charSequence != null) {
                    j3 = j10;
                    AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j3 = j10;
                }
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j3, false, false, true, 0, 0L);
            }
            uyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i14 = a4.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j11)) {
            i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
        } else {
            if (DialogObject.isUserDialog(j11)) {
                i14.putLong("user_id", j11);
            } else {
                i14.putLong("chat_id", -j11);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, uyVar)) {
                return true;
            }
        }
        org.telegram.ui.zn znVar = new org.telegram.ui.zn(i14);
        uyVar.presentFragment(znVar, true);
        znVar.Ab(arrayList2);
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
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
                ky kyVar = (ky) this.b;
                y51 y51Var = (y51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                fy fyVar = kyVar.c;
                kz kzVar = kyVar.F;
                Object obj6 = y51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar = (dy) y51Var.H;
                    long j3 = kyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        kyVar.d = 0L;
                        stickerSet = null;
                        childCount = fyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            nh.c cVar = (nh.c) fyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (kyVar.d != 0 && kyVar.f.size() < kyVar.e.count && (stickerSet2 = MediaDataController.getInstance(kzVar.c1).getStickerSet(kyVar.e, false)) != null) {
                            kyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) y51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = kzVar.L;
                        le.b bVar2 = kzVar.b;
                        arrayList = kyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) kyVar.f.get(0);
                        }
                        kzVar.J(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((nh.c) view).a(kyVar.d == 0, true);
                        bVar2.a(kyVar.d != 0, true);
                        kyVar.l();
                        kzVar.V.b();
                        if (kyVar.d == 0) {
                            fyVar.J1(view);
                            break;
                        }
                    } else {
                        kyVar.d = j10;
                        kyVar.f = dyVar.d;
                        kyVar.e = stickerSet;
                        childCount = fyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (kyVar.d != 0) {
                            kyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) y51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar3 = kzVar.L;
                        le.b bVar22 = kzVar.b;
                        arrayList = kyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) kyVar.f.get(0);
                        }
                        kzVar.J(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((nh.c) view).a(kyVar.d == 0, true);
                        bVar22.a(kyVar.d != 0, true);
                        kyVar.l();
                        kzVar.V.b();
                        if (kyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = kyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            kyVar.d = 0L;
                        } else {
                            kyVar.d = j12;
                            kyVar.f = tL_messages_stickerSet.documents;
                            kyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = fyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (kyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) y51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar32 = kzVar.L;
                            le.b bVar222 = kzVar.b;
                            arrayList = kyVar.f;
                            if (arrayList != null) {
                            }
                            kzVar.J(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((nh.c) view).a(kyVar.d == 0, true);
                            bVar222.a(kyVar.d != 0, true);
                            kyVar.l();
                            kzVar.V.b();
                            if (kyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = fyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (kyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) y51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar322 = kzVar.L;
                    le.b bVar2222 = kzVar.b;
                    arrayList = kyVar.f;
                    if (arrayList != null) {
                    }
                    kzVar.J(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((nh.c) view).a(kyVar.d == 0, true);
                    bVar2222.a(kyVar.d != 0, true);
                    kyVar.l();
                    kzVar.V.b();
                    if (kyVar.d == 0) {
                    }
                }
                break;
            case 3:
                fz fzVar = (fz) this.b;
                y51 y51Var2 = (y51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ez ezVar = fzVar.c;
                kz kzVar2 = fzVar.Q;
                Object obj7 = y51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar2 = (dy) y51Var2.H;
                    long j13 = fzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        fzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = ezVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            nh.c cVar2 = (nh.c) ezVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (fzVar.d != 0 && fzVar.f.size() < fzVar.e.count && (stickerSet4 = MediaDataController.getInstance(kzVar2.c1).getStickerSet(fzVar.e, false)) != null) {
                            fzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) y51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        nh.b bVar4 = kzVar2.N;
                        le.b bVar5 = kzVar2.a;
                        arrayList2 = fzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) fzVar.f.get(0);
                        }
                        kzVar2.J(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((nh.c) view2).a(fzVar.d == 0, true);
                        bVar5.a(fzVar.d != 0, true);
                        fzVar.l();
                        kzVar2.G0.b();
                        if (fzVar.d == 0) {
                            ezVar.J1(view2);
                            break;
                        }
                    } else {
                        fzVar.d = j14;
                        fzVar.f = dyVar2.d;
                        fzVar.e = stickerSet3;
                        childCount2 = ezVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (fzVar.d != 0) {
                            fzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) y51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        nh.b bVar42 = kzVar2.N;
                        le.b bVar52 = kzVar2.a;
                        arrayList2 = fzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) fzVar.f.get(0);
                        }
                        kzVar2.J(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((nh.c) view2).a(fzVar.d == 0, true);
                        bVar52.a(fzVar.d != 0, true);
                        fzVar.l();
                        kzVar2.G0.b();
                        if (fzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = fzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            fzVar.d = 0L;
                        } else {
                            fzVar.d = j16;
                            fzVar.f = tL_messages_stickerSet2.documents;
                            fzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = ezVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (fzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) y51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            nh.b bVar422 = kzVar2.N;
                            le.b bVar522 = kzVar2.a;
                            arrayList2 = fzVar.f;
                            if (arrayList2 != null) {
                            }
                            kzVar2.J(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((nh.c) view2).a(fzVar.d == 0, true);
                            bVar522.a(fzVar.d != 0, true);
                            fzVar.l();
                            kzVar2.G0.b();
                            if (fzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = ezVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (fzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) y51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    nh.b bVar4222 = kzVar2.N;
                    le.b bVar5222 = kzVar2.a;
                    arrayList2 = fzVar.f;
                    if (arrayList2 != null) {
                    }
                    kzVar2.J(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((nh.c) view2).a(fzVar.d == 0, true);
                    bVar5222.a(fzVar.d != 0, true);
                    fzVar.l();
                    kzVar2.G0.b();
                    if (fzVar.d == 0) {
                    }
                }
                break;
            case 12:
                lh0 lh0Var = (lh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((y51) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.zn znVar = new org.telegram.ui.zn(bundle);
                    org.telegram.ui.uy uyVar = lh0Var.a;
                    org.telegram.ui.uy.d4(znVar, messageObject);
                    uyVar.presentFragment(znVar);
                    break;
                }
                break;
            case 16:
                yl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((yl0) this.b).p2);
                break;
            default:
                yl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((u61) this.b).p2);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ void O(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.fw0
    public /* synthetic */ void l() {
    }
}
