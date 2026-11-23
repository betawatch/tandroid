package ki;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class o1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, int i7, long j3, long j10, TL_bots.BotVerifierSettings botVerifierSettings, bi.x3 x3Var) {
        String str;
        TLRPC.Chat chat;
        if (j10 >= 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j10));
            str = n10.l(c22);
            chat = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j10));
            if (O0 == null) {
                str = "";
                chat = O0;
            } else {
                str = O0.title;
                chat = O0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i10 = n6.Ti;
        ShapeDrawable e02 = n6.e0(L, L2, n6.x0(null, i10, false));
        q6 M = u6.M(i10);
        frameLayout2.setBackground(e02);
        u6.j(frameLayout2, e02, M, null, null);
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        a9 a9Var = new a9((i6) null);
        a9Var.l(chat);
        p9Var.f(chat, a9Var);
        frameLayout2.addView(p9Var, na.e(28, 28, 51));
        p9 p9Var2 = new p9(activity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(n6.x0(null, n6.z9, false), PorterDuff.Mode.SRC_IN));
        p9Var2.setAnimatedEmojiDrawable(o5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(p9Var2, na.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(activity);
        u6.X(n5Var, n6.j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str, false);
        n5Var.setWidthWrapContent(true);
        frameLayout2.addView(n5Var, na.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, na.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String N0 = gd.N0(2131752985, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = gd.N0(j10 >= 0 ? 2131752986 : 2131752987, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.k(gd.N0(2131746125, null), new ii.h(zArr, i7, j3, j10, x3Var));
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
