// default package

import android.app.Activity;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ce8 implements u04 {
    public final /* synthetic */ ie8 a;

    public ce8(ie8 ie8Var) {
        this.a = ie8Var;
    }

    @Override // u04
    public final boolean A() {
        return false;
    }

    @Override // u04
    public final long a() {
        return 0L;
    }

    @Override // u04
    public final boolean b() {
        return false;
    }

    @Override // u04
    public final boolean c() {
        return false;
    }

    @Override // u04
    public final int f() {
        return 0;
    }

    @Override // u04
    public final boolean h() {
        return false;
    }

    @Override // u04
    public final void j(int i) {
        boolean z = i != 0;
        ie8 ie8Var = this.a;
        ie8Var.C0 = z;
        ie8Var.e.requestLayout();
    }

    @Override // u04
    public final boolean k() {
        return false;
    }

    @Override // u04
    public final boolean l() {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // u04
    public final void m(String str) {
        EditTextBoldCursor editField = this.a.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = vu3.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final void n() {
        wjb wjbVar;
        ie8 ie8Var = this.a;
        Activity parentActivity = ie8Var.getParentActivity();
        wjbVar = ((d) ie8Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, parentActivity);
        String M0 = k96.M0(2131752056, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752057, null);
        alertDialog$Builder.j(k96.M0(2131752087, null), new k88(this, (byte) 3));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    @Override // u04
    public final float o() {
        return 0.0f;
    }

    @Override // u04
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        ie8 ie8Var = this.a;
        EditTextBoldCursor editField = ie8Var.c0.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            gm gmVar = document != null ? new gm(document, editField.getPaint().getFontMetricsInt()) : new gm(j, editField.getPaint().getFontMetricsInt());
            gmVar.cacheType = ie8Var.S.c;
            spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final boolean z() {
        return this.a.C0;
    }

    @Override // u04
    public final void p() {
    }

    @Override // u04
    public final void t() {
    }

    @Override // u04
    public final void v() {
    }

    @Override // u04
    public final void g(d2c d2cVar) {
    }

    @Override // u04
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void r(int i) {
    }

    @Override // u04
    public final void s(ArrayList arrayList) {
    }

    @Override // u04
    public final void y(long j) {
    }

    @Override // u04
    public final void e(Object obj, Object obj2) {
    }

    @Override // u04
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // u04
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // u04
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
    }
}
