package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        sq0 sq0Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((mb) obj).Z0(true);
                break;
            case 1:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (sq0Var = photoViewer.e0) != null && i7 > 0) {
                    org.telegram.ui.Components.gc.F(sq0Var, true).j();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                if (i7 != 1) {
                    profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.d1));
                    break;
                } else {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                z91 z91Var = ((f91) obj).a;
                if (i7 != 0) {
                    z91Var.finishFragment();
                    break;
                } else {
                    z91Var.S0(false);
                    break;
                }
        }
    }
}
