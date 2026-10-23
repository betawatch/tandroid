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
import ci.h4;
import ei.g8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s0 extends o2 {
    public static final int W = -1;
    public static final int X = -2;
    public static final int Y = -3;
    public static final int Z = -4;
    public static final int a0 = -5;
    public static final int b0 = -6;
    public static final int c0 = -7;
    public static final int d0 = -8;
    public static final int e0 = -9;
    public static final int f0 = -10;
    public static final int g0 = -11;
    public static final int h0 = -12;
    public static final int i0 = -13;
    public static final int j0 = -14;
    public static final int k0 = -15;
    public static final int l0 = -16;
    public static final int m0 = -17;
    public static final int n0 = -18;
    public static final int o0 = -19;
    public static final int p0 = -20;
    public static final int q0 = -21;
    public boolean E;
    public String F;
    public int G;
    public final m0 H;
    public TL_account.connectedBots I;
    public TL_account.TL_connectedBot J;
    public boolean K;
    public TL_account.TL_businessBotRights L;
    public boolean M;
    public boolean N;
    public TLRPC.User O;
    public final LongSparseArray P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public as a;
    public eq b;
    public g8 c;
    public org.telegram.ui.ActionBar.u0 d;
    public j71 e;
    public hg.a2 f;
    public FrameLayout h;
    public EditTextBoldCursor n;
    public View r;
    public h4 s;
    public TextView v;
    public ImageView w;
    public a0 x;
    public boolean y;

    public s0() {
        super(null);
        this.G = 0;
        this.H = new m0(this, 4);
        this.L = TL_account.TL_businessBotRights.makeDefault();
        this.O = null;
        this.P = new LongSparseArray();
        this.Q = -4;
        this.R = true;
        this.S = false;
        this.T = false;
    }

    public static void U(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        o2 U;
        if (tL_error != null) {
            s0Var.a.a(0.0f);
            xc.d0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            s0Var.a.a(0.0f);
            sl.q(R.string.UnknownError, xc.a0(s0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new hi.t(5, s0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            f.a(s0Var.currentAccount).b();
            s0Var.getMessagesController().clearFullUsers();
            s0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (U = LaunchActivity.U()) == null) {
                    return;
                }
                i2.o1.t(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, xc.a0(U), R.raw.contact_check, 36);
                return;
            }
            o2 U2 = LaunchActivity.U();
            if (U2 != null) {
                i2.o1.t(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, xc.a0(U2), R.raw.contact_check, 36);
            }
        }
    }

    public static void W(final s0 s0Var, m61 m61Var, final View view) {
        if (m61Var.g && !s0Var.x.h(m61Var)) {
            int i10 = m61Var.d;
            if (i10 == W) {
                a0 a0Var = s0Var.x;
                s0Var.K = true;
                a0Var.h = true;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == X) {
                a0 a0Var2 = s0Var.x;
                s0Var.K = false;
                a0Var2.h = false;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == Y) {
                s0Var.O = null;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (m61Var.a == 13) {
                TLRPC.User user = (TLRPC.User) s0Var.P.get(m61Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    s0Var.O = user;
                    AndroidUtilities.hideKeyboard(s0Var.n);
                    s0Var.e.Z2.N(true);
                    s0Var.Y(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s0Var.getParentActivity(), 0, s0Var.resourceProvider);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                s0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == Z) {
                boolean z10 = !s0Var.R;
                s0Var.R = z10;
                ((v8) view).setChecked(z10);
                s0Var.e.Z2.N(true);
                return;
            }
            if (i10 == a0) {
                int i11 = -s0Var.Q;
                s0Var.Q = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.L;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.L;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.L;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.L;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == f0) {
                boolean z15 = !s0Var.S;
                s0Var.S = z15;
                ((v8) view).setChecked(z15);
                s0Var.e.Z2.N(true);
                return;
            }
            if (i10 == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.L;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == h0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.L;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.z1) view).c(z17, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == i0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = s0Var.L;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.z1) view).c(z18, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            }
            if (i10 == j0) {
                final int i12 = 5;
                s0Var.X(i10, !s0Var.L.edit_username, new Runnable(s0Var) { // from class: ig.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                z1Var.c(z19, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == k0) {
                boolean z19 = !s0Var.T;
                s0Var.T = z19;
                ((v8) view).setChecked(z19);
                s0Var.e.Z2.N(true);
                return;
            }
            if (i10 == l0) {
                final int i13 = 0;
                s0Var.X(i10, !s0Var.L.view_gifts, new Runnable(s0Var) { // from class: ig.l0
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
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == m0) {
                final int i14 = 1;
                s0Var.X(i10, !s0Var.L.sell_gifts, new Runnable(s0Var) { // from class: ig.l0
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
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == n0) {
                final int i15 = 2;
                s0Var.X(i10, !s0Var.L.change_gift_settings, new Runnable(s0Var) { // from class: ig.l0
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
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == o0) {
                final int i16 = 3;
                s0Var.X(i10, !s0Var.L.transfer_and_upgrade_gifts, new Runnable(s0Var) { // from class: ig.l0
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
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == p0) {
                final int i17 = 4;
                s0Var.X(i10, !s0Var.L.transfer_stars, new Runnable(s0Var) { // from class: ig.l0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = s0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                s0 s0Var2 = this.b;
                                s0Var2.getClass();
                                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                z1Var.c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                break;
                            case 1:
                                s0 s0Var3 = this.b;
                                s0Var3.getClass();
                                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                z1Var2.c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                break;
                            case 2:
                                s0 s0Var4 = this.b;
                                s0Var4.getClass();
                                org.telegram.ui.Cells.z1 z1Var3 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                z1Var3.c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                break;
                            case 3:
                                s0 s0Var5 = this.b;
                                s0Var5.getClass();
                                org.telegram.ui.Cells.z1 z1Var4 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                z1Var4.c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                break;
                            case 4:
                                s0 s0Var6 = this.b;
                                s0Var6.getClass();
                                org.telegram.ui.Cells.z1 z1Var5 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                z1Var5.c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                break;
                            default:
                                s0 s0Var7 = this.b;
                                s0Var7.getClass();
                                org.telegram.ui.Cells.z1 z1Var6 = (org.telegram.ui.Cells.z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                z1Var6.c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == q0) {
                s0Var.X(i10, !s0Var.L.manage_stories, new m0(s0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.M && i10 == j0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.O)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) { // from class: ig.r0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    switch (i12) {
                        case 0:
                            this.b.M = true;
                            runnable.run();
                            break;
                        default:
                            this.b.N = true;
                            runnable.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
            return;
        }
        if (this.N || !z10 || (i10 != m0 && i10 != n0 && i10 != o0 && i10 != p0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
        c2Var2.R = string2;
        c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.O)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) { // from class: ig.r0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i13) {
                switch (i11) {
                    case 0:
                        this.b.M = true;
                        runnable.run();
                        break;
                    default:
                        this.b.N = true;
                        runnable.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.p();
    }

    public final void Y(boolean z10) {
        if (this.d == null) {
            return;
        }
        boolean Z2 = Z();
        this.d.setEnabled(Z2);
        if (z10) {
            this.d.animate().alpha(Z2 ? 1.0f : 0.0f).scaleX(Z2 ? 1.0f : 0.0f).scaleY(Z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.d.setAlpha(Z2 ? 1.0f : 0.0f);
        this.d.setScaleX(Z2 ? 1.0f : 0.0f);
        this.d.setScaleY(Z2 ? 1.0f : 0.0f);
    }

    public final boolean Z() {
        a0 a0Var;
        if (this.V) {
            TLRPC.User user = this.O;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.J;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.L.equals(tL_connectedBot.rights) && ((a0Var = this.x) == null || !a0Var.g())))) {
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
        if (this.x.k(this.e)) {
            TLRPC.User user2 = this.O;
            boolean z10 = user2 != null && ((tL_connectedBot = this.J) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.J;
            if (tL_connectedBot2 != null && ((user = this.O) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.J.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.O != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.L;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.O);
                updateconnectedbot2.recipients = this.x.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.J;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.O.id;
                    tL_connectedBot3.recipients = this.x.c();
                    this.J.rights = this.L;
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
        boolean z10 = this.y;
        boolean e = this.f.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.P;
        if (z10 != (e || this.E || longSparseArray.size() > 0)) {
            if (!this.f.e() && !this.E && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.y = z11;
            ViewPropertyAnimator duration = this.v.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).start();
            this.w.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(bsVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.v8;
        int x02 = k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        eq eqVar = new eq(k6.x0(null, i10, false));
        this.b = eqVar;
        this.a = new as(mutate, eqVar);
        org.telegram.ui.ActionBar.u0 i11 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        this.d = i11;
        r6.z(i11, mutate, i10, null, mode);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.n = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        r6.F(this.n, k6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.n;
        int i12 = k6.G6;
        r6.W(editTextBoldCursor2, i12, null);
        this.n.setBackgroundDrawable(null);
        this.n.setMaxLines(1);
        this.n.setLines(1);
        this.n.setPadding(0, 0, 0, 0);
        this.n.setSingleLine(true);
        this.n.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.n.setInputType(180224);
        this.n.setImeOptions(6);
        this.n.setHint(LocaleController.getString(R.string.BusinessBotLink));
        r6.x(this.n, i12, null);
        this.n.setCursorSize(AndroidUtilities.dp(19.0f));
        this.n.setCursorWidth(1.5f);
        this.n.setOnEditorActionListener(new ai.n(this, 1));
        this.n.addTextChangedListener(new ai.u(this, 3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.addView(this.n, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.h;
        int i13 = k6.d6;
        r6.i(i13, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.r = view;
        r6.i(k6.d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.h;
        View view2 = this.r;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(view2, z5.d(-1, f7, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        h4 h4Var = new h4(context, 3);
        this.s = h4Var;
        r6.i(i13, h4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.v.setTextSize(1, 14.0f);
        TextView textView2 = this.v;
        int i14 = k6.z6;
        r6.W(textView2, i14, getResourceProvider());
        this.s.addView(this.v, z5.e(-2, -2, 17));
        this.w = new ImageView(context);
        g8 g8Var = new g8(getThemedColor(i14));
        this.w.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageDrawable(g8Var);
        this.c = g8Var;
        this.s.addView(this.w, z5.e(-2, -2, 17));
        this.w.setAlpha(0.0f);
        this.w.setTranslationY(AndroidUtilities.dp(8.0f));
        hg.a2 a2Var = new hg.a2(true);
        this.f = a2Var;
        a2Var.a = new a6.i(this, 26);
        a0 a0Var = new a0(this, new m0(this, 3));
        this.x = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.J;
        a0Var.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        j71 j71Var = new j71(this, new hg.o(this, 5), new p0(this, 3), null);
        this.e = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.e;
        j71Var2.Z2.r = false;
        frameLayout.addView(j71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.e, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            if (this.O != null || Z() || (this.f.d.isEmpty() && this.f.e.isEmpty())) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        if (!this.U && !this.V) {
            this.U = true;
            f.a(this.currentAccount).c(new k0(this, 0));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            eq eqVar = this.b;
            if (eqVar != null) {
                eqVar.b(k6.x0(null, k6.v8, false));
            }
            g8 g8Var = this.c;
            if (g8Var != null) {
                g8Var.b(getThemedColor(k6.z6));
                ImageView imageView = this.w;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
