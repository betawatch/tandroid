// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h12 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h12(i22 i22Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = i22Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.S3, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                i22 i22Var = this.b;
                h12 h12Var = i22Var.A2;
                if (i22Var.z2.getAlpha() > 0.0f) {
                    float f = i22Var.T3;
                    if (f != 0.0f && f != h12Var.getTop() + i22Var.T3) {
                        ValueAnimator valueAnimator = i22Var.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = i22Var.T3 - (h12Var.getTop() + i22Var.S3);
                        i22Var.S3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        i22Var.U3 = ofFloat;
                        ofFloat.addUpdateListener(new et1(this, (byte) 3));
                        i22Var.U3.setInterpolator(d53.f);
                        i22Var.U3.setDuration(200L);
                        i22Var.U3.start();
                        i22Var.T3 = 0.0f;
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                i22 i22Var = this.b;
                a22 a22Var = i22Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                if (a22Var == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(jb6.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    p42 p42Var = i22Var.j2;
                    if (a22Var == p42Var) {
                        accessibilityNodeInfo.setText(jb6.G(p42Var.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        s22 s22Var = i22Var.f2;
                        if (a22Var == s22Var) {
                            accessibilityNodeInfo.setText(jb6.G(s22Var.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
                        }
                    }
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                i22 i22Var = this.b;
                if (i22Var.B1 && i22Var.C1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gm.L(36.0f) + (gm.L(80.0f) * Integer.bitCount(i22Var.C1))), TLObject.FLAG_30), i2);
                    break;
                } else {
                    super.onMeasure(i, i2);
                    break;
                }
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.f3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 0:
                super.setAlpha(f);
                i22 i22Var = this.b;
                i22Var.K1(0);
                i22Var.b.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f);
                break;
            case 2:
                super.setAlpha(f);
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f);
                this.b.v2.l();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
