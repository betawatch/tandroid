package ii;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p implements az {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final void i(int i10) {
        i1 focusedEditTextOrNull;
        r rVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = rVar.r.getFocusedEditTextOrNull()) != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        rVar.y = i10 != 0;
        rVar.V();
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final boolean k() {
        i1 P = r.P(this.a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.az
    public final void l(String str) {
        r rVar = this.a;
        i1 P = r.P(rVar);
        if (P == null) {
            return;
        }
        int Q = r.Q(rVar, P);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, P.getPaint().getFontMetricsInt(), false, (int[]) null);
            P.setText(P.getText().insert(Q, replaceEmoji));
            int length = Q + replaceEmoji.length();
            P.setSelection(length, length);
            if (P == rVar.F) {
                rVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.az
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        r rVar = this.a;
        i1 P = r.P(rVar);
        if (P == null) {
            return;
        }
        int Q = r.Q(rVar, P);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.b6 b6Var = document != null ? new org.telegram.ui.Components.b6(document, P.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.b6(j3, P.getPaint().getFontMetricsInt());
            b6Var.cacheType = org.telegram.ui.Components.s5.g();
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            P.setText(P.getText().insert(Q, spannableString));
            int length = Q + spannableString.length();
            P.setSelection(length, length);
            if (P == rVar.F) {
                rVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.az
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void o(l61 l61Var) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
