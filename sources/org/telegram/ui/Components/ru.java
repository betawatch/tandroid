package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ru extends us {
    public int I;
    public ArrayList J;
    public final ArrayList K = new ArrayList();
    public final /* synthetic */ su L;

    public ru(su suVar) {
        this.L = suVar;
    }

    @Override // org.telegram.ui.Components.us
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.J.size(); i12++) {
                tu tuVar = (tu) this.J.get(i12);
                if (tuVar.e != 0.0f || tuVar.d != null || tuVar.getTranslationX() != 0.0f || tuVar.getTranslationY() != 0.0f || tuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                return;
            }
            tu tuVar = (tu) arrayList.get(i10);
            tuVar.b.draw(canvas, tuVar.a[this.G]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void d(Canvas canvas, float f10) {
        k5 k5Var;
        if (this.J != null) {
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                tu tuVar = (tu) this.J.get(i10);
                t5 t5Var = tuVar.c;
                if (t5Var != null && (k5Var = (k5) this.L.y.b.get(t5Var.getDocumentId())) != null && k5Var.k != null && tuVar.b != null) {
                    k5Var.setAlpha((int) (tuVar.getAlpha() * 255.0f * f10));
                    float width = ((tuVar.getWidth() - tuVar.getPaddingLeft()) - tuVar.getPaddingRight()) / 2.0f;
                    float height = ((tuVar.getHeight() - tuVar.getPaddingTop()) - tuVar.getPaddingBottom()) / 2.0f;
                    float right = (tuVar.getRight() + tuVar.getLeft()) / 2.0f;
                    float paddingTop = tuVar.getPaddingTop() + height;
                    float f11 = tuVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    k5Var.setBounds((int) (right - ((tuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((tuVar.getScaleY() * height) * f12)), (int) ((tuVar.getScaleX() * width * f12) + right), (int) ((tuVar.getScaleY() * height * f12) + paddingTop));
                    k5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.L.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((tu) arrayList.get(i10)).a[this.G].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void i(long j10) {
        k5 k5Var;
        cv cvVar = this.L.y;
        ArrayList arrayList = this.K;
        arrayList.clear();
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            tu tuVar = (tu) this.J.get(i10);
            t5 t5Var = tuVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tuVar.a;
            if (t5Var != null && (k5Var = (k5) cvVar.b.get(t5Var.getDocumentId())) != null && k5Var.k != null) {
                k5Var.t(j10);
                jh.y2 y2Var = k5Var.k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                k5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(tuVar.getPaddingLeft() + tuVar.getLeft(), tuVar.getPaddingTop(), tuVar.getRight() - tuVar.getPaddingRight(), tuVar.getMeasuredHeight() - tuVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                if (themedColor != cvVar.Q || cvVar.P == null) {
                    cvVar.Q = themedColor;
                    cvVar.P = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                k5Var.setColorFilter(cvVar.P);
                tuVar.b = k5Var.k;
                arrayList.add(tuVar);
            }
        }
    }
}
