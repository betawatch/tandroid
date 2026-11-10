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
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public ct0 e;
    public dt0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean w;
    public dt x;

    private void setHighlighted(boolean z9) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z9) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.b);
        animatorSet.start();
    }

    public final void a(dt0 dt0Var) {
        if (this.f != dt0Var) {
            this.f = dt0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != dt0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public ct0 getDelegate() {
        return this.e;
    }

    public dt0 getState() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.g0.L(36.0f), measuredHeight - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f) + measuredWidth, org.telegram.messenger.g0.L(36.0f) + measuredHeight);
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
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.0f), paint2);
        if (this.f != dt0.b) {
            if (this.n != 0.0f) {
                canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX, paint);
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
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(26.5f) * scaleX * this.n, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.id.M0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.id.M0(2131754928, null)));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(84.0f), org.telegram.messenger.g0.L(84.0f));
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
        dt dtVar = this.x;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            org.telegram.messenger.g0.i3(dtVar, 800L);
            this.h = true;
            this.w = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            org.telegram.messenger.g0.r(dtVar);
            if (this.w) {
                ((gl) this.e).a();
            }
        } else if (action == 2) {
            if (x10 >= 0.0f && x10 <= getMeasuredWidth()) {
                x10 = 0.0f;
            }
            if (y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                y10 = 0.0f;
            }
            gl glVar = (gl) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.e;
            r71 r71Var = chatAttachAlertPhotoLayout.l0;
            FrameLayout frameLayout = glVar.d;
            boolean z9 = frameLayout.getWidth() < frameLayout.getHeight();
            float f10 = z9 ? x10 : y10;
            float f11 = z9 ? y10 : x10;
            if (glVar.b || Math.abs(f10) <= Math.abs(f11)) {
                if (f11 < 0.0f) {
                    boolean z10 = ChatAttachAlertPhotoLayout.q1;
                    chatAttachAlertPhotoLayout.w0(true);
                    r71Var.b(true, (-f11) / org.telegram.messenger.g0.L(200.0f));
                    glVar.b = true;
                    return true;
                }
                if (glVar.b) {
                    r71Var.b(true, 0.0f);
                }
                if (x10 == 0.0f && y10 == 0.0f) {
                    glVar.b = false;
                }
                if (!glVar.b) {
                    if (x10 == 0.0f) {
                    }
                    org.telegram.messenger.g0.r(dtVar);
                    if (this.f == dt0.b) {
                        this.w = false;
                        setHighlighted(false);
                        gl glVar2 = (gl) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = glVar2.e;
                        File file = glVar2.a;
                        if (file != null) {
                            file.delete();
                            glVar2.a = null;
                        }
                        boolean z11 = ChatAttachAlertPhotoLayout.q1;
                        chatAttachAlertPhotoLayout2.o0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.P.getCameraSession(), true);
                        a(dt0.a);
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

    public void setDelegate(ct0 ct0Var) {
        this.e = ct0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
