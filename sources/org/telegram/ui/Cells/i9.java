package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ aa a;

    public i9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        aa aaVar = this.a;
        g gVar = aaVar.m0;
        Rect rect = aaVar.B;
        q9 q9Var = aaVar.a0;
        v9 v9Var = aaVar.X;
        if (v9Var == null || aaVar.C == null) {
            return;
        }
        v9 v9Var2 = aaVar.W;
        int i11 = 1;
        CharSequence s10 = aaVar.s(v9Var, true);
        jm0 jm0Var = aaVar.E;
        if (jm0Var != null) {
            jm0Var.I0(false);
        }
        int i12 = aaVar.s;
        int i13 = aaVar.t;
        if (!rect.isEmpty()) {
            int i14 = rect.right;
            if (i12 > i14) {
                i12 = i14 - 1;
            }
            int i15 = rect.left;
            if (i12 < i15) {
                i12 = i15 + 1;
            }
            int i16 = rect.top;
            if (i13 < i16) {
                i13 = i16 + 1;
            }
            int i17 = rect.bottom;
            if (i13 > i17) {
                i13 = i17 - 1;
            }
        }
        int i18 = i12;
        int k10 = aaVar.k(i18, i13, aaVar.c, aaVar.d, v9Var, true);
        if (k10 >= s10.length()) {
            aaVar.i(k10, q9Var, true);
            Layout layout = q9Var.b;
            if (layout == null) {
                aaVar.v = -1;
                aaVar.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - aaVar.c;
                if (f7 < q9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > q9Var.b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
        }
        if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
            int i19 = aaVar.c;
            int i20 = aaVar.d;
            aaVar.f(false);
            aaVar.C.setVisibility(0);
            aaVar.L(v9Var, v9Var2);
            aaVar.u = k10;
            aaVar.v = k10;
            if (s10 instanceof Spanned) {
                Spanned spanned = (Spanned) s10;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, s10.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i21 = 0;
                while (true) {
                    if (i21 >= length) {
                        i10 = i11;
                        org.telegram.ui.Components.a6[] a6VarArr = (org.telegram.ui.Components.a6[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.a6.class);
                        int length2 = a6VarArr.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.a6 a6Var = a6VarArr[i22];
                            int spanStart = spanned.getSpanStart(a6Var);
                            int spanEnd = spanned.getSpanEnd(a6Var);
                            if (k10 >= spanStart && k10 <= spanEnd) {
                                aaVar.u = spanStart;
                                aaVar.v = spanEnd;
                                break;
                            }
                            i22++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i21];
                        i10 = i11;
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (k10 >= spanStart2 && k10 <= spanEnd2) {
                            aaVar.u = spanStart2;
                            aaVar.v = spanEnd2;
                            break;
                        } else {
                            i21++;
                            i11 = i10;
                        }
                    }
                }
            } else {
                i10 = 1;
            }
            if (aaVar.u == aaVar.v) {
                while (true) {
                    int i23 = aaVar.u;
                    if (i23 <= 0 || !aa.y(s10.charAt(i23 - 1))) {
                        break;
                    } else {
                        aaVar.u--;
                    }
                }
                while (aaVar.v < s10.length() && aa.y(s10.charAt(aaVar.v))) {
                    aaVar.v++;
                }
            }
            aaVar.a = i19;
            aaVar.b = i20;
            aaVar.W = v9Var;
            try {
                aaVar.C.performHapticFeedback(0, i10);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            aaVar.U();
            aaVar.w();
            if (v9Var2 != null) {
                v9Var2.invalidate();
            }
            w7.j0 j0Var = aaVar.D;
            if (j0Var != null) {
                j0Var.a(true);
            }
            aaVar.i = true;
            aaVar.R = true;
            aaVar.k = true;
            aaVar.g = 0.0f;
            aaVar.f = 0.0f;
            aaVar.F();
        }
        aaVar.z = false;
        aaVar.e = false;
    }
}
