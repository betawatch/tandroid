// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class mt8 extends View {
    public final u51 E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public im0 O;
    public float P;
    public float Q;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public uib c;
    public uib d;
    public mt8 e;
    public mt8 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public mt8(Context context) {
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
        this.E = new u51(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.s = b10.d(context, R.drawable.files_music);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -gm.N(3.33f));
        path.lineTo(gm.N(3.16f), 0.0f);
        path.lineTo(0.0f, gm.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z = this.H < 0.8f && gm.B(this.I) > 0.72f;
        this.F = z ? -16777216 : -1;
        this.s.setColorFilter(z ? this.b : this.a);
        this.h.setColor(this.F);
        this.n.setColor(cmb.p1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f) {
        float height = getHeight() / 2.0f;
        int L = gm.L(13.0f);
        int i = (int) height;
        int i2 = L / 2;
        int i3 = i - i2;
        int i4 = i + i2;
        Drawable drawable = this.s;
        drawable.setBounds(0, i3, L, i4);
        drawable.draw(canvas);
        canvas.translate(gm.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f, this.F, canvas);
        canvas.translate(this.c.j(), 0.0f);
        this.d.c(0.0f, height, f * 0.85f, this.F, canvas);
        canvas.translate(this.d.j(), 0.0f);
        float N = gm.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(gm.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f) {
        float max = Math.max(0.0f, ((f - gm.L(16.0f)) - gm.L(16.6f)) - gm.L(8.0f));
        uib uibVar = this.c;
        uibVar.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - uibVar.j());
        return this.d.j() + this.c.j() + gm.L(16.6f) + gm.L(8.0f);
    }

    public final void d(int i, boolean z) {
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.d(i, z);
        }
        if (this.I == i && this.J == z) {
            return;
        }
        this.I = i;
        this.J = z;
        this.K = null;
        this.x.setColor(i);
        a();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.Q / gm.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        u51 u51Var = this.E;
        if (action == 0) {
            u51Var.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && u51Var.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                u51Var.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (u51Var.i) {
                performClick();
            }
            u51Var.c(false);
        }
        return u51Var.i;
    }

    public final void e(String str, String str2) {
        this.c = new uib(str, 11.0f, gm.o());
        this.d = new uib(str2, 11.0f, null);
        setContentDescription(jb6.M0(2131754798, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f, float f2) {
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.f(f, f2);
        }
        this.Q = f2;
        setTranslationY(f - gm.L(12.0f));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float c;
        float width;
        if (this.c == null || this.d == null) {
            return;
        }
        float l = Utilities.l(this.Q / gm.L(21.0f));
        float a = this.E.a(0.02f);
        if (l <= 0.0f) {
            im0 im0Var = this.O;
            if (im0Var != null) {
                im0Var.setAlpha(0);
                return;
            }
            return;
        }
        int width2 = getWidth() - (gm.L(12.0f) << 1);
        mt8 mt8Var = this.e;
        if (mt8Var == null) {
            mt8Var = this.f;
        }
        if (mt8Var == null || mt8Var.getVisibility() != 0) {
            c = c(width2) + gm.L(16.0f);
            width = (getWidth() - c) / 2.0f;
        } else {
            mt8 mt8Var2 = this.f;
            if (mt8Var2 == null) {
                mt8Var2 = this;
            }
            mt8 mt8Var3 = this.e;
            if (mt8Var3 == null) {
                mt8Var3 = this;
            }
            float f = width2;
            c = mt8Var3.c(f / 2.0f) + gm.L(16.0f);
            float c2 = mt8Var2.c(Math.max(0.0f, (f - c) - gm.L(6.0f))) + gm.L(16.0f);
            width = (((getWidth() - c2) - gm.L(6.0f)) - c) / 2.0f;
            if (this.f != null) {
                width += c2 + gm.L(6.0f);
            } else {
                c = c2;
            }
        }
        RectF rectF = this.w;
        rectF.set(width, gm.L(10.0f), c + width, (gm.L(17.0f) * l) + gm.L(10.0f));
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), getHeight() / 2.0f);
        if (this.O != null) {
            float height = rectF.height() / 2.0f;
            if (this.P != height) {
                this.P = height;
                this.O.r(height);
            }
            this.O.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            this.O.setAlpha((int) (255.0f * l));
            this.O.draw(canvas);
        } else {
            float f2 = this.J ? 0.1f : 1.0f;
            Paint paint = this.x;
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * l * f2));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            paint.setAlpha(alpha);
            if (this.J && this.I != 0) {
                RadialGradient radialGradient = this.K;
                Paint paint2 = this.M;
                if (radialGradient == null || this.L != rectF.width()) {
                    this.L = rectF.width();
                    RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, gm.L(17.0f) / 2.0f, rectF.width() * 0.65f, cmb.p1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                    this.K = radialGradient2;
                    paint2.setShader(radialGradient2);
                }
                float f3 = rectF.left;
                float f4 = rectF.top;
                Matrix matrix = this.N;
                matrix.setTranslate(f3, f4);
                this.K.setLocalMatrix(matrix);
                paint2.setAlpha((int) (255.0f * l));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
            }
        }
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        canvas.translate(rectF.left + gm.L(8.0f), 0.0f);
        b(canvas, l);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(37.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.setAlpha(f);
        }
    }

    public void setColor(ec7 ec7Var) {
        this.G = ec7Var != null;
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.setColor(ec7Var);
        }
        invalidate();
    }

    public void setGlassFactory(km0 km0Var) {
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.setGlassFactory(km0Var);
        }
        this.O = km0Var != null ? km0Var.c(this, fr8.o, false) : null;
        this.P = 0.0f;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMusicDocument(TLRPC.Document document) {
        String str;
        String str2;
        int i = 0;
        if (document != null) {
            for (int i2 = 0; i2 < document.attributes.size(); i2++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        str2 = documentAttribute2.title;
                        if (str2 == null || str2.length() == 0) {
                            str2 = bc4.B(document);
                        }
                    } else {
                        i++;
                    }
                } else {
                    str2 = bc4.B(document);
                }
            }
        }
        str2 = null;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                str = jb6.M0(2131753865, null);
                str2 = " - ".concat(jb6.M0(2131753864, null));
            } else {
                str = "";
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        e(str, str2);
    }

    public void setParentExpanded(float f) {
        mt8 mt8Var = this.e;
        if (mt8Var != null) {
            mt8Var.setParentExpanded(f);
        }
        if (this.H != f) {
            this.H = f;
            a();
            invalidate();
        }
    }

    public void setTrailingView(mt8 mt8Var) {
        this.e = mt8Var;
        mt8Var.f = this;
        invalidate();
        mt8Var.invalidate();
    }
}
