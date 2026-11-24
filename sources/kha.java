// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class kha extends hha {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ nha G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public z3b s;
    public final int w;
    public final iha x;
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
    public kha(nha nhaVar, Context context, int i, boolean z) {
        super(nhaVar, context);
        int i2;
        TLRPC.User W1;
        this.G = nhaVar;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z;
        this.n = i;
        d dVar = nhaVar.y1;
        long j = nhaVar.m1;
        int currentAccount = dVar.getCurrentAccount();
        z3b z3bVar = null;
        if (!TextUtils.isEmpty(nhaVar.getStoriesHashtag())) {
            z3b z3bVar2 = nhaVar.X1;
            if (z3bVar2 == null) {
                z3bVar2 = new u3b(currentAccount, TextUtils.isEmpty(nhaVar.getStoriesHashtagUsername()) ? null : nhaVar.getStoriesHashtagUsername(), nhaVar.getStoriesHashtag());
                nhaVar.X1 = z3bVar2;
            }
            z3bVar = z3bVar2;
            this.s = z3bVar;
        } else if (nhaVar.getStoriesArea() != null) {
            z3b z3bVar3 = nhaVar.X1;
            if (z3bVar3 == null) {
                z3bVar3 = new u3b(currentAccount, nhaVar.getStoriesArea());
                nhaVar.X1 = z3bVar3;
            }
            z3bVar = z3bVar3;
            this.s = z3bVar;
        } else if (z) {
            int i3 = 1;
            Object[] objArr = j <= 0 && (W1 = oc7.r1(currentAccount).W1(Long.valueOf(j))) != null && W1.bot;
            if (i <= 0) {
                z3bVar = dVar.getMessagesController().N1().z(0, i, nhaVar.m1, true);
                this.s = z3bVar;
            } else {
                h4b N1 = dVar.getMessagesController().N1();
                long j2 = nhaVar.m1;
                if (objArr == true) {
                    i3 = 4;
                } else if (!z) {
                    i2 = 0;
                    z3bVar = N1.z(i2, -1, j2, true);
                    this.s = z3bVar;
                }
                i2 = i3;
                z3bVar = N1.z(i2, -1, j2, true);
                this.s = z3bVar;
            }
        } else {
            int i32 = 1;
            if (j <= 0) {
            }
            if (i <= 0) {
            }
        }
        if (z3bVar != null) {
            this.w = z3bVar.o();
            this.x = new iha(this, dVar.getMessagesController().N1(), nhaVar.m1, this.s.c);
        }
        N();
    }

    @Override // hha, q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // hha, z49
    public final String F(int i) {
        k47 k47Var;
        TL_stories.StoryItem storyItem;
        z3b z3bVar = this.s;
        if (z3bVar == null || i < 0 || i >= z3bVar.i.size() || (k47Var = (k47) this.s.i.get(i)) == null || (storyItem = k47Var.l) == null) {
            return null;
        }
        return jb6.e0(storyItem.date, true);
    }

    @Override // hha, z49
    public final void I() {
        this.G.n1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i) {
        z3b z3bVar;
        if (this.h || (z3bVar = this.s) == null) {
            return false;
        }
        if (z3bVar instanceof t3b) {
            nha nhaVar = this.G;
            TLRPC.User W1 = oc7.r1(nhaVar.y1.getCurrentAccount()).W1(Long.valueOf(nhaVar.m1));
            return W1 != null && W1.bot && W1.bot_has_main_app && W1.bot_can_edit;
        }
        if (i < 0 || i >= z3bVar.i.size()) {
            return false;
        }
        k47 k47Var = (k47) this.s.i.get(i);
        z3b z3bVar2 = this.s;
        if (z3bVar2.f > 0) {
            return true;
        }
        return z3bVar2.m(k47Var.e1());
    }

    public final void N() {
        iga igaVar;
        iga igaVar2;
        iga igaVar3;
        iga igaVar4;
        z3b z3bVar = this.s;
        if (z3bVar == null || this.h) {
            return;
        }
        nha nhaVar = this.G;
        boolean z = nhaVar.o1;
        iga[] igaVarArr = nhaVar.n0;
        int[] iArr = nhaVar.p1;
        if ((!z || (nhaVar.n1 && z3bVar.g() > 1)) && this.s.g() > 0 && !nhaVar.s0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (igaVarArr != null && (igaVar3 = igaVarArr[0]) != null && (igaVar4 = igaVarArr[1]) != null && igaVar3.h != null && igaVar4.h != null) {
                    nhaVar.z1(false);
                }
                nhaVar.n1 = iArr[1] == 1;
            } else if (nhaVar.n1) {
                nhaVar.n1 = false;
                iArr[1] = Math.max(2, gda.q1);
                if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (igaVar2 = igaVarArr[1]) != null && igaVar.h != null && igaVar2.h != null) {
                    nhaVar.z1(false);
                }
            }
            nhaVar.o1 = true;
        }
    }

    public final int O() {
        nha nhaVar = this.G;
        ufa ufaVar = nhaVar.K;
        int[] iArr = nhaVar.p1;
        return this == ufaVar ? iArr[0] : nhaVar.x1(this) != -1 ? iArr[1] : nhaVar.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // hha, y59
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.d0()) ? 0 : this.s.g());
    }

    @Override // hha, y59
    public final int d(int i) {
        return 19;
    }

    @Override // hha, y59
    public final int e() {
        return b();
    }

    @Override // y59
    public void f() {
        if (this.s != null) {
            nha nhaVar = this.G;
            if (nhaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = oc7.r1(this.s.c).N1().E(nhaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override // hha, y59
    public final void t(u69 u69Var, int i) {
        if (this.s == null || u69Var.f != 19) {
            return;
        }
        View view = u69Var.a;
        if (view instanceof sha) {
            sha shaVar = (sha) view;
            shaVar.e0 = true;
            ArrayList arrayList = this.r;
            if (i < 0 || i >= arrayList.size()) {
                int size = i - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    shaVar.g0 = false;
                    shaVar.k(null, O(), false);
                    shaVar.e0 = true;
                    return;
                }
                k47 k47Var = (k47) this.s.i.get(size);
                shaVar.g0 = k47Var != null && this.s.m(k47Var.e1());
                nha nhaVar = this.G;
                shaVar.setReorder(nhaVar.l0() || shaVar.g0);
                shaVar.h = nhaVar.q0();
                shaVar.k(k47Var, O(), false);
                if (!nhaVar.F1 || k47Var == null) {
                    shaVar.i(false, false);
                } else {
                    shaVar.i(nhaVar.c1[(k47.B0(k47Var.k) > nhaVar.m1 ? 1 : (k47.B0(k47Var.k) == nhaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) >= 0, true);
                }
                shaVar.l(this.y, false);
                return;
            }
            g4b g4bVar = (g4b) arrayList.get(i);
            shaVar.g0 = false;
            k47 k47Var2 = g4bVar.L;
            if (k47Var2 == null) {
                TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                long j = g4bVar.a;
                int i2 = (int) (j ^ (j >>> 32));
                tL_storyItem.messageId = i2;
                tL_storyItem.id = i2;
                tL_storyItem.attachPath = g4bVar.f;
                jha jhaVar = new jha(this.s.c, tL_storyItem);
                g4bVar.L = jhaVar;
                jhaVar.m = g4bVar;
                k47Var2 = jhaVar;
            }
            shaVar.k(k47Var2, O(), false);
            shaVar.e0 = true;
            shaVar.setReorder(false);
            shaVar.i(false, false);
        }
    }

    @Override // hha, y59
    public final u69 x(ViewGroup viewGroup, int i) {
        u69 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof sha) {
            ((sha) view).e0 = true;
        }
        return x;
    }

    @Override // hha
    public final int L(int i) {
        return i;
    }

    public kha(nha nhaVar, Context context, boolean z) {
        this(nhaVar, context, 0, z);
    }
}
