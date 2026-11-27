// default package

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ei1 extends RadialProgressView {
    public final /* synthetic */ byte O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei1(yn5 yn5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = yn5Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                ad8 ad8Var = ((PhotoViewer) this.P).f0;
                if (ad8Var != null) {
                    ad8Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f) {
        byte b = this.O;
        Object obj = this.P;
        switch (b) {
            case 0:
                super.setAlpha(f);
                ((gi1) obj).h.invalidate();
                break;
            case 1:
                super.setAlpha(f);
                ((xc5) obj).e.invalidate();
                break;
            case 2:
                super.setAlpha(f);
                ((cg6) obj).h.invalidate();
                break;
            default:
                super.setAlpha(f);
                ad8 ad8Var = ((PhotoViewer) obj).f0;
                if (ad8Var != null) {
                    ad8Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, vnb vnbVar) {
        super(contextThemeWrapper, vnbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}
