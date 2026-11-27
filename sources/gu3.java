// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gu3 implements p14 {
    public final /* synthetic */ iu3 a;

    public gu3(iu3 iu3Var) {
        this.a = iu3Var;
    }

    @Override // p14
    public final boolean A() {
        return false;
    }

    @Override // p14
    public final long a() {
        return 0L;
    }

    @Override // p14
    public final boolean b() {
        return false;
    }

    @Override // p14
    public final boolean c() {
        return false;
    }

    @Override // p14
    public final int f() {
        return 0;
    }

    @Override // p14
    public final boolean h() {
        return false;
    }

    @Override // p14
    public final void j(int i) {
        iu3 iu3Var = this.a;
        if (iu3Var.b()) {
            iu3Var.y = i != 0;
            iu3Var.y();
            wma wmaVar = iu3Var.f;
            if (wmaVar != null) {
                wmaVar.R();
            }
        }
    }

    @Override // p14
    public final boolean k() {
        return false;
    }

    @Override // p14
    public final boolean l() {
        du3 du3Var = this.a.a;
        if (du3Var.length() == 0) {
            return false;
        }
        du3Var.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // p14
    public final void m(String str) {
        du3 du3Var = this.a.a;
        int selectionEnd = du3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, du3Var.getPaint().getFontMetricsInt(), false, null, 0);
            du3Var.setText(du3Var.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            du3Var.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final void n() {
        iu3 iu3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, iu3Var.N, iu3Var.getContext());
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new ht2(this, (byte) 29));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        e eVar = iu3Var.h;
        if (eVar != null) {
            eVar.showDialog(idVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override // p14
    public final float o() {
        return 0.0f;
    }

    @Override // p14
    public final void p() {
        e eVar = this.a.h;
        if (eVar == null) {
            new xk8((e) new qu0(this, (byte) 2), 11, false).show();
        } else {
            eVar.showDialog(new xk8(eVar, 11, false));
        }
    }

    @Override // p14
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        iu3 iu3Var = this.a;
        du3 du3Var = iu3Var.a;
        int selectionEnd = du3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            hm hmVar = document != null ? new hm(document, du3Var.getPaint().getFontMetricsInt()) : new hm(j, du3Var.getPaint().getFontMetricsInt());
            hmVar.cacheType = iu3Var.d.c;
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            du3Var.setText(du3Var.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            du3Var.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final boolean z() {
        return this.a.y;
    }

    @Override // p14
    public final void t() {
    }

    @Override // p14
    public final void v() {
    }

    @Override // p14
    public final void g(d6c d6cVar) {
    }

    @Override // p14
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void r(int i) {
    }

    @Override // p14
    public final void s(ArrayList arrayList) {
    }

    @Override // p14
    public final void y(long j) {
    }

    @Override // p14
    public final void e(Object obj, Object obj2) {
    }

    @Override // p14
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // p14
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // p14
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
    }
}
