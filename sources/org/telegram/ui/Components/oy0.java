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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oy0 extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.i6 c;
    public final qs0 d;
    public final a9 e;
    public final p9 f;
    public final org.telegram.ui.Cells.a6 h;
    public final n6 n;
    public org.telegram.messenger.fj r;
    public boolean s;
    public boolean w;
    public org.telegram.messenger.w10 x;
    public boolean y;

    public oy0(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.E = -6.0f;
        this.a = i7;
        this.b = j3;
        this.c = i6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(2, context, this);
        w8Var.U(hi.f6.e(null, i7, j3, org.telegram.ui.ActionBar.n6.I.q()));
        qs0 qs0Var = new qs0(context, i7);
        this.d = qs0Var;
        w8Var.addView(qs0Var, c8.na.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new a9((org.telegram.ui.ActionBar.i6) null);
        p9 p9Var = new p9(context);
        this.f = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        w8Var.addView(p9Var, c8.na.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, c8.na.r(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, i6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(org.telegram.messenger.ks.z1);
        ImageView e10 = org.telegram.messenger.m10.e(context, R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.y6, i6Var, PorterDuff.Mode.SRC_IN);
        a6Var.addView(e10, c8.na.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.sa.a(e10);
        e10.setOnClickListener(new h(textView, 1));
        n6 n6Var = new n6(context, false, true, false);
        this.n = n6Var;
        n6Var.n = false;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.q7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setGravity(17);
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        a6Var.addView(n6Var, c8.na.d(56, 50.0f, org.telegram.messenger.ks.C1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 27));
        addView(a6Var, c8.na.r(-1, -2, 7));
        qs0Var.setDelegate(new jb.m(this, textView, false, 17));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.i6 i6Var) {
        String str2;
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.w2 w2Var2;
        int i10;
        int i11 = i7;
        boolean z13 = z11;
        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-j3));
        if (O0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var2, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j10.O = g10;
        int i12 = z13 ? -6988581 : z10 ? -12539616 : -6905171;
        p9 p9Var = new p9(context);
        p9Var.setImageResource(R.drawable.large_user_tag);
        p9Var.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(80.0f), i12));
        g10.addView(p9Var, c8.na.t(80, 80, 49, 0, 18, 0, 0));
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = c8.wa.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.gd.N0(z13 ? 2131744032 : z10 ? 2131744040 : 2131744034, null));
        g10.addView(b10, c8.na.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.wa.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        if (str == null) {
            if (z13) {
                i10 = 2131752195;
            } else if (z10) {
                i10 = 2131752196;
            } else {
                str2 = "";
            }
            str2 = org.telegram.messenger.gd.N0(i10, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z13 || z10) {
            w2Var = j10;
            int i14 = z13 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, i14));
            spannableStringBuilder.setSpan(new jy0(i14, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            w2Var = j10;
            spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.ee, null), 0, spannableStringBuilder.length(), 33);
        }
        int i15 = 2;
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, z13 ? 2131744033 : z10 ? 2131744041 : 2131744035, org.telegram.messenger.n10.k(user, true), O0.title)), spannableStringBuilder, "un1"));
        g10.addView(b11, c8.na.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        g10.addView(linearLayout, c8.na.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        while (i16 < i15) {
            ky0 ky0Var = new ky0(context, i11);
            ky0Var.setDelegate(new ly0(i16 == 1, z13));
            my0 my0Var = new my0(context, i6Var2, ky0Var);
            my0Var.U(hi.f6.e(null, i11, j3, org.telegram.ui.ActionBar.n6.I.q()));
            my0Var.addView(ky0Var, c8.na.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout.addView(my0Var, c8.na.q(0, -1, 1.0f, org.telegram.messenger.ks.E1, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            my0Var.setClipToOutline(true);
            my0Var.setOutlineProvider(new hy0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.mp.u1(i11).B1(user.id);
            tL_message.peer_id = org.telegram.messenger.mp.u1(i11).B1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i11, tL_message, true, false);
            fjVar.l2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new ny0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            i15 = 2;
            spannableStringBuilder2.setSpan(new ny0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            fjVar.v = spannableStringBuilder2;
            ky0Var.f6 = true;
            ky0Var.k6 = org.telegram.messenger.v3.T(O0) && O0.megagroup;
            fjVar.n0(null);
            ky0Var.y3(fjVar, null, false, false, false, false);
            ky0Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i16++;
            i11 = i7;
            z13 = z11;
            i6Var2 = i6Var;
        }
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        boolean z14 = (org.telegram.messenger.v3.w(25, O0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.n10.C(user)))) || (org.telegram.messenger.v3.h(O0) && org.telegram.messenger.n10.C(user));
        if (!z14 && !org.telegram.messenger.v3.w(25, O0) && !O0.creator && O0.admin_rights == null && !z11) {
            TextView b12 = c8.wa.b(context, 12.0f, org.telegram.ui.ActionBar.n6.y6, false, null);
            org.telegram.messenger.f3.k(b12, 1, null, 2131752551);
            g10.addView(b12, c8.na.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        g10.addView(g11, c8.na.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z14) {
            final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
            g11.setText(org.telegram.messenger.gd.N0(org.telegram.messenger.n10.C(user) ? TextUtils.isEmpty(str) ? 2131744039 : 2131744037 : TextUtils.isEmpty(str) ? 2131744038 : 2131744036, null));
            w2Var2 = w2Var3;
            g11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w2.this.dismiss();
                    oy0.c(context, i7, j3, user, str, z10, z11, i6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    org.telegram.messenger.mp.g1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            g11.setText(di.f6.t2(org.telegram.messenger.gd.N0(2131743641, null)));
            org.telegram.ui.ActionBar.w2 w2Var4 = w2Var;
            g11.setOnClickListener(new l8(26, w2Var4, zArr));
            w2Var2 = w2Var4;
        }
        w2Var2.Q0 = true;
        w2Var2.w0(org.telegram.ui.ActionBar.n6.d6);
        w2Var2.n(new bp0(zArr, 14));
        if (org.telegram.messenger.mp.g1().getInt("showchattagsinfo", 3) > 0 || !z14) {
            w2Var2.show();
        } else {
            c(context, i7, j3, user, str, z10, z11, i6Var);
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        u12.O0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, true);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j10.O = g10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = c8.wa.b(context, 20.0f, i10, true, null);
        b10.setText(org.telegram.messenger.gd.N0(2131748434, null));
        linearLayout.addView(b10, c8.na.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
        linearLayout.addView(imageView, c8.na.t(32, 32, 21, 0, 0, 10, 0));
        g10.addView(linearLayout, c8.na.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        boolean z12 = !TextUtils.isEmpty(str) || z10;
        g11.setText(org.telegram.messenger.gd.N0((TextUtils.isEmpty(str) && !z10 && z12) ? 2131748439 : z12 ? 2131748440 : 2131748441, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z13 = z12;
        oy0 oy0Var = new oy0(i7, j3, context, i6Var);
        oy0Var.setClipToOutline(true);
        oy0Var.setOutlineProvider(new iy0());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, oy0Var, i6Var);
        oy0Var.a(user, str, z10, z11, new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.ey0
            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                g11.i(org.telegram.messenger.gd.N0((isEmpty && !z10 && z14) ? 2131748439 : z14 ? 2131748440 : 2131748441, null), true, true);
            }
        });
        g10.addView(oy0Var, c8.na.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(22, context, i6Var);
        z8Var.setText(org.telegram.messenger.n10.C(user) ? org.telegram.messenger.gd.N0(2131748436, null) : org.telegram.messenger.gd.a0(null, null, 2131748435, org.telegram.messenger.n10.q(user)));
        g10.addView(z8Var, c8.na.t(-1, -2, 7, 0, 0, 0, 0));
        g10.addView(g11, c8.na.t(-1, 48, 7, 14, 19, 14, 12));
        j10.Q0 = true;
        j10.w0(org.telegram.ui.ActionBar.n6.a7);
        g11.setOnClickListener(new ki.a3(g11, oy0Var, u12, j3, user, strArr, i7, j10, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, i6Var));
        imageView.setOnClickListener(new e3(j10, 3));
        j10.show();
        EditTextBoldCursor textView = oy0Var.h.getTextView();
        textView.post(new i(textView, 9));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.w10 w10Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = this.a;
        tL_message.from_id = org.telegram.messenger.mp.u1(i7).B1(user.id);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        long j3 = this.b;
        tL_message.peer_id = u12.B1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i7).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.w = z11;
        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i7, tL_message, true, false);
        this.r = fjVar;
        fjVar.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.q;
        spannableStringBuilder.setSpan(new ny0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new ny0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        boolean z12 = O0 != null;
        qs0 qs0Var = this.d;
        qs0Var.f6 = z12;
        qs0Var.k6 = org.telegram.messenger.v3.T(O0) && O0.megagroup;
        this.r.n0(null);
        qs0Var.y3(this.r, null, false, false, false, false);
        a9 a9Var = this.e;
        a9Var.r(user);
        this.f.f(user, a9Var);
        this.x = w10Var;
        this.y = true;
        this.h.o(str, org.telegram.messenger.gd.N0((!TextUtils.isEmpty(str) || z10) ? 2131748437 : 2131748438, null), false);
        this.y = false;
    }
}
