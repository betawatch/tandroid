package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i7;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                h2 h2Var = (h2) this.c;
                h2Var.h0 = f10;
                h2Var.invalidate();
                break;
            case 1:
                cn.ld = f10;
                cn cnVar = (cn) this.c;
                cnVar.h7.setSaturation(f10);
                cnVar.g7.setColorFilter(new ColorMatrixColorFilter(cnVar.h7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.c;
                b8Var.H2 = f10;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.b2;
                if (r0Var != null && r0Var.getSearchContainer() != null) {
                    r0Var.getSearchContainer().setClipChildren(false);
                    r0Var.getSearchContainer().setClipToPadding(false);
                    r0Var.getSearchContainer().setPadding(0, 0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f), 0);
                    r0Var.getSearchContainer().setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f11) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f));
                    if (r0Var.getSearchClearButton() != null) {
                        r0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f11);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                b8Var.b.invalidate();
                break;
            case 3:
                fz fzVar = (fz) this.c;
                fzVar.w0 = f10;
                int i7 = fzVar.U;
                org.telegram.ui.ActionBar.g6 g6Var = fzVar.a;
                fzVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(fzVar.c0, g6Var)));
                bi.q1 q1Var = fzVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((fz) obj).invalidate();
                break;
            case 4:
                x61 x61Var = (x61) this.c;
                x61Var.y = f10;
                x61Var.invalidate();
                break;
            case 5:
                s71 s71Var = (s71) this.c;
                s71Var.E = f10;
                r71 r71Var = s71Var.L;
                if (r71Var != null) {
                    r71Var.b(f10);
                }
                s71Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                gd0 gd0Var = ((PhotoViewer) this.c).C1;
                if (gd0Var != null) {
                    gd0Var.setVideoThumbFlashAlpha(f10);
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((h2) this.c).h0);
            case 1:
                return Float.valueOf(cn.ld);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.b8) this.c).H2);
            case 3:
                return Float.valueOf(((fz) this.c).w0);
            case 4:
                return Float.valueOf(((x61) this.c).y);
            case 5:
                return Float.valueOf(((s71) this.c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(x61 x61Var) {
        super("progress", 0);
        this.b = 4;
        this.c = x61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s71 s71Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = s71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(cn cnVar) {
        super("", 0);
        this.b = 1;
        this.c = cnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = b8Var;
    }
}
