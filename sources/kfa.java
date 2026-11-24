// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class kfa extends hfa {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ nfa G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public y1b s;
    public final int w;
    public final ifa x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r19.s = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kfa(nfa nfaVar, Context context, int i, boolean z) {
        super(nfaVar, context);
        int i2;
        TLRPC.User V1;
        this.G = nfaVar;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z;
        this.n = i;
        d dVar = nfaVar.y1;
        long j = nfaVar.m1;
        int currentAccount = dVar.getCurrentAccount();
        y1b y1bVar = null;
        if (!TextUtils.isEmpty(nfaVar.getStoriesHashtag())) {
            y1b y1bVar2 = nfaVar.X1;
            if (y1bVar2 == null) {
                y1bVar2 = new t1b(currentAccount, TextUtils.isEmpty(nfaVar.getStoriesHashtagUsername()) ? null : nfaVar.getStoriesHashtagUsername(), nfaVar.getStoriesHashtag());
                nfaVar.X1 = y1bVar2;
            }
            y1bVar = y1bVar2;
            this.s = y1bVar;
        } else if (nfaVar.getStoriesArea() != null) {
            y1b y1bVar3 = nfaVar.X1;
            if (y1bVar3 == null) {
                y1bVar3 = new t1b(currentAccount, nfaVar.getStoriesArea());
                nfaVar.X1 = y1bVar3;
            }
            y1bVar = y1bVar3;
            this.s = y1bVar;
        } else if (z) {
            int i3 = 1;
            Object[] objArr = j <= 0 && (V1 = na7.q1(currentAccount).V1(Long.valueOf(j))) != null && V1.bot;
            if (i <= 0) {
                y1bVar = dVar.getMessagesController().M1().z(0, i, nfaVar.m1, true);
                this.s = y1bVar;
            } else {
                g2b M1 = dVar.getMessagesController().M1();
                long j2 = nfaVar.m1;
                if (objArr == true) {
                    i3 = 4;
                } else if (!z) {
                    i2 = 0;
                    y1bVar = M1.z(i2, -1, j2, true);
                    this.s = y1bVar;
                }
                i2 = i3;
                y1bVar = M1.z(i2, -1, j2, true);
                this.s = y1bVar;
            }
        } else {
            int i32 = 1;
            if (j <= 0) {
            }
            if (i <= 0) {
            }
        }
        if (y1bVar != null) {
            this.w = y1bVar.o();
            this.x = new ifa(this, dVar.getMessagesController().M1(), nfaVar.m1, this.s.c);
        }
        N();
    }

    @Override // hfa, n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // hfa, w29
    public final String F(int i) {
        k27 k27Var;
        TL_stories.StoryItem storyItem;
        y1b y1bVar = this.s;
        if (y1bVar == null || i < 0 || i >= y1bVar.i.size() || (k27Var = (k27) this.s.i.get(i)) == null || (storyItem = k27Var.l) == null) {
            return null;
        }
        return k96.e0(storyItem.date, true);
    }

    @Override // hfa, w29
    public final void I() {
        this.G.n1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i) {
        y1b y1bVar;
        if (this.h || (y1bVar = this.s) == null) {
            return false;
        }
        if (y1bVar instanceof s1b) {
            nfa nfaVar = this.G;
            TLRPC.User V1 = na7.q1(nfaVar.y1.getCurrentAccount()).V1(Long.valueOf(nfaVar.m1));
            return V1 != null && V1.bot && V1.bot_has_main_app && V1.bot_can_edit;
        }
        if (i < 0 || i >= y1bVar.i.size()) {
            return false;
        }
        k27 k27Var = (k27) this.s.i.get(i);
        y1b y1bVar2 = this.s;
        if (y1bVar2.f > 0) {
            return true;
        }
        return y1bVar2.m(k27Var.e1());
    }

    public final void N() {
        iea ieaVar;
        iea ieaVar2;
        iea ieaVar3;
        iea ieaVar4;
        y1b y1bVar = this.s;
        if (y1bVar == null || this.h) {
            return;
        }
        nfa nfaVar = this.G;
        boolean z = nfaVar.o1;
        iea[] ieaVarArr = nfaVar.n0;
        int[] iArr = nfaVar.p1;
        if ((!z || (nfaVar.n1 && y1bVar.g() > 1)) && this.s.g() > 0 && !nfaVar.s0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (ieaVarArr != null && (ieaVar3 = ieaVarArr[0]) != null && (ieaVar4 = ieaVarArr[1]) != null && ieaVar3.h != null && ieaVar4.h != null) {
                    nfaVar.z1(false);
                }
                nfaVar.n1 = iArr[1] == 1;
            } else if (nfaVar.n1) {
                nfaVar.n1 = false;
                iArr[1] = Math.max(2, gba.r1);
                if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (ieaVar2 = ieaVarArr[1]) != null && ieaVar.h != null && ieaVar2.h != null) {
                    nfaVar.z1(false);
                }
            }
            nfaVar.o1 = true;
        }
    }

    public final int O() {
        nfa nfaVar = this.G;
        uda udaVar = nfaVar.K;
        int[] iArr = nfaVar.p1;
        return this == udaVar ? iArr[0] : nfaVar.x1(this) != -1 ? iArr[1] : nfaVar.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // hfa, w39
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.d0()) ? 0 : this.s.g());
    }

    @Override // hfa, w39
    public final int d(int i) {
        return 19;
    }

    @Override // hfa, w39
    public final int e() {
        return b();
    }

    @Override // w39
    public void f() {
        if (this.s != null) {
            nfa nfaVar = this.G;
            if (nfaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = na7.q1(this.s.c).M1().E(nfaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override // hfa, w39
    public final void t(s49 s49Var, int i) {
        if (this.s == null || s49Var.f != 19) {
            return;
        }
        View view = s49Var.a;
        if (view instanceof qfa) {
            qfa qfaVar = (qfa) view;
            qfaVar.e0 = true;
            ArrayList arrayList = this.r;
            if (i < 0 || i >= arrayList.size()) {
                int size = i - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    qfaVar.g0 = false;
                    qfaVar.k(null, O(), false);
                    qfaVar.e0 = true;
                    return;
                }
                k27 k27Var = (k27) this.s.i.get(size);
                qfaVar.g0 = k27Var != null && this.s.m(k27Var.e1());
                nfa nfaVar = this.G;
                qfaVar.setReorder(nfaVar.l0() || qfaVar.g0);
                qfaVar.h = nfaVar.q0();
                qfaVar.k(k27Var, O(), false);
                if (!nfaVar.F1 || k27Var == null) {
                    qfaVar.i(false, false);
                } else {
                    qfaVar.i(nfaVar.c1[(k27.B0(k27Var.k) > nfaVar.m1 ? 1 : (k27.B0(k27Var.k) == nfaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) >= 0, true);
                }
                qfaVar.l(this.y, false);
                return;
            }
            f2b f2bVar = (f2b) arrayList.get(i);
            qfaVar.g0 = false;
            k27 k27Var2 = f2bVar.L;
            if (k27Var2 == null) {
                TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                long j = f2bVar.a;
                int i2 = (int) (j ^ (j >>> 32));
                tL_storyItem.messageId = i2;
                tL_storyItem.id = i2;
                tL_storyItem.attachPath = f2bVar.f;
                jfa jfaVar = new jfa(this.s.c, tL_storyItem);
                f2bVar.L = jfaVar;
                jfaVar.m = f2bVar;
                k27Var2 = jfaVar;
            }
            qfaVar.k(k27Var2, O(), false);
            qfaVar.e0 = true;
            qfaVar.setReorder(false);
            qfaVar.i(false, false);
        }
    }

    @Override // hfa, w39
    public final s49 x(ViewGroup viewGroup, int i) {
        s49 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof qfa) {
            ((qfa) view).e0 = true;
        }
        return x;
    }

    @Override // hfa
    public final int L(int i) {
        return i;
    }

    public kfa(nfa nfaVar, Context context, boolean z) {
        this(nfaVar, context, 0, z);
    }
}
