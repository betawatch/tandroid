package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.rs0;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class j0 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Context context, int i10) {
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
                u0 u0Var = (u0) this.b;
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() != null) {
                    u0Var.s.setAlpha(1.0f);
                    u0Var.s.setRotation(0.0f);
                    u0Var.s.setScaleX(1.0f);
                    u0Var.s.setScaleY(1.0f);
                    break;
                } else {
                    u0Var.s.setVisibility(4);
                    u0Var.s.setAlpha(0.0f);
                    u0Var.s.setRotation(45.0f);
                    u0Var.s.setScaleX(0.0f);
                    u0Var.s.setScaleY(0.0f);
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
                accessibilityNodeInfo.setChecked(((zg1) this.b).n.getTransformationMethod() == null);
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
                ((nq) this.b).x.invalidate();
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
                        ((ci.e4) obj).setTranslationY(f7);
                    }
                }
                rs0 rs0Var = photoViewer.g1;
                if (rs0Var != null) {
                    rs0Var.setTranslationY(f7);
                }
                p90 p90Var = photoViewer.f1;
                if (p90Var != null) {
                    p90Var.setTranslationY(f7);
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
