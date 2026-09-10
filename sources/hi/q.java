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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q implements sy {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
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
        s sVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = sVar.r.getFocusedEditTextOrNull()) != null) {
            sVar.F = focusedEditTextOrNull;
            sVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        sVar.y = i10 != 0;
        sVar.S();
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean k() {
        k1 M = s.M(this.a);
        if (M == null || M.length() == 0) {
            return false;
        }
        M.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.sy
    public final void l(String str) {
        s sVar = this.a;
        k1 M = s.M(sVar);
        if (M == null) {
            return;
        }
        int N = s.N(sVar, M);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, M.getPaint().getFontMetricsInt(), false, (int[]) null);
            M.setText(M.getText().insert(N, replaceEmoji));
            int length = N + replaceEmoji.length();
            M.setSelection(length, length);
            if (M == sVar.F) {
                sVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.sy
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        s sVar = this.a;
        k1 M = s.M(sVar);
        if (M == null) {
            return;
        }
        int N = s.N(sVar, M);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.y5 y5Var = document != null ? new org.telegram.ui.Components.y5(document, M.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.y5(j3, M.getPaint().getFontMetricsInt());
            y5Var.cacheType = org.telegram.ui.Components.p5.g();
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            M.setText(M.getText().insert(N, spannableString));
            int length = N + spannableString.length();
            M.setSelection(length, length);
            if (M == sVar.F) {
                sVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.sy
    public final boolean z() {
        return this.a.y;
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
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.sy
    public final /* synthetic */ void w() {
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
