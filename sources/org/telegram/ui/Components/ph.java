package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ph extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph(ni niVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = niVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.R1, getMeasuredWidth(), getMeasuredHeight());
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
                ni niVar = this.b;
                ph phVar = niVar.z0;
                if (niVar.y0.getAlpha() > 0.0f) {
                    float f9 = niVar.S1;
                    if (f9 != 0.0f && f9 != phVar.getTop() + niVar.S1) {
                        ValueAnimator valueAnimator = niVar.T1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = niVar.S1 - (phVar.getTop() + niVar.R1);
                        niVar.R1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        niVar.T1 = ofFloat;
                        ofFloat.addUpdateListener(new j6(this, 10));
                        niVar.T1.setInterpolator(jr.f);
                        niVar.T1.setDuration(200L);
                        niVar.T1.start();
                        niVar.S1 = 0.0f;
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
                ni niVar = this.b;
                fi fiVar = niVar.u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
                if (fiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    jk jkVar = niVar.l0;
                    if (fiVar == jkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", jkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        yi yiVar = niVar.h0;
                        if (fiVar == yiVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", yiVar.getSelectedItemsCount(), new Object[0]));
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
                if (this.b.e1.getVisibility() != 0) {
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
                ni niVar = this.b;
                if (niVar.D && niVar.E != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(niVar.E))), TLObject.FLAG_30), i11);
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
                if (this.b.e1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                super.setAlpha(f9);
                ni niVar = this.b;
                niVar.a2(0);
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                viewGroup.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f9);
                break;
            case 2:
                super.setAlpha(f9);
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f9);
                this.b.u0.j();
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }
}
