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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class ja extends s {
    public final Path R1;
    public final /* synthetic */ ta S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ta taVar, Activity activity, FrameLayout frameLayout, au0 au0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.ca caVar) {
        super(activity, frameLayout, au0Var, frameLayout2, bVar, caVar);
        this.S1 = taVar;
        this.R1 = new Path();
    }

    @Override // hi.n
    public final boolean e() {
        gc gcVar;
        int i7 = 0;
        if (mp.u1(this.V).K3() || ((gcVar = gc.w) != null && gcVar.a == 2)) {
            return false;
        }
        int i10 = mp.u1(this.V).Z4;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(Math.round(i10 / mp.u1(this.V).Y4), "CaptionPremiumSubtitle", i5.c.i(i10, "")));
        int indexOf = W2.toString().indexOf("__");
        if (indexOf >= 0) {
            W2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = W2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                W2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                W2.setSpan(new i00(org.telegram.ui.ActionBar.n6.Xc, this.a), indexOf, indexOf2, 33);
                W2.setSpan(new ia(this, i7), indexOf, indexOf2, 33);
            }
        }
        gc I = new lc(this.S1.m0, this.a).I(R.raw.caption_limit, gd.M0(2131752545, null), W2);
        I.a = 2;
        I.j = 5000;
        I.k(false);
        return true;
    }

    @Override // hi.n
    public final boolean g() {
        return this.S1.s0.c();
    }

    @Override // hi.s
    public final int getTimelineHeight() {
        db dbVar;
        ta taVar = this.S1;
        if (taVar.Z0 == null || (dbVar = taVar.a1) == null || dbVar.getVisibility() != 0) {
            return 0;
        }
        return taVar.a1.getTimelineHeight();
    }

    @Override // hi.n
    public final void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.R1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            gaVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override // hi.n
    public final void i(Bitmap bitmap) {
        this.S1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override // hi.n
    public final boolean l(float f10, float f11) {
        ta taVar = this.S1;
        v9 v9Var = taVar.w1;
        if (v9Var != null && v9Var.B0 != null) {
            ja jaVar = taVar.d1;
            if (!jaVar.p0) {
                float x10 = jaVar.getX() + f10;
                float y10 = taVar.d1.getY() + f11;
                float x11 = taVar.m0.getX() + x10;
                float y11 = taVar.m0.getY() + y10;
                float x12 = x11 - taVar.i0.getX();
                float y12 = y11 - taVar.i0.getY();
                for (int i7 = 0; i7 < taVar.w1.B0.getChildCount(); i7++) {
                    View childAt = taVar.w1.B0.getChildAt(i7);
                    if (childAt instanceof tg.j) {
                        yi0 selectionBounds = ((tg.j) childAt).getSelectionBounds();
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

    @Override // hi.n
    public final void n() {
        bi.i3 i3Var = this.S1.u0;
        if (i3Var != null) {
            i3Var.invalidate();
        }
    }

    @Override // hi.n
    public final void q(boolean z10) {
        boolean z11;
        d7 d7Var;
        ta taVar = this.S1;
        p5 p5Var = taVar.c1;
        if (!taVar.O1 && !z10) {
            fi.p6 R1 = mp.u1(this.V).R1();
            int A = taVar.A();
            fi.j6 o4 = R1.o();
            if (o4 == null || !o4.a(R1.a, A) || ((d7Var = taVar.L1) != null && d7Var.g)) {
                z11 = true;
                p5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        p5Var.setShareEnabled(z11);
    }
}
