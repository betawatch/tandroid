package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gx extends ChatActivityEnterView {
    public final /* synthetic */ wy o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(wy wyVar, Activity activity, py pyVar) {
        super(activity, pyVar, null, false, null);
        this.o5 = wyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(float f7) {
        wy wyVar = this.o5;
        wyVar.y1.setInputBubbleHeight(f7);
        wyVar.s3();
        wyVar.m3();
        wyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            wy wyVar = this.o5;
            Activity parentActivity = wyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) wyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        wy wyVar = this.o5;
        int i10 = wyVar.S0;
        gx gxVar = wyVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(gxVar == null ? "" : gxVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        wy wyVar = this.o5;
        ArrayList arrayList = wyVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = wyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(wyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
