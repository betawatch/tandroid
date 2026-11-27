// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jg3 extends d79 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ ii3 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg3(ii3 ii3Var, Context context, byte b) {
        super(context, null);
        this.f3 = b;
        this.g3 = ii3Var;
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f3) {
            case 1:
                ii3 ii3Var = this.g3;
                ArrayList arrayList = ii3Var.Q;
                arrayList.clear();
                int i = 0;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    og3 og3Var = (og3) getChildAt(i2);
                    int S = RecyclerView.S(og3Var);
                    og3Var.b = S;
                    boolean z = true;
                    og3Var.a = true;
                    og3Var.d = S == 0;
                    if (S != ii3Var.E.size() - 1) {
                        z = false;
                    }
                    og3Var.c = z;
                    arrayList.add(og3Var);
                }
                Collections.sort(arrayList, ii3Var.x0);
                while (i < arrayList.size()) {
                    og3 og3Var2 = (og3) arrayList.get(i);
                    int save = canvas.save();
                    canvas.translate(og3Var2.getX(), og3Var2.getY());
                    if (og3Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-hl.L(4.0f), -hl.L(4.0f), hl.L(50.0f), hl.L(50.0f), (int) (og3Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(og3Var2.getScaleX(), og3Var2.getScaleY(), hl.L(14.0f), og3Var2.getCy());
                    og3Var2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    ii3 ii3Var = this.g3;
                    if (ii3Var.d0 > 0.2f || ii3Var.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 0:
                if (!this.g3.Q.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        switch (this.f3) {
            case 1:
                kg5 kg5Var = this.g3.K;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    break;
                }
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 0:
                ArrayList arrayList = this.g3.c0;
                super.onLayout(z, i, i2, i3, i4);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((Runnable) arrayList.get(i5)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
