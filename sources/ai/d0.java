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
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yp;
import org.telegram.ui.b70;
import org.telegram.ui.tt0;
import org.telegram.ui.wk;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        mf mfVar;
        boolean z11;
        boolean G1;
        tb0 tb0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                f3Var.run(Long.valueOf(jArr[0]));
                f3Var2.dismiss();
                break;
            case 1:
                v5 v5Var = (v5) this.b;
                ci.da daVar = (ci.da) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                e6 e6Var = v5Var.l;
                e6Var.F0(daVar, storyItem);
                v5 v5Var2 = e6Var.t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    break;
                }
                break;
            case 2:
                v5 v5Var3 = (v5) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                jc jcVar = (jc) this.d;
                f1Var.performHapticFeedback(3);
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var3, jcVar))).j();
                    break;
                }
                break;
            case 3:
                s6 s6Var = (s6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                o70 o70Var = (o70) this.d;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.b;
                new tv(y3Var, k7Var.getContext(), k7Var.s, arrayList).show();
                o70Var.u();
                break;
            case 4:
                ci.bc bcVar = (ci.bc) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                d dVar = (d) this.d;
                o70 o70Var2 = bcVar.V0;
                if (o70Var2 == null || !o70Var2.D()) {
                    ci.o oVar = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    ci.o oVar2 = isPremium ? null : new ci.o(bcVar, 1);
                    o70 F = o70.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 >= 4) {
                            o70 o70Var3 = bcVar.V0;
                            o70Var3.s = 0;
                            o70Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            o70 o70Var4 = bcVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            o70Var4.b(0, null, string, i12, i12, new o8(oVar, i11, 2));
                            o70Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new o8(oVar2, i11, 3));
                            if (bcVar.X0 == i10) {
                                bcVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 5:
                ci.o3 o3Var = (ci.o3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                ci.r3 r3Var = (ci.r3) this.d;
                ci.w3 w3Var = o3Var.c;
                ArrayList arrayList2 = w3Var.h0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > w3Var.R) {
                    int i13 = -w3Var.N;
                    w3Var.N = i13;
                    AndroidUtilities.shakeViewSpring(r3Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(w3Var.d);
                w3Var.j();
                break;
            case 6:
                ci.nb nbVar = (ci.nb) this.b;
                Context context = (Context) this.c;
                pg.t0 t0Var = (pg.t0) this.d;
                if (!nbVar.B1) {
                    Runnable runnable2 = nbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    pg.x xVar = new pg.x(context, nbVar.G1);
                    nbVar.T1 = xVar;
                    xVar.m(nbVar.A1.a, 2);
                    xVar.n = new ci.r5(nbVar, t0Var);
                    xVar.h = new ci.k5(0, nbVar, t0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                hg.f fVar = (hg.f) this.b;
                o70 F2 = o70.F(((xn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.n);
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
                hg.m0.S((hg.m0) this.b, (TL_account.TL_connectedBot) this.c, (kd) this.d);
                break;
            case 9:
                hi.b bVar = (hi.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar.P(callback, bVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.p3 p3Var = (m.p3) this.b;
                ii.e6 e6Var2 = (ii.e6) this.c;
                ii.o0 o0Var = (ii.o0) this.d;
                p3Var.a();
                e6Var2.D(o0Var);
                break;
            case 11:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.d6) this.d);
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
                ((org.telegram.ui.Components.i8) this.b).n.B0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 16:
                wi wiVar = (wi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = wiVar.f0;
                int i14 = wiVar.J1;
                gi giVar = wiVar.I0;
                mf mfVar2 = wiVar.h0;
                long k10 = mfVar2 != null ? mfVar2.k() : 0L;
                wiVar.N0 = k10;
                giVar.setEffect(k10);
                wiVar.forceKeyboardOnDismiss();
                if (wiVar.K - wiVar.L < 0) {
                    AndroidUtilities.shakeView(wiVar.s);
                    AndroidUtilities.shakeView(wiVar.v);
                    try {
                        giVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > wiVar.L) {
                        wiVar.O1(n2Var);
                    }
                    mf mfVar3 = wiVar.h0;
                    if (mfVar3 != null) {
                        mfVar3.h(false);
                        wiVar.h0 = null;
                        break;
                    }
                } else {
                    if (wiVar.H1 == null && (n2Var2 instanceof xn)) {
                        xn xnVar = (xn) n2Var2;
                        if (xnVar.c()) {
                            org.telegram.ui.Components.e5.M(wiVar.getContext(), xnVar.a(), new z1(wiVar, k10, 4), d6Var);
                            z10 = false;
                            wiVar.H1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    oi oiVar = wiVar.y0;
                    if (oiVar == wiVar.j0 || oiVar == wiVar.q0) {
                        mfVar = null;
                        z11 = true;
                        G1 = wiVar.G1(0, true, 0, wiVar.s1(), k10);
                    } else {
                        if (!oiVar.I(0, true, 0, wiVar.s1(), k10)) {
                            wiVar.A2 = true;
                            wiVar.dismiss();
                        }
                        mfVar = null;
                        G1 = false;
                        z11 = true;
                    }
                    mf mfVar4 = wiVar.h0;
                    if (mfVar4 != null) {
                        mfVar4.h(G1 ^ z11);
                        wiVar.h0 = mfVar;
                    }
                    wiVar.H1(z10, z10);
                }
                break;
            case 17:
                wi wiVar2 = (wi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                tb0 tb0Var2 = (tb0) this.d;
                wiVar2.H1(!wiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = wiVar2.c0;
                message.invert_media = z12;
                tb0Var2.a(!z12, true);
                wiVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (tb0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    tb0Var.a(!wiVar2.c0, true);
                }
                wiVar2.h0.n(!wiVar2.c0);
                break;
            case 18:
                nr nrVar = (nr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ci.d dVar2 = (ci.d) this.d;
                callback2.run(new nf.e(new yp(dVar2, 4), new ph(18, nrVar, dVar2)));
                break;
            case 19:
                lr lrVar = (lr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) this.d;
                lrVar.getClass();
                AndroidUtilities.addToClipboard(d9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                cu cuVar = (cu) this.b;
                fi.o oVar3 = (fi.o) this.c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) cuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(cuVar.getContext());
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
                ku kuVar = (ku) this.b;
                pv0 pv0Var = (pv0) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                fu fuVar = kuVar.a;
                hg.l lVar = kuVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = kuVar.K;
                    if (p1Var == null || !p1Var.f) {
                        if (!kuVar.n) {
                            if (!kuVar.e) {
                                kuVar.x(1);
                                boolean isFocused = fuVar.isFocused();
                                kuVar.d.B(fuVar.length() > 0, false);
                                fuVar.requestFocus();
                                if (!isFocused) {
                                    fuVar.setSelection(fuVar.length());
                                    break;
                                }
                            } else {
                                if (kuVar.x) {
                                    kuVar.k(true);
                                    kuVar.x = false;
                                    kuVar.p();
                                }
                                kuVar.v();
                                break;
                            }
                        } else {
                            fuVar.hideActionMode();
                            o70 o70Var5 = new o70(pv0Var, d6Var2, lVar, false, false, true);
                            o70Var5.X = AndroidUtilities.dp(280.0f);
                            fuVar.extendActionMode(null, new pa0(o70Var5, new org.telegram.ui.Components.x2(fuVar, 4), fuVar.getOnPremiumMenuLockClickListener()));
                            o70Var5.U = true;
                            o70Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                o20 o20Var = (o20) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                o20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new mv(o20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                w80 w80Var = (w80) this.b;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    if (w80Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w80Var.b));
                        if (f3Var3 == null || f3Var3.getContainer() == null) {
                            xc.j(n2Var4).j();
                        } else {
                            new xc(f3Var3.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 24:
                ob0 ob0Var = (ob0) this.b;
                tb0 tb0Var3 = (tb0) this.c;
                tb0 tb0Var4 = (tb0) this.d;
                ub0 ub0Var = ob0Var.c0;
                MessagePreviewParams messagePreviewParams = ub0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (ub0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ub0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    ub0Var.x = true;
                }
                tb0Var3.a(z14, true);
                tb0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                ob0Var.h();
                ob0Var.k(true);
                break;
            case 25:
                ae0.n((ae0) this.b, (TLRPC.ChatFull) this.c, (b70) this.d);
                break;
            case 26:
                kf0 kf0Var = (kf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (kf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context4, d6Var3, LocaleController.getString(R.string.VideoChooseCover), kf0Var.f);
                    kf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new ac0(kf0Var, 8));
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
                    q31Var.setText(u31.y(u31.E(str2, null, null)));
                    t31Var.D(u31Var.h != null ? u31Var.n : u31Var.y);
                    u31.I(u31Var.v);
                    u31Var.M();
                    break;
                }
                break;
            case 28:
                wk wkVar = (wk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j3 = wkVar.b;
                translateController.setHideTranslateDialog(j3, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.a).getChat(Long.valueOf(-j3));
                xc.a0(wkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ar0(13, wkVar, translateController)).j();
                n1Var.d(true);
                break;
            default:
                tt0 tt0Var = (tt0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!tt0Var.L1) {
                    Runnable runnable6 = tt0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    pg.x xVar2 = new pg.x(context5, tt0Var.Q1);
                    xVar2.m(tt0Var.K1.a, 2);
                    xVar2.n = new qg.w(tt0Var, bitmap);
                    xVar2.h = new qg.m(tt0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(w80 w80Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.b = w80Var;
        this.d = f3Var;
        this.c = n2Var;
    }
}
