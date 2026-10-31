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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.p6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final ch0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public w3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.x = d20.s0;
        this.y = new Paint(1);
        this.a = z11;
        this.I = p6Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Hf, p6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z10 ? w7.b6.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f) : w7.b6.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Lf, p6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z10 ? w7.b6.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f) : w7.b6.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f));
        if (z11) {
            ch0 ch0Var = new ch0(context);
            this.d = ch0Var;
            org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
            ch0Var.setText(cd.L0(2131754486, null));
            addView(ch0Var, z10 ? w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : w7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.Fi, p6Var, 1, 14.0f);
            textView3.setText(cd.L0(2131744873, null));
            addView(textView3, z10 ? w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : w7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.b7 b7Var) {
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Lf));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hi));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.H = z10 ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.D = i10;
        this.E = i11;
        TextView textView = this.b;
        if (i11 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i11 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                l00 l00Var = new l00(org.telegram.ui.ActionBar.t6.q6, this.I);
                int i12 = this.D;
                spannableStringBuilder.setSpan(l00Var, i12, this.E + i12, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView2 = this.c;
        if (z13) {
            textView2.setText(cd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(cd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.w = z10;
        if (this.a) {
            boolean z14 = this.s;
            ch0 ch0Var = this.d;
            if (!z14) {
                ch0Var.setVisibility(8);
                return;
            }
            ch0Var.setVisibility(0);
            boolean z15 = z12 || ui.b0(this.x).B0(stickerSetCovered.set.id, true);
            this.r = z15;
            TextView textView3 = this.e;
            if (!z11) {
                if (z15) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    ch0Var.setVisibility(4);
                    ch0Var.setAlpha(0.0f);
                    ch0Var.setScaleX(0.0f);
                    ch0Var.setScaleY(0.0f);
                    return;
                }
                ch0Var.setVisibility(0);
                ch0Var.setAlpha(1.0f);
                ch0Var.setScaleX(1.0f);
                ch0Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z15) {
                textView3.setVisibility(0);
            } else {
                ch0Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new u3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i10, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i10;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new v3(org.telegram.ui.ActionBar.t6.q6, p6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new v3(org.telegram.ui.ActionBar.t6.Lf, p6Var), this.G, this.F.length(), 33);
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
        boolean z10 = this.w;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
        if (z10 || this.H != 0.0f) {
            if (z10) {
                float f7 = this.H;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.16f;
                    this.H = f10;
                    if (f10 > 1.0f) {
                        this.H = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Hi, p6Var);
                    Paint paint = this.y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.i0.L(12.0f) + this.b.getRight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) * this.H, paint);
                }
            }
            if (!z10) {
                float f11 = this.H;
                if (f11 != 0.0f) {
                    float f12 = f11 - 0.16f;
                    this.H = f12;
                    if (f12 < 0.0f) {
                        this.H = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Hi, p6Var);
            Paint paint2 = this.y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.i0.L(12.0f) + this.b.getRight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f) * this.H, paint2);
        }
        if (this.n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i0.a.u(measuredWidth, measuredWidth2, 2, org.telegram.messenger.i0.L(14.0f));
            } else {
                layoutParams.rightMargin = org.telegram.messenger.i0.L(14.0f);
            }
            measureChildWithMargins(this.b, i10, measuredWidth, i11, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.a) {
            this.s = true;
            this.d.setOnClickListener(onClickListener);
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ch0 ch0Var;
        if (this.a && (ch0Var = this.d) != null) {
            int i10 = org.telegram.ui.ActionBar.t6.Bi;
            org.telegram.ui.ActionBar.p6 p6Var = this.I;
            ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ei, p6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                ch0Var.setBackground(org.telegram.ui.ActionBar.j6.e(w02, 14.0f));
            }
            ch0Var.invalidate();
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
