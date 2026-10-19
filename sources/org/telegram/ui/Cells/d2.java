package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w91;
import org.telegram.ui.Components.x91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                f2 f2Var = (f2) this.c;
                f2Var.g0 = f7;
                f2Var.invalidate();
                break;
            case 1:
                qn.Jc = f7;
                qn qnVar = (qn) this.c;
                qnVar.R6.setSaturation(f7);
                qnVar.Q6.setColorFilter(new ColorMatrixColorFilter(qnVar.R6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.c;
                k8Var.Q0 = f7;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.l0;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) k8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                s00 s00Var = (s00) this.c;
                s00Var.w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.d6 d6Var = s00Var.a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(s00Var.c0, d6Var)));
                ai.u1 u1Var = s00Var.F;
                u1Var.f1();
                u1Var.invalidate();
                ((s00) obj).invalidate();
                break;
            case 4:
                e91 e91Var = (e91) this.c;
                e91Var.x = f7;
                e91Var.invalidate();
                break;
            case 5:
                x91 x91Var = (x91) this.c;
                x91Var.E = f7;
                w91 w91Var = x91Var.L;
                if (w91Var != null) {
                    w91Var.b(f7);
                }
                x91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                nf0 nf0Var = ((PhotoViewer) this.c).C1;
                if (nf0Var != null) {
                    nf0Var.setVideoThumbFlashAlpha(f7);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.c).c1 = f7;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((f2) this.c).g0);
            case 1:
                return Float.valueOf(qn.Jc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.k8) this.c).Q0);
            case 3:
                return Float.valueOf(((s00) this.c).w0);
            case 4:
                return Float.valueOf(((e91) this.c).x);
            case 5:
                return Float.valueOf(((x91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).c1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e91 e91Var) {
        super("progress", 0);
        this.b = 4;
        this.c = e91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(x91 x91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = x91Var;
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
    public d2(qn qnVar) {
        super("", 0);
        this.b = 1;
        this.c = qnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.Components.k8 k8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = k8Var;
    }
}
