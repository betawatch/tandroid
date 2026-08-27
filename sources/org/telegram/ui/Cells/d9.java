package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d9 implements Runnable {
    public final /* synthetic */ w9 a;

    public d9(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.a;
        g gVar = w9Var.r0;
        Rect rect = w9Var.B;
        m9 m9Var = w9Var.a0;
        r9 r9Var = w9Var.X;
        if (r9Var == null || w9Var.C == null) {
            return;
        }
        r9 r9Var2 = w9Var.W;
        CharSequence t10 = w9Var.t(r9Var, true);
        zk0 zk0Var = w9Var.E;
        if (zk0Var != null) {
            zk0Var.I0(false);
        }
        int i10 = w9Var.s;
        int i11 = w9Var.t;
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
        int l10 = w9Var.l(i16, i11, w9Var.c, w9Var.d, r9Var, true);
        if (l10 >= t10.length()) {
            w9Var.j(l10, m9Var, true);
            Layout layout = m9Var.b;
            if (layout == null) {
                w9Var.v = -1;
                w9Var.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f10 = i16 - w9Var.c;
                if (f10 < m9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f10 > m9Var.b.getLineLeft(lineCount)) {
                    l10 = t10.length() - 1;
                }
            }
        }
        if (l10 >= 0 && l10 < t10.length() && t10.charAt(l10) != '\n') {
            int i17 = w9Var.c;
            int i18 = w9Var.d;
            w9Var.f(false);
            w9Var.C.setVisibility(0);
            w9Var.M(r9Var, r9Var2);
            w9Var.u = l10;
            w9Var.v = l10;
            if (t10 instanceof Spanned) {
                Spanned spanned = (Spanned) t10;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, t10.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, t10.length(), org.telegram.ui.Components.t5.class);
                        int length2 = t5VarArr.length;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i20];
                            int spanStart = spanned.getSpanStart(t5Var);
                            int spanEnd = spanned.getSpanEnd(t5Var);
                            if (l10 >= spanStart && l10 <= spanEnd) {
                                w9Var.u = spanStart;
                                w9Var.v = spanEnd;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l10 >= spanStart2 && l10 <= spanEnd2) {
                            w9Var.u = spanStart2;
                            w9Var.v = spanEnd2;
                            break;
                        }
                        i19++;
                    }
                }
            }
            if (w9Var.u == w9Var.v) {
                while (true) {
                    int i21 = w9Var.u;
                    if (i21 <= 0 || !w9.z(t10.charAt(i21 - 1))) {
                        break;
                    } else {
                        w9Var.u--;
                    }
                }
                while (w9Var.v < t10.length() && w9.z(t10.charAt(w9Var.v))) {
                    w9Var.v++;
                }
            }
            w9Var.a = i17;
            w9Var.b = i18;
            w9Var.W = r9Var;
            try {
                w9Var.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            w9Var.V();
            w9Var.x();
            if (r9Var2 != null) {
                r9Var2.invalidate();
            }
            h7.j0 j0Var = w9Var.D;
            if (j0Var != null) {
                j0Var.a(true);
            }
            w9Var.i = true;
            w9Var.R = true;
            w9Var.k = true;
            w9Var.g = 0.0f;
            w9Var.f = 0.0f;
            w9Var.G();
        }
        w9Var.z = false;
        w9Var.e = false;
    }
}
