package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.p2;
import c8.ma;
import hi.e7;
import hi.i7;
import hi.t6;
import hi.w4;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t0 extends h2 {
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
    public final n0 G;
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
    public d5 a;
    public i7 b;
    public e51 c;
    public jg.z1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public p2 n;
    public TextView r;
    public ImageView s;
    public a0 w;
    public boolean x;
    public boolean y;

    public t0() {
        super(null);
        this.F = 0;
        this.G = new n0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        h2 T;
        if (tL_error != null) {
            t0Var.a.b(false);
            lc.e0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.a.b(false);
            f3.o(null, 2131743642, lc.b0(t0Var), null);
            return;
        }
        int i7 = 1;
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new h0(i7, t0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            f.a(t0Var.currentAccount).b();
            mp messagesController = t0Var.getMessagesController();
            messagesController.s1.clear();
            messagesController.z1.clear();
            t0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                lc.b0(T).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752773, o10.q(user))).j();
                return;
            }
            h2 T2 = LaunchActivity.T();
            if (T2 != null) {
                lc.b0(T2).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752806, o10.q(user))).j();
            }
        }
    }

    public static void b0(final t0 t0Var, l41 l41Var, final View view) {
        if (l41Var.g && !t0Var.w.h(l41Var)) {
            int i7 = l41Var.d;
            final int i10 = 1;
            if (i7 == V) {
                a0 a0Var = t0Var.w;
                t0Var.J = true;
                a0Var.h = true;
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            final int i11 = 0;
            if (i7 == W) {
                a0 a0Var2 = t0Var.w;
                t0Var.J = false;
                a0Var2.h = false;
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == X) {
                t0Var.N = null;
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (l41Var.a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.O.get(l41Var.y);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    t0Var.N = user;
                    org.telegram.messenger.g0.v1(t0Var.f);
                    t0Var.c.g3.O(true);
                    t0Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t0Var.getParentActivity(), t0Var.resourceProvider);
                String M0 = gd.M0(2131752798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.g0.W2(gd.M0(2131752799, null));
                alertDialog$Builder.k(gd.M0(2131747638, null), null);
                t0Var.showDialog(u1Var);
                return;
            }
            if (i7 == Y) {
                boolean z10 = !t0Var.Q;
                t0Var.Q = z10;
                ((r8) view).setChecked(z10);
                t0Var.c.g3.O(true);
                return;
            }
            if (i7 == Z) {
                int i12 = -t0Var.P;
                t0Var.P = i12;
                org.telegram.messenger.g0.E3(i12, view, null);
                return;
            }
            if (i7 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((d2) view).c(z11, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((d2) view).c(z12, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((d2) view).c(z13, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((d2) view).c(z14, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == e0) {
                boolean z15 = !t0Var.R;
                t0Var.R = z15;
                ((r8) view).setChecked(z15);
                t0Var.c.g3.O(true);
                return;
            }
            if (i7 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((d2) view).c(z16, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((d2) view).c(z17, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((d2) view).c(z18, true);
                t0Var.c.g3.O(true);
                t0Var.d0(true);
                return;
            }
            if (i7 == i0) {
                final int i13 = 5;
                t0Var.c0(i7, !t0Var.K.edit_username, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                d2Var.c(z19, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == j0) {
                boolean z19 = !t0Var.S;
                t0Var.S = z19;
                ((r8) view).setChecked(z19);
                t0Var.c.g3.O(true);
                return;
            }
            if (i7 == k0) {
                t0Var.c0(i7, !t0Var.K.view_gifts, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == l0) {
                t0Var.c0(i7, !t0Var.K.sell_gifts, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == m0) {
                final int i14 = 2;
                t0Var.c0(i7, !t0Var.K.change_gift_settings, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == n0) {
                final int i15 = 3;
                t0Var.c0(i7, !t0Var.K.transfer_and_upgrade_gifts, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == o0) {
                final int i16 = 4;
                t0Var.c0(i7, !t0Var.K.transfer_stars, new Runnable(t0Var) { // from class: kg.m0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.d0(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.d0(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.d0(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.d0(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.d0(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == p0) {
                t0Var.c0(i7, !t0Var.K.manage_stories, new n0(t0Var, i11));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        final int i10 = 1;
        final int i11 = 0;
        if (!this.L && i7 == i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = gd.M0(2131752776, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752777, o10.o(this.N)));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131754282, null), new org.telegram.ui.ActionBar.r1(this) { // from class: kg.s0
                public final /* synthetic */ t0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
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
        String M02 = gd.M0(2131752776, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.S = M02;
        u1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752790, o10.o(this.N)));
        alertDialog$Builder2.h(gd.M0(2131752578, null), null);
        alertDialog$Builder2.k(gd.M0(2131754282, null), new org.telegram.ui.ActionBar.r1(this) { // from class: kg.s0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
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

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.M0(2131752772, null));
        int i10 = 8;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, i10));
        this.a = this.simpleActionBar.s(gd.M0(2131745751, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        u6.D(this.f, n6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i11 = n6.G6;
        u6.U(editTextBoldCursor2, i11, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        int i12 = 5;
        int i13 = 3;
        this.f.setGravity((gd.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(gd.M0(2131752805, null));
        u6.v(this.f, i11, null);
        this.f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new di.n(this, i7));
        this.f.addTextChangedListener(new ah.j(this, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = n6.d6;
        u6.h(i14, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        u6.h(n6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.p;
        boolean z10 = gd.a0;
        frameLayout4.addView(view2, ma.d(-1, f10, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        p2 p2Var = new p2(context, i12);
        this.n = p2Var;
        u6.h(i14, p2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(gd.M0(2131752800, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i15 = n6.z6;
        u6.U(textView2, i15, getResourceProvider());
        this.n.addView(this.r, ma.e(-2, -2, 17));
        this.s = new ImageView(context);
        i7 i7Var = new i7(getThemedColor(i15));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(i7Var);
        this.b = i7Var;
        this.n.addView(this.s, ma.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.a = new w4(this, i10);
        a0 a0Var = new a0(this, new n0(this, i13));
        this.w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        a0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        e51 e51Var = new e51(this, new e7(this, 10), new q0(this, i13), null);
        this.c = e51Var;
        e51Var.r1();
        this.c.setSectionsDrawBackground(true);
        e51 e51Var2 = this.c;
        e51Var2.g3.r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
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
                updateconnectedbot.bot = getMessagesController().q1(this.I.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.N != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.K;
                updateconnectedbot2.bot = getMessagesController().s1(this.N);
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
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new o0(this, iArr, arrayList, z10, user2));
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
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).setDuration(320L).setInterpolator(lrVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        int i7 = 0;
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752775, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new q0(this, i7));
                alertDialog$Builder.h(gd.M0(2131747387, null), new q0(this, 1));
                showDialog(u1Var);
                return false;
            }
        } else {
            if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = gd.M0(2131752801, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.S = M02;
                u1Var2.U = gd.M0(2131752802, null);
                alertDialog$Builder2.k(gd.M0(2131752803, null), new q0(this, 2));
                alertDialog$Builder2.h(gd.M0(2131752578, null), null);
                showDialog(u1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new t6(this, 9));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            i7 i7Var = this.b;
            if (i7Var != null) {
                i7Var.b(getThemedColor(n6.z6));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
