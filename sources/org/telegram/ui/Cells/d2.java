package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                a91 a91Var = (a91) this.c;
                a91Var.x = f7;
                a91Var.invalidate();
                break;
            case 5:
                t91 t91Var = (t91) this.c;
                t91Var.E = f7;
                s91 s91Var = t91Var.L;
                if (s91Var != null) {
                    s91Var.a(f7);
                }
                t91Var.invalidate();
                break;
            case 6:
                ((View) obj).setAlpha(f7);
                ff0 ff0Var = ((PhotoViewer) this.c).C1;
                if (ff0Var != null) {
                    ff0Var.setVideoThumbFlashAlpha(f7);
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
                return Float.valueOf(((a91) this.c).x);
            case 5:
                return Float.valueOf(((t91) this.c).E);
            case 6:
                return Float.valueOf(((View) obj).getAlpha());
            default:
                return Float.valueOf(((ProfileActivity) this.c).b1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(a91 a91Var) {
        super("progress", 0);
        this.b = 4;
        this.c = a91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(t91 t91Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = t91Var;
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
