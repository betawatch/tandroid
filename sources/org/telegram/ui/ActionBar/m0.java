package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.gq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cg1;
import org.telegram.ui.vr0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Context context, int i10) {
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
                accessibilityNodeInfo.setChecked(((cg1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 1:
                super.setAlpha(f9);
                ((gq) this.b).x.invalidate();
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.d1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((nh.t3) obj).setTranslationY(f9);
                    }
                }
                vr0 vr0Var = photoViewer.c1;
                if (vr0Var != null) {
                    vr0Var.setTranslationY(f9);
                }
                a90 a90Var = photoViewer.b1;
                if (a90Var != null) {
                    a90Var.setTranslationY(f9);
                    break;
                }
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }
}
