// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxSquare;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oh2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final ylb b;
    public final sf1 c;
    public final mh2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final jh2 r;
    public View s;
    public final nh2 w;
    public final bf0 x;
    public final pc0 y;

    /* JADX WARN: Multi-variable type inference failed */
    public oh2(Context context, int i, int i2, boolean z, ylb ylbVar) {
        super(context);
        this.b = ylbVar;
        this.E = i;
        this.I = z;
        byte b = 2;
        byte b2 = 0;
        boolean z2 = true;
        if (z) {
            mh2 mh2Var = new mh2(this, context, b2);
            this.d = mh2Var;
            nm7.i(mh2Var);
            mh2Var.setEllipsizeByGradient(true);
            mh2Var.setRightPadding(gm.L(8.0f));
            mh2Var.getDrawable().r(true, false);
            mh2Var.setTag(Integer.valueOf(cmb.v0((i == 1 || i == 5) ? cmb.i5 : cmb.F6, ylbVar)));
            mh2Var.setTextSize(gm.L(16.0f));
            if (i == 7) {
                mh2Var.setTypeface(gm.o());
            }
            if (i == 3) {
                mh2Var.setGravity(19);
                addView(mh2Var, qoe.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                mh2Var.setPadding(0, 0, 0, gm.L(3.0f));
            } else {
                mh2Var.setRightPadding(gm.L(i2));
                mh2Var.setGravity((jb6.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z3 = jb6.a0;
                    addView(mh2Var, qoe.d(-1, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 8 : 29, 0.0f, z3 ? 29 : 8, 0.0f));
                } else {
                    int i3 = a() ? 56 : 46;
                    i3 = i == 7 ? i3 + 39 : i3;
                    boolean z4 = jb6.a0;
                    addView(mh2Var, qoe.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i2 : (i2 - 17) + i3, 0.0f, z4 ? (i2 - 17) + i3 : i2, 0.0f));
                }
            }
            this.e = mh2Var;
        } else {
            sf1 sf1Var = new sf1(b, context, this);
            this.c = sf1Var;
            nm7.i(sf1Var);
            sf1Var.setTag(Integer.valueOf(cmb.v0((i == 1 || i == 5) ? cmb.i5 : cmb.F6, ylbVar)));
            sf1Var.setTextSize(1, 16.0f);
            sf1Var.setLines(1);
            sf1Var.setMaxLines(1);
            sf1Var.setSingleLine(true);
            sf1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                sf1Var.setTypeface(gm.o());
            }
            if (i == 3) {
                sf1Var.setGravity(19);
                addView(sf1Var, qoe.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                sf1Var.setPadding(0, 0, 0, gm.L(3.0f));
            } else {
                sf1Var.setGravity((jb6.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z5 = jb6.a0;
                    addView(sf1Var, qoe.d(-1, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 8 : 29, 0.0f, z5 ? 29 : 8, 0.0f));
                } else {
                    int i4 = a() ? 56 : 46;
                    i4 = i == 7 ? i4 + 39 : i4;
                    int i5 = a() ? -2 : -1;
                    boolean z6 = jb6.a0;
                    addView(sf1Var, qoe.d(i5, -2.0f, (z6 ? 5 : 3) | 16, z6 ? i2 : (i2 - 17) + i4, 0.0f, z6 ? (i2 - 17) + i4 : i2, 0.0f));
                }
            }
            this.e = sf1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i == 1 || i == 5) ? cmb.l5 : cmb.H6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 3 : 5) | 16);
        float f = i2;
        addView(textView, qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        if (a()) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.r = jh2Var;
            this.h = jh2Var;
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(true, false);
            jh2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = jb6.a0;
            addView(jh2Var, qoe.d(21, 21.0f, (z7 ? 5 : 3) | 48, z7 ? 0 : i2, 16.0f, z7 ? i2 : 0, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(ylbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = jb6.a0;
                addView(checkBoxSquare, qoe.d(18, 18.0f, (z8 ? 5 : 3) | 16, z8 ? 0 : i2, 0.0f, z8 ? i2 : 0, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, qoe.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = jb6.a0;
                if (i == 2) {
                    addView(checkBoxSquare, qoe.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
                } else {
                    addView(checkBoxSquare, qoe.d(18, 18.0f, (z9 ? 5 : 3) | 48, z9 ? 0 : i2, 16.0f, z9 ? i2 : 0, 0.0f));
                }
            }
        }
        if (i == 6) {
            nh2 nh2Var = new nh2(this, context, R.drawable.msg_folders_groups);
            this.w = nh2Var;
            addView(nh2Var, qoe.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            nh2 nh2Var2 = new nh2(this, context, 0);
            this.w = nh2Var2;
            addView(nh2Var2, qoe.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new pc0((ylb) null);
            bf0 bf0Var = new bf0(context);
            this.x = bf0Var;
            bf0Var.setRoundRadius(gm.L(17.0f));
            addView(bf0Var, qoe.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }

    public final boolean a() {
        byte b = this.E;
        return b == 4 || b == 8 || b == 6 || b == 7;
    }

    public final boolean b() {
        jh2 jh2Var = this.r;
        return jh2Var != null ? jh2Var.a.q : this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            jh2Var.a(z, z2);
        } else {
            this.n.a(z, z2);
        }
    }

    public final void d(j1 j1Var, t tVar) {
        View view = this.J;
        if (j1Var != null) {
            if (view == null) {
                View view2 = new View(getContext());
                this.J = view2;
                int i = cmb.h6;
                ylb ylbVar = this.b;
                fg0 f0 = cmb.f0(cmb.v0(i, ylbVar), 2, -1);
                wmb M = anb.M(i);
                view2.setBackground(f0);
                anb.j(view2, f0, null, M, ylbVar);
                addView(this.J, qoe.e(-1, -1, nm7.D1));
            }
            this.J.setOnClickListener(j1Var);
        } else if (view != null) {
            removeView(view);
            this.J = null;
        }
        View view3 = this.K;
        if (tVar == null) {
            if (view3 != null) {
                removeView(view3);
                this.K = null;
                return;
            }
            return;
        }
        if (view3 == null) {
            View view4 = new View(getContext());
            this.K = view4;
            addView(view4, qoe.e(56, -1, jb6.a0 ? 5 : 3));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            mh2 mh2Var = this.d;
            mh2Var.c(gw3.m(charSequence, mh2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        jh2 jh2Var = this.r;
        if (jh2Var != null) {
            jh2Var.a(z, z3);
        } else {
            this.n.a(z, z3);
        }
        this.f.setText(str);
        this.G = z2;
        setWillNotDraw(!z2);
    }

    public final void f() {
        float f;
        View view = this.e;
        if (this.s == null) {
            return;
        }
        try {
            f = view.getMeasuredWidth();
        } catch (Exception unused) {
            f = 0.0f;
        }
        this.s.setTranslationX(jb6.a0 ? (view.getRight() - f) - gm.L(20.0f) : view.getLeft() + f + gm.L(4.0f));
    }

    public final void g() {
        boolean z = this.I;
        ylb ylbVar = this.b;
        byte b = this.E;
        if (z) {
            anb.U(this.d, (b == 1 || b == 5) ? cmb.i5 : cmb.F6, ylbVar);
        } else {
            int i = (b == 1 || b == 5) ? cmb.i5 : cmb.F6;
            sf1 sf1Var = this.c;
            anb.X(sf1Var, i, ylbVar);
            anb.G(sf1Var, (b == 1 || b == 5) ? cmb.j5 : cmb.I6, ylbVar);
        }
        anb.X(this.f, (b == 1 || b == 5) ? cmb.l5 : cmb.H6, ylbVar);
    }

    public io getAnimatedTextView() {
        return this.d;
    }

    public jh2 getCheckBoxRound() {
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
            int L = gm.L(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += gm.L(39.0f);
            }
            ylb ylbVar = this.b;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
            if (d == null) {
                d = cmb.j0;
            }
            Paint paint = d;
            float f = jb6.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!jb6.a0) {
                L = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        mh2 mh2Var = this.d;
        if (mh2Var != null) {
            accessibilityNodeInfo.setText(mh2Var.getText());
        } else {
            sf1 sf1Var = this.c;
            if (sf1Var != null) {
                accessibilityNodeInfo.setText(sf1Var.getText());
            }
        }
        accessibilityNodeInfo.setChecked(b());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        View view = this.h;
        byte b = this.F;
        View view2 = this.e;
        TextView textView = this.f;
        byte b2 = this.E;
        if (b2 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - gm.L(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_31));
            float f = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(f), TLObject.FLAG_30));
            setMeasuredDimension(gm.L(29.0f) + view2.getMeasuredWidth(), gm.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gm.L(a() ? 60.0f : 34.0f);
            if (this.I) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                measuredWidth -= gm.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            nh2 nh2Var = this.w;
            if (nh2Var != null) {
                nh2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = b10.z(11.0f, nh2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(wi8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(wi8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            bf0 bf0Var = this.x;
            if (bf0Var != null) {
                bf0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), TLObject.FLAG_30));
            }
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(f2), TLObject.FLAG_30));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(16.0f), TLObject.FLAG_30));
        }
    }

    public void setCollapsed(Boolean bool) {
        View view = this.s;
        if (bool == null) {
            if (view != null) {
                removeView(view);
                this.s = null;
                return;
            }
            return;
        }
        if (view == null) {
            this.s = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            anb.x(this, mutate, cmb.F6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, qoe.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(d53.h).start();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setAlpha(z ? 1.0f : 0.5f);
        this.f.setAlpha(z ? 1.0f : 0.5f);
        this.h.setAlpha(z ? 1.0f : 0.5f);
    }

    public void setIcon(int i) {
        this.r.setIcon(i);
    }

    public void setMultiline(boolean z) {
        if (this.I) {
            return;
        }
        this.H = z;
        View view = this.e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.h;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z2 = this.H;
        sf1 sf1Var = this.c;
        if (z2) {
            sf1Var.setLines(0);
            sf1Var.setMaxLines(0);
            sf1Var.setSingleLine(false);
            sf1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            sf1Var.setLines(1);
            sf1Var.setMaxLines(1);
            sf1Var.setSingleLine(true);
            sf1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = gm.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z) {
        this.G = z;
    }

    public void setPad(int i) {
        int L = gm.L(i * 40 * (jb6.a0 ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        bf0 bf0Var = this.x;
        if (bf0Var != null) {
            bf0Var.setTranslationX(f);
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setTranslationX(f);
        }
        View view3 = this.K;
        if (view3 != null) {
            view3.setTranslationX(f);
        }
    }

    public void setTextColor(int i) {
        if (this.I) {
            mh2 mh2Var = this.d;
            anb.q(mh2Var);
            mh2Var.setTextColor(i);
            return;
        }
        sf1 sf1Var = this.c;
        anb.q(sf1Var);
        sf1Var.setTextColor(i);
        byte b = this.E;
        int i2 = (b == 1 || b == 5) ? cmb.j5 : cmb.I6;
        if (sf1Var.getLinkTextColors() != null) {
            int defaultColor = sf1Var.getLinkTextColors().getDefaultColor();
            ylb ylbVar = this.b;
            if (defaultColor == cmb.v0(i2, ylbVar)) {
                anb.G(sf1Var, i2, ylbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        pc0 pc0Var = this.y;
        pc0Var.k(tLObject);
        this.x.f(tLObject, pc0Var);
        boolean z = tLObject instanceof TLRPC.User;
        String r = z ? m9c.r((TLRPC.User) tLObject) : bw2.o(tLObject);
        if (z && ((TLRPC.User) tLObject).id == oc7.r1(z8c.t0).L3) {
            r = jb6.M0(2131752407, null);
        }
        if (!this.I) {
            this.c.setText(r);
        } else {
            mh2 mh2Var = this.d;
            mh2Var.setText(gw3.m(r, mh2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public oh2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public oh2(int i, ylb ylbVar, Context context) {
        this(context, i, 17, false, ylbVar);
    }
}
