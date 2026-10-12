package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                f2 f2Var = (f2) this.c;
                f2Var.g0 = f7;
                f2Var.invalidate();
                break;
            case 1:
                fo.Ic = f7;
                fo foVar = (fo) this.c;
                foVar.R6.setSaturation(f7);
                foVar.Q6.setColorFilter(new ColorMatrixColorFilter(foVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.l0;
                if (u0Var != null && u0Var.getSearchContainer() != null) {
                    u0Var.getSearchContainer().setClipChildren(false);
                    u0Var.getSearchContainer().setClipToPadding(false);
                    u0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    u0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f10) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (u0Var.getSearchClearButton() != null) {
                        u0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f10);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                viewGroup = ((org.telegram.ui.ActionBar.e3) m8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                w00 w00Var = (w00) this.c;
                w00Var.w0 = f7;
                int i10 = w00Var.U;
                org.telegram.ui.ActionBar.c6 c6Var = w00Var.a;
                w00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(w00Var.c0, c6Var)));
                bi.o0 o0Var = w00Var.F;
                o0Var.f1();
                o0Var.invalidate();
                ((w00) obj).invalidate();
                break;
            case 4:
                l91 l91Var = (l91) this.c;
                l91Var.x = f7;
                l91Var.invalidate();
                break;
            case 5:
                ea1 ea1Var = (ea1) this.c;
                ea1Var.E = f7;
                da1 da1Var = ea1Var.L;
                if (da1Var != null) {
                    da1Var.b(f7);
                }
                ea1Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                tf0 tf0Var = ((PhotoViewer) this.c).C1;
                if (tf0Var != null) {
                    tf0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(((f2) this.c).g0);
            case 1:
                return Float.valueOf(fo.Ic);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.m8) this.c).Q0);
            case 3:
                return Float.valueOf(((w00) this.c).w0);
            case 4:
                return Float.valueOf(((l91) this.c).x);
            case 5:
                return Float.valueOf(((ea1) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(l91 l91Var) {
        super("progress", 0);
        this.b = 4;
        this.c = l91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(ea1 ea1Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = ea1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.b = 7;
        this.c = profileActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(fo foVar) {
        super("", 0);
        this.b = 1;
        this.c = foVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = m8Var;
    }
}
