package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                an.jd = f10;
                an anVar = (an) this.c;
                anVar.h7.setSaturation(f10);
                anVar.g7.setColorFilter(new ColorMatrixColorFilter(anVar.h7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.c;
                b8Var.H2 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
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
                org.telegram.ui.ActionBar.f6 f6Var = fzVar.a;
                fzVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(fzVar.c0, f6Var)));
                bi.q1 q1Var = fzVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((fz) obj).invalidate();
                break;
            case 4:
                w61 w61Var = (w61) this.c;
                w61Var.y = f10;
                w61Var.invalidate();
                break;
            case 5:
                r71 r71Var = (r71) this.c;
                r71Var.E = f10;
                q71 q71Var = r71Var.L;
                if (q71Var != null) {
                    q71Var.b(f10);
                }
                r71Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                fd0 fd0Var = ((PhotoViewer) this.c).C1;
                if (fd0Var != null) {
                    fd0Var.setVideoThumbFlashAlpha(f10);
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
                return Float.valueOf(an.jd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.b8) this.c).H2);
            case 3:
                return Float.valueOf(((fz) this.c).w0);
            case 4:
                return Float.valueOf(((w61) this.c).y);
            case 5:
                return Float.valueOf(((r71) this.c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(w61 w61Var) {
        super("progress", 0);
        this.b = 4;
        this.c = w61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(r71 r71Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = r71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(an anVar) {
        super("", 0);
        this.b = 1;
        this.c = anVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.b8 b8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = b8Var;
    }
}
