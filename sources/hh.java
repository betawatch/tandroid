// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ je5 b;

    public /* synthetic */ hh(je5 je5Var, byte b) {
        this.a = b;
        this.b = je5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        je5 je5Var = this.b;
        switch (b) {
            case 0:
                gl.B2(je5Var);
                break;
            case 1:
                gl.B2(je5Var);
                break;
            case 2:
                gl.B2(je5Var);
                break;
            case 3:
                float[] fArr = FragmentContextView.W0;
                gl.B2(je5Var);
                break;
            case 4:
            case 7:
                je5Var.f(true);
                break;
            case 5:
                je5Var.y();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.f9;
                gl.B2(je5Var);
                break;
            case 8:
                gl.B2(je5Var);
                break;
            case 9:
                gl.B2(je5Var);
                break;
            default:
                gl.B2(je5Var);
                break;
        }
    }
}
