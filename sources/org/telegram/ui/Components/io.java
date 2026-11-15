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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class io {
    public final org.telegram.ui.ActionBar.z0 a;
    public final org.telegram.ui.ActionBar.z0 b;
    public final org.telegram.ui.ActionBar.z0 c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 e;
    public final go f;
    public final int g;
    public org.telegram.ui.ActionBar.g1 h;
    public final ho i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public int o;

    public io(Context context, int i7, ye0 ye0Var, boolean z10, final ho hoVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final int i10;
        Integer num;
        this.g = i7;
        this.i = hoVar;
        go goVar = new go(z10 ? R.drawable.popup_fixed_alert : 0, 0, 0, context, e6Var);
        goVar.V = new Path();
        this.f = goVar;
        goVar.setFitItems(true);
        if (ye0Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = goVar;
            i10 = 1;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.hd.M0(2131753756, null), false, e6Var);
            this.a = c10;
            c10.setOnClickListener(new a8(ye0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = goVar;
            i10 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, org.telegram.messenger.hd.M0(2131745275, null), false, e6Var);
        this.b = c11;
        final int i11 = 0;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.hd.M0(2131748311, null), false, e6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, org.telegram.messenger.hd.M0(2131748311, null), false, e6Var);
        this.e = c13;
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
                        this.b.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        int i13 = i10;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, org.telegram.messenger.hd.M0(2131748308, null), false, e6Var).setOnClickListener(new eo(this, context, e6Var, i7, hoVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, org.telegram.messenger.hd.M0(2131747917, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
                        this.b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, e6Var);
        this.c = c14;
        final int i15 = 4;
        c14.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
                        this.b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.H8, frameLayout, e6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, c8.ja.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i13, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, e6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, c8.ja.o(-2, -2));
        int i16 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), 0, 6);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(textView, a02, null, M, e6Var);
        final int i17 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.co
            public final /* synthetic */ io b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.a();
                        hoVar.J();
                        break;
                    case 1:
                        io ioVar = this.b;
                        ioVar.a();
                        hoVar.R(ioVar.l);
                        break;
                    case 2:
                        io ioVar2 = this.b;
                        ioVar2.a();
                        hoVar.R(ioVar2.k);
                        break;
                    case 3:
                        this.b.a();
                        hoVar.F();
                        break;
                    case 4:
                        this.b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        break;
                    default:
                        hoVar.t();
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
            sb2.append(org.telegram.messenger.hd.M0(2131745692, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.hd.M0(2131745691, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.hd.M0(2131745690, null));
        }
        return org.telegram.messenger.hd.a0("MuteForButton", null, 2131748309, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        z0Var.c(i7, i7);
        z0Var.h(0.1f, i7);
        if (z0Var.getTextView() == null || z0Var.getTextView().getCurrentTextColor() != x02) {
            z0Var.d(x02, x02);
            z0Var.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, x02));
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

    public final void d(org.telegram.ui.ActionBar.e2 e2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (e2Var.getFragmentView() == null) {
            return;
        }
        go goVar = this.f;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(goVar, -2, -2);
        this.h = g1Var;
        g1Var.e = true;
        g1Var.c = org.telegram.messenger.ns.x3;
        g1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        goVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != e2Var.getFragmentView()) {
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
            measuredWidth = f10 - (goVar.getMeasuredWidth() / 2.0f);
            measuredHeight = goVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(e2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
        this.h.b();
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.j < 200) {
            org.telegram.messenger.g0.h3(new d3.e0(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.g;
        boolean r22 = org.telegram.messenger.np.s1(i12).r2(j3, j10, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.c;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.b;
        if (r22) {
            z0Var.j(org.telegram.messenger.hd.M0(2131743848, null), R.drawable.msg_unmute, null);
            i7 = org.telegram.ui.ActionBar.j6.x6;
            z0Var2.setVisibility(8);
        } else {
            z0Var.j(org.telegram.messenger.hd.M0(2131748306, null), R.drawable.msg_mute, null);
            int i13 = org.telegram.ui.ActionBar.j6.q7;
            z0Var2.setVisibility(0);
            if (org.telegram.messenger.np.s1(i12).s2(j3, j10)) {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745277, null), R.drawable.msg_tone_off, null);
            } else {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745275, null), R.drawable.msg_tone_on, null);
            }
            i7 = i13;
        }
        if (this.o == 1) {
            this.a.setVisibility(8);
        }
        if (r22 || this.o == 1) {
            i10 = 0;
            i11 = 0;
        } else {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i12).e7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.d;
        if (i11 != 0) {
            this.l = i11;
            z0Var3.setVisibility(0);
            z0Var3.getImageView().setImageDrawable(c01.a(i11));
            z0Var3.setText(b(i11));
        } else {
            z0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.e;
        if (i10 != 0) {
            this.k = i10;
            z0Var4.setVisibility(0);
            z0Var4.getImageView().setImageDrawable(c01.a(i10));
            z0Var4.setText(b(i10));
        } else {
            z0Var4.setVisibility(8);
        }
        c(z0Var, i7);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.j6.n6, 1, null, null));
        }
    }
}
