package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec1;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b2 extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                d2 d2Var = (d2) this.c;
                d2Var.g0 = f7;
                d2Var.invalidate();
                break;
            case 1:
                un.cd = f7;
                un unVar = (un) this.c;
                unVar.d7.setSaturation(f7);
                unVar.c7.setColorFilter(new ColorMatrixColorFilter(unVar.d7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.c;
                m8Var.Q0 = f7;
                org.telegram.ui.ActionBar.b6 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f10);
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.k0;
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
                viewGroup = ((org.telegram.ui.ActionBar.k3) m8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                s00 s00Var = (s00) this.c;
                s00Var.w0 = f7;
                int i10 = s00Var.U;
                org.telegram.ui.ActionBar.u6 u6Var = s00Var.a;
                s00Var.T.setColor(i0.a.f(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(s00Var.c0, u6Var)));
                bi.r1 r1Var = s00Var.F;
                r1Var.g1();
                r1Var.invalidate();
                ((s00) obj).invalidate();
                break;
            case 4:
                v91 v91Var = (v91) this.c;
                v91Var.x = f7;
                v91Var.invalidate();
                break;
            case 5:
                fc1 fc1Var = (fc1) this.c;
                fc1Var.E = f7;
                ec1 ec1Var = fc1Var.L;
                if (ec1Var != null) {
                    ec1Var.a(f7);
                }
                fc1Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                of0 of0Var = ((PhotoViewer) this.c).C1;
                if (of0Var != null) {
                    of0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(((d2) this.c).g0);
            case 1:
                return Float.valueOf(un.cd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.m8) this.c).Q0);
            case 3:
                return Float.valueOf(((s00) this.c).w0);
            case 4:
                return Float.valueOf(((v91) this.c).x);
            case 5:
                return Float.valueOf(((fc1) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(v91 v91Var) {
        super("progress", 0);
        this.b = 4;
        this.c = v91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(fc1 fc1Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = fc1Var;
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
    public b2(un unVar) {
        super("", 0);
        this.b = 1;
        this.c = unVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.Components.m8 m8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = m8Var;
    }
}
