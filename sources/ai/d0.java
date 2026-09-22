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
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xp;
import org.telegram.ui.au0;
import org.telegram.ui.bo;
import org.telegram.ui.e70;
import org.telegram.ui.zk;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        kf kfVar;
        boolean z11;
        boolean G1;
        ub0 ub0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                y1 y1Var = (y1) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                y1Var.run(Long.valueOf(jArr[0]));
                f3Var.dismiss();
                break;
            case 1:
                w5 w5Var = (w5) this.b;
                ci.ga gaVar = (ci.ga) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                f6 f6Var = w5Var.l;
                f6Var.F0(gaVar, storyItem);
                w5 w5Var2 = f6Var.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 2:
                w5 w5Var3 = (w5) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                jc jcVar = (jc) this.d;
                f1Var.performHapticFeedback(3);
                vc X = vc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, w5Var3, jcVar))).j();
                    break;
                }
                break;
            case 3:
                s6 s6Var = (s6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n70 n70Var = (n70) this.d;
                y3 y3Var = new y3(s6Var, 1);
                j7 j7Var = s6Var.b;
                new sv(y3Var, j7Var.getContext(), j7Var.s, arrayList).show();
                n70Var.u();
                break;
            case 4:
                ci.ec ecVar = (ci.ec) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                d dVar = (d) this.d;
                n70 n70Var2 = ecVar.V0;
                if (n70Var2 == null || !n70Var2.D()) {
                    ci.o oVar = new ci.o(ecVar, 0);
                    boolean isPremium = UserConfig.getInstance(ecVar.U).isPremium();
                    ci.o oVar2 = isPremium ? null : new ci.o(ecVar, 1);
                    n70 F = n70.F(frameLayout, dVar, ecVar.T0);
                    ecVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ecVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 >= 4) {
                            n70 n70Var3 = ecVar.V0;
                            n70Var3.s = 0;
                            n70Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            n70 n70Var4 = ecVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.i6.E8;
                            n70Var4.b(0, null, string, i12, i12, new n8(oVar, i11, 2));
                            n70Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new n8(oVar2, i11, 3));
                            if (ecVar.X0 == i10) {
                                ecVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 5:
                ci.p3 p3Var = (ci.p3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                ci.s3 s3Var = (ci.s3) this.d;
                ci.x3 x3Var = p3Var.c;
                ArrayList arrayList2 = x3Var.h0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > x3Var.R) {
                    int i13 = -x3Var.N;
                    x3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(s3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(x3Var.d);
                x3Var.j();
                break;
            case 6:
                ci.qb qbVar = (ci.qb) this.b;
                Context context = (Context) this.c;
                pg.s0 s0Var = (pg.s0) this.d;
                if (!qbVar.B1) {
                    Runnable runnable2 = qbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    pg.x xVar = new pg.x(context, qbVar.G1);
                    qbVar.T1 = xVar;
                    xVar.m(qbVar.A1.a, 2);
                    xVar.n = new ci.s5(qbVar, s0Var);
                    xVar.h = new ci.l5(0, qbVar, s0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                hg.f fVar = (hg.f) this.b;
                n70 F2 = n70.F(((bo) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.e6) this.d, fVar.n);
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
                hg.m0.S((hg.m0) this.b, (TL_account.TL_connectedBot) this.c, (id) this.d);
                break;
            case 9:
                hi.b bVar = (hi.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar.P(callback, bVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.p3 p3Var2 = (m.p3) this.b;
                ii.d6 d6Var = (ii.d6) this.c;
                ii.o0 o0Var = (ii.o0) this.d;
                p3Var2.a();
                d6Var.D(o0Var);
                break;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.e6) this.d);
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                b5Var.J(-1, 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 13:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.z4 z4Var = (org.telegram.ui.Components.z4) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                z4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
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
                ((org.telegram.ui.Components.g8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 16:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
                int i14 = viVar.J1;
                fi fiVar = viVar.I0;
                kf kfVar2 = viVar.h0;
                long k10 = kfVar2 != null ? kfVar2.k() : 0L;
                viVar.N0 = k10;
                fiVar.setEffect(k10);
                viVar.forceKeyboardOnDismiss();
                if (viVar.K - viVar.L < 0) {
                    AndroidUtilities.shakeView(viVar.s);
                    AndroidUtilities.shakeView(viVar.v);
                    try {
                        fiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > viVar.L) {
                        viVar.O1(n2Var);
                    }
                    kf kfVar3 = viVar.h0;
                    if (kfVar3 != null) {
                        kfVar3.h(false);
                        viVar.h0 = null;
                        break;
                    }
                } else {
                    if (viVar.H1 == null && (n2Var2 instanceof bo)) {
                        bo boVar = (bo) n2Var2;
                        if (boVar.c()) {
                            org.telegram.ui.Components.c5.M(viVar.getContext(), boVar.a(), new z1(viVar, k10, 4), e6Var);
                            z10 = false;
                            viVar.H1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    ni niVar = viVar.y0;
                    if (niVar == viVar.j0 || niVar == viVar.q0) {
                        kfVar = null;
                        z11 = true;
                        G1 = viVar.G1(0, true, 0, viVar.s1(), k10);
                    } else {
                        if (!niVar.I(0, true, 0, viVar.s1(), k10)) {
                            viVar.A2 = true;
                            viVar.dismiss();
                        }
                        kfVar = null;
                        G1 = false;
                        z11 = true;
                    }
                    kf kfVar4 = viVar.h0;
                    if (kfVar4 != null) {
                        kfVar4.h(G1 ^ z11);
                        viVar.h0 = kfVar;
                    }
                    viVar.H1(z10, z10);
                }
                break;
            case 17:
                vi viVar2 = (vi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                ub0 ub0Var2 = (ub0) this.d;
                viVar2.H1(!viVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = viVar2.c0;
                message.invert_media = z12;
                ub0Var2.a(!z12, true);
                viVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (ub0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    ub0Var.a(!viVar2.c0, true);
                }
                viVar2.h0.n(!viVar2.c0);
                break;
            case 18:
                mr mrVar = (mr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ci.d dVar2 = (ci.d) this.d;
                callback2.run(new nf.e(new xp(dVar2, 4), new oh(18, mrVar, dVar2)));
                break;
            case 19:
                kr krVar = (kr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                krVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                bu buVar = (bu) this.b;
                fi.o oVar3 = (fi.o) this.c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) buVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(buVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                u1Var.run();
                break;
            case 21:
                ju juVar = (ju) this.b;
                pv0 pv0Var = (pv0) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                eu euVar = juVar.a;
                hg.l lVar = juVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = juVar.K;
                    if (p1Var == null || !p1Var.f) {
                        if (!juVar.n) {
                            if (!juVar.e) {
                                juVar.x(1);
                                boolean isFocused = euVar.isFocused();
                                juVar.d.B(euVar.length() > 0, false);
                                euVar.requestFocus();
                                if (!isFocused) {
                                    euVar.setSelection(euVar.length());
                                    break;
                                }
                            } else {
                                if (juVar.x) {
                                    juVar.k(true);
                                    juVar.x = false;
                                    juVar.p();
                                }
                                juVar.v();
                                break;
                            }
                        } else {
                            euVar.hideActionMode();
                            n70 n70Var5 = new n70(pv0Var, e6Var2, lVar, false, false, true);
                            n70Var5.X = AndroidUtilities.dp(280.0f);
                            euVar.extendActionMode(null, new oa0(n70Var5, new org.telegram.ui.Components.x2(euVar, 4), euVar.getOnPremiumMenuLockClickListener()));
                            n70Var5.U = true;
                            n70Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                n20 n20Var = (n20) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                n20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new lv(n20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                v80 v80Var = (v80) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    if (v80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v80Var.b));
                        if (f3Var2 == null || f3Var2.getContainer() == null) {
                            vc.j(n2Var4).j();
                        } else {
                            new vc(f3Var2.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 24:
                pb0 pb0Var = (pb0) this.b;
                ub0 ub0Var3 = (ub0) this.c;
                ub0 ub0Var4 = (ub0) this.d;
                vb0 vb0Var = pb0Var.c0;
                MessagePreviewParams messagePreviewParams = vb0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (vb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    vb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    vb0Var.x = true;
                }
                ub0Var3.a(z14, true);
                ub0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                pb0Var.h();
                pb0Var.k(true);
                break;
            case 25:
                ae0.n((ae0) this.b, (TLRPC.ChatFull) this.c, (e70) this.d);
                break;
            case 26:
                kf0 kf0Var = (kf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                if (kf0Var.h == null) {
                    ci.b4 b4Var = new ci.b4(context4, e6Var3, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f);
                    kf0Var.h = b4Var;
                    b4Var.setOnDismissListener(new bc0(kf0Var, 8));
                    kf0Var.h.f = kf0Var.n;
                }
                kf0Var.h.show();
                break;
            case 27:
                t31 t31Var = (t31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                v31 v31Var = t31Var.h;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = v31Var.v;
                u31 u31Var = v31Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = u31Var.d;
                    if (view2 == v31Var.E || view2 == v31Var.r) {
                        v31Var.w = v31Var.v;
                    }
                    r31 r31Var = t31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    v31Var.v = str2;
                    r31Var.setText(v31.y(v31.E(str2, null, null)));
                    u31Var.D(v31Var.h != null ? v31Var.n : v31Var.y);
                    v31.I(v31Var.v);
                    v31Var.M();
                    break;
                }
                break;
            case 28:
                zk zkVar = (zk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j3 = zkVar.b;
                translateController.setHideTranslateDialog(j3, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(zkVar.a).getChat(Long.valueOf(-j3));
                vc.a0(zkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ar0(13, zkVar, translateController)).j();
                n1Var.d(true);
                break;
            default:
                au0 au0Var = (au0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!au0Var.L1) {
                    Runnable runnable6 = au0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    pg.x xVar2 = new pg.x(context5, au0Var.Q1);
                    xVar2.m(au0Var.K1.a, 2);
                    xVar2.n = new qg.w(au0Var, bitmap);
                    xVar2.h = new qg.m(au0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(v80 v80Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.b = v80Var;
        this.d = f3Var;
        this.c = n2Var;
    }
}
