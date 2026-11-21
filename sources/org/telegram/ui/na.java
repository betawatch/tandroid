package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements org.telegram.messenger.nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        qq0 qq0Var;
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
                if (photoViewer.E != null && (qq0Var = photoViewer.f0) != null && i7 > 0) {
                    org.telegram.ui.Components.lc.F(qq0Var, true).j();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
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
                y91 y91Var = ((e91) obj).a;
                if (i7 != 0) {
                    y91Var.finishFragment();
                    break;
                } else {
                    y91Var.S0(false);
                    break;
                }
        }
    }
}
