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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gy0 extends LinearLayout {
    public float E;
    public final int a;
    public final long b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final gs0 d;
    public final t8 e;
    public final i9 f;
    public final org.telegram.ui.Cells.z5 h;
    public final h6 n;
    public org.telegram.messenger.gj r;
    public boolean s;
    public boolean w;
    public org.telegram.messenger.z10 x;
    public boolean y;

    public gy0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = -6.0f;
        this.a = i7;
        this.b = j3;
        this.c = e6Var;
        setOrientation(1);
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(2, context, this);
        v8Var.U(hi.x5.e(null, i7, j3, org.telegram.ui.ActionBar.j6.I.q()));
        gs0 gs0Var = new gs0(context, i7);
        this.d = gs0Var;
        v8Var.addView(gs0Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var = new i9(context);
        this.f = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        v8Var.addView(i9Var, c8.ja.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(v8Var, c8.ja.r(-1, -2, 7));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, e6Var);
        this.h = z5Var;
        EditTextBoldCursor textView = z5Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        z5Var.setTextRight(org.telegram.messenger.ns.z1);
        ImageView e10 = org.telegram.messenger.i20.e(context, R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.y6, e6Var, PorterDuff.Mode.SRC_IN);
        z5Var.addView(e10, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        c8.na.a(e10);
        e10.setOnClickListener(new y60(textView, 17));
        h6 h6Var = new h6(context, false, true, false);
        this.n = h6Var;
        h6Var.n = false;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.q7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(17);
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        z5Var.addView(h6Var, c8.ja.d(56, 50.0f, org.telegram.messenger.ns.C1, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new ah.j(this, 26));
        addView(z5Var, c8.ja.r(-1, -2, 7));
        gs0Var.setDelegate(new k8.a(16, this, textView));
    }

    public static void b(final Context context, final int i7, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        String str2;
        org.telegram.ui.ActionBar.u2 u2Var;
        org.telegram.ui.ActionBar.u2 u2Var2;
        int i10;
        int i11 = i7;
        boolean z13 = z11;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(-j3));
        if (M0 == null) {
            return;
        }
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var2, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        int i12 = z13 ? -6988581 : z10 ? -12539616 : -6905171;
        i9 i9Var = new i9(context);
        i9Var.setImageResource(R.drawable.large_user_tag);
        i9Var.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(80.0f), i12));
        f10.addView(i9Var, c8.ja.t(80, 80, 49, 0, 18, 0, 0));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = c8.sa.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.hd.M0(z13 ? 2131744277 : z10 ? 2131744285 : 2131744279, null));
        f10.addView(b10, c8.ja.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = c8.sa.b(context, 14.0f, i13, false, null);
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
            str2 = org.telegram.messenger.hd.M0(i10, null);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (z13 || z10) {
            u2Var = k10;
            int i14 = z13 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i14));
            spannableStringBuilder.setSpan(new by0(i14, paint, str2), 0, spannableStringBuilder.length(), 33);
        } else {
            u2Var = k10;
            spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.ee, null), 0, spannableStringBuilder.length(), 33);
        }
        b11.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, z13 ? 2131744278 : z10 ? 2131744286 : 2131744280, org.telegram.messenger.q10.j(user, true), M0.title)), spannableStringBuilder, "un1"));
        f10.addView(b11, c8.ja.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        f10.addView(linearLayout, c8.ja.t(-1, -2, 7, 16, 0, 16, 16));
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            cy0 cy0Var = new cy0(context, i11);
            cy0Var.setDelegate(new dy0(i15 == 1, z13));
            ey0 ey0Var = new ey0(context, e6Var2, cy0Var);
            ey0Var.U(hi.x5.e(null, i11, j3, org.telegram.ui.ActionBar.j6.I.q()));
            ey0Var.addView(cy0Var, c8.ja.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout.addView(ey0Var, c8.ja.q(0, -1, 1.0f, org.telegram.messenger.ns.E1, i15 == 1 ? 6 : 0, 0, i15 == 0 ? 6 : 0, 0));
            ey0Var.setClipToOutline(true);
            ey0Var.setOutlineProvider(new zx0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.from_id = org.telegram.messenger.np.s1(i11).z1(user.id);
            tL_message.peer_id = org.telegram.messenger.np.s1(i11).z1(j3);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
            tL_message.out = false;
            org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i11, tL_message, true, false);
            gjVar.l2 = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new fy0(org.telegram.messenger.g0.L(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new fy0(org.telegram.messenger.g0.L(160.0f)), 2, 3, 33);
            gjVar.v = spannableStringBuilder2;
            cy0Var.f6 = true;
            cy0Var.k6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
            gjVar.n0(null);
            cy0Var.x3(gjVar, null, false, false, false, false);
            cy0Var.setTranslationX(-org.telegram.messenger.g0.L(140.0f));
            i15++;
            i11 = i7;
            z13 = z11;
            e6Var2 = e6Var;
        }
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        boolean z14 = (org.telegram.messenger.t3.w(25, M0) && (!z10 || ((!z11 && z12) || org.telegram.messenger.q10.B(user)))) || (org.telegram.messenger.t3.h(M0) && org.telegram.messenger.q10.B(user));
        if (!z14 && !org.telegram.messenger.t3.w(25, M0) && !M0.creator && M0.admin_rights == null && !z11) {
            TextView b12 = c8.sa.b(context, 12.0f, org.telegram.ui.ActionBar.j6.y6, false, null);
            org.telegram.messenger.k5.l(b12, 1, null, 2131752563);
            f10.addView(b12, c8.ja.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        f10.addView(g10, c8.ja.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z14) {
            final org.telegram.ui.ActionBar.u2 u2Var3 = u2Var;
            g10.setText(org.telegram.messenger.hd.M0(org.telegram.messenger.q10.B(user) ? TextUtils.isEmpty(str) ? 2131744284 : 2131744282 : TextUtils.isEmpty(str) ? 2131744283 : 2131744281, null));
            u2Var2 = u2Var3;
            g10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.yx0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u2.this.dismiss();
                    gy0.c(context, i7, j3, user, str, z10, z11, e6Var);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    org.telegram.messenger.np.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            });
        } else {
            g10.setText(di.c6.h2(org.telegram.messenger.hd.M0(2131743888, null)));
            org.telegram.ui.ActionBar.u2 u2Var4 = u2Var;
            g10.setOnClickListener(new vv0(2, u2Var4, zArr));
            u2Var2 = u2Var4;
        }
        u2Var2.Q0 = true;
        u2Var2.w0(org.telegram.ui.ActionBar.j6.d6);
        u2Var2.n(new ro0(zArr, 14));
        if (org.telegram.messenger.np.e1().getInt("showchattagsinfo", 3) > 0 || !z14) {
            u2Var2.show();
        } else {
            c(context, i7, j3, user, str, z10, z11, e6Var);
        }
    }

    public static void c(Context context, int i7, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        s12.M0(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        LinearLayout linearLayout = new LinearLayout(context);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = c8.sa.b(context, 20.0f, i10, true, null);
        b10.setText(org.telegram.messenger.hd.M0(2131748627, null));
        linearLayout.addView(b10, c8.ja.q(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 1, org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        linearLayout.addView(imageView, c8.ja.t(32, 32, 21, 0, 0, 10, 0));
        f10.addView(linearLayout, c8.ja.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        boolean z12 = !TextUtils.isEmpty(str) || z10;
        g10.setText(org.telegram.messenger.hd.M0((TextUtils.isEmpty(str) && !z10 && z12) ? 2131748632 : z12 ? 2131748633 : 2131748634, null));
        final String[] strArr = {str == null ? "" : str};
        final boolean z13 = z12;
        gy0 gy0Var = new gy0(i7, j3, context, e6Var);
        gy0Var.setClipToOutline(true);
        gy0Var.setOutlineProvider(new ay0());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, gy0Var, e6Var);
        gy0Var.a(user, str, z10, z11, new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.wx0
            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                g10.i(org.telegram.messenger.hd.M0((isEmpty && !z10 && z14) ? 2131748632 : z14 ? 2131748633 : 2131748634, null), true, true);
            }
        });
        f10.addView(gy0Var, c8.ja.s(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(22, context, e6Var);
        y8Var.setText(org.telegram.messenger.q10.B(user) ? org.telegram.messenger.hd.M0(2131748629, null) : org.telegram.messenger.hd.a0(null, null, 2131748628, org.telegram.messenger.q10.p(user)));
        f10.addView(y8Var, c8.ja.t(-1, -2, 7, 0, 0, 0, 0));
        f10.addView(g10, c8.ja.t(-1, 48, 7, 14, 19, 14, 12));
        k10.Q0 = true;
        k10.w0(org.telegram.ui.ActionBar.j6.a7);
        g10.setOnClickListener(new ki.f3(g10, gy0Var, s12, j3, user, strArr, i7, k10, (!TextUtils.isEmpty(str) || z10 || z11) ? false : true, e6Var));
        imageView.setOnClickListener(new w2(k10, 3));
        k10.show();
        EditTextBoldCursor textView = gy0Var.h.getTextView();
        textView.post(new ht(textView, 8));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, org.telegram.messenger.z10 z10Var) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i7 = this.a;
        tL_message.from_id = org.telegram.messenger.np.s1(i7).z1(user.id);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        long j3 = this.b;
        tL_message.peer_id = s12.z1(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i7).getCurrentTime();
        tL_message.out = false;
        this.s = z10;
        this.w = z11;
        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i7, tL_message, true, false);
        this.r = gjVar;
        gjVar.l2 = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        Point point = org.telegram.messenger.g0.q;
        spannableStringBuilder.setSpan(new fy0((int) Math.min(point.x * 0.5f, org.telegram.messenger.g0.L(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new fy0((int) Math.min(point.x * 0.44f, org.telegram.messenger.g0.L(160.0f))), 2, 3, 33);
        this.r.v = spannableStringBuilder;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
        boolean z12 = M0 != null;
        gs0 gs0Var = this.d;
        gs0Var.f6 = z12;
        gs0Var.k6 = org.telegram.messenger.t3.T(M0) && M0.megagroup;
        this.r.n0(null);
        gs0Var.x3(this.r, null, false, false, false, false);
        t8 t8Var = this.e;
        t8Var.r(user);
        this.f.f(user, t8Var);
        this.x = z10Var;
        this.y = true;
        this.h.o(str, org.telegram.messenger.hd.M0((!TextUtils.isEmpty(str) || z10) ? 2131748630 : 2131748631, null), false);
        this.y = false;
    }
}
