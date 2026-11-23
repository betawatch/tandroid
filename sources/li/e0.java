package li;

import android.content.DialogInterface;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                t1[] t1VarArr = (t1[]) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                t1VarArr[0] = null;
                break;
            default:
                r10 r10Var = (r10) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                r10Var.a(null, "CANCELLED");
                break;
        }
    }
}
