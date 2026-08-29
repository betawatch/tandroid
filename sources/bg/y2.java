package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import i7.f6;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y2 extends k {
    public final Rect A0;
    public final Paint B0;
    public MediaController.CropState C0;
    public final TLObject m0;
    public final String n0;
    public final int o0;
    public boolean p0;
    public final d6 q0;
    public final bv0 r0;
    public final int s0;
    public boolean t0;
    public final d6 u0;
    public final x2 v0;
    public final Bitmap w0;
    public boolean x0;
    public boolean y0;
    public final Rect z0;

    public y2(Context context, PointF pointF, bv0 bv0Var, String str, int i10) {
        super(context, pointF);
        this.o0 = -1;
        this.p0 = false;
        this.t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.n0 = str;
        this.r0 = bv0Var;
        x2 x2Var = new x2(this, context);
        this.v0 = x2Var;
        addView(x2Var, f6.c(-1.0f, -1));
        jr jrVar = jr.h;
        this.q0 = new d6(x2Var, 0L, 500L, jrVar);
        this.u0 = new d6(x2Var, 0L, 350L, jrVar);
        this.s0 = i10;
        Bitmap q6 = o7.q(new a1.c(str, 7), 1920, 1920, 0, false);
        this.w0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.k(round, "_", round);
    }

    @Override // bg.k
    public final j a() {
        return new j1(this, getContext());
    }

    public int getAnchor() {
        return this.o0;
    }

    public bv0 getBaseSize() {
        return this.r0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.s0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // bg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // bg.k
    public final void k() {
        bv0 bv0Var = this.r0;
        float f9 = bv0Var.a / 2.0f;
        float f10 = bv0Var.b / 2.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f9 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        setX(getPositionX() - f9);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bv0 bv0Var = this.r0;
        float f9 = bv0Var.a;
        float f10 = bv0Var.b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f9 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
    }

    public final String q(int i10) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.n0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.p0;
        this.p0 = z11;
        if (!z10) {
            this.q0.f(z11, true);
        }
        x2 x2Var = this.v0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.y0 || this.x0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        kb.d dVar = new kb.d();
        dVar.a = true;
        zzd a2 = i7.g.a(new kb.e(dVar));
        this.x0 = true;
        a2.g(fb.a.a(bitmap, this.s0)).addOnSuccessListener(new a1.c(this, 8)).addOnFailureListener(new a9.s(1, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        x2 x2Var = this.v0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public y2(Context context, PointF pointF, bv0 bv0Var, TLObject tLObject) {
        super(context, pointF);
        this.o0 = -1;
        this.p0 = false;
        this.t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.m0 = tLObject;
        this.r0 = bv0Var;
        x2 x2Var = new x2(this, context);
        this.v0 = x2Var;
        addView(x2Var, f6.c(-1.0f, -1));
        jr jrVar = jr.h;
        this.q0 = new d6(x2Var, 0L, 500L, jrVar);
        this.u0 = new d6(x2Var, 0L, 350L, jrVar);
        k();
    }
}
