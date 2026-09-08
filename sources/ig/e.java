package ig;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x9;
import org.telegram.ui.co;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final int a;
    public final i9 b;
    public final x9 c;
    public final LinearLayout d;
    public final q6 e;
    public final q6 f;
    public final cq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public e(Activity activity, f6 f6Var, co coVar) {
        super(activity);
        this.a = coVar.getCurrentAccount();
        this.r = false;
        x9 x9Var = new x9(activity);
        this.c = x9Var;
        TLRPC.User user = coVar.getMessagesController().getUser(Long.valueOf(this.v));
        i9 i9Var = new i9((f6) null);
        this.b = i9Var;
        i9Var.r(user);
        x9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        x9Var.e(user, i9Var);
        addView(x9Var, x5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.e = q6Var;
        q6Var.n = false;
        q6Var.getDrawable().o(true, false, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        q6Var.setTextColor(j6.v0(j6.G6, f6Var));
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f = q6Var2;
        q6Var2.n = false;
        q6Var2.getDrawable().o(true, false, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        q6Var2.setTextColor(j6.v0(j6.ge, f6Var));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, x5.n(-1, 17));
        addView(linearLayout, x5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        cq cqVar = new cq(activity);
        this.h = cqVar;
        cqVar.getDrawable().o(true, true, false);
        cqVar.b(0.75f, 350L, pr.h);
        cqVar.setScaleProperty(0.6f);
        cqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = j6.Oh;
        int v02 = j6.v0(i10, f6Var);
        int v = j6.v(j6.v0(i10, f6Var), j6.l1(0.12f, -1));
        cqVar.setBackgroundDrawable(j6.i0(dp, dp, dp, dp, v02, v, v));
        cqVar.setTextSize(AndroidUtilities.dp(14.0f));
        cqVar.setGravity(5);
        cqVar.setTextColor(j6.v0(j6.Sh, f6Var));
        cqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        cqVar.setOnClickListener(new ah.h0(this, 25));
        cqVar.setOnWidthUpdatedListener(new d(this, 0));
        cqVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(cqVar, x5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new bi.x(this, coVar, f6Var, 7));
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.y;
        float d = this.h.getDrawable().d() + f7 + r1.getPaddingLeft() + r1.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.y = f7;
        this.c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
