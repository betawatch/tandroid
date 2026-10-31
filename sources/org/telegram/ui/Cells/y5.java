package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ps0;
import org.telegram.ui.qs0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.g9 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(a6 a6Var, Context context) {
        super(context);
        this.f = a6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        addView(g9Var, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, w7.b6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f7;
        f7.setTextSize(1, 13.0f);
        f7.setTextColor(-1);
        f7.setSingleLine(true);
        f7.setEllipsize(truncateAt);
        f7.setMaxLines(1);
        f7.setGravity(80);
        linearLayout.addView(f7, w7.b6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r3.x != r3.z) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Canvas canvas) {
        float f7;
        FrameLayout frameLayout = (FrameLayout) this.c;
        qs0 qs0Var = (qs0) this.f;
        float[] fArr = qs0Var.m;
        nh.i iVar = qs0Var.j;
        Path path = qs0Var.l;
        if (!qs0Var.n || qs0Var.e == null || qs0Var.a == null) {
            return;
        }
        qs0Var.i();
        float left = qs0Var.o - getLeft();
        float top = qs0Var.p - getTop();
        canvas.save();
        float f10 = qs0Var.O;
        float f11 = qs0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, qs0Var.s + left, qs0Var.t + top);
        float f13 = qs0Var.J;
        float f14 = qs0Var.A;
        canvas.translate((f13 * f14) + left, (qs0Var.K * f14) + top);
        ImageReceiver imageReceiver = qs0Var.g;
        if (imageReceiver != null && imageReceiver.L()) {
            float f15 = qs0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                qs0Var.B = f16;
                if (f16 > 1.0f) {
                    qs0Var.B = 1.0f;
                } else {
                    qs0Var.e();
                }
            }
            qs0Var.g.setAlpha(qs0Var.B);
        }
        float f17 = qs0Var.u;
        float f18 = qs0Var.v;
        float f19 = qs0Var.w;
        float f20 = qs0Var.y;
        if (f19 == f20) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
        }
        float f21 = f12 < f7 ? 0.0f : f12 < 1.4f ? (f12 - f7) / 0.4f : f7;
        float f22 = qs0Var.z;
        float f23 = qs0Var.x;
        float f24 = ((f22 - f23) / 2.0f) * f21;
        f17 -= f24;
        float f25 = ((f20 - f19) / 2.0f) * f21;
        f18 -= f25;
        ImageReceiver imageReceiver2 = qs0Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.y0(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
        }
        if (qs0Var.R) {
            frameLayout.setPivotX(qs0Var.s - qs0Var.u);
            frameLayout.setPivotY(qs0Var.t - qs0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((qs0Var.J * f12 * qs0Var.A) + f17 + left);
            frameLayout.setTranslationY((qs0Var.K * f12 * qs0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = qs0Var.f;
            if (imageReceiver3 != null) {
                if (qs0Var.B != f7) {
                    if (imageReceiver3.B() != null || qs0Var.f.m() != null || qs0Var.g.B() != null || qs0Var.g.m() != null) {
                        invalidate();
                    }
                    qs0Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = qs0Var.g;
                    ImageReceiver imageReceiver5 = qs0Var.f;
                    imageReceiver4.y0(imageReceiver5.K0, imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0);
                    qs0Var.g.h(canvas, null);
                } else {
                    qs0Var.g.y0(imageReceiver3.K0, imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0);
                    qs0Var.g.h(canvas, null);
                    if (qs0Var.g.B() != null || qs0Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (qs0Var.i) {
            qs0Var.h.setAlpha(qs0Var.f.getAlpha());
            qs0Var.h.L0(qs0Var.f.E());
            ImageReceiver imageReceiver6 = qs0Var.h;
            ImageReceiver imageReceiver7 = qs0Var.f;
            imageReceiver6.y0(imageReceiver7.K0, imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0);
            qs0Var.h.h(canvas, null);
            int[] E = qs0Var.f.E();
            float f26 = E[0];
            fArr[1] = f26;
            fArr[0] = f26;
            float f27 = E[1];
            fArr[3] = f27;
            fArr[2] = f27;
            float f28 = E[2];
            fArr[5] = f28;
            fArr[4] = f28;
            float f29 = E[3];
            fArr[7] = f29;
            fArr[6] = f29;
            RectF rectF = org.telegram.messenger.i0.P;
            ImageReceiver imageReceiver8 = qs0Var.f;
            rectF.set(imageReceiver8.K0, imageReceiver8.L0, imageReceiver8.y(), qs0Var.f.A());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (qs0Var.k != null) {
                ImageReceiver imageReceiver9 = qs0Var.f;
                canvas.translate(imageReceiver9.K0, imageReceiver9.L0);
                nh.h hVar = qs0Var.k;
                y5 y5Var = qs0Var.d;
                ImageReceiver imageReceiver10 = qs0Var.f;
                hVar.c(canvas, y5Var, (int) imageReceiver10.M0, (int) imageReceiver10.N0, 1.0f, false);
            } else {
                iVar.h(i0.b.o(-1, (int) (qs0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                ImageReceiver imageReceiver11 = qs0Var.f;
                iVar.setBounds((int) imageReceiver11.K0, (int) imageReceiver11.L0, (int) imageReceiver11.y(), (int) qs0Var.f.A());
                iVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f7;
        ps0 ps0Var;
        switch (this.a) {
            case 1:
                qs0 qs0Var = (qs0) this.f;
                float[] fArr = qs0Var.Q;
                if (qs0Var.C == null) {
                    float f10 = qs0Var.P;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.07272727f;
                        qs0Var.P = f11;
                        if (f11 > 1.0f) {
                            qs0Var.P = 1.0f;
                        } else {
                            qs0Var.e();
                        }
                    }
                }
                float interpolation = gr.f.getInterpolation(qs0Var.P) * qs0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f12 = 0.0f;
                if (interpolation == 1.0f || (ps0Var = qs0Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f7 = measuredHeight;
                } else {
                    ps0Var.a(fArr);
                    canvas.save();
                    float f13 = 1.0f - interpolation;
                    float f14 = fArr[0] * f13;
                    float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f7 = measuredHeight2;
                    f12 = f14;
                }
                qs0Var.c(canvas, 1.0f - interpolation, qs0Var.o - getLeft(), qs0Var.p - getTop(), f12, f7);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                a6 a6Var = (a6) this.f;
                org.telegram.ui.Components.g9 g9Var = this.b;
                if (!g9Var.getImageReceiver().L() || g9Var.getImageReceiver().h1 != 1.0f) {
                    a6Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, g9Var.getMeasuredWidth(), g9Var.getMeasuredHeight(), a6Var.e);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(qs0 qs0Var, Context context) {
        super(context);
        this.f = qs0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new bi.d2(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        frameLayout.addView(g9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.k4 k4Var = new org.telegram.ui.k4(context);
        this.e = k4Var;
        k4Var.setBackgroundColor(0);
        frameLayout.addView(k4Var, w7.b6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        k4Var.addView(textureView, w7.b6.c(-1.0f, -1));
        addView(frameLayout, w7.b6.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
