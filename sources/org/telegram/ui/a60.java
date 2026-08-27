package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a60(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.zk0
    public boolean E0(float f10) {
        switch (this.T2) {
            case 2:
                org.telegram.ui.Components.gi giVar = ((qf.e0) this.U2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + giVar.X1[0]) + (!giVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public Integer W0(int i10) {
        int i11;
        switch (this.T2) {
            case 1:
                i11 = ((SessionsActivity) this.U2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.l2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.T2) {
            case 0:
                super.dispatchDraw(canvas);
                c60 c60Var = (c60) this.U2;
                if (c60Var.v0 != null && c60Var.w0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = c60Var.v0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) c60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    c60Var.v0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        int i12 = this.T2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.T2 = 1;
        this.U2 = sessionsActivity;
    }

    private final void w1(int i10, int i11) {
    }
}
