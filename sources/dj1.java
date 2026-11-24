// default package

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dj1 extends RadialProgressView {
    public final /* synthetic */ byte O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj1(vn5 vn5Var, Context context, byte b) {
        super(context, null);
        this.O = b;
        this.P = vn5Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.O) {
            case 3:
                super.invalidate();
                lb8 lb8Var = ((PhotoViewer) this.P).f0;
                if (lb8Var != null) {
                    lb8Var.invalidate();
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
                ((fj1) obj).h.invalidate();
                break;
            case 1:
                super.setAlpha(f);
                ((uc5) obj).e.invalidate();
                break;
            case 2:
                super.setAlpha(f);
                ((zf6) obj).h.invalidate();
                break;
            default:
                super.setAlpha(f);
                lb8 lb8Var = ((PhotoViewer) obj).f0;
                if (lb8Var != null) {
                    lb8Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, ylb ylbVar) {
        super(contextThemeWrapper, ylbVar);
        this.O = (byte) 3;
        this.P = photoViewer;
    }
}
