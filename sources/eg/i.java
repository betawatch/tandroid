package eg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class i extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final z5 e;
    public boolean f;
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new z5(this, 0L, 250L, pr.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f10, float f11);

    public final void b() {
        j jVar = this.h;
        tk0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.e(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        double atan2;
        h hVar;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        j jVar = this.h;
        h hVar2 = jVar.C;
        e eVar = jVar.F;
        float[] fArr = jVar.d0;
        float[] fArr2 = jVar.c0;
        float[] fArr3 = jVar.b0;
        hVar2.v(rawX, rawY, fArr3);
        boolean z10 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 29) {
                jVar.C.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            } else {
                z10 = false;
            }
        }
        if (z10) {
            fArr[0] = (fArr3[0] + fArr2[0]) / 2.0f;
            fArr[1] = (fArr3[1] + fArr2[1]) / 2.0f;
        } else {
            fArr[0] = fArr3[0];
            fArr[1] = fArr3[1];
        }
        if (jVar.W != z10) {
            jVar.b = fArr3[0];
            jVar.c = fArr3[1];
            jVar.d = fArr2[0];
            jVar.e = fArr2[1];
            jVar.f = fArr[0];
            jVar.h = fArr[1];
            this.f = !z10;
            invalidate();
        }
        jVar.W = z10;
        float[] fArr4 = jVar.d0;
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.d;
                    if (i10 == 3) {
                        float[] fArr5 = jVar.b0;
                        float f12 = fArr5[0];
                        float f13 = fArr5[1];
                        float[] fArr6 = jVar.c0;
                        z4 = jVar.c(f12, f13, z10, fArr6[0], fArr6[1]);
                    } else if (i10 != 0) {
                        float f14 = f10 - jVar.b;
                        float f15 = f11 - jVar.c;
                        if (jVar.s || Math.abs(f14) > AndroidUtilities.dp(2.0f) || Math.abs(f15) > AndroidUtilities.dp(2.0f)) {
                            if (!jVar.s && (hVar = jVar.C) != null) {
                                hVar.y();
                            }
                            jVar.s = true;
                            AndroidUtilities.cancelRunOnUIThread(eVar);
                            int[] b10 = jVar.C.b(jVar);
                            float a2 = o6.a(b10[0], b10[1], jVar.b, jVar.c);
                            float a10 = o6.a(b10[0], b10[1], f10, f11);
                            float f16 = 0.0f;
                            if (a2 > 0.0f) {
                                jVar.j(a10 / a2);
                            }
                            int i11 = this.d;
                            if (i11 == 1) {
                                atan2 = Math.atan2(b10[1] - f11, b10[0] - f10);
                            } else {
                                if (i11 == 2) {
                                    atan2 = Math.atan2(f11 - b10[1], f10 - b10[0]);
                                }
                                jVar.f((float) Math.toDegrees(f16));
                                jVar.b = f10;
                                jVar.c = f11;
                            }
                            f16 = (float) atan2;
                            jVar.f((float) Math.toDegrees(f16));
                            jVar.b = f10;
                            jVar.c = f11;
                        }
                        z4 = true;
                    }
                }
                z4 = false;
            }
            jVar.d(actionMasked == 3);
            this.d = 0;
            this.f = true;
            invalidate();
            z4 = true;
        } else {
            jVar.a0 = false;
            int a11 = a(motionEvent.getX(), motionEvent.getY());
            if (a11 != 0) {
                this.d = a11;
                jVar.b = fArr3[0];
                jVar.c = fArr3[1];
                jVar.f = f10;
                jVar.h = f11;
                jVar.r = false;
                if (getParent() instanceof d) {
                    ((d) getParent()).invalidate();
                }
                if (a11 == 3 && (jVar instanceof y2)) {
                    AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                }
                z4 = true;
            }
            z4 = false;
        }
        jVar.a0 = z10;
        return super.onTouchEvent(motionEvent) || z4;
    }
}
