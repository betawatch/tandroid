// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class du8 extends nx0 {
    public long l1;

    public du8(Context context, long j, TL_stars.SavedStarGift savedStarGift, vnb vnbVar, hcc hccVar) {
        super(1, vnbVar, context, false);
        this.l1 = 0L;
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b = zze.b(context, 20.0f, aob.G6, true, vnbVar);
        b.setText(ob6.M0(2131749827, null));
        linearLayout.addView(b, tre.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b2 = zze.b(context, 14.0f, aob.y6, false, vnbVar);
        b2.setText(ob6.M0(2131749828, null));
        linearLayout.addView(b2, tre.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        axa D = jxa.v(this.a, false).D(j, true);
        cu8 cu8Var = new cu8(context, this.a, 0, false, new ia7(this, D, (byte) 8), new m88((Object) this, (Object) c51Var, (byte) 16), null, vnbVar);
        cu8Var.setSpanCount(3);
        cu8Var.setOverScrollMode(2);
        cu8Var.setScrollEnabled(false);
        linearLayout.addView(cu8Var, tre.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        c51Var.i(ob6.M0(2131749829, null), false, true);
        linearLayout.addView(c51Var, tre.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        c51Var.setEnabled(false);
        c51Var.setOnClickListener(new cg((Object) this, (Object) D, (Object) savedStarGift, (Object) hccVar, (byte) 15));
        this.O = linearLayout;
    }
}
