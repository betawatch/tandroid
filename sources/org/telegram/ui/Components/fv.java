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
import org.telegram.ui.kf1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, tf.j1, GenericProvider, w80, ze0, kl0, org.telegram.ui.iy, nh.b7, MessagesStorage.StringCallback, n81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // tf.j1
    public /* synthetic */ a0.h I() {
        return null;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean K(org.telegram.ui.oy oyVar) {
        return false;
    }

    @Override // tf.j1
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // nh.b7
    public void b(boolean z4) {
        nh.l6 l6Var = (nh.l6) this.b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.w80
    public void c() {
        ((de0) this.b).p(true);
    }

    @Override // org.telegram.ui.Components.n81
    public void d(int i10, int i11) {
        qv0 qv0Var = (qv0) this.b;
        qv0Var.w = i10;
        qv0Var.x = i11;
        eg.h0 h0Var = qv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        o71 o71Var;
        int i10;
        int i11;
        p71 p71Var = (p71) this.b;
        ImageReceiver imageReceiver2 = p71Var.N;
        if (z4) {
            if (p71Var.K == null && p71Var.a0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.nt0 nt0Var = p71Var.K;
            if (nt0Var != null) {
                int i12 = (int) p71Var.L;
                ArrayList arrayList = nt0Var.v;
                int indexOf = arrayList.indexOf(nt0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = nt0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.nt0 nt0Var2 = p71Var.K;
                int i13 = (int) p71Var.L;
                int videoDuration2 = nt0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                p71Var.O = (int) ((min % 5) * bitmapWidth);
                p71Var.P = (int) ((min / 5) * bitmapHeight);
                p71Var.Q = (int) bitmapWidth;
                p71Var.R = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= p71Var.a0.size()) {
                        o71Var = null;
                        break;
                    }
                    o71Var = (o71) p71Var.a0.get(i14);
                    double d = i14 == 0 ? 0.0d : o71Var.a;
                    double d10 = i14 == p71Var.a0.size() + (-1) ? 9.9999999E7d : ((o71) p71Var.a0.get(i14 + 1)).a;
                    double d11 = p71Var.L;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (o71Var == null) {
                    return;
                }
                p71Var.O = o71Var.b;
                p71Var.P = o71Var.c;
                p71Var.Q = p71Var.V;
                p71Var.R = p71Var.W;
            }
            p71Var.M = true;
            float f10 = p71Var.Q / p71Var.R;
            if (f10 > 1.0f) {
                i10 = (int) (dp / f10);
            } else {
                dp = (int) (dp * f10);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = p71Var.getLayoutParams();
            if (p71Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            p71Var.setVisibility(0);
            p71Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        xj0 xj0Var;
        switch (this.a) {
            case 14:
                yj0 yj0Var = (yj0) this.b;
                ArrayList arrayList = yj0Var.n;
                if (yj0Var.f.j(i10) != 0 || (xj0Var = yj0Var.C) == null) {
                    return true;
                }
                xj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                dn0 dn0Var = (dn0) this.b;
                cn0 cn0Var = dn0Var.c;
                MessageObject E = cn0Var.E(i10);
                dn0 dn0Var2 = cn0Var.c;
                if (E == null) {
                    return false;
                }
                if (!dn0Var.F.f()) {
                    dn0Var.F.a();
                    cn0Var.q(0, dn0Var2.r);
                }
                if (dn0Var.F.f()) {
                    dn0Var.F.d(E, view, 0);
                    if (!dn0Var.F.f()) {
                        cn0Var.q(0, dn0Var2.r);
                    }
                    org.telegram.ui.l10 l10Var = dn0Var.G;
                    int id2 = E.getId();
                    l10Var.a = E.getDialogId();
                    l10Var.b = id2;
                }
                return true;
        }
    }

    @Override // tf.j1
    public void g(int i10) {
        y60 y60Var = (y60) this.b;
        c70 c70Var = y60Var.n;
        c70Var.I(y60Var.f - 1);
        if (y60Var.h == null && !y60Var.e.e() && y60Var.h() <= 2) {
            c70Var.s.e(false, true);
        }
        y60Var.l();
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        Utilities.Callback callback = ((i51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((bz) this.b).v.Z0).clearRecentStickers();
                break;
            case 4:
                ((ey) this.b).run();
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
                zx0 zx0Var = (zx0) this.b;
                zx0Var.e.presentFragment(new StickersActivity(zx0Var.d, null));
                d2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((by0) this.b);
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ze0
    public void k(int i10, int i11) {
        nf0 nf0Var = ((mf0) this.b).d;
        if (i10 == nf0Var.b) {
            nf0Var.D = i11;
        } else if (i10 == nf0Var.r) {
            nf0Var.M = i11;
        } else if (i10 == nf0Var.d) {
            nf0Var.F = i11;
        } else if (i10 == nf0Var.c) {
            nf0Var.E = i11;
        } else if (i10 == nf0Var.f) {
            nf0Var.G = i11;
        } else if (i10 == nf0Var.e) {
            nf0Var.H = i11;
        } else if (i10 == nf0Var.v) {
            nf0Var.O = i11;
        } else if (i10 == nf0Var.s) {
            nf0Var.N = i11;
        } else if (i10 == nf0Var.w) {
            nf0Var.P = i11;
        } else if (i10 == nf0Var.x) {
            nf0Var.R = i11;
        } else if (i10 == nf0Var.h) {
            nf0Var.I = i11;
        } else if (i10 == nf0Var.n) {
            nf0Var.J = i11;
        }
        vz vzVar = nf0Var.i0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        nf0Var.g();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(int i10) {
        mv.P((mv) this.b, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((kb.a) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        nh.t6 storiesController;
        nh.t6 storiesController2;
        switch (this.a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.b).d;
                storiesController = yu0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(yu0Var.g1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.qr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 19;
                        yu0 yu0Var2 = yu0Var;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(i12, yu0Var2, m6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(i12, yu0Var2, m6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final yu0 yu0Var2 = ((bt0) this.b).d;
                storiesController2 = yu0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(yu0Var2.g1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.qr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 19;
                        yu0 yu0Var22 = yu0Var2;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(i12, yu0Var22, m6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(i12, yu0Var22, m6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                g41 g41Var = (g41) this.b;
                g41Var.b0 = str;
                g41Var.g0.N(true);
                break;
        }
    }

    @Override // tf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // org.telegram.ui.iy
    public boolean w(org.telegram.ui.oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        long j10;
        do0 do0Var = (do0) this.b;
        int i12 = do0Var.E0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = do0Var.w0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.l10) it.next()));
        }
        hashMap.clear();
        do0Var.Q(false);
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
            oyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i14 = android.support.v4.media.a.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            i14.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                i14.putLong("user_id", j12);
            } else {
                i14.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, oyVar)) {
                return true;
            }
        }
        org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i14);
        oyVar.presentFragment(xnVar, true);
        xnVar.Ab(arrayList2);
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
                jy jyVar = (jy) this.b;
                i51 i51Var = (i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                dy dyVar = jyVar.c;
                kz kzVar = jyVar.C;
                Object obj6 = i51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    ay ayVar = (ay) i51Var.H;
                    long j10 = jyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        jyVar.d = 0L;
                        stickerSet = null;
                        childCount = dyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            ah.e eVar = (ah.e) dyVar.getChildAt(i10);
                            if (eVar != view) {
                                eVar.a(false, true);
                            }
                        }
                        if (jyVar.d != 0 && jyVar.f.size() < jyVar.e.count && (stickerSet2 = MediaDataController.getInstance(kzVar.Z0).getStickerSet(jyVar.e, false)) != null) {
                            jyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) i51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        ah.c cVar = kzVar.I;
                        xd.a aVar = kzVar.b;
                        arrayList = jyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) jyVar.f.get(0);
                        }
                        kzVar.K(cVar, tLObject, stickerSet5, document, true, aVar.e <= 0.0f);
                        ((ah.e) view).a(jyVar.d == 0, true);
                        aVar.a(jyVar.d != 0, true);
                        jyVar.l();
                        kzVar.S.b();
                        if (jyVar.d == 0) {
                            dyVar.I1(view);
                            break;
                        }
                    } else {
                        jyVar.d = j11;
                        jyVar.f = ayVar.d;
                        jyVar.e = stickerSet;
                        childCount = dyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (jyVar.d != 0) {
                            jyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) i51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        ah.c cVar2 = kzVar.I;
                        xd.a aVar2 = kzVar.b;
                        arrayList = jyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) jyVar.f.get(0);
                        }
                        kzVar.K(cVar2, tLObject2, stickerSet52, document, true, aVar2.e <= 0.0f);
                        ((ah.e) view).a(jyVar.d == 0, true);
                        aVar2.a(jyVar.d != 0, true);
                        jyVar.l();
                        kzVar.S.b();
                        if (jyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = jyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            jyVar.d = 0L;
                        } else {
                            jyVar.d = j13;
                            jyVar.f = tL_messages_stickerSet.documents;
                            jyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = dyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (jyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) i51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            ah.c cVar22 = kzVar.I;
                            xd.a aVar22 = kzVar.b;
                            arrayList = jyVar.f;
                            if (arrayList != null) {
                            }
                            kzVar.K(cVar22, tLObject22, stickerSet522, document, true, aVar22.e <= 0.0f);
                            ((ah.e) view).a(jyVar.d == 0, true);
                            aVar22.a(jyVar.d != 0, true);
                            jyVar.l();
                            kzVar.S.b();
                            if (jyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = dyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (jyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) i51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    ah.c cVar222 = kzVar.I;
                    xd.a aVar222 = kzVar.b;
                    arrayList = jyVar.f;
                    if (arrayList != null) {
                    }
                    kzVar.K(cVar222, tLObject222, stickerSet5222, document, true, aVar222.e <= 0.0f);
                    ((ah.e) view).a(jyVar.d == 0, true);
                    aVar222.a(jyVar.d != 0, true);
                    jyVar.l();
                    kzVar.S.b();
                    if (jyVar.d == 0) {
                    }
                }
                break;
            case 3:
                fz fzVar = (fz) this.b;
                i51 i51Var2 = (i51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ez ezVar = fzVar.c;
                kz kzVar2 = fzVar.N;
                Object obj7 = i51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    ay ayVar2 = (ay) i51Var2.H;
                    long j14 = fzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        fzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = ezVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            ah.e eVar2 = (ah.e) ezVar.getChildAt(i11);
                            if (eVar2 != view2) {
                                eVar2.a(false, true);
                            }
                        }
                        if (fzVar.d != 0 && fzVar.f.size() < fzVar.e.count && (stickerSet4 = MediaDataController.getInstance(kzVar2.Z0).getStickerSet(fzVar.e, false)) != null) {
                            fzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) i51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        ah.c cVar3 = kzVar2.K;
                        xd.a aVar3 = kzVar2.a;
                        arrayList2 = fzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) fzVar.f.get(0);
                        }
                        kzVar2.K(cVar3, tLObject3, stickerSet7, document2, false, aVar3.e <= 0.0f);
                        ((ah.e) view2).a(fzVar.d == 0, true);
                        aVar3.a(fzVar.d != 0, true);
                        fzVar.l();
                        kzVar2.D0.b();
                        if (fzVar.d == 0) {
                            ezVar.I1(view2);
                            break;
                        }
                    } else {
                        fzVar.d = j15;
                        fzVar.f = ayVar2.d;
                        fzVar.e = stickerSet3;
                        childCount2 = ezVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (fzVar.d != 0) {
                            fzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) i51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        ah.c cVar32 = kzVar2.K;
                        xd.a aVar32 = kzVar2.a;
                        arrayList2 = fzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) fzVar.f.get(0);
                        }
                        kzVar2.K(cVar32, tLObject32, stickerSet72, document2, false, aVar32.e <= 0.0f);
                        ((ah.e) view2).a(fzVar.d == 0, true);
                        aVar32.a(fzVar.d != 0, true);
                        fzVar.l();
                        kzVar2.D0.b();
                        if (fzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = fzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            fzVar.d = 0L;
                        } else {
                            fzVar.d = j17;
                            fzVar.f = tL_messages_stickerSet2.documents;
                            fzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = ezVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (fzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) i51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            ah.c cVar322 = kzVar2.K;
                            xd.a aVar322 = kzVar2.a;
                            arrayList2 = fzVar.f;
                            if (arrayList2 != null) {
                            }
                            kzVar2.K(cVar322, tLObject322, stickerSet722, document2, false, aVar322.e <= 0.0f);
                            ((ah.e) view2).a(fzVar.d == 0, true);
                            aVar322.a(fzVar.d != 0, true);
                            fzVar.l();
                            kzVar2.D0.b();
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
                    TLObject tLObject3222 = (TLObject) i51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    ah.c cVar3222 = kzVar2.K;
                    xd.a aVar3222 = kzVar2.a;
                    arrayList2 = fzVar.f;
                    if (arrayList2 != null) {
                    }
                    kzVar2.K(cVar3222, tLObject3222, stickerSet7222, document2, false, aVar3222.e <= 0.0f);
                    ((ah.e) view2).a(fzVar.d == 0, true);
                    aVar3222.a(fzVar.d != 0, true);
                    fzVar.l();
                    kzVar2.D0.b();
                    if (fzVar.d == 0) {
                    }
                }
                break;
            case 11:
                eh0 eh0Var = (eh0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((i51) obj).G;
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
                    org.telegram.ui.oy oyVar = eh0Var.a;
                    org.telegram.ui.oy.d4(xnVar, messageObject);
                    oyVar.presentFragment(xnVar);
                    break;
                }
                break;
            case 15:
                sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((sl0) this.b).m2);
                break;
            default:
                sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((g61) this.b).m2);
                break;
        }
    }

    @Override // tf.j1
    public /* synthetic */ void T(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.w80
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w80
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.w80
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
    }
}
