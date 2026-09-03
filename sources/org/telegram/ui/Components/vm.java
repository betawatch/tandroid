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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vm implements my {
    public final /* synthetic */ rn a;

    public vm(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final void i(int i10) {
        boolean z4 = i10 != 0;
        rn rnVar = this.a;
        rnVar.e1 = z4;
        rnVar.b.o1.requestLayout();
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.d1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.my
    public final void l(String str) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.d1;
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void n() {
        rn rnVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getContext(), 0, rnVar.a);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 24));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.my
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.d1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            u5 u5Var = document != null ? new u5(document, editField.getPaint().getFontMetricsInt()) : new u5(j10, editField.getPaint().getFontMetricsInt());
            u5Var.cacheType = 3;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.my
    public final boolean z() {
        return this.a.e1;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void o(d51 d51Var) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
