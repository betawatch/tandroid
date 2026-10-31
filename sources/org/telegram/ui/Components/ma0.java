package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ma0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = z10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                ua0 ua0Var = (ua0) frameLayout;
                Context context = (Context) obj3;
                za0 za0Var = (za0) obj2;
                za0 za0Var2 = (za0) obj;
                ab0 ab0Var = ua0Var.c0;
                org.telegram.messenger.nj njVar = ab0Var.d;
                if (!z10) {
                    new cc(ab0Var, ab0Var.F).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.R2("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", -1, 0, new ka0(ua0Var, context, i11), null)).j();
                    break;
                } else {
                    boolean z11 = njVar.k;
                    njVar.k = !z11;
                    ab0Var.y = false;
                    if (z11) {
                        njVar.l = false;
                        if (za0Var != null) {
                            za0Var.a(false, true);
                        }
                    }
                    za0Var2.a(njVar.k, true);
                    ua0Var.i();
                    ua0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                z60 z60Var = (z60) obj;
                vq0 vq0Var = ((ph.f2) frameLayout).a;
                if (z10) {
                    vq0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    cc.a0(vq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750046, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    rh.u5 u5Var = vq0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    u5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    u5Var.a(i12, arrayList);
                    cc.a0(vq0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                z60Var.u();
                vq0Var.o();
                break;
        }
    }
}
