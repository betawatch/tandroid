package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.na;
import hi.z4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public float E;
    public final int a;
    public final a9 b;
    public final p9 c;
    public final LinearLayout d;
    public final n6 e;
    public final n6 f;
    public final aq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public e(Activity activity, i6 i6Var, bn bnVar) {
        super(activity);
        this.a = bnVar.getCurrentAccount();
        this.r = false;
        p9 p9Var = new p9(activity);
        this.c = p9Var;
        TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(this.w));
        a9 a9Var = new a9((i6) null);
        this.b = a9Var;
        a9Var.r(c22);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        p9Var.f(c22, a9Var);
        addView(p9Var, na.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        n6 n6Var = new n6(activity, false, false, false);
        this.e = n6Var;
        n6Var.n = false;
        n6Var.getDrawable().r(true, false);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setText(n10.q(c22));
        u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, na.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        n6 n6Var2 = new n6(activity, false, false, false);
        this.f = n6Var2;
        n6Var2.n = false;
        n6Var2.getDrawable().r(true, false);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setText(gd.N0(2131753697, null));
        u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.Xe, i6Var);
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, na.o(-1, 17));
        addView(linearLayout, na.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        aq aqVar = new aq(activity);
        this.h = aqVar;
        aqVar.getDrawable().r(true, true);
        aqVar.b(0.75f, 350L, kr.h);
        aqVar.setScaleProperty(0.6f);
        aqVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w10, w10);
        q6 M = u6.M(i7);
        aqVar.setBackground(k02);
        u6.j(aqVar, k02, M, null, i6Var);
        aqVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        aqVar.setGravity(5);
        u6.Y(aqVar, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        aqVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        aqVar.setOnClickListener(new z4(this, 7));
        aqVar.setOnWidthUpdatedListener(new d(this, 0));
        aqVar.setText(gd.N0(this.r ? 2131753698 : 2131753695, null));
        addView(aqVar, na.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.n6.O(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 0, 0);
        q6 M2 = u6.M(i10);
        imageView.setBackground(O);
        u6.j(imageView, O, null, M2, i6Var);
        u6.s(imageView, org.telegram.ui.ActionBar.n6.Ue, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.h(this, bnVar, i6Var, 16));
        addView(imageView, na.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
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
