package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ hy0(ProfileActivity profileActivity, String str, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                qf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + str);
                break;
            default:
                int i12 = ProfileActivity.R6;
                qf.d.r(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + str);
                break;
        }
    }
}
