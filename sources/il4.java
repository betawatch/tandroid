// default package

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class il4 extends FrameLayout {
    public final hn a;
    public final hn b;

    public il4(Context context) {
        super(context);
        hn hnVar = new hn(context, true, true, false);
        this.a = hnVar;
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        int i = bkb.K6;
        zkb.U(hnVar, i, null);
        hnVar.setGravity(k96.a0 ? 5 : 3);
        addView(hnVar, nme.d(-1, 20.0f, (k96.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        hn hnVar2 = new hn(context, true, true, true);
        this.b = hnVar2;
        hnVar2.b(0.45f, 250L, s33.h);
        hnVar2.setTextSize(gl.L(15.0f));
        zkb.U(hnVar2, i, null);
        hnVar2.setGravity(k96.a0 ? 3 : 5);
        addView(hnVar2, nme.d(-2, 20.0f, (k96.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = jdc.a;
        new xcc(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z = !k96.a0;
        hn hnVar = this.b;
        hnVar.c(str, z, true);
        hnVar.setOnClickListener(new nk3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        hn hnVar = this.a;
        if (z) {
            hnVar.a();
            if (!k96.a0) {
                z2 = true;
                hnVar.c(str, z2, true);
            }
        }
        z2 = false;
        hnVar.c(str, z2, true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }
}
