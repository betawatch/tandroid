package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m9;
import org.telegram.messenger.p9;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z0 extends ma implements p9 {
    public static final /* synthetic */ int Z1 = 0;
    public final long Q1;
    public final t0 R1;
    public final LinearLayout S1;
    public final u0 T1;
    public final TextView U1;
    public final w0 V1;
    public m9 W1;
    public f41 X1;
    public int Y1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int[], java.lang.String, org.telegram.ui.ActionBar.l6] */
    /* JADX WARN: Type inference failed for: r12v28 */
    public z0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, e6Var);
        u8 u8Var;
        TLRPC.Chat chat;
        ?? r12;
        Context context2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        s70 s70Var;
        long j11 = starGift.id;
        this.Q1 = j11;
        this.C1 = org.telegram.messenger.g0.L(6.0f);
        this.s1 = 0.2f;
        v0(i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)));
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        t0 t0Var = new t0(this, context);
        this.R1 = t0Var;
        linearLayout.addView(t0Var);
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i3 = d.leftMargin;
        int i10 = this.u0;
        d.leftMargin = i3 + i10;
        d.rightMargin += i10;
        this.b.addView(dVar, d);
        tj0 tj0Var = this.l1;
        int i11 = this.u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.X1.O(false);
        int i12 = z10 ? hs.x3 : 208;
        this.W1 = q9.c(this.a).l(j11, this);
        int i13 = 2;
        u0 u0Var = new u0(this, context, e6Var, new s(this, 1), new t(i13), new t(i13), new t(i13), new t(i13), new t(i13), new t(i13), i12);
        this.T1 = u0Var;
        u0Var.d(new ci.k5(1, 1));
        u0Var.setPreviewingAttributes(arrayList);
        u0Var.removeView(u0Var.Q);
        t0Var.addView(u0Var, 0, mf.e(-1, i12, 48));
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        t0Var.addView(k9Var, mf.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j10 == 0) {
            TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(h10.i(this.a).e()));
            u8Var = new u8(0, a22);
            chat = a22;
        } else if (j10 > 0) {
            TLRPC.User a23 = hp.s1(this.a).a2(Long.valueOf(j10));
            u8Var = new u8(0, a23);
            chat = a23;
        } else {
            TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
            u8Var = new u8(M0);
            chat = M0;
        }
        k9Var.e(chat, u8Var);
        TextView textView = new TextView(context);
        this.U1 = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 21.0f);
        textView.setText(org.telegram.messenger.m5.t(j10 != 0 ? j10 : h10.i(this.a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        t0Var.addView(textView, mf.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(bd.M0(2131749816, null));
            context2 = context;
            r12 = 0;
            e6Var2 = e6Var;
        } else {
            textView2.setText(org.telegram.messenger.g0.I2(bd.M0(2131750357, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            r12 = 0;
            context2 = context;
            e6Var2 = e6Var;
            textView2.setOnClickListener(new g0(context, e6Var, j10, starGift, arrayList));
            pf.b(textView2, 0.02f, 1.5f);
        }
        t0Var.addView(textView2, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        v0 v0Var = new v0(this.a, context2, e6Var2);
        v0Var.d0 = true;
        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
        v0Var.h(starGift, true, false, false, false, false);
        v0Var.setImageSize(org.telegram.messenger.g0.L(84.0f));
        v0Var.setImageLayer(7);
        v0Var.K.setVisibility(8);
        v0Var.e.g(r12);
        v0Var.setRibbonTextOneOf(this.W1.d.availability_total);
        linearLayout2.addView(v0Var, mf.l(0.0f, hs.B1, hs.B1));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, e6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, mf.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        w0 w0Var = new w0(this, context, this.a, e6Var3);
        this.V1 = w0Var;
        w0Var.d.removeView(w0Var.E);
        w0Var.d0 = true;
        w0Var.h(starGift, true, false, false, false, false);
        w0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        w0Var.setImageLayer(7);
        w0Var.K.setVisibility(8);
        w0Var.e.g(r12);
        w0Var.setRibbonTextOneOf(this.W1.d.availability_total);
        w0Var.setRibbonText(bd.M0(2131750327, r12));
        linearLayout2.addView(w0Var, mf.l(0.0f, hs.B1, hs.B1));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(bd.M0(2131749839, r12));
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(textView3, i14, e6Var3);
        float i15 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var3);
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, i0.a.f(0.2f, w02, org.telegram.ui.ActionBar.k6.w0(i17, e6Var3)));
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.r6.p(frameLayout, true);
        p10.d = d02;
        p10.e = r12;
        p10.f = r12;
        org.telegram.ui.ActionBar.l6 l6Var = new org.telegram.ui.ActionBar.l6();
        p10.e = l6Var;
        l6Var.c(i16, i17, 3, 0.2f, e6Var3);
        l6Var.g = org.telegram.ui.ActionBar.r6.u(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView4, i17, e6Var3);
        textView4.setText(bd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView4, mf.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(m10, i17, e6Var3);
        m10.setText(bd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(m10, mf.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View x0Var = new x0(context, i15);
        int L2 = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Ci;
        Drawable d03 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i18, e6Var3));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        x0Var.setBackground(d03);
        org.telegram.ui.ActionBar.r6.k(x0Var, d03, N, null, e6Var3);
        frameLayout.addView(x0Var, mf.e(-1, -1, hs.E1));
        y0 y0Var = new y0(context, i15);
        y0Var.setWillNotDraw(false);
        frameLayout.addView(y0Var, mf.e(-1, -1, hs.E1));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextColor(-1);
        textView5.setText(bd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        y0Var.addView(textView5, mf.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setTextColor(-1);
        textView6.setText(bd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        y0Var.addView(textView6, mf.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        m9 m9Var = this.W1;
        if (m9Var == null || m9Var.f == null) {
            s70Var = null;
        } else {
            s70Var = new s70(context, null);
            s70Var.setTextSize(1, 13.0f);
            s70Var.setGravity(17);
            org.telegram.ui.ActionBar.r6.V(s70Var, i14, e6Var3);
            s70Var.setText(org.telegram.messenger.g0.W2(bd.V(null, null, 2131750366, bd.E(starGift.availability_total, ','), Integer.valueOf(this.W1.f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750365, null), new l0(context, e6Var3, starGift, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var3);
        }
        if (!z10) {
            linearLayout.addView(linearLayout2, mf.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
            linearLayout.addView(textView3, mf.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
            linearLayout.addView(frameLayout, mf.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
            if (s70Var != null) {
                linearLayout.addView(s70Var, mf.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
            }
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            m9 m9Var2 = this.W1;
            if (m9Var2 == null || !m9Var2.g(currentTime)) {
                dVar.i(bd.M0(2131750353, null), false, true);
            } else {
                dVar.i(bd.M0(2131750348, null), false, true);
            }
            m9 m9Var3 = this.W1;
            if (m9Var3 != null && m9Var3.f != null) {
                if (m9Var3.g(currentTime)) {
                    dVar.g(bd.a0(null, null, 2131750343, bd.c0(this.W1.f.start_date - currentTime)), false);
                } else {
                    dVar.g(bd.a0(null, null, 2131750329, bd.c0(this.W1.f.end_date - currentTime)), false);
                }
            }
            dVar.setOnClickListener(new g0(this, j10, context, e6Var3, runnable, 1));
            return;
        }
        if (context != null) {
            TextView textView7 = new TextView(context);
            textView7.setTypeface(org.telegram.messenger.g0.o());
            textView7.setGravity(17);
            textView7.setText(bd.a0(null, null, 2131749817, starGift.title));
            textView7.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.V(textView7, i17, e6Var3);
            linearLayout.addView(textView7, mf.t(-1, -2, 17, 20, 14, 20, 6));
            TextView textView8 = new TextView(context);
            textView8.setGravity(17);
            textView8.setText(bd.M0(2131749815, null));
            textView8.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView8, i17, e6Var3);
            linearLayout.addView(textView8, mf.t(-1, -2, 17, 20, 0, 20, 16));
            yr0 yr0Var = new yr0(context, e6Var3);
            yr0Var.a.l(bd.M0(2131749823, null), false);
            yr0Var.b.setText(bd.M0(2131749822, null));
            yr0Var.d.setVisibility(8);
            ImageView imageView2 = yr0Var.c;
            imageView2.setImageResource(R.drawable.msg_emoji_gem);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView2, i17, e6Var3, mode);
            linearLayout.addView(yr0Var, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var2 = new yr0(context, e6Var3);
            yr0Var2.a.l(bd.M0(2131749821, null), false);
            yr0Var2.b.setText(bd.M0(2131749820, null));
            yr0Var2.d.setVisibility(8);
            ImageView imageView3 = yr0Var2.c;
            imageView3.setImageResource(R.drawable.menu_feature_cover_24);
            org.telegram.ui.ActionBar.r6.t(imageView3, i17, e6Var3, mode);
            linearLayout.addView(yr0Var2, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var3 = new yr0(context, e6Var3);
            yr0Var3.a.l(bd.M0(2131749819, null), false);
            yr0Var3.b.setText(bd.M0(2131749818, null));
            yr0Var3.d.setVisibility(8);
            ImageView imageView4 = yr0Var3.c;
            imageView4.setImageResource(R.drawable.menu_verification);
            org.telegram.ui.ActionBar.r6.t(imageView4, i17, e6Var3, mode);
            linearLayout.addView(yr0Var3, mf.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
        }
        dVar.i(ci.l6.g2(bd.M0(2131743898, null)), false, true);
        dVar.setOnClickListener(new b(this, 1));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new c(this, 4), this.J0);
        this.X1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return "";
    }

    @Override // org.telegram.messenger.p9
    public final void c(m9 m9Var) {
        this.W1 = m9Var;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        q9.c(this.a).n(this.Q1, this);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int f10 = i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0));
            if (f10 != this.Y1) {
                this.Y1 = f10;
                v0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
