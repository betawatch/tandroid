package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zq extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(br brVar, Context context, vy vyVar) {
        super(context);
        this.c = brVar;
        this.b = vyVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                br brVar = (br) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (brVar.n || brVar.f)) {
                    brVar.n = false;
                    brVar.f = false;
                    removeCallbacks(brVar.r);
                    removeCallbacks(brVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((vy) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(ii0 ii0Var, Context context) {
        super(context);
        this.c = ii0Var;
    }
}
