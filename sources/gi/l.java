package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.h6;
import fi.o6;
import fi.z5;
import hi.d7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.kj0;
import v4.f1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class l extends ij0 {
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

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        fj fjVar;
        TL_stories.StoryItem storyItem;
        h6 h6Var = this.e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.i.size() || (fjVar = (fj) this.e.i.get(i7)) == null || (storyItem = fjVar.l) == null) {
            return null;
        }
        return gd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f;
        m mVar = this.s;
        int i7 = this == lVar ? mVar.e : mVar.d;
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop();
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
        dq0 dq0Var = this.s.a0;
        h6 h6Var = this.e;
        if (h6Var == null) {
            return false;
        }
        if (h6Var instanceof z5) {
            TLRPC.User c22 = mp.u1(dq0Var.b).c2(Long.valueOf(dq0Var.d));
            return c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= h6Var.i.size()) {
            return false;
        }
        return this.e.m(((fj) this.e.i.get(i7)).e1());
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
                mVar.d = Math.max(2, bz.u1);
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
        boolean z10 = h6Var instanceof z5;
        m mVar = this.s;
        if (z10) {
            z5 z5Var = (z5) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = mp.u1(this.e.c).R1().F(mVar.a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    d7 d7Var = o6Var.c;
                    if (d7Var != null && !d7Var.g && TextUtils.equals(d7Var.K0, z5Var.E)) {
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
        if (view instanceof o7) {
            o7 o7Var = (o7) view;
            o7Var.e0 = true;
            m mVar = this.s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                o7Var.g0 = false;
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
                o7Var.k(o6Var.L, this == this.f ? mVar.e : mVar.d, false);
                o7Var.e0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                o7Var.g0 = false;
                o7Var.k(null, this == this.f ? mVar.e : mVar.d, false);
                o7Var.e0 = true;
                return;
            }
            fj fjVar = (fj) this.e.i.get(size);
            o7Var.g0 = fjVar != null && this.e.m(fjVar.e1());
            o7Var.setReorder(true);
            o7Var.k(fjVar, this == this.f ? mVar.e : mVar.d, false);
            dq0 dq0Var = mVar.a0;
            if (!dq0Var.H.F1 || fjVar == null) {
                o7Var.i(false, false);
            } else {
                o7Var.i(dq0Var.c(fjVar), true);
            }
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        dq0 dq0Var = this.s.a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), dq0Var.c);
        }
        o7 o7Var = new o7(this.c, this.h, dq0Var.b);
        o7Var.x0 = true;
        o7Var.setGradientView(null);
        o7Var.e0 = true;
        return new kj0(o7Var);
    }

    @Override // org.telegram.ui.Components.ij0
    public final void I() {
    }
}
