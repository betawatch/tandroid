package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yq extends ImageView {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(ar arVar, Context context, uy uyVar) {
        super(context);
        this.c = arVar;
        this.b = uyVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ar arVar = (ar) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (arVar.n || arVar.f)) {
                    arVar.n = false;
                    arVar.f = false;
                    removeCallbacks(arVar.r);
                    removeCallbacks(arVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((uy) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(ii0 ii0Var, Context context) {
        super(context);
        this.c = ii0Var;
    }
}
