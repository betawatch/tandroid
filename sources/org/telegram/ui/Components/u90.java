package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u90(FrameLayout frameLayout, boolean z9, Object obj, Object obj2, Object obj3, int i7) {
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
                da0 da0Var = (da0) frameLayout;
                Context context = (Context) obj3;
                ia0 ia0Var = (ia0) obj2;
                ia0 ia0Var2 = (ia0) obj;
                ja0 ja0Var = da0Var.c0;
                org.telegram.messenger.mj mjVar = ja0Var.d;
                if (!z9) {
                    new hc(ja0Var, ja0Var.F).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750583, null), new s90(da0Var, context, i10))).j();
                    break;
                } else {
                    boolean z10 = mjVar.k;
                    mjVar.k = !z10;
                    ja0Var.y = false;
                    if (z10) {
                        mjVar.l = false;
                        if (ia0Var != null) {
                            ia0Var.a(false, true);
                        }
                    }
                    ia0Var2.a(mjVar.k, true);
                    da0Var.i();
                    da0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                l60 l60Var = (l60) obj;
                vp0 vp0Var = ((zh.z1) frameLayout).a;
                if (z9) {
                    vp0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    hc.a0(vp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750037, bi.k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bi.t9 t9Var = vp0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    t9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    t9Var.a(i11, arrayList);
                    hc.a0(vp0Var.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750393, bi.k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                l60Var.u();
                vp0Var.o();
                break;
        }
    }
}
