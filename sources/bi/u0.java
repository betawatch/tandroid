package bi;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ u0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Float f7 = (Float) obj;
                x0 x0Var = this.b.n;
                if (x0Var != null) {
                    x0Var.setProgress(f7.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                y0 y0Var = this.b;
                if (y0Var.c && y0Var.r != null) {
                    y0Var.n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    y0Var.c = false;
                    y0Var.d();
                    y0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                y0 y0Var2 = this.b;
                y0Var2.c = false;
                y0Var2.d();
                x0 x0Var2 = y0Var2.n;
                if (x0Var2 != null) {
                    x0Var2.a();
                    y0Var2.n = null;
                }
                x0 x0Var3 = new x0(y0Var2.getContext());
                y0Var2.n = x0Var3;
                x0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                y0Var2.b.addView(y0Var2.n);
                y0Var2.v = uri2;
                break;
        }
    }
}
