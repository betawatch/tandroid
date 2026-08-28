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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sx0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class c6 extends FrameLayout implements sx0, td.b {
    public Integer A;
    public final td.a a;
    public final td.a b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final fh.s d;
    public yg.d e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 n;
    public final dp r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final qg y;

    public c6(Context context, int i9, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 380L, false);
        this.b = new td.a(1, this, grVar, 380L, false);
        this.c = b6Var;
        fh.s sVar = new fh.s(this, context, b6Var, 1);
        this.d = sVar;
        sVar.setAllowTextEntitiesIntersection(true);
        sVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        sVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        sVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        sVar.setTextSize(1, 16.0f);
        sVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        sVar.setBackground(null);
        sVar.setImeOptions(sVar.getImeOptions() | TLObject.FLAG_28);
        sVar.setInputType(sVar.getInputType() | 16384);
        sVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i10 = i9 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(sVar, g7.e6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i10 : 54.0f, 0.0f, !z10 ? i10 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i11 = org.telegram.ui.ActionBar.f6.m6;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            addView(imageView, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, b6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            addView(imageView2, g7.e6.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.n = h5Var;
            h5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, g7.e6.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            dp dpVar = new dp(context, 21, b6Var);
            this.r = dpVar;
            dpVar.b(-1, i11, org.telegram.ui.ActionBar.f6.k7);
            dpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            dpVar.setDrawUnchecked(true);
            dpVar.a(true, false);
            dpVar.setAlpha(0.0f);
            dpVar.setDrawBackgroundAsArc(8);
            addView(dpVar, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i12 = 0;
            dpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
                public final /* synthetic */ c6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
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
            int i13 = i9 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(sVar, g7.e6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i13 : 19.0f, 0.0f, z13 ? 19.0f : i13, 0.0f));
        }
        if (i9 == 1) {
            qg qgVar = new qg(context);
            this.y = qgVar;
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, b6Var), PorterDuff.Mode.SRC_IN));
            qgVar.j(og.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            qgVar.setPadding(dp, dp, dp, dp);
            qgVar.setVisibility(8);
            int i14 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(qgVar, g7.e6.d(48, 48.0f, z14 ? 3 : 5, z14 ? i14 : 0.0f, 0.0f, z14 ? 0.0f : i14, 0.0f));
            qgVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, b6Var), 1, -1));
            final int i15 = 1;
            qgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b6
                public final /* synthetic */ c6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
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

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        qg qgVar;
        if (i9 == 0) {
            dp dpVar = this.r;
            if (dpVar != null) {
                CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
                float f12 = this.a.e;
                if (checkBoxBase.w != f12) {
                    checkBoxBase.w = f12;
                    checkBoxBase.b();
                }
                dpVar.invalidate();
                return;
            }
            return;
        }
        if (i9 != 1 || (qgVar = this.y) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        qgVar.setScaleX(f14);
        qgVar.setScaleY(f14);
        qgVar.setAlpha(f13);
        qgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.h5 h5Var = this.n;
        if (h5Var != null && this.f == null && h5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f13);
            }
        }
    }

    public final yg.d a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        yg.d dVar = new yg.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vh, this.c), 1, -1));
        g7.g6.a(this.e);
        yg.d dVar2 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(dVar2, g7.e6.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        qg qgVar = this.y;
        if (qgVar != null) {
            boolean z11 = LocaleController.isRTL;
            qgVar.setLayoutParams(g7.e6.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        fh.s sVar = this.d;
        if (sVar != null) {
            float f10 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i9 = (qgVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i10 = (z12 ? 5 : 3) | 16;
            float f11 = z12 ? i9 : f10;
            if (!z12) {
                f10 = i9;
            }
            sVar.setLayoutParams(g7.e6.d(-1, -2.0f, i10, f11, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public final void b(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void c() {
        this.x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.n = h5Var;
        h5Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.n;
        boolean z10 = LocaleController.isRTL;
        addView(h5Var2, g7.e6.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    public boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void e(bh.f fVar) {
        this.d.addTextChangedListener(fVar);
    }

    public boolean f(c6 c6Var) {
        return false;
    }

    public dp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.sx0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.sx0
    public Editable getEditText() {
        return this.d.getText();
    }

    public qg getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.sx0
    public CharSequence getFieldText() {
        fh.s sVar = this.d;
        if (sVar.length() > 0) {
            return sVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.sx0
    public org.telegram.ui.ActionBar.o2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.h5 getTextView2() {
        return this.n;
    }

    public void h(c6 c6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        dp dpVar = this.r;
        if (z10 == (dpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        dpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            dpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(dpVar, (Property<dp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        fh.s sVar = this.d;
        sVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            sVar.setSelection(sVar.length());
        }
        sVar.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp dpVar = this.r;
        if (dpVar != null) {
            m(o(), false);
            dpVar.a(f(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
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
                i9 = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        qg qgVar;
        ImageView imageView;
        fh.s sVar;
        int size = View.MeasureSpec.getSize(i9);
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            qgVar = this.y;
            imageView = this.f;
            sVar = this.d;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt != sVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == qgVar) {
                    qgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            dp dpVar = this.r;
                            if (childAt == dpVar) {
                                dpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                } else {
                                    childAt.measure(i9, i10);
                                }
                            }
                        }
                    }
                }
            }
            i11++;
        }
        sVar.measure(ll.d(this.A != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : qgVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = sVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), sVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.n;
        if (h5Var2 == null || this.x) {
            return;
        }
        h5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.sx0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        qg qgVar = this.y;
        if (qgVar != null) {
            qgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.h5 h5Var = this.n;
        if (h5Var == null) {
            return;
        }
        h5Var.l(str, false);
    }

    public void setTextColor(int i9) {
        this.d.setTextColor(i9);
    }

    public void setTextRight(int i9) {
        this.A = Integer.valueOf(i9);
    }

    public void i(boolean z10) {
    }

    public void j(c6 c6Var) {
    }

    public void k(fh.s sVar) {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    public void g(fh.s sVar, ActionMode actionMode) {
    }
}
