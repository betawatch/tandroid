package mg;

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
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.sj;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ zn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ q0 w;
    public final /* synthetic */ m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, Context context, p2 p2Var, View view, boolean z4, MessageObject messageObject, zn znVar, int i10, int i11, boolean z10, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.x = m0Var;
        this.a = p2Var;
        this.b = view;
        this.c = z4;
        this.d = messageObject;
        this.e = znVar;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.r = f10;
        this.s = f11;
        this.v = f12;
        this.w = q0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x038f, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().i0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0559, code lost:
    
        if (((int) org.telegram.messenger.y3.A(r23.x.b.getImageReceiver().getLottieAnimation().Y, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03d5, code lost:
    
        if (r23.x.b.getImageReceiver().getLottieAnimation().i0 == false) goto L199;
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
        int i10;
        float f18;
        float f19;
        float f20;
        float a2;
        float f21;
        o0 o0Var;
        int paddingTop;
        zn znVar;
        MessageObject messageObject;
        m0 m0Var = this.x;
        if (m0Var.l) {
            float f22 = m0Var.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                m0Var.m = f23;
                if (f23 > 1.0f) {
                    m0Var.m = 1.0f;
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: mg.i0
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
            float f24 = this.x.m;
            if (f24 != 1.0f) {
                setAlpha(1.0f - f24);
                super.dispatchDraw(canvas);
            }
            invalidate();
            return;
        }
        if (!m0Var.s) {
            invalidate();
            return;
        }
        nk0 nk0Var = m0Var.t;
        if (nk0Var != null) {
            nk0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        p2 p2Var = this.a;
        if (p2Var instanceof zn) {
            zn znVar2 = (zn) p2Var;
            int i12 = this.x.n;
            sj sjVar = znVar2.u0;
            if (sjVar != null) {
                int childCount = sjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = znVar2.u0.getChildAt(i13);
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
        float f25 = dp;
        if (view != null) {
            view.getLocationInWindow(this.x.j);
            m0 m0Var2 = this.x;
            int[] iArr = m0Var2.j;
            f11 = iArr[0];
            f12 = iArr[1];
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                f10 = 0.10666667f;
                o0Var = s1Var.K.m(m0Var2.p);
                if (s1Var.G && !s1Var.f4()) {
                    f12 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = s1Var.getPaddingTop();
            } else {
                f10 = 0.10666667f;
                if (view instanceof v0) {
                    o0Var = ((v0) view).z0.m(m0Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof yg.c) {
                        f11 += ((yg.c) view).getReactionCenterX();
                        f12 += view.getMeasuredHeight() / 2.0f;
                    }
                    o0Var = null;
                    if (o0Var != null) {
                        Rect rect = o0Var.t;
                        f11 += rect.left;
                        f12 += rect.top;
                    }
                    znVar = this.e;
                    if (znVar != null) {
                        f12 += znVar.va;
                    }
                    m0 m0Var3 = this.x;
                    m0Var3.q = f11;
                    m0Var3.r = f12;
                }
            }
            f12 += paddingTop;
            if (o0Var != null) {
            }
            znVar = this.e;
            if (znVar != null) {
            }
            m0 m0Var32 = this.x;
            m0Var32.q = f11;
            m0Var32.r = f12;
        } else {
            f10 = 0.10666667f;
            if (this.c) {
                float f26 = f25 / 2.0f;
                f11 = (getMeasuredWidth() / 2.0f) - f26;
                f12 = (getMeasuredHeight() / 2.0f) - f26;
            } else {
                m0 m0Var4 = this.x;
                f11 = m0Var4.q;
                f12 = m0Var4.r;
            }
        }
        p2 p2Var2 = this.a;
        if (p2Var2 != null && p2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof yg.c)) {
            return;
        }
        float f27 = (view instanceof yg.c ? this.f : this.f - f25) / 2.0f;
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
        mr mrVar = mr.f;
        float interpolation = mrVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f14 = mr.h.getInterpolation(interpolation);
            f15 = mrVar.getInterpolation(interpolation);
            f13 = 2.0f;
        } else if (this.n) {
            f13 = 2.0f;
            f14 = mr.h.getInterpolation(this.x.g);
            f15 = mrVar.getInterpolation(this.x.g);
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
        int i14 = this.h;
        if (i14 != 2) {
            if (interpolation != 0.0f) {
                f32 = (f32 * f34) + (f33 * interpolation);
                f28 = (f28 * f34) + (f11 * interpolation);
                f16 = f29 * f34;
                f17 = f12 * interpolation;
            }
            if (i14 != 1) {
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
            i10 = this.h;
            if (i10 != 1 || this.x.c.D) {
                m0 m0Var5 = this.x;
                f18 = m0Var5.g;
                if (f18 != 1.0f) {
                    if (this.n) {
                        m0Var5.g = f18 + 0.045714285f;
                    } else {
                        m0Var5.g = f18 + 0.07272727f;
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
                        if (k0Var.D) {
                            if (k0Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f19 = 0.7f;
                    } else {
                        f19 = 0.7f;
                    }
                    if (this.h == 1) {
                        k0 k0Var2 = this.x.b;
                        if (k0Var2.D) {
                            if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        k0 k0Var3 = this.x.b;
                        if (k0Var3.D) {
                            gj0 lottieAnimation = k0Var3.getImageReceiver().getLottieAnimation();
                            int i15 = 0;
                            while (i15 < this.x.x.size()) {
                                l0 l0Var = (l0) this.x.x.get(i15);
                                float f35 = l0Var.c;
                                if (lottieAnimation != null && lottieAnimation.i0) {
                                    float p10 = this.x.b.getImageReceiver().getLottieAnimation().p();
                                }
                                float f36 = l0Var.d;
                                if (f36 != 1.0f) {
                                    float f37 = f36 + f10;
                                    l0Var.d = f37;
                                    if (f37 > 1.0f) {
                                        l0Var.d = 1.0f;
                                        this.x.x.remove(i15);
                                        i15--;
                                        i15++;
                                    }
                                }
                                if (f35 < 0.5f) {
                                    a2 = f35 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    a2 = y3.a(f35, 0.5f, 0.5f, 1.0f);
                                }
                                float f38 = (f20 - f35) * 0.5f;
                                float f39 = (l0Var.f * f35) + f38;
                                float f40 = ((l0Var.g * f35) + f38) - (l0Var.e * a2);
                                float f41 = (1.0f - l0Var.d) * l0Var.h * f35;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f39) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f40) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f42 = dp2;
                                float f43 = f42 / f13;
                                ((l0) this.x.x.get(i15)).a.setImageCoords(scaleX - f43, scaleY - f43, f42, f42);
                                ((l0) this.x.x.get(i15)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, l0Var.l);
                                canvas.scale(f41, f41, scaleX, scaleY);
                                canvas.rotate(l0Var.j, scaleX, scaleY);
                                ((l0) this.x.x.get(i15)).a.draw(canvas);
                                canvas.restore();
                                float f44 = l0Var.c;
                                if (f44 < 1.0f) {
                                    float f45 = f44 + 0.045714285f;
                                    l0Var.c = f45;
                                    if (f45 > 1.0f) {
                                        l0Var.c = 1.0f;
                                    }
                                }
                                if (f35 >= 1.0f) {
                                    l0Var.l = android.support.v4.media.a.d(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, l0Var.l);
                                }
                                if (l0Var.k) {
                                    float f46 = l0Var.j;
                                    float f47 = l0Var.i;
                                    float f48 = (f47 / 250.0f) + f46;
                                    l0Var.j = f48;
                                    if (f48 > f47) {
                                        l0Var.k = false;
                                    }
                                } else {
                                    float f49 = l0Var.j;
                                    float f50 = l0Var.i;
                                    float f51 = f49 - (f50 / 250.0f);
                                    l0Var.j = f51;
                                    if (f51 < (-f50)) {
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
            f19 = 0.7f;
            m0 m0Var7 = this.x;
            f21 = m0Var7.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    m0Var7.h = 1.0f;
                } else {
                    m0Var7.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (m0Var7.h > f19) {
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
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new cg.l0(this, 14));
                    }
                }
                m0 m0Var9 = this.x;
                if (m0Var9.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof s1) {
                            ((s1) view2).K.b(m0Var9.p);
                        } else if (view2 instanceof v0) {
                            ((v0) view2).z0.b(m0Var9.p);
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
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: mg.i0
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
        f32 = (this.r * f31) + (f33 * f14);
        f28 = (f11 * f14) + (this.s * f31);
        f16 = (1.0f - f15) * this.v;
        f17 = f12 * f15;
        f29 = f16 + f17;
        if (i14 != 1) {
        }
        if (this.h == 0) {
            this.x.c.setAlpha(f34);
        }
        this.x.e.setTranslationX(f28);
        this.x.e.setTranslationY(f29);
        this.x.e.setScaleX(f32);
        this.x.e.setScaleY(f32);
        super.dispatchDraw(canvas);
        i10 = this.h;
        if (i10 != 1) {
        }
        m0 m0Var52 = this.x;
        f18 = m0Var52.g;
        if (f18 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f19 = 0.7f;
        m0 m0Var72 = this.x;
        f21 = m0Var72.h;
        if (f21 != 1.0f) {
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
