// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class go8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ go8(ProfileActivity profileActivity, String str, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                l11.u(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.e7;
                l11.u(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
        }
    }
}
