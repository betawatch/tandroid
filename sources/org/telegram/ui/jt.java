package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ jt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    gaVar.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((mj0) this.b).invalidate();
                break;
        }
    }
}
