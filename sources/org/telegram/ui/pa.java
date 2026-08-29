package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        rt0 rt0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((ob) obj).V0(true);
                break;
            case 1:
                tn tnVar = ((fn) obj).a;
                if (i10 > 0 && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
                    org.telegram.ui.Components.tc.a0(tnVar).m(org.telegram.ui.Components.sc.E, i10, 0, 0, tnVar.aa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (rt0Var = photoViewer.a0) != null && i10 > 0) {
                    org.telegram.ui.Components.tc.F(rt0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.a1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                ze1 ze1Var = ((ce1) obj).a;
                if (i10 != 0) {
                    ze1Var.finishFragment();
                    break;
                } else {
                    ze1Var.O0(false);
                    break;
                }
        }
    }
}
