package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.k8;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = frameLayout;
        this.b = z10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.b;
        FrameLayout frameLayout = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                m60 m60Var = (m60) obj;
                wp0 wp0Var = ((c4) frameLayout).a;
                if (z10) {
                    wp0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    cc.a0(wp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750037, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    k8 k8Var = wp0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    k8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k8Var.a(i11, arrayList);
                    cc.a0(wp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                m60Var.u();
                wp0Var.o();
                break;
            default:
                da0 da0Var = (da0) frameLayout;
                Context context = (Context) obj3;
                ia0 ia0Var = (ia0) obj2;
                ia0 ia0Var2 = (ia0) obj;
                ja0 ja0Var = da0Var.d0;
                kj kjVar = ja0Var.d;
                if (!z10) {
                    new cc(ja0Var, ja0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(hd.M0(2131750583, null), new t90(da0Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = kjVar.k;
                    kjVar.k = !z11;
                    ja0Var.y = false;
                    if (z11) {
                        kjVar.l = false;
                        if (ia0Var != null) {
                            ia0Var.a(false, true);
                        }
                    }
                    ia0Var2.a(kjVar.k, true);
                    da0Var.i();
                    da0Var.l(true);
                    break;
                }
        }
    }
}
