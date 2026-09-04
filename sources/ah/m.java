package ah;

import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.a7;
import bi.o5;
import bi.pb;
import bi.s6;
import bi.t2;
import bi.x6;
import bi.z9;
import di.fb;
import di.g8;
import di.p4;
import di.t4;
import di.u4;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                b0Var.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!b0Var.E.keySet().equals(b0Var.G.keySet())) {
                    b0Var.Y(false);
                    break;
                }
                break;
            case 1:
                o5 o5Var = (o5) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    o5Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(o5Var.C2).getBoostsController().userCanBoostChannel(o5Var.B1, tL_premium_boostsStatus, new t2(0, o5Var, tL_premium_boostsStatus));
                    break;
                } else {
                    pb pbVar = o5Var.J0;
                    if (pbVar != null) {
                        pbVar.k1 = false;
                        pbVar.P();
                        break;
                    }
                }
                break;
            case 2:
                s6 s6Var = (s6) obj;
                a7 a7Var = ((x6) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = a7Var.G;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        if (s6Var != arrayList.get(i10)) {
                            ((s6) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 3:
                z9 z9Var = (z9) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                z9Var.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    z9Var.m = true;
                    z9Var.l = str;
                    z9Var.f = TextUtils.isEmpty(str);
                    View view = z9Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = z9Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                u4 u4Var = (u4) this.b;
                View view2 = (View) obj;
                p4 p4Var = u4Var.b;
                if (view2 instanceof t4) {
                    p4Var.getClass();
                    int R = RecyclerView.R(view2);
                    h51 G = p4Var.Y2.G(R);
                    if (G != null) {
                        t4 t4Var = (t4) view2;
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
            case 5:
                p4 p4Var2 = (p4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof t4) {
                    fb fbVar = p4Var2.f3;
                    fbVar.b.getClass();
                    ((t4) view3).setPosition(fbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 6:
                g8.P((g8) this.b, (Long) obj);
                break;
            case 7:
                ((m4.j1) obj).f((b2.v0) this.b);
                break;
            case 8:
                ((m4.j1) obj).n((Surface) this.b);
                break;
            case 9:
                ((m4.j1) obj).C((b2.n0) this.b);
                break;
            case 10:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.b, qb.b.t2(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    break;
                }
                break;
            default:
                ((e9.f0) this.b).b((z3.a) obj);
                break;
        }
    }
}
