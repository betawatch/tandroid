package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fq0;
import org.telegram.ui.rc1;
import org.telegram.ui.x20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Context context, int i10) {
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

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                x20 x20Var = (x20) this.b;
                x20Var.f0.invalidate();
                x20Var.invalidate();
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
                t0 t0Var = (t0) this.b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    t0Var.s.setAlpha(1.0f);
                    t0Var.s.setRotation(0.0f);
                    t0Var.s.setScaleX(1.0f);
                    t0Var.s.setScaleY(1.0f);
                    break;
                } else {
                    t0Var.s.setVisibility(4);
                    t0Var.s.setAlpha(0.0f);
                    t0Var.s.setRotation(45.0f);
                    t0Var.s.setScaleX(0.0f);
                    t0Var.s.setScaleY(0.0f);
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
                accessibilityNodeInfo.setChecked(((rc1) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(l.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 1:
                super.setAlpha(f7);
                ((cq) this.b).y.invalidate();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.h1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((vh.p2) obj).setTranslationY(f7);
                    }
                }
                fq0 fq0Var = photoViewer.g1;
                if (fq0Var != null) {
                    fq0Var.setTranslationY(f7);
                }
                r80 r80Var = photoViewer.f1;
                if (r80Var != null) {
                    r80Var.setTranslationY(f7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
