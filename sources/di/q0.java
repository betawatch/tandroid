package di;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ q0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Float f7 = (Float) obj;
                t0 t0Var = this.b.n;
                if (t0Var != null) {
                    t0Var.setProgress(f7.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                u0 u0Var = this.b;
                if (u0Var.c && u0Var.r != null) {
                    u0Var.n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    u0Var.c = false;
                    u0Var.d();
                    u0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                u0 u0Var2 = this.b;
                u0Var2.c = false;
                u0Var2.d();
                t0 t0Var2 = u0Var2.n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var2.n = null;
                }
                t0 t0Var3 = new t0(u0Var2.getContext());
                u0Var2.n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                u0Var2.b.addView(u0Var2.n);
                u0Var2.v = uri2;
                break;
        }
    }
}
