package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class tr extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(vr vrVar, Context context, n2.e eVar) {
        super(context);
        this.c = vrVar;
        this.b = eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                vr vrVar = (vr) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (vrVar.n || vrVar.f)) {
                    vrVar.n = false;
                    vrVar.f = false;
                    removeCallbacks(vrVar.r);
                    removeCallbacks(vrVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n2.e) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(qk0 qk0Var, Context context) {
        super(context);
        this.c = qk0Var;
    }
}
