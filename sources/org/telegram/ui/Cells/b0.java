package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q21;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.e6 a;
    public final c0 b;
    public final q21 c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        this.b = new c0(context, i10, e6Var);
        q21 q21Var = new q21(i10, this, e6Var, true);
        this.c = q21Var;
        q21Var.e = new v01("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.e = f7;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        c0 c0Var = this.b;
        int i10 = ((measuredWidth - c0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (e6Var != null) {
            e6Var.m(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.i + dp);
        c0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), wh.C(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.b;
        v01 v01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.b).getUser(Long.valueOf(j3));
        v01 v01Var2 = c0Var.e;
        v01Var2.n(1);
        v01Var2.q(9999.0f);
        v01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (v01Var2.b() / 2.0f) * 1.2f;
        v01Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        v01Var2.q(Math.min(f7, b10));
        if (v01Var2.b.getLineCount() > 2) {
            v01Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, v01Var2.b()), v01Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = v01Var2.j() + v01Var.j() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        c0Var.h = (int) min;
        c0Var.i = (int) j10;
    }
}
