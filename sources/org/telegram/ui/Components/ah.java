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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ah extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah(bi biVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = biVar;
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
                bi biVar = this.b;
                ah ahVar = biVar.x2;
                if (biVar.w2.getAlpha() > 0.0f) {
                    float f7 = biVar.Q3;
                    if (f7 != 0.0f && f7 != ahVar.getTop() + biVar.Q3) {
                        ValueAnimator valueAnimator = biVar.R3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = biVar.Q3 - (ahVar.getTop() + biVar.P3);
                        biVar.P3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        biVar.R3 = ofFloat;
                        ofFloat.addUpdateListener(new a6(this, 10));
                        biVar.R3.setInterpolator(gr.f);
                        biVar.R3.setDuration(200L);
                        biVar.R3.start();
                        biVar.Q3 = 0.0f;
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
                bi biVar = this.b;
                uh uhVar = biVar.s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    xj xjVar = biVar.g2;
                    if (uhVar == xjVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(xjVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        mi miVar = biVar.c2;
                        if (uhVar == miVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(miVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                bi biVar = this.b;
                if (biVar.y1 && biVar.z1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(36.0f) + (org.telegram.messenger.i0.L(80.0f) * Integer.bitCount(biVar.z1))), TLObject.FLAG_30), i11);
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
            default:
                super.onMeasure(i10, i11);
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
    public void setAlpha(float f7) {
        switch (this.a) {
            case 0:
                super.setAlpha(f7);
                bi biVar = this.b;
                biVar.O1(0);
                biVar.b.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f7);
                break;
            case 2:
                super.setAlpha(f7);
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f7);
                this.b.s2.k();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
