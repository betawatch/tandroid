package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class s1 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final ArrayList E;
    public final Rect F;
    public final int a;
    public final ag.n2 b;
    public final DispatchQueue c;
    public final MediaController.CropState d;
    public final ag.t1 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView v;
    public final w2 w;
    public bv0 x;
    public boolean y;

    public s1(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        ha.c cVar = new ha.c(this, 7);
        this.E = new ArrayList();
        this.F = new Rect();
        this.a = i10;
        this.n = context instanceof BubbleActivity;
        ag.n2 n2Var = new ag.n2();
        this.b = n2Var;
        n2Var.a = new p1();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.c = dispatchQueue;
        this.d = cropState;
        this.f = bitmap;
        this.h = i11;
        ag.f1 f1Var = new ag.f1(getPaintingSize(), bitmap2, i11, null);
        f1Var.G = true;
        ag.t1 t1Var = new ag.t1(context, f1Var, bitmap, null, null);
        this.e = t1Var;
        t1Var.setAlpha(0.0f);
        t1Var.setDelegate(new r1(this));
        t1Var.setUndoStore(n2Var);
        t1Var.setQueue(dispatchQueue);
        t1Var.setVisibility(4);
        t1Var.setBrush(new ag.f());
        t1Var.setBrushSize(cVar.get());
        t1Var.setColor(-65536);
        addView(t1Var, f6.e(-1, -1, 51));
        w2 w2Var = new w2(context);
        this.w = w2Var;
        w2Var.b(0.05f, 1.0f);
        w2Var.setBrushWeight(cVar.get());
        w2Var.setRenderView(t1Var);
        w2Var.setValueOverride(cVar);
        w2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w2Var.setAlpha(0.0f);
        addView(w2Var, f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, f6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(g6.f0(g6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = th.h(frameLayout, textView, f6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        th.n(15.0f, 1, h);
        int i12 = g6.zf;
        h.setBackground(g6.f0(g6.l1(0.15f, g6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(g6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, f6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private bv0 getPaintingSize() {
        bv0 bv0Var = this.x;
        if (bv0Var != null) {
            return bv0Var;
        }
        Bitmap bitmap = this.f;
        bv0 bv0Var2 = new bv0(bitmap.getWidth(), bitmap.getHeight());
        float f9 = 1280;
        bv0Var2.a = f9;
        float floor = (float) Math.floor((f9 * r0) / r1);
        bv0Var2.b = floor;
        if (floor > f9) {
            bv0Var2.b = f9;
            bv0Var2.a = (float) Math.floor((f9 * r1) / r0);
        }
        this.x = bv0Var2;
        return bv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        ag.t1 t1Var = this.e;
        float translationX = ((x4 - t1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / t1Var.getScaleX();
        float y8 = ((motionEvent.getY() - t1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / t1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-t1Var.getRotation());
        double d10 = y8;
        float measuredWidth = (t1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (t1Var.getMeasuredHeight() / 2.0f) + ((float) j7.l1.b(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        t1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        this.A = f10;
        float f17 = 0.0f + f11;
        this.B = f17;
        ag.t1 t1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f18 = cropState.cropScale * 1.0f;
            int measuredWidth = t1Var.getMeasuredWidth();
            int measuredHeight = t1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f13 / ((int) (cropState.cropPw * r5)), f14 / ((int) (cropState.cropPh * r6)));
            f15 = f18 * max;
            float C = com.google.android.recaptcha.internal.a.C(cropState.cropPx, measuredWidth, f9, max);
            float f19 = cropState.cropScale;
            f10 += C * f19;
            f17 += cropState.cropPy * measuredHeight * f9 * max * f19;
            f16 = cropState.cropRotate + i10 + f12;
        } else {
            f15 = this.D * 1.0f;
            f16 = f12;
        }
        float f20 = f9 * f15;
        float f21 = Float.isNaN(f20) ? 1.0f : f20;
        t1Var.setScaleX(f21);
        t1Var.setScaleY(f21);
        t1Var.setTranslationX(f10);
        t1Var.setTranslationY(f17);
        t1Var.setRotation(f16);
        t1Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.A;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + this.B;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap c3 = this.e.c(false, false);
        int i10 = this.h;
        if (i10 == 0) {
            return c3;
        }
        int width = c3.getWidth();
        int height = c3.getHeight();
        if ((i10 / 90) % 2 != 0) {
            width = c3.getHeight();
            height = c3.getWidth();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-c3.getWidth()) / 2.0f, (-c3.getHeight()) / 2.0f, c3.getWidth() / 2.0f, c3.getHeight() / 2.0f);
        canvas.drawBitmap(c3, (Rect) null, rectF, new Paint(3));
        c3.recycle();
        return createBitmap;
    }

    public ag.t1 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        ag.t1 t1Var = this.e;
        int ceil = (int) Math.ceil((i14 - t1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - t1Var.getMeasuredHeight()) / 2;
        t1Var.layout(ceil, measuredHeight, t1Var.getMeasuredWidth() + ceil, t1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f9;
        float f10;
        this.C = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            f9 = bitmap.getHeight();
        } else {
            f9 = size2;
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * f9) / f10);
        float f12 = i12;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / f9);
            floor = f12;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) floor, TLObject.FLAG_30));
        this.D = 1.0f;
        measureChild(this.w, i10, i11);
        measureChild(this.r, i10, i11);
        this.C = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.E;
            arrayList.clear();
            Rect rect = this.F;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.e.setBrush(z10 ? new ag.d() : new ag.f());
    }
}
