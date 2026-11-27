// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
