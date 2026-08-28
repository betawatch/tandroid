package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i6 extends ImageView {
    public final int a;
    public final /* synthetic */ k6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(k6 k6Var, Context context, int i9, int i10) {
        super(context);
        this.b = k6Var;
        this.a = i9;
        setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i10);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new gh.z0(this, i9, 3));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
    }
}
