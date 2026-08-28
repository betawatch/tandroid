package hg;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ih.a2;
import ih.g5;
import ih.i4;
import ih.l5;
import ih.m9;
import ih.o5;
import ih.z7;
import java.util.ArrayList;
import kh.h4;
import kh.l4;
import kh.m4;
import kh.na;
import kh.s7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.M = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.A.keySet().equals(sVar.C.keySet())) {
                    sVar.X(false);
                    break;
                }
                break;
            case 1:
                i4 i4Var = (i4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    i4Var.F3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(i4Var.y2).getBoostsController().userCanBoostChannel(i4Var.x1, tL_premium_boostsStatus, new a2(0, i4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    m9 m9Var = i4Var.F0;
                    if (m9Var != null) {
                        m9Var.g1 = false;
                        m9Var.P();
                        break;
                    }
                }
                break;
            case 2:
                g5 g5Var = (g5) obj;
                o5 o5Var = ((l5) this.b).e;
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = o5Var.C;
                    if (i9 >= arrayList.size()) {
                        break;
                    } else {
                        if (g5Var != arrayList.get(i9)) {
                            ((g5) arrayList.get(i9)).getClass();
                        }
                        i9++;
                    }
                }
            case 3:
                z7 z7Var = (z7) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                z7Var.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    z7Var.m = true;
                    z7Var.l = str;
                    z7Var.f = TextUtils.isEmpty(str);
                    View view = z7Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = z7Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                m4 m4Var = (m4) this.b;
                View view2 = (View) obj;
                h4 h4Var = m4Var.b;
                if (view2 instanceof l4) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view2);
                    l41 G = h4Var.U2.G(R);
                    if (G != null) {
                        l4 l4Var = (l4) view2;
                        l4Var.setPosition(m4Var.b(R));
                        l4Var.b(m4Var.f == G.d, true);
                        boolean contains = m4Var.e.contains(Integer.valueOf(G.d));
                        if (l4Var.f != contains) {
                            l4Var.f = contains;
                            l4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 5:
                h4 h4Var2 = (h4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof l4) {
                    na naVar = h4Var2.b3;
                    naVar.b.getClass();
                    ((l4) view3).setPosition(naVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            default:
                s7.S((s7) this.b, (Long) obj);
                break;
        }
    }
}
