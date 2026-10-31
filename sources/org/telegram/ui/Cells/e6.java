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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class e6 extends FrameLayout implements qx0, fe.e {
    public final fg D;
    public Integer E;
    public final fe.b a;
    public final fe.b b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final ih.b d;
    public ih.e e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.u5 n;
    public final ep r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public e6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 380L, false);
        final int i11 = 1;
        this.b = new fe.b(1, this, grVar, 380L, false);
        this.c = p6Var;
        ih.b bVar = new ih.b(this, context, p6Var, i11);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.a7.V(bVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(bVar, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        org.telegram.ui.ActionBar.a7.E(bVar, org.telegram.ui.ActionBar.t6.H6, p6Var);
        bVar.setTextSize(1, 16.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(bVar.getImeOptions() | TLObject.FLAG_28);
        bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
        bVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(11.0f));
        final int i12 = 0;
        if (onClickListener != null) {
            int i13 = i10 == 1 ? 92 : 58;
            boolean z10 = cd.X;
            addView(bVar, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i13 : 54.0f, 0.0f, !z10 ? i13 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i14 = org.telegram.ui.ActionBar.t6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var, mode);
            addView(imageView, w7.b6.d(48, 48.0f, (cd.X ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i15 = org.telegram.ui.ActionBar.t6.Ji;
            y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.a7.t(imageView2, i14, p6Var, mode);
            imageView2.setContentDescription(cd.L0(2131751599, null));
            boolean z11 = cd.X;
            addView(imageView2, w7.b6.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            this.n = u5Var;
            u5Var.setTextSize(13);
            this.n.setGravity((cd.X ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = cd.X;
            addView(view, w7.b6.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            ep epVar = new ep(21, context, p6Var);
            this.r = epVar;
            epVar.b(-1, i14, org.telegram.ui.ActionBar.t6.k7);
            epVar.setContentDescription(cd.L0(2131754796, null));
            epVar.setDrawUnchecked(true);
            epVar.a(true, false);
            epVar.setAlpha(0.0f);
            epVar.setDrawBackgroundAsArc(8);
            addView(epVar, w7.b6.d(48, 48.0f, (cd.X ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            epVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d6
                public final /* synthetic */ e6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            e6 e6Var = this.b;
                            if (e6Var.r.getTag() != null) {
                                e6Var.h(e6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            e6 e6Var2 = this.b;
                            e6Var2.j(e6Var2);
                            break;
                    }
                }
            });
        } else {
            int i16 = i10 == 1 ? 70 : 19;
            boolean z13 = cd.X;
            addView(bVar, w7.b6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i16 : 19.0f, 0.0f, z13 ? 19.0f : i16, 0.0f));
        }
        if (i10 == 1) {
            fg fgVar = new fg(context);
            this.D = fgVar;
            org.telegram.ui.ActionBar.a7.t(fgVar, org.telegram.ui.ActionBar.t6.m6, p6Var, PorterDuff.Mode.SRC_IN);
            fgVar.j(dg.e, false);
            int L = org.telegram.messenger.i0.L(9.5f);
            fgVar.setPadding(L, L, L, L);
            fgVar.setVisibility(8);
            int i17 = this.f == null ? 3 : 38;
            boolean z14 = cd.X;
            addView(fgVar, w7.b6.d(48, 48.0f, z14 ? 3 : 5, z14 ? i17 : 0.0f, 0.0f, z14 ? 0.0f : i17, 0.0f));
            int i18 = org.telegram.ui.ActionBar.t6.Ji;
            y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
            fgVar.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(fgVar, h03, null, N2, p6Var);
            fgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.d6
                public final /* synthetic */ e6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            e6 e6Var = this.b;
                            if (e6Var.r.getTag() != null) {
                                e6Var.h(e6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            e6 e6Var2 = this.b;
                            e6Var2.j(e6Var2);
                            break;
                    }
                }
            });
            fgVar.setContentDescription(cd.L0(2131751197, null));
        }
    }

    public final ih.e a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ih.e eVar = new ih.e(getContext(), 38);
        this.e = eVar;
        eVar.setFocusable(false);
        ih.e eVar2 = this.e;
        int i10 = org.telegram.ui.ActionBar.t6.Ji;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        org.telegram.ui.ActionBar.a7.R(eVar2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i10), p6Var);
        w7.e6.a(this.e);
        ih.e eVar3 = this.e;
        boolean z10 = cd.X;
        addView(eVar3, w7.b6.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        fg fgVar = this.D;
        if (fgVar != null) {
            boolean z11 = cd.X;
            fgVar.setLayoutParams(w7.b6.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        ih.b bVar = this.d;
        if (bVar != null) {
            float f7 = (cd.X ? ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin) / org.telegram.messenger.i0.p;
            int i11 = (fgVar != null ? 70 : 19) + 24;
            boolean z12 = cd.X;
            int i12 = (z12 ? 5 : 3) | 16;
            float f10 = z12 ? i11 : f7;
            if (!z12) {
                f7 = i11;
            }
            bVar.setLayoutParams(w7.b6.d(-1, -2.0f, i12, f10, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.y = true;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.n = u5Var;
        u5Var.setTextSize(13);
        this.n.setGravity((cd.X ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.n;
        boolean z10 = cd.X;
        addView(u5Var2, w7.b6.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.qx0
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(e6 e6Var) {
        return false;
    }

    public ep getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.qx0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.qx0
    public Editable getEditText() {
        return this.d.getText();
    }

    public fg getEmojiButton() {
        return this.D;
    }

    @Override // org.telegram.ui.Components.qx0
    public CharSequence getFieldText() {
        ih.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.qx0
    public org.telegram.ui.ActionBar.k2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.u5 getTextView2() {
        return this.n;
    }

    public void h(e6 e6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        ep epVar = this.r;
        if (z10 == (epVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        epVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            epVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(epVar, (Property<ep, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        ih.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.w = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ep epVar = this.r;
        if (epVar != null) {
            m(o(), false);
            epVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.w && e()) {
            boolean z10 = cd.X;
            ImageView imageView = this.h;
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(imageView != null ? 58.0f : 20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        fg fgVar;
        ImageView imageView;
        ih.b bVar;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            fgVar = this.D;
            imageView = this.f;
            bVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == fgVar) {
                    fgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.u5 u5Var = this.n;
                        if (childAt == u5Var) {
                            u5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
                        } else {
                            ep epVar = this.r;
                            if (childAt == epVar) {
                                epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
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
        bVar.measure(z20.c(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : fgVar != null ? zs.a2 : zs.G1, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.i0.L(50.0f), bVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        org.telegram.ui.ActionBar.u5 u5Var2 = this.n;
        if (u5Var2 == null || this.y) {
            return;
        }
        u5Var2.setAlpha(measuredHeight >= org.telegram.messenger.i0.L(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.qx0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView2, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        }
        fg fgVar = this.D;
        if (fgVar != null) {
            org.telegram.ui.ActionBar.a7.t(fgVar, i10, p6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.u5 u5Var = this.n;
        if (u5Var == null) {
            return;
        }
        u5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        fg fgVar;
        if (i10 == 0) {
            ep epVar = this.r;
            if (epVar != null) {
                CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
                float f11 = this.a.e;
                if (checkBoxBase.w != f11) {
                    checkBoxBase.w = f11;
                    checkBoxBase.b();
                }
                epVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (fgVar = this.D) == null) {
            return;
        }
        float f12 = this.b.e;
        float f13 = 0.85f * f12;
        fgVar.setScaleX(f13);
        fgVar.setScaleY(f13);
        fgVar.setAlpha(f12);
        fgVar.setVisibility(f12 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.u5 u5Var = this.n;
        if (u5Var != null && this.f == null && u5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(org.telegram.messenger.i0.L(36.0f));
            } else {
                this.n.setTranslationY(org.telegram.messenger.i0.L(26.0f) * f12);
            }
        }
    }

    public void i(boolean z10) {
    }

    public void j(e6 e6Var) {
    }

    public void k(ih.b bVar) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    public void g(ih.b bVar, ActionMode actionMode) {
    }
}
