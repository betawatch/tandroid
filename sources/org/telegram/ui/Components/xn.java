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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xn {
    public final org.telegram.ui.ActionBar.y0 a;
    public final org.telegram.ui.ActionBar.y0 b;
    public final org.telegram.ui.ActionBar.y0 c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 e;
    public final vn f;
    public final int g;
    public org.telegram.ui.ActionBar.f1 h;
    public final wn i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public xn(Context context, int i3, xe0 xe0Var, boolean z10, final wn wnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final int i10;
        Integer num;
        this.g = i3;
        this.i = wnVar;
        vn vnVar = new vn(z10 ? R.drawable.popup_fixed_alert : 0, 0, 0, context, e6Var);
        vnVar.V = new Path();
        this.f = vnVar;
        vnVar.setFitItems(true);
        if (xe0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = vnVar;
            i10 = 1;
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.bd.M0(2131753756, null), false, e6Var);
            this.a = c2;
            c2.setOnClickListener(new b8(xe0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = vnVar;
            i10 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, org.telegram.messenger.bd.M0(2131745285, null), false, e6Var);
        this.b = c10;
        final int i11 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.bd.M0(2131748319, null), false, e6Var);
        this.d = c11;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.bd.M0(2131748319, null), false, e6Var);
        this.e = c12;
        final int i12 = 2;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        int i13 = i10;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, org.telegram.messenger.bd.M0(2131748316, null), false, e6Var).setOnClickListener(new un(this, context, e6Var, i3, wnVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.bd.M0(2131747925, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, e6Var);
        this.c = c13;
        final int i15 = 4;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, e6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, b8.mf.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i13, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, e6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, b8.mf.o(-2, -2));
        int i16 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i16, e6Var), 0, 6);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, e6Var);
        final int i17 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.a();
                        wnVar.v();
                        break;
                    case 1:
                        xn xnVar = this.b;
                        xnVar.a();
                        wnVar.z(xnVar.l);
                        break;
                    case 2:
                        xn xnVar2 = this.b;
                        xnVar2.a();
                        wnVar.z(xnVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        wnVar.t();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        break;
                    default:
                        wnVar.p();
                        this.b.a();
                        break;
                }
            }
        });
    }

    public static String b(int i3) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i3 / 86400;
        int i11 = i3 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(org.telegram.messenger.bd.M0(2131745702, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.bd.M0(2131745701, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.bd.M0(2131745700, null));
        }
        return org.telegram.messenger.bd.a0("MuteForButton", null, 2131748317, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.y0 y0Var, int i3) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        y0Var.c(i3, i3);
        y0Var.h(0.1f, i3);
        if (y0Var.getTextView() == null || y0Var.getTextView().getCurrentTextColor() != x02) {
            y0Var.d(x02, x02);
            y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, x02));
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.f1 f1Var = this.h;
        if (f1Var != null) {
            f1Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.d2 d2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (d2Var.getFragmentView() == null) {
            return;
        }
        vn vnVar = this.f;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(vnVar, -2, -2);
        this.h = f1Var;
        f1Var.e = true;
        f1Var.c = org.telegram.messenger.hs.x3;
        f1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        vnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != d2Var.getFragmentView()) {
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
            measuredWidth = f10 - (vnVar.getMeasuredWidth() / 2.0f);
            measuredHeight = vnVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(d2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
        this.h.b();
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i3;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.j < 200) {
            org.telegram.messenger.g0.h3(new c3.f0(this, j10, j11, hashSet, 5));
            return;
        }
        int i12 = this.g;
        boolean r22 = org.telegram.messenger.hp.s1(i12).r2(j10, j11, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.c;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.b;
        if (r22) {
            y0Var.j(org.telegram.messenger.bd.M0(2131743858, null), R.drawable.msg_unmute, null);
            i3 = org.telegram.ui.ActionBar.k6.x6;
            y0Var2.setVisibility(8);
        } else {
            y0Var.j(org.telegram.messenger.bd.M0(2131748314, null), R.drawable.msg_mute, null);
            int i13 = org.telegram.ui.ActionBar.k6.q7;
            y0Var2.setVisibility(0);
            if (org.telegram.messenger.hp.s1(i12).s2(j10, j11)) {
                y0Var2.j(org.telegram.messenger.bd.M0(2131745287, null), R.drawable.msg_tone_off, null);
            } else {
                y0Var2.j(org.telegram.messenger.bd.M0(2131745285, null), R.drawable.msg_tone_on, null);
            }
            i3 = i13;
        }
        if (this.o == 1) {
            this.a.setVisibility(8);
        }
        if (r22 || this.o == 1) {
            i10 = 0;
            i11 = 0;
        } else {
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i12).d7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.d;
        if (i11 != 0) {
            this.l = i11;
            y0Var3.setVisibility(0);
            y0Var3.getImageView().setImageDrawable(zz0.a(i11));
            y0Var3.setText(b(i11));
        } else {
            y0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.e;
        if (i10 != 0) {
            this.k = i10;
            y0Var4.setVisibility(0);
            y0Var4.getImageView().setImageDrawable(zz0.a(i10));
            y0Var4.setText(b(i10));
        } else {
            y0Var4.setVisibility(8);
        }
        c(y0Var, i3);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.k6.n6, 1, null, null));
        }
    }
}
