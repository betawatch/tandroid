// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k2a extends ny0 implements fn7 {
    public final q74 S1;
    public final c51 T1;
    public final u5b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l9c Y1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k2a(e eVar, long j, int i, mt7 mt7Var) {
        super(r2, eVar, new my0(r3));
        Activity parentActivity = eVar.getParentActivity();
        my0 my0Var = new my0();
        my0Var.a = false;
        my0Var.c = false;
        my0Var.f = 2;
        my0Var.g = eVar.getResourceProvider();
        this.V1 = new HashMap();
        this.W1 = i;
        u5b z = uc7.s1(eVar.getCurrentAccount()).O1().z(1, -1, j, true);
        this.U1 = z;
        z.p(30, false);
        this.E1 = hl.L(12.0f);
        J();
        U0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        yob.h(aob.h5, this.J0, frameLayout);
        int i2 = this.u0;
        frameLayout.setPadding(i2, 0, i2, 0);
        this.b.addView(frameLayout, tre.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        yob.h(aob.d7, this.J0, view);
        frameLayout.addView(view, tre.a(-1.0f, 1.0f / hl.p, 55));
        c51 c51Var = new c51(this.J0, getContext(), true);
        this.T1 = c51Var;
        c51Var.i(ob6.M0(2131744455, null), false, true);
        c51Var.setEnabled(false);
        c51Var.setOnClickListener(new jy8(this, mt7Var, (byte) 9));
        frameLayout.addView(c51Var, tre.d(-1, 48.0f, jn7.D1, 10.0f, (1.0f / hl.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        q74 q74Var = new q74(i, false);
        this.S1 = q74Var;
        q74Var.O = new ar1(this, (byte) 16);
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, 0);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(q74Var);
        this.n1.setOnItemClickListener(new t39(this, (byte) 6));
        this.n1.setOnItemLongClickListener(new ye9(this, (byte) 24));
        this.n1.setOnScrollListener(new e98(this, (byte) 17));
        this.Y1.O(true);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 19), this.J0);
        this.Y1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(2131744455, null);
    }

    public final void Z0() {
        q74 q74Var = this.S1;
        int K0 = q74Var.K0();
        int abs = K0 == -1 ? 0 : Math.abs(q74Var.M0() - K0) + 1;
        u5b u5bVar = this.U1;
        if (u5bVar != null) {
            int i = K0 + abs;
            int i2 = u5bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                u5bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean a1(int i, View view) {
        b8c G;
        l9c l9cVar = this.Y1;
        if (l9cVar == null || i == 0 || (G = l9cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            int e1 = r47Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((jja) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), r47Var.l);
                G.e = true;
                ((jja) view).i(true, true);
            }
            boolean z = !hashMap.isEmpty();
            c51 c51Var = this.T1;
            c51Var.setEnabled(z);
            c51Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A5 && ((u5b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Z0();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        jn7.f(this.a).b(this, jn7.A5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        jn7.f(this.a).n(this, jn7.A5);
    }
}
