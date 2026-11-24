// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fob extends jb8 {
    public final /* synthetic */ jo6 a;
    public final /* synthetic */ gob b;

    public fob(gob gobVar, jo6 jo6Var) {
        this.b = gobVar;
        this.a = jo6Var;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        rob robVar = this.b.a;
        jo6 jo6Var = this.a;
        if (jo6Var.h != null) {
            File file = new File(bc4.z(4), Utilities.b.nextInt() + ".jpg");
            Point b1 = gm.b1();
            Bitmap G = fn5.G(jo6Var.h, null, (float) b1.x, (float) b1.y, true);
            try {
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(jo6Var.h);
            robVar.D1 = new ntc(file2, file2, "");
            robVar.E1 = G;
            robVar.d2 = 0;
            robVar.z0.requestLayout();
            robVar.g1(false);
            robVar.y1 = null;
            robVar.n1();
        }
    }

    @Override // jb8, pb8
    public final boolean y() {
        return false;
    }
}
