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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ fz(lz lzVar, int i10) {
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
                    b.n(R.string.LinkCopied, org.telegram.ui.Components.tc.a0(lzVar.r));
                    break;
                }
                break;
            case 1:
                lz lzVar2 = this.b;
                FrameLayout frameLayout = lzVar2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                    lzVar2.postDelayed(new ui(lzVar2, 29), 180L);
                }
                float[] fArr = lzVar2.y;
                if (lzVar2.x == null && lzVar2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, i7.f6.n(-1, 48));
                    g1Var.setOnClickListener(new fz(lzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
                    g1Var2.setOnClickListener(new fz(lzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.g6.p7;
                    g1Var3.c(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new fz(lzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, i7.f6.n(-1, 48));
                    FrameLayout overlayContainerView = lzVar2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        gz.a(frameLayout, overlayContainerView, fArr);
                        float f9 = fArr[1];
                        cg.i0 i0Var = new cg.i0(lzVar2, lzVar2.getContext(), overlayContainerView, 9);
                        vh vhVar = new vh(i0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(vhVar);
                        overlayContainerView.addView(i0Var, i7.f6.c(-1.0f, -1));
                        float f10 = 0.0f;
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        lzVar2.x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.n80(lzVar2, i0Var, overlayContainerView, vhVar, 1));
                        lzVar2.x.setOutsideTouchable(true);
                        lzVar2.x.setFocusable(true);
                        lzVar2.x.setBackgroundDrawable(new ColorDrawable(0));
                        lzVar2.x.setAnimationStyle(R.style.PopupContextAnimation);
                        lzVar2.x.setInputMethodMode(2);
                        lzVar2.x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new xt(lzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f9 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        lzVar2.x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f9 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 2:
                lz lzVar3 = this.b;
                String str2 = lzVar3.s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    b.n(R.string.LinkCopied, org.telegram.ui.Components.tc.a0(lzVar3.r));
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 4:
                lz lzVar5 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = lzVar5.x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                nz nzVar = lzVar5.A.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(lzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(lzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lzVar5.getContext());
                    alertDialog$Builder.a.E = org.telegram.ui.ActionBar.g6.H5;
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(lzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(nzVar.c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
                    int i12 = 0;
                    editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, i12));
                    editTextBoldCursor.addTextChangedListener(new kz(i12, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new z6(lzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    yp ypVar = new yp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.setOnShowListener(ypVar);
                    c2Var.setOnDismissListener(new jz(0, editTextBoldCursor));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                lz lzVar6 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var3 = lzVar6.x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (lzVar6.s != null) {
                    org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(lzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), lzVar6.s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    gi0Var.m(R.raw.qr_code_logo);
                    gi0Var.show();
                    break;
                }
                break;
            default:
                lz lzVar7 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var4 = lzVar7.x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                nz nzVar2 = lzVar7.A.c;
                tL_inputChatlistDialogFilter.filter_id = nzVar2.c.id;
                tL_chatlists_deleteExportedInvite.slug = nzVar2.b0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(lzVar7.getContext(), 3, null);
                c2Var2.q(180L);
                nzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new zg(22, lzVar7, c2Var2));
                break;
        }
    }
}
