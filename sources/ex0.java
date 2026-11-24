// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((wx0) obj).r(view, windowInsets);
            case 1:
                return ((my0) obj).U(windowInsets);
            default:
                return ((SecretMediaViewer) obj).f(windowInsets);
        }
    }
}
