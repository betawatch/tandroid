// default package

import android.net.Uri;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fq3 b;

    public /* synthetic */ bq3(fq3 fq3Var, byte b) {
        this.a = b;
        this.b = fq3Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                eq3 eq3Var = fq3Var.n;
                if (eq3Var != null) {
                    eq3Var.setProgress(f.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (fq3Var.c && fq3Var.r != null) {
                    fq3Var.n.b(R.raw.ic_save_to_gallery, 3500, ob6.N0("VideoSavedHint"));
                    fq3Var.c = false;
                    fq3Var.d();
                    fq3Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                fq3Var.c = false;
                fq3Var.d();
                eq3 eq3Var2 = fq3Var.n;
                if (eq3Var2 != null) {
                    eq3Var2.a();
                    fq3Var.n = null;
                }
                eq3 eq3Var3 = new eq3(fq3Var.getContext());
                fq3Var.n = eq3Var3;
                eq3Var3.b(R.raw.ic_save_to_gallery, 2500, ob6.N0("PhotoSavedHint"));
                fq3Var.b.addView(fq3Var.n);
                fq3Var.w = uri2;
                break;
        }
    }
}
