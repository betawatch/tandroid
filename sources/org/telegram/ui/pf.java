package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i10;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                wn wnVar = (wn) obj2;
                if (wnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    wnVar.Q7();
                    UndoView undoView = wnVar.y3;
                    if (undoView != null) {
                        long j3 = wnVar.T5;
                        int i14 = UndoView.e0;
                        undoView.j(83, j3, new k4(wnVar, 1));
                    }
                }
                wnVar.A7(true);
                break;
            case 1:
                wn.X((wn) obj2, (String) obj);
                break;
            case 2:
                wn.a1((wn) obj2, (org.telegram.ui.Components.y70) obj);
                break;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                wn.z1((wn) obj2, (Context) obj);
                break;
            case 5:
                ro roVar = (ro) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
                linearLayout.addView(f7, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i15] = j6Var;
                    j6Var.setTag(Integer.valueOf(i15));
                    j6VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    if (i15 == 0) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !roVar.J0);
                    } else if (ChatObject.isChannel(roVar.x0)) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, roVar.J0);
                    } else {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, roVar.J0);
                    }
                    f7.addView(j6VarArr[i15], w7.y5.n(-1, -2));
                    j6VarArr[i15].setOnClickListener(new a0(roVar, j6VarArr, z2Var, 8));
                    i15++;
                }
                z2Var.b(linearLayout);
                roVar.showDialog(e3Var);
                break;
            case 6:
                ro.U((ro) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                kq.V((kq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                break;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                u0Var.M(null, null);
                u0Var.G(c5Var.d, false);
                u0Var.setupPopupRadialSelectors(c5Var.f);
                u0Var.B(c5Var.e);
                break;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.s4) obj).run();
                break;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((iu) obj).onClick(null, intValue);
                break;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 16:
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.y70) obj).u();
                j8Var.t0(6);
                break;
            case 18:
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.e3) j8Var2).currentAccount;
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ca0Var.getText().toString())) {
                    String charSequence = ca0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof qy) {
                        qy qyVar = (qy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = qyVar.getMessagesController().getTotalDialogsCount();
                        if (!qyVar.l2 && (totalDialogsCount > 10 || qyVar.K)) {
                            if (qyVar.j2) {
                                qyVar.X.r.setText(charSequence);
                                qyVar.X.r.setSelection(charSequence.length());
                                zx zxVar = qyVar.C0;
                                if (zxVar != null && (L = zxVar.L(3)) >= 0 && qyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    qyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                qyVar.x = 3;
                                qyVar.X.r.setText(charSequence);
                                qyVar.X.r.setSelection(charSequence.length());
                            }
                            j8Var2.dismiss();
                            break;
                        }
                    }
                    qy qyVar2 = new qy(null);
                    qyVar2.n2 = charSequence;
                    qyVar2.x = 3;
                    launchActivity.q0(qyVar2, false, false);
                    j8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.w1(e9Var.Y);
                e9Var.S.dismiss();
                break;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.n.document)) {
                            FileLoader.getInstance(daVar.s).loadFile(daVar.n.document, "update", 3, 1);
                            daVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(daVar.getContext(), daVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.md mdVar = (org.telegram.ui.Components.md) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.y70 y70Var = mdVar.X0;
                if (y70Var == null || !y70Var.D()) {
                    mdVar.d1.e(true);
                    org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(frameLayout, new ai.d(), mdVar.V0);
                    mdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    mdVar.X0.k();
                    int[] iArr = mdVar.c1;
                    int length = iArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = iArr[i17];
                        mdVar.X0.c(0, i18 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i18 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i18, new Object[0]), new org.telegram.ui.Components.ld(mdVar, i18, i13), false);
                        if (mdVar.b1 == i18) {
                            mdVar.X0.L();
                        }
                    }
                    mdVar.X0.Z();
                    break;
                } else {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.el elVar = (org.telegram.ui.Components.el) obj2;
                org.telegram.ui.Components.gl glVar = (org.telegram.ui.Components.gl) obj;
                org.telegram.ui.Components.hl hlVar = elVar.b;
                org.telegram.ui.Components.wi wiVar = hlVar.b;
                wn wnVar2 = (wn) wiVar.f0;
                if (wnVar2.c()) {
                    parentActivity = hlVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, wnVar2.a(), new org.telegram.ui.Components.w2(i12, elVar, glVar), hlVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new oc(20, elVar, glVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.vn vnVar = ((org.telegram.ui.Components.tn) obj2).d;
                wb1 wb1Var = vnVar.s;
                View F2 = wb1Var.F((org.telegram.ui.Components.sn) obj);
                s4.c1 T = F2 != null ? wb1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - vnVar.t0) >= 0 && b10 < vnVar.K.length) {
                    org.telegram.ui.Components.vn.O(vnVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                wn wnVar3 = foVar.G;
                if (foVar.T) {
                    wnVar3.showDialog(org.telegram.ui.Components.e5.V(foVar.getContext(), wnVar3.h, d6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.ao aoVar = foVar.e;
                    if (wnVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = wnVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = wnVar3.Z7;
                            TLRPC.UserFull userFull = wnVar3.a8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(foVar.getContext(), null, new org.telegram.ui.Components.bo(foVar, r4), true, 0, foVar.d0);
                            o8Var.b(i19);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.a;
                            org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(foVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.m1[] m1VarArr = {coVar};
                            coVar.e = true;
                            coVar.c = 220;
                            coVar.setOutsideTouchable(true);
                            m1VarArr[0].setClippingEnabled(true);
                            m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            m1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            m1VarArr[0].setInputMethodMode(2);
                            m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            m1VarArr[0].showAtLocation(aoVar, 0, (int) (foVar.getX() + aoVar.getX()), (int) aoVar.getY());
                            wnVar3.g8(false, true, 0.2f);
                            break;
                        } else if (foVar.a.f && wnVar3.getParentActivity() != null && wnVar3.fragmentView != null && wnVar3.Z7 != null) {
                            if (wnVar3.o2 == null) {
                                org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(7, wnVar3.getParentActivity(), wnVar3.ea, true);
                                wnVar3.o2 = j40Var;
                                j40Var.setAlpha(0.0f);
                                wnVar3.o2.setVisibility(4);
                                wnVar3.o2.setShowingDuration(4000L);
                                wnVar3.X0.addView(wnVar3.o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i20 = wnVar3.Z7.ttl_period;
                            wnVar3.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i20 > 86400 ? LocaleController.formatPluralString("Days", i20 / 86400, new Object[0]) : i20 >= 3600 ? LocaleController.formatPluralString("Hours", i20 / 3600, new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i20, new Object[0])));
                            wnVar3.o2.f(wnVar3.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.np.n((org.telegram.ui.Components.np) obj, (wn) obj2);
                break;
            case 26:
                org.telegram.ui.Components.nr.P((org.telegram.ui.Components.nr) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj2;
                String str = (String) obj;
                if (vrVar.b == null && (view2 = vrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.b = (EditText) findFocus;
                    }
                }
                if (vrVar.b != null) {
                    try {
                        vrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = vrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = vrVar.b.getText();
                    int length2 = vrVar.b.getSelectionEnd() == vrVar.b.length() ? -1 : str.length() + vrVar.b.getSelectionStart();
                    if (vrVar.b.getSelectionStart() == -1 || vrVar.b.getSelectionEnd() == -1) {
                        vrVar.b.setText(str);
                        EditText editText2 = vrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = vrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), vrVar.b.getSelectionEnd(), str));
                        EditText editText4 = vrVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = vrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.gs gsVar = (org.telegram.ui.Components.gs) obj2;
                org.telegram.ui.Components.fs fsVar = (org.telegram.ui.Components.fs) obj;
                gsVar.J();
                fsVar.f = !fsVar.f;
                fsVar.j.X.N(true);
                gsVar.s();
                break;
            default:
                ((org.telegram.ui.Components.gs) obj2).B0 = !r13.B0;
                ((org.telegram.ui.Components.j61) obj).N(true);
                break;
        }
    }

    public /* synthetic */ pf(org.telegram.ui.Components.np npVar, wn wnVar) {
        this.a = 25;
        this.c = npVar;
        this.b = wnVar;
    }
}
