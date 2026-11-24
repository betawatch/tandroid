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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class le8 extends FrameLayout implements bbb, x74 {
    public final qy1 E;
    public Integer F;
    public final fm0 a;
    public final fm0 b;
    public final wjb c;
    public final py d;
    public kd8 e;
    public final ImageView f;
    public final ImageView h;
    public jia n;
    public final wf2 r;
    public boolean s;
    public boolean w;
    public AnimatorSet x;
    public boolean y;

    public le8(Context context, int i, View.OnClickListener onClickListener, wjb wjbVar) {
        super(context);
        float f;
        int i2;
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, false);
        this.b = new fm0(1, this, s33Var, 380L, false);
        this.c = wjbVar;
        py pyVar = new py(this, context, wjbVar, (byte) 2);
        this.d = pyVar;
        final byte b = 1;
        pyVar.setAllowTextEntitiesIntersection(true);
        zkb.X(pyVar, bkb.F6, wjbVar);
        zkb.G(pyVar, bkb.Wc, wjbVar);
        zkb.D(pyVar, bkb.G6, wjbVar);
        pyVar.setTextSize(1, 16.0f);
        pyVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        pyVar.setBackground(null);
        pyVar.setImeOptions(pyVar.getImeOptions() | TLObject.FLAG_28);
        pyVar.setInputType(pyVar.getInputType() | TLObject.FLAG_14);
        pyVar.setPadding(gl.L(4.0f), gl.L(10.0f), gl.L(4.0f), gl.L(11.0f));
        final byte b2 = 0;
        if (onClickListener != null) {
            int i3 = i == 1 ? 92 : 58;
            boolean z = k96.a0;
            addView(pyVar, nme.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? i3 : 54.0f, 0.0f, !z ? i3 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i4 = bkb.l6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView, i4, wjbVar, mode);
            addView(imageView, nme.d(48, 48.0f, (k96.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.f = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            int i5 = bkb.Li;
            ff0 f0 = bkb.f0(bkb.v0(i5, wjbVar), 1, -1);
            vkb M = zkb.M(i5);
            imageView2.setBackground(f0);
            zkb.j(imageView2, f0, null, M, wjbVar);
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            zkb.s(imageView2, i4, wjbVar, mode);
            imageView2.setContentDescription(k96.M0(2131751586, null));
            boolean z2 = k96.a0;
            addView(imageView2, nme.d(48, 50.0f, (z2 ? 3 : 5) | 48, z2 ? 3.0f : 0.0f, 0.0f, z2 ? 0.0f : 3.0f, 0.0f));
            jia jiaVar = new jia(context);
            this.n = jiaVar;
            jiaVar.setTextSize(13);
            this.n.setGravity((k96.a0 ? 3 : 5) | 48);
            View view = this.n;
            boolean z3 = k96.a0;
            addView(view, nme.d(48, 24.0f, (z3 ? 3 : 5) | 48, z3 ? 20.0f : 0.0f, 43.0f, z3 ? 0.0f : 20.0f, 0.0f));
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.r = wf2Var;
            wf2Var.b(-1, i4, bkb.j7);
            wf2Var.setContentDescription(k96.M0(2131754795, null));
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(true, false);
            wf2Var.setAlpha(0.0f);
            wf2Var.setDrawBackgroundAsArc(8);
            addView(wf2Var, nme.d(48, 48.0f, (k96.a0 ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            wf2Var.setOnClickListener(new View.OnClickListener(this) { // from class: ke8
                public final /* synthetic */ le8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    le8 le8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (le8Var.r.getTag() != null) {
                                le8Var.i(le8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            le8Var.k(le8Var);
                            break;
                    }
                }
            });
        } else {
            int i6 = i == 1 ? 70 : 19;
            boolean z4 = k96.a0;
            addView(pyVar, nme.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i6 : 19.0f, 0.0f, z4 ? 19.0f : i6, 0.0f));
        }
        if (i == 1) {
            qy1 qy1Var = new qy1(context);
            this.E = qy1Var;
            zkb.s(qy1Var, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
            qy1Var.j(oy1.e, false);
            int L = gl.L(9.5f);
            qy1Var.setPadding(L, L, L, L);
            qy1Var.setVisibility(8);
            int i7 = this.f == null ? 3 : 38;
            boolean z5 = k96.a0;
            if (z5) {
                f = i7;
                i2 = 3;
            } else {
                f = 0.0f;
                i2 = 5;
            }
            addView(qy1Var, nme.d(48, 48.0f, i2, f, 0.0f, z5 ? 0.0f : i7, 0.0f));
            int i8 = bkb.Li;
            ff0 f02 = bkb.f0(bkb.v0(i8, wjbVar), 1, -1);
            vkb M2 = zkb.M(i8);
            qy1Var.setBackground(f02);
            zkb.j(qy1Var, f02, null, M2, wjbVar);
            qy1Var.setOnClickListener(new View.OnClickListener(this) { // from class: ke8
                public final /* synthetic */ le8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b;
                    le8 le8Var = this.b;
                    switch (b3) {
                        case 0:
                            if (le8Var.r.getTag() != null) {
                                le8Var.i(le8Var, !r2.a.q);
                                break;
                            }
                            break;
                        default:
                            le8Var.k(le8Var);
                            break;
                    }
                }
            });
            qy1Var.setContentDescription(k96.M0(2131751184, null));
        }
    }

    @Override // bbb
    public final boolean a() {
        return false;
    }

    public final kd8 b() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kd8 kd8Var = new kd8(getContext(), 38);
        this.e = kd8Var;
        kd8Var.setFocusable(false);
        kd8 kd8Var2 = this.e;
        int i = bkb.Li;
        wjb wjbVar = this.c;
        zkb.R(kd8Var2, bkb.f0(bkb.v0(i, wjbVar), 1, -1), null, zkb.M(i), wjbVar);
        ote.a(this.e);
        kd8 kd8Var3 = this.e;
        boolean z = k96.a0;
        addView(kd8Var3, nme.d(48, 50.0f, (z ? 3 : 5) | 48, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        qy1 qy1Var = this.E;
        if (qy1Var != null) {
            boolean z2 = k96.a0;
            qy1Var.setLayoutParams(nme.d(48, 48.0f, (z2 ? 3 : 5) | 48, z2 ? 44.0f : 0.0f, 1.0f, z2 ? 0.0f : 44.0f, 0.0f));
        }
        py pyVar = this.d;
        if (pyVar != null) {
            float f = (k96.a0 ? ((ViewGroup.MarginLayoutParams) pyVar.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) pyVar.getLayoutParams()).leftMargin) / gl.p;
            int i2 = (qy1Var != null ? 70 : 19) + 24;
            boolean z3 = k96.a0;
            int i3 = (z3 ? 5 : 3) | 16;
            float f2 = z3 ? i2 : f;
            if (!z3) {
                f = i2;
            }
            pyVar.setLayoutParams(nme.d(-1, -2.0f, i3, f2, 0.0f, f, 0.0f));
        }
        return this.e;
    }

    public final void c(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    @Override // bbb
    public final void d(TextWatcher textWatcher) {
        this.d.addTextChangedListener(textWatcher);
    }

    public final void e() {
        this.y = true;
        jia jiaVar = new jia(getContext());
        this.n = jiaVar;
        jiaVar.setTextSize(13);
        this.n.setGravity((k96.a0 ? 3 : 5) | 48);
        jia jiaVar2 = this.n;
        boolean z = k96.a0;
        addView(jiaVar2, nme.d(48, 24.0f, (z ? 3 : 5) | 48, z ? 20.0f : 0.0f, 17.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public boolean f() {
        return true;
    }

    public boolean g(le8 le8Var) {
        return false;
    }

    public wf2 getCheckBox() {
        return this.r;
    }

    @Override // bbb
    public EditTextBoldCursor getEditField() {
        return this.d;
    }

    @Override // bbb
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override // bbb
    public Editable getEditText() {
        return this.d.getText();
    }

    public qy1 getEmojiButton() {
        return this.E;
    }

    @Override // bbb
    public CharSequence getFieldText() {
        py pyVar = this.d;
        if (pyVar.length() > 0) {
            return pyVar.getText();
        }
        return null;
    }

    @Override // bbb
    public d getParentFragment() {
        return null;
    }

    public String getText() {
        return this.d.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.d;
    }

    public jia getTextView2() {
        return this.n;
    }

    public void i(le8 le8Var, boolean z) {
        this.r.a(z, true);
    }

    public boolean m(ArrayList arrayList) {
        return false;
    }

    public final void n(boolean z, boolean z2) {
        wf2 wf2Var = this.r;
        if (z == (wf2Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        wf2Var.setTag(z ? 1 : null);
        ImageView imageView = this.h;
        if (!z2) {
            wf2Var.setAlpha(z ? 1.0f : 0.0f);
            imageView.setAlpha(z ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wf2Var, (Property<wf2, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z ? 0.0f : 1.0f));
        this.x.setDuration(180L);
        this.x.start();
    }

    public final void o(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setTag(null);
        }
        py pyVar = this.d;
        pyVar.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            pyVar.setSelection(pyVar.length());
        }
        pyVar.setHint(str);
        this.w = z;
        setWillNotDraw(!z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            n(q(), false);
            wf2Var.a(g(this), false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.w && f()) {
            boolean z = k96.a0;
            ImageView imageView = this.h;
            if (z) {
                L = 0.0f;
            } else {
                L = gl.L(imageView != null ? 58.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(imageView != null ? 58.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        qy1 qy1Var;
        ImageView imageView;
        py pyVar;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            qy1Var = this.E;
            imageView = this.f;
            pyVar = this.d;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != pyVar) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                } else if (childAt == qy1Var) {
                    qy1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                } else {
                    ImageView imageView2 = this.h;
                    if (childAt == imageView2) {
                        imageView2.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
                    } else {
                        jia jiaVar = this.n;
                        if (childAt == jiaVar) {
                            jiaVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
                        } else {
                            wf2 wf2Var = this.r;
                            if (childAt == wf2Var) {
                                wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
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
        pyVar.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - gl.L(this.F != null ? r9.intValue() : this.n == null ? 42 : imageView == null ? 70 : qy1Var != null ? kk7.Z1 : kk7.F1), TLObject.FLAG_30), 0);
        int measuredHeight = pyVar.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(gl.L(50.0f), pyVar.getMeasuredHeight()) + (this.w ? 1 : 0));
        jia jiaVar2 = this.n;
        if (jiaVar2 == null || this.y) {
            return;
        }
        jiaVar2.setAlpha(measuredHeight >= gl.L(52.0f) ? 1.0f : 0.0f);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        qy1 qy1Var;
        if (i == 0) {
            wf2 wf2Var = this.r;
            if (wf2Var != null) {
                CheckBoxBase checkBoxBase = wf2Var.getCheckBoxBase();
                float f3 = this.a.e;
                if (checkBoxBase.w != f3) {
                    checkBoxBase.w = f3;
                    checkBoxBase.b();
                }
                wf2Var.invalidate();
                return;
            }
            return;
        }
        if (i != 1 || (qy1Var = this.E) == null) {
            return;
        }
        float f4 = this.b.e;
        float f5 = 0.85f * f4;
        qy1Var.setScaleX(f5);
        qy1Var.setScaleY(f5);
        qy1Var.setAlpha(f4);
        qy1Var.setVisibility(f4 > 0.0f ? 0 : 8);
        jia jiaVar = this.n;
        if (jiaVar != null && this.f == null && jiaVar.getVisibility() == 0) {
            kd8 kd8Var = this.e;
            jia jiaVar2 = this.n;
            if (kd8Var != null) {
                jiaVar2.setTranslationY(gl.L(36.0f));
            } else {
                jiaVar2.setTranslationY(gl.L(26.0f) * f4);
            }
        }
    }

    public boolean q() {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.b.a(z, true);
    }

    @Override // bbb
    public void setFieldText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setIconsColor(int i) {
        wjb wjbVar = this.c;
        ImageView imageView = this.h;
        if (imageView != null) {
            zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            zkb.s(imageView2, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        }
        qy1 qy1Var = this.E;
        if (qy1Var != null) {
            zkb.s(qy1Var, i, wjbVar, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setShowNextButton(boolean z) {
        this.s = z;
    }

    public void setText2(String str) {
        jia jiaVar = this.n;
        if (jiaVar == null) {
            return;
        }
        jiaVar.l(str, false);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.F = Integer.valueOf(i);
    }

    public void j(boolean z) {
    }

    public void k(le8 le8Var) {
    }

    public void l(py pyVar) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    public void h(py pyVar, ActionMode actionMode) {
    }
}
