package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lr0 implements org.telegram.ui.Components.ix {
    public final /* synthetic */ rr0 a;

    public lr0(rr0 rr0Var) {
        this.a = rr0Var;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final void i(int i7) {
        boolean z9 = i7 != 0;
        rr0 rr0Var = this.a;
        rr0Var.B0 = z9;
        rr0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean k() {
        EditTextBoldCursor editField = this.a.b0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ix
    public final void l(String str) {
        EditTextBoldCursor editField = this.a.b0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void n() {
        org.telegram.ui.ActionBar.g6 g6Var;
        rr0 rr0Var = this.a;
        Activity parentActivity = rr0Var.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.f2) rr0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, g6Var);
        String M0 = org.telegram.messenger.id.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new ni0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ix
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        rr0 rr0Var = this.a;
        EditTextBoldCursor editField = rr0Var.b0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.r5 r5Var = document != null ? new org.telegram.ui.Components.r5(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.r5(j3, editField.getPaint().getFontMetricsInt());
            r5Var.cacheType = rr0Var.R.c;
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean z() {
        return this.a.B0;
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void o(org.telegram.ui.Components.u31 u31Var) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.ix
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
