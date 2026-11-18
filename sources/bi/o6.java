package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o6 extends org.telegram.ui.ActionBar.x2 {
    public long m1;

    public o6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.i6 i6Var, p10 p10Var) {
        super(1, context, i6Var, false);
        this.m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = va.b(context, 20.0f, org.telegram.ui.ActionBar.n6.G6, true, i6Var);
        b10.setText(gd.M0(2131749865, null));
        linearLayout.addView(b10, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.n6.y6, false, i6Var);
        b11.setText(gd.M0(2131749866, null));
        linearLayout.addView(b11, ma.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.d dVar = new hi.d(context, i6Var, true);
        di.o8 G = di.x8.y(this.a, false).G(j3, true);
        n6 n6Var = new n6(context, this.a, 0, false, new l6(0, this, G), new ab.g(5, this, dVar), null, i6Var);
        n6Var.setSpanCount(3);
        n6Var.setOverScrollMode(2);
        n6Var.setScrollEnabled(false);
        linearLayout.addView(n6Var, ma.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(gd.M0(2131749867, null), false, true);
        linearLayout.addView(dVar, ma.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new m6(this, G, savedStarGift, p10Var, 0));
        this.O = linearLayout;
    }
}
