package eg;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mh.aa;
import mh.d7;
import mh.k6;
import oh.e5;
import oh.f4;
import oh.i9;
import oh.o4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.mt0;
import org.telegram.ui.xn;
import org.telegram.ui.z60;
import qh.a8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean G1;
        xb0 xb0Var;
        int i10 = 5;
        int i11 = 2;
        int i12 = 3;
        int i13 = 4;
        CharSequence charSequence = null;
        char c3 = 1;
        final int i14 = 0;
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
                    dg.e0 e0Var = new dg.e0(context, mt0Var.N1);
                    e0Var.m(mt0Var.H1.a, 2);
                    e0Var.n = new g0(mt0Var, bitmap);
                    e0Var.h = new n(mt0Var, 1);
                    e0Var.show();
                    break;
                }
                break;
            case 1:
                ((lg.k) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 2:
                lh.f fVar = (lh.f) this.b;
                new lh.s((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                fVar.dismiss();
                break;
            case 3:
                lh.s.R((lh.s) this.b, (boolean[]) this.c, (g6) this.d);
                break;
            case 4:
                lh.f0.R((lh.f0) this.b, (Context) this.c, (g6) this.d);
                break;
            case 5:
                lh.f0.P((lh.f0) this.b, (boolean[]) this.c, (g6) this.d);
                break;
            case 6:
                lh.n3 n3Var = (lh.n3) this.b;
                q70 q70Var = (q70) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.d;
                q70Var.u();
                or0 or0Var = n3Var.a;
                lh.d3 d3Var = new lh.d3(n3Var, savedStarGift, i14);
                HashMap hashMap = lh.x3.Q;
                or0Var.h(null, d3Var);
                break;
            case 7:
                mh.m0 m0Var = (mh.m0) this.b;
                Context context2 = (Context) this.c;
                g6 g6Var = (g6) this.d;
                if (m0Var.j0.a == mf.b.a) {
                    new aa(context2, g6Var).show();
                    break;
                }
                break;
            case 8:
                k6 k6Var = (k6) this.b;
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                final qh.d dVar = (qh.d) this.d;
                h3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                k6Var.run(new Utilities.Callback() { // from class: mh.m8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i14) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (!booleanValue) {
                                    final int i15 = 0;
                                    final qh.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    h3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                                if (!booleanValue2) {
                                    final int i16 = 1;
                                    final qh.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 9:
                d7 d7Var = (d7) this.b;
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.c;
                final qh.d dVar2 = (qh.d) this.d;
                h3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                final char c10 = c3 == true ? 1 : 0;
                d7Var.run(new Utilities.Callback() { // from class: mh.m8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (c10) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var22 = h3Var2;
                                if (!booleanValue) {
                                    final int i15 = 0;
                                    final qh.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    h3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (!booleanValue2) {
                                    final int i16 = 1;
                                    final qh.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.v8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    h3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    h3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 10:
                dg.h0 h0Var = (dg.h0) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.d;
                h0Var.run(Long.valueOf(jArr[0]));
                h3Var3.dismiss();
                break;
            case 11:
                oh.y3 y3Var = (oh.y3) this.b;
                a8 a8Var = (a8) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                f4 f4Var = y3Var.l;
                f4Var.F0(a8Var, storyItem);
                oh.y3 y3Var2 = f4Var.q1;
                if (y3Var2 != null) {
                    y3Var2.a();
                    break;
                }
                break;
            case 12:
                oh.y3 y3Var3 = (oh.y3) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                i9 i9Var = (i9) this.d;
                g1Var.performHapticFeedback(3);
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new oh.z1(i11, y3Var3, i9Var))).j();
                    break;
                }
                break;
            case 13:
                o4 o4Var = (o4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                q70 q70Var2 = (q70) this.d;
                fg.x1 x1Var = new fg.x1(o4Var, i10);
                e5 e5Var = o4Var.b;
                new ov(x1Var, e5Var.getContext(), e5Var.s, arrayList).show();
                q70Var2.u();
                break;
            case 14:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.b, (TL_aicompose.AiComposeTone) this.c, (g6) this.d);
                break;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                y4 y4Var = (y4) this.c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.d;
                zArr[0] = false;
                y4Var.I(-1, 0, true);
                c3Var.a.dismissRunnable.run();
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
                mi miVar = (mi) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                g6 g6Var2 = (g6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = miVar.c0;
                int i15 = miVar.G1;
                vh vhVar = miVar.F0;
                cf cfVar = miVar.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                miVar.K0 = k10;
                vhVar.setEffect(k10);
                miVar.forceKeyboardOnDismiss();
                if (miVar.H - miVar.I < 0) {
                    AndroidUtilities.shakeView(miVar.s);
                    AndroidUtilities.shakeView(miVar.v);
                    try {
                        vhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i15).premiumFeaturesBlocked() && MessagesController.getInstance(i15).captionLengthLimitPremium > miVar.I) {
                        miVar.O1(p2Var);
                    }
                    cf cfVar2 = miVar.e0;
                    if (cfVar2 != null) {
                        cfVar2.h(false);
                        miVar.e0 = null;
                        break;
                    }
                } else {
                    if (miVar.E1 == null && (p2Var2 instanceof xn)) {
                        xn xnVar = (xn) p2Var2;
                        if (xnVar.c()) {
                            z4.M(miVar.getContext(), xnVar.a(), new f3.e(miVar, k10, i12), g6Var2);
                            miVar.H1(false, false);
                            break;
                        }
                    }
                    ei eiVar = miVar.v0;
                    if (eiVar == miVar.g0 || eiVar == miVar.n0) {
                        G1 = miVar.G1(0, true, 0, miVar.s1(), k10);
                    } else {
                        if (!eiVar.H(0, true, 0, miVar.s1(), k10)) {
                            miVar.x2 = true;
                            miVar.dismiss();
                        }
                        G1 = false;
                    }
                    cf cfVar3 = miVar.e0;
                    if (cfVar3 != null) {
                        cfVar3.h(!G1);
                        miVar.e0 = null;
                    }
                    miVar.H1(false, false);
                }
                break;
            case 20:
                mi miVar2 = (mi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                xb0 xb0Var2 = (xb0) this.d;
                miVar2.H1(!miVar2.Z, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z4 = miVar2.Z;
                message.invert_media = z4;
                xb0Var2.a(!z4, true);
                miVar2.e0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar2.g0;
                if (chatAttachAlertPhotoLayout != null && (xb0Var = chatAttachAlertPhotoLayout.a1) != null) {
                    xb0Var.a(!miVar2.Z, true);
                }
                miVar2.e0.n(!miVar2.Z);
                break;
            case 21:
                lr lrVar = (lr) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                qh.d dVar3 = (qh.d) this.d;
                callback.run(new af.f(new xp(dVar3, i13), new eo(i13, lrVar, dVar3)));
                break;
            case 22:
                jr jrVar = (jr) this.b;
                Context context3 = (Context) this.c;
                y8 y8Var = (y8) this.d;
                jrVar.getClass();
                AndroidUtilities.addToClipboard(y8Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 23:
                xt xtVar = (xt) this.b;
                mh.m mVar = (mh.m) this.c;
                hg.j jVar = (hg.j) this.d;
                try {
                    charSequence = ((ClipboardManager) xtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xtVar.getContext());
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (charSequence != null) {
                    mVar.setText(charSequence);
                    mVar.setSelection(0, mVar.getText().length());
                }
                jVar.run();
                break;
            case 24:
                fu fuVar = (fu) this.b;
                pv0 pv0Var = (pv0) this.c;
                g6 g6Var3 = (g6) this.d;
                au auVar = fuVar.a;
                ge geVar = fuVar.b;
                if (geVar.isEnabled() && geVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = fuVar.H;
                    if (r1Var == null || !r1Var.f) {
                        if (!fuVar.n) {
                            if (!fuVar.e) {
                                fuVar.x(1);
                                boolean isFocused = auVar.isFocused();
                                fuVar.d.E(auVar.length() > 0, false);
                                auVar.requestFocus();
                                if (!isFocused) {
                                    auVar.setSelection(auVar.length());
                                    break;
                                }
                            } else {
                                if (fuVar.x) {
                                    fuVar.k(true);
                                    fuVar.x = false;
                                    fuVar.p();
                                }
                                fuVar.v();
                                break;
                            }
                        } else {
                            auVar.hideActionMode();
                            q70 q70Var3 = new q70(pv0Var, g6Var3, geVar, false, false, true);
                            q70Var3.X = AndroidUtilities.dp(280.0f);
                            auVar.extendActionMode(null, new sa0(q70Var3, new org.telegram.ui.Components.v2(auVar, i13), auVar.getOnPremiumMenuLockClickListener()));
                            q70Var3.U = true;
                            q70Var3.Z();
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
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new hv(p20Var, i10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 26:
                y80 y80Var = (y80) this.b;
                org.telegram.ui.ActionBar.h3 h3Var4 = (org.telegram.ui.ActionBar.h3) this.c;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (y80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y80Var.b));
                        if (h3Var4 == null || h3Var4.getContainer() == null) {
                            qc.j(p2Var4).j();
                        } else {
                            new qc(h3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 27:
                sb0 sb0Var = (sb0) this.b;
                xb0 xb0Var3 = (xb0) this.c;
                xb0 xb0Var4 = (xb0) this.d;
                yb0 yb0Var = sb0Var.W;
                MessagePreviewParams messagePreviewParams = yb0Var.d;
                boolean z10 = messagePreviewParams.hideCaption;
                boolean z11 = !z10;
                messagePreviewParams.hideCaption = z11;
                if (z10) {
                    if (yb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    yb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    yb0Var.x = true;
                }
                xb0Var3.a(z11, true);
                xb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                sb0Var.h();
                sb0Var.k(true);
                break;
            case 28:
                fe0.n((fe0) this.b, (TLRPC.ChatFull) this.c, (z60) this.d);
                break;
            default:
                qf0 qf0Var = (qf0) this.b;
                Context context5 = (Context) this.c;
                g6 g6Var4 = (g6) this.d;
                if (qf0Var.h == null) {
                    qh.c3 c3Var2 = new qh.c3(context5, g6Var4, LocaleController.getString(R.string.VideoChooseCover), qf0Var.f);
                    qf0Var.h = c3Var2;
                    c3Var2.setOnDismissListener(new ec0(qf0Var, 8));
                    qf0Var.h.f = qf0Var.n;
                }
                qf0Var.h.show();
                break;
        }
    }
}
