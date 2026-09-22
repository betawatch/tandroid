package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l9 implements Runnable {
    public final /* synthetic */ ea a;

    public l9(ea eaVar) {
        this.a = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ea eaVar = this.a;
        g gVar = eaVar.r0;
        Rect rect = eaVar.B;
        u9 u9Var = eaVar.a0;
        z9 z9Var = eaVar.X;
        if (z9Var == null || eaVar.C == null) {
            return;
        }
        z9 z9Var2 = eaVar.W;
        CharSequence t10 = eaVar.t(z9Var, true);
        yl0 yl0Var = eaVar.E;
        if (yl0Var != null) {
            yl0Var.J0(false);
        }
        int i10 = eaVar.s;
        int i11 = eaVar.t;
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
        int l4 = eaVar.l(i16, i11, eaVar.c, eaVar.d, z9Var, true);
        if (l4 >= t10.length()) {
            eaVar.j(l4, u9Var, true);
            Layout layout = u9Var.b;
            if (layout == null) {
                eaVar.v = -1;
                eaVar.u = -1;
                return;
            } else {
                int lineCount = layout.getLineCount() - 1;
                float f7 = i16 - eaVar.c;
                if (f7 < u9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > u9Var.b.getLineLeft(lineCount)) {
                    l4 = t10.length() - 1;
                }
            }
        }
        if (l4 >= 0 && l4 < t10.length() && t10.charAt(l4) != '\n') {
            int i17 = eaVar.c;
            int i18 = eaVar.d;
            eaVar.f(false);
            eaVar.C.setVisibility(0);
            eaVar.M(z9Var, z9Var2);
            eaVar.u = l4;
            eaVar.v = l4;
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
                                eaVar.u = spanStart;
                                eaVar.v = spanEnd;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        Emoji.EmojiSpan emojiSpan = emojiSpanArr[i19];
                        int spanStart2 = spanned.getSpanStart(emojiSpan);
                        int spanEnd2 = spanned.getSpanEnd(emojiSpan);
                        if (l4 >= spanStart2 && l4 <= spanEnd2) {
                            eaVar.u = spanStart2;
                            eaVar.v = spanEnd2;
                            break;
                        }
                        i19++;
                    }
                }
            }
            if (eaVar.u == eaVar.v) {
                while (true) {
                    int i21 = eaVar.u;
                    if (i21 <= 0 || !ea.z(t10.charAt(i21 - 1))) {
                        break;
                    } else {
                        eaVar.u--;
                    }
                }
                while (eaVar.v < t10.length() && ea.z(t10.charAt(eaVar.v))) {
                    eaVar.v++;
                }
            }
            eaVar.a = i17;
            eaVar.b = i18;
            eaVar.W = z9Var;
            try {
                eaVar.C.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            eaVar.V();
            eaVar.x();
            if (z9Var2 != null) {
                z9Var2.invalidate();
            }
            w7.i0 i0Var = eaVar.D;
            if (i0Var != null) {
                i0Var.a(true);
            }
            eaVar.i = true;
            eaVar.R = true;
            eaVar.k = true;
            eaVar.g = 0.0f;
            eaVar.f = 0.0f;
            eaVar.G();
        }
        eaVar.z = false;
        eaVar.e = false;
    }
}
