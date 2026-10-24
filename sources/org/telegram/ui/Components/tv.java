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
import org.telegram.ui.ye1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, q90, sf0, cm0, org.telegram.ui.xx, ci.p7, MessagesStorage.StringCallback, n91, LanguageDetector.StringCallback, rw0 {
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
    public /* synthetic */ a0.h G() {
        return null;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // ci.p7
    public void b(boolean z10) {
        ci.z6 z6Var = (ci.z6) this.b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.q90
    public void c() {
        ((xe0) this.b).q(true);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
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
                xn0 xn0Var = (xn0) this.b;
                wn0 wn0Var = xn0Var.c;
                MessageObject E = wn0Var.E(i10);
                xn0 xn0Var2 = wn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!xn0Var.I.g()) {
                    xn0Var.I.a();
                    wn0Var.q(0, xn0Var2.r);
                }
                if (xn0Var.I.g()) {
                    xn0Var.I.d(E, view, 0);
                    if (!xn0Var.I.g()) {
                        wn0Var.q(0, xn0Var2.r);
                    }
                    org.telegram.ui.a10 a10Var = xn0Var.J;
                    int id2 = E.getId();
                    a10Var.a = E.getDialogId();
                    a10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.n91
    public void e(int i10, int i11) {
        ow0 ow0Var = (ow0) this.b;
        ow0Var.w = i10;
        ow0Var.x = i11;
        ai.jc jcVar = ow0Var.L;
        if (jcVar != null) {
            jcVar.invalidate();
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        t70 t70Var = (t70) this.b;
        x70 x70Var = t70Var.n;
        x70Var.J(t70Var.f - 1);
        if (t70Var.h == null && !t70Var.e.e() && t70Var.h() <= 2) {
            x70Var.s.e(false, true);
        }
        t70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((kz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((org.telegram.ui.h4) this.b).run();
                break;
            case 5:
                ((w20) this.b).n();
                break;
            case 7:
                x70.Q((x70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                vy0 vy0Var = (vy0) this.b;
                vy0Var.e.presentFragment(new StickersActivity(vy0Var.d, null));
                c2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((wy0) this.b);
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
        aw.Z((aw) this.b, i10);
    }

    @Override // org.telegram.ui.Components.rw0
    public void i(int i10) {
        Utilities.Callback callback = ((m61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.sf0
    public void l(int i10, int i11) {
        hg0 hg0Var = ((gg0) this.b).d;
        if (i10 == hg0Var.b) {
            hg0Var.G = i11;
        } else if (i10 == hg0Var.r) {
            hg0Var.P = i11;
        } else if (i10 == hg0Var.d) {
            hg0Var.I = i11;
        } else if (i10 == hg0Var.c) {
            hg0Var.H = i11;
        } else if (i10 == hg0Var.f) {
            hg0Var.J = i11;
        } else if (i10 == hg0Var.e) {
            hg0Var.K = i11;
        } else if (i10 == hg0Var.v) {
            hg0Var.R = i11;
        } else if (i10 == hg0Var.s) {
            hg0Var.Q = i11;
        } else if (i10 == hg0Var.w) {
            hg0Var.S = i11;
        } else if (i10 == hg0Var.x) {
            hg0Var.U = i11;
        } else if (i10 == hg0Var.h) {
            hg0Var.L = i11;
        } else if (i10 == hg0Var.n) {
            hg0Var.M = i11;
        }
        e00 e00Var = hg0Var.l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        hg0Var.g();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ci.h7 storiesController;
        ci.h7 storiesController2;
        switch (this.a) {
            case 20:
                final xv0 xv0Var = ((rs0) this.b).d;
                storiesController = xv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(xv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ps0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 7;
                        xv0 xv0Var2 = xv0Var;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = xv0.g2;
                                AndroidUtilities.runOnUIThread(new ko0(i12, xv0Var2, a7Var), 100L);
                                break;
                            default:
                                int[] iArr2 = xv0.g2;
                                AndroidUtilities.runOnUIThread(new ko0(i12, xv0Var2, a7Var), 100L);
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
                        int i12 = 7;
                        xv0 xv0Var22 = xv0Var2;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = xv0.g2;
                                AndroidUtilities.runOnUIThread(new ko0(i12, xv0Var22, a7Var), 100L);
                                break;
                            default:
                                int[] iArr2 = xv0.g2;
                                AndroidUtilities.runOnUIThread(new ko0(i12, xv0Var22, a7Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                k51 k51Var = (k51) this.b;
                k51Var.e0 = str;
                k51Var.j0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        long j10;
        ap0 ap0Var = (ap0) this.b;
        int i12 = ap0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ap0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.a10) it.next()));
        }
        hashMap.clear();
        ap0Var.P(false);
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
        snVar.Gb(arrayList2);
        return true;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h x() {
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
                m61 m61Var = (m61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                my myVar = tyVar.c;
                tz tzVar = tyVar.F;
                Object obj6 = m61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    ky kyVar = (ky) m61Var.H;
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
                        TLObject tLObject = (TLObject) m61Var.G;
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
                            myVar.O1(view);
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
                        TLObject tLObject2 = (TLObject) m61Var.G;
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
                            TLObject tLObject22 = (TLObject) m61Var.G;
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
                    TLObject tLObject222 = (TLObject) m61Var.G;
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
                m61 m61Var2 = (m61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                nz nzVar = ozVar.c;
                tz tzVar2 = ozVar.Q;
                Object obj7 = m61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    ky kyVar2 = (ky) m61Var2.H;
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
                        TLObject tLObject3 = (TLObject) m61Var2.G;
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
                            nzVar.O1(view2);
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
                        TLObject tLObject32 = (TLObject) m61Var2.G;
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
                            TLObject tLObject322 = (TLObject) m61Var2.G;
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
                    TLObject tLObject3222 = (TLObject) m61Var2.G;
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
                xh0 xh0Var = (xh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((m61) obj).G;
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
                    org.telegram.ui.ey eyVar = xh0Var.a;
                    org.telegram.ui.ey.b4(snVar, messageObject);
                    eyVar.presentFragment(snVar);
                    break;
                }
                break;
            case 16:
                mm0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((mm0) this.b).n2);
                break;
            default:
                mm0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((j71) this.b).n2);
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }
}
