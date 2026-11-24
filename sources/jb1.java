// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb1 b;

    public /* synthetic */ jb1(mb1 mb1Var, byte b) {
        this.a = b;
        this.b = mb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mb1 mb1Var = this.b;
        switch (b) {
            case 0:
                if (mb1Var.o1) {
                    mb1Var.o1 = false;
                    mb1Var.invalidate();
                    break;
                }
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                mb1Var.setVisibility(8);
                break;
        }
    }
}
