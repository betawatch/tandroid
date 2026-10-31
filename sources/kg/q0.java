package kg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h3;
import org.telegram.messenger.lp;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.oo;
import org.telegram.ui.un;
import org.telegram.ui.zc;
import vh.o8;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class q0 extends ha implements us {
    public static final /* synthetic */ int O2 = 0;
    public boolean A2;
    public wj0 B2;
    public final org.telegram.ui.ActionBar.k2 C2;
    public bi.t0 D2;
    public androidx.emoji2.text.p E2;
    public boolean F2;
    public TLRPC.Chat G2;
    public final xz H2;
    public Runnable I2;
    public int J2;
    public final vh.d K2;
    public int L2;
    public int M2;
    public String N2;
    public int P1;
    public boolean Q1;
    public int R1;
    public long S1;
    public TL_stories.TL_premium_boostsStatus T1;
    public h3 U1;
    public p0 V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Cells.q1 Y1;
    public final int Z1;
    public final ArrayList a2;
    public boolean b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public ArrayList m2;
    public boolean n2;
    public int o2;
    public o0 p2;
    public final HashSet q2;
    public final ArrayList r2;
    public final ArrayList s2;
    public ArrayList t2;
    public ArrayList u2;
    public ArrayList v2;
    public e0 w2;
    public final TextView x2;
    public vh.d y2;
    public Runnable z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i10, int i11, Context context, org.telegram.ui.ActionBar.k2 k2Var, p6 p6Var) {
        super(context, k2Var, false, p1(i10), p6Var);
        int i12 = 0;
        this.R1 = -1;
        this.X1 = false;
        this.a2 = new ArrayList();
        this.d2 = -1;
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.o2 = -1;
        this.q2 = new HashSet();
        this.r2 = new ArrayList();
        this.s2 = new ArrayList();
        this.t2 = new ArrayList();
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.A2 = false;
        this.J2 = 0;
        this.M2 = -4;
        P(t6.w0(t6.h5, this.I0));
        this.L2 = this.G0;
        this.C2 = k2Var;
        this.a = i11;
        this.Z1 = i10;
        b1();
        G1();
        int i13 = 1;
        int i14 = 2;
        if (i10 == 2) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new z(this, i12));
        } else if (i10 == 5) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new z(this, i14));
        }
        F1();
        if (i10 == 32 || q1()) {
            xz xzVar = new xz(getContext());
            this.H2 = xzVar;
            this.c.addView(xzVar, b6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            bi.t0 t0Var = this.D2;
            if (t0Var != null) {
                ((ViewGroup) t0Var.getParent()).removeView(this.D2);
            }
            this.k1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.x2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(this.w2.getTextView().getText());
            a7.V(textView, t6.Gi, p6Var);
            textView.setOnClickListener(new y(this, i12));
            int L = org.telegram.messenger.i0.L(8.0f);
            int i15 = t6.Ci;
            int w02 = t6.w0(i15, p6Var);
            int i16 = t6.d6;
            int o10 = i0.b.o(t6.w0(i16, p6Var), 120);
            org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, o10, o10);
            w6 N = a7.N(i15);
            w6 h = a7.h(i16, 120);
            textView.setBackground(k02);
            a7.k(textView, k02, N, h, p6Var);
        }
        if (i10 == 32) {
            ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            vh.d dVar = new vh.d(context, p6Var, true);
            this.K2 = dVar;
            dVar.k();
            dVar.i(cd.L0(2131753625, null), false, true);
            dVar.setOnClickListener(new y(this, i13));
            this.b.addView(dVar, b6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new a0(this, 3));
        }
        if (i10 == 19 || i10 == 18) {
            this.b.post(new a0(this, 4));
        }
    }

    public static androidx.emoji2.text.p o1(int i10, int i11) {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p();
        pVar.a = 0;
        pVar.d = null;
        pVar.e = null;
        pVar.f = null;
        pVar.b = 0;
        pVar.c = 0;
        if (i10 == 0) {
            pVar.b = vp.r1(i11).Q4;
            pVar.c = vp.r1(i11).R4;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = cd.a0("LimitReachedPinDialogs", null, 2131748964, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedPinDialogsPremium", null, 2131748962, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedPinDialogsLocked", null, 2131748963, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 33) {
            pVar.b = vp.r1(i11).n6;
            pVar.c = vp.r1(i11).o6;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = cd.a0(null, null, 2131748961, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0(null, null, 2131748959, Integer.valueOf(pVar.c));
            pVar.f = cd.a0(null, null, 2131748960, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 2) {
            pVar.b = vp.r1(i11).S4;
            pVar.c = vp.r1(i11).T4;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = cd.a0("LimitReachedPublicLinks", null, 2131748957, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedPublicLinksPremium", null, 2131748955, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedPublicLinksLocked", null, 2131748956, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 12) {
            pVar.b = vp.r1(i11).y6;
            pVar.c = vp.r1(i11).z6;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = cd.a0("LimitReachedFolderLinks", null, 2131748970, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedFolderLinksPremium", null, 2131748968, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedFolderLinksLocked", null, 2131748969, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 13) {
            pVar.b = vp.r1(i11).A6;
            pVar.c = vp.r1(i11).B6;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = cd.a0("LimitReachedSharedFolders", null, 2131748953, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedSharedFoldersPremium", null, 2131748951, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedSharedFoldersLocked", null, 2131748952, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 3) {
            pVar.b = vp.r1(i11).M4;
            pVar.c = vp.r1(i11).N4;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = cd.a0("LimitReachedFolders", null, 2131748967, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedFoldersPremium", null, 2131748965, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedFoldersLocked", null, 2131748966, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 4) {
            pVar.b = vp.r1(i11).O4;
            pVar.c = vp.r1(i11).P4;
            pVar.a = R.drawable.msg_limit_chats;
            pVar.d = cd.a0("LimitReachedChatInFolders", null, 2131748985, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedChatInFoldersPremium", null, 2131748983, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedChatInFoldersLocked", null, 2131748984, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 5) {
            pVar.b = vp.r1(i11).E4;
            pVar.c = vp.r1(i11).F4;
            pVar.a = R.drawable.msg_limit_groups;
            pVar.d = cd.a0("LimitReachedCommunities", null, 2131748982, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedCommunitiesPremium", null, 2131748980, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedCommunitiesLocked", null, 2131748981, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 6) {
            pVar.b = 100;
            pVar.c = zs.e3;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = cd.a0("LimitReachedFileSize", null, 2131748973, "2 GB", "4 GB");
            pVar.e = cd.a0("LimitReachedFileSizePremium", null, 2131748971, "4 GB");
            pVar.f = cd.a0("LimitReachedFileSizeLocked", null, 2131748972, "2 GB");
            return pVar;
        }
        if (i10 == 7) {
            pVar.b = 3;
            pVar.c = 4;
            pVar.a = R.drawable.msg_limit_accounts;
            pVar.d = cd.a0("LimitReachedAccounts", null, 2131748987, 3, Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedAccountsPremium", null, 2131748986, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedAccountsPremium", null, 2131748986, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 11) {
            pVar.b = 0;
            pVar.c = 0;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = cd.a0("LimitReachedAccounts", null, 2131748987, 0, Integer.valueOf(pVar.c));
            pVar.e = "";
            pVar.f = "";
            return pVar;
        }
        if (i10 == 14) {
            pVar.b = vp.r1(i11).j5;
            pVar.c = vp.r1(i11).k5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = cd.H(',', "LimitReachedStoriesCount2First", pVar.b) + "\n" + cd.H(',', "LimitReachedStoriesCount2Second", pVar.c);
            pVar.e = cd.H(',', "LimitReachedStoriesCount2Premium", pVar.c);
            pVar.f = cd.H(',', "LimitReachedStoriesCount2Premium", pVar.b);
            return pVar;
        }
        if (i10 == 15) {
            pVar.b = vp.r1(i11).l5;
            pVar.c = vp.r1(i11).m5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = cd.a0("LimitReachedStoriesWeekly", null, 2131748939, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748938, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748938, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 16) {
            pVar.b = vp.r1(i11).n5;
            pVar.c = vp.r1(i11).o5;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = cd.a0("LimitReachedStoriesMonthly", null, 2131748941, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = cd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(pVar.c));
            pVar.f = cd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return pVar;
        }
        pVar.b = vp.r1(i11).n5;
        pVar.c = vp.r1(i11).o5;
        pVar.a = R.drawable.filled_limit_boost;
        pVar.d = cd.a0("LimitReachedStoriesMonthly", null, 2131748941, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
        pVar.e = cd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(pVar.c));
        pVar.f = cd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(pVar.b));
        return pVar;
    }

    public static boolean p1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public static String u1(int i10) {
        switch (i10) {
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

    public static void w1(org.telegram.ui.ActionBar.k2 k2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, h3 h3Var, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || h3Var == null || k2Var.getContext() == null) {
            return;
        }
        q0 q0Var = new q0(32, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, k2Var.getResourceProvider());
        q0Var.A1(h3Var);
        q0Var.z1(tL_premium_boostsStatus, true);
        q0Var.B1(j10);
        if (z10) {
            k2Var.showDialog(q0Var);
        } else {
            q0Var.show();
        }
    }

    public final void A1(h3 h3Var) {
        this.U1 = h3Var;
        E1();
        F1();
    }

    public final void B1(long j10) {
        this.S1 = j10;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.G2 = chat;
        this.N2 = str;
        this.Q1 = !TextUtils.isEmpty(str) || w3.y(3, chat);
        this.t2 = new ArrayList(arrayList);
        this.u2 = arrayList2;
        this.v2 = arrayList3;
        HashSet hashSet = this.q2;
        hashSet.clear();
        if (this.Q1) {
            ArrayList arrayList4 = this.t2;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i11 = this.Z1;
        if ((i11 == 11 || i11 == 34) && !vp.r1(this.a).A3()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.t2.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            e0 e0Var = this.w2;
            if (e0Var != null && e0Var.getParent() != null) {
                ((ViewGroup) this.w2.getParent()).removeView(this.w2);
            }
            bi.t0 t0Var = this.D2;
            if (t0Var != null && t0Var.getParent() != null) {
                ((ViewGroup) this.D2.getParent()).removeView(this.D2);
            }
            tk0 tk0Var = this.k1;
            if (tk0Var != null) {
                tk0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void D1() {
        int i10;
        this.m2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i11 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.Z1 == 31) {
            i11 = 1;
        }
        vp r12 = vp.r1(this.a);
        lp lpVar = r12.r4;
        int max = Math.max(10, lpVar != null ? lpVar.e(r1()) : 0);
        lp lpVar2 = r12.s4;
        int max2 = Math.max(max, lpVar2 != null ? lpVar2.e(r1()) : 0);
        int max3 = r1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, r12.B5), r12.z5), r12.A5), r12.x5), r12.w5) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, r12.r5), r12.s5), r12.t5), r12.u5), r12.v5), r12.A4), r12.B4);
        ArrayList arrayList = null;
        while (i11 <= max3) {
            boolean r13 = r1();
            ArrayList arrayList2 = new ArrayList();
            vp r14 = vp.r1(this.a);
            if (!r13 && i11 >= r14.B4) {
                arrayList2.add(l0.a(R.drawable.menu_feature_translate, 2131753660));
            }
            l0 b10 = l0.b(R.drawable.menu_feature_stories, i11, "BoostFeatureStoriesPerDay");
            b10.f = true;
            arrayList2.add(b10);
            if (!r13) {
                l0 b11 = l0.b(R.drawable.menu_feature_reactions, i11, "BoostFeatureCustomReaction");
                b11.f = true;
                arrayList2.add(b11);
            }
            lp lpVar3 = r14.r4;
            int a2 = lpVar3 != null ? lpVar3.a(i11, false) : 0;
            lp lpVar4 = r14.s4;
            int a10 = lpVar4 != null ? lpVar4.a(i11, r13) : 0;
            if (!r13 && a2 > 0) {
                arrayList2.add(l0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
            }
            if (!r13 && a2 > 0) {
                arrayList2.add(l0.b(R.drawable.menu_feature_links, a2, "BoostFeatureReplyColor"));
            }
            if (!r13 && i11 >= r14.r5) {
                arrayList2.add(l0.a(R.drawable.menu_feature_links2, 2131753633));
            }
            if (a10 > 0) {
                arrayList2.add(l0.b(R.drawable.menu_feature_color_profile, a10, r13 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
            }
            if (r13 && i11 >= r14.y5) {
                arrayList2.add(l0.a(R.drawable.menu_feature_pack, 2131753651));
            }
            if ((!r13 && i11 >= r14.s5) || (r13 && i11 >= r14.w5)) {
                arrayList2.add(l0.a(R.drawable.menu_feature_cover, r13 ? 2131753637 : 2131753638));
            }
            if (r13 && i11 >= r14.B5) {
                arrayList2.add(l0.a(R.drawable.menu_feature_voice, 2131753628));
            }
            if ((!r13 && i11 >= r14.t5) || (r13 && i11 >= r14.x5)) {
                arrayList2.add(new l0(R.drawable.menu_feature_status, 2131753647, -1, "1000+", null));
            }
            if ((!r13 && i11 >= r14.u5) || (r13 && i11 >= r14.z5)) {
                arrayList2.add(l0.b(R.drawable.menu_feature_wallpaper, 8, r13 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
            }
            if ((!r13 && i11 >= r14.v5) || (r13 && i11 >= r14.A5)) {
                arrayList2.add(l0.a(R.drawable.menu_feature_custombg, r13 ? 2131753652 : 2131753653));
            }
            if (!r13 && i11 >= r14.A4) {
                arrayList2.add(l0.a(R.drawable.menu_feature_noads, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i10 < arrayList.size(); i10 + 1) {
                    l0 l0Var = (l0) arrayList.get(i10);
                    l0 l0Var2 = (l0) arrayList2.get(i10);
                    int i12 = l0Var.e;
                    i10 = (l0Var2 != null && ((l0Var.f && i12 > 2) || (l0Var.a == l0Var2.a && l0Var.b == l0Var2.b && TextUtils.equals(l0Var.c, l0Var2.c) && TextUtils.equals(l0Var.d, l0Var2.d) && i12 == l0Var2.e))) ? i10 + 1 : 0;
                }
                i11++;
            }
            ArrayList arrayList3 = this.m2;
            arrayList3.add(new k0(i11, arrayList3.isEmpty()));
            this.m2.addAll(arrayList2);
            arrayList = arrayList2;
            i11++;
        }
    }

    public final void E1() {
        String str = null;
        if (this.b2) {
            this.w2.c(cd.L0(2131749140, null), false, false);
            return;
        }
        int i10 = this.Z1;
        if (i10 != 19 && i10 != 32 && !s1()) {
            HashSet hashSet = this.q2;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    e0 e0Var = this.w2;
                    e0Var.r = false;
                    e0Var.d(true);
                    return;
                } else {
                    if (i10 == 2) {
                        str = cd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i10 == 5) {
                        str = cd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.w2.c(str, true, true);
                    return;
                }
            }
            e0 e0Var2 = this.w2;
            if (e0Var2.I == null) {
                lq lqVar = new lq(e0Var2.getContext(), null);
                e0Var2.I = lqVar;
                lqVar.setGravity(3);
                lq lqVar2 = e0Var2.I;
                int i11 = t6.Ci;
                int i12 = t6.Gi;
                kq kqVar = lqVar2.a;
                kqVar.v = i11;
                kqVar.w = i12;
                kqVar.b = 0.8f;
                e0Var2.setClipChildren(false);
                e0Var2.addView(e0Var2.I, b6.e(-1, 24, 16));
            }
            if (!this.Q1) {
                this.w2.c(cd.L0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.w2.c(cd.L0(2131745636, null), true, true);
            } else {
                this.w2.c(cd.L0(2131754557, null), true, true);
            }
            this.w2.I.a.c(hashSet.size(), true);
            this.w2.invalidate();
            return;
        }
        h3 h3Var = this.U1;
        boolean z10 = h3Var.a;
        if ((z10 || h3Var.b) && !h3Var.l && !h3Var.d) {
            if (h3Var.m) {
                this.w2.c(cd.L0(2131747847, null), true, true);
                return;
            }
            e0 e0Var3 = this.w2;
            e0Var3.r = false;
            e0Var3.d(true);
            return;
        }
        vh.d dVar = this.K2;
        if (z10) {
            if (mg.k0.i()) {
                this.w2.c(cd.L0(2131753591, null), true, true);
            } else {
                this.w2.c(cd.L0(r1() ? 2131753625 : 2131753663, null), true, true);
            }
            this.y2.i(cd.L0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(cd.L0(2131753625, null), true, true);
                return;
            }
            return;
        }
        if (h3Var.m) {
            this.y2.i(cd.L0(2131747847, null), true, true);
            if (dVar != null) {
                dVar.i(cd.L0(2131747847, null), true, true);
            }
            this.w2.c(cd.L0(2131747847, null), true, true);
            return;
        }
        if (mg.k0.i()) {
            if (dVar != null) {
                dVar.i(cd.L0(2131753625, null), true, true);
            }
            this.y2.i(cd.L0(2131753664, null), true, true);
            this.w2.c(cd.L0(2131753591, null), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(cd.L0(2131747847, null), true, true);
        }
        this.y2.i(cd.L0(2131747847, null), true, true);
        this.w2.c(cd.L0(2131747847, null), true, true);
    }

    public final void F1() {
        String L0;
        if (this.b2) {
            this.w2.c(cd.L0(2131749140, null), false, false);
            return;
        }
        int i10 = this.Z1;
        if (i10 == 19 || i10 == 32 || s1()) {
            if (!mg.k0.i()) {
                this.w2.f.setText(cd.L0(r1() ? 2131753625 : 2131753663, null));
                return;
            }
            w0 w0Var = this.w2.f;
            h3 h3Var = this.U1;
            if (h3Var == null || !h3Var.d) {
                L0 = cd.L0(r1() ? 2131753625 : 2131753663, null);
            } else {
                L0 = cd.L0(2131753591, null);
            }
            w0Var.setText(L0);
            h3 h3Var2 = this.U1;
            if (h3Var2 == null || !h3Var2.m) {
                return;
            }
            this.w2.f.setText(cd.L0(2131747847, null));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new dq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) cd.L0(2131751762, null));
            this.w2.f.setText(spannableStringBuilder);
            return;
        }
        if (d20.i(this.a).q() || vp.r1(this.a).A3() || this.F2) {
            this.w2.f.setText(cd.L0(2131747847, null));
            e0 e0Var = this.w2;
            e0Var.D.p = null;
            e0Var.F.setVisibility(8);
            return;
        }
        this.w2.f.setText(cd.L0(2131749208, null));
        androidx.emoji2.text.p pVar = this.E2;
        if (pVar == null) {
            e0 e0Var2 = this.w2;
            e0Var2.D.p = null;
            e0Var2.F.setVisibility(8);
            return;
        }
        int i11 = pVar.b;
        int i12 = i11 + 1;
        int i13 = pVar.c;
        if (i12 == i13) {
            this.w2.setIcon(R.raw.addone_icon);
            return;
        }
        if (i11 != 0 && i13 != 0) {
            float f7 = i13 / i11;
            if (f7 >= 1.6f && f7 <= 2.5f) {
                this.w2.setIcon(R.raw.double_icon);
                return;
            }
        }
        e0 e0Var3 = this.w2;
        e0Var3.D.p = null;
        e0Var3.F.setVisibility(8);
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.e2 = -1;
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.R1 = -1;
        this.j2 = -1;
        this.l2 = -1;
        this.c2 = 1;
        this.d2 = 0;
        int i10 = this.Z1;
        if (i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 27 || i10 == 28 || i10 == 22 || i10 == 23 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 21 || i10 == 30 || i10 == 35) {
            if (i10 != 19 || w3.N(n1())) {
                this.r1 = 0.24f;
                int i11 = this.c2;
                this.c2 = i11 + 1;
                this.R1 = i11;
                if (vp.r1(this.a).q4) {
                    int i12 = this.c2;
                    this.c2 = i12 + 1;
                    this.k2 = i12;
                }
            }
            D1();
            int i13 = this.c2;
            int i14 = i13 + 1;
            this.c2 = i14;
            this.l2 = i13;
            this.c2 = (this.m2.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.r1 = 0.24f;
            D1();
            int i15 = this.c2;
            this.g2 = i15;
            int i16 = i15 + 1;
            this.c2 = i16;
            this.l2 = i15;
            int size = (this.m2.size() - 1) + i16;
            this.c2 = size;
            this.h2 = size;
        } else if (!p1(i10)) {
            if (i10 == 11 || i10 == 34) {
                this.r1 = 0.24f;
            } else {
                int i17 = this.c2;
                this.e2 = i17;
                this.c2 = i17 + 2;
                this.f2 = i17 + 1;
            }
            if (this.A2) {
                int i18 = this.c2;
                this.c2 = i18 + 1;
                this.i2 = i18;
            } else if (i10 != 11 || this.Q1) {
                if (i10 != 11 || vp.r1(this.a).A3() || ((((arrayList = this.v2) == null || arrayList.isEmpty()) && ((arrayList2 = this.u2) == null || arrayList2.size() < this.t2.size())) || (arrayList3 = this.v2) == null || arrayList3.size() != 1 || (arrayList4 = this.u2) == null || arrayList4.size() != 1 || !this.Q1)) {
                    int i19 = this.c2;
                    this.g2 = i19;
                    if (i10 == 11 || i10 == 34) {
                        this.c2 = this.t2.size() + i19;
                    } else if (i10 == 5) {
                        this.c2 = this.r2.size() + i19;
                    } else {
                        this.c2 = this.a2.size() + i19;
                    }
                    this.h2 = this.c2;
                }
                if (this.h2 - this.g2 > 1) {
                    int i20 = this.c2;
                    this.c2 = i20 + 1;
                    this.j2 = i20;
                }
            }
        }
        this.k1.getAdapter().f();
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        return new j0(this);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        int i10 = this.Z1;
        if (i10 == 11) {
            return cd.L0(2131752401, null);
        }
        if (i10 == 34) {
            return cd.L0(2131752622, null);
        }
        if (i10 == 35) {
            return cd.L0(2131743899, null);
        }
        switch (i10) {
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
                return cd.L0(2131743899, null);
            case 19:
            case zs.T /* 30 */:
                return cd.L0(r1() ? 2131753625 : 2131753663, null);
            case zs.U /* 31 */:
                return cd.L0(2131753600, null);
            case 32:
                return cd.L0(2131753625, null);
            default:
                return cd.L0(2131748988, null);
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final void U0(uu0 uu0Var) {
        int i10;
        Context context = uu0Var.getContext();
        vh.d dVar = new vh.d(context, this.I0, true);
        this.y2 = dVar;
        dVar.setFlickeringLoading(true);
        this.y2.i(cd.L0(2131753664, null), false, true);
        int i11 = 2;
        this.y2.setOnClickListener(new y(this, i11));
        e0 e0Var = new e0(this, context, this.I0);
        this.w2 = e0Var;
        e6.b(e0Var, 0.02f, 1.2f);
        int i12 = 3;
        if (!this.p1 && (i10 = this.Z1) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            bi.t0 t0Var = new bi.t0(this, context, i12);
            this.D2 = t0Var;
            a7.i(t6.h5, t0Var, this.I0);
            uu0Var.addView(this.D2, b6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        e0 e0Var2 = this.w2;
        float f7 = (this.t0 / org.telegram.messenger.i0.p) + 16.0f;
        uu0Var.addView(e0Var2, b6.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int L = org.telegram.messenger.i0.L(72.0f);
        tk0 tk0Var = this.k1;
        tk0Var.setPadding(0, 0, 0, L);
        tk0Var.setClipToPadding(false);
        tk0Var.setClipChildren(false);
        tk0Var.setOnItemClickListener(new ag.y0(this, 6));
        tk0Var.setOnItemLongClickListener(new b0(this, i11));
        this.w2.w.setOnClickListener(new ag.t0(7, this, context));
        this.w2.h.setOnClickListener(new y(this, i12));
        this.B2 = new wj0(tk0Var, true);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull M0;
        if (i10 != zs.V2) {
            if (i10 != zs.U2) {
                if (i10 == zs.T2) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.U1 == null) {
                return;
            }
            this.T1.boosts += intValue;
            if (this.Z1 == 32 && (M0 = vp.r1(this.a).M0(-this.S1)) != null) {
                M0.boosts_applied += intValue;
            }
            t1();
            z1(tL_premium_boostsStatus, this.W1);
            h3 h3Var = this.U1;
            h3Var.m = this.T1.next_level_boosts <= 0;
            h3Var.l = true;
            h3Var.a(tL_premium_myBoosts);
            if (v1()) {
                wb Q = new cc(this.c, this.I0).Q(R.raw.ic_boosts_replace, 30, cd.G(intValue, "BoostingReassignedFromPlural", cd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
        org.telegram.ui.ActionBar.k2 lastFragment = k2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof sg.o) {
            List fragmentStack = k2Var.getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.k2 k2Var2 = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack) : null;
            org.telegram.ui.ActionBar.k2 k2Var3 = fragmentStack.size() >= 3 ? (org.telegram.ui.ActionBar.k2) sc.e.g(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (org.telegram.ui.ActionBar.k2) sc.e.g(4, fragmentStack) : null;
            if (k2Var2 instanceof oo) {
                ((ActionBarLayout) k2Var.getParentLayout()).c0(k2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                mg.p.f(k2Var3, chat, false);
                return;
            } else {
                if (k2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) k2Var.getParentLayout()).c0(k2Var3, false);
                }
                lastFragment.finishFragment();
                mg.p.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof un) && booleanValue) {
            mg.p.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof zc) && booleanValue) {
            List fragmentStack2 = k2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                org.telegram.ui.ActionBar.k2 k2Var4 = (org.telegram.ui.ActionBar.k2) fragmentStack2.get(size);
                if ((k2Var4 instanceof un) || (k2Var4 instanceof ay)) {
                    r6 = k2Var4;
                    break;
                }
                arrayList.add(k2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) k2Var.getParentLayout()).c0((org.telegram.ui.ActionBar.k2) obj, false);
            }
            k2Var.finishFragment();
            dismiss();
            mg.p.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            o8 o8Var = o8.F2;
            if (o8Var == null || !o8Var.d) {
                dismiss();
                mg.p.f(LaunchActivity.Q(), chat, false);
                return;
            }
            un ha = un.ha(-chat.id);
            LaunchActivity.Q().presentFragment(ha, false, false);
            o8.w();
            dismiss();
            mg.p.f(ha, chat, false);
            return;
        }
        o8 o8Var2 = o8.F2;
        if (o8Var2 != null && o8Var2.d) {
            un ha2 = un.ha(-chat.id);
            LaunchActivity.Q().presentFragment(ha2, false, false);
            o8.w();
            dismiss();
            mg.p.f(ha2, chat, true);
            return;
        }
        List fragmentStack3 = k2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack3) : null;
        k2Var.finishFragment();
        dismiss();
        if (r6 instanceof un) {
            mg.p.f(r6, chat, true);
        }
    }

    public final void h1(final s80 s80Var, boolean z10) {
        if (!s80Var.a() || z10) {
            final int i10 = 1;
            s80Var.setLoading(true);
            vp.r1(this.a).G0();
            final int i11 = 0;
            mg.k0.a(-this.S1, Arrays.asList(Integer.valueOf(this.U1.g)), new q20(this) { // from class: kg.c0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            q0 q0Var = this.b;
                            vp.r1(q0Var.a).G0().a(q0Var.S1, new d0(q0Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            s80 s80Var2 = s80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.i0.h3(new k2.u(5, this.b, s80Var2), intValue * 1000);
                                    break;
                                } else {
                                    mg.p.g(intValue);
                                }
                            }
                            s80Var2.setLoading(false);
                            break;
                    }
                }
            }, new q20(this) { // from class: kg.c0
                public final /* synthetic */ q0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            q0 q0Var = this.b;
                            vp.r1(q0Var.a).G0().a(q0Var.S1, new d0(q0Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            s80 s80Var2 = s80Var;
                            if (startsWith) {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                if (intValue <= 5) {
                                    org.telegram.messenger.i0.h3(new k2.u(5, this.b, s80Var2), intValue * 1000);
                                    break;
                                } else {
                                    mg.p.g(intValue);
                                }
                            }
                            s80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void i1() {
        if (this.y2.isAttachedToWindow()) {
            h1(this.y2, false);
            return;
        }
        vh.d dVar = this.K2;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            h1(this.w2, false);
        } else {
            h1(dVar, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.T1.boost_url;
        }
        int i10 = this.a;
        long j10 = -this.S1;
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(j10));
        if (TextUtils.isEmpty(w3.K(L0, false))) {
            return a1.g.l(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + w3.K(L0, false);
    }

    public final String l1(boolean z10) {
        String str;
        int i10;
        if (this.Z1 == 32) {
            TLRPC.Chat n12 = n1();
            TLRPC.ChatFull M0 = vp.r1(this.a).M0(-this.S1);
            return cd.G(Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0), "BoostingRemoveRestrictionsSubtitle", n12 == null ? "" : n12.title);
        }
        TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-this.S1));
        if (L0 == null) {
            str = cd.L0(r1() ? 2131754876 : 2131754904, null);
        } else {
            str = L0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (s1() && this.T1.next_level_boosts != 0 && z10) {
            i10 = r1() ? 2131749429 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.T1;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return cd.a0(null, null, i10, str, cd.G(i11, "MoreBoosts", Integer.valueOf(i11)));
        }
        if (z11 && this.U1.d) {
            if (this.T1.level == 1) {
                return cd.a0(null, null, r1() ? 2131749502 : 2131752450, new Object[0]);
            }
            return cd.a0(null, null, r1() ? 2131749501 : 2131752449, Integer.valueOf(this.T1.level), cd.G(this.T1.level, "BoostStories", new Object[0]));
        }
        if (this.U1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.T1;
            if (tL_premium_boostsStatus3.level == 0) {
                i10 = r1() ? 2131749429 : 2131752352;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.T1;
                int i12 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return cd.a0(null, null, i10, str, cd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return cd.a0(null, null, r1() ? 2131749501 : 2131752449, Integer.valueOf(this.T1.level), cd.G(this.T1.level + 1, "BoostStories", new Object[0]));
            }
            i10 = r1() ? 2131749429 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.T1;
            int i13 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return cd.a0(null, null, i10, str, cd.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.T1;
        if (tL_premium_boostsStatus6.level == 0) {
            i10 = r1() ? 2131749429 : 2131752352;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.T1;
            int i14 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return cd.a0(null, null, i10, str, cd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return cd.a0(null, null, r1() ? 2131749501 : 2131752449, Integer.valueOf(this.T1.level), cd.G(this.T1.level + 1, "BoostStories", new Object[0]));
        }
        i10 = r1() ? 2131749429 : 2131752352;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.T1;
        int i15 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return cd.a0(null, null, i10, str, cd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
    }

    public final String m1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return cd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.U1.d) {
            return cd.L0(r1() ? 2131753625 : 2131753663, null);
        }
        boolean z10 = this.W1;
        int i10 = this.Z1;
        if (!z10) {
            if (i10 == 32) {
                return cd.L0(r1() ? 2131753625 : 2131753663, null);
            }
            if (this.U1.d) {
                return cd.L0(r1() ? 2131742864 : 2131742866, null);
            }
            return cd.L0(r1() ? 2131753527 : 2131753528, null);
        }
        if (i10 == 32) {
            return cd.L0(r1() ? 2131753625 : 2131753663, null);
        }
        TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-this.S1));
        if (this.U1.d) {
            return cd.a0("YouBoostedChannel2", null, 2131742865, L0.title);
        }
        return cd.L0(r1() ? 2131753625 : 2131753663, null);
    }

    public final TLRPC.Chat n1() {
        return vp.r1(this.a).L0(Long.valueOf(-this.S1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.V2);
        zs.f(this.a).c(this, zs.U2);
        zs.f(this.a).c(this, zs.T2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.a).n(this, zs.V2);
        zs.f(this.a).n(this, zs.U2);
        zs.f(this.a).n(this, zs.T2);
    }

    public final boolean q1() {
        int i10 = this.Z1;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean r1() {
        return !w3.V(vp.r1(this.a).L0(Long.valueOf(-this.S1)));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.L2 || (w02 = t6.w0(t6.h5, this.I0)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.L2 = w02;
            E0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final boolean s1() {
        return q1() && w3.N(n1());
    }

    public final void t1() {
        o0 o0Var = this.p2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        o0Var.b++;
        o0Var.a = w7.u.a((i10 - r3) / i11, 0.0f, 1.0f);
        o0Var.W = true;
        o0Var.a0 = o0Var.n;
        o0Var.i(i10, true);
        o0Var.I.requestLayout();
        o0Var.requestLayout();
    }

    public final boolean v1() {
        zs f7 = zs.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        h3 h3Var = this.U1;
        h3Var.getClass();
        h3 h3Var2 = new h3();
        h3Var2.a = h3Var.a;
        h3Var2.b = h3Var.b;
        h3Var2.c = h3Var.c;
        h3Var2.d = h3Var.d;
        h3Var2.e = h3Var.e;
        h3Var2.g = h3Var.g;
        h3Var2.h = h3Var.h;
        h3Var2.i = h3Var.i;
        h3Var2.j = h3Var.j;
        h3Var2.k = h3Var.k;
        h3Var2.m = h3Var.m;
        int i10 = 0;
        f7.m(zs.p3, tL_premium_boostsStatus, h3Var2, Long.valueOf(this.S1));
        vh.d dVar = this.K2;
        if (dVar != null) {
            TLRPC.ChatFull M0 = vp.r1(this.a).M0(-this.S1);
            int max = Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0);
            if (max == 0) {
                zs.f(this.a).m(zs.o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new g0(i10));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.V1, transitionSet);
        p0 p0Var = this.V1;
        mg.b bVar = p0Var.c;
        int indexOfChild = p0Var.indexOfChild(p0Var.b);
        q0 q0Var = p0Var.e;
        if (q0Var.W1) {
            int indexOfChild2 = p0Var.indexOfChild(p0Var.d);
            p0Var.removeView(p0Var.d);
            p0Var.d.removeView(p0Var.a);
            p0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(p0Var.getContext());
            p0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            p0Var.d.setWeightSum(1.0f);
            p0Var.d.addView(p0Var.a, b6.p(-2, -2, 1.0f, 0));
            p0Var.d.addView(bVar, b6.t(-2, -2, 48, 0, 2, 0, 0));
            p0Var.addView(p0Var.d, indexOfChild2, b6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = p0Var.indexOfChild(p0Var.a);
            p0Var.removeView(p0Var.a);
            TextView textView = new TextView(p0Var.getContext());
            p0Var.a = textView;
            textView.setTypeface(org.telegram.messenger.i0.o());
            p0Var.a.setTextSize(1, 20.0f);
            a7.V(p0Var.a, t6.G6, q0Var.I0);
            p0Var.a.setGravity(17);
            p0Var.addView(p0Var.a, indexOfChild3, b6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        p0Var.removeView(p0Var.b);
        TextView textView2 = new TextView(p0Var.getContext());
        p0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = p0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), p0Var.b.getLineSpacingMultiplier() * 1.1f);
        p0Var.b.setGravity(1);
        a7.V(p0Var.b, t6.G6, q0Var.I0);
        p0Var.addView(p0Var.b, indexOfChild, b6.t(-2, -2, 1, 24, -2, 24, 17));
        this.V1.a.setText(m1());
        TextView textView4 = this.V1.b;
        vp r12 = vp.r1(this.a);
        boolean r13 = r1();
        int i11 = this.Z1;
        String str = null;
        if (i11 == 20) {
            str = cd.a0(null, null, r13 ? 2131749427 : 2131752349, Integer.valueOf(j1()));
        } else if (i11 == 24) {
            str = cd.a0(null, null, r13 ? 2131749423 : 2131752346, Integer.valueOf(j1()));
        } else if (i11 == 29) {
            str = cd.a0(null, null, 2131749426, Integer.valueOf(r12.y5));
        } else if (i11 == 30) {
            str = cd.a0(null, null, 2131752343, Integer.valueOf(r12.A4));
        } else if (i11 == 35) {
            str = cd.a0(null, null, 2131752350, Integer.valueOf(r12.B4));
        } else if (i11 == 25) {
            str = cd.a0(null, null, r13 ? 2131749424 : 2131752347, Integer.valueOf(r13 ? r12.x5 : r12.t5));
        } else if (i11 == 26) {
            str = cd.a0(null, null, r13 ? 2131749419 : 2131752341, Integer.valueOf(r13 ? r12.x5 : r12.t5));
        } else if (i11 == 27) {
            str = cd.a0(null, null, r13 ? 2131749421 : 2131752344, Integer.valueOf(r12.r5));
        } else if (i11 == 28) {
            str = cd.a0(null, null, r13 ? 2131749422 : 2131752345, Integer.valueOf(r13 ? r12.w5 : r12.s5));
        } else if (i11 == 22) {
            str = cd.a0(null, null, r13 ? 2131749420 : 2131752342, Integer.valueOf(r13 ? r12.z5 : r12.u5));
        } else if (i11 == 23) {
            str = cd.a0(null, null, r13 ? 2131749425 : 2131752348, Integer.valueOf(r13 ? r12.A5 : r12.v5));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.i0.W2(str));
        E1();
        xz xzVar = this.H2;
        xzVar.c(false);
        try {
            xzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.V1.c.a(this.U1.i, true);
        this.k1.y0(0);
        if (i11 == 32) {
            this.V1.c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String G = cd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.n2) {
                x1Var.T = org.telegram.messenger.i0.W2(cd.a0("RevokeLinkAlertChannel", null, 2131746038, vp.r1(this.a).U2 + "/" + w3.K(chat, false), chat.title));
            } else {
                x1Var.T = org.telegram.messenger.i0.W2(cd.a0("RevokeLinkAlert", null, 2131746039, vp.r1(this.a).U2 + "/" + w3.K(chat, false), chat.title));
            }
        } else if (this.n2) {
            x1Var.T = org.telegram.messenger.i0.W2(cd.a0("RevokeLinksAlertChannel", null, 2131746035, new Object[0]));
        } else {
            x1Var.T = org.telegram.messenger.i0.W2(cd.a0("RevokeLinksAlert", null, 2131746036, new Object[0]));
        }
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        alertDialog$Builder.k(cd.L0(2131746041, null), new ag.m(16, this, arrayList));
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            a7.V(textView, t6.q7, this.I0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.N2)) {
            TLRPC.ChatFull M0 = vp.r1(this.a).M0(this.G2.id);
            if (M0 == null) {
                dismiss();
                return;
            }
            if (this.G2.username != null) {
                str = "@" + this.G2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = M0.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.N2;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.q2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long M1 = vp.r1(this.a).M1(user.id);
            if (M1 <= 0) {
                M1 = o5.k(vp.r1(this.a).H2(user.id));
            }
            (M1 >= 0 ? arrayList : arrayList2).add(user);
        }
        int i10 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            s4.b0(this.a, arrayList3, 1, new ag.l(this, 15));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z12 = z10;
            Iterator it3 = it2;
            oz b10 = oz.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            qz.C(this.a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.i0.g3(new a0(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.T1 = tL_premium_boostsStatus;
        this.W1 = z10;
        G1();
    }
}
