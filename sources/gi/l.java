package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.a6;
import fi.h6;
import fi.o6;
import hi.c7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mj0;
import v4.f1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class l extends kj0 {
    public final Context c;
    public h6 e;
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

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        gj gjVar;
        TL_stories.StoryItem storyItem;
        h6 h6Var = this.e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.i.size() || (gjVar = (gj) this.e.i.get(i7)) == null || (storyItem = gjVar.l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f;
        m mVar = this.s;
        int i7 = this == lVar ? mVar.e : mVar.d;
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop();
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
        fq0 fq0Var = this.s.a0;
        h6 h6Var = this.e;
        if (h6Var == null) {
            return false;
        }
        if (h6Var instanceof a6) {
            TLRPC.User c22 = np.u1(fq0Var.b).c2(Long.valueOf(fq0Var.d));
            return c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= h6Var.i.size()) {
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
                mVar.d = Math.max(2, cz.u1);
            }
            mVar.h.y1(mVar.d);
            mVar.J = true;
        }
    }

    @Override // v4.i0
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 19;
    }

    @Override // v4.i0
    public final int e() {
        return b();
    }

    @Override // v4.i0
    public void f() {
        h6 h6Var = this.e;
        boolean z10 = h6Var instanceof a6;
        m mVar = this.s;
        if (z10) {
            a6 a6Var = (a6) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = np.u1(this.e.c).R1().F(mVar.a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    c7 c7Var = o6Var.c;
                    if (c7Var != null && !c7Var.g && TextUtils.equals(c7Var.K0, a6Var.E)) {
                        arrayList.add(o6Var);
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

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        if (this.e == null) {
            return;
        }
        View view = f1Var.a;
        if (view instanceof p7) {
            p7 p7Var = (p7) view;
            p7Var.e0 = true;
            m mVar = this.s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                p7Var.g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.a;
                    int i10 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i10;
                    tL_storyItem.id = i10;
                    tL_storyItem.attachPath = o6Var.f;
                    k kVar = new k(this.e.c, tL_storyItem);
                    o6Var.L = kVar;
                    kVar.m = o6Var;
                }
                p7Var.k(o6Var.L, this == this.f ? mVar.e : mVar.d, false);
                p7Var.e0 = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                p7Var.g0 = false;
                p7Var.k(null, this == this.f ? mVar.e : mVar.d, false);
                p7Var.e0 = true;
                return;
            }
            gj gjVar = (gj) this.e.i.get(size);
            p7Var.g0 = gjVar != null && this.e.m(gjVar.e1());
            p7Var.setReorder(true);
            p7Var.k(gjVar, this == this.f ? mVar.e : mVar.d, false);
            fq0 fq0Var = mVar.a0;
            if (!fq0Var.H.F1 || gjVar == null) {
                p7Var.i(false, false);
            } else {
                p7Var.i(fq0Var.c(gjVar), true);
            }
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        fq0 fq0Var = this.s.a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), fq0Var.c);
        }
        p7 p7Var = new p7(this.c, this.h, fq0Var.b);
        p7Var.x0 = true;
        p7Var.setGradientView(null);
        p7Var.e0 = true;
        return new mj0(p7Var);
    }

    @Override // org.telegram.ui.Components.kj0
    public final void I() {
    }
}
