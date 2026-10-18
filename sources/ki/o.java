package ki;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class o implements uy {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final void i(int i10) {
        h1 focusedEditTextOrNull;
        q qVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = qVar.r.getFocusedEditTextOrNull()) != null) {
            qVar.F = focusedEditTextOrNull;
            qVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        qVar.y = i10 != 0;
        qVar.V();
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean k() {
        h1 P = q.P(this.a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.uy
    public final void l(String str) {
        q qVar = this.a;
        h1 P = q.P(qVar);
        if (P == null) {
            return;
        }
        int Q = q.Q(qVar, P);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, P.getPaint().getFontMetricsInt(), false, (int[]) null);
            P.setText(P.getText().insert(Q, replaceEmoji));
            int length = Q + replaceEmoji.length();
            P.setSelection(length, length);
            if (P == qVar.F) {
                qVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        q qVar = this.a;
        h1 P = q.P(qVar);
        if (P == null) {
            return;
        }
        int Q = q.Q(qVar, P);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.a6 a6Var = document != null ? new org.telegram.ui.Components.a6(document, P.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.a6(j10, P.getPaint().getFontMetricsInt());
            a6Var.cacheType = org.telegram.ui.Components.r5.g();
            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
            P.setText(P.getText().insert(Q, spannableString));
            int length = Q + spannableString.length();
            P.setSelection(length, length);
            if (P == qVar.F) {
                qVar.G = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.uy
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void o(b61 b61Var) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.uy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
