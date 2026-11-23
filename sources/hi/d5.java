package hi;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.tx;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class d5 implements tx {
    public final /* synthetic */ k5 a;

    public d5(k5 k5Var) {
        this.a = k5Var;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean k() {
        tg.b editText = ((tg.n2) this.a.t0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.tx
    public final void l(String str) {
        tg.n2 n2Var;
        tg.b editText;
        org.telegram.messenger.g6[] g6VarArr;
        tg.j jVar = this.a.t0;
        if ((jVar instanceof tg.n2) && (editText = (n2Var = (tg.n2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = org.telegram.messenger.j6.m(str, n2Var.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                    for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                        g6Var.b = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, m10));
                int length = selectionEnd + m10.length();
                editText.setSelection(length, length);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void n() {
        k5 k5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k5Var.getContext(), k5Var.q1);
        String N0 = hd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = hd.N0(2131752057, null);
        alertDialog$Builder.k(hd.N0(2131752087, null), new di.v6(this, 22));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.tx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.y5 y5Var;
        tg.b editText = ((tg.n2) this.a.t0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new org.telegram.ui.Components.y5(document.id, 1.0f, editText.getPaint().getFontMetricsInt());
                y5Var.document = document;
            } else {
                y5Var = new org.telegram.ui.Components.y5(j3, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final void q() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void i(int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void o(k41 k41Var) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, cj cjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
