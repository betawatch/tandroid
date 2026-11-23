package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wa0 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final int b;
    public final org.telegram.ui.ActionBar.i6 c;
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

    public wa0(Context context, int i7, org.telegram.messenger.fj fjVar, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i7;
        int i10 = fjVar.K1;
        this.a = i10;
        this.c = i6Var;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        TLRPC.Message message = fjVar.k;
        this.E = currentTime - message.date;
        this.n = org.telegram.messenger.fj.B0(message);
        this.r = fjVar.e1();
        TLRPC.Message message2 = fjVar.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.na.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i7 == 1 ? ((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i10).A7.Z.b).c ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i7 == 2 ? R.drawable.menu_forward_stamp : org.telegram.messenger.fj.R4(fjVar.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new o80(textView, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(2.0f), i6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i11 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.V(textView, org.telegram.ui.ActionBar.u6.K(0.7f, i11), i6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.na.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, c8.na.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i11, i6Var);
        textView2.setTextSize(1, 14.0f);
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView2, c8.na.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = f10;
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.n6.d7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.75f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.75f, i12);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(f10, d02, K, null, i6Var);
        org.telegram.ui.ActionBar.u6.U(f10, i11, i6Var);
        f10.setTextSize(1, 11.0f);
        f10.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.33f));
        linearLayout.addView(f10, c8.na.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i7, long j3, boolean z10, Runnable runnable, Runnable runnable2, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, context, i6Var, false);
        p6Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var));
        boolean K3 = org.telegram.messenger.mp.u1(i7).K3();
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        qh0 qh0Var = new qh0(context);
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        qh0Var.f(z10 ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        qh0Var.d();
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        qh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(qh0Var, L2, M, null, i6Var);
        g10.addView(qh0Var, c8.na.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setText(org.telegram.messenger.gd.N0(z10 ? 2131746851 : 2131746761, null));
        g10.addView(textView, c8.na.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView2, i11, i6Var);
        textView2.setTextSize(1, 14.0f);
        String k10 = j3 > 0 ? org.telegram.messenger.n10.k(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)), true) : "";
        org.telegram.messenger.f3.q(null, null, z10 ? K3 ? 2131746847 : 2131746848 : K3 ? 2131746757 : 2131746758, new Object[]{k10}, textView2);
        g10.addView(textView2, c8.na.t(-1, -2, 1, 32, 9, 32, 19));
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        g11.i(org.telegram.messenger.gd.N0(z10 ? 2131746853 : 2131746763, null), false, true);
        g10.addView(g11, c8.na.r(-1, 48, 1));
        g11.setOnClickListener(new ai.a0(g11, z10, i7, p6Var, runnable2, context, i6Var));
        if (!K3) {
            va0 va0Var = new va0(context, i6Var);
            va0Var.setGravity(17);
            va0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.u6.X(va0Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
            va0Var.l(" " + org.telegram.messenger.gd.N0(2131746835, null) + " ", false);
            va0Var.setTextSize(14);
            g10.addView(va0Var, c8.na.t(org.telegram.messenger.ks.t4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView3, i11, i6Var);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(org.telegram.messenger.gd.N0(z10 ? 2131746850 : 2131746760, null));
            g10.addView(textView3, c8.na.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(textView4, i11, i6Var);
            textView4.setTextSize(1, 14.0f);
            org.telegram.messenger.f3.q(null, null, z10 ? 2131746846 : 2131746756, new Object[]{k10}, textView4);
            g10.addView(textView4, c8.na.t(-1, -2, 1, 32, 9, 32, 19));
            ug.r0 r0Var = new ug.r0(context, i6Var, true);
            r0Var.setOnClickListener(new ua0(z10, p6Var, runnable));
            r0Var.c(org.telegram.messenger.gd.N0(z10 ? 2131746852 : 2131746762, null), false, false);
            g10.addView(r0Var, c8.na.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p6Var.O = g10;
        p6Var.show();
    }

    public final void a() {
        String str = "LOC_ERR";
        TextView textView = this.e;
        int i7 = this.a;
        TextView textView2 = this.f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i10 = this.b;
        if (i10 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i7).A7.Z.b).c) {
                long j3 = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(6);
                    int i12 = calendar.get(1);
                    calendar.setTimeInMillis(j3);
                    int i13 = calendar.get(6);
                    int i14 = calendar.get(1);
                    str = (i13 == i11 && i12 == i14) ? org.telegram.messenger.gd.a0(null, null, 2131746996, org.telegram.messenger.gd.E0().p0().format(new Date(j3))) : (i13 + 1 == i11 && i12 == i14) ? org.telegram.messenger.gd.a0(null, null, 2131746995, org.telegram.messenger.gd.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.gd.a0(null, null, 2131746997, org.telegram.messenger.gd.E0().q0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3))) : org.telegram.messenger.gd.a0(null, null, 2131746997, org.telegram.messenger.gd.E0().C0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3)));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                str = org.telegram.messenger.gd.L(this.w);
            }
            textView.setText(str);
            return;
        }
        if (i10 != 2) {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = org.telegram.messenger.mp.u1(i7).l1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getOutboxReadDate, new e2(this, 7));
            return;
        }
        linearLayout.setAlpha(1.0f);
        textView3.setAlpha(0.0f);
        textView2.setVisibility(8);
        long j10 = this.x * 1000;
        try {
            Calendar calendar2 = Calendar.getInstance();
            int i15 = calendar2.get(6);
            int i16 = calendar2.get(1);
            calendar2.setTimeInMillis(j10);
            int i17 = calendar2.get(6);
            int i18 = calendar2.get(1);
            str = (i17 == i15 && i16 == i18) ? org.telegram.messenger.gd.a0(null, null, 2131747005, org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : (i17 + 1 == i15 && i16 == i18) ? org.telegram.messenger.gd.a0(null, null, 2131747004, org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.gd.a0(null, null, 2131747006, org.telegram.messenger.gd.E0().q0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10))) : org.telegram.messenger.gd.a0(null, null, 2131747006, org.telegram.messenger.gd.E0().C0().format(new Date(j10)), org.telegram.messenger.gd.E0().p0().format(new Date(j10)));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        textView.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        kb kbVar;
        super.onDetachedFromWindow();
        fc fcVar = fc.w;
        if (fcVar == null || (kbVar = fcVar.e) == null || kbVar.getParent() == null || !(fcVar.e.getParent().getParent() instanceof ab)) {
            return;
        }
        fcVar.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (this.G < 0.0f) {
            this.G = 0.0f;
            int i11 = this.b;
            TextView textView = this.e;
            if (i11 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, org.telegram.messenger.g0.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(org.telegram.messenger.gd.N0(2131746999, null)) + org.telegram.messenger.g0.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(org.telegram.messenger.gd.N0(2131747003, null) + this.f.getPaint().measureText(org.telegram.messenger.gd.N0(2131747001, null))) + org.telegram.messenger.g0.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747000, org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + ((float) org.telegram.messenger.g0.L(48.0f)));
                this.G = max4;
                int i12 = this.E;
                if (i12 > 86400) {
                    f10 = 48.0f;
                    this.G = Math.max(max4, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131746998, org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i12 > 172800) {
                    float max5 = Math.max(this.G, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747002, org.telegram.messenger.gd.E0().q0().format(new Date(currentTimeMillis)), org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(org.telegram.messenger.gd.a0(null, null, 2131747002, org.telegram.messenger.gd.E0().C0().format(new Date(currentTimeMillis)), org.telegram.messenger.gd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                }
            } else {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.g0.L(48.0f);
            }
        }
        int i13 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = size;
        float f12 = this.G;
        if (f11 < f12 || mode == Integer.MIN_VALUE) {
            size = (int) f12;
        } else {
            i13 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i13), i10);
    }
}
