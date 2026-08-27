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
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, pf.i1, GenericProvider, h80, he0, rk0, org.telegram.ui.zx, jh.a7, MessagesStorage.StringCallback, r71, LanguageDetector.StringCallback, cv0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // org.telegram.ui.zx
    public /* synthetic */ boolean K(org.telegram.ui.gy gyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        fj0 fj0Var;
        switch (this.a) {
            case 14:
                gj0 gj0Var = (gj0) this.b;
                ArrayList arrayList = gj0Var.n;
                if (gj0Var.f.j(i10) != 0 || (fj0Var = gj0Var.B) == null) {
                    return true;
                }
                fj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                jm0 jm0Var = (jm0) this.b;
                im0 im0Var = jm0Var.c;
                MessageObject E = im0Var.E(i10);
                jm0 jm0Var2 = im0Var.c;
                if (E == null) {
                    return false;
                }
                if (!jm0Var.E.f()) {
                    jm0Var.E.a();
                    im0Var.q(0, jm0Var2.r);
                }
                if (jm0Var.E.f()) {
                    jm0Var.E.d(E, view, 0);
                    if (!jm0Var.E.f()) {
                        im0Var.q(0, jm0Var2.r);
                    }
                    org.telegram.ui.a10 a10Var = jm0Var.F;
                    int id2 = E.getId();
                    a10Var.a = E.getDialogId();
                    a10Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.h80
    public void c() {
        ((md0) this.b).q(true);
    }

    @Override // org.telegram.ui.Components.r71
    public void d(int i10, int i11) {
        zu0 zu0Var = (zu0) this.b;
        zu0Var.w = i10;
        zu0Var.x = i11;
        ag.s0 s0Var = zu0Var.H;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        s61 s61Var;
        int i10;
        int i11;
        t61 t61Var = (t61) this.b;
        ImageReceiver imageReceiver2 = t61Var.M;
        if (z10) {
            if (t61Var.J == null && t61Var.W == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.ht0 ht0Var = t61Var.J;
            if (ht0Var != null) {
                int i12 = (int) t61Var.K;
                ArrayList arrayList = ht0Var.v;
                int indexOf = arrayList.indexOf(ht0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = ht0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.ht0 ht0Var2 = t61Var.J;
                int i13 = (int) t61Var.K;
                int videoDuration2 = ht0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                t61Var.N = (int) ((min % 5) * bitmapWidth);
                t61Var.O = (int) ((min / 5) * bitmapHeight);
                t61Var.P = (int) bitmapWidth;
                t61Var.Q = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= t61Var.W.size()) {
                        s61Var = null;
                        break;
                    }
                    s61Var = (s61) t61Var.W.get(i14);
                    double d = i14 == 0 ? 0.0d : s61Var.a;
                    double d10 = i14 == t61Var.W.size() + (-1) ? 9.9999999E7d : ((s61) t61Var.W.get(i14 + 1)).a;
                    double d11 = t61Var.K;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (s61Var == null) {
                    return;
                }
                t61Var.N = s61Var.b;
                t61Var.O = s61Var.c;
                t61Var.P = t61Var.U;
                t61Var.Q = t61Var.V;
            }
            t61Var.L = true;
            float f10 = t61Var.P / t61Var.Q;
            if (f10 > 1.0f) {
                i10 = (int) (dp / f10);
            } else {
                dp = (int) (dp * f10);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = t61Var.getLayoutParams();
            if (t61Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            t61Var.setVisibility(0);
            t61Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // jh.a7
    public void e(boolean z10) {
        jh.j6 j6Var = (jh.j6) this.b;
        if (z10) {
            j6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((py) this.b).v.Y0).clearRecentStickers();
                break;
            case 4:
                ((km) this.b).run();
                break;
            case 5:
                ((b20) this.b).n();
                break;
            case 6:
                p60.Q((p60) this.b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 23:
                gx0 gx0Var = (gx0) this.b;
                gx0Var.e.presentFragment(new StickersActivity(gx0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((ix0) this.b);
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        cv.P((cv) this.b, i10);
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        l60 l60Var = (l60) this.b;
        p60 p60Var = l60Var.n;
        p60Var.J(l60Var.f - 1);
        if (l60Var.h == null && !l60Var.e.e() && l60Var.h() <= 2) {
            p60Var.s.e(false, true);
        }
        l60Var.l();
    }

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        Utilities.Callback callback = ((n41) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.he0
    public void l(int i10, int i11) {
        ve0 ve0Var = ((ue0) this.b).d;
        if (i10 == ve0Var.b) {
            ve0Var.C = i11;
        } else if (i10 == ve0Var.r) {
            ve0Var.L = i11;
        } else if (i10 == ve0Var.d) {
            ve0Var.E = i11;
        } else if (i10 == ve0Var.c) {
            ve0Var.D = i11;
        } else if (i10 == ve0Var.f) {
            ve0Var.F = i11;
        } else if (i10 == ve0Var.e) {
            ve0Var.G = i11;
        } else if (i10 == ve0Var.v) {
            ve0Var.N = i11;
        } else if (i10 == ve0Var.s) {
            ve0Var.M = i11;
        } else if (i10 == ve0Var.w) {
            ve0Var.O = i11;
        } else if (i10 == ve0Var.x) {
            ve0Var.Q = i11;
        } else if (i10 == ve0Var.h) {
            ve0Var.H = i11;
        } else if (i10 == ve0Var.n) {
            ve0Var.I = i11;
        }
        jz jzVar = ve0Var.h0;
        if (jzVar != null) {
            jzVar.e(true, false, false);
        }
        ve0Var.g();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((hb.a) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        jh.s6 storiesController;
        jh.s6 storiesController2;
        switch (this.a) {
            case 19:
                final hu0 hu0Var = ((zq0) this.b).d;
                storiesController = hu0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(hu0Var.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.yq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 13;
                        hu0 hu0Var2 = hu0Var;
                        jh.k6 k6Var = (jh.k6) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var2, k6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var2, k6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final hu0 hu0Var2 = ((ks0) this.b).d;
                storiesController2 = hu0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(hu0Var2.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.yq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 13;
                        hu0 hu0Var22 = hu0Var2;
                        jh.k6 k6Var = (jh.k6) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var22, k6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var22, k6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                m31 m31Var = (m31) this.b;
                m31Var.a0 = str;
                m31Var.f0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.zx
    public boolean w(org.telegram.ui.gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        long j10;
        jn0 jn0Var = (jn0) this.b;
        int i12 = jn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = jn0Var.v0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.a10) it.next()));
        }
        hashMap.clear();
        jn0Var.Q(false);
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
            gyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle h = a9.p.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            h.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                h.putLong("user_id", j12);
            } else {
                h.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, gyVar)) {
                return true;
            }
        }
        org.telegram.ui.rn rnVar = new org.telegram.ui.rn(h);
        gyVar.presentFragment(rnVar, true);
        rnVar.Ab(arrayList2);
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
                wx wxVar = (wx) this.b;
                n41 n41Var = (n41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                rx rxVar = wxVar.c;
                yy yyVar = wxVar.B;
                Object obj6 = n41Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    px pxVar = (px) n41Var.H;
                    long j10 = wxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        wxVar.d = 0L;
                        stickerSet = null;
                        childCount = rxVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            wg.c cVar = (wg.c) rxVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (wxVar.d != 0 && wxVar.f.size() < wxVar.e.count && (stickerSet2 = MediaDataController.getInstance(yyVar.Y0).getStickerSet(wxVar.e, false)) != null) {
                            wxVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) n41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        wg.b bVar = yyVar.H;
                        ud.a aVar = yyVar.b;
                        arrayList = wxVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) wxVar.f.get(0);
                        }
                        yyVar.L(bVar, tLObject, stickerSet5, document, true, aVar.e <= 0.0f);
                        ((wg.c) view).a(wxVar.d == 0, true);
                        aVar.a(wxVar.d != 0, true);
                        wxVar.l();
                        yyVar.R.b();
                        if (wxVar.d == 0) {
                            rxVar.I1(view);
                            break;
                        }
                    } else {
                        wxVar.d = j11;
                        wxVar.f = pxVar.d;
                        wxVar.e = stickerSet;
                        childCount = rxVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (wxVar.d != 0) {
                            wxVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) n41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        wg.b bVar2 = yyVar.H;
                        ud.a aVar2 = yyVar.b;
                        arrayList = wxVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) wxVar.f.get(0);
                        }
                        yyVar.L(bVar2, tLObject2, stickerSet52, document, true, aVar2.e <= 0.0f);
                        ((wg.c) view).a(wxVar.d == 0, true);
                        aVar2.a(wxVar.d != 0, true);
                        wxVar.l();
                        yyVar.R.b();
                        if (wxVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = wxVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            wxVar.d = 0L;
                        } else {
                            wxVar.d = j13;
                            wxVar.f = tL_messages_stickerSet.documents;
                            wxVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = rxVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (wxVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) n41Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            wg.b bVar22 = yyVar.H;
                            ud.a aVar22 = yyVar.b;
                            arrayList = wxVar.f;
                            if (arrayList != null) {
                            }
                            yyVar.L(bVar22, tLObject22, stickerSet522, document, true, aVar22.e <= 0.0f);
                            ((wg.c) view).a(wxVar.d == 0, true);
                            aVar22.a(wxVar.d != 0, true);
                            wxVar.l();
                            yyVar.R.b();
                            if (wxVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = rxVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (wxVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) n41Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    wg.b bVar222 = yyVar.H;
                    ud.a aVar222 = yyVar.b;
                    arrayList = wxVar.f;
                    if (arrayList != null) {
                    }
                    yyVar.L(bVar222, tLObject222, stickerSet5222, document, true, aVar222.e <= 0.0f);
                    ((wg.c) view).a(wxVar.d == 0, true);
                    aVar222.a(wxVar.d != 0, true);
                    wxVar.l();
                    yyVar.R.b();
                    if (wxVar.d == 0) {
                    }
                }
                break;
            case 3:
                ty tyVar = (ty) this.b;
                n41 n41Var2 = (n41) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                sy syVar = tyVar.c;
                yy yyVar2 = tyVar.M;
                Object obj7 = n41Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    px pxVar2 = (px) n41Var2.H;
                    long j14 = tyVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        tyVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = syVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            wg.c cVar2 = (wg.c) syVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (tyVar.d != 0 && tyVar.f.size() < tyVar.e.count && (stickerSet4 = MediaDataController.getInstance(yyVar2.Y0).getStickerSet(tyVar.e, false)) != null) {
                            tyVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) n41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        wg.b bVar3 = yyVar2.J;
                        ud.a aVar3 = yyVar2.a;
                        arrayList2 = tyVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) tyVar.f.get(0);
                        }
                        yyVar2.L(bVar3, tLObject3, stickerSet7, document2, false, aVar3.e <= 0.0f);
                        ((wg.c) view2).a(tyVar.d == 0, true);
                        aVar3.a(tyVar.d != 0, true);
                        tyVar.l();
                        yyVar2.C0.b();
                        if (tyVar.d == 0) {
                            syVar.I1(view2);
                            break;
                        }
                    } else {
                        tyVar.d = j15;
                        tyVar.f = pxVar2.d;
                        tyVar.e = stickerSet3;
                        childCount2 = syVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (tyVar.d != 0) {
                            tyVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) n41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        wg.b bVar32 = yyVar2.J;
                        ud.a aVar32 = yyVar2.a;
                        arrayList2 = tyVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) tyVar.f.get(0);
                        }
                        yyVar2.L(bVar32, tLObject32, stickerSet72, document2, false, aVar32.e <= 0.0f);
                        ((wg.c) view2).a(tyVar.d == 0, true);
                        aVar32.a(tyVar.d != 0, true);
                        tyVar.l();
                        yyVar2.C0.b();
                        if (tyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = tyVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            tyVar.d = 0L;
                        } else {
                            tyVar.d = j17;
                            tyVar.f = tL_messages_stickerSet2.documents;
                            tyVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = syVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (tyVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) n41Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            wg.b bVar322 = yyVar2.J;
                            ud.a aVar322 = yyVar2.a;
                            arrayList2 = tyVar.f;
                            if (arrayList2 != null) {
                            }
                            yyVar2.L(bVar322, tLObject322, stickerSet722, document2, false, aVar322.e <= 0.0f);
                            ((wg.c) view2).a(tyVar.d == 0, true);
                            aVar322.a(tyVar.d != 0, true);
                            tyVar.l();
                            yyVar2.C0.b();
                            if (tyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = syVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (tyVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) n41Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    wg.b bVar3222 = yyVar2.J;
                    ud.a aVar3222 = yyVar2.a;
                    arrayList2 = tyVar.f;
                    if (arrayList2 != null) {
                    }
                    yyVar2.L(bVar3222, tLObject3222, stickerSet7222, document2, false, aVar3222.e <= 0.0f);
                    ((wg.c) view2).a(tyVar.d == 0, true);
                    aVar3222.a(tyVar.d != 0, true);
                    tyVar.l();
                    yyVar2.C0.b();
                    if (tyVar.d == 0) {
                    }
                }
                break;
            case 11:
                mg0 mg0Var = (mg0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((n41) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle);
                    org.telegram.ui.gy gyVar = mg0Var.a;
                    org.telegram.ui.gy.d4(rnVar, messageObject);
                    gyVar.presentFragment(rnVar);
                    break;
                }
                break;
            case 15:
                zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((zk0) this.b).l2);
                break;
            default:
                zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((k51) this.b).l2);
                break;
        }
    }

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.h80
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.h80
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.h80
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.cv0
    public /* synthetic */ void m() {
    }
}
