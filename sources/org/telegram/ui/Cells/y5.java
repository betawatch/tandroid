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
import org.telegram.messenger.a30;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.os0;
import org.telegram.ui.ps0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        TextView f7 = a30.f(linearLayout, textView, w7.b6.m(1.0f, 0, -1, 8, 0, 5), context);
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
        ps0 ps0Var = (ps0) this.f;
        float[] fArr = ps0Var.m;
        nh.i iVar = ps0Var.j;
        Path path = ps0Var.l;
        if (!ps0Var.n || ps0Var.e == null || ps0Var.a == null) {
            return;
        }
        ps0Var.i();
        float left = ps0Var.o - getLeft();
        float top = ps0Var.p - getTop();
        canvas.save();
        float f10 = ps0Var.O;
        float f11 = ps0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, ps0Var.s + left, ps0Var.t + top);
        float f13 = ps0Var.J;
        float f14 = ps0Var.A;
        canvas.translate((f13 * f14) + left, (ps0Var.K * f14) + top);
        ImageReceiver imageReceiver = ps0Var.g;
        if (imageReceiver != null && imageReceiver.L()) {
            float f15 = ps0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                ps0Var.B = f16;
                if (f16 > 1.0f) {
                    ps0Var.B = 1.0f;
                } else {
                    ps0Var.e();
                }
            }
            ps0Var.g.setAlpha(ps0Var.B);
        }
        float f17 = ps0Var.u;
        float f18 = ps0Var.v;
        float f19 = ps0Var.w;
        float f20 = ps0Var.y;
        if (f19 == f20) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
        }
        float f21 = f12 < f7 ? 0.0f : f12 < 1.4f ? (f12 - f7) / 0.4f : f7;
        float f22 = ps0Var.z;
        float f23 = ps0Var.x;
        float f24 = ((f22 - f23) / 2.0f) * f21;
        f17 -= f24;
        float f25 = ((f20 - f19) / 2.0f) * f21;
        f18 -= f25;
        ImageReceiver imageReceiver2 = ps0Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.y0(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
        }
        if (ps0Var.R) {
            frameLayout.setPivotX(ps0Var.s - ps0Var.u);
            frameLayout.setPivotY(ps0Var.t - ps0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((ps0Var.J * f12 * ps0Var.A) + f17 + left);
            frameLayout.setTranslationY((ps0Var.K * f12 * ps0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = ps0Var.f;
            if (imageReceiver3 != null) {
                if (ps0Var.B != f7) {
                    if (imageReceiver3.B() != null || ps0Var.f.m() != null || ps0Var.g.B() != null || ps0Var.g.m() != null) {
                        invalidate();
                    }
                    ps0Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = ps0Var.g;
                    ImageReceiver imageReceiver5 = ps0Var.f;
                    imageReceiver4.y0(imageReceiver5.K0, imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0);
                    ps0Var.g.h(canvas, null);
                } else {
                    ps0Var.g.y0(imageReceiver3.K0, imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0);
                    ps0Var.g.h(canvas, null);
                    if (ps0Var.g.B() != null || ps0Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ps0Var.i) {
            ps0Var.h.setAlpha(ps0Var.f.getAlpha());
            ps0Var.h.L0(ps0Var.f.E());
            ImageReceiver imageReceiver6 = ps0Var.h;
            ImageReceiver imageReceiver7 = ps0Var.f;
            imageReceiver6.y0(imageReceiver7.K0, imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0);
            ps0Var.h.h(canvas, null);
            int[] E = ps0Var.f.E();
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
            ImageReceiver imageReceiver8 = ps0Var.f;
            rectF.set(imageReceiver8.K0, imageReceiver8.L0, imageReceiver8.y(), ps0Var.f.A());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ps0Var.k != null) {
                ImageReceiver imageReceiver9 = ps0Var.f;
                canvas.translate(imageReceiver9.K0, imageReceiver9.L0);
                nh.h hVar = ps0Var.k;
                y5 y5Var = ps0Var.d;
                ImageReceiver imageReceiver10 = ps0Var.f;
                hVar.c(canvas, y5Var, (int) imageReceiver10.M0, (int) imageReceiver10.N0, 1.0f, false);
            } else {
                iVar.h(i0.b.o(-1, (int) (ps0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                ImageReceiver imageReceiver11 = ps0Var.f;
                iVar.setBounds((int) imageReceiver11.K0, (int) imageReceiver11.L0, (int) imageReceiver11.y(), (int) ps0Var.f.A());
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
        os0 os0Var;
        switch (this.a) {
            case 1:
                ps0 ps0Var = (ps0) this.f;
                float[] fArr = ps0Var.Q;
                if (ps0Var.C == null) {
                    float f10 = ps0Var.P;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.07272727f;
                        ps0Var.P = f11;
                        if (f11 > 1.0f) {
                            ps0Var.P = 1.0f;
                        } else {
                            ps0Var.e();
                        }
                    }
                }
                float interpolation = gr.f.getInterpolation(ps0Var.P) * ps0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f12 = 0.0f;
                if (interpolation == 1.0f || (os0Var = ps0Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f7 = measuredHeight;
                } else {
                    os0Var.a(fArr);
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
                ps0Var.c(canvas, 1.0f - interpolation, ps0Var.o - getLeft(), ps0Var.p - getTop(), f12, f7);
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
    public y5(ps0 ps0Var, Context context) {
        super(context);
        this.f = ps0Var;
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
