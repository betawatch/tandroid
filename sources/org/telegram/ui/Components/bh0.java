package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class bh0 extends View {
    public final dc D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public boolean I;
    public RadialGradient J;
    public float K;
    public final Paint L;
    public final Matrix M;
    public vg.f N;
    public float O;
    public float P;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public qz0 c;
    public qz0 d;
    public bh0 e;
    public bh0 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public bh0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.a = new PorterDuffColorFilter(-1, mode);
        this.b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.n = paint;
        Path path = new Path();
        this.r = path;
        this.w = new RectF();
        this.x = new Paint(1);
        this.y = new Path();
        this.D = new dc(this);
        this.E = -1;
        this.L = new Paint(1);
        this.M = new Matrix();
        this.s = i0.a.f(context, R.drawable.files_music);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -org.telegram.messenger.i0.N(3.33f));
        path.lineTo(org.telegram.messenger.i0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z10 = this.G < 0.8f && org.telegram.messenger.i0.B(this.H) > 0.72f;
        this.E = z10 ? -16777216 : -1;
        this.s.setColorFilter(z10 ? this.b : this.a);
        this.h.setColor(this.E);
        this.n.setColor(org.telegram.ui.ActionBar.t6.r1(0.85f, this.E));
        invalidate();
    }

    public void b(Canvas canvas, float f7) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.i0.L(13.0f);
        int i10 = (int) height;
        int i11 = L / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.s;
        drawable.setBounds(0, i12, L, i13);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.i0.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f7, this.E, canvas);
        canvas.translate(this.c.k(), 0.0f);
        this.d.c(0.0f, height, f7 * 0.85f, this.E, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.i0.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.i0.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f7) {
        float max = Math.max(0.0f, ((f7 - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(16.6f)) - org.telegram.messenger.i0.L(8.0f));
        qz0 qz0Var = this.c;
        qz0Var.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - qz0Var.k());
        return this.d.k() + this.c.k() + org.telegram.messenger.i0.L(16.6f) + org.telegram.messenger.i0.L(8.0f);
    }

    public final void d(int i10, boolean z10) {
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.d(i10, z10);
        }
        if (this.H == i10 && this.I == z10) {
            return;
        }
        this.H = i10;
        this.I = z10;
        this.J = null;
        this.x.setColor(i10);
        a();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.P / org.telegram.messenger.i0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        dc dcVar = this.D;
        if (action == 0) {
            dcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && dcVar.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.i) {
                performClick();
            }
            dcVar.c(false);
        }
        return dcVar.i;
    }

    public final void e(String str, String str2) {
        this.c = new qz0(str, 11.0f, org.telegram.messenger.i0.o());
        this.d = new qz0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.cd.L0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f7, float f10) {
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.f(f7, f10);
        }
        this.P = f10;
        setTranslationY(f7 - org.telegram.messenger.i0.L(12.0f));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float c10;
        float width;
        if (this.c == null || this.d == null) {
            return;
        }
        float l4 = Utilities.l(this.P / org.telegram.messenger.i0.L(21.0f));
        float a2 = this.D.a(0.02f);
        if (l4 <= 0.0f) {
            vg.f fVar = this.N;
            if (fVar != null) {
                fVar.setAlpha(0);
                return;
            }
            return;
        }
        int width2 = getWidth() - (org.telegram.messenger.i0.L(12.0f) * 2);
        bh0 bh0Var = this.e;
        if (bh0Var == null) {
            bh0Var = this.f;
        }
        if (bh0Var == null || bh0Var.getVisibility() != 0) {
            c10 = c(width2) + org.telegram.messenger.i0.L(16.0f);
            width = (getWidth() - c10) / 2.0f;
        } else {
            bh0 bh0Var2 = this.f;
            if (bh0Var2 == null) {
                bh0Var2 = this;
            }
            bh0 bh0Var3 = this.e;
            if (bh0Var3 == null) {
                bh0Var3 = this;
            }
            float f7 = width2;
            c10 = bh0Var3.c(f7 / 2.0f) + org.telegram.messenger.i0.L(16.0f);
            float c11 = bh0Var2.c(Math.max(0.0f, (f7 - c10) - org.telegram.messenger.i0.L(6.0f))) + org.telegram.messenger.i0.L(16.0f);
            width = (((getWidth() - c11) - org.telegram.messenger.i0.L(6.0f)) - c10) / 2.0f;
            bh0 bh0Var4 = this.f;
            if (bh0Var4 == null) {
                c10 = c11;
            }
            if (bh0Var4 != null) {
                width += c11 + org.telegram.messenger.i0.L(6.0f);
            }
        }
        RectF rectF = this.w;
        rectF.set(width, org.telegram.messenger.i0.L(10.0f), c10 + width, (org.telegram.messenger.i0.L(17.0f) * l4) + org.telegram.messenger.i0.L(10.0f));
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), getHeight() / 2.0f);
        if (this.N != null) {
            float height = rectF.height() / 2.0f;
            if (this.O != height) {
                this.O = height;
                this.N.q(height);
            }
            this.N.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            this.N.setAlpha((int) (255.0f * l4));
            this.N.draw(canvas);
        } else {
            float f10 = this.I ? 0.1f : 1.0f;
            Paint paint = this.x;
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * l4 * f10));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            paint.setAlpha(alpha);
            if (this.I && this.H != 0) {
                RadialGradient radialGradient = this.J;
                Paint paint2 = this.L;
                if (radialGradient == null || this.K != rectF.width()) {
                    this.K = rectF.width();
                    RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.i0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.t6.r1(0.8f, this.H), this.H, Shader.TileMode.CLAMP);
                    this.J = radialGradient2;
                    paint2.setShader(radialGradient2);
                }
                float f11 = rectF.left;
                float f12 = rectF.top;
                Matrix matrix = this.M;
                matrix.setTranslate(f11, f12);
                this.J.setLocalMatrix(matrix);
                paint2.setAlpha((int) (255.0f * l4));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
            }
        }
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(rectF.left + org.telegram.messenger.i0.L(8.0f), 0.0f);
        b(canvas, l4);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(37.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.setAlpha(f7);
        }
    }

    public void setColor(org.telegram.messenger.kp kpVar) {
        this.F = kpVar != null;
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.setColor(kpVar);
        }
        invalidate();
    }

    public void setGlassFactory(tg.b bVar) {
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.setGlassFactory(bVar);
        }
        this.N = bVar != null ? bVar.c(this, kg0.o, false) : null;
        this.O = 0.0f;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMusicDocument(TLRPC.Document document) {
        String str;
        String B;
        int i10 = 0;
        if (document != null) {
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i10 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i10);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        B = documentAttribute2.title;
                        if (B == null || B.length() == 0) {
                            B = org.telegram.messenger.b8.B(document);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    B = org.telegram.messenger.b8.B(document);
                }
            }
            if (TextUtils.isEmpty(str)) {
                B = TextUtils.isEmpty(B) ? "" : " - " + ((Object) B);
            } else if (TextUtils.isEmpty(B)) {
                str = org.telegram.messenger.cd.L0(2131753900, null);
                B = a1.g.m(null, 2131753899, new StringBuilder(" - "));
            } else {
                str = "";
            }
            e(str, B);
        }
        B = null;
        if (TextUtils.isEmpty(str)) {
        }
        e(str, B);
    }

    public void setParentExpanded(float f7) {
        bh0 bh0Var = this.e;
        if (bh0Var != null) {
            bh0Var.setParentExpanded(f7);
        }
        if (this.G != f7) {
            this.G = f7;
            a();
            invalidate();
        }
    }

    public void setTrailingView(bh0 bh0Var) {
        this.e = bh0Var;
        bh0Var.f = this;
        invalidate();
        bh0Var.invalidate();
    }
}
