package org.telegram.ui.Cells;

import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.x71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i10, FrameLayout frameLayout) {
        super("animationValue", 0);
        this.b = i10;
        this.c = frameLayout;
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                h2 h2Var = (h2) this.c;
                h2Var.h0 = f7;
                h2Var.invalidate();
                break;
            case 1:
                un.bd = f7;
                un unVar = (un) this.c;
                unVar.h7.setSaturation(f7);
                unVar.g7.setColorFilter(new ColorMatrixColorFilter(unVar.h7));
                break;
            case 2:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) this.c;
                w7Var.H2 = f7;
                org.telegram.ui.ActionBar.u5 titleTextView = lVar.getTitleTextView();
                ImageView backButton = lVar.getBackButton();
                float f10 = 1.0f - f7;
                titleTextView.setTranslationX(org.telegram.messenger.i0.L(-52.0f) * f10);
                backButton.setTranslationX(org.telegram.messenger.i0.L(-52.0f) * f10);
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.b2;
                if (t0Var != null && t0Var.getSearchContainer() != null) {
                    t0Var.getSearchContainer().setClipChildren(false);
                    t0Var.getSearchContainer().setClipToPadding(false);
                    t0Var.getSearchContainer().setPadding(0, 0, org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 74.0f : 66.0f), 0);
                    t0Var.getSearchContainer().setTranslationX((org.telegram.messenger.i0.L(-52.0f) * f10) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 74.0f : 66.0f));
                    if (t0Var.getSearchClearButton() != null) {
                        t0Var.getSearchClearButton().setTranslationX(org.telegram.messenger.i0.L(52.0f) * f10);
                    }
                }
                backButton.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7));
                backButton.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7));
                backButton.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f7));
                w7Var.b.invalidate();
                break;
            case 3:
                tz tzVar = (tz) this.c;
                tzVar.w0 = f7;
                int i10 = tzVar.U;
                org.telegram.ui.ActionBar.p6 p6Var = tzVar.a;
                tzVar.T.setColor(i0.b.f(f7, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(tzVar.c0, p6Var)));
                ag.b1 b1Var = tzVar.F;
                b1Var.g1();
                b1Var.invalidate();
                ((tz) obj).invalidate();
                break;
            case 4:
                x71 x71Var = (x71) this.c;
                x71Var.y = f7;
                x71Var.invalidate();
                break;
            case 5:
                s81 s81Var = (s81) this.c;
                s81Var.E = f7;
                r81 r81Var = s81Var.L;
                if (r81Var != null) {
                    r81Var.c(f7);
                }
                s81Var.invalidate();
                break;
            default:
                ((View) obj).setAlpha(f7);
                be0 be0Var = ((PhotoViewer) this.c).C1;
                if (be0Var != null) {
                    be0Var.setVideoThumbFlashAlpha(f7);
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((h2) this.c).h0);
            case 1:
                return Float.valueOf(un.bd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Components.w7) this.c).H2);
            case 3:
                return Float.valueOf(((tz) this.c).w0);
            case 4:
                return Float.valueOf(((x71) this.c).y);
            case 5:
                return Float.valueOf(((s81) this.c).E);
            default:
                return Float.valueOf(((View) obj).getAlpha());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(x71 x71Var) {
        super("progress", 0);
        this.b = 4;
        this.c = x71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(s81 s81Var) {
        super("clipProgress", 0);
        this.b = 5;
        this.c = s81Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer) {
        super("flashViewAlpha", 0);
        this.b = 6;
        this.c = photoViewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(un unVar) {
        super("", 0);
        this.b = 1;
        this.c = unVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(org.telegram.ui.Components.w7 w7Var) {
        super("actionBarSlide", 0);
        this.b = 2;
        this.c = w7Var;
    }
}
