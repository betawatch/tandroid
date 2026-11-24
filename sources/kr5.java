// default package

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kr5 extends FrameLayout implements tjb {
    public final be0 a;
    public final jia b;
    public final jia c;
    public final pb0 d;
    public final wf2 e;
    public nu2 f;
    public CharSequence h;
    public int n;

    public kr5(Context context, boolean z) {
        super(context);
        this.d = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        addView(be0Var, nme.d(46, 46.0f, (k96.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z2 = k96.a0;
        addView(linearLayout, nme.d(-1, -1.0f, kk7.D1, z2 ? 0 : 72, 0.0f, z2 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, nme.l(1.0f, 0, 58));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(15);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        frameLayout.addView(jiaVar, nme.d(-1, 20.0f, (k96.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(13);
        jiaVar2.setGravity((k96.a0 ? 5 : 3) | 48);
        frameLayout.addView(jiaVar2, nme.d(-1, 20.0f, (k96.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z) {
            wf2 wf2Var = new wf2(21, null, context);
            this.e = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z3 = k96.a0;
            addView(wf2Var, nme.d(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 40.0f, 32.0f, z3 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ls8 ls8Var = new ls8(context);
        ls8Var.setText(k96.M0(2131748982, null));
        ls8Var.setTextSize(1, 14.0f);
        zkb.X(ls8Var, bkb.Ii, null);
        ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
        int i = bkb.Xl;
        ff0 e = sjb.e(bkb.w0(null, i, false), 16.0f);
        vkb M = zkb.M(i);
        vkb e2 = zkb.e(i);
        ls8Var.setBackground(e);
        zkb.j(ls8Var, e, M, e2, null);
        ls8Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        linearLayout.addView(ls8Var, nme.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ls8Var.setOnClickListener(new b95(this, (byte) 10));
    }

    public final void a(nu2 nu2Var, CharSequence charSequence) {
        this.f = nu2Var;
        this.h = charSequence;
        if (nu2Var == null) {
            return;
        }
        long j = nu2Var.a;
        String str = nu2Var.i;
        String str2 = nu2Var.j;
        pb0 pb0Var = this.d;
        pb0Var.j(j, str, str2, null);
        CharSequence charSequence2 = this.h;
        jia jiaVar = this.b;
        if (charSequence2 != null) {
            jiaVar.l(charSequence2, true);
        } else {
            nu2 nu2Var2 = this.f;
            jiaVar.l(qu2.m(0, nu2Var2.i, nu2Var2.j), false);
        }
        int i = bkb.x6;
        Integer valueOf = Integer.valueOf(i);
        jia jiaVar2 = this.c;
        jiaVar2.setTag(valueOf);
        zkb.W(jiaVar2, i, null);
        nu2 nu2Var3 = this.f;
        int i2 = nu2Var3.l;
        if (i2 > 0) {
            jiaVar2.l(k96.G(i2, "TelegramContacts", new Object[0]), false);
        } else {
            jiaVar2.l((CharSequence) nu2Var3.e.get(0), false);
        }
        this.a.setImageDrawable(pb0Var);
    }

    public nu2 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = (((((((((((((bkb.w0(null, bkb.I7, false) * 31) + bkb.w0(null, bkb.N7, false)) * 31) + bkb.w0(null, bkb.O7, false)) * 31) + bkb.w0(null, bkb.P7, false)) * 31) + bkb.w0(null, bkb.Q7, false)) * 31) + bkb.w0(null, bkb.R7, false)) * 31) + bkb.w0(null, bkb.S7, false)) * 31) + bkb.w0(null, bkb.T7, false);
            if (w0 != this.n) {
                this.n = w0;
                be0 be0Var = this.a;
                if (be0Var != null) {
                    be0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
