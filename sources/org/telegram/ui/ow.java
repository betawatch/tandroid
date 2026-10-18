package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ow extends ChatActivityEnterView {
    public final /* synthetic */ ey o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(ey eyVar, Activity activity, wx wxVar) {
        super(activity, wxVar, null, false, null);
        this.o5 = eyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ey eyVar = this.o5;
            Activity parentActivity = eyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) eyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        ey eyVar = this.o5;
        int i10 = eyVar.S0;
        ow owVar = eyVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(owVar == null ? "" : owVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        ey eyVar = this.o5;
        ArrayList arrayList = eyVar.I2;
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
            long sendPaidMessagesStars = eyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(eyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        ey eyVar = this.o5;
        eyVar.y1.setInputBubbleHeight(f7);
        eyVar.q3();
        eyVar.j3();
        eyVar.r3();
    }
}
