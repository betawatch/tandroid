// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hg5 b;

    public /* synthetic */ hi(hg5 hg5Var, byte b) {
        this.a = b;
        this.b = hg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hg5 hg5Var = this.b;
        switch (b) {
            case 0:
                gm.B2(hg5Var);
                break;
            case 1:
                gm.B2(hg5Var);
                break;
            case 2:
                gm.B2(hg5Var);
                break;
            case 3:
                float[] fArr = FragmentContextView.W0;
                gm.B2(hg5Var);
                break;
            case 4:
            case 7:
                hg5Var.f(true);
                break;
            case 5:
                hg5Var.y();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.d9;
                gm.B2(hg5Var);
                break;
            case 8:
                gm.B2(hg5Var);
                break;
            case 9:
                gm.B2(hg5Var);
                break;
            default:
                gm.B2(hg5Var);
                break;
        }
    }
}
