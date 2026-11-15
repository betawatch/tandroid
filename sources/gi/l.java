package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.c6;
import fi.k6;
import fi.r6;
import hi.d7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vp0;
import v4.e1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class l extends aj0 {
    public final Context c;
    public k6 e;
    public l f;
    public o3 h;
    public boolean r;
    public final /* synthetic */ m s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public l(m mVar, Context context) {
        this.s = mVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        gj gjVar;
        TL_stories.StoryItem storyItem;
        k6 k6Var = this.e;
        if (k6Var == null || i7 < 0 || i7 >= k6Var.i.size() || (gjVar = (gj) this.e.i.get(i7)) == null || (storyItem = gjVar.l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f;
        m mVar = this.s;
        int i7 = this == lVar ? mVar.e : mVar.d;
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i7) {
        vp0 vp0Var = this.s.a0;
        k6 k6Var = this.e;
        if (k6Var == null) {
            return false;
        }
        if (k6Var instanceof c6) {
            TLRPC.User a22 = np.s1(vp0Var.b).a2(Long.valueOf(vp0Var.d));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= k6Var.i.size()) {
            return false;
        }
        return this.e.m(((gj) this.e.i.get(i7)).e1());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        m mVar = this.s;
        if ((!mVar.J || (mVar.I && b() > 1)) && b() > 0) {
            if (b() < 5) {
                int max = Math.max(1, b());
                mVar.d = max;
                mVar.I = max == 1;
            } else if (mVar.I || mVar.d == 1) {
                mVar.I = false;
                mVar.d = Math.max(2, gz.u1);
            }
            mVar.h.y1(mVar.d);
            mVar.J = true;
        }
    }

    @Override // v4.h0
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 19;
    }

    @Override // v4.h0
    public final int e() {
        return b();
    }

    @Override // v4.h0
    public void f() {
        k6 k6Var = this.e;
        boolean z10 = k6Var instanceof c6;
        m mVar = this.s;
        if (z10) {
            c6 c6Var = (c6) k6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = np.s1(this.e.c).P1().F(mVar.a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    r6 r6Var = (r6) F.get(i7);
                    d7 d7Var = r6Var.c;
                    if (d7Var != null && !d7Var.g && TextUtils.equals(d7Var.K0, c6Var.E)) {
                        arrayList.add(r6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.x) {
            M();
            mVar.c();
        }
    }

    @Override // v4.h0
    public final void t(e1 e1Var, int i7) {
        if (this.e == null) {
            return;
        }
        View view = e1Var.a;
        if (view instanceof n7) {
            n7 n7Var = (n7) view;
            n7Var.e0 = true;
            m mVar = this.s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i7);
                n7Var.g0 = false;
                if (r6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = r6Var.a;
                    int i10 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i10;
                    tL_storyItem.id = i10;
                    tL_storyItem.attachPath = r6Var.f;
                    k kVar = new k(this.e.c, tL_storyItem);
                    r6Var.L = kVar;
                    kVar.m = r6Var;
                }
                n7Var.k(r6Var.L, this == this.f ? mVar.e : mVar.d, false);
                n7Var.e0 = true;
                n7Var.setReorder(false);
                n7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                n7Var.g0 = false;
                n7Var.k(null, this == this.f ? mVar.e : mVar.d, false);
                n7Var.e0 = true;
                return;
            }
            gj gjVar = (gj) this.e.i.get(size);
            n7Var.g0 = gjVar != null && this.e.m(gjVar.e1());
            n7Var.setReorder(true);
            n7Var.k(gjVar, this == this.f ? mVar.e : mVar.d, false);
            vp0 vp0Var = mVar.a0;
            if (!vp0Var.H.F1 || gjVar == null) {
                n7Var.i(false, false);
            } else {
                n7Var.i(vp0Var.c(gjVar), true);
            }
        }
    }

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
        vp0 vp0Var = this.s.a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), vp0Var.c);
        }
        n7 n7Var = new n7(this.c, this.h, vp0Var.b);
        n7Var.x0 = true;
        n7Var.setGradientView(null);
        n7Var.e0 = true;
        return new cj0(n7Var);
    }

    @Override // org.telegram.ui.Components.aj0
    public final void I() {
    }
}
