package ai;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.rf;
import ci.e9;
import ci.v8;
import org.telegram.messenger.bd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t4 extends org.telegram.ui.ActionBar.t2 {
    public long j1;

    public t4(Context context, long j10, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.e6 e6Var, m10 m10Var) {
        super(1, context, e6Var, false);
        this.j1 = 0L;
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, e6Var);
        b10.setText(bd.M0(2131749889, null));
        linearLayout.addView(b10, mf.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.y6, false, e6Var);
        b11.setText(bd.M0(2131749890, null));
        linearLayout.addView(b11, mf.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        gi.d dVar = new gi.d(context, e6Var, true);
        v8 G = e9.y(this.a, false).G(j10, true);
        s4 s4Var = new s4(context, this.a, 0, false, new q4(0, this, G), new n(3, this, dVar), null, e6Var);
        s4Var.setSpanCount(3);
        s4Var.setOverScrollMode(2);
        s4Var.setScrollEnabled(false);
        linearLayout.addView(s4Var, mf.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(bd.M0(2131749891, null), false, true);
        linearLayout.addView(dVar, mf.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new r4(this, G, savedStarGift, m10Var, 0));
        this.O = linearLayout;
    }
}
