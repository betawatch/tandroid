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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iz0 extends LinearLayout {
    public float D;
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final ft0 d;
    public final r8 e;
    public final g9 f;
    public final org.telegram.ui.Cells.e6 h;
    public final f6 n;
    public org.telegram.messenger.jj r;
    public boolean s;
    public boolean w;
    public org.telegram.messenger.q20 x;
    public boolean y;

    public iz0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = -6.0f;
        this.a = i10;
        this.b = j10;
        this.c = p6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(this, context, 2);
        w8Var.U(vh.k4.e(null, i10, j10, org.telegram.ui.ActionBar.t6.I.q()));
        ft0 ft0Var = new ft0(context, i10);
        this.d = ft0Var;
        w8Var.addView(ft0Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.f = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        w8Var.addView(g9Var, w7.b6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, w7.b6.r(-1, -2, 7));
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, p6Var);
        this.h = e6Var;
        EditTextBoldCursor textView = e6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        e6Var.setTextRight(org.telegram.messenger.zs.z1);
        ImageView e = org.telegram.messenger.z20.e(context, R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.y6, p6Var, PorterDuff.Mode.SRC_IN);
        e6Var.addView(e, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.e6.a(e);
        e.setOnClickListener(new db0(textView, 17));
        f6 f6Var = new f6(context, false, true, false);
        this.n = f6Var;
        f6Var.n = false;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.q7, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setGravity(17);
        f6Var.setAllowCancel(true);
        f6Var.setScaleProperty(0.6f);
        e6Var.addView(f6Var, w7.b6.d(56, 50.0f, org.telegram.messenger.zs.C1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ag.a1(this, 19));
        addView(e6Var, w7.b6.r(-1, -2, 7));
        ft0Var.setDelegate(new m4.c(16, this, textView));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.p6 p6Var) {
        String str2;
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.z2 z2Var2;
        int i11;
        int i12 = i10;
        boolean z13 = z11;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-j10));
        if (L0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var2, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        int i13 = z13 ? -6988581 : z10 ? -12539616 : -6905171;
        g9 g9Var = new g9(context);
        g9Var.setImageResource(R.drawable.large_user_tag);
        g9Var.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(80.0f), i13));
        f7.addView(g9Var, w7.b6.t(80, 80, 49, 0, 18, 0, 0));
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        TextView b10 = w7.g6.b(context, 20.0f, i14, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.cd.L0(z13 ? 2131744303 : z10 ? 2131744311 : 2131744305, null));
        f7.addView(b10, w7.b6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.g6.b(context, 14.0f, i14, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
        if (str == null) {
            if (z13) {
                i11 = 2131752207;
            } else if (z10) {
                i11 = 2131752208;
            } else {
                str2 = "";
            }
            str2 = org.telegram.messenger.cd.L0(i11, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z13 || z10) {
            z2Var = k10;
            int i15 = z13 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i15));
            spannableStringBuilder.setSpan(new dz0(i15, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            z2Var = k10;
            spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.be, null), 0, spannableStringBuilder.length(), 33);
        }
        int i16 = 2;
        b11.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, z13 ? 2131744304 : z10 ? 2131744312 : 2131744306, org.telegram.messenger.h20.j(user, true), L0.title)), spannableStringBuilder, "un1"));
        f7.addView(b11, w7.b6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f7.addView(linearLayout, w7.b6.t(-1, -2, 7, 16, 0, 16, 16));
        int i17 = 0;
        while (i17 < i16) {
            ez0 ez0Var = new ez0(context, i12);
            ez0Var.setDelegate(new fz0(i17 == 1, z13));
            gz0 gz0Var = new gz0(context, p6Var2, ez0Var);
            gz0Var.U(vh.k4.e(null, i12, j10, org.telegram.ui.ActionBar.t6.I.q()));
            gz0Var.addView(ez0Var, w7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout.addView(gz0Var, w7.b6.q(0, -1, 1.0f, org.telegram.messenger.zs.E1, i17 == 1 ? 6 : 0, 0, i17 == 0 ? 6 : 0, 0));
            gz0Var.setClipToOutline(true);
            gz0Var.setOutlineProvider(new bz0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.vp.r1(i12).y1(user.id);
            tL_message.peer_id = org.telegram.messenger.vp.r1(i12).y1(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i12, tL_message, true, false);
            jjVar.j2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new hz0(org.telegram.messenger.i0.L(200.0f)), 0, 1, 33);
            i16 = 2;
            spannableStringBuilder2.setSpan(new hz0(org.telegram.messenger.i0.L(160.0f)), 2, 3, 33);
            jjVar.v = spannableStringBuilder2;
            ez0Var.d6 = true;
            ez0Var.i6 = org.telegram.messenger.w3.T(L0) && L0.megagroup;
            jjVar.n0(null);
            ez0Var.s3(jjVar, null, false, false, false, false);
            ez0Var.setTranslationX(-org.telegram.messenger.i0.L(140.0f));
            i17++;
            i12 = i10;
            z13 = z11;
            p6Var2 = p6Var;
        }
        vh.d i18 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        boolean z14 = (org.telegram.messenger.w3.w(25, L0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.h20.B(user)))) || (org.telegram.messenger.w3.h(L0) && org.telegram.messenger.h20.B(user));
        if (!z14 && !org.telegram.messenger.w3.w(25, L0) && !L0.creator && L0.admin_rights == null && !z11) {
            TextView b12 = w7.g6.b(context, 12.0f, org.telegram.ui.ActionBar.t6.y6, false, null);
            org.telegram.messenger.m5.l(b12, 1, null, 2131752563);
            f7.addView(b12, w7.b6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f7.addView(i18, w7.b6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z14) {
            final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
            i18.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.h20.B(user) ? TextUtils.isEmpty(str) ? 2131744310 : 2131744308 : TextUtils.isEmpty(str) ? 2131744309 : 2131744307, null));
            z2Var2 = z2Var3;
            i18.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.az0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z2.this.dismiss();
                    iz0.c(context, i10, j10, user, str, z10, z11, p6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    org.telegram.messenger.vp.d1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            i18.setText(rh.e4.g2(org.telegram.messenger.cd.L0(2131743913, null)));
            org.telegram.ui.ActionBar.z2 z2Var4 = z2Var;
            i18.setOnClickListener(new sr(17, z2Var4, zArr));
            z2Var2 = z2Var4;
        }
        z2Var2.P0 = true;
        z2Var2.w0(org.telegram.ui.ActionBar.t6.d6);
        z2Var2.o(new uo0(zArr, 16));
        if (org.telegram.messenger.vp.d1().getInt("showchattagsinfo", 3) > 0 || !z14) {
            z2Var2.show();
        } else {
            c(context, i10, j10, user, str, z10, z11, p6Var);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        r12.L0(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, true);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        LinearLayout linearLayout = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        TextView b10 = w7.g6.b(context, 20.0f, i11, true, null);
        b10.setText(org.telegram.messenger.cd.L0(2131748642, null));
        linearLayout.addView(b10, w7.b6.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        linearLayout.addView(imageView, w7.b6.t(32, 32, 21, 0, 0, 10, 0));
        f7.addView(linearLayout, w7.b6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        boolean z12 = !TextUtils.isEmpty(str) || z10;
        i13.setText(org.telegram.messenger.cd.L0((TextUtils.isEmpty(str) && !z10 && z12) ? 2131748647 : z12 ? 2131748648 : 2131748649, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z13 = z12;
        iz0 iz0Var = new iz0(i10, j10, context, p6Var);
        iz0Var.setClipToOutline(true);
        iz0Var.setOutlineProvider(new cz0());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, iz0Var, p6Var);
        iz0Var.a(user, str, z10, z11, new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.xy0
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                i13.i(org.telegram.messenger.cd.L0((isEmpty && !z10 && z14) ? 2131748647 : z14 ? 2131748648 : 2131748649, null), true, true);
            }
        });
        f7.addView(iz0Var, w7.b6.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(22, context, p6Var);
        b9Var.setText(org.telegram.messenger.h20.B(user) ? org.telegram.messenger.cd.L0(2131748644, null) : org.telegram.messenger.cd.a0(null, null, 2131748643, org.telegram.messenger.h20.p(user)));
        f7.addView(b9Var, w7.b6.t(-1, -2, 7, 0, 0, 0, 0));
        f7.addView(i13, w7.b6.t(-1, 48, 7, 14, 19, 14, 12));
        k10.P0 = true;
        k10.w0(org.telegram.ui.ActionBar.t6.a7);
        i13.setOnClickListener(new yy0(i13, iz0Var, r12, j10, user, strArr, i10, k10, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, p6Var));
        imageView.setOnClickListener(new y2(k10, 3));
        k10.show();
        EditTextBoldCursor textView = iz0Var.h.getTextView();
        textView.post(new ot(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.q20 q20Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.a;
        tL_message.from_id = org.telegram.messenger.vp.r1(i10).y1(user.id);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        long j10 = this.b;
        tL_message.peer_id = r12.y1(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.w = z11;
        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i10, tL_message, true, false);
        this.r = jjVar;
        jjVar.j2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.i0.q;
        spannableStringBuilder.setSpan(new hz0((int) Math.min(point.x * 0.5f, org.telegram.messenger.i0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new hz0((int) Math.min(point.x * 0.44f, org.telegram.messenger.i0.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
        boolean z12 = L0 != null;
        ft0 ft0Var = this.d;
        ft0Var.d6 = z12;
        ft0Var.i6 = org.telegram.messenger.w3.T(L0) && L0.megagroup;
        this.r.n0(null);
        ft0Var.s3(this.r, null, false, false, false, false);
        r8 r8Var = this.e;
        r8Var.r(user);
        this.f.e(user, r8Var);
        this.x = q20Var;
        this.y = true;
        this.h.n(str, org.telegram.messenger.cd.L0((!TextUtils.isEmpty(str) || z10) ? 2131748645 : 2131748646, null), false);
        this.y = false;
    }
}
