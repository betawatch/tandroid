package bi;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i extends nu {
    public org.telegram.ui.Components.ma V;
    public bh.d W;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a0;
    public final /* synthetic */ org.telegram.ui.Components.ia b0;
    public final /* synthetic */ o c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Context context, aw0 aw0Var, int i10, zh.b bVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar) {
        super(context, aw0Var, null, i10, true, bVar);
        this.c0 = oVar;
        this.a0 = f6Var;
        this.b0 = iaVar;
    }

    @Override // org.telegram.ui.Components.nu
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o oVar = this.c0;
        if ((oVar instanceof v) && ((v) oVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nu
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            o oVar = this.c0;
            if (oVar.getEditTextStyle() == 2 || oVar.getEditTextStyle() == 3) {
                emojiView.w0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (oVar instanceof org.telegram.ui.Components.jd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.I2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new g(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.nu
    public final void g(Canvas canvas, ju juVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        o oVar = this.c0;
        zg.i iVar = oVar.d;
        RectF rectF = oVar.z0;
        rectF.set(0.0f, 0.0f, juVar.getWidth(), AndroidUtilities.dp(29.0f) + juVar.getHeight());
        int i12 = 0;
        if (oVar.h0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    i11 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    i10 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                bh.d c10 = oVar.h0.c(juVar, null, false);
                c10.n(dh.c.i(this.a0));
                this.W = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                bh.d dVar = this.W;
                dVar.k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                bh.d dVar2 = this.W;
                dVar2.h.g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
            return;
        }
        if (oVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.ma(this.b0, juVar, 7, false);
            }
            oVar.h(this.V, canvas, oVar.z0, AndroidUtilities.dp(29.0f), false, 0.0f, -juVar.getY(), false);
            iVar.k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
            return;
        }
        Paint paint = oVar.e;
        FrameLayout frameLayout = oVar.J;
        if (oVar.o0 > 0.0f && oVar.u0 != null && oVar.s0 != null && (bitmap = oVar.r0) != null && !bitmap.isRecycled()) {
            oVar.t0.reset();
            oVar.t0.postScale(frameLayout.getWidth() / oVar.r0.getWidth(), frameLayout.getHeight() / oVar.r0.getHeight());
            float f7 = 0.0f;
            float f10 = 0.0f;
            ju juVar2 = juVar;
            while (i12 < 8 && juVar2 != null) {
                f7 += juVar2.getX();
                f10 += juVar2.getY();
                Object parent = juVar2.getParent();
                i12++;
                juVar2 = parent instanceof View ? (View) parent : 0;
            }
            oVar.t0.postTranslate(-f7, -f10);
            oVar.s0.setLocalMatrix(oVar.t0);
            oVar.u0.setAlpha((int) (oVar.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, oVar.u0);
        }
        paint.setAlpha((int) (oVar.u0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, oVar.o0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.nu
    public final void p() {
        this.c0.L.a();
    }

    @Override // org.telegram.ui.Components.nu
    public final void q(int i10, int i11) {
        this.c0.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.nu
    public final boolean t(int i10) {
        o oVar = this.c0;
        i iVar = oVar.f;
        ObjectAnimator objectAnimator = oVar.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == oVar.b0) {
            return false;
        }
        oVar.invalidate();
        if (!oVar.W) {
            return true;
        }
        oVar.W = false;
        if (oVar.a0 == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = oVar.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == oVar.b0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = oVar.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        iVar.getEditText().setScrollY(oVar.a0);
        fu editText = iVar.getEditText();
        int i11 = oVar.a0;
        oVar.b0 = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        oVar.g0 = ofInt;
        ofInt.setDuration(240L);
        oVar.g0.setInterpolator(wr.h);
        oVar.g0.addListener(new h(this, 0));
        oVar.g0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.nu
    public final void u() {
        this.c0.L.e = true;
    }

    @Override // org.telegram.ui.Components.nu
    public final void y() {
        this.c0.L.a();
    }
}
