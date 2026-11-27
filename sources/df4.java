// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
