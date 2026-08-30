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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bv extends et {
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final /* synthetic */ cv M;

    public bv(cv cvVar) {
        this.M = cvVar;
    }

    @Override // org.telegram.ui.Components.et
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z4 = true;
        boolean z10 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z10) {
            for (int i12 = 0; i12 < this.K.size(); i12++) {
                dv dvVar = (dv) this.K.get(i12);
                if (dvVar.e != 0.0f || dvVar.d != null || dvVar.getTranslationX() != 0.0f || dvVar.getTranslationY() != 0.0f || dvVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z4 = z10;
        if (!z4) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.et
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            dv dvVar = (dv) arrayList.get(i10);
            dvVar.b.draw(canvas, dvVar.a[this.H]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void d(Canvas canvas, float f10) {
        l5 l5Var;
        if (this.K != null) {
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                dv dvVar = (dv) this.K.get(i10);
                u5 u5Var = dvVar.c;
                if (u5Var != null && (l5Var = (l5) this.M.y.b.get(u5Var.getDocumentId())) != null && l5Var.k != null && dvVar.b != null) {
                    l5Var.setAlpha((int) (dvVar.getAlpha() * 255.0f * f10));
                    float width = ((dvVar.getWidth() - dvVar.getPaddingLeft()) - dvVar.getPaddingRight()) / 2.0f;
                    float height = ((dvVar.getHeight() - dvVar.getPaddingTop()) - dvVar.getPaddingBottom()) / 2.0f;
                    float right = (dvVar.getRight() + dvVar.getLeft()) / 2.0f;
                    float paddingTop = dvVar.getPaddingTop() + height;
                    float f11 = dvVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    l5Var.setBounds((int) (right - ((dvVar.getScaleX() * width) * f12)), (int) (paddingTop - ((dvVar.getScaleY() * height) * f12)), (int) ((dvVar.getScaleX() * width * f12) + right), (int) ((dvVar.getScaleY() * height * f12) + paddingTop));
                    l5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) this.M.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((dv) arrayList.get(i10)).a[this.H].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void i(long j10) {
        l5 l5Var;
        mv mvVar = this.M.y;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            dv dvVar = (dv) this.K.get(i10);
            u5 u5Var = dvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = dvVar.a;
            if (u5Var != null && (l5Var = (l5) mvVar.b.get(u5Var.getDocumentId())) != null && l5Var.k != null) {
                l5Var.t(j10);
                nh.y2 y2Var = l5Var.k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                l5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(dvVar.getPaddingLeft() + dvVar.getLeft(), dvVar.getPaddingTop(), dvVar.getRight() - dvVar.getPaddingRight(), dvVar.getMeasuredHeight() - dvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != mvVar.R || mvVar.Q == null) {
                    mvVar.R = themedColor;
                    mvVar.Q = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                l5Var.setColorFilter(mvVar.Q);
                dvVar.b = l5Var.k;
                arrayList.add(dvVar);
            }
        }
    }
}
