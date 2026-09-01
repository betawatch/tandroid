package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import fg.q1;
import k7.c6;
import k7.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements xg0, xd.b {
    public static final RectF S = new RectF();
    public TLRPC.TL_attachMenuBot B;
    public final TextPaint C;
    public boolean D;
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public Drawable I;
    public boolean J;
    public boolean K;
    public int L;
    public long M;
    public boolean N;
    public int O;
    public float P;
    public TextPaint Q;
    public z8 R;
    public final TextView a;
    public final lj0 b;
    public p9 c;
    public g6 d;
    public final Paint e;
    public final j6 f;
    public final xd.a h;
    public final xd.a n;
    public final xd.a r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public a y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new xd.a(0, this, wd.a.a, 320L, false);
        pr prVar = pr.h;
        this.n = new xd.a(1, this, prVar, 380L, false);
        this.r = new xd.a(2, this, prVar, 380L, false);
        this.P = 1.0f;
        lj0 lj0Var = new lj0(context);
        this.b = lj0Var;
        addView(lj0Var, c6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        lj0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.C = new TextPaint(textView.getPaint());
        addView(textView, c6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        j6 j6Var = new j6(false, false, false, false);
        this.f = j6Var;
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(this);
        j6Var.b = 17;
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, g6 g6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = g6Var;
        bVar.y = aVar;
        bVar.a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.b.setLayoutParams(c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = k6.v0(k6.cl, g6Var);
        bVar.s = k6.v0(k6.al, g6Var);
        bVar.v = k6.v0(k6.bl, g6Var);
        bVar.f();
        return bVar;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z4) {
        TLRPC.Document document;
        boolean z10 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.B;
        boolean z11 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z10);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.B);
                z11 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.M != document.id) {
                this.c.l(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z11 ? null : DocumentObject.getSvgThumb(document, k6.a7, 1.0f), this.B);
                this.M = document.id;
            }
            f();
            return;
        }
        a aVar = this.y;
        if (aVar == null) {
            return;
        }
        int i10 = aVar.b;
        int i11 = aVar.a;
        int i12 = aVar.c;
        lj0 lj0Var = this.b;
        if (i12 != -1) {
            lj0Var.setImageResource(i12);
            f();
            return;
        }
        int i13 = z10 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z12 = this.K != z10;
            if (this.L != i13) {
                this.L = i13;
                lj0Var.f(i13, 24, 24, null);
                z12 = true;
            }
            if (z12) {
                ij0 animatedDrawable = lj0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z10) {
                    animatedDrawable.N(this.y.d);
                    if (animatedDrawable.Y >= this.y.e - 2) {
                        animatedDrawable.L(0, false, false);
                    }
                    int i14 = animatedDrawable.Y;
                    int i15 = this.y.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.K(i15);
                    }
                } else {
                    int i16 = animatedDrawable.Y;
                    a aVar2 = this.y;
                    if (i16 >= aVar2.d - 1) {
                        animatedDrawable.N(aVar2.e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.N(0);
                        animatedDrawable.K(0);
                    }
                }
            }
            this.K = z10;
            return;
        }
        if (i11 != i10) {
            if (this.L != i13) {
                this.L = i13;
                lj0Var.f(i13, 24, 24, null);
                lj0Var.getAnimatedDrawable().h = false;
                if (!z4) {
                    lj0Var.getAnimatedDrawable().Q(0.99f, true);
                    return;
                } else {
                    lj0Var.getAnimatedDrawable().K(0);
                    lj0Var.d();
                    return;
                }
            }
            return;
        }
        if (lj0Var.getAnimatedDrawable() == null) {
            lj0Var.f(this.y.a, 24, 24, null);
        }
        ij0 animatedDrawable2 = lj0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.e;
        if (this.K != z10) {
            this.K = z10;
            if (z10) {
                animatedDrawable2.h = false;
                animatedDrawable2.K(0);
                animatedDrawable2.N(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.K(iArr[0]);
                animatedDrawable2.N(0);
            }
            lj0Var.d();
        }
    }

    public final float c() {
        float measureText = this.C.measureText(this.a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), o.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z4, boolean z10) {
        this.f.q(str, z10, true);
        this.n.a(!TextUtils.isEmpty(str), z10);
        this.r.a(z4, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.D ? this.E : getWidth();
        float f10 = this.F ? this.G : this.h.e;
        RectF rectF = S;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.H) {
            paint.setColor(k6.l1(wd.a.a.getInterpolation(f10) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = o.a(this.P, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f11 = (this.x ? 1.0f : this.n.e) * this.P;
        boolean z4 = f11 > 0.0f;
        if (z4) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (width / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            j6 j6Var = this.f;
            float max = Math.max(dpf24, j6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f12 = max / 2.0f;
            float f13 = dpf24 / 2.0f;
            rectF.set((dpf22 - f12) - dpf2, (dpf23 - f13) - dpf2, f12 + dpf22 + dpf2, f13 + dpf23 + dpf2);
            canvas.scale(f11, f11, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, k6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.x) {
                if (this.I == null) {
                    this.I = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                q1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, q1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.I.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.I.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.r.e, k6.w0(null, k6.hl, false), k6.w0(null, k6.r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                j6Var.m(rectF);
                j6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z4) {
            canvas.restore();
        }
    }

    public final void e(boolean z4, boolean z10) {
        this.h.a(z4, z10);
        a(z10);
        this.a.setTypeface(z4 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_EXTRA_BOLD) : AndroidUtilities.bold());
    }

    public final void f() {
        int i10 = this.w;
        int i11 = this.s;
        xd.a aVar = this.h;
        int d = i0.a.d(aVar.e, i10, i11);
        int d10 = i0.a.d(aVar.e, this.w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.c;
        if (p9Var != null && this.J) {
            p9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(d10);
    }

    public p9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.N) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.O, TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.D) {
            float measuredWidth = (this.E - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.O = i10;
        this.N = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        lj0 lj0Var = this.b;
        lj0Var.setScaleX(f10);
        lj0Var.setScaleY(f10);
        p9 p9Var = this.c;
        if (p9Var != null) {
            p9Var.setScaleX(f10);
            this.c.setScaleY(f10);
        }
        this.P = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z4) {
        this.x = z4;
    }

    public void setSkipDrawSelector(boolean z4) {
        if (this.H != z4) {
            this.H = z4;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.y = aVar;
        this.B = null;
        this.L = 0;
        this.M = 0L;
        this.b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float dp = AndroidUtilities.dp(f10);
        TextView textView = this.a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f10);
            this.C.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f10) {
        this.D = true;
        if (this.E != f10) {
            this.E = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
