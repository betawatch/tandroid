package org.telegram.ui.Cells;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.f6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final ag0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public u3(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.x = p10.s0;
        this.y = new Paint(1);
        this.a = z10;
        this.I = f6Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Hf, f6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z9 ? c8.ha.i(-2.0f, -2.0f, 8388659, i7, 8.0f, 40.0f, 0.0f) : c8.ha.d(-2, -2.0f, 51, i7, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Lf, f6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z9 ? c8.ha.i(-2.0f, -2.0f, 8388659, i7, 30.0f, 100.0f, 0.0f) : c8.ha.d(-2, -2.0f, 51, i7, 30.0f, 100.0f, 0.0f));
        if (z10) {
            ag0 ag0Var = new ag0(context);
            this.d = ag0Var;
            org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, f6Var);
            ag0Var.setText(hd.M0(2131754486, null));
            addView(ag0Var, z9 ? c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : c8.ha.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.Fi, f6Var, 1, 14.0f);
            textView3.setText(hd.M0(2131744856, null));
            addView(textView3, z9 ? c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : c8.ha.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Lf));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
    }

    public final void b(boolean z9, boolean z10) {
        if (this.a) {
            this.d.a(z9, z10);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z9, boolean z10, int i7, int i10, boolean z11) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.H = z9 ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.D = i7;
        this.E = i10;
        TextView textView = this.b;
        if (i10 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i10 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                xz xzVar = new xz(org.telegram.ui.ActionBar.k6.q6, this.I);
                int i11 = this.D;
                spannableStringBuilder.setSpan(xzVar, i11, this.E + i11, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z12 = stickerSet.emojis;
        TextView textView2 = this.c;
        if (z12) {
            textView2.setText(hd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(hd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.w = z9;
        if (this.a) {
            boolean z13 = this.s;
            ag0 ag0Var = this.d;
            if (!z13) {
                ag0Var.setVisibility(8);
                return;
            }
            ag0Var.setVisibility(0);
            boolean z14 = z11 || ui.b0(this.x).B0(stickerSetCovered.set.id, true);
            this.r = z14;
            TextView textView3 = this.e;
            if (!z10) {
                if (z14) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    ag0Var.setVisibility(4);
                    ag0Var.setAlpha(0.0f);
                    ag0Var.setScaleX(0.0f);
                    ag0Var.setScaleY(0.0f);
                    return;
                }
                ag0Var.setVisibility(0);
                ag0Var.setAlpha(1.0f);
                ag0Var.setScaleX(1.0f);
                ag0Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z14) {
                textView3.setVisibility(0);
            } else {
                ag0Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ag0Var, (Property<ag0, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new s3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i7, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i7;
        org.telegram.ui.ActionBar.f6 f6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new t3(org.telegram.ui.ActionBar.k6.q6, f6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new t3(org.telegram.ui.ActionBar.k6.Lf, f6Var), this.G, this.F.length(), 33);
            } catch (Exception unused) {
            }
            this.c.setText(spannableStringBuilder);
        }
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.w;
        org.telegram.ui.ActionBar.f6 f6Var = this.I;
        if (z9 || this.H != 0.0f) {
            if (z9) {
                float f10 = this.H;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.H = f11;
                    if (f11 > 1.0f) {
                        this.H = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, f6Var);
                    Paint paint = this.y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.H, paint);
                }
            }
            if (!z9) {
                float f12 = this.H;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.H = f13;
                    if (f13 < 0.0f) {
                        this.H = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, f6Var);
            Paint paint2 = this.y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.H, paint2);
        }
        if (this.n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = jg.g.D(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.g0.L(14.0f);
            }
            measureChildWithMargins(this.b, i7, measuredWidth, i10, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.a) {
            this.s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z9) {
        this.n = z9;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        ag0 ag0Var;
        if (this.a && (ag0Var = this.d) != null) {
            int i7 = org.telegram.ui.ActionBar.k6.Bi;
            org.telegram.ui.ActionBar.f6 f6Var = this.I;
            ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, f6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                ag0Var.setBackground(org.telegram.ui.ActionBar.z5.e(w02, 14.0f));
            }
            ag0Var.invalidate();
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
