package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ez extends FrameLayout {
    public FrameLayout a;
    public org.telegram.ui.ActionBar.h5 b;
    public org.telegram.ui.ActionBar.h5 c;
    public ImageView d;
    public kh.v8 e;
    public bg.t f;
    public bg.t h;
    public TextView n;
    public org.telegram.ui.ActionBar.o2 r;
    public String s;
    public float v;
    public ValueAnimator w;
    public org.telegram.ui.ActionBar.o1 x;
    public float[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y10 = frameLayout.getY() + f10;
            f11 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y10 -= frameLayout.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), TLObject.FLAG_30));
    }
}
