package li;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.ty;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s1 implements ty {
    public final /* synthetic */ b2 a;

    public s1(b2 b2Var) {
        this.a = b2Var;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final void i(int i10) {
        g1 focusedEditTextOrNull;
        b2 b2Var = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull()) != null) {
            b2Var.R0 = focusedEditTextOrNull;
            b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i10 != 0;
        b2Var.C0 = z10;
        b2Var.f0(z10);
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ty
    public final boolean k() {
        g1 b02 = b2.b0(this.a);
        if (b02 == null || b02.length() == 0) {
            return false;
        }
        b02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ty
    public final void l(String str) {
        b2 b2Var = this.a;
        g1 b02 = b2.b0(b2Var);
        if (b02 == null) {
            return;
        }
        int c02 = b2.c0(b2Var, b02);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, b02.getPaint().getFontMetricsInt(), false, (int[]) null);
            b02.setText(b02.getText().insert(c02, replaceEmoji));
            int length = c02 + replaceEmoji.length();
            b02.setSelection(length, length);
            if (b02 == b2Var.R0) {
                b2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.ty
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.ty
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        b2 b2Var = this.a;
        g1 b02 = b2.b0(b2Var);
        if (b02 == null) {
            return;
        }
        int c02 = b2.c0(b2Var, b02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.c6 c6Var = document != null ? new org.telegram.ui.Components.c6(document, b02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.c6(j10, b02.getPaint().getFontMetricsInt());
            c6Var.cacheType = org.telegram.ui.Components.t5.g();
            spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
            b02.setText(b02.getText().insert(c02, spannableString));
            int length = c02 + spannableString.length();
            b02.setSelection(length, length);
            if (b02 == b2Var.R0) {
                b2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.ty
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void o(q61 q61Var) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ty
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
