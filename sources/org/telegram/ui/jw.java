package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jw extends ChatActivityEnterView {
    public final /* synthetic */ cy s5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(cy cyVar, Activity activity, tx txVar) {
        super(activity, txVar, null, false, null);
        this.s5 = cyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            cy cyVar = this.s5;
            Activity parentActivity = cyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        cy cyVar = this.s5;
        int i10 = cyVar.S0;
        jw jwVar = cyVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(jwVar == null ? "" : jwVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        cy cyVar = this.s5;
        ArrayList arrayList = cyVar.I2;
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
            long sendPaidMessagesStars = cyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(cyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        cy cyVar = this.s5;
        cyVar.y1.setInputBubbleHeight(f7);
        cyVar.A3();
        cyVar.B3();
    }
}
