// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oba extends LinearLayout implements snb {
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ema d;
    public final TextView e;
    public final ImageView f;
    public final ul h;
    public final ul n;
    public int r;

    public oba(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setOrientation(0);
        this.b = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(14.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(15);
        emaVar.setTypeface(hl.o());
        yob.W(emaVar, aob.G6, vnbVar);
        this.h = new ul(hl.L(24.0f), 7, emaVar, false);
        this.n = new ul(hl.L(24.0f), 7, emaVar, false);
        emaVar.addOnAttachStateChangeListener(new xc(this, (byte) 18));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(hl.L(6.66f), 0, hl.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        yob.X(textView, aob.Ji, vnbVar);
        int L = hl.L(10.0f);
        int i = aob.Fi;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        textView.setBackground(b0);
        yob.j(textView, b0, M, null, vnbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        if (!ob6.a0) {
            emaVar.setGravity(19);
            addView(de0Var, tre.t(28, 28, 19, 18, 0, 18, 0));
            addView(emaVar, tre.q(0, -1, 1.0f, jn7.D1, 0, 0, 18, 0));
            addView(textView, tre.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, tre.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        emaVar.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, tre.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, tre.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(emaVar, tre.q(0, -1, 1.0f, jn7.D1, 18, 0, 0, 0));
        addView(de0Var, tre.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.qi));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i) {
        Long i2;
        TLRPC.User f = yac.h(i).f();
        rb0 rb0Var = this.b;
        rb0Var.q(f);
        de0 de0Var = this.c;
        de0Var.getImageReceiver().d = i;
        de0Var.f(f, rb0Var);
        String r = lbc.r(f);
        ema emaVar = this.d;
        emaVar.l(r, false);
        Integer valueOf = Integer.valueOf(i);
        ul ulVar = this.h;
        ulVar.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i);
        ul ulVar2 = this.n;
        ulVar2.y = valueOf2;
        int i3 = aob.qi;
        vnb vnbVar = this.a;
        ulVar.k(Integer.valueOf(aob.v0(i3, vnbVar)));
        if (f != null) {
            long j = f.bot_verification_icon;
            if (j != 0) {
                ulVar.j(j, false);
                i2 = lbc.i(f);
                ulVar2.k(Integer.valueOf(aob.v0(i3, vnbVar)));
                if (i2 == null) {
                    ulVar2.j(i2.longValue(), false);
                } else if (f == null || !f.premium) {
                    ulVar2.g(null, false);
                } else {
                    ulVar2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (ulVar.d()) {
                    ulVar = null;
                }
                emaVar.setLeftDrawable(ulVar);
                if (ulVar2.d()) {
                    ulVar2 = null;
                }
                emaVar.i(ulVar2);
                int i4 = jf7.Y(i).L;
                int i5 = i4 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i5);
                textView.setText(ob6.E(i4, ','));
            }
        }
        ulVar.g(null, false);
        i2 = lbc.i(f);
        ulVar2.k(Integer.valueOf(aob.v0(i3, vnbVar)));
        if (i2 == null) {
        }
        if (ulVar.d()) {
        }
        emaVar.setLeftDrawable(ulVar);
        if (ulVar2.d()) {
        }
        emaVar.i(ulVar2);
        int i42 = jf7.Y(i).L;
        if (i42 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i5);
        textView2.setText(ob6.E(i42, ','));
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        ema emaVar = this.d;
        emaVar.setTextColor(v0);
        TextView textView = this.e;
        aob.A1(aob.v0(aob.Fi, vnbVar), textView.getBackground());
        textView.invalidate();
        int v02 = aob.v0(aob.m6, vnbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = aob.qi;
        this.n.k(Integer.valueOf(aob.v0(i3, vnbVar)));
        try {
            ul ulVar = this.h;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(aob.v0(i3, vnbVar)));
                emaVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
