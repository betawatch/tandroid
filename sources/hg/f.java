package hg;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.yn;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final int a;
    public final h9 b;
    public final w9 c;
    public final LinearLayout d;
    public final p6 e;
    public final p6 f;
    public final gq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public f(Activity activity, d6 d6Var, yn ynVar) {
        super(activity);
        this.a = ynVar.getCurrentAccount();
        this.r = false;
        w9 w9Var = new w9(activity);
        this.c = w9Var;
        TLRPC.User user = ynVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        p6 p6Var = new p6(activity, false, false, false);
        this.e = p6Var;
        p6Var.n = false;
        p6Var.getDrawable().o(true, false, false);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setText(UserObject.getUserName(user));
        p6Var.setTextColor(i6.v0(i6.G6, d6Var));
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        p6 p6Var2 = new p6(activity, false, false, false);
        this.f = p6Var2;
        p6Var2.n = false;
        p6Var2.getDrawable().o(true, false, false);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        p6Var2.setTextColor(i6.v0(i6.ge, d6Var));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        gq gqVar = new gq(activity);
        this.h = gqVar;
        gqVar.getDrawable().o(true, true, false);
        gqVar.b(0.75f, 350L, tr.h);
        gqVar.setScaleProperty(0.6f);
        gqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = i6.Oh;
        int v02 = i6.v0(i10, d6Var);
        int v = i6.v(i6.v0(i10, d6Var), i6.l1(0.12f, -1));
        gqVar.setBackgroundDrawable(i6.i0(dp, dp, dp, dp, v02, v, v));
        gqVar.setTextSize(AndroidUtilities.dp(14.0f));
        gqVar.setGravity(5);
        gqVar.setTextColor(i6.v0(i6.Sh, d6Var));
        gqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        gqVar.setOnClickListener(new ai.v0(this, 24));
        gqVar.setOnWidthUpdatedListener(new e(this, 0));
        gqVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(gqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(i6.M(i6.v0(i6.i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, ynVar, d6Var, 7));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
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
