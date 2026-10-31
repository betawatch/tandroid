package mg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ay;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c1 extends kg.v1 {
    public static c1 K2;
    public final og.a I2;
    public final String J2;

    public c1(k2 k2Var, int i10, TLRPC.User user, kg.m mVar, String str, boolean z10, p6 p6Var) {
        super(k2Var, i10, user, mVar, null, p6Var);
        this.J2 = str;
        wb.a((FrameLayout) this.b, new u(2));
        if (!z10) {
            tk0 tk0Var = this.k1;
            int i11 = this.t0;
            tk0Var.setPadding(i11, 0, i11, org.telegram.messenger.i0.L(68.0f));
            og.a aVar = new og.a(getContext(), this.I0);
            this.I2 = aVar;
            aVar.setOnClickListener(new ag.g(this, 13));
            og.a aVar2 = this.I2;
            aVar2.e = true;
            vh.d dVar = aVar2.a;
            dVar.setEnabled(true);
            dVar.i(cd.L0(2131749684, null), false, true);
            a7.i(t6.h5, aVar2.b, aVar2.c);
            this.b.addView(this.I2, b6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        O();
    }

    public static void l1(c1 c1Var) {
        String str = "https://t.me/giftcode/" + c1Var.J2;
        ay ayVar = new ay(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
        ayVar.C2 = new zf.j0(c1Var, str);
        c1Var.o1.presentFragment(ayVar);
        c1Var.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        K2 = null;
    }

    @Override // kg.v1
    public final int f1() {
        return 6;
    }

    @Override // kg.v1
    public final void g1(View view) {
        ((og.v) view).setSlug(this.J2);
    }

    @Override // kg.v1
    public final View h1(Context context, int i10) {
        if (i10 != 6) {
            return null;
        }
        og.v vVar = new og.v(context, this.I0);
        vVar.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        return vVar;
    }

    @Override // kg.v1
    public final void j1(boolean z10) {
        super.j1(z10);
        this.H2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f);
        this.H2.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.R2(cd.L0(2131749688, "GiftPremiumAboutThisLink"), t6.Uc, 0, new a1(this, 0), null), org.telegram.messenger.i0.W2(cd.L0(2131749687, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override // kg.v1
    public final void k1() {
        int i10 = this.X1;
        this.Y1 = i10;
        this.Z1 = i10 + 1;
        int i11 = i10 + 2;
        this.X1 = i11;
        this.a2 = i11;
        this.b2 = i11;
        int size = this.P1.size() + i11;
        this.c2 = size;
        this.X1 = size + 1;
        this.d2 = size;
    }
}
