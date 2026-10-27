package org.telegram.ui.Cells;

import a8.ye;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n9 implements Runnable {
    public final /* synthetic */ fa a;

    public n9(fa faVar) {
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        fa faVar = this.a;
        g gVar = faVar.m0;
        Rect rect = faVar.B;
        v9 v9Var = faVar.a0;
        aa aaVar = faVar.X;
        if (aaVar == null || faVar.C == null) {
            return;
        }
        aa aaVar2 = faVar.W;
        int i11 = 1;
        CharSequence s10 = faVar.s(aaVar, true);
        nm0 nm0Var = faVar.E;
        if (nm0Var != null) {
            nm0Var.I0(false);
        }
        int i12 = faVar.s;
        int i13 = faVar.t;
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
        int k10 = faVar.k(i18, i13, faVar.c, faVar.d, aaVar, true);
        if (k10 >= s10.length()) {
            faVar.i(k10, v9Var, true);
            Layout layout = v9Var.b;
            if (layout == null) {
                faVar.v = -1;
                faVar.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f7 = i18 - faVar.c;
                if (f7 < v9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
        }
        if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
            int i19 = faVar.c;
            int i20 = faVar.d;
            faVar.f(false);
            faVar.C.setVisibility(0);
            faVar.L(aaVar, aaVar2);
            faVar.u = k10;
            faVar.v = k10;
            if (s10 instanceof Spanned) {
                Spanned spanned = (Spanned) s10;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(0, s10.length(), Emoji.EmojiSpan.class);
                int length = emojiSpanArr.length;
                int i21 = 0;
                while (true) {
                    if (i21 >= length) {
                        i10 = i11;
                        org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spanned.getSpans(0, s10.length(), org.telegram.ui.Components.c6.class);
                        int length2 = c6VarArr.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 >= length2) {
                                break;
                            }
                            org.telegram.ui.Components.c6 c6Var = c6VarArr[i22];
                            int spanStart = spanned.getSpanStart(c6Var);
                            int spanEnd = spanned.getSpanEnd(c6Var);
                            if (k10 >= spanStart && k10 <= spanEnd) {
                                faVar.u = spanStart;
                                faVar.v = spanEnd;
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
                            faVar.u = spanStart2;
                            faVar.v = spanEnd2;
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
            if (faVar.u == faVar.v) {
                while (true) {
                    int i23 = faVar.u;
                    if (i23 <= 0 || !fa.y(s10.charAt(i23 - 1))) {
                        break;
                    } else {
                        faVar.u--;
                    }
                }
                while (faVar.v < s10.length() && fa.y(s10.charAt(faVar.v))) {
                    faVar.v++;
                }
            }
            faVar.a = i19;
            faVar.b = i20;
            faVar.W = aaVar;
            try {
                faVar.C.performHapticFeedback(0, i10);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            faVar.U();
            faVar.w();
            if (aaVar2 != null) {
                aaVar2.invalidate();
            }
            ye yeVar = faVar.D;
            if (yeVar != null) {
                yeVar.a(true);
            }
            faVar.i = true;
            faVar.R = true;
            faVar.k = true;
            faVar.g = 0.0f;
            faVar.f = 0.0f;
            faVar.F();
        }
        faVar.z = false;
        faVar.e = false;
    }
}
