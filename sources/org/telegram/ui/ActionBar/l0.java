package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ag1;
import org.telegram.ui.wr0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
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
                accessibilityNodeInfo.setChecked(((ag1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                ((cq) this.b).x.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.d1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((kh.x3) obj).setTranslationY(f10);
                    }
                }
                wr0 wr0Var = photoViewer.c1;
                if (wr0Var != null) {
                    wr0Var.setTranslationY(f10);
                }
                n80 n80Var = photoViewer.b1;
                if (n80Var != null) {
                    n80Var.setTranslationY(f10);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
