package ah;

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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.nj;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a1 extends FrameLayout {
    public final /* synthetic */ n2 a;
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
    public final /* synthetic */ i1 w;
    public final /* synthetic */ d1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(d1 d1Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, qn qnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, i1 i1Var) {
        super(context);
        this.x = d1Var;
        this.a = n2Var;
        this.b = view;
        this.c = z10;
        this.d = messageObject;
        this.e = qnVar;
        this.f = i10;
        this.h = i11;
        this.n = z11;
        this.r = f7;
        this.s = f10;
        this.v = f11;
        this.w = i1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x037a, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().k0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0394, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0540, code lost:
    
        if (((int) org.telegram.messenger.mk.x(r23.x.b.getImageReceiver().getLottieAnimation().a0, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03bc, code lost:
    
        if (r23.x.b.getImageReceiver().getLottieAnimation().k0 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03d1, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) > 2000) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int dp;
        float f7;
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
        float f20;
        float x10;
        float f21;
        g1 g1Var;
        int paddingTop;
        qn qnVar;
        MessageObject messageObject;
        d1 d1Var = this.x;
        if (d1Var.l) {
            float f22 = d1Var.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                d1Var.m = f23;
                if (f23 > 1.0f) {
                    d1Var.m = 1.0f;
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ah.z0
                        public final /* synthetic */ a1 b;

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
        if (!d1Var.s) {
            invalidate();
            return;
        }
        bl0 bl0Var = d1Var.t;
        if (bl0Var != null) {
            bl0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        n2 n2Var = this.a;
        if (n2Var instanceof qn) {
            qn qnVar2 = (qn) n2Var;
            int i12 = this.x.n;
            nj njVar = qnVar2.x0;
            if (njVar != null) {
                int childCount = njVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = qnVar2.x0.getChildAt(i13);
                    if (view instanceof u1) {
                        messageObject = ((u1) view).getMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
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
            d1 d1Var2 = this.x;
            int[] iArr = d1Var2.j;
            f10 = iArr[0];
            f11 = iArr[1];
            if (view instanceof u1) {
                u1 u1Var = (u1) view;
                f7 = 0.10666667f;
                g1Var = u1Var.N.l(d1Var2.p);
                if (u1Var.J && !u1Var.f4()) {
                    f11 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = u1Var.getPaddingTop();
            } else {
                f7 = 0.10666667f;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    g1Var = ((org.telegram.ui.Cells.w0) view).E0.l(d1Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof mh.c) {
                        f10 += ((mh.c) view).getReactionCenterX();
                        f11 += view.getMeasuredHeight() / 2.0f;
                    }
                    g1Var = null;
                    if (g1Var != null) {
                        Rect rect = g1Var.t;
                        f10 += rect.left;
                        f11 += rect.top;
                    }
                    qnVar = this.e;
                    if (qnVar != null) {
                        f11 += qnVar.za;
                    }
                    d1 d1Var3 = this.x;
                    d1Var3.q = f10;
                    d1Var3.r = f11;
                }
            }
            f11 += paddingTop;
            if (g1Var != null) {
            }
            qnVar = this.e;
            if (qnVar != null) {
            }
            d1 d1Var32 = this.x;
            d1Var32.q = f10;
            d1Var32.r = f11;
        } else {
            f7 = 0.10666667f;
            if (this.c) {
                float f26 = f25 / 2.0f;
                f10 = (getMeasuredWidth() / 2.0f) - f26;
                f11 = (getMeasuredHeight() / 2.0f) - f26;
            } else {
                d1 d1Var4 = this.x;
                f10 = d1Var4.q;
                f11 = d1Var4.r;
            }
        }
        n2 n2Var2 = this.a;
        if (n2Var2 != null && n2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof mh.c)) {
            return;
        }
        float f27 = (view instanceof mh.c ? this.f : this.f - f25) / 2.0f;
        float f28 = f10 - f27;
        float f29 = f11 - f27;
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
        bs bsVar = bs.f;
        float interpolation = bsVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f13 = bs.h.getInterpolation(interpolation);
            f14 = bsVar.getInterpolation(interpolation);
            f12 = 2.0f;
        } else if (this.n) {
            f12 = 2.0f;
            f13 = bs.h.getInterpolation(this.x.g);
            f14 = bsVar.getInterpolation(this.x.g);
        } else {
            f12 = 2.0f;
            f13 = this.x.g;
            f14 = f13;
        }
        float f31 = 1.0f - f13;
        float f32 = (this.r * f31) + f13;
        float f33 = f25 / this.f;
        if (this.h == 1) {
            f32 = 1.0f;
        } else {
            f28 = (f28 * f13) + (this.s * f31);
            f29 = (f29 * f14) + ((1.0f - f14) * this.v);
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
                f28 = (f28 * f34) + (f10 * interpolation);
                f15 = f29 * f34;
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
                this.x.c.setAlpha(f34);
            }
            this.x.e.setTranslationX(f28);
            this.x.e.setTranslationY(f29);
            this.x.e.setScaleX(f32);
            this.x.e.setScaleY(f32);
            super.dispatchDraw(canvas);
            i10 = this.h;
            float f35 = 0.045714285f;
            if (i10 != 1 || this.x.c.G) {
                d1 d1Var5 = this.x;
                f17 = d1Var5.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        d1Var5.g = f17 + 0.045714285f;
                    } else {
                        d1Var5.g = f17 + 0.07272727f;
                    }
                    if (d1Var5.g > 1.0f) {
                        d1Var5.g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                d1 d1Var6 = this.x;
                if (!d1Var6.u || i10 != 0) {
                    if (i10 != 1) {
                        b1 b1Var = d1Var6.c;
                        if (b1Var.G) {
                            if (b1Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        b1 b1Var2 = this.x.b;
                        if (b1Var2.G) {
                            if (b1Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        b1 b1Var3 = this.x.b;
                        if (b1Var3.G) {
                            vj0 lottieAnimation = b1Var3.getImageReceiver().getLottieAnimation();
                            int i15 = 0;
                            while (i15 < this.x.x.size()) {
                                c1 c1Var = (c1) this.x.x.get(i15);
                                float f36 = c1Var.c;
                                if (lottieAnimation != null && lottieAnimation.k0) {
                                    float r10 = this.x.b.getImageReceiver().getLottieAnimation().r();
                                }
                                float f37 = c1Var.d;
                                if (f37 != 1.0f) {
                                    float f38 = f37 + f7;
                                    c1Var.d = f38;
                                    if (f38 > 1.0f) {
                                        c1Var.d = 1.0f;
                                        this.x.x.remove(i15);
                                        i15--;
                                        f19 = f35;
                                        i15++;
                                        f35 = f19;
                                    }
                                }
                                if (f36 < 0.5f) {
                                    x10 = f36 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    x10 = org.telegram.messenger.g0.x(f36, 0.5f, 0.5f, 1.0f);
                                }
                                float f39 = (f20 - f36) * 0.5f;
                                float f40 = (c1Var.f * f36) + f39;
                                float f41 = ((c1Var.g * f36) + f39) - (c1Var.e * x10);
                                float f42 = (1.0f - c1Var.d) * c1Var.h * f36;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f40) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f41) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f43 = dp2;
                                float f44 = f43 / f12;
                                f19 = f35;
                                ((c1) this.x.x.get(i15)).a.setImageCoords(scaleX - f44, scaleY - f44, f43, f43);
                                ((c1) this.x.x.get(i15)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, c1Var.l);
                                canvas.scale(f42, f42, scaleX, scaleY);
                                canvas.rotate(c1Var.j, scaleX, scaleY);
                                ((c1) this.x.x.get(i15)).a.draw(canvas);
                                canvas.restore();
                                float f45 = c1Var.c;
                                if (f45 < 1.0f) {
                                    float f46 = f45 + f19;
                                    c1Var.c = f46;
                                    if (f46 > 1.0f) {
                                        c1Var.c = 1.0f;
                                    }
                                }
                                if (f36 >= 1.0f) {
                                    c1Var.l = a1.g.B(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, c1Var.l);
                                }
                                if (c1Var.k) {
                                    float f47 = c1Var.j;
                                    float f48 = c1Var.i;
                                    float f49 = (f48 / 250.0f) + f47;
                                    c1Var.j = f49;
                                    if (f49 > f48) {
                                        c1Var.k = false;
                                    }
                                } else {
                                    float f50 = c1Var.j;
                                    float f51 = c1Var.i;
                                    float f52 = f50 - (f51 / 250.0f);
                                    c1Var.j = f52;
                                    if (f52 < (-f51)) {
                                        c1Var.k = true;
                                    }
                                }
                                i15++;
                                f35 = f19;
                            }
                        }
                    }
                    invalidate();
                }
            }
            f18 = 0.7f;
            d1 d1Var7 = this.x;
            f21 = d1Var7.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    d1Var7.h = 1.0f;
                } else {
                    d1Var7.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (d1Var7.h > f18) {
                    if (!this.c || i16 != 2) {
                        d1.g();
                    } else if (!d1Var7.A) {
                        d1Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.x.f.i);
                        d1 d1Var8 = this.x.f;
                        d1Var8.z = true;
                        d1Var8.s = true;
                        d1Var8.y = System.currentTimeMillis();
                        this.x.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new b(this, 2));
                    }
                }
                d1 d1Var9 = this.x;
                if (d1Var9.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof u1) {
                            ((u1) view2).N.b(d1Var9.p);
                        } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) view2).E0.b(d1Var9.p);
                        }
                    }
                    this.x.h = 1.0f;
                    if (this.h == 1) {
                        d1.C = null;
                    } else {
                        d1.B = null;
                    }
                    View view3 = this.b;
                    if (view3 != null) {
                        view3.invalidate();
                        View view4 = this.b;
                        if ((view4 instanceof u1) && ((u1) view4).getCurrentMessagesGroup() != null && this.b.getParent() != null) {
                            ((View) this.b.getParent()).invalidate();
                        }
                    }
                    if (!this.c || this.h != 2) {
                        final int i18 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ah.z0
                            public final /* synthetic */ a1 b;

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
        f32 = (this.r * f31) + (f33 * f13);
        f28 = (f10 * f13) + (this.s * f31);
        f15 = (1.0f - f14) * this.v;
        f16 = f11 * f14;
        f29 = f15 + f16;
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
        float f352 = 0.045714285f;
        if (i10 != 1) {
        }
        d1 d1Var52 = this.x;
        f17 = d1Var52.g;
        if (f17 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f18 = 0.7f;
        d1 d1Var72 = this.x;
        f21 = d1Var72.h;
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
            d1 d1Var = this.x;
            if (i10 >= d1Var.x.size()) {
                return;
            }
            ((c1) d1Var.x.get(i10)).a.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            d1 d1Var = this.x;
            if (i10 >= d1Var.x.size()) {
                return;
            }
            ((c1) d1Var.x.get(i10)).a.onDetachedFromWindow();
            i10++;
        }
    }
}
