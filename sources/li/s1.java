package li;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ej;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.t31;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class s1 implements hx {
    public final /* synthetic */ b2 a;

    public s1(b2 b2Var) {
        this.a = b2Var;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final void i(int i7) {
        g1 focusedEditTextOrNull;
        b2 b2Var = this.a;
        if (i7 != 0 && (focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull()) != null) {
            b2Var.R0 = focusedEditTextOrNull;
            b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z9 = i7 != 0;
        b2Var.C0 = z9;
        b2Var.j0(z9);
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean k() {
        g1 f02 = b2.f0(this.a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.hx
    public final void l(String str) {
        b2 b2Var = this.a;
        g1 f02 = b2.f0(b2Var);
        if (f02 == null) {
            return;
        }
        int g02 = b2.g0(b2Var, f02);
        try {
            CharSequence m10 = i6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
            f02.setText(f02.getText().insert(g02, m10));
            int length = g02 + m10.length();
            f02.setSelection(length, length);
            if (f02 == b2Var.R0) {
                b2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.hx
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.hx
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.hx
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        b2 b2Var = this.a;
        g1 f02 = b2.f0(b2Var);
        if (f02 == null) {
            return;
        }
        int g02 = b2.g0(b2Var, f02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.q5 q5Var = document != null ? new org.telegram.ui.Components.q5(document, f02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.q5(j3, f02.getPaint().getFontMetricsInt());
            q5Var.cacheType = org.telegram.ui.Components.h5.f();
            spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
            f02.setText(f02.getText().insert(g02, spannableString));
            int length = g02 + spannableString.length();
            f02.setSelection(length, length);
            if (f02 == b2Var.R0) {
                b2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void o(t31 t31Var) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void s(int i7) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, ej ejVar, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
