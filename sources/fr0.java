// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class fr0 extends l69 {
    public final Context c;
    public o5b e;
    public fr0 f;
    public gd4 h;
    public boolean r;
    public final /* synthetic */ gr0 s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public fr0(gr0 gr0Var, Context context) {
        this.s = gr0Var;
        this.c = context;
        M();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // l69
    public final String F(int i) {
        r47 r47Var;
        TL_stories.StoryItem storyItem;
        o5b o5bVar = this.e;
        if (o5bVar == null || i < 0 || i >= o5bVar.i.size() || (r47Var = (r47) this.e.i.get(i)) == null || (storyItem = r47Var.l) == null) {
            return null;
        }
        return ob6.e0(storyItem.date, true);
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        fr0 fr0Var = this.f;
        gr0 gr0Var = this.s;
        int i = this == fr0Var ? gr0Var.e : gr0Var.d;
        int ceil = (int) (Math.ceil(b() / i) * measuredHeight);
        int measuredHeight2 = d79Var.getMeasuredHeight() - d79Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f2 = f * (ceil - measuredHeight2);
            iArr[0] = ((int) (f2 / measuredHeight)) * i;
            iArr[1] = ((int) f2) % measuredHeight;
        }
    }

    public final boolean L(int i) {
        TLRPC.User X1;
        bga bgaVar = this.s.a0;
        return this.e != null && (X1 = uc7.s1(bgaVar.b).X1(Long.valueOf(bgaVar.d))) != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit;
    }

    public final void M() {
        int max;
        if (this.e != null) {
            gr0 gr0Var = this.s;
            if ((!gr0Var.J || (gr0Var.I && b() > 1)) && b() > 0) {
                if (b() < 5) {
                    max = Math.max(1, b());
                    gr0Var.d = max;
                    gr0Var.I = max == 1;
                } else if (gr0Var.I || (max = gr0Var.d) == 1) {
                    gr0Var.I = false;
                    max = Math.max(2, xea.q1);
                    gr0Var.d = max;
                }
                gr0Var.h.x1(max);
                gr0Var.J = true;
            }
        }
    }

    @Override // j79
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.i.size() + this.d.size();
    }

    @Override // j79
    public final int d(int i) {
        return 19;
    }

    @Override // j79
    public final int e() {
        return b();
    }

    @Override // j79
    public void f() {
        o5b o5bVar = this.e;
        boolean A = ik8.A(o5bVar);
        gr0 gr0Var = this.s;
        if (A) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = uc7.s1(this.e.c).O1().E(gr0Var.a0.d);
            if (E != null) {
                for (int i = 0; i < E.size(); i++) {
                    b6b b6bVar = (b6b) E.get(i);
                    c8b c8bVar = b6bVar.c;
                    if (c8bVar != null && !c8bVar.g && TextUtils.equals(c8bVar.K0, o5bVar.E)) {
                        arrayList.add(b6bVar);
                    }
                }
            }
        }
        super.f();
        fr0 fr0Var = this.f;
        if (fr0Var != null) {
            fr0Var.f();
        }
        if (this != gr0Var.x) {
            M();
            gr0Var.c();
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (this.e != null) {
            View view = f89Var.a;
            if (view instanceof jja) {
                jja jjaVar = (jja) view;
                jjaVar.e0 = true;
                gr0 gr0Var = this.s;
                ArrayList arrayList = this.d;
                if (i < 0 || i >= arrayList.size()) {
                    int size = i - arrayList.size();
                    if (size < 0 || size >= this.e.i.size()) {
                        jjaVar.g0 = false;
                        jjaVar.k(this == this.f ? gr0Var.e : gr0Var.d, null, false);
                        jjaVar.e0 = true;
                        return;
                    }
                    r47 r47Var = (r47) this.e.i.get(size);
                    jjaVar.g0 = r47Var != null && this.e.m(r47Var.e1());
                    jjaVar.setReorder(true);
                    jjaVar.k(this == this.f ? gr0Var.e : gr0Var.d, r47Var, false);
                    bga bgaVar = gr0Var.a0;
                    if (!bgaVar.H.F1 || r47Var == null) {
                        jjaVar.i(false, false);
                        return;
                    } else {
                        jjaVar.i(bgaVar.c(r47Var), true);
                        return;
                    }
                }
                b6b b6bVar = (b6b) arrayList.get(i);
                jjaVar.g0 = false;
                r47 r47Var2 = b6bVar.L;
                if (r47Var2 == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j = b6bVar.a;
                    int i2 = (int) (j ^ (j >>> 32));
                    tL_storyItem.messageId = i2;
                    tL_storyItem.id = i2;
                    tL_storyItem.attachPath = b6bVar.f;
                    er0 er0Var = new er0(this.e.c, tL_storyItem);
                    b6bVar.L = er0Var;
                    er0Var.m = b6bVar;
                    r47Var2 = er0Var;
                }
                jjaVar.k(this == this.f ? gr0Var.e : gr0Var.d, r47Var2, false);
                jjaVar.e0 = true;
                jjaVar.setReorder(false);
                jjaVar.i(false, false);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        bga bgaVar = this.s.a0;
        if (this.h == null) {
            this.h = new gd4(viewGroup.getContext(), bgaVar.c);
        }
        jja jjaVar = new jja(this.c, this.h, bgaVar.b);
        jjaVar.x0 = true;
        jjaVar.setGradientView(null);
        jjaVar.e0 = true;
        return new n69(jjaVar);
    }

    @Override // l69
    public final void I() {
    }
}
