package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mv extends ChatActivityEnterView {
    public final /* synthetic */ bx t7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(bx bxVar, Activity activity, uw uwVar) {
        super(activity, uwVar, null, false, null);
        this.t7 = bxVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(float f10) {
        bx bxVar = this.t7;
        bxVar.A1.setInputBubbleHeight(f10);
        bxVar.E3();
        bxVar.F3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            bx bxVar = this.t7;
            Activity parentActivity = bxVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        bx bxVar = this.t7;
        int i7 = bxVar.U0;
        mv mvVar = bxVar.D1;
        return Math.max(1, i7 + (!TextUtils.isEmpty(mvVar == null ? "" : mvVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        bx bxVar = this.t7;
        ArrayList arrayList = bxVar.K2;
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
            long P1 = bxVar.getMessagesController().P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(bxVar.getMessagesController().P2(longValue));
            }
            j3 += P1;
        }
        return j3;
    }
}
