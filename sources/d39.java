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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d39 extends FrameLayout {
    public final /* synthetic */ d a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ yv1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float w;
    public final /* synthetic */ k39 x;
    public final /* synthetic */ g39 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d39(g39 g39Var, Context context, d dVar, View view, boolean z, k47 k47Var, yv1 yv1Var, int i, int i2, boolean z2, float f, float f2, float f3, k39 k39Var) {
        super(context);
        this.y = g39Var;
        this.a = dVar;
        this.b = view;
        this.c = z;
        this.d = k47Var;
        this.e = yv1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = k39Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0528, code lost:
    
        if (((int) hg9.x(r24.y.b.getImageReceiver().y().b0, r24.y.b.getImageReceiver().y().e[0], r8, r8)) < r5.b) goto L257;
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
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Type inference failed for: r4v42, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r9v17, types: [in5] */
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
        g39 g39Var;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        g39 g39Var2;
        float f8;
        float f9;
        float f10;
        float f11;
        ?? r9;
        float f12;
        float y;
        float f13;
        float f14;
        i39 i39Var;
        int paddingTop;
        yv1 yv1Var;
        k47 messageObject;
        g39 g39Var3 = this.y;
        final byte b = 0;
        if (g39Var3.l) {
            float f15 = g39Var3.m;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                g39Var3.m = f16;
                if (f16 > 1.0f) {
                    g39Var3.m = 1.0f;
                    gm.c3(new Runnable(this) { // from class: b39
                        public final /* synthetic */ d39 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            d39 d39Var = this.b;
                            switch (b2) {
                                case 0:
                                    d39Var.y.c();
                                    break;
                                default:
                                    d39Var.y.c();
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
        if (!g39Var3.s) {
            invalidate();
            return;
        }
        t29 t29Var = g39Var3.t;
        if (t29Var != null) {
            t29Var.a.setAlpha(0.0f);
            this.y.t.c.setAlpha(0.0f);
        }
        d dVar = this.a;
        if (dVar instanceof yv1) {
            yv1 yv1Var2 = (yv1) dVar;
            int i2 = this.y.n;
            vr1 vr1Var = yv1Var2.A0;
            if (vr1Var != null) {
                int childCount = vr1Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    view = yv1Var2.A0.getChildAt(i3);
                    if (view instanceof rc2) {
                        messageObject = ((rc2) view).getMessageObject();
                    } else if (view instanceof cm1) {
                        messageObject = ((cm1) view).getMessageObject();
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
        float L = this.c ? gm.L(gda.j() ? 120.0f : 50.0f) : this.d != null ? gm.L(20.0f) : gm.L(14.0f);
        final byte b2 = 1;
        if (view != null) {
            view.getLocationInWindow(this.y.j);
            g39 g39Var4 = this.y;
            int[] iArr = g39Var4.j;
            f2 = iArr[0];
            f3 = iArr[1];
            if (view instanceof rc2) {
                rc2 rc2Var = (rc2) view;
                f = 0.10666667f;
                i39Var = rc2Var.O.k(g39Var4.p);
                if (rc2Var.K && !rc2Var.I3()) {
                    f3 += gm.L(2.0f);
                }
                paddingTop = rc2Var.getPaddingTop();
            } else {
                f = 0.10666667f;
                if (view instanceof cm1) {
                    i39Var = ((cm1) view).F0.k(g39Var4.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof s95) {
                        f2 += ((s95) view).getReactionCenterX();
                        f3 += view.getMeasuredHeight() / 2.0f;
                    }
                    i39Var = null;
                    if (i39Var != null) {
                        Rect rect = i39Var.s;
                        f2 += rect.left;
                        f3 += rect.top;
                    }
                    yv1Var = this.e;
                    if (yv1Var != null) {
                        f3 += yv1Var.Wa;
                    }
                    g39 g39Var5 = this.y;
                    g39Var5.q = f2;
                    g39Var5.r = f3;
                }
            }
            f3 += paddingTop;
            if (i39Var != null) {
            }
            yv1Var = this.e;
            if (yv1Var != null) {
            }
            g39 g39Var52 = this.y;
            g39Var52.q = f2;
            g39Var52.r = f3;
        } else {
            f = 0.10666667f;
            if (this.c) {
                float f18 = L / 2.0f;
                f2 = (getMeasuredWidth() / 2.0f) - f18;
                f3 = (getMeasuredHeight() / 2.0f) - f18;
            } else {
                g39 g39Var6 = this.y;
                f2 = g39Var6.q;
                f3 = g39Var6.r;
            }
        }
        d dVar2 = this.a;
        if (dVar2 != null && dVar2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.y.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof s95)) {
            return;
        }
        boolean z = view instanceof s95;
        int i4 = this.f;
        float f19 = (z ? i4 : i4 - L) / 2.0f;
        float f20 = f2 - f19;
        float f21 = f3 - f19;
        if (this.c && this.h == 0) {
            f20 += gm.L(40.0f);
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
        d53 d53Var = d53.f;
        float interpolation = d53Var.getInterpolation(this.y.h);
        if (this.h == 2) {
            f4 = d53.h.getInterpolation(interpolation);
            f5 = d53Var.getInterpolation(interpolation);
            g39Var = null;
        } else if (this.n) {
            g39Var = null;
            f4 = d53.h.getInterpolation(this.y.g);
            f5 = d53Var.getInterpolation(this.y.g);
        } else {
            g39Var = null;
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
                e39 e39Var = this.y.d;
                if (z2) {
                    e39Var.setAlpha(1.0f);
                } else {
                    e39Var.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
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
                g39Var2 = this.y;
            }
            g39Var2 = this.y;
            f8 = g39Var2.g;
            if (f8 != 1.0f) {
                if (this.n) {
                    f9 = f8 + 0.045714285f;
                    g39Var2.g = f9;
                } else {
                    f9 = f8 + 0.07272727f;
                    g39Var2.g = f9;
                }
                if (f9 > 1.0f) {
                    g39Var2.g = 1.0f;
                }
            }
            if (i != 2 && (!g39Var2.u || i != 0)) {
                if (i != 1) {
                    e39 e39Var2 = g39Var2.c;
                    if (e39Var2.H) {
                        if (e39Var2.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g == 0) {
                    f10 = 0.7f;
                } else {
                    f10 = 0.7f;
                }
                if (this.h == 1) {
                    e39 e39Var3 = this.y.b;
                    if (e39Var3.H) {
                        if (e39Var3.getImageReceiver().y() != null) {
                        }
                    }
                }
                if (this.x.g != 0) {
                }
                if (!this.y.x.isEmpty()) {
                    e39 e39Var4 = this.y.b;
                    if (e39Var4.H) {
                        p09 y2 = e39Var4.getImageReceiver().y();
                        int i6 = 0;
                        while (i6 < this.y.x.size()) {
                            f39 f39Var = (f39) this.y.x.get(i6);
                            float f28 = f39Var.c;
                            if (y2 != null && y2.l0) {
                                float m = this.y.b.getImageReceiver().y().m();
                            }
                            float f29 = f39Var.d;
                            if (f29 != 1.0f) {
                                float f30 = f29 + f;
                                f39Var.d = f30;
                                if (f30 > 1.0f) {
                                    f39Var.d = 1.0f;
                                    this.y.x.remove(i6);
                                    i6--;
                                    f11 = f27;
                                    r9 = g39Var;
                                    i6++;
                                    g39Var = r9;
                                    f27 = f11;
                                }
                            }
                            if (f28 < 0.5f) {
                                y = f28 / 0.5f;
                                f12 = 1.0f;
                            } else {
                                f12 = 1.0f;
                                y = td4.y(f28, 0.5f, 0.5f, 1.0f);
                            }
                            float f31 = (f12 - f28) * 0.5f;
                            float f32 = (f39Var.f * f28) + f31;
                            float f33 = ((f39Var.g * f28) + f31) - (f39Var.e * y);
                            float f34 = (1.0f - f39Var.d) * f39Var.h * f28;
                            float scaleX = (this.y.b.getScaleX() * this.y.b.getWidth() * f32) + this.y.b.getX();
                            float scaleY = (this.y.b.getScaleY() * this.y.b.getHeight() * f33) + this.y.b.getY();
                            int L2 = gm.L(16.0f);
                            float f35 = L2;
                            float f36 = f35 / 2.0f;
                            f11 = f27;
                            ((f39) this.y.x.get(i6)).a.i0(scaleX - f36, scaleY - f36, f35, f35);
                            ((f39) this.y.x.get(i6)).a.q0(L2 >> 1);
                            canvas.save();
                            canvas.translate(0.0f, f39Var.l);
                            canvas.scale(f34, f34, scaleX, scaleY);
                            canvas.rotate(f39Var.j, scaleX, scaleY);
                            r9 = g39Var;
                            ((f39) this.y.x.get(i6)).a.h(canvas, r9);
                            canvas.restore();
                            float f37 = f39Var.c;
                            if (f37 < 1.0f) {
                                float f38 = f37 + f11;
                                f39Var.c = f38;
                                if (f38 > 1.0f) {
                                    f39Var.c = 1.0f;
                                }
                            }
                            if (f28 >= 1.0f) {
                                f39Var.l = kt6.d(gm.L(20.0f), 16.0f, 500.0f, f39Var.l);
                            }
                            boolean z3 = f39Var.k;
                            float f39 = f39Var.j;
                            float f40 = f39Var.i;
                            if (z3) {
                                float f41 = (f40 / 250.0f) + f39;
                                f39Var.j = f41;
                                if (f41 > f40) {
                                    f39Var.k = false;
                                }
                            } else {
                                float f42 = f39 - (f40 / 250.0f);
                                f39Var.j = f42;
                                if (f42 < (-f40)) {
                                    f39Var.k = true;
                                }
                            }
                            i6++;
                            g39Var = r9;
                            f27 = f11;
                        }
                    }
                }
                invalidate();
            }
            f10 = 0.7f;
            g39 g39Var7 = this.y;
            f13 = g39Var7.h;
            if (f13 != 1.0f) {
                int i7 = this.h;
                if (i7 == 1) {
                    g39Var7.h = 1.0f;
                    f14 = 1.0f;
                } else {
                    f14 = f13 + (16.0f / (i7 == 2 ? 350.0f : 220.0f));
                    g39Var7.h = f14;
                }
                if (f14 > f10) {
                    if (!this.c || i7 != 2) {
                        g39.g();
                    } else if (!g39Var7.A) {
                        g39Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.y.f.i);
                        g39 g39Var8 = this.y.f;
                        g39Var8.z = true;
                        g39Var8.s = true;
                        g39Var8.y = System.currentTimeMillis();
                        this.y.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new c39(this, (byte) 0));
                    }
                }
                g39 g39Var9 = this.y;
                if (g39Var9.h >= 1.0f) {
                    int i8 = this.h;
                    if (i8 == 0 || i8 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof rc2) {
                            ((rc2) view2).O.b(g39Var9.p);
                        } else if (view2 instanceof cm1) {
                            ((cm1) view2).F0.b(g39Var9.p);
                        }
                    }
                    this.y.h = 1.0f;
                    if (this.h == 1) {
                        g39.C = g39Var;
                    } else {
                        g39.B = g39Var;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof rc2) && ((rc2) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        gm.c3(new Runnable(this) { // from class: b39
                            public final /* synthetic */ d39 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                d39 d39Var = this.b;
                                switch (b22) {
                                    case 0:
                                        d39Var.y.c();
                                        break;
                                    default:
                                        d39Var.y.c();
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
        g39Var2 = this.y;
        f8 = g39Var2.g;
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
        g39 g39Var72 = this.y;
        f13 = g39Var72.h;
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
            ((f39) arrayList.get(i)).a.I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((f39) arrayList.get(i)).a.K();
        }
    }
}
