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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.pg0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public float I;
    public final org.telegram.ui.ActionBar.h6 J;
    public boolean K;
    public int L;
    public int M;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final pg0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int x;
    public final Paint y;

    public v3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        this.x = j10.t0;
        this.y = new Paint(1);
        this.a = z11;
        this.J = h6Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.Kf, h6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z10 ? c8.ma.i(-2.0f, -2.0f, 8388659, i7, 8.0f, 40.0f, 0.0f) : c8.ma.d(-2, -2.0f, 51, i7, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Of, h6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z10 ? c8.ma.i(-2.0f, -2.0f, 8388659, i7, 30.0f, 100.0f, 0.0f) : c8.ma.d(-2, -2.0f, 51, i7, 30.0f, 100.0f, 0.0f));
        if (z11) {
            pg0 pg0Var = new pg0(context);
            this.d = pg0Var;
            org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
            pg0Var.setText(gd.N0(2131754483, null));
            addView(pg0Var, z10 ? c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : c8.ma.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.m6.Ii, h6Var, 1, 14.0f);
            textView3.setText(gd.N0(2131744614, null));
            addView(textView3, z10 ? c8.ma.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : c8.ma.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Hi));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Of));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ki));
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            this.d.a(z10, z11);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z10, boolean z11, int i7, int i10, boolean z12) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.I = z10 ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.E = i7;
        this.F = i10;
        TextView textView = this.b;
        if (i10 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i10 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                k00 k00Var = new k00(org.telegram.ui.ActionBar.m6.q6, this.J);
                int i11 = this.E;
                spannableStringBuilder.setSpan(k00Var, i11, this.F + i11, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView2 = this.c;
        if (z13) {
            textView2.setText(gd.G(stickerSet.count, "EmojiCount", new Object[0]));
        } else {
            textView2.setText(gd.G(stickerSet.count, "Stickers", new Object[0]));
        }
        this.w = z10;
        if (this.a) {
            boolean z14 = this.s;
            pg0 pg0Var = this.d;
            if (!z14) {
                pg0Var.setVisibility(8);
                return;
            }
            pg0Var.setVisibility(0);
            boolean z15 = z12 || ri.d0(this.x).E0(stickerSetCovered.set.id, true);
            this.r = z15;
            TextView textView3 = this.e;
            if (!z11) {
                if (z15) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    pg0Var.setVisibility(4);
                    pg0Var.setAlpha(0.0f);
                    pg0Var.setScaleX(0.0f);
                    pg0Var.setScaleY(0.0f);
                    return;
                }
                pg0Var.setVisibility(0);
                pg0Var.setAlpha(1.0f);
                pg0Var.setScaleX(1.0f);
                pg0Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z15) {
                textView3.setVisibility(0);
            } else {
                pg0Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(pg0Var, (Property<pg0, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(pg0Var, (Property<pg0, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(pg0Var, (Property<pg0, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new t3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i7, CharSequence charSequence) {
        this.G = charSequence;
        this.H = i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G);
            try {
                spannableStringBuilder.setSpan(new u3(org.telegram.ui.ActionBar.m6.q6, h6Var), 0, this.H, 33);
                spannableStringBuilder.setSpan(new u3(org.telegram.ui.ActionBar.m6.Of, h6Var), this.H, this.G.length(), 33);
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
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        if (z10 || this.I != 0.0f) {
            if (z10) {
                float f10 = this.I;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.I = f11;
                    if (f11 > 1.0f) {
                        this.I = 1.0f;
                    } else {
                        invalidate();
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ki, h6Var);
                    Paint paint = this.y;
                    paint.setColor(w02);
                    canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint);
                }
            }
            if (!z10) {
                float f12 = this.I;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.I = f13;
                    if (f13 < 0.0f) {
                        this.I = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int w022 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ki, h6Var);
            Paint paint2 = this.y;
            paint2.setColor(w022);
            canvas.drawCircle(org.telegram.messenger.g0.L(12.0f) + this.b.getRight(), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) * this.I, paint2);
        }
        if (this.n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
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
                layoutParams.rightMargin = i5.c.e(measuredWidth, measuredWidth2, 2, org.telegram.messenger.g0.L(14.0f));
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

    public void setNeedDivider(boolean z10) {
        this.n = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        pg0 pg0Var;
        if (this.a && (pg0Var = this.d) != null) {
            int i7 = org.telegram.ui.ActionBar.m6.Ei;
            org.telegram.ui.ActionBar.h6 h6Var = this.J;
            pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hi, h6Var);
            if (!this.K || this.L != w02 || this.M != w03) {
                this.K = true;
                this.L = w02;
                this.M = w03;
                pg0Var.setBackground(org.telegram.ui.ActionBar.a6.e(w02, 14.0f));
            }
            pg0Var.invalidate();
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
