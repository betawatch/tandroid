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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class a6 extends FrameLayout implements mw0, te.b {
    public final ig D;
    public Integer E;
    public final te.a a;
    public final te.a b;
    public final org.telegram.ui.ActionBar.h6 c;
    public final z5 d;
    public bi e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.m5 n;
    public final wo r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public a6(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        wq wqVar = wq.h;
        this.a = new te.a(0, this, wqVar, 380L, false);
        this.b = new te.a(1, this, wqVar, 380L, false);
        this.c = h6Var;
        final int i10 = 0;
        z5 z5Var = new z5(this, context, h6Var, i10);
        this.d = z5Var;
        final int i11 = 1;
        z5Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.t6.U(z5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(z5Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        org.telegram.ui.ActionBar.t6.D(z5Var, org.telegram.ui.ActionBar.m6.H6, h6Var);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        z5Var.setBackground(null);
        z5Var.setImeOptions(z5Var.getImeOptions() | TLObject.FLAG_28);
        z5Var.setInputType(z5Var.getInputType() | TLObject.FLAG_14);
        z5Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        if (onClickListener != null) {
            int i12 = i7 == 1 ? 92 : 58;
            boolean z9 = id.a0;
            addView(z5Var, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 16, z9 ? i12 : 54.0f, 0.0f, !z9 ? i12 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i13 = org.telegram.ui.ActionBar.m6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView, i13, h6Var, mode);
            addView(imageView, c8.ha.d(48, 48.0f, (id.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i14 = org.telegram.ui.ActionBar.m6.Ji;
            y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.t6.s(imageView2, i13, h6Var, mode);
            imageView2.setContentDescription(id.M0(2131751598, null));
            boolean z10 = id.a0;
            addView(imageView2, c8.ha.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
            this.n = m5Var;
            m5Var.setTextSize(13);
            this.n.setGravity((id.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z11 = id.a0;
            addView(view, c8.ha.d(48, 24.0f, (z11 ? 3 : 5) | 48, z11 ? 20.0f : 0.0f, 43.0f, z11 ? 0.0f : 20.0f, 0.0f));
            wo woVar = new wo(21, context, h6Var);
            this.r = woVar;
            woVar.b(-1, i13, org.telegram.ui.ActionBar.m6.k7);
            woVar.setContentDescription(id.M0(2131754796, null));
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setAlpha(0.0f);
            woVar.setDrawBackgroundAsArc(8);
            addView(woVar, c8.ha.d(48, 48.0f, (id.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
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
            boolean z12 = id.a0;
            addView(z5Var, c8.ha.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? i15 : 19.0f, 0.0f, z12 ? 19.0f : i15, 0.0f));
        }
        if (i7 == 1) {
            ig igVar = new ig(context);
            this.D = igVar;
            org.telegram.ui.ActionBar.t6.s(igVar, org.telegram.ui.ActionBar.m6.m6, h6Var, PorterDuff.Mode.SRC_IN);
            igVar.j(gg.e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            igVar.setPadding(L, L, L, L);
            igVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z13 = id.a0;
            addView(igVar, c8.ha.d(48, 48.0f, z13 ? 3 : 5, z13 ? i16 : 0.0f, 0.0f, z13 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.m6.Ji;
            y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i17, h6Var), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
            igVar.setBackground(h03);
            org.telegram.ui.ActionBar.t6.j(igVar, h03, null, M2, h6Var);
            igVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
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
            igVar.setContentDescription(id.M0(2131751196, null));
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        ig igVar;
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
        if (i7 != 1 || (igVar = this.D) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        igVar.setScaleX(f14);
        igVar.setScaleY(f14);
        igVar.setAlpha(f13);
        igVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.m5 m5Var = this.n;
        if (m5Var != null && this.f == null && m5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
            } else {
                this.n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
            }
        }
    }

    public final bi a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        bi biVar = new bi(getContext(), 38);
        this.e = biVar;
        biVar.setFocusable(false);
        bi biVar2 = this.e;
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        org.telegram.ui.ActionBar.t6.Q(biVar2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i7), h6Var);
        c8.ka.a(this.e);
        bi biVar3 = this.e;
        boolean z9 = id.a0;
        addView(biVar3, c8.ha.d(48, 50.0f, (z9 ? 3 : 5) | 48, z9 ? 4.0f : 0.0f, 0.0f, z9 ? 0.0f : 4.0f, 0.0f));
        ig igVar = this.D;
        if (igVar != null) {
            boolean z10 = id.a0;
            igVar.setLayoutParams(c8.ha.d(48, 48.0f, (z10 ? 3 : 5) | 48, z10 ? 44 : 0.0f, 1.0f, z10 ? 0.0f : 44, 0.0f));
        }
        z5 z5Var = this.d;
        if (z5Var != null) {
            float f10 = (id.a0 ? ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) z5Var.getLayoutParams()).leftMargin) / org.telegram.messenger.g0.p;
            int i10 = (igVar != null ? 70 : 19) + 24;
            boolean z11 = id.a0;
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
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.n = m5Var;
        m5Var.setTextSize(13);
        this.n.setGravity((id.a0 ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.n;
        boolean z9 = id.a0;
        addView(m5Var2, c8.ha.d(48, 24.0f, (z9 ? 3 : 5) | 48, z9 ? 20.0f : 0.0f, 17.0f, z9 ? 0.0f : 20.0f, 0.0f));
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

    public ig getEmojiButton() {
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

    public org.telegram.ui.ActionBar.m5 getTextView2() {
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
            boolean z9 = id.a0;
            ImageView imageView = this.h;
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.a0) {
                i7 = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ig igVar;
        ImageView imageView;
        z5 z5Var;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            igVar = this.D;
            imageView = this.f;
            z5Var = this.d;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt != z5Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == igVar) {
                    igVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.m5 m5Var = this.n;
                        if (childAt == m5Var) {
                            m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
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
        z5Var.measure(org.telegram.messenger.camera.q.c(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : igVar != null ? qs.a2 : qs.G1, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = z5Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), z5Var.getMeasuredHeight()) + (this.w ? 1 : 0));
        org.telegram.ui.ActionBar.m5 m5Var2 = this.n;
        if (m5Var2 == null || this.y) {
            return;
        }
        m5Var2.setAlpha(measuredHeight >= org.telegram.messenger.g0.L(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z9) {
        this.b.a(z9, true);
    }

    @Override // org.telegram.ui.Components.mw0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.t6.s(imageView2, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        }
        ig igVar = this.D;
        if (igVar != null) {
            org.telegram.ui.ActionBar.t6.s(igVar, i7, h6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z9) {
        this.s = z9;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.m5 m5Var = this.n;
        if (m5Var == null) {
            return;
        }
        m5Var.l(str, false);
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
