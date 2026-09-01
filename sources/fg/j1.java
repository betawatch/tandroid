package fg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ka;
import org.telegram.ui.rw0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j1 implements m2.f {
    public final /* synthetic */ ka a;
    public final /* synthetic */ n1 b;

    public j1(n1 n1Var, ka kaVar) {
        this.b = n1Var;
        this.a = kaVar;
    }

    @Override // m2.f
    public final void a(int i10) {
        n1 n1Var = this.b;
        ArrayList arrayList = n1Var.d;
        if (((rw0) arrayList.get(i10)).a == 0) {
            n1Var.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).a == 14) {
            n1Var.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).a == 40) {
            n1Var.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).a == 28) {
            n1Var.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            n1Var.K.requestLayout();
        }
        d();
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        ka kaVar = this.a;
        kaVar.b = f10;
        kaVar.c = i10;
        kaVar.invalidate();
        n1 n1Var = this.b;
        n1Var.D = i10;
        n1Var.E = i11 > 0 ? i10 + 1 : i10 - 1;
        n1Var.F = f10;
        d();
    }

    public final void d() {
        int i10;
        int i11;
        n1 n1Var = this.b;
        h1 h1Var = n1Var.n;
        ArrayList arrayList = n1Var.d;
        int i12 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i12 >= h1Var.getChildCount()) {
                break;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i12);
            if (!n1Var.w || !(m1Var.f instanceof z0)) {
                int i13 = m1Var.a;
                x0 x0Var = m1Var.e;
                if (i13 == n1Var.D) {
                    f10 = (-m1Var.getMeasuredWidth()) * n1Var.F;
                    x0Var.setOffset(f10);
                } else if (i13 == n1Var.E) {
                    f10 = ((-m1Var.getMeasuredWidth()) * n1Var.F) + m1Var.getMeasuredWidth();
                    x0Var.setOffset(f10);
                } else {
                    x0Var.setOffset(m1Var.getMeasuredWidth());
                }
            }
            if (m1Var.f instanceof z0) {
                m1Var.setTranslationX(-f10);
                m1Var.b.setTranslationX(f10);
                m1Var.c.setTranslationX(f10);
            }
            i12++;
        }
        int i14 = n1Var.D;
        boolean z4 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((rw0) arrayList.get(n1Var.D)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = n1Var.E;
        boolean z10 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((rw0) arrayList.get(n1Var.E)).a) == 0 || i10 == 14 || i10 == 28);
        if (z4 && z10) {
            n1Var.f = 1.0f;
            float f11 = n1Var.F;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            n1Var.e = f11;
            n1Var.h = true;
        } else if (z4) {
            float f12 = 1.0f - n1Var.F;
            n1Var.e = f12;
            n1Var.f = f12;
            n1Var.h = true;
        } else if (z10) {
            float f13 = n1Var.F;
            n1Var.e = f13;
            n1Var.f = f13;
            n1Var.h = false;
        } else {
            n1Var.e = 0.0f;
            n1Var.f = 0.0f;
            n1Var.h = true;
        }
        int i16 = (int) ((1.0f - n1Var.e) * 255.0f);
        if (i16 != n1Var.H) {
            n1Var.H = i16;
            n1Var.r.invalidate();
            AndroidUtilities.runOnUIThread(new eh.m(this, 6));
        }
    }

    @Override // m2.f
    public final void c(int i10) {
    }
}
