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
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class z5 extends FrameLayout implements pw0, te.b {
    public final pg E;
    public Integer F;
    public final te.a a;
    public final te.a b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final bi.u d;
    public ji e;
    public final ImageView f;
    public final ImageView h;
    public org.telegram.ui.ActionBar.j5 n;
    public final fp r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public z5(Context context, int i7, View.OnClickListener onClickListener, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        er erVar = er.h;
        this.a = new te.a(0, this, erVar, 380L, false);
        final int i10 = 1;
        this.b = new te.a(1, this, erVar, 380L, false);
        this.c = e6Var;
        bi.u uVar = new bi.u(this, context, e6Var, i10);
        this.d = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        org.telegram.ui.ActionBar.q6.U(uVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(uVar, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        org.telegram.ui.ActionBar.q6.D(uVar, org.telegram.ui.ActionBar.j6.H6, e6Var);
        uVar.setTextSize(1, 16.0f);
        uVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        uVar.setBackground(null);
        uVar.setImeOptions(uVar.getImeOptions() | TLObject.FLAG_28);
        uVar.setInputType(uVar.getInputType() | TLObject.FLAG_14);
        uVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        final int i11 = 0;
        if (onClickListener != null) {
            int i12 = i7 == 1 ? 92 : 58;
            boolean z10 = hd.a0;
            addView(uVar, c8.ja.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? i12 : 54.0f, 0.0f, !z10 ? i12 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i13 = org.telegram.ui.ActionBar.j6.m6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.s(imageView, i13, e6Var, mode);
            addView(imageView, c8.ja.d(48, 48.0f, (hd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i14 = org.telegram.ui.ActionBar.j6.Mi;
            y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 1, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
            imageView2.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            org.telegram.ui.ActionBar.q6.s(imageView2, i13, e6Var, mode);
            imageView2.setContentDescription(hd.M0(2131751598, null));
            boolean z11 = hd.a0;
            addView(imageView2, c8.ja.d(48, 50.0f, (z11 ? 3 : 5) | 48, z11 ? 3.0f : 0.0f, 0.0f, z11 ? 0.0f : 3.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            this.n = j5Var;
            j5Var.setTextSize(13);
            this.n.setGravity((hd.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z12 = hd.a0;
            addView(view, c8.ja.d(48, 24.0f, (z12 ? 3 : 5) | 48, z12 ? 20.0f : 0.0f, 43.0f, z12 ? 0.0f : 20.0f, 0.0f));
            fp fpVar = new fp(21, context, e6Var);
            this.r = fpVar;
            fpVar.b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
            fpVar.setContentDescription(hd.M0(2131754796, null));
            fpVar.setDrawUnchecked(true);
            fpVar.a(true, false);
            fpVar.setAlpha(0.0f);
            fpVar.setDrawBackgroundAsArc(8);
            addView(fpVar, c8.ja.d(48, 48.0f, (hd.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            fpVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
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
                                z5Var.i(z5Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            z5 z5Var2 = this.b;
                            z5Var2.k(z5Var2);
                            break;
                    }
                }
            });
        } else {
            int i15 = i7 == 1 ? 70 : 19;
            boolean z13 = hd.a0;
            addView(uVar, c8.ja.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i15 : 19.0f, 0.0f, z13 ? 19.0f : i15, 0.0f));
        }
        if (i7 == 1) {
            pg pgVar = new pg(context);
            this.E = pgVar;
            org.telegram.ui.ActionBar.q6.s(pgVar, org.telegram.ui.ActionBar.j6.m6, e6Var, PorterDuff.Mode.SRC_IN);
            pgVar.j(ng.e, false);
            int L = org.telegram.messenger.g0.L(9.5f);
            pgVar.setPadding(L, L, L, L);
            pgVar.setVisibility(8);
            int i16 = this.f == null ? 3 : 38;
            boolean z14 = hd.a0;
            addView(pgVar, c8.ja.d(48, 48.0f, z14 ? 3 : 5, z14 ? i16 : 0.0f, 0.0f, z14 ? 0.0f : i16, 0.0f));
            int i17 = org.telegram.ui.ActionBar.j6.Mi;
            y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i17, e6Var), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i17);
            pgVar.setBackground(h03);
            org.telegram.ui.ActionBar.q6.j(pgVar, h03, null, M2, e6Var);
            pgVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y5
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
                                z5Var.i(z5Var, !r0.a.q);
                                break;
                            }
                            break;
                        default:
                            z5 z5Var2 = this.b;
                            z5Var2.k(z5Var2);
                            break;
                    }
                }
            });
            pgVar.setContentDescription(hd.M0(2131751196, null));
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        pg pgVar;
        if (i7 == 0) {
            fp fpVar = this.r;
            if (fpVar != null) {
                CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
                float f12 = this.a.e;
                if (checkBoxBase.w != f12) {
                    checkBoxBase.w = f12;
                    checkBoxBase.b();
                }
                fpVar.invalidate();
                return;
            }
            return;
        }
        if (i7 != 1 || (pgVar = this.E) == null) {
            return;
        }
        float f13 = this.b.e;
        float f14 = 0.85f * f13;
        pgVar.setScaleX(f14);
        pgVar.setScaleY(f14);
        pgVar.setAlpha(f13);
        pgVar.setVisibility(f13 > 0.0f ? 0 : 8);
        org.telegram.ui.ActionBar.j5 j5Var = this.n;
        if (j5Var != null && this.f == null && j5Var.getVisibility() == 0) {
            if (this.e != null) {
                this.n.setTranslationY(org.telegram.messenger.g0.L(36.0f));
            } else {
                this.n.setTranslationY(org.telegram.messenger.g0.L(26.0f) * f13);
            }
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final ji b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ji jiVar = new ji(getContext(), 38);
        this.e = jiVar;
        jiVar.setFocusable(false);
        ji jiVar2 = this.e;
        int i7 = org.telegram.ui.ActionBar.j6.Mi;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        org.telegram.ui.ActionBar.q6.Q(jiVar2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i7), e6Var);
        c8.na.a(this.e);
        ji jiVar3 = this.e;
        boolean z10 = hd.a0;
        addView(jiVar3, c8.ja.d(48, 50.0f, (z10 ? 3 : 5) | 48, z10 ? 4.0f : 0.0f, 0.0f, z10 ? 0.0f : 4.0f, 0.0f));
        pg pgVar = this.E;
        if (pgVar != null) {
            boolean z11 = hd.a0;
            pgVar.setLayoutParams(c8.ja.d(48, 48.0f, (z11 ? 3 : 5) | 48, z11 ? 44 : 0.0f, 1.0f, z11 ? 0.0f : 44, 0.0f));
        }
        bi.u uVar = this.d;
        if (uVar != null) {
            float f10 = (hd.a0 ? ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).leftMargin) / org.telegram.messenger.g0.p;
            int i10 = (pgVar != null ? 70 : 19) + 24;
            boolean z12 = hd.a0;
            int i11 = (z12 ? 5 : 3) | 16;
            float f11 = z12 ? i10 : f10;
            if (!z12) {
                f10 = i10;
            }
            uVar.setLayoutParams(c8.ja.d(-1, -2.0f, i11, f11, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void d() {
        this.y = true;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.n = j5Var;
        j5Var.setTextSize(13);
        this.n.setGravity((hd.a0 ? 3 : 5) | 48);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.n;
        boolean z10 = hd.a0;
        addView(j5Var2, c8.ja.d(48, 24.0f, (z10 ? 3 : 5) | 48, z10 ? 20.0f : 0.0f, 17.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // org.telegram.ui.Components.pw0
    public final void e(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public boolean f() {
        return true;
    }

    public boolean g(z5 z5Var) {
        return false;
    }

    public fp getCheckBox() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.pw0
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.pw0
    public /* bridge */ /* synthetic */ float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.pw0
    public Editable getEditText() {
        return this.d.getText();
    }

    public pg getEmojiButton() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.pw0
    public CharSequence getFieldText() {
        bi.u uVar = this.d;
        if (uVar.length() > 0) {
            return uVar.getText();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pw0
    public org.telegram.ui.ActionBar.e2 getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.j5 getTextView2() {
        return this.n;
    }

    public void i(z5 z5Var, boolean z10) {
        this.r.a(z10, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z10, boolean z11) {
        fp fpVar = this.r;
        if (z10 == (fpVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        fpVar.setTag(z10 ? 1 : null);
        ImageView imageView = this.h;
        if (!z11) {
            fpVar.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setAlpha(z10 ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(fpVar, (Property<fp, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z10 ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void o(CharSequence charSequence, String str, boolean z10) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        bi.u uVar = this.d;
        uVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.setSelection(uVar.length());
        }
        uVar.setHint(str);
        this.w = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fp fpVar = this.r;
        if (fpVar != null) {
            n(p(), false);
            fpVar.a(g(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.w && f()) {
            boolean z10 = hd.a0;
            ImageView imageView = this.h;
            if (z10) {
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
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        pg pgVar;
        ImageView imageView;
        bi.u uVar;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            pgVar = this.E;
            imageView = this.f;
            uVar = this.d;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt != uVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == pgVar) {
                    pgVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                    } else {
                        org.telegram.ui.ActionBar.j5 j5Var = this.n;
                        if (childAt == j5Var) {
                            j5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                        } else {
                            fp fpVar = this.r;
                            if (childAt == fpVar) {
                                fpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
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
        uVar.measure(i20.c(this.F != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : pgVar != null ? ns.a2 : ns.G1, (size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = uVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(org.telegram.messenger.g0.L(50.0f), uVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        org.telegram.ui.ActionBar.j5 j5Var2 = this.n;
        if (j5Var2 == null || this.y) {
            return;
        }
        j5Var2.setAlpha(measuredHeight >= org.telegram.messenger.g0.L(52.0f) ? 1.0f : 0.0f);
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z10) {
        this.b.a(z10, true);
    }

    @Override // org.telegram.ui.Components.pw0
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.q6.s(imageView2, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        }
        pg pgVar = this.E;
        if (pgVar != null) {
            org.telegram.ui.ActionBar.q6.s(pgVar, i7, e6Var, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z10) {
        this.s = z10;
    }

    public void setText2(String str) {
        org.telegram.ui.ActionBar.j5 j5Var = this.n;
        if (j5Var == null) {
            return;
        }
        j5Var.l(str, false);
    }

    public void setTextColor(int i7) {
        this.d.setTextColor(i7);
    }

    public void setTextRight(int i7) {
        this.F = Integer.valueOf(i7);
    }

    public void j(boolean z10) {
    }

    public void k(z5 z5Var) {
    }

    public void l(bi.u uVar) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }

    public void h(bi.u uVar, ActionMode actionMode) {
    }
}
