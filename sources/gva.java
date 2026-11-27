// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jva b;

    public /* synthetic */ gva(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                jvaVar.invalidate();
                hl.c3(new gva(jvaVar, (byte) 1));
                break;
            default:
                iva ivaVar = jvaVar.e;
                if (ivaVar != null) {
                    jvaVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((bp8) ivaVar).b;
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.r.setTranslationX(profileActivity.g2(profileActivity.B6, profileActivity.D6));
                    profileActivity.r.setTranslationY(profileActivity.h2(profileActivity.E6));
                    break;
                }
                break;
        }
    }
}
