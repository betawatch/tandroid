package mi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i6;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.n31;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class t1 implements fx {
    public final /* synthetic */ c2 a;

    public t1(c2 c2Var) {
        this.a = c2Var;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final void i(int i3) {
        h1 focusedEditTextOrNull;
        c2 c2Var = this.a;
        if (i3 != 0 && (focusedEditTextOrNull = c2Var.Q.getFocusedEditTextOrNull()) != null) {
            c2Var.S0 = focusedEditTextOrNull;
            c2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i3 != 0;
        c2Var.D0 = z10;
        c2Var.j0(z10);
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean k() {
        h1 f02 = c2.f0(this.a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final void l(String str) {
        c2 c2Var = this.a;
        h1 f02 = c2.f0(c2Var);
        if (f02 == null) {
            return;
        }
        int g02 = c2.g0(c2Var, f02);
        try {
            CharSequence m10 = i6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
            f02.setText(f02.getText().insert(g02, m10));
            int length = g02 + m10.length();
            f02.setSelection(length, length);
            if (f02 == c2Var.S0) {
                c2Var.T0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fx
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.fx
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.fx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        c2 c2Var = this.a;
        h1 f02 = c2.f0(c2Var);
        if (f02 == null) {
            return;
        }
        int g02 = c2.g0(c2Var, f02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.p5 p5Var = document != null ? new org.telegram.ui.Components.p5(document, f02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.p5(j10, f02.getPaint().getFontMetricsInt());
            p5Var.cacheType = org.telegram.ui.Components.g5.f();
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
            f02.setText(f02.getText().insert(g02, spannableString));
            int length = g02 + spannableString.length();
            f02.setSelection(length, length);
            if (f02 == c2Var.S0) {
                c2Var.T0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean z() {
        return this.a.D0;
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void o(n31 n31Var) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void s(int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, vi viVar, boolean z10, int i3) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }
}
