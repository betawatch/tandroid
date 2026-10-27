package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ jy0(ProfileActivity profileActivity, String str, int i10) {
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
