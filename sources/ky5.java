// default package

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ky5 implements f24 {
    public final /* synthetic */ ry5 a;

    public ky5(ry5 ry5Var) {
        this.a = ry5Var;
    }

    @Override // f24
    public final boolean A() {
        return false;
    }

    @Override // f24
    public final long a() {
        return 0L;
    }

    @Override // f24
    public final boolean b() {
        return false;
    }

    @Override // f24
    public final boolean c() {
        return false;
    }

    @Override // f24
    public final int f() {
        return 0;
    }

    @Override // f24
    public final boolean h() {
        return false;
    }

    @Override // f24
    public final boolean k() {
        return false;
    }

    @Override // f24
    public final boolean l() {
        dv3 editText = ((xjb) this.a.I0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // f24
    public final void m(String str) {
        xjb xjbVar;
        dv3 editText;
        dw3[] dw3VarArr;
        w44 w44Var = this.a.I0;
        if (!(w44Var instanceof xjb) || (editText = (xjbVar = (xjb) w44Var).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = gw3.m(str, xjbVar.getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (dw3VarArr = (dw3[]) ((Spanned) m).getSpans(0, m.length(), dw3.class)) != null) {
                for (dw3 dw3Var : dw3VarArr) {
                    dw3Var.b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // f24
    public final void n() {
        ry5 ry5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ry5Var.G1, ry5Var.getContext());
        String M0 = jb6.M0(2131752005, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752006, null);
        alertDialog$Builder.j(jb6.M0(2131752036, null), new wx4((Object) this, (byte) 20));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.o();
    }

    @Override // f24
    public final float o() {
        return 0.0f;
    }

    @Override // f24
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        dv3 editText = ((xjb) this.a.I0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new gn(document, editText.getPaint().getFontMetricsInt()) : new gn(j, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // f24
    public final boolean z() {
        return false;
    }

    @Override // f24
    public final void g(d4c d4cVar) {
    }

    @Override // f24
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // f24
    public final void j(int i) {
    }

    @Override // f24
    public final void p() {
    }

    @Override // f24
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // f24
    public final void r(int i) {
    }

    @Override // f24
    public final void s(ArrayList arrayList) {
    }

    @Override // f24
    public final void t() {
    }

    @Override // f24
    public final void v() {
    }

    @Override // f24
    public final void y(long j) {
    }

    @Override // f24
    public final void e(Object obj, Object obj2) {
    }

    @Override // f24
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // f24
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // f24
    public final void x(View view, TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, int i) {
    }
}
