package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v2;
import c8.na;
import hi.c7;
import hi.c8;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s0 extends g2 {
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
    public final m0 G;
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
    public c5 a;
    public c8 b;
    public g51 c;
    public jg.z1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public v2 n;
    public TextView r;
    public ImageView s;
    public b0 w;
    public boolean x;
    public boolean y;

    public s0() {
        super(null);
        this.F = 0;
        this.G = new m0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        g2 T;
        if (tL_error != null) {
            s0Var.a.b(false);
            kc.e0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            s0Var.a.b(false);
            f3.o(null, 2131743632, kc.b0(s0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.d.c(new ji.f(5, s0Var, tLObject));
        }
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 == arrayList.size()) {
            f.a(s0Var.currentAccount).b();
            mp messagesController = s0Var.getMessagesController();
            messagesController.s1.clear();
            messagesController.z1.clear();
            s0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (T = LaunchActivity.T()) == null) {
                    return;
                }
                kc.b0(T).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752772, n10.q(user))).j();
                return;
            }
            g2 T2 = LaunchActivity.T();
            if (T2 != null) {
                kc.b0(T2).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752805, n10.q(user))).j();
            }
        }
    }

    public static void b0(final s0 s0Var, n41 n41Var, final View view) {
        if (n41Var.g && !s0Var.w.h(n41Var)) {
            int i7 = n41Var.d;
            final int i10 = 1;
            if (i7 == V) {
                b0 b0Var = s0Var.w;
                s0Var.J = true;
                b0Var.h = true;
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            final int i11 = 0;
            if (i7 == W) {
                b0 b0Var2 = s0Var.w;
                s0Var.J = false;
                b0Var2.h = false;
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == X) {
                s0Var.N = null;
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (n41Var.a == 13) {
                TLRPC.User user = (TLRPC.User) s0Var.O.get(n41Var.y);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    s0Var.N = user;
                    org.telegram.messenger.g0.v1(s0Var.f);
                    s0Var.c.g3.O(true);
                    s0Var.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s0Var.getParentActivity(), s0Var.resourceProvider);
                String N0 = gd.N0(2131752797, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(gd.N0(2131752798, null));
                alertDialog$Builder.k(gd.N0(2131747637, null), null);
                s0Var.showDialog(t1Var);
                return;
            }
            if (i7 == Y) {
                boolean z10 = !s0Var.Q;
                s0Var.Q = z10;
                ((q8) view).setChecked(z10);
                s0Var.c.g3.O(true);
                return;
            }
            if (i7 == Z) {
                int i12 = -s0Var.P;
                s0Var.P = i12;
                org.telegram.messenger.g0.E3(i12, view, null);
                return;
            }
            if (i7 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((d2) view).c(z11, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((d2) view).c(z12, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((d2) view).c(z13, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((d2) view).c(z14, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == e0) {
                boolean z15 = !s0Var.R;
                s0Var.R = z15;
                ((q8) view).setChecked(z15);
                s0Var.c.g3.O(true);
                return;
            }
            if (i7 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((d2) view).c(z16, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((d2) view).c(z17, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = s0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((d2) view).c(z18, true);
                s0Var.c.g3.O(true);
                s0Var.d0(true);
                return;
            }
            if (i7 == i0) {
                final int i13 = 5;
                s0Var.c0(i7, !s0Var.K.edit_username, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                d2Var.c(z19, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == j0) {
                boolean z19 = !s0Var.S;
                s0Var.S = z19;
                ((q8) view).setChecked(z19);
                s0Var.c.g3.O(true);
                return;
            }
            if (i7 == k0) {
                s0Var.c0(i7, !s0Var.K.view_gifts, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == l0) {
                s0Var.c0(i7, !s0Var.K.sell_gifts, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == m0) {
                final int i14 = 2;
                s0Var.c0(i7, !s0Var.K.change_gift_settings, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == n0) {
                final int i15 = 3;
                s0Var.c0(i7, !s0Var.K.transfer_and_upgrade_gifts, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == o0) {
                final int i16 = 4;
                s0Var.c0(i7, !s0Var.K.transfer_stars, new Runnable(s0Var) { // from class: kg.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                d2 d2Var = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                d2Var.c(z192, true);
                                s0Var2.c.g3.O(true);
                                s0Var2.d0(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                d2 d2Var2 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                d2Var2.c(z20, true);
                                s0Var3.c.g3.O(true);
                                s0Var3.d0(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                d2 d2Var3 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                d2Var3.c(z21, true);
                                s0Var4.c.g3.O(true);
                                s0Var4.d0(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                d2 d2Var4 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                d2Var4.c(z22, true);
                                s0Var5.c.g3.O(true);
                                s0Var5.d0(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                d2 d2Var5 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                d2Var5.c(z23, true);
                                s0Var6.c.g3.O(true);
                                s0Var6.d0(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                d2 d2Var6 = (d2) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                d2Var6.c(z24, true);
                                s0Var7.c.g3.O(true);
                                s0Var7.d0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == p0) {
                s0Var.c0(i7, !s0Var.K.manage_stories, new m0(s0Var, i11));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        final int i10 = 1;
        final int i11 = 0;
        if (!this.L && i7 == i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = gd.N0(2131752775, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752776, n10.o(this.N)));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.k(gd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.r0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
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
        String N02 = gd.N0(2131752775, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
        t1Var2.S = N02;
        t1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752789, n10.o(this.N)));
        alertDialog$Builder2.h(gd.N0(2131752577, null), null);
        alertDialog$Builder2.k(gd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.r0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i12) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.N0(2131752771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 8));
        this.a = this.simpleActionBar.s(gd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        u6.D(this.f, n6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i10 = n6.G6;
        u6.U(editTextBoldCursor2, i10, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        int i11 = 5;
        int i12 = 3;
        this.f.setGravity((gd.a0 ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(gd.N0(2131752804, null));
        u6.v(this.f, i10, null);
        this.f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new di.n(this, i7));
        this.f.addTextChangedListener(new ah.j(this, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, na.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = n6.d6;
        u6.h(i13, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        u6.h(n6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.p;
        boolean z10 = gd.a0;
        frameLayout4.addView(view2, na.d(-1, f10, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        v2 v2Var = new v2(context, i11);
        this.n = v2Var;
        u6.h(i13, v2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(gd.N0(2131752799, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i14 = n6.z6;
        u6.U(textView2, i14, getResourceProvider());
        this.n.addView(this.r, na.e(-2, -2, 17));
        this.s = new ImageView(context);
        c8 c8Var = new c8(getThemedColor(i14));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(c8Var);
        this.b = c8Var;
        this.n.addView(this.s, na.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        int i15 = 10;
        z1Var.a = new h6.o(this, i15);
        b0 b0Var = new b0(this, new m0(this, i12));
        this.w = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        b0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        g51 g51Var = new g51(this, new y7(this, i15), new p0(this, i12), null);
        this.c = g51Var;
        g51Var.r1();
        this.c.setSectionsDrawBackground(true);
        g51 g51Var2 = this.c;
        g51Var2.g3.r = false;
        frameLayout.addView(g51Var2, na.c(-1.0f, -1));
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
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new n0(this, iArr, arrayList, z10, user2));
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
            kr krVar = kr.h;
            duration.setInterpolator(krVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(8.0f)).setDuration(320L).setInterpolator(krVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        int i7 = 0;
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743588, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752774, null);
                alertDialog$Builder.k(gd.N0(2131754213, null), new p0(this, i7));
                alertDialog$Builder.h(gd.N0(2131747386, null), new p0(this, 1));
                showDialog(t1Var);
                return false;
            }
        } else {
            if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N02 = gd.N0(2131752800, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = N02;
                t1Var2.U = gd.N0(2131752801, null);
                alertDialog$Builder2.k(gd.N0(2131752802, null), new p0(this, 2));
                alertDialog$Builder2.h(gd.N0(2131752577, null), null);
                showDialog(t1Var2);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new c7(this, 9));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            c8 c8Var = this.b;
            if (c8Var != null) {
                c8Var.b(getThemedColor(n6.z6));
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
