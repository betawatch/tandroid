package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.w61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.k6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i7;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.k6
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
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) this.c;
                a8Var.K2 = f10;
                org.telegram.ui.ActionBar.m5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.r0 r0Var = a8Var.e2;
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
                a8Var.b.invalidate();
                break;
            case 3:
                ez ezVar = (ez) this.c;
                ezVar.w0 = f10;
                int i7 = ezVar.U;
                org.telegram.ui.ActionBar.h6 h6Var = ezVar.a;
                ezVar.T.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(ezVar.c0, h6Var)));
                bi.q1 q1Var = ezVar.F;
                q1Var.g1();
                q1Var.invalidate();
                ((ez) obj).invalidate();
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
                return Float.valueOf(cn.ld);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.a8) this.c).K2);
            case 3:
                return Float.valueOf(((ez) this.c).w0);
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
    public f2(cn cnVar) {
        super("", 0);
        this.b = 1;
        this.c = cnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.a8 a8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = a8Var;
    }
}
