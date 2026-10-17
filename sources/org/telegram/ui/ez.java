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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ ez(lz lzVar, int i10) {
        this.a = i10;
        this.b = lzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lz lzVar = this.b;
                String str = lzVar.s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.wh.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(lzVar.r));
                    break;
                }
                break;
            case 1:
                lz lzVar2 = this.b;
                FrameLayout frameLayout = lzVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                    lzVar2.postDelayed(new fz(lzVar2, 0), 180L);
                }
                float[] fArr = lzVar2.y;
                if (lzVar2.x == null && lzVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                    e1Var.setOnClickListener(new ez(lzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                    e1Var2.setOnClickListener(new ez(lzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new ez(lzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    FrameLayout overlayContainerView = lzVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        gz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ei.g6 g6Var = new ei.g6(lzVar2, lzVar2.getContext(), overlayContainerView, 9);
                        xh xhVar = new xh(g6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(xhVar);
                        overlayContainerView.addView(g6Var, w7.z5.d(-1.0f, -1));
                        float f10 = 0.0f;
                        g6Var.setAlpha(0.0f);
                        g6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        lzVar2.x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.m90(lzVar2, g6Var, overlayContainerView, xhVar, 1));
                        lzVar2.x.setOutsideTouchable(true);
                        lzVar2.x.setFocusable(true);
                        lzVar2.x.setBackgroundDrawable(new ColorDrawable(0));
                        lzVar2.x.setAnimationStyle(R.style.PopupContextAnimation);
                        lzVar2.x.setInputMethodMode(2);
                        lzVar2.x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wt(lzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        lzVar2.x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                lz lzVar3 = this.b;
                String str2 = lzVar3.s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.wh.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(lzVar3.r));
                    break;
                }
                break;
            case 3:
                lz lzVar4 = this.b;
                if (lzVar4.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", lzVar4.s);
                        lzVar4.r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 4:
                lz lzVar5 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = lzVar5.x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                nz nzVar = lzVar5.E.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(lzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(lzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lzVar5.getContext());
                    alertDialog$Builder.a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(lzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(nzVar.c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new kz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(lzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    yp ypVar = new yp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.setOnShowListener(ypVar);
                    b2Var.setOnDismissListener(new jz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                lz lzVar6 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var3 = lzVar6.x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (lzVar6.s != null) {
                    org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(lzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), lzVar6.s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    fj0Var.n(R.raw.qr_code_logo);
                    fj0Var.show();
                    break;
                }
                break;
            default:
                lz lzVar7 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var4 = lzVar7.x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                nz nzVar2 = lzVar7.E.c;
                tL_inputChatlistDialogFilter.filter_id = nzVar2.c.id;
                tL_chatlists_deleteExportedInvite.slug = nzVar2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(lzVar7.getContext(), 3, null);
                b2Var2.q(180L);
                nzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new xc(26, lzVar7, b2Var2));
                break;
        }
    }
}
