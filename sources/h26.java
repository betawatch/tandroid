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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class h26 extends fy0 implements gk7 {
    public static final /* synthetic */ int R2 = 0;
    public final TextView A2;
    public u41 B2;
    public Runnable C2;
    public boolean D2;
    public t29 E2;
    public final d F2;
    public sb G2;
    public g26 H2;
    public boolean I2;
    public TLRPC.Chat J2;
    public final qh4 K2;
    public Runnable L2;
    public int M2;
    public final u41 N2;
    public int O2;
    public int P2;
    public String Q2;
    public int S1;
    public boolean T1;
    public int U1;
    public long V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public ng1 X1;
    public f26 Y1;
    public boolean Z1;
    public boolean a2;
    public gb2 b2;
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
    public e26 s2;
    public final HashSet t2;
    public final ArrayList u2;
    public final ArrayList v2;
    public ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public w16 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h26(int i, int i2, wjb wjbVar, Context context, d dVar) {
        super(context, dVar, false, g1(i), wjbVar);
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
        L(bkb.v0(bkb.g5, this.J0));
        this.O2 = this.H0;
        this.F2 = dVar;
        this.a = i2;
        this.c2 = i;
        W0();
        x1();
        byte b2 = 1;
        byte b3 = 2;
        if (i == 2) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new r16(this, b));
        } else if (i == 5) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new r16(this, b3));
        }
        w1();
        if (i == 32 || h1()) {
            qh4 qh4Var = new qh4(getContext());
            this.K2 = qh4Var;
            this.c.addView(qh4Var, nme.c(-1.0f, -1));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            sb sbVar = this.G2;
            if (sbVar != null) {
                ((ViewGroup) sbVar.getParent()).removeView(this.G2);
            }
            this.n1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.A2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(gl.o());
            textView.setText(this.z2.getTextView().getText());
            zkb.X(textView, bkb.Ii, wjbVar);
            textView.setOnClickListener(new q16(this, b));
            int L = gl.L(8.0f);
            int i3 = bkb.Ei;
            int v0 = bkb.v0(i3, wjbVar);
            int i4 = bkb.c6;
            int o = bm2.o(bkb.v0(i4, wjbVar), 120);
            ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
            vkb M = zkb.M(i3);
            vkb g = zkb.g(i4, 120);
            textView.setBackground(i0);
            zkb.j(textView, i0, M, g, wjbVar);
        }
        if (i == 32) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            u41 u41Var = new u41(wjbVar, context, true);
            this.N2 = u41Var;
            u41Var.k();
            u41Var.i(k96.M0(2131753622, null), false, true);
            u41Var.setOnClickListener(new q16(this, b2));
            this.b.addView(u41Var, nme.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new s16(this, (byte) 3));
        }
        if (i == 19 || i == 18) {
            this.b.post(new s16(this, (byte) 4));
        }
    }

    public static g26 f1(int i, int i2) {
        g26 g26Var = new g26();
        g26Var.a = 0;
        g26Var.b = null;
        g26Var.c = null;
        g26Var.d = null;
        g26Var.e = 0;
        g26Var.f = 0;
        if (i == 0) {
            g26Var.e = na7.q1(i2).k4.d1.f();
            g26Var.f = na7.q1(i2).k4.e1.f();
            g26Var.a = R.drawable.msg_limit_pin;
            g26Var.b = k96.a0("LimitReachedPinDialogs", null, 2131748762, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedPinDialogsPremium", null, 2131748760, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedPinDialogsLocked", null, 2131748761, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 33) {
            g26Var.e = na7.q1(i2).k4.h2.f();
            g26Var.f = na7.q1(i2).k4.i2.f();
            g26Var.a = R.drawable.msg_limit_pin;
            g26Var.b = k96.a0(null, null, 2131748759, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0(null, null, 2131748757, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0(null, null, 2131748758, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 2) {
            g26Var.e = na7.q1(i2).k4.h3.f();
            g26Var.f = na7.q1(i2).k4.f1.f();
            g26Var.a = R.drawable.msg_limit_links;
            g26Var.b = k96.a0("LimitReachedPublicLinks", null, 2131748755, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedPublicLinksPremium", null, 2131748753, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedPublicLinksLocked", null, 2131748754, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 12) {
            g26Var.e = na7.q1(i2).k4.u1.f();
            g26Var.f = na7.q1(i2).k4.t3.f();
            g26Var.a = R.drawable.msg_limit_links;
            g26Var.b = k96.a0("LimitReachedFolderLinks", null, 2131748768, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedFolderLinksPremium", null, 2131748766, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedFolderLinksLocked", null, 2131748767, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 13) {
            g26Var.e = na7.q1(i2).k4.D1.f();
            g26Var.f = na7.q1(i2).k4.u3.f();
            g26Var.a = R.drawable.msg_limit_folder;
            g26Var.b = k96.a0("LimitReachedSharedFolders", null, 2131748751, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedSharedFoldersPremium", null, 2131748749, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedSharedFoldersLocked", null, 2131748750, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 3) {
            g26Var.e = na7.q1(i2).k4.Z0.f();
            g26Var.f = na7.q1(i2).k4.a1.f();
            g26Var.a = R.drawable.msg_limit_folder;
            g26Var.b = k96.a0("LimitReachedFolders", null, 2131748765, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedFoldersPremium", null, 2131748763, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedFoldersLocked", null, 2131748764, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 4) {
            g26Var.e = na7.q1(i2).k4.b1.f();
            g26Var.f = na7.q1(i2).k4.c1.f();
            g26Var.a = R.drawable.msg_limit_chats;
            g26Var.b = k96.a0("LimitReachedChatInFolders", null, 2131748783, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedChatInFoldersPremium", null, 2131748781, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedChatInFoldersLocked", null, 2131748782, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 5) {
            g26Var.e = na7.q1(i2).k4.l3.f();
            g26Var.f = na7.q1(i2).k4.m3.f();
            g26Var.a = R.drawable.msg_limit_groups;
            g26Var.b = k96.a0("LimitReachedCommunities", null, 2131748780, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedCommunitiesPremium", null, 2131748778, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedCommunitiesLocked", null, 2131748779, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 6) {
            g26Var.e = 100;
            g26Var.f = kk7.d3;
            g26Var.a = R.drawable.msg_limit_folder;
            g26Var.b = k96.a0("LimitReachedFileSize", null, 2131748771, "2 GB", "4 GB");
            g26Var.c = k96.a0("LimitReachedFileSizePremium", null, 2131748769, "4 GB");
            g26Var.d = k96.a0("LimitReachedFileSizeLocked", null, 2131748770, "2 GB");
            return g26Var;
        }
        if (i == 7) {
            g26Var.e = 3;
            g26Var.f = 4;
            g26Var.a = R.drawable.msg_limit_accounts;
            g26Var.b = k96.a0("LimitReachedAccounts", null, 2131748785, 3, Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 11) {
            g26Var.e = 0;
            g26Var.f = 0;
            g26Var.a = R.drawable.msg_limit_links;
            g26Var.b = k96.a0("LimitReachedAccounts", null, 2131748785, 0, Integer.valueOf(g26Var.f));
            g26Var.c = "";
            g26Var.d = "";
            return g26Var;
        }
        if (i == 14) {
            g26Var.e = na7.q1(i2).k4.v1.f();
            g26Var.f = na7.q1(i2).k4.w1.f();
            g26Var.a = R.drawable.msg_limit_stories;
            g26Var.b = k96.H(',', "LimitReachedStoriesCount2First", g26Var.e) + "\n" + k96.H(',', "LimitReachedStoriesCount2Second", g26Var.f);
            g26Var.c = k96.H(',', "LimitReachedStoriesCount2Premium", g26Var.f);
            g26Var.d = k96.H(',', "LimitReachedStoriesCount2Premium", g26Var.e);
            return g26Var;
        }
        if (i == 15) {
            g26Var.e = na7.q1(i2).k4.z1.f();
            g26Var.f = na7.q1(i2).k4.A1.f();
            g26Var.a = R.drawable.msg_limit_stories;
            g26Var.b = k96.a0("LimitReachedStoriesWeekly", null, 2131748737, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i == 16) {
            g26Var.e = na7.q1(i2).k4.B1.f();
            g26Var.f = na7.q1(i2).k4.C1.f();
            g26Var.a = R.drawable.msg_limit_stories;
            g26Var.b = k96.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
            g26Var.c = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(g26Var.f));
            g26Var.d = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(g26Var.e));
            return g26Var;
        }
        if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return g26Var;
        }
        g26Var.e = na7.q1(i2).k4.B1.f();
        g26Var.f = na7.q1(i2).k4.C1.f();
        g26Var.a = R.drawable.filled_limit_boost;
        g26Var.b = k96.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(g26Var.e), Integer.valueOf(g26Var.f));
        g26Var.c = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(g26Var.f));
        g26Var.d = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(g26Var.e));
        return g26Var;
    }

    public static boolean g1(int i) {
        return i == 0 || i == 33 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    public static String l1(int i) {
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

    public static void n1(d dVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ng1 ng1Var, long j, boolean z) {
        if (tL_premium_boostsStatus == null || ng1Var == null || dVar.getContext() == null) {
            return;
        }
        h26 h26Var = new h26(32, dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getContext(), dVar);
        h26Var.r1(ng1Var);
        h26Var.q1(tL_premium_boostsStatus, true);
        h26Var.s1(j);
        if (z) {
            dVar.showDialog(h26Var);
        } else {
            h26Var.show();
        }
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        return new z16(this);
    }

    @Override // fy0
    public final CharSequence J0() {
        int i = this.c2;
        if (i == 11) {
            return k96.M0(2131752389, null);
        }
        if (i == 34) {
            return k96.M0(2131752610, null);
        }
        if (i == 35) {
            return k96.M0(2131743635, null);
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
                return k96.M0(2131743635, null);
            case 19:
            case kk7.S /* 30 */:
                return k96.M0(i1() ? 2131753622 : 2131753660, null);
            case 31:
                return k96.M0(2131753597, null);
            case 32:
                return k96.M0(2131753622, null);
            default:
                return k96.M0(2131748786, null);
        }
    }

    @Override // fy0
    public final void P0(cja cjaVar) {
        int i;
        Context context = cjaVar.getContext();
        u41 u41Var = new u41(this.J0, context, true);
        this.B2 = u41Var;
        u41Var.setFlickeringLoading(true);
        byte b = 0;
        this.B2.i(k96.M0(2131753661, null), false, true);
        byte b2 = 2;
        this.B2.setOnClickListener(new q16(this, b2));
        w16 w16Var = new w16(this, context, this.J0);
        this.z2 = w16Var;
        ote.b(w16Var, 0.02f, 1.2f);
        if (!this.s1 && (i = this.c2) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            sb sbVar = new sb((byte) 19, context, this);
            this.G2 = sbVar;
            zkb.h(bkb.g5, this.J0, sbVar);
            cjaVar.addView(this.G2, nme.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        w16 w16Var2 = this.z2;
        float f = (this.u0 / gl.p) + 16.0f;
        cjaVar.addView(w16Var2, nme.d(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int L = gl.L(72.0f);
        o39 o39Var = this.n1;
        o39Var.setPadding(0, 0, 0, L);
        o39Var.setClipToPadding(false);
        o39Var.setClipChildren(false);
        o39Var.setOnItemClickListener(new bf4(this, (byte) 9));
        o39Var.setOnItemLongClickListener(new t16(this, b2));
        this.z2.w.setOnClickListener(new v16(this, context, b));
        this.z2.h.setOnClickListener(new q16(this, (byte) 3));
        this.E2 = new t29(o39Var, true);
    }

    public final void Y0(final g86 g86Var, boolean z) {
        if (!g86Var.a() || z) {
            final byte b = 1;
            g86Var.setLoading(true);
            na7.q1(this.a).E0();
            long j = this.V1;
            int i = this.X1.g;
            final byte b2 = 0;
            on0.a(-j, Arrays.asList(Integer.valueOf(i)), new p8c(this) { // from class: u16
                public final /* synthetic */ h26 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b3 = b2;
                    g86 g86Var2 = g86Var;
                    h26 h26Var = this.b;
                    switch (b3) {
                        case 0:
                            na7.q1(h26Var.a).E0().a(h26Var.V1, new ht(h26Var, g86Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    gl.e3(new kz5(h26Var, g86Var2, (byte) 2), intValue * 1000);
                                    break;
                                } else {
                                    ym0.g(intValue);
                                }
                            }
                            g86Var2.setLoading(false);
                            break;
                    }
                }
            }, new p8c(this) { // from class: u16
                public final /* synthetic */ h26 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b3 = b;
                    g86 g86Var2 = g86Var;
                    h26 h26Var = this.b;
                    switch (b3) {
                        case 0:
                            na7.q1(h26Var.a).E0().a(h26Var.V1, new ht(h26Var, g86Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    gl.e3(new kz5(h26Var, g86Var2, (byte) 2), intValue * 1000);
                                    break;
                                } else {
                                    ym0.g(intValue);
                                }
                            }
                            g86Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void Z0() {
        if (this.B2.isAttachedToWindow()) {
            Y0(this.B2, false);
            return;
        }
        u41 u41Var = this.N2;
        if (u41Var == null || !u41Var.isAttachedToWindow()) {
            Y0(this.z2, false);
        } else {
            Y0(u41Var, false);
        }
    }

    public int a1() {
        return 0;
    }

    public final String b1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.W1.boost_url;
        }
        int i = this.a;
        long j = this.V1;
        na7 q1 = na7.q1(i);
        long j2 = -j;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(j2));
        if (TextUtils.isEmpty(hc2.K(K0, false))) {
            return ls6.n(j2, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + hc2.K(K0, false);
    }

    public final String c1(boolean z) {
        String str;
        int i;
        if (this.c2 == 32) {
            TLRPC.Chat e1 = e1();
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(-this.V1);
            return k96.G(Math.max(L0.boosts_unrestrict - L0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", e1 == null ? "" : e1.title);
        }
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-this.V1));
        if (K0 == null) {
            str = k96.M0(i1() ? 2131754876 : 2131754904, null);
        } else {
            str = K0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        boolean z2 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (j1() && this.W1.next_level_boosts != 0 && z) {
            i = i1() ? 2131749228 : 2131752340;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
            int i2 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return k96.a0(null, null, i, str, k96.G(i2, "MoreBoosts", Integer.valueOf(i2)));
        }
        if (z2 && this.X1.d) {
            if (this.W1.level == 1) {
                return k96.a0(null, null, i1() ? 2131749301 : 2131752438, new Object[0]);
            }
            return k96.a0(null, null, i1() ? 2131749300 : 2131752437, Integer.valueOf(this.W1.level), k96.G(this.W1.level, "BoostStories", new Object[0]));
        }
        boolean z3 = this.X1.d;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.W1;
        if (z3) {
            if (tL_premium_boostsStatus3.level == 0) {
                i = i1() ? 2131749228 : 2131752340;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.W1;
                int i3 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return k96.a0(null, null, i, str, k96.G(i3, "MoreBoosts", Integer.valueOf(i3)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return k96.a0(null, null, i1() ? 2131749300 : 2131752437, Integer.valueOf(this.W1.level), k96.G(this.W1.level + 1, "BoostStories", new Object[0]));
            }
            i = i1() ? 2131749228 : 2131752340;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.W1;
            int i4 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return k96.a0(null, null, i, str, k96.G(i4, "MoreBoosts", Integer.valueOf(i4)));
        }
        if (tL_premium_boostsStatus3.level == 0) {
            i = i1() ? 2131749228 : 2131752340;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.W1;
            int i5 = tL_premium_boostsStatus6.next_level_boosts - tL_premium_boostsStatus6.boosts;
            return k96.a0(null, null, i, str, k96.G(i5, "MoreBoosts", Integer.valueOf(i5)));
        }
        if (tL_premium_boostsStatus3.next_level_boosts == 0) {
            return k96.a0(null, null, i1() ? 2131749300 : 2131752437, Integer.valueOf(this.W1.level), k96.G(this.W1.level + 1, "BoostStories", new Object[0]));
        }
        i = i1() ? 2131749228 : 2131752340;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.W1;
        int i6 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
        return k96.a0(null, null, i, str, k96.G(i6, "MoreBoosts", Integer.valueOf(i6)));
    }

    public final String d1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return k96.a0("BoostsMaxLevelReached", null, 2131753155, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.X1.d) {
            return k96.M0(i1() ? 2131753622 : 2131753660, null);
        }
        boolean z = this.Z1;
        int i = this.c2;
        if (!z) {
            if (i == 32) {
                return k96.M0(i1() ? 2131753622 : 2131753660, null);
            }
            if (this.X1.d) {
                return k96.M0(i1() ? 2131742576 : 2131742578, null);
            }
            return k96.M0(i1() ? 2131753524 : 2131753525, null);
        }
        if (i == 32) {
            return k96.M0(i1() ? 2131753622 : 2131753660, null);
        }
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-this.V1));
        if (this.X1.d) {
            return k96.a0("YouBoostedChannel2", null, 2131742577, K0.title);
        }
        return k96.M0(i1() ? 2131753622 : 2131753660, null);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull L0;
        if (i != kk7.W2) {
            if (i != kk7.V2) {
                if (i == kk7.U2) {
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
            if (this.c2 == 32 && (L0 = na7.q1(this.a).L0(-this.V1)) != null) {
                L0.boosts_applied += intValue;
            }
            k1();
            q1(tL_premium_boostsStatus, this.Z1);
            ng1 ng1Var = this.X1;
            ng1Var.m = this.W1.next_level_boosts <= 0;
            ng1Var.l = true;
            ng1Var.a(tL_premium_myBoosts);
            if (m1()) {
                m21 Q = new u21(this.c, this.J0).Q(R.raw.ic_boosts_replace, 30, k96.G(intValue, "BoostingReassignedFromPlural", k96.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        d dVar = this.r1;
        d lastFragment = dVar.getParentLayout().getLastFragment();
        if (lastFragment instanceof c82) {
            List fragmentStack = dVar.getParentLayout().getFragmentStack();
            d dVar2 = fragmentStack.size() >= 2 ? (d) oo1.m(2, fragmentStack) : null;
            d dVar3 = fragmentStack.size() >= 3 ? (d) oo1.m(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (d) oo1.m(4, fragmentStack) : null;
            if (dVar2 instanceof p82) {
                ((ActionBarLayout) dVar.getParentLayout()).c0(dVar2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                ym0.f(dVar3, chat, false);
                return;
            } else {
                if (dVar3 instanceof ProfileActivity) {
                    ((ActionBarLayout) dVar.getParentLayout()).c0(dVar3, false);
                }
                lastFragment.finishFragment();
                ym0.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof mu1) && booleanValue) {
            ym0.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof nh1) && booleanValue) {
            List fragmentStack2 = dVar.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                d dVar4 = (d) fragmentStack2.get(size);
                if ((dVar4 instanceof mu1) || (dVar4 instanceof cj3)) {
                    r6 = dVar4;
                    break;
                }
                arrayList.add(dVar4);
            }
            if (r6 != null) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ActionBarLayout) dVar.getParentLayout()).c0((d) obj, false);
                }
                dVar.finishFragment();
                dismiss();
                ym0.f(r6, chat, true);
                return;
            }
            return;
        }
        t7b t7bVar = t7b.G2;
        if (!booleanValue) {
            if (t7bVar == null || !t7bVar.d) {
                dismiss();
                ym0.f(LaunchActivity.Q(), chat, false);
                return;
            }
            mu1 U9 = mu1.U9(-chat.id);
            LaunchActivity.Q().presentFragment(U9, false, false);
            t7b.v();
            dismiss();
            ym0.f(U9, chat, false);
            return;
        }
        if (t7bVar != null && t7bVar.d) {
            mu1 U92 = mu1.U9(-chat.id);
            LaunchActivity.Q().presentFragment(U92, false, false);
            t7b.v();
            dismiss();
            ym0.f(U92, chat, true);
            return;
        }
        List fragmentStack3 = dVar.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (d) oo1.m(2, fragmentStack3) : null;
        dVar.finishFragment();
        dismiss();
        if (r6 instanceof mu1) {
            ym0.f(r6, chat, true);
        }
    }

    public final TLRPC.Chat e1() {
        return na7.q1(this.a).K0(Long.valueOf(-this.V1));
    }

    public final boolean h1() {
        int i = this.c2;
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 27 || i == 28 || i == 23 || i == 30 || i == 35;
    }

    public final boolean i1() {
        return !hc2.V(na7.q1(this.a).K0(Long.valueOf(-this.V1)));
    }

    public final boolean j1() {
        return h1() && hc2.N(e1());
    }

    public final void k1() {
        e26 e26Var = this.s2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i = tL_premium_boostsStatus.boosts;
        int i2 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        e26Var.b++;
        e26Var.a = moe.a((i - r2) / i2, 0.0f, 1.0f);
        e26Var.a0 = true;
        e26Var.b0 = e26Var.n;
        e26Var.j(i, true);
        e26Var.J.requestLayout();
        e26Var.requestLayout();
    }

    public final boolean m1() {
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
        kk7 f6 = kk7.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        ng1 ng1Var = this.X1;
        ng1Var.getClass();
        ng1 ng1Var2 = new ng1();
        ng1Var2.a = ng1Var.a;
        ng1Var2.b = ng1Var.b;
        ng1Var2.c = ng1Var.c;
        ng1Var2.d = ng1Var.d;
        ng1Var2.e = ng1Var.e;
        ng1Var2.g = ng1Var.g;
        ng1Var2.h = ng1Var.h;
        ng1Var2.i = ng1Var.i;
        ng1Var2.j = ng1Var.j;
        ng1Var2.k = ng1Var.k;
        ng1Var2.m = ng1Var.m;
        byte b = 2;
        f6.m(kk7.q3, tL_premium_boostsStatus, ng1Var2, Long.valueOf(this.V1));
        u41 u41Var = this.N2;
        if (u41Var != null) {
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(-this.V1);
            int max = Math.max(L0.boosts_unrestrict - L0.boosts_applied, 0);
            if (max == 0) {
                kk7.f(this.a).m(kk7.p3, new Object[0]);
                dismiss();
                return false;
            }
            u41Var.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new h7(b));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Y1, transitionSet);
        f26 f26Var = this.Y1;
        mm0 mm0Var = f26Var.c;
        int indexOfChild = f26Var.indexOfChild(f26Var.b);
        h26 h26Var = f26Var.e;
        if (h26Var.Z1) {
            int indexOfChild2 = f26Var.indexOfChild(f26Var.d);
            f26Var.removeView(f26Var.d);
            f26Var.d.removeView(f26Var.a);
            f26Var.d.removeView(mm0Var);
            LinearLayout linearLayout = new LinearLayout(f26Var.getContext());
            f26Var.d = linearLayout;
            linearLayout.setOrientation(0);
            f26Var.d.setWeightSum(1.0f);
            f26Var.d.addView(f26Var.a, nme.p(-2, -2, 1.0f, 0));
            f26Var.d.addView(mm0Var, nme.t(-2, -2, 48, 0, 2, 0, 0));
            f26Var.addView(f26Var.d, indexOfChild2, nme.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = f26Var.indexOfChild(f26Var.a);
            f26Var.removeView(f26Var.a);
            TextView textView = new TextView(f26Var.getContext());
            f26Var.a = textView;
            textView.setTypeface(gl.o());
            f26Var.a.setTextSize(1, 20.0f);
            zkb.X(f26Var.a, bkb.F6, h26Var.J0);
            f26Var.a.setGravity(17);
            f26Var.addView(f26Var.a, indexOfChild3, nme.t(-2, -2, 1, 0, 22, 0, 0));
        }
        f26Var.removeView(f26Var.b);
        TextView textView2 = new TextView(f26Var.getContext());
        f26Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = f26Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), f26Var.b.getLineSpacingMultiplier() * 1.1f);
        f26Var.b.setGravity(1);
        zkb.X(f26Var.b, bkb.F6, h26Var.J0);
        f26Var.addView(f26Var.b, indexOfChild, nme.t(-2, -2, 1, 24, -2, 24, 17));
        this.Y1.a.setText(d1());
        TextView textView4 = this.Y1.b;
        gr grVar = na7.q1(this.a).k4;
        boolean i1 = i1();
        int i6 = this.c2;
        String str = null;
        if (i6 == 20) {
            str = k96.a0(null, null, i1 ? 2131749226 : 2131752337, Integer.valueOf(a1()));
        } else if (i6 == 24) {
            str = k96.a0(null, null, i1 ? 2131749222 : 2131752334, Integer.valueOf(a1()));
        } else if (i6 == 29) {
            str = k96.a0(null, null, 2131749225, Integer.valueOf(grVar.d2.f()));
        } else if (i6 == 30) {
            str = k96.a0(null, null, 2131752331, Integer.valueOf(grVar.T1.f()));
        } else if (i6 == 35) {
            str = k96.a0(null, null, 2131752338, Integer.valueOf(grVar.U1.f()));
        } else if (i6 == 25) {
            if (i1) {
                f5 = grVar.c2.f();
                i5 = 2131749223;
            } else {
                f5 = grVar.X1.f();
                i5 = 2131752335;
            }
            str = k96.a0(null, null, i5, Integer.valueOf(f5));
        } else if (i6 == 26) {
            if (i1) {
                f4 = grVar.c2.f();
                i4 = 2131749218;
            } else {
                f4 = grVar.X1.f();
                i4 = 2131752329;
            }
            str = k96.a0(null, null, i4, Integer.valueOf(f4));
        } else if (i6 == 27) {
            str = k96.a0(null, null, i1 ? 2131749220 : 2131752332, Integer.valueOf(grVar.V1.f()));
        } else if (i6 == 28) {
            if (i1) {
                f3 = grVar.e2.f();
                i3 = 2131749221;
            } else {
                f3 = grVar.W1.f();
                i3 = 2131752333;
            }
            str = k96.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i6 == 22) {
            if (i1) {
                f2 = grVar.b2.f();
                i2 = 2131749219;
            } else {
                f2 = grVar.f2.f();
                i2 = 2131752330;
            }
            str = k96.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i6 == 23) {
            if (i1) {
                f = grVar.Y1.f();
                i = 2131749224;
            } else {
                f = grVar.g2.f();
                i = 2131752336;
            }
            str = k96.a0(null, null, i, Integer.valueOf(f));
        }
        if (str == null) {
            str = c1(false);
        }
        textView4.setText(gl.T2(str));
        v1();
        qh4 qh4Var = this.K2;
        qh4Var.c(false);
        try {
            qh4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Y1.c.a(this.X1.i, true);
        this.n1.z0(0);
        if (i6 == 32) {
            this.Y1.c.setVisibility(8);
        }
        return true;
    }

    public final void o1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String G = k96.G(arrayList.size(), "RevokeLinks", new Object[0]);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            boolean z = this.q2;
            int i = this.a;
            if (z) {
                hdVar.U = gl.T2(k96.a0("RevokeLinkAlertChannel", null, 2131745828, na7.q1(i).N2 + "/" + hc2.K(chat, false), chat.title));
            } else {
                hdVar.U = gl.T2(k96.a0("RevokeLinkAlert", null, 2131745829, na7.q1(i).N2 + "/" + hc2.K(chat, false), chat.title));
            }
        } else if (this.q2) {
            hdVar.U = gl.T2(k96.a0("RevokeLinksAlertChannel", null, 2131745825, new Object[0]));
        } else {
            hdVar.U = gl.T2(k96.a0("RevokeLinksAlert", null, 2131745826, new Object[0]));
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131745831, null), new h45(this, arrayList, (byte) 12));
        hdVar.show();
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, this.J0);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.W2);
        kk7.f(this.a).b(this, kk7.V2);
        kk7.f(this.a).b(this, kk7.U2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.W2);
        kk7.f(this.a).n(this, kk7.V2);
        kk7.f(this.a).n(this, kk7.U2);
    }

    @Override // fx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.O2 || (v0 = bkb.v0(bkb.g5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.O2 = v0;
            x0(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.Q2)) {
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(this.J2.id);
            if (L0 == null) {
                dismiss();
                return;
            }
            if (this.J2.username != null) {
                str = "@" + this.J2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = L0.exported_invite;
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
            long K1 = na7.q1(this.a).K1(user.id);
            if (K1 <= 0) {
                K1 = cf3.j(na7.q1(this.a).I2(user.id));
            }
            (K1 >= 0 ? arrayList : arrayList2).add(user);
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
            ij.Z(this.a, arrayList3, 1, new hj3(this, (byte) 21));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z3 = z;
            Iterator it3 = it2;
            x3a b = x3a.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b.Q = longValue;
            z3a.B(this.a).q0(b);
            if (b.Q > 0) {
                z2 = z3;
            }
            hashMap2 = hashMap;
            z = z3;
            it2 = it3;
        }
        if (!z2) {
            gl.d3(new s16(this, (byte) 2));
        }
        dismiss();
    }

    public final void q1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.W1 = tL_premium_boostsStatus;
        this.Z1 = z;
        x1();
    }

    public final void r1(ng1 ng1Var) {
        this.X1 = ng1Var;
        v1();
        w1();
    }

    public final void s1(long j) {
        this.V1 = j;
        x1();
    }

    public final void t1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.J2 = chat;
        this.Q2 = str;
        this.T1 = !TextUtils.isEmpty(str) || hc2.y(3, chat);
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
        x1();
        v1();
        int i2 = this.c2;
        if ((i2 == 11 || i2 == 34) && !na7.q1(this.a).E3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.w2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            w16 w16Var = this.z2;
            if (w16Var != null && w16Var.getParent() != null) {
                ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            }
            sb sbVar = this.G2;
            if (sbVar != null && sbVar.getParent() != null) {
                ((ViewGroup) this.G2.getParent()).removeView(this.G2);
            }
            o39 o39Var = this.n1;
            if (o39Var != null) {
                o39Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void u1() {
        int i;
        this.p2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i2 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.c2 == 31) {
            i2 = 1;
        }
        na7 q1 = na7.q1(this.a);
        gr grVar = q1.k4;
        ea7 ea7Var = q1.E3;
        int max = Math.max(10, ea7Var != null ? ea7Var.e(i1()) : 0);
        ea7 ea7Var2 = q1.F3;
        int max2 = Math.max(max, ea7Var2 != null ? ea7Var2.e(i1()) : 0);
        int max3 = i1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, grVar.Z1.f()), grVar.b2.f()), grVar.Y1.f()), grVar.c2.f()), grVar.e2.f()) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, grVar.V1.f()), grVar.W1.f()), grVar.X1.f()), grVar.f2.f()), grVar.g2.f()), grVar.T1.f()), grVar.U1.f());
        ArrayList arrayList = null;
        while (i2 <= max3) {
            boolean i1 = i1();
            ArrayList arrayList2 = new ArrayList();
            na7 q12 = na7.q1(this.a);
            gr grVar2 = q12.k4;
            if (!i1 && i2 >= grVar2.U1.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_translate, 2131753657));
            }
            b26 b = b26.b(R.drawable.menu_feature_stories, i2, "BoostFeatureStoriesPerDay");
            b.f = true;
            arrayList2.add(b);
            if (!i1) {
                b26 b2 = b26.b(R.drawable.menu_feature_reactions, i2, "BoostFeatureCustomReaction");
                b2.f = true;
                arrayList2.add(b2);
            }
            ea7 ea7Var3 = q12.E3;
            int a = ea7Var3 != null ? ea7Var3.a(i2, false) : 0;
            ea7 ea7Var4 = q12.F3;
            int a2 = ea7Var4 != null ? ea7Var4.a(i2, i1) : 0;
            if (!i1 && a > 0) {
                arrayList2.add(b26.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!i1 && a > 0) {
                arrayList2.add(b26.b(R.drawable.menu_feature_links, a, "BoostFeatureReplyColor"));
            }
            if (!i1 && i2 >= grVar2.V1.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_links2, 2131753630));
            }
            if (a2 > 0) {
                arrayList2.add(b26.b(R.drawable.menu_feature_color_profile, a2, i1 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (i1 && i2 >= grVar2.d2.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_pack, 2131753648));
            }
            if (i1 ? i2 >= grVar2.e2.f() : i2 >= grVar2.W1.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_cover, i1 ? 2131753634 : 2131753635));
            }
            if (i1 && i2 >= grVar2.Z1.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_voice, 2131753625));
            }
            if (i1 ? i2 >= grVar2.c2.f() : i2 >= grVar2.X1.f()) {
                arrayList2.add(new b26(R.drawable.menu_feature_status, 2131753644, -1, "1000+", null));
            }
            if (i1 ? i2 >= grVar2.b2.f() : i2 >= grVar2.f2.f()) {
                arrayList2.add(b26.b(R.drawable.menu_feature_wallpaper, 8, i1 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if (i1 ? i2 >= grVar2.Y1.f() : i2 >= grVar2.g2.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_custombg, i1 ? 2131753649 : 2131753650));
            }
            if (!i1 && i2 >= grVar2.T1.f()) {
                arrayList2.add(b26.a(R.drawable.menu_feature_noads, 2131753626));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i < arrayList.size(); i + 1) {
                    b26 b26Var = (b26) arrayList.get(i);
                    b26 b26Var2 = (b26) arrayList2.get(i);
                    int i3 = b26Var.e;
                    i = (b26Var2 != null && ((b26Var.f && i3 > 2) || (b26Var.a == b26Var2.a && b26Var.b == b26Var2.b && TextUtils.equals(b26Var.c, b26Var2.c) && TextUtils.equals(b26Var.d, b26Var2.d) && i3 == b26Var2.e))) ? i + 1 : 0;
                }
                i2++;
            }
            ArrayList arrayList3 = this.p2;
            arrayList3.add(new a26(i2, arrayList3.isEmpty()));
            this.p2.addAll(arrayList2);
            arrayList = arrayList2;
            i2++;
        }
    }

    public final void v1() {
        String str = null;
        if (this.e2) {
            this.z2.c(k96.M0(2131748938, null), false, false);
            return;
        }
        int i = this.c2;
        if (i != 19 && i != 32 && !j1()) {
            HashSet hashSet = this.t2;
            if (i != 11 && i != 34) {
                if (hashSet.size() <= 0) {
                    w16 w16Var = this.z2;
                    w16Var.r = false;
                    w16Var.d(true);
                    return;
                } else {
                    if (i == 2) {
                        str = k96.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i == 5) {
                        str = k96.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.z2.c(str, true, true);
                    return;
                }
            }
            w16 w16Var2 = this.z2;
            if (w16Var2.J == null) {
                kx2 kx2Var = new kx2(w16Var2.getContext(), null);
                w16Var2.J = kx2Var;
                kx2Var.setGravity(3);
                kx2 kx2Var2 = w16Var2.J;
                int i2 = bkb.Ei;
                int i3 = bkb.Ii;
                jx2 jx2Var = kx2Var2.a;
                jx2Var.v = i2;
                jx2Var.w = i3;
                jx2Var.b = 0.8f;
                w16Var2.setClipChildren(false);
                w16Var2.addView(w16Var2.J, nme.e(-1, 24, 16));
            }
            if (this.T1) {
                int size = hashSet.size();
                w16 w16Var3 = this.z2;
                if (size > 0) {
                    w16Var3.c(k96.M0(2131745427, null), true, true);
                } else {
                    w16Var3.c(k96.M0(2131754554, null), true, true);
                }
            } else {
                this.z2.c(k96.M0(2131752029, null), true, true);
            }
            this.z2.J.a.c(hashSet.size(), true);
            this.z2.invalidate();
            return;
        }
        ng1 ng1Var = this.X1;
        boolean z = ng1Var.a;
        if ((z || ng1Var.b) && !ng1Var.l && !ng1Var.d) {
            boolean z2 = ng1Var.m;
            w16 w16Var4 = this.z2;
            if (z2) {
                w16Var4.c(k96.M0(2131747638, null), true, true);
                return;
            } else {
                w16Var4.r = false;
                w16Var4.d(true);
                return;
            }
        }
        u41 u41Var = this.N2;
        if (z) {
            boolean k = on0.k();
            w16 w16Var5 = this.z2;
            if (k) {
                w16Var5.c(k96.M0(2131753588, null), true, true);
            } else {
                w16Var5.c(k96.M0(i1() ? 2131753622 : 2131753660, null), true, true);
            }
            this.B2.i(k96.M0(2131753661, null), true, true);
            if (u41Var != null) {
                u41Var.i(k96.M0(2131753622, null), true, true);
                return;
            }
            return;
        }
        if (ng1Var.m) {
            this.B2.i(k96.M0(2131747638, null), true, true);
            if (u41Var != null) {
                u41Var.i(k96.M0(2131747638, null), true, true);
            }
            this.z2.c(k96.M0(2131747638, null), true, true);
            return;
        }
        if (on0.k()) {
            if (u41Var != null) {
                u41Var.i(k96.M0(2131753622, null), true, true);
            }
            this.B2.i(k96.M0(2131753661, null), true, true);
            this.z2.c(k96.M0(2131753588, null), true, true);
            return;
        }
        if (u41Var != null) {
            u41Var.i(k96.M0(2131747638, null), true, true);
        }
        this.B2.i(k96.M0(2131747638, null), true, true);
        this.z2.c(k96.M0(2131747638, null), true, true);
    }

    public final void w1() {
        String M0;
        if (this.e2) {
            this.z2.c(k96.M0(2131748938, null), false, false);
            return;
        }
        int i = this.c2;
        if (i == 19 || i == 32 || j1()) {
            boolean k = on0.k();
            w16 w16Var = this.z2;
            if (!k) {
                w16Var.f.setText(k96.M0(i1() ? 2131753622 : 2131753660, null));
                return;
            }
            yg8 yg8Var = w16Var.f;
            ng1 ng1Var = this.X1;
            if (ng1Var == null || !ng1Var.d) {
                M0 = k96.M0(i1() ? 2131753622 : 2131753660, null);
            } else {
                M0 = k96.M0(2131753588, null);
            }
            yg8Var.setText(M0);
            ng1 ng1Var2 = this.X1;
            if (ng1Var2 == null || !ng1Var2.m) {
                return;
            }
            this.z2.f.setText(k96.M0(2131747638, null));
            return;
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new cm2(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) k96.M0(2131751750, null));
            this.z2.f.setText(spannableStringBuilder);
            return;
        }
        if (y6c.h(this.a).p() || na7.q1(this.a).E3() || this.I2) {
            this.z2.f.setText(k96.M0(2131747638, null));
            w16 w16Var2 = this.z2;
            w16Var2.E.p = null;
            w16Var2.G.setVisibility(8);
            return;
        }
        this.z2.f.setText(k96.M0(2131749007, null));
        g26 g26Var = this.H2;
        if (g26Var == null) {
            w16 w16Var3 = this.z2;
            w16Var3.E.p = null;
            w16Var3.G.setVisibility(8);
            return;
        }
        int i2 = g26Var.e;
        int i3 = i2 + 1;
        int i4 = g26Var.f;
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
        w16 w16Var4 = this.z2;
        w16Var4.E.p = null;
        w16Var4.G.setVisibility(8);
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
    public final void x1() {
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
            if (i != 19 || hc2.N(e1())) {
                this.u1 = 0.24f;
                int i2 = this.f2;
                this.f2 = i2 + 1;
                this.U1 = i2;
                if (na7.q1(this.a).k4.O1.f) {
                    int i3 = this.f2;
                    this.f2 = i3 + 1;
                    this.n2 = i3;
                }
            }
            u1();
            int i4 = this.f2;
            int i5 = i4 + 1;
            this.f2 = i5;
            this.o2 = i4;
            this.f2 = (this.p2.size() - 1) + i5;
        } else if (i == 31 || i == 32) {
            this.u1 = 0.24f;
            u1();
            int i6 = this.f2;
            this.j2 = i6;
            int i7 = i6 + 1;
            this.f2 = i7;
            this.o2 = i6;
            int size2 = (this.p2.size() - 1) + i7;
            this.f2 = size2;
            this.k2 = size2;
        } else if (!g1(i)) {
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
                        if (!na7.q1(this.a).E3()) {
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
