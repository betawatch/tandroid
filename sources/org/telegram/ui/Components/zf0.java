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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class zf0 extends View {
    public final ic D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public boolean I;
    public RadialGradient J;
    public float K;
    public final Paint L;
    public final Matrix M;
    public fh.g N;
    public float O;
    public float P;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public my0 c;
    public my0 d;
    public zf0 e;
    public zf0 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public zf0(Context context) {
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
        this.D = new ic(this);
        this.E = -1;
        this.L = new Paint(1);
        this.M = new Matrix();
        this.s = jg.g.h(context, R.drawable.files_music);
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
        boolean z9 = this.G < 0.8f && org.telegram.messenger.g0.B(this.H) > 0.72f;
        this.E = z9 ? -16777216 : -1;
        this.s.setColorFilter(z9 ? this.b : this.a);
        this.h.setColor(this.E);
        this.n.setColor(org.telegram.ui.ActionBar.k6.r1(0.85f, this.E));
        invalidate();
    }

    public void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i7 = (int) height;
        int i10 = L / 2;
        int i11 = i7 - i10;
        int i12 = i7 + i10;
        Drawable drawable = this.s;
        drawable.setBounds(0, i11, L, i12);
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f10, this.E, canvas);
        canvas.translate(this.c.k(), 0.0f);
        this.d.c(0.0f, height, f10 * 0.85f, this.E, canvas);
        canvas.translate(this.d.k(), 0.0f);
        float N = org.telegram.messenger.g0.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(org.telegram.messenger.g0.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f10) {
        float max = Math.max(0.0f, ((f10 - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(16.6f)) - org.telegram.messenger.g0.L(8.0f));
        my0 my0Var = this.c;
        my0Var.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - my0Var.k());
        return this.d.k() + this.c.k() + org.telegram.messenger.g0.L(16.6f) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void d(int i7, boolean z9) {
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.d(i7, z9);
        }
        if (this.H == i7 && this.I == z9) {
            return;
        }
        this.H = i7;
        this.I = z9;
        this.J = null;
        this.x.setColor(i7);
        a();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.P / org.telegram.messenger.g0.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        ic icVar = this.D;
        if (action == 0) {
            icVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && icVar.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                icVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (icVar.i) {
                performClick();
            }
            icVar.c(false);
        }
        return icVar.i;
    }

    public final void e(String str, String str2) {
        this.c = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        this.d = new my0(str2, 11.0f, null);
        setContentDescription(org.telegram.messenger.hd.M0(2131754799, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f10, float f11) {
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.f(f10, f11);
        }
        this.P = f11;
        setTranslationY(f10 - org.telegram.messenger.g0.L(12.0f));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float c10;
        float width;
        if (this.c == null || this.d == null) {
            return;
        }
        float l10 = Utilities.l(this.P / org.telegram.messenger.g0.L(21.0f));
        float a10 = this.D.a(0.02f);
        if (l10 <= 0.0f) {
            fh.g gVar = this.N;
            if (gVar != null) {
                gVar.setAlpha(0);
                return;
            }
            return;
        }
        int width2 = getWidth() - (org.telegram.messenger.g0.L(12.0f) * 2);
        zf0 zf0Var = this.e;
        if (zf0Var == null) {
            zf0Var = this.f;
        }
        if (zf0Var == null || zf0Var.getVisibility() != 0) {
            c10 = c(width2) + org.telegram.messenger.g0.L(16.0f);
            width = (getWidth() - c10) / 2.0f;
        } else {
            zf0 zf0Var2 = this.f;
            if (zf0Var2 == null) {
                zf0Var2 = this;
            }
            zf0 zf0Var3 = this.e;
            if (zf0Var3 == null) {
                zf0Var3 = this;
            }
            float f10 = width2;
            c10 = zf0Var3.c(f10 / 2.0f) + org.telegram.messenger.g0.L(16.0f);
            float c11 = zf0Var2.c(Math.max(0.0f, (f10 - c10) - org.telegram.messenger.g0.L(6.0f))) + org.telegram.messenger.g0.L(16.0f);
            width = (((getWidth() - c11) - org.telegram.messenger.g0.L(6.0f)) - c10) / 2.0f;
            zf0 zf0Var4 = this.f;
            if (zf0Var4 == null) {
                c10 = c11;
            }
            if (zf0Var4 != null) {
                width += c11 + org.telegram.messenger.g0.L(6.0f);
            }
        }
        RectF rectF = this.w;
        rectF.set(width, org.telegram.messenger.g0.L(10.0f), c10 + width, (org.telegram.messenger.g0.L(17.0f) * l10) + org.telegram.messenger.g0.L(10.0f));
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), getHeight() / 2.0f);
        if (this.N != null) {
            float height = rectF.height() / 2.0f;
            if (this.O != height) {
                this.O = height;
                this.N.r(height);
            }
            this.N.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            this.N.setAlpha((int) (255.0f * l10));
            this.N.draw(canvas);
        } else {
            float f11 = this.I ? 0.1f : 1.0f;
            Paint paint = this.x;
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * l10 * f11));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            paint.setAlpha(alpha);
            if (this.I && this.H != 0) {
                RadialGradient radialGradient = this.J;
                Paint paint2 = this.L;
                if (radialGradient == null || this.K != rectF.width()) {
                    this.K = rectF.width();
                    RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, org.telegram.messenger.g0.L(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.k6.r1(0.8f, this.H), this.H, Shader.TileMode.CLAMP);
                    this.J = radialGradient2;
                    paint2.setShader(radialGradient2);
                }
                float f12 = rectF.left;
                float f13 = rectF.top;
                Matrix matrix = this.M;
                matrix.setTranslate(f12, f13);
                this.J.setLocalMatrix(matrix);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.setAlpha(f10);
        }
    }

    public void setColor(org.telegram.messenger.fp fpVar) {
        this.F = fpVar != null;
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.setColor(fpVar);
        }
        invalidate();
    }

    public void setGlassFactory(dh.c cVar) {
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.setGlassFactory(cVar);
        }
        this.N = cVar != null ? cVar.c(this, if0.o, false) : null;
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
        int i7 = 0;
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
                if (i7 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i7);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        B = documentAttribute2.title;
                        if (B == null || B.length() == 0) {
                            B = org.telegram.messenger.w7.B(document);
                        }
                    } else {
                        i7++;
                    }
                } else {
                    B = org.telegram.messenger.w7.B(document);
                }
            }
            if (TextUtils.isEmpty(str)) {
                B = TextUtils.isEmpty(B) ? "" : " - " + ((Object) B);
            } else if (TextUtils.isEmpty(B)) {
                str = org.telegram.messenger.hd.M0(2131753900, null);
                B = jg.g.l(2131753899, null, new StringBuilder(" - "));
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
        zf0 zf0Var = this.e;
        if (zf0Var != null) {
            zf0Var.setParentExpanded(f10);
        }
        if (this.G != f10) {
            this.G = f10;
            a();
            invalidate();
        }
    }

    public void setTrailingView(zf0 zf0Var) {
        this.e = zf0Var;
        zf0Var.f = this;
        invalidate();
        zf0Var.invalidate();
    }
}
