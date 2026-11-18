package li;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
