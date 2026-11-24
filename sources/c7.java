// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.p;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c7 extends ImageView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
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
    public final void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                e55 e55Var = (e55) this.b;
                e55Var.g0.invalidate();
                e55Var.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                clearAnimation();
                Object tag = getTag();
                r7 r7Var = (r7) this.b;
                c7 c7Var = r7Var.s;
                if (tag != null) {
                    c7Var.setAlpha(1.0f);
                    r7Var.s.setRotation(0.0f);
                    r7Var.s.setScaleX(1.0f);
                    r7Var.s.setScaleY(1.0f);
                    break;
                } else {
                    c7Var.setVisibility(4);
                    r7Var.s.setAlpha(0.0f);
                    r7Var.s.setRotation(45.0f);
                    r7Var.s.setScaleX(0.0f);
                    r7Var.s.setScaleY(0.0f);
                    break;
                }
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((p3c) this.b).n.getTransformationMethod() == null);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.a) {
            case 1:
                super.setAlpha(f);
                ((p) this.b).y.invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 3:
                super.setTranslationY(f);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList = photoViewer.i1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((je5) obj).setTranslationY(f);
                    }
                }
                v78 v78Var = photoViewer.h1;
                if (v78Var != null) {
                    v78Var.setTranslationY(f);
                }
                o76 o76Var = photoViewer.g1;
                if (o76Var != null) {
                    o76Var.setTranslationY(f);
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
