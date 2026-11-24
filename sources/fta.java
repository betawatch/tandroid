// default package

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ita b;

    public /* synthetic */ fta(ita itaVar, byte b) {
        this.a = b;
        this.b = itaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ita itaVar = this.b;
        switch (b) {
            case 0:
                itaVar.invalidate();
                gm.c3(new fta(itaVar, (byte) 1));
                break;
            default:
                hta htaVar = itaVar.e;
                if (htaVar != null) {
                    itaVar.getVisibilityFactor();
                    ProfileActivity profileActivity = ((tn8) htaVar).b;
                    RectF rectF = ProfileActivity.e7;
                    profileActivity.r.setTranslationX(profileActivity.h2(profileActivity.G6, profileActivity.I6));
                    profileActivity.r.setTranslationY(profileActivity.i2(profileActivity.J6));
                    break;
                }
                break;
        }
    }
}
