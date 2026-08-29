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
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, rf.j1, GenericProvider, q80, qe0, bl0, org.telegram.ui.yx, lh.a7, MessagesStorage.StringCallback, b81, LanguageDetector.StringCallback, kv0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        return true;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(org.telegram.ui.fy fyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.q80
    public void b() {
        ((vd0) this.b).p(true);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        oj0 oj0Var;
        switch (this.a) {
            case 14:
                pj0 pj0Var = (pj0) this.b;
                ArrayList arrayList = pj0Var.n;
                if (pj0Var.f.j(i10) != 0 || (oj0Var = pj0Var.B) == null) {
                    return true;
                }
                oj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                tm0 tm0Var = (tm0) this.b;
                sm0 sm0Var = tm0Var.c;
                MessageObject E = sm0Var.E(i10);
                tm0 tm0Var2 = sm0Var.c;
                if (E == null) {
                    return false;
                }
                if (!tm0Var.E.f()) {
                    tm0Var.E.a();
                    sm0Var.q(0, tm0Var2.r);
                }
                if (tm0Var.E.f()) {
                    tm0Var.E.d(E, view, 0);
                    if (!tm0Var.E.f()) {
                        sm0Var.q(0, tm0Var2.r);
                    }
                    org.telegram.ui.z00 z00Var = tm0Var.F;
                    int id2 = E.getId();
                    z00Var.a = E.getDialogId();
                    z00Var.b = id2;
                }
                return true;
        }
    }

    @Override // lh.a7
    public void d(boolean z10) {
        lh.k6 k6Var = (lh.k6) this.b;
        if (z10) {
            k6Var.p(30, false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        c71 c71Var;
        int i10;
        int i11;
        d71 d71Var = (d71) this.b;
        ImageReceiver imageReceiver2 = d71Var.M;
        if (z10) {
            if (d71Var.J == null && d71Var.W == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.et0 et0Var = d71Var.J;
            if (et0Var != null) {
                int i12 = (int) d71Var.K;
                ArrayList arrayList = et0Var.v;
                int indexOf = arrayList.indexOf(et0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = et0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.et0 et0Var2 = d71Var.J;
                int i13 = (int) d71Var.K;
                int videoDuration2 = et0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                d71Var.N = (int) ((min % 5) * bitmapWidth);
                d71Var.O = (int) ((min / 5) * bitmapHeight);
                d71Var.P = (int) bitmapWidth;
                d71Var.Q = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= d71Var.W.size()) {
                        c71Var = null;
                        break;
                    }
                    c71Var = (c71) d71Var.W.get(i14);
                    double d = i14 == 0 ? 0.0d : c71Var.a;
                    double d10 = i14 == d71Var.W.size() + (-1) ? 9.9999999E7d : ((c71) d71Var.W.get(i14 + 1)).a;
                    double d11 = d71Var.K;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (c71Var == null) {
                    return;
                }
                d71Var.N = c71Var.b;
                d71Var.O = c71Var.c;
                d71Var.P = d71Var.U;
                d71Var.Q = d71Var.V;
            }
            d71Var.L = true;
            float f9 = d71Var.P / d71Var.Q;
            if (f9 > 1.0f) {
                i10 = (int) (dp / f9);
            } else {
                dp = (int) (dp * f9);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = d71Var.getLayoutParams();
            if (d71Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            d71Var.setVisibility(0);
            d71Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.b81
    public void e(int i10, int i11) {
        hv0 hv0Var = (hv0) this.b;
        hv0Var.w = i10;
        hv0Var.x = i11;
        cg.h0 h0Var = hv0Var.H;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override // rf.j1
    public void f(int i10) {
        t60 t60Var = (t60) this.b;
        x60 x60Var = t60Var.n;
        x60Var.I(t60Var.f - 1);
        if (t60Var.h == null && !t60Var.e.e() && t60Var.h() <= 2) {
            x60Var.s.e(false, true);
        }
        t60Var.l();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((wy) this.b).v.Y0).clearRecentStickers();
                break;
            case 4:
                ((rm) this.b).run();
                break;
            case 5:
                ((j20) this.b).n();
                break;
            case 6:
                x60.Q((x60) this.b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 23:
                px0 px0Var = (px0) this.b;
                px0Var.e.presentFragment(new StickersActivity(px0Var.d, null));
                c2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((rx0) this.b);
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        Utilities.Callback callback = ((w41) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        jv.P((jv) this.b, i10);
    }

    @Override // org.telegram.ui.Components.qe0
    public void l(int i10, int i11) {
        ef0 ef0Var = ((df0) this.b).d;
        if (i10 == ef0Var.b) {
            ef0Var.C = i11;
        } else if (i10 == ef0Var.r) {
            ef0Var.L = i11;
        } else if (i10 == ef0Var.d) {
            ef0Var.E = i11;
        } else if (i10 == ef0Var.c) {
            ef0Var.D = i11;
        } else if (i10 == ef0Var.f) {
            ef0Var.F = i11;
        } else if (i10 == ef0Var.e) {
            ef0Var.G = i11;
        } else if (i10 == ef0Var.v) {
            ef0Var.N = i11;
        } else if (i10 == ef0Var.s) {
            ef0Var.M = i11;
        } else if (i10 == ef0Var.w) {
            ef0Var.O = i11;
        } else if (i10 == ef0Var.x) {
            ef0Var.Q = i11;
        } else if (i10 == ef0Var.h) {
            ef0Var.H = i11;
        } else if (i10 == ef0Var.n) {
            ef0Var.I = i11;
        }
        qz qzVar = ef0Var.h0;
        if (qzVar != null) {
            qzVar.e(true, false, false);
        }
        ef0Var.g();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((ib.a) this.b).a / 100.0f);
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        return null;
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        lh.s6 storiesController;
        lh.s6 storiesController2;
        switch (this.a) {
            case 19:
                final qu0 qu0Var = ((jr0) this.b).d;
                storiesController = qu0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(qu0Var.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ir0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 10;
                        qu0 qu0Var2 = qu0Var;
                        lh.l6 l6Var = (lh.l6) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(i12, qu0Var2, l6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(i12, qu0Var2, l6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final qu0 qu0Var2 = ((ts0) this.b).d;
                storiesController2 = qu0Var2.getStoriesController();
                final int i11 = 1;
                storiesController2.r(qu0Var2.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.ir0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i112 = i11;
                        int i12 = 10;
                        qu0 qu0Var22 = qu0Var2;
                        lh.l6 l6Var = (lh.l6) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(i12, qu0Var22, l6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(i12, qu0Var22, l6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                v31 v31Var = (v31) this.b;
                v31Var.a0 = str;
                v31Var.f0.N(true);
                break;
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // org.telegram.ui.yx
    public boolean v(org.telegram.ui.fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        long j10;
        tn0 tn0Var = (tn0) this.b;
        int i12 = tn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = tn0Var.v0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.z00) it.next()));
        }
        hashMap.clear();
        tn0Var.Q(false);
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
            fyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i14 = a4.w.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            i14.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                i14.putLong("user_id", j12);
            } else {
                i14.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, fyVar)) {
                return true;
            }
        }
        org.telegram.ui.tn tnVar = new org.telegram.ui.tn(i14);
        fyVar.presentFragment(tnVar, true);
        tnVar.Ab(arrayList2);
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
                ey eyVar = (ey) this.b;
                w41 w41Var = (w41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                yx yxVar = eyVar.c;
                fz fzVar = eyVar.B;
                Object obj6 = w41Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    wx wxVar = (wx) w41Var.H;
                    long j10 = eyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        eyVar.d = 0L;
                        stickerSet = null;
                        childCount = yxVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            yg.c cVar = (yg.c) yxVar.getChildAt(i10);
                            if (cVar != view) {
                                cVar.a(false, true);
                            }
                        }
                        if (eyVar.d != 0 && eyVar.f.size() < eyVar.e.count && (stickerSet2 = MediaDataController.getInstance(fzVar.Y0).getStickerSet(eyVar.e, false)) != null) {
                            eyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) w41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        yg.b bVar = fzVar.H;
                        vd.a aVar = fzVar.b;
                        arrayList = eyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) eyVar.f.get(0);
                        }
                        fzVar.K(bVar, tLObject, stickerSet5, document, true, aVar.e <= 0.0f);
                        ((yg.c) view).a(eyVar.d == 0, true);
                        aVar.a(eyVar.d != 0, true);
                        eyVar.l();
                        fzVar.R.b();
                        if (eyVar.d == 0) {
                            yxVar.I1(view);
                            break;
                        }
                    } else {
                        eyVar.d = j11;
                        eyVar.f = wxVar.d;
                        eyVar.e = stickerSet;
                        childCount = yxVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (eyVar.d != 0) {
                            eyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) w41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        yg.b bVar2 = fzVar.H;
                        vd.a aVar2 = fzVar.b;
                        arrayList = eyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) eyVar.f.get(0);
                        }
                        fzVar.K(bVar2, tLObject2, stickerSet52, document, true, aVar2.e <= 0.0f);
                        ((yg.c) view).a(eyVar.d == 0, true);
                        aVar2.a(eyVar.d != 0, true);
                        eyVar.l();
                        fzVar.R.b();
                        if (eyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = eyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            eyVar.d = 0L;
                        } else {
                            eyVar.d = j13;
                            eyVar.f = tL_messages_stickerSet.documents;
                            eyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = yxVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (eyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) w41Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            yg.b bVar22 = fzVar.H;
                            vd.a aVar22 = fzVar.b;
                            arrayList = eyVar.f;
                            if (arrayList != null) {
                            }
                            fzVar.K(bVar22, tLObject22, stickerSet522, document, true, aVar22.e <= 0.0f);
                            ((yg.c) view).a(eyVar.d == 0, true);
                            aVar22.a(eyVar.d != 0, true);
                            eyVar.l();
                            fzVar.R.b();
                            if (eyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = yxVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (eyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) w41Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    yg.b bVar222 = fzVar.H;
                    vd.a aVar222 = fzVar.b;
                    arrayList = eyVar.f;
                    if (arrayList != null) {
                    }
                    fzVar.K(bVar222, tLObject222, stickerSet5222, document, true, aVar222.e <= 0.0f);
                    ((yg.c) view).a(eyVar.d == 0, true);
                    aVar222.a(eyVar.d != 0, true);
                    eyVar.l();
                    fzVar.R.b();
                    if (eyVar.d == 0) {
                    }
                }
                break;
            case 3:
                az azVar = (az) this.b;
                w41 w41Var2 = (w41) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                zy zyVar = azVar.c;
                fz fzVar2 = azVar.M;
                Object obj7 = w41Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    wx wxVar2 = (wx) w41Var2.H;
                    long j14 = azVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        azVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = zyVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            yg.c cVar2 = (yg.c) zyVar.getChildAt(i11);
                            if (cVar2 != view2) {
                                cVar2.a(false, true);
                            }
                        }
                        if (azVar.d != 0 && azVar.f.size() < azVar.e.count && (stickerSet4 = MediaDataController.getInstance(fzVar2.Y0).getStickerSet(azVar.e, false)) != null) {
                            azVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) w41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        yg.b bVar3 = fzVar2.J;
                        vd.a aVar3 = fzVar2.a;
                        arrayList2 = azVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) azVar.f.get(0);
                        }
                        fzVar2.K(bVar3, tLObject3, stickerSet7, document2, false, aVar3.e <= 0.0f);
                        ((yg.c) view2).a(azVar.d == 0, true);
                        aVar3.a(azVar.d != 0, true);
                        azVar.l();
                        fzVar2.C0.b();
                        if (azVar.d == 0) {
                            zyVar.I1(view2);
                            break;
                        }
                    } else {
                        azVar.d = j15;
                        azVar.f = wxVar2.d;
                        azVar.e = stickerSet3;
                        childCount2 = zyVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (azVar.d != 0) {
                            azVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) w41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        yg.b bVar32 = fzVar2.J;
                        vd.a aVar32 = fzVar2.a;
                        arrayList2 = azVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) azVar.f.get(0);
                        }
                        fzVar2.K(bVar32, tLObject32, stickerSet72, document2, false, aVar32.e <= 0.0f);
                        ((yg.c) view2).a(azVar.d == 0, true);
                        aVar32.a(azVar.d != 0, true);
                        azVar.l();
                        fzVar2.C0.b();
                        if (azVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = azVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            azVar.d = 0L;
                        } else {
                            azVar.d = j17;
                            azVar.f = tL_messages_stickerSet2.documents;
                            azVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = zyVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (azVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) w41Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            yg.b bVar322 = fzVar2.J;
                            vd.a aVar322 = fzVar2.a;
                            arrayList2 = azVar.f;
                            if (arrayList2 != null) {
                            }
                            fzVar2.K(bVar322, tLObject322, stickerSet722, document2, false, aVar322.e <= 0.0f);
                            ((yg.c) view2).a(azVar.d == 0, true);
                            aVar322.a(azVar.d != 0, true);
                            azVar.l();
                            fzVar2.C0.b();
                            if (azVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = zyVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (azVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) w41Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    yg.b bVar3222 = fzVar2.J;
                    vd.a aVar3222 = fzVar2.a;
                    arrayList2 = azVar.f;
                    if (arrayList2 != null) {
                    }
                    fzVar2.K(bVar3222, tLObject3222, stickerSet7222, document2, false, aVar3222.e <= 0.0f);
                    ((yg.c) view2).a(azVar.d == 0, true);
                    aVar3222.a(azVar.d != 0, true);
                    azVar.l();
                    fzVar2.C0.b();
                    if (azVar.d == 0) {
                    }
                }
                break;
            case 11:
                ug0 ug0Var = (ug0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((w41) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.tn tnVar = new org.telegram.ui.tn(bundle);
                    org.telegram.ui.fy fyVar = ug0Var.a;
                    org.telegram.ui.fy.d4(tnVar, messageObject);
                    fyVar.presentFragment(tnVar);
                    break;
                }
                break;
            case 15:
                jl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((jl0) this.b).l2);
                break;
            default:
                jl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((u51) this.b).l2);
                break;
        }
    }

    @Override // rf.j1
    public /* synthetic */ void E(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.q80
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q80
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.q80
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }
}
