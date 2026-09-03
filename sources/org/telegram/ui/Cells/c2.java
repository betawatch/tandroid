package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c2 extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                e2 e2Var = (e2) this.c;
                e2Var.d0 = f10;
                e2Var.invalidate();
                break;
            case 1:
                xn.Fc = f10;
                xn xnVar = (xn) this.c;
                xnVar.O6.setSaturation(f10);
                xnVar.N6.setColorFilter(new ColorMatrixColorFilter(xnVar.O6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.c;
                c8Var.N0 = f10;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar.getTitleTextView();
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
                viewGroup = ((org.telegram.ui.ActionBar.h3) c8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                l00 l00Var = (l00) this.c;
                l00Var.t0 = f10;
                int i10 = l00Var.R;
                org.telegram.ui.ActionBar.g6 g6Var = l00Var.a;
                l00Var.Q.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(l00Var.W, g6Var)));
                mh.d1 d1Var = l00Var.C;
                d1Var.e1();
                d1Var.invalidate();
                ((l00) obj).invalidate();
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
                af0 af0Var = ((PhotoViewer) this.c).z1;
                if (af0Var != null) {
                    af0Var.setVideoThumbFlashAlpha(f10);
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
                return Float.valueOf(((e2) this.c).d0);
            case 1:
                return Float.valueOf(xn.Fc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.c8) this.c).N0);
            case 3:
                return Float.valueOf(((l00) this.c).t0);
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
    public c2(m81 m81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = m81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(h91 h91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = h91Var;
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
    public c2(xn xnVar) {
        super("", 0);
        this.b = 1;
        this.c = xnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = c8Var;
    }
}
