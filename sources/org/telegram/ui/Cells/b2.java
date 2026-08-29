package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b2 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                d2 d2Var = (d2) this.c;
                d2Var.c0 = f9;
                d2Var.invalidate();
                break;
            case 1:
                tn.Ec = f9;
                tn tnVar = (tn) this.c;
                tnVar.N6.setSaturation(f9);
                tnVar.M6.setColorFilter(new ColorMatrixColorFilter(tnVar.N6));
                break;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.c;
                g8Var.M0 = f9;
                org.telegram.ui.ActionBar.h5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f10 = 1.0f - f9;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.h0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    w0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    w0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f10) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f10);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f9));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f9));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f9));
                viewGroup = ((org.telegram.ui.ActionBar.f3) g8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                f00 f00Var = (f00) this.c;
                f00Var.s0 = f9;
                int i10 = f00Var.Q;
                org.telegram.ui.ActionBar.c6 c6Var = f00Var.a;
                f00Var.P.setColor(i0.a.d(f9, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(f00Var.V, c6Var)));
                jh.e1 e1Var = f00Var.B;
                e1Var.f1();
                e1Var.invalidate();
                ((f00) obj).invalidate();
                break;
            case 4:
                a81 a81Var = (a81) this.c;
                a81Var.x = f9;
                a81Var.invalidate();
                break;
            case 5:
                u81 u81Var = (u81) this.c;
                u81Var.A = f9;
                t81 t81Var = u81Var.H;
                if (t81Var != null) {
                    t81Var.a(f9);
                }
                u81Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f9);
                pe0 pe0Var = ((PhotoViewer) this.c).y1;
                if (pe0Var != null) {
                    pe0Var.setVideoThumbFlashAlpha(f9);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.c).X0 = f9;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((d2) this.c).c0);
            case 1:
                return Float.valueOf(tn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.g8) this.c).M0);
            case 3:
                return Float.valueOf(((f00) this.c).s0);
            case 4:
                return Float.valueOf(((a81) this.c).x);
            case 5:
                return Float.valueOf(((u81) this.c).A);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).X0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(a81 a81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = a81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(u81 u81Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = u81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ProfileActivity profileActivity) {
        super("headerShadow", 0);
        this.b = 7;
        this.c = profileActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(tn tnVar) {
        super("", 0);
        this.b = 1;
        this.c = tnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.Components.g8 g8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = g8Var;
    }
}
