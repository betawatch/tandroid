package ai;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Components.zu;
import org.telegram.ui.al;
import org.telegram.ui.bu0;
import org.telegram.ui.c70;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        boolean z10;
        boolean z11;
        pf pfVar;
        boolean J1;
        uc0 uc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                g3Var.run(Long.valueOf(jArr[0]));
                f3Var.dismiss();
                break;
            case 1:
                w5 w5Var = (w5) this.b;
                ci.da daVar = (ci.da) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                f6 f6Var = w5Var.l;
                f6Var.F0(daVar, storyItem);
                w5 w5Var2 = f6Var.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 2:
                w5 w5Var3 = (w5) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                kc kcVar = (kc) this.d;
                f1Var.performHapticFeedback(3);
                ad X = ad.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.f(12, w5Var3, kcVar))).j();
                    break;
                }
                break;
            case 3:
                t6 t6Var = (t6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                p80 p80Var = (p80) this.d;
                z3 z3Var = new z3(t6Var, 1);
                l7 l7Var = t6Var.b;
                new iw(z3Var, l7Var.getContext(), l7Var.s, arrayList).show();
                p80Var.u();
                break;
            case 4:
                ci.bc bcVar = (ci.bc) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                d dVar = (d) this.d;
                p80 p80Var2 = bcVar.V0;
                if (p80Var2 == null || !p80Var2.D()) {
                    ci.o oVar = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    ci.o oVar2 = isPremium ? null : new ci.o(bcVar, 1);
                    p80 F = p80.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 >= 4) {
                            p80 p80Var3 = bcVar.V0;
                            p80Var3.s = 0;
                            p80Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            p80 p80Var4 = bcVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.i6.E8;
                            p80Var4.b(0, null, string, i12, i12, new p8(oVar, i11, 2));
                            p80Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new p8(oVar2, i11, 3));
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 5:
                ci.n3 n3Var = (ci.n3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                ci.q3 q3Var = (ci.q3) this.d;
                ci.v3 v3Var = n3Var.c;
                ArrayList arrayList2 = v3Var.h0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > v3Var.R) {
                    int i13 = -v3Var.N;
                    v3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(q3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(v3Var.d);
                v3Var.j();
                break;
            case 6:
                ci.nb nbVar = (ci.nb) this.b;
                Context context = (Context) this.c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (!nbVar.B1) {
                    Runnable runnable2 = nbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.o(nbVar.A1.a, 2);
                    xVar.n = new ci.q5(nbVar, u0Var);
                    xVar.h = new ci.j5(0, nbVar, u0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                hg.f fVar = (hg.f) this.b;
                p80 F2 = p80.F(((zn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.e6) this.d, fVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new hg.e(fVar, 1), true);
                F2.E();
                if (fVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new hg.e(fVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 8:
                hg.l0.T((hg.l0) this.b, (TL_account.TL_connectedBot) this.c, (nd) this.d);
                break;
            case 9:
                hi.b bVar = (hi.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar.Q(callback, bVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.q3 q3Var2 = (m.q3) this.b;
                ii.f6 f6Var2 = (ii.f6) this.c;
                ii.o0 o0Var = (ii.o0) this.d;
                q3Var2.a();
                f6Var2.D(o0Var);
                break;
            case 11:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.e6) this.d);
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                f5Var.J(-1, 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 13:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                d5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 14:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable4 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable4.run();
                alertDialog$Builder.a.L0.run();
                break;
            case 15:
                ((org.telegram.ui.Components.k8) this.b).n.C0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 16:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
                int i14 = yiVar.M1;
                ii iiVar = yiVar.L0;
                pf pfVar2 = yiVar.h0;
                long k10 = pfVar2 != null ? pfVar2.k() : 0L;
                yiVar.Q0 = k10;
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
                        yiVar.S1(n2Var);
                    }
                    pf pfVar3 = yiVar.h0;
                    if (pfVar3 != null) {
                        pfVar3.h(false);
                        yiVar.h0 = null;
                        break;
                    }
                } else {
                    if (yiVar.K1 == null && (n2Var2 instanceof zn)) {
                        zn znVar = (zn) n2Var2;
                        if (znVar.c()) {
                            org.telegram.ui.Components.g5.L(yiVar.getContext(), znVar.a(), new z1(yiVar, k10, 4), e6Var);
                            z10 = false;
                            yiVar.K1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    qi qiVar = yiVar.B0;
                    if (qiVar == yiVar.j0 || qiVar == yiVar.q0) {
                        z11 = true;
                        pfVar = null;
                        J1 = yiVar.J1(0, true, 0, yiVar.u1(), k10);
                    } else {
                        if (!qiVar.K(0, true, 0, yiVar.u1(), k10)) {
                            yiVar.D2 = true;
                            yiVar.dismiss();
                        }
                        J1 = false;
                        z11 = true;
                        pfVar = null;
                    }
                    pf pfVar4 = yiVar.h0;
                    if (pfVar4 != null) {
                        pfVar4.h(J1 ^ z11);
                        yiVar.h0 = pfVar;
                    }
                    yiVar.K1(z10, z10);
                }
                break;
            case 17:
                yi yiVar2 = (yi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                uc0 uc0Var2 = (uc0) this.d;
                yiVar2.K1(!yiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = yiVar2.c0;
                message.invert_media = z12;
                uc0Var2.a(!z12, true);
                yiVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (uc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    uc0Var.a(!yiVar2.c0, true);
                }
                yiVar2.h0.n(!yiVar2.c0);
                break;
            case 18:
                ds dsVar = (ds) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ci.d dVar2 = (ci.d) this.d;
                callback2.run(new of.e(new nq(dVar2, 4), new zr(0, dsVar, dVar2)));
                break;
            case 19:
                bs bsVar = (bs) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                bsVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                ru ruVar = (ru) this.b;
                fi.o oVar3 = (fi.o) this.c;
                ci.t1 t1Var = (ci.t1) this.d;
                try {
                    charSequence = ((ClipboardManager) ruVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ruVar.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                t1Var.run();
                break;
            case 21:
                zu zuVar = (zu) this.b;
                sw0 sw0Var = (sw0) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                uu uuVar = zuVar.a;
                hg.l lVar = zuVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = zuVar.K;
                    if (p1Var == null || !p1Var.f) {
                        if (!zuVar.n) {
                            if (!zuVar.e) {
                                zuVar.x(1);
                                boolean isFocused = uuVar.isFocused();
                                zuVar.d.D(uuVar.length() > 0, false);
                                uuVar.requestFocus();
                                if (!isFocused) {
                                    uuVar.setSelection(uuVar.length());
                                    break;
                                }
                            } else {
                                if (zuVar.x) {
                                    zuVar.k(true);
                                    zuVar.x = false;
                                    zuVar.p();
                                }
                                zuVar.v();
                                break;
                            }
                        } else {
                            uuVar.hideActionMode();
                            p80 p80Var5 = new p80(sw0Var, e6Var2, lVar, false, false, true);
                            p80Var5.X = AndroidUtilities.dp(280.0f);
                            uuVar.extendActionMode(null, new qb0(p80Var5, new org.telegram.ui.Components.a3(uuVar, 4), uuVar.getOnPremiumMenuLockClickListener()));
                            p80Var5.U = true;
                            p80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                e30 e30Var = (e30) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                e30Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new bw(e30Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                x90 x90Var = (x90) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    if (x90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", x90Var.b));
                        if (f3Var2 == null || f3Var2.getContainer() == null) {
                            ad.j(n2Var4).j();
                        } else {
                            new ad(f3Var2.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 24:
                pc0 pc0Var = (pc0) this.b;
                uc0 uc0Var3 = (uc0) this.c;
                uc0 uc0Var4 = (uc0) this.d;
                vc0 vc0Var = pc0Var.c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (vc0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    vc0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    vc0Var.x = true;
                }
                uc0Var3.a(z14, true);
                uc0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                pc0Var.h();
                pc0Var.k(true);
                break;
            case 25:
                bf0.p((bf0) this.b, (TLRPC.ChatFull) this.c, (c70) this.d);
                break;
            case 26:
                lg0 lg0Var = (lg0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                if (lg0Var.h == null) {
                    ci.z3 z3Var2 = new ci.z3(context4, e6Var3, LocaleController.getString(R.string.VideoChooseCover), lg0Var.f);
                    lg0Var.h = z3Var2;
                    z3Var2.setOnDismissListener(new bd0(lg0Var, 8));
                    lg0Var.h.f = lg0Var.n;
                }
                lg0Var.h.show();
                break;
            case 27:
                z41 z41Var = (z41) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                b51 b51Var = z41Var.n;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = b51Var.v;
                a51 a51Var = b51Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = a51Var.d;
                    if (view2 == b51Var.E || view2 == b51Var.r) {
                        b51Var.w = b51Var.v;
                    }
                    x41 x41Var = z41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    b51Var.v = str2;
                    x41Var.setText(b51.B(b51.F(str2, null, null)));
                    a51Var.D(b51Var.h != null ? b51Var.n : b51Var.y);
                    b51.J(b51Var.v);
                    b51Var.N();
                    break;
                }
                break;
            case 28:
                al alVar = (al) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j3 = alVar.b;
                translateController.setHideTranslateDialog(j3, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(alVar.a).getChat(Long.valueOf(-j3));
                ad.a0(alVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ci0(24, alVar, translateController)).j();
                n1Var.d(true);
                break;
            default:
                bu0 bu0Var = (bu0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!bu0Var.L1) {
                    Runnable runnable6 = bu0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    pg.x xVar2 = new pg.x(context5, bu0Var.Q1);
                    xVar2.o(bu0Var.K1.a, 2);
                    xVar2.n = new qg.v(bu0Var, bitmap);
                    xVar2.h = new qg.m(bu0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(x90 x90Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.b = x90Var;
        this.d = f3Var;
        this.c = n2Var;
    }
}
