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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class a6 extends FrameLayout implements mw0, te.b {
    public final jg D;
    public Integer E;
    public final te.a a;
    public final te.a b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final z5 d;
    public ci e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.k5 n;
    public final wo r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public a6(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 380L, false);
        this.b = new te.a(1, this, xqVar, 380L, false);
        this.c = f6Var;
        final int i10 = 0;
        z5 z5Var = new z5(this, context, f6Var, i10);
        this.d = z5Var;
        final int i11 = 1;
        z5Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.r6.V(z5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(z5Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        org.telegram.ui.ActionBar.r6.E(z5Var, org.telegram.ui.ActionBar.k6.H6, f6Var);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        z5Var.setBackground(null);
        z5Var.setImeOptions(z5Var.getImeOptions() | TLObject.FLAG_28);
        z5Var.setInputType(z5Var.getInputType() | TLObject.FLAG_14);
        z5Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        if (onClickListener != null) {
            int i12 = i7 == 1 ? 92 : 58;
            boolean z9 = hd.a0;
            addView(z5Var, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? i12 : 54.0f, 0.0f, !z9 ? i12 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i13 = org.telegram.ui.ActionBar.k6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i13, f6Var, mode);
            addView(imageView, c8.ha.d(48, 48.0f, (hd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i14 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, f6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.r6.t(imageView2, i13, f6Var, mode);
            imageView2.setContentDescription(hd.M0(2131751599, null));
            boolean z10 = hd.a0;
            addView(imageView2, c8.ha.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.n = k5Var;
            k5Var.setTextSize(13);
            this.n.setGravity((hd.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z11 = hd.a0;
            addView(view, c8.ha.d(48, 24.0f, (z11 ? 3 : 5) | 48, z11 ? 20.0f : 0.0f, 43.0f, z11 ? 0.0f : 20.0f, 0.0f));
            wo woVar = new wo(21, context, f6Var);
            this.r = woVar;
            woVar.b(-1, i13, org.telegram.ui.ActionBar.k6.k7);
            woVar.setContentDescription(hd.M0(2131754796, null));
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setAlpha(0.0f);
            woVar.setDrawBackgroundAsArc(8);
            addView(woVar, c8.ha.d(48, 48.0f, (hd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            woVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            a6 a6Var = this.b;
                            if (a6Var.r.getTag() != null) {
                                a6Var.h(a6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            a6 a6Var2 = this.b;
                            a6Var2.j(a6Var2);
                            break;
                    }
                }
            });
        } else {
            int i15 = i7 == 1 ? 70 : 19;
            boolean z12 = hd.a0;
            addView(z5Var, c8.ha.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? i15 : 19.0f, 0.0f, z12 ? 19.0f : i15, 0.0f));
        }
        if (i7 == 1) {
            jg jgVar = new jg(context);
            this.D = jgVar;
            org.telegram.ui.ActionBar.r6.t(jgVar, org.telegram.ui.ActionBar.k6.m6, f6Var, PorterDuff.Mode.SRC_IN);
            jgVar.j(hg.e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            jgVar.setPadding(L, L, L, L);
            jgVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z13 = hd.a0;
            addView(jgVar, c8.ha.d(48, 48.0f, z13 ? 3 : 5, z13 ? i16 : 0.0f, 0.0f, z13 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.k6.Ji;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i17, f6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
            jgVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(jgVar, h03, null, N2, f6Var);
            jgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            a6 a6Var = this.b;
                            if (a6Var.r.getTag() != null) {
                                a6Var.h(a6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            a6 a6Var2 = this.b;
                            a6Var2.j(a6Var2);
                            break;
                    }
                }
            });
            jgVar.setContentDescription(hd.M0(2131751197, null));
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        jg jgVar;
        if (i7 == 0) {
            wo woVar = this.r;
            if (woVar != null) {
                CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
                float f12 = this.a.e;
                if (checkBoxBase.w != f12) {
                    checkBoxBase.w = f12;
                    checkBoxBase.b();
                }
                woVar.invalidate();
                return;
            }
            return;
        }
        if (i7 != 1 || (jgVar = this.D) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        jgVar.setScaleX(f14);
        jgVar.setScaleY(f14);
        jgVar.setAlpha(f13);
        jgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.k5 k5Var = this.n;
        if (k5Var != null && this.f == null && k5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
            } else {
                this.n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
            }
        }
    }

    public final ci a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ci ciVar = new ci(getContext(), 38);
        this.e = ciVar;
        ciVar.setFocusable(false);
        ci ciVar2 = this.e;
        int i7 = org.telegram.ui.ActionBar.k6.Ji;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        org.telegram.ui.ActionBar.r6.R(ciVar2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i7), f6Var);
        c8.ka.a(this.e);
        ci ciVar3 = this.e;
        boolean z9 = hd.a0;
        addView(ciVar3, c8.ha.d(48, 50.0f, (z9 ? 3 : 5) | 48, z9 ? 4.0f : 0.0f, 0.0f, z9 ? 0.0f : 4.0f, 0.0f));
        jg jgVar = this.D;
        if (jgVar != null) {
            boolean z10 = hd.a0;
            jgVar.setLayoutParams(c8.ha.d(48, 48.0f, (z10 ? 3 : 5) | 48, z10 ? 44 : 0.0f, 1.0f, z10 ? 0.0f : 44, 0.0f));
        }
        z5 z5Var = this.d;
        if (z5Var != null) {
            float f10 = (hd.a0 ? ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).leftMargin) / org.telegram.messenger.g0.p;
            int i10 = (jgVar != null ? 70 : 19) + 24;
            boolean z11 = hd.a0;
            int i11 = (z11 ? 5 : 3) | 16;
            float f11 = z11 ? i10 : f10;
            if (!z11) {
                f10 = i10;
            }
            z5Var.setLayoutParams(c8.ha.d(-1, -2.0f, i11, f11, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.y = true;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.n = k5Var;
        k5Var.setTextSize(13);
        this.n.setGravity((hd.a0 ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.n;
        boolean z9 = hd.a0;
        addView(k5Var2, c8.ha.d(48, 24.0f, (z9 ? 3 : 5) | 48, z9 ? 20.0f : 0.0f, 17.0f, z9 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(a6 a6Var) {
        return false;
    }

    public wo getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.mw0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.mw0
    public Editable getEditText() {
        return this.d.getText();
    }

    public jg getEmojiButton() {
        return this.D;
    }

    @Override // org.telegram.ui.Components.mw0
    public CharSequence getFieldText() {
        z5 z5Var = this.d;
        if (z5Var.length() > 0) {
            return z5Var.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.mw0
    public org.telegram.ui.ActionBar.f2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.k5 getTextView2() {
        return this.n;
    }

    public void h(a6 a6Var, boolean z9) {
        this.r.a(z9, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z9, boolean z10) {
        wo woVar = this.r;
        if (z9 == (woVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        woVar.setTag(z9 ? 1 : null);
        ImageView imageView = this.h;
        if (!z10) {
            woVar.setAlpha(z9 ? 1.0f : 0.0f);
            imageView.setAlpha(z9 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z9 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(woVar, (Property<wo, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z9 ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z9) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        z5 z5Var = this.d;
        z5Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            z5Var.setSelection(z5Var.length());
        }
        z5Var.setHint(str);
        this.w = z9;
        setWillNotDraw(!z9);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wo woVar = this.r;
        if (woVar != null) {
            m(o(), false);
            woVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.w && e()) {
            boolean z9 = hd.a0;
            ImageView imageView = this.h;
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.a0) {
                i7 = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        jg jgVar;
        ImageView imageView;
        z5 z5Var;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            jgVar = this.D;
            imageView = this.f;
            z5Var = this.d;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt != z5Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == jgVar) {
                    jgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.k5 k5Var = this.n;
                        if (childAt == k5Var) {
                            k5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                        } else {
                            wo woVar = this.r;
                            if (childAt == woVar) {
                                woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                } else {
                                    childAt.measure(i7, i10);
                                }
                            }
                        }
                    }
                }
            }
            i11++;
        }
        z5Var.measure(org.telegram.messenger.camera.q.c(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : jgVar != null ? qs.a2 : qs.G1, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = z5Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), z5Var.getMeasuredHeight()) + (this.w ? 1 : 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.n;
        if (k5Var2 == null || this.y) {
            return;
        }
        k5Var2.setAlpha(measuredHeight >= org.telegram.messenger.g0.L(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z9) {
        this.b.a(z9, true);
    }

    @Override // org.telegram.ui.Components.mw0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        }
        jg jgVar = this.D;
        if (jgVar != null) {
            org.telegram.ui.ActionBar.r6.t(jgVar, i7, f6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z9) {
        this.s = z9;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.k5 k5Var = this.n;
        if (k5Var == null) {
            return;
        }
        k5Var.l(str, false);
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }

    public void setTextRight(int i7) {
        this.E = Integer.valueOf(i7);
    }

    public void i(boolean z9) {
    }

    public void j(a6 a6Var) {
    }

    public void k(z5 z5Var) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    public void g(z5 z5Var, ActionMode actionMode) {
    }
}
