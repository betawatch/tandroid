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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class c6 extends FrameLayout implements py0, xd.b {
    public Integer B;
    public final xd.a a;
    public final xd.a b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final eh.b d;
    public eh.g e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.l5 n;
    public final np r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final qg y;

    public c6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        pr prVar = pr.h;
        this.a = new xd.a(0, this, prVar, 380L, false);
        this.b = new xd.a(1, this, prVar, 380L, false);
        this.c = g6Var;
        eh.b bVar = new eh.b(this, context, g6Var, 2);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        bVar.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
        bVar.setTextSize(1, 16.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(bVar.getImeOptions() | TLObject.FLAG_28);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z4 = LocaleController.isRTL;
            addView(bVar, k7.c6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i11 : 54.0f, 0.0f, !z4 ? i11 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i12 = org.telegram.ui.ActionBar.k6.m6;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            addView(imageView, k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vh, g6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z10 = LocaleController.isRTL;
            addView(imageView2, k7.c6.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            this.n = l5Var;
            l5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z11 = LocaleController.isRTL;
            addView(view, k7.c6.d(48, 24.0f, (z11 ? 3 : 5) | 48, z11 ? 20.0f : 0.0f, 43.0f, z11 ? 0.0f : 20.0f, 0.0f));
            np npVar = new np(context, 21, g6Var);
            this.r = npVar;
            npVar.b(-1, i12, org.telegram.ui.ActionBar.k6.k7);
            npVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            npVar.setDrawUnchecked(true);
            npVar.a(true, false);
            npVar.setAlpha(0.0f);
            npVar.setDrawBackgroundAsArc(8);
            addView(npVar, k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i13 = 0;
            npVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
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
            boolean z12 = LocaleController.isRTL;
            addView(bVar, k7.c6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? i14 : 19.0f, 0.0f, z12 ? 19.0f : i14, 0.0f));
        }
        if (i10 == 1) {
            qg qgVar = new qg(context);
            this.y = qgVar;
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.m6, g6Var), PorterDuff.Mode.SRC_IN));
            qgVar.j(og.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            qgVar.setPadding(dp, dp, dp, dp);
            qgVar.setVisibility(8);
            int i15 = this.f == null ? 3 : 38;
            boolean z13 = LocaleController.isRTL;
            addView(qgVar, k7.c6.d(48, 48.0f, z13 ? 3 : 5, z13 ? i15 : 0.0f, 0.0f, z13 ? 0.0f : i15, 0.0f));
            qgVar.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vh, g6Var), 1, -1));
            final int i16 = 1;
            qgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
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
            qgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        qg qgVar;
        if (i10 == 0) {
            np npVar = this.r;
            if (npVar != null) {
                CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
                float f12 = this.a.e;
                if (checkBoxBase.w != f12) {
                    checkBoxBase.w = f12;
                    checkBoxBase.b();
                }
                npVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (qgVar = this.y) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        qgVar.setScaleX(f14);
        qgVar.setScaleY(f14);
        qgVar.setAlpha(f13);
        qgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.l5 l5Var = this.n;
        if (l5Var != null && this.f == null && l5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f13);
            }
        }
    }

    @Override // org.telegram.ui.Components.py0
    public final void a(eh.c cVar) {
        this.d.addTextChangedListener(cVar);
    }

    public final eh.g b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        eh.g gVar = new eh.g(getContext(), 38);
        this.e = gVar;
        gVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vh, this.c), 1, -1));
        k7.e6.a(this.e);
        eh.g gVar2 = this.e;
        boolean z4 = LocaleController.isRTL;
        addView(gVar2, k7.c6.d(48, 50.0f, (z4 ? 3 : 5) | 48, z4 ? 4.0f : 0.0f, 0.0f, z4 ? 0.0f : 4.0f, 0.0f));
        qg qgVar = this.y;
        if (qgVar != null) {
            boolean z10 = LocaleController.isRTL;
            qgVar.setLayoutParams(k7.c6.d(48, 48.0f, (z10 ? 3 : 5) | 48, z10 ? 44 : 0.0f, 1.0f, z10 ? 0.0f : 44, 0.0f));
        }
        eh.b bVar = this.d;
        if (bVar != null) {
            float f10 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i10 = (qgVar != null ? 70 : 19) + 24;
            boolean z11 = LocaleController.isRTL;
            int i11 = (z11 ? 5 : 3) | 16;
            float f11 = z11 ? i10 : f10;
            if (!z11) {
                f10 = i10;
            }
            bVar.setLayoutParams(k7.c6.d(-1, -2.0f, i11, f11, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        this.x = true;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.n = l5Var;
        l5Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.n;
        boolean z4 = LocaleController.isRTL;
        addView(l5Var2, k7.c6.d(48, 24.0f, (z4 ? 3 : 5) | 48, z4 ? 20.0f : 0.0f, 17.0f, z4 ? 0.0f : 20.0f, 0.0f));
    }

    public boolean e() {
        return true;
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public np getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.py0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.py0
    public Editable getEditText() {
        return this.d.getText();
    }

    public qg getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.py0
    public CharSequence getFieldText() {
        eh.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.py0
    public org.telegram.ui.ActionBar.p2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.l5 getTextView2() {
        return this.n;
    }

    public void h(c6 c6Var, boolean z4) {
        this.r.a(z4, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z4, boolean z10) {
        np npVar = this.r;
        if (z4 == (npVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        npVar.setTag(z4 ? 1 : null);
        ImageView imageView = this.h;
        if (!z10) {
            npVar.setAlpha(z4 ? 1.0f : 0.0f);
            imageView.setAlpha(z4 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z4 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(npVar, (Property<np, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z4 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z4) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        eh.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.v = z4;
        setWillNotDraw(!z4);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        np npVar = this.r;
        if (npVar != null) {
            m(o(), false);
            npVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.v && e()) {
            boolean z4 = LocaleController.isRTL;
            ImageView imageView = this.h;
            if (z4) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        qg qgVar;
        ImageView imageView;
        eh.b bVar;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            qgVar = this.y;
            imageView = this.f;
            bVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == qgVar) {
                    qgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.l5 l5Var = this.n;
                        if (childAt == l5Var) {
                            l5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            np npVar = this.r;
                            if (childAt == npVar) {
                                npVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
        bVar.measure(org.telegram.ui.b.d(this.B != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : qgVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), bVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.l5 l5Var2 = this.n;
        if (l5Var2 == null || this.x) {
            return;
        }
        l5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z4) {
        this.b.a(z4, true);
    }

    @Override // org.telegram.ui.Components.py0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        }
        qg qgVar = this.y;
        if (qgVar != null) {
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z4) {
        this.s = z4;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.l5 l5Var = this.n;
        if (l5Var == null) {
            return;
        }
        l5Var.l(str, false);
    }

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.B = Integer.valueOf(i10);
    }

    public void i(boolean z4) {
    }

    public void j(c6 c6Var) {
    }

    public void k(eh.b bVar) {
    }

    public void g(eh.b bVar, ActionMode actionMode) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
