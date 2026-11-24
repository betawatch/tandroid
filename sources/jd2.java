// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jd2 {
    public final a8 a;
    public final a8 b;
    public final a8 c;
    public final a8 d;
    public final a8 e;
    public final hd2 f;
    public final int g;
    public m8 h;
    public final id2 i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public boolean o;

    public jd2(Context context, int i, th8 th8Var, boolean z, final id2 id2Var, ylb ylbVar) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final byte b;
        Integer num;
        this.g = i;
        this.i = id2Var;
        hd2 hd2Var = new hd2(context, z ? R.drawable.popup_fixed_alert : 0, ylbVar, 0, (byte) 0);
        hd2Var.V = new Path();
        this.f = hd2Var;
        hd2Var.setFitItems(true);
        if (th8Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = hd2Var;
            b = 1;
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, jb6.M0(2131753721, null), false, ylbVar);
            this.a = c;
            c.setOnClickListener(new w70(th8Var, (byte) 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = hd2Var;
            b = 1;
            num = 1;
        }
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, jb6.M0(2131745009, null), false, ylbVar);
        this.b = c2;
        final byte b2 = 0;
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b3) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
        a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, jb6.M0(2131748068, null), false, ylbVar);
        this.d = c3;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b3) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
        a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, jb6.M0(2131748068, null), false, ylbVar);
        this.e = c4;
        final byte b3 = 2;
        c4.setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b32) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        byte b4 = b;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, jb6.M0(2131748065, null), false, ylbVar).setOnClickListener(new gd2(this, context, ylbVar, i, id2Var, (byte) 0));
        final byte b5 = 3;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, jb6.M0(2131747650, null), false, ylbVar).setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b32) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, ylbVar);
        this.c = c5;
        final byte b6 = 4;
        c5.setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b6;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b32) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        anb.h(cmb.G8, ylbVar, frameLayout);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(gm.L(13.0f), gm.L(8.0f), gm.L(13.0f), gm.L(8.0f));
        textView.setTextSize(b4, 13.0f);
        anb.X(textView, cmb.D8, ylbVar);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, qoe.o(-2, -2));
        int i2 = cmb.H5;
        fg0 Y = cmb.Y(cmb.v0(i2, ylbVar), 0, 6);
        wmb M = anb.M(i2);
        textView.setBackground(Y);
        anb.j(textView, Y, null, M, ylbVar);
        final byte b7 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: fd2
            public final /* synthetic */ jd2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b7;
                id2 id2Var2 = id2Var;
                jd2 jd2Var = this.b;
                switch (b32) {
                    case 0:
                        jd2Var.a();
                        id2Var2.s();
                        break;
                    case 1:
                        jd2Var.a();
                        id2Var2.t(jd2Var.l);
                        break;
                    case 2:
                        jd2Var.a();
                        id2Var2.t(jd2Var.k);
                        break;
                    case 3:
                        jd2Var.a();
                        id2Var2.r();
                        break;
                    case 4:
                        jd2Var.a();
                        gm.c3(new fo1(id2Var2, (byte) 27));
                        break;
                    default:
                        id2Var2.h();
                        jd2Var.a();
                        break;
                }
            }
        });
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = (i3 - (i4 * 3600)) / 60;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(jb6.M0(2131745426, null));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(jb6.M0(2131745425, null));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(jb6.M0(2131745424, null));
        }
        return jb6.a0("MuteForButton", null, 2131748066, sb.toString());
    }

    public static void c(a8 a8Var, int i) {
        int w0 = cmb.w0(null, i, false);
        a8Var.c(i, i);
        a8Var.h(0.1f, i);
        if (a8Var.getTextView() == null || a8Var.getTextView().getCurrentTextColor() != w0) {
            a8Var.d(w0, w0);
            a8Var.setSelectorColor(cmb.p1(0.1f, w0));
        }
    }

    public final void a() {
        m8 m8Var = this.h;
        if (m8Var != null) {
            m8Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(d dVar, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (dVar.getFragmentView() != null) {
            hd2 hd2Var = this.f;
            m8 m8Var = new m8(hd2Var, -2, -2);
            this.h = m8Var;
            m8Var.e = true;
            m8Var.c = (short) 220;
            m8Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            hd2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != dVar.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            if (z) {
                measuredWidth = f - gm.N(8.0f);
                measuredHeight = gm.N(16.0f);
            } else {
                measuredWidth = f - (hd2Var.getMeasuredWidth() / 2.0f);
                measuredHeight = hd2Var.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(dVar.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j, long j2, HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.j < 200) {
            gm.c3(new n40((Object) this, j, j2, (Object) hashSet, (byte) 1));
            return;
        }
        int i4 = this.g;
        boolean o2 = oc7.r1(i4).o2(j, j2, null);
        a8 a8Var = this.c;
        a8 a8Var2 = this.b;
        if (o2) {
            a8Var.j(jb6.M0(2131743535, null), R.drawable.msg_unmute, null);
            i = cmb.w6;
            a8Var2.setVisibility(8);
        } else {
            a8Var.j(jb6.M0(2131748063, null), R.drawable.msg_mute, null);
            int i5 = cmb.p7;
            a8Var2.setVisibility(0);
            if (oc7.r1(i4).p2(j, j2)) {
                a8Var2.j(jb6.M0(2131745011, null), R.drawable.msg_tone_off, null);
            } else {
                a8Var2.j(jb6.M0(2131745009, null), R.drawable.msg_tone_on, null);
            }
            i = i5;
        }
        if (this.o) {
            this.a.setVisibility(8);
        }
        if (o2 || this.o) {
            i2 = 0;
            i3 = 0;
        } else {
            SharedPreferences sharedPreferences = oc7.r1(i4).W3;
            i3 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i2 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        a8 a8Var3 = this.d;
        if (i3 != 0) {
            this.l = i3;
            a8Var3.setVisibility(0);
            a8Var3.getImageView().setImageDrawable(sqb.a(i3));
            a8Var3.setText(b(i3));
        } else {
            a8Var3.setVisibility(8);
        }
        a8 a8Var4 = this.e;
        if (i2 != 0) {
            this.k = i2;
            a8Var4.setVisibility(0);
            a8Var4.getImageView().setImageDrawable(sqb.a(i2));
            a8Var4.setText(b(i2));
        } else {
            a8Var4.setVisibility(8);
        }
        c(a8Var, i);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(gm.N2(jb6.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), cmb.m6, 1, null, null));
        }
    }
}
