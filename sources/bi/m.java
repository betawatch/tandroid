package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m extends ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ lx Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(lx lxVar, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = lxVar;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.X2) {
            case 1:
                lx lxVar = this.Y2;
                ArrayList arrayList = lxVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    u uVar = (u) getChildAt(i11);
                    int R = RecyclerView.R(uVar);
                    uVar.b = R;
                    boolean z10 = true;
                    uVar.a = true;
                    uVar.d = R == 0;
                    if (R != lxVar.y.size() - 1) {
                        z10 = false;
                    }
                    uVar.c = z10;
                    arrayList.add(uVar);
                }
                Collections.sort(arrayList, lxVar.w0);
                while (i10 < arrayList.size()) {
                    u uVar2 = (u) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(uVar2.getX(), uVar2.getY());
                    if (uVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (uVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(uVar2.getScaleX(), uVar2.getScaleY(), AndroidUtilities.dp(14.0f), uVar2.getCy());
                    uVar2.draw(canvas2);
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

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    lx lxVar = this.Y2;
                    if (lxVar.c0 > 0.2f || lxVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
                di.f4 f4Var = this.Y2.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
