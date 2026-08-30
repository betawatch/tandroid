package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class b0 extends View {
    public final org.telegram.ui.ActionBar.f6 a;
    public final c0 b;
    public final d21 c;
    public int d;
    public float e;

    public b0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        this.b = new c0(context, i10, f6Var);
        d21 d21Var = new d21(i10, this, f6Var, true);
        this.c = d21Var;
        d21Var.e = new k01("", 14.0f, AndroidUtilities.bold());
    }

    public final void a(float f10, int i10) {
        this.d = i10;
        this.e = f10;
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
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (f6Var != null) {
            f6Var.l(f11, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.q(f11, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        c0Var.setBounds(i10, dp, c0Var.h + i10, c0Var.i + dp);
        c0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.ui.b.B(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        c0 c0Var = this.b;
        k01 k01Var = c0Var.d;
        TLRPC.User user = MessagesController.getInstance(c0Var.b).getUser(Long.valueOf(j10));
        k01 k01Var2 = c0Var.e;
        k01Var2.n(1);
        k01Var2.q(9999.0f);
        k01Var2.r(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float b10 = (k01Var2.b() / 2.0f) * 1.2f;
        k01Var2.n(4);
        float f10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        k01Var2.q(Math.min(f10, b10));
        if (k01Var2.b.getLineCount() > 2) {
            k01Var2.q(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, k01Var2.b()), k01Var.b()) + AndroidUtilities.dp(32.0f), f10);
        float j11 = k01Var2.j() + k01Var.j() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        c0Var.h = (int) min;
        c0Var.i = (int) j11;
    }
}
