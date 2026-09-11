package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.g5;
import di.i2;
import di.u8;
import fi.j4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class u0 extends n2 {
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
    public int E;
    public final m0 F;
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
    public or a;
    public org.telegram.ui.ActionBar.v0 b;
    public d61 c;
    public hg.b2 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public g5 n;
    public TextView r;
    public ImageView s;
    public a0 v;
    public boolean w;
    public boolean x;
    public String y;

    public u0() {
        super(null);
        this.E = 0;
        this.F = new m0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void U(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            u0Var.a.a(0.0f);
            yc.b0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            u0Var.a.a(0.0f);
            org.telegram.messenger.w1.p(R.string.UnknownError, yc.a0(u0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new j4(14, u0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            f.a(u0Var.currentAccount).b();
            u0Var.getMessagesController().clearFullUsers();
            u0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (U2 = LaunchActivity.U()) == null) {
                    return;
                }
                i2.g.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, yc.a0(U2), R.raw.contact_check, 36);
                return;
            }
            n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                i2.g.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, yc.a0(U3), R.raw.contact_check, 36);
            }
        }
    }

    public static void W(final u0 u0Var, h51 h51Var, final View view) {
        if (h51Var.g && !u0Var.v.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 == U) {
                a0 a0Var = u0Var.v;
                u0Var.I = true;
                a0Var.h = true;
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == V) {
                a0 a0Var2 = u0Var.v;
                u0Var.I = false;
                a0Var2.h = false;
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == W) {
                u0Var.M = null;
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (h51Var.a == 13) {
                TLRPC.User user = (TLRPC.User) u0Var.N.get(h51Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    u0Var.M = user;
                    AndroidUtilities.hideKeyboard(u0Var.f);
                    u0Var.c.Y2.N(true);
                    u0Var.Y(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity(), 0, u0Var.resourceProvider);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                u0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == X) {
                boolean z10 = !u0Var.P;
                u0Var.P = z10;
                ((v8) view).setChecked(z10);
                u0Var.c.Y2.N(true);
                return;
            }
            if (i10 == Y) {
                int i11 = -u0Var.O;
                u0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == d0) {
                boolean z15 = !u0Var.Q;
                u0Var.Q = z15;
                ((v8) view).setChecked(z15);
                u0Var.c.Y2.N(true);
                return;
            }
            if (i10 == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.z1) view).c(z17, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = u0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.z1) view).c(z18, true);
                u0Var.c.Y2.N(true);
                u0Var.Y(true);
                return;
            }
            if (i10 == h0) {
                final int i12 = 5;
                u0Var.X(i10, !u0Var.J.edit_username, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                z1Var.c(z19, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                boolean z19 = !u0Var.R;
                u0Var.R = z19;
                ((v8) view).setChecked(z19);
                u0Var.c.Y2.N(true);
                return;
            }
            if (i10 == j0) {
                final int i13 = 0;
                u0Var.X(i10, !u0Var.J.view_gifts, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == k0) {
                final int i14 = 1;
                u0Var.X(i10, !u0Var.J.sell_gifts, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == l0) {
                final int i15 = 2;
                u0Var.X(i10, !u0Var.J.change_gift_settings, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == m0) {
                final int i16 = 3;
                u0Var.X(i10, !u0Var.J.transfer_and_upgrade_gifts, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == n0) {
                final int i17 = 4;
                u0Var.X(i10, !u0Var.J.transfer_stars, new Runnable(u0Var) { // from class: ig.l0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = u0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                u0 u0Var2 = this.b;
                                u0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                u0Var2.c.Y2.N(true);
                                u0Var2.Y(true);
                                break;
                            case 1:
                                u0 u0Var3 = this.b;
                                u0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                u0Var3.c.Y2.N(true);
                                u0Var3.Y(true);
                                break;
                            case 2:
                                u0 u0Var4 = this.b;
                                u0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                u0Var4.c.Y2.N(true);
                                u0Var4.Y(true);
                                break;
                            case 3:
                                u0 u0Var5 = this.b;
                                u0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                u0Var5.c.Y2.N(true);
                                u0Var5.Y(true);
                                break;
                            case 4:
                                u0 u0Var6 = this.b;
                                u0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                u0Var6.c.Y2.N(true);
                                u0Var6.Y(true);
                                break;
                            default:
                                u0 u0Var7 = this.b;
                                u0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                u0Var7.c.Y2.N(true);
                                u0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == o0) {
                u0Var.X(i10, !u0Var.J.manage_stories, new m0(u0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.K && i10 == h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) { // from class: ig.r0
                public final /* synthetic */ u0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
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
            alertDialog$Builder.o();
            return;
        }
        if (this.L || !z10 || (i10 != k0 && i10 != l0 && i10 != m0 && i10 != n0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
        b2Var2.R = string2;
        b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) { // from class: ig.r0
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i13) {
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
        alertDialog$Builder2.o();
    }

    public final void Y(boolean z10) {
        if (this.b == null) {
            return;
        }
        boolean Z2 = Z();
        this.b.setEnabled(Z2);
        if (z10) {
            this.b.animate().alpha(Z2 ? 1.0f : 0.0f).scaleX(Z2 ? 1.0f : 0.0f).scaleY(Z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(Z2 ? 1.0f : 0.0f);
        this.b.setScaleX(Z2 ? 1.0f : 0.0f);
        this.b.setScaleY(Z2 ? 1.0f : 0.0f);
    }

    public final boolean Z() {
        a0 a0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.H;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.J.equals(tL_connectedBot.rights) && ((a0Var = this.v) == null || !a0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void a0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.c > 0.0f) {
            return;
        }
        if (!Z()) {
            finishFragment();
            return;
        }
        if (this.v.k(this.c)) {
            TLRPC.User user2 = this.M;
            boolean z10 = user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.H;
            if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.H.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.M != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.J;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.M);
                updateconnectedbot2.recipients = this.v.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.H;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.M.id;
                    tL_connectedBot3.recipients = this.v.c();
                    this.H.rights = this.J;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new n0(this, iArr, arrayList, z10, user2));
            }
        }
    }

    public final void b0() {
        boolean z10 = this.w;
        boolean e7 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.N;
        if (z10 != (e7 || this.x || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.x && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.w = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(prVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f.setHintTextColor(j6.w0(null, j6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i11 = j6.G6;
        editTextBoldCursor2.setTextColor(j6.w0(null, i11, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f.setCursorColor(j6.w0(null, i11, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new s0(this, 0));
        this.f.addTextChangedListener(new i2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, x5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = j6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.d7));
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(view2, x5.d(-1, f7, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        g5 g5Var = new g5(context, 3);
        this.n = g5Var;
        g5Var.setBackgroundColor(getThemedColor(i12));
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = j6.z6;
        textView2.setTextColor(getThemedColor(i13));
        this.n.addView(this.r, x5.e(-2, -2, 17));
        this.s = new ImageView(context);
        u8 u8Var = new u8(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(u8Var);
        this.n.addView(this.s, x5.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(AndroidUtilities.dp(8.0f));
        hg.b2 b2Var = new hg.b2(true);
        this.d = b2Var;
        b2Var.a = new a6.m(this, 24);
        a0 a0Var = new a0(this, new m0(this, 3));
        this.v = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        a0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        d61 d61Var = new d61(this, new ci.u(this, 24), new p0(this, 3), null);
        this.c = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.c;
        d61Var2.Y2.r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (Z()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new p0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new p0(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new p0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new bi.o1(this, 21));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
