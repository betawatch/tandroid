package hi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.sy;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w1 implements sy {
    public final /* synthetic */ g2 a;

    public w1(g2 g2Var) {
        this.a = g2Var;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final void i(int i10) {
        k1 focusedEditTextOrNull;
        g2 g2Var = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = g2Var.P.getFocusedEditTextOrNull()) != null) {
            g2Var.R0 = focusedEditTextOrNull;
            g2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i10 != 0;
        g2Var.C0 = z10;
        g2Var.e0(z10);
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean k() {
        k1 a02 = g2.a0(this.a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.sy
    public final void l(String str) {
        g2 g2Var = this.a;
        k1 a02 = g2.a0(g2Var);
        if (a02 == null) {
            return;
        }
        int b02 = g2.b0(g2Var, a02);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
            a02.setText(a02.getText().insert(b02, replaceEmoji));
            int length = b02 + replaceEmoji.length();
            a02.setSelection(length, length);
            if (a02 == g2Var.R0) {
                g2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.sy
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.sy
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.sy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        g2 g2Var = this.a;
        k1 a02 = g2.a0(g2Var);
        if (a02 == null) {
            return;
        }
        int b02 = g2.b0(g2Var, a02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, a02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j3, a02.getPaint().getFontMetricsInt());
            y5Var.cacheType = org.telegram.ui.Components.p5.g();
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            a02.setText(a02.getText().insert(b02, spannableString));
            int length = b02 + spannableString.length();
            a02.setSelection(length, length);
            if (a02 == g2Var.R0) {
                g2Var.S0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean z() {
        return this.a.C0;
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void o(r51 r51Var) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
