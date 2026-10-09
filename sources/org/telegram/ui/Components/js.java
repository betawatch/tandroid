package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class js extends ImageView {
    public final /* synthetic */ int a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(ls lsVar, Context context, m.f3 f3Var) {
        super(context);
        this.c = lsVar;
        this.b = f3Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ls lsVar = (ls) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (lsVar.n || lsVar.f)) {
                    lsVar.n = false;
                    lsVar.f = false;
                    removeCallbacks(lsVar.r);
                    removeCallbacks(lsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m.f3) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(kl0 kl0Var, Context context) {
        super(context);
        this.c = kl0Var;
    }
}
