package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tu extends ts {
    public int M;
    public ArrayList N;
    public final ArrayList O = new ArrayList();
    public final /* synthetic */ uu P;

    public tu(uu uuVar) {
        this.P = uuVar;
    }

    @Override // org.telegram.ui.Components.ts
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || org.telegram.messenger.tz.o() == 0;
        if (!z11) {
            for (int i12 = 0; i12 < this.N.size(); i12++) {
                vu vuVar = (vu) this.N.get(i12);
                if (vuVar.e != 0.0f || vuVar.d != null || vuVar.getTranslationX() != 0.0f || vuVar.getTranslationY() != 0.0f || vuVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.ts
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            vu vuVar = (vu) arrayList.get(i10);
            vuVar.b.h(canvas, vuVar.a[this.K]);
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void d(Canvas canvas, float f7) {
        f5 f5Var;
        if (this.N != null) {
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                vu vuVar = (vu) this.N.get(i10);
                o5 o5Var = vuVar.c;
                if (o5Var != null && (f5Var = (f5) this.P.D.i1.get(o5Var.getDocumentId())) != null && f5Var.k != null && vuVar.b != null) {
                    f5Var.setAlpha((int) (vuVar.getAlpha() * 255.0f * f7));
                    float width = ((vuVar.getWidth() - vuVar.getPaddingLeft()) - vuVar.getPaddingRight()) / 2.0f;
                    float height = ((vuVar.getHeight() - vuVar.getPaddingTop()) - vuVar.getPaddingBottom()) / 2.0f;
                    float right = (vuVar.getRight() + vuVar.getLeft()) / 2.0f;
                    float paddingTop = vuVar.getPaddingTop() + height;
                    float f10 = vuVar.e;
                    float f11 = f10 != 0.0f ? 1.0f * (((1.0f - f10) * 0.2f) + 0.8f) : 1.0f;
                    f5Var.setBounds((int) (right - ((vuVar.getScaleX() * width) * f11)), (int) (paddingTop - ((vuVar.getScaleY() * height) * f11)), (int) ((vuVar.getScaleX() * width * f11) + right), (int) ((vuVar.getScaleY() * height * f11) + paddingTop));
                    f5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                cv cvVar = this.P.D;
                Pattern pattern = cv.M1;
                cvVar.b.invalidate();
                return;
            }
            ((vu) arrayList.get(i10)).a[this.K].a();
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ts
    public final void i(long j10) {
        f5 f5Var;
        cv cvVar = this.P.D;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            vu vuVar = (vu) this.N.get(i10);
            o5 o5Var = vuVar.c;
            org.telegram.messenger.jc[] jcVarArr = vuVar.a;
            if (o5Var != null && (f5Var = (f5) cvVar.i1.get(o5Var.getDocumentId())) != null && f5Var.k != null) {
                f5Var.s(j10);
                ag.c2 c2Var = f5Var.k;
                int i11 = this.K;
                org.telegram.messenger.jc e02 = c2Var.e0(jcVarArr[i11], i11);
                jcVarArr[i11] = e02;
                e02.c = j10;
                f5Var.setAlpha(org.telegram.messenger.zs.e4);
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(vuVar.getPaddingLeft() + vuVar.getLeft(), vuVar.getPaddingTop(), vuVar.getRight() - vuVar.getPaddingRight(), vuVar.getMeasuredHeight() - vuVar.getPaddingBottom());
                jcVarArr[i11].b(rect);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cvVar.I0);
                if (w02 != cvVar.L1 || cvVar.K1 == null) {
                    cvVar.L1 = w02;
                    cvVar.K1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                f5Var.setColorFilter(cvVar.K1);
                vuVar.b = f5Var.k;
                arrayList.add(vuVar);
            }
        }
    }
}
