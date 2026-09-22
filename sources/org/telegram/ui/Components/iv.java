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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class iv extends ht {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ jv P;

    public iv(jv jvVar) {
        this.P = jvVar;
    }

    @Override // org.telegram.ui.Components.ht
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                kv kvVar = (kv) this.N.get(i12);
                if (kvVar.e != 0.0f || kvVar.d != null || kvVar.getTranslationX() != 0.0f || kvVar.getTranslationY() != 0.0f || kvVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.ht
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            kv kvVar = (kv) arrayList.get(i10);
            kvVar.b.draw(canvas, kvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void d(Canvas canvas, float f7) {
        p5 p5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                kv kvVar = (kv) this.N.get(i10);
                y5 y5Var = kvVar.c;
                if (y5Var != null && (p5Var = (p5) this.P.y.b.get(y5Var.getDocumentId())) != null && p5Var.k != null && kvVar.b != null) {
                    p5Var.setAlpha((int) (kvVar.getAlpha() * 255.0f * f7));
                    float width = ((kvVar.getWidth() - kvVar.getPaddingLeft()) - kvVar.getPaddingRight()) / 2.0f;
                    float height = ((kvVar.getHeight() - kvVar.getPaddingTop()) - kvVar.getPaddingBottom()) / 2.0f;
                    float right = (kvVar.getRight() + kvVar.getLeft()) / 2.0f;
                    float paddingTop = kvVar.getPaddingTop() + height;
                    float f10 = kvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    p5Var.setBounds((int) (right - ((kvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((kvVar.getScaleY() * height) * f11)), (int) ((kvVar.getScaleX() * width * f11) + right), (int) ((kvVar.getScaleY() * height * f11) + paddingTop));
                    p5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ht
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
                ((kv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void i(long j3) {
        p5 p5Var;
        tv tvVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            kv kvVar = (kv) this.N.get(i10);
            y5 y5Var = kvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = kvVar.a;
            if (y5Var != null && (p5Var = (p5) tvVar.b.get(y5Var.getDocumentId())) != null && p5Var.k != null) {
                p5Var.t(j3);
                ai.l4 l4Var = p5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                p5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(kvVar.getPaddingLeft() + kvVar.getLeft(), kvVar.getPaddingTop(), kvVar.getRight() - kvVar.getPaddingRight(), kvVar.getMeasuredHeight() - kvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = tvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                if (themedColor != tvVar.U || tvVar.T == null) {
                    tvVar.U = themedColor;
                    tvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(tvVar.T);
                kvVar.b = p5Var.k;
                arrayList.add(kvVar);
            }
        }
    }
}
