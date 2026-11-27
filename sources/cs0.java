// default package

import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.tasks.CancellationTokenSource;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cs0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ze7) obj).run();
                break;
            case 1:
                ((HttpGetFileTask) obj).cancel(true);
                break;
            case 2:
                zu1 zu1Var = (zu1) obj;
                zu1Var.t9 = true;
                zu1Var.r9 = 0;
                zu1Var.fc = 0;
                zu1Var.b5 = 0;
                zu1Var.Q7();
                zu1Var.pc(false);
                break;
            case 3:
                n12 n12Var = (n12) obj;
                vpa vpaVar = n12Var.m4;
                if (vpaVar != null) {
                    vpaVar.d();
                }
                vpa vpaVar2 = new vpa((Object) n12Var.b, (vk4) vpa.p, 0.0f);
                n12Var.m4 = vpaVar2;
                vpaVar2.m.a(1.5f);
                n12Var.m4.m.b(1500.0f);
                n12Var.m4.h();
                break;
            case 4:
                ((View) obj).setTag(null);
                break;
            case 5:
                g92 g92Var = (g92) obj;
                g92Var.N0 = false;
                g92Var.b = null;
                g92Var.O0 = false;
                break;
            case 6:
                ((na2) obj).n = null;
                break;
            case 7:
                fp2 fp2Var = (fp2) obj;
                ConnectionsManager.getInstance(fp2Var.d).cancelRequest(fp2Var.r, true);
                fp2Var.q = null;
                fp2Var.r = 0;
                break;
            case 8:
                ((b43) obj).J = false;
                break;
            case 9:
                ((p35) obj).c("AUTH_CANCELED");
                break;
            case 10:
                ((e66) obj).b();
                break;
            case 11:
                ((CancellationTokenSource) obj).cancel();
                break;
            case 12:
                ((jo6) obj).f = true;
                break;
            default:
                ((vlc) obj).run();
                break;
        }
    }
}
