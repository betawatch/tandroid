package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        tt0 tt0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((pb) obj).V0(true);
                break;
            case 1:
                qn qnVar = ((cn) obj).a;
                if (i9 > 0 && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.oc.a0(qnVar).m(org.telegram.ui.Components.nc.E, i9, 0, 0, qnVar.aa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).k0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (tt0Var = photoViewer.a0) != null && i9 > 0) {
                    org.telegram.ui.Components.oc.F(tt0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i9 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.a1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                we1 we1Var = ((ae1) obj).a;
                if (i9 != 0) {
                    we1Var.finishFragment();
                    break;
                } else {
                    we1Var.O0(false);
                    break;
                }
        }
    }
}
