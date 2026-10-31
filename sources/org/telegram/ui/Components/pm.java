package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pm implements vx {
    public final /* synthetic */ jn a;

    public pm(jn jnVar) {
        this.a = jnVar;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        jn jnVar = this.a;
        jnVar.h1 = z10;
        jnVar.b.l3.requestLayout();
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.e6 e6Var = this.a.g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.vx
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.e6 e6Var = this.a.g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final void n() {
        jn jnVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jnVar.getContext(), jnVar.a);
        String L0 = org.telegram.messenger.cd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new t(this, 24));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.e6 e6Var = this.a.g1;
        if (e6Var == null || (editField = e6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            o5 o5Var = document != null ? new o5(document, editField.getPaint().getFontMetricsInt()) : new o5(j10, editField.getPaint().getFontMetricsInt());
            o5Var.cacheType = 3;
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean z() {
        return this.a.h1;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void o(w41 w41Var) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
