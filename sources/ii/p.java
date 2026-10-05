package ii;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.oy;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class p implements oy {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.oy
    public final void i(int i10) {
        i1 focusedEditTextOrNull;
        r rVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = rVar.r.getFocusedEditTextOrNull()) != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        rVar.y = i10 != 0;
        rVar.Q();
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean k() {
        i1 K = r.K(this.a);
        if (K == null || K.length() == 0) {
            return false;
        }
        K.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.oy
    public final void l(String str) {
        r rVar = this.a;
        i1 K = r.K(rVar);
        if (K == null) {
            return;
        }
        int L = r.L(rVar, K);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, K.getPaint().getFontMetricsInt(), false, (int[]) null);
            K.setText(K.getText().insert(L, replaceEmoji));
            int length = L + replaceEmoji.length();
            K.setSelection(length, length);
            if (K == rVar.F) {
                rVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.oy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        r rVar = this.a;
        i1 K = r.K(rVar);
        if (K == null) {
            return;
        }
        int L = r.L(rVar, K);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.z5 z5Var = document != null ? new org.telegram.ui.Components.z5(document, K.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.z5(j3, K.getPaint().getFontMetricsInt());
            z5Var.cacheType = org.telegram.ui.Components.q5.g();
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            K.setText(K.getText().insert(L, spannableString));
            int length = L + spannableString.length();
            K.setSelection(length, length);
            if (K == rVar.F) {
                rVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.oy
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void o(d61 d61Var) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.oy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
