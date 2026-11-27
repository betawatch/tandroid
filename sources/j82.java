// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j82 extends if0 implements snb {
    public int E;
    public final ImageView s;
    public i82 w;
    public TLRPC.Chat x;
    public boolean y;

    public j82(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.d.setTypeface(hl.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = aob.w0(null, aob.Mi, false);
        this.E = w0;
        imageView.setBackground(aob.f0(w0, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(ob6.M0(2131751563, null));
        boolean z = ob6.a0;
        addView(imageView, tre.d(48, 50.0f, (z ? 3 : 5) | 17, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(hl.L(ob6.a0 ? 24.0f : 0.0f), 0, hl.L(ob6.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String M0;
        this.y = z;
        this.x = chat;
        rb0 rb0Var = this.b;
        rb0Var.p(chat);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(chat, rb0Var);
        String str = chat.title;
        ff0 ff0Var = this.d;
        ff0Var.k(pv3.m(str, ff0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = xc2.V(chat);
        if (z) {
            if (i2 >= 1) {
                M0 = ob6.G(i2, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = ob6.M0(V ? 2131751355 : 2131754872, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(ob6.G(i, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        yob.W(this.e, aob.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new sb1((Object) this, (Object) chat, (byte) 14));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // if0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(i82 i82Var) {
        this.w = i82Var;
    }

    @Override // snb
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.Mi, false);
            ImageView imageView = this.s;
            if (imageView == null || w0 == this.E) {
                return;
            }
            this.E = w0;
            aob.F1(imageView.getBackground(), w0, true);
            imageView.invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
