package kh;

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
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class mb extends s {
    public final Path N1;
    public final /* synthetic */ wb O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(wb wbVar, Activity activity, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, ih.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, xu0Var, frameLayout2, bVar, baVar);
        this.O1 = wbVar;
        this.N1 = new Path();
    }

    @Override // kh.m
    public final boolean e() {
        org.telegram.ui.Components.gc gcVar;
        int i9 = 0;
        if (MessagesController.getInstance(this.Q).premiumFeaturesBlocked() || ((gcVar = org.telegram.ui.Components.gc.w) != null && gcVar.a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault), j3.r0.l(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, this.a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new lb(this, i9), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.gc M = new org.telegram.ui.Components.oc(this.O1.h0, this.a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.a = 2;
        M.j = 5000;
        M.k(false);
        return true;
    }

    @Override // kh.m
    public final boolean g() {
        return this.O1.n0.c();
    }

    @Override // kh.s
    public final int getTimelineHeight() {
        gc gcVar;
        wb wbVar = this.O1;
        if (wbVar.U0 == null || (gcVar = wbVar.V0) == null || gcVar.getVisibility() != 0) {
            return 0;
        }
        return wbVar.V0.getTimelineHeight();
    }

    @Override // kh.m
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.N1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            faVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // kh.m
    public final void i(Bitmap bitmap) {
        this.O1.n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // kh.m
    public final boolean l(float f10, float f11) {
        wb wbVar = this.O1;
        ya yaVar = wbVar.r1;
        if (yaVar != null && yaVar.N0 != null) {
            mb mbVar = wbVar.Y0;
            if (!mbVar.l0) {
                float x10 = mbVar.getX() + f10;
                float y10 = wbVar.Y0.getY() + f11;
                float x11 = wbVar.h0.getX() + x10;
                float y11 = wbVar.h0.getY() + y10;
                float x12 = x11 - wbVar.d0.getX();
                float y12 = y11 - wbVar.d0.getY();
                for (int i9 = 0; i9 < wbVar.r1.N0.getChildCount(); i9++) {
                    View childAt = wbVar.r1.N0.getChildAt(i9);
                    if (childAt instanceof yf.j) {
                        wj0 selectionBounds = ((yf.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.a;
                        float f13 = selectionBounds.b;
                        rectF.set(f12, f13, selectionBounds.c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x12, y12)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // kh.m
    public final void n() {
        fh.l2 l2Var = this.O1.p0;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override // kh.m
    public final void q(boolean z10) {
        boolean z11;
        a8 a8Var;
        wb wbVar = this.O1;
        k6 k6Var = wbVar.X0;
        if (!wbVar.J1 && !z10) {
            ih.v6 storiesController = MessagesController.getInstance(this.Q).getStoriesController();
            int B = wbVar.B();
            ih.p6 o6 = storiesController.o();
            if (o6 == null || !o6.a(storiesController.a, B) || ((a8Var = wbVar.G1) != null && a8Var.g)) {
                z11 = true;
                k6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        k6Var.setShareEnabled(z11);
    }
}
