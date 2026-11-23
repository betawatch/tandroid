package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r6 extends org.telegram.ui.ActionBar.w2 {
    public long m1;

    public r6(Context context, long j3, TL_stars.SavedStarGift savedStarGift, org.telegram.ui.ActionBar.h6 h6Var, q10 q10Var) {
        super(1, context, h6Var, false);
        this.m1 = 0L;
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = va.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, h6Var);
        b10.setText(hd.N0(2131749864, null));
        linearLayout.addView(b10, ma.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.m6.y6, false, h6Var);
        b11.setText(hd.N0(2131749865, null));
        linearLayout.addView(b11, ma.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        hi.e eVar = new hi.e(context, h6Var, true);
        di.p8 G = di.y8.y(this.a, false).G(j3, true);
        q6 q6Var = new q6(context, this.a, 0, false, new o6(0, this, G), new ab.g(5, this, eVar), null, h6Var);
        q6Var.setSpanCount(3);
        q6Var.setOverScrollMode(2);
        q6Var.setScrollEnabled(false);
        linearLayout.addView(q6Var, ma.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        eVar.i(hd.N0(2131749866, null), false, true);
        linearLayout.addView(eVar, ma.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        eVar.setEnabled(false);
        eVar.setOnClickListener(new p6(this, G, savedStarGift, q10Var, 0));
        this.O = linearLayout;
    }
}
