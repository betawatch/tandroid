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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ch extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(ci ciVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = ciVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
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
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                ci ciVar = this.b;
                ch chVar = ciVar.A2;
                if (ciVar.z2.getAlpha() > 0.0f) {
                    float f10 = ciVar.T3;
                    if (f10 != 0.0f && f10 != chVar.getTop() + ciVar.T3) {
                        ValueAnimator valueAnimator = ciVar.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = ciVar.T3 - (chVar.getTop() + ciVar.S3);
                        ciVar.S3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        ciVar.U3 = ofFloat;
                        ofFloat.addUpdateListener(new d6(this, 10));
                        ciVar.U3.setInterpolator(wq.f);
                        ciVar.U3.setDuration(200L);
                        ciVar.U3.start();
                        ciVar.T3 = 0.0f;
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
                ci ciVar = this.b;
                uh uhVar = ciVar.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.id.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    uj ujVar = ciVar.j2;
                    if (uhVar == ujVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.id.G(ujVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        mi miVar = ciVar.f2;
                        if (uhVar == miVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.id.G(miVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
                if (this.b.f3.getVisibility() != 0) {
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
                ci ciVar = this.b;
                if (ciVar.B1 && ciVar.C1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(ciVar.C1))), TLObject.FLAG_30), i10);
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
                if (this.b.f3.getVisibility() != 0) {
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
                ci ciVar = this.b;
                ciVar.P1(0);
                ciVar.b.invalidate();
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
                this.b.v2.l();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
