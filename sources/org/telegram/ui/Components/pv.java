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
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, fg.c2, GenericProvider, e90, ef0, ll0, org.telegram.ui.qy, zh.r5, MessagesStorage.StringCallback, x81, LanguageDetector.StringCallback, dw0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean J(org.telegram.ui.wy wyVar) {
        return false;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i P() {
        return null;
    }

    @Override // fg.c2
    public void a(int i10) {
        g70 g70Var = (g70) this.b;
        k70 k70Var = g70Var.n;
        k70Var.J(g70Var.f - 1);
        if (g70Var.h == null && !g70Var.e.e() && g70Var.h() <= 2) {
            k70Var.s.e(false, true);
        }
        g70Var.l();
    }

    @Override // zh.r5
    public void b(boolean z10) {
        zh.a5 a5Var = (zh.a5) this.b;
        if (z10) {
            a5Var.p(30, false);
        }
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        yj0 yj0Var;
        switch (this.a) {
            case 14:
                zj0 zj0Var = (zj0) this.b;
                ArrayList arrayList = zj0Var.n;
                if (zj0Var.f.j(i10) != 0 || (yj0Var = zj0Var.F) == null) {
                    return true;
                }
                yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                fn0 fn0Var = (fn0) this.b;
                en0 en0Var = fn0Var.c;
                MessageObject E = en0Var.E(i10);
                fn0 fn0Var2 = en0Var.c;
                if (E == null) {
                    return false;
                }
                if (!fn0Var.I.f()) {
                    fn0Var.I.a();
                    en0Var.q(0, fn0Var2.r);
                }
                if (fn0Var.I.f()) {
                    fn0Var.I.d(E, view, 0);
                    if (!fn0Var.I.f()) {
                        en0Var.q(0, fn0Var2.r);
                    }
                    org.telegram.ui.r10 r10Var = fn0Var.J;
                    int id2 = E.getId();
                    r10Var.a = E.getDialogId();
                    r10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        z71 z71Var;
        int i10;
        int i11;
        a81 a81Var = (a81) this.b;
        ImageReceiver imageReceiver2 = a81Var.Q;
        if (z10) {
            if (a81Var.N == null && a81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.hu0 hu0Var = a81Var.N;
            if (hu0Var != null) {
                int i12 = (int) a81Var.O;
                ArrayList arrayList = hu0Var.v;
                int indexOf = arrayList.indexOf(hu0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = hu0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.hu0 hu0Var2 = a81Var.N;
                int i13 = (int) a81Var.O;
                int videoDuration2 = hu0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                a81Var.R = (int) ((min % 5) * bitmapWidth);
                a81Var.S = (int) ((min / 5) * bitmapHeight);
                a81Var.T = (int) bitmapWidth;
                a81Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= a81Var.d0.size()) {
                        z71Var = null;
                        break;
                    }
                    z71Var = (z71) a81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : z71Var.a;
                    double d10 = i14 == a81Var.d0.size() + (-1) ? 9.9999999E7d : ((z71) a81Var.d0.get(i14 + 1)).a;
                    double d11 = a81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z71Var == null) {
                    return;
                }
                a81Var.R = z71Var.b;
                a81Var.S = z71Var.c;
                a81Var.T = a81Var.b0;
                a81Var.U = a81Var.c0;
            }
            a81Var.P = true;
            float f7 = a81Var.T / a81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
            if (a81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            a81Var.setVisibility(0);
            a81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.e90
    public void e() {
        ((je0) this.b).p(true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((iz) this.b).v.c1).clearRecentStickers();
                break;
            case 4:
                ((my) this.b).run();
                break;
            case 5:
                ((w20) this.b).n();
                break;
            case 6:
                k70.Q((k70) this.b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 23:
                jy0 jy0Var = (jy0) this.b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                d2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.b);
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void g(int i10, int i11) {
        aw0 aw0Var = (aw0) this.b;
        aw0Var.w = i10;
        aw0Var.x = i11;
        bi.nc ncVar = aw0Var.L;
        if (ncVar != null) {
            ncVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        Utilities.Callback callback = ((v51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.ef0
    public void k(int i10, int i11) {
        sf0 sf0Var = ((rf0) this.b).d;
        if (i10 == sf0Var.b) {
            sf0Var.G = i11;
        } else if (i10 == sf0Var.r) {
            sf0Var.P = i11;
        } else if (i10 == sf0Var.d) {
            sf0Var.I = i11;
        } else if (i10 == sf0Var.c) {
            sf0Var.H = i11;
        } else if (i10 == sf0Var.f) {
            sf0Var.J = i11;
        } else if (i10 == sf0Var.e) {
            sf0Var.K = i11;
        } else if (i10 == sf0Var.v) {
            sf0Var.R = i11;
        } else if (i10 == sf0Var.s) {
            sf0Var.Q = i11;
        } else if (i10 == sf0Var.w) {
            sf0Var.S = i11;
        } else if (i10 == sf0Var.x) {
            sf0Var.U = i11;
        } else if (i10 == sf0Var.h) {
            sf0Var.L = i11;
        } else if (i10 == sf0Var.n) {
            sf0Var.M = i11;
        }
        c00 c00Var = sf0Var.l0;
        if (c00Var != null) {
            c00Var.e(true, false, false);
        }
        sf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        wv.P((wv) this.b, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((o1.j) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        zh.i5 storiesController;
        zh.i5 storiesController2;
        switch (this.a) {
            case 19:
                final iv0 iv0Var = ((as0) this.b).d;
                storiesController = iv0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(iv0Var.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.yr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 4;
                        iv0 iv0Var2 = iv0Var;
                        zh.b5 b5Var = (zh.b5) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = iv0.d2;
                                AndroidUtilities.runOnUIThread(new yo0(i12, iv0Var2, b5Var), 100L);
                                break;
                            default:
                                int[] iArr2 = iv0.d2;
                                AndroidUtilities.runOnUIThread(new yo0(i12, iv0Var2, b5Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final iv0 iv0Var2 = ((lt0) this.b).d;
                storiesController2 = iv0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(iv0Var2.j1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.yr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 4;
                        iv0 iv0Var22 = iv0Var2;
                        zh.b5 b5Var = (zh.b5) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = iv0.d2;
                                AndroidUtilities.runOnUIThread(new yo0(i12, iv0Var22, b5Var), 100L);
                                break;
                            default:
                                int[] iArr2 = iv0.d2;
                                AndroidUtilities.runOnUIThread(new yo0(i12, iv0Var22, b5Var), 100L);
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

    @Override // org.telegram.ui.qy
    public boolean v(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        long j3;
        ho0 ho0Var = (ho0) this.b;
        int i12 = ho0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ho0Var.z0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.r10) it.next()));
        }
        hashMap.clear();
        ho0Var.Q(false);
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
            wyVar.finishFragment();
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
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, wyVar)) {
                return true;
            }
        }
        org.telegram.ui.eo eoVar = new org.telegram.ui.eo(i14);
        wyVar.presentFragment(eoVar, true);
        eoVar.Ab(arrayList2);
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
                ry ryVar = (ry) this.b;
                v51 v51Var = (v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ly lyVar = ryVar.c;
                rz rzVar = ryVar.F;
                Object obj6 = v51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    jy jyVar = (jy) v51Var.H;
                    long j3 = ryVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j10 = stickerSet.id;
                    if (j3 == j10) {
                        ryVar.d = 0L;
                        stickerSet = null;
                        childCount = lyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            mh.c cVar = (mh.c) lyVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (ryVar.d != 0 && ryVar.f.size() < ryVar.e.count && (stickerSet2 = MediaDataController.getInstance(rzVar.c1).getStickerSet(ryVar.e, false)) != null) {
                            ryVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) v51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        mh.b bVar = rzVar.L;
                        le.b bVar2 = rzVar.b;
                        arrayList = ryVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) ryVar.f.get(0);
                        }
                        rzVar.L(bVar, tLObject, stickerSet5, document, true, bVar2.e <= 0.0f);
                        ((mh.c) view).a(ryVar.d == 0, true);
                        bVar2.a(ryVar.d != 0, true);
                        ryVar.l();
                        rzVar.V.b();
                        if (ryVar.d == 0) {
                            lyVar.H1(view);
                            break;
                        }
                    } else {
                        ryVar.d = j10;
                        ryVar.f = jyVar.d;
                        ryVar.e = stickerSet;
                        childCount = lyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (ryVar.d != 0) {
                            ryVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) v51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        mh.b bVar3 = rzVar.L;
                        le.b bVar22 = rzVar.b;
                        arrayList = ryVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) ryVar.f.get(0);
                        }
                        rzVar.L(bVar3, tLObject2, stickerSet52, document, true, bVar22.e <= 0.0f);
                        ((mh.c) view).a(ryVar.d == 0, true);
                        bVar22.a(ryVar.d != 0, true);
                        ryVar.l();
                        rzVar.V.b();
                        if (ryVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j11 = ryVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j12 = stickerSet6.id;
                        if (j11 == j12) {
                            ryVar.d = 0L;
                        } else {
                            ryVar.d = j12;
                            ryVar.f = tL_messages_stickerSet.documents;
                            ryVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = lyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (ryVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) v51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            mh.b bVar32 = rzVar.L;
                            le.b bVar222 = rzVar.b;
                            arrayList = ryVar.f;
                            if (arrayList != null) {
                            }
                            rzVar.L(bVar32, tLObject22, stickerSet522, document, true, bVar222.e <= 0.0f);
                            ((mh.c) view).a(ryVar.d == 0, true);
                            bVar222.a(ryVar.d != 0, true);
                            ryVar.l();
                            rzVar.V.b();
                            if (ryVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = lyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (ryVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) v51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    mh.b bVar322 = rzVar.L;
                    le.b bVar2222 = rzVar.b;
                    arrayList = ryVar.f;
                    if (arrayList != null) {
                    }
                    rzVar.L(bVar322, tLObject222, stickerSet5222, document, true, bVar2222.e <= 0.0f);
                    ((mh.c) view).a(ryVar.d == 0, true);
                    bVar2222.a(ryVar.d != 0, true);
                    ryVar.l();
                    rzVar.V.b();
                    if (ryVar.d == 0) {
                    }
                }
                break;
            case 3:
                mz mzVar = (mz) this.b;
                v51 v51Var2 = (v51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                lz lzVar = mzVar.c;
                rz rzVar2 = mzVar.Q;
                Object obj7 = v51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    jy jyVar2 = (jy) v51Var2.H;
                    long j13 = mzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j14 = stickerSet3.id;
                    if (j13 == j14) {
                        mzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = lzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            mh.c cVar2 = (mh.c) lzVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (mzVar.d != 0 && mzVar.f.size() < mzVar.e.count && (stickerSet4 = MediaDataController.getInstance(rzVar2.c1).getStickerSet(mzVar.e, false)) != null) {
                            mzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) v51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        mh.b bVar4 = rzVar2.N;
                        le.b bVar5 = rzVar2.a;
                        arrayList2 = mzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) mzVar.f.get(0);
                        }
                        rzVar2.L(bVar4, tLObject3, stickerSet7, document2, false, bVar5.e <= 0.0f);
                        ((mh.c) view2).a(mzVar.d == 0, true);
                        bVar5.a(mzVar.d != 0, true);
                        mzVar.l();
                        rzVar2.G0.b();
                        if (mzVar.d == 0) {
                            lzVar.H1(view2);
                            break;
                        }
                    } else {
                        mzVar.d = j14;
                        mzVar.f = jyVar2.d;
                        mzVar.e = stickerSet3;
                        childCount2 = lzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (mzVar.d != 0) {
                            mzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) v51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        mh.b bVar42 = rzVar2.N;
                        le.b bVar52 = rzVar2.a;
                        arrayList2 = mzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) mzVar.f.get(0);
                        }
                        rzVar2.L(bVar42, tLObject32, stickerSet72, document2, false, bVar52.e <= 0.0f);
                        ((mh.c) view2).a(mzVar.d == 0, true);
                        bVar52.a(mzVar.d != 0, true);
                        mzVar.l();
                        rzVar2.G0.b();
                        if (mzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j15 = mzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j16 = stickerSet8.id;
                        if (j15 == j16) {
                            mzVar.d = 0L;
                        } else {
                            mzVar.d = j16;
                            mzVar.f = tL_messages_stickerSet2.documents;
                            mzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = lzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (mzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) v51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            mh.b bVar422 = rzVar2.N;
                            le.b bVar522 = rzVar2.a;
                            arrayList2 = mzVar.f;
                            if (arrayList2 != null) {
                            }
                            rzVar2.L(bVar422, tLObject322, stickerSet722, document2, false, bVar522.e <= 0.0f);
                            ((mh.c) view2).a(mzVar.d == 0, true);
                            bVar522.a(mzVar.d != 0, true);
                            mzVar.l();
                            rzVar2.G0.b();
                            if (mzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = lzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (mzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) v51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    mh.b bVar4222 = rzVar2.N;
                    le.b bVar5222 = rzVar2.a;
                    arrayList2 = mzVar.f;
                    if (arrayList2 != null) {
                    }
                    rzVar2.L(bVar4222, tLObject3222, stickerSet7222, document2, false, bVar5222.e <= 0.0f);
                    ((mh.c) view2).a(mzVar.d == 0, true);
                    bVar5222.a(mzVar.d != 0, true);
                    mzVar.l();
                    rzVar2.G0.b();
                    if (mzVar.d == 0) {
                    }
                }
                break;
            case 11:
                ih0 ih0Var = (ih0) this.b;
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
                    org.telegram.ui.eo eoVar = new org.telegram.ui.eo(bundle);
                    org.telegram.ui.wy wyVar = ih0Var.a;
                    org.telegram.ui.wy.d4(eoVar, messageObject);
                    wyVar.presentFragment(eoVar);
                    break;
                }
                break;
            case 15:
                vl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((vl0) this.b).p2);
                break;
            default:
                vl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((r61) this.b).p2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void j() {
    }

    @Override // fg.c2
    public /* synthetic */ void k0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }
}
