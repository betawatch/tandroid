package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.wa;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u6 extends org.telegram.ui.ActionBar.w2 {
    public long m1;

    public u6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.i6 i6Var, o10 o10Var) {
        super(1, context, i6Var, false);
        this.m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = wa.b(context, 20.0f, org.telegram.ui.ActionBar.n6.G6, true, i6Var);
        b10.setText(gd.N0(2131749864, null));
        linearLayout.addView(b10, na.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = wa.b(context, 14.0f, org.telegram.ui.ActionBar.n6.y6, false, i6Var);
        b11.setText(gd.N0(2131749865, null));
        linearLayout.addView(b11, na.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.e eVar = new hi.e(context, i6Var, true);
        di.p8 G = di.y8.y(this.a, false).G(j3, true);
        t6 t6Var = new t6(context, this.a, 0, false, new r6(0, this, G), new ab.g(5, this, eVar), null, i6Var);
        t6Var.setSpanCount(3);
        t6Var.setOverScrollMode(2);
        t6Var.setScrollEnabled(false);
        linearLayout.addView(t6Var, na.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        eVar.i(gd.N0(2131749866, null), false, true);
        linearLayout.addView(eVar, na.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        eVar.setEnabled(false);
        eVar.setOnClickListener(new s6(this, G, savedStarGift, o10Var, 0));
        this.O = linearLayout;
    }
}
