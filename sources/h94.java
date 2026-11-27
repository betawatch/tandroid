// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h94 extends FrameLayout implements snb {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final vnb J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final uv8 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public h94(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = yac.t0;
        this.y = new Paint(1);
        this.a = z2;
        this.J = vnbVar;
        TextView textView = new TextView(context);
        this.b = textView;
        qd4.w(textView, aob.Kf, vnbVar, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z ? tre.i(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f) : tre.d(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, aob.Of, vnbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z ? tre.i(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f) : tre.d(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f));
        if (z2) {
            uv8 uv8Var = new uv8(context);
            this.d = uv8Var;
            yob.X(uv8Var, aob.Ji, vnbVar);
            uv8Var.setText(ob6.M0(2131754479, null));
            addView(uv8Var, z ? tre.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : tre.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            qd4.w(textView3, aob.Ii, vnbVar, 1, 14.0f);
            textView3.setText(ob6.M0(2131744512, null));
            addView(textView3, z ? tre.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : tre.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, zob zobVar) {
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Ei));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Fi));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Hi));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.q6));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Of));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.Ki));
    }

    public final void b(boolean z, boolean z2) {
        if (this.a) {
            this.d.a(z, z2);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, int i, int i2, boolean z3) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.I = z ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.E = i;
        this.F = i2;
        TextView textView = this.b;
        if (i2 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i2 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                ho4 ho4Var = new ho4(aob.q6, this.J);
                int i3 = this.E;
                spannableStringBuilder.setSpan(ho4Var, i3, this.F + i3, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z4 = stickerSet.emojis;
        int i4 = stickerSet.count;
        TextView textView2 = this.c;
        if (z4) {
            textView2.setText(ob6.G(i4, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(ob6.G(i4, "Stickers", new Object[0]));
        }
        this.w = z;
        if (this.a) {
            boolean z5 = this.s;
            uv8 uv8Var = this.d;
            if (!z5) {
                uv8Var.setVisibility(8);
                return;
            }
            uv8Var.setVisibility(0);
            boolean z6 = z3 || ls6.d0(this.x).D0(stickerSetCovered.set.id, true);
            this.r = z6;
            TextView textView3 = this.e;
            if (!z2) {
                if (z6) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    uv8Var.setVisibility(4);
                    uv8Var.setAlpha(0.0f);
                    uv8Var.setScaleX(0.0f);
                    uv8Var.setScaleY(0.0f);
                    return;
                }
                uv8Var.setVisibility(0);
                uv8Var.setAlpha(1.0f);
                uv8Var.setScaleX(1.0f);
                uv8Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z6) {
                textView3.setVisibility(0);
            } else {
                uv8Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.h;
            float[] fArr = {this.r ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {this.r ? 1.0f : 0.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {this.r ? 1.0f : 0.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(uv8Var, (Property<uv8, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new f94(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i;
        vnb vnbVar = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new g94(aob.q6, vnbVar), 0, this.H, 33);
                spannableStringBuilder.setSpan(new g94(aob.Of, vnbVar), this.H, this.G.length(), 33);
            } catch (Exception unused) {
            }
            this.c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z = this.w;
        float f = this.I;
        vnb vnbVar = this.J;
        if (!z) {
            if (f != 0.0f) {
                if (f != 0.0f) {
                    float f2 = f - 0.16f;
                    this.I = f2;
                    if (f2 < 0.0f) {
                        this.I = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            if (this.n) {
                return;
            }
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, aob.U0("paintDivider", vnbVar));
            return;
        }
        if (f != 1.0f) {
            float f3 = f + 0.16f;
            this.I = f3;
            if (f3 > 1.0f) {
                this.I = 1.0f;
            } else {
                invalidate();
            }
        }
        int v0 = aob.v0(aob.Ki, vnbVar);
        Paint paint = this.y;
        paint.setColor(v0);
        canvas.drawCircle(hl.L(12.0f) + this.b.getRight(), hl.L(20.0f), hl.L(4.0f) * this.I, paint);
        if (this.n) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = ik8.g(measuredWidth, measuredWidth2, 2, hl.L(14.0f));
            } else {
                layoutParams.rightMargin = hl.L(14.0f);
            }
            measureChildWithMargins(this.b, i, measuredWidth, i2, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.a) {
            this.s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.n = z;
    }

    @Override // snb
    public final void updateColors() {
        uv8 uv8Var;
        if (this.a && (uv8Var = this.d) != null) {
            int i = aob.Ei;
            vnb vnbVar = this.J;
            uv8Var.setProgressColor(aob.v0(i, vnbVar));
            int v0 = aob.v0(aob.Fi, vnbVar);
            int v02 = aob.v0(aob.Hi, vnbVar);
            if (!this.K || this.L != v0 || this.M != v02) {
                this.K = true;
                this.L = v0;
                this.M = v02;
                uv8Var.setBackground(rnb.e(v0, 14.0f));
            }
            uv8Var.invalidate();
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }
}
