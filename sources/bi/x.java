package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import di.fc;
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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.co;
import org.telegram.ui.f70;
import org.telegram.ui.zk;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        boolean z10;
        nf nfVar;
        boolean z11;
        boolean G1;
        vb0 vb0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                o1 o1Var = (o1) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                o1Var.run(Long.valueOf(jArr[0]));
                f3Var.dismiss();
                break;
            case 1:
                f5 f5Var = (f5) this.b;
                di.ga gaVar = (di.ga) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                o5 o5Var = f5Var.l;
                o5Var.F0(gaVar, storyItem);
                f5 f5Var2 = o5Var.t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    break;
                }
                break;
            case 2:
                f5 f5Var3 = (f5) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                pb pbVar = (pb) this.d;
                f1Var.performHapticFeedback(3);
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(21, f5Var3, pbVar))).j();
                    break;
                }
                break;
            case 3:
                b6 b6Var = (b6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                n70 n70Var = (n70) this.d;
                l3 l3Var = new l3(b6Var, 1);
                s6 s6Var = b6Var.b;
                new rv(l3Var, s6Var.getContext(), s6Var.s, arrayList).show();
                n70Var.u();
                break;
            case 4:
                fc fcVar = (fc) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                b bVar = (b) this.d;
                n70 n70Var2 = fcVar.V0;
                if (n70Var2 == null || !n70Var2.D()) {
                    di.o oVar = new di.o(fcVar, 0);
                    boolean isPremium = UserConfig.getInstance(fcVar.U).isPremium();
                    di.o oVar2 = isPremium ? null : new di.o(fcVar, 1);
                    n70 F = n70.F(frameLayout, bVar, fcVar.T0);
                    fcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    fcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = di.r.Q1;
                        if (i10 >= 4) {
                            n70 n70Var3 = fcVar.V0;
                            n70Var3.s = 0;
                            n70Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            n70 n70Var4 = fcVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            n70Var4.b(0, null, string, i12, i12, new ah.g(oVar, i11, 3));
                            n70Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new ah.g(oVar2, i11, 4));
                            if (fcVar.X0 == i10) {
                                fcVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 5:
                di.p3 p3Var = (di.p3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                di.s3 s3Var = (di.s3) this.d;
                di.x3 x3Var = p3Var.c;
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
                di.rb rbVar = (di.rb) this.b;
                Context context = (Context) this.c;
                qg.s0 s0Var = (qg.s0) this.d;
                if (!rbVar.B1) {
                    Runnable runnable2 = rbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.x xVar = new qg.x(context, rbVar.G1);
                    rbVar.T1 = xVar;
                    xVar.m(rbVar.A1.a, 2);
                    xVar.n = new di.s5(rbVar, s0Var);
                    xVar.h = new di.l5(0, rbVar, s0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                ig.e eVar = (ig.e) this.b;
                n70 F2 = n70.F(((co) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 8:
                ig.k0.S((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (org.telegram.ui.Components.m8) this.d);
                break;
            case 9:
                ii.b bVar2 = (ii.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar2.P(callback, bVar2.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.p3 p3Var2 = (m.p3) this.b;
                ji.g6 g6Var = (ji.g6) this.c;
                ji.n0 n0Var = (ji.n0) this.d;
                p3Var2.a();
                g6Var.D(n0Var);
                break;
            case 11:
                org.telegram.ui.Components.r.P((org.telegram.ui.Components.r) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                d5Var.J(-1, 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 13:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                b5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
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
                ((org.telegram.ui.Components.j8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 16:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f0;
                int i14 = viVar.J1;
                fi fiVar = viVar.I0;
                nf nfVar2 = viVar.h0;
                long k10 = nfVar2 != null ? nfVar2.k() : 0L;
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
                    nf nfVar3 = viVar.h0;
                    if (nfVar3 != null) {
                        nfVar3.h(false);
                        viVar.h0 = null;
                        break;
                    }
                } else {
                    if (viVar.H1 == null && (n2Var2 instanceof co)) {
                        co coVar = (co) n2Var2;
                        if (coVar.c()) {
                            org.telegram.ui.Components.e5.M(viVar.getContext(), coVar.a(), new p1(viVar, k10, 4), f6Var);
                            z10 = false;
                            viVar.H1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    ni niVar = viVar.y0;
                    if (niVar == viVar.j0 || niVar == viVar.q0) {
                        nfVar = null;
                        z11 = true;
                        G1 = viVar.G1(0, true, 0, viVar.s1(), k10);
                    } else {
                        if (!niVar.I(0, true, 0, viVar.s1(), k10)) {
                            viVar.A2 = true;
                            viVar.dismiss();
                        }
                        nfVar = null;
                        G1 = false;
                        z11 = true;
                    }
                    nf nfVar4 = viVar.h0;
                    if (nfVar4 != null) {
                        nfVar4.h(G1 ^ z11);
                        viVar.h0 = nfVar;
                    }
                    viVar.H1(z10, z10);
                }
                break;
            case 17:
                vi viVar2 = (vi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                vb0 vb0Var2 = (vb0) this.d;
                viVar2.H1(!viVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = viVar2.c0;
                message.invert_media = z12;
                vb0Var2.a(!z12, true);
                viVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (vb0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    vb0Var.a(!viVar2.c0, true);
                }
                viVar2.h0.n(!viVar2.c0);
                break;
            case 18:
                lr lrVar = (lr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                di.d dVar = (di.d) this.d;
                callback2.run(new of.e(new wp(dVar, 4), new uc(24, lrVar, dVar)));
                break;
            case 19:
                jr jrVar = (jr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                jrVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                zt ztVar = (zt) this.b;
                gi.o oVar3 = (gi.o) this.c;
                di.u1 u1Var = (di.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) ztVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ztVar.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                u1Var.run();
                break;
            case 21:
                hu huVar = (hu) this.b;
                ov0 ov0Var = (ov0) this.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                cu cuVar = huVar.a;
                ig.k kVar = huVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = huVar.K;
                    if (p1Var == null || !p1Var.f) {
                        if (!huVar.n) {
                            if (!huVar.e) {
                                huVar.x(1);
                                boolean isFocused = cuVar.isFocused();
                                huVar.d.F(cuVar.length() > 0, false);
                                cuVar.requestFocus();
                                if (!isFocused) {
                                    cuVar.setSelection(cuVar.length());
                                    break;
                                }
                            } else {
                                if (huVar.x) {
                                    huVar.k(true);
                                    huVar.x = false;
                                    huVar.p();
                                }
                                huVar.v();
                                break;
                            }
                        } else {
                            cuVar.hideActionMode();
                            n70 n70Var5 = new n70(ov0Var, f6Var2, kVar, false, false, true);
                            n70Var5.X = AndroidUtilities.dp(280.0f);
                            cuVar.extendActionMode(null, new pa0(n70Var5, new org.telegram.ui.Components.y2(cuVar, 4), cuVar.getOnPremiumMenuLockClickListener()));
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
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new kv(n20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                w80 w80Var = (w80) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    if (w80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w80Var.b));
                        if (f3Var2 == null || f3Var2.getContainer() == null) {
                            yc.j(n2Var4).j();
                        } else {
                            new yc(f3Var2.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 24:
                qb0 qb0Var = (qb0) this.b;
                vb0 vb0Var3 = (vb0) this.c;
                vb0 vb0Var4 = (vb0) this.d;
                wb0 wb0Var = qb0Var.c0;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (wb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    wb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    wb0Var.x = true;
                }
                vb0Var3.a(z14, true);
                vb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                qb0Var.h();
                qb0Var.k(true);
                break;
            case 25:
                ae0.n((ae0) this.b, (TLRPC.ChatFull) this.c, (f70) this.d);
                break;
            case 26:
                kf0 kf0Var = (kf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                if (kf0Var.h == null) {
                    di.b4 b4Var = new di.b4(context4, f6Var3, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f);
                    kf0Var.h = b4Var;
                    b4Var.setOnDismissListener(new cc0(kf0Var, 8));
                    kf0Var.h.f = kf0Var.n;
                }
                kf0Var.h.show();
                break;
            case 27:
                s31 s31Var = (s31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                u31 u31Var = s31Var.h;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = u31Var.v;
                t31 t31Var = u31Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = t31Var.d;
                    if (view2 == u31Var.E || view2 == u31Var.r) {
                        u31Var.w = u31Var.v;
                    }
                    q31 q31Var = s31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    u31Var.v = str2;
                    q31Var.setText(u31.y(u31.D(str2, null, null)));
                    t31Var.D(u31Var.h != null ? u31Var.n : u31Var.y);
                    u31.I(u31Var.v);
                    u31Var.M();
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
                yc.a0(zkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new jn0(19, zkVar, translateController)).j();
                n1Var.d(true);
                break;
            default:
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
                    qg.x xVar2 = new qg.x(context5, zt0Var.Q1);
                    xVar2.m(zt0Var.K1.a, 2);
                    xVar2.n = new rg.w(zt0Var, bitmap);
                    xVar2.h = new rg.n(zt0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(w80 w80Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.b = w80Var;
        this.d = f3Var;
        this.c = n2Var;
    }
}
