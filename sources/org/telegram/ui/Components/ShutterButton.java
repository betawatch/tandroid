package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public vu0 e;
    public wu0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean v;
    public rk0 w;

    private void setHighlighted(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z10) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.b);
        animatorSet.start();
    }

    public final void a(wu0 wu0Var) {
        if (this.f != wu0Var) {
            this.f = wu0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != wu0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public vu0 getDelegate() {
        return this.e;
    }

    public wu0 getState() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.n != 0.0f) {
                this.n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f9 = measuredWidth;
        float f10 = measuredHeight;
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.0f), paint2);
        if (this.f != wu0.b) {
            if (this.n != 0.0f) {
                canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.5f) * scaleX, paint);
                return;
            }
            return;
        }
        if (this.n != 1.0f) {
            long abs = Math.abs(System.currentTimeMillis() - this.r);
            if (abs > 17) {
                abs = 17;
            }
            long j10 = this.s + abs;
            this.s = j10;
            if (j10 > 120) {
                this.s = 120L;
            }
            this.n = this.b.getInterpolation(this.s / 120.0f);
            invalidate();
        }
        canvas.drawCircle(f9, f10, AndroidUtilities.dp(26.5f) * scaleX * this.n, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.AccActionTakePicture)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), LocaleController.getString(R.string.AccActionRecordVideo)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r7.getTag() == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
    
        if (r2 != 0.0f) goto L57;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rk0 rk0Var = this.w;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(rk0Var, 800L);
            this.h = true;
            this.v = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(rk0Var);
            if (this.v) {
                ((ml) this.e).b();
            }
        } else if (action == 2) {
            if (x4 >= 0.0f && x4 <= getMeasuredWidth()) {
                x4 = 0.0f;
            }
            if (y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                y8 = 0.0f;
            }
            ml mlVar = (ml) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = mlVar.e;
            u81 u81Var = chatAttachAlertPhotoLayout.h0;
            org.telegram.ui.ActionBar.d3 d3Var = mlVar.d;
            boolean z10 = d3Var.getWidth() < d3Var.getHeight();
            float f9 = z10 ? x4 : y8;
            float f10 = z10 ? y8 : x4;
            if (mlVar.b || Math.abs(f9) <= Math.abs(f10)) {
                if (f10 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.m1;
                    chatAttachAlertPhotoLayout.t0(true);
                    u81Var.b((-f10) / AndroidUtilities.dp(200.0f), true);
                    mlVar.b = true;
                    return true;
                }
                if (mlVar.b) {
                    u81Var.b(0.0f, true);
                }
                if (x4 == 0.0f && y8 == 0.0f) {
                    mlVar.b = false;
                }
                if (!mlVar.b) {
                    if (x4 == 0.0f) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    if (this.f == wu0.b) {
                        this.v = false;
                        setHighlighted(false);
                        ml mlVar2 = (ml) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = mlVar2.e;
                        File file = mlVar2.a;
                        if (file != null) {
                            file.delete();
                            mlVar2.a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.m1;
                        chatAttachAlertPhotoLayout2.l0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.L.getCameraSession(), true);
                        a(wu0.a);
                        return true;
                    }
                }
            }
        } else if (action == 3) {
            setHighlighted(false);
            this.h = false;
            return true;
        }
        return true;
    }

    public void setDelegate(vu0 vu0Var) {
        this.e = vu0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f9) {
        super.setScaleX(f9);
        invalidate();
    }
}
