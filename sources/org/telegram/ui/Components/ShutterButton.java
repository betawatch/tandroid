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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public ov0 e;
    public pv0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean v;
    public org.telegram.ui.Cells.t6 w;

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

    public final void a(pv0 pv0Var) {
        if (this.f != pv0Var) {
            this.f = pv0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != pv0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public ov0 getDelegate() {
        return this.e;
    }

    public pv0 getState() {
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
        if (this.f != pv0.b) {
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
            long j3 = this.s + abs;
            this.s = j3;
            if (j3 > 120) {
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
        org.telegram.ui.Cells.t6 t6Var = this.w;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(t6Var, 800L);
            this.h = true;
            this.v = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            if (this.v) {
                ((sl) this.e).b();
            }
        } else if (action == 2) {
            if (x10 >= 0.0f && x10 <= getMeasuredWidth()) {
                x10 = 0.0f;
            }
            if (y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                y3 = 0.0f;
            }
            sl slVar = (sl) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.e;
            q91 q91Var = chatAttachAlertPhotoLayout.l0;
            org.telegram.ui.ActionBar.c3 c3Var = slVar.d;
            boolean z10 = c3Var.getWidth() < c3Var.getHeight();
            float f7 = z10 ? x10 : y3;
            float f10 = z10 ? y3 : x10;
            if (slVar.b || Math.abs(f7) <= Math.abs(f10)) {
                if (f10 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.q1;
                    chatAttachAlertPhotoLayout.t0(true);
                    q91Var.b((-f10) / AndroidUtilities.dp(200.0f), true);
                    slVar.b = true;
                    return true;
                }
                if (slVar.b) {
                    q91Var.b(0.0f, true);
                }
                if (x10 == 0.0f && y3 == 0.0f) {
                    slVar.b = false;
                }
                if (!slVar.b) {
                    if (x10 == 0.0f) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    if (this.f == pv0.b) {
                        this.v = false;
                        setHighlighted(false);
                        sl slVar2 = (sl) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = slVar2.e;
                        File file = slVar2.a;
                        if (file != null) {
                            file.delete();
                            slVar2.a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.q1;
                        chatAttachAlertPhotoLayout2.l0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.P.getCameraSession(), true);
                        a(pv0.a);
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

    public void setDelegate(ov0 ov0Var) {
        this.e = ov0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        invalidate();
    }
}
