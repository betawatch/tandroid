// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mi3 extends u46 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ mk3 L;
    public final /* synthetic */ nk3 M;

    public mi3(nk3 nk3Var, mk3 mk3Var) {
        this.M = nk3Var;
        this.L = mk3Var;
    }

    @Override // u46
    public final int Q0() {
        mk3 mk3Var = this.L;
        return (mk3Var.s == 0 && this.M.y3() && mk3Var.w == 2) ? 1 : 0;
    }

    @Override // u46, f69
    public final void a0(ki2 ki2Var, r69 r69Var) {
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (IndexOutOfBoundsException e) {
            fc4.g(e, true);
            gm.c3(new li3(this.L, (byte) 0));
        }
    }

    @Override // u46
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // f69
    public final void e0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        mk3 mk3Var = this.L;
        if (mk3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new pl(this, mk3Var, (byte) 13));
            this.K.addListener(new kh2(this, (byte) 9));
            this.K.setDuration(200L);
            this.K.setInterpolator(d53.f);
            this.K.start();
        }
    }

    @Override // u46
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.L.a.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4.J2(r6) != false) goto L14;
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
    /* JADX WARN: Type inference failed for: r5v4, types: [f69, mi3] */
    /* JADX WARN: Type inference failed for: r8v12, types: [f69, mi3] */
    @Override // u46, f69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
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
        pi3 pi3Var;
        float viewOffset;
        float f2;
        a aVar5;
        a aVar6;
        a aVar7;
        a aVar8;
        nk3 nk3Var = this.M;
        UndoView[] undoViewArr = nk3Var.z0;
        mk3 mk3Var = this.L;
        jk3 jk3Var = mk3Var.a;
        int i6 = 0;
        if (!jk3Var.W1) {
            boolean z6 = jk3Var.getScrollState() == 1;
            if (z6 != this.J) {
                this.J = z6;
                if (!z6) {
                }
            }
            float f3 = 0.0f;
            if (i > 0 && nk3Var.U != 0.0f) {
                aVar7 = ((d) nk3Var).actionBar;
                if (aVar7 != null) {
                    aVar8 = ((d) nk3Var).actionBar;
                }
                float f4 = nk3Var.U - i;
                if (f4 < 0.0f) {
                    i6 = (int) (-f4);
                } else {
                    f3 = f4;
                }
                nk3Var.a5(mk3Var, f3);
                return super.n0(i6, ki2Var, r69Var);
            }
            if (nk3Var.L && nk3Var.a3 == 0) {
                aVar5 = ((d) nk3Var).actionBar;
                if (aVar5 != null) {
                    aVar6 = ((d) nk3Var).actionBar;
                }
                z = true;
                int paddingTop = mk3Var.a.getPaddingTop();
                L = (z || nk3Var.H3.c() || nk3Var.S) ? paddingTop : paddingTop - gm.L(81.0f);
                if (nk3Var.S && mk3Var.s == 0 && !nk3Var.n2 && nk3Var.Y2 == 0) {
                    if (nk3Var.a3 == 0) {
                        oc7 messagesController = nk3Var.getMessagesController();
                        messagesController.getClass();
                        if (gda.m1) {
                            ?? r202 = 1;
                            boolean z7 = z;
                            z2 = z7;
                            z3 = r202;
                            if (messagesController.R.f(2305843009213693953L) != null) {
                                z2 = z7;
                                z3 = r202;
                                if (mk3Var.w == 2) {
                                    i2 = 1;
                                    z5 = z7;
                                    z4 = r202;
                                    if ((i2 == 0 || (z5 && !nk3Var.H3.c())) && i < 0) {
                                        mk3Var.a.setOverScrollMode(0);
                                        int K0 = mk3Var.c.K0();
                                        f = 1.0f;
                                        ?? r11 = (K0 == 0 || (m = mk3Var.c.m(K0)) == null || m.getBottom() - L > gm.L(1.0f)) ? K0 : z4;
                                        if (!z6) {
                                            if (r11 != 0 || i2 == 0) {
                                                i3 = -1;
                                                if (((r11 == z4 && i2 != 0) || r11 == 0) && z5 && z6 && !nk3Var.H3.c()) {
                                                    float f5 = nk3Var.O;
                                                    jk3 jk3Var2 = mk3Var.a;
                                                    if (f5 == 0.0f) {
                                                        jk3Var2.setOverScrollMode(0);
                                                    } else {
                                                        jk3Var2.setOverScrollMode(2);
                                                    }
                                                    i4 = (int) (i * 0.3f);
                                                }
                                            } else {
                                                View m2 = mk3Var.c.m(r11);
                                                float top = ((m2.getTop() - paddingTop) / m2.getMeasuredHeight()) + 1.0f;
                                                if (top > 1.0f) {
                                                    top = 1.0f;
                                                }
                                                mk3Var.a.setOverScrollMode(2);
                                                i4 = (int) mlb.B(top, 0.25f, 0.45f, i);
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
                                            if (mk3Var.s == 0) {
                                                viewOffset = ((int) mk3Var.a.getViewOffset()) - i;
                                                if (viewOffset >= 0.0f) {
                                                }
                                                mk3Var.a.setViewsOffset(f2);
                                            }
                                            if (mk3Var.s == 0) {
                                            }
                                            n0 = super.n0(i3, ki2Var, r69Var);
                                            if (n0 == 0) {
                                                nk3Var.a5(mk3Var, nk3Var.U - (nk3Var.F0.getOverScrollCoef() * i));
                                            }
                                            return n0;
                                        }
                                        View m3 = mk3Var.c.m(r11);
                                        if (m3 != null && r11 < 10) {
                                            int i7 = 0;
                                            while (i2 < r11) {
                                                qi3 qi3Var = mk3Var.d;
                                                if (((xk3) qi3Var.N.get(i2)).a == 0) {
                                                    if (!((xk3) qi3Var.N.get(i2)).f || qi3Var.K) {
                                                        L2 = gm.L(gda.l1 ? 76.0f : 70.0f);
                                                    } else {
                                                        L2 = gm.L(gda.l1 ? 86.0f : 91.0f);
                                                    }
                                                    i5 = L2 + 1;
                                                } else {
                                                    i5 = 0;
                                                }
                                                i7 += i5;
                                                i2++;
                                            }
                                            int i8 = (-(m3.getTop() - L)) + i7;
                                            if (!nk3Var.H3.c()) {
                                                aVar3 = ((d) nk3Var).actionBar;
                                                if (aVar3 != null) {
                                                    aVar4 = ((d) nk3Var).actionBar;
                                                }
                                                i8 -= gm.L(48.0f);
                                            }
                                            if (z5 && ((((ValueAnimator) mk3Var.b.c) != null || nk3Var.F0.g()) && !nk3Var.H3.c() && !nk3Var.S)) {
                                                i8 += gm.L(81.0f);
                                            }
                                            if ((((ValueAnimator) mk3Var.b.c) != null || nk3Var.F0.g()) && !nk3Var.H3.c() && !nk3Var.S) {
                                                aVar = ((d) nk3Var).actionBar;
                                                if (aVar != null) {
                                                    aVar2 = ((d) nk3Var).actionBar;
                                                }
                                                i8 += gm.L(48.0f);
                                            }
                                            if (i8 < Math.abs(i)) {
                                                i3 = -i8;
                                                if (mk3Var.s == 0 && mk3Var.a.getViewOffset() != 0.0f && i > 0 && z6) {
                                                    viewOffset = ((int) mk3Var.a.getViewOffset()) - i;
                                                    if (viewOffset >= 0.0f) {
                                                        i3 = (int) viewOffset;
                                                        f2 = 0.0f;
                                                    } else {
                                                        f2 = viewOffset;
                                                        i3 = 0;
                                                    }
                                                    mk3Var.a.setViewsOffset(f2);
                                                }
                                                if (mk3Var.s == 0 || mk3Var.w == 0 || !nk3Var.y3() || nk3Var.S) {
                                                    n0 = super.n0(i3, ki2Var, r69Var);
                                                    if (n0 == 0 && i < 0 && z6 && !nk3Var.H3.c() && z5 && nk3Var.w3 == 0.0f) {
                                                        nk3Var.a5(mk3Var, nk3Var.U - (nk3Var.F0.getOverScrollCoef() * i));
                                                    }
                                                    return n0;
                                                }
                                                int n02 = super.n0(i3, ki2Var, r69Var);
                                                pi3 pi3Var2 = mk3Var.n;
                                                if (pi3Var2 != null) {
                                                    pi3Var2.a = n02;
                                                }
                                                int K02 = mk3Var.c.K0();
                                                View m4 = K02 == 0 ? mk3Var.c.m(K02) : null;
                                                if (K02 != 0 || m4 == null || m4.getBottom() - L < gm.L(4.0f)) {
                                                    nk3Var.f3 = 0L;
                                                    nk3Var.h3 = false;
                                                    boolean z9 = mk3Var.w != 2;
                                                    mk3Var.w = (byte) 2;
                                                    if (z9 && gm.A1()) {
                                                        gm.g2(jb6.M0(2131754924, null));
                                                    }
                                                    pi3 pi3Var3 = mk3Var.n;
                                                    if (pi3Var3 != null) {
                                                        ValueAnimator valueAnimator = pi3Var3.z;
                                                        if (valueAnimator != null) {
                                                            valueAnimator.cancel();
                                                        }
                                                        hg3 hg3Var = pi3Var3.H;
                                                        if (hg3Var != null) {
                                                            hg3Var.removeCallbacks(pi3Var3.d0);
                                                        }
                                                        pi3Var3.x = 0.0f;
                                                        pi3Var3.y = false;
                                                        pi3Var3.e0 = false;
                                                        mk3Var.n.f(0.0f);
                                                        mk3Var.n.I = mk3Var.a;
                                                    }
                                                } else {
                                                    if (nk3Var.f3 == 0) {
                                                        nk3Var.f3 = System.currentTimeMillis();
                                                    }
                                                    if (mk3Var.w == 2 && (pi3Var = mk3Var.n) != null) {
                                                        pi3Var.g();
                                                    }
                                                    if (z5 && !nk3Var.H3.c() && !nk3Var.S) {
                                                        L += gm.L(81.0f);
                                                    }
                                                    float top2 = ((m4.getTop() - L) / m4.getMeasuredHeight()) + f;
                                                    if (top2 > f) {
                                                        top2 = f;
                                                    }
                                                    boolean z10 = top2 > 0.85f && System.currentTimeMillis() - nk3Var.f3 > 220;
                                                    if (nk3Var.h3 != z10) {
                                                        nk3Var.h3 = z10;
                                                        if (mk3Var.w == 2) {
                                                            try {
                                                                mk3Var.a.performHapticFeedback(3, 2);
                                                            } catch (Exception unused) {
                                                            }
                                                            pi3 pi3Var4 = mk3Var.n;
                                                            if (pi3Var4 != null) {
                                                                pi3Var4.a(z10);
                                                            }
                                                        }
                                                    }
                                                    if (mk3Var.w == 2 && i3 - n02 != 0 && i < 0 && z6) {
                                                        mk3Var.a.setViewsOffset(aq1.v(i, 0.2f, f - (mk3Var.a.getViewOffset() / gm.L(72.0f)), mk3Var.a.getViewOffset()));
                                                    }
                                                    pi3 pi3Var5 = mk3Var.n;
                                                    if (pi3Var5 != null) {
                                                        pi3Var5.f(top2);
                                                        mk3Var.n.I = mk3Var.a;
                                                    }
                                                }
                                                if (m4 != null) {
                                                    m4.invalidate();
                                                }
                                                if (mk3Var.w == 1 && n02 == 0 && i < 0 && z6 && !nk3Var.H3.c() && z5 && nk3Var.w3 == 0.0f) {
                                                    nk3Var.a5(mk3Var, nk3Var.U - (gm.R1(0.2f, 0.5f, nk3Var.F0.o0) * i));
                                                }
                                                return n02;
                                            }
                                        }
                                    } else {
                                        f = 1.0f;
                                    }
                                    i3 = i;
                                    if (mk3Var.s == 0) {
                                    }
                                    if (mk3Var.s == 0) {
                                    }
                                    n0 = super.n0(i3, ki2Var, r69Var);
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
                            mk3Var.a.setOverScrollMode(0);
                            int K03 = mk3Var.c.K0();
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
                mk3Var.a.setOverScrollMode(0);
                int K032 = mk3Var.c.K0();
                f = 1.0f;
                if (K032 == 0) {
                }
                if (!z6) {
                }
            }
            z = false;
            int paddingTop2 = mk3Var.a.getPaddingTop();
            if (z) {
            }
            if (nk3Var.S) {
            }
            r20 = 1;
            z2 = z;
            z3 = r20;
            i2 = 0;
            z5 = z2;
            z4 = z3;
            if (i2 == 0) {
            }
            mk3Var.a.setOverScrollMode(0);
            int K0322 = mk3Var.c.K0();
            f = 1.0f;
            if (K0322 == 0) {
            }
            if (!z6) {
            }
        }
        return 0;
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        if (this.M.y3() && i == 1) {
            super.u0(recyclerView, r69Var, i);
            return;
        }
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }
}
