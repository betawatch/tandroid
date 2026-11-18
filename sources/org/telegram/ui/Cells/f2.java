package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i7, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i7;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                h2 h2Var = (h2) this.c;
                h2Var.i0 = f10;
                h2Var.invalidate();
                break;
            case 1:
                bn.nd = f10;
                bn bnVar = (bn) this.c;
                bnVar.j7.setSaturation(f10);
                bnVar.i7.setColorFilter(new ColorMatrixColorFilter(bnVar.j7));
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.c;
                g8Var.L2 = f10;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar.getTitleTextView();
                ImageView backButton = kVar.getBackButton();
                float f11 = 1.0f - f10;
                titleTextView.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                backButton.setTranslationX(org.telegram.messenger.g0.L(-52.0f) * f11);
                org.telegram.ui.ActionBar.r0 r0Var = g8Var.f2;
                if (r0Var != null && r0Var.getSearchContainer() != null) {
                    r0Var.getSearchContainer().setClipChildren(false);
                    r0Var.getSearchContainer().setClipToPadding(false);
                    r0Var.getSearchContainer().setPadding(0, 0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f), 0);
                    r0Var.getSearchContainer().setTranslationX((org.telegram.messenger.g0.L(-52.0f) * f11) + org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 74.0f : 66.0f));
                    if (r0Var.getSearchClearButton() != null) {
                        r0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.g0.L(52.0f) * f11);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10));
                backButton.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f10));
                g8Var.b.invalidate();
                break;
            case 3:
                pz pzVar = (pz) this.c;
                pzVar.x0 = f10;
                int i7 = pzVar.V;
                org.telegram.ui.ActionBar.i6 i6Var = pzVar.a;
                pzVar.U.setColor(i0.a.f(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(pzVar.d0, i6Var)));
                di.b1 b1Var = pzVar.G;
                b1Var.g1();
                b1Var.invalidate();
                ((pz) obj).invalidate();
                break;
            case 4:
                h71 h71Var = (h71) this.c;
                h71Var.y = f10;
                h71Var.invalidate();
                break;
            case 5:
                c81 c81Var = (c81) this.c;
                c81Var.F = f10;
                b81 b81Var = c81Var.M;
                if (b81Var != null) {
                    b81Var.b(f10);
                }
                c81Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f10);
                qd0 qd0Var = ((PhotoViewer) this.c).D1;
                if (qd0Var != null) {
                    qd0Var.setVideoThumbFlashAlpha(f10);
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
                return Float.valueOf(bn.nd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.g8) this.c).L2);
            case 3:
                return Float.valueOf(((pz) this.c).x0);
            case 4:
                return Float.valueOf(((h71) this.c).y);
            case 5:
                return Float.valueOf(((c81) this.c).F);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(h71 h71Var) {
        super("progress", 0);
        this.b = 4;
        this.c = h71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(c81 c81Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = c81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(bn bnVar) {
        super("", 0);
        this.b = 1;
        this.c = bnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.g8 g8Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = g8Var;
    }
}
