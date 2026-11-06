package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jv extends ChatActivityEnterView {
    public final /* synthetic */ ww t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(ww wwVar, Activity activity, pw pwVar) {
        super(activity, pwVar, null, false, null);
        this.t5 = wwVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        ww wwVar = this.t5;
        wwVar.y1.setInputBubbleHeight(f10);
        wwVar.E3();
        wwVar.F3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            ww wwVar = this.t5;
            Activity parentActivity = wwVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        ww wwVar = this.t5;
        int i7 = wwVar.S0;
        jv jvVar = wwVar.B1;
        return Math.max(1, i7 + (!TextUtils.isEmpty(jvVar == null ? "" : jvVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        ww wwVar = this.t5;
        ArrayList arrayList = wwVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            long N1 = wwVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(wwVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
