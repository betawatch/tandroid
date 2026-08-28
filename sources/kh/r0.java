package kh;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ r0(v0 v0Var, int i9) {
        this.a = i9;
        this.b = v0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Float f10 = (Float) obj;
                u0 u0Var = this.b.n;
                if (u0Var != null) {
                    u0Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                v0 v0Var = this.b;
                if (v0Var.c && v0Var.r != null) {
                    v0Var.n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    v0Var.c = false;
                    v0Var.d();
                    v0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                v0 v0Var2 = this.b;
                v0Var2.c = false;
                v0Var2.d();
                u0 u0Var2 = v0Var2.n;
                if (u0Var2 != null) {
                    u0Var2.a();
                    v0Var2.n = null;
                }
                u0 u0Var3 = new u0(v0Var2.getContext());
                v0Var2.n = u0Var3;
                u0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                v0Var2.b.addView(v0Var2.n);
                v0Var2.v = uri2;
                break;
        }
    }
}
