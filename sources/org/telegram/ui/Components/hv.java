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
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, uf.j1, GenericProvider, x80, bf0, kl0, org.telegram.ui.jy, oh.b7, MessagesStorage.StringCallback, n81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(org.telegram.ui.py pyVar) {
        return false;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        return true;
    }

    @Override // oh.b7
    public void b(boolean z4) {
        oh.l6 l6Var = (oh.l6) this.b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.x80
    public void c() {
        ((fe0) this.b).p(true);
    }

    @Override // org.telegram.ui.Components.n81
    public void d(int i10, int i11) {
        pv0 pv0Var = (pv0) this.b;
        pv0Var.w = i10;
        pv0Var.x = i11;
        fg.h0 h0Var = pv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        p71 p71Var;
        int i10;
        int i11;
        q71 q71Var = (q71) this.b;
        ImageReceiver imageReceiver2 = q71Var.N;
        if (z4) {
            if (q71Var.K == null && q71Var.a0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.ut0 ut0Var = q71Var.K;
            if (ut0Var != null) {
                int i12 = (int) q71Var.L;
                ArrayList arrayList = ut0Var.v;
                int indexOf = arrayList.indexOf(ut0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = ut0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.ut0 ut0Var2 = q71Var.K;
                int i13 = (int) q71Var.L;
                int videoDuration2 = ut0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                q71Var.O = (int) ((min % 5) * bitmapWidth);
                q71Var.P = (int) ((min / 5) * bitmapHeight);
                q71Var.Q = (int) bitmapWidth;
                q71Var.R = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= q71Var.a0.size()) {
                        p71Var = null;
                        break;
                    }
                    p71Var = (p71) q71Var.a0.get(i14);
                    double d = i14 == 0 ? 0.0d : p71Var.a;
                    double d10 = i14 == q71Var.a0.size() + (-1) ? 9.9999999E7d : ((p71) q71Var.a0.get(i14 + 1)).a;
                    double d11 = q71Var.L;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (p71Var == null) {
                    return;
                }
                q71Var.O = p71Var.b;
                q71Var.P = p71Var.c;
                q71Var.Q = q71Var.V;
                q71Var.R = q71Var.W;
            }
            q71Var.M = true;
            float f10 = q71Var.Q / q71Var.R;
            if (f10 > 1.0f) {
                i10 = (int) (dp / f10);
            } else {
                dp = (int) (dp * f10);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = q71Var.getLayoutParams();
            if (q71Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            q71Var.setVisibility(0);
            q71Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        yj0 yj0Var;
        switch (this.a) {
            case 14:
                zj0 zj0Var = (zj0) this.b;
                ArrayList arrayList = zj0Var.n;
                if (zj0Var.f.j(i10) != 0 || (yj0Var = zj0Var.C) == null) {
                    return true;
                }
                yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
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

    @Override // uf.j1
    public void g(int i10) {
        a70 a70Var = (a70) this.b;
        e70 e70Var = a70Var.n;
        e70Var.I(a70Var.f - 1);
        if (a70Var.h == null && !a70Var.e.e() && a70Var.h() <= 2) {
            e70Var.s.e(false, true);
        }
        a70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        ov.P((ov) this.b, i10);
    }

    @Override // org.telegram.ui.Components.tv0
    public void i(int i10) {
        Utilities.Callback callback = ((h51) this.b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                MediaDataController.getInstance(((dz) this.b).v.Z0).clearRecentStickers();
                break;
            case 4:
                ((gy) this.b).run();
                break;
            case 5:
                ((p20) this.b).n();
                break;
            case 6:
                e70.Q((e70) this.b);
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

    @Override // org.telegram.ui.Components.bf0
    public void l(int i10, int i11) {
        pf0 pf0Var = ((of0) this.b).d;
        if (i10 == pf0Var.b) {
            pf0Var.D = i11;
        } else if (i10 == pf0Var.r) {
            pf0Var.M = i11;
        } else if (i10 == pf0Var.d) {
            pf0Var.F = i11;
        } else if (i10 == pf0Var.c) {
            pf0Var.E = i11;
        } else if (i10 == pf0Var.f) {
            pf0Var.G = i11;
        } else if (i10 == pf0Var.e) {
            pf0Var.H = i11;
        } else if (i10 == pf0Var.v) {
            pf0Var.O = i11;
        } else if (i10 == pf0Var.s) {
            pf0Var.N = i11;
        } else if (i10 == pf0Var.w) {
            pf0Var.P = i11;
        } else if (i10 == pf0Var.x) {
            pf0Var.R = i11;
        } else if (i10 == pf0Var.h) {
            pf0Var.I = i11;
        } else if (i10 == pf0Var.n) {
            pf0Var.J = i11;
        }
        xz xzVar = pf0Var.i0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        pf0Var.g();
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
        oh.t6 storiesController;
        oh.t6 storiesController2;
        switch (this.a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.b).d;
                storiesController = yu0Var.getStoriesController();
                final int i10 = 0;
                storiesController.r(yu0Var.g1, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.qr0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 17;
                        yu0 yu0Var2 = yu0Var;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(i12, yu0Var2, m6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(i12, yu0Var2, m6Var), 100L);
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
                        int i12 = 17;
                        yu0 yu0Var22 = yu0Var2;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i112) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(i12, yu0Var22, m6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(i12, yu0Var22, m6Var), 100L);
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

    @Override // org.telegram.ui.jy
    public boolean v(org.telegram.ui.py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
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
            pyVar.finishFragment();
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
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i14, pyVar)) {
                return true;
            }
        }
        org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i14);
        pyVar.presentFragment(xnVar, true);
        xnVar.Ab(arrayList2);
        return true;
    }

    @Override // uf.j1
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
                ly lyVar = (ly) this.b;
                h51 h51Var = (h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                fy fyVar = lyVar.c;
                mz mzVar = lyVar.C;
                Object obj6 = h51Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar = (dy) h51Var.H;
                    long j10 = lyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        lyVar.d = 0L;
                        stickerSet = null;
                        childCount = fyVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            bh.d dVar = (bh.d) fyVar.getChildAt(i10);
                            if (dVar != view) {
                                dVar.a(false, true);
                            }
                        }
                        if (lyVar.d != 0 && lyVar.f.size() < lyVar.e.count && (stickerSet2 = MediaDataController.getInstance(mzVar.Z0).getStickerSet(lyVar.e, false)) != null) {
                            lyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject = (TLObject) h51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet5 = stickerSet;
                        bh.c cVar = mzVar.I;
                        xd.a aVar = mzVar.b;
                        arrayList = lyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        mzVar.K(cVar, tLObject, stickerSet5, document, true, aVar.e <= 0.0f);
                        ((bh.d) view).a(lyVar.d == 0, true);
                        aVar.a(lyVar.d != 0, true);
                        lyVar.l();
                        mzVar.S.b();
                        if (lyVar.d == 0) {
                            fyVar.H1(view);
                            break;
                        }
                    } else {
                        lyVar.d = j11;
                        lyVar.f = dyVar.d;
                        lyVar.e = stickerSet;
                        childCount = fyVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (lyVar.d != 0) {
                            lyVar.f = stickerSet2.documents;
                        }
                        TLObject tLObject2 = (TLObject) h51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet52 = stickerSet;
                        bh.c cVar2 = mzVar.I;
                        xd.a aVar2 = mzVar.b;
                        arrayList = lyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        mzVar.K(cVar2, tLObject2, stickerSet52, document, true, aVar2.e <= 0.0f);
                        ((bh.d) view).a(lyVar.d == 0, true);
                        aVar2.a(lyVar.d != 0, true);
                        lyVar.l();
                        mzVar.S.b();
                        if (lyVar.d == 0) {
                        }
                    }
                } else {
                    if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                        long j12 = lyVar.d;
                        TLRPC.StickerSet stickerSet6 = tL_messages_stickerSet.set;
                        long j13 = stickerSet6.id;
                        if (j12 == j13) {
                            lyVar.d = 0L;
                        } else {
                            lyVar.d = j13;
                            lyVar.f = tL_messages_stickerSet.documents;
                            lyVar.e = stickerSet6;
                            stickerSet = stickerSet6;
                            childCount = fyVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (lyVar.d != 0) {
                            }
                            TLObject tLObject22 = (TLObject) h51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet522 = stickerSet;
                            bh.c cVar22 = mzVar.I;
                            xd.a aVar22 = mzVar.b;
                            arrayList = lyVar.f;
                            if (arrayList != null) {
                            }
                            mzVar.K(cVar22, tLObject22, stickerSet522, document, true, aVar22.e <= 0.0f);
                            ((bh.d) view).a(lyVar.d == 0, true);
                            aVar22.a(lyVar.d != 0, true);
                            lyVar.l();
                            mzVar.S.b();
                            if (lyVar.d == 0) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = fyVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (lyVar.d != 0) {
                    }
                    TLObject tLObject222 = (TLObject) h51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet5222 = stickerSet;
                    bh.c cVar222 = mzVar.I;
                    xd.a aVar222 = mzVar.b;
                    arrayList = lyVar.f;
                    if (arrayList != null) {
                    }
                    mzVar.K(cVar222, tLObject222, stickerSet5222, document, true, aVar222.e <= 0.0f);
                    ((bh.d) view).a(lyVar.d == 0, true);
                    aVar222.a(lyVar.d != 0, true);
                    lyVar.l();
                    mzVar.S.b();
                    if (lyVar.d == 0) {
                    }
                }
                break;
            case 3:
                hz hzVar = (hz) this.b;
                h51 h51Var2 = (h51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                gz gzVar = hzVar.c;
                mz mzVar2 = hzVar.N;
                Object obj7 = h51Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    dy dyVar2 = (dy) h51Var2.H;
                    long j14 = hzVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.id;
                    if (j14 == j15) {
                        hzVar.d = 0L;
                        stickerSet3 = null;
                        childCount2 = gzVar.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            bh.d dVar2 = (bh.d) gzVar.getChildAt(i11);
                            if (dVar2 != view2) {
                                dVar2.a(false, true);
                            }
                        }
                        if (hzVar.d != 0 && hzVar.f.size() < hzVar.e.count && (stickerSet4 = MediaDataController.getInstance(mzVar2.Z0).getStickerSet(hzVar.e, false)) != null) {
                            hzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject3 = (TLObject) h51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet3;
                        bh.c cVar3 = mzVar2.K;
                        xd.a aVar3 = mzVar2.a;
                        arrayList2 = hzVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) hzVar.f.get(0);
                        }
                        mzVar2.K(cVar3, tLObject3, stickerSet7, document2, false, aVar3.e <= 0.0f);
                        ((bh.d) view2).a(hzVar.d == 0, true);
                        aVar3.a(hzVar.d != 0, true);
                        hzVar.l();
                        mzVar2.D0.b();
                        if (hzVar.d == 0) {
                            gzVar.H1(view2);
                            break;
                        }
                    } else {
                        hzVar.d = j15;
                        hzVar.f = dyVar2.d;
                        hzVar.e = stickerSet3;
                        childCount2 = gzVar.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (hzVar.d != 0) {
                            hzVar.f = stickerSet4.documents;
                        }
                        TLObject tLObject32 = (TLObject) h51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet3;
                        bh.c cVar32 = mzVar2.K;
                        xd.a aVar32 = mzVar2.a;
                        arrayList2 = hzVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) hzVar.f.get(0);
                        }
                        mzVar2.K(cVar32, tLObject32, stickerSet72, document2, false, aVar32.e <= 0.0f);
                        ((bh.d) view2).a(hzVar.d == 0, true);
                        aVar32.a(hzVar.d != 0, true);
                        hzVar.l();
                        mzVar2.D0.b();
                        if (hzVar.d == 0) {
                        }
                    }
                } else {
                    if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                        long j16 = hzVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j17 = stickerSet8.id;
                        if (j16 == j17) {
                            hzVar.d = 0L;
                        } else {
                            hzVar.d = j17;
                            hzVar.f = tL_messages_stickerSet2.documents;
                            hzVar.e = stickerSet8;
                            stickerSet3 = stickerSet8;
                            childCount2 = gzVar.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (hzVar.d != 0) {
                            }
                            TLObject tLObject322 = (TLObject) h51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet3;
                            bh.c cVar322 = mzVar2.K;
                            xd.a aVar322 = mzVar2.a;
                            arrayList2 = hzVar.f;
                            if (arrayList2 != null) {
                            }
                            mzVar2.K(cVar322, tLObject322, stickerSet722, document2, false, aVar322.e <= 0.0f);
                            ((bh.d) view2).a(hzVar.d == 0, true);
                            aVar322.a(hzVar.d != 0, true);
                            hzVar.l();
                            mzVar2.D0.b();
                            if (hzVar.d == 0) {
                            }
                        }
                    }
                    stickerSet3 = null;
                    childCount2 = gzVar.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (hzVar.d != 0) {
                    }
                    TLObject tLObject3222 = (TLObject) h51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet3;
                    bh.c cVar3222 = mzVar2.K;
                    xd.a aVar3222 = mzVar2.a;
                    arrayList2 = hzVar.f;
                    if (arrayList2 != null) {
                    }
                    mzVar2.K(cVar3222, tLObject3222, stickerSet7222, document2, false, aVar3222.e <= 0.0f);
                    ((bh.d) view2).a(hzVar.d == 0, true);
                    aVar3222.a(hzVar.d != 0, true);
                    hzVar.l();
                    mzVar2.D0.b();
                    if (hzVar.d == 0) {
                    }
                }
                break;
            case 11:
                gh0 gh0Var = (gh0) this.b;
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
                    org.telegram.ui.py pyVar = gh0Var.a;
                    org.telegram.ui.py.d4(xnVar, messageObject);
                    pyVar.presentFragment(xnVar);
                    break;
                }
                break;
            case 15:
                sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((sl0) this.b).m2);
                break;
            default:
                sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((h61) this.b).m2);
                break;
        }
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.x80
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.x80
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.x80
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
    }
}
