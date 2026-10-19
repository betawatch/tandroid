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
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class ri0 extends View {
    public final yc E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public org.telegram.ui.oz0 O;
    public RenderNode P;
    public float Q;
    public float R;
    public float S;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public e11 c;
    public e11 d;
    public ri0 e;
    public ri0 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF v;
    public final Paint w;
    public final Path x;
    public final Path y;

    public ri0(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.a = new PorterDuffColorFilter(-1, mode);
        this.b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.n = paint;
        Path path = new Path();
        this.r = path;
        this.v = new RectF();
        this.w = new Paint(1);
        this.x = new Path();
        this.y = new Path();
        this.E = new yc(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.s = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        g("Author", " - Title");
    }

    public final void a() {
        boolean z10 = this.H < 0.8f && AndroidUtilities.computePerceivedBrightness(this.I) > 0.72f;
        this.F = z10 ? -16777216 : -1;
        this.s.setColorFilter(z10 ? this.b : this.a);
        this.h.setColor(this.F);
        this.n.setColor(org.telegram.ui.ActionBar.h6.m1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f7) {
        float height = getHeight() / 2.0f;
        int dp = AndroidUtilities.dp(13.0f);
        int i10 = (int) height;
        int i11 = dp / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.s;
        drawable.setBounds(0, i12, dp, i13);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.c.c(0.0f, height, f7, this.F, canvas);
        canvas.translate(this.c.l(), 0.0f);
        this.d.c(0.0f, height, f7 * 0.85f, this.F, canvas);
        canvas.translate(this.d.l(), 0.0f);
        float dpf2 = AndroidUtilities.dpf2(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(dpf2);
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public final void c() {
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.c();
        }
        if (this.P != null) {
            this.P = null;
            this.O = null;
            invalidate();
        }
    }

    public final void d(RenderNode renderNode, org.telegram.ui.oz0 oz0Var, float f7, float f10) {
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.d(renderNode, oz0Var, f7, f10);
        }
        this.P = renderNode;
        this.O = oz0Var;
        this.Q = f7;
        this.R = f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.S / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.v;
        yc ycVar = this.E;
        if (action == 0) {
            ycVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && ycVar.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ycVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.i) {
                performClick();
            }
            ycVar.c(false);
        }
        return ycVar.i;
    }

    public float e(float f7) {
        float max = Math.max(0.0f, ((f7 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(16.6f)) - AndroidUtilities.dp(8.0f));
        e11 e11Var = this.c;
        e11Var.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - e11Var.l());
        return this.d.l() + this.c.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
    }

    public final void f(int i10, boolean z10) {
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.f(i10, z10);
        }
        if (this.I == i10 && this.J == z10) {
            return;
        }
        this.I = i10;
        this.J = z10;
        this.K = null;
        this.w.setColor(i10);
        a();
    }

    public final void g(String str, String str2) {
        this.c = new e11(str, 11.0f, AndroidUtilities.bold());
        this.d = new e11(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void h(float f7, float f10) {
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.h(f7, f10);
        }
        this.S = f10;
        setTranslationY(f7 - AndroidUtilities.dp(12.0f));
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e;
        float width;
        if (this.c == null || this.d == null) {
            return;
        }
        float clamp01 = Utilities.clamp01(this.S / AndroidUtilities.dp(21.0f));
        float a2 = this.E.a(0.02f);
        if (clamp01 <= 0.0f) {
            return;
        }
        int width2 = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
        ri0 ri0Var = this.e;
        if (ri0Var == null) {
            ri0Var = this.f;
        }
        if (ri0Var == null || ri0Var.getVisibility() != 0) {
            e = e(width2) + AndroidUtilities.dp(16.0f);
            width = (getWidth() - e) / 2.0f;
        } else {
            ri0 ri0Var2 = this.f;
            if (ri0Var2 == null) {
                ri0Var2 = this;
            }
            ri0 ri0Var3 = this.e;
            if (ri0Var3 == null) {
                ri0Var3 = this;
            }
            float f7 = width2;
            e = ri0Var3.e(f7 / 2.0f) + AndroidUtilities.dp(16.0f);
            float e7 = ri0Var2.e(Math.max(0.0f, (f7 - e) - AndroidUtilities.dp(6.0f))) + AndroidUtilities.dp(16.0f);
            width = (((getWidth() - e7) - AndroidUtilities.dp(6.0f)) - e) / 2.0f;
            ri0 ri0Var4 = this.f;
            if (ri0Var4 == null) {
                e = e7;
            }
            if (ri0Var4 != null) {
                width += e7 + AndroidUtilities.dp(6.0f);
            }
        }
        RectF rectF = this.v;
        rectF.set(width, AndroidUtilities.dp(10.0f), e + width, (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f));
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), getHeight() / 2.0f);
        boolean z10 = SharedConfig.shadowsInSections && AndroidUtilities.computePerceivedBrightness(this.I) > 0.72f && this.H < 0.5f;
        float f10 = this.J ? 0.1f : 1.0f;
        Paint paint = this.w;
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.h6.m1(clamp01 * f10, TLObject.FLAG_29));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * clamp01 * f10));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setAlpha(alpha);
        if (this.J && this.I != 0) {
            RadialGradient radialGradient = this.K;
            Paint paint2 = this.M;
            if (radialGradient == null || this.L != rectF.width()) {
                this.L = rectF.width();
                RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, AndroidUtilities.dp(17.0f) / 2.0f, rectF.width() * 0.65f, org.telegram.ui.ActionBar.h6.m1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                this.K = radialGradient2;
                paint2.setShader(radialGradient2);
            }
            float f11 = rectF.left;
            float f12 = rectF.top;
            Matrix matrix = this.N;
            matrix.setTranslate(f11, f12);
            this.K.setLocalMatrix(matrix);
            paint2.setAlpha((int) (255.0f * clamp01));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        }
        Path path = this.x;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        RenderNode renderNode = this.P;
        if (renderNode != null && Build.VERSION.SDK_INT >= 29 && renderNode.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            org.telegram.ui.oz0 oz0Var = this.O;
            if (oz0Var != null) {
                View view = (View) oz0Var.getParent();
                float x10 = view.getX() - getX();
                float y3 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.y;
                path2.rewind();
                path2.addRoundRect(x10, y3, x10 + scaleX, y3 + scaleY, view.getScaleX() * this.O.getRoundRadiusForExpand(), view.getScaleY() * this.O.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.translate(0.0f, this.R);
            float f13 = this.Q;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(this.P);
            canvas.restore();
        }
        canvas.translate(rectF.left + AndroidUtilities.dp(8.0f), 0.0f);
        b(canvas, clamp01);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.setAlpha(f7);
        }
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        this.G = peerColor != null;
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.setColor(peerColor);
        }
        invalidate();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String str;
        int i10 = 0;
        String str2 = null;
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
                        str2 = documentAttribute2.title;
                        if (str2 == null || str2.length() == 0) {
                            str2 = FileLoader.getDocumentFileName(document);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(documentFileName)) {
                        str2 = documentFileName;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                str = LocaleController.getString(R.string.AudioUnknownArtist);
                str2 = org.telegram.messenger.g0.g(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            } else {
                str = "";
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        g(str, str2);
    }

    public void setParentExpanded(float f7) {
        ri0 ri0Var = this.e;
        if (ri0Var != null) {
            ri0Var.setParentExpanded(f7);
        }
        if (this.H != f7) {
            this.H = f7;
            a();
            invalidate();
        }
    }

    public void setTrailingView(ri0 ri0Var) {
        this.e = ri0Var;
        ri0Var.f = this;
        invalidate();
        ri0Var.invalidate();
    }
}
