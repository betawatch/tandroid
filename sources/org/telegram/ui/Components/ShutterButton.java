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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class ShutterButton extends View {
    public Drawable a;
    public DecelerateInterpolator b;
    public Paint c;
    public Paint d;
    public kt0 e;
    public lt0 f;
    public boolean h;
    public float n;
    public long r;
    public long s;
    public boolean w;
    public gk x;

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

    public final void a(lt0 lt0Var) {
        if (this.f != lt0Var) {
            this.f = lt0Var;
            this.r = System.currentTimeMillis();
            this.s = 0L;
            if (this.f != lt0.b) {
                this.n = 0.0f;
            }
            invalidate();
        }
    }

    public kt0 getDelegate() {
        return this.e;
    }

    public lt0 getState() {
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
        if (this.f != lt0.b) {
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
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), org.telegram.messenger.gd.M0(2131754926, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), org.telegram.messenger.gd.M0(2131754928, null)));
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
        gk gkVar = this.x;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            org.telegram.messenger.g0.h3(gkVar, 800L);
            this.h = true;
            this.w = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            org.telegram.messenger.g0.r(gkVar);
            if (this.w) {
                ((vl) this.e).a();
            }
        } else if (action == 2) {
            if (x10 >= 0.0f && x10 <= getMeasuredWidth()) {
                x10 = 0.0f;
            }
            if (y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                y10 = 0.0f;
            }
            vl vlVar = (vl) this.e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.e;
            c81 c81Var = chatAttachAlertPhotoLayout.m0;
            FrameLayout frameLayout = vlVar.d;
            boolean z10 = frameLayout.getWidth() < frameLayout.getHeight();
            float f10 = z10 ? x10 : y10;
            float f11 = z10 ? y10 : x10;
            if (vlVar.b || Math.abs(f10) <= Math.abs(f11)) {
                if (f11 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.r1;
                    chatAttachAlertPhotoLayout.w0(true);
                    c81Var.b(true, (-f11) / org.telegram.messenger.g0.L(200.0f));
                    vlVar.b = true;
                    return true;
                }
                if (vlVar.b) {
                    c81Var.b(true, 0.0f);
                }
                if (x10 == 0.0f && y10 == 0.0f) {
                    vlVar.b = false;
                }
                if (!vlVar.b) {
                    if (x10 == 0.0f) {
                    }
                    org.telegram.messenger.g0.r(gkVar);
                    if (this.f == lt0.b) {
                        this.w = false;
                        setHighlighted(false);
                        vl vlVar2 = (vl) this.e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar2.e;
                        File file = vlVar2.a;
                        if (file != null) {
                            file.delete();
                            vlVar2.a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout2.o0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.Q.getCameraSession(), true);
                        a(lt0.a);
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

    public void setDelegate(kt0 kt0Var) {
        this.e = kt0Var;
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
