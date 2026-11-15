package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.sa;
import di.m8;
import di.v8;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h4 extends org.telegram.ui.ActionBar.u2 {
    public long m1;

    public h4(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.e6 e6Var, r10 r10Var) {
        super(1, context, e6Var, false);
        this.m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = sa.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, e6Var);
        b10.setText(hd.M0(2131749881, null));
        linearLayout.addView(b10, ja.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.y6, false, e6Var);
        b11.setText(hd.M0(2131749882, null));
        linearLayout.addView(b11, ja.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.d dVar = new hi.d(context, e6Var, true);
        m8 G = v8.y(this.a, false).G(j3, true);
        g4 g4Var = new g4(context, this.a, 0, false, new e4(0, this, G), new ab.g(6, this, dVar), null, e6Var);
        g4Var.setSpanCount(3);
        g4Var.setOverScrollMode(2);
        g4Var.setScrollEnabled(false);
        linearLayout.addView(g4Var, ja.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(hd.M0(2131749883, null), false, true);
        linearLayout.addView(dVar, ja.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new f4(this, G, savedStarGift, r10Var, 0));
        this.O = linearLayout;
    }
}
