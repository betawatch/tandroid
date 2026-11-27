// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class bja extends yia {
    public final ArrayList E;
    public boolean F;
    public final /* synthetic */ eja G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public u5b s;
    public final int w;
    public final zia x;
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
    public bja(eja ejaVar, Context context, int i, boolean z) {
        super(ejaVar, context);
        int i2;
        TLRPC.User X1;
        this.G = ejaVar;
        this.r = new ArrayList();
        this.E = new ArrayList();
        this.h = z;
        this.n = i;
        e eVar = ejaVar.y1;
        long j = ejaVar.m1;
        int currentAccount = eVar.getCurrentAccount();
        u5b u5bVar = null;
        if (!TextUtils.isEmpty(ejaVar.getStoriesHashtag())) {
            u5b u5bVar2 = ejaVar.X1;
            if (u5bVar2 == null) {
                u5bVar2 = new p5b(currentAccount, TextUtils.isEmpty(ejaVar.getStoriesHashtagUsername()) ? null : ejaVar.getStoriesHashtagUsername(), ejaVar.getStoriesHashtag());
                ejaVar.X1 = u5bVar2;
            }
            u5bVar = u5bVar2;
            this.s = u5bVar;
        } else if (ejaVar.getStoriesArea() != null) {
            u5b u5bVar3 = ejaVar.X1;
            if (u5bVar3 == null) {
                u5bVar3 = new p5b(currentAccount, ejaVar.getStoriesArea());
                ejaVar.X1 = u5bVar3;
            }
            u5bVar = u5bVar3;
            this.s = u5bVar;
        } else if (z) {
            int i3 = 1;
            Object[] objArr = j <= 0 && (X1 = uc7.s1(currentAccount).X1(Long.valueOf(j))) != null && X1.bot;
            if (i <= 0) {
                u5bVar = eVar.getMessagesController().O1().z(0, i, ejaVar.m1, true);
                this.s = u5bVar;
            } else {
                c6b O1 = eVar.getMessagesController().O1();
                long j2 = ejaVar.m1;
                if (objArr == true) {
                    i3 = 4;
                } else if (!z) {
                    i2 = 0;
                    u5bVar = O1.z(i2, -1, j2, true);
                    this.s = u5bVar;
                }
                i2 = i3;
                u5bVar = O1.z(i2, -1, j2, true);
                this.s = u5bVar;
            }
        } else {
            int i32 = 1;
            if (j <= 0) {
            }
            if (i <= 0) {
            }
        }
        if (u5bVar != null) {
            this.w = u5bVar.o();
            this.x = new zia(this, eVar.getMessagesController().O1(), ejaVar.m1, this.s.c);
        }
        N();
    }

    @Override // yia, c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // yia, l69
    public final String F(int i) {
        r47 r47Var;
        TL_stories.StoryItem storyItem;
        u5b u5bVar = this.s;
        if (u5bVar == null || i < 0 || i >= u5bVar.i.size() || (r47Var = (r47) this.s.i.get(i)) == null || (storyItem = r47Var.l) == null) {
            return null;
        }
        return ob6.e0(storyItem.date, true);
    }

    @Override // yia, l69
    public final void I() {
        this.G.n1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i) {
        u5b u5bVar;
        if (this.h || (u5bVar = this.s) == null) {
            return false;
        }
        if (u5bVar instanceof o5b) {
            eja ejaVar = this.G;
            TLRPC.User X1 = uc7.s1(ejaVar.y1.getCurrentAccount()).X1(Long.valueOf(ejaVar.m1));
            return X1 != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit;
        }
        if (i < 0 || i >= u5bVar.i.size()) {
            return false;
        }
        r47 r47Var = (r47) this.s.i.get(i);
        u5b u5bVar2 = this.s;
        if (u5bVar2.f > 0) {
            return true;
        }
        return u5bVar2.m(r47Var.e1());
    }

    public final void N() {
        zha zhaVar;
        zha zhaVar2;
        zha zhaVar3;
        zha zhaVar4;
        u5b u5bVar = this.s;
        if (u5bVar == null || this.h) {
            return;
        }
        eja ejaVar = this.G;
        boolean z = ejaVar.o1;
        zha[] zhaVarArr = ejaVar.n0;
        int[] iArr = ejaVar.p1;
        if ((!z || (ejaVar.n1 && u5bVar.g() > 1)) && this.s.g() > 0 && !ejaVar.s0()) {
            if (this.s.g() < 5) {
                iArr[1] = this.s.g();
                if (zhaVarArr != null && (zhaVar3 = zhaVarArr[0]) != null && (zhaVar4 = zhaVarArr[1]) != null && zhaVar3.h != null && zhaVar4.h != null) {
                    ejaVar.z1(false);
                }
                ejaVar.n1 = iArr[1] == 1;
            } else if (ejaVar.n1) {
                ejaVar.n1 = false;
                iArr[1] = Math.max(2, xea.q1);
                if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (zhaVar2 = zhaVarArr[1]) != null && zhaVar.h != null && zhaVar2.h != null) {
                    ejaVar.z1(false);
                }
            }
            ejaVar.o1 = true;
        }
    }

    public final int O() {
        eja ejaVar = this.G;
        lha lhaVar = ejaVar.K;
        int[] iArr = ejaVar.p1;
        return this == lhaVar ? iArr[0] : ejaVar.x1(this) != -1 ? iArr[1] : ejaVar.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override // yia, j79
    public final int b() {
        if (this.s == null) {
            return 0;
        }
        return this.r.size() + ((this.s.l() && this.G.d0()) ? 0 : this.s.g());
    }

    @Override // yia, j79
    public final int d(int i) {
        return 19;
    }

    @Override // yia, j79
    public final int e() {
        return b();
    }

    @Override // j79
    public void f() {
        if (this.s != null) {
            eja ejaVar = this.G;
            if (ejaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = uc7.s1(this.s.c).O1().E(ejaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override // yia, j79
    public final void t(f89 f89Var, int i) {
        if (this.s == null || f89Var.f != 19) {
            return;
        }
        View view = f89Var.a;
        if (view instanceof jja) {
            jja jjaVar = (jja) view;
            jjaVar.e0 = true;
            ArrayList arrayList = this.r;
            if (i < 0 || i >= arrayList.size()) {
                int size = i - arrayList.size();
                if (size < 0 || size >= this.s.i.size()) {
                    jjaVar.g0 = false;
                    jjaVar.k(O(), null, false);
                    jjaVar.e0 = true;
                    return;
                }
                r47 r47Var = (r47) this.s.i.get(size);
                jjaVar.g0 = r47Var != null && this.s.m(r47Var.e1());
                eja ejaVar = this.G;
                jjaVar.setReorder(ejaVar.l0() || jjaVar.g0);
                jjaVar.h = ejaVar.q0();
                jjaVar.k(O(), r47Var, false);
                if (!ejaVar.F1 || r47Var == null) {
                    jjaVar.i(false, false);
                } else {
                    jjaVar.i(ejaVar.c1[(r47.B0(r47Var.k) > ejaVar.m1 ? 1 : (r47.B0(r47Var.k) == ejaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) >= 0, true);
                }
                jjaVar.l(this.y, false);
                return;
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
                aja ajaVar = new aja(this.s.c, tL_storyItem);
                b6bVar.L = ajaVar;
                ajaVar.m = b6bVar;
                r47Var2 = ajaVar;
            }
            jjaVar.k(O(), r47Var2, false);
            jjaVar.e0 = true;
            jjaVar.setReorder(false);
            jjaVar.i(false, false);
        }
    }

    @Override // yia, j79
    public final f89 x(ViewGroup viewGroup, int i) {
        f89 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof jja) {
            ((jja) view).e0 = true;
        }
        return x;
    }

    @Override // yia
    public final int L(int i) {
        return i;
    }

    public bja(eja ejaVar, Context context, boolean z) {
        this(ejaVar, context, 0, z);
    }
}
