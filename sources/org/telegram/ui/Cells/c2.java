package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c2 extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                e2 e2Var = (e2) this.c;
                e2Var.g0 = f7;
                e2Var.invalidate();
                break;
            case 1:
                xn.Hc = f7;
                xn xnVar = (xn) this.c;
                xnVar.R6.setSaturation(f7);
                xnVar.Q6.setColorFilter(new ColorMatrixColorFilter(xnVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.c;
                j8Var.Q0 = f7;
                org.telegram.ui.ActionBar.i5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.l0;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) j8Var).containerView;
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
                i81 i81Var = (i81) this.c;
                i81Var.x = f7;
                i81Var.invalidate();
                break;
            case 5:
                d91 d91Var = (d91) this.c;
                d91Var.E = f7;
                c91 c91Var = d91Var.L;
                if (c91Var != null) {
                    c91Var.a(f7);
                }
                d91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                ue0 ue0Var = ((PhotoViewer) this.c).C1;
                if (ue0Var != null) {
                    ue0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(xn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.j8) this.c).Q0);
            case 3:
                return Float.valueOf(((l00) this.c).w0);
            case 4:
                return Float.valueOf(((i81) this.c).x);
            case 5:
                return Float.valueOf(((d91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(i81 i81Var) {
        super("progress", 0);
        this.b = 4;
        this.c = i81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d91 d91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = d91Var;
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
    public c2(org.telegram.ui.Components.j8 j8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = j8Var;
    }
}
