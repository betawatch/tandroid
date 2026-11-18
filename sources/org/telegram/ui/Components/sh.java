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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sh extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(si siVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = siVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.T3, getMeasuredWidth(), getMeasuredHeight());
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
                si siVar = this.b;
                sh shVar = siVar.B2;
                if (siVar.A2.getAlpha() > 0.0f) {
                    float f10 = siVar.U3;
                    if (f10 != 0.0f && f10 != shVar.getTop() + siVar.U3) {
                        ValueAnimator valueAnimator = siVar.V3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = siVar.U3 - (shVar.getTop() + siVar.T3);
                        siVar.T3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        siVar.V3 = ofFloat;
                        ofFloat.addUpdateListener(new w(this, 11));
                        siVar.V3.setInterpolator(lr.f);
                        siVar.V3.setDuration(200L);
                        siVar.V3.start();
                        siVar.U3 = 0.0f;
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
                si siVar = this.b;
                ki kiVar = siVar.w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
                if (kiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    kk kkVar = siVar.k2;
                    if (kiVar == kkVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(kkVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        cj cjVar = siVar.g2;
                        if (kiVar == cjVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(cjVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
                if (this.b.g3.getVisibility() != 0) {
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
                si siVar = this.b;
                if (siVar.C1 && siVar.D1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(siVar.D1))), TLObject.FLAG_30), i10);
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
                if (this.b.g3.getVisibility() != 0) {
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
                si siVar = this.b;
                siVar.Q1(0);
                siVar.b.invalidate();
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
                this.b.w2.l();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
