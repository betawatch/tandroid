package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ jt(int i9, View view) {
        this.a = i9;
        this.b = view;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.b;
                if (i9 == NotificationCenter.emojiLoaded) {
                    baVar.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((jj0) this.b).invalidate();
                break;
        }
    }
}
