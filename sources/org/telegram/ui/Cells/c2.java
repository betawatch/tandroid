package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c2 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i9, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i9;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                e2 e2Var = (e2) this.c;
                e2Var.c0 = f10;
                e2Var.invalidate();
                break;
            case 1:
                qn.Ec = f10;
                qn qnVar = (qn) this.c;
                qnVar.N6.setSaturation(f10);
                qnVar.M6.setColorFilter(new ColorMatrixColorFilter(qnVar.N6));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.c;
                c8Var.M0 = f10;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                backButton.setTranslationX(AndroidUtilities.dp(-52.0f) * f11);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.h0;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) c8Var).containerView;
                viewGroup.invalidate();
                break;
            case 3:
                vz vzVar = (vz) this.c;
                vzVar.s0 = f10;
                int i9 = vzVar.Q;
                org.telegram.ui.ActionBar.b6 b6Var = vzVar.a;
                vzVar.P.setColor(i0.a.d(f10, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(vzVar.V, b6Var)));
                gh.f1 f1Var = vzVar.B;
                f1Var.f1();
                f1Var.invalidate();
                ((vz) obj).invalidate();
                break;
            case 4:
                o71 o71Var = (o71) this.c;
                o71Var.x = f10;
                o71Var.invalidate();
                break;
            case 5:
                i81 i81Var = (i81) this.c;
                i81Var.A = f10;
                h81 h81Var = i81Var.H;
                if (h81Var != null) {
                    h81Var.b(f10);
                }
                i81Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f10);
                be0 be0Var = ((PhotoViewer) this.c).y1;
                if (be0Var != null) {
                    be0Var.setVideoThumbFlashAlpha(f10);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.c).X0 = f10;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((e2) this.c).c0);
            case 1:
                return Float.valueOf(qn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.c8) this.c).M0);
            case 3:
                return Float.valueOf(((vz) this.c).s0);
            case 4:
                return Float.valueOf(((o71) this.c).x);
            case 5:
                return Float.valueOf(((i81) this.c).A);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).X0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(o71 o71Var) {
        super("progress", 0);
        this.b = 4;
        this.c = o71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(i81 i81Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = i81Var;
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
    public c2(qn qnVar) {
        super("", 0);
        this.b = 1;
        this.c = qnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.Components.c8 c8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = c8Var;
    }
}
