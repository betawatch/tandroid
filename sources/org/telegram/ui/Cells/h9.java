package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h9 implements Runnable {
    public final /* synthetic */ aa a;

    public h9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar = this.a;
        g gVar = aaVar.r0;
        Rect rect = aaVar.B;
        q9 q9Var = aaVar.a0;
        v9 v9Var = aaVar.X;
        if (v9Var == null || aaVar.C == null) {
            return;
        }
        v9 v9Var2 = aaVar.W;
        CharSequence t10 = aaVar.t(v9Var, true);
        wk0 wk0Var = aaVar.E;
        if (wk0Var != null) {
            wk0Var.I0(false);
        }
        int i9 = aaVar.s;
        int i10 = aaVar.t;
        if (!rect.isEmpty()) {
            int i11 = rect.right;
            if (i9 > i11) {
                i9 = i11 - 1;
            }
            int i12 = rect.left;
            if (i9 < i12) {
                i9 = i12 + 1;
            }
            int i13 = rect.top;
            if (i10 < i13) {
                i10 = i13 + 1;
            }
            int i14 = rect.bottom;
            if (i10 > i14) {
                i10 = i14 - 1;
            }
        }
        int i15 = i9;
        int l10 = aaVar.l(i15, i10, aaVar.c, aaVar.d, v9Var, true);
        if (l10 >= t10.length()) {
            aaVar.j(l10, q9Var, true);
            Layout layout = q9Var.b;
            if (layout == null) {
                aaVar.v = -1;
                aaVar.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f10 = i15 - aaVar.c;
                if (f10 < q9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > q9Var.b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
        }
        if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
            int i16 = aaVar.c;
            int i17 = aaVar.d;
            aaVar.f(false);
            aaVar.C.setVisibility(0);
            aaVar.M(v9Var, v9Var2);
            aaVar.u = l10;
            aaVar.v = l10;
            if (t10 instanceof Spanned) {
                Spanned spanned = (Spanned) t10;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t10.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.t5.class);
                        int length2 = t5VarArr.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i19];
                            int spanStart = spanned.getSpanStart(t5Var);
                            int spanEnd = spanned.getSpanEnd(t5Var);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                aaVar.u = spanStart;
                                aaVar.v = spanEnd;
                                break;
                            }
                            i19++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i18];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l10 >= spanStart2 && l10 <= spanEnd2) {
                            aaVar.u = spanStart2;
                            aaVar.v = spanEnd2;
                            break;
                        }
                        i18++;
                    }
                }
            }
            if (aaVar.u == aaVar.v) {
                while (true) {
                    int i20 = aaVar.u;
                    if (i20 <= 0 || !aa.z(t10.charAt(i20 - 1))) {
                        break;
                    } else {
                        aaVar.u--;
                    }
                }
                while (aaVar.v < t10.length() && aa.z(t10.charAt(aaVar.v))) {
                    aaVar.v++;
                }
            }
            aaVar.a = i16;
            aaVar.b = i17;
            aaVar.W = v9Var;
            try {
                aaVar.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            aaVar.V();
            aaVar.x();
            if (v9Var2 != null) {
                v9Var2.invalidate();
            }
            g7.a6 a6Var = aaVar.D;
            if (a6Var != null) {
                a6Var.a(true);
            }
            aaVar.i = true;
            aaVar.R = true;
            aaVar.k = true;
            aaVar.g = 0.0f;
            aaVar.f = 0.0f;
            aaVar.G();
        }
        aaVar.z = false;
        aaVar.e = false;
    }
}
