package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.a4;
import fi.j7;
import java.util.ArrayList;
import jg.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q0 extends f2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int a0 = -7;
    public static final int b0 = -8;
    public static final int c0 = -9;
    public static final int d0 = -10;
    public static final int e0 = -11;
    public static final int f0 = -12;
    public static final int g0 = -13;
    public static final int h0 = -14;
    public static final int i0 = -15;
    public static final int j0 = -16;
    public static final int k0 = -17;
    public static final int l0 = -18;
    public static final int m0 = -19;
    public static final int n0 = -20;
    public static final int o0 = -21;
    public String D;
    public int E;
    public final k0 F;
    public TL_account.connectedBots G;
    public TL_account.TL_connectedBot H;
    public boolean I;
    public TL_account.TL_businessBotRights J;
    public boolean K;
    public boolean L;
    public TLRPC.User M;
    public final LongSparseArray N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public b5 a;
    public j7 b;
    public q41 c;
    public z1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public a4 n;
    public TextView r;
    public ImageView s;
    public a0 w;
    public boolean x;
    public boolean y;

    public q0() {
        super(null);
        this.E = 0;
        this.F = new k0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void Z(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        f2 T;
        if (tL_error != null) {
            q0Var.a.b(false);
            hc.d0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            q0Var.a.b(false);
            k5.p(null, 2131743880, hc.a0(q0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new ha.b(18, q0Var, tLObject));
        }
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 == arrayList.size()) {
            f.a(q0Var.currentAccount).b();
            qp messagesController = q0Var.getMessagesController();
            messagesController.r1.clear();
            messagesController.w1.clear();
            q0Var.finishFragment();
            if (!z9 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                hc.a0(T).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752784, t10.p(user))).j();
                return;
            }
            f2 T2 = LaunchActivity.T();
            if (T2 != null) {
                hc.a0(T2).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752817, t10.p(user))).j();
            }
        }
    }

    public static void b0(final q0 q0Var, x31 x31Var, final View view) {
        if (x31Var.g && !q0Var.w.h(x31Var)) {
            int i7 = x31Var.d;
            final int i10 = 1;
            if (i7 == U) {
                a0 a0Var = q0Var.w;
                q0Var.I = true;
                a0Var.h = true;
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            final int i11 = 0;
            if (i7 == V) {
                a0 a0Var2 = q0Var.w;
                q0Var.I = false;
                a0Var2.h = false;
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == W) {
                q0Var.M = null;
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (x31Var.a == 13) {
                TLRPC.User user = (TLRPC.User) q0Var.N.get(x31Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    q0Var.M = user;
                    org.telegram.messenger.g0.v1(q0Var.f);
                    q0Var.c.f3.O(true);
                    q0Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getParentActivity(), q0Var.resourceProvider);
                String M0 = hd.M0(2131752809, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(hd.M0(2131752810, null));
                alertDialog$Builder.k(hd.M0(2131747830, null), null);
                q0Var.showDialog(u1Var);
                return;
            }
            if (i7 == X) {
                boolean z9 = !q0Var.P;
                q0Var.P = z9;
                ((q8) view).setChecked(z9);
                q0Var.c.f3.O(true);
                return;
            }
            if (i7 == Y) {
                int i12 = -q0Var.O;
                q0Var.O = i12;
                org.telegram.messenger.g0.G3(i12, view, null);
                return;
            }
            if (i7 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var.J;
                boolean z10 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z10;
                ((c2) view).c(z10, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.J;
                boolean z11 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z11;
                ((c2) view).c(z11, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.J;
                boolean z12 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z12;
                ((c2) view).c(z12, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.J;
                boolean z13 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z13;
                ((c2) view).c(z13, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == d0) {
                boolean z14 = !q0Var.Q;
                q0Var.Q = z14;
                ((q8) view).setChecked(z14);
                q0Var.c.f3.O(true);
                return;
            }
            if (i7 == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.J;
                boolean z15 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z15;
                ((c2) view).c(z15, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.J;
                boolean z16 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z16;
                ((c2) view).c(z16, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = q0Var.J;
                boolean z17 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z17;
                ((c2) view).c(z17, true);
                q0Var.c.f3.O(true);
                q0Var.d0(true);
                return;
            }
            if (i7 == h0) {
                final int i13 = 5;
                q0Var.c0(i7, !q0Var.J.edit_username, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z18 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z18;
                                c2Var.c(z18, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == i0) {
                boolean z18 = !q0Var.R;
                q0Var.R = z18;
                ((q8) view).setChecked(z18);
                q0Var.c.f3.O(true);
                return;
            }
            if (i7 == j0) {
                q0Var.c0(i7, !q0Var.J.view_gifts, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                c2Var.c(z182, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == k0) {
                q0Var.c0(i7, !q0Var.J.sell_gifts, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                c2Var.c(z182, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == l0) {
                final int i14 = 2;
                q0Var.c0(i7, !q0Var.J.change_gift_settings, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                c2Var.c(z182, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == m0) {
                final int i15 = 3;
                q0Var.c0(i7, !q0Var.J.transfer_and_upgrade_gifts, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                c2Var.c(z182, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == n0) {
                final int i16 = 4;
                q0Var.c0(i7, !q0Var.J.transfer_stars, new Runnable(q0Var) { // from class: kg.j0
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
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                c2Var.c(z182, true);
                                q0Var2.c.f3.O(true);
                                q0Var2.d0(true);
                                break;
                            case 1:
                                q0 q0Var3 = this.b;
                                q0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                c2Var2.c(z19, true);
                                q0Var3.c.f3.O(true);
                                q0Var3.d0(true);
                                break;
                            case 2:
                                q0 q0Var4 = this.b;
                                q0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                c2Var3.c(z20, true);
                                q0Var4.c.f3.O(true);
                                q0Var4.d0(true);
                                break;
                            case 3:
                                q0 q0Var5 = this.b;
                                q0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                c2Var4.c(z21, true);
                                q0Var5.c.f3.O(true);
                                q0Var5.d0(true);
                                break;
                            case 4:
                                q0 q0Var6 = this.b;
                                q0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                c2Var5.c(z22, true);
                                q0Var6.c.f3.O(true);
                                q0Var6.d0(true);
                                break;
                            default:
                                q0 q0Var7 = this.b;
                                q0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                c2Var6.c(z23, true);
                                q0Var7.c.f3.O(true);
                                q0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == o0) {
                q0Var.c0(i7, !q0Var.J.manage_stories, new k0(q0Var, i11));
            }
        }
    }

    public final void c0(int i7, boolean z9, final Runnable runnable) {
        final int i10 = 1;
        final int i11 = 0;
        if (!this.K && i7 == h0 && z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752788, t10.n(this.M)));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.r1(this) { // from class: kg.p0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                    switch (i11) {
                        case 0:
                            this.b.K = true;
                            runnable.run();
                            break;
                        default:
                            this.b.L = true;
                            runnable.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        if (this.L || !z9 || (i7 != k0 && i7 != l0 && i7 != m0 && i7 != n0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M02 = hd.M0(2131752787, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.R = M02;
        u1Var2.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752801, t10.n(this.M)));
        alertDialog$Builder2.h(hd.M0(2131752589, null), null);
        alertDialog$Builder2.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.r1(this) { // from class: kg.p0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i12) {
                switch (i10) {
                    case 0:
                        this.b.K = true;
                        runnable.run();
                        break;
                    default:
                        this.b.L = true;
                        runnable.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.p();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 13));
        this.a = this.simpleActionBar.n(hd.M0(2131745947, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        r6.E(this.f, k6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i10 = k6.G6;
        r6.V(editTextBoldCursor2, i10, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        int i11 = 3;
        this.f.setGravity((hd.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(hd.M0(2131752816, null));
        r6.w(this.f, i10, null);
        this.f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new bi.p(this, i7));
        this.f.addTextChangedListener(new ah.j(this, 9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, ha.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = k6.d6;
        r6.i(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        r6.i(k6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.p;
        boolean z9 = hd.a0;
        frameLayout4.addView(view2, ha.d(-1, f10, 87, z9 ? 0 : 21, 0.0f, z9 ? 21 : 0, 0.0f));
        a4 a4Var = new a4(context, i11);
        this.n = a4Var;
        r6.i(i12, a4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(hd.M0(2131752811, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = k6.z6;
        r6.V(textView2, i13, getResourceProvider());
        this.n.addView(this.r, ha.e(-2, -2, 17));
        this.s = new ImageView(context);
        j7 j7Var = new j7(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(j7Var);
        this.b = j7Var;
        this.n.addView(this.s, ha.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        z1 z1Var = new z1(true);
        this.d = z1Var;
        int i14 = 8;
        z1Var.a = new gf.g(this, i14);
        a0 a0Var = new a0(this, new k0(this, i11));
        this.w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        a0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        q41 q41Var = new q41(this, new hi.u1(this, i14), new n0(this, i11), null);
        this.c = q41Var;
        q41Var.r1();
        this.c.setSectionsDrawBackground(true);
        q41 q41Var2 = this.c;
        q41Var2.f3.r = false;
        frameLayout.addView(q41Var2, ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z9) {
        if (this.a == null) {
            return;
        }
        this.a.a(e0(), z9);
    }

    public final boolean e0() {
        a0 a0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            boolean z9 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.H;
            if (z9 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.J.equals(tL_connectedBot.rights) && ((a0Var = this.w) == null || !a0Var.g())))) {
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
            TLRPC.User user2 = this.M;
            boolean z9 = user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.H;
            if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().o1(this.H.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.M != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.J;
                updateconnectedbot2.bot = getMessagesController().q1(this.M);
                updateconnectedbot2.recipients = this.w.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.H;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.M.id;
                    tL_connectedBot3.recipients = this.w.c();
                    this.H.rights = this.J;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new l0(this, iArr, arrayList, z9, user2));
            }
        }
    }

    public final void g0() {
        boolean z9 = this.x;
        boolean e10 = this.d.e();
        boolean z10 = true;
        LongSparseArray longSparseArray = this.N;
        if (z9 != (e10 || this.y || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.y && longSparseArray.size() <= 0) {
                z10 = false;
            }
            this.x = z10;
            ViewPropertyAnimator duration = this.r.animate().alpha(z10 ? 0.0f : 1.0f).translationY(z10 ? -org.telegram.messenger.g0.L(8.0f) : 0.0f).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            this.s.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        int i7 = 0;
        if (e0()) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743836, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131752786, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new n0(this, i7));
                alertDialog$Builder.h(hd.M0(2131747579, null), new n0(this, 1));
                showDialog(u1Var);
                return false;
            }
        } else {
            if (this.M != null || e0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z9);
            }
            if (z9) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = hd.M0(2131752812, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                u1Var2.T = hd.M0(2131752813, null);
                alertDialog$Builder2.k(hd.M0(2131752814, null), new n0(this, 2));
                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                showDialog(u1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ii.c(this, 5));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            j7 j7Var = this.b;
            if (j7Var != null) {
                j7Var.b(getThemedColor(k6.z6));
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
