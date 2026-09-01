package ng;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import oh.a2;
import oh.e5;
import oh.f4;
import oh.i9;
import oh.k5;
import oh.n5;
import oh.v7;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j51;
import qh.k6;
import qh.m3;
import qh.q3;
import qh.r3;
import qh.u8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.N = (TL_stories.TL_premium_boostsStatus) obj;
                if (!sVar.B.keySet().equals(sVar.D.keySet())) {
                    sVar.Y(false);
                    break;
                }
                break;
            case 1:
                f4 f4Var = (f4) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    f4Var.G3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(f4Var.z2).getBoostsController().userCanBoostChannel(f4Var.y1, tL_premium_boostsStatus, new a2(0, f4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    i9 i9Var = f4Var.G0;
                    if (i9Var != null) {
                        i9Var.h1 = false;
                        i9Var.P();
                        break;
                    }
                }
                break;
            case 2:
                e5 e5Var = (e5) obj;
                n5 n5Var = ((k5) this.b).e;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = n5Var.D;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        if (e5Var != arrayList.get(i10)) {
                            ((e5) arrayList.get(i10)).getClass();
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
                r3 r3Var = (r3) this.b;
                View view2 = (View) obj;
                m3 m3Var = r3Var.b;
                if (view2 instanceof q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view2);
                    j51 G = m3Var.V2.G(R);
                    if (G != null) {
                        q3 q3Var = (q3) view2;
                        q3Var.setPosition(r3Var.b(R));
                        q3Var.b(r3Var.f == G.d, true);
                        boolean contains = r3Var.e.contains(Integer.valueOf(G.d));
                        if (q3Var.f != contains) {
                            q3Var.f = contains;
                            q3Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 5:
                m3 m3Var2 = (m3) this.b;
                View view3 = (View) obj;
                if (view3 instanceof q3) {
                    u8 u8Var = m3Var2.c3;
                    u8Var.b.getClass();
                    ((q3) view3).setPosition(u8Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            default:
                k6.T((k6) this.b, (Long) obj);
                break;
        }
    }
}
