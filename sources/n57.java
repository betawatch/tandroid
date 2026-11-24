// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n57 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final ylb c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final long n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final Runnable y;

    /* JADX WARN: Multi-variable type inference failed */
    public n57(Context context, int i, k47 k47Var, Runnable runnable, ylb ylbVar) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i2 = k47Var.K1;
        this.a = i2;
        this.c = ylbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        TLRPC.Message message = k47Var.k;
        this.E = currentTime - message.date;
        this.n = k47.B0(message);
        this.r = k47Var.e1();
        TLRPC.Message message2 = k47Var.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, qoe.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i == 1 ? oc7.r1(i2).l4.Y.f ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i == 2 ? R.drawable.menu_forward_stamp : k47.Q4(k47Var.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        anb.x(this, mutate, cmb.E8, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new ta6(textView, gm.L(96.0f), gm.L(2.0f), ylbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i3 = cmb.i5;
        anb.Y(textView, anb.K(0.7f, i3), ylbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, qoe.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, qoe.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        anb.X(textView2, i3, ylbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = wi8.m(linearLayout, textView2, qoe.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = gm.L(20.0f);
        int i4 = cmb.c7;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.75f, cmb.v0(i4, ylbVar)));
        wmb K = anb.K(0.75f, i4);
        m.setBackground(b0);
        anb.j(m, b0, K, null, ylbVar);
        anb.X(m, i3, ylbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(gm.L(5.33f), gm.L(2.0f), gm.L(5.33f), gm.L(2.33f));
        linearLayout.addView(m, qoe.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, ylb ylbVar) {
        p71 p71Var = new p71(1, ylbVar, context, false);
        p71Var.K(cmb.v0(cmb.g5, ylbVar));
        boolean H3 = oc7.r1(i).H3();
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        s09 s09Var = new s09(context);
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.f(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        s09Var.d();
        s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(80.0f);
        int i3 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i3, ylbVar));
        wmb M = anb.M(i3);
        s09Var.setBackground(K);
        anb.j(s09Var, K, M, null, ylbVar);
        i2.addView(s09Var, qoe.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        int i4 = cmb.i5;
        anb.X(textView, i4, ylbVar);
        textView.setTextSize(1, 20.0f);
        textView.setText(jb6.M0(z ? 2131746780 : 2131746690, null));
        i2.addView(textView, qoe.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        anb.X(textView2, i4, ylbVar);
        textView2.setTextSize(1, 14.0f);
        String k = j > 0 ? m9c.k(oc7.r1(i).W1(Long.valueOf(j)), true) : "";
        hg9.q(null, null, z ? H3 ? 2131746776 : 2131746777 : H3 ? 2131746686 : 2131746687, new Object[]{k}, textView2);
        i2.addView(textView2, qoe.t(-1, -2, 1, 32, 9, 32, 19));
        b61 i5 = mlb.i(24, ylbVar, context, true);
        i5.i(jb6.M0(z ? 2131746782 : 2131746692, null), false, true);
        i2.addView(i5, qoe.r(-1, 48, 1));
        i5.setOnClickListener(new pn3(i5, z, i, p71Var, runnable2, context, ylbVar));
        if (!H3) {
            m57 m57Var = new m57(context, ylbVar);
            m57Var.setGravity(17);
            m57Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            anb.W(m57Var, cmb.y6, ylbVar);
            m57Var.l(" " + jb6.M0(2131746764, null) + " ", false);
            m57Var.setTextSize(14);
            i2.addView(m57Var, qoe.t(nm7.s4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(gm.o());
            textView3.setGravity(17);
            anb.X(textView3, i4, ylbVar);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(jb6.M0(z ? 2131746779 : 2131746689, null));
            i2.addView(textView3, qoe.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            anb.X(textView4, i4, ylbVar);
            textView4.setTextSize(1, 14.0f);
            hg9.q(null, null, z ? 2131746775 : 2131746685, new Object[]{k}, textView4);
            i2.addView(textView4, qoe.t(-1, -2, 1, 32, 9, 32, 19));
            cj8 cj8Var = new cj8(ylbVar, context, true);
            cj8Var.setOnClickListener(new xw2(z, p71Var, runnable));
            cj8Var.c(jb6.M0(z ? 2131746781 : 2131746691, null), false, false);
            i2.addView(cj8Var, qoe.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p71Var.O = i2;
        p71Var.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        boolean z = this.b;
        String str = "LOC_ERR";
        if (z == 1) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView = this.e;
            if (oc7.r1(this.a).l4.Y.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    str = (i3 == i && i2 == i4) ? jb6.a0(null, null, 2131746923, jb6.D0().o0().format(new Date(j))) : (i3 + 1 == i && i2 == i4) ? jb6.a0(null, null, 2131746922, jb6.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? jb6.a0(null, null, 2131746924, jb6.D0().p0().format(new Date(j)), jb6.D0().o0().format(new Date(j))) : jb6.a0(null, null, 2131746924, jb6.D0().B0().format(new Date(j)), jb6.D0().o0().format(new Date(j)));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                str = jb6.L(this.w);
            }
            textView.setText(str);
            return;
        }
        if (z != 2) {
            setOnClickListener(null);
            this.d.setAlpha(0.0f);
            this.h.setAlpha(1.0f);
            this.f.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = oc7.r1(this.a).i1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new r15(this, (byte) 10));
            return;
        }
        this.d.setAlpha(1.0f);
        this.h.setAlpha(0.0f);
        this.f.setVisibility(8);
        TextView textView2 = this.e;
        long j2 = this.x * 1000;
        try {
            Calendar calendar2 = Calendar.getInstance();
            int i5 = calendar2.get(6);
            int i6 = calendar2.get(1);
            calendar2.setTimeInMillis(j2);
            int i7 = calendar2.get(6);
            int i8 = calendar2.get(1);
            str = (i7 == i5 && i6 == i8) ? jb6.a0(null, null, 2131746932, jb6.D0().o0().format(new Date(j2))) : (i7 + 1 == i5 && i6 == i8) ? jb6.a0(null, null, 2131746931, jb6.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? jb6.a0(null, null, 2131746933, jb6.D0().p0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2))) : jb6.a0(null, null, 2131746933, jb6.D0().B0().format(new Date(j2)), jb6.D0().o0().format(new Date(j2)));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        textView2.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        y21 y21Var;
        super.onDetachedFromWindow();
        u31 u31Var = u31.x;
        if (u31Var == null || (y21Var = u31Var.e) == null || y21Var.getParent() == null || !(u31Var.e.getParent().getParent() instanceof m21)) {
            return;
        }
        u31Var.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.G < 0.0f) {
            this.G = 0.0f;
            boolean z = this.b;
            TextView textView = this.e;
            if (z) {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + gm.L(48.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, gm.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(jb6.M0(2131746926, null)) + gm.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(jb6.M0(2131746930, null) + this.f.getPaint().measureText(jb6.M0(2131746928, null))) + gm.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(jb6.a0(null, null, 2131746927, jb6.D0().o0().format(new Date(currentTimeMillis)))) + ((float) gm.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(jb6.a0(null, null, 2131746925, jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(jb6.a0(null, null, 2131746929, jb6.D0().p0().format(new Date(currentTimeMillis)), jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(jb6.a0(null, null, 2131746929, jb6.D0().B0().format(new Date(currentTimeMillis)), jb6.D0().o0().format(new Date(currentTimeMillis)))) + gm.L(f));
                }
            }
        }
        int i4 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f2 = size;
        float f3 = this.G;
        if (f2 < f3 || mode == Integer.MIN_VALUE) {
            size = (int) f3;
        } else {
            i4 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i4), i2);
    }
}
