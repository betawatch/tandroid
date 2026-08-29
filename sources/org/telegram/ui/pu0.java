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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pu0 implements org.telegram.ui.Components.fy {
    public final /* synthetic */ vu0 a;

    public pu0(vu0 vu0Var) {
        this.a = vu0Var;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final void i(int i10) {
        boolean z10 = i10 != 0;
        vu0 vu0Var = this.a;
        vu0Var.x0 = z10;
        vu0Var.e.requestLayout();
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean k() {
        EditTextBoldCursor editField = this.a.X.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fy
    public final void l(String str) {
        EditTextBoldCursor editField = this.a.X.getEditField();
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final void n() {
        org.telegram.ui.ActionBar.c6 c6Var;
        vu0 vu0Var = this.a;
        Activity parentActivity = vu0Var.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.o2) vu0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new zk0(this, 5));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        vu0 vu0Var = this.a;
        EditTextBoldCursor editField = vu0Var.X.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, editField.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j10, editField.getPaint().getFontMetricsInt());
            y5Var.cacheType = vu0Var.N.c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean z() {
        return this.a.x0;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void o(org.telegram.ui.Components.s41 s41Var) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
