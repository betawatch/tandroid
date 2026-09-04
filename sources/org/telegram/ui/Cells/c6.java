package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class c6 extends FrameLayout implements ky0, le.d {
    public Integer E;
    public final le.b a;
    public final le.b b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final b6 d;
    public rh.d e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 n;
    public final mp r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final bh y;

    public c6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        pr prVar = pr.h;
        this.a = new le.b(0, this, prVar, 380L, false);
        this.b = new le.b(1, this, prVar, 380L, false);
        this.c = f6Var;
        b6 b6Var = new b6(this, context, f6Var, 0);
        this.d = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        b6Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        b6Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        b6Var.setTextSize(1, 16.0f);
        b6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        b6Var.setBackground(null);
        b6Var.setImeOptions(b6Var.getImeOptions() | TLObject.FLAG_28);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(b6Var, w7.x5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i11 : 54.0f, 0.0f, !z10 ? i11 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i12 = org.telegram.ui.ActionBar.j6.m6;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            addView(imageView, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            addView(imageView2, w7.x5.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.n = j5Var;
            j5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, w7.x5.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            mp mpVar = new mp(context, 21, f6Var);
            this.r = mpVar;
            mpVar.b(-1, i12, org.telegram.ui.ActionBar.j6.k7);
            mpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            mpVar.setDrawUnchecked(true);
            mpVar.a(true, false);
            mpVar.setAlpha(0.0f);
            mpVar.setDrawBackgroundAsArc(8);
            addView(mpVar, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i13 = 0;
            mpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a6
                public final /* synthetic */ c6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            c6 c6Var = this.b;
                            if (c6Var.r.getTag() != null) {
                                c6Var.h(c6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            c6 c6Var2 = this.b;
                            c6Var2.j(c6Var2);
                            break;
                    }
                }
            });
        } else {
            int i14 = i10 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(b6Var, w7.x5.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i14 : 19.0f, 0.0f, z13 ? 19.0f : i14, 0.0f));
        }
        if (i10 == 1) {
            bh bhVar = new bh(context);
            this.y = bhVar;
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.SRC_IN));
            bhVar.j(zg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            bhVar.setPadding(dp, dp, dp, dp);
            bhVar.setVisibility(8);
            int i15 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(bhVar, w7.x5.d(48, 48.0f, z14 ? 3 : 5, z14 ? i15 : 0.0f, 0.0f, z14 ? 0.0f : i15, 0.0f));
            bhVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, f6Var), 1, -1));
            final int i16 = 1;
            bhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a6
                public final /* synthetic */ c6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            c6 c6Var = this.b;
                            if (c6Var.r.getTag() != null) {
                                c6Var.h(c6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            c6 c6Var2 = this.b;
                            c6Var2.j(c6Var2);
                            break;
                    }
                }
            });
            bhVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        bh bhVar;
        if (i10 == 0) {
            mp mpVar = this.r;
            if (mpVar != null) {
                CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                float f11 = this.a.e;
                if (checkBoxBase.w != f11) {
                    checkBoxBase.w = f11;
                    checkBoxBase.b();
                }
                mpVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (bhVar = this.y) == null) {
            return;
        }
        float f12 = this.b.e;
        float f13 = 0.85f * f12;
        bhVar.setScaleX(f13);
        bhVar.setScaleY(f13);
        bhVar.setAlpha(f12);
        bhVar.setVisibility(f12 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.j5 j5Var = this.n;
        if (j5Var != null && this.f == null && j5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
            }
        }
    }

    public final rh.d a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rh.d dVar = new rh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vh, this.c), 1, -1));
        w7.z5.a(this.e);
        rh.d dVar2 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(dVar2, w7.x5.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        bh bhVar = this.y;
        if (bhVar != null) {
            boolean z11 = LocaleController.isRTL;
            bhVar.setLayoutParams(w7.x5.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        b6 b6Var = this.d;
        if (b6Var != null) {
            float f7 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) b6Var.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i10 = (bhVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i11 = (z12 ? 5 : 3) | 16;
            float f10 = z12 ? i10 : f7;
            if (!z12) {
                f7 = i10;
            }
            b6Var.setLayoutParams(w7.x5.d(-1, -2.0f, i11, f10, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.x = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.n = j5Var;
        j5Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.n;
        boolean z10 = LocaleController.isRTL;
        addView(j5Var2, w7.x5.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    public boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.ky0
    public final void e(di.i2 i2Var) {
        this.d.addTextChangedListener(i2Var);
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public mp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.ky0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.ky0
    public Editable getEditText() {
        return this.d.getText();
    }

    public bh getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.ky0
    public CharSequence getFieldText() {
        b6 b6Var = this.d;
        if (b6Var.length() > 0) {
            return b6Var.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ky0
    public org.telegram.ui.ActionBar.n2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.j5 getTextView2() {
        return this.n;
    }

    public void h(c6 c6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        mp mpVar = this.r;
        if (z10 == (mpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        mpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            mpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mpVar, (Property<mp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        b6 b6Var = this.d;
        b6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            b6Var.setSelection(b6Var.length());
        }
        b6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mp mpVar = this.r;
        if (mpVar != null) {
            m(o(), false);
            mpVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.v && d()) {
            boolean z10 = LocaleController.isRTL;
            ImageView imageView = this.h;
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bh bhVar;
        ImageView imageView;
        b6 b6Var;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            bhVar = this.y;
            imageView = this.f;
            b6Var = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != b6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == bhVar) {
                    bhVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            mp mpVar = this.r;
                            if (childAt == mpVar) {
                                mpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                } else {
                                    childAt.measure(i10, i11);
                                }
                            }
                        }
                    }
                }
            }
            i12++;
        }
        b6Var.measure(wl.d(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : bhVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = b6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), b6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.n;
        if (j5Var2 == null || this.x) {
            return;
        }
        j5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.ky0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        bh bhVar = this.y;
        if (bhVar != null) {
            bhVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.n;
        if (j5Var == null) {
            return;
        }
        j5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(c6 c6Var) {
    }

    public void k(b6 b6Var) {
    }

    public void g(b6 b6Var, ActionMode actionMode) {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
