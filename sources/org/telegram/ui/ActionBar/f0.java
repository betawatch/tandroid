package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xo0;
import org.telegram.ui.z10;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
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
                z10 z10Var = (z10) this.b;
                z10Var.f0.invalidate();
                z10Var.invalidate();
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
                r0 r0Var = (r0) this.b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    r0Var.s.setAlpha(1.0f);
                    r0Var.s.setRotation(0.0f);
                    r0Var.s.setScaleX(1.0f);
                    r0Var.s.setScaleY(1.0f);
                    break;
                } else {
                    r0Var.s.setVisibility(4);
                    r0Var.s.setAlpha(0.0f);
                    r0Var.s.setRotation(45.0f);
                    r0Var.s.setScaleX(0.0f);
                    r0Var.s.setScaleY(0.0f);
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
                accessibilityNodeInfo.setChecked(((za1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(k.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
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
                ArrayList arrayList = photoViewer.h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((fi.m3) obj).setTranslationY(f10);
                    }
                }
                xo0 xo0Var = photoViewer.g1;
                if (xo0Var != null) {
                    xo0Var.setTranslationY(f10);
                }
                y70 y70Var = photoViewer.f1;
                if (y70Var != null) {
                    y70Var.setTranslationY(f10);
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
