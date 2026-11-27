// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b82 extends de0 {
    public final a82 H;
    public final /* synthetic */ e I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ vnb K;
    public final /* synthetic */ f82 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b82(f82 f82Var, Context context, e eVar, boolean z, vnb vnbVar) {
        super(context);
        this.L = f82Var;
        this.I = eVar;
        this.J = z;
        this.K = vnbVar;
        this.H = new a82(this);
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        f82 f82Var = this.L;
        if (!f82Var.b || this.e != null) {
            super.onDraw(canvas);
            return;
        }
        a82 a82Var = this.H;
        a82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a82Var.a = true;
        a82Var.v = true;
        a82Var.J = this.K;
        Integer num = f82Var.c;
        if (num != null) {
            a82Var.z = num.intValue();
        }
        zu1 zu1Var = f82Var.H;
        if (zu1Var != null) {
            j = zu1Var.a();
        } else {
            e eVar = this.I;
            j = eVar instanceof tzb ? -((tzb) eVar).a : 0L;
        }
        t6b.h(j, canvas, this.a, a82Var);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.J || !getImageReceiver().E()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.setText(ob6.M0(2131754793, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131747544, null)));
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
