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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fy0 extends LinearLayout {
    public float D;
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final hs0 d;
    public final w8 e;
    public final l9 f;
    public final org.telegram.ui.Cells.a6 h;
    public final j6 n;
    public org.telegram.messenger.ij r;
    public boolean s;
    public boolean w;
    public org.telegram.messenger.c20 x;
    public boolean y;

    public fy0(int i7, long j3, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.D = -6.0f;
        this.a = i7;
        this.b = j3;
        this.c = g6Var;
        setOrientation(1);
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(2, context, this);
        v8Var.U(fi.y5.e(null, i7, j3, org.telegram.ui.ActionBar.l6.I.q()));
        hs0 hs0Var = new hs0(context, i7);
        this.d = hs0Var;
        v8Var.addView(hs0Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new w8((org.telegram.ui.ActionBar.g6) null);
        l9 l9Var = new l9(context);
        this.f = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        v8Var.addView(l9Var, c8.ha.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(v8Var, c8.ha.r(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, g6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(org.telegram.messenger.qs.z1);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.s6.s(e10, org.telegram.ui.ActionBar.l6.y6, g6Var, PorterDuff.Mode.SRC_IN);
        a6Var.addView(e10, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.ka.a(e10);
        e10.setOnClickListener(new ma0(textView, 16));
        j6 j6Var = new j6(context, false, true, false);
        this.n = j6Var;
        j6Var.n = false;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.s6.Y(j6Var, org.telegram.ui.ActionBar.l6.q7, g6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setGravity(17);
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        a6Var.addView(j6Var, c8.ha.d(56, 50.0f, org.telegram.messenger.qs.C1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 24));
        addView(a6Var, c8.ha.r(-1, -2, 7));
        hs0Var.setDelegate(new m4.d0(this, textView, false));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z9, final boolean z10, boolean z11, final org.telegram.ui.ActionBar.g6 g6Var) {
        String str2;
        org.telegram.ui.ActionBar.v2 v2Var;
        org.telegram.ui.ActionBar.v2 v2Var2;
        int i10;
        int i11 = i7;
        boolean z12 = z10;
        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-j3));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        int i12 = z12 ? -6988581 : z9 ? -12539616 : -6905171;
        l9 l9Var = new l9(context);
        l9Var.setImageResource(R.drawable.large_user_tag);
        l9Var.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(80.0f), i12));
        f10.addView(l9Var, c8.ha.t(80, 80, 49, 0, 18, 0, 0));
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        TextView b10 = c8.qa.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.id.M0(z12 ? 2131744277 : z9 ? 2131744285 : 2131744279, null));
        f10.addView(b10, c8.ha.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.qa.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z12) {
                i10 = 2131752207;
            } else if (z9) {
                i10 = 2131752208;
            } else {
                str2 = "";
            }
            str2 = org.telegram.messenger.id.M0(i10, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z12 || z9) {
            v2Var = l10;
            int i14 = z12 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.l6.r1(0.1f, i14));
            spannableStringBuilder.setSpan(new ay0(i14, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            v2Var = l10;
            spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.l6.be, null), 0, spannableStringBuilder.length(), 33);
        }
        int i15 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, z12 ? 2131744278 : z9 ? 2131744286 : 2131744280, org.telegram.messenger.t10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, c8.ha.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, c8.ha.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        while (i16 < i15) {
            by0 by0Var = new by0(context, i11);
            by0Var.setDelegate(new cy0(i16 == 1, z12));
            dy0 dy0Var = new dy0(context, g6Var2, by0Var);
            dy0Var.U(fi.y5.e(null, i11, j3, org.telegram.ui.ActionBar.l6.I.q()));
            dy0Var.addView(by0Var, c8.ha.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout.addView(dy0Var, c8.ha.q(0, -1, 1.0f, org.telegram.messenger.qs.E1, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            dy0Var.setClipToOutline(true);
            dy0Var.setOutlineProvider(new yx0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.qp.s1(i11).z1(user.id);
            tL_message.peer_id = org.telegram.messenger.qp.s1(i11).z1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, tL_message, true, false);
            ijVar.j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new ey0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i15 = 2;
            spannableStringBuilder2.setSpan(new ey0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            ijVar.v = spannableStringBuilder2;
            by0Var.e6 = true;
            by0Var.j6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
            ijVar.n0(null);
            by0Var.w3(ijVar, null, false, false, false, false);
            by0Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i16++;
            i11 = i7;
            z12 = z10;
            g6Var2 = g6Var;
        }
        int i17 = 24;
        fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
        boolean z13 = (org.telegram.messenger.t3.w(25, M0) && (!z9 || ((!z10 && z11) || org.telegram.messenger.t10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.t10.B(user));
        if (!z13 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z10) {
            TextView b12 = c8.qa.b(context, 12.0f, org.telegram.ui.ActionBar.l6.y6, false, null);
            org.telegram.messenger.k5.m(b12, 1, null, 2131752563);
            f10.addView(b12, c8.ha.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(h, c8.ha.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            final org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
            h.setText(org.telegram.messenger.id.M0(org.telegram.messenger.t10.B(user) ? TextUtils.isEmpty(str) ? 2131744284 : 2131744282 : TextUtils.isEmpty(str) ? 2131744283 : 2131744281, null));
            v2Var2 = v2Var3;
            h.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.xx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v2.this.dismiss();
                    fy0.c(context, i7, j3, user, str, z9, z10, g6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    org.telegram.messenger.qp.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            h.setText(bi.k7.f2(org.telegram.messenger.id.M0(2131743888, null)));
            org.telegram.ui.ActionBar.v2 v2Var4 = v2Var;
            h.setOnClickListener(new lk(i17, v2Var4, zArr));
            v2Var2 = v2Var4;
        }
        v2Var2.P0 = true;
        v2Var2.w0(org.telegram.ui.ActionBar.l6.d6);
        v2Var2.n(new kr0(zArr, 11));
        if (org.telegram.messenger.qp.e1().getInt("showchattagsinfo", 3) > 0 || !z13) {
            v2Var2.show();
        } else {
            c(context, i7, j3, user, str, z9, z10, g6Var);
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z9, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        s12.M0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        TextView b10 = c8.qa.b(context, 20.0f, i10, true, null);
        b10.setText(org.telegram.messenger.id.M0(2131748627, null));
        linearLayout.addView(b10, c8.ha.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        linearLayout.addView(imageView, c8.ha.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, c8.ha.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
        boolean z11 = !TextUtils.isEmpty(str) || z9;
        h.setText(org.telegram.messenger.id.M0((TextUtils.isEmpty(str) && !z9 && z11) ? 2131748632 : z11 ? 2131748633 : 2131748634, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z12 = z11;
        fy0 fy0Var = new fy0(i7, j3, context, g6Var);
        fy0Var.setClipToOutline(true);
        fy0Var.setOutlineProvider(new zx0());
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, fy0Var, g6Var);
        fy0Var.a(user, str, z9, z10, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.vx0
            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z13 = z12;
                h.i(org.telegram.messenger.id.M0((isEmpty && !z9 && z13) ? 2131748632 : z13 ? 2131748633 : 2131748634, null), true, true);
            }
        });
        f10.addView(fy0Var, c8.ha.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(22, context, g6Var);
        z8Var.setText(org.telegram.messenger.t10.B(user) ? org.telegram.messenger.id.M0(2131748629, null) : org.telegram.messenger.id.a0(null, null, 2131748628, org.telegram.messenger.t10.p(user)));
        f10.addView(z8Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(h, c8.ha.t(-1, 48, 7, 14, 19, 14, 12));
        l10.P0 = true;
        l10.w0(org.telegram.ui.ActionBar.l6.a7);
        h.setOnClickListener(new hi.i3(h, fy0Var, s12, j3, user, strArr, i7, l10, (!TextUtils.isEmpty(str) || z9 || z10) ? false : true, g6Var));
        imageView.setOnClickListener(new y2(l10, 3));
        l10.show();
        EditTextBoldCursor textView = fy0Var.h.getTextView();
        textView.post(new bt(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z9, boolean z10, org.telegram.messenger.c20 c20Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = this.a;
        tL_message.from_id = org.telegram.messenger.qp.s1(i7).z1(user.id);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        long j3 = this.b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i7).getCurrentTime();
        tL_message.out = false;
        this.s = z9;
        this.w = z10;
        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i7, tL_message, true, false);
        this.r = ijVar;
        ijVar.j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.q;
        spannableStringBuilder.setSpan(new ey0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new ey0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        boolean z11 = M0 != null;
        hs0 hs0Var = this.d;
        hs0Var.e6 = z11;
        hs0Var.j6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
        this.r.n0(null);
        hs0Var.w3(this.r, null, false, false, false, false);
        w8 w8Var = this.e;
        w8Var.r(user);
        this.f.e(user, w8Var);
        this.x = c20Var;
        this.y = true;
        this.h.n(str, org.telegram.messenger.id.M0((!TextUtils.isEmpty(str) || z9) ? 2131748630 : 2131748631, null), false);
        this.y = false;
    }
}
