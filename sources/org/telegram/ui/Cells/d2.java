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
import di.za;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout {
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final c2 c;
    public final b2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final lp r;
    public View s;
    public final za w;
    public final org.telegram.ui.Components.p9 x;
    public final org.telegram.ui.Components.a9 y;

    public d2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, 17, false, i6Var);
    }

    public final boolean a() {
        int i7 = this.E;
        return i7 == 4 || i7 == 8 || i7 == 6 || i7 == 7;
    }

    public final boolean b() {
        lp lpVar = this.r;
        return lpVar != null ? lpVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        lp lpVar = this.r;
        if (lpVar != null) {
            lpVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, oi.i1 i1Var) {
        if (aVar == null) {
            View view = this.J;
            if (view != null) {
                removeView(view);
                this.J = null;
            }
        } else {
            if (this.J == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i7 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.i6 i6Var = this.b;
                y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 2, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(view2, h02, null, M, i6Var);
                addView(this.J, c8.na.e(-1, -1, ks.E1));
            }
            this.J.setOnClickListener(aVar);
        }
        if (i1Var == null) {
            View view3 = this.K;
            if (view3 != null) {
                removeView(view3);
                this.K = null;
                return;
            }
            return;
        }
        if (this.K == null) {
            View view4 = new View(getContext());
            this.K = view4;
            addView(view4, c8.na.e(56, -1, gd.a0 ? 5 : 3));
        }
        this.K.setOnClickListener(i1Var);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.I) {
            b2 b2Var = this.d;
            b2Var.c(org.telegram.messenger.j6.m(charSequence, b2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        lp lpVar = this.r;
        if (lpVar != null) {
            lpVar.a(z10, z12);
        } else {
            this.n.a(z10, z12);
        }
        this.f.setText(str);
        this.G = z11;
        setWillNotDraw(!z11);
    }

    public final void f() {
        float f10;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f10 = view.getMeasuredWidth();
        } catch (Exception unused) {
            f10 = 0.0f;
        }
        this.s.setTranslationX(gd.a0 ? (view.getRight() - f10) - org.telegram.messenger.g0.L(20.0f) : view.getLeft() + f10 + org.telegram.messenger.g0.L(4.0f));
    }

    public final void g() {
        boolean z10 = this.I;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int i7 = this.E;
        if (z10) {
            org.telegram.ui.ActionBar.u6.Y(this.d, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6, i6Var);
        } else {
            int i10 = (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6;
            c2 c2Var = this.c;
            org.telegram.ui.ActionBar.u6.U(c2Var, i10, i6Var);
            org.telegram.ui.ActionBar.u6.G(c2Var, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.k5 : org.telegram.ui.ActionBar.n6.J6, i6Var);
        }
        org.telegram.ui.ActionBar.u6.U(this.f, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.m5 : org.telegram.ui.ActionBar.n6.I6, i6Var);
    }

    public org.telegram.ui.Components.n6 getAnimatedTextView() {
        return this.d;
    }

    public lp getCheckBoxRound() {
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
        if (this.G) {
            int L = org.telegram.messenger.g0.L(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += org.telegram.messenger.g0.L(39.0f);
            }
            org.telegram.ui.ActionBar.i6 i6Var = this.b;
            Paint e10 = i6Var != null ? i6Var.e("paintDivider") : null;
            if (e10 == null) {
                e10 = org.telegram.ui.ActionBar.n6.k0;
            }
            Paint paint = e10;
            float f10 = gd.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!gd.a0) {
                L = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        b2 b2Var = this.d;
        if (b2Var != null) {
            accessibilityNodeInfo.setText(b2Var.getText());
        } else {
            c2 c2Var = this.c;
            if (c2Var != null) {
                accessibilityNodeInfo.setText(c2Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        View view = this.h;
        int i11 = this.F;
        View view2 = this.e;
        TextView textView = this.f;
        int i12 = this.E;
        if (i12 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_31));
            float f10 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), TLObject.FLAG_30));
            setMeasuredDimension(org.telegram.messenger.g0.L(29.0f) + view2.getMeasuredWidth(), org.telegram.messenger.g0.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(a() ? 60.0f : 34.0f);
            if (this.I) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (i12 == 7) {
                measuredWidth -= org.telegram.messenger.g0.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i13 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            za zaVar = this.w;
            if (zaVar != null) {
                zaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = c0.i(11.0f, zaVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(m10.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(m10.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.p9 p9Var = this.x;
            if (p9Var != null) {
                p9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30));
            }
            float f11 = i11;
            view.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
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
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.G6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, c8.na.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(kr.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.e.setAlpha(z10 ? 1.0f : 0.5f);
        this.f.setAlpha(z10 ? 1.0f : 0.5f);
        this.h.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setIcon(int i7) {
        this.r.setIcon(i7);
    }

    public void setMultiline(boolean z10) {
        if (this.I) {
            return;
        }
        this.H = z10;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z11 = this.H;
        c2 c2Var = this.c;
        if (z11) {
            c2Var.setLines(0);
            c2Var.setMaxLines(0);
            c2Var.setSingleLine(false);
            c2Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            c2Var.setLines(1);
            c2Var.setMaxLines(1);
            c2Var.setSingleLine(true);
            c2Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = org.telegram.messenger.g0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.G = z10;
    }

    public void setPad(int i7) {
        int L = org.telegram.messenger.g0.L(i7 * 40 * (gd.a0 ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f10 = L;
        this.e.setTranslationX(f10);
        org.telegram.ui.Components.p9 p9Var = this.x;
        if (p9Var != null) {
            p9Var.setTranslationX(f10);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setTranslationX(f10);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setTranslationX(f10);
        }
    }

    public void setTextColor(int i7) {
        if (this.I) {
            b2 b2Var = this.d;
            org.telegram.ui.ActionBar.u6.q(b2Var);
            b2Var.setTextColor(i7);
            return;
        }
        c2 c2Var = this.c;
        org.telegram.ui.ActionBar.u6.q(c2Var);
        c2Var.setTextColor(i7);
        int i10 = this.E;
        int i11 = (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.n6.k5 : org.telegram.ui.ActionBar.n6.J6;
        if (c2Var.getLinkTextColors() != null) {
            int defaultColor = c2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.i6 i6Var = this.b;
            if (defaultColor == org.telegram.ui.ActionBar.n6.w0(i11, i6Var)) {
                org.telegram.ui.ActionBar.u6.G(c2Var, i11, i6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        org.telegram.ui.Components.a9 a9Var = this.y;
        a9Var.l(tLObject);
        this.x.f(tLObject, a9Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        String q10 = z10 ? n10.q((TLRPC.User) tLObject) : org.telegram.messenger.i5.o(tLObject);
        if (z10 && ((TLRPC.User) tLObject).id == mp.u1(i10.t0).h5) {
            q10 = gd.N0(2131752448, null);
        }
        if (!this.I) {
            this.c.setText(q10);
        } else {
            b2 b2Var = this.d;
            b2Var.setText(org.telegram.messenger.j6.m(q10, b2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public d2(Context context, int i7) {
        this(context, i7, 17, false, null);
    }

    public d2(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.b = i6Var;
        this.E = i7;
        this.I = z10;
        int i11 = 0;
        boolean z11 = true;
        if (z10) {
            b2 b2Var = new b2(this, context, i11);
            this.d = b2Var;
            ks.i(b2Var);
            b2Var.setEllipsizeByGradient(true);
            b2Var.setRightPadding(org.telegram.messenger.g0.L(8.0f));
            b2Var.getDrawable().r(true, false);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6, i6Var)));
            b2Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
            if (i7 == 7) {
                b2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, c8.na.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                b2Var.setRightPadding(org.telegram.messenger.g0.L(i10));
                b2Var.setGravity((gd.a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z12 = gd.a0;
                    addView(b2Var, c8.na.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i7 == 7 ? i12 + 39 : i12;
                    boolean z13 = gd.a0;
                    addView(b2Var, c8.na.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i12, 0.0f, z13 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.e = b2Var;
        } else {
            c2 c2Var = new c2(i11, context, this);
            this.c = c2Var;
            ks.i(c2Var);
            c2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6, i6Var)));
            c2Var.setTextSize(1, 16.0f);
            c2Var.setLines(1);
            c2Var.setMaxLines(1);
            c2Var.setSingleLine(true);
            c2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i7 == 7) {
                c2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                c2Var.setGravity(19);
                addView(c2Var, c8.na.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                c2Var.setGravity((gd.a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z14 = gd.a0;
                    addView(c2Var, c8.na.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i7 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = gd.a0;
                    addView(c2Var, c8.na.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i13, 0.0f, z15 ? (i10 - 17) + i13 : i10, 0.0f));
                }
            }
            this.e = c2Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.n6.m5 : org.telegram.ui.ActionBar.n6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((gd.a0 ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, c8.na.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            lp lpVar = new lp(21, context, i6Var);
            this.r = lpVar;
            this.h = lpVar;
            lpVar.setDrawUnchecked(true);
            lpVar.a(true, false);
            lpVar.setDrawBackgroundAsArc(10);
            this.F = 21;
            float f11 = 21;
            boolean z16 = gd.a0;
            addView(lpVar, c8.na.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i7 != 1 && i7 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, i6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = 18;
            if (i7 == 5) {
                float f12 = 18;
                boolean z17 = gd.a0;
                addView(checkBoxSquare, c8.na.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i7 == 3) {
                addView(checkBoxSquare, c8.na.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i7 == 2) {
                addView(checkBoxSquare, c8.na.d(18, 18, (gd.a0 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = gd.a0;
                addView(checkBoxSquare, c8.na.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i7 == 6) {
            za zaVar = new za(this, context, R.drawable.msg_folders_groups);
            this.w = zaVar;
            addView(zaVar, c8.na.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 8) {
            za zaVar2 = new za(this, context, 0);
            this.w = zaVar2;
            addView(zaVar2, c8.na.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 7) {
            this.y = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.x = p9Var;
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
            addView(p9Var, c8.na.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
