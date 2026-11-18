package hi;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.rx;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e5 implements rx {
    public final /* synthetic */ l5 a;

    public e5(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean k() {
        tg.b editText = ((tg.m2) this.a.t0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final void l(String str) {
        tg.m2 m2Var;
        tg.b editText;
        org.telegram.messenger.g6[] g6VarArr;
        tg.j jVar = this.a.t0;
        if ((jVar instanceof tg.m2) && (editText = (m2Var = (tg.m2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = org.telegram.messenger.j6.m(str, m2Var.getFontMetricsInt(), false, null, 0);
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

    @Override // org.telegram.ui.Components.rx
    public final void n() {
        l5 l5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l5Var.getContext(), l5Var.q1);
        String M0 = gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = gd.M0(2131752058, null);
        alertDialog$Builder.k(gd.M0(2131752088, null), new di.c7(this, 21));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.rx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.x5 x5Var;
        tg.b editText = ((tg.m2) this.a.t0).getEditText();
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
                x5Var = new org.telegram.ui.Components.x5(document.id, 1.0f, editText.getPaint().getFontMetricsInt());
                x5Var.document = document;
            } else {
                x5Var = new org.telegram.ui.Components.x5(j3, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.rx
    public final void q() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void i(int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void o(h41 h41Var) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.rx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
