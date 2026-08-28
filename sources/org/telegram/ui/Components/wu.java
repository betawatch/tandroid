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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, of.u1, GenericProvider, d80, ce0, ok0, org.telegram.ui.wx, ih.d7, MessagesStorage.StringCallback, p71, LanguageDetector.StringCallback, av0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wu(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(org.telegram.ui.dy dyVar) {
        return false;
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        dj0 dj0Var;
        switch (this.a) {
            case 14:
                ej0 ej0Var = (ej0) this.b;
                ArrayList arrayList = ej0Var.n;
                if (ej0Var.f.j(i9) != 0 || (dj0Var = ej0Var.B) == null) {
                    return true;
                }
                dj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i9)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i9));
                return true;
            default:
                gm0 gm0Var = (gm0) this.b;
                fm0 fm0Var = gm0Var.c;
                MessageObject E = fm0Var.E(i9);
                gm0 gm0Var2 = fm0Var.c;
                if (E == null) {
                    return false;
                }
                if (!gm0Var.E.f()) {
                    gm0Var.E.a();
                    fm0Var.q(0, gm0Var2.r);
                }
                if (gm0Var.E.f()) {
                    gm0Var.E.d(E, view, 0);
                    if (!gm0Var.E.f()) {
                        fm0Var.q(0, gm0Var2.r);
                    }
                    org.telegram.ui.x00 x00Var = gm0Var.F;
                    int id2 = E.getId();
                    x00Var.a = E.getDialogId();
                    x00Var.b = id2;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.d80
    public void c() {
        ((hd0) this.b).p(true);
    }

    @Override // ih.d7
    public void d(boolean z10) {
        ih.n6 n6Var = (ih.n6) this.b;
        if (z10) {
            n6Var.p(30, false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        q61 q61Var;
        int i9;
        int i10;
        r61 r61Var = (r61) this.b;
        ImageReceiver imageReceiver2 = r61Var.M;
        if (z10) {
            if (r61Var.J == null && r61Var.W == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.gt0 gt0Var = r61Var.J;
            if (gt0Var != null) {
                int i11 = (int) r61Var.K;
                ArrayList arrayList = gt0Var.v;
                int indexOf = arrayList.indexOf(gt0Var.c(i11));
                if (indexOf == -1) {
                    i10 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = gt0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i10 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i10 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i10, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i10 / 5.0f));
                org.telegram.ui.gt0 gt0Var2 = r61Var.J;
                int i12 = (int) r61Var.K;
                int videoDuration2 = gt0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                r61Var.N = (int) ((min % 5) * bitmapWidth);
                r61Var.O = (int) ((min / 5) * bitmapHeight);
                r61Var.P = (int) bitmapWidth;
                r61Var.Q = (int) bitmapHeight;
            } else {
                int i13 = 0;
                while (true) {
                    if (i13 >= r61Var.W.size()) {
                        q61Var = null;
                        break;
                    }
                    q61Var = (q61) r61Var.W.get(i13);
                    double d = i13 == 0 ? 0.0d : q61Var.a;
                    double d9 = i13 == r61Var.W.size() + (-1) ? 9.9999999E7d : ((q61) r61Var.W.get(i13 + 1)).a;
                    double d10 = r61Var.K;
                    if (d10 >= d && d10 <= d9) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (q61Var == null) {
                    return;
                }
                r61Var.N = q61Var.b;
                r61Var.O = q61Var.c;
                r61Var.P = r61Var.U;
                r61Var.Q = r61Var.V;
            }
            r61Var.L = true;
            float f10 = r61Var.P / r61Var.Q;
            if (f10 > 1.0f) {
                i9 = (int) (dp / f10);
            } else {
                dp = (int) (dp * f10);
                i9 = dp;
            }
            ViewGroup.LayoutParams layoutParams = r61Var.getLayoutParams();
            if (r61Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i9) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i9;
            r61Var.setVisibility(0);
            r61Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // of.u1
    public void e(int i9) {
        g60 g60Var = (g60) this.b;
        k60 k60Var = g60Var.n;
        k60Var.I(g60Var.f - 1);
        if (g60Var.h == null && !g60Var.e.e() && g60Var.h() <= 2) {
            k60Var.s.e(false, true);
        }
        g60Var.l();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((ny) this.b).v.Y0).clearRecentStickers();
                break;
            case 4:
                ((org.telegram.ui.rl) this.b).run();
                break;
            case 5:
                ((y10) this.b).n();
                break;
            case 6:
                k60.P((k60) this.b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 23:
                ex0 ex0Var = (ex0) this.b;
                ex0Var.e.presentFragment(new StickersActivity(ex0Var.d, null));
                c2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((gx0) this.b);
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public void g(int i9, int i10) {
        xu0 xu0Var = (xu0) this.b;
        xu0Var.w = i9;
        xu0Var.x = i10;
        fh.l2 l2Var = xu0Var.H;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        Utilities.Callback callback = ((l41) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i9));
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        dv.O((dv) this.b, i9);
    }

    @Override // org.telegram.ui.Components.ce0
    public void l(int i9, int i10) {
        qe0 qe0Var = ((pe0) this.b).d;
        if (i9 == qe0Var.b) {
            qe0Var.C = i10;
        } else if (i9 == qe0Var.r) {
            qe0Var.L = i10;
        } else if (i9 == qe0Var.d) {
            qe0Var.E = i10;
        } else if (i9 == qe0Var.c) {
            qe0Var.D = i10;
        } else if (i9 == qe0Var.f) {
            qe0Var.F = i10;
        } else if (i9 == qe0Var.e) {
            qe0Var.G = i10;
        } else if (i9 == qe0Var.v) {
            qe0Var.N = i10;
        } else if (i9 == qe0Var.s) {
            qe0Var.M = i10;
        } else if (i9 == qe0Var.w) {
            qe0Var.O = i10;
        } else if (i9 == qe0Var.x) {
            qe0Var.Q = i10;
        } else if (i9 == qe0Var.h) {
            qe0Var.H = i10;
        } else if (i9 == qe0Var.n) {
            qe0Var.I = i10;
        }
        hz hzVar = qe0Var.h0;
        if (hzVar != null) {
            hzVar.e(true, false, false);
        }
        qe0Var.g();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Float.valueOf(((gb.a) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        ih.v6 storiesController;
        ih.v6 storiesController2;
        switch (this.a) {
            case 19:
                final eu0 eu0Var = ((yq0) this.b).d;
                storiesController = eu0Var.getStoriesController();
                final int i9 = 0;
                storiesController.r(eu0Var.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.xq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i10 = i9;
                        int i11 = 13;
                        eu0 eu0Var2 = eu0Var;
                        ih.o6 o6Var = (ih.o6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(i11, eu0Var2, o6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(i11, eu0Var2, o6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final eu0 eu0Var2 = ((is0) this.b).d;
                storiesController2 = eu0Var2.getStoriesController();
                final int i10 = 1;
                storiesController2.r(eu0Var2.f1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.xq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i102 = i10;
                        int i11 = 13;
                        eu0 eu0Var22 = eu0Var2;
                        ih.o6 o6Var = (ih.o6) obj;
                        switch (i102) {
                            case 0:
                                int[] iArr = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(i11, eu0Var22, o6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(i11, eu0Var22, o6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                k31 k31Var = (k31) this.b;
                k31Var.a0 = str;
                k31Var.f0.N(true);
                break;
        }
    }

    @Override // org.telegram.ui.wx
    public boolean v(org.telegram.ui.dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        long j10;
        hn0 hn0Var = (hn0) this.b;
        int i11 = hn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = hn0Var.v0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) hashMap.get((org.telegram.ui.x00) it.next()));
        }
        hashMap.clear();
        hn0Var.Q(false);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                if (charSequence != null) {
                    j10 = j11;
                    AccountInstance.getInstance(i11).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j10 = j11;
                }
                AccountInstance.getInstance(i11).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
            }
            dyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle i13 = aa.d.i("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            i13.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                i13.putLong("user_id", j12);
            } else {
                i13.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i11).getMessagesController().checkCanOpenChat(i13, dyVar)) {
                return true;
            }
        }
        org.telegram.ui.qn qnVar = new org.telegram.ui.qn(i13);
        dyVar.presentFragment(qnVar, true);
        qnVar.Ab(arrayList2);
        return true;
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
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
        int i9;
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        int childCount2;
        int i10;
        TLRPC.Document document2;
        ArrayList arrayList2;
        TLRPC.TL_messages_stickerSet stickerSet4;
        switch (this.a) {
            case 1:
                vx vxVar = (vx) this.b;
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qx qxVar = vxVar.c;
                wy wyVar = vxVar.B;
                Object obj6 = l41Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    ox oxVar = (ox) l41Var.H;
                    long j10 = vxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        vxVar.d = 0L;
                        stickerSet = null;
                        childCount = qxVar.getChildCount();
                        for (i9 = 0; i9 < childCount; i9++) {
                            vg.d dVar = (vg.d) qxVar.getChildAt(i9);
                            if (dVar != view) {
                                dVar.a(false, true);
                            }
                        }
                        if (vxVar.d != 0 && vxVar.f.size() < vxVar.e.count && (stickerSet2 = MediaDataController.getInstance(wyVar.Y0).getStickerSet(vxVar.e, false)) != null) {
                            vxVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) l41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        vg.b bVar = wyVar.H;
                        td.a aVar = wyVar.b;
                        arrayList = vxVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) vxVar.f.get(0);
                        }
                        wyVar.K(bVar, tLObject, stickerSet5, document, true, aVar.e <= 0.0f);
                        ((vg.d) view).a(vxVar.d == 0, true);
                        aVar.a(vxVar.d != 0, true);
                        vxVar.l();
                        wyVar.R.b();
                        if (vxVar.d == 0) {
                            qxVar.I1(view);
                            break;
                        }
                    } else {
                        vxVar.d = j11;
                        vxVar.f = oxVar.d;
                        vxVar.e = stickerSet;
                        childCount = qxVar.getChildCount();
                        while (i9 < childCount) {
                        }
                        if (vxVar.d != 0) {
                            vxVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) l41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        vg.b bVar2 = wyVar.H;
                        td.a aVar2 = wyVar.b;
                        arrayList = vxVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) vxVar.f.get(0);
                        }
                        wyVar.K(bVar2, tLObject2, stickerSet52, document, true, aVar2.e <= 0.0f);
                        ((vg.d) view).a(vxVar.d == 0, true);
                        aVar2.a(vxVar.d != 0, true);
                        vxVar.l();
                        wyVar.R.b();
                        if (vxVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = vxVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            vxVar.d = 0L;
                        } else {
                            vxVar.d = j13;
                            vxVar.f = tL_messages_stickerSet.documents;
                            vxVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = qxVar.getChildCount();
                            while (i9 < childCount) {
                            }
                            if (vxVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) l41Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            vg.b bVar22 = wyVar.H;
                            td.a aVar22 = wyVar.b;
                            arrayList = vxVar.f;
                            if (arrayList != null) {
                            }
                            wyVar.K(bVar22, tLObject22, stickerSet522, document, true, aVar22.e <= 0.0f);
                            ((vg.d) view).a(vxVar.d == 0, true);
                            aVar22.a(vxVar.d != 0, true);
                            vxVar.l();
                            wyVar.R.b();
                            if (vxVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = qxVar.getChildCount();
                    while (i9 < childCount) {
                    }
                    if (vxVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) l41Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    vg.b bVar222 = wyVar.H;
                    td.a aVar222 = wyVar.b;
                    arrayList = vxVar.f;
                    if (arrayList != null) {
                    }
                    wyVar.K(bVar222, tLObject222, stickerSet5222, document, true, aVar222.e <= 0.0f);
                    ((vg.d) view).a(vxVar.d == 0, true);
                    aVar222.a(vxVar.d != 0, true);
                    vxVar.l();
                    wyVar.R.b();
                    if (vxVar.d == 0) {
                    }
                }
                break;
            case 3:
                ry ryVar = (ry) this.b;
                l41 l41Var2 = (l41) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                qy qyVar = ryVar.c;
                wy wyVar2 = ryVar.M;
                Object obj7 = l41Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    ox oxVar2 = (ox) l41Var2.H;
                    long j14 = ryVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        ryVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = qyVar.getChildCount();
                        for (i10 = 0; i10 < childCount2; i10++) {
                            vg.d dVar2 = (vg.d) qyVar.getChildAt(i10);
                            if (dVar2 != view2) {
                                dVar2.a(false, true);
                            }
                        }
                        if (ryVar.d != 0 && ryVar.f.size() < ryVar.e.count && (stickerSet4 = MediaDataController.getInstance(wyVar2.Y0).getStickerSet(ryVar.e, false)) != null) {
                            ryVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) l41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        vg.b bVar3 = wyVar2.J;
                        td.a aVar3 = wyVar2.a;
                        arrayList2 = ryVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) ryVar.f.get(0);
                        }
                        wyVar2.K(bVar3, tLObject3, stickerSet7, document2, false, aVar3.e <= 0.0f);
                        ((vg.d) view2).a(ryVar.d == 0, true);
                        aVar3.a(ryVar.d != 0, true);
                        ryVar.l();
                        wyVar2.C0.b();
                        if (ryVar.d == 0) {
                            qyVar.I1(view2);
                            break;
                        }
                    } else {
                        ryVar.d = j15;
                        ryVar.f = oxVar2.d;
                        ryVar.e = stickerSet3;
                        childCount2 = qyVar.getChildCount();
                        while (i10 < childCount2) {
                        }
                        if (ryVar.d != 0) {
                            ryVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) l41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        vg.b bVar32 = wyVar2.J;
                        td.a aVar32 = wyVar2.a;
                        arrayList2 = ryVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) ryVar.f.get(0);
                        }
                        wyVar2.K(bVar32, tLObject32, stickerSet72, document2, false, aVar32.e <= 0.0f);
                        ((vg.d) view2).a(ryVar.d == 0, true);
                        aVar32.a(ryVar.d != 0, true);
                        ryVar.l();
                        wyVar2.C0.b();
                        if (ryVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = ryVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            ryVar.d = 0L;
                        } else {
                            ryVar.d = j17;
                            ryVar.f = tL_messages_stickerSet2.documents;
                            ryVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = qyVar.getChildCount();
                            while (i10 < childCount2) {
                            }
                            if (ryVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) l41Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            vg.b bVar322 = wyVar2.J;
                            td.a aVar322 = wyVar2.a;
                            arrayList2 = ryVar.f;
                            if (arrayList2 != null) {
                            }
                            wyVar2.K(bVar322, tLObject322, stickerSet722, document2, false, aVar322.e <= 0.0f);
                            ((vg.d) view2).a(ryVar.d == 0, true);
                            aVar322.a(ryVar.d != 0, true);
                            ryVar.l();
                            wyVar2.C0.b();
                            if (ryVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = qyVar.getChildCount();
                    while (i10 < childCount2) {
                    }
                    if (ryVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) l41Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    vg.b bVar3222 = wyVar2.J;
                    td.a aVar3222 = wyVar2.a;
                    arrayList2 = ryVar.f;
                    if (arrayList2 != null) {
                    }
                    wyVar2.K(bVar3222, tLObject3222, stickerSet7222, document2, false, aVar3222.e <= 0.0f);
                    ((vg.d) view2).a(ryVar.d == 0, true);
                    aVar3222.a(ryVar.d != 0, true);
                    ryVar.l();
                    wyVar2.C0.b();
                    if (ryVar.d == 0) {
                    }
                }
                break;
            case 11:
                kg0 kg0Var = (kg0) this.b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((l41) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.qn qnVar = new org.telegram.ui.qn(bundle);
                    org.telegram.ui.dy dyVar = kg0Var.a;
                    org.telegram.ui.dy.d4(qnVar, messageObject);
                    dyVar.presentFragment(qnVar);
                    break;
                }
                break;
            case 15:
                wk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((wk0) this.b).l2);
                break;
            default:
                wk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((i51) this.b).l2);
                break;
        }
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
    }
}
