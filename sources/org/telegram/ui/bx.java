package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bx extends ChatActivityEnterView {
    public final /* synthetic */ qy k5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(qy qyVar, Activity activity, jy jyVar) {
        super(activity, jyVar, null, false, null);
        this.k5 = qyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        qy qyVar = this.k5;
        qyVar.v1.setInputBubbleHeight(f10);
        qyVar.s3();
        qyVar.m3();
        qyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            qy qyVar = this.k5;
            Activity parentActivity = qyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        qy qyVar = this.k5;
        int i10 = qyVar.P0;
        bx bxVar = qyVar.y1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(bxVar == null ? "" : bxVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        qy qyVar = this.k5;
        ArrayList arrayList = qyVar.F2;
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
            long sendPaidMessagesStars = qyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(qyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
