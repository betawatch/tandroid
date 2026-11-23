package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ac0 extends tg.f {
    public final /* synthetic */ int h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac0(Context context, int i7) {
        super(context);
        this.h2 = i7;
    }

    @Override // org.telegram.ui.Components.pt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.h2) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.h2) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
