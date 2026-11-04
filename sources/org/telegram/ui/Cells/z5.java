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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class z5 extends FrameLayout implements mw0, qe.b {
    public final hg E;
    public Integer F;
    public final qe.a a;
    public final qe.a b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ai.z d;
    public ai e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.k5 n;
    public final wo r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public z5(Context context, int i3, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 380L, false);
        final int i10 = 1;
        this.b = new qe.a(1, this, xqVar, 380L, false);
        this.c = e6Var;
        ai.z zVar = new ai.z(this, context, e6Var, i10);
        this.d = zVar;
        zVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.r6.V(zVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(zVar, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        org.telegram.ui.ActionBar.r6.E(zVar, org.telegram.ui.ActionBar.k6.H6, e6Var);
        zVar.setTextSize(1, 16.0f);
        zVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        zVar.setBackground(null);
        zVar.setImeOptions(zVar.getImeOptions() | TLObject.FLAG_28);
        zVar.setInputType(zVar.getInputType() | TLObject.FLAG_14);
        zVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        final int i11 = 0;
        if (onClickListener != null) {
            int i12 = i3 == 1 ? 92 : 58;
            boolean z10 = bd.a0;
            addView(zVar, mf.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i12 : 54.0f, 0.0f, !z10 ? i12 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i13 = org.telegram.ui.ActionBar.k6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, mode);
            addView(imageView, mf.d(48, 48.0f, (bd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i14 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.r6.t(imageView2, i13, e6Var, mode);
            imageView2.setContentDescription(bd.M0(2131751599, null));
            boolean z11 = bd.a0;
            addView(imageView2, mf.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            this.n = k5Var;
            k5Var.setTextSize(13);
            this.n.setGravity((bd.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = bd.a0;
            addView(view, mf.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            wo woVar = new wo(21, context, e6Var);
            this.r = woVar;
            woVar.b(-1, i13, org.telegram.ui.ActionBar.k6.k7);
            woVar.setContentDescription(bd.M0(2131754796, null));
            woVar.setDrawUnchecked(true);
            woVar.a(true, false);
            woVar.setAlpha(0.0f);
            woVar.setDrawBackgroundAsArc(8);
            addView(woVar, mf.d(48, 48.0f, (bd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            woVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ z5 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            z5 z5Var = this.b;
                            if (z5Var.r.getTag() != null) {
                                z5Var.h(z5Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            z5 z5Var2 = this.b;
                            z5Var2.j(z5Var2);
                            break;
                    }
                }
            });
        } else {
            int i15 = i3 == 1 ? 70 : 19;
            boolean z13 = bd.a0;
            addView(zVar, mf.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i15 : 19.0f, 0.0f, z13 ? 19.0f : i15, 0.0f));
        }
        if (i3 == 1) {
            hg hgVar = new hg(context);
            this.E = hgVar;
            org.telegram.ui.ActionBar.r6.t(hgVar, org.telegram.ui.ActionBar.k6.m6, e6Var, PorterDuff.Mode.SRC_IN);
            hgVar.j(fg.e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            hgVar.setPadding(L, L, L, L);
            hgVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z14 = bd.a0;
            addView(hgVar, mf.d(48, 48.0f, z14 ? 3 : 5, z14 ? i16 : 0.0f, 0.0f, z14 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.k6.Ji;
            y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i17, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
            hgVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(hgVar, h03, null, N2, e6Var);
            hgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ z5 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            z5 z5Var = this.b;
                            if (z5Var.r.getTag() != null) {
                                z5Var.h(z5Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            z5 z5Var2 = this.b;
                            z5Var2.j(z5Var2);
                            break;
                    }
                }
            });
            hgVar.setContentDescription(bd.M0(2131751197, null));
        }
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        hg hgVar;
        if (i3 == 0) {
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
        if (i3 != 1 || (hgVar = this.E) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        hgVar.setScaleX(f14);
        hgVar.setScaleY(f14);
        hgVar.setAlpha(f13);
        hgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.k5 k5Var = this.n;
        if (k5Var != null && this.f == null && k5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
            } else {
                this.n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
            }
        }
    }

    public final ai a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ai aiVar = new ai(getContext(), 38);
        this.e = aiVar;
        aiVar.setFocusable(false);
        ai aiVar2 = this.e;
        int i3 = org.telegram.ui.ActionBar.k6.Ji;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        org.telegram.ui.ActionBar.r6.R(aiVar2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i3), e6Var);
        pf.a(this.e);
        ai aiVar3 = this.e;
        boolean z10 = bd.a0;
        addView(aiVar3, mf.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        hg hgVar = this.E;
        if (hgVar != null) {
            boolean z11 = bd.a0;
            hgVar.setLayoutParams(mf.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        ai.z zVar = this.d;
        if (zVar != null) {
            float f10 = (bd.a0 ? ((ViewGroup.MarginLayoutParams) zVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) zVar.getLayoutParams()).leftMargin) / org.telegram.messenger.g0.p;
            int i10 = (hgVar != null ? 70 : 19) + 24;
            boolean z12 = bd.a0;
            int i11 = (z12 ? 5 : 3) | 16;
            float f11 = z12 ? i10 : f10;
            if (!z12) {
                f10 = i10;
            }
            zVar.setLayoutParams(mf.d(-1, -2.0f, i11, f11, 0.0f, f10, 0.0f));
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
        this.n.setGravity((bd.a0 ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.n;
        boolean z10 = bd.a0;
        addView(k5Var2, mf.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(z5 z5Var) {
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

    public hg getEmojiButton() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.mw0
    public CharSequence getFieldText() {
        ai.z zVar = this.d;
        if (zVar.length() > 0) {
            return zVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.mw0
    public org.telegram.ui.ActionBar.d2 getParentFragment() {
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

    public void h(z5 z5Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        wo woVar = this.r;
        if (z10 == (woVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        woVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            woVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(woVar, (Property<wo, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        ai.z zVar = this.d;
        zVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            zVar.setSelection(zVar.length());
        }
        zVar.setHint(str);
        this.w = z10;
        setWillNotDraw(!z10);
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
        int i3;
        if (this.w && e()) {
            boolean z10 = bd.a0;
            ImageView imageView = this.h;
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.a0) {
                i3 = org.telegram.messenger.g0.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        hg hgVar;
        ImageView imageView;
        ai.z zVar;
        int size = View.MeasureSpec.getSize(i3);
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            hgVar = this.E;
            imageView = this.f;
            zVar = this.d;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt != zVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == hgVar) {
                    hgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
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
                                    childAt.measure(i3, i10);
                                }
                            }
                        }
                    }
                }
            }
            i11++;
        }
        zVar.measure(org.telegram.messenger.camera.q.c(this.F != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : hgVar != null ? hs.a2 : hs.G1, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = zVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), zVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        org.telegram.ui.ActionBar.k5 k5Var2 = this.n;
        if (k5Var2 == null || this.y) {
            return;
        }
        k5Var2.setAlpha(measuredHeight >= org.telegram.messenger.g0.L(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.mw0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        hg hgVar = this.E;
        if (hgVar != null) {
            org.telegram.ui.ActionBar.r6.t(hgVar, i3, e6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.k5 k5Var = this.n;
        if (k5Var == null) {
            return;
        }
        k5Var.l(str, false);
    }

    public void setTextColor(int i3) {
        this.d.setTextColor(i3);
    }

    public void setTextRight(int i3) {
        this.F = Integer.valueOf(i3);
    }

    public void i(boolean z10) {
    }

    public void j(z5 z5Var) {
    }

    public void k(ai.z zVar) {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }

    public void g(ai.z zVar, ActionMode actionMode) {
    }
}
