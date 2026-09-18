package ci;

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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class ec extends r {
    public final Path R1;
    public final /* synthetic */ oc S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(oc ocVar, Activity activity, FrameLayout frameLayout, bw0 bw0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, bw0Var, frameLayout2, dVar, jaVar);
        this.S1 = ocVar;
        this.R1 = new Path();
    }

    @Override // ci.m
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        int i10 = 0;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.w) != null && qcVar.a == 2)) {
            return false;
        }
        int i11 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hg.k0.h(i11, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new dc(this, i10), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new org.telegram.ui.Components.xc(this.S1.l0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // ci.m
    public final boolean g() {
        return this.S1.r0.c();
    }

    @Override // ci.r
    public final int getTimelineHeight() {
        zc zcVar;
        oc ocVar = this.S1;
        if (ocVar.Y0 == null || (zcVar = ocVar.Z0) == null || zcVar.getVisibility() != 0) {
            return 0;
        }
        return ocVar.Z0.getTimelineHeight();
    }

    @Override // ci.m
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

    @Override // ci.m
    public final void i(Bitmap bitmap) {
        this.S1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // ci.m
    public final boolean l(float f7, float f10) {
        oc ocVar = this.S1;
        qb qbVar = ocVar.v1;
        if (qbVar != null && qbVar.R0 != null) {
            ec ecVar = ocVar.c1;
            if (!ecVar.p0) {
                float x10 = ecVar.getX() + f7;
                float y3 = ocVar.c1.getY() + f10;
                float x11 = ocVar.l0.getX() + x10;
                float y10 = ocVar.l0.getY() + y3;
                float x12 = x11 - ocVar.h0.getX();
                float y11 = y10 - ocVar.h0.getY();
                for (int i10 = 0; i10 < ocVar.v1.R0.getChildCount(); i10++) {
                    View childAt = ocVar.v1.R0.getChildAt(i10);
                    if (childAt instanceof qg.j) {
                        sk0 selectionBounds = ((qg.j) childAt).getSelectionBounds();
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

    @Override // ci.m
    public final void n() {
        eb ebVar = this.S1.t0;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override // ci.m
    public final void q(boolean z10) {
        boolean z11;
        o8 o8Var;
        oc ocVar = this.S1;
        v6 v6Var = ocVar.b1;
        if (!ocVar.N1 && !z10) {
            ai.l9 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = ocVar.B();
            ai.f9 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.a, B) || ((o8Var = ocVar.K1) != null && o8Var.g)) {
                z11 = true;
                v6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        v6Var.setShareEnabled(z11);
    }
}
