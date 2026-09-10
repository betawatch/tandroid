package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.w81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c2 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                e2 e2Var = (e2) this.c;
                e2Var.g0 = f7;
                e2Var.invalidate();
                break;
            case 1:
                eo.Ic = f7;
                eo eoVar = (eo) this.c;
                eoVar.R6.setSaturation(f7);
                eoVar.Q6.setColorFilter(new ColorMatrixColorFilter(eoVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.l5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.l0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    w0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    w0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f10) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f10);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                viewGroup = ((org.telegram.ui.ActionBar.h3) j8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                r00 r00Var = (r00) this.c;
                r00Var.w0 = f7;
                int i10 = r00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = r00Var.a;
                r00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(r00Var.c0, f6Var)));
                bi.y1 y1Var = r00Var.F;
                y1Var.e1();
                y1Var.invalidate();
                ((r00) obj).invalidate();
                break;
            case 4:
                w81 w81Var = (w81) this.c;
                w81Var.x = f7;
                w81Var.invalidate();
                break;
            case 5:
                q91 q91Var = (q91) this.c;
                q91Var.E = f7;
                p91 p91Var = q91Var.L;
                if (p91Var != null) {
                    p91Var.a(f7);
                }
                q91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                df0 df0Var = ((PhotoViewer) this.c).C1;
                if (df0Var != null) {
                    df0Var.setVideoThumbFlashAlpha(f7);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.c).b1 = f7;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((e2) this.c).g0);
            case 1:
                return Float.valueOf(eo.Ic);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.j8) this.c).Q0);
            case 3:
                return Float.valueOf(((r00) this.c).w0);
            case 4:
                return Float.valueOf(((w81) this.c).x);
            case 5:
                return Float.valueOf(((q91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(w81 w81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = w81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(q91 q91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = q91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.b = 7;
        this.c = profileActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(eo eoVar) {
        super("", 0);
        this.b = 1;
        this.c = eoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = j8Var;
    }
}
