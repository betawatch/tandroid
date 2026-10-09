package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ia1;
import org.telegram.ui.Components.ja1;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.t6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.t6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                f2 f2Var = (f2) this.c;
                f2Var.g0 = f7;
                f2Var.invalidate();
                break;
            case 1:
                zn.Ic = f7;
                zn znVar = (zn) this.c;
                znVar.R6.setSaturation(f7);
                znVar.Q6.setColorFilter(new ColorMatrixColorFilter(znVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.c;
                l8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.l0;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) l8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                a10 a10Var = (a10) this.c;
                a10Var.w0 = f7;
                int i10 = a10Var.U;
                org.telegram.ui.ActionBar.e6 e6Var = a10Var.a;
                a10Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(a10Var.c0, e6Var)));
                ai.w0 w0Var = a10Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((a10) obj).invalidate();
                break;
            case 4:
                p91 p91Var = (p91) this.c;
                p91Var.x = f7;
                p91Var.invalidate();
                break;
            case 5:
                ja1 ja1Var = (ja1) this.c;
                ja1Var.E = f7;
                ia1 ia1Var = ja1Var.L;
                if (ia1Var != null) {
                    ia1Var.a(f7);
                }
                ja1Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                vf0 vf0Var = ((PhotoViewer) this.c).C1;
                if (vf0Var != null) {
                    vf0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(zn.Ic);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.l8) this.c).Q0);
            case 3:
                return Float.valueOf(((a10) this.c).w0);
            case 4:
                return Float.valueOf(((p91) this.c).x);
            case 5:
                return Float.valueOf(((ja1) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(p91 p91Var) {
        super("progress", 0);
        this.b = 4;
        this.c = p91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(ja1 ja1Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = ja1Var;
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
    public d2(org.telegram.ui.Components.l8 l8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = l8Var;
    }
}
