package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ iu0(ProfileActivity profileActivity, String str, int i7) {
        this.a = i7;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.S6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.S6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
        }
    }
}
