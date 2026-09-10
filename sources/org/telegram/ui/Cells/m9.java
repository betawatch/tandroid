package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m9 implements Runnable {
    public final /* synthetic */ fa a;

    public m9(fa faVar) {
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fa faVar = this.a;
        g gVar = faVar.r0;
        Rect rect = faVar.B;
        v9 v9Var = faVar.a0;
        aa aaVar = faVar.X;
        if (aaVar == null || faVar.C == null) {
            return;
        }
        aa aaVar2 = faVar.W;
        CharSequence t10 = faVar.t(aaVar, true);
        vl0 vl0Var = faVar.E;
        if (vl0Var != null) {
            vl0Var.I0(false);
        }
        int i10 = faVar.s;
        int i11 = faVar.t;
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
        int l4 = faVar.l(i16, i11, faVar.c, faVar.d, aaVar, true);
        if (l4 >= t10.length()) {
            faVar.j(l4, v9Var, true);
            Layout layout = v9Var.b;
            if (layout == null) {
                faVar.v = -1;
                faVar.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - faVar.c;
                if (f7 < v9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > v9Var.b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
        }
        if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
            int i17 = faVar.c;
            int i18 = faVar.d;
            faVar.f(false);
            faVar.C.setVisibility(0);
            faVar.M(aaVar, aaVar2);
            faVar.u = l4;
            faVar.v = l4;
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
                            if (l4 >= spanStart && l4 <= spanEnd) {
                                faVar.u = spanStart;
                                faVar.v = spanEnd;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l4 >= spanStart2 && l4 <= spanEnd2) {
                            faVar.u = spanStart2;
                            faVar.v = spanEnd2;
                            break;
                        }
                        i19++;
                    }
                }
            }
            if (faVar.u == faVar.v) {
                while (true) {
                    int i21 = faVar.u;
                    if (i21 <= 0 || !fa.z(t10.charAt(i21 - 1))) {
                        break;
                    } else {
                        faVar.u--;
                    }
                }
                while (faVar.v < t10.length() && fa.z(t10.charAt(faVar.v))) {
                    faVar.v++;
                }
            }
            faVar.a = i17;
            faVar.b = i18;
            faVar.W = aaVar;
            try {
                faVar.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            faVar.V();
            faVar.x();
            if (aaVar2 != null) {
                aaVar2.invalidate();
            }
            w7.w5 w5Var = faVar.D;
            if (w5Var != null) {
                w5Var.a(true);
            }
            faVar.i = true;
            faVar.R = true;
            faVar.k = true;
            faVar.g = 0.0f;
            faVar.f = 0.0f;
            faVar.G();
        }
        faVar.z = false;
        faVar.e = false;
    }
}
