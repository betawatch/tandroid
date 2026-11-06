package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q5 extends ImageView {
    public final int a;
    public final /* synthetic */ s5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(s5 s5Var, Context context, int i7, int i10) {
        super(context);
        this.b = s5Var;
        this.a = i7;
        setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i10);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new ai.v(this, i7, 4));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
    }
}
