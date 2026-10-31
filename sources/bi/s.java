package bi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class s implements vx {
    public final /* synthetic */ t a;

    public s(t tVar) {
        this.a = tVar;
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
        t tVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = tVar.r.getFocusedEditTextOrNull()) != null) {
            tVar.F = focusedEditTextOrNull;
            tVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        tVar.D = i10 != 0;
        tVar.V();
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean k() {
        n1 P = t.P(this.a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.vx
    public final void l(String str) {
        t tVar = this.a;
        n1 P = t.P(tVar);
        if (P == null) {
            return;
        }
        int Q = t.Q(tVar, P);
        try {
            CharSequence m10 = org.telegram.messenger.k6.m(str, P.getPaint().getFontMetricsInt(), false, null, 0);
            P.setText(P.getText().insert(Q, m10));
            int length = Q + m10.length();
            P.setSelection(length, length);
            if (P == tVar.F) {
                tVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        t tVar = this.a;
        n1 P = t.P(tVar);
        if (P == null) {
            return;
        }
        int Q = t.Q(tVar, P);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.o5 o5Var = document != null ? new org.telegram.ui.Components.o5(document, P.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.o5(j10, P.getPaint().getFontMetricsInt());
            o5Var.cacheType = org.telegram.ui.Components.f5.f();
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            P.setText(P.getText().insert(Q, spannableString));
            int length = Q + spannableString.length();
            P.setSelection(length, length);
            if (P == tVar.F) {
                tVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean z() {
        return this.a.D;
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
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void o(w41 w41Var) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, fj fjVar, boolean z10, int i10) {
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
