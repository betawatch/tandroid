package gg;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final int a;
    public final g9 b;
    public final w9 c;
    public final LinearLayout d;
    public final o6 e;
    public final o6 f;
    public final jq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public e(Activity activity, f6 f6Var, eo eoVar) {
        super(activity);
        this.a = eoVar.getCurrentAccount();
        this.r = false;
        w9 w9Var = new w9(activity);
        this.c = w9Var;
        TLRPC.User user = eoVar.getMessagesController().getUser(Long.valueOf(this.v));
        g9 g9Var = new g9((f6) null);
        this.b = g9Var;
        g9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, g9Var);
        addView(w9Var, a6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        o6 o6Var = new o6(activity, false, false, false);
        this.e = o6Var;
        o6Var.n = false;
        o6Var.getDrawable().o(true, false, false);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setText(UserObject.getUserName(user));
        o6Var.setTextColor(j6.v0(j6.G6, f6Var));
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, a6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        o6 o6Var2 = new o6(activity, false, false, false);
        this.f = o6Var2;
        o6Var2.n = false;
        o6Var2.getDrawable().o(true, false, false);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        o6Var2.setTextColor(j6.v0(j6.ge, f6Var));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, a6.n(-1, 17));
        addView(linearLayout, a6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        jq jqVar = new jq(activity);
        this.h = jqVar;
        jqVar.getDrawable().o(true, true, false);
        jqVar.b(0.75f, 350L, wr.h);
        jqVar.setScaleProperty(0.6f);
        jqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = j6.Oh;
        int v02 = j6.v0(i10, f6Var);
        int v = j6.v(j6.v0(i10, f6Var), j6.l1(0.12f, -1));
        jqVar.setBackgroundDrawable(j6.i0(dp, dp, dp, dp, v02, v, v));
        jqVar.setTextSize(AndroidUtilities.dp(14.0f));
        jqVar.setGravity(5);
        jqVar.setTextColor(j6.v0(j6.Sh, f6Var));
        jqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        jqVar.setOnClickListener(new ai.u(this, 19));
        jqVar.setOnWidthUpdatedListener(new d(this, 0));
        jqVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(jqVar, a6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new bi.q(this, eoVar, f6Var, 3));
        addView(imageView, a6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
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
