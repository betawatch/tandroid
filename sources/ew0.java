// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ew0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((xw0) obj).r(view, windowInsets);
            case 1:
                return ((nx0) obj).V(windowInsets);
            default:
                return ((SecretMediaViewer) obj).f(windowInsets);
        }
    }
}
