package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j extends wk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ vw U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(vw vwVar, Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        this.U2 = vwVar;
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.T2) {
            case 1:
                vw vwVar = this.U2;
                ArrayList arrayList = vwVar.L;
                arrayList.clear();
                int i9 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    q qVar = (q) getChildAt(i10);
                    int R = RecyclerView.R(qVar);
                    qVar.b = R;
                    boolean z10 = true;
                    qVar.a = true;
                    qVar.d = R == 0;
                    if (R != vwVar.y.size() - 1) {
                        z10 = false;
                    }
                    qVar.c = z10;
                    arrayList.add(qVar);
                }
                Collections.sort(arrayList, vwVar.s0);
                while (i9 < arrayList.size()) {
                    q qVar2 = (q) arrayList.get(i9);
                    int save = canvas.save();
                    canvas.translate(qVar2.getX(), qVar2.getY());
                    if (qVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (qVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(qVar2.getScaleX(), qVar2.getScaleY(), AndroidUtilities.dp(14.0f), qVar2.getCy());
                    qVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i9++;
                    canvas = canvas2;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    vw vwVar = this.U2;
                    if (vwVar.V > 0.2f || vwVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 0:
                if (!this.U2.L.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i9, int i10) {
        switch (this.T2) {
            case 1:
                kh.x3 x3Var = this.U2.F;
                if (x3Var != null) {
                    x3Var.e(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.T2) {
            case 0:
                ArrayList arrayList = this.U2.U;
                super.onLayout(z10, i9, i10, i11, i12);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((Runnable) arrayList.get(i13)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
