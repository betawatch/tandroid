package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e9 implements Runnable {
    public final /* synthetic */ x9 a;

    public e9(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9 x9Var = this.a;
        g gVar = x9Var.r0;
        Rect rect = x9Var.B;
        n9 n9Var = x9Var.a0;
        s9 s9Var = x9Var.X;
        if (s9Var == null || x9Var.C == null) {
            return;
        }
        s9 s9Var2 = x9Var.W;
        CharSequence t10 = x9Var.t(s9Var, true);
        jl0 jl0Var = x9Var.E;
        if (jl0Var != null) {
            jl0Var.I0(false);
        }
        int i10 = x9Var.s;
        int i11 = x9Var.t;
        if (!rect.isEmpty()) {
            int i12 = rect.right;
            if (i10 > i12) {
                i10 = i12 - 1;
            }
            int i13 = rect.left;
            if (i10 < i13) {
                i10 = i13 + 1;
            }
            int i14 = rect.top;
            if (i11 < i14) {
                i11 = i14 + 1;
            }
            int i15 = rect.bottom;
            if (i11 > i15) {
                i11 = i15 - 1;
            }
        }
        int i16 = i10;
        int l10 = x9Var.l(i16, i11, x9Var.c, x9Var.d, s9Var, true);
        if (l10 >= t10.length()) {
            x9Var.j(l10, n9Var, true);
            Layout layout = n9Var.b;
            if (layout == null) {
                x9Var.v = -1;
                x9Var.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f9 = i16 - x9Var.c;
                if (f9 < n9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f9 > n9Var.b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
        }
        if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
            int i17 = x9Var.c;
            int i18 = x9Var.d;
            x9Var.f(false);
            x9Var.C.setVisibility(0);
            x9Var.M(s9Var, s9Var2);
            x9Var.u = l10;
            x9Var.v = l10;
            if (t10 instanceof Spanned) {
                Spanned spanned = (Spanned) t10;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t10.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.y5.class);
                        int length2 = y5VarArr.length;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.y5 y5Var = y5VarArr[i20];
                            int spanStart = spanned.getSpanStart(y5Var);
                            int spanEnd = spanned.getSpanEnd(y5Var);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                x9Var.u = spanStart;
                                x9Var.v = spanEnd;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l10 >= spanStart2 && l10 <= spanEnd2) {
                            x9Var.u = spanStart2;
                            x9Var.v = spanEnd2;
                            break;
                        }
                        i19++;
                    }
                }
            }
            if (x9Var.u == x9Var.v) {
                while (true) {
                    int i21 = x9Var.u;
                    if (i21 <= 0 || !x9.z(t10.charAt(i21 - 1))) {
                        break;
                    } else {
                        x9Var.u--;
                    }
                }
                while (x9Var.v < t10.length() && x9.z(t10.charAt(x9Var.v))) {
                    x9Var.v++;
                }
            }
            x9Var.a = i17;
            x9Var.b = i18;
            x9Var.W = s9Var;
            try {
                x9Var.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            x9Var.V();
            x9Var.x();
            if (s9Var2 != null) {
                s9Var2.invalidate();
            }
            i7.b6 b6Var = x9Var.D;
            if (b6Var != null) {
                b6Var.a(true);
            }
            x9Var.i = true;
            x9Var.R = true;
            x9Var.k = true;
            x9Var.g = 0.0f;
            x9Var.f = 0.0f;
            x9Var.G();
        }
        x9Var.z = false;
        x9Var.e = false;
    }
}
