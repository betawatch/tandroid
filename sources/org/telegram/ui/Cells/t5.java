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
import org.telegram.ui.Components.xq;
import org.telegram.ui.dr0;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.l9 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Context context) {
        super(context);
        this.f = v5Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        addView(l9Var, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, c8.ha.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.ha.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r3.x != r3.z) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Canvas canvas) {
        float f10;
        FrameLayout frameLayout = (FrameLayout) this.c;
        er0 er0Var = (er0) this.f;
        float[] fArr = er0Var.m;
        xh.f fVar = er0Var.j;
        Path path = er0Var.l;
        if (!er0Var.n || er0Var.e == null || er0Var.a == null) {
            return;
        }
        er0Var.i();
        float left = er0Var.o - getLeft();
        float top = er0Var.p - getTop();
        canvas.save();
        float f11 = er0Var.O;
        float f12 = er0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, er0Var.s + left, er0Var.t + top);
        float f14 = er0Var.J;
        float f15 = er0Var.A;
        canvas.translate((f14 * f15) + left, (er0Var.K * f15) + top);
        ImageReceiver imageReceiver = er0Var.g;
        if (imageReceiver != null && imageReceiver.L()) {
            float f16 = er0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                er0Var.B = f17;
                if (f17 > 1.0f) {
                    er0Var.B = 1.0f;
                } else {
                    er0Var.e();
                }
            }
            er0Var.g.setAlpha(er0Var.B);
        }
        float f18 = er0Var.u;
        float f19 = er0Var.v;
        float f20 = er0Var.w;
        float f21 = er0Var.y;
        if (f20 == f21) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        float f22 = f13 < f10 ? 0.0f : f13 < 1.4f ? (f13 - f10) / 0.4f : f10;
        float f23 = er0Var.z;
        float f24 = er0Var.x;
        float f25 = ((f23 - f24) / 2.0f) * f22;
        f18 -= f25;
        float f26 = ((f21 - f20) / 2.0f) * f22;
        f19 -= f26;
        ImageReceiver imageReceiver2 = er0Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.y0(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
        }
        if (er0Var.R) {
            frameLayout.setPivotX(er0Var.s - er0Var.u);
            frameLayout.setPivotY(er0Var.t - er0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((er0Var.J * f13 * er0Var.A) + f18 + left);
            frameLayout.setTranslationY((er0Var.K * f13 * er0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = er0Var.f;
            if (imageReceiver3 != null) {
                if (er0Var.B != f10) {
                    if (imageReceiver3.B() != null || er0Var.f.m() != null || er0Var.g.B() != null || er0Var.g.m() != null) {
                        invalidate();
                    }
                    er0Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = er0Var.g;
                    ImageReceiver imageReceiver5 = er0Var.f;
                    imageReceiver4.y0(imageReceiver5.K0, imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0);
                    er0Var.g.h(canvas, null);
                } else {
                    er0Var.g.y0(imageReceiver3.K0, imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0);
                    er0Var.g.h(canvas, null);
                    if (er0Var.g.B() != null || er0Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (er0Var.i) {
            er0Var.h.setAlpha(er0Var.f.getAlpha());
            er0Var.h.L0(er0Var.f.E());
            ImageReceiver imageReceiver6 = er0Var.h;
            ImageReceiver imageReceiver7 = er0Var.f;
            imageReceiver6.y0(imageReceiver7.K0, imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0);
            er0Var.h.h(canvas, null);
            int[] E = er0Var.f.E();
            float f27 = E[0];
            fArr[1] = f27;
            fArr[0] = f27;
            float f28 = E[1];
            fArr[3] = f28;
            fArr[2] = f28;
            float f29 = E[2];
            fArr[5] = f29;
            fArr[4] = f29;
            float f30 = E[3];
            fArr[7] = f30;
            fArr[6] = f30;
            RectF rectF = org.telegram.messenger.g0.P;
            ImageReceiver imageReceiver8 = er0Var.f;
            rectF.set(imageReceiver8.K0, imageReceiver8.L0, imageReceiver8.y(), er0Var.f.A());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (er0Var.k != null) {
                ImageReceiver imageReceiver9 = er0Var.f;
                canvas.translate(imageReceiver9.K0, imageReceiver9.L0);
                xh.e eVar = er0Var.k;
                t5 t5Var = er0Var.d;
                ImageReceiver imageReceiver10 = er0Var.f;
                eVar.c(canvas, t5Var, (int) imageReceiver10.M0, (int) imageReceiver10.N0, 1.0f, false);
            } else {
                fVar.h(i0.a.o(-1, (int) (er0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                ImageReceiver imageReceiver11 = er0Var.f;
                fVar.setBounds((int) imageReceiver11.K0, (int) imageReceiver11.L0, (int) imageReceiver11.y(), (int) er0Var.f.A());
                fVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        dr0 dr0Var;
        switch (this.a) {
            case 1:
                er0 er0Var = (er0) this.f;
                float[] fArr = er0Var.Q;
                if (er0Var.C == null) {
                    float f11 = er0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        er0Var.P = f12;
                        if (f12 > 1.0f) {
                            er0Var.P = 1.0f;
                        } else {
                            er0Var.e();
                        }
                    }
                }
                float interpolation = xq.f.getInterpolation(er0Var.P) * er0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation == 1.0f || (dr0Var = er0Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f10 = measuredHeight;
                } else {
                    dr0Var.a(fArr);
                    canvas.save();
                    float f14 = 1.0f - interpolation;
                    float f15 = fArr[0] * f14;
                    float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f10 = measuredHeight2;
                    f13 = f15;
                }
                er0Var.c(canvas, 1.0f - interpolation, er0Var.o - getLeft(), er0Var.p - getTop(), f13, f10);
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
                v5 v5Var = (v5) this.f;
                org.telegram.ui.Components.l9 l9Var = this.b;
                if (!l9Var.getImageReceiver().L() || l9Var.getImageReceiver().h1 != 1.0f) {
                    v5Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, l9Var.getMeasuredWidth(), l9Var.getMeasuredHeight(), v5Var.e);
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
    public t5(er0 er0Var, Context context) {
        super(context);
        this.f = er0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new bg.q0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        frameLayout.addView(l9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.ha.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.ha.c(-1.0f, -1));
        addView(frameLayout, c8.ha.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
