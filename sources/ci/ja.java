package ci;

import android.content.DialogInterface;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ cs c;

    public /* synthetic */ ja(int i3, va vaVar) {
        this.b = i3;
        this.c = vaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                hs.f(this.b).n((va) this.c, hs.A3);
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.c;
                f0Var.o0(false);
                f0Var.B0(this.b);
                break;
        }
    }

    public /* synthetic */ ja(ug.f0 f0Var, int i3) {
        this.c = f0Var;
        this.b = i3;
    }
}
