// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d21 extends i49 {
    public final /* synthetic */ byte n1 = 0;
    public final /* synthetic */ Object o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(rw2 rw2Var, Context context, int i, vnb vnbVar) {
        super(4, i, vnbVar, context, null);
        this.o1 = rw2Var;
    }

    @Override // i49, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v21 v21Var;
        switch (this.n1) {
            case 0:
                g21 g21Var = (g21) this.o1;
                if (motionEvent.getAction() == 0) {
                    v21 v21Var2 = g21Var.n;
                    if (v21Var2 != null) {
                        v21Var2.i(false);
                    }
                } else if (motionEvent.getAction() == 1 && (v21Var = g21Var.n) != null) {
                    v21Var.i(true);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // i49
    public final void g() {
        switch (this.n1) {
            case 1:
                super.g();
                rw2 rw2Var = (rw2) this.o1;
                boolean z = getReactionsWindow() != null;
                WindowManager.LayoutParams layoutParams = rw2Var.x;
                if (z) {
                    layoutParams.flags &= -131073;
                    layoutParams.softInputMode = 16;
                } else {
                    layoutParams.flags |= 131072;
                }
                try {
                    ((WindowManager) rw2Var.w.getSystemService("window")).updateViewLayout(rw2Var.y, rw2Var.x);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                super.g();
                break;
        }
    }

    @Override // i49
    public final void j() {
        switch (this.n1) {
            case 0:
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    v21Var.i(false);
                }
                ((g21) this.o1).d.getReactionsWindow().c.setOnClickListener(new k1(this, (byte) 23));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(g21 g21Var, e eVar, Context context, int i, vnb vnbVar) {
        super(3, i, vnbVar, context, eVar);
        this.o1 = g21Var;
    }
}
