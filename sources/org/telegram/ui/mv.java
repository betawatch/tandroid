package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mv extends ChatActivityEnterView {
    public final /* synthetic */ zw t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(zw zwVar, Activity activity, sw swVar) {
        super(activity, swVar, null, false, null);
        this.t5 = zwVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        zw zwVar = this.t5;
        zwVar.z1.setInputBubbleHeight(f10);
        zwVar.E3();
        zwVar.F3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            zw zwVar = this.t5;
            Activity parentActivity = zwVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        zw zwVar = this.t5;
        int i7 = zwVar.T0;
        mv mvVar = zwVar.C1;
        return Math.max(1, i7 + (!TextUtils.isEmpty(mvVar == null ? "" : mvVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        zw zwVar = this.t5;
        ArrayList arrayList = zwVar.J2;
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
            long N1 = zwVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(zwVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
