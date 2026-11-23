package hi;

import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ z0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        d1 d1Var = this.b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                c1 c1Var = d1Var.n;
                if (c1Var != null) {
                    c1Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (d1Var.c && d1Var.r != null) {
                    d1Var.n.b(R.raw.ic_save_to_gallery, 3500, gd.O0("VideoSavedHint"));
                    d1Var.c = false;
                    d1Var.d();
                    d1Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                d1Var.c = false;
                d1Var.d();
                c1 c1Var2 = d1Var.n;
                if (c1Var2 != null) {
                    c1Var2.a();
                    d1Var.n = null;
                }
                c1 c1Var3 = new c1(d1Var.getContext());
                d1Var.n = c1Var3;
                c1Var3.b(R.raw.ic_save_to_gallery, 2500, gd.O0("PhotoSavedHint"));
                d1Var.b.addView(d1Var.n);
                d1Var.w = uri2;
                break;
        }
    }
}
