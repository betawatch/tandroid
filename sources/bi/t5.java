package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
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
                y60 y60Var = (y60) obj;
                eq0 eq0Var = ((j6) frameLayout).a;
                if (z10) {
                    eq0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    lc.b0(eq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750021, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    di.m8 m8Var = eq0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    m8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    m8Var.a(i11, arrayList);
                    lc.b0(eq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y60Var.v();
                eq0Var.o();
                break;
            default:
                oa0 oa0Var = (oa0) frameLayout;
                Context context = (Context) obj3;
                ta0 ta0Var = (ta0) obj2;
                ta0 ta0Var2 = (ta0) obj;
                ua0 ua0Var = oa0Var.d0;
                jj jjVar = ua0Var.d;
                if (!z10) {
                    new lc(ua0Var, ua0Var.G).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.T2(gd.M0(2131750567, null), new ea0(oa0Var, context, i10))).j();
                    break;
                } else {
                    boolean z11 = jjVar.k;
                    jjVar.k = !z11;
                    ua0Var.y = false;
                    if (z11) {
                        jjVar.l = false;
                        if (ta0Var != null) {
                            ta0Var.a(false, true);
                        }
                    }
                    ta0Var2.a(jjVar.k, true);
                    oa0Var.i();
                    oa0Var.l(true);
                    break;
                }
        }
    }
}
