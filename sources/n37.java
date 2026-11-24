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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n37 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final wjb c;
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
    public n37(Context context, int i, k27 k27Var, Runnable runnable, wjb wjbVar) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i2 = k27Var.K1;
        this.a = i2;
        this.c = wjbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        TLRPC.Message message = k27Var.k;
        this.E = currentTime - message.date;
        this.n = k27.B0(message);
        this.r = k27Var.e1();
        TLRPC.Message message2 = k27Var.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, nme.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i == 1 ? na7.q1(i2).k4.Y.f ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i == 2 ? R.drawable.menu_forward_stamp : k27.Q4(k27Var.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        zkb.x(this, mutate, bkb.E8, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new u86(textView, gl.L(96.0f), gl.L(2.0f), wjbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i3 = bkb.i5;
        zkb.Y(textView, zkb.K(0.7f, i3), wjbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, nme.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, nme.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        zkb.X(textView2, i3, wjbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = ug8.m(linearLayout, textView2, nme.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = gl.L(20.0f);
        int i4 = bkb.c7;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.75f, bkb.v0(i4, wjbVar)));
        vkb K = zkb.K(0.75f, i4);
        m.setBackground(b0);
        zkb.j(m, b0, K, null, wjbVar);
        zkb.X(m, i3, wjbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(gl.L(5.33f), gl.L(2.0f), gl.L(5.33f), gl.L(2.33f));
        linearLayout.addView(m, nme.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, wjb wjbVar) {
        i61 i61Var = new i61(1, wjbVar, context, false);
        i61Var.L(bkb.v0(bkb.g5, wjbVar));
        boolean F3 = na7.q1(i).F3();
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ry8 ry8Var = new ry8(context);
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.f(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        ry8Var.d();
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(80.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        ry8Var.setBackground(K);
        zkb.j(ry8Var, K, M, null, wjbVar);
        j2.addView(ry8Var, nme.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        int i3 = bkb.i5;
        zkb.X(textView, i3, wjbVar);
        textView.setTextSize(1, 20.0f);
        textView.setText(k96.M0(z ? 2131746854 : 2131746764, null));
        j2.addView(textView, nme.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        zkb.X(textView2, i3, wjbVar);
        textView2.setTextSize(1, 14.0f);
        String k = j > 0 ? l7c.k(na7.q1(i).V1(Long.valueOf(j)), true) : "";
        de9.r(null, null, z ? F3 ? 2131746850 : 2131746851 : F3 ? 2131746760 : 2131746761, new Object[]{k}, textView2);
        j2.addView(textView2, nme.t(-1, -2, 1, 32, 9, 32, 19));
        u41 i4 = yjb.i(24, wjbVar, context, true);
        i4.i(k96.M0(z ? 2131746856 : 2131746766, null), false, true);
        j2.addView(i4, nme.r(-1, 48, 1));
        i4.setOnClickListener(new em3(i4, z, i, i61Var, runnable2, context, wjbVar));
        if (!F3) {
            m37 m37Var = new m37(context, wjbVar);
            m37Var.setGravity(17);
            m37Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            zkb.W(m37Var, bkb.y6, wjbVar);
            m37Var.l(" " + k96.M0(2131746838, null) + " ", false);
            m37Var.setTextSize(14);
            j2.addView(m37Var, nme.t(kk7.s4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(gl.o());
            textView3.setGravity(17);
            zkb.X(textView3, i3, wjbVar);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(k96.M0(z ? 2131746853 : 2131746763, null));
            j2.addView(textView3, nme.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            zkb.X(textView4, i3, wjbVar);
            textView4.setTextSize(1, 14.0f);
            de9.r(null, null, z ? 2131746849 : 2131746759, new Object[]{k}, textView4);
            j2.addView(textView4, nme.t(-1, -2, 1, 32, 9, 32, 19));
            ah8 ah8Var = new ah8(wjbVar, context, true);
            ah8Var.setOnClickListener(new nv2(z, i61Var, runnable));
            ah8Var.c(k96.M0(z ? 2131746855 : 2131746765, null), false, false);
            j2.addView(ah8Var, nme.t(-1, 48, 1, 0, 0, 0, 4));
        }
        i61Var.O = j2;
        i61Var.show();
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
            if (na7.q1(this.a).k4.Y.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    str = (i3 == i && i2 == i4) ? k96.a0(null, null, 2131746997, k96.D0().o0().format(new Date(j))) : (i3 + 1 == i && i2 == i4) ? k96.a0(null, null, 2131746996, k96.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? k96.a0(null, null, 2131746998, k96.D0().p0().format(new Date(j)), k96.D0().o0().format(new Date(j))) : k96.a0(null, null, 2131746998, k96.D0().B0().format(new Date(j)), k96.D0().o0().format(new Date(j)));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                str = k96.L(this.w);
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
            tL_messages_getOutboxReadDate.peer = na7.q1(this.a).h1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new n35(this, (byte) 9));
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
            str = (i7 == i5 && i6 == i8) ? k96.a0(null, null, 2131747006, k96.D0().o0().format(new Date(j2))) : (i7 + 1 == i5 && i6 == i8) ? k96.a0(null, null, 2131747005, k96.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? k96.a0(null, null, 2131747007, k96.D0().p0().format(new Date(j2)), k96.D0().o0().format(new Date(j2))) : k96.a0(null, null, 2131747007, k96.D0().B0().format(new Date(j2)), k96.D0().o0().format(new Date(j2)));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        textView2.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q11 q11Var;
        super.onDetachedFromWindow();
        m21 m21Var = m21.w;
        if (m21Var == null || (q11Var = m21Var.e) == null || q11Var.getParent() == null || !(m21Var.e.getParent().getParent() instanceof e11)) {
            return;
        }
        m21Var.b();
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
                this.G = textView.getPaint().measureText(textView.getText().toString()) + gl.L(48.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, gl.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(k96.M0(2131747000, null)) + gl.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(k96.M0(2131747004, null) + this.f.getPaint().measureText(k96.M0(2131747002, null))) + gl.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(k96.a0(null, null, 2131747001, k96.D0().o0().format(new Date(currentTimeMillis)))) + ((float) gl.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(k96.a0(null, null, 2131746999, k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(k96.a0(null, null, 2131747003, k96.D0().p0().format(new Date(currentTimeMillis)), k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(k96.a0(null, null, 2131747003, k96.D0().B0().format(new Date(currentTimeMillis)), k96.D0().o0().format(new Date(currentTimeMillis)))) + gl.L(f));
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
