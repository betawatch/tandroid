package dg;

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
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class q1 extends FrameLayout {
    public float B;
    public float C;
    public boolean D;
    public float E;
    public final ArrayList F;
    public final Rect G;
    public final int a;
    public final cg.i2 b;
    public final DispatchQueue c;
    public final MediaController.CropState d;
    public final cg.p1 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView v;
    public final t2 w;
    public jv0 x;
    public boolean y;

    public q1(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        androidx.biometric.e0 e0Var = new androidx.biometric.e0(this, 8);
        this.F = new ArrayList();
        this.G = new Rect();
        this.a = i10;
        this.n = context instanceof BubbleActivity;
        cg.i2 i2Var = new cg.i2();
        this.b = i2Var;
        i2Var.a = new n1();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.c = dispatchQueue;
        this.d = cropState;
        this.f = bitmap;
        this.h = i11;
        cg.d1 d1Var = new cg.d1(getPaintingSize(), bitmap2, i11, null);
        d1Var.G = true;
        cg.p1 p1Var = new cg.p1(context, d1Var, bitmap, null, null);
        this.e = p1Var;
        p1Var.setAlpha(0.0f);
        p1Var.setDelegate(new p1(this));
        p1Var.setUndoStore(i2Var);
        p1Var.setQueue(dispatchQueue);
        p1Var.setVisibility(4);
        p1Var.setBrush(new cg.f());
        p1Var.setBrushSize(e0Var.get());
        p1Var.setColor(-65536);
        addView(p1Var, b6.e(-1, -1, 51));
        t2 t2Var = new t2(context);
        this.w = t2Var;
        t2Var.b(0.05f, 1.0f);
        t2Var.setBrushWeight(e0Var.get());
        t2Var.setRenderView(p1Var);
        t2Var.setValueOverride(e0Var);
        t2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        t2Var.setAlpha(0.0f);
        addView(t2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, b6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(j6.f0(j6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = ai.h(frameLayout, textView, b6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        ai.o(15.0f, 1, h);
        int i12 = j6.zf;
        h.setBackground(j6.f0(j6.l1(0.15f, j6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(j6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, b6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private jv0 getPaintingSize() {
        jv0 jv0Var = this.x;
        if (jv0Var != null) {
            return jv0Var;
        }
        Bitmap bitmap = this.f;
        jv0 jv0Var2 = new jv0(bitmap.getWidth(), bitmap.getHeight());
        float f10 = 1280;
        jv0Var2.a = f10;
        float floor = (float) Math.floor((f10 * r0) / r1);
        jv0Var2.b = floor;
        if (floor > f10) {
            jv0Var2.b = f10;
            jv0Var2.a = (float) Math.floor((f10 * r1) / r0);
        }
        this.x = jv0Var2;
        return jv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        cg.p1 p1Var = this.e;
        float translationX = ((x10 - p1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / p1Var.getScaleX();
        float y10 = ((motionEvent.getY() - p1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / p1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-p1Var.getRotation());
        double d10 = y10;
        float measuredWidth = (p1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (p1Var.getMeasuredHeight() / 2.0f) + ((float) kf.k0.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        p1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        this.B = f11;
        float f18 = 0.0f + f12;
        this.C = f18;
        cg.p1 p1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f19 = cropState.cropScale * 1.0f;
            int measuredWidth = p1Var.getMeasuredWidth();
            int measuredHeight = p1Var.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float max = Math.max(f14 / ((int) (cropState.cropPw * r5)), f15 / ((int) (cropState.cropPh * r6)));
            f16 = f19 * max;
            float z4 = e2.c.z(cropState.cropPx, measuredWidth, f10, max);
            float f20 = cropState.cropScale;
            f11 += z4 * f20;
            f18 += cropState.cropPy * measuredHeight * f10 * max * f20;
            f17 = cropState.cropRotate + i10 + f13;
        } else {
            f16 = this.E * 1.0f;
            f17 = f13;
        }
        float f21 = f10 * f16;
        float f22 = Float.isNaN(f21) ? 1.0f : f21;
        p1Var.setScaleX(f22);
        p1Var.setScaleY(f22);
        p1Var.setTranslationX(f11);
        p1Var.setTranslationY(f18);
        p1Var.setRotation(f17);
        p1Var.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            r1 = this.n ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 == 90 || i10 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.B;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + this.C;
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

    public cg.p1 getRenderView() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        cg.p1 p1Var = this.e;
        int ceil = (int) Math.ceil((i14 - p1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - p1Var.getMeasuredHeight()) / 2;
        p1Var.layout(ceil, measuredHeight, p1Var.getMeasuredWidth() + ceil, p1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        this.D = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            f11 = bitmap.getWidth();
            f10 = bitmap.getHeight();
        } else {
            f10 = size2;
            f11 = size;
        }
        float f12 = size;
        float floor = (float) Math.floor((f12 * f10) / f11);
        float f13 = i12;
        if (floor > f13) {
            f12 = (float) Math.floor((f11 * f13) / f10);
            floor = f13;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) floor, TLObject.FLAG_30));
        this.E = 1.0f;
        measureChild(this.w, i10, i11);
        measureChild(this.r, i10, i11);
        this.D = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.F;
            arrayList.clear();
            Rect rect = this.G;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z4) {
        if (this.y == z4) {
            return;
        }
        this.y = z4;
        this.e.setBrush(z4 ? new cg.d() : new cg.f());
    }
}
