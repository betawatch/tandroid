package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ax extends ChatActivityEnterView {
    public final /* synthetic */ py k5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(py pyVar, Activity activity, iy iyVar) {
        super(activity, iyVar, null, false, null);
        this.k5 = pyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        py pyVar = this.k5;
        pyVar.v1.setInputBubbleHeight(f10);
        pyVar.s3();
        pyVar.m3();
        pyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            py pyVar = this.k5;
            Activity parentActivity = pyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        py pyVar = this.k5;
        int i10 = pyVar.P0;
        ax axVar = pyVar.y1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(axVar == null ? "" : axVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        py pyVar = this.k5;
        ArrayList arrayList = pyVar.F2;
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
            long sendPaidMessagesStars = pyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(pyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
