// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class l46 extends ny0 implements fn7 {
    public static final /* synthetic */ int R2 = 0;
    public final TextView A2;
    public c51 B2;
    public Runnable C2;
    public boolean D2;
    public i69 E2;
    public final e F2;
    public tb G2;
    public k46 H2;
    public boolean I2;
    public TLRPC.Chat J2;
    public final tj4 K2;
    public Runnable L2;
    public int M2;
    public final c51 N2;
    public int O2;
    public int P2;
    public String Q2;
    public int S1;
    public boolean T1;
    public int U1;
    public long V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public wg1 X1;
    public j46 Y1;
    public boolean Z1;
    public boolean a2;
    public wb2 b2;
    public final int c2;
    public final ArrayList d2;
    public boolean e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public ArrayList p2;
    public boolean q2;
    public int r2;
    public i46 s2;
    public final HashSet t2;
    public final ArrayList u2;
    public final ArrayList v2;
    public ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public a46 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l46(int i, int i2, vnb vnbVar, Context context, e eVar) {
        super(context, eVar, false, h1(i), vnbVar);
        byte b = 0;
        this.U1 = -1;
        this.a2 = false;
        this.d2 = new ArrayList();
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        this.n2 = -1;
        this.o2 = -1;
        this.r2 = -1;
        this.t2 = new HashSet();
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.D2 = false;
        this.M2 = 0;
        this.P2 = -4;
        K(aob.v0(aob.h5, this.J0));
        this.O2 = this.H0;
        this.F2 = eVar;
        this.a = i2;
        this.c2 = i;
        X0();
        y1();
        byte b2 = 1;
        byte b3 = 2;
        if (i == 2) {
            this.D2 = true;
            y1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v36(this, b));
        } else if (i == 5) {
            this.D2 = true;
            y1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v36(this, b3));
        }
        x1();
        if (i == 32 || i1()) {
            tj4 tj4Var = new tj4(getContext());
            this.K2 = tj4Var;
            this.c.addView(tj4Var, tre.c(-1.0f, -1));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            tb tbVar = this.G2;
            if (tbVar != null) {
                ((ViewGroup) tbVar.getParent()).removeView(this.G2);
            }
            this.n1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.A2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(hl.o());
            textView.setText(this.z2.getTextView().getText());
            yob.X(textView, aob.Ji, vnbVar);
            textView.setOnClickListener(new u36(this, b));
            int L = hl.L(8.0f);
            int i3 = aob.Fi;
            int v0 = aob.v0(i3, vnbVar);
            int i4 = aob.d6;
            int o = vm2.o(aob.v0(i4, vnbVar), jn7.E1);
            hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
            uob M = yob.M(i3);
            uob g = yob.g(i4, jn7.E1);
            textView.setBackground(i0);
            yob.j(textView, i0, M, g, vnbVar);
        }
        if (i == 32) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            c51 c51Var = new c51(vnbVar, context, true);
            this.N2 = c51Var;
            c51Var.k();
            c51Var.i(ob6.M0(2131753618, null), false, true);
            c51Var.setOnClickListener(new u36(this, b2));
            this.b.addView(c51Var, tre.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new w36(this, (byte) 3));
        }
        if (i == 19 || i == 18) {
            this.b.post(new w36(this, (byte) 4));
        }
    }

    public static k46 g1(int i, int i2) {
        k46 k46Var = new k46();
        k46Var.a = 0;
        k46Var.b = null;
        k46Var.c = null;
        k46Var.d = null;
        k46Var.e = 0;
        k46Var.f = 0;
        if (i == 0) {
            k46Var.e = uc7.s1(i2).k4.l1.f();
            k46Var.f = uc7.s1(i2).k4.m1.f();
            k46Var.a = R.drawable.msg_limit_pin;
            k46Var.b = ob6.a0("LimitReachedPinDialogs", null, 2131748708, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedPinDialogsPremium", null, 2131748706, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedPinDialogsLocked", null, 2131748707, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 33) {
            k46Var.e = uc7.s1(i2).k4.p2.f();
            k46Var.f = uc7.s1(i2).k4.q2.f();
            k46Var.a = R.drawable.msg_limit_pin;
            k46Var.b = ob6.a0(null, null, 2131748705, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0(null, null, 2131748703, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0(null, null, 2131748704, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 2) {
            k46Var.e = uc7.s1(i2).k4.p3.f();
            k46Var.f = uc7.s1(i2).k4.n1.f();
            k46Var.a = R.drawable.msg_limit_links;
            k46Var.b = ob6.a0("LimitReachedPublicLinks", null, 2131748701, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedPublicLinksPremium", null, 2131748699, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedPublicLinksLocked", null, 2131748700, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 12) {
            k46Var.e = uc7.s1(i2).k4.C1.f();
            k46Var.f = uc7.s1(i2).k4.B3.f();
            k46Var.a = R.drawable.msg_limit_links;
            k46Var.b = ob6.a0("LimitReachedFolderLinks", null, 2131748714, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedFolderLinksPremium", null, 2131748712, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedFolderLinksLocked", null, 2131748713, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 13) {
            k46Var.e = uc7.s1(i2).k4.L1.f();
            k46Var.f = uc7.s1(i2).k4.C3.f();
            k46Var.a = R.drawable.msg_limit_folder;
            k46Var.b = ob6.a0("LimitReachedSharedFolders", null, 2131748697, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedSharedFoldersPremium", null, 2131748695, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedSharedFoldersLocked", null, 2131748696, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 3) {
            k46Var.e = uc7.s1(i2).k4.h1.f();
            k46Var.f = uc7.s1(i2).k4.i1.f();
            k46Var.a = R.drawable.msg_limit_folder;
            k46Var.b = ob6.a0("LimitReachedFolders", null, 2131748711, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedFoldersPremium", null, 2131748709, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedFoldersLocked", null, 2131748710, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 4) {
            k46Var.e = uc7.s1(i2).k4.j1.f();
            k46Var.f = uc7.s1(i2).k4.k1.f();
            k46Var.a = R.drawable.msg_limit_chats;
            k46Var.b = ob6.a0("LimitReachedChatInFolders", null, 2131748729, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedChatInFoldersPremium", null, 2131748727, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedChatInFoldersLocked", null, 2131748728, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 5) {
            k46Var.e = uc7.s1(i2).k4.t3.f();
            k46Var.f = uc7.s1(i2).k4.u3.f();
            k46Var.a = R.drawable.msg_limit_groups;
            k46Var.b = ob6.a0("LimitReachedCommunities", null, 2131748726, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedCommunitiesPremium", null, 2131748724, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedCommunitiesLocked", null, 2131748725, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 6) {
            k46Var.e = 100;
            k46Var.f = jn7.d3;
            k46Var.a = R.drawable.msg_limit_folder;
            k46Var.b = ob6.a0("LimitReachedFileSize", null, 2131748717, "2 GB", "4 GB");
            k46Var.c = ob6.a0("LimitReachedFileSizePremium", null, 2131748715, "4 GB");
            k46Var.d = ob6.a0("LimitReachedFileSizeLocked", null, 2131748716, "2 GB");
            return k46Var;
        }
        if (i == 7) {
            k46Var.e = 3;
            k46Var.f = 4;
            k46Var.a = R.drawable.msg_limit_accounts;
            k46Var.b = ob6.a0("LimitReachedAccounts", null, 2131748731, 3, Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedAccountsPremium", null, 2131748730, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedAccountsPremium", null, 2131748730, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 11) {
            k46Var.e = 0;
            k46Var.f = 0;
            k46Var.a = R.drawable.msg_limit_links;
            k46Var.b = ob6.a0("LimitReachedAccounts", null, 2131748731, 0, Integer.valueOf(k46Var.f));
            k46Var.c = "";
            k46Var.d = "";
            return k46Var;
        }
        if (i == 14) {
            k46Var.e = uc7.s1(i2).k4.D1.f();
            k46Var.f = uc7.s1(i2).k4.E1.f();
            k46Var.a = R.drawable.msg_limit_stories;
            k46Var.b = ob6.H(',', "LimitReachedStoriesCount2First", k46Var.e) + "\n" + ob6.H(',', "LimitReachedStoriesCount2Second", k46Var.f);
            k46Var.c = ob6.H(',', "LimitReachedStoriesCount2Premium", k46Var.f);
            k46Var.d = ob6.H(',', "LimitReachedStoriesCount2Premium", k46Var.e);
            return k46Var;
        }
        if (i == 15) {
            k46Var.e = uc7.s1(i2).k4.H1.f();
            k46Var.f = uc7.s1(i2).k4.I1.f();
            k46Var.a = R.drawable.msg_limit_stories;
            k46Var.b = ob6.a0("LimitReachedStoriesWeekly", null, 2131748683, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748682, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748682, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i == 16) {
            k46Var.e = uc7.s1(i2).k4.J1.f();
            k46Var.f = uc7.s1(i2).k4.K1.f();
            k46Var.a = R.drawable.msg_limit_stories;
            k46Var.b = ob6.a0("LimitReachedStoriesMonthly", null, 2131748685, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
            k46Var.c = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(k46Var.f));
            k46Var.d = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(k46Var.e));
            return k46Var;
        }
        if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return k46Var;
        }
        k46Var.e = uc7.s1(i2).k4.J1.f();
        k46Var.f = uc7.s1(i2).k4.K1.f();
        k46Var.a = R.drawable.filled_limit_boost;
        k46Var.b = ob6.a0("LimitReachedStoriesMonthly", null, 2131748685, Integer.valueOf(k46Var.e), Integer.valueOf(k46Var.f));
        k46Var.c = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(k46Var.f));
        k46Var.d = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(k46Var.e));
        return k46Var;
    }

    public static boolean h1(int i) {
        return i == 0 || i == 33 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    public static String m1(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void o1(e eVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, wg1 wg1Var, long j, boolean z) {
        if (tL_premium_boostsStatus == null || wg1Var == null || eVar.getContext() == null) {
            return;
        }
        l46 l46Var = new l46(32, eVar.getCurrentAccount(), eVar.getResourceProvider(), eVar.getContext(), eVar);
        l46Var.s1(wg1Var);
        l46Var.r1(tL_premium_boostsStatus, true);
        l46Var.t1(j);
        if (z) {
            eVar.showDialog(l46Var);
        } else {
            l46Var.show();
        }
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        return new d46(this);
    }

    @Override // ny0
    public final CharSequence K0() {
        int i = this.c2;
        if (i == 11) {
            return ob6.M0(2131752373, null);
        }
        if (i == 34) {
            return ob6.M0(2131752603, null);
        }
        if (i == 35) {
            return ob6.M0(2131743529, null);
        }
        switch (i) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return ob6.M0(2131743529, null);
            case 19:
            case jn7.S /* 30 */:
                return ob6.M0(j1() ? 2131753618 : 2131753656, null);
            case 31:
                return ob6.M0(2131753593, null);
            case 32:
                return ob6.M0(2131753618, null);
            default:
                return ob6.M0(2131748732, null);
        }
    }

    @Override // ny0
    public final void Q0(wma wmaVar) {
        int i;
        Context context = wmaVar.getContext();
        c51 c51Var = new c51(this.J0, context, true);
        this.B2 = c51Var;
        c51Var.setFlickeringLoading(true);
        this.B2.i(ob6.M0(2131753657, null), false, true);
        byte b = 2;
        this.B2.setOnClickListener(new u36(this, b));
        a46 a46Var = new a46(this, context, this.J0);
        this.z2 = a46Var;
        iye.b(a46Var, 0.02f, 1.2f);
        if (!this.s1 && (i = this.c2) != 18) {
            byte b2 = 20;
            if (i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
                tb tbVar = new tb(b2, context, this);
                this.G2 = tbVar;
                yob.h(aob.h5, this.J0, tbVar);
                wmaVar.addView(this.G2, tre.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            }
        }
        a46 a46Var2 = this.z2;
        float f = (this.u0 / hl.p) + 16.0f;
        wmaVar.addView(a46Var2, tre.d(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int L = hl.L(72.0f);
        d79 d79Var = this.n1;
        d79Var.setPadding(0, 0, 0, L);
        d79Var.setClipToPadding(false);
        d79Var.setClipChildren(false);
        d79Var.setOnItemClickListener(new zg4(this, (byte) 9));
        d79Var.setOnItemLongClickListener(new x36(this, b));
        byte b3 = 3;
        this.z2.w.setOnClickListener(new uv5(this, context, b3));
        this.z2.h.setOnClickListener(new u36(this, b3));
        this.E2 = new i69(d79Var, true);
    }

    public final void Z0(final ka6 ka6Var, boolean z) {
        if (!ka6Var.a() || z) {
            final byte b = 1;
            ka6Var.setLoading(true);
            uc7.s1(this.a).G0();
            long j = this.V1;
            int i = this.X1.g;
            final byte b2 = 0;
            on0.a(-j, Arrays.asList(Integer.valueOf(i)), new pcc(this) { // from class: z36
                public final /* synthetic */ l46 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b2;
                    ka6 ka6Var2 = ka6Var;
                    l46 l46Var = this.b;
                    switch (b3) {
                        case 0:
                            uc7.s1(l46Var.a).G0().a(l46Var.V1, new gt(l46Var, ka6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    hl.d3(new tg5(l46Var, ka6Var2, (byte) 29), intValue * 1000);
                                    break;
                                } else {
                                    ym0.g(intValue);
                                }
                            }
                            ka6Var2.setLoading(false);
                            break;
                    }
                }
            }, new pcc(this) { // from class: z36
                public final /* synthetic */ l46 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b;
                    ka6 ka6Var2 = ka6Var;
                    l46 l46Var = this.b;
                    switch (b3) {
                        case 0:
                            uc7.s1(l46Var.a).G0().a(l46Var.V1, new gt(l46Var, ka6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    hl.d3(new tg5(l46Var, ka6Var2, (byte) 29), intValue * 1000);
                                    break;
                                } else {
                                    ym0.g(intValue);
                                }
                            }
                            ka6Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void a1() {
        if (this.B2.isAttachedToWindow()) {
            Z0(this.B2, false);
            return;
        }
        c51 c51Var = this.N2;
        if (c51Var == null || !c51Var.isAttachedToWindow()) {
            Z0(this.z2, false);
        } else {
            Z0(c51Var, false);
        }
    }

    public int b1() {
        return 0;
    }

    public final String c1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.W1.boost_url;
        }
        int i = this.a;
        long j = this.V1;
        uc7 s1 = uc7.s1(i);
        long j2 = -j;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(j2));
        if (TextUtils.isEmpty(xc2.K(M0, false))) {
            return qu6.n(j2, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + xc2.K(M0, false);
    }

    public final String d1(boolean z) {
        String str;
        int i;
        if (this.c2 == 32) {
            TLRPC.Chat f1 = f1();
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(-this.V1);
            return ob6.G(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", f1 == null ? "" : f1.title);
        }
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-this.V1));
        if (M0 == null) {
            str = ob6.M0(j1() ? 2131754872 : 2131754900, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        boolean z2 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (k1() && this.W1.next_level_boosts != 0 && z) {
            i = j1() ? 2131749174 : 2131752324;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
            int i2 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return ob6.a0(null, null, i, str, ob6.G(i2, "MoreBoosts", Integer.valueOf(i2)));
        }
        if (z2 && this.X1.d) {
            if (this.W1.level == 1) {
                return ob6.a0(null, null, j1() ? 2131749247 : 2131752424, new Object[0]);
            }
            return ob6.a0(null, null, j1() ? 2131749246 : 2131752423, Integer.valueOf(this.W1.level), ob6.G(this.W1.level, "BoostStories", new Object[0]));
        }
        boolean z3 = this.X1.d;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.W1;
        if (z3) {
            if (tL_premium_boostsStatus3.level == 0) {
                i = j1() ? 2131749174 : 2131752324;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.W1;
                int i3 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return ob6.a0(null, null, i, str, ob6.G(i3, "MoreBoosts", Integer.valueOf(i3)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return ob6.a0(null, null, j1() ? 2131749246 : 2131752423, Integer.valueOf(this.W1.level), ob6.G(this.W1.level + 1, "BoostStories", new Object[0]));
            }
            i = j1() ? 2131749174 : 2131752324;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.W1;
            int i4 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return ob6.a0(null, null, i, str, ob6.G(i4, "MoreBoosts", Integer.valueOf(i4)));
        }
        if (tL_premium_boostsStatus3.level == 0) {
            i = j1() ? 2131749174 : 2131752324;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.W1;
            int i5 = tL_premium_boostsStatus6.next_level_boosts - tL_premium_boostsStatus6.boosts;
            return ob6.a0(null, null, i, str, ob6.G(i5, "MoreBoosts", Integer.valueOf(i5)));
        }
        if (tL_premium_boostsStatus3.next_level_boosts == 0) {
            return ob6.a0(null, null, j1() ? 2131749246 : 2131752423, Integer.valueOf(this.W1.level), ob6.G(this.W1.level + 1, "BoostStories", new Object[0]));
        }
        i = j1() ? 2131749174 : 2131752324;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.W1;
        int i6 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
        return ob6.a0(null, null, i, str, ob6.G(i6, "MoreBoosts", Integer.valueOf(i6)));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull N0;
        if (i != jn7.X2) {
            if (i != jn7.W2) {
                if (i == jn7.V2) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.X1 == null) {
                return;
            }
            this.W1.boosts += intValue;
            if (this.c2 == 32 && (N0 = uc7.s1(this.a).N0(-this.V1)) != null) {
                N0.boosts_applied += intValue;
            }
            l1();
            r1(tL_premium_boostsStatus, this.Z1);
            wg1 wg1Var = this.X1;
            wg1Var.m = this.W1.next_level_boosts <= 0;
            wg1Var.l = true;
            wg1Var.a(tL_premium_myBoosts);
            if (n1()) {
                v21 Q = new d31(this.c, this.J0).Q(R.raw.ic_boosts_replace, 30, ob6.G(intValue, "BoostingReassignedFromPlural", ob6.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        e eVar = this.r1;
        e lastFragment = eVar.getParentLayout().getLastFragment();
        if (lastFragment instanceof t82) {
            List fragmentStack = eVar.getParentLayout().getFragmentStack();
            e eVar2 = fragmentStack.size() >= 2 ? (e) bp1.m(2, fragmentStack) : null;
            e eVar3 = fragmentStack.size() >= 3 ? (e) bp1.m(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (e) bp1.m(4, fragmentStack) : null;
            if (eVar2 instanceof g92) {
                ((ActionBarLayout) eVar.getParentLayout()).c0(eVar2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                ym0.f(eVar3, chat, false);
                return;
            } else {
                if (eVar3 instanceof ProfileActivity) {
                    ((ActionBarLayout) eVar.getParentLayout()).c0(eVar3, false);
                }
                lastFragment.finishFragment();
                ym0.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof zu1) && booleanValue) {
            ym0.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof wh1) && booleanValue) {
            List fragmentStack2 = eVar.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                e eVar4 = (e) fragmentStack2.get(size);
                if ((eVar4 instanceof zu1) || (eVar4 instanceof uj3)) {
                    r6 = eVar4;
                    break;
                }
                arrayList.add(eVar4);
            }
            if (r6 != null) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ActionBarLayout) eVar.getParentLayout()).c0((e) obj, false);
                }
                eVar.finishFragment();
                dismiss();
                ym0.f(r6, chat, true);
                return;
            }
            return;
        }
        rbb rbbVar = rbb.G2;
        if (!booleanValue) {
            if (rbbVar == null || !rbbVar.d) {
                dismiss();
                ym0.f(LaunchActivity.Q(), chat, false);
                return;
            }
            zu1 ha = zu1.ha(-chat.id);
            LaunchActivity.Q().presentFragment(ha, false, false);
            rbb.v();
            dismiss();
            ym0.f(ha, chat, false);
            return;
        }
        if (rbbVar != null && rbbVar.d) {
            zu1 ha2 = zu1.ha(-chat.id);
            LaunchActivity.Q().presentFragment(ha2, false, false);
            rbb.v();
            dismiss();
            ym0.f(ha2, chat, true);
            return;
        }
        List fragmentStack3 = eVar.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (e) bp1.m(2, fragmentStack3) : null;
        eVar.finishFragment();
        dismiss();
        if (r6 instanceof zu1) {
            ym0.f(r6, chat, true);
        }
    }

    public final String e1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return ob6.a0("BoostsMaxLevelReached", null, 2131753151, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.X1.d) {
            return ob6.M0(j1() ? 2131753618 : 2131753656, null);
        }
        boolean z = this.Z1;
        int i = this.c2;
        if (!z) {
            if (i == 32) {
                return ob6.M0(j1() ? 2131753618 : 2131753656, null);
            }
            if (this.X1.d) {
                return ob6.M0(j1() ? 2131742470 : 2131742472, null);
            }
            return ob6.M0(j1() ? 2131753520 : 2131753521, null);
        }
        if (i == 32) {
            return ob6.M0(j1() ? 2131753618 : 2131753656, null);
        }
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-this.V1));
        if (this.X1.d) {
            return ob6.a0("YouBoostedChannel2", null, 2131742471, M0.title);
        }
        return ob6.M0(j1() ? 2131753618 : 2131753656, null);
    }

    public final TLRPC.Chat f1() {
        return uc7.s1(this.a).M0(Long.valueOf(-this.V1));
    }

    public final boolean i1() {
        int i = this.c2;
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 27 || i == 28 || i == 23 || i == 30 || i == 35;
    }

    public final boolean j1() {
        return !xc2.V(uc7.s1(this.a).M0(Long.valueOf(-this.V1)));
    }

    public final boolean k1() {
        return i1() && xc2.N(f1());
    }

    public final void l1() {
        i46 i46Var = this.s2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i = tL_premium_boostsStatus.boosts;
        int i2 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i46Var.b++;
        i46Var.a = ete.a((i - r2) / i2, 0.0f, 1.0f);
        i46Var.a0 = true;
        i46Var.b0 = i46Var.n;
        i46Var.j(i, true);
        i46Var.J.requestLayout();
        i46Var.requestLayout();
    }

    public final boolean n1() {
        int f;
        int i;
        int f2;
        int i2;
        int f3;
        int i3;
        int f4;
        int i4;
        int f5;
        int i5;
        jn7 f6 = jn7.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        wg1 wg1Var = this.X1;
        wg1Var.getClass();
        wg1 wg1Var2 = new wg1();
        wg1Var2.a = wg1Var.a;
        wg1Var2.b = wg1Var.b;
        wg1Var2.c = wg1Var.c;
        wg1Var2.d = wg1Var.d;
        wg1Var2.e = wg1Var.e;
        wg1Var2.g = wg1Var.g;
        wg1Var2.h = wg1Var.h;
        wg1Var2.i = wg1Var.i;
        wg1Var2.j = wg1Var.j;
        wg1Var2.k = wg1Var.k;
        wg1Var2.m = wg1Var.m;
        byte b = 2;
        f6.m(jn7.r3, tL_premium_boostsStatus, wg1Var2, Long.valueOf(this.V1));
        c51 c51Var = this.N2;
        if (c51Var != null) {
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(-this.V1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                jn7.f(this.a).m(jn7.q3, new Object[0]);
                dismiss();
                return false;
            }
            c51Var.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new i7(b));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Y1, transitionSet);
        j46 j46Var = this.Y1;
        mm0 mm0Var = j46Var.c;
        int indexOfChild = j46Var.indexOfChild(j46Var.b);
        l46 l46Var = j46Var.e;
        if (l46Var.Z1) {
            int indexOfChild2 = j46Var.indexOfChild(j46Var.d);
            j46Var.removeView(j46Var.d);
            j46Var.d.removeView(j46Var.a);
            j46Var.d.removeView(mm0Var);
            LinearLayout linearLayout = new LinearLayout(j46Var.getContext());
            j46Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j46Var.d.setWeightSum(1.0f);
            j46Var.d.addView(j46Var.a, tre.p(-2, -2, 1.0f, 0));
            j46Var.d.addView(mm0Var, tre.t(-2, -2, 48, 0, 2, 0, 0));
            j46Var.addView(j46Var.d, indexOfChild2, tre.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j46Var.indexOfChild(j46Var.a);
            j46Var.removeView(j46Var.a);
            TextView textView = new TextView(j46Var.getContext());
            j46Var.a = textView;
            textView.setTypeface(hl.o());
            j46Var.a.setTextSize(1, 20.0f);
            yob.X(j46Var.a, aob.G6, l46Var.J0);
            j46Var.a.setGravity(17);
            j46Var.addView(j46Var.a, indexOfChild3, tre.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j46Var.removeView(j46Var.b);
        TextView textView2 = new TextView(j46Var.getContext());
        j46Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j46Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j46Var.b.getLineSpacingMultiplier() * 1.1f);
        j46Var.b.setGravity(1);
        yob.X(j46Var.b, aob.G6, l46Var.J0);
        j46Var.addView(j46Var.b, indexOfChild, tre.t(-2, -2, 1, 24, -2, 24, 17));
        this.Y1.a.setText(e1());
        TextView textView4 = this.Y1.b;
        hr hrVar = uc7.s1(this.a).k4;
        boolean j1 = j1();
        int i6 = this.c2;
        String str = null;
        if (i6 == 20) {
            str = ob6.a0(null, null, j1 ? 2131749172 : 2131752321, Integer.valueOf(b1()));
        } else if (i6 == 24) {
            str = ob6.a0(null, null, j1 ? 2131749168 : 2131752318, Integer.valueOf(b1()));
        } else if (i6 == 29) {
            str = ob6.a0(null, null, 2131749171, Integer.valueOf(hrVar.l2.f()));
        } else if (i6 == 30) {
            str = ob6.a0(null, null, 2131752315, Integer.valueOf(hrVar.b2.f()));
        } else if (i6 == 35) {
            str = ob6.a0(null, null, 2131752322, Integer.valueOf(hrVar.c2.f()));
        } else if (i6 == 25) {
            if (j1) {
                f5 = hrVar.k2.f();
                i5 = 2131749169;
            } else {
                f5 = hrVar.f2.f();
                i5 = 2131752319;
            }
            str = ob6.a0(null, null, i5, Integer.valueOf(f5));
        } else if (i6 == 26) {
            if (j1) {
                f4 = hrVar.k2.f();
                i4 = 2131749164;
            } else {
                f4 = hrVar.f2.f();
                i4 = 2131752313;
            }
            str = ob6.a0(null, null, i4, Integer.valueOf(f4));
        } else if (i6 == 27) {
            str = ob6.a0(null, null, j1 ? 2131749166 : 2131752316, Integer.valueOf(hrVar.d2.f()));
        } else if (i6 == 28) {
            if (j1) {
                f3 = hrVar.m2.f();
                i3 = 2131749167;
            } else {
                f3 = hrVar.e2.f();
                i3 = 2131752317;
            }
            str = ob6.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i6 == 22) {
            if (j1) {
                f2 = hrVar.j2.f();
                i2 = 2131749165;
            } else {
                f2 = hrVar.n2.f();
                i2 = 2131752314;
            }
            str = ob6.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i6 == 23) {
            if (j1) {
                f = hrVar.g2.f();
                i = 2131749170;
            } else {
                f = hrVar.o2.f();
                i = 2131752320;
            }
            str = ob6.a0(null, null, i, Integer.valueOf(f));
        }
        if (str == null) {
            str = d1(false);
        }
        textView4.setText(hl.S2(str));
        w1();
        tj4 tj4Var = this.K2;
        tj4Var.c(false);
        try {
            tj4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Y1.c.a(this.X1.i, true);
        this.n1.A0(0);
        if (i6 == 32) {
            this.Y1.c.setVisibility(8);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.X2);
        jn7.f(this.a).b(this, jn7.W2);
        jn7.f(this.a).b(this, jn7.V2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.X2);
        jn7.f(this.a).n(this, jn7.W2);
        jn7.f(this.a).n(this, jn7.V2);
    }

    @Override // nx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.O2 || (v0 = aob.v0(aob.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.O2 = v0;
            y0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String G = ob6.G(arrayList.size(), "RevokeLinks", new Object[0]);
        id idVar = alertDialog$Builder.a;
        idVar.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            boolean z = this.q2;
            int i = this.a;
            if (z) {
                idVar.U = hl.S2(ob6.a0("RevokeLinkAlertChannel", null, 2131745748, uc7.s1(i).N2 + "/" + xc2.K(chat, false), chat.title));
            } else {
                idVar.U = hl.S2(ob6.a0("RevokeLinkAlert", null, 2131745749, uc7.s1(i).N2 + "/" + xc2.K(chat, false), chat.title));
            }
        } else if (this.q2) {
            idVar.U = hl.S2(ob6.a0("RevokeLinksAlertChannel", null, 2131745745, new Object[0]));
        } else {
            idVar.U = hl.S2(ob6.a0("RevokeLinksAlert", null, 2131745746, new Object[0]));
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131745751, null), new u34(this, arrayList, (byte) 17));
        idVar.show();
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, this.J0);
        }
    }

    public final void q1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.Q2)) {
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(this.J2.id);
            if (N0 == null) {
                dismiss();
                return;
            }
            if (this.J2.username != null) {
                str = "@" + this.J2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.Q2;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.t2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long M1 = uc7.s1(this.a).M1(user.id);
            if (M1 <= 0) {
                M1 = wf3.j(uc7.s1(this.a).P2(user.id));
            }
            (M1 >= 0 ? arrayList : arrayList2).add(user);
        }
        int i = 0;
        boolean z = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            jj.Z(this.a, arrayList3, 1, new zj3(this, (byte) 21));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z3 = z;
            Iterator it3 = it2;
            p7a b = p7a.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b.Q = longValue;
            r7a.B(this.a).q0(b);
            if (b.Q > 0) {
                z2 = z3;
            }
            hashMap2 = hashMap;
            z = z3;
            it2 = it3;
        }
        if (!z2) {
            hl.c3(new w36(this, (byte) 2));
        }
        dismiss();
    }

    public final void r1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.W1 = tL_premium_boostsStatus;
        this.Z1 = z;
        y1();
    }

    public final void s1(wg1 wg1Var) {
        this.X1 = wg1Var;
        w1();
        x1();
    }

    public final void t1(long j) {
        this.V1 = j;
        y1();
    }

    public final void u1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.J2 = chat;
        this.Q2 = str;
        this.T1 = !TextUtils.isEmpty(str) || xc2.y(3, chat);
        this.w2 = new ArrayList(arrayList);
        this.x2 = arrayList2;
        this.y2 = arrayList3;
        HashSet hashSet = this.t2;
        hashSet.clear();
        if (this.T1) {
            ArrayList arrayList4 = this.w2;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        y1();
        w1();
        int i2 = this.c2;
        if ((i2 == 11 || i2 == 34) && !uc7.s1(this.a).M3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.w2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            a46 a46Var = this.z2;
            if (a46Var != null && a46Var.getParent() != null) {
                ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            }
            tb tbVar = this.G2;
            if (tbVar != null && tbVar.getParent() != null) {
                ((ViewGroup) this.G2.getParent()).removeView(this.G2);
            }
            d79 d79Var = this.n1;
            if (d79Var != null) {
                d79Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void v1() {
        int i;
        this.p2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i2 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.c2 == 31) {
            i2 = 1;
        }
        uc7 s1 = uc7.s1(this.a);
        hr hrVar = s1.k4;
        lc7 lc7Var = s1.E3;
        int max = Math.max(10, lc7Var != null ? lc7Var.e(j1()) : 0);
        lc7 lc7Var2 = s1.F3;
        int max2 = Math.max(max, lc7Var2 != null ? lc7Var2.e(j1()) : 0);
        int max3 = j1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, hrVar.h2.f()), hrVar.j2.f()), hrVar.g2.f()), hrVar.k2.f()), hrVar.m2.f()) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, hrVar.d2.f()), hrVar.e2.f()), hrVar.f2.f()), hrVar.n2.f()), hrVar.o2.f()), hrVar.b2.f()), hrVar.c2.f());
        ArrayList arrayList = null;
        while (i2 <= max3) {
            boolean j1 = j1();
            ArrayList arrayList2 = new ArrayList();
            uc7 s12 = uc7.s1(this.a);
            hr hrVar2 = s12.k4;
            if (!j1 && i2 >= hrVar2.c2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_translate, 2131753653));
            }
            f46 b = f46.b(R.drawable.menu_feature_stories, i2, "BoostFeatureStoriesPerDay");
            b.f = true;
            arrayList2.add(b);
            if (!j1) {
                f46 b2 = f46.b(R.drawable.menu_feature_reactions, i2, "BoostFeatureCustomReaction");
                b2.f = true;
                arrayList2.add(b2);
            }
            lc7 lc7Var3 = s12.E3;
            int a = lc7Var3 != null ? lc7Var3.a(i2, false) : 0;
            lc7 lc7Var4 = s12.F3;
            int a2 = lc7Var4 != null ? lc7Var4.a(i2, j1) : 0;
            if (!j1 && a > 0) {
                arrayList2.add(f46.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!j1 && a > 0) {
                arrayList2.add(f46.b(R.drawable.menu_feature_links, a, "BoostFeatureReplyColor"));
            }
            if (!j1 && i2 >= hrVar2.d2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_links2, 2131753626));
            }
            if (a2 > 0) {
                arrayList2.add(f46.b(R.drawable.menu_feature_color_profile, a2, j1 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (j1 && i2 >= hrVar2.l2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_pack, 2131753644));
            }
            if (j1 ? i2 >= hrVar2.m2.f() : i2 >= hrVar2.e2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_cover, j1 ? 2131753630 : 2131753631));
            }
            if (j1 && i2 >= hrVar2.h2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_voice, 2131753621));
            }
            if (j1 ? i2 >= hrVar2.k2.f() : i2 >= hrVar2.f2.f()) {
                arrayList2.add(new f46(R.drawable.menu_feature_status, 2131753640, -1, "1000+", null));
            }
            if (j1 ? i2 >= hrVar2.j2.f() : i2 >= hrVar2.n2.f()) {
                arrayList2.add(f46.b(R.drawable.menu_feature_wallpaper, 8, j1 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if (j1 ? i2 >= hrVar2.g2.f() : i2 >= hrVar2.o2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_custombg, j1 ? 2131753645 : 2131753646));
            }
            if (!j1 && i2 >= hrVar2.b2.f()) {
                arrayList2.add(f46.a(R.drawable.menu_feature_noads, 2131753622));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i < arrayList.size(); i + 1) {
                    f46 f46Var = (f46) arrayList.get(i);
                    f46 f46Var2 = (f46) arrayList2.get(i);
                    int i3 = f46Var.e;
                    i = (f46Var2 != null && ((f46Var.f && i3 > 2) || (f46Var.a == f46Var2.a && f46Var.b == f46Var2.b && TextUtils.equals(f46Var.c, f46Var2.c) && TextUtils.equals(f46Var.d, f46Var2.d) && i3 == f46Var2.e))) ? i + 1 : 0;
                }
                i2++;
            }
            ArrayList arrayList3 = this.p2;
            arrayList3.add(new e46(i2, arrayList3.isEmpty()));
            this.p2.addAll(arrayList2);
            arrayList = arrayList2;
            i2++;
        }
    }

    public final void w1() {
        String str = null;
        if (this.e2) {
            this.z2.c(ob6.M0(2131748884, null), false, false);
            return;
        }
        int i = this.c2;
        if (i != 19 && i != 32 && !k1()) {
            HashSet hashSet = this.t2;
            if (i != 11 && i != 34) {
                if (hashSet.size() <= 0) {
                    a46 a46Var = this.z2;
                    a46Var.r = false;
                    a46Var.d(true);
                    return;
                } else {
                    if (i == 2) {
                        str = ob6.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i == 5) {
                        str = ob6.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.z2.c(str, true, true);
                    return;
                }
            }
            a46 a46Var2 = this.z2;
            if (a46Var2.J == null) {
                ey2 ey2Var = new ey2(a46Var2.getContext(), null);
                a46Var2.J = ey2Var;
                ey2Var.setGravity(3);
                ey2 ey2Var2 = a46Var2.J;
                int i2 = aob.Fi;
                int i3 = aob.Ji;
                dy2 dy2Var = ey2Var2.a;
                dy2Var.v = i2;
                dy2Var.w = i3;
                dy2Var.b = 0.8f;
                a46Var2.setClipChildren(false);
                a46Var2.addView(a46Var2.J, tre.e(-1, 24, 16));
            }
            if (this.T1) {
                int size = hashSet.size();
                a46 a46Var3 = this.z2;
                if (size > 0) {
                    a46Var3.c(ob6.M0(2131745347, null), true, true);
                } else {
                    a46Var3.c(ob6.M0(2131754550, null), true, true);
                }
            } else {
                this.z2.c(ob6.M0(2131752006, null), true, true);
            }
            this.z2.J.a.c(hashSet.size(), true);
            this.z2.invalidate();
            return;
        }
        wg1 wg1Var = this.X1;
        boolean z = wg1Var.a;
        if ((z || wg1Var.b) && !wg1Var.l && !wg1Var.d) {
            boolean z2 = wg1Var.m;
            a46 a46Var4 = this.z2;
            if (z2) {
                a46Var4.c(ob6.M0(2131747558, null), true, true);
                return;
            } else {
                a46Var4.r = false;
                a46Var4.d(true);
                return;
            }
        }
        c51 c51Var = this.N2;
        if (z) {
            boolean k = on0.k();
            a46 a46Var5 = this.z2;
            if (k) {
                a46Var5.c(ob6.M0(2131753584, null), true, true);
            } else {
                a46Var5.c(ob6.M0(j1() ? 2131753618 : 2131753656, null), true, true);
            }
            this.B2.i(ob6.M0(2131753657, null), true, true);
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131753618, null), true, true);
                return;
            }
            return;
        }
        if (wg1Var.m) {
            this.B2.i(ob6.M0(2131747558, null), true, true);
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131747558, null), true, true);
            }
            this.z2.c(ob6.M0(2131747558, null), true, true);
            return;
        }
        if (on0.k()) {
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131753618, null), true, true);
            }
            this.B2.i(ob6.M0(2131753657, null), true, true);
            this.z2.c(ob6.M0(2131753584, null), true, true);
            return;
        }
        if (c51Var != null) {
            c51Var.i(ob6.M0(2131747558, null), true, true);
        }
        this.B2.i(ob6.M0(2131747558, null), true, true);
        this.z2.c(ob6.M0(2131747558, null), true, true);
    }

    public final void x1() {
        String M0;
        if (this.e2) {
            this.z2.c(ob6.M0(2131748884, null), false, false);
            return;
        }
        int i = this.c2;
        if (i == 19 || i == 32 || k1()) {
            boolean k = on0.k();
            a46 a46Var = this.z2;
            if (!k) {
                a46Var.f.setText(ob6.M0(j1() ? 2131753618 : 2131753656, null));
                return;
            }
            mk8 mk8Var = a46Var.f;
            wg1 wg1Var = this.X1;
            if (wg1Var == null || !wg1Var.d) {
                M0 = ob6.M0(j1() ? 2131753618 : 2131753656, null);
            } else {
                M0 = ob6.M0(2131753584, null);
            }
            mk8Var.setText(M0);
            wg1 wg1Var2 = this.X1;
            if (wg1Var2 == null || !wg1Var2.m) {
                return;
            }
            this.z2.f.setText(ob6.M0(2131747558, null));
            return;
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wm2(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131751727, null));
            this.z2.f.setText(spannableStringBuilder);
            return;
        }
        if (yac.h(this.a).p() || uc7.s1(this.a).M3() || this.I2) {
            this.z2.f.setText(ob6.M0(2131747558, null));
            a46 a46Var2 = this.z2;
            a46Var2.E.p = null;
            a46Var2.G.setVisibility(8);
            return;
        }
        this.z2.f.setText(ob6.M0(2131748953, null));
        k46 k46Var = this.H2;
        if (k46Var == null) {
            a46 a46Var3 = this.z2;
            a46Var3.E.p = null;
            a46Var3.G.setVisibility(8);
            return;
        }
        int i2 = k46Var.e;
        int i3 = i2 + 1;
        int i4 = k46Var.f;
        if (i3 == i4) {
            this.z2.setIcon(R.raw.addone_icon);
            return;
        }
        if (i2 != 0 && i4 != 0) {
            float f = i4 / i2;
            if (f >= 1.6f && f <= 2.5f) {
                this.z2.setIcon(R.raw.double_icon);
                return;
            }
        }
        a46 a46Var4 = this.z2;
        a46Var4.E.p = null;
        a46Var4.G.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        if (r1.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        r1 = r6.y2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bb, code lost:
    
        if (r1.size() != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        r1 = r6.x2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
    
        if (r1.size() != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        if (r6.T1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b1, code lost:
    
        if (r1.size() >= r6.w2.size()) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1() {
        int size;
        this.h2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.U1 = -1;
        this.m2 = -1;
        this.o2 = -1;
        this.f2 = 1;
        this.g2 = 0;
        int i = this.c2;
        if (i == 19 || i == 18 || i == 20 || i == 24 || i == 27 || i == 28 || i == 22 || i == 23 || i == 25 || i == 26 || i == 29 || i == 21 || i == 30 || i == 35) {
            if (i != 19 || xc2.N(f1())) {
                this.u1 = 0.24f;
                int i2 = this.f2;
                this.f2 = i2 + 1;
                this.U1 = i2;
                if (uc7.s1(this.a).k4.W1.f) {
                    int i3 = this.f2;
                    this.f2 = i3 + 1;
                    this.n2 = i3;
                }
            }
            v1();
            int i4 = this.f2;
            int i5 = i4 + 1;
            this.f2 = i5;
            this.o2 = i4;
            this.f2 = (this.p2.size() - 1) + i5;
        } else if (i == 31 || i == 32) {
            this.u1 = 0.24f;
            v1();
            int i6 = this.f2;
            this.j2 = i6;
            int i7 = i6 + 1;
            this.f2 = i7;
            this.o2 = i6;
            int size2 = (this.p2.size() - 1) + i7;
            this.f2 = size2;
            this.k2 = size2;
        } else if (!h1(i)) {
            int i8 = this.c2;
            if (i8 == 11 || i8 == 34) {
                this.u1 = 0.24f;
            } else {
                int i9 = this.f2;
                this.h2 = i9;
                this.f2 = i9 + 2;
                this.i2 = i9 + 1;
            }
            if (this.D2) {
                int i10 = this.f2;
                this.f2 = i10 + 1;
                this.l2 = i10;
            } else {
                if (i8 == 11) {
                    if (this.T1) {
                        if (!uc7.s1(this.a).M3()) {
                            ArrayList arrayList = this.y2;
                            if (arrayList != null) {
                            }
                            ArrayList arrayList2 = this.x2;
                            if (arrayList2 != null) {
                            }
                        }
                    }
                }
                int i11 = this.f2;
                this.j2 = i11;
                int i12 = this.c2;
                if (i12 == 11 || i12 == 34) {
                    size = this.w2.size() + i11;
                    this.f2 = size;
                } else if (i12 == 5) {
                    size = this.u2.size() + i11;
                    this.f2 = size;
                } else {
                    size = this.d2.size() + i11;
                    this.f2 = size;
                }
                this.k2 = size;
                if (this.k2 - this.j2 > 1) {
                    int i13 = this.f2;
                    this.f2 = i13 + 1;
                    this.m2 = i13;
                }
            }
        }
        this.n1.getAdapter().f();
    }
}
