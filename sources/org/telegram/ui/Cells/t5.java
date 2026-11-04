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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.xq;
import org.telegram.ui.uq0;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.k9 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Context context) {
        super(context);
        this.f = v5Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        addView(k9Var, mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, mf.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, mf.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
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
        vq0 vq0Var = (vq0) this.f;
        float[] fArr = vq0Var.m;
        yh.f fVar = vq0Var.j;
        Path path = vq0Var.l;
        if (!vq0Var.n || vq0Var.e == null || vq0Var.a == null) {
            return;
        }
        vq0Var.i();
        float left = vq0Var.o - getLeft();
        float top = vq0Var.p - getTop();
        canvas.save();
        float f11 = vq0Var.O;
        float f12 = vq0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, vq0Var.s + left, vq0Var.t + top);
        float f14 = vq0Var.J;
        float f15 = vq0Var.A;
        canvas.translate((f14 * f15) + left, (vq0Var.K * f15) + top);
        ImageReceiver imageReceiver = vq0Var.g;
        if (imageReceiver != null && imageReceiver.L()) {
            float f16 = vq0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                vq0Var.B = f17;
                if (f17 > 1.0f) {
                    vq0Var.B = 1.0f;
                } else {
                    vq0Var.e();
                }
            }
            vq0Var.g.setAlpha(vq0Var.B);
        }
        float f18 = vq0Var.u;
        float f19 = vq0Var.v;
        float f20 = vq0Var.w;
        float f21 = vq0Var.y;
        if (f20 == f21) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        float f22 = f13 < f10 ? 0.0f : f13 < 1.4f ? (f13 - f10) / 0.4f : f10;
        float f23 = vq0Var.z;
        float f24 = vq0Var.x;
        float f25 = ((f23 - f24) / 2.0f) * f22;
        f18 -= f25;
        float f26 = ((f21 - f20) / 2.0f) * f22;
        f19 -= f26;
        ImageReceiver imageReceiver2 = vq0Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.y0(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
        }
        if (vq0Var.R) {
            frameLayout.setPivotX(vq0Var.s - vq0Var.u);
            frameLayout.setPivotY(vq0Var.t - vq0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((vq0Var.J * f13 * vq0Var.A) + f18 + left);
            frameLayout.setTranslationY((vq0Var.K * f13 * vq0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = vq0Var.f;
            if (imageReceiver3 != null) {
                if (vq0Var.B != f10) {
                    if (imageReceiver3.B() != null || vq0Var.f.m() != null || vq0Var.g.B() != null || vq0Var.g.m() != null) {
                        invalidate();
                    }
                    vq0Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = vq0Var.g;
                    ImageReceiver imageReceiver5 = vq0Var.f;
                    imageReceiver4.y0(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0, imageReceiver5.O0);
                    vq0Var.g.h(canvas, null);
                } else {
                    vq0Var.g.y0(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0, imageReceiver3.O0);
                    vq0Var.g.h(canvas, null);
                    if (vq0Var.g.B() != null || vq0Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (vq0Var.i) {
            vq0Var.h.setAlpha(vq0Var.f.getAlpha());
            vq0Var.h.L0(vq0Var.f.E());
            ImageReceiver imageReceiver6 = vq0Var.h;
            ImageReceiver imageReceiver7 = vq0Var.f;
            imageReceiver6.y0(imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0, imageReceiver7.O0);
            vq0Var.h.h(canvas, null);
            int[] E = vq0Var.f.E();
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
            ImageReceiver imageReceiver8 = vq0Var.f;
            rectF.set(imageReceiver8.L0, imageReceiver8.M0, imageReceiver8.y(), vq0Var.f.A());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (vq0Var.k != null) {
                ImageReceiver imageReceiver9 = vq0Var.f;
                canvas.translate(imageReceiver9.L0, imageReceiver9.M0);
                yh.e eVar = vq0Var.k;
                t5 t5Var = vq0Var.d;
                ImageReceiver imageReceiver10 = vq0Var.f;
                eVar.c(canvas, t5Var, (int) imageReceiver10.N0, (int) imageReceiver10.O0, 1.0f, false);
            } else {
                fVar.h(i0.a.o(-1, (int) (vq0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                ImageReceiver imageReceiver11 = vq0Var.f;
                fVar.setBounds((int) imageReceiver11.L0, (int) imageReceiver11.M0, (int) imageReceiver11.y(), (int) vq0Var.f.A());
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
        uq0 uq0Var;
        switch (this.a) {
            case 1:
                vq0 vq0Var = (vq0) this.f;
                float[] fArr = vq0Var.Q;
                if (vq0Var.C == null) {
                    float f11 = vq0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        vq0Var.P = f12;
                        if (f12 > 1.0f) {
                            vq0Var.P = 1.0f;
                        } else {
                            vq0Var.e();
                        }
                    }
                }
                float interpolation = xq.f.getInterpolation(vq0Var.P) * vq0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation == 1.0f || (uq0Var = vq0Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f10 = measuredHeight;
                } else {
                    uq0Var.a(fArr);
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
                vq0Var.c(canvas, 1.0f - interpolation, vq0Var.o - getLeft(), vq0Var.p - getTop(), f13, f10);
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
                org.telegram.ui.Components.k9 k9Var = this.b;
                if (!k9Var.getImageReceiver().L() || k9Var.getImageReceiver().i1 != 1.0f) {
                    v5Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, k9Var.getMeasuredWidth(), k9Var.getMeasuredHeight(), v5Var.e);
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
    public t5(vq0 vq0Var, Context context) {
        super(context);
        this.f = vq0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new cg.p0(24));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        frameLayout.addView(k9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(context);
        this.e = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, mf.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, mf.c(-1.0f, -1));
        addView(frameLayout, mf.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
