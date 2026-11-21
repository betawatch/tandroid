package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g2 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i7;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                i2 i2Var = (i2) this.c;
                i2Var.i0 = f10;
                i2Var.invalidate();
                break;
            case 1:
                bn.nd = f10;
                bn bnVar = (bn) this.c;
                bnVar.j7.setSaturation(f10);
                bnVar.i7.setColorFilter(new ColorMatrixColorFilter(bnVar.j7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.c;
                f8Var.L2 = f10;
                org.telegram.ui.ActionBar.m5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.q0 q0Var = f8Var.f2;
                if (q0Var != null && q0Var.getSearchContainer() != null) {
                    q0Var.getSearchContainer().setClipChildren(false);
                    q0Var.getSearchContainer().setClipToPadding(false);
                    q0Var.getSearchContainer().setPadding(0, 0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f), 0);
                    q0Var.getSearchContainer().setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f11) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f));
                    if (q0Var.getSearchClearButton() != null) {
                        q0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f11);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                f8Var.b.invalidate();
                break;
            case 3:
                rz rzVar = (rz) this.c;
                rzVar.x0 = f10;
                int i7 = rzVar.V;
                org.telegram.ui.ActionBar.h6 h6Var = rzVar.a;
                rzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(rzVar.d0, h6Var)));
                di.b1 b1Var = rzVar.G;
                b1Var.g1();
                b1Var.invalidate();
                ((rz) obj).invalidate();
                break;
            case 4:
                k71 k71Var = (k71) this.c;
                k71Var.y = f10;
                k71Var.invalidate();
                break;
            case 5:
                f81 f81Var = (f81) this.c;
                f81Var.F = f10;
                e81 e81Var = f81Var.M;
                if (e81Var != null) {
                    e81Var.b(f10);
                }
                f81Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                rd0 rd0Var = ((PhotoViewer) this.c).D1;
                if (rd0Var != null) {
                    rd0Var.setVideoThumbFlashAlpha(f10);
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((i2) this.c).i0);
            case 1:
                return Float.valueOf(bn.nd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.f8) this.c).L2);
            case 3:
                return Float.valueOf(((rz) this.c).x0);
            case 4:
                return Float.valueOf(((k71) this.c).y);
            case 5:
                return Float.valueOf(((f81) this.c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(k71 k71Var) {
        super("progress", 0);
        this.b = 4;
        this.c = k71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(f81 f81Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = f81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(bn bnVar) {
        super("", 0);
        this.b = 1;
        this.c = bnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(org.telegram.ui.Components.f8 f8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = f8Var;
    }
}
