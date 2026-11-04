package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.s8;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = frameLayout;
        this.b = z10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.b;
        FrameLayout frameLayout = this.c;
        int i10 = 0;
        switch (i3) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                f60 f60Var = (f60) obj;
                vp0 vp0Var = ((o4) frameLayout).a;
                if (z10) {
                    vp0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    fc.a0(vp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750045, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    s8 s8Var = vp0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    s8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    s8Var.a(i11, arrayList);
                    fc.a0(vp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                f60Var.u();
                vp0Var.o();
                break;
            default:
                x90 x90Var = (x90) frameLayout;
                Context context = (Context) obj3;
                ca0 ca0Var = (ca0) obj2;
                ca0 ca0Var2 = (ca0) obj;
                da0 da0Var = x90Var.d0;
                dj djVar = da0Var.d;
                if (!z10) {
                    new fc(da0Var, da0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(bd.M0(2131750584, null), new n90(x90Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = djVar.k;
                    djVar.k = !z11;
                    da0Var.y = false;
                    if (z11) {
                        djVar.l = false;
                        if (ca0Var != null) {
                            ca0Var.a(false, true);
                        }
                    }
                    ca0Var2.a(djVar.k, true);
                    x90Var.i();
                    x90Var.l(true);
                    break;
                }
        }
    }
}
