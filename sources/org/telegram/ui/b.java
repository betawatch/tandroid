package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a;

    public static boolean a(int i7, TLRPC.User user) {
        String n10;
        if (user != null && (n10 = org.telegram.messenger.t10.n(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.qp.s1(i7).O6);
                if (matcher.find()) {
                    if (n10.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i7) {
        if (!a && org.telegram.messenger.p10.s0 == i7) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            c(i7, context, T != null ? T.getResourceProvider() : null);
        }
    }

    public static void c(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        if (a) {
            return;
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        ai.e0 e0Var = new ai.e0(i7, context, r5, 25);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        ch0Var.f(R.raw.media_forbidden, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        ch0Var.d();
        f10.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.A1, org.telegram.messenger.qs.A1, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, f6Var, null, 2131754696);
        textView.setGravity(17);
        f10.addView(textView, c8.ha.t(-1, -2, 17, 0, 0, 0, 23));
        bi.q0 q0Var = new bi.q0(1, context, f6Var);
        q0Var.a(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131754707, null), org.telegram.messenger.hd.M0(2131754708, null));
        f10.addView(q0Var, c8.ha.t(-1, -2, 17, 0, 0, 0, 0));
        bi.q0 q0Var2 = new bi.q0(1, context, f6Var);
        q0Var2.a(R.drawable.menu_privacy, org.telegram.messenger.hd.M0(2131754705, null), org.telegram.messenger.hd.M0(2131754706, null));
        f10.addView(q0Var2, c8.ha.t(-1, -2, 17, 0, 0, 0, 0));
        bi.q0 q0Var3 = new bi.q0(1, context, f6Var);
        q0Var3.a(R.drawable.menu_feature_hourglass, org.telegram.messenger.hd.M0(2131754703, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131754704, org.telegram.messenger.hd.f0(org.telegram.messenger.qp.s1(i7).N6)), new gq0(e0Var, 2)));
        f10.addView(q0Var3, c8.ha.t(-1, -2, 17, 0, 0, 0, 0));
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.i(org.telegram.messenger.hd.M0(2131754698, null), false, true);
        dVar.setOnClickListener(new a(e0Var, 0));
        f10.addView(dVar, c8.ha.t(-1, 48, 7, 0, 13, 0, 4));
        fi.d dVar2 = new fi.d(context, f6Var, false);
        dVar2.i(org.telegram.messenger.hd.M0(2131754697, null), false, true);
        dVar2.setOnClickListener(new a(r5, i10));
        f10.addView(dVar2, c8.ha.t(-1, 48, 7, 0, 0, 0, 0));
        l10.N = f10;
        org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
        l10.T0 = false;
        l10.N();
        a = true;
        v2VarArr[0].show();
        v2VarArr[0].setOnDismissListener(new fi.d1(i10));
    }
}
