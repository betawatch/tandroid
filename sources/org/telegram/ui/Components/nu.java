package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nu extends os {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final /* synthetic */ ou Q;

    public nu(ou ouVar) {
        this.Q = ouVar;
    }

    @Override // org.telegram.ui.Components.os
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 3 || org.telegram.messenger.gz.o() == 0;
        if (!z11) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                pu puVar = (pu) this.O.get(i11);
                if (puVar.e != 0.0f || puVar.d != null || puVar.getTranslationX() != 0.0f || puVar.getTranslationY() != 0.0f || puVar.getAlpha() != 1.0f) {
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

    @Override // org.telegram.ui.Components.os
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            pu puVar = (pu) arrayList.get(i7);
            puVar.b.h(canvas, puVar.a[this.L]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void d(Canvas canvas, float f10) {
        g5 g5Var;
        if (this.O != null) {
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                pu puVar = (pu) this.O.get(i7);
                p5 p5Var = puVar.c;
                if (p5Var != null && (g5Var = (g5) this.Q.E.m1.get(p5Var.getDocumentId())) != null && g5Var.k != null && puVar.b != null) {
                    g5Var.setAlpha((int) (puVar.getAlpha() * 255.0f * f10));
                    float width = ((puVar.getWidth() - puVar.getPaddingLeft()) - puVar.getPaddingRight()) / 2.0f;
                    float height = ((puVar.getHeight() - puVar.getPaddingTop()) - puVar.getPaddingBottom()) / 2.0f;
                    float right = (puVar.getRight() + puVar.getLeft()) / 2.0f;
                    float paddingTop = puVar.getPaddingTop() + height;
                    float f11 = puVar.e;
                    float f12 = f11 != 0.0f ? 1.0f * (((1.0f - f11) * 0.2f) + 0.8f) : 1.0f;
                    g5Var.setBounds((int) (right - ((puVar.getScaleX() * width) * f12)), (int) (paddingTop - ((puVar.getScaleY() * height) * f12)), (int) ((puVar.getScaleX() * width * f12) + right), (int) ((puVar.getScaleY() * height * f12) + paddingTop));
                    g5Var.draw(canvas);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                wu wuVar = this.Q.E;
                Pattern pattern = wu.Q1;
                wuVar.b.invalidate();
                return;
            }
            ((pu) arrayList.get(i7)).a[this.L].a();
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void i(long j3) {
        g5 g5Var;
        wu wuVar = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            pu puVar = (pu) this.O.get(i7);
            p5 p5Var = puVar.c;
            org.telegram.messenger.hc[] hcVarArr = puVar.a;
            if (p5Var != null && (g5Var = (g5) wuVar.m1.get(p5Var.getDocumentId())) != null && g5Var.k != null) {
                g5Var.s(j3);
                fi.u2 u2Var = g5Var.k;
                int i10 = this.L;
                org.telegram.messenger.hc e02 = u2Var.e0(hcVarArr[i10], i10);
                hcVarArr[i10] = e02;
                e02.c = j3;
                g5Var.setAlpha(org.telegram.messenger.ns.e4);
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(puVar.getPaddingLeft() + puVar.getLeft(), puVar.getPaddingTop(), puVar.getRight() - puVar.getPaddingRight(), puVar.getMeasuredHeight() - puVar.getPaddingBottom());
                hcVarArr[i10].b(rect);
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, wuVar.J0);
                if (w02 != wuVar.P1 || wuVar.O1 == null) {
                    wuVar.P1 = w02;
                    wuVar.O1 = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                g5Var.setColorFilter(wuVar.O1);
                puVar.b = g5Var.k;
                arrayList.add(puVar);
            }
        }
    }
}
