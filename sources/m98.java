// default package

import android.content.Context;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m98 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final de0 b;
    public final View c;
    public final View d;
    public final View e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m98(o98 o98Var, Context context) {
        super(context);
        this.f = o98Var;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        addView(de0Var, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, tre.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = ik8.m(linearLayout, textView, tre.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, tre.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r3.x != r3.z) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        FrameLayout frameLayout = (FrameLayout) this.c;
        de8 de8Var = (de8) this.f;
        float[] fArr = de8Var.m;
        npa npaVar = de8Var.j;
        Path path = de8Var.l;
        if (!de8Var.n || de8Var.e == null || de8Var.a == null) {
            return;
        }
        de8Var.h();
        float left = de8Var.o - getLeft();
        float top = de8Var.p - getTop();
        canvas.save();
        float f2 = de8Var.O;
        float f3 = de8Var.A;
        float f4 = ((f2 * f3) + 1.0f) - f3;
        canvas.scale(f4, f4, de8Var.s + left, de8Var.t + top);
        float f5 = de8Var.J;
        float f6 = de8Var.A;
        canvas.translate((f5 * f6) + left, (de8Var.K * f6) + top);
        ImageReceiver imageReceiver = de8Var.g;
        if (imageReceiver != null && imageReceiver.E()) {
            float f7 = de8Var.B;
            if (f7 != 1.0f) {
                float f8 = f7 + 0.10666667f;
                de8Var.B = f8;
                if (f8 > 1.0f) {
                    de8Var.B = 1.0f;
                } else {
                    de8Var.e();
                }
            }
            de8Var.g.setAlpha(de8Var.B);
        }
        float f9 = de8Var.u;
        float f10 = de8Var.v;
        float f11 = de8Var.w;
        float f12 = de8Var.y;
        if (f11 == f12) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        float f13 = f4 < f ? 0.0f : f4 < 1.4f ? (f4 - f) / 0.4f : f;
        float f14 = de8Var.z;
        float f15 = de8Var.x;
        float f16 = ((f14 - f15) / 2.0f) * f13;
        f9 -= f16;
        float f17 = ((f12 - f11) / 2.0f) * f13;
        f10 -= f17;
        ImageReceiver imageReceiver2 = de8Var.f;
        if (imageReceiver2 != null) {
            imageReceiver2.i0(f9, f10, (f16 * 2.0f) + f15, (f17 * 2.0f) + f11);
        }
        if (de8Var.R) {
            frameLayout.setPivotX(de8Var.s - de8Var.u);
            frameLayout.setPivotY(de8Var.t - de8Var.v);
            frameLayout.setScaleY(f4);
            frameLayout.setScaleX(f4);
            frameLayout.setTranslationX((de8Var.J * f4 * de8Var.A) + f9 + left);
            frameLayout.setTranslationY((de8Var.K * f4 * de8Var.A) + f10 + top);
        } else {
            ImageReceiver imageReceiver3 = de8Var.f;
            if (imageReceiver3 != null) {
                if (de8Var.B != f) {
                    if (imageReceiver3.y() != null || de8Var.f.m() != null || de8Var.g.y() != null || de8Var.g.m() != null) {
                        invalidate();
                    }
                    de8Var.f.h(canvas, null);
                    ImageReceiver imageReceiver4 = de8Var.g;
                    ImageReceiver imageReceiver5 = de8Var.f;
                    imageReceiver4.i0(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.N0, imageReceiver5.O0);
                    de8Var.g.h(canvas, null);
                } else {
                    de8Var.g.i0(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.N0, imageReceiver3.O0);
                    de8Var.g.h(canvas, null);
                    if (de8Var.g.y() != null || de8Var.g.m() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (de8Var.i) {
            de8Var.h.setAlpha(de8Var.f.getAlpha());
            de8Var.h.s0(de8Var.f.z());
            ImageReceiver imageReceiver6 = de8Var.h;
            ImageReceiver imageReceiver7 = de8Var.f;
            imageReceiver6.i0(imageReceiver7.L0, imageReceiver7.M0, imageReceiver7.N0, imageReceiver7.O0);
            de8Var.h.h(canvas, null);
            int[] z = de8Var.f.z();
            float f18 = z[0];
            fArr[1] = f18;
            fArr[0] = f18;
            float f19 = z[1];
            fArr[3] = f19;
            fArr[2] = f19;
            float f20 = z[2];
            fArr[5] = f20;
            fArr[4] = f20;
            float f21 = z[3];
            fArr[7] = f21;
            fArr[6] = f21;
            RectF rectF = hl.P;
            ImageReceiver imageReceiver8 = de8Var.f;
            rectF.set(imageReceiver8.L0, imageReceiver8.M0, imageReceiver8.w(), de8Var.f.x());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (de8Var.k != null) {
                ImageReceiver imageReceiver9 = de8Var.f;
                canvas.translate(imageReceiver9.L0, imageReceiver9.M0);
                mpa mpaVar = de8Var.k;
                m98 m98Var = de8Var.d;
                ImageReceiver imageReceiver10 = de8Var.f;
                mpaVar.c(canvas, m98Var, (int) imageReceiver10.N0, (int) imageReceiver10.O0, 1.0f, false);
            } else {
                npaVar.h(vm2.o(-1, (int) (de8Var.f.getAlpha() * 82.875f)));
                ImageReceiver imageReceiver11 = de8Var.f;
                npaVar.setBounds((int) imageReceiver11.L0, (int) imageReceiver11.M0, (int) imageReceiver11.w(), (int) de8Var.f.x());
                npaVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ce8 ce8Var;
        switch (this.a) {
            case 1:
                de8 de8Var = (de8) this.f;
                float[] fArr = de8Var.Q;
                if (de8Var.C == null) {
                    float f2 = de8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        de8Var.P = f3;
                        if (f3 > 1.0f) {
                            de8Var.P = 1.0f;
                        } else {
                            de8Var.e();
                        }
                    }
                }
                float interpolation = k43.f.getInterpolation(de8Var.P) * de8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation == 1.0f || (ce8Var = de8Var.F) == null) {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f = measuredHeight;
                } else {
                    ce8Var.a(fArr);
                    canvas.save();
                    float f5 = 1.0f - interpolation;
                    float f6 = fArr[0] * f5;
                    float measuredHeight2 = (fArr[1] * f5) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f6, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f = measuredHeight2;
                    f4 = f6;
                }
                de8Var.c(canvas, 1.0f - interpolation, de8Var.o - getLeft(), de8Var.p - getTop(), f4, f);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = ((o98) this.f).e;
                de0 de0Var = this.b;
                if (!de0Var.getImageReceiver().E() || de0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(aob.w0(null, aob.X9, false));
                    canvas.drawRect(0.0f, 0.0f, de0Var.getMeasuredWidth(), de0Var.getMeasuredHeight(), paint);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m98(de8 de8Var, Context context) {
        super(context);
        this.f = de8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new yi((byte) 10));
        frameLayout.setClipToOutline(true);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        frameLayout.addView(de0Var);
        frameLayout.setWillNotDraw(false);
        jx jxVar = new jx(context);
        this.e = jxVar;
        jxVar.setBackgroundColor(0);
        frameLayout.addView(jxVar, tre.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        jxVar.addView(textureView, tre.c(-1.0f, -1));
        addView(frameLayout, tre.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
