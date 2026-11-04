package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a;

    public static boolean a(int i3, TLRPC.User user) {
        String n4;
        if (user != null && (n4 = org.telegram.messenger.l10.n(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(org.telegram.messenger.hp.s1(i3).O6);
                if (matcher.find()) {
                    if (n4.equalsIgnoreCase(matcher.group(1))) {
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

    public static void b(int i3) {
        if (!a && org.telegram.messenger.h10.t0 == i3) {
            Context context = LaunchActivity.K1;
            if (context == null) {
                context = org.telegram.messenger.t0.b;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            c(i3, context, T != null ? T.getResourceProvider() : null);
        }
    }

    public static void c(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        if (a) {
            return;
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        ai.e3 e3Var = new ai.e3(i3, context, r5, 26);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        fh0Var.f(R.raw.media_forbidden, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        fh0Var.d();
        f10.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.A1, org.telegram.messenger.hs.A1, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, e6Var, null, 2131754696);
        textView.setGravity(17);
        f10.addView(textView, b8.mf.t(-1, -2, 17, 0, 0, 0, 23));
        ci.l0 l0Var = new ci.l0(1, context, e6Var);
        l0Var.a(R.drawable.msg_block2, org.telegram.messenger.bd.M0(2131754707, null), org.telegram.messenger.bd.M0(2131754708, null));
        f10.addView(l0Var, b8.mf.t(-1, -2, 17, 0, 0, 0, 0));
        ci.l0 l0Var2 = new ci.l0(1, context, e6Var);
        l0Var2.a(R.drawable.menu_privacy, org.telegram.messenger.bd.M0(2131754705, null), org.telegram.messenger.bd.M0(2131754706, null));
        f10.addView(l0Var2, b8.mf.t(-1, -2, 17, 0, 0, 0, 0));
        ci.l0 l0Var3 = new ci.l0(1, context, e6Var);
        l0Var3.a(R.drawable.menu_feature_hourglass, org.telegram.messenger.bd.M0(2131754703, null), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131754704, org.telegram.messenger.bd.f0(org.telegram.messenger.hp.s1(i3).N6)), new xp0(e3Var, 2)));
        f10.addView(l0Var3, b8.mf.t(-1, -2, 17, 0, 0, 0, 0));
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.i(org.telegram.messenger.bd.M0(2131754698, null), false, true);
        dVar.setOnClickListener(new a(e3Var, 0));
        f10.addView(dVar, b8.mf.t(-1, 48, 7, 0, 13, 0, 4));
        gi.d dVar2 = new gi.d(context, e6Var, false);
        dVar2.i(org.telegram.messenger.bd.M0(2131754697, null), false, true);
        dVar2.setOnClickListener(new a(r5, i10));
        f10.addView(dVar2, b8.mf.t(-1, 48, 7, 0, 0, 0, 0));
        l10.O = f10;
        org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
        l10.U0 = false;
        l10.N();
        a = true;
        t2VarArr[0].show();
        t2VarArr[0].setOnDismissListener(new gi.d1(i10));
    }
}
