package ig;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import jh.c5;
import jh.e4;
import jh.h5;
import jh.i9;
import jh.k5;
import jh.v7;
import jh.y1;
import lh.f4;
import lh.j4;
import lh.k4;
import lh.ka;
import lh.r7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
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
                    sVar.Y(false);
                    break;
                }
                break;
            case 1:
                e4 e4Var = (e4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    e4Var.F3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(e4Var.y2).getBoostsController().userCanBoostChannel(e4Var.x1, tL_premium_boostsStatus, new y1(0, e4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    i9 i9Var = e4Var.F0;
                    if (i9Var != null) {
                        i9Var.g1 = false;
                        i9Var.P();
                        break;
                    }
                }
                break;
            case 2:
                c5 c5Var = (c5) obj;
                k5 k5Var = ((h5) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = k5Var.C;
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
                k4 k4Var = (k4) this.b;
                View view2 = (View) obj;
                f4 f4Var = k4Var.b;
                if (view2 instanceof j4) {
                    f4Var.getClass();
                    int R = RecyclerView.R(view2);
                    n41 G = f4Var.U2.G(R);
                    if (G != null) {
                        j4 j4Var = (j4) view2;
                        j4Var.setPosition(k4Var.b(R));
                        j4Var.b(k4Var.f == G.d, true);
                        boolean contains = k4Var.e.contains(Integer.valueOf(G.d));
                        if (j4Var.f != contains) {
                            j4Var.f = contains;
                            j4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 5:
                f4 f4Var2 = (f4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof j4) {
                    ka kaVar = f4Var2.b3;
                    kaVar.b.getClass();
                    ((j4) view3).setPosition(kaVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            default:
                r7.T((r7) this.b, (Long) obj);
                break;
        }
    }
}
