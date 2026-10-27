package jg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.i4;
import fi.c8;
import hi.u2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t0 extends r2 {
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
    public u5 a;
    public c8 b;
    public s71 c;
    public ig.a2 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public i4 n;
    public TextView r;
    public ImageView s;
    public b0 v;
    public boolean w;
    public boolean x;
    public String y;

    public t0() {
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

    public static void V(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        r2 U2;
        if (tL_error != null) {
            t0Var.a.b(false);
            wc.e0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.a.b(false);
            wh.n(R.string.UnknownError, wc.b0(t0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new u2(22, t0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            f.a(t0Var.currentAccount).b();
            t0Var.getMessagesController().clearFullUsers();
            t0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (U2 = LaunchActivity.U()) == null) {
                    return;
                }
                ic.a.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, wc.b0(U2), R.raw.contact_check, 36);
                return;
            }
            r2 U3 = LaunchActivity.U();
            if (U3 != null) {
                ic.a.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, wc.b0(U3), R.raw.contact_check, 36);
            }
        }
    }

    public static void X(final t0 t0Var, u61 u61Var, final View view) {
        if (u61Var.g && !t0Var.v.h(u61Var)) {
            int i10 = u61Var.d;
            if (i10 == U) {
                b0 b0Var = t0Var.v;
                t0Var.I = true;
                b0Var.h = true;
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == V) {
                b0 b0Var2 = t0Var.v;
                t0Var.I = false;
                b0Var2.h = false;
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == W) {
                t0Var.M = null;
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (u61Var.a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.N.get(u61Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    t0Var.M = user;
                    AndroidUtilities.hideKeyboard(t0Var.f);
                    t0Var.c.g3.O(true);
                    t0Var.Z(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t0Var.getParentActivity(), 0, t0Var.resourceProvider);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                t0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == X) {
                boolean z10 = !t0Var.P;
                t0Var.P = z10;
                ((z8) view).setChecked(z10);
                t0Var.c.g3.O(true);
                return;
            }
            if (i10 == Y) {
                int i11 = -t0Var.O;
                t0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.y1) view).c(z14, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == d0) {
                boolean z15 = !t0Var.Q;
                t0Var.Q = z15;
                ((z8) view).setChecked(z15);
                t0Var.c.g3.O(true);
                return;
            }
            if (i10 == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.y1) view).c(z16, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.y1) view).c(z17, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.y1) view).c(z18, true);
                t0Var.c.g3.O(true);
                t0Var.Z(true);
                return;
            }
            if (i10 == h0) {
                final int i12 = 5;
                t0Var.Y(i10, !t0Var.J.edit_username, new Runnable(t0Var) { // from class: jg.l0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                y1Var.c(z19, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                boolean z19 = !t0Var.R;
                t0Var.R = z19;
                ((z8) view).setChecked(z19);
                t0Var.c.g3.O(true);
                return;
            }
            if (i10 == j0) {
                final int i13 = 0;
                t0Var.Y(i10, !t0Var.J.view_gifts, new Runnable(t0Var) { // from class: jg.l0
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
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == k0) {
                final int i14 = 1;
                t0Var.Y(i10, !t0Var.J.sell_gifts, new Runnable(t0Var) { // from class: jg.l0
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
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == l0) {
                final int i15 = 2;
                t0Var.Y(i10, !t0Var.J.change_gift_settings, new Runnable(t0Var) { // from class: jg.l0
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
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == m0) {
                final int i16 = 3;
                t0Var.Y(i10, !t0Var.J.transfer_and_upgrade_gifts, new Runnable(t0Var) { // from class: jg.l0
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
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
            } else if (i10 == n0) {
                final int i17 = 4;
                t0Var.Y(i10, !t0Var.J.transfer_stars, new Runnable(t0Var) { // from class: jg.l0
                    public final /* synthetic */ t0 b;

                    {
                        this.b = t0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                t0 t0Var2 = this.b;
                                t0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                t0Var2.c.g3.O(true);
                                t0Var2.Z(true);
                                break;
                            case 1:
                                t0 t0Var3 = this.b;
                                t0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                t0Var3.c.g3.O(true);
                                t0Var3.Z(true);
                                break;
                            case 2:
                                t0 t0Var4 = this.b;
                                t0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                t0Var4.c.g3.O(true);
                                t0Var4.Z(true);
                                break;
                            case 3:
                                t0 t0Var5 = this.b;
                                t0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                t0Var5.c.g3.O(true);
                                t0Var5.Z(true);
                                break;
                            case 4:
                                t0 t0Var6 = this.b;
                                t0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                t0Var6.c.g3.O(true);
                                t0Var6.Z(true);
                                break;
                            default:
                                t0 t0Var7 = this.b;
                                t0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                t0Var7.c.g3.O(true);
                                t0Var7.Z(true);
                                break;
                        }
                    }
                });
            } else if (i10 == o0) {
                t0Var.Y(i10, !t0Var.J.manage_stories, new m0(t0Var, 0));
            }
        }
    }

    public final void Y(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.K && i10 == h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) { // from class: jg.r0
                public final /* synthetic */ t0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i13) {
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
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
        e2Var2.R = string2;
        e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) { // from class: jg.r0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i13) {
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

    public final void Z(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z10);
    }

    public final boolean a0() {
        b0 b0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.H;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.J.equals(tL_connectedBot.rights) && ((b0Var = this.v) == null || !b0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.x.f) {
            return;
        }
        if (!a0()) {
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

    public final void c0() {
        boolean z10 = this.w;
        boolean e = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.N;
        if (z10 != (e || this.x || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.x && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.w = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(dsVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 13));
        this.a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        f7.E(this.f, y6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i10 = y6.G6;
        f7.V(editTextBoldCursor2, i10, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        f7.w(this.f, i10, null);
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new bi.o(this, 1));
        this.f.addTextChangedListener(new bi.u(this, 3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, kb1.h(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i11 = y6.d6;
        f7.i(i11, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        f7.i(y6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(view2, kb1.h(-1, f7, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        i4 i4Var = new i4(context, 3);
        this.n = i4Var;
        f7.i(i11, i4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i12 = y6.z6;
        f7.V(textView2, i12, getResourceProvider());
        this.n.addView(this.r, kb1.i(-2, -2, 17));
        this.s = new ImageView(context);
        c8 c8Var = new c8(getThemedColor(i12));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(c8Var);
        this.b = c8Var;
        this.n.addView(this.s, kb1.i(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(AndroidUtilities.dp(8.0f));
        ig.a2 a2Var = new ig.a2(true);
        this.d = a2Var;
        a2Var.a = new s0(this, 0);
        b0 b0Var = new b0(this, new m0(this, 3));
        this.v = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        b0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        s71 s71Var = new s71(this, new hi.e2(this, 8), new p0(this, 3), null);
        this.c = s71Var;
        s71Var.u1();
        this.c.setSectionsDrawBackground(true);
        s71 s71Var2 = this.c;
        s71Var2.g3.r = false;
        frameLayout.addView(s71Var2, kb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (a0()) {
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
            if (this.M != null || a0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ig.o(this, 4));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            c8 c8Var = this.b;
            if (c8Var != null) {
                c8Var.b(getThemedColor(y6.z6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
