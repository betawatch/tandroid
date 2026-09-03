package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ y9 a;

    public f9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y9 y9Var = this.a;
        g gVar = y9Var.r0;
        Rect rect = y9Var.B;
        o9 o9Var = y9Var.a0;
        t9 t9Var = y9Var.X;
        if (t9Var == null || y9Var.C == null) {
            return;
        }
        t9 t9Var2 = y9Var.W;
        CharSequence t6 = y9Var.t(t9Var, true);
        rl0 rl0Var = y9Var.E;
        if (rl0Var != null) {
            rl0Var.I0(false);
        }
        int i10 = y9Var.s;
        int i11 = y9Var.t;
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
        int l10 = y9Var.l(i16, i11, y9Var.c, y9Var.d, t9Var, true);
        if (l10 >= t6.length()) {
            y9Var.j(l10, o9Var, true);
            Layout layout = o9Var.b;
            if (layout == null) {
                y9Var.v = -1;
                y9Var.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - y9Var.c;
                if (f10 < o9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > o9Var.b.getLineLeft(lineCount)) {
                    l10 = t6.length() - 1;
                }
            }
        }
        if (l10 >= 0 && l10 < t6.length() && t6.charAt(l10) != '\n') {
            int i17 = y9Var.c;
            int i18 = y9Var.d;
            y9Var.f(false);
            y9Var.C.setVisibility(0);
            y9Var.M(t9Var, t9Var2);
            y9Var.u = l10;
            y9Var.v = l10;
            if (t6 instanceof Spanned) {
                Spanned spanned = (Spanned) t6;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t6.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(0, t6.length(), org.telegram.ui.Components.u5.class);
                        int length2 = u5VarArr.length;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.u5 u5Var = u5VarArr[i20];
                            int spanStart = spanned.getSpanStart(u5Var);
                            int spanEnd = spanned.getSpanEnd(u5Var);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                y9Var.u = spanStart;
                                y9Var.v = spanEnd;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l10 >= spanStart2 && l10 <= spanEnd2) {
                            y9Var.u = spanStart2;
                            y9Var.v = spanEnd2;
                            break;
                        }
                        i19++;
                    }
                }
            }
            if (y9Var.u == y9Var.v) {
                while (true) {
                    int i21 = y9Var.u;
                    if (i21 <= 0 || !y9.z(t6.charAt(i21 - 1))) {
                        break;
                    } else {
                        y9Var.u--;
                    }
                }
                while (y9Var.v < t6.length() && y9.z(t6.charAt(y9Var.v))) {
                    y9Var.v++;
                }
            }
            y9Var.a = i17;
            y9Var.b = i18;
            y9Var.W = t9Var;
            try {
                y9Var.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            y9Var.V();
            y9Var.x();
            if (t9Var2 != null) {
                t9Var2.invalidate();
            }
            k7.x5 x5Var = y9Var.D;
            if (x5Var != null) {
                x5Var.a(true);
            }
            y9Var.i = true;
            y9Var.R = true;
            y9Var.k = true;
            y9Var.g = 0.0f;
            y9Var.f = 0.0f;
            y9Var.G();
        }
        y9Var.z = false;
        y9Var.e = false;
    }
}
