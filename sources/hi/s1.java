package hi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public abstract class s1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, final int i7, final long j3, final long j10, TL_bots.BotVerifierSettings botVerifierSettings, final o1 o1Var) {
        String str;
        TLRPC.Chat chat;
        if (j10 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j10));
            str = t10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j10));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(28.0f);
        int i10 = l6.Qi;
        ShapeDrawable e02 = l6.e0(L, L2, l6.x0(null, i10, false));
        o6 M = s6.M(i10);
        frameLayout2.setBackground(e02);
        s6.j(frameLayout2, e02, M, null, null);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        w8 w8Var = new w8((g6) null);
        w8Var.l(chat);
        l9Var.e(chat, w8Var);
        frameLayout2.addView(l9Var, ha.e(28, 28, 51));
        l9 l9Var2 = new l9(activity);
        l9Var2.setEmojiColorFilter(new PorterDuffColorFilter(l6.x0(null, l6.z9, false), PorterDuff.Mode.SRC_IN));
        l9Var2.setAnimatedEmojiDrawable(i5.m(i7, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(l9Var2, ha.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        l5 l5Var = new l5(activity);
        s6.X(l5Var, l6.j5, null);
        l5Var.setTextSize(13);
        l5Var.setEllipsizeByGradient(true);
        l5Var.l(str, false);
        l5Var.setWidthWrapContent(true);
        frameLayout2.addView(l5Var, ha.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, ha.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M02 = id.M0(2131752997, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M02;
        u1Var.T = id.M0(j10 >= 0 ? 2131752998 : 2131752999, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.k(id.M0(2131746321, null), new org.telegram.ui.ActionBar.r1() { // from class: hi.q1
            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i12 = i7;
                setcustomverification.bot = qp.s1(i12).o1(j3);
                setcustomverification.peer = qp.s1(i12).j1(j10);
                ConnectionsManager.getInstance(i12).sendRequest(setcustomverification, new bi.j(15, zArr2, o1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
