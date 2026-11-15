package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ja;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.up;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public float E;
    public final int a;
    public final t8 b;
    public final i9 c;
    public final LinearLayout d;
    public final h6 e;
    public final h6 f;
    public final up h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public e(Activity activity, e6 e6Var, an anVar) {
        super(activity);
        this.a = anVar.getCurrentAccount();
        this.r = false;
        i9 i9Var = new i9(activity);
        this.c = i9Var;
        TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(this.w));
        t8 t8Var = new t8((e6) null);
        this.b = t8Var;
        t8Var.r(a22);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        i9Var.f(a22, t8Var);
        addView(i9Var, ja.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        h6 h6Var = new h6(activity, false, false, false);
        this.e = h6Var;
        h6Var.n = false;
        h6Var.getDrawable().r(true, false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setText(q10.p(a22));
        q6.Y(h6Var, j6.G6, e6Var);
        h6Var.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var, ja.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        h6 h6Var2 = new h6(activity, false, false, false);
        this.f = h6Var2;
        h6Var2.n = false;
        h6Var2.getDrawable().r(true, false);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setText(hd.M0(2131753700, null));
        q6.Y(h6Var2, j6.Xe, e6Var);
        h6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var2, ja.o(-1, 17));
        addView(linearLayout, ja.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        up upVar = new up(activity);
        this.h = upVar;
        upVar.getDrawable().r(true, true);
        upVar.b(0.75f, 350L, er.h);
        upVar.setScaleProperty(0.6f);
        upVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = j6.Fi;
        int w02 = j6.w0(i7, e6Var);
        int w10 = j6.w(j6.w0(i7, e6Var), j6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, w10, w10);
        m6 M = q6.M(i7);
        upVar.setBackground(k02);
        q6.j(upVar, k02, M, null, e6Var);
        upVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        upVar.setGravity(5);
        q6.Y(upVar, j6.Ji, e6Var);
        upVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        upVar.setOnClickListener(new p5(this, 6));
        upVar.setOnWidthUpdatedListener(new d(this, 0));
        upVar.setText(hd.M0(this.r ? 2131753701 : 2131753698, null));
        addView(upVar, ja.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i10 = j6.i6;
        org.telegram.ui.Cells.y O = j6.O(j6.w0(i10, e6Var), 0, 0);
        m6 M2 = q6.M(i10);
        imageView.setBackground(O);
        q6.j(imageView, O, null, M2, e6Var);
        q6.s(imageView, j6.Ue, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.g(this, anVar, e6Var, 16));
        addView(imageView, ja.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.E;
        float c10 = this.h.getDrawable().c() + f10 + r1.getPaddingLeft() + r1.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.e.setRightPadding(c10);
        this.f.setRightPadding(c10);
    }

    public void setLeftMargin(float f10) {
        this.E = f10;
        this.c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
