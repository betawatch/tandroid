package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ax extends ChatActivityEnterView {
    public final /* synthetic */ qy o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(qy qyVar, Activity activity, jy jyVar) {
        super(activity, jyVar, null, false, null);
        this.o5 = qyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        qy qyVar = this.o5;
        qyVar.y1.setInputBubbleHeight(f7);
        qyVar.s3();
        qyVar.m3();
        qyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            qy qyVar = this.o5;
            Activity parentActivity = qyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        qy qyVar = this.o5;
        int i10 = qyVar.S0;
        ax axVar = qyVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(axVar == null ? "" : axVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        qy qyVar = this.o5;
        ArrayList arrayList = qyVar.I2;
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
            long sendPaidMessagesStars = qyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(qyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
