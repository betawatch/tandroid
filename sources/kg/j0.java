package kg;

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
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.lj;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ tn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ q0 w;
    public final /* synthetic */ m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, tn tnVar, int i10, int i11, boolean z11, float f9, float f10, float f11, q0 q0Var) {
        super(context);
        this.x = m0Var;
        this.a = o2Var;
        this.b = view;
        this.c = z10;
        this.d = messageObject;
        this.e = tnVar;
        this.f = i10;
        this.h = i11;
        this.n = z11;
        this.r = f9;
        this.s = f10;
        this.v = f11;
        this.w = q0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x038f, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().h0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0559, code lost:
    
        if (((int) org.telegram.messenger.x3.A(r23.x.b.getImageReceiver().getLottieAnimation().X, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
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
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        float f17;
        float f18;
        float f19;
        float a2;
        float f20;
        o0 o0Var;
        int paddingTop;
        tn tnVar;
        MessageObject messageObject;
        m0 m0Var = this.x;
        if (m0Var.l) {
            float f21 = m0Var.m;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.10666667f;
                m0Var.m = f22;
                if (f22 > 1.0f) {
                    m0Var.m = 1.0f;
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: kg.i0
                        public final /* synthetic */ j0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
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
            float f23 = this.x.m;
            if (f23 != 1.0f) {
                setAlpha(1.0f - f23);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!m0Var.s) {
            invalidate();
            return;
        }
        dk0 dk0Var = m0Var.t;
        if (dk0Var != null) {
            dk0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        o2 o2Var = this.a;
        if (o2Var instanceof tn) {
            tn tnVar2 = (tn) o2Var;
            int i12 = this.x.n;
            lj ljVar = tnVar2.t0;
            if (ljVar != null) {
                int childCount = ljVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = tnVar2.t0.getChildAt(i13);
                    if (view instanceof s1) {
                        messageObject = ((s1) view).getMessageObject();
                    } else if (view instanceof v0) {
                        messageObject = ((v0) view).getMessageObject();
                    } else {
                        continue;
                    }
                    if (messageObject != null && messageObject.getId() == i12) {
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
        float f24 = dp;
        if (view != null) {
            view.getLocationInWindow(this.x.j);
            m0 m0Var2 = this.x;
            int[] iArr = m0Var2.j;
            f10 = iArr[0];
            f11 = iArr[1];
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                f9 = 0.10666667f;
                o0Var = s1Var.J.m(m0Var2.p);
                if (s1Var.F && !s1Var.f4()) {
                    f11 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = s1Var.getPaddingTop();
            } else {
                f9 = 0.10666667f;
                if (view instanceof v0) {
                    o0Var = ((v0) view).y0.m(m0Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof wg.c) {
                        f10 += ((wg.c) view).getReactionCenterX();
                        f11 += view.getMeasuredHeight() / 2.0f;
                    }
                    o0Var = null;
                    if (o0Var != null) {
                        Rect rect = o0Var.t;
                        f10 += rect.left;
                        f11 += rect.top;
                    }
                    tnVar = this.e;
                    if (tnVar != null) {
                        f11 += tnVar.ua;
                    }
                    m0 m0Var3 = this.x;
                    m0Var3.q = f10;
                    m0Var3.r = f11;
                }
            }
            f11 += paddingTop;
            if (o0Var != null) {
            }
            tnVar = this.e;
            if (tnVar != null) {
            }
            m0 m0Var32 = this.x;
            m0Var32.q = f10;
            m0Var32.r = f11;
        } else {
            f9 = 0.10666667f;
            if (this.c) {
                float f25 = f24 / 2.0f;
                f10 = (getMeasuredWidth() / 2.0f) - f25;
                f11 = (getMeasuredHeight() / 2.0f) - f25;
            } else {
                m0 m0Var4 = this.x;
                f10 = m0Var4.q;
                f11 = m0Var4.r;
            }
        }
        o2 o2Var2 = this.a;
        if (o2Var2 != null && o2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof wg.c)) {
            return;
        }
        float f26 = (view instanceof wg.c ? this.f : this.f - f24) / 2.0f;
        float f27 = f10 - f26;
        float f28 = f11 - f26;
        if (this.c && this.h == 0) {
            f27 += AndroidUtilities.dp(40.0f);
        }
        if (this.h != 1 && !this.c) {
            float f29 = this.x.j[0];
            if (f27 < f29) {
                f27 = f29;
            }
            if (this.f + f27 > getMeasuredWidth() + r12) {
                f27 = (getMeasuredWidth() + this.x.j[0]) - this.f;
            }
        }
        jr jrVar = jr.f;
        float interpolation = jrVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f13 = jr.h.getInterpolation(interpolation);
            f14 = jrVar.getInterpolation(interpolation);
            f12 = 2.0f;
        } else if (this.n) {
            f12 = 2.0f;
            f13 = jr.h.getInterpolation(this.x.g);
            f14 = jrVar.getInterpolation(this.x.g);
        } else {
            f12 = 2.0f;
            f13 = this.x.g;
            f14 = f13;
        }
        float f30 = 1.0f - f13;
        float f31 = (this.r * f30) + f13;
        float f32 = f24 / this.f;
        if (this.h == 1) {
            f31 = 1.0f;
        } else {
            f27 = (f27 * f13) + (this.s * f30);
            f28 = (f28 * f14) + ((1.0f - f14) * this.v);
        }
        this.x.b.setTranslationX(f27);
        this.x.b.setTranslationY(f28);
        float f33 = 1.0f - interpolation;
        this.x.b.setAlpha(f33);
        this.x.b.setScaleX(f31);
        this.x.b.setScaleY(f31);
        int i14 = this.h;
        if (i14 != 2) {
            if (interpolation != 0.0f) {
                f31 = (f31 * f33) + (f32 * interpolation);
                f27 = (f27 * f33) + (f10 * interpolation);
                f15 = f28 * f33;
                f16 = f11 * interpolation;
            }
            if (i14 != 1) {
                if (this.c) {
                    this.x.d.setAlpha(1.0f);
                } else {
                    this.x.d.setAlpha(interpolation > 0.7f ? (interpolation - 0.7f) / 0.3f : 0.0f);
                }
            }
            if (this.h == 0 && this.c) {
                this.x.c.setAlpha(f33);
            }
            this.x.e.setTranslationX(f27);
            this.x.e.setTranslationY(f28);
            this.x.e.setScaleX(f31);
            this.x.e.setScaleY(f31);
            super.dispatchDraw(canvas);
            i10 = this.h;
            if (i10 != 1 || this.x.c.C) {
                m0 m0Var5 = this.x;
                f17 = m0Var5.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        m0Var5.g = f17 + 0.045714285f;
                    } else {
                        m0Var5.g = f17 + 0.07272727f;
                    }
                    if (m0Var5.g > 1.0f) {
                        m0Var5.g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                m0 m0Var6 = this.x;
                if (!m0Var6.u || i10 != 0) {
                    if (i10 != 1) {
                        k0 k0Var = m0Var6.c;
                        if (k0Var.C) {
                            if (k0Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        k0 k0Var2 = this.x.b;
                        if (k0Var2.C) {
                            if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        k0 k0Var3 = this.x.b;
                        if (k0Var3.C) {
                            xi0 lottieAnimation = k0Var3.getImageReceiver().getLottieAnimation();
                            int i15 = 0;
                            while (i15 < this.x.x.size()) {
                                l0 l0Var = (l0) this.x.x.get(i15);
                                float f34 = l0Var.c;
                                if (lottieAnimation != null && lottieAnimation.h0) {
                                    float p10 = this.x.b.getImageReceiver().getLottieAnimation().p();
                                }
                                float f35 = l0Var.d;
                                if (f35 != 1.0f) {
                                    float f36 = f35 + f9;
                                    l0Var.d = f36;
                                    if (f36 > 1.0f) {
                                        l0Var.d = 1.0f;
                                        this.x.x.remove(i15);
                                        i15--;
                                        i15++;
                                    }
                                }
                                if (f34 < 0.5f) {
                                    a2 = f34 / 0.5f;
                                    f19 = 1.0f;
                                } else {
                                    f19 = 1.0f;
                                    a2 = x3.a(f34, 0.5f, 0.5f, 1.0f);
                                }
                                float f37 = (f19 - f34) * 0.5f;
                                float f38 = (l0Var.f * f34) + f37;
                                float f39 = ((l0Var.g * f34) + f37) - (l0Var.e * a2);
                                float f40 = (1.0f - l0Var.d) * l0Var.h * f34;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f38) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f39) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f41 = dp2;
                                float f42 = f41 / f12;
                                ((l0) this.x.x.get(i15)).a.setImageCoords(scaleX - f42, scaleY - f42, f41, f41);
                                ((l0) this.x.x.get(i15)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.l);
                                canvas.scale(f40, f40, scaleX, scaleY);
                                canvas.rotate(l0Var.j, scaleX, scaleY);
                                ((l0) this.x.x.get(i15)).a.draw(canvas);
                                canvas.restore();
                                float f43 = l0Var.c;
                                if (f43 < 1.0f) {
                                    float f44 = f43 + 0.045714285f;
                                    l0Var.c = f44;
                                    if (f44 > 1.0f) {
                                        l0Var.c = 1.0f;
                                    }
                                }
                                if (f34 >= 1.0f) {
                                    l0Var.l = a4.w.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.l);
                                }
                                if (l0Var.k) {
                                    float f45 = l0Var.j;
                                    float f46 = l0Var.i;
                                    float f47 = (f46 / 250.0f) + f45;
                                    l0Var.j = f47;
                                    if (f47 > f46) {
                                        l0Var.k = false;
                                    }
                                } else {
                                    float f48 = l0Var.j;
                                    float f49 = l0Var.i;
                                    float f50 = f48 - (f49 / 250.0f);
                                    l0Var.j = f50;
                                    if (f50 < (-f49)) {
                                        l0Var.k = true;
                                    }
                                }
                                i15++;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            m0 m0Var7 = this.x;
            f20 = m0Var7.h;
            if (f20 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    m0Var7.h = 1.0f;
                } else {
                    m0Var7.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f20;
                }
                if (m0Var7.h > f18) {
                    if (!this.c || i16 != 2) {
                        m0.g();
                    } else if (!m0Var7.A) {
                        m0Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.x.f.i);
                        m0 m0Var8 = this.x.f;
                        m0Var8.z = true;
                        m0Var8.s = true;
                        m0Var8.y = System.currentTimeMillis();
                        this.x.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new ag.m0(this, 13));
                    }
                }
                m0 m0Var9 = this.x;
                if (m0Var9.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof s1) {
                            ((s1) view2).J.b(m0Var9.p);
                        } else if (view2 instanceof v0) {
                            ((v0) view2).y0.b(m0Var9.p);
                        }
                    }
                    this.x.h = 1.0f;
                    if (this.h == 1) {
                        m0.C = null;
                    } else {
                        m0.B = null;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof s1) && ((s1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        final int i18 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: kg.i0
                            public final /* synthetic */ j0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i18) {
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
        f31 = (this.r * f30) + (f32 * f13);
        f27 = (f10 * f13) + (this.s * f30);
        f15 = (1.0f - f14) * this.v;
        f16 = f11 * f14;
        f28 = f15 + f16;
        if (i14 != 1) {
        }
        if (this.h == 0) {
            this.x.c.setAlpha(f33);
        }
        this.x.e.setTranslationX(f27);
        this.x.e.setTranslationY(f28);
        this.x.e.setScaleX(f31);
        this.x.e.setScaleY(f31);
        super.dispatchDraw(canvas);
        i10 = this.h;
        if (i10 != 1) {
        }
        m0 m0Var52 = this.x;
        f17 = m0Var52.g;
        if (f17 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f18 = 0.7f;
        m0 m0Var72 = this.x;
        f20 = m0Var72.h;
        if (f20 != 1.0f) {
        }
        if (!this.x.x.isEmpty()) {
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.x;
            if (i10 >= m0Var.x.size()) {
                return;
            }
            ((l0) m0Var.x.get(i10)).a.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.x;
            if (i10 >= m0Var.x.size()) {
                return;
            }
            ((l0) m0Var.x.get(i10)).a.onDetachedFromWindow();
            i10++;
        }
    }
}
