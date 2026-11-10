package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ lu0(ProfileActivity profileActivity, String str, int i7) {
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
                RectF rectF = ProfileActivity.V6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.V6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                break;
        }
    }
}
