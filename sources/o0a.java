// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o0a extends fx0 {
    public final er7 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final hn o1;
    public final u41 p1;
    public final hn q1;
    public final bhb r1;
    public final ImageView s1;
    public final ImageView t1;
    public final nj u1;
    public final nj v1;
    public final nj w1;
    public final nj x1;
    public nj y1;
    public int z1;

    public o0a(Context context, wjb wjbVar, int i, nj njVar, nu9 nu9Var) {
        super(1, wjbVar, context, true);
        this.a = i;
        this.Q0 = true;
        this.E = true;
        gr grVar = na7.q1(i).k4;
        long max = Math.max(grVar.q.f(), 10000000L);
        oj ojVar = oj.b;
        this.w1 = nj.j(max, ojVar);
        this.x1 = nj.j(grVar.r.f(), ojVar);
        long f = grVar.o.f();
        oj ojVar2 = oj.a;
        this.u1 = nj.h(f, ojVar2);
        this.v1 = nj.h(grVar.p.f(), ojVar2);
        M(bkb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = de9.j(context, 0);
        linearLayout.addView(j, nme.t(-1, 56, 55, 0, 0, 0, 0));
        hn hnVar = new hn(context, false, false, false);
        this.o1 = hnVar;
        int i2 = bkb.F6;
        zkb.U(hnVar, i2, null);
        hnVar.setTextSize(gl.L(20.0f));
        hnVar.setGravity(8388627);
        hnVar.setTypeface(gl.o());
        j.addView(hnVar, nme.q(-1, -1, 1.0f, kk7.D1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, nme.l(1.0f, -1, -2));
        er7 er7Var = new er7(context, null);
        this.l1 = er7Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gl.L(42.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        zkb.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.requestFocus();
        er7Var.setLeftPadding(gl.L(28.0f));
        er7Var.e(editTextBoldCursor);
        er7Var.b(1.0f, njVar != null && !njVar.l() ? 1.0f : 0.0f, false);
        er7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 17));
        er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
        linearLayout2.addView(er7Var, nme.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        er7Var.addView(imageView, nme.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        er7Var.addView(imageView2, nme.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar2 = new hn(context, false, false, false);
        this.q1 = hnVar2;
        int i3 = bkb.x6;
        zkb.U(hnVar2, i3, null);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setGravity(5);
        er7Var.addView(hnVar2, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        zkb.X(textView, i3, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, nme.t(-1, -2, 55, 33, 4, 33, 0));
        bhb bhbVar = new bhb(context);
        this.r1 = bhbVar;
        bhbVar.c.setLayoutParams(nme.d(20, 20.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        bhbVar.b(k96.M0(2131745935, null), k96.M0(2131745936, null), true, false);
        bhbVar.setOnClickListener(new ik8(this, (byte) 22));
        linearLayout2.addView(bhbVar, nme.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, nme.r(-1, -2, 80));
        u41 i4 = yjb.i(24, wjbVar, context, true);
        this.p1 = i4;
        i4.setOnClickListener(new b99(this, nu9Var, (byte) 7));
        i4.i(k96.M0(2131745958, null), false, true);
        linearLayout3.addView(i4, nme.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (njVar != null) {
            E0(nj.j(njVar.b, njVar.a), !njVar.l(), true, false);
        } else {
            E0(nj.j(0L, ojVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 12));
    }

    public final nj D0() {
        return this.y1.a == oj.b ? this.x1 : this.v1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(nj njVar, boolean z, boolean z2, boolean z3) {
        int i;
        oj ojVar = oj.b;
        oj ojVar2 = oj.a;
        nj njVar2 = this.y1;
        int i2 = this.z1;
        this.z1 = 0;
        if (njVar != null) {
            this.y1 = njVar;
        } else {
            this.y1 = nj.j(0L, njVar2.a);
            this.z1 |= 1;
        }
        long j = D0().b;
        nj njVar3 = this.y1;
        if (j < njVar3.b) {
            this.z1 |= 4;
        }
        if (!njVar3.l()) {
            nj njVar4 = this.y1;
            if ((njVar4.a == ojVar ? this.w1 : this.u1).b > njVar4.b) {
                this.z1 |= 2;
            }
        }
        boolean z4 = z2 || njVar2.a != this.y1.a;
        boolean z5 = z2 || njVar2.b != this.y1.b;
        boolean z6 = z2 || i2 != this.z1;
        if (z6) {
            this.l1.a((this.z1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        if (z4) {
            ImageView imageView = this.t1;
            hn hnVar = this.o1;
            EditTextBoldCursor editTextBoldCursor = this.m1;
            i = 0;
            oj ojVar3 = this.y1.a;
            if (ojVar3 == ojVar2) {
                hnVar.c(k96.M0(2131745930, null), z3, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length())});
            } else if (ojVar3 == ojVar) {
                hnVar.c(k96.M0(2131745929, null), z3, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length() + 3)});
            }
            this.r1.c.a(this.y1.a == ojVar, z3);
            ImageView imageView2 = this.s1;
            if (z3) {
                imageView2.animate().alpha(this.y1.a == ojVar2 ? 1.0f : 0.0f).scaleX(this.y1.a == ojVar2 ? 1.0f : 0.0f).scaleY(this.y1.a == ojVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.y1.a == ojVar ? 1.0f : 0.0f).scaleX(this.y1.a == ojVar ? 1.0f : 0.0f).scaleY(this.y1.a == ojVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.y1.a == ojVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.y1.a == ojVar ? 1.0f : 0.0f);
            }
        } else {
            i = 0;
        }
        if (z4 || z6) {
            er7 er7Var = this.l1;
            int i3 = this.z1;
            if ((i3 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[i] = D0().g();
                er7Var.setText(k96.a0(null, null, 2131745932, objArr));
            } else {
                int i4 = i3 & 2;
                nj njVar5 = this.y1;
                if (i4 != 0) {
                    nj njVar6 = njVar5.a == ojVar ? this.w1 : this.u1;
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = njVar6.g();
                    er7Var.setText(k96.a0(null, null, 2131745931, objArr2));
                } else {
                    er7Var.setText(k96.M0(njVar5.a == ojVar2 ? 2131745934 : 2131745933, null));
                }
            }
        }
        if (z4 || z5 || z6) {
            u41 u41Var = this.p1;
            boolean z7 = (this.z1 != 0 || this.y1.b <= 0) ? i : 1;
            if (u41Var.e0 != z7) {
                u41Var.setEnabled(z7);
                u41Var.setClickable(z7);
                if (z3) {
                    ug8.s(u41Var.animate(), z7 != 0 ? 1.0f : 0.6f, 180L);
                } else {
                    u41Var.setAlpha(z7 != 0 ? 1.0f : 0.6f);
                }
            }
        }
        if (z4 || z5) {
            gr grVar = na7.q1(this.a).k4;
            nj njVar7 = this.y1;
            oj ojVar4 = njVar7.a;
            if (ojVar4 == ojVar2) {
                this.n1.setText(gl.T2(k96.G((int) nj.j((njVar7.b * grVar.m.f()) / 1000, njVar7.a).a(), "ResellGiftInfo", new Object[i])));
            } else if (ojVar4 == ojVar) {
                this.n1.setText(gl.T2(k96.a0(null, null, 2131745939, nj.j((njVar7.b * grVar.n.f()) / 1000, njVar7.a).b())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            oj ojVar5 = this.y1.a;
            int i5 = this.a;
            double d = ojVar5 == ojVar ? na7.q1(i5).k4.k.i : na7.q1(i5).k4.s3.i * 1.0E-5d;
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.y1.c() * d * 100.0d), false));
            this.q1.c(sb, z3, true);
        }
        if (z && z5) {
            String b = this.y1.b();
            this.m1.setText(b);
            this.m1.setSelection(b.length());
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        gl.e3(new zk9(this, (byte) 25), 50L);
    }
}
