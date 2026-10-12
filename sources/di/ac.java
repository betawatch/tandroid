package di;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class ac extends r {
    public final Path R1;
    public final /* synthetic */ kc S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(kc kcVar, Activity activity, FrameLayout frameLayout, ow0 ow0Var, FrameLayout frameLayout2, bi.b bVar, org.telegram.ui.Components.la laVar) {
        super(activity, frameLayout, ow0Var, frameLayout2, bVar, laVar);
        this.S1 = kcVar;
        this.R1 = new Path();
    }

    @Override // di.m
    public final boolean e() {
        org.telegram.ui.Components.sc scVar;
        int i10 = 0;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((scVar = org.telegram.ui.Components.sc.w) != null && scVar.a == 2)) {
            return false;
        }
        int i11 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), i2.d.i(i11, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new zb(this, i10), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.sc M = new org.telegram.ui.Components.zc(this.S1.l0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // di.m
    public final boolean g() {
        return this.S1.r0.c();
    }

    @Override // di.r
    public final int getTimelineHeight() {
        uc ucVar;
        kc kcVar = this.S1;
        if (kcVar.Y0 == null || (ucVar = kcVar.Z0) == null || ucVar.getVisibility() != 0) {
            return 0;
        }
        return kcVar.Z0.getTimelineHeight();
    }

    @Override // di.m
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.R1;
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f10, f11);
            paVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // di.m
    public final void i(Bitmap bitmap) {
        this.S1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // di.m
    public final boolean l(float f7, float f10) {
        kc kcVar = this.S1;
        mb mbVar = kcVar.v1;
        if (mbVar != null && mbVar.R0 != null) {
            ac acVar = kcVar.c1;
            if (!acVar.p0) {
                float x10 = acVar.getX() + f7;
                float y3 = kcVar.c1.getY() + f10;
                float x11 = kcVar.l0.getX() + x10;
                float y10 = kcVar.l0.getY() + y3;
                float x12 = x11 - kcVar.h0.getX();
                float y11 = y10 - kcVar.h0.getY();
                for (int i10 = 0; i10 < kcVar.v1.R0.getChildCount(); i10++) {
                    View childAt = kcVar.v1.R0.getChildAt(i10);
                    if (childAt instanceof rg.j) {
                        il0 selectionBounds = ((rg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.a;
                        float f12 = selectionBounds.b;
                        rectF.set(f11, f12, selectionBounds.c + f11, selectionBounds.d + f12);
                        if (rectF.contains(x12, y11)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // di.m
    public final void n() {
        ab abVar = this.S1.t0;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override // di.m
    public final void q(boolean z10) {
        boolean z11;
        k8 k8Var;
        kc kcVar = this.S1;
        s6 s6Var = kcVar.b1;
        if (!kcVar.N1 && !z10) {
            bi.x8 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = kcVar.A();
            bi.q8 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, A) || ((k8Var = kcVar.K1) != null && k8Var.g)) {
                z11 = true;
                s6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        s6Var.setShareEnabled(z11);
    }
}
