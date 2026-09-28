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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.st0;
import org.telegram.ui.wk;
import org.telegram.ui.wn;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        nf nfVar;
        boolean z11;
        boolean G1;
        gc0 gc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                f3Var.run(Long.valueOf(jArr[0]));
                e3Var.dismiss();
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
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                jc jcVar = (jc) this.d;
                e1Var.performHapticFeedback(3);
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.e(12, v5Var3, jcVar))).j();
                    break;
                }
                break;
            case 3:
                s6 s6Var = (s6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                a80 a80Var = (a80) this.d;
                y3 y3Var = new y3(s6Var, 1);
                k7 k7Var = s6Var.b;
                new uv(y3Var, k7Var.getContext(), k7Var.s, arrayList).show();
                a80Var.u();
                break;
            case 4:
                ci.bc bcVar = (ci.bc) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                d dVar = (d) this.d;
                a80 a80Var2 = bcVar.V0;
                if (a80Var2 == null || !a80Var2.D()) {
                    ci.o oVar = new ci.o(bcVar, 0);
                    boolean isPremium = UserConfig.getInstance(bcVar.U).isPremium();
                    ci.o oVar2 = isPremium ? null : new ci.o(bcVar, 1);
                    a80 F = a80.F(frameLayout, dVar, bcVar.T0);
                    bcVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    bcVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ci.r.Q1;
                        if (i10 >= 4) {
                            a80 a80Var3 = bcVar.V0;
                            a80Var3.s = 0;
                            a80Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            a80 a80Var4 = bcVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.h6.E8;
                            a80Var4.b(0, null, string, i12, i12, new o8(oVar, i11, 2));
                            a80Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new o8(oVar2, i11, 3));
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
                    xVar.m(nbVar.A1.a, 2);
                    xVar.n = new ci.r5(nbVar, u0Var);
                    xVar.h = new ci.k5(0, nbVar, u0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                hg.f fVar = (hg.f) this.b;
                a80 F2 = a80.F(((wn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, fVar.n);
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
                hg.m0.S((hg.m0) this.b, (TL_account.TL_connectedBot) this.c, (ld) this.d);
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
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                zArr[0] = false;
                d5Var.J(-1, 0, true);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 13:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    a2Var.setOnDismissListener(null);
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
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f0;
                int i14 = wiVar.J1;
                gi giVar = wiVar.I0;
                nf nfVar2 = wiVar.h0;
                long k10 = nfVar2 != null ? nfVar2.k() : 0L;
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
                        wiVar.O1(m2Var);
                    }
                    nf nfVar3 = wiVar.h0;
                    if (nfVar3 != null) {
                        nfVar3.h(false);
                        wiVar.h0 = null;
                        break;
                    }
                } else {
                    if (wiVar.H1 == null && (m2Var2 instanceof wn)) {
                        wn wnVar = (wn) m2Var2;
                        if (wnVar.c()) {
                            org.telegram.ui.Components.e5.M(wiVar.getContext(), wnVar.a(), new z1(wiVar, k10, 4), d6Var);
                            z10 = false;
                            wiVar.H1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    oi oiVar = wiVar.y0;
                    if (oiVar == wiVar.j0 || oiVar == wiVar.q0) {
                        nfVar = null;
                        z11 = true;
                        G1 = wiVar.G1(0, true, 0, wiVar.s1(), k10);
                    } else {
                        if (!oiVar.I(0, true, 0, wiVar.s1(), k10)) {
                            wiVar.A2 = true;
                            wiVar.dismiss();
                        }
                        nfVar = null;
                        G1 = false;
                        z11 = true;
                    }
                    nf nfVar4 = wiVar.h0;
                    if (nfVar4 != null) {
                        nfVar4.h(G1 ^ z11);
                        wiVar.h0 = nfVar;
                    }
                    wiVar.H1(z10, z10);
                }
                break;
            case 17:
                wi wiVar2 = (wi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                gc0 gc0Var2 = (gc0) this.d;
                wiVar2.H1(!wiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = wiVar2.c0;
                message.invert_media = z12;
                gc0Var2.a(!z12, true);
                wiVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (gc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    gc0Var.a(!wiVar2.c0, true);
                }
                wiVar2.h0.n(!wiVar2.c0);
                break;
            case 18:
                or orVar = (or) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ci.d dVar2 = (ci.d) this.d;
                callback2.run(new nf.e(new zp(dVar2, 4), new kd(23, orVar, dVar2)));
                break;
            case 19:
                mr mrVar = (mr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                mrVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                du duVar = (du) this.b;
                fi.o oVar3 = (fi.o) this.c;
                ci.u1 u1Var = (ci.u1) this.d;
                try {
                    charSequence = ((ClipboardManager) duVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(duVar.getContext());
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
                lu luVar = (lu) this.b;
                cw0 cw0Var = (cw0) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                gu guVar = luVar.a;
                hg.l lVar = luVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = luVar.K;
                    if (o1Var == null || !o1Var.f) {
                        if (!luVar.n) {
                            if (!luVar.e) {
                                luVar.x(1);
                                boolean isFocused = guVar.isFocused();
                                luVar.d.B(guVar.length() > 0, false);
                                guVar.requestFocus();
                                if (!isFocused) {
                                    guVar.setSelection(guVar.length());
                                    break;
                                }
                            } else {
                                if (luVar.x) {
                                    luVar.k(true);
                                    luVar.x = false;
                                    luVar.p();
                                }
                                luVar.v();
                                break;
                            }
                        } else {
                            guVar.hideActionMode();
                            a80 a80Var5 = new a80(cw0Var, d6Var2, lVar, false, false, true);
                            a80Var5.X = AndroidUtilities.dp(280.0f);
                            guVar.extendActionMode(null, new cb0(a80Var5, new org.telegram.ui.Components.y2(guVar, 4), guVar.getOnPremiumMenuLockClickListener()));
                            a80Var5.U = true;
                            a80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                q20 q20Var = (q20) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.d;
                q20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new nv(q20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                m2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                i90 i90Var = (i90) this.b;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) this.c;
                try {
                    if (i90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i90Var.b));
                        if (e3Var2 == null || e3Var2.getContainer() == null) {
                            xc.j(m2Var4).j();
                        } else {
                            new xc(e3Var2.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 24:
                bc0 bc0Var = (bc0) this.b;
                gc0 gc0Var3 = (gc0) this.c;
                gc0 gc0Var4 = (gc0) this.d;
                hc0 hc0Var = bc0Var.c0;
                MessagePreviewParams messagePreviewParams = hc0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (hc0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    hc0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    hc0Var.x = true;
                }
                gc0Var3.a(z14, true);
                gc0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                bc0Var.h();
                bc0Var.k(true);
                break;
            case 25:
                me0.n((me0) this.b, (TLRPC.ChatFull) this.c, (z60) this.d);
                break;
            case 26:
                wf0 wf0Var = (wf0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                if (wf0Var.h == null) {
                    ci.a4 a4Var = new ci.a4(context4, d6Var3, LocaleController.getString(R.string.VideoChooseCover), wf0Var.f);
                    wf0Var.h = a4Var;
                    a4Var.setOnDismissListener(new kc0(wf0Var, 9));
                    wf0Var.h.f = wf0Var.n;
                }
                wf0Var.h.show();
                break;
            case 27:
                i41 i41Var = (i41) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                k41 k41Var = i41Var.h;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = k41Var.v;
                j41 j41Var = k41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = j41Var.d;
                    if (view2 == k41Var.E || view2 == k41Var.r) {
                        k41Var.w = k41Var.v;
                    }
                    g41 g41Var = i41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    k41Var.v = str2;
                    g41Var.setText(k41.y(k41.E(str2, null, null)));
                    j41Var.D(k41Var.h != null ? k41Var.n : k41Var.y);
                    k41.I(k41Var.v);
                    k41Var.M();
                    break;
                }
                break;
            case 28:
                wk wkVar = (wk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j3 = wkVar.b;
                translateController.setHideTranslateDialog(j3, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(wkVar.a).getChat(Long.valueOf(-j3));
                xc.a0(wkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new yn0(18, wkVar, translateController)).j();
                m1Var.d(true);
                break;
            default:
                st0 st0Var = (st0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!st0Var.L1) {
                    Runnable runnable6 = st0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    pg.x xVar2 = new pg.x(context5, st0Var.Q1);
                    xVar2.m(st0Var.K1.a, 2);
                    xVar2.n = new qg.w(st0Var, bitmap);
                    xVar2.h = new qg.m(st0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(i90 i90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 23;
        this.b = i90Var;
        this.d = e3Var;
        this.c = m2Var;
    }
}
