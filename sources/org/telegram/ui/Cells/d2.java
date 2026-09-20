package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.y81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                f2 f2Var = (f2) this.c;
                f2Var.g0 = f7;
                f2Var.invalidate();
                break;
            case 1:
                zn.Hc = f7;
                zn znVar = (zn) this.c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.c;
                i8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.v0 v0Var = i8Var.l0;
                if (v0Var != null && v0Var.getSearchContainer() != null) {
                    v0Var.getSearchContainer().setClipChildren(false);
                    v0Var.getSearchContainer().setClipToPadding(false);
                    v0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    v0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f10) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (v0Var.getSearchClearButton() != null) {
                        v0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f10);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f7));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f7));
                viewGroup = ((org.telegram.ui.ActionBar.f3) i8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                k00 k00Var = (k00) this.c;
                k00Var.w0 = f7;
                int i10 = k00Var.U;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.a;
                k00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.c0, f6Var)));
                ai.w0 w0Var = k00Var.F;
                w0Var.g1();
                w0Var.invalidate();
                ((k00) obj).invalidate();
                break;
            case 4:
                y81 y81Var = (y81) this.c;
                y81Var.x = f7;
                y81Var.invalidate();
                break;
            case 5:
                r91 r91Var = (r91) this.c;
                r91Var.E = f7;
                q91 q91Var = r91Var.L;
                if (q91Var != null) {
                    q91Var.a(f7);
                }
                r91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                cf0 cf0Var = ((PhotoViewer) this.c).C1;
                if (cf0Var != null) {
                    cf0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(zn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.i8) this.c).Q0);
            case 3:
                return Float.valueOf(((k00) this.c).w0);
            case 4:
                return Float.valueOf(((y81) this.c).x);
            case 5:
                return Float.valueOf(((r91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(y81 y81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = y81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(r91 r91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = r91Var;
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
    public d2(zn znVar) {
        super("", 0);
        this.b = 1;
        this.c = znVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.Components.i8 i8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = i8Var;
    }
}
