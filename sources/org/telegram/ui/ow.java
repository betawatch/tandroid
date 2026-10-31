package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ow extends ChatActivityEnterView {
    public final /* synthetic */ ay t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(ay ayVar, Activity activity, tx txVar) {
        super(activity, txVar, null, false, null);
        this.t5 = ayVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ay ayVar = this.t5;
            Activity parentActivity = ayVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        ay ayVar = this.t5;
        int i10 = ayVar.S0;
        ow owVar = ayVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(owVar == null ? "" : owVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        ay ayVar = this.t5;
        ArrayList arrayList = ayVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long M1 = ayVar.getMessagesController().M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = org.telegram.messenger.o5.k(ayVar.getMessagesController().H2(longValue));
            }
            j10 += M1;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        ay ayVar = this.t5;
        ayVar.y1.setInputBubbleHeight(f7);
        ayVar.D3();
        ayVar.E3();
    }
}
