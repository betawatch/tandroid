// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lwc implements OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ lwc(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                cc4.d("wear-auth: /answer send failed: " + exc.getMessage());
                c51Var.setLoading(false);
                break;
            default:
                cc4.d("wear-auth: /token send failed: " + exc.getMessage());
                c51Var.setLoading(false);
                break;
        }
    }
}
