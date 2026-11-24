// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class fs0 extends z49 {
    public final Context c;
    public t3b e;
    public fs0 f;
    public jd4 h;
    public boolean r;
    public final /* synthetic */ gs0 s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public fs0(gs0 gs0Var, Context context) {
        this.s = gs0Var;
        this.c = context;
        M();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // z49
    public final String F(int i) {
        k47 k47Var;
        TL_stories.StoryItem storyItem;
        t3b t3bVar = this.e;
        if (t3bVar == null || i < 0 || i >= t3bVar.i.size() || (k47Var = (k47) this.e.i.get(i)) == null || (storyItem = k47Var.l) == null) {
            return null;
        }
        return jb6.e0(storyItem.date, true);
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        fs0 fs0Var = this.f;
        gs0 gs0Var = this.s;
        int i = this == fs0Var ? gs0Var.e : gs0Var.d;
        int ceil = (int) (Math.ceil(b() / i) * measuredHeight);
        int measuredHeight2 = r59Var.getMeasuredHeight() - r59Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f2 = f * (ceil - measuredHeight2);
            iArr[0] = ((int) (f2 / measuredHeight)) * i;
            iArr[1] = ((int) f2) % measuredHeight;
        }
    }

    public final boolean L(int i) {
        TLRPC.User W1;
        kea keaVar = this.s.a0;
        return this.e != null && (W1 = oc7.r1(keaVar.b).W1(Long.valueOf(keaVar.d))) != null && W1.bot && W1.bot_has_main_app && W1.bot_can_edit;
    }

    public final void M() {
        int max;
        if (this.e != null) {
            gs0 gs0Var = this.s;
            if ((!gs0Var.J || (gs0Var.I && b() > 1)) && b() > 0) {
                if (b() < 5) {
                    max = Math.max(1, b());
                    gs0Var.d = max;
                    gs0Var.I = max == 1;
                } else if (gs0Var.I || (max = gs0Var.d) == 1) {
                    gs0Var.I = false;
                    max = Math.max(2, gda.q1);
                    gs0Var.d = max;
                }
                gs0Var.h.x1(max);
                gs0Var.J = true;
            }
        }
    }

    @Override // y59
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.i.size() + this.d.size();
    }

    @Override // y59
    public final int d(int i) {
        return 19;
    }

    @Override // y59
    public final int e() {
        return b();
    }

    @Override // y59
    public void f() {
        t3b t3bVar = this.e;
        boolean A = wi8.A(t3bVar);
        gs0 gs0Var = this.s;
        if (A) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = oc7.r1(this.e.c).N1().E(gs0Var.a0.d);
            if (E != null) {
                for (int i = 0; i < E.size(); i++) {
                    g4b g4bVar = (g4b) E.get(i);
                    g6b g6bVar = g4bVar.c;
                    if (g6bVar != null && !g6bVar.g && TextUtils.equals(g6bVar.K0, t3bVar.E)) {
                        arrayList.add(g4bVar);
                    }
                }
            }
        }
        super.f();
        fs0 fs0Var = this.f;
        if (fs0Var != null) {
            fs0Var.f();
        }
        if (this != gs0Var.x) {
            M();
            gs0Var.c();
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (this.e != null) {
            View view = u69Var.a;
            if (view instanceof sha) {
                sha shaVar = (sha) view;
                shaVar.e0 = true;
                gs0 gs0Var = this.s;
                ArrayList arrayList = this.d;
                if (i < 0 || i >= arrayList.size()) {
                    int size = i - arrayList.size();
                    if (size < 0 || size >= this.e.i.size()) {
                        shaVar.g0 = false;
                        shaVar.k(null, this == this.f ? gs0Var.e : gs0Var.d, false);
                        shaVar.e0 = true;
                        return;
                    }
                    k47 k47Var = (k47) this.e.i.get(size);
                    shaVar.g0 = k47Var != null && this.e.m(k47Var.e1());
                    shaVar.setReorder(true);
                    shaVar.k(k47Var, this == this.f ? gs0Var.e : gs0Var.d, false);
                    kea keaVar = gs0Var.a0;
                    if (!keaVar.H.F1 || k47Var == null) {
                        shaVar.i(false, false);
                        return;
                    } else {
                        shaVar.i(keaVar.c(k47Var), true);
                        return;
                    }
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
                    es0 es0Var = new es0(this.e.c, tL_storyItem);
                    g4bVar.L = es0Var;
                    es0Var.m = g4bVar;
                    k47Var2 = es0Var;
                }
                shaVar.k(k47Var2, this == this.f ? gs0Var.e : gs0Var.d, false);
                shaVar.e0 = true;
                shaVar.setReorder(false);
                shaVar.i(false, false);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        kea keaVar = this.s.a0;
        if (this.h == null) {
            this.h = new jd4(viewGroup.getContext(), keaVar.c);
        }
        sha shaVar = new sha(this.c, this.h, keaVar.b);
        shaVar.x0 = true;
        shaVar.setGradientView(null);
        shaVar.e0 = true;
        return new b59(shaVar);
    }

    @Override // z49
    public final void I() {
    }
}
