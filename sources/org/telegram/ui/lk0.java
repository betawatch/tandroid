package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                List list = kl0.h1;
                break;
            case 1:
                int i7 = PopupNotificationActivity.c0;
                break;
            default:
                HashSet hashSet = u91.r1;
                break;
        }
        return true;
    }
}
