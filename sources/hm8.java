// default package

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ hm8(ProfileActivity profileActivity, String str, byte b) {
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
                RectF rectF = ProfileActivity.Z6;
                d01.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                d01.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                break;
        }
    }
}
