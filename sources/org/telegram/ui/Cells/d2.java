package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.x81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                f2 f2Var = (f2) this.c;
                f2Var.g0 = f7;
                f2Var.invalidate();
                break;
            case 1:
                wn.Hc = f7;
                wn wnVar = (wn) this.c;
                wnVar.R6.setSaturation(f7);
                wnVar.Q6.setColorFilter(new ColorMatrixColorFilter(wnVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.l0;
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
                viewGroup = ((org.telegram.ui.ActionBar.e3) j8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                l00 l00Var = (l00) this.c;
                l00Var.w0 = f7;
                int i10 = l00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = l00Var.a;
                l00Var.T.setColor(i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(l00Var.c0, d6Var)));
                ai.w0 w0Var = l00Var.F;
                w0Var.f1();
                w0Var.invalidate();
                ((l00) obj).invalidate();
                break;
            case 4:
                x81 x81Var = (x81) this.c;
                x81Var.x = f7;
                x81Var.invalidate();
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
                ef0 ef0Var = ((PhotoViewer) this.c).C1;
                if (ef0Var != null) {
                    ef0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(wn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.j8) this.c).Q0);
            case 3:
                return Float.valueOf(((l00) this.c).w0);
            case 4:
                return Float.valueOf(((x81) this.c).x);
            case 5:
                return Float.valueOf(((q91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(x81 x81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = x81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(q91 q91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = q91Var;
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
    public d2(wn wnVar) {
        super("", 0);
        this.b = 1;
        this.c = wnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = j8Var;
    }
}
