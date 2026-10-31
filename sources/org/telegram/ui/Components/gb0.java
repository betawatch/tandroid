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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gb0 extends FrameLayout {
    public final int D;
    public boolean E;
    public float F;
    public final int a;
    public final int b;
    public final org.telegram.ui.ActionBar.p6 c;
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

    public gb0(Context context, int i10, org.telegram.messenger.jj jjVar, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.E = false;
        this.F = -1.0f;
        this.b = i10;
        int i11 = jjVar.I1;
        this.a = i11;
        this.c = p6Var;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        TLRPC.Message message = jjVar.k;
        this.D = currentTime - message.date;
        this.n = org.telegram.messenger.jj.B0(message);
        this.r = jjVar.f1();
        TLRPC.Message message2 = jjVar.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i10 == 1 ? ((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i11).y7.U.b).c ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i10 == 2 ? R.drawable.menu_forward_stamp : org.telegram.messenger.jj.R4(jjVar.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.F8, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new u80(textView, org.telegram.messenger.i0.L(96.0f), org.telegram.messenger.i0.L(2.0f), p6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.W(textView, org.telegram.ui.ActionBar.a7.L(0.7f, i12), p6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.b6.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i12, p6Var);
        textView2.setTextSize(1, 14.0f);
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView2, w7.b6.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = f7;
        int L = org.telegram.messenger.i0.L(20.0f);
        int i13 = org.telegram.ui.ActionBar.t6.d7;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.75f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)));
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.75f, i13);
        f7.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(f7, d02, L2, null, p6Var);
        org.telegram.ui.ActionBar.a7.V(f7, i12, p6Var);
        f7.setTextSize(1, 11.0f);
        f7.setPadding(org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(2.33f));
        linearLayout.addView(f7, w7.b6.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j10, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.p6 p6Var) {
        final org.telegram.ui.p6 p6Var2 = new org.telegram.ui.p6(1, context, p6Var, false);
        p6Var2.P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
        boolean A3 = org.telegram.messenger.vp.r1(i10).A3();
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        ei0 ei0Var = new ei0(context);
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        ei0Var.f(z10 ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        ei0Var.d();
        ei0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        ei0Var.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(ei0Var, L2, N, null, p6Var);
        f7.addView(ei0Var, w7.b6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        textView.setTextSize(1, 20.0f);
        textView.setText(org.telegram.messenger.cd.L0(z10 ? 2131747060 : 2131746970, null));
        f7.addView(textView, w7.b6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView2, i12, p6Var);
        textView2.setTextSize(1, 14.0f);
        String j11 = j10 > 0 ? org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)), true) : "";
        org.telegram.messenger.m5.q(null, null, z10 ? A3 ? 2131747056 : 2131747057 : A3 ? 2131746966 : 2131746967, new Object[]{j11}, textView2);
        f7.addView(textView2, w7.b6.t(-1, -2, 1, 32, 9, 32, 19));
        final vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i13.i(org.telegram.messenger.cd.L0(z10 ? 2131747062 : 2131746972, null), false, true);
        f7.addView(i13, w7.b6.r(-1, 48, 1));
        i13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vh.d dVar = vh.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i14 = i10;
                org.telegram.ui.p6 p6Var3 = p6Var2;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i14).sendRequest(setprivacy, new ag.p0(dVar, p6Var3, runnable3, 12));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(i14).X;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i14).sendRequest(setglobalprivacysettings, new mg.z(context, p6Var, dVar, p6Var3, runnable3, 6));
            }
        });
        if (!A3) {
            fb0 fb0Var = new fb0(context, p6Var);
            fb0Var.setGravity(17);
            fb0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.a7.Y(fb0Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
            fb0Var.l(" " + org.telegram.messenger.cd.L0(2131747044, null) + " ", false);
            fb0Var.setTextSize(14);
            f7.addView(fb0Var, w7.b6.t(org.telegram.messenger.zs.t4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(textView3, i12, p6Var);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(org.telegram.messenger.cd.L0(z10 ? 2131747059 : 2131746969, null));
            f7.addView(textView3, w7.b6.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(textView4, i12, p6Var);
            textView4.setTextSize(1, 14.0f);
            org.telegram.messenger.m5.q(null, null, z10 ? 2131747055 : 2131746965, new Object[]{j11}, textView4);
            f7.addView(textView4, w7.b6.t(-1, -2, 1, 32, 9, 32, 19));
            kg.x0 x0Var = new kg.x0(context, p6Var, true);
            x0Var.setOnClickListener(new cb0(z10, p6Var2, runnable));
            x0Var.c(org.telegram.messenger.cd.L0(z10 ? 2131747061 : 2131746971, null), false, false);
            f7.addView(x0Var, w7.b6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        p6Var2.N = f7;
        p6Var2.show();
    }

    public final void a() {
        String str = "LOC_ERR";
        TextView textView = this.e;
        int i10 = this.a;
        TextView textView2 = this.f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i10).y7.U.b).c) {
                long j10 = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i12 = calendar.get(6);
                    int i13 = calendar.get(1);
                    calendar.setTimeInMillis(j10);
                    int i14 = calendar.get(6);
                    int i15 = calendar.get(1);
                    str = (i14 == i12 && i13 == i15) ? org.telegram.messenger.cd.a0(null, null, 2131747205, org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : (i14 + 1 == i12 && i13 == i15) ? org.telegram.messenger.cd.a0(null, null, 2131747204, org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.cd.a0(null, null, 2131747206, org.telegram.messenger.cd.D0().p0().format(new Date(j10)), org.telegram.messenger.cd.D0().o0().format(new Date(j10))) : org.telegram.messenger.cd.a0(null, null, 2131747206, org.telegram.messenger.cd.D0().B0().format(new Date(j10)), org.telegram.messenger.cd.D0().o0().format(new Date(j10)));
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else {
                str = org.telegram.messenger.cd.L(this.w);
            }
            textView.setText(str);
            return;
        }
        if (i11 != 2) {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = org.telegram.messenger.vp.r1(i10).i1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new x1(this, 7));
            return;
        }
        linearLayout.setAlpha(1.0f);
        textView3.setAlpha(0.0f);
        textView2.setVisibility(8);
        long j11 = this.x * 1000;
        try {
            Calendar calendar2 = Calendar.getInstance();
            int i16 = calendar2.get(6);
            int i17 = calendar2.get(1);
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            int i19 = calendar2.get(1);
            str = (i18 == i16 && i17 == i19) ? org.telegram.messenger.cd.a0(null, null, 2131747214, org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : (i18 + 1 == i16 && i17 == i19) ? org.telegram.messenger.cd.a0(null, null, 2131747213, org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? org.telegram.messenger.cd.a0(null, null, 2131747215, org.telegram.messenger.cd.D0().p0().format(new Date(j11)), org.telegram.messenger.cd.D0().o0().format(new Date(j11))) : org.telegram.messenger.cd.a0(null, null, 2131747215, org.telegram.messenger.cd.D0().B0().format(new Date(j11)), org.telegram.messenger.cd.D0().o0().format(new Date(j11)));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        textView.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        bb bbVar;
        super.onDetachedFromWindow();
        wb wbVar = wb.w;
        if (wbVar == null || (bbVar = wbVar.e) == null || bbVar.getParent() == null || !(wbVar.e.getParent().getParent() instanceof qa)) {
            return;
        }
        wbVar.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f7;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.F < 0.0f) {
            this.F = 0.0f;
            int i12 = this.b;
            TextView textView = this.e;
            if (i12 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.F, org.telegram.messenger.i0.L(144.0f));
                this.F = max;
                float max2 = Math.max(max, textView.getPaint().measureText(org.telegram.messenger.cd.L0(2131747208, null)) + org.telegram.messenger.i0.L(48.0f));
                this.F = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(org.telegram.messenger.cd.L0(2131747212, null) + this.f.getPaint().measureText(org.telegram.messenger.cd.L0(2131747210, null))) + org.telegram.messenger.i0.L(64.0f));
                this.F = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(org.telegram.messenger.cd.a0(null, null, 2131747209, org.telegram.messenger.cd.D0().o0().format(new Date(currentTimeMillis)))) + ((float) org.telegram.messenger.i0.L(48.0f)));
                this.F = max4;
                int i13 = this.D;
                if (i13 > 86400) {
                    f7 = 48.0f;
                    this.F = Math.max(max4, textView.getPaint().measureText(org.telegram.messenger.cd.a0(null, null, 2131747207, org.telegram.messenger.cd.D0().o0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.i0.L(48.0f));
                } else {
                    f7 = 48.0f;
                }
                if (i13 > 172800) {
                    float max5 = Math.max(this.F, textView.getPaint().measureText(org.telegram.messenger.cd.a0(null, null, 2131747211, org.telegram.messenger.cd.D0().p0().format(new Date(currentTimeMillis)), org.telegram.messenger.cd.D0().o0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.i0.L(f7));
                    this.F = max5;
                    this.F = Math.max(max5, textView.getPaint().measureText(org.telegram.messenger.cd.a0(null, null, 2131747211, org.telegram.messenger.cd.D0().B0().format(new Date(currentTimeMillis)), org.telegram.messenger.cd.D0().o0().format(new Date(currentTimeMillis)))) + org.telegram.messenger.i0.L(f7));
                }
            } else {
                this.F = textView.getPaint().measureText(textView.getText().toString()) + org.telegram.messenger.i0.L(48.0f);
            }
        }
        int i14 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f10 = size;
        float f11 = this.F;
        if (f10 < f11 || mode == Integer.MIN_VALUE) {
            size = (int) f11;
        } else {
            i14 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i14), i11);
    }
}
