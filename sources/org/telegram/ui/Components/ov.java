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
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, h90, hf0, ol0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, a91, LanguageDetector.StringCallback, fw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override // gg.b2
    public void a(int i10) {
        k70 k70Var = (k70) this.b;
        o70 o70Var = k70Var.n;
        o70Var.J(k70Var.f - 1);
        if (k70Var.h == null && !k70Var.e.e() && k70Var.h() <= 2) {
            o70Var.s.e(false, true);
        }
        k70Var.l();
    }

    @Override // ai.t9
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.b;
        if (z10) {
            d9Var.p(30, false);
        }
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
                    org.telegram.ui.l10 l10Var = kn0Var.J;
                    int id2 = E.getId();
                    l10Var.a = E.getDialogId();
                    l10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.h90
    public void e() {
        ((me0) this.b).p(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((dz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((ym) this.b).run();
                break;
            case 5:
                ((q20) this.b).n();
                break;
            case 7:
                o70.Q((o70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                jy0 jy0Var = (jy0) this.b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                a2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.b);
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.a91
    public void g(int i10, int i11) {
        cw0 cw0Var = (cw0) this.b;
        cw0Var.w = i10;
        cw0Var.x = i11;
        ci.bb bbVar = cw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public void h(int i10) {
        Utilities.Callback callback = ((x51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // org.telegram.ui.Components.hf0
    public void l(int i10, int i11) {
        vf0 vf0Var = ((uf0) this.b).d;
        if (i10 == vf0Var.b) {
            vf0Var.G = i11;
        } else if (i10 == vf0Var.r) {
            vf0Var.P = i11;
        } else if (i10 == vf0Var.d) {
            vf0Var.I = i11;
        } else if (i10 == vf0Var.c) {
            vf0Var.H = i11;
        } else if (i10 == vf0Var.f) {
            vf0Var.J = i11;
        } else if (i10 == vf0Var.e) {
            vf0Var.K = i11;
        } else if (i10 == vf0Var.v) {
            vf0Var.R = i11;
        } else if (i10 == vf0Var.s) {
            vf0Var.Q = i11;
        } else if (i10 == vf0Var.w) {
            vf0Var.S = i11;
        } else if (i10 == vf0Var.x) {
            vf0Var.U = i11;
        } else if (i10 == vf0Var.h) {
            vf0Var.L = i11;
        } else if (i10 == vf0Var.n) {
            vf0Var.M = i11;
        }
        xz xzVar = vf0Var.l0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        vf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        vv.P((vv) this.b, i10);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
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
                v41 v41Var = (v41) this.b;
                v41Var.e0 = str;
                v41Var.j0.N(true);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ky
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        no0 no0Var = (no0) this.b;
        int i12 = no0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = no0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.l10) it.next()));
        }
        hashMap.clear();
        no0Var.Q(false);
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
            qyVar.finishFragment();
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
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, qyVar)) {
                return true;
            }
        }
        org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i14);
        qyVar.presentFragment(wnVar, true);
        wnVar.Ab(arrayList2);
        return true;
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
                my myVar = (my) this.b;
                x51 x51Var = (x51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hy hyVar = myVar.c;
                mz mzVar = myVar.F;
                Object obj6 = x51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    fy fyVar = (fy) x51Var.H;
                    long j3 = myVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        myVar.d = 0L;
                        stickerSet = null;
                        childCount = hyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            nh.c cVar = (nh.c) hyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (myVar.d != 0 && myVar.f.size() < myVar.e.count && (stickerSet2 = MediaDataController.getInstance(mzVar.c1).getStickerSet(myVar.e, false)) != null) {
                            myVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) x51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = mzVar.L;
                        le.c cVar2 = mzVar.b;
                        arrayList = myVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) myVar.f.get(0);
                        }
                        mzVar.J(bVar, tLObject, stickerSet5, document, true, cVar2.e <= 0.0f);
                        ((nh.c) view).a(myVar.d == 0, true);
                        cVar2.a(myVar.d != 0, true);
                        myVar.l();
                        mzVar.V.b();
                        if (myVar.d == 0) {
                            hyVar.I1(view);
                            break;
                        }
                    } else {
                        myVar.d = j10;
                        myVar.f = fyVar.d;
                        myVar.e = stickerSet;
                        childCount = hyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (myVar.d != 0) {
                            myVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) x51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar2 = mzVar.L;
                        le.c cVar22 = mzVar.b;
                        arrayList = myVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) myVar.f.get(0);
                        }
                        mzVar.J(bVar2, tLObject2, stickerSet52, document, true, cVar22.e <= 0.0f);
                        ((nh.c) view).a(myVar.d == 0, true);
                        cVar22.a(myVar.d != 0, true);
                        myVar.l();
                        mzVar.V.b();
                        if (myVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = myVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            myVar.d = 0L;
                        } else {
                            myVar.d = j12;
                            myVar.f = tL_messages_stickerSet.documents;
                            myVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = hyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (myVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) x51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar22 = mzVar.L;
                            le.c cVar222 = mzVar.b;
                            arrayList = myVar.f;
                            if (arrayList != null) {
                            }
                            mzVar.J(bVar22, tLObject22, stickerSet522, document, true, cVar222.e <= 0.0f);
                            ((nh.c) view).a(myVar.d == 0, true);
                            cVar222.a(myVar.d != 0, true);
                            myVar.l();
                            mzVar.V.b();
                            if (myVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = hyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (myVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) x51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar222 = mzVar.L;
                    le.c cVar2222 = mzVar.b;
                    arrayList = myVar.f;
                    if (arrayList != null) {
                    }
                    mzVar.J(bVar222, tLObject222, stickerSet5222, document, true, cVar2222.e <= 0.0f);
                    ((nh.c) view).a(myVar.d == 0, true);
                    cVar2222.a(myVar.d != 0, true);
                    myVar.l();
                    mzVar.V.b();
                    if (myVar.d == 0) {
                    }
                }
                break;
            case 3:
                hz hzVar = (hz) this.b;
                x51 x51Var2 = (x51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                gz gzVar = hzVar.c;
                mz mzVar2 = hzVar.Q;
                Object obj7 = x51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    fy fyVar2 = (fy) x51Var2.H;
                    long j13 = hzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        hzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = gzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            nh.c cVar3 = (nh.c) gzVar.getChildAt(i11);
                            if (cVar3 != view2) {
                                cVar3.a(false, true);
                            }
                        }
                        if (hzVar.d != 0 && hzVar.f.size() < hzVar.e.count && (stickerSet4 = MediaDataController.getInstance(mzVar2.c1).getStickerSet(hzVar.e, false)) != null) {
                            hzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) x51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        nh.b bVar3 = mzVar2.N;
                        le.c cVar4 = mzVar2.a;
                        arrayList2 = hzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) hzVar.f.get(0);
                        }
                        mzVar2.J(bVar3, tLObject3, stickerSet7, document2, false, cVar4.e <= 0.0f);
                        ((nh.c) view2).a(hzVar.d == 0, true);
                        cVar4.a(hzVar.d != 0, true);
                        hzVar.l();
                        mzVar2.G0.b();
                        if (hzVar.d == 0) {
                            gzVar.I1(view2);
                            break;
                        }
                    } else {
                        hzVar.d = j14;
                        hzVar.f = fyVar2.d;
                        hzVar.e = stickerSet3;
                        childCount2 = gzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (hzVar.d != 0) {
                            hzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) x51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        nh.b bVar32 = mzVar2.N;
                        le.c cVar42 = mzVar2.a;
                        arrayList2 = hzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) hzVar.f.get(0);
                        }
                        mzVar2.J(bVar32, tLObject32, stickerSet72, document2, false, cVar42.e <= 0.0f);
                        ((nh.c) view2).a(hzVar.d == 0, true);
                        cVar42.a(hzVar.d != 0, true);
                        hzVar.l();
                        mzVar2.G0.b();
                        if (hzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = hzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            hzVar.d = 0L;
                        } else {
                            hzVar.d = j16;
                            hzVar.f = tL_messages_stickerSet2.documents;
                            hzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = gzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (hzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) x51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            nh.b bVar322 = mzVar2.N;
                            le.c cVar422 = mzVar2.a;
                            arrayList2 = hzVar.f;
                            if (arrayList2 != null) {
                            }
                            mzVar2.J(bVar322, tLObject322, stickerSet722, document2, false, cVar422.e <= 0.0f);
                            ((nh.c) view2).a(hzVar.d == 0, true);
                            cVar422.a(hzVar.d != 0, true);
                            hzVar.l();
                            mzVar2.G0.b();
                            if (hzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = gzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (hzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) x51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    nh.b bVar3222 = mzVar2.N;
                    le.c cVar4222 = mzVar2.a;
                    arrayList2 = hzVar.f;
                    if (arrayList2 != null) {
                    }
                    mzVar2.J(bVar3222, tLObject3222, stickerSet7222, document2, false, cVar4222.e <= 0.0f);
                    ((nh.c) view2).a(hzVar.d == 0, true);
                    cVar4222.a(hzVar.d != 0, true);
                    hzVar.l();
                    mzVar2.G0.b();
                    if (hzVar.d == 0) {
                    }
                }
                break;
            case 12:
                lh0 lh0Var = (lh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((x51) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.wn wnVar = new org.telegram.ui.wn(bundle);
                    org.telegram.ui.qy qyVar = lh0Var.a;
                    org.telegram.ui.qy.d4(wnVar, messageObject);
                    qyVar.presentFragment(wnVar);
                    break;
                }
                break;
            case 16:
                yl0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((yl0) this.b).p2);
                break;
            default:
                yl0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((t61) this.b).p2);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.h90
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.h90
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.h90
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.fw0
    public /* synthetic */ void n() {
    }
}
