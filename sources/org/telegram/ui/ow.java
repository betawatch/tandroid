package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ow extends ChatActivityEnterView {
    public final /* synthetic */ dy j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(dy dyVar, Activity activity, vx vxVar) {
        super(activity, vxVar, null, false, null);
        this.j5 = dyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        if (motionEvent.getAction() == 0) {
            dy dyVar = this.j5;
            Activity parentActivity = dyVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i9);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        dy dyVar = this.j5;
        int i9 = dyVar.O0;
        ow owVar = dyVar.x1;
        return Math.max(1, i9 + (!TextUtils.isEmpty(owVar == null ? "" : owVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        dy dyVar = this.j5;
        ArrayList arrayList = dyVar.E2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i9 = 0;
        long j10 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = dyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(dyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void z0(float f10) {
        dy dyVar = this.j5;
        dyVar.u1.setInputBubbleHeight(f10);
        dyVar.s3();
        dyVar.m3();
        dyVar.t3();
    }
}
