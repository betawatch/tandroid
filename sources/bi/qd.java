package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class qd extends v {
    public final Path R1;
    public final /* synthetic */ ce S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(ce ceVar, Activity activity, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, zh.b bVar, org.telegram.ui.Components.ia iaVar) {
        super(activity, frameLayout, aw0Var, frameLayout2, bVar, iaVar);
        this.S1 = ceVar;
        this.R1 = new Path();
    }

    @Override // bi.o
    public final boolean e() {
        org.telegram.ui.Components.pc pcVar;
        int i10 = 0;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((pcVar = org.telegram.ui.Components.pc.w) != null && pcVar.a == 2)) {
            return false;
        }
        int i11 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hc.b.j(i11, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new pd(this, i10), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.pc M = new org.telegram.ui.Components.wc(this.S1.l0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // bi.o
    public final boolean g() {
        return this.S1.r0.c();
    }

    @Override // bi.v
    public final int getTimelineHeight() {
        me meVar;
        ce ceVar = this.S1;
        if (ceVar.Y0 == null || (meVar = ceVar.Z0) == null || meVar.getVisibility() != 0) {
            return 0;
        }
        return ceVar.Z0.getTimelineHeight();
    }

    @Override // bi.o
    public final void h(org.telegram.ui.Components.ma maVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.R1;
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f10, f11);
            maVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // bi.o
    public final void i(Bitmap bitmap) {
        this.S1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // bi.o
    public final boolean l(float f7, float f10) {
        ce ceVar = this.S1;
        ad adVar = ceVar.v1;
        if (adVar != null && adVar.R0 != null) {
            qd qdVar = ceVar.c1;
            if (!qdVar.p0) {
                float x10 = qdVar.getX() + f7;
                float y3 = ceVar.c1.getY() + f10;
                float x11 = ceVar.l0.getX() + x10;
                float y10 = ceVar.l0.getY() + y3;
                float x12 = x11 - ceVar.h0.getX();
                float y11 = y10 - ceVar.h0.getY();
                for (int i10 = 0; i10 < ceVar.v1.R0.getChildCount(); i10++) {
                    View childAt = ceVar.v1.R0.getChildAt(i10);
                    if (childAt instanceof pg.j) {
                        rk0 selectionBounds = ((pg.j) childAt).getSelectionBounds();
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

    @Override // bi.o
    public final void n() {
        nc ncVar = this.S1.t0;
        if (ncVar != null) {
            ncVar.invalidate();
        }
    }

    @Override // bi.o
    public final void q(boolean z10) {
        boolean z11;
        r9 r9Var;
        ce ceVar = this.S1;
        v7 v7Var = ceVar.b1;
        if (!ceVar.N1 && !z10) {
            zh.i5 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = ceVar.B();
            j4.w o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.a, B) || ((r9Var = ceVar.K1) != null && r9Var.g)) {
                z11 = true;
                v7Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        v7Var.setShareEnabled(z11);
    }
}
