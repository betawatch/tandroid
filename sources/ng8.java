// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ng8 extends FrameLayout implements ddb, g94 {
    public final d02 E;
    public Integer F;
    public final fn0 a;
    public final fn0 b;
    public final ylb c;
    public final pz d;
    public mf8 e;
    public final ImageView f;
    public final ImageView h;
    public lka n;
    public final jh2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public ng8(Context context, int i, View.OnClickListener onClickListener, ylb ylbVar) {
        super(context);
        float f;
        int i2;
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, false);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.c = ylbVar;
        pz pzVar = new pz(this, context, ylbVar, (byte) 2);
        this.d = pzVar;
        final byte b = 1;
        pzVar.setAllowTextEntitiesIntersection(true);
        anb.X(pzVar, cmb.F6, ylbVar);
        anb.G(pzVar, cmb.Wc, ylbVar);
        anb.D(pzVar, cmb.G6, ylbVar);
        pzVar.setTextSize(1, 16.0f);
        pzVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        pzVar.setBackground(null);
        pzVar.setImeOptions(pzVar.getImeOptions() | TLObject.FLAG_28);
        pzVar.setInputType(pzVar.getInputType() | TLObject.FLAG_14);
        pzVar.setPadding(gm.L(4.0f), gm.L(10.0f), gm.L(4.0f), gm.L(11.0f));
        final byte b2 = 0;
        if (onClickListener != null) {
            int i3 = i == 1 ? 92 : 58;
            boolean z = jb6.a0;
            addView(pzVar, qoe.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? i3 : 54.0f, 0.0f, !z ? i3 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i4 = cmb.l6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView, i4, ylbVar, mode);
            addView(imageView, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i5 = cmb.Li;
            fg0 f0 = cmb.f0(cmb.v0(i5, ylbVar), 1, -1);
            wmb M = anb.M(i5);
            imageView2.setBackground(f0);
            anb.j(imageView2, f0, null, M, ylbVar);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            anb.s(imageView2, i4, ylbVar, mode);
            imageView2.setContentDescription(jb6.M0(2131751535, null));
            boolean z2 = jb6.a0;
            addView(imageView2, qoe.d(48, 50.0f, (z2 ? 3 : 5) | 48, z2 ? 3.0f : 0.0f, 0.0f, z2 ? 0.0f : 3.0f, 0.0f));
            lka lkaVar = new lka(context);
            this.n = lkaVar;
            lkaVar.setTextSize(13);
            this.n.setGravity((jb6.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z3 = jb6.a0;
            addView(view, qoe.d(48, 24.0f, (z3 ? 3 : 5) | 48, z3 ? 20.0f : 0.0f, 43.0f, z3 ? 0.0f : 20.0f, 0.0f));
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.r = jh2Var;
            jh2Var.b(-1, i4, cmb.j7);
            jh2Var.setContentDescription(jb6.M0(2131754795, null));
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(true, false);
            jh2Var.setAlpha(0.0f);
            jh2Var.setDrawBackgroundAsArc(8);
            addView(jh2Var, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            jh2Var.setOnClickListener(new View.OnClickListener(this) { // from class: mg8
                public final /* synthetic */ ng8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    ng8 ng8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (ng8Var.r.getTag() != null) {
                                ng8Var.i(ng8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            ng8Var.k(ng8Var);
                            break;
                    }
                }
            });
        } else {
            int i6 = i == 1 ? 70 : 19;
            boolean z4 = jb6.a0;
            addView(pzVar, qoe.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i6 : 19.0f, 0.0f, z4 ? 19.0f : i6, 0.0f));
        }
        if (i == 1) {
            d02 d02Var = new d02(context);
            this.E = d02Var;
            anb.s(d02Var, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
            d02Var.j(b02.e, false);
            int L = gm.L(9.5f);
            d02Var.setPadding(L, L, L, L);
            d02Var.setVisibility(8);
            int i7 = this.f == null ? 3 : 38;
            boolean z5 = jb6.a0;
            if (z5) {
                f = i7;
                i2 = 3;
            } else {
                f = 0.0f;
                i2 = 5;
            }
            addView(d02Var, qoe.d(48, 48.0f, i2, f, 0.0f, z5 ? 0.0f : i7, 0.0f));
            int i8 = cmb.Li;
            fg0 f02 = cmb.f0(cmb.v0(i8, ylbVar), 1, -1);
            wmb M2 = anb.M(i8);
            d02Var.setBackground(f02);
            anb.j(d02Var, f02, null, M2, ylbVar);
            d02Var.setOnClickListener(new View.OnClickListener(this) { // from class: mg8
                public final /* synthetic */ ng8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b;
                    ng8 ng8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (ng8Var.r.getTag() != null) {
                                ng8Var.i(ng8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            ng8Var.k(ng8Var);
                            break;
                    }
                }
            });
            d02Var.setContentDescription(jb6.M0(2131751133, null));
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        d02 d02Var;
        if (i == 0) {
            jh2 jh2Var = this.r;
            if (jh2Var != null) {
                CheckBoxBase checkBoxBase = jh2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                jh2Var.invalidate();
                return;
            }
            return;
        }
        if (i != 1 || (d02Var = this.E) == null) {
            return;
        }
        float f4 = this.b.e;
        float f5 = 0.85f * f4;
        d02Var.setScaleX(f5);
        d02Var.setScaleY(f5);
        d02Var.setAlpha(f4);
        d02Var.setVisibility(f4 > 0.0f ? 0 : 8);
        lka lkaVar = this.n;
        if (lkaVar != null && this.f == null && lkaVar.getVisibility() == 0) {
            mf8 mf8Var = this.e;
            lka lkaVar2 = this.n;
            if (mf8Var != null) {
                lkaVar2.setTranslationY(gm.L(36.0f));
            } else {
                lkaVar2.setTranslationY(gm.L(26.0f) * f4);
            }
        }
    }

    @Override // ddb
    public final boolean a() {
        return false;
    }

    public final mf8 b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mf8 mf8Var = new mf8(getContext(), 38);
        this.e = mf8Var;
        mf8Var.setFocusable(false);
        mf8 mf8Var2 = this.e;
        int i = cmb.Li;
        ylb ylbVar = this.c;
        anb.R(mf8Var2, cmb.f0(cmb.v0(i, ylbVar), 1, -1), null, anb.M(i), ylbVar);
        rve.a(this.e);
        mf8 mf8Var3 = this.e;
        boolean z = jb6.a0;
        addView(mf8Var3, qoe.d(48, 50.0f, (z ? 3 : 5) | 48, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        d02 d02Var = this.E;
        if (d02Var != null) {
            boolean z2 = jb6.a0;
            d02Var.setLayoutParams(qoe.d(48, 48.0f, (z2 ? 3 : 5) | 48, z2 ? 44.0f : 0.0f, 1.0f, z2 ? 0.0f : 44.0f, 0.0f));
        }
        pz pzVar = this.d;
        if (pzVar != null) {
            float f = (jb6.a0 ? ((ViewGroup.MarginLayoutParams) pzVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) pzVar.getLayoutParams()).leftMargin) / gm.p;
            int i2 = (d02Var != null ? 70 : 19) + 24;
            boolean z3 = jb6.a0;
            int i3 = (z3 ? 5 : 3) | 16;
            float f2 = z3 ? i2 : f;
            if (!z3) {
                f = i2;
            }
            pzVar.setLayoutParams(qoe.d(-1, -2.0f, i3, f2, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    @Override // ddb
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void e() {
        this.y = true;
        lka lkaVar = new lka(getContext());
        this.n = lkaVar;
        lkaVar.setTextSize(13);
        this.n.setGravity((jb6.a0 ? 3 : 5) | 48);
        lka lkaVar2 = this.n;
        boolean z = jb6.a0;
        addView(lkaVar2, qoe.d(48, 24.0f, (z ? 3 : 5) | 48, z ? 20.0f : 0.0f, 17.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(ng8 ng8Var) {
        return false;
    }

    public jh2 getCheckBox() {
        return this.r;
    }

    @Override // ddb
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // ddb
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override // ddb
    public Editable getEditText() {
        return this.d.getText();
    }

    public d02 getEmojiButton() {
        return this.E;
    }

    @Override // ddb
    public CharSequence getFieldText() {
        pz pzVar = this.d;
        if (pzVar.length() > 0) {
            return pzVar.getText();
        }
        return null;
    }

    @Override // ddb
    public d getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public lka getTextView2() {
        return this.n;
    }

    public void i(ng8 ng8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        jh2 jh2Var = this.r;
        if (z == (jh2Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        jh2Var.setTag(z ? 1 : null);
        ImageView imageView = this.h;
        if (!z2) {
            jh2Var.setAlpha(z ? 1.0f : 0.0f);
            imageView.setAlpha(z ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(jh2Var, (Property<jh2, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void o(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        pz pzVar = this.d;
        pzVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            pzVar.setSelection(pzVar.length());
        }
        pzVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            n(p(), false);
            jh2Var.a(g(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.w && f()) {
            boolean z = jb6.a0;
            ImageView imageView = this.h;
            if (z) {
                L = 0.0f;
            } else {
                L = gm.L(imageView != null ? 58.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        d02 d02Var;
        ImageView imageView;
        pz pzVar;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            d02Var = this.E;
            imageView = this.f;
            pzVar = this.d;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != pzVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == d02Var) {
                    d02Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                    } else {
                        lka lkaVar = this.n;
                        if (childAt == lkaVar) {
                            lkaVar.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30));
                        } else {
                            jh2 jh2Var = this.r;
                            if (childAt == jh2Var) {
                                jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams != null) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                } else {
                                    childAt.measure(i, i2);
                                }
                            }
                        }
                    }
                }
            }
            i3++;
        }
        pzVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - gm.L(this.F != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : d02Var != null ? nm7.Z1 : nm7.F1), TLObject.FLAG_30), 0);
        int measuredHeight = pzVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(gm.L(50.0f), pzVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        lka lkaVar2 = this.n;
        if (lkaVar2 == null || this.y) {
            return;
        }
        lkaVar2.setAlpha(measuredHeight >= gm.L(52.0f) ? 1.0f : 0.0f);
    }

    public boolean p() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.b.a(z, true);
    }

    @Override // ddb
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i) {
        ylb ylbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            anb.s(imageView2, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        }
        d02 d02Var = this.E;
        if (d02Var != null) {
            anb.s(d02Var, i, ylbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        lka lkaVar = this.n;
        if (lkaVar == null) {
            return;
        }
        lkaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    public void j(boolean z) {
    }

    public void k(ng8 ng8Var) {
    }

    public void l(pz pzVar) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    public void h(pz pzVar, ActionMode actionMode) {
    }
}
