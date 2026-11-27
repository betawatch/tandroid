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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oc2 {
    public final b8 a;
    public final b8 b;
    public final b8 c;
    public final b8 d;
    public final b8 e;
    public final mc2 f;
    public final int g;
    public n8 h;
    public final nc2 i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public boolean o;

    public oc2(Context context, int i, fj8 fj8Var, boolean z, final nc2 nc2Var, vnb vnbVar) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final byte b;
        Integer num;
        this.g = i;
        this.i = nc2Var;
        mc2 mc2Var = new mc2(context, z ? R.drawable.popup_fixed_alert : 0, vnbVar, 0, (byte) 0);
        mc2Var.V = new Path();
        this.f = mc2Var;
        mc2Var.setFitItems(true);
        if (fj8Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = mc2Var;
            b = 1;
            b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, ob6.M0(2131753749, null), false, vnbVar);
            this.a = c;
            c.setOnClickListener(new y60(fj8Var, (byte) 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = mc2Var;
            b = 1;
            num = 1;
        }
        b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, ob6.M0(2131745003, null), false, vnbVar);
        this.b = c2;
        final byte b2 = 0;
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b3) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        break;
                }
            }
        });
        b8 c3 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, ob6.M0(2131748065, null), false, vnbVar);
        this.d = c3;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b3) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        break;
                }
            }
        });
        b8 c4 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, ob6.M0(2131748065, null), false, vnbVar);
        this.e = c4;
        final byte b3 = 2;
        c4.setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b32) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        byte b4 = b;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, ob6.M0(2131748062, null), false, vnbVar).setOnClickListener(new lc2(this, context, vnbVar, i, nc2Var, (byte) 0));
        final byte b5 = 3;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, ob6.M0(2131747644, null), false, vnbVar).setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b32) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        break;
                }
            }
        });
        b8 c5 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, vnbVar);
        this.c = c5;
        final byte b6 = 4;
        c5.setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b6;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b32) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        yob.h(aob.H8, vnbVar, frameLayout);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        textView.setTextSize(b4, 13.0f);
        yob.X(textView, aob.E8, vnbVar);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, tre.o(-2, -2));
        int i2 = aob.I5;
        hf0 Y = aob.Y(aob.v0(i2, vnbVar), 0, 6);
        uob M = yob.M(i2);
        textView.setBackground(Y);
        yob.j(textView, Y, null, M, vnbVar);
        final byte b7 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: kc2
            public final /* synthetic */ oc2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b7;
                nc2 nc2Var2 = nc2Var;
                oc2 oc2Var = this.b;
                switch (b32) {
                    case 0:
                        oc2Var.a();
                        nc2Var2.p();
                        break;
                    case 1:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.l);
                        break;
                    case 2:
                        oc2Var.a();
                        nc2Var2.q(oc2Var.k);
                        break;
                    case 3:
                        oc2Var.a();
                        nc2Var2.m();
                        break;
                    case 4:
                        oc2Var.a();
                        hl.c3(new go1(nc2Var2, (byte) 28));
                        break;
                    default:
                        nc2Var2.i();
                        oc2Var.a();
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
            sb.append(ob6.M0(2131745420, null));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(ob6.M0(2131745419, null));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(ob6.M0(2131745418, null));
        }
        return ob6.a0("MuteForButton", null, 2131748063, sb.toString());
    }

    public static void c(b8 b8Var, int i) {
        int w0 = aob.w0(null, i, false);
        b8Var.c(i, i);
        b8Var.h(0.1f, i);
        if (b8Var.getTextView() == null || b8Var.getTextView().getCurrentTextColor() != w0) {
            b8Var.d(w0, w0);
            b8Var.setSelectorColor(aob.p1(0.1f, w0));
        }
    }

    public final void a() {
        n8 n8Var = this.h;
        if (n8Var != null) {
            n8Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(e eVar, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (eVar.getFragmentView() != null) {
            mc2 mc2Var = this.f;
            n8 n8Var = new n8(mc2Var, -2, -2);
            this.h = n8Var;
            n8Var.e = true;
            n8Var.c = (short) 220;
            n8Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            mc2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != eVar.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            if (z) {
                measuredWidth = f - hl.N(8.0f);
                measuredHeight = hl.N(16.0f);
            } else {
                measuredWidth = f - (mc2Var.getMeasuredWidth() / 2.0f);
                measuredHeight = mc2Var.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(eVar.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j, long j2, HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.j < 200) {
            hl.c3(new o30((Object) this, j, j2, (Object) hashSet, (byte) 1));
            return;
        }
        int i4 = this.g;
        boolean p2 = uc7.s1(i4).p2(j, j2, null);
        b8 b8Var = this.c;
        b8 b8Var2 = this.b;
        if (p2) {
            b8Var.j(ob6.M0(2131743503, null), R.drawable.msg_unmute, null);
            i = aob.x6;
            b8Var2.setVisibility(8);
        } else {
            b8Var.j(ob6.M0(2131748060, null), R.drawable.msg_mute, null);
            int i5 = aob.q7;
            b8Var2.setVisibility(0);
            if (uc7.s1(i4).q2(j, j2)) {
                b8Var2.j(ob6.M0(2131745005, null), R.drawable.msg_tone_off, null);
            } else {
                b8Var2.j(ob6.M0(2131745003, null), R.drawable.msg_tone_on, null);
            }
            i = i5;
        }
        if (this.o) {
            this.a.setVisibility(8);
        }
        if (p2 || this.o) {
            i2 = 0;
            i3 = 0;
        } else {
            SharedPreferences sharedPreferences = uc7.s1(i4).W3;
            i3 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i2 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        b8 b8Var3 = this.d;
        if (i3 != 0) {
            this.l = i3;
            b8Var3.setVisibility(0);
            b8Var3.getImageView().setImageDrawable(rsb.a(i3));
            b8Var3.setText(b(i3));
        } else {
            b8Var3.setVisibility(8);
        }
        b8 b8Var4 = this.e;
        if (i2 != 0) {
            this.k = i2;
            b8Var4.setVisibility(0);
            b8Var4.getImageView().setImageDrawable(rsb.a(i2));
            b8Var4.setText(b(i2));
        } else {
            b8Var4.setVisibility(8);
        }
        c(b8Var, i);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(hl.N2(ob6.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), aob.n6, 1, null, null));
        }
    }
}
