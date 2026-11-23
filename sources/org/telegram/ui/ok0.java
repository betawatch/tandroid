package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok0 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                List list = ml0.h1;
                break;
            case 1:
                int i7 = PopupNotificationActivity.c0;
                break;
            default:
                HashSet hashSet = y91.s1;
                break;
        }
        return true;
    }
}
