package ei;

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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class lb extends r {
    public final Path R1;
    public final /* synthetic */ vb S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(vb vbVar, Activity activity, FrameLayout frameLayout, jw0 jw0Var, FrameLayout frameLayout2, ci.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, jw0Var, frameLayout2, bVar, jaVar);
        this.S1 = vbVar;
        this.R1 = new Path();
    }

    @Override // ei.m
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        int i10 = 0;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.w) != null && qcVar.a == 2)) {
            return false;
        }
        int i11 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), i0.a.j(i11, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new kb(this, i10), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new xc(this.S1.l0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // ei.m
    public final boolean g() {
        return this.S1.r0.c();
    }

    @Override // ei.r
    public final int getTimelineHeight() {
        gc gcVar;
        vb vbVar = this.S1;
        if (vbVar.Y0 == null || (gcVar = vbVar.Z0) == null || gcVar.getVisibility() != 0) {
            return 0;
        }
        return vbVar.Z0.getTimelineHeight();
    }

    @Override // ei.m
    public final void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.R1;
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f10, f11);
            naVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // ei.m
    public final void i(Bitmap bitmap) {
        this.S1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // ei.m
    public final boolean l(float f7, float f10) {
        vb vbVar = this.S1;
        xa xaVar = vbVar.v1;
        if (xaVar != null && xaVar.R0 != null) {
            lb lbVar = vbVar.c1;
            if (!lbVar.p0) {
                float x10 = lbVar.getX() + f7;
                float y3 = vbVar.c1.getY() + f10;
                float x11 = vbVar.l0.getX() + x10;
                float y10 = vbVar.l0.getY() + y3;
                float x12 = x11 - vbVar.h0.getX();
                float y11 = y10 - vbVar.h0.getY();
                for (int i10 = 0; i10 < vbVar.v1.R0.getChildCount(); i10++) {
                    View childAt = vbVar.v1.R0.getChildAt(i10);
                    if (childAt instanceof rg.j) {
                        el0 selectionBounds = ((rg.j) childAt).getSelectionBounds();
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

    @Override // ei.m
    public final void n() {
        ai.hc hcVar = this.S1.t0;
        if (hcVar != null) {
            hcVar.invalidate();
        }
    }

    @Override // ei.m
    public final void q(boolean z10) {
        boolean z11;
        a8 a8Var;
        vb vbVar = this.S1;
        k6 k6Var = vbVar.b1;
        if (!vbVar.N1 && !z10) {
            ci.i7 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = vbVar.A();
            ci.c7 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, A) || ((a8Var = vbVar.K1) != null && a8Var.g)) {
                z11 = true;
                k6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        k6Var.setShareEnabled(z11);
    }
}
