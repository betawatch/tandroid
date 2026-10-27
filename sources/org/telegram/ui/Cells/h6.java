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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.yg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class h6 extends FrameLayout implements sz0, oe.d {
    public Integer E;
    public final oe.b a;
    public final oe.b b;
    public final org.telegram.ui.ActionBar.u6 c;
    public final g6 d;
    public sh.d e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.b6 n;
    public final aq r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final ah y;

    public h6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        ds dsVar = ds.h;
        this.a = new oe.b(0, this, dsVar, 380L, false);
        this.b = new oe.b(1, this, dsVar, 380L, false);
        this.c = u6Var;
        g6 g6Var = new g6(this, context, u6Var, 0);
        this.d = g6Var;
        g6Var.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.f7.V(g6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(g6Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        org.telegram.ui.ActionBar.f7.E(g6Var, org.telegram.ui.ActionBar.y6.H6, u6Var);
        g6Var.setTextSize(1, 16.0f);
        g6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        g6Var.setBackground(null);
        g6Var.setImeOptions(g6Var.getImeOptions() | TLObject.FLAG_28);
        g6Var.setInputType(g6Var.getInputType() | 16384);
        g6Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(g6Var, kb1.h(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i11 : 54.0f, 0.0f, !z10 ? i11 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i12 = org.telegram.ui.ActionBar.y6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, mode);
            addView(imageView, kb1.h(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i13 = org.telegram.ui.ActionBar.y6.Vh;
            y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
            imageView2.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.f7.t(imageView2, i12, u6Var, mode);
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            addView(imageView2, kb1.h(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
            this.n = b6Var;
            b6Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, kb1.h(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            aq aqVar = new aq(context, 21, u6Var);
            this.r = aqVar;
            aqVar.b(-1, i12, org.telegram.ui.ActionBar.y6.k7);
            aqVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            aqVar.setDrawUnchecked(true);
            aqVar.a(true, false);
            aqVar.setAlpha(0.0f);
            aqVar.setDrawBackgroundAsArc(8);
            addView(aqVar, kb1.h(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i14 = 0;
            aqVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.f6
                public final /* synthetic */ h6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            h6 h6Var = this.b;
                            if (h6Var.r.getTag() != null) {
                                h6Var.h(h6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            h6 h6Var2 = this.b;
                            h6Var2.j(h6Var2);
                            break;
                    }
                }
            });
        } else {
            int i15 = i10 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(g6Var, kb1.h(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i15 : 19.0f, 0.0f, z13 ? 19.0f : i15, 0.0f));
        }
        if (i10 == 1) {
            ah ahVar = new ah(context);
            this.y = ahVar;
            org.telegram.ui.ActionBar.f7.t(ahVar, org.telegram.ui.ActionBar.y6.m6, u6Var, PorterDuff.Mode.SRC_IN);
            ahVar.j(yg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            ahVar.setPadding(dp, dp, dp, dp);
            ahVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(ahVar, kb1.h(48, 48.0f, z14 ? 3 : 5, z14 ? i16 : 0.0f, 0.0f, z14 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.y6.Vh;
            y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i17, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i17);
            ahVar.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(ahVar, g03, null, N2, u6Var);
            final int i18 = 1;
            ahVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.f6
                public final /* synthetic */ h6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            h6 h6Var = this.b;
                            if (h6Var.r.getTag() != null) {
                                h6Var.h(h6Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            h6 h6Var2 = this.b;
                            h6Var2.j(h6Var2);
                            break;
                    }
                }
            });
            ahVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        ah ahVar;
        if (i10 == 0) {
            aq aqVar = this.r;
            if (aqVar != null) {
                CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                float f11 = this.a.e;
                if (checkBoxBase.w != f11) {
                    checkBoxBase.w = f11;
                    checkBoxBase.b();
                }
                aqVar.invalidate();
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
        org.telegram.ui.ActionBar.b6 b6Var = this.n;
        if (b6Var != null && this.f == null && b6Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
            }
        }
    }

    public final sh.d a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        sh.d dVar = new sh.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        sh.d dVar2 = this.e;
        int i10 = org.telegram.ui.ActionBar.y6.Vh;
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        org.telegram.ui.ActionBar.f7.R(dVar2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i10), u6Var);
        kb1.b(this.e);
        sh.d dVar3 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(dVar3, kb1.h(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        ah ahVar = this.y;
        if (ahVar != null) {
            boolean z11 = LocaleController.isRTL;
            ahVar.setLayoutParams(kb1.h(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        g6 g6Var = this.d;
        if (g6Var != null) {
            float f7 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) g6Var.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) g6Var.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i11 = (ahVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i12 = (z12 ? 5 : 3) | 16;
            float f10 = z12 ? i11 : f7;
            if (!z12) {
                f7 = i11;
            }
            g6Var.setLayoutParams(kb1.h(-1, -2.0f, i12, f10, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.x = true;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
        this.n = b6Var;
        b6Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.n;
        boolean z10 = LocaleController.isRTL;
        addView(b6Var2, kb1.h(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.sz0
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean e() {
        return true;
    }

    public boolean f(h6 h6Var) {
        return false;
    }

    public aq getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.sz0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.sz0
    public Editable getEditText() {
        return this.d.getText();
    }

    public ah getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.sz0
    public CharSequence getFieldText() {
        g6 g6Var = this.d;
        if (g6Var.length() > 0) {
            return g6Var.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.sz0
    public org.telegram.ui.ActionBar.r2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.b6 getTextView2() {
        return this.n;
    }

    public void h(h6 h6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        aq aqVar = this.r;
        if (z10 == (aqVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        aqVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            aqVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(aqVar, (Property<aq, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        g6 g6Var = this.d;
        g6Var.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            g6Var.setSelection(g6Var.length());
        }
        g6Var.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aq aqVar = this.r;
        if (aqVar != null) {
            m(o(), false);
            aqVar.a(f(this), false);
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ah ahVar;
        ImageView imageView;
        g6 g6Var;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            ahVar = this.y;
            imageView = this.f;
            g6Var = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != g6Var) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == ahVar) {
                    ahVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.b6 b6Var = this.n;
                        if (childAt == b6Var) {
                            b6Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            aq aqVar = this.r;
                            if (childAt == aqVar) {
                                aqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
        g6Var.measure(wh.x(this.E != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : ahVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = g6Var.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), g6Var.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.b6 b6Var2 = this.n;
        if (b6Var2 == null || this.x) {
            return;
        }
        b6Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.sz0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.f7.t(imageView2, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        }
        ah ahVar = this.y;
        if (ahVar != null) {
            org.telegram.ui.ActionBar.f7.t(ahVar, i10, u6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.n;
        if (b6Var == null) {
            return;
        }
        b6Var.k(str);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.E = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(h6 h6Var) {
    }

    public void k(g6 g6Var) {
    }

    public void g(g6 g6Var, ActionMode actionMode) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
