package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.g6 a;
    public final b0 b;
    public final c31 c;
    public int d;
    public float e;

    public a0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        this.b = new b0(context, i10, g6Var);
        c31 c31Var = new c31(i10, this, g6Var, true);
        this.c = c31Var;
        c31Var.e = new i11("", 14.0f, AndroidUtilities.bold());
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
        b0 b0Var = this.b;
        int i10 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int dp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        if (g6Var != null) {
            g6Var.b(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i10, dp, b0Var.h + i10, b0Var.i + dp);
        b0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), sl.C(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.b;
        i11 i11Var = b0Var.d;
        TLRPC.User user = MessagesController.getInstance(b0Var.b).getUser(Long.valueOf(j10));
        i11 i11Var2 = b0Var.e;
        i11Var2.n(1);
        i11Var2.q(9999.0f);
        i11Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (i11Var2.b() / 2.0f) * 1.2f;
        i11Var2.n(4);
        float f7 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        i11Var2.q(Math.min(f7, b10));
        if (i11Var2.b.getLineCount() > 2) {
            i11Var2.q(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, i11Var2.b()), i11Var.b()) + AndroidUtilities.dp(32.0f), f7);
        float j11 = i11Var2.j() + i11Var.j() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) j11;
    }
}
