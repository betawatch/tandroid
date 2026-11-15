package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ia extends r {
    public final Path R1;
    public final /* synthetic */ sa S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(sa saVar, Activity activity, FrameLayout frameLayout, st0 st0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.u9 u9Var) {
        super(activity, frameLayout, st0Var, frameLayout2, bVar, u9Var);
        this.S1 = saVar;
        this.R1 = new Path();
    }

    @Override // hi.m
    public final boolean e() {
        xb xbVar;
        int i7 = 0;
        if (np.s1(this.V).D3() || ((xbVar = xb.w) != null && xbVar.a == 2)) {
            return false;
        }
        int i10 = np.s1(this.V).X4;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G(Math.round(i10 / np.s1(this.V).W4), "CaptionPremiumSubtitle", i5.c.i(i10, "")));
        int indexOf = X2.toString().indexOf("__");
        if (indexOf >= 0) {
            X2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = X2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                X2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                X2.setSpan(new b00(org.telegram.ui.ActionBar.j6.Xc, this.a), indexOf, indexOf2, 33);
                X2.setSpan(new ha(this, i7), indexOf, indexOf2, 33);
            }
        }
        xb I = new cc(this.S1.m0, this.a).I(R.raw.caption_limit, hd.M0(2131752556, null), X2);
        I.a = 2;
        I.j = 5000;
        I.k(false);
        return true;
    }

    @Override // hi.m
    public final boolean g() {
        return this.S1.s0.c();
    }

    @Override // hi.r
    public final int getTimelineHeight() {
        cb cbVar;
        sa saVar = this.S1;
        if (saVar.Z0 == null || (cbVar = saVar.a1) == null || cbVar.getVisibility() != 0) {
            return 0;
        }
        return saVar.a1.getTimelineHeight();
    }

    @Override // hi.m
    public final void h(org.telegram.ui.Components.y9 y9Var, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.R1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            y9Var.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // hi.m
    public final void i(Bitmap bitmap) {
        this.S1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // hi.m
    public final boolean l(float f10, float f11) {
        sa saVar = this.S1;
        u9 u9Var = saVar.w1;
        if (u9Var != null && u9Var.B0 != null) {
            ia iaVar = saVar.d1;
            if (!iaVar.p0) {
                float x10 = iaVar.getX() + f10;
                float y10 = saVar.d1.getY() + f11;
                float x11 = saVar.m0.getX() + x10;
                float y11 = saVar.m0.getY() + y10;
                float x12 = x11 - saVar.i0.getX();
                float y12 = y11 - saVar.i0.getY();
                for (int i7 = 0; i7 < saVar.w1.B0.getChildCount(); i7++) {
                    View childAt = saVar.w1.B0.getChildAt(i7);
                    if (childAt instanceof tg.j) {
                        pi0 selectionBounds = ((tg.j) childAt).getSelectionBounds();
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

    @Override // hi.m
    public final void n() {
        bi.o2 o2Var = this.S1.u0;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    @Override // hi.m
    public final void q(boolean z10) {
        boolean z11;
        d7 d7Var;
        sa saVar = this.S1;
        r5 r5Var = saVar.c1;
        if (!saVar.O1 && !z10) {
            fi.s6 P1 = np.s1(this.V).P1();
            int A = saVar.A();
            fi.m6 o4 = P1.o();
            if (o4 == null || !o4.a(P1.a, A) || ((d7Var = saVar.L1) != null && d7Var.g)) {
                z11 = true;
                r5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        r5Var.setShareEnabled(z11);
    }
}
