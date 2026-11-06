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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class o implements hx {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
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
        p pVar = this.a;
        if (i7 != 0 && (focusedEditTextOrNull = pVar.r.getFocusedEditTextOrNull()) != null) {
            pVar.F = focusedEditTextOrNull;
            pVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        pVar.D = i7 != 0;
        pVar.W();
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean k() {
        g1 Q = p.Q(this.a);
        if (Q == null || Q.length() == 0) {
            return false;
        }
        Q.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.hx
    public final void l(String str) {
        p pVar = this.a;
        g1 Q = p.Q(pVar);
        if (Q == null) {
            return;
        }
        int R = p.R(pVar, Q);
        try {
            CharSequence m10 = i6.m(str, Q.getPaint().getFontMetricsInt(), false, null, 0);
            Q.setText(Q.getText().insert(R, m10));
            int length = R + m10.length();
            Q.setSelection(length, length);
            if (Q == pVar.F) {
                pVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.hx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.hx
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        p pVar = this.a;
        g1 Q = p.Q(pVar);
        if (Q == null) {
            return;
        }
        int R = p.R(pVar, Q);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.r5 r5Var = document != null ? new org.telegram.ui.Components.r5(document, Q.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.r5(j3, Q.getPaint().getFontMetricsInt());
            r5Var.cacheType = org.telegram.ui.Components.i5.f();
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            Q.setText(Q.getText().insert(R, spannableString));
            int length = R + spannableString.length();
            Q.setSelection(length, length);
            if (Q == pVar.F) {
                pVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.hx
    public final boolean z() {
        return this.a.D;
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
    public final /* synthetic */ void w() {
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
    public final /* synthetic */ void t(ArrayList arrayList) {
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
