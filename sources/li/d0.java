package li;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(int i7, int i10, Object obj, int i11) {
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
                p10 p10Var = (p10) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                p10Var.a(null, "CANCELLED");
                break;
        }
    }
}
