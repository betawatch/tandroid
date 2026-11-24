// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a19 extends FrameLayout {
    public final /* synthetic */ d a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ mu1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ h19 x;
    public final /* synthetic */ d19 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a19(d19 d19Var, Context context, d dVar, View view, boolean z, k27 k27Var, mu1 mu1Var, int i, int i2, boolean z2, float f, float f2, float f3, h19 h19Var) {
        super(context);
        this.y = d19Var;
        this.a = dVar;
        this.b = view;
        this.c = z;
        this.d = k27Var;
        this.e = mu1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = h19Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0317, code lost:
    
        if (r5.c.H != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0361, code lost:
    
        if (r24.y.c.getImageReceiver().y().l0 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) <= 2000) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0529, code lost:
    
        if (((int) de9.x(r24.y.b.getImageReceiver().y().b0, r24.y.b.getImageReceiver().y().e[0], r8, r8)) < r5.b) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03a3, code lost:
    
        if (r24.y.b.getImageReceiver().y().l0 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03b8, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r24.y.y) > 2000) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Type inference failed for: r4v42, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r9v17, types: [il5] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        float f;
        float f2;
        float f3;
        d19 d19Var;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        d19 d19Var2;
        float f8;
        float f9;
        float f10;
        float f11;
        ?? r9;
        float f12;
        float x;
        float f13;
        float f14;
        f19 f19Var;
        int paddingTop;
        mu1 mu1Var;
        k27 messageObject;
        d19 d19Var3 = this.y;
        final byte b = 0;
        if (d19Var3.l) {
            float f15 = d19Var3.m;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                d19Var3.m = f16;
                if (f16 > 1.0f) {
                    d19Var3.m = 1.0f;
                    gl.d3(new Runnable(this) { // from class: z09
                        public final /* synthetic */ a19 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            a19 a19Var = this.b;
                            switch (b2) {
                                case 0:
                                    a19Var.y.c();
                                    break;
                                default:
                                    a19Var.y.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f17 = this.y.m;
            if (f17 != 1.0f) {
                setAlpha(1.0f - f17);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!d19Var3.s) {
            invalidate();
            return;
        }
        r09 r09Var = d19Var3.t;
        if (r09Var != null) {
            r09Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        d dVar = this.a;
        if (dVar instanceof mu1) {
            mu1 mu1Var2 = (mu1) dVar;
            int i2 = this.y.n;
            jq1 jq1Var = mu1Var2.A0;
            if (jq1Var != null) {
                int childCount = jq1Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    view = mu1Var2.A0.getChildAt(i3);
                    if (view instanceof gb2) {
                        messageObject = ((gb2) view).getMessageObject();
                    } else if (view instanceof uk1) {
                        messageObject = ((uk1) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.e1() == i2) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        float L = this.c ? gl.L(gba.j() ? 120.0f : 50.0f) : this.d != null ? gl.L(20.0f) : gl.L(14.0f);
        final byte b2 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            d19 d19Var4 = this.y;
            int[] iArr = d19Var4.j;
            f2 = iArr[0];
            f3 = iArr[1];
            if (view instanceof gb2) {
                gb2 gb2Var = (gb2) view;
                f = 0.10666667f;
                f19Var = gb2Var.O.k(d19Var4.p);
                if (gb2Var.K && !gb2Var.I3()) {
                    f3 += gl.L(2.0f);
                }
                paddingTop = gb2Var.getPaddingTop();
            } else {
                f = 0.10666667f;
                if (view instanceof uk1) {
                    f19Var = ((uk1) view).F0.k(d19Var4.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof t75) {
                        f2 += ((t75) view).getReactionCenterX();
                        f3 += view.getMeasuredHeight() / 2.0f;
                    }
                    f19Var = null;
                    if (f19Var != null) {
                        Rect rect = f19Var.s;
                        f2 += rect.left;
                        f3 += rect.top;
                    }
                    mu1Var = this.e;
                    if (mu1Var != null) {
                        f3 += mu1Var.Wa;
                    }
                    d19 d19Var5 = this.y;
                    d19Var5.q = f2;
                    d19Var5.r = f3;
                }
            }
            f3 += paddingTop;
            if (f19Var != null) {
            }
            mu1Var = this.e;
            if (mu1Var != null) {
            }
            d19 d19Var52 = this.y;
            d19Var52.q = f2;
            d19Var52.r = f3;
        } else {
            f = 0.10666667f;
            if (this.c) {
                float f18 = L / 2.0f;
                f2 = (getMeasuredWidth() / 2.0f) - f18;
                f3 = (getMeasuredHeight() / 2.0f) - f18;
            } else {
                d19 d19Var6 = this.y;
                f2 = d19Var6.q;
                f3 = d19Var6.r;
            }
        }
        d dVar2 = this.a;
        if (dVar2 != null && dVar2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof t75)) {
            return;
        }
        boolean z = view instanceof t75;
        int i4 = this.f;
        float f19 = (z ? i4 : i4 - L) / 2.0f;
        float f20 = f2 - f19;
        float f21 = f3 - f19;
        if (this.c && this.h == 0) {
            f20 += gl.L(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f22 = this.y.j[0];
            if (f20 < f22) {
                f20 = f22;
            }
            if (this.f + f20 > getMeasuredWidth() + r12) {
                f20 = (getMeasuredWidth() + this.y.j[0]) - this.f;
            }
        }
        s33 s33Var = s33.f;
        float interpolation = s33Var.getInterpolation(this.y.h);
        if (this.h == 2) {
            f4 = s33.h.getInterpolation(interpolation);
            f5 = s33Var.getInterpolation(interpolation);
            d19Var = null;
        } else if (this.n) {
            d19Var = null;
            f4 = s33.h.getInterpolation(this.y.g);
            f5 = s33Var.getInterpolation(this.y.g);
        } else {
            d19Var = null;
            f4 = this.y.g;
            f5 = f4;
        }
        float f23 = 1.0f - f4;
        float f24 = (this.r * f23) + f4;
        float f25 = L / this.f;
        if (this.h == 1) {
            f24 = 1.0f;
        } else {
            f20 = (f20 * f4) + (this.s * f23);
            f21 = (f21 * f5) + ((1.0f - f5) * this.w);
        }
        this.y.b.setTranslationX(f20);
        this.y.b.setTranslationY(f21);
        float f26 = 1.0f - interpolation;
        this.y.b.setAlpha(f26);
        this.y.b.setScaleX(f24);
        this.y.b.setScaleY(f24);
        int i5 = this.h;
        if (i5 != 2) {
            if (interpolation != 0.0f) {
                f24 = (f24 * f26) + (f25 * interpolation);
                f20 = (f20 * f26) + (f2 * interpolation);
                f6 = f21 * f26;
                f7 = f3 * interpolation;
            }
            if (i5 != 1) {
                boolean z2 = this.c;
                b19 b19Var = this.y.d;
                if (z2) {
                    b19Var.setAlpha(1.0f);
                } else {
                    b19Var.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.y.c.setAlpha(f26);
            }
            this.y.e.setTranslationX(f20);
            this.y.e.setTranslationY(f21);
            this.y.e.setScaleX(f24);
            this.y.e.setScaleY(f24);
            super.dispatchDraw(canvas);
            i = this.h;
            float f27 = 0.045714285f;
            if (i != 1) {
                d19Var2 = this.y;
            }
            d19Var2 = this.y;
            f8 = d19Var2.g;
            if (f8 != 1.0f) {
                if (this.n) {
                    f9 = f8 + 0.045714285f;
                    d19Var2.g = f9;
                } else {
                    f9 = f8 + 0.07272727f;
                    d19Var2.g = f9;
                }
                if (f9 > 1.0f) {
                    d19Var2.g = 1.0f;
                }
            }
            if (i != 2 && (!d19Var2.u || i != 0)) {
                if (i != 1) {
                    b19 b19Var2 = d19Var2.c;
                    if (b19Var2.H) {
                        if (b19Var2.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g == 0) {
                    f10 = 0.7f;
                } else {
                    f10 = 0.7f;
                }
                if (this.h == 1) {
                    b19 b19Var3 = this.y.b;
                    if (b19Var3.H) {
                        if (b19Var3.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g != 0) {
                }
                if (!this.y.x.isEmpty()) {
                    b19 b19Var4 = this.y.b;
                    if (b19Var4.H) {
                        oy8 y = b19Var4.getImageReceiver().y();
                        int i6 = 0;
                        while (i6 < this.y.x.size()) {
                            c19 c19Var = (c19) this.y.x.get(i6);
                            float f28 = c19Var.c;
                            if (y != null && y.l0) {
                                float m = this.y.b.getImageReceiver().y().m();
                            }
                            float f29 = c19Var.d;
                            if (f29 != 1.0f) {
                                float f30 = f29 + f;
                                c19Var.d = f30;
                                if (f30 > 1.0f) {
                                    c19Var.d = 1.0f;
                                    this.y.x.remove(i6);
                                    i6--;
                                    f11 = f27;
                                    r9 = d19Var;
                                    i6++;
                                    d19Var = r9;
                                    f27 = f11;
                                }
                            }
                            if (f28 < 0.5f) {
                                x = f28 / 0.5f;
                                f12 = 1.0f;
                            } else {
                                f12 = 1.0f;
                                x = tb4.x(f28, 0.5f, 0.5f, 1.0f);
                            }
                            float f31 = (f12 - f28) * 0.5f;
                            float f32 = (c19Var.f * f28) + f31;
                            float f33 = ((c19Var.g * f28) + f31) - (c19Var.e * x);
                            float f34 = (1.0f - c19Var.d) * c19Var.h * f28;
                            float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f32) + this.y.b.getX();
                            float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f33) + this.y.b.getY();
                            int L2 = gl.L(16.0f);
                            float f35 = L2;
                            float f36 = f35 / 2.0f;
                            f11 = f27;
                            ((c19) this.y.x.get(i6)).a.i0(scaleX - f36, scaleY - f36, f35, f35);
                            ((c19) this.y.x.get(i6)).a.q0(L2 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, c19Var.l);
                            canvas.scale(f34, f34, scaleX, scaleY);
                            canvas.rotate(c19Var.j, scaleX, scaleY);
                            r9 = d19Var;
                            ((c19) this.y.x.get(i6)).a.h(canvas, r9);
                            canvas.restore();
                            float f37 = c19Var.c;
                            if (f37 < 1.0f) {
                                float f38 = f37 + f11;
                                c19Var.c = f38;
                                if (f38 > 1.0f) {
                                    c19Var.c = 1.0f;
                                }
                            }
                            if (f28 >= 1.0f) {
                                c19Var.l = ls6.d(gl.L(20.0f), 16.0f, 500.0f, c19Var.l);
                            }
                            boolean z3 = c19Var.k;
                            float f39 = c19Var.j;
                            float f40 = c19Var.i;
                            if (z3) {
                                float f41 = (f40 / 250.0f) + f39;
                                c19Var.j = f41;
                                if (f41 > f40) {
                                    c19Var.k = false;
                                }
                            } else {
                                float f42 = f39 - (f40 / 250.0f);
                                c19Var.j = f42;
                                if (f42 < (-f40)) {
                                    c19Var.k = true;
                                }
                            }
                            i6++;
                            d19Var = r9;
                            f27 = f11;
                        }
                    }
                }
                invalidate();
            }
            f10 = 0.7f;
            d19 d19Var7 = this.y;
            f13 = d19Var7.h;
            if (f13 != 1.0f) {
                int i7 = this.h;
                if (i7 == 1) {
                    d19Var7.h = 1.0f;
                    f14 = 1.0f;
                } else {
                    f14 = f13 + (16.0f / (i7 == 2 ? 350.0f : 220.0f));
                    d19Var7.h = f14;
                }
                if (f14 > f10) {
                    if (!this.c || i7 != 2) {
                        d19.g();
                    } else if (!d19Var7.A) {
                        d19Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        d19 d19Var8 = this.y.f;
                        d19Var8.z = true;
                        d19Var8.s = true;
                        d19Var8.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new l48(this, (byte) 28));
                    }
                }
                d19 d19Var9 = this.y;
                if (d19Var9.h >= 1.0f) {
                    int i8 = this.h;
                    if (i8 == 0 || i8 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof gb2) {
                            ((gb2) view2).O.b(d19Var9.p);
                        } else if (view2 instanceof uk1) {
                            ((uk1) view2).F0.b(d19Var9.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        d19.C = d19Var;
                    } else {
                        d19.B = d19Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof gb2) && ((gb2) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        gl.d3(new Runnable(this) { // from class: z09
                            public final /* synthetic */ a19 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                a19 a19Var = this.b;
                                switch (b22) {
                                    case 0:
                                        a19Var.y.c();
                                        break;
                                    default:
                                        a19Var.y.c();
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
        f24 = (this.r * f23) + (f25 * f4);
        f20 = (f2 * f4) + (this.s * f23);
        f6 = (1.0f - f5) * this.w;
        f7 = f3 * f5;
        f21 = f6 + f7;
        if (i5 != 1) {
        }
        if (this.h == 0) {
            this.y.c.setAlpha(f26);
        }
        this.y.e.setTranslationX(f20);
        this.y.e.setTranslationY(f21);
        this.y.e.setScaleX(f24);
        this.y.e.setScaleY(f24);
        super.dispatchDraw(canvas);
        i = this.h;
        float f272 = 0.045714285f;
        if (i != 1) {
        }
        d19Var2 = this.y;
        f8 = d19Var2.g;
        if (f8 != 1.0f) {
        }
        if (i != 2) {
            if (i != 1) {
            }
            if (this.x.g == 0) {
            }
            if (this.h == 1) {
            }
            if (this.x.g != 0) {
            }
            if (!this.y.x.isEmpty()) {
            }
            invalidate();
        }
        f10 = 0.7f;
        d19 d19Var72 = this.y;
        f13 = d19Var72.h;
        if (f13 != 1.0f) {
        }
        if (!this.y.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList = this.y.x;
        super.onAttachedToWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((c19) arrayList.get(i)).a.I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((c19) arrayList.get(i)).a.K();
        }
    }
}
