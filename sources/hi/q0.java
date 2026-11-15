package hi;

import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ q0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        u0 u0Var = this.b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                t0 t0Var = u0Var.n;
                if (t0Var != null) {
                    t0Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (u0Var.c && u0Var.r != null) {
                    u0Var.n.b(R.raw.ic_save_to_gallery, 3500, hd.N0("VideoSavedHint"));
                    u0Var.c = false;
                    u0Var.d();
                    u0Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                u0Var.c = false;
                u0Var.d();
                t0 t0Var2 = u0Var.n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var.n = null;
                }
                t0 t0Var3 = new t0(u0Var.getContext());
                u0Var.n = t0Var3;
                t0Var3.b(R.raw.ic_save_to_gallery, 2500, hd.N0("PhotoSavedHint"));
                u0Var.b.addView(u0Var.n);
                u0Var.w = uri2;
                break;
        }
    }
}
