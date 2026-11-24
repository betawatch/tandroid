// default package

import android.net.Uri;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp3 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op3 b;

    public /* synthetic */ kp3(op3 op3Var, byte b) {
        this.a = b;
        this.b = op3Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                np3 np3Var = op3Var.n;
                if (np3Var != null) {
                    np3Var.setProgress(f.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (op3Var.c && op3Var.r != null) {
                    op3Var.n.b(R.raw.ic_save_to_gallery, 3500, k96.N0("VideoSavedHint"));
                    op3Var.c = false;
                    op3Var.d();
                    op3Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                op3Var.c = false;
                op3Var.d();
                np3 np3Var2 = op3Var.n;
                if (np3Var2 != null) {
                    np3Var2.a();
                    op3Var.n = null;
                }
                np3 np3Var3 = new np3(op3Var.getContext());
                op3Var.n = np3Var3;
                np3Var3.b(R.raw.ic_save_to_gallery, 2500, k96.N0("PhotoSavedHint"));
                op3Var.b.addView(op3Var.n);
                op3Var.w = uri2;
                break;
        }
    }
}
