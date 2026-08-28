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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class su extends vs {
    public int I;
    public ArrayList J;
    public final ArrayList K = new ArrayList();
    public final /* synthetic */ tu L;

    public su(tu tuVar) {
        this.L = tuVar;
    }

    @Override // org.telegram.ui.Components.vs
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i11 = 0; i11 < this.J.size(); i11++) {
                uu uuVar = (uu) this.J.get(i11);
                if (uuVar.e != 0.0f || uuVar.d != null || uuVar.getTranslationX() != 0.0f || uuVar.getTranslationY() != 0.0f || uuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i9, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i9 >= arrayList.size()) {
                return;
            }
            uu uuVar = (uu) arrayList.get(i9);
            uuVar.b.draw(canvas, uuVar.a[this.G]);
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void d(Canvas canvas, float f10) {
        k5 k5Var;
        if (this.J != null) {
            for (int i9 = 0; i9 < this.J.size(); i9++) {
                uu uuVar = (uu) this.J.get(i9);
                t5 t5Var = uuVar.c;
                if (t5Var != null && (k5Var = (k5) this.L.y.b.get(t5Var.getDocumentId())) != null && k5Var.k != null && uuVar.b != null) {
                    k5Var.setAlpha((int) (uuVar.getAlpha() * 255.0f * f10));
                    float width = ((uuVar.getWidth() - uuVar.getPaddingLeft()) - uuVar.getPaddingRight()) / 2.0f;
                    float height = ((uuVar.getHeight() - uuVar.getPaddingTop()) - uuVar.getPaddingBottom()) / 2.0f;
                    float right = (uuVar.getRight() + uuVar.getLeft()) / 2.0f;
                    float paddingTop = uuVar.getPaddingTop() + height;
                    float f11 = uuVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    k5Var.setBounds((int) (right - ((uuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((uuVar.getScaleY() * height) * f12)), (int) ((uuVar.getScaleX() * width * f12) + right), (int) ((uuVar.getScaleY() * height * f12) + paddingTop));
                    k5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        ViewGroup viewGroup;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i9 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.L.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((uu) arrayList.get(i9)).a[this.G].release();
                i9++;
            }
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void i(long j10) {
        k5 k5Var;
        dv dvVar = this.L.y;
        ArrayList arrayList = this.K;
        arrayList.clear();
        for (int i9 = 0; i9 < this.J.size(); i9++) {
            uu uuVar = (uu) this.J.get(i9);
            t5 t5Var = uuVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uuVar.a;
            if (t5Var != null && (k5Var = (k5) dvVar.b.get(t5Var.getDocumentId())) != null && k5Var.k != null) {
                k5Var.t(j10);
                ih.z2 z2Var = k5Var.k;
                int i10 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i10], i10);
                backgroundThreadDrawHolderArr[i10] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                k5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(uuVar.getPaddingLeft() + uuVar.getLeft(), uuVar.getPaddingTop(), uuVar.getRight() - uuVar.getPaddingRight(), uuVar.getMeasuredHeight() - uuVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i10].setBounds(rect);
                int themedColor = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
                if (themedColor != dvVar.Q || dvVar.P == null) {
                    dvVar.Q = themedColor;
                    dvVar.P = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                k5Var.setColorFilter(dvVar.P);
                uuVar.b = k5Var.k;
                arrayList.add(uuVar);
            }
        }
    }
}
