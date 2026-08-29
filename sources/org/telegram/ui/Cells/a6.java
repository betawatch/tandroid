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
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class a6 extends FrameLayout implements dy0, vd.b {
    public Integer A;
    public final vd.a a;
    public final vd.a b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final bh.b d;
    public bh.g e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.h5 n;
    public final hp r;
    public boolean s;
    public boolean v;
    public AnimatorSet w;
    public boolean x;
    public final tg y;

    public a6(Context context, int i10, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        jr jrVar = jr.h;
        this.a = new vd.a(0, this, jrVar, 380L, false);
        this.b = new vd.a(1, this, jrVar, 380L, false);
        this.c = c6Var;
        bh.b bVar = new bh.b(this, context, c6Var, 2);
        this.d = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        bVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        bVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        bVar.setTextSize(1, 16.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(bVar.getImeOptions() | TLObject.FLAG_28);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i11 = i10 == 1 ? 92 : 58;
            boolean z10 = LocaleController.isRTL;
            addView(bVar, i7.f6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i11 : 54.0f, 0.0f, !z10 ? i11 : 54.0f, 0.0f));
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
            addView(imageView, i7.f6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
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
            addView(imageView2, i7.f6.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.n = h5Var;
            h5Var.setTextSize(13);
            this.n.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = LocaleController.isRTL;
            addView(view, i7.f6.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            hp hpVar = new hp(context, 21, c6Var);
            this.r = hpVar;
            hpVar.b(-1, i12, org.telegram.ui.ActionBar.g6.k7);
            hpVar.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            hpVar.setDrawUnchecked(true);
            hpVar.a(true, false);
            hpVar.setAlpha(0.0f);
            hpVar.setDrawBackgroundAsArc(8);
            addView(hpVar, i7.f6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i13 = 0;
            hpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
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
            int i14 = i10 == 1 ? 70 : 19;
            boolean z13 = LocaleController.isRTL;
            addView(bVar, i7.f6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i14 : 19.0f, 0.0f, z13 ? 19.0f : i14, 0.0f));
        }
        if (i10 == 1) {
            tg tgVar = new tg(context);
            this.y = tgVar;
            tgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m6, c6Var), PorterDuff.Mode.SRC_IN));
            tgVar.j(rg.e, false);
            int dp = AndroidUtilities.dp(9.5f);
            tgVar.setPadding(dp, dp, dp, dp);
            tgVar.setVisibility(8);
            int i15 = this.f == null ? 3 : 38;
            boolean z14 = LocaleController.isRTL;
            addView(tgVar, i7.f6.d(48, 48.0f, z14 ? 3 : 5, z14 ? i15 : 0.0f, 0.0f, z14 ? 0.0f : i15, 0.0f));
            tgVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            final int i16 = 1;
            tgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z5
                public final /* synthetic */ a6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
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
            tgVar.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        tg tgVar;
        if (i10 == 0) {
            hp hpVar = this.r;
            if (hpVar != null) {
                CheckBoxBase checkBoxBase = hpVar.getCheckBoxBase();
                float f11 = this.a.e;
                if (checkBoxBase.w != f11) {
                    checkBoxBase.w = f11;
                    checkBoxBase.b();
                }
                hpVar.invalidate();
                return;
            }
            return;
        }
        if (i10 != 1 || (tgVar = this.y) == null) {
            return;
        }
        float f12 = this.b.e;
        float f13 = 0.85f * f12;
        tgVar.setScaleX(f13);
        tgVar.setScaleY(f13);
        tgVar.setAlpha(f12);
        tgVar.setVisibility(f12 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.h5 h5Var = this.n;
        if (h5Var != null && this.f == null && h5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.n.setTranslationY(AndroidUtilities.dp(26.0f) * f12);
            }
        }
    }

    public final bh.g a() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        bh.g gVar = new bh.g(getContext(), 38);
        this.e = gVar;
        gVar.setFocusable(false);
        this.e.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, this.c), 1, -1));
        i7.h6.a(this.e);
        bh.g gVar2 = this.e;
        boolean z10 = LocaleController.isRTL;
        addView(gVar2, i7.f6.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        tg tgVar = this.y;
        if (tgVar != null) {
            boolean z11 = LocaleController.isRTL;
            tgVar.setLayoutParams(i7.f6.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        bh.b bVar = this.d;
        if (bVar != null) {
            float f9 = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) bVar.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i10 = (tgVar != null ? 70 : 19) + 24;
            boolean z12 = LocaleController.isRTL;
            int i11 = (z12 ? 5 : 3) | 16;
            float f10 = z12 ? i10 : f9;
            if (!z12) {
                f9 = i10;
            }
            bVar.setLayoutParams(i7.f6.d(-1, -2.0f, i11, f10, 0.0f, f9, 0.0f));
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
        addView(h5Var2, i7.f6.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.dy0
    public final void d(bh.c cVar) {
        this.d.addTextChangedListener(cVar);
    }

    public boolean e() {
        return true;
    }

    public boolean f(a6 a6Var) {
        return false;
    }

    public hp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.dy0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.dy0
    public Editable getEditText() {
        return this.d.getText();
    }

    public tg getEmojiButton() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.dy0
    public CharSequence getFieldText() {
        bh.b bVar = this.d;
        if (bVar.length() > 0) {
            return bVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.dy0
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

    public void h(a6 a6Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean l(ArrayList arrayList) {
        return false;
    }

    public final void m(boolean z10, boolean z11) {
        hp hpVar = this.r;
        if (z10 == (hpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        hpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            hpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(hpVar, (Property<hp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.w.setDuration(180L);
        this.w.start();
    }

    public final void n(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        bh.b bVar = this.d;
        bVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            bVar.setSelection(bVar.length());
        }
        bVar.setHint(str);
        this.v = z10;
        setWillNotDraw(!z10);
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hp hpVar = this.r;
        if (hpVar != null) {
            m(o(), false);
            hpVar.a(f(this), false);
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
        tg tgVar;
        ImageView imageView;
        bh.b bVar;
        int size = View.MeasureSpec.getSize(i10);
        int i12 = 0;
        while (true) {
            int childCount = getChildCount();
            tgVar = this.y;
            imageView = this.f;
            bVar = this.d;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt != bVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else if (childAt == tgVar) {
                    tgVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = this.n;
                        if (childAt == h5Var) {
                            h5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                        } else {
                            hp hpVar = this.r;
                            if (childAt == hpVar) {
                                hpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
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
        bVar.measure(org.telegram.ui.b.d(this.A != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : tgVar != null ? 144 : 122, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = bVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), bVar.getMeasuredHeight()) + (this.v ? 1 : 0));
        org.telegram.ui.ActionBar.h5 h5Var2 = this.n;
        if (h5Var2 == null || this.x) {
            return;
        }
        h5Var2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.dy0
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
        tg tgVar = this.y;
        if (tgVar != null) {
            tgVar.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
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

    public void j(a6 a6Var) {
    }

    public void k(bh.b bVar) {
    }

    public void g(bh.b bVar, ActionMode actionMode) {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
