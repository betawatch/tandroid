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
import di.va;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c2 extends FrameLayout {
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final b2 c;
    public final a2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final fp r;
    public View s;
    public final va w;
    public final org.telegram.ui.Components.i9 x;
    public final org.telegram.ui.Components.t8 y;

    public c2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, 17, false, e6Var);
    }

    public final boolean a() {
        int i7 = this.E;
        return i7 == 4 || i7 == 8 || i7 == 6 || i7 == 7;
    }

    public final boolean b() {
        fp fpVar = this.r;
        return fpVar != null ? fpVar.a.q : this.n.h;
    }

    public final void c(boolean z10, boolean z11) {
        fp fpVar = this.r;
        if (fpVar != null) {
            fpVar.a(z10, z11);
        } else {
            this.n.a(z10, z11);
        }
    }

    public final void d(org.telegram.ui.a aVar, org.telegram.messenger.video.e eVar) {
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
                int i7 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.e6 e6Var = this.b;
                y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), 2, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
                view2.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(view2, h02, null, M, e6Var);
                addView(this.J, c8.ja.e(-1, -1, ns.E1));
            }
            this.J.setOnClickListener(aVar);
        }
        if (eVar == null) {
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
            addView(view4, c8.ja.e(56, -1, hd.a0 ? 5 : 3));
        }
        this.K.setOnClickListener(eVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z10, boolean z11, boolean z12) {
        if (this.I) {
            a2 a2Var = this.d;
            a2Var.c(org.telegram.messenger.j6.m(charSequence, a2Var.getPaint().getFontMetricsInt(), false, null, 0), z12, true);
        } else {
            this.c.setText(charSequence);
        }
        fp fpVar = this.r;
        if (fpVar != null) {
            fpVar.a(z10, z12);
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
        this.s.setTranslationX(hd.a0 ? (view.getRight() - f10) - org.telegram.messenger.g0.L(20.0f) : view.getLeft() + f10 + org.telegram.messenger.g0.L(4.0f));
    }

    public final void g() {
        boolean z10 = this.I;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int i7 = this.E;
        if (z10) {
            org.telegram.ui.ActionBar.q6.Y(this.d, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, e6Var);
        } else {
            int i10 = (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6;
            b2 b2Var = this.c;
            org.telegram.ui.ActionBar.q6.U(b2Var, i10, e6Var);
            org.telegram.ui.ActionBar.q6.G(b2Var, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.k5 : org.telegram.ui.ActionBar.j6.J6, e6Var);
        }
        org.telegram.ui.ActionBar.q6.U(this.f, (i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.m5 : org.telegram.ui.ActionBar.j6.I6, e6Var);
    }

    public org.telegram.ui.Components.h6 getAnimatedTextView() {
        return this.d;
    }

    public fp getCheckBoxRound() {
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
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = d;
            float f10 = hd.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!hd.a0) {
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
            va vaVar = this.w;
            if (vaVar != null) {
                vaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = i20.D(11.0f, vaVar.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(i20.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(i20.c(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            org.telegram.ui.Components.i9 i9Var = this.x;
            if (i9Var != null) {
                i9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), TLObject.FLAG_30));
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
            org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.G6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, c8.ja.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
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
            layoutParams2.topMargin = org.telegram.messenger.g0.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z10) {
        this.G = z10;
    }

    public void setPad(int i7) {
        int L = org.telegram.messenger.g0.L(i7 * 40 * (hd.a0 ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f10 = L;
        this.e.setTranslationX(f10);
        org.telegram.ui.Components.i9 i9Var = this.x;
        if (i9Var != null) {
            i9Var.setTranslationX(f10);
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
            a2 a2Var = this.d;
            org.telegram.ui.ActionBar.q6.q(a2Var);
            a2Var.setTextColor(i7);
            return;
        }
        b2 b2Var = this.c;
        org.telegram.ui.ActionBar.q6.q(b2Var);
        b2Var.setTextColor(i7);
        int i10 = this.E;
        int i11 = (i10 == 1 || i10 == 5) ? org.telegram.ui.ActionBar.j6.k5 : org.telegram.ui.ActionBar.j6.J6;
        if (b2Var.getLinkTextColors() != null) {
            int defaultColor = b2Var.getLinkTextColors().getDefaultColor();
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            if (defaultColor == org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) {
                org.telegram.ui.ActionBar.q6.G(b2Var, i11, e6Var);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        org.telegram.ui.Components.t8 t8Var = this.y;
        t8Var.l(tLObject);
        this.x.f(tLObject, t8Var);
        boolean z10 = tLObject instanceof TLRPC.User;
        String p10 = z10 ? q10.p((TLRPC.User) tLObject) : org.telegram.messenger.g5.o(tLObject);
        if (z10 && ((TLRPC.User) tLObject).id == np.s1(m10.t0).f5) {
            p10 = hd.M0(2131752460, null);
        }
        if (!this.I) {
            this.c.setText(p10);
        } else {
            a2 a2Var = this.d;
            a2Var.setText(org.telegram.messenger.j6.m(p10, a2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public c2(Context context, int i7) {
        this(context, i7, 17, false, null);
    }

    public c2(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = e6Var;
        this.E = i7;
        this.I = z10;
        int i11 = 0;
        boolean z11 = true;
        if (z10) {
            a2 a2Var = new a2(this, context, i11);
            this.d = a2Var;
            ns.i(a2Var);
            a2Var.setEllipsizeByGradient(true);
            a2Var.setRightPadding(org.telegram.messenger.g0.L(8.0f));
            a2Var.getDrawable().r(true, false);
            a2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, e6Var)));
            a2Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
            if (i7 == 7) {
                a2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                a2Var.setGravity(19);
                addView(a2Var, c8.ja.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                a2Var.setRightPadding(org.telegram.messenger.g0.L(i10));
                a2Var.setGravity((hd.a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z12 = hd.a0;
                    addView(a2Var, c8.ja.d(-1, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 8 : 29, 0.0f, z12 ? 29 : 8, 0.0f));
                } else {
                    int i12 = a() ? 56 : 46;
                    i12 = i7 == 7 ? i12 + 39 : i12;
                    boolean z13 = hd.a0;
                    addView(a2Var, c8.ja.d(-1, -2.0f, (z13 ? 5 : 3) | 16, z13 ? i10 : (i10 - 17) + i12, 0.0f, z13 ? (i10 - 17) + i12 : i10, 0.0f));
                }
            }
            this.e = a2Var;
        } else {
            b2 b2Var = new b2(i11, context, this);
            this.c = b2Var;
            ns.i(b2Var);
            b2Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, e6Var)));
            b2Var.setTextSize(1, 16.0f);
            b2Var.setLines(1);
            b2Var.setMaxLines(1);
            b2Var.setSingleLine(true);
            b2Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i7 == 7) {
                b2Var.setTypeface(org.telegram.messenger.g0.o());
            }
            if (i7 == 3) {
                b2Var.setGravity(19);
                addView(b2Var, c8.ja.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                b2Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            } else {
                b2Var.setGravity((hd.a0 ? 5 : 3) | 16);
                if (i7 == 2) {
                    boolean z14 = hd.a0;
                    addView(b2Var, c8.ja.d(-1, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 8 : 29, 0.0f, z14 ? 29 : 8, 0.0f));
                } else {
                    int i13 = a() ? 56 : 46;
                    i13 = i7 == 7 ? i13 + 39 : i13;
                    int i14 = a() ? -2 : -1;
                    boolean z15 = hd.a0;
                    addView(b2Var, c8.ja.d(i14, -2.0f, (z15 ? 5 : 3) | 16, z15 ? i10 : (i10 - 17) + i13, 0.0f, z15 ? (i10 - 17) + i13 : i10, 0.0f));
                }
            }
            this.e = b2Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i7 == 1 || i7 == 5) ? org.telegram.ui.ActionBar.j6.m5 : org.telegram.ui.ActionBar.j6.I6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.a0 ? 3 : 5) | 16);
        float f10 = i10;
        addView(textView, c8.ja.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        if (a()) {
            fp fpVar = new fp(21, context, e6Var);
            this.r = fpVar;
            this.h = fpVar;
            fpVar.setDrawUnchecked(true);
            fpVar.a(true, false);
            fpVar.setDrawBackgroundAsArc(10);
            this.F = 21;
            float f11 = 21;
            boolean z16 = hd.a0;
            addView(fpVar, c8.ja.d(21, f11, (z16 ? 5 : 3) | 48, z16 ? 0 : i10, 16.0f, z16 ? i10 : 0, 0.0f));
        } else {
            if (i7 != 1 && i7 != 5) {
                z11 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, e6Var, z11);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = 18;
            if (i7 == 5) {
                float f12 = 18;
                boolean z17 = hd.a0;
                addView(checkBoxSquare, c8.ja.d(18, f12, (z17 ? 5 : 3) | 16, z17 ? 0 : i10, 0.0f, z17 ? i10 : 0, 0.0f));
            } else if (i7 == 3) {
                addView(checkBoxSquare, c8.ja.d(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i7 == 2) {
                addView(checkBoxSquare, c8.ja.d(18, 18, (hd.a0 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f13 = 18;
                boolean z18 = hd.a0;
                addView(checkBoxSquare, c8.ja.d(18, f13, (z18 ? 5 : 3) | 48, z18 ? 0 : i10, 16.0f, z18 ? i10 : 0, 0.0f));
            }
        }
        if (i7 == 6) {
            va vaVar = new va(this, context, R.drawable.msg_folders_groups);
            this.w = vaVar;
            addView(vaVar, c8.ja.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 8) {
            va vaVar2 = new va(this, context, 0);
            this.w = vaVar2;
            addView(vaVar2, c8.ja.i(-2.0f, -2.0f, 8388629, f10, 0.0f, i10 - 11, 0.0f));
        } else if (i7 == 7) {
            this.y = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            this.x = i9Var;
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(17.0f));
            addView(i9Var, c8.ja.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }
}
