// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class era implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hra b;

    public /* synthetic */ era(hra hraVar, byte b) {
        this.a = b;
        this.b = hraVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hra hraVar = this.b;
        switch (b) {
            case 0:
                hraVar.invalidate();
                gl.c3(new era(hraVar, (byte) 1));
                break;
            default:
                gra graVar = hraVar.e;
                if (graVar != null) {
                    hraVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((ql8) graVar).b;
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.r.setTranslationX(profileActivity.f2(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.g2(profileActivity.E6));
                    break;
                }
                break;
        }
    }
}
