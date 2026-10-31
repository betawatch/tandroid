package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 extends FrameLayout {
    public final int D;
    public final int E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public View I;
    public View J;
    public int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final b2 c;
    public final a2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final ep r;
    public View s;
    public final ai.b w;
    public final org.telegram.ui.Components.g9 x;
    public final org.telegram.ui.Components.r8 y;

    public c2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(i10, 17, context, p6Var, false);
    }

    public final boolean a() {
        int i10 = this.D;
        return i10 == 4 || i10 == 8 || i10 == 6 || i10 == 7;
    }

    public final boolean b() {
        ep epVar = this.r;
        return epVar != null ? epVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.r;
        if (epVar != null) {
            epVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, ag.t0 t0Var) {
        if (aVar == null) {
            View view = this.I;
            if (view != null) {
                removeView(view);
                this.I = null;
            }
        } else {
            if (this.I == null) {
                View view2 = new View(getContext());
                this.I = view2;
                int i10 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.ActionBar.p6 p6Var = this.b;
                y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 2, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(view2, h02, null, N, p6Var);
                addView(this.I, w7.b6.e(-1, -1, zs.E1));
            }
            this.I.setOnClickListener(aVar);
        }
        if (t0Var == null) {
            View view3 = this.J;
            if (view3 != null) {
                removeView(view3);
                this.J = null;
                return;
            }
            return;
        }
        if (this.J == null) {
            View view4 = new View(getContext());
            this.J = view4;
            addView(view4, w7.b6.e(56, -1, cd.X ? 5 : 3));
        }
        this.J.setOnClickListener(t0Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.H) {
            a2 a2Var = this.d;
            a2Var.c(org.telegram.messenger.k6.m(charSequence, a2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        ep epVar = this.r;
        if (epVar != null) {
            epVar.a(z10, z12);
        } else {
            this.n.a(z10, z12);
        }
        this.f.setText(str);
        this.F = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f7;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f7 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f7 = 0.0f;
        }
        this.s.setTranslationX(cd.X ? (view.getRight() - f7) - org.telegram.messenger.i0.L(20.0f) : view.getLeft() + f7 + org.telegram.messenger.i0.L(4.0f));
    }

    public final void g() {
        boolean z10 = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int i10 = this.D;
        if (z10) {
            org.telegram.ui.ActionBar.a7.Z(this.d, (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.j5 : org.telegram.ui.ActionBar.t6.G6, p6Var);
        } else {
            int i11 = (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.j5 : org.telegram.ui.ActionBar.t6.G6;
            b2 b2Var = this.c;
            org.telegram.ui.ActionBar.a7.V(b2Var, i11, p6Var);
            org.telegram.ui.ActionBar.a7.H(b2Var, (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.k5 : org.telegram.ui.ActionBar.t6.J6, p6Var);
        }
        org.telegram.ui.ActionBar.a7.V(this.f, (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.m5 : org.telegram.ui.ActionBar.t6.I6, p6Var);
    }

    public org.telegram.ui.Components.f6 getAnimatedTextView() {
        return this.d;
    }

    public ep getCheckBoxRound() {
        return this.r;
    }

    public View getCheckBoxView() {
        return this.h;
    }

    public TextView getTextView() {
        return this.c;
    }

    public TextView getValueTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.F) {
            int L = org.telegram.messenger.i0.L(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.D == 7) {
                L += org.telegram.messenger.i0.L(39.0f);
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.b;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            Paint paint = d;
            float f7 = cd.X ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!cd.X) {
                L = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        a2 a2Var = this.d;
        if (a2Var != null) {
            accessibilityNodeInfo.setText(a2Var.getText());
        } else {
            b2 b2Var = this.c;
            if (b2Var != null) {
                accessibilityNodeInfo.setText(b2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        View view = this.h;
        int i12 = this.E;
        View view2 = this.e;
        TextView textView = this.f;
        int i13 = this.D;
        if (i13 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.i0.L(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_31));
            float f7 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), TLObject.FLAG_30));
            setMeasuredDimension(org.telegram.messenger.i0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.i0.L(50.0f));
        } else if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.F ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(a() ? 60.0f : 34.0f);
            if (this.H) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (i13 == 7) {
                measuredWidth -= org.telegram.messenger.i0.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i14 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            ai.b bVar = this.w;
            if (bVar != null) {
                bVar.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = z20.D(11.0f, bVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(z20.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(z20.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.g9 g9Var = this.x;
            if (g9Var != null) {
                g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), TLObject.FLAG_30));
            }
            float f10 = i12;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), TLObject.FLAG_30));
        }
        View view3 = this.I;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.I.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.J;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), TLObject.FLAG_30));
        }
    }

    public void setCollapsed(Boolean bool) {
        if (bool == null) {
            View view = this.s;
            if (view != null) {
                removeView(view);
                this.s = null;
                return;
            }
            return;
        }
        if (this.s == null) {
            this.s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.G6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, w7.b6.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setAlpha(z10 ? 1.0f : 0.5f);
        this.f.setAlpha(z10 ? 1.0f : 0.5f);
        this.h.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setIcon(int i10) {
        this.r.setIcon(i10);
    }

    public void setMultiline(boolean z10) {
        if (this.H) {
            return;
        }
        this.G = z10;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.G;
        b2 b2Var = this.c;
        if (z11) {
            b2Var.setLines(0);
            b2Var.setMaxLines(0);
            b2Var.setSingleLine(false);
            b2Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = org.telegram.messenger.i0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.F = z10;
    }

    public void setPad(int i10) {
        int L = org.telegram.messenger.i0.L(i10 * 40 * (cd.X ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f7 = L;
        this.e.setTranslationX(f7);
        org.telegram.ui.Components.g9 g9Var = this.x;
        if (g9Var != null) {
            g9Var.setTranslationX(f7);
        }
        View view2 = this.I;
        if (view2 != null) {
            view2.setTranslationX(f7);
        }
        View view3 = this.J;
        if (view3 != null) {
            view3.setTranslationX(f7);
        }
    }

    public void setTextColor(int i10) {
        if (this.H) {
            a2 a2Var = this.d;
            org.telegram.ui.ActionBar.a7.r(a2Var);
            a2Var.setTextColor(i10);
            return;
        }
        b2 b2Var = this.c;
        org.telegram.ui.ActionBar.a7.r(b2Var);
        b2Var.setTextColor(i10);
        int i11 = this.D;
        int i12 = (i11 == 1 || i11 == 5) ? org.telegram.ui.ActionBar.t6.k5 : org.telegram.ui.ActionBar.t6.J6;
        if (b2Var.getLinkTextColors() != null) {
            int defaultColor = b2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.p6 p6Var = this.b;
            if (defaultColor == org.telegram.ui.ActionBar.t6.w0(i12, p6Var)) {
                org.telegram.ui.ActionBar.a7.H(b2Var, i12, p6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        org.telegram.ui.Components.r8 r8Var = this.y;
        r8Var.l(tLObject);
        this.x.e(tLObject, r8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        String p5 = z10 ? h20.p((TLRPC.User) tLObject) : org.telegram.messenger.i5.o(tLObject);
        if (z10 && ((TLRPC.User) tLObject).id == vp.r1(d20.s0).f5) {
            p5 = cd.L0(2131752460, null);
        }
        if (!this.H) {
            this.c.setText(p5);
        } else {
            a2 a2Var = this.d;
            a2Var.setText(org.telegram.messenger.k6.m(p5, a2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public c2(Context context, int i10) {
        this(i10, 17, context, null, false);
    }

    public c2(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.b = p6Var;
        this.D = i10;
        this.H = z10;
        int i12 = 0;
        boolean z11 = true;
        if (z10) {
            a2 a2Var = new a2(this, context, i12);
            this.d = a2Var;
            zs.i(a2Var);
            a2Var.setEllipsizeByGradient(true);
            a2Var.setRightPadding(org.telegram.messenger.i0.L(8.0f));
            a2Var.getDrawable().r(true, false);
            a2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.j5 : org.telegram.ui.ActionBar.t6.G6, p6Var)));
            a2Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
            if (i10 == 7) {
                a2Var.setTypeface(org.telegram.messenger.i0.o());
            }
            if (i10 == 3) {
                a2Var.setGravity(19);
                addView(a2Var, w7.b6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            } else {
                a2Var.setRightPadding(org.telegram.messenger.i0.L(i11));
                a2Var.setGravity((cd.X ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z12 = cd.X;
                    addView(a2Var, w7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i10 == 7 ? i13 + 39 : i13;
                    boolean z13 = cd.X;
                    addView(a2Var, w7.b6.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i11 : (i11 - 17) + i13, 0.0f, z13 ? (i11 - 17) + i13 : i11, 0.0f));
                }
            }
            this.e = a2Var;
        } else {
            b2 b2Var = new b2(this, context, i12);
            this.c = b2Var;
            zs.i(b2Var);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.j5 : org.telegram.ui.ActionBar.t6.G6, p6Var)));
            b2Var.setTextSize(1, 16.0f);
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i10 == 7) {
                b2Var.setTypeface(org.telegram.messenger.i0.o());
            }
            if (i10 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, w7.b6.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            } else {
                b2Var.setGravity((cd.X ? 5 : 3) | 16);
                if (i10 == 2) {
                    boolean z14 = cd.X;
                    addView(b2Var, w7.b6.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i14 = a() ? 56 : 46;
                    i14 = i10 == 7 ? i14 + 39 : i14;
                    int i15 = a() ? -2 : -1;
                    boolean z15 = cd.X;
                    addView(b2Var, w7.b6.d(i15, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i11 : (i11 - 17) + i14, 0.0f, z15 ? (i11 - 17) + i14 : i11, 0.0f));
                }
            }
            this.e = b2Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.t6.m5 : org.telegram.ui.ActionBar.t6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((cd.X ? 3 : 5) | 16);
        float f7 = i11;
        addView(textView, w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        if (a()) {
            ep epVar = new ep(21, context, p6Var);
            this.r = epVar;
            this.h = epVar;
            epVar.setDrawUnchecked(true);
            epVar.a(true, false);
            epVar.setDrawBackgroundAsArc(10);
            this.E = 21;
            float f10 = 21;
            boolean z16 = cd.X;
            addView(epVar, w7.b6.d(21, f10, (z16 ? 5 : 3) | 48, z16 ? 0 : i11, 16.0f, z16 ? i11 : 0, 0.0f));
        } else {
            if (i10 != 1 && i10 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, p6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.E = 18;
            if (i10 == 5) {
                float f11 = 18;
                boolean z17 = cd.X;
                addView(checkBoxSquare, w7.b6.d(18, f11, (z17 ? 5 : 3) | 16, z17 ? 0 : i11, 0.0f, z17 ? i11 : 0, 0.0f));
            } else if (i10 == 3) {
                addView(checkBoxSquare, w7.b6.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i10 == 2) {
                addView(checkBoxSquare, w7.b6.d(18, 18, (cd.X ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f12 = 18;
                boolean z18 = cd.X;
                addView(checkBoxSquare, w7.b6.d(18, f12, (z18 ? 5 : 3) | 48, z18 ? 0 : i11, 16.0f, z18 ? i11 : 0, 0.0f));
            }
        }
        if (i10 == 6) {
            ai.b bVar = new ai.b(this, context, R.drawable.msg_folders_groups);
            this.w = bVar;
            addView(bVar, w7.b6.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 8) {
            ai.b bVar2 = new ai.b(this, context, 0);
            this.w = bVar2;
            addView(bVar2, w7.b6.i(-2.0f, -2.0f, 8388629, f7, 0.0f, i11 - 11, 0.0f));
        } else if (i10 == 7) {
            this.y = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            this.x = g9Var;
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(17.0f));
            addView(g9Var, w7.b6.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
