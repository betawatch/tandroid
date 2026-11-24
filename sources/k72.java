// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k72 extends be0 {
    public final j72 H;
    public final /* synthetic */ d I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ wjb K;
    public final /* synthetic */ o72 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(o72 o72Var, Context context, d dVar, boolean z, wjb wjbVar) {
        super(context);
        this.L = o72Var;
        this.I = dVar;
        this.J = z;
        this.K = wjbVar;
        this.H = new j72(this);
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        o72 o72Var = this.L;
        if (!o72Var.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        j72 j72Var = this.H;
        j72Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j72Var.a = true;
        j72Var.v = true;
        j72Var.J = this.K;
        Integer num = o72Var.c;
        if (num != null) {
            j72Var.z = num.intValue();
        }
        mu1 mu1Var = o72Var.H;
        if (mu1Var != null) {
            j = mu1Var.a();
        } else {
            d dVar = this.I;
            j = dVar instanceof qvb ? -((qvb) dVar).a : 0L;
        }
        x2b.h(j, canvas, this.a, j72Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().E()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(k96.M0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131747624, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
