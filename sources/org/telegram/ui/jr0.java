package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jr0 implements org.telegram.ui.Components.rx {
    public final /* synthetic */ pr0 a;

    public jr0(pr0 pr0Var) {
        this.a = pr0Var;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final void i(int i7) {
        boolean z10 = i7 != 0;
        pr0 pr0Var = this.a;
        pr0Var.C0 = z10;
        pr0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean k() {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final void l(String str) {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void n() {
        org.telegram.ui.ActionBar.i6 i6Var;
        pr0 pr0Var = this.a;
        Activity parentActivity = pr0Var.getParentActivity();
        i6Var = ((org.telegram.ui.ActionBar.h2) pr0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752058, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new qi0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.rx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        pr0 pr0Var = this.a;
        EditTextBoldCursor editField = pr0Var.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.x5 x5Var = document != null ? new org.telegram.ui.Components.x5(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.x5(j3, editField.getPaint().getFontMetricsInt());
            x5Var.cacheType = pr0Var.S.c;
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void o(org.telegram.ui.Components.h41 h41Var) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
