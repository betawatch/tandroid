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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public gw0 e;
    public hw0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean v;
    public m.g3 w;

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

    public final void a(hw0 hw0Var) {
        if (this.f != hw0Var) {
            this.f = hw0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != hw0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public gw0 getDelegate() {
        return this.e;
    }

    public hw0 getState() {
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
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.0f), paint2);
        if (this.f != hw0.b) {
            if (this.n != 0.0f) {
                canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.5f) * scaleX, paint);
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
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(26.5f) * scaleX * this.n, paint);
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
        m.g3 g3Var = this.w;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(g3Var, 800L);
            this.h = true;
            this.v = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            if (this.v) {
                ((dm) this.e).a();
            }
        } else if (action == 2) {
            if (x9 >= 0.0f && x9 <= getMeasuredWidth()) {
                x9 = 0.0f;
            }
            if (y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                y3 = 0.0f;
            }
            dm dmVar = (dm) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
            kc1 kc1Var = chatAttachAlertPhotoLayout.l0;
            org.telegram.ui.ActionBar.h3 h3Var = dmVar.d;
            boolean z10 = h3Var.getWidth() < h3Var.getHeight();
            float f7 = z10 ? x9 : y3;
            float f10 = z10 ? y3 : x9;
            if (dmVar.b || Math.abs(f7) <= Math.abs(f10)) {
                if (f10 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.q1;
                    chatAttachAlertPhotoLayout.u0(true);
                    kc1Var.b((-f10) / AndroidUtilities.dp(200.0f), true);
                    dmVar.b = true;
                    return true;
                }
                if (dmVar.b) {
                    kc1Var.b(0.0f, true);
                }
                if (x9 == 0.0f && y3 == 0.0f) {
                    dmVar.b = false;
                }
                if (!dmVar.b) {
                    if (x9 == 0.0f) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    if (this.f == hw0.b) {
                        this.v = false;
                        setHighlighted(false);
                        dm dmVar2 = (dm) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = dmVar2.e;
                        File file = dmVar2.a;
                        if (file != null) {
                            file.delete();
                            dmVar2.a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.q1;
                        chatAttachAlertPhotoLayout2.m0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.P.getCameraSession(), true);
                        a(hw0.a);
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

    public void setDelegate(gw0 gw0Var) {
        this.e = gw0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        invalidate();
    }
}
