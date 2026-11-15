package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i7;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                h2 h2Var = (h2) this.c;
                h2Var.i0 = f10;
                h2Var.invalidate();
                break;
            case 1:
                an.md = f10;
                an anVar = (an) this.c;
                anVar.i7.setSaturation(f10);
                anVar.h7.setColorFilter(new ColorMatrixColorFilter(anVar.i7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) this.c;
                y7Var.L2 = f10;
                org.telegram.ui.ActionBar.j5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.q0 q0Var = y7Var.f2;
                if (q0Var != null && q0Var.getSearchContainer() != null) {
                    q0Var.getSearchContainer().setClipChildren(false);
                    q0Var.getSearchContainer().setClipToPadding(false);
                    q0Var.getSearchContainer().setPadding(0, 0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f), 0);
                    q0Var.getSearchContainer().setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f11) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f));
                    if (q0Var.getSearchClearButton() != null) {
                        q0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f11);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                y7Var.b.invalidate();
                break;
            case 3:
                iz izVar = (iz) this.c;
                izVar.x0 = f10;
                int i7 = izVar.V;
                org.telegram.ui.ActionBar.e6 e6Var = izVar.a;
                izVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(izVar.d0, e6Var)));
                di.c1 c1Var = izVar.G;
                c1Var.g1();
                c1Var.invalidate();
                ((iz) obj).invalidate();
                break;
            case 4:
                x61 x61Var = (x61) this.c;
                x61Var.y = f10;
                x61Var.invalidate();
                break;
            case 5:
                s71 s71Var = (s71) this.c;
                s71Var.F = f10;
                r71 r71Var = s71Var.M;
                if (r71Var != null) {
                    r71Var.c(f10);
                }
                s71Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                gd0 gd0Var = ((PhotoViewer) this.c).D1;
                if (gd0Var != null) {
                    gd0Var.setVideoThumbFlashAlpha(f10);
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((h2) this.c).i0);
            case 1:
                return Float.valueOf(an.md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.y7) this.c).L2);
            case 3:
                return Float.valueOf(((iz) this.c).x0);
            case 4:
                return Float.valueOf(((x61) this.c).y);
            case 5:
                return Float.valueOf(((s71) this.c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(x61 x61Var) {
        super("progress", 0);
        this.b = 4;
        this.c = x61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s71 s71Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = s71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(an anVar) {
        super("", 0);
        this.b = 1;
        this.c = anVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.y7 y7Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = y7Var;
    }
}
