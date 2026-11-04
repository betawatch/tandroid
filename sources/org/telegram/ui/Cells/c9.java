package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import b8.hf;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ c9(u9 u9Var, int i3) {
        this.a = i3;
        this.b = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m10;
        int i3;
        int p10;
        int i10;
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                if (u9Var.N && u9Var.E != null) {
                    if (u9Var.Z && u9Var.W == null) {
                        m10 = org.telegram.messenger.g0.L(8.0f);
                    } else if (u9Var.W != null) {
                        m10 = u9Var.m() >> 1;
                    }
                    if (!u9Var.Z && !u9Var.j0) {
                        if (u9Var.O) {
                            if (u9Var.W.getBottom() - m10 < u9Var.F.getMeasuredHeight() - u9Var.o()) {
                                i3 = u9Var.W.getBottom() - u9Var.F.getMeasuredHeight();
                                p10 = u9Var.o();
                                m10 = i3 + p10;
                            }
                        } else if (u9Var.W.getTop() + m10 > u9Var.p()) {
                            i3 = -u9Var.W.getTop();
                            p10 = u9Var.p();
                            m10 = i3 + p10;
                        }
                    }
                    tj0 tj0Var = u9Var.E;
                    if (tj0Var != null) {
                        if (!u9Var.O) {
                            m10 = -m10;
                        }
                        tj0Var.scrollBy(0, m10);
                    }
                    org.telegram.messenger.g0.h3(this);
                    break;
                }
                break;
            case 1:
                u9 u9Var2 = this.b;
                f fVar = u9Var2.m0;
                Rect rect = u9Var2.B;
                k9 k9Var = u9Var2.a0;
                p9 p9Var = u9Var2.X;
                if (p9Var != null && u9Var2.C != null) {
                    p9 p9Var2 = u9Var2.W;
                    int i11 = 1;
                    CharSequence s6 = u9Var2.s(p9Var, true);
                    tj0 tj0Var2 = u9Var2.E;
                    if (tj0Var2 != null) {
                        tj0Var2.I0(false);
                    }
                    int i12 = u9Var2.s;
                    int i13 = u9Var2.t;
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
                    int k10 = u9Var2.k(i12, i13, u9Var2.c, u9Var2.d, p9Var, true);
                    if (k10 >= s6.length()) {
                        u9Var2.i(k10, k9Var, true);
                        Layout layout = (Layout) k9Var.d;
                        if (layout == null) {
                            u9Var2.v = -1;
                            u9Var2.u = -1;
                            break;
                        } else {
                            int lineCount = layout.getLineCount() - 1;
                            float f10 = i12 - u9Var2.c;
                            if (f10 < ((Layout) k9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) k9Var.d).getLineLeft(lineCount)) {
                                k10 = s6.length() - 1;
                            }
                        }
                    }
                    if (k10 >= 0 && k10 < s6.length() && s6.charAt(k10) != '\n') {
                        int i18 = u9Var2.c;
                        int i19 = u9Var2.d;
                        u9Var2.f(false);
                        u9Var2.C.setVisibility(0);
                        u9Var2.L(p9Var, p9Var2);
                        u9Var2.u = k10;
                        u9Var2.v = k10;
                        if (s6 instanceof Spanned) {
                            Spanned spanned = (Spanned) s6;
                            org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spanned.getSpans(0, s6.length(), org.telegram.messenger.f6.class);
                            int length = f6VarArr.length;
                            int i20 = 0;
                            while (true) {
                                if (i20 < length) {
                                    org.telegram.messenger.f6 f6Var = f6VarArr[i20];
                                    i10 = i11;
                                    int spanStart = spanned.getSpanStart(f6Var);
                                    int spanEnd = spanned.getSpanEnd(f6Var);
                                    if (k10 < spanStart || k10 > spanEnd) {
                                        i20++;
                                        i11 = i10;
                                    } else {
                                        u9Var2.u = spanStart;
                                        u9Var2.v = spanEnd;
                                    }
                                } else {
                                    i10 = i11;
                                    org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(0, s6.length(), org.telegram.ui.Components.p5.class);
                                    int length2 = p5VarArr.length;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < length2) {
                                            org.telegram.ui.Components.p5 p5Var = p5VarArr[i21];
                                            int spanStart2 = spanned.getSpanStart(p5Var);
                                            int spanEnd2 = spanned.getSpanEnd(p5Var);
                                            if (k10 < spanStart2 || k10 > spanEnd2) {
                                                i21++;
                                            } else {
                                                u9Var2.u = spanStart2;
                                                u9Var2.v = spanEnd2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 1;
                        }
                        if (u9Var2.u == u9Var2.v) {
                            while (true) {
                                int i22 = u9Var2.u;
                                if (i22 > 0 && u9.y(s6.charAt(i22 - 1))) {
                                    u9Var2.u--;
                                }
                            }
                            while (u9Var2.v < s6.length() && u9.y(s6.charAt(u9Var2.v))) {
                                u9Var2.v++;
                            }
                        }
                        u9Var2.a = i18;
                        u9Var2.b = i19;
                        u9Var2.W = p9Var;
                        try {
                            u9Var2.C.performHapticFeedback(0, i10);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.h3(fVar);
                        u9Var2.U();
                        u9Var2.w();
                        if (p9Var2 != null) {
                            p9Var2.invalidate();
                        }
                        hf hfVar = u9Var2.D;
                        if (hfVar != null) {
                            hfVar.a(true);
                        }
                        u9Var2.i = true;
                        u9Var2.R = true;
                        u9Var2.k = true;
                        u9Var2.g = 0.0f;
                        u9Var2.f = 0.0f;
                        u9Var2.F();
                    }
                    u9Var2.z = false;
                    u9Var2.e = false;
                    break;
                }
                break;
            default:
                u9 u9Var3 = this.b;
                org.telegram.ui.ActionBar.u3 u3Var = u9Var3.Y;
                if (u3Var != null && !u9Var3.P) {
                    u3Var.hide(Long.MAX_VALUE);
                    org.telegram.messenger.g0.i3(u9Var3.n0, 1000L);
                    break;
                }
                break;
        }
    }
}
