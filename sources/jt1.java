// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jt1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb2 b;
    public final /* synthetic */ RectF c;

    public /* synthetic */ jt1(gb2 gb2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = gb2Var;
        this.c = rectF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new jt1(gb2Var, rectF, (byte) 1), 400L);
                break;
            default:
                if (gb2Var.getScrimBlockBounds() == rectF) {
                    gb2Var.setScrimBlockBounds(null);
                    break;
                }
                break;
        }
    }
}
