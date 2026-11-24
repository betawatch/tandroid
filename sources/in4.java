// default package

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class in4 extends FrameLayout {
    public final io a;
    public final io b;

    public in4(Context context) {
        super(context);
        io ioVar = new io(context, true, true, false);
        this.a = ioVar;
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTypeface(gm.o());
        int i = cmb.K6;
        anb.U(ioVar, i, null);
        ioVar.setGravity(jb6.a0 ? 5 : 3);
        addView(ioVar, qoe.d(-1, 20.0f, (jb6.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        io ioVar2 = new io(context, true, true, true);
        this.b = ioVar2;
        ioVar2.b(0.45f, 250L, d53.h);
        ioVar2.setTextSize(gm.L(15.0f));
        anb.U(ioVar2, i, null);
        ioVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(ioVar2, qoe.d(-2, 20.0f, (jb6.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = kfc.a;
        new yec(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z = !jb6.a0;
        io ioVar = this.b;
        ioVar.c(str, z, true);
        ioVar.setOnClickListener(new xl3(runnable, (byte) 2));
    }

    public final void b(String str, boolean z) {
        boolean z2;
        io ioVar = this.a;
        if (z) {
            ioVar.a();
            if (!jb6.a0) {
                z2 = true;
                ioVar.c(str, z2, true);
            }
        }
        z2 = false;
        ioVar.c(str, z2, true);
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
