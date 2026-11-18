package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class su extends vs {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final /* synthetic */ tu Q;

    public su(tu tuVar) {
        this.Q = tuVar;
    }

    @Override // org.telegram.ui.Components.vs
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || org.telegram.messenger.bz.o() == 0;
        if (!z11) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                uu uuVar = (uu) this.O.get(i11);
                if (uuVar.e != 0.0f || uuVar.d != null || uuVar.getTranslationX() != 0.0f || uuVar.getTranslationY() != 0.0f || uuVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i7, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            uu uuVar = (uu) arrayList.get(i7);
            uuVar.b.h(canvas, uuVar.a[this.L]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void d(Canvas canvas, float f10) {
        o5 o5Var;
        if (this.O != null) {
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                uu uuVar = (uu) this.O.get(i7);
                x5 x5Var = uuVar.c;
                if (x5Var != null && (o5Var = (o5) this.Q.E.m1.get(x5Var.getDocumentId())) != null && o5Var.k != null && uuVar.b != null) {
                    o5Var.setAlpha((int) (uuVar.getAlpha() * 255.0f * f10));
                    float width = ((uuVar.getWidth() - uuVar.getPaddingLeft()) - uuVar.getPaddingRight()) / 2.0f;
                    float height = ((uuVar.getHeight() - uuVar.getPaddingTop()) - uuVar.getPaddingBottom()) / 2.0f;
                    float right = (uuVar.getRight() + uuVar.getLeft()) / 2.0f;
                    float paddingTop = uuVar.getPaddingTop() + height;
                    float f11 = uuVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    o5Var.setBounds((int) (right - ((uuVar.getScaleX() * width) * f12)), (int) (paddingTop - ((uuVar.getScaleY() * height) * f12)), (int) ((uuVar.getScaleX() * width * f12) + right), (int) ((uuVar.getScaleY() * height * f12) + paddingTop));
                    o5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                bv bvVar = this.Q.E;
                Pattern pattern = bv.Q1;
                bvVar.b.invalidate();
                return;
            }
            ((uu) arrayList.get(i7)).a[this.L].a();
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void i(long j3) {
        o5 o5Var;
        bv bvVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            uu uuVar = (uu) this.O.get(i7);
            x5 x5Var = uuVar.c;
            org.telegram.messenger.gc[] gcVarArr = uuVar.a;
            if (x5Var != null && (o5Var = (o5) bvVar.m1.get(x5Var.getDocumentId())) != null && o5Var.k != null) {
                o5Var.s(j3);
                fi.s2 s2Var = o5Var.k;
                int i10 = this.L;
                org.telegram.messenger.gc e02 = s2Var.e0(gcVarArr[i10], i10);
                gcVarArr[i10] = e02;
                e02.c = j3;
                o5Var.setAlpha(org.telegram.messenger.ks.e4);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(uuVar.getPaddingLeft() + uuVar.getLeft(), uuVar.getPaddingTop(), uuVar.getRight() - uuVar.getPaddingRight(), uuVar.getMeasuredHeight() - uuVar.getPaddingBottom());
                gcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, bvVar.J0);
                if (w02 != bvVar.P1 || bvVar.O1 == null) {
                    bvVar.P1 = w02;
                    bvVar.O1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                o5Var.setColorFilter(bvVar.O1);
                uuVar.b = o5Var.k;
                arrayList.add(uuVar);
            }
        }
    }
}
