package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dh extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh(di diVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = diVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.P3, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                di diVar = this.b;
                dh dhVar = diVar.x2;
                if (diVar.w2.getAlpha() > 0.0f) {
                    float f10 = diVar.Q3;
                    if (f10 != 0.0f && f10 != dhVar.getTop() + diVar.Q3) {
                        ValueAnimator valueAnimator = diVar.R3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = diVar.Q3 - (dhVar.getTop() + diVar.P3);
                        diVar.P3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        diVar.R3 = ofFloat;
                        ofFloat.addUpdateListener(new e6(this, 10));
                        diVar.R3.setInterpolator(xq.f);
                        diVar.R3.setDuration(200L);
                        diVar.R3.start();
                        diVar.Q3 = 0.0f;
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                di diVar = this.b;
                vh vhVar = diVar.s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
                if (vhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    vj vjVar = diVar.g2;
                    if (vhVar == vjVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(vjVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        ni niVar = diVar.c2;
                        if (vhVar == niVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(niVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.c3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                di diVar = this.b;
                if (diVar.y1 && diVar.z1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(diVar.z1))), TLObject.FLAG_30), i10);
                    break;
                } else {
                    super.onMeasure(i7, i10);
                    break;
                }
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.c3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                di diVar = this.b;
                diVar.P1(0);
                diVar.b.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f10);
                break;
            case 2:
                super.setAlpha(f10);
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f10);
                this.b.s2.l();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
