package ag;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 extends org.telegram.ui.ActionBar.k2 {
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
    public final l1 F;
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
    public l5 a;
    public s1 b;
    public u51 c;
    public zf.m1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public a5 n;
    public TextView r;
    public ImageView s;
    public x0 w;
    public boolean x;
    public boolean y;

    public t1() {
        super(null);
        this.E = 0;
        this.F = new l1(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void Y(t1 t1Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        org.telegram.ui.ActionBar.k2 T;
        if (tL_error != null) {
            t1Var.a.b(false);
            cc.d0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            t1Var.a.b(false);
            m5.o(null, 2131743904, cc.a0(t1Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new a1.f(9, t1Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            k.a(t1Var.currentAccount).b();
            vp messagesController = t1Var.getMessagesController();
            messagesController.r1.clear();
            messagesController.w1.clear();
            t1Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                cc.a0(T).Q(R.raw.contact_check, 36, cd.a0(null, null, 2131752784, h20.p(user))).j();
                return;
            }
            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
            if (T2 != null) {
                cc.a0(T2).Q(R.raw.contact_check, 36, cd.a0(null, null, 2131752817, h20.p(user))).j();
            }
        }
    }

    public static void a0(final t1 t1Var, a51 a51Var, final View view) {
        if (a51Var.g && !t1Var.w.h(a51Var)) {
            int i10 = a51Var.d;
            final int i11 = 1;
            if (i10 == U) {
                x0 x0Var = t1Var.w;
                t1Var.I = true;
                x0Var.h = true;
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            final int i12 = 0;
            if (i10 == V) {
                x0 x0Var2 = t1Var.w;
                t1Var.I = false;
                x0Var2.h = false;
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == W) {
                t1Var.M = null;
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (a51Var.a == 13) {
                TLRPC.User user = (TLRPC.User) t1Var.N.get(a51Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    t1Var.M = user;
                    org.telegram.messenger.i0.v1(t1Var.f);
                    t1Var.c.f3.O(true);
                    t1Var.c0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t1Var.getParentActivity(), t1Var.resourceProvider);
                String L0 = cd.L0(2131752809, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(cd.L0(2131752810, null));
                alertDialog$Builder.k(cd.L0(2131747847, null), null);
                t1Var.showDialog(x1Var);
                return;
            }
            if (i10 == X) {
                boolean z10 = !t1Var.P;
                t1Var.P = z10;
                ((s8) view).setChecked(z10);
                t1Var.c.f3.O(true);
                return;
            }
            if (i10 == Y) {
                int i13 = -t1Var.O;
                t1Var.O = i13;
                org.telegram.messenger.i0.F3(i13, view, null);
                return;
            }
            if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = t1Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.c2) view).c(z11, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.c2) view).c(z13, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t1Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.c2) view).c(z14, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == d0) {
                boolean z15 = !t1Var.Q;
                t1Var.Q = z15;
                ((s8) view).setChecked(z15);
                t1Var.c.f3.O(true);
                return;
            }
            if (i10 == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t1Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.c2) view).c(z16, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t1Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.c2) view).c(z17, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t1Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.c2) view).c(z18, true);
                t1Var.c.f3.O(true);
                t1Var.c0(true);
                return;
            }
            if (i10 == h0) {
                final int i14 = 5;
                t1Var.b0(i10, !t1Var.J.edit_username, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                c2Var.c(z19, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                boolean z19 = !t1Var.R;
                t1Var.R = z19;
                ((s8) view).setChecked(z19);
                t1Var.c.f3.O(true);
                return;
            }
            if (i10 == j0) {
                t1Var.b0(i10, !t1Var.J.view_gifts, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == k0) {
                t1Var.b0(i10, !t1Var.J.sell_gifts, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == l0) {
                final int i15 = 2;
                t1Var.b0(i10, !t1Var.J.change_gift_settings, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == m0) {
                final int i16 = 3;
                t1Var.b0(i10, !t1Var.J.transfer_and_upgrade_gifts, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
            } else if (i10 == n0) {
                final int i17 = 4;
                t1Var.b0(i10, !t1Var.J.transfer_stars, new Runnable(t1Var) { // from class: ag.k1
                    public final /* synthetic */ t1 b;

                    {
                        this.b = t1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                t1 t1Var2 = this.b;
                                t1Var2.getClass();
                                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                t1Var2.c.f3.O(true);
                                t1Var2.c0(true);
                                break;
                            case 1:
                                t1 t1Var3 = this.b;
                                t1Var3.getClass();
                                org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                t1Var3.c.f3.O(true);
                                t1Var3.c0(true);
                                break;
                            case 2:
                                t1 t1Var4 = this.b;
                                t1Var4.getClass();
                                org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                t1Var4.c.f3.O(true);
                                t1Var4.c0(true);
                                break;
                            case 3:
                                t1 t1Var5 = this.b;
                                t1Var5.getClass();
                                org.telegram.ui.Cells.c2 c2Var4 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                t1Var5.c.f3.O(true);
                                t1Var5.c0(true);
                                break;
                            case 4:
                                t1 t1Var6 = this.b;
                                t1Var6.getClass();
                                org.telegram.ui.Cells.c2 c2Var5 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                t1Var6.c.f3.O(true);
                                t1Var6.c0(true);
                                break;
                            default:
                                t1 t1Var7 = this.b;
                                t1Var7.getClass();
                                org.telegram.ui.Cells.c2 c2Var6 = (org.telegram.ui.Cells.c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                t1Var7.c.f3.O(true);
                                t1Var7.c0(true);
                                break;
                        }
                    }
                });
            } else if (i10 == o0) {
                t1Var.b0(i10, !t1Var.J.manage_stories, new l1(t1Var, i12));
            }
        }
    }

    public final void b0(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.K && i10 == h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = cd.L0(2131752787, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752788, h20.n(this.M)));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            alertDialog$Builder.k(cd.L0(2131754284, null), new org.telegram.ui.ActionBar.u1(this) { // from class: ag.q1
                public final /* synthetic */ t1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                    switch (i12) {
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
        if (this.L || !z10 || (i10 != k0 && i10 != l0 && i10 != m0 && i10 != n0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L02 = cd.L0(2131752787, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L02;
        x1Var2.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752801, h20.n(this.M)));
        alertDialog$Builder2.h(cd.L0(2131752589, null), null);
        alertDialog$Builder2.k(cd.L0(2131754284, null), new org.telegram.ui.ActionBar.u1(this) { // from class: ag.q1
            public final /* synthetic */ t1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i13) {
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
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.p();
    }

    public final void c0(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(d0(), z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(cd.L0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.a = this.simpleActionBar.n(cd.L0(2131745963, null));
        int i11 = 0;
        c0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        a7.E(this.f, t6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i12 = t6.G6;
        a7.V(editTextBoldCursor2, i12, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        int i13 = 3;
        this.f.setGravity((cd.X ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(cd.L0(2131752816, null));
        a7.w(this.f, i12, null);
        this.f.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new r1(this, i11));
        this.f.addTextChangedListener(new a1(this, i10));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = t6.d6;
        a7.i(i14, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        a7.i(t6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / org.telegram.messenger.i0.p;
        boolean z10 = cd.X;
        frameLayout4.addView(view2, b6.d(-1, f7, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        a5 a5Var = new a5(context, 1);
        this.n = a5Var;
        a7.i(i14, a5Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(cd.L0(2131752811, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i15 = t6.z6;
        a7.V(textView2, i15, getResourceProvider());
        this.n.addView(this.r, b6.e(-2, -2, 17));
        this.s = new ImageView(context);
        s1 s1Var = new s1(getThemedColor(i15));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(s1Var);
        this.b = s1Var;
        this.n.addView(this.s, b6.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.i0.L(8.0f));
        zf.m1 m1Var = new zf.m1(true);
        this.d = m1Var;
        m1Var.a = new a6.i(this, i13);
        x0 x0Var = new x0(this, new l1(this, i13));
        this.w = x0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        x0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        u51 u51Var = new u51(this, new a(this, i13), new o1(this, i13), null);
        this.c = u51Var;
        u51Var.r1();
        this.c.setSectionsDrawBackground(true);
        u51 u51Var2 = this.c;
        u51Var2.f3.r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean d0() {
        x0 x0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.H;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.J.equals(tL_connectedBot.rights) && ((x0Var = this.w) == null || !x0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void e0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.y.f) {
            return;
        }
        if (!d0()) {
            finishFragment();
            return;
        }
        if (this.w.k(this.c)) {
            TLRPC.User user2 = this.M;
            boolean z10 = user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.H;
            if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().n1(this.H.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.M != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.J;
                updateconnectedbot2.bot = getMessagesController().p1(this.M);
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new m1(this, iArr, arrayList, z10, user2));
            }
        }
    }

    public final void f0() {
        boolean z10 = this.x;
        boolean e = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.N;
        if (z10 != (e || this.y || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.y && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.x = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -org.telegram.messenger.i0.L(8.0f) : 0.0f).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.i0.L(8.0f)).setDuration(320L).setInterpolator(grVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        int i10 = 0;
        if (d0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = cd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131752786, null);
                alertDialog$Builder.k(cd.L0(2131754216, null), new o1(this, i10));
                alertDialog$Builder.h(cd.L0(2131747596, null), new o1(this, 1));
                showDialog(x1Var);
                return false;
            }
        } else {
            if (this.M != null || d0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String L02 = cd.L0(2131752812, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = L02;
                x1Var2.T = cd.L0(2131752813, null);
                alertDialog$Builder2.k(cd.L0(2131752814, null), new o1(this, 2));
                alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                showDialog(x1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            k.a(this.currentAccount).c(new l(this, 2));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            s1 s1Var = this.b;
            if (s1Var != null) {
                s1Var.b(getThemedColor(t6.z6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
