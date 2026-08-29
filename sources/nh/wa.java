package nh;

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
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class wa extends r {
    public final Path N1;
    public final /* synthetic */ gb O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(gb gbVar, Activity activity, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(activity, frameLayout, hv0Var, frameLayout2, bVar, gaVar);
        this.O1 = gbVar;
        this.N1 = new Path();
    }

    @Override // nh.m
    public final boolean e() {
        if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked()) {
            mc mcVar = mc.w;
            int i10 = 2;
            if (mcVar == null || mcVar.a != 2) {
                int i11 = MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault), j7.l1.k(i11, "")));
                int indexOf = replaceTags.toString().indexOf("__");
                if (indexOf >= 0) {
                    replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
                    int indexOf2 = replaceTags.toString().indexOf("__");
                    if (indexOf2 >= 0) {
                        replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                        replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.a)), indexOf, indexOf2, 33);
                        replaceTags.setSpan(new cg.l0(this, i10), indexOf, indexOf2, 33);
                    }
                }
                mc M = new tc(this.O1.h0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
                M.a = 2;
                M.j = 5000;
                M.k(false);
                return true;
            }
        }
        return false;
    }

    @Override // nh.m
    public final boolean g() {
        return this.O1.n0.c();
    }

    @Override // nh.r
    public final int getTimelineHeight() {
        qb qbVar;
        gb gbVar = this.O1;
        if (gbVar.U0 == null || (qbVar = gbVar.V0) == null || qbVar.getVisibility() != 0) {
            return 0;
        }
        return gbVar.V0.getTimelineHeight();
    }

    @Override // nh.m
    public final void h(org.telegram.ui.Components.ka kaVar, Canvas canvas, RectF rectF, float f9, boolean z10, float f10, float f11, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.N1;
            path.rewind();
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f10, f11);
            kaVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // nh.m
    public final void i(Bitmap bitmap) {
        this.O1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // nh.m
    public final boolean l(float f9, float f10) {
        gb gbVar = this.O1;
        ja jaVar = gbVar.r1;
        if (jaVar != null && jaVar.N0 != null) {
            wa waVar = gbVar.Y0;
            if (!waVar.l0) {
                float x4 = waVar.getX() + f9;
                float y8 = gbVar.Y0.getY() + f10;
                float x10 = gbVar.h0.getX() + x4;
                float y10 = gbVar.h0.getY() + y8;
                float x11 = x10 - gbVar.d0.getX();
                float y11 = y10 - gbVar.d0.getY();
                for (int i10 = 0; i10 < gbVar.r1.N0.getChildCount(); i10++) {
                    View childAt = gbVar.r1.N0.getChildAt(i10);
                    if (childAt instanceof bg.k) {
                        hk0 selectionBounds = ((bg.k) childAt).getSelectionBounds();
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

    @Override // nh.m
    public final void n() {
        cg.h0 h0Var = this.O1.p0;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override // nh.m
    public final void q(boolean z10) {
        boolean z11;
        o7 o7Var;
        gb gbVar = this.O1;
        w5 w5Var = gbVar.X0;
        if (!gbVar.J1 && !z10) {
            lh.s6 storiesController = MessagesController.getInstance(this.Q).getStoriesController();
            int B = gbVar.B();
            lh.m6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.a, B) || ((o7Var = gbVar.G1) != null && o7Var.g)) {
                z11 = true;
                w5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        w5Var.setShareEnabled(z11);
    }
}
