package ai;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    f6Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(f6Var.C2).getBoostsController().userCanBoostChannel(f6Var.B1, tL_premium_boostsStatus, new g3(0, f6Var, tL_premium_boostsStatus));
                    break;
                } else {
                    jc jcVar = f6Var.J0;
                    if (jcVar != null) {
                        jcVar.k1 = false;
                        jcVar.P();
                        break;
                    }
                }
                break;
            case 1:
                j7 j7Var = (j7) obj;
                r7 r7Var = ((o7) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = r7Var.G;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        if (j7Var != arrayList.get(i10)) {
                            ((j7) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 2:
                sa saVar = (sa) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.m = true;
                    saVar.l = str;
                    saVar.f = TextUtils.isEmpty(str);
                    View view = saVar.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 3:
                ci.u4 u4Var = (ci.u4) this.b;
                View view2 = (View) obj;
                ci.p4 p4Var = u4Var.b;
                if (view2 instanceof ci.t4) {
                    p4Var.getClass();
                    int R = RecyclerView.R(view2);
                    i51 G = p4Var.Y2.G(R);
                    if (G != null) {
                        ci.t4 t4Var = (ci.t4) view2;
                        t4Var.setPosition(u4Var.b(R));
                        t4Var.b(u4Var.f == G.d, true);
                        boolean contains = u4Var.e.contains(Integer.valueOf(G.d));
                        if (t4Var.f != contains) {
                            t4Var.f = contains;
                            t4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 4:
                ci.p4 p4Var2 = (ci.p4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof ci.t4) {
                    ci.fb fbVar = p4Var2.f3;
                    fbVar.b.getClass();
                    ((ci.t4) view3).setPosition(fbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 5:
                ci.g8.P((ci.g8) this.b, (Long) obj);
                break;
            case 6:
                ((m4.k1) obj).f((b2.v0) this.b);
                break;
            case 7:
                ((m4.k1) obj).n((Surface) this.b);
                break;
            case 8:
                ((m4.k1) obj).C((b2.n0) this.b);
                break;
            case 9:
                z3.i iVar = (z3.i) this.b;
                z3.b bVar = (z3.b) obj;
                z3.h hVar = new z3.h(bVar.b, ob.a.C2(bVar.a, bVar.c));
                iVar.c.add(hVar);
                long j3 = iVar.j;
                if (j3 == -9223372036854775807L || bVar.d >= j3) {
                    iVar.b(hVar);
                    break;
                }
                break;
            case 10:
                ((e9.f0) this.b).b((z3.b) obj);
                break;
            default:
                zg.q qVar = (zg.q) this.b;
                qVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!qVar.E.keySet().equals(qVar.G.keySet())) {
                    qVar.Y(false);
                    break;
                }
                break;
        }
    }
}
