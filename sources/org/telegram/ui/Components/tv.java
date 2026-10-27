package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import org.telegram.ui.cf1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, ig.z1, oe.d, GenericProvider, r90, qf0, wh.a, cm0, org.telegram.ui.xx, di.p7, MessagesStorage.StringCallback, x91, LanguageDetector.StringCallback, zw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((ua0) this.b).Y();
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // di.p7
    public void b(boolean z10) {
        di.z6 z6Var = (di.z6) this.b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        pk0 pk0Var;
        switch (this.a) {
            case 17:
                qk0 qk0Var = (qk0) this.b;
                ArrayList arrayList = qk0Var.n;
                if (qk0Var.f.j(i10) != 0 || (pk0Var = qk0Var.F) == null) {
                    return true;
                }
                pk0Var.f(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                do0 do0Var = (do0) this.b;
                co0 co0Var = do0Var.c;
                MessageObject E = co0Var.E(i10);
                do0 do0Var2 = co0Var.c;
                if (E == null) {
                    return false;
                }
                if (!do0Var.I.g()) {
                    do0Var.I.a();
                    co0Var.q(0, do0Var2.r);
                }
                if (do0Var.I.g()) {
                    do0Var.I.e(E, view, 0);
                    if (!do0Var.I.g()) {
                        co0Var.q(0, do0Var2.r);
                    }
                    org.telegram.ui.b10 b10Var = do0Var.J;
                    int id2 = E.getId();
                    b10Var.a = E.getDialogId();
                    b10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.r90
    public void d() {
        ((ue0) this.b).p(true);
    }

    @Override // ig.z1
    public void f(int i10) {
        v70 v70Var = (v70) this.b;
        z70 z70Var = v70Var.n;
        z70Var.J(v70Var.f - 1);
        if (v70Var.h == null && !v70Var.e.e() && v70Var.h() <= 2) {
            z70Var.s.e(false, true);
        }
        v70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        aw.Z((aw) this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((jz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((org.telegram.ui.g4) this.b).run();
                break;
            case 5:
                ((y20) this.b).n();
                break;
            case 7:
                z70.Q((z70) this.b);
                break;
            case 24:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 25:
                fz0 fz0Var = (fz0) this.b;
                fz0Var.e.presentFragment(new StickersActivity(fz0Var.d, null));
                e2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((gz0) this.b);
                e2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x91
    public void i(int i10, int i11) {
        ww0 ww0Var = (ww0) this.b;
        ww0Var.w = i10;
        ww0Var.x = i11;
        bi.cc ccVar = ww0Var.L;
        if (ccVar != null) {
            ccVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public void j(int i10) {
        Utilities.Callback callback = ((u61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.qf0
    public void l(int i10, int i11) {
        fg0 fg0Var = ((eg0) this.b).d;
        if (i10 == fg0Var.b) {
            fg0Var.G = i11;
        } else if (i10 == fg0Var.r) {
            fg0Var.P = i11;
        } else if (i10 == fg0Var.d) {
            fg0Var.I = i11;
        } else if (i10 == fg0Var.c) {
            fg0Var.H = i11;
        } else if (i10 == fg0Var.f) {
            fg0Var.J = i11;
        } else if (i10 == fg0Var.e) {
            fg0Var.K = i11;
        } else if (i10 == fg0Var.v) {
            fg0Var.R = i11;
        } else if (i10 == fg0Var.s) {
            fg0Var.Q = i11;
        } else if (i10 == fg0Var.w) {
            fg0Var.S = i11;
        } else if (i10 == fg0Var.x) {
            fg0Var.U = i11;
        } else if (i10 == fg0Var.h) {
            fg0Var.L = i11;
        } else if (i10 == fg0Var.n) {
            fg0Var.M = i11;
        }
        e00 e00Var = fg0Var.l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        fg0Var.g();
    }

    @Override // wh.a
    public void p(Canvas canvas, int i10) {
        rg0.c((rg0) this.b, canvas, i10);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((ac.a) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        di.h7 storiesController;
        switch (this.a) {
            case 22:
                bw0 bw0Var = ((zs0) this.b).d;
                storiesController = bw0Var.getStoriesController();
                storiesController.r(bw0Var.l1, str, new ss0(bw0Var, 1));
                break;
            default:
                s51 s51Var = (s51) this.b;
                s51Var.e0 = str;
                s51Var.j0.O(true);
                break;
        }
    }

    @Override // org.telegram.ui.xx
    public boolean v(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        long j10;
        fp0 fp0Var = (fp0) this.b;
        int i12 = fp0Var.J0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = fp0Var.B0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.b10) it.next()));
        }
        hashMap.clear();
        fp0Var.R(false);
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
        Bundle i14 = a1.g.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            i14.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                i14.putLong("user_id", j12);
            } else {
                i14.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, eyVar)) {
                return true;
            }
        }
        org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i14);
        eyVar.presentFragment(wnVar, true);
        wnVar.Qb(arrayList2);
        return true;
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264  */
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
                sy syVar = (sy) this.b;
                u61 u61Var = (u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ly lyVar = syVar.c;
                sz szVar = syVar.F;
                Object obj6 = u61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    jy jyVar = (jy) u61Var.H;
                    long j10 = syVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        syVar.d = 0L;
                        stickerSet = null;
                        childCount = lyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            ph.c cVar = (ph.c) lyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (syVar.d != 0 && syVar.f.size() < syVar.e.count && (stickerSet2 = MediaDataController.getInstance(szVar.c1).getStickerSet(syVar.e, false)) != null) {
                            syVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) u61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        ph.b bVar = szVar.L;
                        oe.b bVar2 = szVar.b;
                        arrayList = syVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) syVar.f.get(0);
                        }
                        szVar.K(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((ph.c) view).a(syVar.d == 0, true);
                        bVar2.a(syVar.d != 0, true);
                        syVar.l();
                        szVar.V.b();
                        if (syVar.d == 0) {
                            lyVar.O1(view);
                            break;
                        }
                    } else {
                        syVar.d = j11;
                        syVar.f = jyVar.d;
                        syVar.e = stickerSet;
                        childCount = lyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (syVar.d != 0) {
                            syVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) u61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        ph.b bVar3 = szVar.L;
                        oe.b bVar22 = szVar.b;
                        arrayList = syVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) syVar.f.get(0);
                        }
                        szVar.K(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((ph.c) view).a(syVar.d == 0, true);
                        bVar22.a(syVar.d != 0, true);
                        syVar.l();
                        szVar.V.b();
                        if (syVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = syVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            syVar.d = 0L;
                        } else {
                            syVar.d = j13;
                            syVar.f = tL_messages_stickerSet.documents;
                            syVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = lyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (syVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) u61Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            ph.b bVar32 = szVar.L;
                            oe.b bVar222 = szVar.b;
                            arrayList = syVar.f;
                            if (arrayList != null) {
                            }
                            szVar.K(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((ph.c) view).a(syVar.d == 0, true);
                            bVar222.a(syVar.d != 0, true);
                            syVar.l();
                            szVar.V.b();
                            if (syVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = lyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (syVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) u61Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    ph.b bVar322 = szVar.L;
                    oe.b bVar2222 = szVar.b;
                    arrayList = syVar.f;
                    if (arrayList != null) {
                    }
                    szVar.K(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((ph.c) view).a(syVar.d == 0, true);
                    bVar2222.a(syVar.d != 0, true);
                    syVar.l();
                    szVar.V.b();
                    if (syVar.d == 0) {
                    }
                }
                break;
            case 3:
                nz nzVar = (nz) this.b;
                u61 u61Var2 = (u61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                mz mzVar = nzVar.c;
                sz szVar2 = nzVar.Q;
                Object obj7 = u61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    jy jyVar2 = (jy) u61Var2.H;
                    long j14 = nzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        nzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = mzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            ph.c cVar2 = (ph.c) mzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (nzVar.d != 0 && nzVar.f.size() < nzVar.e.count && (stickerSet4 = MediaDataController.getInstance(szVar2.c1).getStickerSet(nzVar.e, false)) != null) {
                            nzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) u61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        ph.b bVar4 = szVar2.N;
                        oe.b bVar5 = szVar2.a;
                        arrayList2 = nzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) nzVar.f.get(0);
                        }
                        szVar2.K(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((ph.c) view2).a(nzVar.d == 0, true);
                        bVar5.a(nzVar.d != 0, true);
                        nzVar.l();
                        szVar2.G0.b();
                        if (nzVar.d == 0) {
                            mzVar.O1(view2);
                            break;
                        }
                    } else {
                        nzVar.d = j15;
                        nzVar.f = jyVar2.d;
                        nzVar.e = stickerSet3;
                        childCount2 = mzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (nzVar.d != 0) {
                            nzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) u61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        ph.b bVar42 = szVar2.N;
                        oe.b bVar52 = szVar2.a;
                        arrayList2 = nzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) nzVar.f.get(0);
                        }
                        szVar2.K(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((ph.c) view2).a(nzVar.d == 0, true);
                        bVar52.a(nzVar.d != 0, true);
                        nzVar.l();
                        szVar2.G0.b();
                        if (nzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = nzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            nzVar.d = 0L;
                        } else {
                            nzVar.d = j17;
                            nzVar.f = tL_messages_stickerSet2.documents;
                            nzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = mzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (nzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) u61Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            ph.b bVar422 = szVar2.N;
                            oe.b bVar522 = szVar2.a;
                            arrayList2 = nzVar.f;
                            if (arrayList2 != null) {
                            }
                            szVar2.K(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((ph.c) view2).a(nzVar.d == 0, true);
                            bVar522.a(nzVar.d != 0, true);
                            nzVar.l();
                            szVar2.G0.b();
                            if (nzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = mzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (nzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) u61Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    ph.b bVar4222 = szVar2.N;
                    oe.b bVar5222 = szVar2.a;
                    arrayList2 = nzVar.f;
                    if (arrayList2 != null) {
                    }
                    szVar2.K(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((ph.c) view2).a(nzVar.d == 0, true);
                    bVar5222.a(nzVar.d != 0, true);
                    nzVar.l();
                    szVar2.G0.b();
                    if (nzVar.d == 0) {
                    }
                }
                break;
            case 14:
                xh0 xh0Var = (xh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((u61) obj).G;
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
                    org.telegram.ui.ey eyVar = xh0Var.a;
                    org.telegram.ui.ey.l4(wnVar, messageObject);
                    eyVar.presentFragment(wnVar);
                    break;
                }
                break;
            default:
                nm0 nm0Var = (nm0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) obj3).floatValue();
                float floatValue2 = ((Float) obj4).floatValue();
                float floatValue3 = ((Float) obj5).floatValue();
                org.telegram.ui.ActionBar.u6 u6Var = nm0Var.n2;
                Paint paint = nm0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(floatValue3, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = nm0.d3;
                        path.rewind();
                        float[] fArr = nm0.e3;
                        fArr[3] = floatValue;
                        fArr[2] = floatValue;
                        fArr[1] = floatValue;
                        fArr[0] = floatValue;
                        fArr[7] = floatValue2;
                        fArr[6] = floatValue2;
                        fArr[5] = floatValue2;
                        fArr[4] = floatValue2;
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, paint);
                        break;
                    }
                } else {
                    canvas.drawRect(rectF, paint);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.r90
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.r90
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.r90
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.zw0
    public /* synthetic */ void m() {
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
