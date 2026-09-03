package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b2 extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                d2 d2Var = (d2) this.c;
                d2Var.d0 = f10;
                d2Var.invalidate();
                break;
            case 1:
                zn.Fc = f10;
                zn znVar = (zn) this.c;
                znVar.O6.setSaturation(f10);
                znVar.N6.setColorFilter(new ColorMatrixColorFilter(znVar.O6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.i0;
                if (w0Var != null && w0Var.getSearchContainer() != null) {
                    w0Var.getSearchContainer().setClipChildren(false);
                    w0Var.getSearchContainer().setClipToPadding(false);
                    w0Var.getSearchContainer().setPadding(0, 0, AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 0);
                    w0Var.getSearchContainer().setTranslationX((AndroidUtilities.dp(-52.0f) * f11) + AndroidUtilities.dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f));
                    if (w0Var.getSearchClearButton() != null) {
                        w0Var.getSearchClearButton().setTranslationX(AndroidUtilities.dp(52.0f) * f11);
                    }
                }
                backButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
                backButton.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f10));
                viewGroup = ((org.telegram.ui.ActionBar.g3) c8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                k00 k00Var = (k00) this.c;
                k00Var.t0 = f10;
                int i10 = k00Var.R;
                org.telegram.ui.ActionBar.f6 f6Var = k00Var.a;
                k00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(k00Var.W, f6Var)));
                lh.e1 e1Var = k00Var.C;
                e1Var.e1();
                e1Var.invalidate();
                ((k00) obj).invalidate();
                break;
            case 4:
                m81 m81Var = (m81) this.c;
                m81Var.x = f10;
                m81Var.invalidate();
                break;
            case 5:
                h91 h91Var = (h91) this.c;
                h91Var.B = f10;
                g91 g91Var = h91Var.I;
                if (g91Var != null) {
                    g91Var.a(f10);
                }
                h91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f10);
                ze0 ze0Var = ((PhotoViewer) this.c).z1;
                if (ze0Var != null) {
                    ze0Var.setVideoThumbFlashAlpha(f10);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.c).Y0 = f10;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((d2) this.c).d0);
            case 1:
                return Float.valueOf(zn.Fc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.c8) this.c).N0);
            case 3:
                return Float.valueOf(((k00) this.c).t0);
            case 4:
                return Float.valueOf(((m81) this.c).x);
            case 5:
                return Float.valueOf(((h91) this.c).B);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).Y0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(m81 m81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = m81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(h91 h91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = h91Var;
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
    public b2(zn znVar) {
        super("", 0);
        this.b = 1;
        this.c = znVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = c8Var;
    }
}
