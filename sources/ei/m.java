package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.k6;
import di.r6;
import di.y6;
import fi.e7;
import java.util.ArrayList;
import m.q3;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.xi0;
import v4.d1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class m extends vi0 {
    public final Context c;
    public r6 e;
    public m f;
    public q3 h;
    public boolean r;
    public final /* synthetic */ n s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public m(n nVar, Context context) {
        this.s = nVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        ij ijVar;
        TL_stories.StoryItem storyItem;
        r6 r6Var = this.e;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.i.size() || (ijVar = (ij) this.e.i.get(i7)) == null || (storyItem = ijVar.l) == null) {
            return null;
        }
        return id.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        m mVar = this.f;
        n nVar = this.s;
        int i7 = this == mVar ? nVar.e : nVar.d;
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop();
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
        sp0 sp0Var = this.s.W;
        r6 r6Var = this.e;
        if (r6Var == null) {
            return false;
        }
        if (r6Var instanceof k6) {
            TLRPC.User a22 = qp.s1(sp0Var.b).a2(Long.valueOf(sp0Var.d));
            return a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit;
        }
        if (i7 < 0 || i7 >= r6Var.i.size()) {
            return false;
        }
        return this.e.m(((ij) this.e.i.get(i7)).e1());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        n nVar = this.s;
        if ((!nVar.I || (nVar.H && b() > 1)) && b() > 0) {
            if (b() < 5) {
                int max = Math.max(1, b());
                nVar.d = max;
                nVar.H = max == 1;
            } else if (nVar.H || nVar.d == 1) {
                nVar.H = false;
                nVar.d = Math.max(2, iz.u1);
            }
            nVar.h.y1(nVar.d);
            nVar.I = true;
        }
    }

    @Override // v4.g0
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 19;
    }

    @Override // v4.g0
    public final int e() {
        return b();
    }

    @Override // v4.g0
    public void f() {
        r6 r6Var = this.e;
        boolean z9 = r6Var instanceof k6;
        n nVar = this.s;
        if (z9) {
            k6 k6Var = (k6) r6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = qp.s1(this.e.c).P1().F(nVar.W.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    y6 y6Var = (y6) F.get(i7);
                    e7 e7Var = y6Var.c;
                    if (e7Var != null && !e7Var.g && TextUtils.equals(e7Var.K0, k6Var.E)) {
                        arrayList.add(y6Var);
                    }
                }
            }
        }
        super.f();
        m mVar = this.f;
        if (mVar != null) {
            mVar.f();
        }
        if (this != nVar.x) {
            M();
            nVar.c();
        }
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        if (this.e == null) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof o7) {
            o7 o7Var = (o7) view;
            o7Var.d0 = true;
            n nVar = this.s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                y6 y6Var = (y6) arrayList.get(i7);
                o7Var.f0 = false;
                if (y6Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = y6Var.a;
                    int i10 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i10;
                    tL_storyItem.id = i10;
                    tL_storyItem.attachPath = y6Var.f;
                    l lVar = new l(this.e.c, tL_storyItem);
                    y6Var.K = lVar;
                    lVar.m = y6Var;
                }
                o7Var.k(y6Var.K, this == this.f ? nVar.e : nVar.d, false);
                o7Var.d0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                o7Var.f0 = false;
                o7Var.k(null, this == this.f ? nVar.e : nVar.d, false);
                o7Var.d0 = true;
                return;
            }
            ij ijVar = (ij) this.e.i.get(size);
            o7Var.f0 = ijVar != null && this.e.m(ijVar.e1());
            o7Var.setReorder(true);
            o7Var.k(ijVar, this == this.f ? nVar.e : nVar.d, false);
            sp0 sp0Var = nVar.W;
            if (!sp0Var.G.E1 || ijVar == null) {
                o7Var.i(false, false);
            } else {
                o7Var.i(sp0Var.c(ijVar), true);
            }
        }
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        sp0 sp0Var = this.s.W;
        if (this.h == null) {
            this.h = new q3(viewGroup.getContext(), sp0Var.c);
        }
        o7 o7Var = new o7(this.c, this.h, sp0Var.b);
        o7Var.w0 = true;
        o7Var.setGradientView(null);
        o7Var.d0 = true;
        return new xi0(o7Var);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void I() {
    }
}
