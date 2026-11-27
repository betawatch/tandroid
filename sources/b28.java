// default package

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b28 implements OnCompleteListener, fd, jy2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;

    public /* synthetic */ b28(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override // jy2
    public final void B(gy2 gy2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = gy2Var;
                pVar.f[4].setText(gy2Var.a);
                break;
            default:
                pVar.B0 = gy2Var;
                pVar.f[4].setText(gy2Var.a);
                pVar.C0 = gy2Var.d;
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            cc4.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.b.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 1:
                pVar.O0(pVar.S0[0]);
                break;
            case 2:
            default:
                pVar.J0(true);
                pVar.E0();
                break;
            case 3:
                pVar.G0(true);
                break;
        }
    }
}
