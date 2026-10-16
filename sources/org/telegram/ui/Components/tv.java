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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tv extends vt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ uv P;

    public tv(uv uvVar) {
        this.P = uvVar;
    }

    @Override // org.telegram.ui.Components.vt
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                vv vvVar = (vv) this.N.get(i12);
                if (vvVar.e != 0.0f || vvVar.d != null || vvVar.getTranslationX() != 0.0f || vvVar.getTranslationY() != 0.0f || vvVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.vt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            vv vvVar = (vv) arrayList.get(i10);
            vvVar.b.draw(canvas, vvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void d(Canvas canvas, float f7) {
        s5 s5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                vv vvVar = (vv) this.N.get(i10);
                b6 b6Var = vvVar.c;
                if (b6Var != null && (s5Var = (s5) this.P.y.b.get(b6Var.getDocumentId())) != null && s5Var.k != null && vvVar.b != null) {
                    s5Var.setAlpha((int) (vvVar.getAlpha() * 255.0f * f7));
                    float width = ((vvVar.getWidth() - vvVar.getPaddingLeft()) - vvVar.getPaddingRight()) / 2.0f;
                    float height = ((vvVar.getHeight() - vvVar.getPaddingTop()) - vvVar.getPaddingBottom()) / 2.0f;
                    float right = (vvVar.getRight() + vvVar.getLeft()) / 2.0f;
                    float paddingTop = vvVar.getPaddingTop() + height;
                    float f10 = vvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    s5Var.setBounds((int) (right - ((vvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((vvVar.getScaleY() * height) * f11)), (int) ((vvVar.getScaleX() * width * f11) + right), (int) ((vvVar.getScaleY() * height * f11) + paddingTop));
                    s5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.e3) this.P.y).containerView;
                viewGroup.invalidate();
                return;
            } else {
                ((vv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void i(long j10) {
        s5 s5Var;
        ew ewVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            vv vvVar = (vv) this.N.get(i10);
            b6 b6Var = vvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = vvVar.a;
            if (b6Var != null && (s5Var = (s5) ewVar.b.get(b6Var.getDocumentId())) != null && s5Var.k != null) {
                s5Var.t(j10);
                bi.b4 b4Var = s5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = b4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                s5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(vvVar.getPaddingLeft() + vvVar.getLeft(), vvVar.getPaddingTop(), vvVar.getRight() - vvVar.getPaddingRight(), vvVar.getMeasuredHeight() - vvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                if (themedColor != ewVar.U || ewVar.T == null) {
                    ewVar.U = themedColor;
                    ewVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                s5Var.setColorFilter(ewVar.T);
                vvVar.b = s5Var.k;
                arrayList.add(vvVar);
            }
        }
    }
}
