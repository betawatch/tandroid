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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class hz extends FrameLayout {
    public FrameLayout a;
    public org.telegram.ui.ActionBar.n5 b;
    public org.telegram.ui.ActionBar.n5 c;
    public ImageView d;
    public gz e;
    public ai.wd f;
    public ai.wd h;
    public TextView n;
    public org.telegram.ui.ActionBar.o2 r;
    public String s;
    public float v;
    public ValueAnimator w;
    public org.telegram.ui.ActionBar.m1 x;
    public float[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y3 = frameLayout.getY() + f7;
            f10 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y3 -= frameLayout.getScrollY();
            }
            f7 = y3;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), TLObject.FLAG_30));
    }
}
