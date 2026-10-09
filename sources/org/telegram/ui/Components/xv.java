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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xv extends yt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ yv P;

    public xv(yv yvVar) {
        this.P = yvVar;
    }

    @Override // org.telegram.ui.Components.yt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                zv zvVar = (zv) this.N.get(i12);
                if (zvVar.e != 0.0f || zvVar.d != null || zvVar.getTranslationX() != 0.0f || zvVar.getTranslationY() != 0.0f || zvVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.yt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            zv zvVar = (zv) arrayList.get(i10);
            zvVar.b.draw(canvas, zvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void d(Canvas canvas, float f7) {
        s5 s5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                zv zvVar = (zv) this.N.get(i10);
                b6 b6Var = zvVar.c;
                if (b6Var != null && (s5Var = (s5) this.P.y.b.get(b6Var.getDocumentId())) != null && s5Var.k != null && zvVar.b != null) {
                    s5Var.setAlpha((int) (zvVar.getAlpha() * 255.0f * f7));
                    float width = ((zvVar.getWidth() - zvVar.getPaddingLeft()) - zvVar.getPaddingRight()) / 2.0f;
                    float height = ((zvVar.getHeight() - zvVar.getPaddingTop()) - zvVar.getPaddingBottom()) / 2.0f;
                    float right = (zvVar.getRight() + zvVar.getLeft()) / 2.0f;
                    float paddingTop = zvVar.getPaddingTop() + height;
                    float f10 = zvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    s5Var.setBounds((int) (right - ((zvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((zvVar.getScaleY() * height) * f11)), (int) ((zvVar.getScaleX() * width * f11) + right), (int) ((zvVar.getScaleY() * height * f11) + paddingTop));
                    s5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yt
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
                ((zv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void i(long j3) {
        s5 s5Var;
        iw iwVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            zv zvVar = (zv) this.N.get(i10);
            b6 b6Var = zvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = zvVar.a;
            if (b6Var != null && (s5Var = (s5) iwVar.b.get(b6Var.getDocumentId())) != null && s5Var.k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                s5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(zvVar.getPaddingLeft() + zvVar.getLeft(), zvVar.getPaddingTop(), zvVar.getRight() - zvVar.getPaddingRight(), zvVar.getMeasuredHeight() - zvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                if (themedColor != iwVar.U || iwVar.T == null) {
                    iwVar.U = themedColor;
                    iwVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                s5Var.setColorFilter(iwVar.T);
                zvVar.b = s5Var.k;
                arrayList.add(zvVar);
            }
        }
    }
}
