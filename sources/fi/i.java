package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class i extends ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ tv g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(tv tvVar, Context context, int i7) {
        super(context, null);
        this.f3 = i7;
        this.g3 = tvVar;
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f3) {
            case 1:
                tv tvVar = this.g3;
                ArrayList arrayList = tvVar.Q;
                arrayList.clear();
                int i7 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    p pVar = (p) getChildAt(i10);
                    int R = RecyclerView.R(pVar);
                    pVar.b = R;
                    boolean z10 = true;
                    pVar.a = true;
                    pVar.d = R == 0;
                    if (R != tvVar.E.size() - 1) {
                        z10 = false;
                    }
                    pVar.c = z10;
                    arrayList.add(pVar);
                }
                Collections.sort(arrayList, tvVar.x0);
                while (i7 < arrayList.size()) {
                    p pVar2 = (p) arrayList.get(i7);
                    int save = canvas.save();
                    canvas.translate(pVar2.getX(), pVar2.getY());
                    if (pVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), (int) (pVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(pVar2.getScaleX(), pVar2.getScaleY(), org.telegram.messenger.g0.L(14.0f), pVar2.getCy());
                    pVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i7++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    tv tvVar = this.g3;
                    if (tvVar.d0 > 0.2f || tvVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f3) {
            case 0:
                if (!this.g3.Q.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void l0(int i7) {
        switch (this.f3) {
            case 1:
                hi.l3 l3Var = this.g3.K;
                if (l3Var != null) {
                    l3Var.f(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f3) {
            case 0:
                ArrayList arrayList = this.g3.c0;
                super.onLayout(z10, i7, i10, i11, i12);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((Runnable) arrayList.get(i13)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
