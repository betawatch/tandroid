package bh;

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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.rj;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p0 extends FrameLayout {
    public final /* synthetic */ r2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ wn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ x0 w;
    public final /* synthetic */ s0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, Context context, r2 r2Var, View view, boolean z10, MessageObject messageObject, wn wnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, x0 x0Var) {
        super(context);
        this.x = s0Var;
        this.a = r2Var;
        this.b = view;
        this.c = z10;
        this.d = messageObject;
        this.e = wnVar;
        this.f = i10;
        this.h = i11;
        this.n = z11;
        this.r = f7;
        this.s = f10;
        this.v = f11;
        this.w = x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x037a, code lost:
    
        if (r23.x.c.getImageReceiver().getLottieAnimation().k0 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0394, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r23.x.y) <= 2000) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0540, code lost:
    
        if (((int) org.telegram.messenger.wh.w(r23.x.b.getImageReceiver().getLottieAnimation().a0, r23.x.b.getImageReceiver().getLottieAnimation().e[0], r8, r8)) < r6.b) goto L262;
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
        float y3;
        float f21;
        v0 v0Var;
        int paddingTop;
        wn wnVar;
        MessageObject messageObject;
        s0 s0Var = this.x;
        if (s0Var.l) {
            float f22 = s0Var.m;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.10666667f;
                s0Var.m = f23;
                if (f23 > 1.0f) {
                    s0Var.m = 1.0f;
                    final int i11 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bh.o0
                        public final /* synthetic */ p0 b;

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
        if (!s0Var.s) {
            invalidate();
            return;
        }
        el0 el0Var = s0Var.t;
        if (el0Var != null) {
            el0Var.a.setAlpha(0.0f);
            this.x.t.c.setAlpha(0.0f);
        }
        r2 r2Var = this.a;
        if (r2Var instanceof wn) {
            wn wnVar2 = (wn) r2Var;
            int i12 = this.x.n;
            rj rjVar = wnVar2.x0;
            if (rjVar != null) {
                int childCount = rjVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    view = wnVar2.x0.getChildAt(i13);
                    if (view instanceof s1) {
                        messageObject = ((s1) view).getMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.v0) {
                        messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
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
            s0 s0Var2 = this.x;
            int[] iArr = s0Var2.j;
            f10 = iArr[0];
            f11 = iArr[1];
            if (view instanceof s1) {
                s1 s1Var = (s1) view;
                f7 = 0.10666667f;
                v0Var = s1Var.N.l(s0Var2.p);
                if (s1Var.J && !s1Var.h4()) {
                    f11 += AndroidUtilities.dp(2.0f);
                }
                paddingTop = s1Var.getPaddingTop();
            } else {
                f7 = 0.10666667f;
                if (view instanceof org.telegram.ui.Cells.v0) {
                    v0Var = ((org.telegram.ui.Cells.v0) view).E0.l(s0Var2.p);
                    paddingTop = view.getPaddingTop();
                } else {
                    if (view instanceof nh.c) {
                        f10 += ((nh.c) view).getReactionCenterX();
                        f11 += view.getMeasuredHeight() / 2.0f;
                    }
                    v0Var = null;
                    if (v0Var != null) {
                        Rect rect = v0Var.t;
                        f10 += rect.left;
                        f11 += rect.top;
                    }
                    wnVar = this.e;
                    if (wnVar != null) {
                        f11 += wnVar.Pa;
                    }
                    s0 s0Var3 = this.x;
                    s0Var3.q = f10;
                    s0Var3.r = f11;
                }
            }
            f11 += paddingTop;
            if (v0Var != null) {
            }
            wnVar = this.e;
            if (wnVar != null) {
            }
            s0 s0Var32 = this.x;
            s0Var32.q = f10;
            s0Var32.r = f11;
        } else {
            f7 = 0.10666667f;
            if (this.c) {
                float f26 = f25 / 2.0f;
                f10 = (getMeasuredWidth() / 2.0f) - f26;
                f11 = (getMeasuredHeight() / 2.0f) - f26;
            } else {
                s0 s0Var4 = this.x;
                f10 = s0Var4.q;
                f11 = s0Var4.r;
            }
        }
        r2 r2Var2 = this.a;
        if (r2Var2 != null && r2Var2.getParentActivity() != null && this.a.getFragmentView() != null && this.a.getFragmentView().getParent() != null && this.a.getFragmentView().getVisibility() == 0 && this.a.getFragmentView() != null) {
            this.a.getFragmentView().getLocationOnScreen(this.x.j);
            setAlpha(((View) this.a.getFragmentView().getParent()).getAlpha());
        } else if (!this.c && !(view instanceof nh.c)) {
            return;
        }
        float f27 = (view instanceof nh.c ? this.f : this.f - f25) / 2.0f;
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
        ds dsVar = ds.f;
        float interpolation = dsVar.getInterpolation(this.x.h);
        if (this.h == 2) {
            f13 = ds.h.getInterpolation(interpolation);
            f14 = dsVar.getInterpolation(interpolation);
            f12 = 2.0f;
        } else if (this.n) {
            f12 = 2.0f;
            f13 = ds.h.getInterpolation(this.x.g);
            f14 = dsVar.getInterpolation(this.x.g);
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
                s0 s0Var5 = this.x;
                f17 = s0Var5.g;
                if (f17 != 1.0f) {
                    if (this.n) {
                        s0Var5.g = f17 + 0.045714285f;
                    } else {
                        s0Var5.g = f17 + 0.07272727f;
                    }
                    if (s0Var5.g > 1.0f) {
                        s0Var5.g = 1.0f;
                    }
                }
            }
            if (i10 != 2) {
                s0 s0Var6 = this.x;
                if (!s0Var6.u || i10 != 0) {
                    if (i10 != 1) {
                        q0 q0Var = s0Var6.c;
                        if (q0Var.G) {
                            if (q0Var.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                        f18 = 0.7f;
                    } else {
                        f18 = 0.7f;
                    }
                    if (this.h == 1) {
                        q0 q0Var2 = this.x.b;
                        if (q0Var2.G) {
                            if (q0Var2.getImageReceiver().getLottieAnimation() != null) {
                            }
                        }
                    }
                    if (this.w.g != 0) {
                    }
                    if (!this.x.x.isEmpty()) {
                        q0 q0Var3 = this.x.b;
                        if (q0Var3.G) {
                            yj0 lottieAnimation = q0Var3.getImageReceiver().getLottieAnimation();
                            int i15 = 0;
                            while (i15 < this.x.x.size()) {
                                r0 r0Var = (r0) this.x.x.get(i15);
                                float f36 = r0Var.c;
                                if (lottieAnimation != null && lottieAnimation.k0) {
                                    float r6 = this.x.b.getImageReceiver().getLottieAnimation().r();
                                }
                                float f37 = r0Var.d;
                                if (f37 != 1.0f) {
                                    float f38 = f37 + f7;
                                    r0Var.d = f38;
                                    if (f38 > 1.0f) {
                                        r0Var.d = 1.0f;
                                        this.x.x.remove(i15);
                                        i15--;
                                        f19 = f35;
                                        i15++;
                                        f35 = f19;
                                    }
                                }
                                if (f36 < 0.5f) {
                                    y3 = f36 / 0.5f;
                                    f20 = 1.0f;
                                } else {
                                    f20 = 1.0f;
                                    y3 = org.telegram.messenger.t.y(f36, 0.5f, 0.5f, 1.0f);
                                }
                                float f39 = (f20 - f36) * 0.5f;
                                float f40 = (r0Var.f * f36) + f39;
                                float f41 = ((r0Var.g * f36) + f39) - (r0Var.e * y3);
                                float f42 = (1.0f - r0Var.d) * r0Var.h * f36;
                                float scaleX = (this.x.b.getScaleX() * this.x.b.getWidth() * f40) + this.x.b.getX();
                                float scaleY = (this.x.b.getScaleY() * this.x.b.getHeight() * f41) + this.x.b.getY();
                                int dp2 = AndroidUtilities.dp(16.0f);
                                float f43 = dp2;
                                float f44 = f43 / f12;
                                f19 = f35;
                                ((r0) this.x.x.get(i15)).a.setImageCoords(scaleX - f44, scaleY - f44, f43, f43);
                                ((r0) this.x.x.get(i15)).a.setRoundRadius(dp2 >> 1);
                                canvas.save();
                                canvas.translate(0.0f, r0Var.l);
                                canvas.scale(f42, f42, scaleX, scaleY);
                                canvas.rotate(r0Var.j, scaleX, scaleY);
                                ((r0) this.x.x.get(i15)).a.draw(canvas);
                                canvas.restore();
                                float f45 = r0Var.c;
                                if (f45 < 1.0f) {
                                    float f46 = f45 + f19;
                                    r0Var.c = f46;
                                    if (f46 > 1.0f) {
                                        r0Var.c = 1.0f;
                                    }
                                }
                                if (f36 >= 1.0f) {
                                    r0Var.l = a1.g.C(AndroidUtilities.dp(20.0f), 16.0f, 500.0f, r0Var.l);
                                }
                                if (r0Var.k) {
                                    float f47 = r0Var.j;
                                    float f48 = r0Var.i;
                                    float f49 = (f48 / 250.0f) + f47;
                                    r0Var.j = f49;
                                    if (f49 > f48) {
                                        r0Var.k = false;
                                    }
                                } else {
                                    float f50 = r0Var.j;
                                    float f51 = r0Var.i;
                                    float f52 = f50 - (f51 / 250.0f);
                                    r0Var.j = f52;
                                    if (f52 < (-f51)) {
                                        r0Var.k = true;
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
            s0 s0Var7 = this.x;
            f21 = s0Var7.h;
            if (f21 != 1.0f) {
                int i16 = this.h;
                if (i16 == 1) {
                    s0Var7.h = 1.0f;
                } else {
                    s0Var7.h = (16.0f / (i16 == 2 ? 350.0f : 220.0f)) + f21;
                }
                if (s0Var7.h > f18) {
                    if (!this.c || i16 != 2) {
                        s0.g();
                    } else if (!s0Var7.A) {
                        s0Var7.A = true;
                        try {
                            performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        ((ViewGroup) getParent()).addView(this.x.f.i);
                        s0 s0Var8 = this.x.f;
                        s0Var8.z = true;
                        s0Var8.s = true;
                        s0Var8.y = System.currentTimeMillis();
                        this.x.f.i.setTag(R.id.parent_tag, 1);
                        animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(1000L).setDuration(150L).setListener(new b(this, 3));
                    }
                }
                s0 s0Var9 = this.x;
                if (s0Var9.h >= 1.0f) {
                    int i17 = this.h;
                    if (i17 == 0 || i17 == 2) {
                        View view2 = this.b;
                        if (view2 instanceof s1) {
                            ((s1) view2).N.b(s0Var9.p);
                        } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) view2).E0.b(s0Var9.p);
                        }
                    }
                    this.x.h = 1.0f;
                    if (this.h == 1) {
                        s0.C = null;
                    } else {
                        s0.B = null;
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
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: bh.o0
                            public final /* synthetic */ p0 b;

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
        s0 s0Var52 = this.x;
        f17 = s0Var52.g;
        if (f17 != 1.0f) {
        }
        if (i10 != 2) {
        }
        f18 = 0.7f;
        s0 s0Var72 = this.x;
        f21 = s0Var72.h;
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
            s0 s0Var = this.x;
            if (i10 >= s0Var.x.size()) {
                return;
            }
            ((r0) s0Var.x.get(i10)).a.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            s0 s0Var = this.x;
            if (i10 >= s0Var.x.size()) {
                return;
            }
            ((r0) s0Var.x.get(i10)).a.onDetachedFromWindow();
            i10++;
        }
    }
}
