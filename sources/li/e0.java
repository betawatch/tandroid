package li;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i7, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u1[] u1VarArr = (u1[]) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                u1VarArr[0] = null;
                break;
            default:
                q10 q10Var = (q10) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                q10Var.a(null, "CANCELLED");
                break;
        }
    }
}
