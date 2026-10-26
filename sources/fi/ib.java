package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class ib extends r {
    public final Path R1;
    public final /* synthetic */ sb S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(sb sbVar, Activity activity, FrameLayout frameLayout, vw0 vw0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.la laVar) {
        super(activity, frameLayout, vw0Var, frameLayout2, bVar, laVar);
        this.S1 = sbVar;
        this.R1 = new Path();
    }

    @Override // fi.m
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        int i10 = 0;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.x) != null && qcVar.a == 2)) {
            return false;
        }
        int i11 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), ic.a.i(i11, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new p10(org.telegram.ui.ActionBar.y6.gc, this.a), indexOf, indexOf2, 33);
                replaceTags.setSpan(new hb(this, i10), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new wc(this.S1.l0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // fi.m
    public final boolean g() {
        return this.S1.r0.c();
    }

    @Override // fi.r
    public final int getTimelineHeight() {
        cc ccVar;
        sb sbVar = this.S1;
        if (sbVar.Y0 == null || (ccVar = sbVar.Z0) == null || ccVar.getVisibility() != 0) {
            return 0;
        }
        return sbVar.Z0.getTimelineHeight();
    }

    @Override // fi.m
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

    @Override // fi.m
    public final void i(Bitmap bitmap) {
        this.S1.n.X(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // fi.m
    public final boolean l(float f7, float f10) {
        sb sbVar = this.S1;
        ta taVar = sbVar.v1;
        if (taVar != null && taVar.G0 != null) {
            ib ibVar = sbVar.c1;
            if (!ibVar.p0) {
                float x9 = ibVar.getX() + f7;
                float y3 = sbVar.c1.getY() + f10;
                float x10 = sbVar.l0.getX() + x9;
                float y10 = sbVar.l0.getY() + y3;
                float x11 = x10 - sbVar.h0.getX();
                float y11 = y10 - sbVar.h0.getY();
                for (int i10 = 0; i10 < sbVar.v1.G0.getChildCount(); i10++) {
                    View childAt = sbVar.v1.G0.getChildAt(i10);
                    if (childAt instanceof sg.j) {
                        hl0 selectionBounds = ((sg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.a;
                        float f12 = selectionBounds.b;
                        rectF.set(f11, f12, selectionBounds.c + f11, selectionBounds.d + f12);
                        if (rectF.contains(x11, y11)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // fi.m
    public final void n() {
        bi.cc ccVar = this.S1.t0;
        if (ccVar != null) {
            ccVar.invalidate();
        }
    }

    @Override // fi.m
    public final void q(boolean z10) {
        boolean z11;
        w7 w7Var;
        sb sbVar = this.S1;
        i6 i6Var = sbVar.b1;
        if (!sbVar.N1 && !z10) {
            di.h7 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = sbVar.A();
            di.b7 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, A) || ((w7Var = sbVar.K1) != null && w7Var.g)) {
                z11 = true;
                i6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        i6Var.setShareEnabled(z11);
    }
}
