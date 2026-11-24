// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fd4 extends ld5 {
    public final ri r;

    public fd4(Context context, wjb wjbVar) {
        super(context);
        ri riVar = new ri(context, true, true, true, (byte) 1);
        this.r = riVar;
        riVar.setGravity(k96.a0 ? 3 : 5);
        zkb.U(riVar, bkb.K6, wjbVar);
        riVar.setTextSize(gl.N(15.0f));
        addView(riVar, nme.d(-1, 18.0f, (k96.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        ote.b(riVar, 0.04f, 1.2f);
    }
}
