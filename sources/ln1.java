// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ln1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs5 b;

    public /* synthetic */ ln1(cs5 cs5Var, jc jcVar) {
        this.a = (byte) 1;
        this.b = cs5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.r();
                break;
            case 1:
                if (cs5Var.J) {
                    cs5Var.u();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                cs5Var.r();
                break;
            default:
                cs5Var.r();
                break;
        }
    }

    public /* synthetic */ ln1(cs5 cs5Var, byte b) {
        this.a = b;
        this.b = cs5Var;
    }
}
