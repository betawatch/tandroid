// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a77 extends nx0 {
    public boolean A1;
    public final ie0 l1;
    public final boolean m1;
    public final boolean n1;
    public final lu7 o1;
    public final EditTextBoldCursor p1;
    public final xs0 q1;
    public final c51 r1;
    public final in s1;
    public final oj t1;
    public final oj u1;
    public oj v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final wm2[] z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a77(Context context, int i, long j, b77 b77Var, zu1 zu1Var, vnb vnbVar, int i2, pcc pccVar) {
        super(1, vnbVar, context, true);
        pj pjVar;
        long j2;
        this.w1 = -1L;
        this.z1 = new wm2[1];
        this.n1 = i2;
        this.E = true;
        this.Q0 = true;
        boolean z = xc2.z(i, 24, j);
        this.m1 = z;
        long f = uc7.s1(i).k4.e.f();
        pj pjVar2 = pj.a;
        this.t1 = oj.h(f, pjVar2);
        oj h = oj.h(r8.f.f(), pjVar2);
        this.u1 = h;
        if (z) {
            this.l1 = null;
        } else {
            ie0 ie0Var = new ie0(i, vnbVar, context);
            this.l1 = ie0Var;
            ie0Var.setScaleX(0.6f);
            ie0Var.setScaleY(0.6f);
            ie0Var.setAlpha(0.0f);
            ie0Var.setEnabled(false);
            ie0Var.setClickable(false);
            this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            iye.a(ie0Var);
            ie0Var.setOnClickListener(new ly(context, vnbVar, (byte) 1));
        }
        L(aob.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j3 = uh9.j(context, 0);
        linearLayout.addView(j3, tre.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i3 = aob.G6;
        yob.X(textView, i3, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(ob6.M0(i2 == 0 ? 2131746805 : 2131746811, null));
        textView.setTypeface(hl.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        j3.addView(textView, tre.q(-1, -1, 1.0f, jn7.D1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i4 = aob.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i4, vnbVar, mode);
        iye.a(imageView);
        imageView.setOnClickListener(new sa5(this, (byte) 29));
        j3.addView(imageView, tre.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.p1 = editTextBoldCursor;
        LinearLayout j4 = uh9.j(context, 1);
        linearLayout.addView(j4, tre.l(1.0f, -1, -2));
        lu7 lu7Var = new lu7(context, null);
        this.o1 = lu7Var;
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(hl.L(42.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        yob.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.requestFocus();
        lu7Var.setLeftPadding(hl.L(28.0f));
        lu7Var.e(editTextBoldCursor);
        oj ojVar = b77Var.a;
        lu7Var.b(1.0f, ojVar != null && !ojVar.l() ? 1.0f : 0.0f, false);
        lu7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ts0(this, (byte) 14));
        lu7Var.addView(editTextBoldCursor, tre.e(-1, -2, 48));
        j4.addView(lu7Var, tre.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.star_small_inner);
        lu7Var.addView(imageView2, tre.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.s1 = inVar;
        int i5 = aob.y6;
        yob.U(inVar, i5, null);
        inVar.setTextSize(hl.L(13.0f));
        inVar.setGravity(5);
        lu7Var.addView(inVar, tre.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        yob.X(textView2, i5, null);
        textView2.setTextSize(1, 13.0f);
        j4.addView(textView2, tre.t(-1, -2, 55, 33, 4, 33, 0));
        xs0 xs0Var = new xs0(context, (byte) 4);
        this.q1 = xs0Var;
        xs0Var.setCursorSize(hl.L(20.0f));
        xs0Var.setCursorWidth(1.5f);
        xs0Var.setTextSize(1, 17.0f);
        xs0Var.setMaxLines(1);
        xs0Var.setBackground(null);
        xs0Var.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        yob.X(xs0Var, i3, null);
        xs0Var.setFocusable(false);
        xs0Var.setClickable(false);
        xs0Var.setEnabled(false);
        lu7 lu7Var2 = new lu7(context, null);
        lu7Var2.setText(ob6.M0(2131746803, null));
        lu7Var2.e(xs0Var);
        lu7Var2.addView(xs0Var, tre.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        iye.b(lu7Var2, 0.02f, 1.2f);
        lu7Var2.setOnClickListener(new lw4(this, context, vnbVar, (byte) 9));
        j4.addView(lu7Var2, tre.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        yob.s(imageView3, i4, vnbVar, mode);
        lu7Var2.addView(imageView3, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        yob.X(textView3, i5, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) hl.S2(ob6.M0(2131746821, null)));
        spannableStringBuilder.append(' ');
        qu6.s(null, null, 2131746820, new Object[]{Long.valueOf(uc7.s1(i).k4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        j4.addView(textView3, tre.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, tre.r(-1, -2, 80));
        c51 i6 = xnb.i(24, vnbVar, context, true);
        this.r1 = i6;
        i6.setOnClickListener(new fg1(this, zu1Var, i, context, vnbVar, j, pccVar));
        if (i2 == 1) {
            i6.i(ob6.M0(2131746810, null), false, true);
        }
        linearLayout2.addView(i6, tre.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        textView2.setText(ob6.M0(2131746807, null));
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(h.a()).length())});
        if (ojVar != null) {
            pjVar = pjVar2;
            if (ojVar.a == pjVar) {
                H0(oj.j(ojVar.b, pjVar), !ojVar.l(), true, false);
                j2 = b77Var.b;
                if (this.w1 != j2) {
                    this.w1 = j2;
                    xs0Var.setText(G0(j2));
                }
                F0(false);
                this.O = linearLayout;
                editTextBoldCursor.addTextChangedListener(new nh6(this, (byte) 1));
            }
        } else {
            pjVar = pjVar2;
        }
        H0(oj.j(0L, pjVar), false, true, false);
        j2 = b77Var.b;
        if (this.w1 != j2) {
        }
        F0(false);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new nh6(this, (byte) 1));
    }

    public static String G0(long j) {
        if (j <= 0) {
            return ob6.M0(2131746819, null);
        }
        String x = ob6.x(j, true);
        if (x.isEmpty()) {
            return x;
        }
        return Character.toUpperCase(x.charAt(0)) + x.substring(1);
    }

    public final void E0() {
        boolean z = this.A1;
        ie0 ie0Var = this.l1;
        boolean z2 = z && !this.J && ie0Var != null && this.b.getY() > ((float) hl.L(32.0f));
        if (this.y1 != z2) {
            this.y1 = z2;
            if (ie0Var != null) {
                ie0Var.setEnabled(z2);
                ie0Var.setClickable(z2);
                ik8.s(ie0Var.animate().scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f), z2 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void F0(boolean z) {
        boolean z2 = this.x1 == 0 && (this.v1.b >= 0 || this.w1 > 0);
        c51 c51Var = this.r1;
        if (c51Var.e0 != z2) {
            c51Var.setEnabled(z2);
            c51Var.setClickable(z2);
            if (z) {
                ik8.s(c51Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                c51Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    public final void H0(oj ojVar, boolean z, boolean z2, boolean z3) {
        int i;
        oj ojVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (ojVar != null) {
            this.v1 = ojVar;
            i = 0;
        } else {
            ojVar = oj.j(0L, pj.a);
            this.v1 = ojVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < ojVar.b) {
            this.x1 = i | 4;
        }
        if (!ojVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        boolean z4 = z2 || ojVar2.b != this.v1.b;
        boolean z5 = z2 || i2 != this.x1;
        if (z5) {
            this.o1.a(this.x1 == 0 ? 0.0f : 1.0f);
            lu7 lu7Var = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                lu7Var.setText(ob6.a0(null, null, 2131744071, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                lu7Var.setText(ob6.a0(null, null, 2131744070, this.t1.g()));
            } else {
                lu7Var.setText(ob6.M0(2131746804, null));
            }
        }
        if (z4 || z5) {
            c51 c51Var = this.r1;
            if (this.n1) {
                c51Var.i(ob6.M0(2131746810, null), z3, true);
            } else if (this.v1.l()) {
                c51Var.i(ob6.M0(2131746809, null), z3, true);
            } else {
                c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131746808, ob6.E(this.v1.a(), ',')), this.z1), z3, true);
            }
            F0(z3);
        }
        if (z4) {
            double d = uc7.s1(this.a).k4.A3.i * 1.0E-5d;
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            di0.h();
            sb.append(di0.f("USD", 2, (long) (this.v1.c() * d * 100.0d), false));
            this.s1.c(sb, z3, true);
        }
        if (z && z4) {
            String b = this.v1.b();
            this.p1.setText(b);
            this.p1.setSelection(b.length());
        }
    }

    @Override // nx0
    public final boolean U(float f, float f2) {
        ie0 ie0Var;
        if (!this.y1 || (ie0Var = this.l1) == null || f < ie0Var.getX() || f > ie0Var.getX() + ie0Var.getWidth() || f2 < ie0Var.getY() || f2 > ie0Var.getY() + ie0Var.getHeight()) {
            return super.U(f, f2);
        }
        return false;
    }

    @Override // nx0
    public final void d0(float f) {
        super.d0(f);
        E0();
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        hl.d3(new z96(this, (byte) 27), 50L);
    }

    @Override // nx0
    public final void x() {
        this.A1 = true;
        E0();
    }
}
