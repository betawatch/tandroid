package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lm implements xx {
    public final /* synthetic */ in a;

    public lm(in inVar) {
        this.a = inVar;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        in inVar = this.a;
        inVar.d1 = z10;
        inVar.b.n1.requestLayout();
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.z5 z5Var = this.a.c1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.xx
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.z5 z5Var = this.a.c1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final void n() {
        in inVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(inVar.getContext(), 0, inVar.a);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 24));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.xx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.z5 z5Var = this.a.c1;
        if (z5Var == null || (editField = z5Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            t5 t5Var = document != null ? new t5(document, editField.getPaint().getFontMetricsInt()) : new t5(j10, editField.getPaint().getFontMetricsInt());
            t5Var.cacheType = 3;
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.xx
    public final boolean z() {
        return this.a.d1;
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void o(j41 j41Var) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.xx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
