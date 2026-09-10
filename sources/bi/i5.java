package bi;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                p5 p5Var = (p5) this.b;
                View view = (View) obj;
                k5 k5Var = p5Var.b;
                if (view instanceof o5) {
                    k5Var.getClass();
                    int R = RecyclerView.R(view);
                    v51 G = k5Var.Y2.G(R);
                    if (G != null) {
                        o5 o5Var = (o5) view;
                        o5Var.setPosition(p5Var.b(R));
                        o5Var.b(p5Var.f == G.d, true);
                        boolean contains = p5Var.e.contains(Integer.valueOf(G.d));
                        if (o5Var.f != contains) {
                            o5Var.f = contains;
                            o5Var.invalidate();
                        }
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            case 1:
                k5 k5Var2 = (k5) this.b;
                View view2 = (View) obj;
                if (view2 instanceof o5) {
                    oc ocVar = k5Var2.f3;
                    ocVar.b.getClass();
                    ((o5) view2).setPosition(ocVar.b(RecyclerView.R(view2)));
                    view2.setPressed(false);
                    break;
                }
                break;
            case 2:
                i9.P((i9) this.b, (Long) obj);
                break;
            case 3:
                ((m4.l1) obj).f((b2.v0) this.b);
                break;
            case 4:
                ((m4.l1) obj).n((Surface) this.b);
                break;
            case 5:
                ((m4.l1) obj).C((b2.n0) this.b);
                break;
            case 6:
                yg.s sVar = (yg.s) this.b;
                sVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.E.keySet().equals(sVar.G.keySet())) {
                    sVar.Y(false);
                    break;
                }
                break;
            case 7:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, qb.b.D3(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    break;
                }
                break;
            case 8:
                ((e9.f0) this.b).b((z3.a) obj);
                break;
            case 9:
                zh.a3 a3Var = (zh.a3) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    a3Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(a3Var.C2).getBoostsController().userCanBoostChannel(a3Var.B1, tL_premium_boostsStatus, new m4.q0(11, a3Var, tL_premium_boostsStatus));
                    break;
                } else {
                    zh.u7 u7Var = a3Var.J0;
                    if (u7Var != null) {
                        u7Var.k1 = false;
                        u7Var.P();
                        break;
                    }
                }
                break;
            case 10:
                zh.z3 z3Var = (zh.z3) obj;
                zh.g4 g4Var = ((zh.d4) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = g4Var.G;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        if (z3Var != arrayList.get(i10)) {
                            ((zh.z3) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            default:
                zh.j6 j6Var = (zh.j6) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                j6Var.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    j6Var.m = true;
                    j6Var.l = str;
                    j6Var.f = TextUtils.isEmpty(str);
                    View view3 = j6Var.r;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    Runnable runnable = j6Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
