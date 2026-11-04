package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dy0 extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final es0 d;
    public final u8 e;
    public final k9 f;
    public final org.telegram.ui.Cells.z5 h;
    public final h6 n;
    public org.telegram.messenger.zi r;
    public boolean s;
    public boolean w;
    public org.telegram.messenger.u10 x;
    public boolean y;

    public dy0(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = -6.0f;
        this.a = i3;
        this.b = j10;
        this.c = e6Var;
        setOrientation(1);
        ai.h5 h5Var = new ai.h5(3, context, this);
        h5Var.U(gi.y5.e(null, i3, j10, org.telegram.ui.ActionBar.k6.I.q()));
        es0 es0Var = new es0(context, i3);
        this.d = es0Var;
        h5Var.addView(es0Var, b8.mf.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var = new k9(context);
        this.f = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        h5Var.addView(k9Var, b8.mf.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(h5Var, b8.mf.r(-1, -2, 7));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, e6Var);
        this.h = z5Var;
        EditTextBoldCursor textView = z5Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        z5Var.setTextRight(org.telegram.messenger.hs.z1);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.y6, e6Var, PorterDuff.Mode.SRC_IN);
        z5Var.addView(e10, b8.mf.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        b8.pf.a(e10);
        e10.setOnClickListener(new ga0(textView, 17));
        h6 h6Var = new h6(context, false, true, false);
        this.n = h6Var;
        h6Var.n = false;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.q7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(17);
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        z5Var.addView(h6Var, b8.mf.d(56, 50.0f, org.telegram.messenger.hs.C1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new bh.h(this, 24));
        addView(z5Var, b8.mf.r(-1, -2, 7));
        es0Var.setDelegate(new m2.t(13, this, textView));
    }

    public static void b(final Context context, final int i3, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        String str2;
        org.telegram.ui.ActionBar.t2 t2Var;
        org.telegram.ui.ActionBar.t2 t2Var2;
        int i10;
        int i11 = i3;
        boolean z13 = z11;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-j10));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        int i12 = z13 ? -6988581 : z10 ? -12539616 : -6905171;
        k9 k9Var = new k9(context);
        k9Var.setImageResource(R.drawable.large_user_tag);
        k9Var.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), i12));
        f10.addView(k9Var, b8.mf.t(80, 80, 49, 0, 18, 0, 0));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = b8.rf.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.bd.M0(z13 ? 2131744287 : z10 ? 2131744295 : 2131744289, null));
        f10.addView(b10, b8.mf.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = b8.rf.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z13) {
                i10 = 2131752207;
            } else if (z10) {
                i10 = 2131752208;
            } else {
                str2 = "";
            }
            str2 = org.telegram.messenger.bd.M0(i10, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z13 || z10) {
            t2Var = l10;
            int i14 = z13 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i14));
            spannableStringBuilder.setSpan(new yx0(i14, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            t2Var = l10;
            spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.be, null), 0, spannableStringBuilder.length(), 33);
        }
        int i15 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, z13 ? 2131744288 : z10 ? 2131744296 : 2131744290, org.telegram.messenger.l10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, b8.mf.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, b8.mf.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        while (i16 < i15) {
            zx0 zx0Var = new zx0(context, i11);
            zx0Var.setDelegate(new ay0(i16 == 1, z13));
            by0 by0Var = new by0(context, e6Var2, zx0Var);
            by0Var.U(gi.y5.e(null, i11, j10, org.telegram.ui.ActionBar.k6.I.q()));
            by0Var.addView(zx0Var, b8.mf.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout.addView(by0Var, b8.mf.q(0, -1, 1.0f, org.telegram.messenger.hs.E1, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            by0Var.setClipToOutline(true);
            by0Var.setOutlineProvider(new wx0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.hp.s1(i11).z1(user.id);
            tL_message.peer_id = org.telegram.messenger.hp.s1(i11).z1(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i11, tL_message, true, false);
            ziVar.j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new cy0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i15 = 2;
            spannableStringBuilder2.setSpan(new cy0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            ziVar.v = spannableStringBuilder2;
            zx0Var.e6 = true;
            zx0Var.j6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
            ziVar.n0(null);
            zx0Var.u3(ziVar, null, false, false, false, false);
            zx0Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i16++;
            i11 = i3;
            z13 = z11;
            e6Var2 = e6Var;
        }
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        boolean z14 = (org.telegram.messenger.t3.w(25, M0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.l10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.l10.B(user));
        if (!z14 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z11) {
            TextView b12 = b8.rf.b(context, 12.0f, org.telegram.ui.ActionBar.k6.y6, false, null);
            org.telegram.messenger.k5.m(b12, 1, null, 2131752563);
            f10.addView(b12, b8.mf.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(h, b8.mf.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z14) {
            final org.telegram.ui.ActionBar.t2 t2Var3 = t2Var;
            h.setText(org.telegram.messenger.bd.M0(org.telegram.messenger.l10.B(user) ? TextUtils.isEmpty(str) ? 2131744294 : 2131744292 : TextUtils.isEmpty(str) ? 2131744293 : 2131744291, null));
            t2Var2 = t2Var3;
            h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.vx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.t2.this.dismiss();
                    dy0.c(context, i3, j10, user, str, z10, z11, e6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    org.telegram.messenger.hp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            h.setText(ci.l6.g2(org.telegram.messenger.bd.M0(2131743898, null)));
            org.telegram.ui.ActionBar.t2 t2Var4 = t2Var;
            h.setOnClickListener(new ux0(0, (Object) t2Var4, (Object) zArr));
            t2Var2 = t2Var4;
        }
        t2Var2.Q0 = true;
        t2Var2.w0(org.telegram.ui.ActionBar.k6.d6);
        t2Var2.n(new sp0(zArr, 13));
        if (org.telegram.messenger.hp.e1().getInt("showchattagsinfo", 3) > 0 || !z14) {
            t2Var2.show();
        } else {
            c(context, i3, j10, user, str, z10, z11, e6Var);
        }
    }

    public static void c(Context context, int i3, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        s12.M0(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = b8.rf.b(context, 20.0f, i10, true, null);
        b10.setText(org.telegram.messenger.bd.M0(2131748635, null));
        linearLayout.addView(b10, b8.mf.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        linearLayout.addView(imageView, b8.mf.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, b8.mf.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        boolean z12 = !TextUtils.isEmpty(str) || z10;
        h.setText(org.telegram.messenger.bd.M0((TextUtils.isEmpty(str) && !z10 && z12) ? 2131748640 : z12 ? 2131748641 : 2131748642, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z13 = z12;
        dy0 dy0Var = new dy0(i3, j10, context, e6Var);
        dy0Var.setClipToOutline(true);
        dy0Var.setOutlineProvider(new xx0());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, dy0Var, e6Var);
        dy0Var.a(user, str, z10, z11, new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.sx0
            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                h.i(org.telegram.messenger.bd.M0((isEmpty && !z10 && z14) ? 2131748640 : z14 ? 2131748641 : 2131748642, null), true, true);
            }
        });
        f10.addView(dy0Var, b8.mf.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(22, context, e6Var);
        y8Var.setText(org.telegram.messenger.l10.B(user) ? org.telegram.messenger.bd.M0(2131748637, null) : org.telegram.messenger.bd.a0(null, null, 2131748636, org.telegram.messenger.l10.p(user)));
        f10.addView(y8Var, b8.mf.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(h, b8.mf.t(-1, 48, 7, 14, 19, 14, 12));
        l10.Q0 = true;
        l10.w0(org.telegram.ui.ActionBar.k6.a7);
        h.setOnClickListener(new ii.i3(h, dy0Var, s12, j10, user, strArr, i3, l10, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, e6Var));
        imageView.setOnClickListener(new w2(l10, 3));
        l10.show();
        EditTextBoldCursor textView = dy0Var.h.getTextView();
        textView.post(new zs(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.u10 u10Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i3 = this.a;
        tL_message.from_id = org.telegram.messenger.hp.s1(i3).z1(user.id);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        long j10 = this.b;
        tL_message.peer_id = s12.z1(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i3).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.w = z11;
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i3, tL_message, true, false);
        this.r = ziVar;
        ziVar.j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.q;
        spannableStringBuilder.setSpan(new cy0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new cy0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
        boolean z12 = M0 != null;
        es0 es0Var = this.d;
        es0Var.e6 = z12;
        es0Var.j6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
        this.r.n0(null);
        es0Var.u3(this.r, null, false, false, false, false);
        u8 u8Var = this.e;
        u8Var.r(user);
        this.f.e(user, u8Var);
        this.x = u10Var;
        this.y = true;
        this.h.n(str, org.telegram.messenger.bd.M0((!TextUtils.isEmpty(str) || z10) ? 2131748638 : 2131748639, null), false);
        this.y = false;
    }
}
