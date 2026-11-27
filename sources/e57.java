// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class e57 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e57(FrameLayout frameLayout, boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                m57 m57Var = (m57) frameLayout;
                Context context = (Context) obj3;
                r57 r57Var = (r57) obj2;
                r57 r57Var2 = (r57) obj;
                s57 s57Var = m57Var.d0;
                v47 v47Var = s57Var.d;
                if (!z) {
                    new d31(s57Var, s57Var.G).Q(R.raw.star_premium_2, 36, hl.N2(ob6.M0(2131750543, null), -1, 0, new c57(m57Var, context, b2), null)).j();
                    break;
                } else {
                    boolean z2 = v47Var.k;
                    v47Var.k = !z2;
                    s57Var.y = false;
                    if (z2) {
                        v47Var.l = false;
                        if (r57Var != null) {
                            r57Var.a(false, true);
                        }
                    }
                    r57Var2.a(v47Var.k, true);
                    m57Var.i();
                    m57Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                fu5 fu5Var = (fu5) obj;
                cga cgaVar = ((au8) frameLayout).a;
                if (z) {
                    cgaVar.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    d31.b0(cgaVar.a).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131749995, wua.u1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    zwa zwaVar = cgaVar.e;
                    int i = tL_starGiftCollection.collection_id;
                    zwaVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    zwaVar.a(i, arrayList);
                    d31.b0(cgaVar.a).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131750354, wua.u1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                fu5Var.u();
                cgaVar.o();
                break;
        }
    }
}
