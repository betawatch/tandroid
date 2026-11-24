// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class o82 implements f24 {
    public final /* synthetic */ p82 a;

    public o82(p82 p82Var) {
        this.a = p82Var;
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
    public final void j(int i) {
        ne9 focusedEditTextOrNull;
        p82 p82Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = p82Var.r.getFocusedEditTextOrNull()) != null) {
            p82Var.G = focusedEditTextOrNull;
            p82Var.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        p82Var.E = i != 0;
        p82Var.R();
    }

    @Override // f24
    public final boolean k() {
        return false;
    }

    @Override // f24
    public final boolean l() {
        ne9 U = this.a.U();
        if (U == null || U.length() == 0) {
            return false;
        }
        U.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // f24
    public final void m(String str) {
        p82 p82Var = this.a;
        ne9 U = p82Var.U();
        if (U != null) {
            int W = p82Var.W(U);
            try {
                CharSequence m = gw3.m(str, U.getPaint().getFontMetricsInt(), false, null, 0);
                U.setText(U.getText().insert(W, m));
                int length = W + m.length();
                U.setSelection(length, length);
                if (U == p82Var.G) {
                    p82Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // f24
    public final float o() {
        return 0.0f;
    }

    @Override // f24
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        p82 p82Var = this.a;
        ne9 U = p82Var.U();
        if (U != null) {
            int W = p82Var.W(U);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                gn gnVar = document != null ? new gn(document, U.getPaint().getFontMetricsInt()) : new gn(j, U.getPaint().getFontMetricsInt());
                gnVar.cacheType = vm.f();
                spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                U.setText(U.getText().insert(W, spannableString));
                int length = W + spannableString.length();
                U.setSelection(length, length);
                if (U == p82Var.G) {
                    p82Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // f24
    public final boolean z() {
        return this.a.E;
    }

    @Override // f24
    public final void n() {
    }

    @Override // f24
    public final void p() {
    }

    @Override // f24
    public final void t() {
    }

    @Override // f24
    public final void v() {
    }

    @Override // f24
    public final void g(d4c d4cVar) {
    }

    @Override // f24
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
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
