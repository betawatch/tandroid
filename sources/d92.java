// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d92 extends gg0 implements vlb {
    public int E;
    public final ImageView s;
    public c92 w;
    public TLRPC.Chat x;
    public boolean y;

    public d92(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.d.setTypeface(gm.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = cmb.w0(null, cmb.Li, false);
        this.E = w0;
        imageView.setBackground(cmb.f0(w0, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(jb6.M0(2131751535, null));
        boolean z = jb6.a0;
        addView(imageView, qoe.d(48, 50.0f, (z ? 3 : 5) | 17, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(gm.L(jb6.a0 ? 24.0f : 0.0f), 0, gm.L(jb6.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String M0;
        this.y = z;
        this.x = chat;
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str = chat.title;
        dg0 dg0Var = this.d;
        dg0Var.k(gw3.m(str, dg0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = sd2.V(chat);
        if (z) {
            if (i2 >= 1) {
                M0 = jb6.G(i2, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = jb6.M0(V ? 2131751327 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(jb6.G(i, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        anb.W(this.e, cmb.q5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new rc1((Object) this, (Object) chat, (byte) 13));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // gg0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(c92 c92Var) {
        this.w = c92Var;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.Li, false);
            ImageView imageView = this.s;
            if (imageView == null || w0 == this.E) {
                return;
            }
            this.E = w0;
            cmb.F1(imageView.getBackground(), w0, true);
            imageView.invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
