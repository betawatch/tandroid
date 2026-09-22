package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.g01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.e6 a;
    public final c0 b;
    public final b21 c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        this.b = new c0(context, i10, e6Var);
        b21 b21Var = new b21(i10, this, e6Var, true);
        this.c = b21Var;
        b21Var.e = new g01("", 14.0f, AndroidUtilities.bold());
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
            org.telegram.ui.ActionBar.i6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.i + dp);
        c0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), vl.C(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        c0 c0Var = this.b;
        g01 g01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.b).getUser(Long.valueOf(j3));
        g01 g01Var2 = c0Var.e;
        g01Var2.n(1);
        g01Var2.q(9999.0f);
        g01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (g01Var2.b() / 2.0f) * 1.2f;
        g01Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        g01Var2.q(Math.min(f7, b10));
        if (g01Var2.b.getLineCount() > 2) {
            g01Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, g01Var2.b()), g01Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j10 = g01Var2.j() + g01Var.j() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        c0Var.h = (int) min;
        c0Var.i = (int) j10;
    }
}
