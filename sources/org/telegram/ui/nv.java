package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nv extends ChatActivityEnterView {
    public final /* synthetic */ cx o7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(cx cxVar, Activity activity, vw vwVar) {
        super(activity, vwVar, null, false, null);
        this.o7 = cxVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void X0(float f10) {
        cx cxVar = this.o7;
        cxVar.A1.setInputBubbleHeight(f10);
        cxVar.E3();
        cxVar.F3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            cx cxVar = this.o7;
            Activity parentActivity = cxVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) cxVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        cx cxVar = this.o7;
        int i7 = cxVar.U0;
        nv nvVar = cxVar.D1;
        return Math.max(1, i7 + (!TextUtils.isEmpty(nvVar == null ? "" : nvVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        cx cxVar = this.o7;
        ArrayList arrayList = cxVar.K2;
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
            long P1 = cxVar.getMessagesController().P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(cxVar.getMessagesController().P2(longValue));
            }
            j3 += P1;
        }
        return j3;
    }
}
