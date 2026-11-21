package oi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.tx;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n implements tx {
    public final /* synthetic */ o a;

    public n(o oVar) {
        this.a = oVar;
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
    public final void i(int i7) {
        f1 focusedEditTextOrNull;
        o oVar = this.a;
        if (i7 != 0 && (focusedEditTextOrNull = oVar.r.getFocusedEditTextOrNull()) != null) {
            oVar.G = focusedEditTextOrNull;
            oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        oVar.E = i7 != 0;
        oVar.X();
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean k() {
        f1 R = o.R(this.a);
        if (R == null || R.length() == 0) {
            return false;
        }
        R.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.tx
    public final void l(String str) {
        o oVar = this.a;
        f1 R = o.R(oVar);
        if (R == null) {
            return;
        }
        int S = o.S(oVar, R);
        try {
            CharSequence m10 = j6.m(str, R.getPaint().getFontMetricsInt(), false, null, 0);
            R.setText(R.getText().insert(S, m10));
            int length = S + m10.length();
            R.setSelection(length, length);
            if (R == oVar.G) {
                oVar.H = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.tx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        o oVar = this.a;
        f1 R = o.R(oVar);
        if (R == null) {
            return;
        }
        int S = o.S(oVar, R);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, R.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j3, R.getPaint().getFontMetricsInt());
            y5Var.cacheType = org.telegram.ui.Components.p5.f();
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            R.setText(R.getText().insert(S, spannableString));
            int length = S + spannableString.length();
            R.setSelection(length, length);
            if (R == oVar.G) {
                oVar.H = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean z() {
        return this.a.E;
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void q() {
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
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, bj bjVar, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.tx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
