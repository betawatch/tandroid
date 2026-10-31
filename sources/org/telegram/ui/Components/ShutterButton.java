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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public eu0 e;
    public fu0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean w;
    public ew x;

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

    public final void a(fu0 fu0Var) {
        if (this.f != fu0Var) {
            this.f = fu0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != fu0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public eu0 getDelegate() {
        return this.e;
    }

    public fu0 getState() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.a;
        drawable.setBounds(measuredWidth - org.telegram.messenger.i0.L(36.0f), measuredHeight - org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f) + measuredWidth, org.telegram.messenger.i0.L(36.0f) + measuredHeight);
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
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.0f), paint2);
        if (this.f != fu0.b) {
            if (this.n != 0.0f) {
                canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.5f) * scaleX, paint);
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
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(26.5f) * scaleX * this.n, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.cd.L0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.cd.L0(2131754928, null)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(84.0f), org.telegram.messenger.i0.L(84.0f));
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
        ew ewVar = this.x;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            org.telegram.messenger.i0.h3(ewVar, 800L);
            this.h = true;
            this.w = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            org.telegram.messenger.i0.r(ewVar);
            if (this.w) {
                ((nl) this.e).a();
            }
        } else if (action == 2) {
            if (x10 >= 0.0f && x10 <= getMeasuredWidth()) {
                x10 = 0.0f;
            }
            if (y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                y3 = 0.0f;
            }
            nl nlVar = (nl) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
            s81 s81Var = chatAttachAlertPhotoLayout.l0;
            FrameLayout frameLayout = nlVar.d;
            boolean z10 = frameLayout.getWidth() < frameLayout.getHeight();
            float f7 = z10 ? x10 : y3;
            float f10 = z10 ? y3 : x10;
            if (nlVar.b || Math.abs(f7) <= Math.abs(f10)) {
                if (f10 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.q1;
                    chatAttachAlertPhotoLayout.u0(true);
                    s81Var.b(true, (-f10) / org.telegram.messenger.i0.L(200.0f));
                    nlVar.b = true;
                    return true;
                }
                if (nlVar.b) {
                    s81Var.b(true, 0.0f);
                }
                if (x10 == 0.0f && y3 == 0.0f) {
                    nlVar.b = false;
                }
                if (!nlVar.b) {
                    if (x10 == 0.0f) {
                    }
                    org.telegram.messenger.i0.r(ewVar);
                    if (this.f == fu0.b) {
                        this.w = false;
                        setHighlighted(false);
                        nl nlVar2 = (nl) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = nlVar2.e;
                        File file = nlVar2.a;
                        if (file != null) {
                            file.delete();
                            nlVar2.a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.q1;
                        chatAttachAlertPhotoLayout2.m0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.P.getCameraSession(), true);
                        a(fu0.a);
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

    public void setDelegate(eu0 eu0Var) {
        this.e = eu0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        invalidate();
    }
}
