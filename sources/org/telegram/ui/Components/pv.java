package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, i90, hf0, ol0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, j91, LanguageDetector.StringCallback, pw0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean H(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override // gg.b2
    public void a(int i10) {
        l70 l70Var = (l70) this.b;
        p70 p70Var = l70Var.n;
        p70Var.H(l70Var.f - 1);
        if (l70Var.h == null && !l70Var.e.e() && l70Var.h() <= 2) {
            p70Var.s.e(false, true);
        }
        l70Var.l();
    }

    @Override // org.telegram.ui.Components.i90
    public void c() {
        ((me0) this.b).p(true);
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
                on0 on0Var = (on0) this.b;
                nn0 nn0Var = on0Var.c;
                MessageObject E = nn0Var.E(i10);
                on0 on0Var2 = nn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!on0Var.I.g()) {
                    on0Var.I.a();
                    nn0Var.q(0, on0Var2.r);
                }
                if (on0Var.I.g()) {
                    on0Var.I.e(E, view, 0);
                    if (!on0Var.I.g()) {
                        nn0Var.q(0, on0Var2.r);
                    }
                    org.telegram.ui.p10 p10Var = on0Var.J;
                    int id2 = E.getId();
                    p10Var.a = E.getDialogId();
                    p10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        k81 k81Var;
        int i10;
        int i11;
        l81 l81Var = (l81) this.b;
        ImageReceiver imageReceiver2 = l81Var.Q;
        if (z10) {
            if (l81Var.N == null && l81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.du0 du0Var = l81Var.N;
            if (du0Var != null) {
                int i12 = (int) l81Var.O;
                ArrayList arrayList = du0Var.v;
                int indexOf = arrayList.indexOf(du0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = du0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.du0 du0Var2 = l81Var.N;
                int i13 = (int) l81Var.O;
                int videoDuration2 = du0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                l81Var.R = (int) ((min % 5) * bitmapWidth);
                l81Var.S = (int) ((min / 5) * bitmapHeight);
                l81Var.T = (int) bitmapWidth;
                l81Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= l81Var.d0.size()) {
                        k81Var = null;
                        break;
                    }
                    k81Var = (k81) l81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : k81Var.a;
                    double d10 = i14 == l81Var.d0.size() + (-1) ? 9.9999999E7d : ((k81) l81Var.d0.get(i14 + 1)).a;
                    double d11 = l81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (k81Var == null) {
                    return;
                }
                l81Var.R = k81Var.b;
                l81Var.S = k81Var.c;
                l81Var.T = l81Var.b0;
                l81Var.U = l81Var.c0;
            }
            l81Var.P = true;
            float f7 = l81Var.T / l81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = l81Var.getLayoutParams();
            if (l81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            l81Var.setVisibility(0);
            l81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.j91
    public void e(int i10, int i11) {
        mw0 mw0Var = (mw0) this.b;
        mw0Var.w = i10;
        mw0Var.x = i11;
        ci.ab abVar = mw0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override // ai.t9
    public void f(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((ez) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((zm) this.b).run();
                break;
            case 5:
                ((r20) this.b).n();
                break;
            case 7:
                p70.O((p70) this.b);
                break;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 24:
                ty0 ty0Var = (ty0) this.b;
                ty0Var.e.presentFragment(new StickersActivity(ty0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((vy0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public void j(int i10) {
        Utilities.Callback callback = ((h61) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.hf0
    public void k(int i10, int i11) {
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
        yz yzVar = vf0Var.l0;
        if (yzVar != null) {
            yzVar.e(true, false, false);
        }
        vf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        wv.N((wv) this.b, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
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
                final qv0 qv0Var = ((ks0) this.b).d;
                storiesController = qv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(qv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.is0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 5;
                        qv0 qv0Var2 = qv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = qv0.d2;
                                AndroidUtilities.runOnUIThread(new vo0(i12, qv0Var2, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = qv0.d2;
                                AndroidUtilities.runOnUIThread(new vo0(i12, qv0Var2, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 21:
                final qv0 qv0Var2 = ((ut0) this.b).d;
                storiesController2 = qv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(qv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.is0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 5;
                        qv0 qv0Var22 = qv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = qv0.d2;
                                AndroidUtilities.runOnUIThread(new vo0(i12, qv0Var22, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = qv0.d2;
                                AndroidUtilities.runOnUIThread(new vo0(i12, qv0Var22, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                f51 f51Var = (f51) this.b;
                f51Var.e0 = str;
                f51Var.j0.N(true);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i s() {
        return null;
    }

    @Override // org.telegram.ui.oy
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        qo0 qo0Var = (qo0) this.b;
        int i12 = qo0Var.J0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = qo0Var.B0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.p10) it.next()));
        }
        hashMap.clear();
        qo0Var.S(false);
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
        org.telegram.ui.yn ynVar = new org.telegram.ui.yn(i14);
        uyVar.presentFragment(ynVar, true);
        ynVar.zb(arrayList2);
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i x() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean z(int i10) {
        return true;
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
                ny nyVar = (ny) this.b;
                h61 h61Var = (h61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                iy iyVar = nyVar.c;
                nz nzVar = nyVar.F;
                Object obj6 = h61Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    gy gyVar = (gy) h61Var.H;
                    long j3 = nyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        nyVar.d = 0L;
                        stickerSet = null;
                        childCount = iyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            nh.c cVar = (nh.c) iyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (nyVar.d != 0 && nyVar.f.size() < nyVar.e.count && (stickerSet2 = MediaDataController.getInstance(nzVar.c1).getStickerSet(nyVar.e, false)) != null) {
                            nyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) h61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = nzVar.L;
                        le.b bVar2 = nzVar.b;
                        arrayList = nyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) nyVar.f.get(0);
                        }
                        nzVar.H(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((nh.c) view).a(nyVar.d == 0, true);
                        bVar2.a(nyVar.d != 0, true);
                        nyVar.l();
                        nzVar.V.b();
                        if (nyVar.d == 0) {
                            iyVar.J1(view);
                            break;
                        }
                    } else {
                        nyVar.d = j10;
                        nyVar.f = gyVar.d;
                        nyVar.e = stickerSet;
                        childCount = iyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (nyVar.d != 0) {
                            nyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) h61Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar3 = nzVar.L;
                        le.b bVar22 = nzVar.b;
                        arrayList = nyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) nyVar.f.get(0);
                        }
                        nzVar.H(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((nh.c) view).a(nyVar.d == 0, true);
                        bVar22.a(nyVar.d != 0, true);
                        nyVar.l();
                        nzVar.V.b();
                        if (nyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = nyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            nyVar.d = 0L;
                        } else {
                            nyVar.d = j12;
                            nyVar.f = tL_messages_stickerSet.documents;
                            nyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = iyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (nyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) h61Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar32 = nzVar.L;
                            le.b bVar222 = nzVar.b;
                            arrayList = nyVar.f;
                            if (arrayList != null) {
                            }
                            nzVar.H(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((nh.c) view).a(nyVar.d == 0, true);
                            bVar222.a(nyVar.d != 0, true);
                            nyVar.l();
                            nzVar.V.b();
                            if (nyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = iyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (nyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) h61Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar322 = nzVar.L;
                    le.b bVar2222 = nzVar.b;
                    arrayList = nyVar.f;
                    if (arrayList != null) {
                    }
                    nzVar.H(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((nh.c) view).a(nyVar.d == 0, true);
                    bVar2222.a(nyVar.d != 0, true);
                    nyVar.l();
                    nzVar.V.b();
                    if (nyVar.d == 0) {
                    }
                }
                break;
            case 3:
                iz izVar = (iz) this.b;
                h61 h61Var2 = (h61) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                hz hzVar = izVar.c;
                nz nzVar2 = izVar.Q;
                Object obj7 = h61Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    gy gyVar2 = (gy) h61Var2.H;
                    long j13 = izVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        izVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = hzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            nh.c cVar2 = (nh.c) hzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (izVar.d != 0 && izVar.f.size() < izVar.e.count && (stickerSet4 = MediaDataController.getInstance(nzVar2.c1).getStickerSet(izVar.e, false)) != null) {
                            izVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) h61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        nh.b bVar4 = nzVar2.N;
                        le.b bVar5 = nzVar2.a;
                        arrayList2 = izVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) izVar.f.get(0);
                        }
                        nzVar2.H(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((nh.c) view2).a(izVar.d == 0, true);
                        bVar5.a(izVar.d != 0, true);
                        izVar.l();
                        nzVar2.G0.b();
                        if (izVar.d == 0) {
                            hzVar.J1(view2);
                            break;
                        }
                    } else {
                        izVar.d = j14;
                        izVar.f = gyVar2.d;
                        izVar.e = stickerSet3;
                        childCount2 = hzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (izVar.d != 0) {
                            izVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) h61Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        nh.b bVar42 = nzVar2.N;
                        le.b bVar52 = nzVar2.a;
                        arrayList2 = izVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) izVar.f.get(0);
                        }
                        nzVar2.H(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((nh.c) view2).a(izVar.d == 0, true);
                        bVar52.a(izVar.d != 0, true);
                        izVar.l();
                        nzVar2.G0.b();
                        if (izVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = izVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            izVar.d = 0L;
                        } else {
                            izVar.d = j16;
                            izVar.f = tL_messages_stickerSet2.documents;
                            izVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = hzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (izVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) h61Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            nh.b bVar422 = nzVar2.N;
                            le.b bVar522 = nzVar2.a;
                            arrayList2 = izVar.f;
                            if (arrayList2 != null) {
                            }
                            nzVar2.H(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((nh.c) view2).a(izVar.d == 0, true);
                            bVar522.a(izVar.d != 0, true);
                            izVar.l();
                            nzVar2.G0.b();
                            if (izVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = hzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (izVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) h61Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    nh.b bVar4222 = nzVar2.N;
                    le.b bVar5222 = nzVar2.a;
                    arrayList2 = izVar.f;
                    if (arrayList2 != null) {
                    }
                    nzVar2.H(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((nh.c) view2).a(izVar.d == 0, true);
                    bVar5222.a(izVar.d != 0, true);
                    izVar.l();
                    nzVar2.G0.b();
                    if (izVar.d == 0) {
                    }
                }
                break;
            case 12:
                lh0 lh0Var = (lh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((h61) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.yn ynVar = new org.telegram.ui.yn(bundle);
                    org.telegram.ui.uy uyVar = lh0Var.a;
                    org.telegram.ui.uy.m4(ynVar, messageObject);
                    uyVar.presentFragment(ynVar);
                    break;
                }
                break;
            default:
                zl0 zl0Var = (zl0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) obj3).floatValue();
                float floatValue2 = ((Float) obj4).floatValue();
                float floatValue3 = ((Float) obj5).floatValue();
                org.telegram.ui.ActionBar.d6 d6Var = zl0Var.p2;
                Paint paint = zl0.b3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.i6.l1(floatValue3, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = zl0.c3;
                        path.rewind();
                        float[] fArr = zl0.d3;
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

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.i90
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i90
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.i90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pw0
    public /* synthetic */ void l() {
    }
}
