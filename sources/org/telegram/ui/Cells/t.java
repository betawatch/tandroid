package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t extends wk0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList T2;
    public f2.m0 U2;
    public int V2;

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.premiumStatusChangedGlobal) {
            w1();
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        a0();
    }

    public final void w1() {
        ArrayList arrayList = this.T2;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(pa0.values()));
        if (MessagesController.getInstance(this.V2).premiumFeaturesBlocked()) {
            int i9 = 0;
            while (i9 < arrayList.size()) {
                if (((pa0) arrayList.get(i9)).e) {
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
            }
        }
        getAdapter().l();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (g7.l6.a((pa0) arrayList.get(i10))) {
                this.U2.h1(i10, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }
}
