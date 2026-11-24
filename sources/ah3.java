// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ah3 extends t26 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ bj3 L;
    public final /* synthetic */ cj3 M;

    public ah3(cj3 cj3Var, bj3 bj3Var) {
        this.M = cj3Var;
        this.L = bj3Var;
    }

    @Override // t26
    public final int Q0() {
        bj3 bj3Var = this.L;
        return (bj3Var.s == 0 && this.M.w3() && bj3Var.w == 2) ? 1 : 0;
    }

    @Override // t26, d49
    public final void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = w01.a;
        try {
            super.a0(wg2Var, p49Var);
        } catch (IndexOutOfBoundsException e) {
            fa4.g(e, true);
            gl.c3(new zg3(this.L, (byte) 0));
        }
    }

    @Override // t26
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // d49
    public final void e0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        bj3 bj3Var = this.L;
        if (bj3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new pk(this, bj3Var, (byte) 13));
            this.K.addListener(new im2(this, (byte) 7));
            this.K.setDuration(200L);
            this.K.setInterpolator(s33.f);
            this.K.start();
        }
    }

    @Override // t26
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.L.a.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4.H2(r6) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r11.y() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0185, code lost:
    
        if (r8.y() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01d9, code lost:
    
        if (r8.y() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0259, code lost:
    
        if (r8 <= (-1)) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r11.y() == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028f  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ah3, d49] */
    /* JADX WARN: Type inference failed for: r8v12, types: [ah3, d49] */
    @Override // t26, d49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        boolean z;
        int L;
        ?? r20;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        float f;
        int i3;
        int i4;
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int i5;
        int L2;
        View m;
        int n0;
        dh3 dh3Var;
        float viewOffset;
        float f2;
        a aVar5;
        a aVar6;
        a aVar7;
        a aVar8;
        cj3 cj3Var = this.M;
        UndoView[] undoViewArr = cj3Var.z0;
        bj3 bj3Var = this.L;
        yi3 yi3Var = bj3Var.a;
        int i6 = 0;
        if (!yi3Var.W1) {
            boolean z6 = yi3Var.getScrollState() == 1;
            if (z6 != this.J) {
                this.J = z6;
                if (!z6) {
                }
            }
            float f3 = 0.0f;
            if (i > 0 && cj3Var.U != 0.0f) {
                aVar7 = ((d) cj3Var).actionBar;
                if (aVar7 != null) {
                    aVar8 = ((d) cj3Var).actionBar;
                }
                float f4 = cj3Var.U - i;
                if (f4 < 0.0f) {
                    i6 = (int) (-f4);
                } else {
                    f3 = f4;
                }
                cj3Var.W4(bj3Var, f3);
                return super.n0(i6, wg2Var, p49Var);
            }
            if (cj3Var.L && cj3Var.a3 == 0) {
                aVar5 = ((d) cj3Var).actionBar;
                if (aVar5 != null) {
                    aVar6 = ((d) cj3Var).actionBar;
                }
                z = true;
                int paddingTop = bj3Var.a.getPaddingTop();
                L = (z || cj3Var.H3.c() || cj3Var.S) ? paddingTop : paddingTop - gl.L(81.0f);
                if (cj3Var.S && bj3Var.s == 0 && !cj3Var.n2 && cj3Var.Y2 == 0) {
                    if (cj3Var.a3 == 0) {
                        na7 messagesController = cj3Var.getMessagesController();
                        messagesController.getClass();
                        if (gba.m1) {
                            ?? r202 = 1;
                            boolean z7 = z;
                            z2 = z7;
                            z3 = r202;
                            if (messagesController.R.f(2305843009213693953L) != null) {
                                z2 = z7;
                                z3 = r202;
                                if (bj3Var.w == 2) {
                                    i2 = 1;
                                    z5 = z7;
                                    z4 = r202;
                                    if ((i2 == 0 || (z5 && !cj3Var.H3.c())) && i < 0) {
                                        bj3Var.a.setOverScrollMode(0);
                                        int K0 = bj3Var.c.K0();
                                        f = 1.0f;
                                        ?? r11 = (K0 == 0 || (m = bj3Var.c.m(K0)) == null || m.getBottom() - L > gl.L(1.0f)) ? K0 : z4;
                                        if (!z6) {
                                            if (r11 != 0 || i2 == 0) {
                                                i3 = -1;
                                                if (((r11 == z4 && i2 != 0) || r11 == 0) && z5 && z6 && !cj3Var.H3.c()) {
                                                    float f5 = cj3Var.O;
                                                    yi3 yi3Var2 = bj3Var.a;
                                                    if (f5 == 0.0f) {
                                                        yi3Var2.setOverScrollMode(0);
                                                    } else {
                                                        yi3Var2.setOverScrollMode(2);
                                                    }
                                                    i4 = (int) (i * 0.3f);
                                                }
                                            } else {
                                                View m2 = bj3Var.c.m(r11);
                                                float top = ((m2.getTop() - paddingTop) / m2.getMeasuredHeight()) + 1.0f;
                                                if (top > 1.0f) {
                                                    top = 1.0f;
                                                }
                                                bj3Var.a.setOverScrollMode(2);
                                                i4 = (int) yjb.B(top, 0.25f, 0.45f, i);
                                                if (i4 > -1) {
                                                    i4 = -1;
                                                }
                                                UndoView undoView = undoViewArr[0];
                                                if (undoView != null && undoView.getVisibility() == 0) {
                                                    boolean z8 = z4;
                                                    undoViewArr[0].d(z8 ? 1 : 0, z8);
                                                }
                                            }
                                            i3 = i4;
                                            if (bj3Var.s == 0) {
                                                viewOffset = ((int) bj3Var.a.getViewOffset()) - i;
                                                if (viewOffset >= 0.0f) {
                                                }
                                                bj3Var.a.setViewsOffset(f2);
                                            }
                                            if (bj3Var.s == 0) {
                                            }
                                            n0 = super.n0(i3, wg2Var, p49Var);
                                            if (n0 == 0) {
                                                cj3Var.W4(bj3Var, cj3Var.U - (cj3Var.F0.getOverScrollCoef() * i));
                                            }
                                            return n0;
                                        }
                                        View m3 = bj3Var.c.m(r11);
                                        if (m3 != null && r11 < 10) {
                                            int i7 = 0;
                                            while (i2 < r11) {
                                                eh3 eh3Var = bj3Var.d;
                                                if (((mj3) eh3Var.N.get(i2)).a == 0) {
                                                    if (!((mj3) eh3Var.N.get(i2)).f || eh3Var.K) {
                                                        L2 = gl.L(gba.l1 ? 76.0f : 70.0f);
                                                    } else {
                                                        L2 = gl.L(gba.l1 ? 86.0f : 91.0f);
                                                    }
                                                    i5 = L2 + 1;
                                                } else {
                                                    i5 = 0;
                                                }
                                                i7 += i5;
                                                i2++;
                                            }
                                            int i8 = (-(m3.getTop() - L)) + i7;
                                            if (!cj3Var.H3.c()) {
                                                aVar3 = ((d) cj3Var).actionBar;
                                                if (aVar3 != null) {
                                                    aVar4 = ((d) cj3Var).actionBar;
                                                }
                                                i8 -= gl.L(48.0f);
                                            }
                                            if (z5 && ((((ValueAnimator) bj3Var.b.c) != null || cj3Var.F0.g()) && !cj3Var.H3.c() && !cj3Var.S)) {
                                                i8 += gl.L(81.0f);
                                            }
                                            if ((((ValueAnimator) bj3Var.b.c) != null || cj3Var.F0.g()) && !cj3Var.H3.c() && !cj3Var.S) {
                                                aVar = ((d) cj3Var).actionBar;
                                                if (aVar != null) {
                                                    aVar2 = ((d) cj3Var).actionBar;
                                                }
                                                i8 += gl.L(48.0f);
                                            }
                                            if (i8 < Math.abs(i)) {
                                                i3 = -i8;
                                                if (bj3Var.s == 0 && bj3Var.a.getViewOffset() != 0.0f && i > 0 && z6) {
                                                    viewOffset = ((int) bj3Var.a.getViewOffset()) - i;
                                                    if (viewOffset >= 0.0f) {
                                                        i3 = (int) viewOffset;
                                                        f2 = 0.0f;
                                                    } else {
                                                        f2 = viewOffset;
                                                        i3 = 0;
                                                    }
                                                    bj3Var.a.setViewsOffset(f2);
                                                }
                                                if (bj3Var.s == 0 || bj3Var.w == 0 || !cj3Var.w3() || cj3Var.S) {
                                                    n0 = super.n0(i3, wg2Var, p49Var);
                                                    if (n0 == 0 && i < 0 && z6 && !cj3Var.H3.c() && z5 && cj3Var.w3 == 0.0f) {
                                                        cj3Var.W4(bj3Var, cj3Var.U - (cj3Var.F0.getOverScrollCoef() * i));
                                                    }
                                                    return n0;
                                                }
                                                int n02 = super.n0(i3, wg2Var, p49Var);
                                                dh3 dh3Var2 = bj3Var.n;
                                                if (dh3Var2 != null) {
                                                    dh3Var2.a = n02;
                                                }
                                                int K02 = bj3Var.c.K0();
                                                View m4 = K02 == 0 ? bj3Var.c.m(K02) : null;
                                                if (K02 != 0 || m4 == null || m4.getBottom() - L < gl.L(4.0f)) {
                                                    cj3Var.f3 = 0L;
                                                    cj3Var.h3 = false;
                                                    boolean z9 = bj3Var.w != 2;
                                                    bj3Var.w = (byte) 2;
                                                    if (z9 && gl.A1()) {
                                                        gl.g2(k96.M0(2131754924, null));
                                                    }
                                                    dh3 dh3Var3 = bj3Var.n;
                                                    if (dh3Var3 != null) {
                                                        ValueAnimator valueAnimator = dh3Var3.z;
                                                        if (valueAnimator != null) {
                                                            valueAnimator.cancel();
                                                        }
                                                        ue3 ue3Var = dh3Var3.H;
                                                        if (ue3Var != null) {
                                                            ue3Var.removeCallbacks(dh3Var3.d0);
                                                        }
                                                        dh3Var3.x = 0.0f;
                                                        dh3Var3.y = false;
                                                        dh3Var3.e0 = false;
                                                        bj3Var.n.f(0.0f);
                                                        bj3Var.n.I = bj3Var.a;
                                                    }
                                                } else {
                                                    if (cj3Var.f3 == 0) {
                                                        cj3Var.f3 = System.currentTimeMillis();
                                                    }
                                                    if (bj3Var.w == 2 && (dh3Var = bj3Var.n) != null) {
                                                        dh3Var.g();
                                                    }
                                                    if (z5 && !cj3Var.H3.c() && !cj3Var.S) {
                                                        L += gl.L(81.0f);
                                                    }
                                                    float top2 = ((m4.getTop() - L) / m4.getMeasuredHeight()) + f;
                                                    if (top2 > f) {
                                                        top2 = f;
                                                    }
                                                    boolean z10 = top2 > 0.85f && System.currentTimeMillis() - cj3Var.f3 > 220;
                                                    if (cj3Var.h3 != z10) {
                                                        cj3Var.h3 = z10;
                                                        if (bj3Var.w == 2) {
                                                            try {
                                                                bj3Var.a.performHapticFeedback(3, 2);
                                                            } catch (Exception unused) {
                                                            }
                                                            dh3 dh3Var4 = bj3Var.n;
                                                            if (dh3Var4 != null) {
                                                                dh3Var4.a(z10);
                                                            }
                                                        }
                                                    }
                                                    if (bj3Var.w == 2 && i3 - n02 != 0 && i < 0 && z6) {
                                                        bj3Var.a.setViewsOffset(oo1.v(i, 0.2f, f - (bj3Var.a.getViewOffset() / gl.L(72.0f)), bj3Var.a.getViewOffset()));
                                                    }
                                                    dh3 dh3Var5 = bj3Var.n;
                                                    if (dh3Var5 != null) {
                                                        dh3Var5.f(top2);
                                                        bj3Var.n.I = bj3Var.a;
                                                    }
                                                }
                                                if (m4 != null) {
                                                    m4.invalidate();
                                                }
                                                if (bj3Var.w == 1 && n02 == 0 && i < 0 && z6 && !cj3Var.H3.c() && z5 && cj3Var.w3 == 0.0f) {
                                                    cj3Var.W4(bj3Var, cj3Var.U - (gl.R1(0.2f, 0.5f, cj3Var.F0.o0) * i));
                                                }
                                                return n02;
                                            }
                                        }
                                    } else {
                                        f = 1.0f;
                                    }
                                    i3 = i;
                                    if (bj3Var.s == 0) {
                                    }
                                    if (bj3Var.s == 0) {
                                    }
                                    n0 = super.n0(i3, wg2Var, p49Var);
                                    if (n0 == 0) {
                                    }
                                    return n0;
                                }
                            }
                            i2 = 0;
                            z5 = z2;
                            z4 = z3;
                            if (i2 == 0) {
                            }
                            bj3Var.a.setOverScrollMode(0);
                            int K03 = bj3Var.c.K0();
                            f = 1.0f;
                            if (K03 == 0) {
                            }
                            if (!z6) {
                            }
                        }
                    }
                    r20 = 1;
                } else {
                    r20 = 1;
                }
                z2 = z;
                z3 = r20;
                i2 = 0;
                z5 = z2;
                z4 = z3;
                if (i2 == 0) {
                }
                bj3Var.a.setOverScrollMode(0);
                int K032 = bj3Var.c.K0();
                f = 1.0f;
                if (K032 == 0) {
                }
                if (!z6) {
                }
            }
            z = false;
            int paddingTop2 = bj3Var.a.getPaddingTop();
            if (z) {
            }
            if (cj3Var.S) {
            }
            r20 = 1;
            z2 = z;
            z3 = r20;
            i2 = 0;
            z5 = z2;
            z4 = z3;
            if (i2 == 0) {
            }
            bj3Var.a.setOverScrollMode(0);
            int K0322 = bj3Var.c.K0();
            f = 1.0f;
            if (K0322 == 0) {
            }
            if (!z6) {
            }
        }
        return 0;
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        if (this.M.w3() && i == 1) {
            super.u0(recyclerView, p49Var, i);
            return;
        }
        v26 v26Var = new v26(recyclerView.getContext(), 0);
        v26Var.a = i;
        v0(v26Var);
    }
}
