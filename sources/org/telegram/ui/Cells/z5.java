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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class z5 extends FrameLayout implements ux0, ud.b {
    public Integer A;
    public final ud.a a;
    public final ud.a b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final gh.r d;
    public zg.d e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 n;
    public final bp r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final mg y;

    public z5(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        er erVar = er.h;
        this.a = new ud.a(0, this, erVar, 380L, false);
        this.b = new ud.a(1, this, erVar, 380L, false);
        this.c = c6Var;
        gh.r rVar = new gh.r(this, context, c6Var, 1);
        this.d = rVar;
        rVar.setAllowTextEntitiesIntersection(true);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        rVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        rVar.setTextSize(1, 16.0f);
        rVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        rVar.setBackground(null);
        rVar.setImeOptions(rVar.getImeOptions() | TLObject.FLAG_28);
        rVar.setInputType(rVar.getInputType() | 16384);
        rVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(rVar, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i11 : 54.0f, 0.0f, !z10 ? i11 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i12 = org.telegram.ui.ActionBar.g6.m6;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
            addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z11 = LocaleController.isRTL;
            addView(imageView2, h7.z5.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.n = h5Var;
            h5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, h7.z5.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            bp bpVar = new bp(context, 21, c6Var);
            this.r = bpVar;
            bpVar.b(-1, i12, org.telegram.ui.ActionBar.g6.k7);
            bpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            bpVar.setDrawUnchecked(true);
            bpVar.a(true, false);
            bpVar.setAlpha(0.0f);
            bpVar.setDrawBackgroundAsArc(8);
            addView(bpVar, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i13 = 0;
            bpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ z5 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
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
            int i14 = i10 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(rVar, h7.z5.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i14 : 19.0f, 0.0f, z13 ? 19.0f : i14, 0.0f));
        }
        if (i10 == 1) {
            mg mgVar = new mg(context);
            this.y = mgVar;
            mgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m6, c6Var), PorterDuff.Mode.SRC_IN));
            mgVar.j(kg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            mgVar.setPadding(dp, dp, dp, dp);
            mgVar.setVisibility(8);
            int i15 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(mgVar, h7.z5.d(48, 48.0f, z14 ? 3 : 5, z14 ? i15 : 0.0f, 0.0f, z14 ? 0.0f : i15, 0.0f));
            mgVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            final int i16 = 1;
            mgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
                public final /* synthetic */ z5 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
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
            mgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override // org.telegram.ui.Components.ux0
    public final void a(ch.e eVar) {
        this.d.addTextChangedListener(eVar);
    }

    public final zg.d b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        zg.d dVar = new zg.d(getContext(), 38);
        this.e = dVar;
        dVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, this.c), 1, -1));
        h7.b6.a(this.e);
        zg.d dVar2 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(dVar2, h7.z5.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        mg mgVar = this.y;
        if (mgVar != null) {
            boolean z11 = LocaleController.isRTL;
            mgVar.setLayoutParams(h7.z5.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        gh.r rVar = this.d;
        if (rVar != null) {
            float f10 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) rVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) rVar.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i10 = (mgVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i11 = (z12 ? 5 : 3) | 16;
            float f11 = z12 ? i10 : f10;
            if (!z12) {
                f10 = i10;
            }
            rVar.setLayoutParams(h7.z5.d(-1, -2.0f, i11, f11, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        this.x = true;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.n = h5Var;
        h5Var.setTextSize(13);
        this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.n;
        boolean z10 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    public boolean e() {
        return true;
    }

    public boolean f(z5 z5Var) {
        return false;
    }

    public bp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.ux0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.ux0
    public Editable getEditText() {
        return this.d.getText();
    }

    public mg getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.ux0
    public CharSequence getFieldText() {
        gh.r rVar = this.d;
        if (rVar.length() > 0) {
            return rVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ux0
    public org.telegram.ui.ActionBar.n2 getParentFragment() {
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

    public void h(z5 z5Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        bp bpVar = this.r;
        if (z10 == (bpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        bpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            bpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bpVar, (Property<bp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        gh.r rVar = this.d;
        rVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            rVar.setSelection(rVar.length());
        }
        rVar.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        mg mgVar;
        if (i10 == 0) {
            bp bpVar = this.r;
            if (bpVar != null) {
                CheckBoxBase checkBoxBase = bpVar.getCheckBoxBase();
                float f12 = this.a.e;
                if (checkBoxBase.w != f12) {
                    checkBoxBase.w = f12;
                    checkBoxBase.b();
                }
                bpVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (mgVar = this.y) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        mgVar.setScaleX(f14);
        mgVar.setScaleY(f14);
        mgVar.setAlpha(f13);
        mgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.h5 h5Var = this.n;
        if (h5Var != null && this.f == null && h5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f13);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bp bpVar = this.r;
        if (bpVar != null) {
            m(p(), false);
            bpVar.a(f(this), false);
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
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        mg mgVar;
        ImageView imageView;
        gh.r rVar;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            mgVar = this.y;
            imageView = this.f;
            rVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != rVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == mgVar) {
                    mgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            bp bpVar = this.r;
                            if (childAt == bpVar) {
                                bpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
        rVar.measure(rl.d(this.A != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : mgVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = rVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), rVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.n;
        if (h5Var2 == null || this.x) {
            return;
        }
        h5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.ux0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        mg mgVar = this.y;
        if (mgVar != null) {
            mgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
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

    public void setTextColor(int i10) {
        this.d.setTextColor(i10);
    }

    public void setTextRight(int i10) {
        this.A = Integer.valueOf(i10);
    }

    public void i(boolean z10) {
    }

    public void j(z5 z5Var) {
    }

    public void k(gh.r rVar) {
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }

    public void g(gh.r rVar, ActionMode actionMode) {
    }
}
