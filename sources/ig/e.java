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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.qn;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final int a;
    public final h9 b;
    public final w9 c;
    public final LinearLayout d;
    public final q6 e;
    public final q6 f;
    public final nq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public e(Activity activity, d6 d6Var, qn qnVar) {
        super(activity);
        this.a = qnVar.getCurrentAccount();
        this.r = false;
        w9 w9Var = new w9(activity);
        this.c = w9Var;
        TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.e = q6Var;
        q6Var.n = false;
        q6Var.getDrawable().r(true, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        q6Var.setTextColor(h6.w0(h6.G6, d6Var));
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f = q6Var2;
        q6Var2.n = false;
        q6Var2.getDrawable().r(true, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        q6Var2.setTextColor(h6.w0(h6.ge, d6Var));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        nq nqVar = new nq(activity);
        this.h = nqVar;
        nqVar.getDrawable().r(true, true);
        nqVar.b(0.75f, 350L, bs.h);
        nqVar.setScaleProperty(0.6f);
        nqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = h6.Oh;
        int w02 = h6.w0(i10, d6Var);
        int v = h6.v(h6.w0(i10, d6Var), h6.m1(0.12f, -1));
        nqVar.setBackgroundDrawable(h6.j0(dp, dp, dp, dp, w02, v, v));
        nqVar.setTextSize(AndroidUtilities.dp(14.0f));
        nqVar.setGravity(5);
        nqVar.setTextColor(h6.w0(h6.Sh, d6Var));
        nqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        nqVar.setOnClickListener(new hg.r0(this, 5));
        nqVar.setOnWidthUpdatedListener(new d(this, 0));
        nqVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(nqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.N(h6.w0(h6.i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.v0(this, qnVar, d6Var, 10));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.y;
        float c10 = this.h.getDrawable().c() + f7 + r1.getPaddingLeft() + r1.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.y = f7;
        this.c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
