package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i3, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i3;
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
                wm.kd = f10;
                wm wmVar = (wm) this.c;
                wmVar.i7.setSaturation(f10);
                wmVar.h7.setColorFilter(new ColorMatrixColorFilter(wmVar.i7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) this.c;
                z7Var.I2 = f10;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.q0 q0Var = z7Var.c2;
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
                z7Var.b.invalidate();
                break;
            case 3:
                bz bzVar = (bz) this.c;
                bzVar.x0 = f10;
                int i3 = bzVar.V;
                org.telegram.ui.ActionBar.e6 e6Var = bzVar.a;
                bzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(bzVar.d0, e6Var)));
                ci.j1 j1Var = bzVar.G;
                j1Var.g1();
                j1Var.invalidate();
                ((bz) obj).invalidate();
                break;
            case 4:
                o61 o61Var = (o61) this.c;
                o61Var.y = f10;
                o61Var.invalidate();
                break;
            case 5:
                j71 j71Var = (j71) this.c;
                j71Var.F = f10;
                i71 i71Var = j71Var.M;
                if (i71Var != null) {
                    i71Var.b(f10);
                }
                j71Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                ad0 ad0Var = ((PhotoViewer) this.c).D1;
                if (ad0Var != null) {
                    ad0Var.setVideoThumbFlashAlpha(f10);
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
                return Float.valueOf(wm.kd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.z7) this.c).I2);
            case 3:
                return Float.valueOf(((bz) this.c).x0);
            case 4:
                return Float.valueOf(((o61) this.c).y);
            case 5:
                return Float.valueOf(((j71) this.c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(o61 o61Var) {
        super("progress", 0);
        this.b = 4;
        this.c = o61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(j71 j71Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = j71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(wm wmVar) {
        super("", 0);
        this.b = 1;
        this.c = wmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.z7 z7Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = z7Var;
    }
}
