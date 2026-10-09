package ci;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ p0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Float f7 = (Float) obj;
                s0 s0Var = this.b.n;
                if (s0Var != null) {
                    s0Var.setProgress(f7.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                t0 t0Var = this.b;
                if (t0Var.c && t0Var.r != null) {
                    t0Var.n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    t0Var.c = false;
                    t0Var.d();
                    t0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                t0 t0Var2 = this.b;
                t0Var2.c = false;
                t0Var2.d();
                s0 s0Var2 = t0Var2.n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var2.n = null;
                }
                s0 s0Var3 = new s0(t0Var2.getContext());
                t0Var2.n = s0Var3;
                s0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                t0Var2.b.addView(t0Var2.n);
                t0Var2.v = uri2;
                break;
        }
    }
}
