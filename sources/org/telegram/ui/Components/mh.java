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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mh extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh(ki kiVar, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = kiVar;
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
                ki kiVar = this.b;
                mh mhVar = kiVar.z0;
                if (kiVar.y0.getAlpha() > 0.0f) {
                    float f10 = kiVar.S1;
                    if (f10 != 0.0f && f10 != mhVar.getTop() + kiVar.S1) {
                        ValueAnimator valueAnimator = kiVar.T1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = kiVar.S1 - (mhVar.getTop() + kiVar.R1);
                        kiVar.R1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        kiVar.T1 = ofFloat;
                        ofFloat.addUpdateListener(new e6(this, 10));
                        kiVar.T1.setInterpolator(gr.f);
                        kiVar.T1.setDuration(200L);
                        kiVar.T1.start();
                        kiVar.S1 = 0.0f;
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
                ki kiVar = this.b;
                ci ciVar = kiVar.u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    fk fkVar = kiVar.l0;
                    if (ciVar == fkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", fkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        vi viVar = kiVar.h0;
                        if (ciVar == viVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", viVar.getSelectedItemsCount(), new Object[0]));
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
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                ki kiVar = this.b;
                if (kiVar.D && kiVar.E != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(kiVar.E))), TLObject.FLAG_30), i10);
                    break;
                } else {
                    super.onMeasure(i9, i10);
                    break;
                }
            default:
                super.onMeasure(i9, i10);
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
    public void setAlpha(float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                ki kiVar = this.b;
                kiVar.a2(0);
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
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
                this.b.u0.j();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
