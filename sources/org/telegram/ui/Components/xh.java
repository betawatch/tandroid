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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xh extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(vi viVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = viVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.b.V1, getMeasuredWidth(), getMeasuredHeight());
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
                vi viVar = this.b;
                xh xhVar = viVar.D0;
                if (viVar.C0.getAlpha() > 0.0f) {
                    float f7 = viVar.W1;
                    if (f7 != 0.0f && f7 != xhVar.getTop() + viVar.W1) {
                        ValueAnimator valueAnimator = viVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = viVar.W1 - (xhVar.getTop() + viVar.V1);
                        viVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        viVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new l6(this, 10));
                        viVar.X1.setInterpolator(pr.f);
                        viVar.X1.setDuration(200L);
                        viVar.X1.start();
                        viVar.W1 = 0.0f;
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
                vi viVar = this.b;
                ni niVar = viVar.y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    ok okVar = viVar.p0;
                    if (niVar == okVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", okVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        gj gjVar = viVar.l0;
                        if (niVar == gjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", gjVar.getSelectedItemsCount(), new Object[0]));
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
                if (this.b.i1.getVisibility() != 0) {
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
                vi viVar = this.b;
                if (viVar.H && viVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(viVar.I))), TLObject.FLAG_30), i11);
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
                if (this.b.i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                super.setAlpha(f7);
                vi viVar = this.b;
                viVar.a2(0);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
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
                this.b.y0.j();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
