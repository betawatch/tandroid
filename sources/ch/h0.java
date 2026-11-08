package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.t5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.aj;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h0 extends FrameLayout {
    public final /* synthetic */ f2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ an e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ o0 x;
    public final /* synthetic */ k0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Context context, f2 f2Var, View view, boolean z9, ij ijVar, an anVar, int i7, int i10, boolean z10, float f10, float f11, float f12, o0 o0Var) {
        super(context);
        this.y = k0Var;
        this.a = f2Var;
        this.b = view;
        this.c = z9;
        this.d = ijVar;
        this.e = anVar;
        this.f = i7;
        this.h = i10;
        this.n = z10;
        this.r = f10;
        this.s = f11;
        this.w = f12;
        this.x = o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0373, code lost:
    
        if (r24.y.c.getImageReceiver().B().k0 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038d, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0539, code lost:
    
        if (((int) org.telegram.messenger.camera.q.v(r24.y.b.getImageReceiver().B().a0, r24.y.b.getImageReceiver().B().e[0], r8, r8)) < r6.b) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03b5, code lost:
    
        if (r24.y.b.getImageReceiver().B().k0 == false) goto L197;
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
    /* JADX WARN: Type inference failed for: r9v17, types: [org.telegram.messenger.ic] */
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
        k0 k0Var;
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
        m0 m0Var;
        int paddingTop;
        an anVar;
        ij messageObject;
        k0 k0Var2 = this.y;
        final int i10 = 0;
        if (k0Var2.l) {
            float f22 = k0Var2.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                k0Var2.m = f23;
                if (f23 > 1.0f) {
                    k0Var2.m = 1.0f;
                    org.telegram.messenger.g0.h3(new Runnable(this) { // from class: ch.g0
                        public final /* synthetic */ h0 b;

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
        if (!k0Var2.s) {
            invalidate();
            return;
        }
        gi0 gi0Var = k0Var2.t;
        if (gi0Var != null) {
            gi0Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        f2 f2Var = this.a;
        if (f2Var instanceof an) {
            an anVar2 = (an) f2Var;
            int i11 = this.y.n;
            aj ajVar = anVar2.z0;
            if (ajVar != null) {
                int childCount = ajVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    view = anVar2.z0.getChildAt(i12);
                    if (view instanceof q1) {
                        messageObject = ((q1) view).getMessageObject();
                    } else if (view instanceof t0) {
                        messageObject = ((t0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.f1() == i11) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        float L = this.c ? org.telegram.messenger.g0.L(iz.j() ? 120.0f : 50.0f) : this.d != null ? org.telegram.messenger.g0.L(20.0f) : org.telegram.messenger.g0.L(14.0f);
        final int i13 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            k0 k0Var3 = this.y;
            int[] iArr = k0Var3.j;
            f11 = iArr[0];
            f12 = iArr[1];
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                f10 = 0.10666667f;
                m0Var = q1Var.N.k(k0Var3.p);
                if (q1Var.J && !q1Var.F3()) {
                    f12 += org.telegram.messenger.g0.L(2.0f);
                }
                paddingTop = q1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (view instanceof t0) {
                    m0Var = ((t0) view).E0.k(k0Var3.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof nh.c) {
                        f11 += ((nh.c) view).getReactionCenterX();
                        f12 += view.getMeasuredHeight() / 2.0f;
                    }
                    m0Var = null;
                    if (m0Var != null) {
                        Rect rect = m0Var.s;
                        f11 += rect.left;
                        f12 += rect.top;
                    }
                    anVar = this.e;
                    if (anVar != null) {
                        f12 += anVar.Sa;
                    }
                    k0 k0Var4 = this.y;
                    k0Var4.q = f11;
                    k0Var4.r = f12;
                }
            }
            f12 += paddingTop;
            if (m0Var != null) {
            }
            anVar = this.e;
            if (anVar != null) {
            }
            k0 k0Var42 = this.y;
            k0Var42.q = f11;
            k0Var42.r = f12;
        } else {
            f10 = 0.10666667f;
            if (this.c) {
                float f25 = L / 2.0f;
                f11 = (getMeasuredWidth() / 2.0f) - f25;
                f12 = (getMeasuredHeight() / 2.0f) - f25;
            } else {
                k0 k0Var5 = this.y;
                f11 = k0Var5.q;
                f12 = k0Var5.r;
            }
        }
        f2 f2Var2 = this.a;
        if (f2Var2 != null && f2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
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
        xq xqVar = xq.f;
        float interpolation = xqVar.getInterpolation(this.y.h);
        if (this.h == 2) {
            f13 = xq.h.getInterpolation(interpolation);
            f14 = xqVar.getInterpolation(interpolation);
            k0Var = null;
        } else if (this.n) {
            k0Var = null;
            f13 = xq.h.getInterpolation(this.y.g);
            f14 = xqVar.getInterpolation(this.y.g);
        } else {
            k0Var = null;
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
            if (i7 != 1 || this.y.c.G) {
                k0 k0Var6 = this.y;
                f17 = k0Var6.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        k0Var6.g = f17 + 0.045714285f;
                    } else {
                        k0Var6.g = f17 + 0.07272727f;
                    }
                    if (k0Var6.g > 1.0f) {
                        k0Var6.g = 1.0f;
                    }
                }
            }
            if (i7 != 2) {
                k0 k0Var7 = this.y;
                if (!k0Var7.u || i7 != 0) {
                    if (i7 != 1) {
                        i0 i0Var = k0Var7.c;
                        if (i0Var.G) {
                            if (i0Var.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        i0 i0Var2 = this.y.b;
                        if (i0Var2.G) {
                            if (i0Var2.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                    }
                    if (!this.y.x.isEmpty()) {
                        i0 i0Var3 = this.y.b;
                        if (i0Var3.G) {
                            zg0 B = i0Var3.getImageReceiver().B();
                            int i15 = 0;
                            while (i15 < this.y.x.size()) {
                                j0 j0Var = (j0) this.y.x.get(i15);
                                float f35 = j0Var.c;
                                if (B != null && B.k0) {
                                    float r10 = this.y.b.getImageReceiver().B().r();
                                }
                                float f36 = j0Var.d;
                                if (f36 != 1.0f) {
                                    float f37 = f36 + f10;
                                    j0Var.d = f37;
                                    if (f37 > 1.0f) {
                                        j0Var.d = 1.0f;
                                        this.y.x.remove(i15);
                                        i15--;
                                        f19 = f34;
                                        r92 = k0Var;
                                        i15++;
                                        k0Var = r92;
                                        f34 = f19;
                                    }
                                }
                                if (f35 < 0.5f) {
                                    y10 = f35 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    y10 = k5.y(f35, 0.5f, 0.5f, 1.0f);
                                }
                                float f38 = (f20 - f35) * 0.5f;
                                float f39 = (j0Var.f * f35) + f38;
                                float f40 = ((j0Var.g * f35) + f38) - (j0Var.e * y10);
                                float f41 = (1.0f - j0Var.d) * j0Var.h * f35;
                                float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f39) + this.y.b.getX();
                                float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f40) + this.y.b.getY();
                                int L2 = org.telegram.messenger.g0.L(16.0f);
                                float f42 = L2;
                                float f43 = f42 / 2.0f;
                                f19 = f34;
                                ((j0) this.y.x.get(i15)).a.y0(scaleX - f43, scaleY - f43, f42, f42);
                                ((j0) this.y.x.get(i15)).a.J0(L2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, j0Var.l);
                                canvas.scale(f41, f41, scaleX, scaleY);
                                canvas.rotate(j0Var.j, scaleX, scaleY);
                                r92 = k0Var;
                                ((j0) this.y.x.get(i15)).a.h(canvas, r92);
                                canvas.restore();
                                float f44 = j0Var.c;
                                if (f44 < 1.0f) {
                                    float f45 = f44 + f19;
                                    j0Var.c = f45;
                                    if (f45 > 1.0f) {
                                        j0Var.c = 1.0f;
                                    }
                                }
                                if (f35 >= 1.0f) {
                                    j0Var.l = a8.p0.f(org.telegram.messenger.g0.L(20.0f), 16.0f, 500.0f, j0Var.l);
                                }
                                if (j0Var.k) {
                                    float f46 = j0Var.j;
                                    float f47 = j0Var.i;
                                    float f48 = (f47 / 250.0f) + f46;
                                    j0Var.j = f48;
                                    if (f48 > f47) {
                                        j0Var.k = false;
                                    }
                                } else {
                                    float f49 = j0Var.j;
                                    float f50 = j0Var.i;
                                    float f51 = f49 - (f50 / 250.0f);
                                    j0Var.j = f51;
                                    if (f51 < (-f50)) {
                                        j0Var.k = true;
                                    }
                                }
                                i15++;
                                k0Var = r92;
                                f34 = f19;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            k0 k0Var8 = this.y;
            f21 = k0Var8.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    k0Var8.h = 1.0f;
                } else {
                    k0Var8.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (k0Var8.h > f18) {
                    if (!this.c || i16 != 2) {
                        k0.g();
                    } else if (!k0Var8.A) {
                        k0Var8.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        k0 k0Var9 = this.y.f;
                        k0Var9.z = true;
                        k0Var9.s = true;
                        k0Var9.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new t5(this, 5));
                    }
                }
                k0 k0Var10 = this.y;
                if (k0Var10.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof q1) {
                            ((q1) view2).N.b(k0Var10.p);
                        } else if (view2 instanceof t0) {
                            ((t0) view2).E0.b(k0Var10.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        k0.C = k0Var;
                    } else {
                        k0.B = k0Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof q1) && ((q1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: ch.g0
                            public final /* synthetic */ h0 b;

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
        k0 k0Var62 = this.y;
        f17 = k0Var62.g;
        if (f17 != 1.0f) {
        }
        if (i7 != 2) {
        }
        f18 = 0.7f;
        k0 k0Var82 = this.y;
        f21 = k0Var82.h;
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
            k0 k0Var = this.y;
            if (i7 >= k0Var.x.size()) {
                return;
            }
            ((j0) k0Var.x.get(i7)).a.P();
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            k0 k0Var = this.y;
            if (i7 >= k0Var.x.size()) {
                return;
            }
            ((j0) k0Var.x.get(i7)).a.R();
            i7++;
        }
    }
}
