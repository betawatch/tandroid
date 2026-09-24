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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class jv extends jt {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ kv P;

    public jv(kv kvVar) {
        this.P = kvVar;
    }

    @Override // org.telegram.ui.Components.jt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                lv lvVar = (lv) this.N.get(i12);
                if (lvVar.e != 0.0f || lvVar.d != null || lvVar.getTranslationX() != 0.0f || lvVar.getTranslationY() != 0.0f || lvVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.jt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            lv lvVar = (lv) arrayList.get(i10);
            lvVar.b.draw(canvas, lvVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void d(Canvas canvas, float f7) {
        q5 q5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                lv lvVar = (lv) this.N.get(i10);
                z5 z5Var = lvVar.c;
                if (z5Var != null && (q5Var = (q5) this.P.y.b.get(z5Var.getDocumentId())) != null && q5Var.k != null && lvVar.b != null) {
                    q5Var.setAlpha((int) (lvVar.getAlpha() * 255.0f * f7));
                    float width = ((lvVar.getWidth() - lvVar.getPaddingLeft()) - lvVar.getPaddingRight()) / 2.0f;
                    float height = ((lvVar.getHeight() - lvVar.getPaddingTop()) - lvVar.getPaddingBottom()) / 2.0f;
                    float right = (lvVar.getRight() + lvVar.getLeft()) / 2.0f;
                    float paddingTop = lvVar.getPaddingTop() + height;
                    float f10 = lvVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    q5Var.setBounds((int) (right - ((lvVar.getScaleX() * width) * f11)), (int) (paddingTop - ((lvVar.getScaleY() * height) * f11)), (int) ((lvVar.getScaleX() * width * f11) + right), (int) ((lvVar.getScaleY() * height * f11) + paddingTop));
                    q5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.jt
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
                ((lv) arrayList.get(i10)).a[this.K].release();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void i(long j3) {
        q5 q5Var;
        uv uvVar = this.P.y;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            lv lvVar = (lv) this.N.get(i10);
            z5 z5Var = lvVar.c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = lvVar.a;
            if (z5Var != null && (q5Var = (q5) uvVar.b.get(z5Var.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                q5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(lvVar.getPaddingLeft() + lvVar.getLeft(), lvVar.getPaddingTop(), lvVar.getRight() - lvVar.getPaddingRight(), lvVar.getMeasuredHeight() - lvVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = uvVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                if (themedColor != uvVar.U || uvVar.T == null) {
                    uvVar.U = themedColor;
                    uvVar.T = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                q5Var.setColorFilter(uvVar.T);
                lvVar.b = q5Var.k;
                arrayList.add(lvVar);
            }
        }
    }
}
