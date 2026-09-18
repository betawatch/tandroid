package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.mq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bt0;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                getBackground().draw(canvas);
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    w0Var.s.setAlpha(1.0f);
                    w0Var.s.setRotation(0.0f);
                    w0Var.s.setScaleX(1.0f);
                    w0Var.s.setScaleY(1.0f);
                    break;
                } else {
                    w0Var.s.setVisibility(4);
                    w0Var.s.setAlpha(0.0f);
                    w0Var.s.setRotation(45.0f);
                    w0Var.s.setScaleX(0.0f);
                    w0Var.s.setScaleY(0.0f);
                    break;
                }
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((ih1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 1:
                super.setAlpha(f7);
                ((mq) this.b).x.invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ci.f4) obj).setTranslationY(f7);
                    }
                }
                bt0 bt0Var = photoViewer.g1;
                if (bt0Var != null) {
                    bt0Var.setTranslationY(f7);
                }
                e90 e90Var = photoViewer.f1;
                if (e90Var != null) {
                    e90Var.setTranslationY(f7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
