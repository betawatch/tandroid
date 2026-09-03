package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h extends sl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ hx V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(hx hxVar, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = hxVar;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.U2) {
            case 1:
                hx hxVar = this.V2;
                ArrayList arrayList = hxVar.M;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    o oVar = (o) getChildAt(i11);
                    int R = RecyclerView.R(oVar);
                    oVar.b = R;
                    boolean z4 = true;
                    oVar.a = true;
                    oVar.d = R == 0;
                    if (R != hxVar.y.size() - 1) {
                        z4 = false;
                    }
                    oVar.c = z4;
                    arrayList.add(oVar);
                }
                Collections.sort(arrayList, hxVar.t0);
                while (i10 < arrayList.size()) {
                    o oVar2 = (o) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(oVar2.getX(), oVar2.getY());
                    if (oVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (oVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(oVar2.getScaleX(), oVar2.getScaleY(), AndroidUtilities.dp(14.0f), oVar2.getCy());
                    oVar2.draw(canvas2);
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

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    hx hxVar = this.V2;
                    if (hxVar.W > 0.2f || hxVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.U2) {
            case 0:
                if (!this.V2.M.contains(view)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        switch (this.U2) {
            case 1:
                qh.e3 e3Var = this.V2.G;
                if (e3Var != null) {
                    e3Var.e(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                ArrayList arrayList = this.V2.V;
                super.onLayout(z4, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
