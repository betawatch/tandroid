package bi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x41;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class a2 implements vx {
    public final /* synthetic */ k2 a;

    public a2(k2 k2Var) {
        this.a = k2Var;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final void i(int i10) {
        n1 focusedEditTextOrNull;
        k2 k2Var = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = k2Var.P.getFocusedEditTextOrNull()) != null) {
            k2Var.R0 = focusedEditTextOrNull;
            k2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i10 != 0;
        k2Var.C0 = z10;
        k2Var.j0(z10);
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean k() {
        n1 f02 = k2.f0(this.a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.vx
    public final void l(String str) {
        k2 k2Var = this.a;
        n1 f02 = k2.f0(k2Var);
        if (f02 == null) {
            return;
        }
        int g02 = k2.g0(k2Var, f02);
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
            f02.setText(f02.getText().insert(g02, m10));
            int length = g02 + m10.length();
            f02.setSelection(length, length);
            if (f02 == k2Var.R0) {
                k2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vx
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.vx
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.vx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        k2 k2Var = this.a;
        n1 f02 = k2.f0(k2Var);
        if (f02 == null) {
            return;
        }
        int g02 = k2.g0(k2Var, f02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.o5 o5Var = document != null ? new org.telegram.ui.Components.o5(document, f02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.o5(j10, f02.getPaint().getFontMetricsInt());
            o5Var.cacheType = org.telegram.ui.Components.f5.f();
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            f02.setText(f02.getText().insert(g02, spannableString));
            int length = g02 + spannableString.length();
            f02.setSelection(length, length);
            if (f02 == k2Var.R0) {
                k2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void o(x41 x41Var) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, gj gjVar, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }
}
