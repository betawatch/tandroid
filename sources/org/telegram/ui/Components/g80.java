package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class g80 extends LinearLayout {
    public boolean E;
    public d80 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView a;
    public String b;
    public final org.telegram.ui.ActionBar.g2 c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final FrameLayout n;
    public f80 r;
    public org.telegram.ui.ActionBar.g1 s;
    public final di.d1 w;
    public int x;
    public boolean y;

    public g80(Context context, final org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, boolean z11) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.c = g2Var;
        this.y = z10;
        this.I = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, c8.ma.e(40, 48, 21));
        addView(frameLayout, c8.ma.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i7 = 0;
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        c8.ra.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new nq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748733, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(org.telegram.messenger.hd.N0(2131748733, null));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setSingleLine(true);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView2, c8.ma.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = f10;
        c8.ra.b(f10, 0.025f, 1.2f);
        f10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new nq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131748732, null));
        f10.setText(spannableStringBuilder2);
        f10.setContentDescription(org.telegram.messenger.hd.N0(2131748732, null));
        f10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f10.setTextSize(1, 14.0f);
        f10.setTypeface(org.telegram.messenger.g0.o());
        f10.setSingleLine(true);
        TextView f11 = org.telegram.messenger.o10.f(linearLayout, f10, c8.ma.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = f11;
        c8.ra.b(f11, 0.025f, 1.2f);
        f11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new nq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.N0(2131751522, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.s2(org.telegram.messenger.g0.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        f11.setText(spannableStringBuilder3);
        f11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f11.setTextSize(1, 14.0f);
        f11.setTypeface(org.telegram.messenger.g0.o());
        f11.setSingleLine(true);
        linearLayout.addView(f11, c8.ma.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        f11.setVisibility(8);
        addView(linearLayout, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        di.d1 d1Var = new di.d1(this, context);
        this.w = d1Var;
        ((e80) d1Var.c).setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(d1Var, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new st(this, w2Var, g2Var, 2));
        if (z10) {
            d1Var.setOnClickListener(new z70(this, i7));
        }
        f10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i7;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i10) {
                    case 0:
                        g80 g80Var = this.b;
                        try {
                            if (g80Var.b != null) {
                                Context context2 = g80Var.getContext();
                                String str = g80Var.b;
                                g2Var2.showDialog(new b80(g80Var, context2, str, str, g2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var2.getParentActivity());
                        String N0 = org.telegram.messenger.hd.N0(2131751522, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131751521, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new y70(this.b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        g2Var2.showDialog(t1Var);
                        break;
                }
            }
        });
        final int i10 = 1;
        f11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        g80 g80Var = this.b;
                        try {
                            if (g80Var.b != null) {
                                Context context2 = g80Var.getContext();
                                String str = g80Var.b;
                                g2Var2.showDialog(new b80(g80Var, context2, str, str, g2Var2.getResourceProvider()));
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var2.getParentActivity());
                        String N0 = org.telegram.messenger.hd.N0(2131751522, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131751521, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new y70(this.b, 0));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        g2Var2.showDialog(t1Var);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new bi.p6(this, context, w2Var, g2Var, 14));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.w(this, 12));
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y10 = frameLayout.getY() + f10;
            f11 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y10 -= frameLayout.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j3) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
            return;
        }
        if (TextUtils.equals(this.M, tL_chatInviteExported.link)) {
            return;
        }
        d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
        if (tL_chatInviteExported.usage <= 0 || tL_chatInviteExported.importers != null || this.E) {
            return;
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        String str = tL_chatInviteExported.link;
        if (str != null) {
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = str;
        }
        tL_messages_getChatInviteImporters.peer = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).l1(-j3);
        tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
        this.E = true;
        ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.u7(19, this, tL_chatInviteExported));
    }

    public final void d(int i7, ArrayList arrayList, boolean z10) {
        this.x = i7;
        di.d1 d1Var = this.w;
        if (i7 == 0) {
            d1Var.setVisibility(8);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f));
        } else {
            d1Var.setVisibility(0);
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(10.0f));
            ((TextView) d1Var.b).setText(org.telegram.messenger.hd.G(i7, "PeopleJoined", new Object[0]));
            d1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).e4((TLRPC.User) arrayList.get(i10), false, false);
            }
            int min = Math.min(3, Math.min(i7, arrayList.size()));
            ((e80) d1Var.c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((e80) d1Var.c).b(i11, org.telegram.messenger.k10.t0, (TLObject) arrayList.get(i11));
            }
        } else {
            ((e80) d1Var.c).setCount(0);
        }
        ((e80) d1Var.c).a(z10);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        gc Q = lc.b0(this.c).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }

    public final void f() {
        boolean z10 = this.L;
        ImageView imageView = this.d;
        TextView textView = this.a;
        FrameLayout frameLayout = this.n;
        TextView textView2 = this.h;
        TextView textView3 = this.f;
        TextView textView4 = this.e;
        di.d1 d1Var = this.w;
        if (z10) {
            org.telegram.ui.ActionBar.t6.a0(textView4);
            org.telegram.ui.ActionBar.t6.a0(textView3);
            org.telegram.ui.ActionBar.t6.a0(textView2);
            org.telegram.ui.ActionBar.t6.a0(frameLayout);
            org.telegram.ui.ActionBar.t6.a0(textView);
            org.telegram.ui.ActionBar.t6.a0(imageView);
            org.telegram.ui.ActionBar.t6.a0((TextView) d1Var.b);
            org.telegram.ui.ActionBar.t6.a0(d1Var);
            d80 d80Var = this.F;
            if (d80Var != null) {
                d80Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        org.telegram.ui.ActionBar.t6.U(textView4, i7, null);
        org.telegram.ui.ActionBar.t6.U(textView3, i7, null);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        int L = org.telegram.messenger.g0.L(21.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.m6.Hi;
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        org.telegram.ui.ActionBar.t6.Q(textView4, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, x03, x03), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), null);
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int x05 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, x04, x05, x05), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), null);
        int L3 = org.telegram.messenger.g0.L(21.0f);
        int i12 = org.telegram.ui.ActionBar.m6.ka;
        int x06 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.m6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 120);
        org.telegram.ui.ActionBar.t6.Q(textView2, org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, x06, o4, o4), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.g(i13, 120), null);
        int L4 = org.telegram.messenger.g0.L(21.0f);
        int i14 = org.telegram.ui.ActionBar.m6.e7;
        int x07 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.m6.i6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i15, false), 76);
        org.telegram.ui.ActionBar.t6.Q(frameLayout, org.telegram.ui.ActionBar.m6.k0(L4, L4, L4, L4, x07, o10, o10), org.telegram.ui.ActionBar.t6.M(i14), org.telegram.ui.ActionBar.t6.g(i15, 76), null);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.r5, null, PorterDuff.Mode.SRC_ATOP);
        TextView textView5 = (TextView) d1Var.b;
        int i16 = org.telegram.ui.ActionBar.m6.n6;
        org.telegram.ui.ActionBar.t6.U(textView5, i16, null);
        int L5 = org.telegram.messenger.g0.L(6.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i16, false), 76);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L5, L5, L5, L5, 0, o11, o11);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i16, 76);
        d1Var.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(d1Var, k02, null, g10, null);
        d80 d80Var2 = this.F;
        if (d80Var2 != null) {
            d80Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.H = z10;
    }

    public void setDelegate(f80 f80Var) {
        this.r = f80Var;
    }

    public void setLink(String str) {
        this.b = str;
        TextView textView = this.a;
        if (str == null) {
            textView.setText(org.telegram.messenger.hd.N0(2131748586, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.y = z10;
    }

    public void setQrText(String str) {
        this.K = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f;
        ImageView imageView = this.d;
        if (z10) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
