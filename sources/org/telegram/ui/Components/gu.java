package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gu extends is {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final /* synthetic */ hu Q;

    public gu(hu huVar) {
        this.Q = huVar;
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || org.telegram.messenger.az.o() == 0;
        if (!z11) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                iu iuVar = (iu) this.O.get(i11);
                if (iuVar.e != 0.0f || iuVar.d != null || iuVar.getTranslationX() != 0.0f || iuVar.getTranslationY() != 0.0f || iuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i3, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i3 >= arrayList.size()) {
                return;
            }
            iu iuVar = (iu) arrayList.get(i3);
            iuVar.b.h(canvas, iuVar.a[this.L]);
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        g5 g5Var;
        if (this.O != null) {
            for (int i3 = 0; i3 < this.O.size(); i3++) {
                iu iuVar = (iu) this.O.get(i3);
                p5 p5Var = iuVar.c;
                if (p5Var != null && (g5Var = (g5) this.Q.E.j1.get(p5Var.getDocumentId())) != null && g5Var.k != null && iuVar.b != null) {
                    g5Var.setAlpha((int) (iuVar.getAlpha() * 255.0f * f10));
                    float width = ((iuVar.getWidth() - iuVar.getPaddingLeft()) - iuVar.getPaddingRight()) / 2.0f;
                    float height = ((iuVar.getHeight() - iuVar.getPaddingTop()) - iuVar.getPaddingBottom()) / 2.0f;
                    float right = (iuVar.getRight() + iuVar.getLeft()) / 2.0f;
                    float paddingTop = iuVar.getPaddingTop() + height;
                    float f11 = iuVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    g5Var.setBounds((int) (right - ((iuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((iuVar.getScaleY() * height) * f12)), (int) ((iuVar.getScaleX() * width * f12) + right), (int) ((iuVar.getScaleY() * height * f12) + paddingTop));
                    g5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i3 >= arrayList.size()) {
                pu puVar = this.Q.E;
                Pattern pattern = pu.N1;
                puVar.b.invalidate();
                return;
            }
            ((iu) arrayList.get(i3)).a[this.L].a();
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void i(long j10) {
        g5 g5Var;
        pu puVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            iu iuVar = (iu) this.O.get(i3);
            p5 p5Var = iuVar.c;
            org.telegram.messenger.bc[] bcVarArr = iuVar.a;
            if (p5Var != null && (g5Var = (g5) puVar.j1.get(p5Var.getDocumentId())) != null && g5Var.k != null) {
                g5Var.s(j10);
                ei.c3 c3Var = g5Var.k;
                int i10 = this.L;
                org.telegram.messenger.bc e02 = c3Var.e0(bcVarArr[i10], i10);
                bcVarArr[i10] = e02;
                e02.c = j10;
                g5Var.setAlpha(org.telegram.messenger.hs.e4);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(iuVar.getPaddingLeft() + iuVar.getLeft(), iuVar.getPaddingTop(), iuVar.getRight() - iuVar.getPaddingRight(), iuVar.getMeasuredHeight() - iuVar.getPaddingBottom());
                bcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, puVar.J0);
                if (w02 != puVar.M1 || puVar.L1 == null) {
                    puVar.M1 = w02;
                    puVar.L1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                g5Var.setColorFilter(puVar.L1);
                iuVar.b = g5Var.k;
                arrayList.add(iuVar);
            }
        }
    }
}
