// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class i5 {
    public static boolean a;

    public static boolean a(int i, TLRPC.User user) {
        String p;
        if (user != null && (p = lbc.p(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(uc7.s1(i).l4.h3.f);
                if (matcher.find()) {
                    if (p.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i) {
        if (a || yac.t0 != i) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        if (context == null) {
            return;
        }
        e S = LaunchActivity.S();
        c(i, S != null ? S.getResourceProvider() : null, context);
    }

    public static void c(int i, vnb vnbVar, Context context) {
        if (a) {
            return;
        }
        byte b = 1;
        byte b2 = 0;
        nx0 h = uh9.h(1, vnbVar, context, false);
        bf7 bf7Var = new bf7(i, context, r5, b);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        j.setClipChildren(false);
        j.setClipToPadding(false);
        e29 e29Var = new e29(context);
        e29Var.f(R.raw.media_forbidden, hl.L(115.0f), hl.L(115.0f), null);
        e29Var.d();
        j.addView(e29Var, tre.t(jn7.z1, jn7.z1, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 20.0f);
        ik8.x(textView, aob.G6, vnbVar, null, 2131754691);
        textView.setGravity(17);
        j.addView(textView, tre.t(-1, -2, 17, 0, 0, 0, 23));
        k74 k74Var = new k74(1, vnbVar, context);
        k74Var.a(R.drawable.msg_block2, ob6.M0(2131754702, null), ob6.M0(2131754703, null));
        j.addView(k74Var, tre.t(-1, -2, 17, 0, 0, 0, 0));
        k74 k74Var2 = new k74(1, vnbVar, context);
        k74Var2.a(R.drawable.menu_privacy, ob6.M0(2131754700, null), ob6.M0(2131754701, null));
        j.addView(k74Var2, tre.t(-1, -2, 17, 0, 0, 0, 0));
        k74 k74Var3 = new k74(1, vnbVar, context);
        k74Var3.a(R.drawable.menu_feature_hourglass, ob6.M0(2131754698, null), hl.N2(ob6.a0(null, null, 2131754699, ob6.f0(uc7.s1(i).l4.g3.f())), -1, 0, new c1(bf7Var, (byte) 2), null));
        j.addView(k74Var3, tre.t(-1, -2, 17, 0, 0, 0, 0));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131754693, null), false, true);
        c51Var.setOnClickListener(new k1(bf7Var, b));
        j.addView(c51Var, tre.t(-1, 48, 7, 0, 13, 0, 4));
        c51 c51Var2 = new c51(vnbVar, context, false);
        c51Var2.i(ob6.M0(2131754692, null), false, true);
        c51Var2.setOnClickListener(new g5(r5, b2));
        j.addView(c51Var2, tre.t(-1, 48, 7, 0, 0, 0, 0));
        h.O = j;
        nx0[] nx0VarArr = {h};
        h.T0 = false;
        h.J();
        a = true;
        nx0VarArr[0].show();
        nx0VarArr[0].setOnDismissListener(new h5(b2));
    }
}
