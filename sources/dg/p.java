package dg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lh.aa;
import lh.d7;
import lh.k6;
import nh.d4;
import nh.d5;
import nh.i9;
import nh.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a70;
import org.telegram.ui.mt0;
import org.telegram.ui.zn;
import ph.c8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean G1;
        wb0 wb0Var;
        int i10 = 4;
        int i11 = 3;
        int i12 = 5;
        CharSequence charSequence = null;
        char c3 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                mt0 mt0Var = (mt0) this.b;
                Context context = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!mt0Var.I1) {
                    Runnable runnable = mt0Var.R1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    cg.e0 e0Var = new cg.e0(context, mt0Var.N1);
                    e0Var.m(mt0Var.H1.a, 2);
                    e0Var.n = new i0(mt0Var, bitmap);
                    e0Var.h = new o(mt0Var, 1);
                    e0Var.show();
                    break;
                }
                break;
            case 1:
                ((kg.k) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 2:
                kh.f fVar = (kh.f) this.b;
                new kh.s((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 3:
                kh.s.R((kh.s) this.b, (boolean[]) this.c, (f6) this.d);
                break;
            case 4:
                kh.f0.R((kh.f0) this.b, (Context) this.c, (f6) this.d);
                break;
            case 5:
                kh.f0.P((kh.f0) this.b, (boolean[]) this.c, (f6) this.d);
                break;
            case 6:
                kh.m3 m3Var = (kh.m3) this.b;
                p70 p70Var = (p70) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                p70Var.u();
                or0 or0Var = m3Var.a;
                kh.c3 c3Var = new kh.c3(m3Var, savedStarGift, i13);
                HashMap hashMap = kh.w3.Q;
                or0Var.h(null, c3Var);
                break;
            case 7:
                lh.n0 n0Var = (lh.n0) this.b;
                Context context2 = (Context) this.c;
                f6 f6Var = (f6) this.d;
                if (n0Var.j0.a == lf.b.a) {
                    new aa(context2, f6Var).show();
                    break;
                }
                break;
            case 8:
                k6 k6Var = (k6) this.b;
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                final ph.d dVar = (ph.d) this.d;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                k6Var.run(new Utilities.Callback() { // from class: lh.m8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i13) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (!booleanValue) {
                                    final int i14 = 0;
                                    final ph.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    g3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var;
                                if (!booleanValue2) {
                                    final int i15 = 1;
                                    final ph.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 9:
                d7 d7Var = (d7) this.b;
                final org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.c;
                final ph.d dVar2 = (ph.d) this.d;
                g3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                final char c10 = c3 == true ? 1 : 0;
                d7Var.run(new Utilities.Callback() { // from class: lh.m8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (c10) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var22 = g3Var2;
                                if (!booleanValue) {
                                    final int i14 = 0;
                                    final ph.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    g3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (!booleanValue2) {
                                    final int i15 = 1;
                                    final ph.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    g3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    g3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 10:
                cg.h0 h0Var = (cg.h0) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.d;
                h0Var.run(Long.valueOf(jArr[0]));
                g3Var3.dismiss();
                break;
            case 11:
                nh.w3 w3Var = (nh.w3) this.b;
                c8 c8Var = (c8) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                d4 d4Var = w3Var.l;
                d4Var.F0(c8Var, storyItem);
                nh.w3 w3Var2 = d4Var.q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 12:
                nh.w3 w3Var3 = (nh.w3) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                i9 i9Var = (i9) this.d;
                g1Var.performHapticFeedback(3);
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new lh.n2(29, w3Var3, i9Var))).j();
                    break;
                }
                break;
            case 13:
                m4 m4Var = (m4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                p70 p70Var2 = (p70) this.d;
                eg.y1 y1Var = new eg.y1(m4Var, i12);
                d5 d5Var = m4Var.b;
                new lv(y1Var, d5Var.getContext(), d5Var.s, arrayList).show();
                p70Var2.u();
                break;
            case 14:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.b, (TL_aicompose.AiComposeTone) this.c, (f6) this.d);
                break;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                y4 y4Var = (y4) this.c;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                zArr[0] = false;
                y4Var.J(-1, 0, true);
                b3Var.a.dismissRunnable.run();
                break;
            case 16:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                w4 w4Var = (w4) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable2.run();
                w4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 17:
                ArrayList arrayList2 = (ArrayList) this.b;
                Runnable runnable3 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList2.get(((Integer) view.getTag()).intValue())).intValue());
                runnable3.run();
                alertDialog$Builder.a.I0.run();
                break;
            case 18:
                ((b8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 19:
                li liVar = (li) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                f6 f6Var2 = (f6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = liVar.c0;
                int i14 = liVar.G1;
                vh vhVar = liVar.F0;
                cf cfVar = liVar.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                liVar.K0 = k10;
                vhVar.setEffect(k10);
                liVar.forceKeyboardOnDismiss();
                if (liVar.H - liVar.I < 0) {
                    AndroidUtilities.shakeView(liVar.s);
                    AndroidUtilities.shakeView(liVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > liVar.I) {
                        liVar.O1(p2Var);
                    }
                    cf cfVar2 = liVar.e0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        liVar.e0 = null;
                        break;
                    }
                } else {
                    if (liVar.E1 == null && (p2Var2 instanceof zn)) {
                        zn znVar = (zn) p2Var2;
                        if (znVar.c()) {
                            z4.M(liVar.getContext(), znVar.a(), new f3.e(liVar, k10, i11), f6Var2);
                            liVar.H1(false, false);
                            break;
                        }
                    }
                    di diVar = liVar.v0;
                    if (diVar == liVar.g0 || diVar == liVar.n0) {
                        G1 = liVar.G1(0, true, 0, liVar.s1(), k10);
                    } else {
                        if (!diVar.H(0, true, 0, liVar.s1(), k10)) {
                            liVar.x2 = true;
                            liVar.dismiss();
                        }
                        G1 = false;
                    }
                    cf cfVar3 = liVar.e0;
                    if (cfVar3 != null) {
                        cfVar3.h(!G1);
                        liVar.e0 = null;
                    }
                    liVar.H1(false, false);
                }
                break;
            case 20:
                li liVar2 = (li) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                wb0 wb0Var2 = (wb0) this.d;
                liVar2.H1(!liVar2.Z, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z4 = liVar2.Z;
                message.invert_media = z4;
                wb0Var2.a(!z4, true);
                liVar2.e0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar2.g0;
                if (chatAttachAlertPhotoLayout != null && (wb0Var = chatAttachAlertPhotoLayout.a1) != null) {
                    wb0Var.a(!liVar2.Z, true);
                }
                liVar2.e0.n(!liVar2.Z);
                break;
            case 21:
                ir irVar = (ir) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                ph.d dVar3 = (ph.d) this.d;
                callback.run(new ze.c(new up(dVar3, i10), new em(i12, irVar, dVar3)));
                break;
            case 22:
                gr grVar = (gr) this.b;
                Context context3 = (Context) this.c;
                x8 x8Var = (x8) this.d;
                grVar.getClass();
                AndroidUtilities.addToClipboard(x8Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 23:
                ut utVar = (ut) this.b;
                lh.n nVar = (lh.n) this.c;
                gg.j jVar = (gg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) utVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(utVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    nVar.setText(charSequence);
                    nVar.setSelection(0, nVar.getText().length());
                }
                jVar.run();
                break;
            case 24:
                cu cuVar = (cu) this.b;
                qv0 qv0Var = (qv0) this.c;
                f6 f6Var3 = (f6) this.d;
                xt xtVar = cuVar.a;
                ge geVar = cuVar.b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = cuVar.H;
                    if (r1Var == null || !r1Var.f) {
                        if (!cuVar.n) {
                            if (!cuVar.e) {
                                cuVar.x(1);
                                boolean isFocused = xtVar.isFocused();
                                cuVar.d.E(xtVar.length() > 0, false);
                                xtVar.requestFocus();
                                if (!isFocused) {
                                    xtVar.setSelection(xtVar.length());
                                    break;
                                }
                            } else {
                                if (cuVar.x) {
                                    cuVar.k(true);
                                    cuVar.x = false;
                                    cuVar.p();
                                }
                                cuVar.v();
                                break;
                            }
                        } else {
                            xtVar.hideActionMode();
                            p70 p70Var3 = new p70(qv0Var, f6Var3, geVar, false, false, true);
                            p70Var3.X = AndroidUtilities.dp(280.0f);
                            xtVar.extendActionMode(null, new ra0(p70Var3, new org.telegram.ui.Components.v2(xtVar, i10), xtVar.getOnPremiumMenuLockClickListener()));
                            p70Var3.U = true;
                            p70Var3.Z();
                            break;
                        }
                    }
                }
                break;
            case 25:
                p20 p20Var = (p20) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                p20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.O = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new ev(p20Var, i12));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 26:
                x80 x80Var = (x80) this.b;
                org.telegram.ui.ActionBar.g3 g3Var4 = (org.telegram.ui.ActionBar.g3) this.c;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (x80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x80Var.b));
                        if (g3Var4 == null || g3Var4.getContainer() == null) {
                            qc.j(p2Var4).j();
                        } else {
                            new qc(g3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
                break;
            case 27:
                rb0 rb0Var = (rb0) this.b;
                wb0 wb0Var3 = (wb0) this.c;
                wb0 wb0Var4 = (wb0) this.d;
                xb0 xb0Var = rb0Var.W;
                MessagePreviewParams messagePreviewParams = xb0Var.d;
                boolean z10 = messagePreviewParams.hideCaption;
                boolean z11 = !z10;
                messagePreviewParams.hideCaption = z11;
                if (z10) {
                    if (xb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    xb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    xb0Var.x = true;
                }
                wb0Var3.a(z11, true);
                wb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                rb0Var.h();
                rb0Var.k(true);
                break;
            case 28:
                ee0.n((ee0) this.b, (TLRPC.ChatFull) this.c, (a70) this.d);
                break;
            default:
                pf0 pf0Var = (pf0) this.b;
                Context context5 = (Context) this.c;
                f6 f6Var4 = (f6) this.d;
                if (pf0Var.h == null) {
                    ph.d3 d3Var = new ph.d3(context5, f6Var4, LocaleController.getString(R.string.VideoChooseCover), pf0Var.f);
                    pf0Var.h = d3Var;
                    d3Var.setOnDismissListener(new dc0(pf0Var, 8));
                    pf0Var.h.f = pf0Var.n;
                }
                pf0Var.h.show();
                break;
        }
    }
}
