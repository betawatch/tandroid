package lg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public float E;
    public final int a;
    public final u8 b;
    public final k9 c;
    public final LinearLayout d;
    public final h6 e;
    public final h6 f;
    public final mp h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public e(Activity activity, e6 e6Var, wm wmVar) {
        super(activity);
        this.a = wmVar.getCurrentAccount();
        this.r = false;
        k9 k9Var = new k9(activity);
        this.c = k9Var;
        TLRPC.User a22 = wmVar.getMessagesController().a2(Long.valueOf(this.w));
        u8 u8Var = new u8((e6) null);
        this.b = u8Var;
        u8Var.r(a22);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        k9Var.e(a22, u8Var);
        addView(k9Var, mf.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        h6 h6Var = new h6(activity, false, false, false);
        this.e = h6Var;
        h6Var.n = false;
        h6Var.getDrawable().r(true, false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setText(l10.p(a22));
        r6.Z(h6Var, k6.G6, e6Var);
        h6Var.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var, mf.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        h6 h6Var2 = new h6(activity, false, false, false);
        this.f = h6Var2;
        h6Var2.n = false;
        h6Var2.getDrawable().r(true, false);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setText(bd.M0(2131753700, null));
        r6.Z(h6Var2, k6.Ue, e6Var);
        h6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var2, mf.o(-1, 17));
        addView(linearLayout, mf.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        mp mpVar = new mp(activity);
        this.h = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.75f, 350L, xq.h);
        mpVar.setScaleProperty(0.6f);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i3 = k6.Ci;
        int w02 = k6.w0(i3, e6Var);
        int w10 = k6.w(k6.w0(i3, e6Var), k6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, w10, w10);
        n6 N = r6.N(i3);
        mpVar.setBackground(k02);
        r6.k(mpVar, k02, N, null, e6Var);
        mpVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        mpVar.setGravity(5);
        r6.Z(mpVar, k6.Gi, e6Var);
        mpVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        mpVar.setOnClickListener(new ii.m(this, 10));
        mpVar.setOnWidthUpdatedListener(new d(this, 0));
        mpVar.setText(bd.M0(this.r ? 2131753701 : 2131753698, null));
        addView(mpVar, mf.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i10 = k6.i6;
        org.telegram.ui.Cells.y O = k6.O(k6.w0(i10, e6Var), 0, 0);
        n6 N2 = r6.N(i10);
        imageView.setBackground(O);
        r6.k(imageView, O, null, N2, e6Var);
        r6.t(imageView, k6.Re, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ai.h(this, wmVar, e6Var, 16));
        addView(imageView, mf.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.E;
        float c2 = this.h.getDrawable().c() + f10 + r1.getPaddingLeft() + r1.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.e.setRightPadding(c2);
        this.f.setRightPadding(c2);
    }

    public void setLeftMargin(float f10) {
        this.E = f10;
        this.c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
