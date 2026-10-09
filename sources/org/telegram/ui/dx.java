package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dx extends ChatActivityEnterView {
    public final /* synthetic */ ty o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(ty tyVar, Activity activity, my myVar) {
        super(activity, myVar, null, false, null);
        this.o5 = tyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ty tyVar = this.o5;
            Activity parentActivity = tyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        ty tyVar = this.o5;
        int i10 = tyVar.S0;
        dx dxVar = tyVar.B1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(dxVar == null ? "" : dxVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        ty tyVar = this.o5;
        ArrayList arrayList = tyVar.I2;
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
            long sendPaidMessagesStars = tyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(tyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        ty tyVar = this.o5;
        tyVar.y1.setInputBubbleHeight(f7);
        tyVar.p3();
        tyVar.j3();
        tyVar.q3();
    }
}
