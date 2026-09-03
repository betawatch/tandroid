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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public dv0 e;
    public ev0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean v;
    public tl0 w;

    private void setHighlighted(boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z4) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.b);
        animatorSet.start();
    }

    public final void a(ev0 ev0Var) {
        if (this.f != ev0Var) {
            this.f = ev0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != ev0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public dv0 getDelegate() {
        return this.e;
    }

    public ev0 getState() {
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
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.0f), paint2);
        if (this.f != ev0.b) {
            if (this.n != 0.0f) {
                canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX, paint);
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
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX * this.n, paint);
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
        tl0 tl0Var = this.w;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(tl0Var, 800L);
            this.h = true;
            this.v = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(tl0Var);
            if (this.v) {
                ((ol) this.e).b();
            }
        } else if (action == 2) {
            if (x10 >= 0.0f && x10 <= getMeasuredWidth()) {
                x10 = 0.0f;
            }
            if (y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                y10 = 0.0f;
            }
            ol olVar = (ol) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.e;
            h91 h91Var = chatAttachAlertPhotoLayout.i0;
            org.telegram.ui.ActionBar.f3 f3Var = olVar.d;
            boolean z4 = f3Var.getWidth() < f3Var.getHeight();
            float f10 = z4 ? x10 : y10;
            float f11 = z4 ? y10 : x10;
            if (olVar.b || Math.abs(f10) <= Math.abs(f11)) {
                if (f11 < 0.0f) {
                    boolean z10 = ChatAttachAlertPhotoLayout.n1;
                    chatAttachAlertPhotoLayout.t0(true);
                    h91Var.b((-f11) / AndroidUtilities.dp(200.0f), true);
                    olVar.b = true;
                    return true;
                }
                if (olVar.b) {
                    h91Var.b(0.0f, true);
                }
                if (x10 == 0.0f && y10 == 0.0f) {
                    olVar.b = false;
                }
                if (!olVar.b) {
                    if (x10 == 0.0f) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(tl0Var);
                    if (this.f == ev0.b) {
                        this.v = false;
                        setHighlighted(false);
                        ol olVar2 = (ol) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = olVar2.e;
                        File file = olVar2.a;
                        if (file != null) {
                            file.delete();
                            olVar2.a = null;
                        }
                        boolean z11 = ChatAttachAlertPhotoLayout.n1;
                        chatAttachAlertPhotoLayout2.l0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.M.getCameraSession(), true);
                        a(ev0.a);
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

    public void setDelegate(dv0 dv0Var) {
        this.e = dv0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
