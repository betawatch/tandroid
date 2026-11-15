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
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oa0 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final int b;
    public final org.telegram.ui.ActionBar.e6 c;
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

    public oa0(Context context, int i7, org.telegram.messenger.gj gjVar, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i7;
        int i10 = gjVar.K1;
        this.a = i10;
        this.c = e6Var;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        TLRPC.Message message = gjVar.k;
        this.E = currentTime - message.date;
        this.n = org.telegram.messenger.gj.B0(message);
        this.r = gjVar.e1();
        TLRPC.Message message2 = gjVar.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ja.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i7 == 1 ? ((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i10).y7.U.b).c ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i7 == 2 ? R.drawable.menu_forward_stamp : org.telegram.messenger.gj.R4(gjVar.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.F8, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new e80(textView, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(2.0f), e6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.V(textView, org.telegram.ui.ActionBar.q6.K(0.7f, i11), e6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ja.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, c8.ja.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i11, e6Var);
        textView2.setTextSize(1, 14.0f);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView2, c8.ja.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = f10;
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = org.telegram.ui.ActionBar.j6.d7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.75f, org.telegram.ui.ActionBar.j6.w0(i12, e6Var)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.75f, i12);
        f10.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(f10, d02, K, null, e6Var);
        org.telegram.ui.ActionBar.q6.U(f10, i11, e6Var);
        f10.setTextSize(1, 11.0f);
        f10.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.33f));
        linearLayout.addView(f10, c8.ja.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i7, long j3, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.e6 e6Var) {
        final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, context, e6Var, false);
        p6Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var));
        boolean D3 = org.telegram.messenger.np.s1(i7).D3();
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        fh0 fh0Var = new fh0(context);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.f(z10 ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        fh0Var.d();
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        fh0Var.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(fh0Var, L2, M, null, e6Var);
        f10.addView(fh0Var, c8.ja.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setText(org.telegram.messenger.hd.M0(z10 ? 2131747045 : 2131746955, null));
        f10.addView(textView, c8.ja.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView2, i11, e6Var);
        textView2.setTextSize(1, 14.0f);
        String j10 = j3 > 0 ? org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3)), true) : "";
        org.telegram.messenger.k5.q(null, null, z10 ? D3 ? 2131747041 : 2131747042 : D3 ? 2131746951 : 2131746952, new Object[]{j10}, textView2);
        f10.addView(textView2, c8.ja.t(-1, -2, 1, 32, 9, 32, 19));
        final hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.i(org.telegram.messenger.hd.M0(z10 ? 2131747047 : 2131746957, null), false, true);
        f10.addView(g10, c8.ja.r(-1, 48, 1));
        g10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ka0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.d dVar = hi.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i12 = i7;
                org.telegram.ui.p6 p6Var2 = p6Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i12).sendRequest(setprivacy, new bi.j6(dVar, p6Var2, runnable3, 17));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(i12).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i12).sendRequest(setglobalprivacysettings, new di.k7(context, e6Var, dVar, p6Var2, runnable3, 6));
            }
        });
        if (!D3) {
            na0 na0Var = new na0(context, e6Var);
            na0Var.setGravity(17);
            na0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.q6.X(na0Var, org.telegram.ui.ActionBar.j6.z6, e6Var);
            na0Var.l(" " + org.telegram.messenger.hd.M0(2131747029, null) + " ", false);
            na0Var.setTextSize(14);
            f10.addView(na0Var, c8.ja.t(org.telegram.messenger.ns.t4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(textView3, i11, e6Var);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(org.telegram.messenger.hd.M0(z10 ? 2131747044 : 2131746954, null));
            f10.addView(textView3, c8.ja.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(textView4, i11, e6Var);
            textView4.setTextSize(1, 14.0f);
            org.telegram.messenger.k5.q(null, null, z10 ? 2131747040 : 2131746950, new Object[]{j10}, textView4);
            f10.addView(textView4, c8.ja.t(-1, -2, 1, 32, 9, 32, 19));
            ug.q0 q0Var = new ug.q0(context, e6Var, true);
            q0Var.setOnClickListener(new la0(z10, p6Var, runnable));
            q0Var.c(org.telegram.messenger.hd.M0(z10 ? 2131747046 : 2131746956, null), false, false);
            f10.addView(q0Var, c8.ja.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p6Var.O = f10;
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
            if (((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i7).y7.U.b).c) {
                long j3 = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(6);
                    int i12 = calendar.get(1);
                    calendar.setTimeInMillis(j3);
                    int i13 = calendar.get(6);
                    int i14 = calendar.get(1);
                    str = (i13 == i11 && i12 == i14) ? org.telegram.messenger.hd.a0(null, null, 2131747190, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : (i13 + 1 == i11 && i12 == i14) ? org.telegram.messenger.hd.a0(null, null, 2131747189, org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : Math.abs(System.currentTimeMillis() - j3) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131747191, org.telegram.messenger.hd.E0().q0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))) : org.telegram.messenger.hd.a0(null, null, 2131747191, org.telegram.messenger.hd.E0().C0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3)));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                str = org.telegram.messenger.hd.L(this.w);
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
            tL_messages_getOutboxReadDate.peer = org.telegram.messenger.np.s1(i7).j1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getOutboxReadDate, new v1(this, 7));
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
            str = (i17 == i15 && i16 == i18) ? org.telegram.messenger.hd.a0(null, null, 2131747199, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : (i17 + 1 == i15 && i16 == i18) ? org.telegram.messenger.hd.a0(null, null, 2131747198, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131747200, org.telegram.messenger.hd.E0().q0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : org.telegram.messenger.hd.a0(null, null, 2131747200, org.telegram.messenger.hd.E0().C0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        textView.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        cb cbVar;
        super.onDetachedFromWindow();
        xb xbVar = xb.w;
        if (xbVar == null || (cbVar = xbVar.e) == null || cbVar.getParent() == null || !(xbVar.e.getParent().getParent() instanceof sa)) {
            return;
        }
        xbVar.b();
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
                float max2 = Math.max(max, textView.getPaint().measureText(org.telegram.messenger.hd.M0(2131747193, null)) + org.telegram.messenger.g0.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(org.telegram.messenger.hd.M0(2131747197, null) + this.f.getPaint().measureText(org.telegram.messenger.hd.M0(2131747195, null))) + org.telegram.messenger.g0.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747194, org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + ((float) org.telegram.messenger.g0.L(48.0f)));
                this.G = max4;
                int i12 = this.E;
                if (i12 > 86400) {
                    f10 = 48.0f;
                    this.G = Math.max(max4, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747192, org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i12 > 172800) {
                    float max5 = Math.max(this.G, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747196, org.telegram.messenger.hd.E0().q0().format(new Date(currentTimeMillis)), org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(org.telegram.messenger.hd.a0(null, null, 2131747196, org.telegram.messenger.hd.E0().C0().format(new Date(currentTimeMillis)), org.telegram.messenger.hd.E0().p0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.g0.L(f10));
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
