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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.el;
import org.telegram.ui.fo;
import org.telegram.ui.hu0;
import org.telegram.ui.j70;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        boolean z11;
        of ofVar;
        boolean J1;
        uc0 uc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                u2Var.run(Long.valueOf(jArr[0]));
                e3Var.dismiss();
                break;
            case 1:
                h5 h5Var = (h5) this.b;
                di.ca caVar = (di.ca) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                q5 q5Var = h5Var.l;
                q5Var.F0(caVar, storyItem);
                h5 h5Var2 = q5Var.t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    break;
                }
                break;
            case 2:
                h5 h5Var3 = (h5) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                sb sbVar = (sb) this.d;
                e1Var.performHapticFeedback(3);
                zc X = zc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new a1.f(23, h5Var3, sbVar))).j();
                    break;
                }
                break;
            case 3:
                e6 e6Var = (e6) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                m80 m80Var = (m80) this.d;
                o3 o3Var = new o3(e6Var, 1);
                w6 w6Var = e6Var.b;
                new ew(o3Var, w6Var.getContext(), w6Var.s, arrayList).show();
                m80Var.u();
                break;
            case 4:
                di.ac acVar = (di.ac) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                b bVar = (b) this.d;
                m80 m80Var2 = acVar.V0;
                if (m80Var2 == null || !m80Var2.D()) {
                    di.o oVar = new di.o(acVar, 0);
                    boolean isPremium = UserConfig.getInstance(acVar.U).isPremium();
                    di.o oVar2 = isPremium ? null : new di.o(acVar, 1);
                    m80 F = m80.F(frameLayout, bVar, acVar.T0);
                    acVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    acVar.V0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = di.r.Q1;
                        if (i10 >= 4) {
                            m80 m80Var3 = acVar.V0;
                            m80Var3.s = 0;
                            m80Var3.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            m80 m80Var4 = acVar.V0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.g6.E8;
                            m80Var4.b(0, null, string, i12, i12, new ah.g(oVar, i11, 3));
                            m80Var4.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new ah.g(oVar2, i11, 4));
                            if (acVar.X0 == i10) {
                                acVar.V0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 5:
                di.n3 n3Var = (di.n3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                di.q3 q3Var = (di.q3) this.d;
                di.v3 v3Var = n3Var.c;
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
                di.mb mbVar = (di.mb) this.b;
                Context context = (Context) this.c;
                qg.s0 s0Var = (qg.s0) this.d;
                if (!mbVar.B1) {
                    Runnable runnable2 = mbVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.x xVar = new qg.x(context, mbVar.G1);
                    mbVar.T1 = xVar;
                    xVar.n(mbVar.A1.a, 2);
                    xVar.n = new di.q5(mbVar, s0Var);
                    xVar.h = new di.j5(0, mbVar, s0Var);
                    xVar.show();
                    break;
                }
                break;
            case 7:
                ig.e eVar = (ig.e) this.b;
                m80 F2 = m80.F(((fo) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.c6) this.d, eVar.n);
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
                ig.k0.T((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (org.telegram.ui.Components.o8) this.d);
                break;
            case 9:
                ii.b bVar2 = (ii.b) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                bVar2.Q(callback, bVar2.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 10:
                m.q3 q3Var2 = (m.q3) this.b;
                ji.i6 i6Var = (ji.i6) this.c;
                ji.n0 n0Var = (ji.n0) this.d;
                q3Var2.a();
                i6Var.D(n0Var);
                break;
            case 11:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.c6) this.d);
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) this.c;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                zArr[0] = false;
                f5Var.J(-1, 0, true);
                runnable = z2Var.a.dismissRunnable;
                runnable.run();
                break;
            case 13:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.d5 d5Var = (org.telegram.ui.Components.d5) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    a2Var.setOnDismissListener(null);
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
                ((org.telegram.ui.Components.l8) this.b).n.C0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 16:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
                int i14 = viVar.M1;
                fi fiVar = viVar.L0;
                of ofVar2 = viVar.h0;
                long k10 = ofVar2 != null ? ofVar2.k() : 0L;
                viVar.Q0 = k10;
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
                        viVar.S1(m2Var);
                    }
                    of ofVar3 = viVar.h0;
                    if (ofVar3 != null) {
                        ofVar3.h(false);
                        viVar.h0 = null;
                        break;
                    }
                } else {
                    if (viVar.K1 == null && (m2Var2 instanceof fo)) {
                        fo foVar = (fo) m2Var2;
                        if (foVar.c()) {
                            org.telegram.ui.Components.g5.L(viVar.getContext(), foVar.a(), new p1(viVar, k10, 4), c6Var);
                            z10 = false;
                            viVar.K1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    ni niVar = viVar.B0;
                    if (niVar == viVar.j0 || niVar == viVar.q0) {
                        z11 = true;
                        ofVar = null;
                        J1 = viVar.J1(0, true, 0, viVar.u1(), k10);
                    } else {
                        if (!niVar.K(0, true, 0, viVar.u1(), k10)) {
                            viVar.D2 = true;
                            viVar.dismiss();
                        }
                        J1 = false;
                        z11 = true;
                        ofVar = null;
                    }
                    of ofVar4 = viVar.h0;
                    if (ofVar4 != null) {
                        ofVar4.h(J1 ^ z11);
                        viVar.h0 = ofVar;
                    }
                    viVar.K1(z10, z10);
                }
                break;
            case 17:
                vi viVar2 = (vi) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                uc0 uc0Var2 = (uc0) this.d;
                viVar2.K1(!viVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = viVar2.c0;
                message.invert_media = z12;
                uc0Var2.a(!z12, true);
                viVar2.h0.f(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (uc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    uc0Var.a(!viVar2.c0, true);
                }
                viVar2.h0.n(!viVar2.c0);
                break;
            case 18:
                as asVar = (as) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                di.d dVar = (di.d) this.d;
                callback2.run(new pf.c(new kq(dVar, 4), new sk(11, asVar, dVar)));
                break;
            case 19:
                yr yrVar = (yr) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) this.d;
                yrVar.getClass();
                AndroidUtilities.addToClipboard(c9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context2, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 20:
                nu nuVar = (nu) this.b;
                gi.o oVar3 = (gi.o) this.c;
                di.t1 t1Var = (di.t1) this.d;
                try {
                    charSequence = ((ClipboardManager) nuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(nuVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    oVar3.setText(charSequence);
                    oVar3.setSelection(0, oVar3.getText().length());
                }
                t1Var.run();
                break;
            case 21:
                vu vuVar = (vu) this.b;
                ow0 ow0Var = (ow0) this.c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                qu quVar = vuVar.a;
                ig.k kVar = vuVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = vuVar.K;
                    if (o1Var == null || !o1Var.f) {
                        if (!vuVar.n) {
                            if (!vuVar.e) {
                                vuVar.x(1);
                                boolean isFocused = quVar.isFocused();
                                vuVar.d.D(quVar.length() > 0, false);
                                quVar.requestFocus();
                                if (!isFocused) {
                                    quVar.setSelection(quVar.length());
                                    break;
                                }
                            } else {
                                if (vuVar.x) {
                                    vuVar.k(true);
                                    vuVar.x = false;
                                    vuVar.p();
                                }
                                vuVar.v();
                                break;
                            }
                        } else {
                            quVar.hideActionMode();
                            m80 m80Var5 = new m80(ow0Var, c6Var2, kVar, false, false, true);
                            m80Var5.X = AndroidUtilities.dp(280.0f);
                            quVar.extendActionMode(null, new pb0(m80Var5, new org.telegram.ui.Components.a3(quVar, 4), quVar.getOnPremiumMenuLockClickListener()));
                            m80Var5.U = true;
                            m80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 22:
                a30 a30Var = (a30) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.d;
                a30Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new xv(a30Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                m2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 23:
                w90 w90Var = (w90) this.b;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) this.c;
                try {
                    if (w90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w90Var.b));
                        if (e3Var2 == null || e3Var2.getContainer() == null) {
                            zc.j(m2Var4).j();
                        } else {
                            new zc(e3Var2.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                ze0.o((ze0) this.b, (TLRPC.ChatFull) this.c, (j70) this.d);
                break;
            case 26:
                jg0 jg0Var = (jg0) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.d;
                if (jg0Var.h == null) {
                    di.z3 z3Var = new di.z3(context4, c6Var3, LocaleController.getString(R.string.VideoChooseCover), jg0Var.f);
                    jg0Var.h = z3Var;
                    z3Var.setOnDismissListener(new yc0(jg0Var, 9));
                    jg0Var.h.f = jg0Var.n;
                }
                jg0Var.h.show();
                break;
            case 27:
                v41 v41Var = (v41) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                x41 x41Var = v41Var.n;
                Runnable runnable5 = runnableArr[0];
                if (runnable5 != null) {
                    runnable5.run();
                }
                String str = x41Var.v;
                w41 w41Var = x41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = w41Var.d;
                    if (view2 == x41Var.E || view2 == x41Var.r) {
                        x41Var.w = x41Var.v;
                    }
                    t41 t41Var = v41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    x41Var.v = str2;
                    t41Var.setText(x41.A(x41.F(str2, null, null)));
                    w41Var.D(x41Var.h != null ? x41Var.n : x41Var.y);
                    x41.J(x41Var.v);
                    x41Var.N();
                    break;
                }
                break;
            case 28:
                el elVar = (el) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.d;
                long j10 = elVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat2 = MessagesController.getInstance(elVar.a).getChat(Long.valueOf(-j10));
                zc.a0(elVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) ? chat2 != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new k31(5, elVar, translateController)).j();
                m1Var.d(true);
                break;
            default:
                hu0 hu0Var = (hu0) this.b;
                Context context5 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!hu0Var.L1) {
                    Runnable runnable6 = hu0Var.U1;
                    if (runnable6 != null) {
                        runnable6.run();
                        break;
                    }
                } else {
                    qg.x xVar2 = new qg.x(context5, hu0Var.Q1);
                    xVar2.n(hu0Var.K1.a, 2);
                    xVar2.n = new rg.v(hu0Var, bitmap);
                    xVar2.h = new rg.m(hu0Var, 1);
                    xVar2.show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(w90 w90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 23;
        this.b = w90Var;
        this.d = e3Var;
        this.c = m2Var;
    }
}
