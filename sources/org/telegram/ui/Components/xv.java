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
import org.telegram.ui.lg1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, v90, uf0, cm0, org.telegram.ui.sy, bi.f9, MessagesStorage.StringCallback, m91, LanguageDetector.StringCallback, rw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(org.telegram.ui.yy yyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        pk0 pk0Var;
        switch (this.a) {
            case 15:
                qk0 qk0Var = (qk0) this.b;
                ArrayList arrayList = qk0Var.n;
                if (qk0Var.f.j(i10) != 0 || (pk0Var = qk0Var.F) == null) {
                    return true;
                }
                pk0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                yn0 yn0Var = (yn0) this.b;
                xn0 xn0Var = yn0Var.c;
                MessageObject E = xn0Var.E(i10);
                yn0 yn0Var2 = xn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!yn0Var.I.g()) {
                    yn0Var.I.a();
                    xn0Var.q(0, yn0Var2.r);
                }
                if (yn0Var.I.g()) {
                    yn0Var.I.d(E, view, 0);
                    if (!yn0Var.I.g()) {
                        xn0Var.q(0, yn0Var2.r);
                    }
                    org.telegram.ui.u10 u10Var = yn0Var.J;
                    int id2 = E.getId();
                    u10Var.a = E.getDialogId();
                    u10Var.b = id2;
                }
                return true;
        }
    }

    @Override // bi.f9
    public void b(boolean z10) {
        bi.o8 o8Var = (bi.o8) this.b;
        if (z10) {
            o8Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.v90
    public void d() {
        ((ze0) this.b).r(true);
    }

    @Override // org.telegram.ui.Components.m91
    public void e(int i10, int i11) {
        ow0 ow0Var = (ow0) this.b;
        ow0Var.w = i10;
        ow0Var.x = i11;
        di.ab abVar = ow0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public void f(int i10) {
        Utilities.Callback callback = ((l61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((mz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((org.telegram.ui.gm) this.b).run();
                break;
            case 5:
                ((a30) this.b).o();
                break;
            case 7:
                a80.R((a80) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                vy0 vy0Var = (vy0) this.b;
                vy0Var.e.presentFragment(new StickersActivity(vy0Var.d, null));
                a2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((wy0) this.b);
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uf0
    public void j(int i10, int i11) {
        ig0 ig0Var = ((hg0) this.b).d;
        if (i10 == ig0Var.b) {
            ig0Var.G = i11;
        } else if (i10 == ig0Var.r) {
            ig0Var.P = i11;
        } else if (i10 == ig0Var.d) {
            ig0Var.I = i11;
        } else if (i10 == ig0Var.c) {
            ig0Var.H = i11;
        } else if (i10 == ig0Var.f) {
            ig0Var.J = i11;
        } else if (i10 == ig0Var.e) {
            ig0Var.K = i11;
        } else if (i10 == ig0Var.v) {
            ig0Var.R = i11;
        } else if (i10 == ig0Var.s) {
            ig0Var.Q = i11;
        } else if (i10 == ig0Var.w) {
            ig0Var.S = i11;
        } else if (i10 == ig0Var.x) {
            ig0Var.U = i11;
        } else if (i10 == ig0Var.h) {
            ig0Var.L = i11;
        } else if (i10 == ig0Var.n) {
            ig0Var.M = i11;
        }
        h00 h00Var = ig0Var.l0;
        if (h00Var != null) {
            h00Var.d(true, false, false);
        }
        ig0Var.g();
    }

    @Override // hg.z1
    public /* synthetic */ a0.h j0() {
        return null;
    }

    @Override // hg.z1
    public void k(int i10) {
        w70 w70Var = (w70) this.b;
        a80 a80Var = w70Var.n;
        a80Var.K(w70Var.f - 1);
        if (w70Var.h == null && !w70Var.e.e() && w70Var.h() <= 2) {
            a80Var.s.e(false, true);
        }
        w70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
        ew.Q((ew) this.b, i10);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        bi.x8 storiesController;
        bi.x8 storiesController2;
        switch (this.a) {
            case 20:
                final xv0 xv0Var = ((rs0) this.b).d;
                storiesController = xv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(xv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ps0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 24;
                        xv0 xv0Var2 = xv0Var;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = xv0.d2;
                                AndroidUtilities.runOnUIThread(new f60(i12, xv0Var2, p8Var), 100L);
                                break;
                            default:
                                int[] iArr2 = xv0.d2;
                                AndroidUtilities.runOnUIThread(new f60(i12, xv0Var2, p8Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final xv0 xv0Var2 = ((bu0) this.b).d;
                storiesController2 = xv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(xv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ps0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 24;
                        xv0 xv0Var22 = xv0Var2;
                        bi.p8 p8Var = (bi.p8) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = xv0.d2;
                                AndroidUtilities.runOnUIThread(new f60(i12, xv0Var22, p8Var), 100L);
                                break;
                            default:
                                int[] iArr2 = xv0.d2;
                                AndroidUtilities.runOnUIThread(new f60(i12, xv0Var22, p8Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                i51 i51Var = (i51) this.b;
                i51Var.e0 = str;
                i51Var.j0.N(true);
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ boolean t0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.sy
    public boolean w(org.telegram.ui.yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        long j10;
        zo0 zo0Var = (zo0) this.b;
        int i12 = zo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = zo0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.u10) it.next()));
        }
        hashMap.clear();
        zo0Var.Q(false);
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
            yyVar.finishFragment();
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
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, yyVar)) {
                return true;
            }
        }
        org.telegram.ui.fo foVar = new org.telegram.ui.fo(h);
        yyVar.presentFragment(foVar, true);
        foVar.Eb(arrayList2);
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
                vy vyVar = (vy) this.b;
                l61 l61Var = (l61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qy qyVar = vyVar.c;
                wz wzVar = vyVar.F;
                Object obj6 = l61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    oy oyVar = (oy) l61Var.H;
                    long j10 = vyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        vyVar.d = 0L;
                        stickerSet = null;
                        childCount = qyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            oh.c cVar = (oh.c) qyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (vyVar.d != 0 && vyVar.f.size() < vyVar.e.count && (stickerSet2 = MediaDataController.getInstance(wzVar.c1).getStickerSet(vyVar.e, false)) != null) {
                            vyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) l61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        oh.b bVar = wzVar.L;
                        ne.b bVar2 = wzVar.b;
                        arrayList = vyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) vyVar.f.get(0);
                        }
                        wzVar.J(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((oh.c) view).a(vyVar.d == 0, true);
                        bVar2.a(vyVar.d != 0, true);
                        vyVar.l();
                        wzVar.V.b();
                        if (vyVar.d == 0) {
                            qyVar.J1(view);
                            break;
                        }
                    } else {
                        vyVar.d = j11;
                        vyVar.f = oyVar.d;
                        vyVar.e = stickerSet;
                        childCount = qyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (vyVar.d != 0) {
                            vyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) l61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        oh.b bVar3 = wzVar.L;
                        ne.b bVar22 = wzVar.b;
                        arrayList = vyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) vyVar.f.get(0);
                        }
                        wzVar.J(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((oh.c) view).a(vyVar.d == 0, true);
                        bVar22.a(vyVar.d != 0, true);
                        vyVar.l();
                        wzVar.V.b();
                        if (vyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = vyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            vyVar.d = 0L;
                        } else {
                            vyVar.d = j13;
                            vyVar.f = tL_messages_stickerSet.documents;
                            vyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = qyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (vyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) l61Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            oh.b bVar32 = wzVar.L;
                            ne.b bVar222 = wzVar.b;
                            arrayList = vyVar.f;
                            if (arrayList != null) {
                            }
                            wzVar.J(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((oh.c) view).a(vyVar.d == 0, true);
                            bVar222.a(vyVar.d != 0, true);
                            vyVar.l();
                            wzVar.V.b();
                            if (vyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = qyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (vyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) l61Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    oh.b bVar322 = wzVar.L;
                    ne.b bVar2222 = wzVar.b;
                    arrayList = vyVar.f;
                    if (arrayList != null) {
                    }
                    wzVar.J(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((oh.c) view).a(vyVar.d == 0, true);
                    bVar2222.a(vyVar.d != 0, true);
                    vyVar.l();
                    wzVar.V.b();
                    if (vyVar.d == 0) {
                    }
                }
                break;
            case 3:
                rz rzVar = (rz) this.b;
                l61 l61Var2 = (l61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qz qzVar = rzVar.c;
                wz wzVar2 = rzVar.Q;
                Object obj7 = l61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    oy oyVar2 = (oy) l61Var2.H;
                    long j14 = rzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        rzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = qzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            oh.c cVar2 = (oh.c) qzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (rzVar.d != 0 && rzVar.f.size() < rzVar.e.count && (stickerSet4 = MediaDataController.getInstance(wzVar2.c1).getStickerSet(rzVar.e, false)) != null) {
                            rzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) l61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        oh.b bVar4 = wzVar2.N;
                        ne.b bVar5 = wzVar2.a;
                        arrayList2 = rzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) rzVar.f.get(0);
                        }
                        wzVar2.J(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((oh.c) view2).a(rzVar.d == 0, true);
                        bVar5.a(rzVar.d != 0, true);
                        rzVar.l();
                        wzVar2.G0.b();
                        if (rzVar.d == 0) {
                            qzVar.J1(view2);
                            break;
                        }
                    } else {
                        rzVar.d = j15;
                        rzVar.f = oyVar2.d;
                        rzVar.e = stickerSet3;
                        childCount2 = qzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (rzVar.d != 0) {
                            rzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) l61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        oh.b bVar42 = wzVar2.N;
                        ne.b bVar52 = wzVar2.a;
                        arrayList2 = rzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) rzVar.f.get(0);
                        }
                        wzVar2.J(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((oh.c) view2).a(rzVar.d == 0, true);
                        bVar52.a(rzVar.d != 0, true);
                        rzVar.l();
                        wzVar2.G0.b();
                        if (rzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = rzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            rzVar.d = 0L;
                        } else {
                            rzVar.d = j17;
                            rzVar.f = tL_messages_stickerSet2.documents;
                            rzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = qzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (rzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) l61Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            oh.b bVar422 = wzVar2.N;
                            ne.b bVar522 = wzVar2.a;
                            arrayList2 = rzVar.f;
                            if (arrayList2 != null) {
                            }
                            wzVar2.J(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((oh.c) view2).a(rzVar.d == 0, true);
                            bVar522.a(rzVar.d != 0, true);
                            rzVar.l();
                            wzVar2.G0.b();
                            if (rzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = qzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (rzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) l61Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    oh.b bVar4222 = wzVar2.N;
                    ne.b bVar5222 = wzVar2.a;
                    arrayList2 = rzVar.f;
                    if (arrayList2 != null) {
                    }
                    wzVar2.J(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((oh.c) view2).a(rzVar.d == 0, true);
                    bVar5222.a(rzVar.d != 0, true);
                    rzVar.l();
                    wzVar2.G0.b();
                    if (rzVar.d == 0) {
                    }
                }
                break;
            case 12:
                zh0 zh0Var = (zh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((l61) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.fo foVar = new org.telegram.ui.fo(bundle);
                    org.telegram.ui.yy yyVar = zh0Var.a;
                    org.telegram.ui.yy.a4(foVar, messageObject);
                    yyVar.presentFragment(foVar);
                    break;
                }
                break;
            case 16:
                mm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((mm0) this.b).n2);
                break;
            default:
                mm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((h71) this.b).n2);
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ void I0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }
}
