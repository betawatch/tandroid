package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bv0 implements org.telegram.ui.Components.uy {
    public final /* synthetic */ hv0 a;

    public bv0(hv0 hv0Var) {
        this.a = hv0Var;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        hv0 hv0Var = this.a;
        hv0Var.B0 = z10;
        hv0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean k() {
        EditTextBoldCursor editField = this.a.b0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.uy
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
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
            editField.setText(editField.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final void n() {
        org.telegram.ui.ActionBar.d6 d6Var;
        hv0 hv0Var = this.a;
        Activity parentActivity = hv0Var.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.n2) hv0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qp0(this, 4));
        i0.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        hv0 hv0Var = this.a;
        EditTextBoldCursor editField = hv0Var.b0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.a6 a6Var = document != null ? new org.telegram.ui.Components.a6(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.a6(j10, editField.getPaint().getFontMetricsInt());
            a6Var.cacheType = hv0Var.R.c;
            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean z() {
        return this.a.B0;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void o(org.telegram.ui.Components.b61 b61Var) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
