package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        pq0 pq0Var;
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
                if (photoViewer.D != null && (pq0Var = photoViewer.e0) != null && i7 > 0) {
                    org.telegram.ui.Components.hc.F(pq0Var, true).j();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
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
                w91 w91Var = ((d91) obj).a;
                if (i7 != 0) {
                    w91Var.finishFragment();
                    break;
                } else {
                    w91Var.S0(false);
                    break;
                }
        }
    }
}
