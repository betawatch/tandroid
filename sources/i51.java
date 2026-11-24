// default package

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i51 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ i51(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                m51.e = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            case 1:
                e94.i = null;
                view.requestFocus();
                break;
            case 2:
                lz8.f = null;
                if (view != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                xu9.I = null;
                view.requestFocus();
                break;
        }
    }
}
