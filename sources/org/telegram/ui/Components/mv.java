package org.telegram.ui.Components;

import android.graphics.Canvas;
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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, v80, ve0, cl0, org.telegram.ui.ly, ai.t9, MessagesStorage.StringCallback, j81, LanguageDetector.StringCallback, sv0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean K(org.telegram.ui.ry ryVar) {
        return false;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // ai.t9
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.v80
    public void c() {
        ((ae0) this.b).p(true);
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        pj0 pj0Var;
        switch (this.a) {
            case 14:
                qj0 qj0Var = (qj0) this.b;
                ArrayList arrayList = qj0Var.n;
                if (qj0Var.f.j(i10) != 0 || (pj0Var = qj0Var.F) == null) {
                    return true;
                }
                pj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                wm0 wm0Var = (wm0) this.b;
                vm0 vm0Var = wm0Var.c;
                MessageObject E = vm0Var.E(i10);
                wm0 wm0Var2 = vm0Var.c;
                if (E == null) {
                    return false;
                }
                if (!wm0Var.I.g()) {
                    wm0Var.I.a();
                    vm0Var.q(0, wm0Var2.r);
                }
                if (wm0Var.I.g()) {
                    wm0Var.I.e(E, view, 0);
                    if (!wm0Var.I.g()) {
                        vm0Var.q(0, wm0Var2.r);
                    }
                    org.telegram.ui.m10 m10Var = wm0Var.J;
                    int id2 = E.getId();
                    m10Var.a = E.getDialogId();
                    m10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        l71 l71Var;
        int i10;
        int i11;
        m71 m71Var = (m71) this.b;
        ImageReceiver imageReceiver2 = m71Var.Q;
        if (z10) {
            if (m71Var.N == null && m71Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.bu0 bu0Var = m71Var.N;
            if (bu0Var != null) {
                int i12 = (int) m71Var.O;
                ArrayList arrayList = bu0Var.v;
                int indexOf = arrayList.indexOf(bu0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = bu0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.bu0 bu0Var2 = m71Var.N;
                int i13 = (int) m71Var.O;
                int videoDuration2 = bu0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                m71Var.R = (int) ((min % 5) * bitmapWidth);
                m71Var.S = (int) ((min / 5) * bitmapHeight);
                m71Var.T = (int) bitmapWidth;
                m71Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= m71Var.d0.size()) {
                        l71Var = null;
                        break;
                    }
                    l71Var = (l71) m71Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : l71Var.a;
                    double d10 = i14 == m71Var.d0.size() + (-1) ? 9.9999999E7d : ((l71) m71Var.d0.get(i14 + 1)).a;
                    double d11 = m71Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (l71Var == null) {
                    return;
                }
                m71Var.R = l71Var.b;
                m71Var.S = l71Var.c;
                m71Var.T = m71Var.b0;
                m71Var.U = m71Var.c0;
            }
            m71Var.P = true;
            float f7 = m71Var.T / m71Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
            if (m71Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            m71Var.setVisibility(0);
            m71Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.j81
    public void e(int i10, int i11) {
        pv0 pv0Var = (pv0) this.b;
        pv0Var.w = i10;
        pv0Var.x = i11;
        ci.bb bbVar = pv0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
            case 6:
                c70.Q((c70) this.b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 23:
                wx0 wx0Var = (wx0) this.b;
                wx0Var.e.presentFragment(new StickersActivity(wx0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((yx0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        Utilities.Callback callback = ((h51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // gg.b2
    public void h(int i10) {
        y60 y60Var = (y60) this.b;
        c70 c70Var = y60Var.n;
        c70Var.J(y60Var.f - 1);
        if (y60Var.h == null && !y60Var.e.e() && y60Var.h() <= 2) {
            c70Var.s.e(false, true);
        }
        y60Var.l();
    }

    @Override // org.telegram.ui.Components.ve0
    public void k(int i10, int i11) {
        jf0 jf0Var = ((if0) this.b).d;
        if (i10 == jf0Var.b) {
            jf0Var.G = i11;
        } else if (i10 == jf0Var.r) {
            jf0Var.P = i11;
        } else if (i10 == jf0Var.d) {
            jf0Var.I = i11;
        } else if (i10 == jf0Var.c) {
            jf0Var.H = i11;
        } else if (i10 == jf0Var.f) {
            jf0Var.J = i11;
        } else if (i10 == jf0Var.e) {
            jf0Var.K = i11;
        } else if (i10 == jf0Var.v) {
            jf0Var.R = i11;
        } else if (i10 == jf0Var.s) {
            jf0Var.Q = i11;
        } else if (i10 == jf0Var.w) {
            jf0Var.S = i11;
        } else if (i10 == jf0Var.x) {
            jf0Var.U = i11;
        } else if (i10 == jf0Var.h) {
            jf0Var.L = i11;
        } else if (i10 == jf0Var.n) {
            jf0Var.M = i11;
        }
        wz wzVar = jf0Var.l0;
        if (wzVar != null) {
            wzVar.e(true, false, false);
        }
        jf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        tv.P((tv) this.b, i10);
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
            case 19:
                final yu0 yu0Var = ((rr0) this.b).d;
                storiesController = yu0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(yu0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.pr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 1;
                        yu0 yu0Var2 = yu0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = yu0.d2;
                                AndroidUtilities.runOnUIThread(new ar0(i12, yu0Var2, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.d2;
                                AndroidUtilities.runOnUIThread(new ar0(i12, yu0Var2, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final yu0 yu0Var2 = ((ct0) this.b).d;
                storiesController2 = yu0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(yu0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.pr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 1;
                        yu0 yu0Var22 = yu0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = yu0.d2;
                                AndroidUtilities.runOnUIThread(new ar0(i12, yu0Var22, e9Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.d2;
                                AndroidUtilities.runOnUIThread(new ar0(i12, yu0Var22, e9Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                f41 f41Var = (f41) this.b;
                f41Var.e0 = str;
                f41Var.j0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.ly
    public boolean u(org.telegram.ui.ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        yn0 yn0Var = (yn0) this.b;
        int i12 = yn0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = yn0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.m10) it.next()));
        }
        hashMap.clear();
        yn0Var.Q(false);
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
            ryVar.finishFragment();
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
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, ryVar)) {
                return true;
            }
        }
        org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i14);
        ryVar.presentFragment(xnVar, true);
        xnVar.Ab(arrayList2);
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
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
                h51 h51Var = (h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                fy fyVar = kyVar.c;
                lz lzVar = kyVar.F;
                Object obj6 = h51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar = (dy) h51Var.H;
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
                        if (kyVar.d != 0 && kyVar.f.size() < kyVar.e.count && (stickerSet2 = MediaDataController.getInstance(lzVar.c1).getStickerSet(kyVar.e, false)) != null) {
                            kyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) h51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        nh.b bVar = lzVar.L;
                        le.c cVar2 = lzVar.b;
                        arrayList = kyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) kyVar.f.get(0);
                        }
                        lzVar.J(bVar, tLObject, stickerSet5, document, true, cVar2.e <= 0.0f);
                        ((nh.c) view).a(kyVar.d == 0, true);
                        cVar2.a(kyVar.d != 0, true);
                        kyVar.l();
                        lzVar.V.b();
                        if (kyVar.d == 0) {
                            fyVar.I1(view);
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
                        TLObject tLObject2 = (TLObject) h51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        nh.b bVar2 = lzVar.L;
                        le.c cVar22 = lzVar.b;
                        arrayList = kyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) kyVar.f.get(0);
                        }
                        lzVar.J(bVar2, tLObject2, stickerSet52, document, true, cVar22.e <= 0.0f);
                        ((nh.c) view).a(kyVar.d == 0, true);
                        cVar22.a(kyVar.d != 0, true);
                        kyVar.l();
                        lzVar.V.b();
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
                            TLObject tLObject22 = (TLObject) h51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            nh.b bVar22 = lzVar.L;
                            le.c cVar222 = lzVar.b;
                            arrayList = kyVar.f;
                            if (arrayList != null) {
                            }
                            lzVar.J(bVar22, tLObject22, stickerSet522, document, true, cVar222.e <= 0.0f);
                            ((nh.c) view).a(kyVar.d == 0, true);
                            cVar222.a(kyVar.d != 0, true);
                            kyVar.l();
                            lzVar.V.b();
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
                    TLObject tLObject222 = (TLObject) h51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    nh.b bVar222 = lzVar.L;
                    le.c cVar2222 = lzVar.b;
                    arrayList = kyVar.f;
                    if (arrayList != null) {
                    }
                    lzVar.J(bVar222, tLObject222, stickerSet5222, document, true, cVar2222.e <= 0.0f);
                    ((nh.c) view).a(kyVar.d == 0, true);
                    cVar2222.a(kyVar.d != 0, true);
                    kyVar.l();
                    lzVar.V.b();
                    if (kyVar.d == 0) {
                    }
                }
                break;
            case 3:
                gz gzVar = (gz) this.b;
                h51 h51Var2 = (h51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                fz fzVar = gzVar.c;
                lz lzVar2 = gzVar.Q;
                Object obj7 = h51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar2 = (dy) h51Var2.H;
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
                        TLObject tLObject3 = (TLObject) h51Var2.G;
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
                        gzVar.f = dyVar2.d;
                        gzVar.e = stickerSet3;
                        childCount2 = fzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (gzVar.d != 0) {
                            gzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) h51Var2.G;
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
                            TLObject tLObject322 = (TLObject) h51Var2.G;
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
                    TLObject tLObject3222 = (TLObject) h51Var2.G;
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
            case 11:
                zg0 zg0Var = (zg0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((h51) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.xn xnVar = new org.telegram.ui.xn(bundle);
                    org.telegram.ui.ry ryVar = zg0Var.a;
                    org.telegram.ui.ry.d4(xnVar, messageObject);
                    ryVar.presentFragment(xnVar);
                    break;
                }
                break;
            case 15:
                ml0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((ml0) this.b).p2);
                break;
            default:
                ml0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((d61) this.b).p2);
                break;
        }
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.v80
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.v80
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.v80
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }
}
