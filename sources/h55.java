// default package

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h55 implements ax0 {
    public final /* synthetic */ h75 a;

    public h55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // ax0
    public final void x() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        h75 h75Var = this.a;
        if (h75Var.z3 == 6) {
            SharedPreferences c1 = na7.c1();
            if (c1.getBoolean("reminderhint", false)) {
                return;
            }
            c1.edit().putBoolean("reminderhint", true).commit();
            if (h75Var.g2 == null) {
                ke5 ke5Var = new ke5(h75Var.getContext(), 8);
                h75Var.g2 = ke5Var;
                ke5Var.setAlpha(0.0f);
                h75Var.g2.setVisibility(4);
                h75Var.g2.setShowingDuration(4000L);
                h75Var.b.addView(h75Var.g2, nme.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                h75Var.g2.setText(k96.M0(2131743196, null));
                h75Var.g2.b();
            }
            h75Var.g2.setExtraTranslationY(-gl.m);
            h75Var.g2.c(h75Var.v1);
        }
    }

    @Override // ax0
    public final boolean y() {
        return true;
    }
}
