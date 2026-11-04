package ji;

import android.content.DialogInterface;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(int i3, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i3;
        this.c = i10;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s1[] s1VarArr = (s1[]) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                s1VarArr[0] = null;
                break;
            default:
                n10 n10Var = (n10) this.d;
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                n10Var.a(null, "CANCELLED");
                break;
        }
    }
}
