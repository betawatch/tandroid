package di;

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
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class g extends hu {
    public org.telegram.ui.Components.na V;
    public dh.d W;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 a0;
    public final /* synthetic */ org.telegram.ui.Components.ja b0;
    public final /* synthetic */ m c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Context context, ov0 ov0Var, int i10, bi.b bVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar) {
        super(context, ov0Var, null, i10, true, bVar);
        this.c0 = mVar;
        this.a0 = f6Var;
        this.b0 = jaVar;
    }

    @Override // org.telegram.ui.Components.hu
    public final boolean b() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.hu
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.w0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof org.telegram.ui.Components.ld) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.I2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bi.z1(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [android.view.View] */
    @Override // org.telegram.ui.Components.hu
    public final void g(Canvas canvas, du duVar) {
        Bitmap bitmap;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.c0;
        bh.j jVar = mVar.d;
        RectF rectF = mVar.z0;
        rectF.set(0.0f, 0.0f, duVar.getWidth(), AndroidUtilities.dp(29.0f) + duVar.getHeight());
        int i12 = 0;
        if (mVar.h0 != null) {
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
                dh.d c10 = mVar.h0.c(duVar, null, false);
                c10.n(fh.b.i(this.a0));
                this.W = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                dh.d dVar = this.W;
                dVar.k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                dh.d dVar2 = this.W;
                dVar2.h.g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
            return;
        }
        if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.na(this.b0, duVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.z0, AndroidUtilities.dp(29.0f), false, 0.0f, -duVar.getY(), false);
            jVar.k = AndroidUtilities.dp(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
            return;
        }
        Paint paint = mVar.e;
        FrameLayout frameLayout = mVar.J;
        if (mVar.o0 > 0.0f && mVar.u0 != null && mVar.s0 != null && (bitmap = mVar.r0) != null && !bitmap.isRecycled()) {
            mVar.t0.reset();
            mVar.t0.postScale(frameLayout.getWidth() / mVar.r0.getWidth(), frameLayout.getHeight() / mVar.r0.getHeight());
            float f7 = 0.0f;
            float f10 = 0.0f;
            du duVar2 = duVar;
            while (i12 < 8 && duVar2 != null) {
                f7 += duVar2.getX();
                f10 += duVar2.getY();
                Object parent = duVar2.getParent();
                i12++;
                duVar2 = parent instanceof View ? (View) parent : 0;
            }
            mVar.t0.postTranslate(-f7, -f10);
            mVar.s0.setLocalMatrix(mVar.t0);
            mVar.u0.setAlpha((int) (mVar.o0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.u0);
        }
        paint.setAlpha((int) (mVar.u0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, mVar.o0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override // org.telegram.ui.Components.hu
    public final void p() {
        this.c0.L.a();
    }

    @Override // org.telegram.ui.Components.hu
    public final void q(int i10, int i11) {
        this.c0.s(i10, i11);
    }

    @Override // org.telegram.ui.Components.hu
    public final boolean t(int i10) {
        m mVar = this.c0;
        g gVar = mVar.f;
        ObjectAnimator objectAnimator = mVar.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.b0) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.W) {
            return true;
        }
        mVar.W = false;
        if (mVar.a0 == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.g0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == mVar.b0) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.g0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.a0);
        zt editText = gVar.getEditText();
        int i11 = mVar.a0;
        mVar.b0 = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        mVar.g0 = ofInt;
        ofInt.setDuration(240L);
        mVar.g0.setInterpolator(pr.h);
        mVar.g0.addListener(new ah.b(this, 14));
        mVar.g0.start();
        return false;
    }

    @Override // org.telegram.ui.Components.hu
    public final void u() {
        this.c0.L.e = true;
    }

    @Override // org.telegram.ui.Components.hu
    public final void y() {
        this.c0.L.a();
    }
}
