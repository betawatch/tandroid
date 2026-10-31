package og;

import ag.t0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends d implements k6 {
    public int D;
    public final ImageView s;
    public g w;
    public TLRPC.Chat x;
    public boolean y;

    public h(Context context, p6 p6Var) {
        super(context, p6Var);
        this.d.setTypeface(i0.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = t6.x0(null, t6.Ji, false);
        this.D = x02;
        imageView.setBackground(t6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        a7.t(imageView, t6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(cd.L0(2131751599, null));
        boolean z10 = cd.X;
        addView(imageView, b6.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(i0.L(cd.X ? 24.0f : 0.0f), 0, i0.L(cd.X ? 0.0f : 24.0f), 0);
    }

    @Override // og.d
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String L0;
        this.y = z10;
        this.x = chat;
        r8 r8Var = this.b;
        r8Var.q(chat);
        int L = i0.L(20.0f);
        g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str = chat.title;
        c cVar = this.d;
        cVar.k(org.telegram.messenger.k6.m(str, cVar.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = w3.V(chat);
        if (z10) {
            if (i11 >= 1) {
                L0 = cd.G(i11, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                L0 = cd.L0(V ? 2131751391 : 2131754876, null);
            }
            setSubtitle(L0);
        } else {
            setSubtitle(cd.G(i10, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        a7.Y(this.e, t6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new t0(12, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // og.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(g gVar) {
        this.w = gVar;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = t6.x0(null, t6.Ji, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.D) {
                return;
            }
            this.D = x02;
            t6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
