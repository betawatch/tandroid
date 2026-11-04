package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.vp;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.oo0;
import org.telegram.ui.ra1;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
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

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                u10 u10Var = (u10) this.b;
                u10Var.g0.invalidate();
                u10Var.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    q0Var.s.setAlpha(1.0f);
                    q0Var.s.setRotation(0.0f);
                    q0Var.s.setScaleX(1.0f);
                    q0Var.s.setScaleY(1.0f);
                    break;
                } else {
                    q0Var.s.setVisibility(4);
                    q0Var.s.setAlpha(0.0f);
                    q0Var.s.setRotation(45.0f);
                    q0Var.s.setScaleX(0.0f);
                    q0Var.s.setScaleY(0.0f);
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
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((ra1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(k.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                ((vp) this.b).y.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((gi.l3) obj).setTranslationY(f10);
                    }
                }
                oo0 oo0Var = photoViewer.h1;
                if (oo0Var != null) {
                    oo0Var.setTranslationY(f10);
                }
                u70 u70Var = photoViewer.g1;
                if (u70Var != null) {
                    u70Var.setTranslationY(f10);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
