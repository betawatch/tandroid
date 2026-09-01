package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;
import qh.s6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t2 extends j {
    public final Rect A0;
    public final Rect B0;
    public final Paint C0;
    public MediaController.CropState D0;
    public final TLObject n0;
    public final String o0;
    public final int p0;
    public boolean q0;
    public final z5 r0;
    public final kv0 s0;
    public final int t0;
    public boolean u0;
    public final z5 v0;
    public final s2 w0;
    public final Bitmap x0;
    public boolean y0;
    public boolean z0;

    public t2(Context context, PointF pointF, kv0 kv0Var, String str, int i10) {
        super(context, pointF);
        this.p0 = -1;
        this.q0 = false;
        this.u0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.o0 = str;
        this.s0 = kv0Var;
        s2 s2Var = new s2(this, context);
        this.w0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        pr prVar = pr.h;
        this.r0 = new z5(s2Var, 0L, 500L, prVar);
        this.v0 = new z5(s2Var, 0L, 350L, prVar);
        this.t0 = i10;
        Bitmap q10 = s6.q(new a1.c(str, 20), 1920, 1920, 0, false);
        this.x0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return e2.c.h(round, "_", round);
    }

    @Override // eg.j
    public final i a() {
        return new f1(this, getContext());
    }

    public int getAnchor() {
        return this.p0;
    }

    public kv0 getBaseSize() {
        return this.s0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.x0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.x0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.t0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // eg.j
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new tk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new tk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // eg.j
    public final void k() {
        kv0 kv0Var = this.s0;
        float f10 = kv0Var.a / 2.0f;
        float f11 = kv0Var.b / 2.0f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
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
        kv0 kv0Var = this.s0;
        float f10 = kv0Var.a;
        float f11 = kv0Var.b;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i10) {
        TLObject tLObject = this.n0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.o0;
    }

    public final void r(boolean z4) {
        boolean z10 = !this.q0;
        this.q0 = z10;
        if (!z4) {
            this.r0.f(z10, true);
        }
        s2 s2Var = this.w0;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.z0 || this.y0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        mb.d dVar = new mb.d();
        dVar.a = true;
        zzd a2 = k7.r.a(new mb.e(dVar));
        this.y0 = true;
        a2.g(hb.a.a(bitmap, this.t0)).addOnSuccessListener(new a1.c(this, 21)).addOnFailureListener(new c1.b(7, this, bitmap));
    }

    public final void t(boolean z4) {
        boolean z10 = !this.u0;
        this.u0 = z10;
        if (!z4) {
            this.v0.f(z10, true);
        }
        s2 s2Var = this.w0;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public t2(Context context, PointF pointF, kv0 kv0Var, TLObject tLObject) {
        super(context, pointF);
        this.p0 = -1;
        this.q0 = false;
        this.u0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.n0 = tLObject;
        this.s0 = kv0Var;
        s2 s2Var = new s2(this, context);
        this.w0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        pr prVar = pr.h;
        this.r0 = new z5(s2Var, 0L, 500L, prVar);
        this.v0 = new z5(s2Var, 0L, 350L, prVar);
        k();
    }
}
