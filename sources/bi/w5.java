package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
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
                a70 a70Var = (a70) obj;
                gq0 gq0Var = ((m6) frameLayout).a;
                if (z10) {
                    gq0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    lc.b0(gq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750020, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    di.n8 n8Var = gq0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    n8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    n8Var.a(i11, arrayList);
                    lc.b0(gq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                a70Var.v();
                gq0Var.o();
                break;
            default:
                qa0 qa0Var = (qa0) frameLayout;
                Context context = (Context) obj3;
                va0 va0Var = (va0) obj2;
                va0 va0Var2 = (va0) obj;
                wa0 wa0Var = qa0Var.d0;
                kj kjVar = wa0Var.d;
                if (!z10) {
                    new lc(wa0Var, wa0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.T2(hd.N0(2131750566, null), new ga0(qa0Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = kjVar.k;
                    kjVar.k = !z11;
                    wa0Var.y = false;
                    if (z11) {
                        kjVar.l = false;
                        if (va0Var != null) {
                            va0Var.a(false, true);
                        }
                    }
                    va0Var2.a(kjVar.k, true);
                    qa0Var.i();
                    qa0Var.l(true);
                    break;
                }
        }
    }
}
