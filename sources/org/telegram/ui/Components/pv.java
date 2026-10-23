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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pv extends qt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ qv P;

    public pv(qv qvVar) {
        this.P = qvVar;
    }

    @Override // org.telegram.ui.Components.qt
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                rv rvVar = (rv) this.N.get(i12);
                if (rvVar.e != 0.0f || rvVar.d != null || rvVar.getTranslationX() != 0.0f || rvVar.getTranslationY() != 0.0f || rvVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.qt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            rv rvVar = (rv) arrayList.get(i10);
            rvVar.b.draw(canvas, rvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void d(Canvas canvas, float f7) {
        r5 r5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                rv rvVar = (rv) this.N.get(i10);
                a6 a6Var = rvVar.c;
                if (a6Var != null && (r5Var = (r5) this.P.y.b.get(a6Var.getDocumentId())) != null && r5Var.k != null && rvVar.b != null) {
                    r5Var.setAlpha((int) (rvVar.getAlpha() * 255.0f * f7));
                    float width = ((rvVar.getWidth() - rvVar.getPaddingLeft()) - rvVar.getPaddingRight()) / 2.0f;
                    float height = ((rvVar.getHeight() - rvVar.getPaddingTop()) - rvVar.getPaddingBottom()) / 2.0f;
                    float right = (rvVar.getRight() + rvVar.getLeft()) / 2.0f;
                    float paddingTop = rvVar.getPaddingTop() + height;
                    float f10 = rvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    r5Var.setBounds((int) (right - ((rvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((rvVar.getScaleY() * height) * f11)), (int) ((rvVar.getScaleX() * width * f11) + right), (int) ((rvVar.getScaleY() * height * f11) + paddingTop));
                    r5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) this.P.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((rv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void i(long j10) {
        r5 r5Var;
        aw awVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            rv rvVar = (rv) this.N.get(i10);
            a6 a6Var = rvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = rvVar.a;
            if (a6Var != null && (r5Var = (r5) awVar.b.get(a6Var.getDocumentId())) != null && r5Var.k != null) {
                r5Var.t(j10);
                ci.f3 f3Var = r5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                r5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(rvVar.getPaddingLeft() + rvVar.getLeft(), rvVar.getPaddingTop(), rvVar.getRight() - rvVar.getPaddingRight(), rvVar.getMeasuredHeight() - rvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
                if (themedColor != awVar.U || awVar.T == null) {
                    awVar.U = themedColor;
                    awVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                r5Var.setColorFilter(awVar.T);
                rvVar.b = r5Var.k;
                arrayList.add(rvVar);
            }
        }
    }
}
