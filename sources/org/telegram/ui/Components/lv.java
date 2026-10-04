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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lv extends lt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ mv P;

    public lv(mv mvVar) {
        this.P = mvVar;
    }

    @Override // org.telegram.ui.Components.lt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                nv nvVar = (nv) this.N.get(i12);
                if (nvVar.e != 0.0f || nvVar.d != null || nvVar.getTranslationX() != 0.0f || nvVar.getTranslationY() != 0.0f || nvVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.lt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            nv nvVar = (nv) arrayList.get(i10);
            nvVar.b.draw(canvas, nvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void d(Canvas canvas, float f7) {
        q5 q5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                nv nvVar = (nv) this.N.get(i10);
                z5 z5Var = nvVar.c;
                if (z5Var != null && (q5Var = (q5) this.P.y.b.get(z5Var.getDocumentId())) != null && q5Var.k != null && nvVar.b != null) {
                    q5Var.setAlpha((int) (nvVar.getAlpha() * 255.0f * f7));
                    float width = ((nvVar.getWidth() - nvVar.getPaddingLeft()) - nvVar.getPaddingRight()) / 2.0f;
                    float height = ((nvVar.getHeight() - nvVar.getPaddingTop()) - nvVar.getPaddingBottom()) / 2.0f;
                    float right = (nvVar.getRight() + nvVar.getLeft()) / 2.0f;
                    float paddingTop = nvVar.getPaddingTop() + height;
                    float f10 = nvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    q5Var.setBounds((int) (right - ((nvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((nvVar.getScaleY() * height) * f11)), (int) ((nvVar.getScaleX() * width * f11) + right), (int) ((nvVar.getScaleY() * height * f11) + paddingTop));
                    q5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.P.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((nv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.lt
    public final void i(long j3) {
        q5 q5Var;
        wv wvVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            nv nvVar = (nv) this.N.get(i10);
            z5 z5Var = nvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = nvVar.a;
            if (z5Var != null && (q5Var = (q5) wvVar.b.get(z5Var.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(nvVar.getPaddingLeft() + nvVar.getLeft(), nvVar.getPaddingTop(), nvVar.getRight() - nvVar.getPaddingRight(), nvVar.getMeasuredHeight() - nvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = wvVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                if (themedColor != wvVar.U || wvVar.T == null) {
                    wvVar.U = themedColor;
                    wvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(wvVar.T);
                nvVar.b = q5Var.k;
                arrayList.add(nvVar);
            }
        }
    }
}
