// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class af9 implements f24 {
    public final /* synthetic */ jf9 a;

    public af9(jf9 jf9Var) {
        this.a = jf9Var;
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
        jf9 jf9Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = jf9Var.Q.getFocusedEditTextOrNull()) != null) {
            jf9Var.S0 = focusedEditTextOrNull;
            jf9Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z = i != 0;
        jf9Var.D0 = z;
        jf9Var.b0(z);
    }

    @Override // f24
    public final boolean k() {
        return false;
    }

    @Override // f24
    public final boolean l() {
        ne9 t0 = this.a.t0();
        if (t0 == null || t0.length() == 0) {
            return false;
        }
        t0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // f24
    public final void m(String str) {
        jf9 jf9Var = this.a;
        ne9 t0 = jf9Var.t0();
        if (t0 != null) {
            int u0 = jf9Var.u0(t0);
            try {
                CharSequence m = gw3.m(str, t0.getPaint().getFontMetricsInt(), false, null, 0);
                t0.setText(t0.getText().insert(u0, m));
                int length = u0 + m.length();
                t0.setSelection(length, length);
                if (t0 == jf9Var.S0) {
                    jf9Var.T0 = length;
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
    public final void s(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // f24
    public final void v() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // f24
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        jf9 jf9Var = this.a;
        ne9 t0 = jf9Var.t0();
        if (t0 != null) {
            int u0 = jf9Var.u0(t0);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                gn gnVar = document != null ? new gn(document, t0.getPaint().getFontMetricsInt()) : new gn(j, t0.getPaint().getFontMetricsInt());
                gnVar.cacheType = vm.f();
                spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                t0.setText(t0.getText().insert(u0, spannableString));
                int length = u0 + spannableString.length();
                t0.setSelection(length, length);
                if (t0 == jf9Var.S0) {
                    jf9Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // f24
    public final boolean z() {
        return this.a.D0;
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
