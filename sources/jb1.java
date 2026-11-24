// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                Drawable[] drawableArr = PhotoViewer.f9;
                mb1Var.setVisibility(8);
                break;
        }
    }
}
