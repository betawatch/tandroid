package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q extends wl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ hx Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(hx hxVar, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = hxVar;
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.X2) {
            case 1:
                hx hxVar = this.Y2;
                ArrayList arrayList = hxVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    a0 a0Var = (a0) getChildAt(i11);
                    int R = RecyclerView.R(a0Var);
                    a0Var.b = R;
                    boolean z10 = true;
                    a0Var.a = true;
                    a0Var.d = R == 0;
                    if (R != hxVar.y.size() - 1) {
                        z10 = false;
                    }
                    a0Var.c = z10;
                    arrayList.add(a0Var);
                }
                Collections.sort(arrayList, hxVar.w0);
                while (i10 < arrayList.size()) {
                    a0 a0Var2 = (a0) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(a0Var2.getX(), a0Var2.getY());
                    if (a0Var2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (a0Var2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(a0Var2.getScaleX(), a0Var2.getScaleY(), AndroidUtilities.dp(14.0f), a0Var2.getCy());
                    a0Var2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i10++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    hx hxVar = this.Y2;
                    if (hxVar.c0 > 0.2f || hxVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 0:
                if (!this.Y2.P.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        switch (this.X2) {
            case 1:
                ci.e4 e4Var = this.Y2.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 0:
                ArrayList arrayList = this.Y2.b0;
                super.onLayout(z10, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
