package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.f3;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.bj;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ g2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ bn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ p0 x;
    public final /* synthetic */ l0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Context context, g2 g2Var, View view, boolean z10, gj gjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.y = l0Var;
        this.a = g2Var;
        this.b = view;
        this.c = z10;
        this.d = gjVar;
        this.e = bnVar;
        this.f = i7;
        this.h = i10;
        this.n = z11;
        this.r = f10;
        this.s = f11;
        this.w = f12;
        this.x = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0373, code lost:
    
        if (r24.y.c.getImageReceiver().B().l0 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038d, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0539, code lost:
    
        if (((int) org.telegram.messenger.o10.w(r24.y.b.getImageReceiver().B().b0, r24.y.b.getImageReceiver().B().e[0], r8, r8)) < r6.b) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03b5, code lost:
    
        if (r24.y.b.getImageReceiver().B().l0 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03ca, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) > 2000) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c2  */
    /* JADX WARN: Type inference failed for: r4v44, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r9v17, types: [org.telegram.messenger.hc] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        float f10;
        float f11;
        float f12;
        l0 l0Var;
        float f13;
        float f14;
        float f15;
        float f16;
        int i7;
        float f17;
        float f18;
        float f19;
        ?? r92;
        float f20;
        float y10;
        float f21;
        n0 n0Var;
        int paddingTop;
        bn bnVar;
        gj messageObject;
        l0 l0Var2 = this.y;
        final int i10 = 0;
        if (l0Var2.l) {
            float f22 = l0Var2.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                l0Var2.m = f23;
                if (f23 > 1.0f) {
                    l0Var2.m = 1.0f;
                    org.telegram.messenger.g0.g3(new Runnable(this) { // from class: ch.h0
                        public final /* synthetic */ i0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.b.y.c();
                                    break;
                                default:
                                    this.b.y.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f24 = this.y.m;
            if (f24 != 1.0f) {
                setAlpha(1.0f - f24);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!l0Var2.s) {
            invalidate();
            return;
        }
        vi0 vi0Var = l0Var2.t;
        if (vi0Var != null) {
            vi0Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        g2 g2Var = this.a;
        if (g2Var instanceof bn) {
            bn bnVar2 = (bn) g2Var;
            int i11 = this.y.n;
            bj bjVar = bnVar2.A0;
            if (bjVar != null) {
                int childCount = bjVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    view = bnVar2.A0.getChildAt(i12);
                    if (view instanceof r1) {
                        messageObject = ((r1) view).getMessageObject();
                    } else if (view instanceof v0) {
                        messageObject = ((v0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.e1() == i11) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        float L = this.c ? org.telegram.messenger.g0.L(cz.j() ? 120.0f : 50.0f) : this.d != null ? org.telegram.messenger.g0.L(20.0f) : org.telegram.messenger.g0.L(14.0f);
        final int i13 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            l0 l0Var3 = this.y;
            int[] iArr = l0Var3.j;
            f11 = iArr[0];
            f12 = iArr[1];
            if (view instanceof r1) {
                r1 r1Var = (r1) view;
                f10 = 0.10666667f;
                n0Var = r1Var.O.k(l0Var3.p);
                if (r1Var.K && !r1Var.H3()) {
                    f12 += org.telegram.messenger.g0.L(2.0f);
                }
                paddingTop = r1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (view instanceof v0) {
                    n0Var = ((v0) view).F0.k(l0Var3.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof nh.c) {
                        f11 += ((nh.c) view).getReactionCenterX();
                        f12 += view.getMeasuredHeight() / 2.0f;
                    }
                    n0Var = null;
                    if (n0Var != null) {
                        Rect rect = n0Var.s;
                        f11 += rect.left;
                        f12 += rect.top;
                    }
                    bnVar = this.e;
                    if (bnVar != null) {
                        f12 += bnVar.Wa;
                    }
                    l0 l0Var4 = this.y;
                    l0Var4.q = f11;
                    l0Var4.r = f12;
                }
            }
            f12 += paddingTop;
            if (n0Var != null) {
            }
            bnVar = this.e;
            if (bnVar != null) {
            }
            l0 l0Var42 = this.y;
            l0Var42.q = f11;
            l0Var42.r = f12;
        } else {
            f10 = 0.10666667f;
            if (this.c) {
                float f25 = L / 2.0f;
                f11 = (getMeasuredWidth() / 2.0f) - f25;
                f12 = (getMeasuredHeight() / 2.0f) - f25;
            } else {
                l0 l0Var5 = this.y;
                f11 = l0Var5.q;
                f12 = l0Var5.r;
            }
        }
        g2 g2Var2 = this.a;
        if (g2Var2 != null && g2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof nh.c)) {
            return;
        }
        float f26 = (view instanceof nh.c ? this.f : this.f - L) / 2.0f;
        float f27 = f11 - f26;
        float f28 = f12 - f26;
        if (this.c && this.h == 0) {
            f27 += org.telegram.messenger.g0.L(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f29 = this.y.j[0];
            if (f27 < f29) {
                f27 = f29;
            }
            if (this.f + f27 > getMeasuredWidth() + r12) {
                f27 = (getMeasuredWidth() + this.y.j[0]) - this.f;
            }
        }
        nr nrVar = nr.f;
        float interpolation = nrVar.getInterpolation(this.y.h);
        if (this.h == 2) {
            f13 = nr.h.getInterpolation(interpolation);
            f14 = nrVar.getInterpolation(interpolation);
            l0Var = null;
        } else if (this.n) {
            l0Var = null;
            f13 = nr.h.getInterpolation(this.y.g);
            f14 = nrVar.getInterpolation(this.y.g);
        } else {
            l0Var = null;
            f13 = this.y.g;
            f14 = f13;
        }
        float f30 = 1.0f - f13;
        float f31 = (this.r * f30) + f13;
        float f32 = L / this.f;
        if (this.h == 1) {
            f31 = 1.0f;
        } else {
            f27 = (f27 * f13) + (this.s * f30);
            f28 = (f28 * f14) + ((1.0f - f14) * this.w);
        }
        this.y.b.setTranslationX(f27);
        this.y.b.setTranslationY(f28);
        float f33 = 1.0f - interpolation;
        this.y.b.setAlpha(f33);
        this.y.b.setScaleX(f31);
        this.y.b.setScaleY(f31);
        int i14 = this.h;
        if (i14 != 2) {
            if (interpolation != 0.0f) {
                f31 = (f31 * f33) + (f32 * interpolation);
                f27 = (f27 * f33) + (f11 * interpolation);
                f15 = f28 * f33;
                f16 = f12 * interpolation;
            }
            if (i14 != 1) {
                if (this.c) {
                    this.y.d.setAlpha(1.0f);
                } else {
                    this.y.d.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.y.c.setAlpha(f33);
            }
            this.y.e.setTranslationX(f27);
            this.y.e.setTranslationY(f28);
            this.y.e.setScaleX(f31);
            this.y.e.setScaleY(f31);
            super.dispatchDraw(canvas);
            i7 = this.h;
            float f34 = 0.045714285f;
            if (i7 != 1 || this.y.c.H) {
                l0 l0Var6 = this.y;
                f17 = l0Var6.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        l0Var6.g = f17 + 0.045714285f;
                    } else {
                        l0Var6.g = f17 + 0.07272727f;
                    }
                    if (l0Var6.g > 1.0f) {
                        l0Var6.g = 1.0f;
                    }
                }
            }
            if (i7 != 2) {
                l0 l0Var7 = this.y;
                if (!l0Var7.u || i7 != 0) {
                    if (i7 != 1) {
                        j0 j0Var = l0Var7.c;
                        if (j0Var.H) {
                            if (j0Var.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        j0 j0Var2 = this.y.b;
                        if (j0Var2.H) {
                            if (j0Var2.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                    }
                    if (!this.y.x.isEmpty()) {
                        j0 j0Var3 = this.y.b;
                        if (j0Var3.H) {
                            oh0 B = j0Var3.getImageReceiver().B();
                            int i15 = 0;
                            while (i15 < this.y.x.size()) {
                                k0 k0Var = (k0) this.y.x.get(i15);
                                float f35 = k0Var.c;
                                if (B != null && B.l0) {
                                    float r10 = this.y.b.getImageReceiver().B().r();
                                }
                                float f36 = k0Var.d;
                                if (f36 != 1.0f) {
                                    float f37 = f36 + f10;
                                    k0Var.d = f37;
                                    if (f37 > 1.0f) {
                                        k0Var.d = 1.0f;
                                        this.y.x.remove(i15);
                                        i15--;
                                        f19 = f34;
                                        r92 = l0Var;
                                        i15++;
                                        l0Var = r92;
                                        f34 = f19;
                                    }
                                }
                                if (f35 < 0.5f) {
                                    y10 = f35 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    y10 = f3.y(f35, 0.5f, 0.5f, 1.0f);
                                }
                                float f38 = (f20 - f35) * 0.5f;
                                float f39 = (k0Var.f * f35) + f38;
                                float f40 = ((k0Var.g * f35) + f38) - (k0Var.e * y10);
                                float f41 = (1.0f - k0Var.d) * k0Var.h * f35;
                                float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f39) + this.y.b.getX();
                                float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f40) + this.y.b.getY();
                                int L2 = org.telegram.messenger.g0.L(16.0f);
                                float f42 = L2;
                                float f43 = f42 / 2.0f;
                                f19 = f34;
                                ((k0) this.y.x.get(i15)).a.y0(scaleX - f43, scaleY - f43, f42, f42);
                                ((k0) this.y.x.get(i15)).a.J0(L2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, k0Var.l);
                                canvas.scale(f41, f41, scaleX, scaleY);
                                canvas.rotate(k0Var.j, scaleX, scaleY);
                                r92 = l0Var;
                                ((k0) this.y.x.get(i15)).a.h(canvas, r92);
                                canvas.restore();
                                float f44 = k0Var.c;
                                if (f44 < 1.0f) {
                                    float f45 = f44 + f19;
                                    k0Var.c = f45;
                                    if (f45 > 1.0f) {
                                        k0Var.c = 1.0f;
                                    }
                                }
                                if (f35 >= 1.0f) {
                                    k0Var.l = a8.p0.f(org.telegram.messenger.g0.L(20.0f), 16.0f, 500.0f, k0Var.l);
                                }
                                if (k0Var.k) {
                                    float f46 = k0Var.j;
                                    float f47 = k0Var.i;
                                    float f48 = (f47 / 250.0f) + f46;
                                    k0Var.j = f48;
                                    if (f48 > f47) {
                                        k0Var.k = false;
                                    }
                                } else {
                                    float f49 = k0Var.j;
                                    float f50 = k0Var.i;
                                    float f51 = f49 - (f50 / 250.0f);
                                    k0Var.j = f51;
                                    if (f51 < (-f50)) {
                                        k0Var.k = true;
                                    }
                                }
                                i15++;
                                l0Var = r92;
                                f34 = f19;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            l0 l0Var8 = this.y;
            f21 = l0Var8.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    l0Var8.h = 1.0f;
                } else {
                    l0Var8.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (l0Var8.h > f18) {
                    if (!this.c || i16 != 2) {
                        l0.g();
                    } else if (!l0Var8.A) {
                        l0Var8.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        l0 l0Var9 = this.y.f;
                        l0Var9.z = true;
                        l0Var9.s = true;
                        l0Var9.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new ai.k0(this, 5));
                    }
                }
                l0 l0Var10 = this.y;
                if (l0Var10.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof r1) {
                            ((r1) view2).O.b(l0Var10.p);
                        } else if (view2 instanceof v0) {
                            ((v0) view2).F0.b(l0Var10.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        l0.C = l0Var;
                    } else {
                        l0.B = l0Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof r1) && ((r1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        org.telegram.messenger.g0.g3(new Runnable(this) { // from class: ch.h0
                            public final /* synthetic */ i0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        this.b.y.c();
                                        break;
                                    default:
                                        this.b.y.c();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (!this.y.x.isEmpty()) {
            }
            invalidate();
        }
        f31 = (this.r * f30) + (f32 * f13);
        f27 = (f11 * f13) + (this.s * f30);
        f15 = (1.0f - f14) * this.w;
        f16 = f12 * f14;
        f28 = f15 + f16;
        if (i14 != 1) {
        }
        if (this.h == 0) {
            this.y.c.setAlpha(f33);
        }
        this.y.e.setTranslationX(f27);
        this.y.e.setTranslationY(f28);
        this.y.e.setScaleX(f31);
        this.y.e.setScaleY(f31);
        super.dispatchDraw(canvas);
        i7 = this.h;
        float f342 = 0.045714285f;
        if (i7 != 1) {
        }
        l0 l0Var62 = this.y;
        f17 = l0Var62.g;
        if (f17 != 1.0f) {
        }
        if (i7 != 2) {
        }
        f18 = 0.7f;
        l0 l0Var82 = this.y;
        f21 = l0Var82.h;
        if (f21 != 1.0f) {
        }
        if (!this.y.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            l0 l0Var = this.y;
            if (i7 >= l0Var.x.size()) {
                return;
            }
            ((k0) l0Var.x.get(i7)).a.P();
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            l0 l0Var = this.y;
            if (i7 >= l0Var.x.size()) {
                return;
            }
            ((k0) l0Var.x.get(i7)).a.R();
            i7++;
        }
    }
}
