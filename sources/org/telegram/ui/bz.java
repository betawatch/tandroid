package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class bz extends FrameLayout {
    public float[] D;
    public FrameLayout a;
    public org.telegram.ui.ActionBar.u5 b;
    public org.telegram.ui.ActionBar.u5 c;
    public ImageView d;
    public az e;
    public ag.j3 f;
    public ag.j3 h;
    public TextView n;
    public org.telegram.ui.ActionBar.k2 r;
    public String s;
    public float w;
    public ValueAnimator x;
    public org.telegram.ui.ActionBar.k1 y;

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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(127.0f), TLObject.FLAG_30));
    }
}
