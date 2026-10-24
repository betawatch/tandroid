package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yg;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class d6 extends FrameLayout implements jz0, ne.d {
    public Integer E;
    public final ne.b a;
    public final ne.b b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final c6 d;
    public rh.d e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.n5 n;
    public final xp r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final ah y;

    public d6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 380L, false);
        this.b = new ne.b(1, this, bsVar, 380L, false);
        this.c = g6Var;
        c6 c6Var = new c6(this, context, g6Var, 0);
        this.d = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.r6.W(c6Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(c6Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
        org.telegram.ui.ActionBar.r6.F(c6Var, org.telegram.ui.ActionBar.k6.H6, g6Var);
        c6Var.setTextSize(1, 16.0f);
        c6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        c6Var.setBackground(null);
        c6Var.setImeOptions(c6Var.getImeOptions() | TLObject.FLAG_28);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(c6Var, w7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i11 : 54.0f, 0.0f, !z10 ? i11 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i12 = org.telegram.ui.ActionBar.k6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, g6Var, mode);
            addView(imageView, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i13 = org.telegram.ui.ActionBar.k6.Vh;
            y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            imageView2.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O, g6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.r6.t(imageView2, i12, g6Var, mode);
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            addView(imageView2, w7.z5.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
            this.n = n5Var;
            n5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, w7.z5.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            xp xpVar = new xp(context, 21, g6Var);
            this.r = xpVar;
            xpVar.b(-1, i12, org.telegram.ui.ActionBar.k6.k7);
            xpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            xpVar.setDrawUnchecked(true);
            xpVar.a(true, false);
            xpVar.setAlpha(0.0f);
            xpVar.setDrawBackgroundAsArc(8);
            addView(xpVar, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i14 = 0;
            xpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
                public final /* synthetic */ d6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            d6 d6Var = this.b;
                            if (d6Var.r.getTag() != null) {
                                d6Var.h(d6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            d6 d6Var2 = this.b;
                            d6Var2.j(d6Var2);
                            break;
                    }
                }
            });
        } else {
            int i15 = i10 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(c6Var, w7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i15 : 19.0f, 0.0f, z13 ? 19.0f : i15, 0.0f));
        }
        if (i10 == 1) {
            ah ahVar = new ah(context);
            this.y = ahVar;
            org.telegram.ui.ActionBar.r6.t(ahVar, org.telegram.ui.ActionBar.k6.m6, g6Var, PorterDuff.Mode.SRC_IN);
            ahVar.j(yg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            ahVar.setPadding(dp, dp, dp, dp);
            ahVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(ahVar, w7.z5.d(48, 48.0f, z14 ? 3 : 5, z14 ? i16 : 0.0f, 0.0f, z14 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.k6.Vh;
            y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i17, g6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
            ahVar.setBackground(g03);
            org.telegram.ui.ActionBar.r6.k(ahVar, g03, null, O2, g6Var);
            final int i18 = 1;
            ahVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
                public final /* synthetic */ d6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            d6 d6Var = this.b;
                            if (d6Var.r.getTag() != null) {
                                d6Var.h(d6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            d6 d6Var2 = this.b;
                            d6Var2.j(d6Var2);
                            break;
                    }
                }
            });
            ahVar.setContentDescription(LocaleController.getString(R.string.Emoji));
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
        rh.d dVar2 = this.e;
        int i10 = org.telegram.ui.ActionBar.k6.Vh;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        org.telegram.ui.ActionBar.r6.S(dVar2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i10), g6Var);
        w7.b6.a(this.e);
        rh.d dVar3 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(dVar3, w7.z5.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        ah ahVar = this.y;
        if (ahVar != null) {
            boolean z11 = LocaleController.isRTL;
            ahVar.setLayoutParams(w7.z5.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        c6 c6Var = this.d;
        if (c6Var != null) {
            float f7 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) c6Var.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i11 = (ahVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i12 = (z12 ? 5 : 3) | 16;
            float f10 = z12 ? i11 : f7;
            if (!z12) {
                f7 = i11;
            }
            c6Var.setLayoutParams(w7.z5.d(-1, -2.0f, i12, f10, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.x = true;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.n = n5Var;
        n5Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.n;
        boolean z10 = LocaleController.isRTL;
        addView(n5Var2, w7.z5.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.jz0
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(d6 d6Var) {
        return false;
    }

    public xp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.jz0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.jz0
    public Editable getEditText() {
        return this.d.getText();
    }

    public ah getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.jz0
    public CharSequence getFieldText() {
        c6 c6Var = this.d;
        if (c6Var.length() > 0) {
            return c6Var.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jz0
    public org.telegram.ui.ActionBar.o2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.n5 getTextView2() {
        return this.n;
    }

    public void h(d6 d6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        xp xpVar = this.r;
        if (z10 == (xpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        xpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            xpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(xpVar, (Property<xp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        c6 c6Var = this.d;
        c6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            c6Var.setSelection(c6Var.length());
        }
        c6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        ah ahVar;
        if (i10 == 0) {
            xp xpVar = this.r;
            if (xpVar != null) {
                CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
                float f11 = this.a.e;
                if (checkBoxBase.w != f11) {
                    checkBoxBase.w = f11;
                    checkBoxBase.b();
                }
                xpVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (ahVar = this.y) == null) {
            return;
        }
        float f12 = this.b.e;
        float f13 = 0.85f * f12;
        ahVar.setScaleX(f13);
        ahVar.setScaleY(f13);
        ahVar.setAlpha(f12);
        ahVar.setVisibility(f12 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.n5 n5Var = this.n;
        if (n5Var != null && this.f == null && n5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xp xpVar = this.r;
        if (xpVar != null) {
            m(p(), false);
            xpVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.v && e()) {
            boolean z10 = LocaleController.isRTL;
            ImageView imageView = this.h;
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ah ahVar;
        ImageView imageView;
        c6 c6Var;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            ahVar = this.y;
            imageView = this.f;
            c6Var = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != c6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == ahVar) {
                    ahVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.n5 n5Var = this.n;
                        if (childAt == n5Var) {
                            n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            xp xpVar = this.r;
                            if (childAt == xpVar) {
                                xpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
        c6Var.measure(sl.c(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : ahVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), c6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.n5 n5Var2 = this.n;
        if (n5Var2 == null || this.x) {
            return;
        }
        n5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.jz0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        }
        ah ahVar = this.y;
        if (ahVar != null) {
            org.telegram.ui.ActionBar.r6.t(ahVar, i10, g6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.n5 n5Var = this.n;
        if (n5Var == null) {
            return;
        }
        n5Var.k(str);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(d6 d6Var) {
    }

    public void k(c6 c6Var) {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }

    public void g(c6 c6Var, ActionMode actionMode) {
    }
}
