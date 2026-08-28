package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.ij;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ qn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ r0 w;
    public final /* synthetic */ n0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, qn qnVar, int i9, int i10, boolean z11, float f10, float f11, float f12, r0 r0Var) {
        super(context);
        this.x = n0Var;
        this.a = o2Var;
        this.b = view;
        this.c = z10;
        this.d = messageObject;
        this.e = qnVar;
        this.f = i9;
        this.h = i10;
        this.n = z11;
        this.r = f10;
        this.s = f11;
        this.v = f12;
        this.w = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x038f, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().h0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0559, code lost:
    
        if (((int) org.telegram.messenger.ll.c(r23.x.b.getImageReceiver().getLottieAnimation().X, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03d5, code lost:
    
        if (r23.x.b.getImageReceiver().getLottieAnimation().h0 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03ea, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) > 2000) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dd  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int dp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i9;
        float f18;
        float f19;
        float f20;
        float a2;
        float f21;
        p0 p0Var;
        int paddingTop;
        qn qnVar;
        MessageObject messageObject;
        n0 n0Var = this.x;
        if (n0Var.l) {
            float f22 = n0Var.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                n0Var.m = f23;
                if (f23 > 1.0f) {
                    n0Var.m = 1.0f;
                    final int i10 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: hg.j0
                        public final /* synthetic */ k0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.b.x.c();
                                    break;
                                default:
                                    this.b.x.c();
                                    break;
                            }
                        }
                    });
                }
            }
            float f24 = this.x.m;
            if (f24 != 1.0f) {
                setAlpha(1.0f - f24);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!n0Var.s) {
            invalidate();
            return;
        }
        sj0 sj0Var = n0Var.t;
        if (sj0Var != null) {
            sj0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        o2 o2Var = this.a;
        if (o2Var instanceof qn) {
            qn qnVar2 = (qn) o2Var;
            int i11 = this.x.n;
            ij ijVar = qnVar2.t0;
            if (ijVar != null) {
                int childCount = ijVar.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    view = qnVar2.t0.getChildAt(i12);
                    if (view instanceof t1) {
                        messageObject = ((t1) view).getMessageObject();
                    } else if (view instanceof w0) {
                        messageObject = ((w0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.getId() == i11) {
                        break;
                    }
                }
            }
            view = null;
        } else {
            view = this.b;
        }
        if (this.c) {
            dp = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 120.0f : 50.0f);
        } else {
            MessageObject messageObject2 = this.d;
            dp = (messageObject2 == null || !messageObject2.shouldDrawReactionsInLayout()) ? AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(20.0f);
        }
        float f25 = dp;
        if (view != null) {
            view.getLocationInWindow(this.x.j);
            n0 n0Var2 = this.x;
            int[] iArr = n0Var2.j;
            f11 = iArr[0];
            f12 = iArr[1];
            if (view instanceof t1) {
                t1 t1Var = (t1) view;
                f10 = 0.10666667f;
                p0Var = t1Var.J.l(n0Var2.p);
                if (t1Var.F && !t1Var.f4()) {
                    f12 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = t1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (view instanceof w0) {
                    p0Var = ((w0) view).y0.l(n0Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof tg.d) {
                        f11 += ((tg.d) view).getReactionCenterX();
                        f12 += view.getMeasuredHeight() / 2.0f;
                    }
                    p0Var = null;
                    if (p0Var != null) {
                        Rect rect = p0Var.t;
                        f11 += rect.left;
                        f12 += rect.top;
                    }
                    qnVar = this.e;
                    if (qnVar != null) {
                        f12 += qnVar.ua;
                    }
                    n0 n0Var3 = this.x;
                    n0Var3.q = f11;
                    n0Var3.r = f12;
                }
            }
            f12 += paddingTop;
            if (p0Var != null) {
            }
            qnVar = this.e;
            if (qnVar != null) {
            }
            n0 n0Var32 = this.x;
            n0Var32.q = f11;
            n0Var32.r = f12;
        } else {
            f10 = 0.10666667f;
            if (this.c) {
                float f26 = f25 / 2.0f;
                f11 = (getMeasuredWidth() / 2.0f) - f26;
                f12 = (getMeasuredHeight() / 2.0f) - f26;
            } else {
                n0 n0Var4 = this.x;
                f11 = n0Var4.q;
                f12 = n0Var4.r;
            }
        }
        o2 o2Var2 = this.a;
        if (o2Var2 != null && o2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof tg.d)) {
            return;
        }
        float f27 = (view instanceof tg.d ? this.f : this.f - f25) / 2.0f;
        float f28 = f11 - f27;
        float f29 = f12 - f27;
        if (this.c && this.h == 0) {
            f28 += AndroidUtilities.dp(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f30 = this.x.j[0];
            if (f28 < f30) {
                f28 = f30;
            }
            if (this.f + f28 > getMeasuredWidth() + r12) {
                f28 = (getMeasuredWidth() + this.x.j[0]) - this.f;
            }
        }
        gr grVar = gr.f;
        float interpolation = grVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f14 = gr.h.getInterpolation(interpolation);
            f15 = grVar.getInterpolation(interpolation);
            f13 = 2.0f;
        } else if (this.n) {
            f13 = 2.0f;
            f14 = gr.h.getInterpolation(this.x.g);
            f15 = grVar.getInterpolation(this.x.g);
        } else {
            f13 = 2.0f;
            f14 = this.x.g;
            f15 = f14;
        }
        float f31 = 1.0f - f14;
        float f32 = (this.r * f31) + f14;
        float f33 = f25 / this.f;
        if (this.h == 1) {
            f32 = 1.0f;
        } else {
            f28 = (f28 * f14) + (this.s * f31);
            f29 = (f29 * f15) + ((1.0f - f15) * this.v);
        }
        this.x.b.setTranslationX(f28);
        this.x.b.setTranslationY(f29);
        float f34 = 1.0f - interpolation;
        this.x.b.setAlpha(f34);
        this.x.b.setScaleX(f32);
        this.x.b.setScaleY(f32);
        int i13 = this.h;
        if (i13 != 2) {
            if (interpolation != 0.0f) {
                f32 = (f32 * f34) + (f33 * interpolation);
                f28 = (f28 * f34) + (f11 * interpolation);
                f16 = f29 * f34;
                f17 = f12 * interpolation;
            }
            if (i13 != 1) {
                if (this.c) {
                    this.x.d.setAlpha(1.0f);
                } else {
                    this.x.d.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.x.c.setAlpha(f34);
            }
            this.x.e.setTranslationX(f28);
            this.x.e.setTranslationY(f29);
            this.x.e.setScaleX(f32);
            this.x.e.setScaleY(f32);
            super.dispatchDraw(canvas);
            i9 = this.h;
            if (i9 != 1 || this.x.c.C) {
                n0 n0Var5 = this.x;
                f18 = n0Var5.g;
                if (f18 != 1.0f) {
                    if (this.n) {
                        n0Var5.g = f18 + 0.045714285f;
                    } else {
                        n0Var5.g = f18 + 0.07272727f;
                    }
                    if (n0Var5.g > 1.0f) {
                        n0Var5.g = 1.0f;
                    }
                }
            }
            if (i9 != 2) {
                n0 n0Var6 = this.x;
                if (!n0Var6.u || i9 != 0) {
                    if (i9 != 1) {
                        l0 l0Var = n0Var6.c;
                        if (l0Var.C) {
                            if (l0Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f19 = 0.7f;
                    } else {
                        f19 = 0.7f;
                    }
                    if (this.h == 1) {
                        l0 l0Var2 = this.x.b;
                        if (l0Var2.C) {
                            if (l0Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        l0 l0Var3 = this.x.b;
                        if (l0Var3.C) {
                            mi0 lottieAnimation = l0Var3.getImageReceiver().getLottieAnimation();
                            int i14 = 0;
                            while (i14 < this.x.x.size()) {
                                m0 m0Var = (m0) this.x.x.get(i14);
                                float f35 = m0Var.c;
                                if (lottieAnimation != null && lottieAnimation.h0) {
                                    float p6 = this.x.b.getImageReceiver().getLottieAnimation().p();
                                }
                                float f36 = m0Var.d;
                                if (f36 != 1.0f) {
                                    float f37 = f36 + f10;
                                    m0Var.d = f37;
                                    if (f37 > 1.0f) {
                                        m0Var.d = 1.0f;
                                        this.x.x.remove(i14);
                                        i14--;
                                        i14++;
                                    }
                                }
                                if (f35 < 0.5f) {
                                    a2 = f35 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    a2 = org.telegram.messenger.l0.a(f35, 0.5f, 0.5f, 1.0f);
                                }
                                float f38 = (f20 - f35) * 0.5f;
                                float f39 = (m0Var.f * f35) + f38;
                                float f40 = ((m0Var.g * f35) + f38) - (m0Var.e * a2);
                                float f41 = (1.0f - m0Var.d) * m0Var.h * f35;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f39) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f40) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f42 = dp2;
                                float f43 = f42 / f13;
                                ((m0) this.x.x.get(i14)).a.setImageCoords(scaleX - f43, scaleY - f43, f42, f42);
                                ((m0) this.x.x.get(i14)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, m0Var.l);
                                canvas.scale(f41, f41, scaleX, scaleY);
                                canvas.rotate(m0Var.j, scaleX, scaleY);
                                ((m0) this.x.x.get(i14)).a.draw(canvas);
                                canvas.restore();
                                float f44 = m0Var.c;
                                if (f44 < 1.0f) {
                                    float f45 = f44 + 0.045714285f;
                                    m0Var.c = f45;
                                    if (f45 > 1.0f) {
                                        m0Var.c = 1.0f;
                                    }
                                }
                                if (f35 >= 1.0f) {
                                    m0Var.l = aa.d.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, m0Var.l);
                                }
                                if (m0Var.k) {
                                    float f46 = m0Var.j;
                                    float f47 = m0Var.i;
                                    float f48 = (f47 / 250.0f) + f46;
                                    m0Var.j = f48;
                                    if (f48 > f47) {
                                        m0Var.k = false;
                                    }
                                } else {
                                    float f49 = m0Var.j;
                                    float f50 = m0Var.i;
                                    float f51 = f49 - (f50 / 250.0f);
                                    m0Var.j = f51;
                                    if (f51 < (-f50)) {
                                        m0Var.k = true;
                                    }
                                }
                                i14++;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f19 = 0.7f;
            n0 n0Var7 = this.x;
            f21 = n0Var7.h;
            if (f21 != 1.0f) {
                int i15 = this.h;
                if (i15 == 1) {
                    n0Var7.h = 1.0f;
                } else {
                    n0Var7.h = (16.0f / (i15 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (n0Var7.h > f19) {
                    if (!this.c || i15 != 2) {
                        n0.g();
                    } else if (!n0Var7.A) {
                        n0Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.x.f.i);
                        n0 n0Var8 = this.x.f;
                        n0Var8.z = true;
                        n0Var8.s = true;
                        n0Var8.y = System.currentTimeMillis();
                        this.x.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new ag.e(this, 8));
                    }
                }
                n0 n0Var9 = this.x;
                if (n0Var9.h >= 1.0f) {
                    int i16 = this.h;
                    if (i16 == 0 || i16 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof t1) {
                            ((t1) view2).J.b(n0Var9.p);
                        } else if (view2 instanceof w0) {
                            ((w0) view2).y0.b(n0Var9.p);
                        }
                    }
                    this.x.h = 1.0f;
                    if (this.h == 1) {
                        n0.C = null;
                    } else {
                        n0.B = null;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof t1) && ((t1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        final int i17 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: hg.j0
                            public final /* synthetic */ k0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i17) {
                                    case 0:
                                        this.b.x.c();
                                        break;
                                    default:
                                        this.b.x.c();
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (!this.x.x.isEmpty()) {
            }
            invalidate();
        }
        f32 = (this.r * f31) + (f33 * f14);
        f28 = (f11 * f14) + (this.s * f31);
        f16 = (1.0f - f15) * this.v;
        f17 = f12 * f15;
        f29 = f16 + f17;
        if (i13 != 1) {
        }
        if (this.h == 0) {
            this.x.c.setAlpha(f34);
        }
        this.x.e.setTranslationX(f28);
        this.x.e.setTranslationY(f29);
        this.x.e.setScaleX(f32);
        this.x.e.setScaleY(f32);
        super.dispatchDraw(canvas);
        i9 = this.h;
        if (i9 != 1) {
        }
        n0 n0Var52 = this.x;
        f18 = n0Var52.g;
        if (f18 != 1.0f) {
        }
        if (i9 != 2) {
        }
        f19 = 0.7f;
        n0 n0Var72 = this.x;
        f21 = n0Var72.h;
        if (f21 != 1.0f) {
        }
        if (!this.x.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = 0;
        while (true) {
            n0 n0Var = this.x;
            if (i9 >= n0Var.x.size()) {
                return;
            }
            ((m0) n0Var.x.get(i9)).a.onAttachedToWindow();
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            n0 n0Var = this.x;
            if (i9 >= n0Var.x.size()) {
                return;
            }
            ((m0) n0Var.x.get(i9)).a.onDetachedFromWindow();
            i9++;
        }
    }
}
