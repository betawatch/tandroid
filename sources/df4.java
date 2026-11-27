// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class df4 extends mf5 {
    public final si r;

    public df4(Context context, vnb vnbVar) {
        super(context);
        si siVar = new si(context, true, true, true, (byte) 1);
        this.r = siVar;
        siVar.setGravity(ob6.a0 ? 3 : 5);
        yob.U(siVar, aob.L6, vnbVar);
        siVar.setTextSize(hl.N(15.0f));
        addView(siVar, tre.d(-1, 18.0f, (ob6.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        iye.b(siVar, 0.04f, 1.2f);
    }
}
