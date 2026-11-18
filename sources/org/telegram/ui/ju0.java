package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ ju0(ProfileActivity profileActivity, String str, int i7) {
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
                RectF rectF = ProfileActivity.Z6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().X2 + "/nft/" + str);
                break;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                vf.c.t(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().X2 + "/nft/" + str);
                break;
        }
    }
}
