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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public CharSequence F;
    public int G;
    public float H;
    public final org.telegram.ui.ActionBar.g6 I;
    public boolean J;
    public int K;
    public int L;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final xi0 d;
    public final TextView e;
    public TLRPC.StickerSetCovered f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public final int w;
    public final Paint x;
    public int y;

    public r3(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.x = new Paint(1);
        this.a = z11;
        this.I = g6Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.Se, g6Var, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z10 ? w7.z5.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f) : w7.z5.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.We, g6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z10 ? w7.z5.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f) : w7.z5.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f));
        if (z11) {
            xi0 xi0Var = new xi0(context);
            this.d = xi0Var;
            org.telegram.ui.ActionBar.r6.W(xi0Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
            xi0Var.setText(LocaleController.getString(R.string.Add));
            addView(xi0Var, z10 ? w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : w7.z5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.messenger.v0.q(textView3, org.telegram.ui.ActionBar.k6.Rh, g6Var, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            addView(textView3, z10 ? w7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : w7.z5.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void a(ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.We));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Th));
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
        this.y = i10;
        this.E = i11;
        TextView textView = this.b;
        if (i11 == 0) {
            textView.setText(stickerSetCovered.set.title);
        } else if (i11 != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                m10 m10Var = new m10(org.telegram.ui.ActionBar.k6.q6, this.I);
                int i12 = this.y;
                spannableStringBuilder.setSpan(m10Var, i12, this.E + i12, 33);
            } catch (Exception unused) {
            }
            textView.setText(spannableStringBuilder);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z13 = stickerSet.emojis;
        TextView textView2 = this.c;
        if (z13) {
            textView2.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView2.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z10;
        if (this.a) {
            boolean z14 = this.s;
            xi0 xi0Var = this.d;
            if (!z14) {
                xi0Var.setVisibility(8);
                return;
            }
            xi0Var.setVisibility(0);
            boolean z15 = z12 || MediaDataController.getInstance(this.w).isStickerPackInstalled(stickerSetCovered.set.id);
            this.r = z15;
            TextView textView3 = this.e;
            if (!z11) {
                if (z15) {
                    textView3.setVisibility(0);
                    textView3.setAlpha(1.0f);
                    textView3.setScaleX(1.0f);
                    textView3.setScaleY(1.0f);
                    xi0Var.setVisibility(4);
                    xi0Var.setAlpha(0.0f);
                    xi0Var.setScaleX(0.0f);
                    xi0Var.setScaleY(0.0f);
                    return;
                }
                xi0Var.setVisibility(0);
                xi0Var.setAlpha(1.0f);
                xi0Var.setScaleX(1.0f);
                xi0Var.setScaleY(1.0f);
                textView3.setVisibility(4);
                textView3.setAlpha(0.0f);
                textView3.setScaleX(0.0f);
                textView3.setScaleY(0.0f);
                return;
            }
            if (z15) {
                textView3.setVisibility(0);
            } else {
                xi0Var.setVisibility(0);
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
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(xi0Var, (Property<xi0, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(xi0Var, (Property<xi0, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(xi0Var, (Property<xi0, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new p3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d(int i10, CharSequence charSequence) {
        this.F = charSequence;
        this.G = i10;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F);
            try {
                spannableStringBuilder.setSpan(new q3(org.telegram.ui.ActionBar.k6.q6, g6Var), 0, this.G, 33);
                spannableStringBuilder.setSpan(new q3(org.telegram.ui.ActionBar.k6.We, g6Var), this.G, this.F.length(), 33);
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
        boolean z10 = this.v;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
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
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Th, g6Var);
                    Paint paint = this.x;
                    paint.setColor(w02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint);
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
            int w022 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Th, g6Var);
            Paint paint2 = this.x;
            paint2.setColor(w022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.H, paint2);
        }
        if (this.n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
        if (this.a) {
            int measuredWidth = this.d.getMeasuredWidth();
            TextView textView = this.e;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = i2.o1.C(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        xi0 xi0Var;
        if (this.a && (xi0Var = this.d) != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Nh;
            org.telegram.ui.ActionBar.g6 g6Var = this.I;
            xi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
            if (!this.J || this.K != w02 || this.L != w03) {
                this.J = true;
                this.K = w02;
                this.L = w03;
                xi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
            }
            xi0Var.invalidate();
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
