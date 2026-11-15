package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        oq0 oq0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((lb) obj).Z0(true);
                break;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.E != null && (oq0Var = photoViewer.f0) != null && i7 > 0) {
                    org.telegram.ui.Components.cc.F(oq0Var, true).j();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                if (i7 != 1) {
                    profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.e1));
                    break;
                } else {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                u91 u91Var = ((a91) obj).a;
                if (i7 != 0) {
                    u91Var.finishFragment();
                    break;
                } else {
                    u91Var.S0(false);
                    break;
                }
        }
    }
}
