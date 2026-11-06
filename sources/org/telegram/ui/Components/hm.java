package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hm implements hx {
    public final /* synthetic */ bn a;

    public hm(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final void i(int i7) {
        boolean z9 = i7 != 0;
        bn bnVar = this.a;
        bnVar.h1 = z9;
        bnVar.b.l3.requestLayout();
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.a6 a6Var = this.a.g1;
        if (a6Var == null || (editField = a6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.hx
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.a6 a6Var = this.a.g1;
        if (a6Var == null || (editField = a6Var.getEditField()) == null) {
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

    @Override // org.telegram.ui.Components.hx
    public final void n() {
        bn bnVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getContext(), bnVar.a);
        String M0 = org.telegram.messenger.hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new u(this, 24));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.hx
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.a6 a6Var = this.a.g1;
        if (a6Var == null || (editField = a6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            r5 r5Var = document != null ? new r5(document, editField.getPaint().getFontMetricsInt()) : new r5(j3, editField.getPaint().getFontMetricsInt());
            r5Var.cacheType = 3;
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean z() {
        return this.a.h1;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void o(t31 t31Var) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
