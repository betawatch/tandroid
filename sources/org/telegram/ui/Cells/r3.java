package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout {
    public int B;
    public CharSequence C;
    public int D;
    public float E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final ei0 d;
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

    public r3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.x = new Paint(1);
        this.a = z10;
        this.F = f6Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Se, f6Var, textView, 1, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z4 ? k7.b6.i(-2.0f, -2.0f, 8388659, i10, 8.0f, 40.0f, 0.0f) : k7.b6.d(-2, -2.0f, 51, i10, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.We, f6Var, textView2, 1, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z4 ? k7.b6.i(-2.0f, -2.0f, 8388659, i10, 30.0f, 100.0f, 0.0f) : k7.b6.d(-2, -2.0f, 51, i10, 30.0f, 100.0f, 0.0f));
        if (z10) {
            ei0 ei0Var = new ei0(context);
            this.d = ei0Var;
            ei0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
            ei0Var.setText(LocaleController.getString(R.string.Add));
            addView(ei0Var, z4 ? k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : k7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setGravity(17);
            org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.Rh, f6Var, textView3, 1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            addView(textView3, z4 ? k7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : k7.b6.d(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        d();
    }

    public static void a(ArrayList arrayList, sl0 sl0Var, org.telegram.ui.ActionBar.k6 k6Var) {
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{r3.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Se));
        int i10 = org.telegram.ui.ActionBar.j6.We;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{r3.class}, new String[]{"infoTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{r3.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 4, new Class[]{r3.class}, new String[]{"delButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{r3.class}, null, null, null, org.telegram.ui.ActionBar.j6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{r3.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, i10));
    }

    public final void b(boolean z4, boolean z10) {
        if (this.a) {
            this.d.a(z4, z10);
        }
    }

    public final void c(TLRPC.StickerSetCovered stickerSetCovered, boolean z4, boolean z10, int i10, int i11, boolean z11) {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (this.f != stickerSetCovered) {
            this.E = z4 ? 1.0f : 0.0f;
            invalidate();
        }
        this.f = stickerSetCovered;
        this.y = i10;
        this.B = i11;
        if (i11 != 0) {
            e();
        } else {
            this.b.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z12 = stickerSet.emojis;
        TextView textView = this.c;
        if (z12) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.v = z4;
        if (this.a) {
            boolean z13 = this.s;
            ei0 ei0Var = this.d;
            if (!z13) {
                ei0Var.setVisibility(8);
                return;
            }
            ei0Var.setVisibility(0);
            boolean z14 = z11 || MediaDataController.getInstance(this.w).isStickerPackInstalled(stickerSetCovered.set.id);
            this.r = z14;
            TextView textView2 = this.e;
            if (!z10) {
                if (z14) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    ei0Var.setVisibility(4);
                    ei0Var.setAlpha(0.0f);
                    ei0Var.setScaleX(0.0f);
                    ei0Var.setScaleY(0.0f);
                    return;
                }
                ei0Var.setVisibility(0);
                ei0Var.setAlpha(1.0f);
                ei0Var.setScaleX(1.0f);
                ei0Var.setScaleY(1.0f);
                textView2.setVisibility(4);
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.0f);
                textView2.setScaleY(0.0f);
                return;
            }
            if (z14) {
                textView2.setVisibility(0);
            } else {
                ei0Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.h;
            float[] fArr = {this.r ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {this.r ? 1.0f : 0.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {this.r ? 1.0f : 0.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property2, this.r ? 0.0f : 1.0f), ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property3, this.r ? 0.0f : 1.0f));
            this.h.addListener(new q3(this));
            this.h.setInterpolator(new OvershootInterpolator(1.02f));
            this.h.start();
        }
    }

    public final void d() {
        if (this.a) {
            int i10 = org.telegram.ui.ActionBar.j6.Nh;
            org.telegram.ui.ActionBar.f6 f6Var = this.F;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            ei0 ei0Var = this.d;
            ei0Var.setProgressColor(v02);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
            ei0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, v03));
        }
        e();
        f();
    }

    public final void e() {
        if (this.B != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, this.F));
                int i10 = this.y;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.B + i10, 33);
            } catch (Exception unused) {
            }
            this.b.setText(spannableStringBuilder);
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (this.C != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.C);
            try {
                spannableStringBuilder.setSpan(new lq(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var)), 0, this.D, 33);
                spannableStringBuilder.setSpan(new lq(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.We, f6Var)), this.D, this.C.length(), 33);
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
        boolean z4 = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (z4 || this.E != 0.0f) {
            if (z4) {
                float f10 = this.E;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.16f;
                    this.E = f11;
                    if (f11 > 1.0f) {
                        this.E = 1.0f;
                    } else {
                        invalidate();
                    }
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
                    Paint paint = this.x;
                    paint.setColor(v02);
                    canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.E, paint);
                }
            }
            if (!z4) {
                float f12 = this.E;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.16f;
                    this.E = f13;
                    if (f13 < 0.0f) {
                        this.E = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            int v022 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Th, f6Var);
            Paint paint2 = this.x;
            paint2.setColor(v022);
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.b.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.E, paint2);
        }
        if (this.n) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
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
                layoutParams.rightMargin = kh.a2.d(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
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

    public void setNeedDivider(boolean z4) {
        this.n = z4;
    }
}
