package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;

/* loaded from: classes5.dex */
public class PhotoFilterBlurControl extends FrameLayout {
    private static final float BlurInsetProximity = AndroidUtilities.dp(20.0f);
    private static final float BlurViewCenterInset = AndroidUtilities.dp(30.0f);
    private static final float BlurViewRadiusInset = AndroidUtilities.dp(30.0f);
    private final int GestureStateBegan;
    private final int GestureStateCancelled;
    private final int GestureStateChanged;
    private final int GestureStateEnded;
    private final int GestureStateFailed;
    private BlurViewActiveControl activeControl;
    private Size actualAreaSize;
    private float angle;
    private Paint arcPaint;
    private RectF arcRect;
    private PointF centerPoint;
    private boolean checkForMoving;
    private boolean checkForZooming;
    private PhotoFilterLinearBlurControlDelegate delegate;
    private float falloff;
    private boolean inBubbleMode;
    private boolean isMoving;
    private boolean isZooming;
    private Paint paint;
    private float pointerScale;
    private float pointerStartX;
    private float pointerStartY;
    private float size;
    private PointF startCenterPoint;
    private float startDistance;
    private float startPointerDistance;
    private float startRadius;
    private int type;

    private enum BlurViewActiveControl {
        BlurViewActiveControlNone,
        BlurViewActiveControlCenter,
        BlurViewActiveControlInnerRadius,
        BlurViewActiveControlOuterRadius,
        BlurViewActiveControlWholeArea,
        BlurViewActiveControlRotation
    }

    public interface PhotoFilterLinearBlurControlDelegate {
        void valueChanged(PointF pointF, float f, float f2, float f3);
    }

    private float degreesToRadians(float f) {
        return (f * 3.1415927f) / 180.0f;
    }

    private void setSelected(boolean z, boolean z2) {
    }

    public PhotoFilterBlurControl(Context context) {
        super(context);
        this.GestureStateBegan = 1;
        this.GestureStateChanged = 2;
        this.GestureStateEnded = 3;
        this.GestureStateCancelled = 4;
        this.GestureStateFailed = 5;
        this.startCenterPoint = new PointF();
        this.actualAreaSize = new Size();
        this.centerPoint = new PointF(0.5f, 0.5f);
        this.falloff = 0.15f;
        this.size = 0.35f;
        this.arcRect = new RectF();
        this.pointerScale = 1.0f;
        this.checkForMoving = true;
        this.paint = new Paint(1);
        this.arcPaint = new Paint(1);
        setWillNotDraw(false);
        this.paint.setColor(-1);
        this.arcPaint.setColor(-1);
        this.arcPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.arcPaint.setStyle(Paint.Style.STROKE);
        this.inBubbleMode = context instanceof BubbleActivity;
    }

    public void setType(int i) {
        this.type = i;
        invalidate();
    }

    public void setDelegate(PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate) {
        this.delegate = photoFilterLinearBlurControlDelegate;
    }

    private float getDistance(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = x - motionEvent.getX(1);
        float y2 = y - motionEvent.getY(1);
        return (float) Math.sqrt((x2 * x2) + (y2 * y2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r2 != 6) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        ?? r5;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                        }
                    }
                } else if (this.isMoving) {
                    handlePan(2, motionEvent);
                } else if (this.isZooming) {
                    handlePinch(2, motionEvent);
                }
                return true;
            }
            if (this.isMoving) {
                handlePan(3, motionEvent);
                this.isMoving = false;
            } else if (this.isZooming) {
                handlePinch(3, motionEvent);
                this.isZooming = false;
            }
            this.checkForMoving = true;
            this.checkForZooming = true;
            return true;
        }
        if (motionEvent.getPointerCount() == 1) {
            if (this.checkForMoving && !this.isMoving) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                PointF actualCenterPoint = getActualCenterPoint();
                PointF pointF = new PointF(x - actualCenterPoint.x, y - actualCenterPoint.y);
                float f = pointF.x;
                float f2 = pointF.y;
                float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                float actualInnerRadius = getActualInnerRadius();
                float actualOuterRadius = getActualOuterRadius();
                boolean z3 = Math.abs(actualOuterRadius - actualInnerRadius) < BlurInsetProximity;
                float f3 = z3 ? 0.0f : BlurViewRadiusInset;
                float f4 = z3 ? 0.0f : BlurViewRadiusInset;
                int i = this.type;
                if (i == 0) {
                    float abs = (float) Math.abs((pointF.x * Math.cos(degreesToRadians(this.angle) + 1.5707963267948966d)) + (pointF.y * Math.sin(degreesToRadians(this.angle) + 1.5707963267948966d)));
                    if (sqrt < BlurViewCenterInset) {
                        this.isMoving = true;
                    } else {
                        float f5 = BlurViewRadiusInset;
                        float f6 = actualInnerRadius - f5;
                        if (abs > f6 && abs < actualInnerRadius + f3) {
                            this.isMoving = true;
                        } else if (abs > actualOuterRadius - f4 && abs < actualOuterRadius + f5) {
                            this.isMoving = true;
                        } else if (abs <= f6 || abs >= actualOuterRadius + f5) {
                            z = true;
                            this.isMoving = true;
                        }
                    }
                    z2 = false;
                    r5 = 1;
                    this.checkForMoving = z2;
                    if (this.isMoving) {
                        return r5;
                    }
                    handlePan(r5, motionEvent);
                    return r5;
                }
                z = true;
                z = true;
                z = true;
                z = true;
                z = true;
                z = true;
                if (i == 1) {
                    if (sqrt < BlurViewCenterInset) {
                        this.isMoving = true;
                    } else {
                        float f7 = BlurViewRadiusInset;
                        if (sqrt > actualInnerRadius - f7 && sqrt < actualInnerRadius + f3) {
                            this.isMoving = true;
                        } else if (sqrt > actualOuterRadius - f4 && sqrt < actualOuterRadius + f7) {
                            this.isMoving = true;
                        }
                    }
                }
                z2 = false;
                r5 = z;
                this.checkForMoving = z2;
                if (this.isMoving) {
                }
            }
            return true;
        }
        if (this.isMoving) {
            handlePan(3, motionEvent);
            this.checkForMoving = true;
            this.isMoving = false;
        }
        if (motionEvent.getPointerCount() == 2) {
            if (!this.checkForZooming || this.isZooming) {
                return true;
            }
            handlePinch(1, motionEvent);
            this.isZooming = true;
            return true;
        }
        handlePinch(3, motionEvent);
        this.checkForZooming = true;
        this.isZooming = false;
        return true;
    }

    private void handlePan(int i, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f = x - actualCenterPoint.x;
        float f2 = y - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        Size size = this.actualAreaSize;
        float min = Math.min(size.width, size.height);
        float f3 = this.falloff * min;
        float f4 = this.size * min;
        float abs = (float) Math.abs((f * Math.cos(degreesToRadians(this.angle) + 1.5707963267948966d)) + (f2 * Math.sin(degreesToRadians(this.angle) + 1.5707963267948966d)));
        if (i == 1) {
            this.pointerStartX = motionEvent.getX();
            this.pointerStartY = motionEvent.getY();
            r6 = Math.abs(f4 - f3) < BlurInsetProximity ? 1 : 0;
            float f5 = r6 != 0 ? 0.0f : BlurViewRadiusInset;
            float f6 = r6 == 0 ? BlurViewRadiusInset : 0.0f;
            int i2 = this.type;
            if (i2 == 0) {
                if (sqrt < BlurViewCenterInset) {
                    this.activeControl = BlurViewActiveControl.BlurViewActiveControlCenter;
                    this.startCenterPoint = actualCenterPoint;
                } else {
                    float f7 = BlurViewRadiusInset;
                    float f8 = f3 - f7;
                    if (abs > f8 && abs < f5 + f3) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlInnerRadius;
                        this.startDistance = abs;
                        this.startRadius = f3;
                    } else if (abs > f4 - f6 && abs < f4 + f7) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlOuterRadius;
                        this.startDistance = abs;
                        this.startRadius = f4;
                    } else if (abs <= f8 || abs >= f4 + f7) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlRotation;
                    }
                }
            } else if (i2 == 1) {
                if (sqrt < BlurViewCenterInset) {
                    this.activeControl = BlurViewActiveControl.BlurViewActiveControlCenter;
                    this.startCenterPoint = actualCenterPoint;
                } else {
                    float f9 = BlurViewRadiusInset;
                    if (sqrt > f3 - f9 && sqrt < f5 + f3) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlInnerRadius;
                        this.startDistance = sqrt;
                        this.startRadius = f3;
                    } else if (sqrt > f4 - f6 && sqrt < f9 + f4) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlOuterRadius;
                        this.startDistance = sqrt;
                        this.startRadius = f4;
                    }
                }
            }
            setSelected(true, true);
            return;
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = BlurViewActiveControl.BlurViewActiveControlNone;
                setSelected(false, true);
                return;
            }
            return;
        }
        int i3 = this.type;
        if (i3 == 0) {
            int ordinal = this.activeControl.ordinal();
            if (ordinal == 1) {
                float f10 = x - this.pointerStartX;
                float f11 = y - this.pointerStartY;
                float width = (getWidth() - this.actualAreaSize.width) / 2.0f;
                float f12 = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
                float height = getHeight();
                Size size2 = this.actualAreaSize;
                float f13 = size2.height;
                RectOld rectOld = new RectOld(width, f12 + ((height - f13) / 2.0f), size2.width, f13);
                float f14 = rectOld.x;
                float max = Math.max(f14, Math.min(rectOld.width + f14, this.startCenterPoint.x + f10));
                float f15 = rectOld.y;
                PointF pointF = new PointF(max, Math.max(f15, Math.min(rectOld.height + f15, this.startCenterPoint.y + f11)));
                float f16 = pointF.x - rectOld.x;
                Size size3 = this.actualAreaSize;
                float f17 = size3.width;
                this.centerPoint = new PointF(f16 / f17, ((pointF.y - rectOld.y) + ((f17 - size3.height) / 2.0f)) / f17);
            } else if (ordinal == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (abs - this.startDistance)) / min), this.size - 0.02f);
            } else if (ordinal == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (abs - this.startDistance)) / min);
            } else if (ordinal == 5) {
                float f18 = x - this.pointerStartX;
                float f19 = y - this.pointerStartY;
                boolean z = x > actualCenterPoint.x;
                boolean z2 = y > actualCenterPoint.y;
                boolean z3 = Math.abs(f19) > Math.abs(f18);
                if (z || z2 ? !(!z || z2 ? !z || !z2 ? !z3 ? f18 >= 0.0f : f19 >= 0.0f : !z3 ? f18 >= 0.0f : f19 <= 0.0f : !z3 ? f18 <= 0.0f : f19 <= 0.0f) : !(!z3 ? f18 <= 0.0f : f19 >= 0.0f)) {
                    r6 = 1;
                }
                this.angle += ((((float) Math.sqrt((f18 * f18) + (f19 * f19))) * ((r6 * 2) - 1)) / 3.1415927f) / 1.15f;
                this.pointerStartX = x;
                this.pointerStartY = y;
            }
        } else if (i3 == 1) {
            int ordinal2 = this.activeControl.ordinal();
            if (ordinal2 == 1) {
                float f20 = x - this.pointerStartX;
                float f21 = y - this.pointerStartY;
                float width2 = (getWidth() - this.actualAreaSize.width) / 2.0f;
                float f22 = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
                float height2 = getHeight();
                Size size4 = this.actualAreaSize;
                float f23 = size4.height;
                RectOld rectOld2 = new RectOld(width2, f22 + ((height2 - f23) / 2.0f), size4.width, f23);
                float f24 = rectOld2.x;
                float max2 = Math.max(f24, Math.min(rectOld2.width + f24, this.startCenterPoint.x + f20));
                float f25 = rectOld2.y;
                PointF pointF2 = new PointF(max2, Math.max(f25, Math.min(rectOld2.height + f25, this.startCenterPoint.y + f21)));
                float f26 = pointF2.x - rectOld2.x;
                Size size5 = this.actualAreaSize;
                float f27 = size5.width;
                this.centerPoint = new PointF(f26 / f27, ((pointF2.y - rectOld2.y) + ((f27 - size5.height) / 2.0f)) / f27);
            } else if (ordinal2 == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (sqrt - this.startDistance)) / min), this.size - 0.02f);
            } else if (ordinal2 == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (sqrt - this.startDistance)) / min);
            }
        }
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            photoFilterLinearBlurControlDelegate.valueChanged(this.centerPoint, this.falloff, this.size, degreesToRadians(this.angle) + 1.5707964f);
        }
    }

    private void handlePinch(int i, MotionEvent motionEvent) {
        if (i == 1) {
            this.startPointerDistance = getDistance(motionEvent);
            this.pointerScale = 1.0f;
            this.activeControl = BlurViewActiveControl.BlurViewActiveControlWholeArea;
            setSelected(true, true);
        } else if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = BlurViewActiveControl.BlurViewActiveControlNone;
                setSelected(false, true);
                return;
            }
            return;
        }
        float distance = getDistance(motionEvent);
        float f = this.pointerScale + (((distance - this.startPointerDistance) / AndroidUtilities.density) * 0.01f);
        this.pointerScale = f;
        float max = Math.max(0.1f, this.falloff * f);
        this.falloff = max;
        this.size = Math.max(max + 0.02f, this.size * this.pointerScale);
        this.pointerScale = 1.0f;
        this.startPointerDistance = distance;
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            photoFilterLinearBlurControlDelegate.valueChanged(this.centerPoint, this.falloff, this.size, degreesToRadians(this.angle) + 1.5707964f);
        }
    }

    public void setActualAreaSize(float f, float f2) {
        Size size = this.actualAreaSize;
        size.width = f;
        size.height = f2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i = this.type;
        int i2 = 0;
        if (i == 0) {
            canvas2.rotate(this.angle);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            for (int i3 = 0; i3 < 30; i3++) {
                float f = dp2 + dp;
                float f2 = i3 * f;
                float f3 = -actualInnerRadius;
                float f4 = f2 + dp2;
                float f5 = dp3 - actualInnerRadius;
                canvas2.drawRect(f2, f3, f4, f5, this.paint);
                float f6 = ((-i3) * f) - dp;
                float f7 = f6 - dp2;
                canvas2 = canvas;
                canvas2.drawRect(f7, f3, f6, f5, this.paint);
                float f8 = dp3 + actualInnerRadius;
                canvas2.drawRect(f2, actualInnerRadius, f4, f8, this.paint);
                canvas2.drawRect(f7, actualInnerRadius, f6, f8, this.paint);
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i2 < 64) {
                float f9 = dp4 + dp;
                float f10 = i2 * f9;
                float f11 = -actualOuterRadius;
                float f12 = dp4 + f10;
                float f13 = dp3 - actualOuterRadius;
                canvas.drawRect(f10, f11, f12, f13, this.paint);
                float f14 = ((-i2) * f9) - dp;
                float f15 = f14 - dp4;
                canvas.drawRect(f15, f11, f14, f13, this.paint);
                float f16 = dp3 + actualOuterRadius;
                canvas.drawRect(f10, actualOuterRadius, f12, f16, this.paint);
                canvas.drawRect(f15, actualOuterRadius, f14, f16, this.paint);
                i2++;
            }
        } else if (i == 1) {
            float f17 = -actualInnerRadius;
            this.arcRect.set(f17, f17, actualInnerRadius, actualInnerRadius);
            for (int i4 = 0; i4 < 22; i4++) {
                canvas.drawArc(this.arcRect, 16.35f * i4, 10.2f, false, this.arcPaint);
            }
            float f18 = -actualOuterRadius;
            this.arcRect.set(f18, f18, actualOuterRadius, actualOuterRadius);
            while (i2 < 64) {
                canvas.drawArc(this.arcRect, 5.62f * i2, 3.6f, false, this.arcPaint);
                i2++;
            }
        }
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), this.paint);
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        float f = this.actualAreaSize.width;
        float f2 = ((width - f) / 2.0f) + (this.centerPoint.x * f);
        int i = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        Size size = this.actualAreaSize;
        float f3 = size.height;
        float f4 = i + ((height - f3) / 2.0f);
        float f5 = size.width;
        return new PointF(f2, (f4 - ((f5 - f3) / 2.0f)) + (this.centerPoint.y * f5));
    }

    private float getActualInnerRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.falloff;
    }

    private float getActualOuterRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.size;
    }
}
