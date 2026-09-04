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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gv extends gt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ hv P;

    public gv(hv hvVar) {
        this.P = hvVar;
    }

    @Override // org.telegram.ui.Components.gt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                iv ivVar = (iv) this.N.get(i12);
                if (ivVar.e != 0.0f || ivVar.d != null || ivVar.getTranslationX() != 0.0f || ivVar.getTranslationY() != 0.0f || ivVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            iv ivVar = (iv) arrayList.get(i10);
            ivVar.b.draw(canvas, ivVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void d(Canvas canvas, float f7) {
        q5 q5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                iv ivVar = (iv) this.N.get(i10);
                z5 z5Var = ivVar.c;
                if (z5Var != null && (q5Var = (q5) this.P.y.b.get(z5Var.getDocumentId())) != null && q5Var.k != null && ivVar.b != null) {
                    q5Var.setAlpha((int) (ivVar.getAlpha() * 255.0f * f7));
                    float width = ((ivVar.getWidth() - ivVar.getPaddingLeft()) - ivVar.getPaddingRight()) / 2.0f;
                    float height = ((ivVar.getHeight() - ivVar.getPaddingTop()) - ivVar.getPaddingBottom()) / 2.0f;
                    float right = (ivVar.getRight() + ivVar.getLeft()) / 2.0f;
                    float paddingTop = ivVar.getPaddingTop() + height;
                    float f10 = ivVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    q5Var.setBounds((int) (right - ((ivVar.getScaleX() * width) * f11)), (int) (paddingTop - ((ivVar.getScaleY() * height) * f11)), (int) ((ivVar.getScaleX() * width * f11) + right), (int) ((ivVar.getScaleY() * height * f11) + paddingTop));
                    q5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.gt
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
                ((iv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void i(long j3) {
        q5 q5Var;
        rv rvVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            iv ivVar = (iv) this.N.get(i10);
            z5 z5Var = ivVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ivVar.a;
            if (z5Var != null && (q5Var = (q5) rvVar.b.get(z5Var.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                bi.y3 y3Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(ivVar.getPaddingLeft() + ivVar.getLeft(), ivVar.getPaddingTop(), ivVar.getRight() - ivVar.getPaddingRight(), ivVar.getMeasuredHeight() - ivVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != rvVar.U || rvVar.T == null) {
                    rvVar.U = themedColor;
                    rvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(rvVar.T);
                ivVar.b = q5Var.k;
                arrayList.add(ivVar);
            }
        }
    }
}
