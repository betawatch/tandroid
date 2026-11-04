package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ei.k6;
import ei.r6;
import ei.y6;
import gi.f7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zi0;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l extends zi0 {
    public final Context c;
    public r6 e;
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

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        zi ziVar;
        TL_stories.StoryItem storyItem;
        r6 r6Var = this.e;
        if (r6Var == null || i3 < 0 || i3 >= r6Var.i.size() || (ziVar = (zi) this.e.i.get(i3)) == null || (storyItem = ziVar.l) == null) {
            return null;
        }
        return bd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f;
        m mVar = this.s;
        int i3 = this == lVar ? mVar.e : mVar.d;
        int ceil = (int) (Math.ceil(b() / i3) * measuredHeight);
        int measuredHeight2 = tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i3;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    public final boolean L(int i3) {
        tp0 tp0Var = this.s.a0;
        r6 r6Var = this.e;
        if (r6Var == null) {
            return false;
        }
        if (r6Var instanceof k6) {
            TLRPC.User a22 = hp.s1(tp0Var.b).a2(Long.valueOf(tp0Var.d));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i3 < 0 || i3 >= r6Var.i.size()) {
            return false;
        }
        return this.e.m(((zi) this.e.i.get(i3)).f1());
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
                mVar.d = Math.max(2, az.u1);
            }
            mVar.h.y1(mVar.d);
            mVar.J = true;
        }
    }

    @Override // u4.h0
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 19;
    }

    @Override // u4.h0
    public final int e() {
        return b();
    }

    @Override // u4.h0
    public void f() {
        r6 r6Var = this.e;
        boolean z10 = r6Var instanceof k6;
        m mVar = this.s;
        if (z10) {
            k6 k6Var = (k6) r6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = hp.s1(this.e.c).P1().F(mVar.a0.d);
            if (F != null) {
                for (int i3 = 0; i3 < F.size(); i3++) {
                    y6 y6Var = (y6) F.get(i3);
                    f7 f7Var = y6Var.c;
                    if (f7Var != null && !f7Var.g && TextUtils.equals(f7Var.K0, k6Var.E)) {
                        arrayList.add(y6Var);
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

    @Override // u4.h0
    public final void t(d1 d1Var, int i3) {
        if (this.e == null) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof n7) {
            n7 n7Var = (n7) view;
            n7Var.e0 = true;
            m mVar = this.s;
            ArrayList arrayList = this.d;
            if (i3 >= 0 && i3 < arrayList.size()) {
                y6 y6Var = (y6) arrayList.get(i3);
                n7Var.g0 = false;
                if (y6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = y6Var.a;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i10;
                    tL_storyItem.id = i10;
                    tL_storyItem.attachPath = y6Var.f;
                    k kVar = new k(this.e.c, tL_storyItem);
                    y6Var.L = kVar;
                    kVar.m = y6Var;
                }
                n7Var.k(y6Var.L, this == this.f ? mVar.e : mVar.d, false);
                n7Var.e0 = true;
                n7Var.setReorder(false);
                n7Var.i(false, false);
                return;
            }
            int size = i3 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                n7Var.g0 = false;
                n7Var.k(null, this == this.f ? mVar.e : mVar.d, false);
                n7Var.e0 = true;
                return;
            }
            zi ziVar = (zi) this.e.i.get(size);
            n7Var.g0 = ziVar != null && this.e.m(ziVar.f1());
            n7Var.setReorder(true);
            n7Var.k(ziVar, this == this.f ? mVar.e : mVar.d, false);
            tp0 tp0Var = mVar.a0;
            if (!tp0Var.H.F1 || ziVar == null) {
                n7Var.i(false, false);
            } else {
                n7Var.i(tp0Var.c(ziVar), true);
            }
        }
    }

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        tp0 tp0Var = this.s.a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), tp0Var.c);
        }
        n7 n7Var = new n7(this.c, this.h, tp0Var.b);
        n7Var.x0 = true;
        n7Var.setGradientView(null);
        n7Var.e0 = true;
        return new bj0(n7Var);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void I() {
    }
}
