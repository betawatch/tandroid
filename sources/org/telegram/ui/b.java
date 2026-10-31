package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a;

    public static boolean a(int i10, TLRPC.User user) {
        String n10;
        if (user != null && (n10 = org.telegram.messenger.h20.n(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.vp.r1(i10).P6);
                if (matcher.find()) {
                    if (n10.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i10) {
        if (!a && org.telegram.messenger.d20.s0 == i10) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = org.telegram.messenger.w0.b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            c(i10, context, T != null ? T.getResourceProvider() : null);
        }
    }

    public static void c(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        if (a) {
            return;
        }
        int i11 = 1;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        ag.o0 o0Var = new ag.o0(i10, context, r5, 12);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        ei0Var.f(R.raw.media_forbidden, org.telegram.messenger.i0.L(115.0f), org.telegram.messenger.i0.L(115.0f), null);
        ei0Var.d();
        f7.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.A1, org.telegram.messenger.zs.A1, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        org.telegram.messenger.z20.p(textView, org.telegram.ui.ActionBar.t6.G6, p6Var, null, 2131754696);
        textView.setGravity(17);
        f7.addView(textView, w7.b6.t(-1, -2, 17, 0, 0, 0, 23));
        rh.v vVar = new rh.v(1, context, p6Var);
        vVar.a(R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131754707, null), org.telegram.messenger.cd.L0(2131754708, null));
        f7.addView(vVar, w7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        rh.v vVar2 = new rh.v(1, context, p6Var);
        vVar2.a(R.drawable.menu_privacy, org.telegram.messenger.cd.L0(2131754705, null), org.telegram.messenger.cd.L0(2131754706, null));
        f7.addView(vVar2, w7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        rh.v vVar3 = new rh.v(1, context, p6Var);
        vVar3.a(R.drawable.menu_feature_hourglass, org.telegram.messenger.cd.L0(2131754703, null), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131754704, org.telegram.messenger.cd.f0(org.telegram.messenger.vp.r1(i10).O6)), new rr0(o0Var, 2)));
        f7.addView(vVar3, w7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(org.telegram.messenger.cd.L0(2131754698, null), false, true);
        dVar.setOnClickListener(new a(o0Var, 0));
        f7.addView(dVar, w7.b6.t(-1, 48, 7, 0, 13, 0, 4));
        vh.d dVar2 = new vh.d(context, p6Var, false);
        dVar2.i(org.telegram.messenger.cd.L0(2131754697, null), false, true);
        dVar2.setOnClickListener(new a(r5, i11));
        f7.addView(dVar2, w7.b6.t(-1, 48, 7, 0, 0, 0, 0));
        k10.N = f7;
        org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
        k10.T0 = false;
        k10.O();
        a = true;
        z2VarArr[0].show();
        z2VarArr[0].setOnDismissListener(new jg.z(i11));
    }
}
