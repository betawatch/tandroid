package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ro {
    public final org.telegram.ui.ActionBar.y0 a;
    public final org.telegram.ui.ActionBar.y0 b;
    public final org.telegram.ui.ActionBar.y0 c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 e;
    public final po f;
    public final int g;
    public org.telegram.ui.ActionBar.g1 h;
    public final qo i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public ro(Context context, int i7, kf0 kf0Var, boolean z10, final qo qoVar, org.telegram.ui.ActionBar.h6 h6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final int i10;
        Integer num;
        this.g = i7;
        this.i = qoVar;
        po poVar = new po(z10 ? R.drawable.popup_fixed_alert : 0, 0, 0, context, h6Var);
        poVar.V = new Path();
        this.f = poVar;
        poVar.setFitItems(true);
        if (kf0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = poVar;
            i10 = 1;
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.gd.N0(2131753753, null), false, h6Var);
            this.a = c10;
            c10.setOnClickListener(new h8(kf0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = poVar;
            i10 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, org.telegram.messenger.gd.N0(2131745079, null), false, h6Var);
        this.b = c11;
        final int i11 = 0;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.gd.N0(2131748118, null), false, h6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.gd.N0(2131748118, null), false, h6Var);
        this.e = c13;
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        int i13 = i10;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, org.telegram.messenger.gd.N0(2131748115, null), false, h6Var).setOnClickListener(new no(this, context, h6Var, i7, qoVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.gd.N0(2131747723, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, h6Var);
        this.c = c14;
        final int i15 = 4;
        c14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, frameLayout, h6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ma.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i13, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, h6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, c8.ma.o(-2, -2));
        int i16 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i16, h6Var), 0, 6);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, h6Var);
        final int i17 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.a();
                        qoVar.w();
                        break;
                    case 1:
                        ro roVar = this.b;
                        roVar.a();
                        qoVar.B(roVar.l);
                        break;
                    case 2:
                        ro roVar2 = this.b;
                        roVar2.a();
                        qoVar.B(roVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        qoVar.u();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        break;
                    default:
                        qoVar.p();
                        this.b.a();
                        break;
                }
            }
        });
    }

    public static String b(int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i7 / 86400;
        int i11 = i7 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(org.telegram.messenger.gd.N0(2131745496, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.gd.N0(2131745495, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.gd.N0(2131745494, null));
        }
        return org.telegram.messenger.gd.a0("MuteForButton", null, 2131748116, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        y0Var.c(i7, i7);
        y0Var.h(0.1f, i7);
        if (y0Var.getTextView() == null || y0Var.getTextView().getCurrentTextColor() != x02) {
            y0Var.d(x02, x02);
            y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, x02));
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.g2 g2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (g2Var.getFragmentView() == null) {
            return;
        }
        po poVar = this.f;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(poVar, -2, -2);
        this.h = g1Var;
        g1Var.e = true;
        g1Var.c = org.telegram.messenger.ks.x3;
        g1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        poVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != g2Var.getFragmentView()) {
            if (view.getParent() == null) {
                return;
            }
            f10 += view.getX();
            f11 += view.getY();
            view = (View) view.getParent();
        }
        if (z10) {
            measuredWidth = f10 - org.telegram.messenger.g0.N(8.0f);
            measuredHeight = org.telegram.messenger.g0.N(16.0f);
        } else {
            measuredWidth = f10 - (poVar.getMeasuredWidth() / 2.0f);
            measuredHeight = poVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(g2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
        this.h.b();
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.j < 200) {
            org.telegram.messenger.g0.g3(new d3.e0(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.g;
        boolean u22 = org.telegram.messenger.mp.u1(i12).u2(j3, j10, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.c;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.b;
        if (u22) {
            y0Var.j(org.telegram.messenger.gd.N0(2131743605, null), R.drawable.msg_unmute, null);
            i7 = org.telegram.ui.ActionBar.m6.x6;
            y0Var2.setVisibility(8);
        } else {
            y0Var.j(org.telegram.messenger.gd.N0(2131748113, null), R.drawable.msg_mute, null);
            int i13 = org.telegram.ui.ActionBar.m6.q7;
            y0Var2.setVisibility(0);
            if (org.telegram.messenger.mp.u1(i12).v2(j3, j10)) {
                y0Var2.j(org.telegram.messenger.gd.N0(2131745081, null), R.drawable.msg_tone_off, null);
            } else {
                y0Var2.j(org.telegram.messenger.gd.N0(2131745079, null), R.drawable.msg_tone_on, null);
            }
            i7 = i13;
        }
        if (this.o == 1) {
            this.a.setVisibility(8);
        }
        if (u22 || this.o == 1) {
            i10 = 0;
            i11 = 0;
        } else {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).g7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.d;
        if (i11 != 0) {
            this.l = i11;
            y0Var3.setVisibility(0);
            y0Var3.getImageView().setImageDrawable(m01.a(i11));
            y0Var3.setText(b(i11));
        } else {
            y0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.e;
        if (i10 != 0) {
            this.k = i10;
            y0Var4.setVisibility(0);
            y0Var4.getImageView().setImageDrawable(m01.a(i10));
            y0Var4.setText(b(i10));
        } else {
            y0Var4.setVisibility(8);
        }
        c(y0Var, i7);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.m6.n6, 1, null, null));
        }
    }
}
