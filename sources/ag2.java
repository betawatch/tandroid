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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ag2 extends FrameLayout {
    public final byte E;
    public final byte F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public View J;
    public View K;
    public int a;
    public final wjb b;
    public final ke1 c;
    public final yf2 d;
    public final View e;
    public final TextView f;
    public final View h;
    public final CheckBoxSquare n;
    public final wf2 r;
    public View s;
    public final zf2 w;
    public final be0 x;
    public final pb0 y;

    /* JADX WARN: Multi-variable type inference failed */
    public ag2(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        this.E = i;
        this.I = z;
        byte b = 2;
        byte b2 = 0;
        boolean z2 = true;
        if (z) {
            yf2 yf2Var = new yf2(this, context, b2);
            this.d = yf2Var;
            kk7.i(yf2Var);
            yf2Var.setEllipsizeByGradient(true);
            yf2Var.setRightPadding(gl.L(8.0f));
            yf2Var.getDrawable().r(true, false);
            yf2Var.setTag(Integer.valueOf(bkb.v0((i == 1 || i == 5) ? bkb.i5 : bkb.F6, wjbVar)));
            yf2Var.setTextSize(gl.L(16.0f));
            if (i == 7) {
                yf2Var.setTypeface(gl.o());
            }
            if (i == 3) {
                yf2Var.setGravity(19);
                addView(yf2Var, nme.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                yf2Var.setPadding(0, 0, 0, gl.L(3.0f));
            } else {
                yf2Var.setRightPadding(gl.L(i2));
                yf2Var.setGravity((k96.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z3 = k96.a0;
                    addView(yf2Var, nme.d(-1, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 8 : 29, 0.0f, z3 ? 29 : 8, 0.0f));
                } else {
                    int i3 = a() ? 56 : 46;
                    i3 = i == 7 ? i3 + 39 : i3;
                    boolean z4 = k96.a0;
                    addView(yf2Var, nme.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i2 : (i2 - 17) + i3, 0.0f, z4 ? (i2 - 17) + i3 : i2, 0.0f));
                }
            }
            this.e = yf2Var;
        } else {
            ke1 ke1Var = new ke1(b, context, this);
            this.c = ke1Var;
            kk7.i(ke1Var);
            ke1Var.setTag(Integer.valueOf(bkb.v0((i == 1 || i == 5) ? bkb.i5 : bkb.F6, wjbVar)));
            ke1Var.setTextSize(1, 16.0f);
            ke1Var.setLines(1);
            ke1Var.setMaxLines(1);
            ke1Var.setSingleLine(true);
            ke1Var.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                ke1Var.setTypeface(gl.o());
            }
            if (i == 3) {
                ke1Var.setGravity(19);
                addView(ke1Var, nme.d(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                ke1Var.setPadding(0, 0, 0, gl.L(3.0f));
            } else {
                ke1Var.setGravity((k96.a0 ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z5 = k96.a0;
                    addView(ke1Var, nme.d(-1, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 8 : 29, 0.0f, z5 ? 29 : 8, 0.0f));
                } else {
                    int i4 = a() ? 56 : 46;
                    i4 = i == 7 ? i4 + 39 : i4;
                    int i5 = a() ? -2 : -1;
                    boolean z6 = k96.a0;
                    addView(ke1Var, nme.d(i5, -2.0f, (z6 ? 5 : 3) | 16, z6 ? i2 : (i2 - 17) + i4, 0.0f, z6 ? (i2 - 17) + i4 : i2, 0.0f));
                }
            }
            this.e = ke1Var;
        }
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTag(Integer.valueOf((i == 1 || i == 5) ? bkb.l5 : bkb.H6));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 3 : 5) | 16);
        float f = i2;
        addView(textView, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        if (a()) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.r = wf2Var;
            this.h = wf2Var;
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(true, false);
            wf2Var.setDrawBackgroundAsArc(10);
            this.F = (byte) 21;
            boolean z7 = k96.a0;
            addView(wf2Var, nme.d(21, 21.0f, (z7 ? 5 : 3) | 48, z7 ? 0 : i2, 16.0f, z7 ? i2 : 0, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(wjbVar, context, z2);
            this.n = checkBoxSquare;
            this.h = checkBoxSquare;
            this.F = (byte) 18;
            if (i == 5) {
                boolean z8 = k96.a0;
                addView(checkBoxSquare, nme.d(18, 18.0f, (z8 ? 5 : 3) | 16, z8 ? 0 : i2, 0.0f, z8 ? i2 : 0, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, nme.d(18, 18.0f, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                boolean z9 = k96.a0;
                if (i == 2) {
                    addView(checkBoxSquare, nme.d(18, 18.0f, (z9 ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
                } else {
                    addView(checkBoxSquare, nme.d(18, 18.0f, (z9 ? 5 : 3) | 48, z9 ? 0 : i2, 16.0f, z9 ? i2 : 0, 0.0f));
                }
            }
        }
        if (i == 6) {
            zf2 zf2Var = new zf2(this, context, R.drawable.msg_folders_groups);
            this.w = zf2Var;
            addView(zf2Var, nme.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            zf2 zf2Var2 = new zf2(this, context, 0);
            this.w = zf2Var2;
            addView(zf2Var2, nme.i(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.y = new pb0((wjb) null);
            be0 be0Var = new be0(context);
            this.x = be0Var;
            be0Var.setRoundRadius(gl.L(17.0f));
            addView(be0Var, nme.i(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        g();
    }

    public final boolean a() {
        byte b = this.E;
        return b == 4 || b == 8 || b == 6 || b == 7;
    }

    public final boolean b() {
        wf2 wf2Var = this.r;
        return wf2Var != null ? wf2Var.a.q : this.n.h;
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            wf2Var.a(z, z2);
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
                int i = bkb.h6;
                wjb wjbVar = this.b;
                ff0 f0 = bkb.f0(bkb.v0(i, wjbVar), 2, -1);
                vkb M = zkb.M(i);
                view2.setBackground(f0);
                zkb.j(view2, f0, null, M, wjbVar);
                addView(this.J, nme.e(-1, -1, kk7.D1));
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
            addView(view4, nme.e(56, -1, k96.a0 ? 5 : 3));
        }
        this.K.setOnClickListener(tVar);
    }

    public final void e(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.I) {
            yf2 yf2Var = this.d;
            yf2Var.c(vu3.m(charSequence, yf2Var.getPaint().getFontMetricsInt(), false, null, 0), z3, true);
        } else {
            this.c.setText(charSequence);
        }
        wf2 wf2Var = this.r;
        if (wf2Var != null) {
            wf2Var.a(z, z3);
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
        this.s.setTranslationX(k96.a0 ? (view.getRight() - f) - gl.L(20.0f) : view.getLeft() + f + gl.L(4.0f));
    }

    public final void g() {
        boolean z = this.I;
        wjb wjbVar = this.b;
        byte b = this.E;
        if (z) {
            zkb.U(this.d, (b == 1 || b == 5) ? bkb.i5 : bkb.F6, wjbVar);
        } else {
            int i = (b == 1 || b == 5) ? bkb.i5 : bkb.F6;
            ke1 ke1Var = this.c;
            zkb.X(ke1Var, i, wjbVar);
            zkb.G(ke1Var, (b == 1 || b == 5) ? bkb.j5 : bkb.I6, wjbVar);
        }
        zkb.X(this.f, (b == 1 || b == 5) ? bkb.l5 : bkb.H6, wjbVar);
    }

    public hn getAnimatedTextView() {
        return this.d;
    }

    public wf2 getCheckBoxRound() {
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
            int L = gl.L(a() ? 60.0f : 20.0f) + ((int) Math.abs(this.e.getTranslationX()));
            if (this.E == 7) {
                L += gl.L(39.0f);
            }
            wjb wjbVar = this.b;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : null;
            if (d == null) {
                d = bkb.j0;
            }
            Paint paint = d;
            float f = k96.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!k96.a0) {
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
        yf2 yf2Var = this.d;
        if (yf2Var != null) {
            accessibilityNodeInfo.setText(yf2Var.getText());
        } else {
            ke1 ke1Var = this.c;
            if (ke1Var != null) {
                accessibilityNodeInfo.setText(ke1Var.getText());
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
            textView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(10.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
            view2.measure(View.MeasureSpec.makeMeasureSpec(size - gl.L(34.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_31));
            float f = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(f), TLObject.FLAG_30));
            setMeasuredDimension(gl.L(29.0f) + view2.getMeasuredWidth(), gl.L(50.0f));
        } else if (this.H) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f) + (this.G ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - gl.L(a() ? 60.0f : 34.0f);
            if (this.I) {
                measuredWidth += (int) this.d.getRightPadding();
            }
            if (b2 == 7) {
                measuredWidth -= gl.L(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i3 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            int measuredWidth2 = textView.getMeasuredWidth();
            zf2 zf2Var = this.w;
            if (zf2Var != null) {
                zf2Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                measuredWidth2 = b00.z(11.0f, zf2Var.getMeasuredWidth(), measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(ug8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            } else {
                view2.measure(ug8.f(8.0f, (measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            }
            be0 be0Var = this.x;
            if (be0Var != null) {
                be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), TLObject.FLAG_30));
            }
            float f2 = b;
            view.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(f2), TLObject.FLAG_30));
        }
        View view3 = this.J;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.J.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
        }
        View view5 = this.s;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), TLObject.FLAG_30));
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
            zkb.x(this, mutate, bkb.F6, this.b, PorterDuff.Mode.MULTIPLY);
            this.s.setBackground(mutate);
            addView(this.s, nme.e(16, 16, 16));
        }
        f();
        this.s.animate().cancel();
        this.s.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(s33.h).start();
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
        ke1 ke1Var = this.c;
        if (z2) {
            ke1Var.setLines(0);
            ke1Var.setMaxLines(0);
            ke1Var.setSingleLine(false);
            ke1Var.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            ke1Var.setLines(1);
            ke1Var.setMaxLines(1);
            ke1Var.setSingleLine(true);
            ke1Var.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = gl.L(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z) {
        this.G = z;
    }

    public void setPad(int i) {
        int L = gl.L(i * 40 * (k96.a0 ? -1 : 1));
        View view = this.h;
        if (view != null) {
            view.setTranslationX(L);
        }
        float f = L;
        this.e.setTranslationX(f);
        be0 be0Var = this.x;
        if (be0Var != null) {
            be0Var.setTranslationX(f);
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
            yf2 yf2Var = this.d;
            zkb.q(yf2Var);
            yf2Var.setTextColor(i);
            return;
        }
        ke1 ke1Var = this.c;
        zkb.q(ke1Var);
        ke1Var.setTextColor(i);
        byte b = this.E;
        int i2 = (b == 1 || b == 5) ? bkb.j5 : bkb.I6;
        if (ke1Var.getLinkTextColors() != null) {
            int defaultColor = ke1Var.getLinkTextColors().getDefaultColor();
            wjb wjbVar = this.b;
            if (defaultColor == bkb.v0(i2, wjbVar)) {
                zkb.G(ke1Var, i2, wjbVar);
            }
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        pb0 pb0Var = this.y;
        pb0Var.k(tLObject);
        this.x.f(tLObject, pb0Var);
        boolean z = tLObject instanceof TLRPC.User;
        String q = z ? l7c.q((TLRPC.User) tLObject) : qu2.o(tLObject);
        if (z && ((TLRPC.User) tLObject).id == na7.q1(y6c.t0).L3) {
            q = k96.M0(2131752448, null);
        }
        if (!this.I) {
            this.c.setText(q);
        } else {
            yf2 yf2Var = this.d;
            yf2Var.setText(vu3.m(q, yf2Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public ag2(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public ag2(int i, wjb wjbVar, Context context) {
        this(context, i, 17, false, wjbVar);
    }
}
