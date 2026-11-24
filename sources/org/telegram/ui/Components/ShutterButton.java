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
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public zia e;
    public aja f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean w;
    public ei7 x;

    private void setHighlighted(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.b);
        animatorSet.start();
    }

    public final void a(aja ajaVar) {
        if (this.f != ajaVar) {
            this.f = ajaVar;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != aja.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public zia getDelegate() {
        return this.e;
    }

    public aja getState() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.a;
        drawable.setBounds(measuredWidth - gm.L(36.0f), measuredHeight - gm.L(36.0f), gm.L(36.0f) + measuredWidth, gm.L(36.0f) + measuredHeight);
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
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.drawCircle(f, f2, gm.L(26.0f), paint2);
        aja ajaVar = this.f;
        float f3 = this.n;
        if (ajaVar != aja.b) {
            if (f3 != 0.0f) {
                canvas.drawCircle(f, f2, gm.L(26.5f) * scaleX, paint);
                return;
            }
            return;
        }
        if (f3 != 1.0f) {
            long abs = Math.abs(System.currentTimeMillis() - this.r);
            if (abs > 17) {
                abs = 17;
            }
            long j = this.s + abs;
            this.s = j;
            if (j > 120) {
                this.s = 120L;
                j = 120;
            }
            this.n = this.b.getInterpolation(j / 120.0f);
            invalidate();
        }
        canvas.drawCircle(f, f2, gm.L(26.5f) * scaleX * this.n, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), jb6.M0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), jb6.M0(2131754928, null)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(84.0f), gm.L(84.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r7.getTag() == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        if (r2 != 0.0f) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        ei7 ei7Var = this.x;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            gm.d3(ei7Var, 800L);
            this.h = true;
            this.w = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            gm.r(ei7Var);
            if (this.w) {
                ((b62) this.e).a();
            }
        } else if (action == 2) {
            if (x >= 0.0f && x <= getMeasuredWidth()) {
                x = 0.0f;
            }
            if (y >= 0.0f && y <= getMeasuredHeight()) {
                y = 0.0f;
            }
            b62 b62Var = (b62) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b62Var.e;
            b1d b1dVar = chatAttachAlertPhotoLayout.m0;
            dy0 dy0Var = b62Var.d;
            if (dy0Var.getWidth() < dy0Var.getHeight()) {
                f2 = x;
                f = y;
            } else {
                f = x;
                f2 = y;
            }
            if (b62Var.b || Math.abs(f2) <= Math.abs(f)) {
                if (f < 0.0f) {
                    boolean z = ChatAttachAlertPhotoLayout.r1;
                    chatAttachAlertPhotoLayout.w0(true);
                    b1dVar.b(true, (-f) / gm.L(200.0f));
                    b62Var.b = true;
                    return true;
                }
                if (b62Var.b) {
                    b1dVar.b(true, 0.0f);
                }
                if (x == 0.0f && y == 0.0f) {
                    b62Var.b = false;
                }
                if (!b62Var.b) {
                    if (x == 0.0f) {
                    }
                    gm.r(ei7Var);
                    if (this.f == aja.b) {
                        this.w = false;
                        setHighlighted(false);
                        b62 b62Var2 = (b62) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = b62Var2.e;
                        File file = b62Var2.a;
                        if (file != null) {
                            file.delete();
                            b62Var2.a = null;
                        }
                        boolean z2 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout2.o0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.Q.getCameraSession(), true);
                        a(aja.a);
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

    public void setDelegate(zia ziaVar) {
        this.e = ziaVar;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        invalidate();
    }
}
