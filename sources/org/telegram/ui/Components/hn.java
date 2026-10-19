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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hn implements uy {
    public final /* synthetic */ fo a;

    public hn(fo foVar) {
        this.a = foVar;
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
        fo foVar = this.a;
        foVar.h1 = z10;
        foVar.b.u1.requestLayout();
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.g1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.uy
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.g1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
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
        fo foVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getContext(), 0, foVar.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 24));
        i2.e.r(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.g1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            a6 a6Var = document != null ? new a6(document, editField.getPaint().getFontMetricsInt()) : new a6(j10, editField.getPaint().getFontMetricsInt());
            a6Var.cacheType = 3;
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
        return this.a.h1;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void o(c61 c61Var) {
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
