package lg;

import ai.g5;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import gi.j7;
import gi.j8;
import gi.q4;
import gi.w5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends d2 {
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
    public final l0 G;
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
    public b5 a;
    public j7 b;
    public l41 c;
    public kg.v1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public ai.d2 n;
    public TextView r;
    public ImageView s;
    public b0 w;
    public boolean x;
    public boolean y;

    public r0() {
        super(null);
        this.F = 0;
        this.G = new l0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        d2 T;
        if (tL_error != null) {
            r0Var.a.b(false);
            fc.d0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            r0Var.a.b(false);
            k5.p(null, 2131743889, fc.a0(r0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new ii.e(24, r0Var, tLObject));
        }
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 == arrayList.size()) {
            f.a(r0Var.currentAccount).b();
            hp messagesController = r0Var.getMessagesController();
            messagesController.s1.clear();
            messagesController.x1.clear();
            r0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                fc.a0(T).Q(R.raw.contact_check, 36, bd.a0(null, null, 2131752784, l10.p(user))).j();
                return;
            }
            d2 T2 = LaunchActivity.T();
            if (T2 != null) {
                fc.a0(T2).Q(R.raw.contact_check, 36, bd.a0(null, null, 2131752817, l10.p(user))).j();
            }
        }
    }

    public static void b0(final r0 r0Var, r31 r31Var, final View view) {
        if (r31Var.g && !r0Var.w.h(r31Var)) {
            int i3 = r31Var.d;
            final int i10 = 1;
            if (i3 == V) {
                b0 b0Var = r0Var.w;
                r0Var.J = true;
                b0Var.h = true;
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            final int i11 = 0;
            if (i3 == W) {
                b0 b0Var2 = r0Var.w;
                r0Var.J = false;
                b0Var2.h = false;
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == X) {
                r0Var.N = null;
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (r31Var.a == 13) {
                TLRPC.User user = (TLRPC.User) r0Var.O.get(r31Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    r0Var.N = user;
                    org.telegram.messenger.g0.v1(r0Var.f);
                    r0Var.c.g3.O(true);
                    r0Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r0Var.getParentActivity(), r0Var.resourceProvider);
                String M0 = bd.M0(2131752809, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(bd.M0(2131752810, null));
                alertDialog$Builder.k(bd.M0(2131747839, null), null);
                r0Var.showDialog(s1Var);
                return;
            }
            if (i3 == Y) {
                boolean z10 = !r0Var.Q;
                r0Var.Q = z10;
                ((p8) view).setChecked(z10);
                r0Var.c.g3.O(true);
                return;
            }
            if (i3 == Z) {
                int i12 = -r0Var.P;
                r0Var.P = i12;
                org.telegram.messenger.g0.G3(i12, view, null);
                return;
            }
            if (i3 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((c2) view).c(z11, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((c2) view).c(z12, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((c2) view).c(z13, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = r0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((c2) view).c(z14, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == e0) {
                boolean z15 = !r0Var.R;
                r0Var.R = z15;
                ((p8) view).setChecked(z15);
                r0Var.c.g3.O(true);
                return;
            }
            if (i3 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = r0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((c2) view).c(z16, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = r0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((c2) view).c(z17, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = r0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((c2) view).c(z18, true);
                r0Var.c.g3.O(true);
                r0Var.d0(true);
                return;
            }
            if (i3 == i0) {
                final int i13 = 5;
                r0Var.c0(i3, !r0Var.K.edit_username, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                c2Var.c(z19, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == j0) {
                boolean z19 = !r0Var.S;
                r0Var.S = z19;
                ((p8) view).setChecked(z19);
                r0Var.c.g3.O(true);
                return;
            }
            if (i3 == k0) {
                r0Var.c0(i3, !r0Var.K.view_gifts, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == l0) {
                r0Var.c0(i3, !r0Var.K.sell_gifts, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == m0) {
                final int i14 = 2;
                r0Var.c0(i3, !r0Var.K.change_gift_settings, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == n0) {
                final int i15 = 3;
                r0Var.c0(i3, !r0Var.K.transfer_and_upgrade_gifts, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i3 == o0) {
                final int i16 = 4;
                r0Var.c0(i3, !r0Var.K.transfer_stars, new Runnable(r0Var) { // from class: lg.k0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = r0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                r0 r0Var2 = this.b;
                                r0Var2.getClass();
                                c2 c2Var = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                c2Var.c(z192, true);
                                r0Var2.c.g3.O(true);
                                r0Var2.d0(true);
                                break;
                            case 1:
                                r0 r0Var3 = this.b;
                                r0Var3.getClass();
                                c2 c2Var2 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                c2Var2.c(z20, true);
                                r0Var3.c.g3.O(true);
                                r0Var3.d0(true);
                                break;
                            case 2:
                                r0 r0Var4 = this.b;
                                r0Var4.getClass();
                                c2 c2Var3 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                c2Var3.c(z21, true);
                                r0Var4.c.g3.O(true);
                                r0Var4.d0(true);
                                break;
                            case 3:
                                r0 r0Var5 = this.b;
                                r0Var5.getClass();
                                c2 c2Var4 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                c2Var4.c(z22, true);
                                r0Var5.c.g3.O(true);
                                r0Var5.d0(true);
                                break;
                            case 4:
                                r0 r0Var6 = this.b;
                                r0Var6.getClass();
                                c2 c2Var5 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                c2Var5.c(z23, true);
                                r0Var6.c.g3.O(true);
                                r0Var6.d0(true);
                                break;
                            default:
                                r0 r0Var7 = this.b;
                                r0Var7.getClass();
                                c2 c2Var6 = (c2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                c2Var6.c(z24, true);
                                r0Var7.c.g3.O(true);
                                r0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i3 == p0) {
                r0Var.c0(i3, !r0Var.K.manage_stories, new l0(r0Var, i11));
            }
        }
    }

    public final void c0(int i3, boolean z10, final Runnable runnable) {
        final int i10 = 1;
        final int i11 = 0;
        if (!this.L && i3 == i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = bd.M0(2131752787, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752788, l10.n(this.N)));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            alertDialog$Builder.k(bd.M0(2131754284, null), new org.telegram.ui.ActionBar.p1(this) { // from class: lg.q0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
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
        if (this.M || !z10 || (i3 != l0 && i3 != m0 && i3 != n0 && i3 != o0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M02 = bd.M0(2131752787, null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
        s1Var2.S = M02;
        s1Var2.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752801, l10.n(this.N)));
        alertDialog$Builder2.h(bd.M0(2131752589, null), null);
        alertDialog$Builder2.k(bd.M0(2131754284, null), new org.telegram.ui.ActionBar.p1(this) { // from class: lg.q0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i12) {
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(bd.M0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 14));
        this.a = this.simpleActionBar.n(bd.M0(2131745956, null));
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
        this.f.setGravity((bd.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(bd.M0(2131752816, null));
        r6.w(this.f, i10, null);
        this.f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new ci.o(this, i3));
        this.f.addTextChangedListener(new bh.h(this, 9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, mf.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = k6.d6;
        r6.i(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        r6.i(k6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.p;
        boolean z10 = bd.a0;
        frameLayout4.addView(view2, mf.d(-1, f10, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        ai.d2 d2Var = new ai.d2(context, 5);
        this.n = d2Var;
        r6.i(i12, d2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(bd.M0(2131752811, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = k6.z6;
        r6.V(textView2, i13, getResourceProvider());
        this.n.addView(this.r, mf.e(-2, -2, 17));
        this.s = new ImageView(context);
        j7 j7Var = new j7(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(j7Var);
        this.b = j7Var;
        this.n.addView(this.s, mf.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        kg.v1 v1Var = new kg.v1(true);
        this.d = v1Var;
        v1Var.a = new w5(this, 10);
        b0 b0Var = new b0(this, new l0(this, i11));
        this.w = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        b0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        l41 l41Var = new l41(this, new q4(this, 18), new o0(this, i11), null);
        this.c = l41Var;
        l41Var.r1();
        this.c.setSectionsDrawBackground(true);
        l41 l41Var2 = this.c;
        l41Var2.g3.r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
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
        b0 b0Var;
        if (this.U) {
            TLRPC.User user = this.N;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.I;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.K.equals(tL_connectedBot.rights) && ((b0Var = this.w) == null || !b0Var.g())))) {
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
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i3), new m0(this, iArr, arrayList, z10, user2));
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
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        int i3 = 0;
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752786, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new o0(this, i3));
                alertDialog$Builder.h(bd.M0(2131747588, null), new o0(this, 1));
                showDialog(s1Var);
                return false;
            }
        } else {
            if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = bd.M0(2131752812, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = M02;
                s1Var2.U = bd.M0(2131752813, null);
                alertDialog$Builder2.k(bd.M0(2131752814, null), new o0(this, 2));
                alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                showDialog(s1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new j8(this, 8));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
