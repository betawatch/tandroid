package ai;

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
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.xr;
import org.telegram.ui.l60;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, int i10) {
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
        boolean J1;
        nc0 nc0Var;
        CharSequence charSequence;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (b1Var.m0.a == ag.b.a) {
                    new dd(context, d6Var).show();
                    break;
                }
                break;
            case 1:
                w8 w8Var = (w8) this.b;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                final ei.d dVar = (ei.d) this.d;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                final int i10 = 0;
                w8Var.run(new Utilities.Callback() { // from class: ai.gb
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (!booleanValue) {
                                    final int i11 = 0;
                                    final ei.d dVar2 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.rb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var2.setCanDismissWithSwipe(false);
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final ei.d dVar3 = dVar;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.rb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                o9 o9Var = (o9) this.b;
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.c;
                final ei.d dVar2 = (ei.d) this.d;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                final int i11 = 1;
                o9Var.run(new Utilities.Callback() { // from class: ai.gb
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (!booleanValue) {
                                    final int i112 = 0;
                                    final ei.d dVar22 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.rb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i112) {
                                                case 0:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var22.setCanDismissWithSwipe(false);
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (!booleanValue2) {
                                    final int i12 = 1;
                                    final ei.d dVar3 = dVar2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.rb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    f3Var3.setCanDismissWithSwipe(false);
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    f3Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                ci.g2 g2Var = (ci.g2) this.b;
                long[] jArr = (long[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var3 = (org.telegram.ui.ActionBar.f3) this.d;
                g2Var.run(Long.valueOf(jArr[0]));
                f3Var3.dismiss();
                break;
            case 4:
                ci.h4 h4Var = (ci.h4) this.b;
                ei.p9 p9Var = (ei.p9) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                ci.q4 q4Var = h4Var.l;
                q4Var.F0(p9Var, storyItem);
                ci.h4 h4Var2 = q4Var.t1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    break;
                }
                break;
            case 5:
                ci.h4 h4Var3 = (ci.h4) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                ci.aa aaVar = (ci.aa) this.d;
                e1Var.performHapticFeedback(3);
                org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new pa(16, h4Var3, aaVar))).j();
                    break;
                }
                break;
            case 6:
                ci.d5 d5Var = (ci.d5) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i80 i80Var = (i80) this.d;
                a5 a5Var = new a5(d5Var, 2);
                ci.u5 u5Var = d5Var.b;
                new aw(a5Var, u5Var.getContext(), u5Var.s, arrayList).show();
                i80Var.u();
                break;
            case 7:
                ei.lb lbVar = (ei.lb) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ci.b bVar = (ci.b) this.d;
                i80 i80Var2 = lbVar.V0;
                if (i80Var2 == null || !i80Var2.D()) {
                    ei.o oVar = new ei.o(lbVar, 0);
                    boolean isPremium = UserConfig.getInstance(lbVar.U).isPremium();
                    ei.o oVar2 = isPremium ? null : new ei.o(lbVar, 1);
                    i80 F = i80.F(frameLayout, bVar, lbVar.T0);
                    lbVar.V0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    lbVar.V0.k();
                    int i12 = 0;
                    while (true) {
                        int[] iArr = ei.r.Q1;
                        if (i12 >= 4) {
                            i80 i80Var3 = lbVar.V0;
                            i80Var3.s = 0;
                            i80Var3.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            i80 i80Var4 = lbVar.V0;
                            String string = i13 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]);
                            int i14 = org.telegram.ui.ActionBar.h6.E8;
                            i80Var4.b(0, null, string, i14, i14, new ah.g(oVar, i13, 5));
                            i80Var4.M((isPremium || i13 == 86400 || i13 == Integer.MAX_VALUE) ? null : new ah.g(oVar2, i13, 6));
                            if (lbVar.X0 == i12) {
                                lbVar.V0.L();
                            }
                            i12++;
                        }
                    }
                }
                break;
            case 8:
                ei.j3 j3Var = (ei.j3) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                ei.m3 m3Var = (ei.m3) this.d;
                ei.q3 q3Var = j3Var.c;
                ArrayList arrayList2 = q3Var.h0;
                if (arrayList2.contains(photoEntry)) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > q3Var.R) {
                    int i15 = -q3Var.N;
                    q3Var.N = i15;
                    AndroidUtilities.shakeViewSpring(m3Var, i15);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(q3Var.d);
                q3Var.j();
                break;
            case 9:
                ei.xa xaVar = (ei.xa) this.b;
                Context context2 = (Context) this.c;
                qg.v0 v0Var = (qg.v0) this.d;
                if (!xaVar.B1) {
                    Runnable runnable2 = xaVar.K1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.y yVar = new qg.y(context2, xaVar.G1);
                    xaVar.T1 = yVar;
                    yVar.n(xaVar.A1.a, 2);
                    yVar.n = new ei.h5(xaVar, v0Var);
                    yVar.h = new c8(2, xaVar, v0Var);
                    yVar.show();
                    break;
                }
                break;
            case 10:
                ig.e eVar = (ig.e) this.b;
                i80 F2 = i80.F(((qn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.d6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new ig.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new ig.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 11:
                ig.k0.T((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (org.telegram.ui.Components.e2) this.d);
                break;
            case 12:
                ji.a aVar = (ji.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                aVar.Q(callback, aVar.Y, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
                break;
            case 13:
                m.s3 s3Var = (m.s3) this.b;
                ki.c6 c6Var = (ki.c6) this.c;
                ki.n0 n0Var = (ki.n0) this.d;
                s3Var.a();
                c6Var.D(n0Var);
                break;
            case 14:
                org.telegram.ui.Components.q.Q((org.telegram.ui.Components.q) this.b, (TL_aicompose.AiComposeTone) this.c, (org.telegram.ui.ActionBar.d6) this.d);
                break;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                zArr[0] = false;
                e5Var.C(-1, 0, true);
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                break;
            case 16:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.b;
                Runnable runnable3 = (Runnable) this.c;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnDismissListener(null);
                }
                runnable3.run();
                c5Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 17:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable4 = (Runnable) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                SharedConfig.setSecretMapPreviewType(((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue());
                runnable4.run();
                alertDialog$Builder.a.L0.run();
                break;
            case 18:
                ((org.telegram.ui.Components.j8) this.b).n.C0((org.telegram.ui.Cells.x) this.c, (MessageObject) this.d);
                break;
            case 19:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f0;
                int i16 = tiVar.M1;
                ei eiVar = tiVar.L0;
                mf mfVar2 = tiVar.h0;
                long j10 = mfVar2 != null ? mfVar2.j() : 0L;
                tiVar.Q0 = j10;
                eiVar.setEffect(j10);
                tiVar.forceKeyboardOnDismiss();
                if (tiVar.K - tiVar.L < 0) {
                    AndroidUtilities.shakeView(tiVar.s);
                    AndroidUtilities.shakeView(tiVar.v);
                    try {
                        eiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!MessagesController.getInstance(i16).premiumFeaturesBlocked() && MessagesController.getInstance(i16).captionLengthLimitPremium > tiVar.L) {
                        tiVar.S1(n2Var);
                    }
                    mf mfVar3 = tiVar.h0;
                    if (mfVar3 != null) {
                        mfVar3.g(false);
                        tiVar.h0 = null;
                        break;
                    }
                } else {
                    if (tiVar.K1 == null && (n2Var2 instanceof qn)) {
                        qn qnVar = (qn) n2Var2;
                        if (qnVar.c()) {
                            org.telegram.ui.Components.f5.L(tiVar.getContext(), qnVar.a(), new ci.d1(tiVar, j10, 4), d6Var2);
                            z10 = false;
                            tiVar.K1(z10, z10);
                            break;
                        }
                    }
                    z10 = false;
                    li liVar = tiVar.B0;
                    if (liVar == tiVar.j0 || liVar == tiVar.q0) {
                        z11 = true;
                        mfVar = null;
                        J1 = tiVar.J1(0, true, 0, tiVar.u1(), j10);
                    } else {
                        if (!liVar.K(0, true, 0, tiVar.u1(), j10)) {
                            tiVar.D2 = true;
                            tiVar.dismiss();
                        }
                        J1 = false;
                        z11 = true;
                        mfVar = null;
                    }
                    mf mfVar4 = tiVar.h0;
                    if (mfVar4 != null) {
                        mfVar4.g(J1 ^ z11);
                        tiVar.h0 = mfVar;
                    }
                    tiVar.K1(z10, z10);
                }
                break;
            case 20:
                ti tiVar2 = (ti) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                nc0 nc0Var2 = (nc0) this.d;
                tiVar2.K1(!tiVar2.c0, true);
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
                xr xrVar = (xr) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                ei.d dVar3 = (ei.d) this.d;
                callback2.run(new pf.c(new hq(dVar3, 4), new org.telegram.ui.Components.ee(25, xrVar, dVar3)));
                break;
            case 22:
                vr vrVar = (vr) this.b;
                Context context3 = (Context) this.c;
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) this.d;
                vrVar.getClass();
                AndroidUtilities.addToClipboard(b9Var.a.getText().toString());
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(context3, LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 23:
                iu iuVar = (iu) this.b;
                t tVar = (t) this.c;
                ei.s1 s1Var = (ei.s1) this.d;
                try {
                    charSequence = ((ClipboardManager) iuVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(iuVar.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    tVar.setText(charSequence);
                    tVar.setSelection(0, tVar.getText().length());
                }
                s1Var.run();
                break;
            case 24:
                qu quVar = (qu) this.b;
                lw0 lw0Var = (lw0) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                lu luVar = quVar.a;
                ig.k kVar = quVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.o1 o1Var = quVar.K;
                    if (o1Var == null || !o1Var.f) {
                        if (!quVar.n) {
                            if (!quVar.e) {
                                quVar.x(1);
                                boolean isFocused = luVar.isFocused();
                                quVar.d.C(luVar.length() > 0, false);
                                luVar.requestFocus();
                                if (!isFocused) {
                                    luVar.setSelection(luVar.length());
                                    break;
                                }
                            } else {
                                if (quVar.x) {
                                    quVar.k(true);
                                    quVar.x = false;
                                    quVar.p();
                                }
                                quVar.v();
                                break;
                            }
                        } else {
                            luVar.hideActionMode();
                            i80 i80Var5 = new i80(lw0Var, d6Var3, kVar, false, false, true);
                            i80Var5.X = AndroidUtilities.dp(280.0f);
                            luVar.extendActionMode(null, new jb0(i80Var5, new org.telegram.ui.Components.z2(luVar, 4), luVar.getOnPremiumMenuLockClickListener()));
                            i80Var5.U = true;
                            i80Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 25:
                w20 w20Var = (w20) this.b;
                Context context4 = (Context) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                w20Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.GigagroupConvertAlertTitle);
                alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText));
                alertDialog$Builder2.k(LocaleController.getString(R.string.GigagroupConvertAlertConver), new tv(w20Var, 5));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 26:
                q90 q90Var = (q90) this.b;
                org.telegram.ui.ActionBar.f3 f3Var4 = (org.telegram.ui.ActionBar.f3) this.c;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.d;
                try {
                    if (q90Var.b != null) {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", q90Var.b));
                        if (f3Var4 == null || f3Var4.getContainer() == null) {
                            org.telegram.ui.Components.xc.j(n2Var4).j();
                        } else {
                            new org.telegram.ui.Components.xc(f3Var4.getContainer(), null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                ue0.o((ue0) this.b, (TLRPC.ChatFull) this.c, (l60) this.d);
                break;
            default:
                eg0 eg0Var = (eg0) this.b;
                Context context5 = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var4 = (org.telegram.ui.ActionBar.d6) this.d;
                if (eg0Var.h == null) {
                    ei.u3 u3Var = new ei.u3(context5, d6Var4, LocaleController.getString(R.string.VideoChooseCover), eg0Var.f);
                    eg0Var.h = u3Var;
                    u3Var.setOnDismissListener(new rc0(eg0Var, 8));
                    eg0Var.h.f = eg0Var.n;
                }
                eg0Var.h.show();
                break;
        }
    }
}
