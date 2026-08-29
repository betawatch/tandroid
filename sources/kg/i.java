package kg;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lh.c5;
import lh.d4;
import lh.i5;
import lh.i9;
import lh.l5;
import lh.v7;
import lh.y1;
import nh.b4;
import nh.f4;
import nh.g4;
import nh.g7;
import nh.y9;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.M = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.A.keySet().equals(sVar.C.keySet())) {
                    sVar.Y(false);
                    break;
                }
                break;
            case 1:
                d4 d4Var = (d4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    d4Var.F3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(d4Var.y2).getBoostsController().userCanBoostChannel(d4Var.x1, tL_premium_boostsStatus, new y1(0, d4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    i9 i9Var = d4Var.F0;
                    if (i9Var != null) {
                        i9Var.g1 = false;
                        i9Var.P();
                        break;
                    }
                }
                break;
            case 2:
                c5 c5Var = (c5) obj;
                l5 l5Var = ((i5) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = l5Var.C;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        if (c5Var != arrayList.get(i10)) {
                            ((c5) arrayList.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 3:
                v7 v7Var = (v7) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v7Var.p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    v7Var.m = true;
                    v7Var.l = str;
                    v7Var.f = TextUtils.isEmpty(str);
                    View view = v7Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = v7Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                g4 g4Var = (g4) this.b;
                View view2 = (View) obj;
                b4 b4Var = g4Var.b;
                if (view2 instanceof f4) {
                    b4Var.getClass();
                    int R = RecyclerView.R(view2);
                    w41 G = b4Var.U2.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view2;
                        f4Var.setPosition(g4Var.b(R));
                        f4Var.b(g4Var.f == G.d, true);
                        boolean contains = g4Var.e.contains(Integer.valueOf(G.d));
                        if (f4Var.f != contains) {
                            f4Var.f = contains;
                            f4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 5:
                b4 b4Var2 = (b4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof f4) {
                    y9 y9Var = b4Var2.b3;
                    y9Var.b.getClass();
                    ((f4) view3).setPosition(y9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            default:
                g7.T((g7) this.b, (Long) obj);
                break;
        }
    }
}
