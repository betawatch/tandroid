// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class emb extends i98 {
    public final /* synthetic */ jm6 a;
    public final /* synthetic */ fmb b;

    public emb(fmb fmbVar, jm6 jm6Var) {
        this.b = fmbVar;
        this.a = jm6Var;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        qmb qmbVar = this.b.a;
        jm6 jm6Var = this.a;
        if (jm6Var.h != null) {
            File file = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
            Point b1 = gl.b1();
            Bitmap G = fl5.G(jm6Var.h, null, (float) b1.x, (float) b1.y, true);
            try {
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(jm6Var.h);
            qmbVar.D1 = new lrc(file2, file2, "");
            qmbVar.E1 = G;
            qmbVar.d2 = 0;
            qmbVar.z0.requestLayout();
            qmbVar.f1(false);
            qmbVar.y1 = null;
            qmbVar.m1();
        }
    }

    @Override // i98, o98
    public final boolean y() {
        return false;
    }
}
