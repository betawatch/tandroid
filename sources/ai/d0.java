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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.d70;
import org.telegram.ui.vt0;
import org.telegram.ui.wk;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        of ofVar;
        boolean z11;
        boolean F1;
        hc0 hc0Var;
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
                ci.ca caVar = (ci.ca) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                e6 e6Var = v5Var.l;
                e6Var.F0(caVar, storyItem);
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
                yc X = yc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var3, jcVar))).j();
                    break;
                }
                break;
            case 3:
                s6 s6Var = (s6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                b80 b80Var = (b80) this.d;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.b;
                new wv(y3Var, k7Var.getContext(), k7Var.s, arrayList).show();
                b80Var.u();
                break;
            case 4:
                ci.ac acVar = (ci.ac) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                d dVar = (d) this.d;
                b80 b80Var2 = acVar.V0;
                if (b80Var2 == null || !b80Var2.D()) {
                    ci.o oVar = new ci.o(acVar, 0);
                    boolean isPremium = UserConfig.getInstance(acVar.U).isPremium();
                    ci.o oVar2 = isPremium ? null : new ci.o(acVar, 1);
                    b80 F = b80.F(frameLayout, dVar, acVar.T0);
                    acVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    acVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 >= 4) {
                            b80 b80Var3 = acVar.V0;
                            b80Var3.s = 0;
                            b80Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            b80 b80Var4 = acVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.i6.E8;
                            b80Var4.b(0, null, string, i12, i12, new o8(oVar, i11, 2));
                            b80Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new o8(oVar2, i11, 3));
                            if (acVar.X0 == i10) {
                                acVar.V0.L();
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
                ci.mb mbVar = (ci.mb) this.b;
                Context context = (Context) this.c;
                pg.u0 u0Var = (pg.u0) this.d;
                if (!mbVar.B1) {
                    Runnable runnable2 = mbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    pg.x xVar = new pg.x(context, mbVar.G1);
                    mbVar.T1 = xVar;
                    xVar.m(mbVar.A1.a, 2);
                    xVar.n = new ci.r5(mbVar, u0Var);
                    xVar.h = new ci.k5(0, mbVar, u0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                hg.f fVar = (hg.f) this.b;
                b80 F2 = b80.F(((yn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.n);
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
                hg.l0.Q((hg.l0) this.b, (TL_account.TL_connectedBot) this.c, (ld) this.d);
                break;
            case 9:
                hi.b bVar = (hi.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar.N(callback, bVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.p3 p3Var = (m.p3) this.b;
                ii.f6 f6Var = (ii.f6) this.c;
                ii.o0 o0Var = (ii.o0) this.d;
                p3Var.a();
                f6Var.D(o0Var);
                break;
            case 11:
                org.telegram.ui.Components.q.N((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.d6) this.d);
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                d5Var.K(-1, 0, true);
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
                xi xiVar = (xi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = xiVar.f0;
                int i14 = xiVar.J1;
                ei eiVar = xiVar.I0;
                of ofVar2 = xiVar.h0;
                long k10 = ofVar2 != null ? ofVar2.k() : 0L;
                xiVar.N0 = k10;
                eiVar.setEffect(k10);
                xiVar.forceKeyboardOnDismiss();
                if (xiVar.K - xiVar.L < 0) {
                    AndroidUtilities.shakeView(xiVar.s);
                    AndroidUtilities.shakeView(xiVar.v);
                    try {
                        eiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i14).premiumFeaturesBlocked() && MessagesController.getInstance(i14).captionLengthLimitPremium > xiVar.L) {
                        xiVar.N1(n2Var);
                    }
                    of ofVar3 = xiVar.h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        xiVar.h0 = null;
                        break;
                    }
                } else {
                    if (xiVar.H1 == null && (n2Var2 instanceof yn)) {
                        yn ynVar = (yn) n2Var2;
                        if (ynVar.c()) {
                            org.telegram.ui.Components.e5.M(xiVar.getContext(), ynVar.a(), new z1(xiVar, k10, 4), d6Var);
                            z10 = false;
                            xiVar.G1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    pi piVar = xiVar.y0;
                    if (piVar == xiVar.j0 || piVar == xiVar.q0) {
                        ofVar = null;
                        z11 = true;
                        F1 = xiVar.F1(0, true, 0, xiVar.r1(), k10);
                    } else {
                        if (!piVar.G(0, true, 0, xiVar.r1(), k10)) {
                            xiVar.A2 = true;
                            xiVar.dismiss();
                        }
                        ofVar = null;
                        F1 = false;
                        z11 = true;
                    }
                    of ofVar4 = xiVar.h0;
                    if (ofVar4 != null) {
                        ofVar4.h(F1 ^ z11);
                        xiVar.h0 = ofVar;
                    }
                    xiVar.G1(z10, z10);
                }
                break;
            case 17:
                xi xiVar2 = (xi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                hc0 hc0Var2 = (hc0) this.d;
                xiVar2.G1(!xiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = xiVar2.c0;
                message.invert_media = z12;
                hc0Var2.a(!z12, true);
                xiVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (hc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    hc0Var.a(!xiVar2.c0, true);
                }
                xiVar2.h0.n(!xiVar2.c0);
                break;
            case 18:
                pr prVar = (pr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ci.d dVar2 = (ci.d) this.d;
                callback2.run(new nf.e(new aq(dVar2, 4), new be(22, prVar, dVar2)));
                break;
            case 19:
                nr nrVar = (nr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                nrVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                eu euVar = (eu) this.b;
                fi.o oVar3 = (fi.o) this.c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) euVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(euVar.getContext());
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
                mu muVar = (mu) this.b;
                mw0 mw0Var = (mw0) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                hu huVar = muVar.a;
                hg.l lVar = muVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.p1 p1Var = muVar.K;
                    if (p1Var == null || !p1Var.f) {
                        if (!muVar.n) {
                            if (!muVar.e) {
                                muVar.x(1);
                                boolean isFocused = huVar.isFocused();
                                muVar.d.B(huVar.length() > 0, false);
                                huVar.requestFocus();
                                if (!isFocused) {
                                    huVar.setSelection(huVar.length());
                                    break;
                                }
                            } else {
                                if (muVar.x) {
                                    muVar.k(true);
                                    muVar.x = false;
                                    muVar.p();
                                }
                                muVar.v();
                                break;
                            }
                        } else {
                            huVar.hideActionMode();
                            b80 b80Var5 = new b80(mw0Var, d6Var2, lVar, false, false, true);
                            b80Var5.X = AndroidUtilities.dp(280.0f);
                            huVar.extendActionMode(null, new cb0(b80Var5, new org.telegram.ui.Components.y2(huVar, 4), huVar.getOnPremiumMenuLockClickListener()));
                            b80Var5.U = true;
                            b80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                r20 r20Var = (r20) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                r20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new pv(r20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                j90 j90Var = (j90) this.b;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.c;
                try {
                    if (j90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j90Var.b));
                        if (f3Var3 == null || f3Var3.getContainer() == null) {
                            yc.j(n2Var4).j();
                        } else {
                            new yc(f3Var3.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 24:
                cc0 cc0Var = (cc0) this.b;
                hc0 hc0Var3 = (hc0) this.c;
                hc0 hc0Var4 = (hc0) this.d;
                ic0 ic0Var = cc0Var.c0;
                MessagePreviewParams messagePreviewParams = ic0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (ic0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    ic0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    ic0Var.x = true;
                }
                hc0Var3.a(z14, true);
                hc0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                cc0Var.h();
                cc0Var.k(true);
                break;
            case 25:
                me0.n((me0) this.b, (TLRPC.ChatFull) this.c, (d70) this.d);
                break;
            case 26:
                wf0 wf0Var = (wf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (wf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context4, d6Var3, LocaleController.getString(R.string.VideoChooseCover), wf0Var.f);
                    wf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new lc0(wf0Var, 9));
                    wf0Var.h.f = wf0Var.n;
                }
                wf0Var.h.show();
                break;
            case 27:
                s41 s41Var = (s41) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                u41 u41Var = s41Var.h;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = u41Var.v;
                t41 t41Var = u41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = t41Var.d;
                    if (view2 == u41Var.E || view2 == u41Var.r) {
                        u41Var.w = u41Var.v;
                    }
                    q41 q41Var = s41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    u41Var.v = str2;
                    q41Var.setText(u41.y(u41.C(str2, null, null)));
                    t41Var.D(u41Var.h != null ? u41Var.n : u41Var.y);
                    u41.G(u41Var.v);
                    u41Var.K();
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
                yc.a0(wkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new vo0(17, wkVar, translateController)).j();
                n1Var.d(true);
                break;
            default:
                vt0 vt0Var = (vt0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!vt0Var.L1) {
                    Runnable runnable6 = vt0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    pg.x xVar2 = new pg.x(context5, vt0Var.Q1);
                    xVar2.m(vt0Var.K1.a, 2);
                    xVar2.n = new qg.v(vt0Var, bitmap);
                    xVar2.h = new qg.m(vt0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(j90 j90Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.b = j90Var;
        this.d = f3Var;
        this.c = n2Var;
    }
}
