// default package

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nn4 extends FrameLayout {
    public final in a;
    public final in b;

    public nn4(Context context) {
        super(context);
        in inVar = new in(context, true, true, false);
        this.a = inVar;
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        int i = aob.L6;
        yob.U(inVar, i, null);
        inVar.setGravity(ob6.a0 ? 5 : 3);
        addView(inVar, tre.d(-1, 20.0f, (ob6.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        in inVar2 = new in(context, true, true, true);
        this.b = inVar2;
        inVar2.b(0.45f, 250L, k43.h);
        inVar2.setTextSize(hl.L(15.0f));
        yob.U(inVar2, i, null);
        inVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(inVar2, tre.d(-2, 20.0f, (ob6.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = ihc.a;
        new wgc(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z = !ob6.a0;
        in inVar = this.b;
        inVar.c(str, z, true);
        inVar.setOnClickListener(new el3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        in inVar = this.a;
        if (z) {
            inVar.a();
            if (!ob6.a0) {
                z2 = true;
                inVar.c(str, z2, true);
            }
        }
        z2 = false;
        inVar.c(str, z2, true);
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
