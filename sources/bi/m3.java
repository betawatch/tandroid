package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.j8;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                    j8 j8Var = wp0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j8Var.a(i11, arrayList);
                    cc.a0(wp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                m60Var.u();
                wp0Var.o();
                break;
            default:
                ea0 ea0Var = (ea0) frameLayout;
                Context context = (Context) obj3;
                ja0 ja0Var = (ja0) obj2;
                ja0 ja0Var2 = (ja0) obj;
                ka0 ka0Var = ea0Var.d0;
                kj kjVar = ka0Var.d;
                if (!z10) {
                    new cc(ka0Var, ka0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(hd.M0(2131750583, null), new u90(ea0Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = kjVar.k;
                    kjVar.k = !z11;
                    ka0Var.y = false;
                    if (z11) {
                        kjVar.l = false;
                        if (ja0Var != null) {
                            ja0Var.a(false, true);
                        }
                    }
                    ja0Var2.a(kjVar.k, true);
                    ea0Var.i();
                    ea0Var.l(true);
                    break;
                }
        }
    }
}
