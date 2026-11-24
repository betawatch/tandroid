// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new era(hraVar, (byte) 1));
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
