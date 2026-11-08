package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import bi.ec;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class la extends r {
    public final Path Q1;
    public final /* synthetic */ va R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(va vaVar, Activity activity, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(activity, frameLayout, rt0Var, frameLayout2, bVar, y9Var);
        this.R1 = vaVar;
        this.Q1 = new Path();
    }

    @Override // fi.m
    public final boolean e() {
        cc ccVar;
        int i7 = 0;
        if (qp.s1(this.U).D3() || ((ccVar = cc.w) != null && ccVar.a == 2)) {
            return false;
        }
        int i10 = qp.s1(this.U).W4;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.G(Math.round(i10 / qp.s1(this.U).V4), "CaptionPremiumSubtitle", jg.g.j(i10, "")));
        int indexOf = X2.toString().indexOf("__");
        if (indexOf >= 0) {
            X2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = X2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                X2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                X2.setSpan(new yz(org.telegram.ui.ActionBar.k6.Uc, this.a), indexOf, indexOf2, 33);
                X2.setSpan(new ka(this, i7), indexOf, indexOf2, 33);
            }
        }
        cc I = new hc(this.R1.l0, this.a).I(R.raw.caption_limit, id.M0(2131752556, null), X2);
        I.a = 2;
        I.j = 5000;
        I.k(false);
        return true;
    }

    @Override // fi.m
    public final boolean g() {
        return this.R1.r0.c();
    }

    @Override // fi.r
    public final int getTimelineHeight() {
        fb fbVar;
        va vaVar = this.R1;
        if (vaVar.Y0 == null || (fbVar = vaVar.Z0) == null || fbVar.getVisibility() != 0) {
            return 0;
        }
        return vaVar.Z0.getTimelineHeight();
    }

    @Override // fi.m
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.Q1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            caVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // fi.m
    public final void i(Bitmap bitmap) {
        this.R1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // fi.m
    public final boolean l(float f10, float f11) {
        va vaVar = this.R1;
        x9 x9Var = vaVar.v1;
        if (x9Var != null && x9Var.A0 != null) {
            la laVar = vaVar.c1;
            if (!laVar.o0) {
                float x10 = laVar.getX() + f10;
                float y10 = vaVar.c1.getY() + f11;
                float x11 = vaVar.l0.getX() + x10;
                float y11 = vaVar.l0.getY() + y10;
                float x12 = x11 - vaVar.h0.getX();
                float y12 = y11 - vaVar.h0.getY();
                for (int i7 = 0; i7 < vaVar.v1.A0.getChildCount(); i7++) {
                    View childAt = vaVar.v1.A0.getChildAt(i7);
                    if (childAt instanceof tg.j) {
                        ki0 selectionBounds = ((tg.j) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.g0.P;
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

    @Override // fi.m
    public final void n() {
        ec ecVar = this.R1.t0;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override // fi.m
    public final void q(boolean z9) {
        boolean z10;
        e7 e7Var;
        va vaVar = this.R1;
        s5 s5Var = vaVar.b1;
        if (!vaVar.N1 && !z9) {
            di.y6 P1 = qp.s1(this.U).P1();
            int A = vaVar.A();
            di.s6 o4 = P1.o();
            if (o4 == null || !o4.a(P1.a, A) || ((e7Var = vaVar.K1) != null && e7Var.g)) {
                z10 = true;
                s5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        s5Var.setShareEnabled(z10);
    }
}
