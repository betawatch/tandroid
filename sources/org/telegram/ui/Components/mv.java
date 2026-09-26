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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, f90, ff0, ml0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, y81, LanguageDetector.StringCallback, dw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mv(Object obj, int i10) {
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
        i70 i70Var = (i70) this.b;
        m70 m70Var = i70Var.n;
        m70Var.J(i70Var.f - 1);
        if (i70Var.h == null && !i70Var.e.e() && i70Var.h() <= 2) {
            m70Var.s.e(false, true);
        }
        i70Var.l();
    }

    @Override // ai.t9
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        zj0 zj0Var;
        switch (this.a) {
            case 15:
                ak0 ak0Var = (ak0) this.b;
                ArrayList arrayList = ak0Var.n;
                if (ak0Var.f.j(i10) != 0 || (zj0Var = ak0Var.F) == null) {
                    return true;
                }
                zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                in0 in0Var = (in0) this.b;
                hn0 hn0Var = in0Var.c;
                MessageObject E = hn0Var.E(i10);
                in0 in0Var2 = hn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!in0Var.I.g()) {
                    in0Var.I.a();
                    hn0Var.q(0, in0Var2.r);
                }
                if (in0Var.I.g()) {
                    in0Var.I.e(E, view, 0);
                    if (!in0Var.I.g()) {
                        hn0Var.q(0, in0Var2.r);
                    }
                    org.telegram.ui.l10 l10Var = in0Var.J;
                    int id2 = E.getId();
                    l10Var.a = E.getDialogId();
                    l10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.f90
    public void e() {
        ((ke0) this.b).p(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((cz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((xm) this.b).run();
                break;
            case 5:
                ((o20) this.b).n();
                break;
            case 7:
                m70.Q((m70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                hy0 hy0Var = (hy0) this.b;
                hy0Var.e.presentFragment(new StickersActivity(hy0Var.d, null));
                a2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((jy0) this.b);
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public void g(int i10, int i11) {
        aw0 aw0Var = (aw0) this.b;
        aw0Var.w = i10;
        aw0Var.x = i11;
        ci.bb bbVar = aw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        Utilities.Callback callback = ((v51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // org.telegram.ui.Components.ff0
    public void l(int i10, int i11) {
        tf0 tf0Var = ((sf0) this.b).d;
        if (i10 == tf0Var.b) {
            tf0Var.G = i11;
        } else if (i10 == tf0Var.r) {
            tf0Var.P = i11;
        } else if (i10 == tf0Var.d) {
            tf0Var.I = i11;
        } else if (i10 == tf0Var.c) {
            tf0Var.H = i11;
        } else if (i10 == tf0Var.f) {
            tf0Var.J = i11;
        } else if (i10 == tf0Var.e) {
            tf0Var.K = i11;
        } else if (i10 == tf0Var.v) {
            tf0Var.R = i11;
        } else if (i10 == tf0Var.s) {
            tf0Var.Q = i11;
        } else if (i10 == tf0Var.w) {
            tf0Var.S = i11;
        } else if (i10 == tf0Var.x) {
            tf0Var.U = i11;
        } else if (i10 == tf0Var.h) {
            tf0Var.L = i11;
        } else if (i10 == tf0Var.n) {
            tf0Var.M = i11;
        }
        wz wzVar = tf0Var.l0;
        if (wzVar != null) {
            wzVar.e(true, false, false);
        }
        tf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        tv.P((tv) this.b, i10);
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
                final jv0 jv0Var = ((ds0) this.b).d;
                storiesController = jv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(jv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.bs0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 6;
                        jv0 jv0Var2 = jv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = jv0.d2;
                                AndroidUtilities.runOnUIThread(new wn0(i12, jv0Var2, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = jv0.d2;
                                AndroidUtilities.runOnUIThread(new wn0(i12, jv0Var2, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final jv0 jv0Var2 = ((nt0) this.b).d;
                storiesController2 = jv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(jv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.bs0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 6;
                        jv0 jv0Var22 = jv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = jv0.d2;
                                AndroidUtilities.runOnUIThread(new wn0(i12, jv0Var22, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = jv0.d2;
                                AndroidUtilities.runOnUIThread(new wn0(i12, jv0Var22, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                t41 t41Var = (t41) this.b;
                t41Var.e0 = str;
                t41Var.j0.N(true);
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
        lo0 lo0Var = (lo0) this.b;
        int i12 = lo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = lo0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.l10) it.next()));
        }
        hashMap.clear();
        lo0Var.Q(false);
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
                ly lyVar = (ly) this.b;
                v51 v51Var = (v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                gy gyVar = lyVar.c;
                lz lzVar = lyVar.F;
                Object obj6 = v51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    ey eyVar = (ey) v51Var.H;
                    long j3 = lyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        lyVar.d = 0L;
                        stickerSet = null;
                        childCount = gyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            nh.c cVar = (nh.c) gyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (lyVar.d != 0 && lyVar.f.size() < lyVar.e.count && (stickerSet2 = MediaDataController.getInstance(lzVar.c1).getStickerSet(lyVar.e, false)) != null) {
                            lyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) v51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = lzVar.L;
                        le.c cVar2 = lzVar.b;
                        arrayList = lyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        lzVar.J(bVar, tLObject, stickerSet5, document, true, cVar2.e <= 0.0f);
                        ((nh.c) view).a(lyVar.d == 0, true);
                        cVar2.a(lyVar.d != 0, true);
                        lyVar.l();
                        lzVar.V.b();
                        if (lyVar.d == 0) {
                            gyVar.I1(view);
                            break;
                        }
                    } else {
                        lyVar.d = j10;
                        lyVar.f = eyVar.d;
                        lyVar.e = stickerSet;
                        childCount = gyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (lyVar.d != 0) {
                            lyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) v51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar2 = lzVar.L;
                        le.c cVar22 = lzVar.b;
                        arrayList = lyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        lzVar.J(bVar2, tLObject2, stickerSet52, document, true, cVar22.e <= 0.0f);
                        ((nh.c) view).a(lyVar.d == 0, true);
                        cVar22.a(lyVar.d != 0, true);
                        lyVar.l();
                        lzVar.V.b();
                        if (lyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = lyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            lyVar.d = 0L;
                        } else {
                            lyVar.d = j12;
                            lyVar.f = tL_messages_stickerSet.documents;
                            lyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = gyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (lyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) v51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar22 = lzVar.L;
                            le.c cVar222 = lzVar.b;
                            arrayList = lyVar.f;
                            if (arrayList != null) {
                            }
                            lzVar.J(bVar22, tLObject22, stickerSet522, document, true, cVar222.e <= 0.0f);
                            ((nh.c) view).a(lyVar.d == 0, true);
                            cVar222.a(lyVar.d != 0, true);
                            lyVar.l();
                            lzVar.V.b();
                            if (lyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = gyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (lyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) v51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar222 = lzVar.L;
                    le.c cVar2222 = lzVar.b;
                    arrayList = lyVar.f;
                    if (arrayList != null) {
                    }
                    lzVar.J(bVar222, tLObject222, stickerSet5222, document, true, cVar2222.e <= 0.0f);
                    ((nh.c) view).a(lyVar.d == 0, true);
                    cVar2222.a(lyVar.d != 0, true);
                    lyVar.l();
                    lzVar.V.b();
                    if (lyVar.d == 0) {
                    }
                }
                break;
            case 3:
                gz gzVar = (gz) this.b;
                v51 v51Var2 = (v51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                fz fzVar = gzVar.c;
                lz lzVar2 = gzVar.Q;
                Object obj7 = v51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    ey eyVar2 = (ey) v51Var2.H;
                    long j13 = gzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        gzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = fzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            nh.c cVar3 = (nh.c) fzVar.getChildAt(i11);
                            if (cVar3 != view2) {
                                cVar3.a(false, true);
                            }
                        }
                        if (gzVar.d != 0 && gzVar.f.size() < gzVar.e.count && (stickerSet4 = MediaDataController.getInstance(lzVar2.c1).getStickerSet(gzVar.e, false)) != null) {
                            gzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) v51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        nh.b bVar3 = lzVar2.N;
                        le.c cVar4 = lzVar2.a;
                        arrayList2 = gzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) gzVar.f.get(0);
                        }
                        lzVar2.J(bVar3, tLObject3, stickerSet7, document2, false, cVar4.e <= 0.0f);
                        ((nh.c) view2).a(gzVar.d == 0, true);
                        cVar4.a(gzVar.d != 0, true);
                        gzVar.l();
                        lzVar2.G0.b();
                        if (gzVar.d == 0) {
                            fzVar.I1(view2);
                            break;
                        }
                    } else {
                        gzVar.d = j14;
                        gzVar.f = eyVar2.d;
                        gzVar.e = stickerSet3;
                        childCount2 = fzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (gzVar.d != 0) {
                            gzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) v51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        nh.b bVar32 = lzVar2.N;
                        le.c cVar42 = lzVar2.a;
                        arrayList2 = gzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) gzVar.f.get(0);
                        }
                        lzVar2.J(bVar32, tLObject32, stickerSet72, document2, false, cVar42.e <= 0.0f);
                        ((nh.c) view2).a(gzVar.d == 0, true);
                        cVar42.a(gzVar.d != 0, true);
                        gzVar.l();
                        lzVar2.G0.b();
                        if (gzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = gzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            gzVar.d = 0L;
                        } else {
                            gzVar.d = j16;
                            gzVar.f = tL_messages_stickerSet2.documents;
                            gzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = fzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (gzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) v51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            nh.b bVar322 = lzVar2.N;
                            le.c cVar422 = lzVar2.a;
                            arrayList2 = gzVar.f;
                            if (arrayList2 != null) {
                            }
                            lzVar2.J(bVar322, tLObject322, stickerSet722, document2, false, cVar422.e <= 0.0f);
                            ((nh.c) view2).a(gzVar.d == 0, true);
                            cVar422.a(gzVar.d != 0, true);
                            gzVar.l();
                            lzVar2.G0.b();
                            if (gzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = fzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (gzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) v51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    nh.b bVar3222 = lzVar2.N;
                    le.c cVar4222 = lzVar2.a;
                    arrayList2 = gzVar.f;
                    if (arrayList2 != null) {
                    }
                    lzVar2.J(bVar3222, tLObject3222, stickerSet7222, document2, false, cVar4222.e <= 0.0f);
                    ((nh.c) view2).a(gzVar.d == 0, true);
                    cVar4222.a(gzVar.d != 0, true);
                    gzVar.l();
                    lzVar2.G0.b();
                    if (gzVar.d == 0) {
                    }
                }
                break;
            case 12:
                jh0 jh0Var = (jh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((v51) obj).G;
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
                    org.telegram.ui.qy qyVar = jh0Var.a;
                    org.telegram.ui.qy.d4(wnVar, messageObject);
                    qyVar.presentFragment(wnVar);
                    break;
                }
                break;
            case 16:
                wl0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((wl0) this.b).p2);
                break;
            default:
                wl0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((r61) this.b).p2);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.f90
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void n() {
    }
}
