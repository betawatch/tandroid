package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
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
                x60 x60Var = (x60) obj;
                fq0 fq0Var = ((p6) frameLayout).a;
                if (z10) {
                    fq0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    kc.b0(fq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750020, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    di.n8 n8Var = fq0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    n8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    n8Var.a(i11, arrayList);
                    kc.b0(fq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                x60Var.v();
                fq0Var.o();
                break;
            default:
                na0 na0Var = (na0) frameLayout;
                Context context = (Context) obj3;
                sa0 sa0Var = (sa0) obj2;
                sa0 sa0Var2 = (sa0) obj;
                ta0 ta0Var = na0Var.d0;
                jj jjVar = ta0Var.d;
                if (!z10) {
                    new kc(ta0Var, ta0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.T2(gd.N0(2131750566, null), new da0(na0Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = jjVar.k;
                    jjVar.k = !z11;
                    ta0Var.y = false;
                    if (z11) {
                        jjVar.l = false;
                        if (sa0Var != null) {
                            sa0Var.a(false, true);
                        }
                    }
                    sa0Var2.a(jjVar.k, true);
                    na0Var.i();
                    na0Var.l(true);
                    break;
                }
        }
    }
}
