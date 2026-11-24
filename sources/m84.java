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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m84 extends FrameLayout implements tjb {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final wjb J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final ls8 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public m84(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = y6c.t0;
        this.y = new Paint(1);
        this.a = z2;
        this.J = wjbVar;
        TextView textView = new TextView(context);
        this.b = textView;
        tb4.w(textView, bkb.Jf, wjbVar, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z ? nme.i(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f) : nme.d(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, bkb.Nf, wjbVar);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z ? nme.i(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f) : nme.d(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f));
        if (z2) {
            ls8 ls8Var = new ls8(context);
            this.d = ls8Var;
            zkb.X(ls8Var, bkb.Ii, wjbVar);
            ls8Var.setText(k96.M0(2131754483, null));
            addView(ls8Var, z ? nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : nme.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            tb4.w(textView3, bkb.Hi, wjbVar, 1, 14.0f);
            textView3.setText(k96.M0(2131744618, null));
            addView(textView3, z ? nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : nme.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, alb albVar) {
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Di));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Ei));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Gi));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.p6));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Nf));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.Ji));
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
                cm4 cm4Var = new cm4(bkb.p6, this.J);
                int i3 = this.E;
                spannableStringBuilder.setSpan(cm4Var, i3, this.F + i3, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z4 = stickerSet.emojis;
        int i4 = stickerSet.count;
        TextView textView2 = this.c;
        if (z4) {
            textView2.setText(k96.G(i4, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(k96.G(i4, "Stickers", new Object[0]));
        }
        this.w = z;
        if (this.a) {
            boolean z5 = this.s;
            ls8 ls8Var = this.d;
            if (!z5) {
                ls8Var.setVisibility(8);
                return;
            }
            ls8Var.setVisibility(0);
            boolean z6 = z3 || hq6.d0(this.x).D0(stickerSetCovered.set.id, true);
            this.r = z6;
            TextView textView3 = this.e;
            if (!z2) {
                if (z6) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    ls8Var.setVisibility(4);
                    ls8Var.setAlpha(0.0f);
                    ls8Var.setScaleX(0.0f);
                    ls8Var.setScaleY(0.0f);
                    return;
                }
                ls8Var.setVisibility(0);
                ls8Var.setAlpha(1.0f);
                ls8Var.setScaleX(1.0f);
                ls8Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z6) {
                textView3.setVisibility(0);
            } else {
                ls8Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(ls8Var, (Property<ls8, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ls8Var, (Property<ls8, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ls8Var, (Property<ls8, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new k84(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i;
        wjb wjbVar = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new l84(bkb.p6, wjbVar), 0, this.H, 33);
                spannableStringBuilder.setSpan(new l84(bkb.Nf, wjbVar), this.H, this.G.length(), 33);
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
        wjb wjbVar = this.J;
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
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, bkb.U0("paintDivider", wjbVar));
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
        int v0 = bkb.v0(bkb.Ji, wjbVar);
        Paint paint = this.y;
        paint.setColor(v0);
        canvas.drawCircle(gl.L(12.0f) + this.b.getRight(), gl.L(20.0f), gl.L(4.0f) * this.I, paint);
        if (this.n) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = ug8.g(measuredWidth, measuredWidth2, 2, gl.L(14.0f));
            } else {
                layoutParams.rightMargin = gl.L(14.0f);
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

    @Override // tjb
    public final void updateColors() {
        ls8 ls8Var;
        if (this.a && (ls8Var = this.d) != null) {
            int i = bkb.Di;
            wjb wjbVar = this.J;
            ls8Var.setProgressColor(bkb.v0(i, wjbVar));
            int v0 = bkb.v0(bkb.Ei, wjbVar);
            int v02 = bkb.v0(bkb.Gi, wjbVar);
            if (!this.K || this.L != v0 || this.M != v02) {
                this.K = true;
                this.L = v0;
                this.M = v02;
                ls8Var.setBackground(sjb.e(v0, 14.0f));
            }
            ls8Var.invalidate();
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
