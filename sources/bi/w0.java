package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.zr;
import org.telegram.ui.t60;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, int i10) {
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
        mf mfVar;
        boolean N1;
        nc0 nc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                if (b1Var.n0.a == bg.b.a) {
                    new uc(context, u6Var).show();
                    break;
                }
                break;
            case 1:
                r8 r8Var = (r8) this.b;
                final org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                final fi.d dVar = (fi.d) this.d;
                k3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                final int i10 = 1;
                r8Var.run(new Utilities.Callback() { // from class: bi.ea
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                                if (!booleanValue) {
                                    final int i11 = 0;
                                    final fi.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    k3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    k3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    k3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var3 = k3Var;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final fi.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    k3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    k3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    k3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                j9 j9Var = (j9) this.b;
                final org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) this.c;
                final fi.d dVar2 = (fi.d) this.d;
                k3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                final int i11 = 0;
                j9Var.run(new Utilities.Callback() { // from class: bi.ea
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var22 = k3Var2;
                                if (!booleanValue) {
                                    final int i112 = 0;
                                    final fi.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i112) {
                                                case 0:
                                                    k3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    k3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    k3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.k3 k3Var3 = k3Var2;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final fi.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    k3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    k3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    k3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                di.f2 f2Var = (di.f2) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.k3 k3Var3 = (org.telegram.ui.ActionBar.k3) this.d;
                f2Var.run(Long.valueOf(jArr[0]));
                k3Var3.dismiss();
                break;
            case 4:
                di.h4 h4Var = (di.h4) this.b;
                fi.l9 l9Var = (fi.l9) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                di.q4 q4Var = h4Var.l;
                q4Var.D0(l9Var, storyItem);
                di.h4 h4Var2 = q4Var.i1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    break;
                }
                break;
            case 5:
                di.h4 h4Var3 = (di.h4) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                di.y9 y9Var = (di.y9) this.d;
                g1Var.performHapticFeedback(3);
                org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                if (Y != null) {
                    Y.R(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new di.b4(0, h4Var3, y9Var))).j();
                    break;
                }
                break;
            case 6:
                di.c5 c5Var = (di.c5) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                l80 l80Var = (l80) this.d;
                v4 v4Var = new v4(c5Var, 2);
                di.t5 t5Var = c5Var.b;
                new aw(v4Var, t5Var.getContext(), t5Var.s, arrayList).show();
                l80Var.u();
                break;
            case 7:
                fi.ib ibVar = (fi.ib) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                di.b bVar = (di.b) this.d;
                l80 l80Var2 = ibVar.V0;
                if (l80Var2 == null || !l80Var2.D()) {
                    fi.o oVar = new fi.o(ibVar, 0);
                    boolean isPremium = UserConfig.getInstance(ibVar.U).isPremium();
                    fi.o oVar2 = isPremium ? null : new fi.o(ibVar, 1);
                    l80 F = l80.F(frameLayout, bVar, ibVar.T0);
                    ibVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    ibVar.V0.k();
                    int i12 = 0;
                    while (true) {
                        int[] iArr = fi.r.Q1;
                        if (i12 >= 4) {
                            l80 l80Var3 = ibVar.V0;
                            l80Var3.s = 0;
                            l80Var3.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            l80 l80Var4 = ibVar.V0;
                            String string = i13 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]);
                            int i14 = org.telegram.ui.ActionBar.y6.E8;
                            l80Var4.b(0, null, string, i14, i14, new ag.r0(oVar, i13, 6));
                            l80Var4.M((isPremium || i13 == 86400 || i13 == Integer.MAX_VALUE) ? null : new ag.r0(oVar2, i13, 7));
                            if (ibVar.X0 == i12) {
                                ibVar.V0.L();
                            }
                            i12++;
                        }
                    }
                }
                break;
            case 8:
                fi.h3 h3Var = (fi.h3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                fi.k3 k3Var4 = (fi.k3) this.d;
                fi.o3 o3Var = h3Var.c;
                ArrayList arrayList2 = o3Var.h0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > o3Var.R) {
                    int i15 = -o3Var.N;
                    o3Var.N = i15;
                    AndroidUtilities.shakeViewSpring(k3Var4, i15);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(o3Var.d);
                o3Var.j();
                break;
            case 9:
                fi.ta taVar = (fi.ta) this.b;
                Context context2 = (Context) this.c;
                rg.s0 s0Var = (rg.s0) this.d;
                if (!taVar.q1) {
                    Runnable runnable2 = taVar.z1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    rg.y yVar = new rg.y(context2, taVar.v1);
                    taVar.I1 = yVar;
                    yVar.m(taVar.p1.a, 2);
                    yVar.n = new fi.g5(taVar, s0Var);
                    yVar.h = new y7(2, taVar, s0Var);
                    yVar.show();
                    break;
                }
                break;
            case 10:
                jg.e eVar = (jg.e) this.b;
                l80 F2 = l80.F(((wn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.u6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new jg.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new jg.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 11:
                jg.k0.S((jg.k0) this.b, (TL_account.TL_connectedBot) this.c, (org.telegram.ui.Components.h2) this.d);
                break;
            case 12:
                ki.a aVar = (ki.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                aVar.P(callback, aVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 13:
                m.r3 r3Var = (m.r3) this.b;
                li.d6 d6Var = (li.d6) this.c;
                li.m0 m0Var = (li.m0) this.d;
                r3Var.a();
                d6Var.C(m0Var);
                break;
            case 14:
                org.telegram.ui.Components.q.P((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.u6) this.d);
                break;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                zArr[0] = false;
                e5Var.G(-1, 0, true);
                runnable = e3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 16:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.c5 c5Var2 = (org.telegram.ui.Components.c5) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    e2Var.setOnDismissListener(null);
                }
                runnable3.run();
                c5Var2.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 17:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable4 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable4.run();
                alertDialog$Builder.a.N0.run();
                break;
            case 18:
                ((org.telegram.ui.Components.l8) this.b).n.I0((org.telegram.ui.Cells.w) this.c, (MessageObject) this.d);
                break;
            case 19:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                int i16 = tiVar.M1;
                bi biVar = tiVar.L0;
                mf mfVar2 = tiVar.h0;
                long j10 = mfVar2 != null ? mfVar2.j() : 0L;
                tiVar.Q0 = j10;
                biVar.setEffect(j10);
                tiVar.forceKeyboardOnDismiss();
                if (tiVar.K - tiVar.L < 0) {
                    AndroidUtilities.shakeView(tiVar.s);
                    AndroidUtilities.shakeView(tiVar.v);
                    try {
                        biVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i16).premiumFeaturesBlocked() && MessagesController.getInstance(i16).captionLengthLimitPremium > tiVar.L) {
                        tiVar.W1(r2Var);
                    }
                    mf mfVar3 = tiVar.h0;
                    if (mfVar3 != null) {
                        mfVar3.g(false);
                        tiVar.h0 = null;
                        break;
                    }
                } else {
                    if (tiVar.K1 == null && (r2Var2 instanceof wn)) {
                        wn wnVar = (wn) r2Var2;
                        if (wnVar.c()) {
                            org.telegram.ui.Components.g5.L(tiVar.getContext(), wnVar.a(), new di.d1(tiVar, j10, 4), u6Var2);
                            z10 = false;
                            tiVar.O1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    li liVar = tiVar.B0;
                    if (liVar == tiVar.j0 || liVar == tiVar.q0) {
                        z11 = true;
                        mfVar = null;
                        N1 = tiVar.N1(0, true, 0, tiVar.x1(), j10);
                    } else {
                        if (!liVar.K(0, true, 0, tiVar.x1(), j10)) {
                            tiVar.G2 = true;
                            tiVar.dismiss();
                        }
                        N1 = false;
                        z11 = true;
                        mfVar = null;
                    }
                    mf mfVar4 = tiVar.h0;
                    if (mfVar4 != null) {
                        mfVar4.g(N1 ^ z11);
                        tiVar.h0 = mfVar;
                    }
                    tiVar.O1(z10, z10);
                }
                break;
            case 20:
                ti tiVar2 = (ti) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                nc0 nc0Var2 = (nc0) this.d;
                tiVar2.O1(!tiVar2.c0, true);
                TLRPC.Message message = messageObject.messageOwner;
                boolean z12 = tiVar2.c0;
                message.invert_media = z12;
                nc0Var2.a(!z12, true);
                tiVar2.h0.e(messageObject);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar2.j0;
                if (chatAttachAlertPhotoLayout != null && (nc0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    nc0Var.a(!tiVar2.c0, true);
                }
                tiVar2.h0.m(!tiVar2.c0);
                break;
            case 21:
                zr zrVar = (zr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                fi.d dVar3 = (fi.d) this.d;
                callback2.run(new qf.c(new cp(dVar3, 6), new so(5, zrVar, dVar3)));
                break;
            case 22:
                xr xrVar = (xr) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) this.d;
                xrVar.getClass();
                AndroidUtilities.addToClipboard(g9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 23:
                ju juVar = (ju) this.b;
                t tVar = (t) this.c;
                fi.r1 r1Var = (fi.r1) this.d;
                try {
                    charSequence = ((ClipboardManager) juVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(juVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    tVar.setText(charSequence);
                    tVar.setSelection(0, tVar.getText().length());
                }
                r1Var.run();
                break;
            case 24:
                ru ruVar = (ru) this.b;
                ww0 ww0Var = (ww0) this.c;
                org.telegram.ui.ActionBar.u6 u6Var3 = (org.telegram.ui.ActionBar.u6) this.d;
                mu muVar = ruVar.a;
                jg.l lVar = ruVar.b;
                if (lVar.isEnabled() && lVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.q1 q1Var = ruVar.K;
                    if (q1Var == null || !q1Var.f) {
                        if (!ruVar.n) {
                            if (!ruVar.e) {
                                ruVar.x(1);
                                boolean isFocused = muVar.isFocused();
                                ruVar.d.D(muVar.length() > 0, false);
                                muVar.requestFocus();
                                if (!isFocused) {
                                    muVar.setSelection(muVar.length());
                                    break;
                                }
                            } else {
                                if (ruVar.x) {
                                    ruVar.k(true);
                                    ruVar.x = false;
                                    ruVar.p();
                                }
                                ruVar.v();
                                break;
                            }
                        } else {
                            muVar.hideActionMode();
                            l80 l80Var5 = new l80(ww0Var, u6Var3, lVar, false, false, true);
                            l80Var5.X = AndroidUtilities.dp(280.0f);
                            muVar.extendActionMode(null, new ib0(l80Var5, new org.telegram.ui.Components.b3(muVar, 4), muVar.getOnPremiumMenuLockClickListener()));
                            l80Var5.U = true;
                            l80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 25:
                y20 y20Var = (y20) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) this.d;
                y20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new tv(y20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                r2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 26:
                s90 s90Var = (s90) this.b;
                org.telegram.ui.ActionBar.k3 k3Var5 = (org.telegram.ui.ActionBar.k3) this.c;
                org.telegram.ui.ActionBar.r2 r2Var4 = (org.telegram.ui.ActionBar.r2) this.d;
                try {
                    if (s90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", s90Var.b));
                        if (k3Var5 == null || k3Var5.getContainer() == null) {
                            org.telegram.ui.Components.wc.j(r2Var4).j();
                        } else {
                            new org.telegram.ui.Components.wc(k3Var5.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 27:
                ic0 ic0Var = (ic0) this.b;
                nc0 nc0Var3 = (nc0) this.c;
                nc0 nc0Var4 = (nc0) this.d;
                oc0 oc0Var = ic0Var.c0;
                MessagePreviewParams messagePreviewParams = oc0Var.d;
                boolean z13 = messagePreviewParams.hideCaption;
                boolean z14 = !z13;
                messagePreviewParams.hideCaption = z14;
                if (z13) {
                    if (oc0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    oc0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    oc0Var.x = true;
                }
                nc0Var3.a(z14, true);
                nc0Var4.a(messagePreviewParams.hideForwardSendersName, true);
                ic0Var.i();
                ic0Var.l(true);
                break;
            case 28:
                ue0.n((ue0) this.b, (TLRPC.ChatFull) this.c, (t60) this.d);
                break;
            default:
                gg0 gg0Var = (gg0) this.b;
                Context context5 = (Context) this.c;
                org.telegram.ui.ActionBar.u6 u6Var4 = (org.telegram.ui.ActionBar.u6) this.d;
                if (gg0Var.h == null) {
                    fi.s3 s3Var = new fi.s3(context5, u6Var4, LocaleController.getString(R.string.VideoChooseCover), gg0Var.f);
                    gg0Var.h = s3Var;
                    s3Var.setOnDismissListener(new xa0(gg0Var, 10));
                    gg0Var.h.f = gg0Var.n;
                }
                gg0Var.h.show();
                break;
        }
    }
}
