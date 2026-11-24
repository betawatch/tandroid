// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ff4 extends jf5 {
    public final rj r;

    public ff4(Context context, ylb ylbVar) {
        super(context);
        rj rjVar = new rj(context, true, true, true, (byte) 1);
        this.r = rjVar;
        rjVar.setGravity(jb6.a0 ? 3 : 5);
        anb.U(rjVar, cmb.K6, ylbVar);
        rjVar.setTextSize(gm.N(15.0f));
        addView(rjVar, qoe.d(-1, 18.0f, (jb6.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        rve.b(rjVar, 0.04f, 1.2f);
    }
}
