package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kv extends ChatActivityEnterView {
    public final /* synthetic */ yw O6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(yw ywVar, Activity activity, rw rwVar) {
        super(activity, rwVar, null, false, null);
        this.O6 = ywVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P0(float f10) {
        yw ywVar = this.O6;
        ywVar.A1.setInputBubbleHeight(f10);
        ywVar.E3();
        ywVar.F3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            yw ywVar = this.O6;
            Activity parentActivity = ywVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        yw ywVar = this.O6;
        int i7 = ywVar.U0;
        kv kvVar = ywVar.D1;
        return Math.max(1, i7 + (!TextUtils.isEmpty(kvVar == null ? "" : kvVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        yw ywVar = this.O6;
        ArrayList arrayList = ywVar.K2;
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
            long N1 = ywVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(ywVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
