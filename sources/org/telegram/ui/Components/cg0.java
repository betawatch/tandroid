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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class cg0 extends View {
    public final gc E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public gh.g O;
    public float P;
    public float Q;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public ly0 c;
    public ly0 d;
    public cg0 e;
    public cg0 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public cg0(Context context) {
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
        this.E = new gc(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.s = k2.p1.g(context, R.drawable.files_music);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -org.telegram.messenger.g0.N(3.33f));
        path.lineTo(org.telegram.messenger.g0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z10 = this.H < 0.8f && org.telegram.messenger.g0.B(this.I) > 0.72f;
        this.F = z10 ? -16777216 : -1;
        this.s.setColorFilter(z10 ? this.b : this.a);
        this.h.setColor(this.F);
        this.n.setColor(org.telegram.ui.ActionBar.k6.r1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i3 = (int) height;
        int i10 = L / 2;
        int i11 = i3 - i10;
        int i12 = i3 + i10;
        Drawable drawable = this.s;
        drawable.setBounds(0, i11, L, i12);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f10, this.F, canvas);
        canvas.translate(this.c.k(), 0.0f);
        this.d.c(0.0f, height, f10 * 0.85f, this.F, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.g0.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.g0.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f10) {
        float max = Math.max(0.0f, ((f10 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(16.6f)) - org.telegram.messenger.g0.L(8.0f));
        ly0 ly0Var = this.c;
        ly0Var.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - ly0Var.k());
        return this.d.k() + this.c.k() + org.telegram.messenger.g0.L(16.6f) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void d(int i3, boolean z10) {
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.d(i3, z10);
        }
        if (this.I == i3 && this.J == z10) {
            return;
        }
        this.I = i3;
        this.J = z10;
        this.K = null;
        this.x.setColor(i3);
        a();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.Q / org.telegram.messenger.g0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        gc gcVar = this.E;
        if (action == 0) {
            gcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && gcVar.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                gcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (gcVar.i) {
                performClick();
            }
            gcVar.c(false);
        }
        return gcVar.i;
    }

    public final void e(String str, String str2) {
        this.c = new ly0(str, 11.0f, org.telegram.messenger.g0.o());
        this.d = new ly0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.bd.M0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f10, float f11) {
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.f(f10, f11);
        }
        this.Q = f11;
        setTranslationY(f10 - org.telegram.messenger.g0.L(12.0f));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float c2;
        float width;
        if (this.c == null || this.d == null) {
            return;
        }
        float l10 = Utilities.l(this.Q / org.telegram.messenger.g0.L(21.0f));
        float a10 = this.E.a(0.02f);
        if (l10 <= 0.0f) {
            gh.g gVar = this.O;
            if (gVar != null) {
                gVar.setAlpha(0);
                return;
            }
            return;
        }
        int width2 = getWidth() - (org.telegram.messenger.g0.L(12.0f) * 2);
        cg0 cg0Var = this.e;
        if (cg0Var == null) {
            cg0Var = this.f;
        }
        if (cg0Var == null || cg0Var.getVisibility() != 0) {
            c2 = c(width2) + org.telegram.messenger.g0.L(16.0f);
            width = (getWidth() - c2) / 2.0f;
        } else {
            cg0 cg0Var2 = this.f;
            if (cg0Var2 == null) {
                cg0Var2 = this;
            }
            cg0 cg0Var3 = this.e;
            if (cg0Var3 == null) {
                cg0Var3 = this;
            }
            float f10 = width2;
            c2 = cg0Var3.c(f10 / 2.0f) + org.telegram.messenger.g0.L(16.0f);
            float c10 = cg0Var2.c(Math.max(0.0f, (f10 - c2) - org.telegram.messenger.g0.L(6.0f))) + org.telegram.messenger.g0.L(16.0f);
            width = (((getWidth() - c10) - org.telegram.messenger.g0.L(6.0f)) - c2) / 2.0f;
            cg0 cg0Var4 = this.f;
            if (cg0Var4 == null) {
                c2 = c10;
            }
            if (cg0Var4 != null) {
                width += c10 + org.telegram.messenger.g0.L(6.0f);
            }
        }
        RectF rectF = this.w;
        rectF.set(width, org.telegram.messenger.g0.L(10.0f), c2 + width, (org.telegram.messenger.g0.L(17.0f) * l10) + org.telegram.messenger.g0.L(10.0f));
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), getHeight() / 2.0f);
        if (this.O != null) {
            float height = rectF.height() / 2.0f;
            if (this.P != height) {
                this.P = height;
                this.O.r(height);
            }
            this.O.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            this.O.setAlpha((int) (255.0f * l10));
            this.O.draw(canvas);
        } else {
            float f11 = this.J ? 0.1f : 1.0f;
            Paint paint = this.x;
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * l10 * f11));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            paint.setAlpha(alpha);
            if (this.J && this.I != 0) {
                RadialGradient radialGradient = this.K;
                Paint paint2 = this.M;
                if (radialGradient == null || this.L != rectF.width()) {
                    this.L = rectF.width();
                    RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.g0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.k6.r1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                    this.K = radialGradient2;
                    paint2.setShader(radialGradient2);
                }
                float f12 = rectF.left;
                float f13 = rectF.top;
                Matrix matrix = this.N;
                matrix.setTranslate(f12, f13);
                this.K.setLocalMatrix(matrix);
                paint2.setAlpha((int) (255.0f * l10));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
            }
        }
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(8.0f), 0.0f);
        b(canvas, l10);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.setAlpha(f10);
        }
    }

    public void setColor(org.telegram.messenger.wo woVar) {
        this.G = woVar != null;
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.setColor(woVar);
        }
        invalidate();
    }

    public void setGlassFactory(eh.c cVar) {
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.setGlassFactory(cVar);
        }
        this.O = cVar != null ? cVar.c(this, kf0.o, false) : null;
        this.P = 0.0f;
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
        int i3 = 0;
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i3 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i3);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        B = documentAttribute2.title;
                        if (B == null || B.length() == 0) {
                            B = org.telegram.messenger.w7.B(document);
                        }
                    } else {
                        i3++;
                    }
                } else {
                    B = org.telegram.messenger.w7.B(document);
                }
            }
            if (TextUtils.isEmpty(str)) {
                B = TextUtils.isEmpty(B) ? "" : " - " + ((Object) B);
            } else if (TextUtils.isEmpty(B)) {
                str = org.telegram.messenger.bd.M0(2131753900, null);
                B = k2.p1.k(2131753899, null, new StringBuilder(" - "));
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

    public void setParentExpanded(float f10) {
        cg0 cg0Var = this.e;
        if (cg0Var != null) {
            cg0Var.setParentExpanded(f10);
        }
        if (this.H != f10) {
            this.H = f10;
            a();
            invalidate();
        }
    }

    public void setTrailingView(cg0 cg0Var) {
        this.e = cg0Var;
        cg0Var.f = this;
        invalidate();
        cg0Var.invalidate();
    }
}
