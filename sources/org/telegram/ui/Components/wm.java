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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wm implements ly {
    public final /* synthetic */ tn a;

    public wm(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        tn tnVar = this.a;
        tnVar.h1 = z10;
        tnVar.b.r1.requestLayout();
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean k() {
        EditTextBoldCursor editField;
        org.telegram.ui.Cells.c6 c6Var = this.a.g1;
        if (c6Var == null || (editField = c6Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ly
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final void n() {
        tn tnVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getContext(), 0, tnVar.a);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new t(this, 24));
        i2.g.r(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ly
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
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
            z5 z5Var = document != null ? new z5(document, editField.getPaint().getFontMetricsInt()) : new z5(j3, editField.getPaint().getFontMetricsInt());
            z5Var.cacheType = 3;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean z() {
        return this.a.h1;
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void o(d51 d51Var) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ly
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
