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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ah extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah(bi biVar, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = biVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.Q3, getMeasuredWidth(), getMeasuredHeight());
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
                ah ahVar = biVar.y2;
                if (biVar.x2.getAlpha() > 0.0f) {
                    float f10 = biVar.R3;
                    if (f10 != 0.0f && f10 != ahVar.getTop() + biVar.R3) {
                        ValueAnimator valueAnimator = biVar.S3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = biVar.R3 - (ahVar.getTop() + biVar.Q3);
                        biVar.Q3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        biVar.S3 = ofFloat;
                        ofFloat.addUpdateListener(new c6(this, 10));
                        biVar.S3.setInterpolator(xq.f);
                        biVar.S3.setDuration(200L);
                        biVar.S3.start();
                        biVar.R3 = 0.0f;
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
                th thVar = biVar.t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
                if (thVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    uj ujVar = biVar.h2;
                    if (thVar == ujVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(ujVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        ni niVar = biVar.d2;
                        if (thVar == niVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(niVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
                if (this.b.d3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 1:
                bi biVar = this.b;
                if (biVar.z1 && biVar.A1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(biVar.A1))), TLObject.FLAG_30), i10);
                    break;
                } else {
                    super.onMeasure(i3, i10);
                    break;
                }
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.d3.getVisibility() != 0) {
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
                bi biVar = this.b;
                biVar.P1(0);
                biVar.b.invalidate();
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
                this.b.t2.l();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
