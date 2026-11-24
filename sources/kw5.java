// default package

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kw5 implements u04 {
    public final /* synthetic */ rw5 a;

    public kw5(rw5 rw5Var) {
        this.a = rw5Var;
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
    public final boolean k() {
        return false;
    }

    @Override // u04
    public final boolean l() {
        st3 editText = ((vhb) this.a.I0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // u04
    public final void m(String str) {
        vhb vhbVar;
        st3 editText;
        su3[] su3VarArr;
        l34 l34Var = this.a.I0;
        if (!(l34Var instanceof vhb) || (editText = (vhbVar = (vhb) l34Var).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = vu3.m(str, vhbVar.getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (su3VarArr = (su3[]) ((Spanned) m).getSpans(0, m.length(), su3.class)) != null) {
                for (su3 su3Var : su3VarArr) {
                    su3Var.b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final void n() {
        rw5 rw5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, rw5Var.G1, rw5Var.getContext());
        String M0 = k96.M0(2131752056, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752057, null);
        alertDialog$Builder.j(k96.M0(2131752087, null), new ry4((Object) this, (byte) 17));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    @Override // u04
    public final float o() {
        return 0.0f;
    }

    @Override // u04
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        st3 editText = ((vhb) this.a.I0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new gm(document, editText.getPaint().getFontMetricsInt()) : new gm(j, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // u04
    public final boolean z() {
        return false;
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
    public final void j(int i) {
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
