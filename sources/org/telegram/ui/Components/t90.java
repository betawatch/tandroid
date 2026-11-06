package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t90(FrameLayout frameLayout, boolean z9, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = frameLayout;
        this.b = z9;
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
        boolean z9 = this.b;
        FrameLayout frameLayout = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                ca0 ca0Var = (ca0) frameLayout;
                Context context = (Context) obj3;
                ha0 ha0Var = (ha0) obj2;
                ha0 ha0Var2 = (ha0) obj;
                ia0 ia0Var = ca0Var.c0;
                org.telegram.messenger.mj mjVar = ia0Var.d;
                if (!z9) {
                    new hc(ia0Var, ia0Var.F).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750584, null), new r90(ca0Var, context, i10))).j();
                    break;
                } else {
                    boolean z10 = mjVar.k;
                    mjVar.k = !z10;
                    ia0Var.y = false;
                    if (z10) {
                        mjVar.l = false;
                        if (ha0Var != null) {
                            ha0Var.a(false, true);
                        }
                    }
                    ha0Var2.a(mjVar.k, true);
                    ca0Var.i();
                    ca0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                k60 k60Var = (k60) obj;
                up0 up0Var = ((zh.a2) frameLayout).a;
                if (z9) {
                    up0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    hc.a0(up0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750036, bi.k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bi.t9 t9Var = up0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    t9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    t9Var.a(i11, arrayList);
                    hc.a0(up0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750392, bi.k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                k60Var.u();
                up0Var.o();
                break;
        }
    }
}
