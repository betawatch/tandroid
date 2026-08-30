package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;

    public /* synthetic */ pz(wz wzVar, int i10) {
        this.a = i10;
        this.b = wzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wz wzVar = this.b;
                String str = wzVar.s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(wzVar.r));
                    break;
                }
                break;
            case 1:
                wz wzVar2 = this.b;
                FrameLayout frameLayout = wzVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                    wzVar2.postDelayed(new zi(wzVar2, 29), 180L);
                }
                float[] fArr = wzVar2.y;
                if (wzVar2.x == null && wzVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.b6.n(-1, 48));
                    g1Var.setOnClickListener(new pz(wzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(wzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                    g1Var2.setOnClickListener(new pz(wzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(wzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.j6.p7;
                    g1Var3.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new pz(wzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.b6.n(-1, 48));
                    FrameLayout overlayContainerView = wzVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        rz.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        eg.i0 i0Var = new eg.i0(wzVar2, wzVar2.getContext(), overlayContainerView, 8);
                        ai aiVar = new ai(i0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(aiVar);
                        overlayContainerView.addView(i0Var, k7.b6.c(-1.0f, -1));
                        float f11 = 0.0f;
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        wzVar2.x = p1Var;
                        p1Var.setOnDismissListener(new org.telegram.ui.Components.t80(wzVar2, i0Var, overlayContainerView, aiVar, 1));
                        wzVar2.x.setOutsideTouchable(true);
                        wzVar2.x.setFocusable(true);
                        wzVar2.x.setBackgroundDrawable(new ColorDrawable(0));
                        wzVar2.x.setAnimationStyle(R.style.PopupContextAnimation);
                        wzVar2.x.setInputMethodMode(2);
                        wzVar2.x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new fu(wzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f11 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        wzVar2.x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f11), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                wz wzVar3 = this.b;
                String str2 = wzVar3.s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(wzVar3.r));
                    break;
                }
                break;
            case 3:
                wz wzVar4 = this.b;
                if (wzVar4.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", wzVar4.s);
                        wzVar4.r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 4:
                wz wzVar5 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var2 = wzVar5.x;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                }
                yz yzVar = wzVar5.B.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(wzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(wzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wzVar5.getContext());
                    alertDialog$Builder.a.F = org.telegram.ui.ActionBar.j6.H5;
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(wzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(yzVar.c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new tz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new vz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new d7(wzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    eq eqVar = new eq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.setOnShowListener(eqVar);
                    d2Var.setOnDismissListener(new uz(0, editTextBoldCursor));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                wz wzVar6 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var3 = wzVar6.x;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                if (wzVar6.s != null) {
                    org.telegram.ui.Components.qi0 qi0Var = new org.telegram.ui.Components.qi0(wzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), wzVar6.s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    qi0Var.m(R.raw.qr_code_logo);
                    qi0Var.show();
                    break;
                }
                break;
            default:
                wz wzVar7 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var4 = wzVar7.x;
                if (p1Var4 != null) {
                    p1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                yz yzVar2 = wzVar7.B.c;
                tL_inputChatlistDialogFilter.filter_id = yzVar2.c.id;
                tL_chatlists_deleteExportedInvite.slug = yzVar2.b0();
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(wzVar7.getContext(), 3, null);
                d2Var2.q(180L);
                yzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new lo(19, wzVar7, d2Var2));
                break;
        }
    }
}
