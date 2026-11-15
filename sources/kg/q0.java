package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x4;
import c8.ja;
import hi.g7;
import hi.h4;
import hi.i7;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q0 extends e2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int a0 = -6;
    public static final int b0 = -7;
    public static final int c0 = -8;
    public static final int d0 = -9;
    public static final int e0 = -10;
    public static final int f0 = -11;
    public static final int g0 = -12;
    public static final int h0 = -13;
    public static final int i0 = -14;
    public static final int j0 = -15;
    public static final int k0 = -16;
    public static final int l0 = -17;
    public static final int m0 = -18;
    public static final int n0 = -19;
    public static final int o0 = -20;
    public static final int p0 = -21;
    public String E;
    public int F;
    public final k0 G;
    public TL_account.connectedBots H;
    public TL_account.TL_connectedBot I;
    public boolean J;
    public TL_account.TL_businessBotRights K;
    public boolean L;
    public boolean M;
    public TLRPC.User N;
    public final LongSparseArray O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public z4 a;
    public i7 b;
    public u41 c;
    public jg.z1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public bi.v1 n;
    public TextView r;
    public ImageView s;
    public a0 w;
    public boolean x;
    public boolean y;

    public q0() {
        super(null);
        this.F = 0;
        this.G = new k0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        e2 T;
        if (tL_error != null) {
            q0Var.a.b(false);
            cc.d0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            q0Var.a.b(false);
            k5.o(null, 2131743879, cc.a0(q0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new h4(28, q0Var, tLObject));
        }
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 == arrayList.size()) {
            f.a(q0Var.currentAccount).b();
            np messagesController = q0Var.getMessagesController();
            messagesController.s1.clear();
            messagesController.x1.clear();
            q0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                cc.a0(T).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752784, q10.p(user))).j();
                return;
            }
            e2 T2 = LaunchActivity.T();
            if (T2 != null) {
                cc.a0(T2).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752817, q10.p(user))).j();
            }
        }
    }

    public static void b0(final q0 q0Var, b41 b41Var, final View view) {
        if (b41Var.g && !q0Var.w.h(b41Var)) {
            int i7 = b41Var.d;
            final int i10 = 1;
            if (i7 == V) {
                a0 a0Var = q0Var.w;
                q0Var.J = true;
                a0Var.h = true;
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            final int i11 = 0;
            if (i7 == W) {
                a0 a0Var2 = q0Var.w;
                q0Var.J = false;
                a0Var2.h = false;
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == X) {
                q0Var.N = null;
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (b41Var.a == 13) {
                TLRPC.User user = (TLRPC.User) q0Var.O.get(b41Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    q0Var.N = user;
                    org.telegram.messenger.g0.v1(q0Var.f);
                    q0Var.c.g3.O(true);
                    q0Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getParentActivity(), q0Var.resourceProvider);
                String M0 = hd.M0(2131752809, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(hd.M0(2131752810, null));
                alertDialog$Builder.k(hd.M0(2131747831, null), null);
                q0Var.showDialog(t1Var);
                return;
            }
            if (i7 == Y) {
                boolean z10 = !q0Var.Q;
                q0Var.Q = z10;
                ((p8) view).setChecked(z10);
                q0Var.c.g3.O(true);
                return;
            }
            if (i7 == Z) {
                int i12 = -q0Var.P;
                q0Var.P = i12;
                org.telegram.messenger.g0.F3(i12, view, null);
                return;
            }
            if (i7 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((c2) view).c(z11, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((c2) view).c(z12, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((c2) view).c(z13, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((c2) view).c(z14, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == e0) {
                boolean z15 = !q0Var.R;
                q0Var.R = z15;
                ((p8) view).setChecked(z15);
                q0Var.c.g3.O(true);
                return;
            }
            if (i7 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((c2) view).c(z16, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((c2) view).c(z17, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = q0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((c2) view).c(z18, true);
                q0Var.c.g3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == i0) {
                final int i13 = 5;
                q0Var.c0(i7, !q0Var.K.edit_username, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                c2Var.c(z19, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == j0) {
                boolean z19 = !q0Var.S;
                q0Var.S = z19;
                ((p8) view).setChecked(z19);
                q0Var.c.g3.O(true);
                return;
            }
            if (i7 == k0) {
                q0Var.c0(i7, !q0Var.K.view_gifts, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == l0) {
                q0Var.c0(i7, !q0Var.K.sell_gifts, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == m0) {
                final int i14 = 2;
                q0Var.c0(i7, !q0Var.K.change_gift_settings, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == n0) {
                final int i15 = 3;
                q0Var.c0(i7, !q0Var.K.transfer_and_upgrade_gifts, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == o0) {
                final int i16 = 4;
                q0Var.c0(i7, !q0Var.K.transfer_stars, new Runnable(q0Var) { // from class: kg.j0
                    public final /* synthetic */ q0 b;

                    {
                        this.b = q0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                q0 q0Var2 = this.b;
                                q0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                q0Var2.c.g3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                q0Var3.c.g3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                q0Var4.c.g3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                q0Var5.c.g3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                q0Var6.c.g3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                q0Var7.c.g3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == p0) {
                q0Var.c0(i7, !q0Var.K.manage_stories, new k0(q0Var, i11));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        final int i10 = 1;
        final int i11 = 0;
        if (!this.L && i7 == i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752788, q10.n(this.N)));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.p0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    switch (i11) {
                        case 0:
                            this.b.L = true;
                            runnable.run();
                            break;
                        default:
                            this.b.M = true;
                            runnable.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        if (this.M || !z10 || (i7 != l0 && i7 != m0 && i7 != n0 && i7 != o0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M02 = hd.M0(2131752787, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
        t1Var2.S = M02;
        t1Var2.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752801, q10.n(this.N)));
        alertDialog$Builder2.h(hd.M0(2131752589, null), null);
        alertDialog$Builder2.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.p0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
                switch (i10) {
                    case 0:
                        this.b.L = true;
                        runnable.run();
                        break;
                    default:
                        this.b.M = true;
                        runnable.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.p();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 6));
        this.a = this.simpleActionBar.q(hd.M0(2131745946, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        q6.D(this.f, j6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i10 = j6.G6;
        q6.U(editTextBoldCursor2, i10, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        int i11 = 5;
        int i12 = 3;
        this.f.setGravity((hd.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(hd.M0(2131752816, null));
        q6.v(this.f, i10, null);
        this.f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new di.m(this, i7));
        int i13 = 10;
        this.f.addTextChangedListener(new ah.j(this, i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, ja.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = j6.d6;
        q6.h(i14, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        q6.h(j6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.p;
        boolean z10 = hd.a0;
        frameLayout4.addView(view2, ja.d(-1, f10, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        bi.v1 v1Var = new bi.v1(context, i11);
        this.n = v1Var;
        q6.h(i14, v1Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(hd.M0(2131752811, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i15 = j6.z6;
        q6.U(textView2, i15, getResourceProvider());
        this.n.addView(this.r, ja.e(-2, -2, 17));
        this.s = new ImageView(context);
        i7 i7Var = new i7(getThemedColor(i15));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(i7Var);
        this.b = i7Var;
        this.n.addView(this.s, ja.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.a = new gc.b(this, 12);
        a0 a0Var = new a0(this, new k0(this, i12));
        this.w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        a0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        u41 u41Var = new u41(this, new q4(this, i13), new n0(this, i12), null);
        this.c = u41Var;
        u41Var.r1();
        this.c.setSectionsDrawBackground(true);
        u41 u41Var2 = this.c;
        u41Var2.g3.r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(e0(), z10);
    }

    public final boolean e0() {
        a0 a0Var;
        if (this.U) {
            TLRPC.User user = this.N;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.I;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.K.equals(tL_connectedBot.rights) && ((a0Var = this.w) == null || !a0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.y.f) {
            return;
        }
        if (!e0()) {
            finishFragment();
            return;
        }
        if (this.w.k(this.c)) {
            TLRPC.User user2 = this.N;
            boolean z10 = user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.I;
            if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().o1(this.I.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.N != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.K;
                updateconnectedbot2.bot = getMessagesController().q1(this.N);
                updateconnectedbot2.recipients = this.w.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.N.id;
                    tL_connectedBot3.recipients = this.w.c();
                    this.I.rights = this.K;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new l0(this, iArr, arrayList, z10, user2));
            }
        }
    }

    public final void g0() {
        boolean z10 = this.x;
        boolean e10 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.O;
        if (z10 != (e10 || this.y || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.y && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.x = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -org.telegram.messenger.g0.L(8.0f) : 0.0f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).setDuration(320L).setInterpolator(erVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        int i7 = 0;
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752786, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new n0(this, i7));
                alertDialog$Builder.h(hd.M0(2131747580, null), new n0(this, 1));
                showDialog(t1Var);
                return false;
            }
        } else {
            if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = hd.M0(2131752812, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = M02;
                t1Var2.U = hd.M0(2131752813, null);
                alertDialog$Builder2.k(hd.M0(2131752814, null), new n0(this, 2));
                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                showDialog(t1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new g7(this, 8));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            i7 i7Var = this.b;
            if (i7Var != null) {
                i7Var.b(getThemedColor(j6.z6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
