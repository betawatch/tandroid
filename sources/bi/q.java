package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.bl;
import org.telegram.ui.e70;
import org.telegram.ui.eo;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        boolean z10;
        of ofVar;
        boolean z11;
        boolean G1;
        dc0 dc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                qd qdVar = (qd) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                zh.b bVar = (zh.b) this.d;
                w70 w70Var = qdVar.V0;
                if (w70Var == null || !w70Var.D()) {
                    r rVar = new r(qdVar, 0);
                    boolean isPremium = UserConfig.getInstance(qdVar.U).isPremium();
                    r rVar2 = isPremium ? null : new r(qdVar, 1);
                    w70 F = w70.F(frameLayout, bVar, qdVar.T0);
                    qdVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    qdVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = v.Q1;
                        if (i10 >= 4) {
                            w70 w70Var2 = qdVar.V0;
                            w70Var2.s = 0;
                            w70Var2.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            w70 w70Var3 = qdVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            w70Var3.b(0, null, string, i12, i12, new s(rVar, i11, 0));
                            w70Var3.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new s(rVar2, i11, 1));
                            if (qdVar.X0 == i10) {
                                qdVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 1:
                g4 g4Var = (g4) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                j4 j4Var = (j4) this.d;
                p4 p4Var = g4Var.c;
                ArrayList arrayList = p4Var.h0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > p4Var.R) {
                    int i13 = -p4Var.N;
                    p4Var.N = i13;
                    AndroidUtilities.shakeViewSpring(j4Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(p4Var.d);
                p4Var.j();
                break;
            case 2:
                ad adVar = (ad) this.b;
                Context context = (Context) this.c;
                og.x0 x0Var = (og.x0) this.d;
                if (!adVar.B1) {
                    Runnable runnable2 = adVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    og.a0 a0Var = new og.a0(context, adVar.G1);
                    adVar.T1 = a0Var;
                    a0Var.m(adVar.A1.a, 2);
                    a0Var.n = new q6(adVar, x0Var);
                    a0Var.h = new h6(0, adVar, x0Var);
                    a0Var.show();
                    break;
                }
                break;
            case 3:
                gg.e eVar = (gg.e) this.b;
                w70 F2 = w70.F(((eo) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new gg.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new gg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 4:
                gg.p0.S((gg.p0) this.b, (TL_account.TL_connectedBot) this.c, (org.telegram.ui.Components.zd) this.d);
                break;
            case 5:
                gi.b bVar2 = (gi.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar2.P(callback, bVar2.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 6:
                m.r3 r3Var = (m.r3) this.b;
                hi.g6 g6Var = (hi.g6) this.c;
                hi.p0 p0Var = (hi.p0) this.d;
                r3Var.a();
                g6Var.D(p0Var);
                break;
            case 7:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 8:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.d;
                zArr[0] = false;
                c5Var.I(-1, 0, true);
                runnable = c3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 9:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnDismissListener(null);
                }
                runnable3.run();
                a5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 10:
                ArrayList arrayList2 = (ArrayList) this.b;
                Runnable runnable4 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList2.get(((Integer) view.getTag()).intValue())).intValue());
                runnable4.run();
                alertDialog$Builder.a.L0.run();
                break;
            case 11:
                ((org.telegram.ui.Components.i8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 12:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f0;
                int i14 = yiVar.J1;
                ii iiVar = yiVar.I0;
                of ofVar2 = yiVar.h0;
                long k10 = ofVar2 != null ? ofVar2.k() : 0L;
                yiVar.N0 = k10;
                iiVar.setEffect(k10);
                yiVar.forceKeyboardOnDismiss();
                if (yiVar.K - yiVar.L < 0) {
                    AndroidUtilities.shakeView(yiVar.s);
                    AndroidUtilities.shakeView(yiVar.v);
                    try {
                        iiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > yiVar.L) {
                        yiVar.O1(p2Var);
                    }
                    of ofVar3 = yiVar.h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        yiVar.h0 = null;
                        break;
                    }
                } else {
                    if (yiVar.H1 == null && (p2Var2 instanceof eo)) {
                        eo eoVar = (eo) p2Var2;
                        if (eoVar.c()) {
                            org.telegram.ui.Components.d5.M(yiVar.getContext(), eoVar.a(), new za(yiVar, k10, 3), f6Var);
                            z10 = false;
                            yiVar.H1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    qi qiVar = yiVar.y0;
                    if (qiVar == yiVar.j0 || qiVar == yiVar.q0) {
                        ofVar = null;
                        z11 = true;
                        G1 = yiVar.G1(0, true, 0, yiVar.s1(), k10);
                    } else {
                        if (!qiVar.I(0, true, 0, yiVar.s1(), k10)) {
                            yiVar.A2 = true;
                            yiVar.dismiss();
                        }
                        ofVar = null;
                        G1 = false;
                        z11 = true;
                    }
                    of ofVar4 = yiVar.h0;
                    if (ofVar4 != null) {
                        ofVar4.h(G1 ^ z11);
                        yiVar.h0 = ofVar;
                    }
                    yiVar.H1(z10, z10);
                }
                break;
            case 13:
                yi yiVar2 = (yi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                dc0 dc0Var2 = (dc0) this.d;
                yiVar2.H1(!yiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = yiVar2.c0;
                message.invert_media = z12;
                dc0Var2.a(!z12, true);
                yiVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (dc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    dc0Var.a(!yiVar2.c0, true);
                }
                yiVar2.h0.n(!yiVar2.c0);
                break;
            case 14:
                sr srVar = (sr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                d dVar = (d) this.d;
                callback2.run(new nf.e(new dq(dVar, 4), new org.telegram.ui.Components.ee(21, srVar, dVar)));
                break;
            case 15:
                qr qrVar = (qr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) this.d;
                qrVar.getClass();
                AndroidUtilities.addToClipboard(d9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 16:
                fu fuVar = (fu) this.b;
                ei.o oVar = (ei.o) this.c;
                e2 e2Var = (e2) this.d;
                try {
                    charSequence = ((ClipboardManager) fuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(fuVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar.setText(charSequence);
                    oVar.setSelection(0, oVar.getText().length());
                }
                e2Var.run();
                break;
            case 17:
                nu nuVar = (nu) this.b;
                aw0 aw0Var = (aw0) this.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                iu iuVar = nuVar.a;
                gg.k kVar = nuVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.r1 r1Var = nuVar.K;
                    if (r1Var == null || !r1Var.f) {
                        if (!nuVar.n) {
                            if (!nuVar.e) {
                                nuVar.x(1);
                                boolean isFocused = iuVar.isFocused();
                                nuVar.d.E(iuVar.length() > 0, false);
                                iuVar.requestFocus();
                                if (!isFocused) {
                                    iuVar.setSelection(iuVar.length());
                                    break;
                                }
                            } else {
                                if (nuVar.x) {
                                    nuVar.k(true);
                                    nuVar.x = false;
                                    nuVar.p();
                                }
                                nuVar.v();
                                break;
                            }
                        } else {
                            iuVar.hideActionMode();
                            w70 w70Var4 = new w70(aw0Var, f6Var2, kVar, false, false, true);
                            w70Var4.X = AndroidUtilities.dp(280.0f);
                            iuVar.extendActionMode(null, new ya0(w70Var4, new org.telegram.ui.Components.y2(iuVar, 4), iuVar.getOnPremiumMenuLockClickListener()));
                            w70Var4.U = true;
                            w70Var4.Z();
                            break;
                        }
                    }
                }
                break;
            case 18:
                w20 w20Var = (w20) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.d;
                w20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new pv(w20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 19:
                f90 f90Var = (f90) this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) this.d;
                try {
                    if (f90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f90Var.b));
                        if (h3Var == null || h3Var.getContainer() == null) {
                            org.telegram.ui.Components.wc.j(p2Var4).j();
                        } else {
                            new org.telegram.ui.Components.wc(h3Var.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 20:
                yb0 yb0Var = (yb0) this.b;
                dc0 dc0Var3 = (dc0) this.c;
                dc0 dc0Var4 = (dc0) this.d;
                ec0 ec0Var = yb0Var.c0;
                MessagePreviewParams messagePreviewParams = ec0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (ec0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ec0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    ec0Var.x = true;
                }
                dc0Var3.a(z14, true);
                dc0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                yb0Var.h();
                yb0Var.k(true);
                break;
            case 21:
                je0.n((je0) this.b, (TLRPC.ChatFull) this.c, (e70) this.d);
                break;
            case 22:
                tf0 tf0Var = (tf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                if (tf0Var.h == null) {
                    t4 t4Var = new t4(context4, f6Var3, LocaleController.getString(R.string.VideoChooseCover), tf0Var.f);
                    tf0Var.h = t4Var;
                    t4Var.setOnDismissListener(new kc0(tf0Var, 8));
                    tf0Var.h.f = tf0Var.n;
                }
                tf0Var.h.show();
                break;
            case 23:
                g41 g41Var = (g41) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                i41 i41Var = g41Var.h;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = i41Var.v;
                h41 h41Var = i41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = h41Var.d;
                    if (view2 == i41Var.E || view2 == i41Var.r) {
                        i41Var.w = i41Var.v;
                    }
                    e41 e41Var = g41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    i41Var.v = str2;
                    e41Var.setText(i41.y(i41.D(str2, null, null)));
                    h41Var.D(i41Var.h != null ? i41Var.n : i41Var.y);
                    i41.I(i41Var.v);
                    i41Var.M();
                    break;
                }
                break;
            case 24:
                bl blVar = (bl) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j3 = blVar.b;
                translateController.setHideTranslateDialog(j3, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(blVar.a).getChat(Long.valueOf(-j3));
                org.telegram.ui.Components.wc.a0(blVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new yo0(16, blVar, translateController)).j();
                p1Var.d(true);
                break;
            case 25:
                zt0 zt0Var = (zt0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!zt0Var.L1) {
                    Runnable runnable6 = zt0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    og.a0 a0Var2 = new og.a0(context5, zt0Var.Q1);
                    a0Var2.m(zt0Var.K1.a, 2);
                    a0Var2.n = new pg.v(zt0Var, bitmap);
                    a0Var2.h = new pg.m(zt0Var, 1);
                    a0Var2.show();
                    break;
                }
                break;
            case 26:
                ((wg.h) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 27:
                wh.e eVar2 = (wh.e) this.b;
                new wh.m((Context) this.c, null, null, (GiftAuctionController.Auction) this.d).show();
                eVar2.dismiss();
                break;
            case 28:
                wh.m.R((wh.m) this.b, (boolean[]) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            default:
                wh.w.R((wh.w) this.b, (Context) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
        }
    }
}
