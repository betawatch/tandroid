package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zq extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(br brVar, Context context, y00 y00Var) {
        super(context);
        this.c = brVar;
        this.b = y00Var;
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
                return ((GestureDetector) ((y00) this.b).a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(li0 li0Var, Context context) {
        super(context);
        this.c = li0Var;
    }
}
