// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kf1 extends w39 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ nf1 n;

    public kf1(nf1 nf1Var, Context context) {
        this.n = nf1Var;
        this.c = context;
        C(true);
    }

    public final void D(boolean z) {
        this.d = 0;
        nf1 nf1Var = this.n;
        ArrayList arrayList = nf1Var.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (nf1Var.r0) {
            this.e = -1;
        } else {
            int i = this.d;
            this.d = i + 1;
            this.e = i;
        }
        int i2 = this.d;
        this.f = i2;
        int size = arrayList.size() + i2;
        this.d = size;
        this.h = size;
    }

    @Override // w39
    public final int b() {
        return this.d;
    }

    @Override // w39
    public final long c(int i) {
        if (i < this.f || i >= this.h) {
            return i == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((k27) arrayList.get((arrayList.size() - (i - this.f)) - 1)).m1;
    }

    @Override // w39
    public final int d(int i) {
        if (i < this.f || i >= this.h) {
            return 4;
        }
        return ((k27) this.n.p0.get((r0.size() - (i - this.f)) - 1)).U;
    }

    @Override // w39
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void g(int i) {
        D(false);
        try {
            super.g(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void j(int i, int i2) {
        D(false);
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void l(int i, int i2) {
        D(false);
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void p(int i, int i2) {
        D(false);
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final void q(int i, int i2) {
        D(false);
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        gb2 gb2Var;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        int i2;
        int i3;
        long j3;
        long j4;
        int i4;
        int i5;
        View view = s49Var.a;
        nf1 nf1Var = this.n;
        ArrayList arrayList = nf1Var.p0;
        if (i == this.e) {
            ((ma2) view).setProgressVisible(true);
            return;
        }
        if (i < this.f || i >= this.h) {
            return;
        }
        k27 k27Var = (k27) arrayList.get((arrayList.size() - (i - this.f)) - 1);
        if (!(view instanceof gb2)) {
            if (view instanceof uk1) {
                uk1 uk1Var = (uk1) view;
                uk1Var.setMessageObject(k27Var);
                uk1Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        gb2 gb2Var2 = (gb2) view;
        gb2Var2.f6 = true;
        int i6 = i + 1;
        int d = d(i6);
        int d2 = d(i - 1);
        if (!(k27Var.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == s49Var.f) {
            k27 k27Var2 = (k27) arrayList.get((arrayList.size() - (i6 - this.f)) - 1);
            z = k27Var2.O3() == k27Var.O3() && k27Var2.Z0() == k27Var.Z0() && Math.abs(k27Var2.k.date - k27Var.k.date) <= 300;
            if (z) {
                TLRPC.TL_forumTopic tL_forumTopic = k27Var.j1;
                if (tL_forumTopic == null) {
                    i5 = ((d) nf1Var).currentAccount;
                    j3 = k27.b2(i5, k27Var.k, true, false);
                } else {
                    j3 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = k27Var2.j1;
                if (tL_forumTopic2 == null) {
                    i4 = ((d) nf1Var).currentAccount;
                    gb2Var = gb2Var2;
                    j4 = k27.b2(i4, k27Var2.k, true, false);
                } else {
                    gb2Var = gb2Var2;
                    j4 = tL_forumTopic2.id;
                }
            } else {
                gb2Var = gb2Var2;
            }
            if (d2 != s49Var.f) {
                k27 k27Var3 = (k27) arrayList.get(arrayList.size() - (i - this.f));
                boolean z4 = !(k27Var3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && k27Var3.O3() == k27Var.O3() && k27Var3.Z0() == k27Var.Z0() && Math.abs(k27Var3.k.date - k27Var.k.date) <= 300;
                if (z4) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = k27Var.j1;
                    if (tL_forumTopic3 == null) {
                        i3 = ((d) nf1Var).currentAccount;
                        z3 = true;
                        j = k27.b2(i3, k27Var.k, true, false);
                    } else {
                        z3 = true;
                        j = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = k27Var3.j1;
                    if (tL_forumTopic4 == null) {
                        i2 = ((d) nf1Var).currentAccount;
                        j2 = k27.b2(i2, k27Var3.k, z3, false);
                    } else {
                        j2 = tL_forumTopic4.id;
                    }
                    if (j != j2) {
                        z4 = false;
                    }
                }
                z2 = z4;
            } else {
                z2 = false;
            }
            gb2 gb2Var3 = gb2Var;
            gb2Var3.z3(k27Var, null, z, z2, false, false);
            gb2Var3.setHighlighted(false);
            gb2Var3.v3(nf1Var.w0);
        }
        gb2Var = gb2Var2;
        z = false;
        if (d2 != s49Var.f) {
        }
        gb2 gb2Var32 = gb2Var;
        gb2Var32.z3(k27Var, null, z, z2, false, false);
        gb2Var32.setHighlighted(false);
        gb2Var32.v3(nf1Var.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ob2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [uk1] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        ViewGroup viewGroup2;
        int i2;
        ViewGroup viewGroup3;
        nf1 nf1Var = this.n;
        ArrayList arrayList = nf1Var.h;
        Context context = this.c;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                i2 = ((d) nf1Var).currentAccount;
                viewGroup3 = new gb2(context, i2);
            } else {
                ?? r5 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r5;
            }
            gb2 gb2Var = (gb2) viewGroup3;
            gb2Var.setDelegate(new ff1(this));
            gb2Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i == 1) {
            ?? gf1Var = new gf1(context);
            gf1Var.setDelegate(new if1(this));
            viewGroup2 = gf1Var;
        } else if (i == 2) {
            viewGroup2 = new ke2(context, null);
        } else if (i == 10) {
            wjbVar = ((d) nf1Var).resourceProvider;
            ?? ob2Var = new ob2(context, wjbVar);
            ob2Var.setDelegate(new i4d(this));
            viewGroup2 = ob2Var;
        } else {
            viewGroup2 = new ma2(context, null);
        }
        return ls6.h(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if ((view instanceof gb2) || (view instanceof uk1)) {
            view.getViewTreeObserver().addOnPreDrawListener(new jf1(this, view, s49Var));
        }
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getMessageObject();
            gb2Var.setBackgroundDrawable(null);
            gb2Var.n3(true, false);
            gb2Var.setHighlighted(false);
        }
    }
}
