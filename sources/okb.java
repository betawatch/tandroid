// default package

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class okb extends FrameLayout {
    public TextView a;
    public nkb b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        nkb nkbVar = this.b;
        int i = this.d;
        r16 r16Var = (r16) nkbVar;
        r16Var.getClass();
        yac.h(i).a0 = null;
        byte b = 0;
        yac.h(i).u(false);
        LaunchActivity launchActivity = r16Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((e) c00.g(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(hl.G).withEndAction(new ea5(r16Var, (byte) 23)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new xe2(b));
    }

    public void setDelegate(nkb nkbVar) {
        this.b = nkbVar;
    }
}
