package dh;

import ai.e1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.az;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wi;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final /* synthetic */ d2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ wm e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ n0 x;
    public final /* synthetic */ j0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Context context, d2 d2Var, View view, boolean z10, zi ziVar, wm wmVar, int i3, int i10, boolean z11, float f10, float f11, float f12, n0 n0Var) {
        super(context);
        this.y = j0Var;
        this.a = d2Var;
        this.b = view;
        this.c = z10;
        this.d = ziVar;
        this.e = wmVar;
        this.f = i3;
        this.h = i10;
        this.n = z11;
        this.r = f10;
        this.s = f11;
        this.w = f12;
        this.x = n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0373, code lost:
    
        if (r24.y.c.getImageReceiver().B().l0 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038d, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0539, code lost:
    
        if (((int) org.telegram.messenger.camera.q.v(r24.y.b.getImageReceiver().B().b0, r24.y.b.getImageReceiver().B().e[0], r8, r8)) < r6.b) goto L260;
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
    /* JADX WARN: Type inference failed for: r9v17, types: [org.telegram.messenger.bc] */
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
        j0 j0Var;
        float f13;
        float f14;
        float f15;
        float f16;
        int i3;
        float f17;
        float f18;
        float f19;
        ?? r9;
        float f20;
        float y9;
        float f21;
        l0 l0Var;
        int paddingTop;
        wm wmVar;
        zi messageObject;
        j0 j0Var2 = this.y;
        final int i10 = 0;
        if (j0Var2.l) {
            float f22 = j0Var2.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                j0Var2.m = f23;
                if (f23 > 1.0f) {
                    j0Var2.m = 1.0f;
                    org.telegram.messenger.g0.h3(new Runnable(this) { // from class: dh.f0
                        public final /* synthetic */ g0 b;

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
        if (!j0Var2.s) {
            invalidate();
            return;
        }
        ji0 ji0Var = j0Var2.t;
        if (ji0Var != null) {
            ji0Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        d2 d2Var = this.a;
        if (d2Var instanceof wm) {
            wm wmVar2 = (wm) d2Var;
            int i11 = this.y.n;
            wi wiVar = wmVar2.A0;
            if (wiVar != null) {
                int childCount = wiVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    view = wmVar2.A0.getChildAt(i12);
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
        float L = this.c ? org.telegram.messenger.g0.L(az.j() ? 120.0f : 50.0f) : this.d != null ? org.telegram.messenger.g0.L(20.0f) : org.telegram.messenger.g0.L(14.0f);
        final int i13 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            j0 j0Var3 = this.y;
            int[] iArr = j0Var3.j;
            f11 = iArr[0];
            f12 = iArr[1];
            if (view instanceof q1) {
                q1 q1Var = (q1) view;
                f10 = 0.10666667f;
                l0Var = q1Var.O.k(j0Var3.p);
                if (q1Var.K && !q1Var.D3()) {
                    f12 += org.telegram.messenger.g0.L(2.0f);
                }
                paddingTop = q1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (view instanceof t0) {
                    l0Var = ((t0) view).F0.k(j0Var3.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof oh.c) {
                        f11 += ((oh.c) view).getReactionCenterX();
                        f12 += view.getMeasuredHeight() / 2.0f;
                    }
                    l0Var = null;
                    if (l0Var != null) {
                        Rect rect = l0Var.s;
                        f11 += rect.left;
                        f12 += rect.top;
                    }
                    wmVar = this.e;
                    if (wmVar != null) {
                        f12 += wmVar.Ta;
                    }
                    j0 j0Var4 = this.y;
                    j0Var4.q = f11;
                    j0Var4.r = f12;
                }
            }
            f12 += paddingTop;
            if (l0Var != null) {
            }
            wmVar = this.e;
            if (wmVar != null) {
            }
            j0 j0Var42 = this.y;
            j0Var42.q = f11;
            j0Var42.r = f12;
        } else {
            f10 = 0.10666667f;
            if (this.c) {
                float f25 = L / 2.0f;
                f11 = (getMeasuredWidth() / 2.0f) - f25;
                f12 = (getMeasuredHeight() / 2.0f) - f25;
            } else {
                j0 j0Var5 = this.y;
                f11 = j0Var5.q;
                f12 = j0Var5.r;
            }
        }
        d2 d2Var2 = this.a;
        if (d2Var2 != null && d2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof oh.c)) {
            return;
        }
        float f26 = (view instanceof oh.c ? this.f : this.f - L) / 2.0f;
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
            j0Var = null;
        } else if (this.n) {
            j0Var = null;
            f13 = xq.h.getInterpolation(this.y.g);
            f14 = xqVar.getInterpolation(this.y.g);
        } else {
            j0Var = null;
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
            i3 = this.h;
            float f34 = 0.045714285f;
            if (i3 != 1 || this.y.c.H) {
                j0 j0Var6 = this.y;
                f17 = j0Var6.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        j0Var6.g = f17 + 0.045714285f;
                    } else {
                        j0Var6.g = f17 + 0.07272727f;
                    }
                    if (j0Var6.g > 1.0f) {
                        j0Var6.g = 1.0f;
                    }
                }
            }
            if (i3 != 2) {
                j0 j0Var7 = this.y;
                if (!j0Var7.u || i3 != 0) {
                    if (i3 != 1) {
                        h0 h0Var = j0Var7.c;
                        if (h0Var.H) {
                            if (h0Var.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        h0 h0Var2 = this.y.b;
                        if (h0Var2.H) {
                            if (h0Var2.getImageReceiver().B() != null) {
                            }
                        }
                    }
                    if (this.x.g != 0) {
                    }
                    if (!this.y.x.isEmpty()) {
                        h0 h0Var3 = this.y.b;
                        if (h0Var3.H) {
                            ch0 B = h0Var3.getImageReceiver().B();
                            int i15 = 0;
                            while (i15 < this.y.x.size()) {
                                i0 i0Var = (i0) this.y.x.get(i15);
                                float f35 = i0Var.c;
                                if (B != null && B.l0) {
                                    float r5 = this.y.b.getImageReceiver().B().r();
                                }
                                float f36 = i0Var.d;
                                if (f36 != 1.0f) {
                                    float f37 = f36 + f10;
                                    i0Var.d = f37;
                                    if (f37 > 1.0f) {
                                        i0Var.d = 1.0f;
                                        this.y.x.remove(i15);
                                        i15--;
                                        f19 = f34;
                                        r9 = j0Var;
                                        i15++;
                                        j0Var = r9;
                                        f34 = f19;
                                    }
                                }
                                if (f35 < 0.5f) {
                                    y9 = f35 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    y9 = k5.y(f35, 0.5f, 0.5f, 1.0f);
                                }
                                float f38 = (f20 - f35) * 0.5f;
                                float f39 = (i0Var.f * f35) + f38;
                                float f40 = ((i0Var.g * f35) + f38) - (i0Var.e * y9);
                                float f41 = (1.0f - i0Var.d) * i0Var.h * f35;
                                float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f39) + this.y.b.getX();
                                float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f40) + this.y.b.getY();
                                int L2 = org.telegram.messenger.g0.L(16.0f);
                                float f42 = L2;
                                float f43 = f42 / 2.0f;
                                f19 = f34;
                                ((i0) this.y.x.get(i15)).a.y0(scaleX - f43, scaleY - f43, f42, f42);
                                ((i0) this.y.x.get(i15)).a.J0(L2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, i0Var.l);
                                canvas.scale(f41, f41, scaleX, scaleY);
                                canvas.rotate(i0Var.j, scaleX, scaleY);
                                r9 = j0Var;
                                ((i0) this.y.x.get(i15)).a.h(canvas, r9);
                                canvas.restore();
                                float f44 = i0Var.c;
                                if (f44 < 1.0f) {
                                    float f45 = f44 + f19;
                                    i0Var.c = f45;
                                    if (f45 > 1.0f) {
                                        i0Var.c = 1.0f;
                                    }
                                }
                                if (f35 >= 1.0f) {
                                    i0Var.l = a1.g.e(org.telegram.messenger.g0.L(20.0f), 16.0f, 500.0f, i0Var.l);
                                }
                                if (i0Var.k) {
                                    float f46 = i0Var.j;
                                    float f47 = i0Var.i;
                                    float f48 = (f47 / 250.0f) + f46;
                                    i0Var.j = f48;
                                    if (f48 > f47) {
                                        i0Var.k = false;
                                    }
                                } else {
                                    float f49 = i0Var.j;
                                    float f50 = i0Var.i;
                                    float f51 = f49 - (f50 / 250.0f);
                                    i0Var.j = f51;
                                    if (f51 < (-f50)) {
                                        i0Var.k = true;
                                    }
                                }
                                i15++;
                                j0Var = r9;
                                f34 = f19;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            j0 j0Var8 = this.y;
            f21 = j0Var8.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    j0Var8.h = 1.0f;
                } else {
                    j0Var8.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (j0Var8.h > f18) {
                    if (!this.c || i16 != 2) {
                        j0.g();
                    } else if (!j0Var8.A) {
                        j0Var8.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        j0 j0Var9 = this.y.f;
                        j0Var9.z = true;
                        j0Var9.s = true;
                        j0Var9.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new e1(this, 6));
                    }
                }
                j0 j0Var10 = this.y;
                if (j0Var10.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof q1) {
                            ((q1) view2).O.b(j0Var10.p);
                        } else if (view2 instanceof t0) {
                            ((t0) view2).F0.b(j0Var10.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        j0.C = j0Var;
                    } else {
                        j0.B = j0Var;
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
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: dh.f0
                            public final /* synthetic */ g0 b;

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
        i3 = this.h;
        float f342 = 0.045714285f;
        if (i3 != 1) {
        }
        j0 j0Var62 = this.y;
        f17 = j0Var62.g;
        if (f17 != 1.0f) {
        }
        if (i3 != 2) {
        }
        f18 = 0.7f;
        j0 j0Var82 = this.y;
        f21 = j0Var82.h;
        if (f21 != 1.0f) {
        }
        if (!this.y.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = 0;
        while (true) {
            j0 j0Var = this.y;
            if (i3 >= j0Var.x.size()) {
                return;
            }
            ((i0) j0Var.x.get(i3)).a.P();
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            j0 j0Var = this.y;
            if (i3 >= j0Var.x.size()) {
                return;
            }
            ((i0) j0Var.x.get(i3)).a.R();
            i3++;
        }
    }
}
