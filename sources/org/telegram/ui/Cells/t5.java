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
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
import org.telegram.ui.cr0;
import org.telegram.ui.dr0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.i9 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(v5 v5Var, Context context) {
        super(context);
        this.f = v5Var;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.b = i9Var;
        addView(i9Var, c8.ja.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, c8.ja.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.ja.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
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
        dr0 dr0Var = (dr0) this.f;
        float[] fArr = dr0Var.m;
        xh.f fVar = dr0Var.j;
        Path path = dr0Var.l;
        if (!dr0Var.n || dr0Var.e == null || dr0Var.a == null) {
            return;
        }
        dr0Var.i();
        float left = dr0Var.o - getLeft();
        float top = dr0Var.p - getTop();
        canvas.save();
        float f11 = dr0Var.O;
        float f12 = dr0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, dr0Var.s + left, dr0Var.t + top);
        float f14 = dr0Var.J;
        float f15 = dr0Var.A;
        canvas.translate((f14 * f15) + left, (dr0Var.K * f15) + top);
        ImageReceiver imageReceiver = dr0Var.g;
        if (imageReceiver != null && imageReceiver.L()) {
            float f16 = dr0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                dr0Var.B = f17;
                if (f17 > 1.0f) {
                    dr0Var.B = 1.0f;
                } else {
                    dr0Var.e();
                }
            }
            dr0Var.g.setAlpha(dr0Var.B);
        }
        float f18 = dr0Var.u;
        float f19 = dr0Var.v;
        float f20 = dr0Var.w;
        float f21 = dr0Var.y;
        if (f20 == f21) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        float f22 = f13 < f10 ? 0.0f : f13 < 1.4f ? (f13 - f10) / 0.4f : f10;
        float f23 = dr0Var.z;
        float f24 = dr0Var.x;
        float f25 = ((f23 - f24) / 2.0f) * f22;
        f18 -= f25;
        float f26 = ((f21 - f20) / 2.0f) * f22;
        f19 -= f26;
        ImageReceiver imageReceiver2 = dr0Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.y0(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
        }
        if (dr0Var.R) {
            frameLayout.setPivotX(dr0Var.s - dr0Var.u);
            frameLayout.setPivotY(dr0Var.t - dr0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((dr0Var.J * f13 * dr0Var.A) + f18 + left);
            frameLayout.setTranslationY((dr0Var.K * f13 * dr0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = dr0Var.f;
            if (imageReceiver3 != null) {
                if (dr0Var.B != f10) {
                    if (imageReceiver3.B() != null || dr0Var.f.m() != null || dr0Var.g.B() != null || dr0Var.g.m() != null) {
                        invalidate();
                    }
                    dr0Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = dr0Var.g;
                    ImageReceiver imageReceiver5 = dr0Var.f;
                    imageReceiver4.y0(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0, imageReceiver5.O0);
                    dr0Var.g.h(canvas, null);
                } else {
                    dr0Var.g.y0(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0, imageReceiver3.O0);
                    dr0Var.g.h(canvas, null);
                    if (dr0Var.g.B() != null || dr0Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (dr0Var.i) {
            dr0Var.h.setAlpha(dr0Var.f.getAlpha());
            dr0Var.h.L0(dr0Var.f.E());
            ImageReceiver imageReceiver6 = dr0Var.h;
            ImageReceiver imageReceiver7 = dr0Var.f;
            imageReceiver6.y0(imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0, imageReceiver7.O0);
            dr0Var.h.h(canvas, null);
            int[] E = dr0Var.f.E();
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
            ImageReceiver imageReceiver8 = dr0Var.f;
            rectF.set(imageReceiver8.L0, imageReceiver8.M0, imageReceiver8.y(), dr0Var.f.A());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (dr0Var.k != null) {
                ImageReceiver imageReceiver9 = dr0Var.f;
                canvas.translate(imageReceiver9.L0, imageReceiver9.M0);
                xh.e eVar = dr0Var.k;
                t5 t5Var = dr0Var.d;
                ImageReceiver imageReceiver10 = dr0Var.f;
                eVar.c(canvas, t5Var, (int) imageReceiver10.N0, (int) imageReceiver10.O0, 1.0f, false);
            } else {
                fVar.h(i0.a.o(-1, (int) (dr0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                ImageReceiver imageReceiver11 = dr0Var.f;
                fVar.setBounds((int) imageReceiver11.L0, (int) imageReceiver11.M0, (int) imageReceiver11.y(), (int) dr0Var.f.A());
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
        cr0 cr0Var;
        switch (this.a) {
            case 1:
                dr0 dr0Var = (dr0) this.f;
                float[] fArr = dr0Var.Q;
                if (dr0Var.C == null) {
                    float f11 = dr0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        dr0Var.P = f12;
                        if (f12 > 1.0f) {
                            dr0Var.P = 1.0f;
                        } else {
                            dr0Var.e();
                        }
                    }
                }
                float interpolation = er.f.getInterpolation(dr0Var.P) * dr0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation == 1.0f || (cr0Var = dr0Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f10 = measuredHeight;
                } else {
                    cr0Var.a(fArr);
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
                dr0Var.c(canvas, 1.0f - interpolation, dr0Var.o - getLeft(), dr0Var.p - getTop(), f13, f10);
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
                org.telegram.ui.Components.i9 i9Var = this.b;
                if (!i9Var.getImageReceiver().L() || i9Var.getImageReceiver().i1 != 1.0f) {
                    v5Var.e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, i9Var.getMeasuredWidth(), i9Var.getMeasuredHeight(), v5Var.e);
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
    public t5(dr0 dr0Var, Context context) {
        super(context);
        this.f = dr0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new bg.p0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.b = i9Var;
        frameLayout.addView(i9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.ja.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.ja.c(-1.0f, -1));
        addView(frameLayout, c8.ja.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
