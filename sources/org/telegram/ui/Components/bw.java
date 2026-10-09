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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.a2, GenericProvider, w90, wf0, gm0, org.telegram.ui.ny, ai.u9, MessagesStorage.StringCallback, q91, LanguageDetector.StringCallback, vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bw(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean K(org.telegram.ui.ty tyVar) {
        return false;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    @Override // ai.u9
    public void b(boolean z10) {
        ai.e9 e9Var = (ai.e9) this.b;
        if (z10) {
            e9Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.w90
    public void c() {
        ((bf0) this.b).r(true);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        tk0 tk0Var;
        switch (this.a) {
            case 15:
                uk0 uk0Var = (uk0) this.b;
                ArrayList arrayList = uk0Var.n;
                if (uk0Var.f.j(i10) != 0 || (tk0Var = uk0Var.F) == null) {
                    return true;
                }
                tk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                bo0 bo0Var = (bo0) this.b;
                ao0 ao0Var = bo0Var.c;
                MessageObject E = ao0Var.E(i10);
                bo0 bo0Var2 = ao0Var.c;
                if (E == null) {
                    return false;
                }
                if (!bo0Var.I.g()) {
                    bo0Var.I.a();
                    ao0Var.q(0, bo0Var2.r);
                }
                if (bo0Var.I.g()) {
                    bo0Var.I.e(E, view, 0);
                    if (!bo0Var.I.g()) {
                        ao0Var.q(0, bo0Var2.r);
                    }
                    org.telegram.ui.o10 o10Var = bo0Var.J;
                    int id2 = E.getId();
                    o10Var.a = E.getDialogId();
                    o10Var.b = id2;
                }
                return true;
        }
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // org.telegram.ui.Components.q91
    public void e(int i10, int i11) {
        sw0 sw0Var = (sw0) this.b;
        sw0Var.w = i10;
        sw0Var.x = i11;
        ci.bb bbVar = sw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((qz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((zk) this.b).run();
                break;
            case 5:
                ((e30) this.b).p();
                break;
            case 7:
                d80.R((d80) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.e.presentFragment(new StickersActivity(zy0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((az0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public void g(int i10) {
        Utilities.Callback callback = ((p61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // gg.a2
    public void h(int i10) {
        z70 z70Var = (z70) this.b;
        d80 d80Var = z70Var.n;
        d80Var.K(z70Var.f - 1);
        if (z70Var.h == null && !z70Var.e.e() && z70Var.h() <= 2) {
            d80Var.s.e(false, true);
        }
        z70Var.l();
    }

    @Override // org.telegram.ui.Components.wf0
    public void k(int i10, int i11) {
        kg0 kg0Var = ((jg0) this.b).d;
        if (i10 == kg0Var.b) {
            kg0Var.G = i11;
        } else if (i10 == kg0Var.r) {
            kg0Var.P = i11;
        } else if (i10 == kg0Var.d) {
            kg0Var.I = i11;
        } else if (i10 == kg0Var.c) {
            kg0Var.H = i11;
        } else if (i10 == kg0Var.f) {
            kg0Var.J = i11;
        } else if (i10 == kg0Var.e) {
            kg0Var.K = i11;
        } else if (i10 == kg0Var.v) {
            kg0Var.R = i11;
        } else if (i10 == kg0Var.s) {
            kg0Var.Q = i11;
        } else if (i10 == kg0Var.w) {
            kg0Var.S = i11;
        } else if (i10 == kg0Var.x) {
            kg0Var.U = i11;
        } else if (i10 == kg0Var.h) {
            kg0Var.L = i11;
        } else if (i10 == kg0Var.n) {
            kg0Var.M = i11;
        }
        l00 l00Var = kg0Var.l0;
        if (l00Var != null) {
            l00Var.e(true, false, false);
        }
        kg0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        iw.Q((iw) this.b, i10);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ai.m9 storiesController;
        ai.m9 storiesController2;
        switch (this.a) {
            case 20:
                final bw0 bw0Var = ((vs0) this.b).d;
                storiesController = bw0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(bw0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ts0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 13;
                        bw0 bw0Var2 = bw0Var;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = bw0.d2;
                                AndroidUtilities.runOnUIThread(new ci0(i12, bw0Var2, f9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = bw0.d2;
                                AndroidUtilities.runOnUIThread(new ci0(i12, bw0Var2, f9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final bw0 bw0Var2 = ((fu0) this.b).d;
                storiesController2 = bw0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(bw0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ts0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 13;
                        bw0 bw0Var22 = bw0Var2;
                        ai.f9 f9Var = (ai.f9) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = bw0.d2;
                                AndroidUtilities.runOnUIThread(new ci0(i12, bw0Var22, f9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = bw0.d2;
                                AndroidUtilities.runOnUIThread(new ci0(i12, bw0Var22, f9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                m51 m51Var = (m51) this.b;
                m51Var.e0 = str;
                m51Var.j0.N(true);
                break;
        }
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.ny
    public boolean w(org.telegram.ui.ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        dp0 dp0Var = (dp0) this.b;
        int i12 = dp0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = dp0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.o10) it.next()));
        }
        hashMap.clear();
        dp0Var.Q(false);
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
            tyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i14 = a1.g.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j11)) {
            i14.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
        } else {
            if (DialogObject.isUserDialog(j11)) {
                i14.putLong("user_id", j11);
            } else {
                i14.putLong("chat_id", -j11);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, tyVar)) {
                return true;
            }
        }
        org.telegram.ui.zn znVar = new org.telegram.ui.zn(i14);
        tyVar.presentFragment(znVar, true);
        znVar.Eb(arrayList2);
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
                zy zyVar = (zy) this.b;
                p61 p61Var = (p61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                uy uyVar = zyVar.c;
                a00 a00Var = zyVar.F;
                Object obj6 = p61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    sy syVar = (sy) p61Var.H;
                    long j3 = zyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        zyVar.d = 0L;
                        stickerSet = null;
                        childCount = uyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            nh.c cVar = (nh.c) uyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (zyVar.d != 0 && zyVar.f.size() < zyVar.e.count && (stickerSet2 = MediaDataController.getInstance(a00Var.c1).getStickerSet(zyVar.e, false)) != null) {
                            zyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) p61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = a00Var.L;
                        me.b bVar2 = a00Var.b;
                        arrayList = zyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) zyVar.f.get(0);
                        }
                        a00Var.J(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((nh.c) view).a(zyVar.d == 0, true);
                        bVar2.a(zyVar.d != 0, true);
                        zyVar.l();
                        a00Var.V.b();
                        if (zyVar.d == 0) {
                            uyVar.J1(view);
                            break;
                        }
                    } else {
                        zyVar.d = j10;
                        zyVar.f = syVar.d;
                        zyVar.e = stickerSet;
                        childCount = uyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (zyVar.d != 0) {
                            zyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) p61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar3 = a00Var.L;
                        me.b bVar22 = a00Var.b;
                        arrayList = zyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) zyVar.f.get(0);
                        }
                        a00Var.J(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((nh.c) view).a(zyVar.d == 0, true);
                        bVar22.a(zyVar.d != 0, true);
                        zyVar.l();
                        a00Var.V.b();
                        if (zyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = zyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            zyVar.d = 0L;
                        } else {
                            zyVar.d = j12;
                            zyVar.f = tL_messages_stickerSet.documents;
                            zyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = uyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (zyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) p61Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar32 = a00Var.L;
                            me.b bVar222 = a00Var.b;
                            arrayList = zyVar.f;
                            if (arrayList != null) {
                            }
                            a00Var.J(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((nh.c) view).a(zyVar.d == 0, true);
                            bVar222.a(zyVar.d != 0, true);
                            zyVar.l();
                            a00Var.V.b();
                            if (zyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = uyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (zyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) p61Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar322 = a00Var.L;
                    me.b bVar2222 = a00Var.b;
                    arrayList = zyVar.f;
                    if (arrayList != null) {
                    }
                    a00Var.J(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((nh.c) view).a(zyVar.d == 0, true);
                    bVar2222.a(zyVar.d != 0, true);
                    zyVar.l();
                    a00Var.V.b();
                    if (zyVar.d == 0) {
                    }
                }
                break;
            case 3:
                vz vzVar = (vz) this.b;
                p61 p61Var2 = (p61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                uz uzVar = vzVar.c;
                a00 a00Var2 = vzVar.Q;
                Object obj7 = p61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    sy syVar2 = (sy) p61Var2.H;
                    long j13 = vzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        vzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = uzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            nh.c cVar2 = (nh.c) uzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (vzVar.d != 0 && vzVar.f.size() < vzVar.e.count && (stickerSet4 = MediaDataController.getInstance(a00Var2.c1).getStickerSet(vzVar.e, false)) != null) {
                            vzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) p61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        nh.b bVar4 = a00Var2.N;
                        me.b bVar5 = a00Var2.a;
                        arrayList2 = vzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) vzVar.f.get(0);
                        }
                        a00Var2.J(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((nh.c) view2).a(vzVar.d == 0, true);
                        bVar5.a(vzVar.d != 0, true);
                        vzVar.l();
                        a00Var2.G0.b();
                        if (vzVar.d == 0) {
                            uzVar.J1(view2);
                            break;
                        }
                    } else {
                        vzVar.d = j14;
                        vzVar.f = syVar2.d;
                        vzVar.e = stickerSet3;
                        childCount2 = uzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (vzVar.d != 0) {
                            vzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) p61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        nh.b bVar42 = a00Var2.N;
                        me.b bVar52 = a00Var2.a;
                        arrayList2 = vzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) vzVar.f.get(0);
                        }
                        a00Var2.J(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((nh.c) view2).a(vzVar.d == 0, true);
                        bVar52.a(vzVar.d != 0, true);
                        vzVar.l();
                        a00Var2.G0.b();
                        if (vzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = vzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            vzVar.d = 0L;
                        } else {
                            vzVar.d = j16;
                            vzVar.f = tL_messages_stickerSet2.documents;
                            vzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = uzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (vzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) p61Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            nh.b bVar422 = a00Var2.N;
                            me.b bVar522 = a00Var2.a;
                            arrayList2 = vzVar.f;
                            if (arrayList2 != null) {
                            }
                            a00Var2.J(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((nh.c) view2).a(vzVar.d == 0, true);
                            bVar522.a(vzVar.d != 0, true);
                            vzVar.l();
                            a00Var2.G0.b();
                            if (vzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = uzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (vzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) p61Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    nh.b bVar4222 = a00Var2.N;
                    me.b bVar5222 = a00Var2.a;
                    arrayList2 = vzVar.f;
                    if (arrayList2 != null) {
                    }
                    a00Var2.J(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((nh.c) view2).a(vzVar.d == 0, true);
                    bVar5222.a(vzVar.d != 0, true);
                    vzVar.l();
                    a00Var2.G0.b();
                    if (vzVar.d == 0) {
                    }
                }
                break;
            case 12:
                di0 di0Var = (di0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((p61) obj).G;
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
                    org.telegram.ui.ty tyVar = di0Var.a;
                    org.telegram.ui.ty.a4(znVar, messageObject);
                    tyVar.presentFragment(znVar);
                    break;
                }
                break;
            case 16:
                qm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((qm0) this.b).n2);
                break;
            default:
                qm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((k71) this.b).n2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w90
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.w90
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.vw0
    public /* synthetic */ void l() {
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
    }
}
