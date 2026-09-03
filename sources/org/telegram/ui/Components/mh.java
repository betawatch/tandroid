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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mh extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh(mi miVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = miVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.S1, getMeasuredWidth(), getMeasuredHeight());
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
                mi miVar = this.b;
                mh mhVar = miVar.A0;
                if (miVar.z0.getAlpha() > 0.0f) {
                    float f10 = miVar.T1;
                    if (f10 != 0.0f && f10 != mhVar.getTop() + miVar.T1) {
                        ValueAnimator valueAnimator = miVar.U1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = miVar.T1 - (mhVar.getTop() + miVar.S1);
                        miVar.S1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        miVar.U1 = ofFloat;
                        ofFloat.addUpdateListener(new f6(this, 10));
                        miVar.U1.setInterpolator(pr.f);
                        miVar.U1.setDuration(200L);
                        miVar.U1.start();
                        miVar.T1 = 0.0f;
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
                mi miVar = this.b;
                ei eiVar = miVar.v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.g0;
                if (eiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    jk jkVar = miVar.m0;
                    if (eiVar == jkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", jkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        xi xiVar = miVar.i0;
                        if (eiVar == xiVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", xiVar.getSelectedItemsCount(), new Object[0]));
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
                if (this.b.f1.getVisibility() != 0) {
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
                mi miVar = this.b;
                if (miVar.E && miVar.F != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(miVar.F))), TLObject.FLAG_30), i11);
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
                if (this.b.f1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                mi miVar = this.b;
                miVar.a2(0);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
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
                this.b.v0.j();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
