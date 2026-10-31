package mg;

import ag.j3;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.fw;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.qi;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.h7;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.p4;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wh;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.al;
import org.telegram.ui.iq;
import org.telegram.ui.iy;
import org.telegram.ui.kg0;
import org.telegram.ui.lc;
import org.telegram.ui.ma0;
import org.telegram.ui.qc;
import org.telegram.ui.rg0;
import org.telegram.ui.t5;
import org.telegram.ui.te1;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.vu;
import org.telegram.ui.w71;
import org.telegram.ui.wf0;
import org.telegram.ui.yi0;
import org.telegram.ui.zc;
import org.webrtc.MediaStreamTrack;
import rh.r7;
import th.g3;
import th.n5;
import th.o7;
import th.q3;
import th.u3;
import th.y3;
import th.z4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i10, View view) {
        tf0 tf0Var = (tf0) this.b;
        Context context = (Context) this.c;
        HashSet hashSet = tf0Var.r1;
        pf0 pf0Var = tf0Var.j1;
        if (org.telegram.messenger.i0.E1(context)) {
            ArrayList arrayList = tf0Var.w1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof p8) {
                    int S = pf0Var.S(i10) - 1;
                    int Q = pf0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    sf0 sf0Var = (sf0) tf0Var.t1.get(S);
                    if (Q != sf0Var.b() || hashSet.contains(sf0Var)) {
                        return;
                    }
                    if (sf0Var.e && sf0Var.f < sf0Var.b.size()) {
                        int min = Math.min(sf0Var.f + 50, sf0Var.b.size());
                        sf0Var.f = min;
                        if (min == sf0Var.b.size()) {
                            sf0Var.e = false;
                        }
                        tf0Var.J0(null);
                        pf0Var.X(true);
                        return;
                    }
                    hashSet.add(sf0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = tf0Var.q1;
                    tL_messages_getPollVotes.id = tf0Var.o1.f1();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = sf0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = sf0Var.c;
                    ConnectionsManager.getInstance(tf0Var.a).sendRequest(tL_messages_getPollVotes, new t20(2, tf0Var, sf0Var));
                    return;
                }
                if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h == null && pollVotesAlert$UserCell.n == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    TLRPC.User user = pollVotesAlert$UserCell.h;
                    if (user != null) {
                        bundle.putLong("user_id", user.id);
                    } else {
                        bundle.putLong("chat_id", pollVotesAlert$UserCell.n.id);
                    }
                    tf0Var.dismiss();
                    k2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (T instanceof un) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User j10 = ((un) T).j();
                            tf0Var.i1.getChildAt(0);
                            if (j10 != null && j10.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.f5(i11);
                        } else {
                            TLRPC.Chat chat = ((un) T).e;
                            if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                i11 = 1;
                            }
                            profileActivity.f5(i11);
                        }
                    }
                    T.presentFragment(profileActivity);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[EDGE_INSN: B:32:0x00ca->B:33:0x00ca BREAK  A[LOOP:0: B:24:0x00aa->B:30:0x00c5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(int i10, View view) {
        String str;
        int i11;
        int i12;
        boolean z10;
        int i13;
        uo0 uo0Var;
        vu vuVar = (vu) this.b;
        k2 k2Var = (k2) this.c;
        cp cpVar = (cp) vuVar.c.d.get(i10);
        s6 i14 = cpVar.a.i(vuVar.w);
        yf.b bVar = cpVar.a.c;
        String str2 = null;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.b;
            if (str == null) {
                str = bVar.a;
            }
        }
        if (!str.equals("🏠")) {
            yf.b bVar2 = cpVar.a.c;
            if (bVar2 != null && (str2 = bVar2.b) == null) {
                str2 = bVar2.a;
            }
            if (!str2.equals("🎨")) {
                i11 = -1;
                if (i14 == null) {
                    TLRPC.TL_theme tL_theme = ((x3) cpVar.a.f.get(vuVar.w)).b;
                    s6 Q0 = t6.Q0(t6.r0(tL_theme.settings.get(((x3) cpVar.a.f.get(vuVar.w)).d)));
                    if (Q0 != null) {
                        r6 r6Var = (r6) Q0.c0.get(tL_theme.id);
                        if (r6Var == null) {
                            r6Var = Q0.f(tL_theme, k2Var.getCurrentAccount(), 0);
                        }
                        i11 = r6Var.a;
                        Q0.u(i11);
                    }
                    i14 = Q0;
                }
                t6.K1(i14, false, i11, view);
                vuVar.r = i10;
                i12 = 0;
                while (true) {
                    z10 = true;
                    if (i12 < vuVar.c.d.size()) {
                        break;
                    }
                    cp cpVar2 = (cp) vuVar.c.d.get(i12);
                    if (i12 != vuVar.r) {
                        z10 = false;
                    }
                    cpVar2.d = z10;
                    i12++;
                }
                vuVar.c.E(vuVar.r);
                for (i13 = 0; i13 < vuVar.a.getChildCount(); i13++) {
                    e11 e11Var = (e11) vuVar.a.getChildAt(i13);
                    if (e11Var != view && (uo0Var = e11Var.J) != null) {
                        org.telegram.messenger.i0.r(uo0Var);
                        e11Var.J.run();
                    }
                }
                ((e11) view).d();
                if (i14 != null) {
                    SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit();
                    edit.putString((vuVar.s == 1 || i14.q()) ? "lastDarkTheme" : "lastDayTheme", i14.m());
                    edit.commit();
                }
                t6.M1(k2Var);
            }
        }
        i11 = ((x3) cpVar.a.f.get(vuVar.w)).e;
        if (i14 == null) {
        }
        t6.K1(i14, false, i11, view);
        vuVar.r = i10;
        i12 = 0;
        while (true) {
            z10 = true;
            if (i12 < vuVar.c.d.size()) {
            }
            cpVar2.d = z10;
            i12++;
        }
        vuVar.c.E(vuVar.r);
        while (i13 < vuVar.a.getChildCount()) {
        }
        ((e11) view).d();
        if (i14 != null) {
        }
        t6.M1(k2Var);
    }

    private final void c(int i10, View view) {
        iy.Y((iy) this.b, (Context) this.c, i10);
    }

    private final void d(int i10, View view) {
        v50.Y((v50) this.b, (Context) this.c, view, i10);
    }

    private final void e(int i10, View view) {
        kg0 kg0Var = (kg0) this.b;
        Context context = (Context) this.c;
        HashMap hashMap = kg0Var.k0;
        if (i10 == kg0Var.Q) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(kg0Var.e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                vp.r1(d20.s0).U3(user, false, false);
                kg0Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            return;
        }
        if (i10 == kg0Var.y) {
            ma0 ma0Var = new ma0(0, kg0Var.n);
            ma0Var.S = kg0Var.s0;
            kg0Var.presentFragment(ma0Var);
            return;
        }
        int i11 = kg0Var.D;
        if (i10 >= i11 && i10 < kg0Var.E) {
            c60 c60Var = new c60(context, (TLRPC.TL_chatInviteExported) kg0Var.i0.get(i10 - i11), kg0Var.d, hashMap, kg0Var, kg0Var.n, false, kg0Var.h);
            kg0Var.l0 = c60Var;
            c60Var.b2 = kg0Var.p0;
            c60Var.show();
            return;
        }
        int i12 = kg0Var.H;
        if (i10 >= i12 && i10 < kg0Var.I) {
            c60 c60Var2 = new c60(context, (TLRPC.TL_chatInviteExported) kg0Var.j0.get(i10 - i12), kg0Var.d, hashMap, kg0Var, kg0Var.n, false, kg0Var.h);
            kg0Var.l0 = c60Var2;
            c60Var2.show();
            return;
        }
        if (i10 == kg0Var.N) {
            if (kg0Var.c0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kg0Var.getParentActivity());
            String L0 = cd.L0(2131751576, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131751577, null);
            alertDialog$Builder.k(cd.L0(2131751599, null), new wf0(kg0Var));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            kg0Var.showDialog(x1Var);
            return;
        }
        int i13 = kg0Var.U;
        if (i10 < i13 || i10 >= kg0Var.V) {
            return;
        }
        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kg0Var.m0.get(i10 - i13);
        if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
            kg0Var.getMessagesController().U3((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
        }
        kg0 kg0Var2 = new kg0(kg0Var.n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
        kg0Var2.l0(kg0Var.d, null);
        kg0Var.presentFragment(kg0Var2);
    }

    private final void g(int i10, View view) {
        yi0.Y((yi0) this.b, (Context) this.c, view, i10);
    }

    private final void h(int i10, View view) {
        PrivacySettingsActivity.Z((PrivacySettingsActivity) this.b, (Context) this.c, view, i10);
    }

    private final void i(int i10, View view) {
        UsersSelectActivity.Y((UsersSelectActivity) this.b, (Context) this.c, view, i10);
    }

    private final void j(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y3 y3Var = (y3) this.b;
        o7 o7Var = (o7) this.c;
        k2 k2Var = o7Var.f;
        u3 u3Var = y3Var.x;
        g3 g3Var = y3Var.r;
        if (i10 < 0 || i10 >= u3Var.c.size()) {
            return;
        }
        q3 q3Var = (q3) u3Var.c.get(i10);
        TL_stories.StoryView storyView = q3Var.b;
        TL_stories.StoryReaction storyReaction = q3Var.c;
        if (storyView instanceof TL_stories.TL_storyView) {
            o7Var.V(ProfileActivity.z4(storyView.user_id));
            return;
        }
        if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
            k2Var.createOverlayStoryViewer().U(y3Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) q3Var.b).story, n5.a(g3Var));
            return;
        }
        if (storyReaction instanceof TL_stories.TL_storyReaction) {
            o7Var.V(ProfileActivity.z4(o5.o(storyReaction.peer_id)));
            return;
        }
        if (!(storyReaction instanceof TL_stories.TL_storyReactionPublicRepost)) {
            boolean z10 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
            if (z10 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                TLRPC.Message message = z10 ? storyReaction.message : storyView.message;
                Bundle bundle = new Bundle();
                long o10 = o5.o(message.peer_id);
                if (o10 >= 0) {
                    bundle.putLong("user_id", o10);
                } else {
                    bundle.putLong("chat_id", -o10);
                }
                bundle.putInt("message_id", message.id);
                o7Var.V(new un(bundle));
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        th.x3 x3Var = y3Var.E;
        int i11 = 0;
        int i12 = -1;
        if (x3Var != null && (arrayList = x3Var.i) != null) {
            int size = arrayList.size();
            while (i11 < y3Var.E.i.size()) {
                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) y3Var.E.i.get(i11);
                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                    storyItem.dialogId = o5.o(tL_storyReactionPublicRepost.peer_id);
                    if (storyReaction2 == storyReaction) {
                        i12 = arrayList2.size();
                    }
                    arrayList2.add(storyItem);
                }
                i11++;
            }
            i11 = size;
        }
        if (i12 < 0 || arrayList2.size() <= 1) {
            y3Var.G = null;
            k2Var.createOverlayStoryViewer().U(y3Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, n5.a(g3Var));
            return;
        }
        y3Var.G = new z4(y3Var.w, arrayList2);
        y3Var.H = i11;
        th.x3 x3Var2 = y3Var.E;
        o7 createOverlayStoryViewer = k2Var.createOverlayStoryViewer();
        Context context = y3Var.getContext();
        z4 z4Var = y3Var.G;
        n5 a2 = n5.a(g3Var);
        a2.e = new rh.d0(x3Var2, 14);
        createOverlayStoryViewer.Q(context, i12, z4Var, a2);
    }

    private final void k(int i10, View view) {
        a51 G;
        uh.l lVar = (uh.l) this.b;
        ph.h1 h1Var = (ph.h1) this.c;
        p51 p51Var = lVar.R1;
        if (p51Var == null || (G = p51Var.G(i10 - 1)) == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof m10) {
            h1Var.a(((m10) obj).a);
            lVar.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:438:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0826  */
    @Override // org.telegram.ui.Components.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, View view) {
        long j10;
        m4.c cVar;
        int i11;
        Object O;
        f5 f5Var;
        String str;
        String str2;
        String str3;
        String str4;
        y90 y90Var;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.a;
        long j11 = 0;
        int i13 = 13;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                w0 w0Var = (w0) obj2;
                k2 k2Var = (k2) obj;
                ArrayList arrayList = w0Var.V1;
                l0 l0Var = w0Var.q2;
                if (view instanceof og.a0) {
                    og.a0 a0Var = (og.a0) view;
                    int type = a0Var.getType();
                    boolean z10 = a0Var.e.h;
                    j10 = 0;
                    boolean z11 = !z10;
                    a0Var.setChecked(z11);
                    int i14 = og.a0.L;
                    if (type == 0) {
                        w0Var.p2 = z11;
                        w0Var.k1(false, false);
                    } else if (type == 1) {
                        a0Var.setDivider(z11);
                        w0Var.o2 = z11;
                        w0Var.k1(false, false);
                        ng.b bVar = w0Var.Y1;
                        int i15 = 0;
                        while (true) {
                            if (i15 < bVar.e.size()) {
                                ng.a aVar = (ng.a) bVar.e.get(i15);
                                if (aVar.a == 15) {
                                    int i16 = aVar.l;
                                    int i17 = og.a0.L;
                                    if (i16 == 1) {
                                        if (z10) {
                                            bVar.s(i15 + 1);
                                        } else {
                                            bVar.i(i15 + 1);
                                        }
                                    }
                                }
                                i15++;
                            }
                        }
                        w0Var.Y1.G();
                        if (w0Var.o2) {
                            org.telegram.messenger.i0.r(l0Var);
                        } else {
                            org.telegram.messenger.i0.h3(l0Var, 250L);
                        }
                    }
                } else {
                    j10 = 0;
                }
                if (view instanceof og.d) {
                    if (view instanceof og.e) {
                        int selectedType = ((og.e) view).getSelectedType();
                        int i18 = og.e.w;
                        if (selectedType == 2 || selectedType == 3) {
                            if (selectedType == 2 && w0Var.Z1 == selectedType) {
                                m4.c cVar2 = w0Var.j2;
                                if (cVar2 != null) {
                                    ((v1) cVar2.b).h1(1, arrayList);
                                    ((v) cVar2.c).i1.E(1);
                                    break;
                                }
                            } else {
                                w0Var.Z1 = selectedType;
                                w0Var.k1(true, true);
                                w0Var.j1(true);
                                w0Var.b1();
                            }
                        } else if (selectedType == 1) {
                            m4.c cVar3 = w0Var.j2;
                            if (cVar3 != null) {
                                ((v1) cVar3.b).h1(1, arrayList);
                                ((v) cVar3.c).i1.E(1);
                            }
                        } else {
                            w0Var.a2 = selectedType;
                            w0Var.k1(true, true);
                            w0Var.j1(true);
                            w0Var.b1();
                        }
                    } else {
                        og.d dVar = (og.d) view;
                        tk0 tk0Var = w0Var.k1;
                        if (dVar.b()) {
                            for (int i19 = 0; i19 < tk0Var.getChildCount(); i19++) {
                                View childAt = tk0Var.getChildAt(i19);
                                if (childAt.getClass().isInstance(dVar)) {
                                    ((og.d) childAt).c(childAt == dVar, true);
                                }
                            }
                        }
                    }
                }
                if (view instanceof og.w) {
                    int selectedType2 = ((og.w) view).getSelectedType();
                    if (w0Var.b2 == selectedType2 && (cVar = w0Var.j2) != null) {
                        ((v1) cVar.b).h1(3, w0Var.W1);
                        ((v) cVar.c).i1.E(1);
                    }
                    w0Var.b2 = selectedType2;
                    w0Var.k1(false, false);
                    break;
                } else if (view instanceof og.j) {
                    w0Var.d2 = ((TLRPC.TL_premiumGiftCodeOption) ((og.j) view).getGifCode()).months;
                    w0Var.k1(false, false);
                    w0Var.Y1.G();
                    break;
                } else if (view instanceof og.i) {
                    Context context = k2Var.getContext();
                    long j12 = w0Var.e2;
                    m0 m0Var = new m0(w0Var);
                    p6 p6Var = w0Var.I0;
                    p4 p4Var = new p4(p6Var);
                    l2.f fVar = new l2.f(context, p6Var);
                    ((z2) fVar.b).v0 = false;
                    ac0 ac0Var = new ac0(context, p6Var);
                    int i20 = p4Var.a;
                    ac0Var.setTextColor(i20);
                    ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                    ac0Var.setItemCount(5);
                    m mVar = new m(context, p6Var);
                    mVar.setWrapSelectorWheel(true);
                    mVar.setAllItemsCount(24);
                    mVar.setItemCount(5);
                    mVar.setTextColor(i20);
                    mVar.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                    mVar.setTag("HOUR");
                    n nVar = new n(context, p6Var);
                    nVar.setWrapSelectorWheel(true);
                    nVar.setAllItemsCount(60);
                    nVar.setItemCount(5);
                    nVar.setTextColor(i20);
                    nVar.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
                    o oVar = new o(context, p4Var, ac0Var, mVar, nVar);
                    oVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(context);
                    oVar.addView(frameLayout, b6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(cd.L0(2131753287, "BoostingSelectDateTime"));
                    textView.setTextColor(i20);
                    sc.e.t(textView, 1, 20.0f);
                    frameLayout.addView(textView, b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new n2(1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    oVar.addView(linearLayout, b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    long currentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    int i21 = calendar.get(1);
                    j3 j3Var = new j3(context, 1);
                    long j13 = vp.r1(d20.s0).o0 * 1000;
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(j13);
                    int i22 = calendar2.get(6);
                    calendar2.setTimeInMillis(System.currentTimeMillis());
                    calendar2.add(14, (int) j13);
                    int i23 = calendar2.get(11);
                    int i24 = calendar.get(12);
                    linearLayout.addView(ac0Var, b6.l(0.5f, 0, zs.t4));
                    ac0Var.setMinValue(0);
                    ac0Var.setMaxValue(i22 - 1);
                    ac0Var.setWrapSelectorWheel(false);
                    ac0Var.setTag("DAY");
                    ac0Var.setFormatter(new d(currentTimeMillis, calendar, i21, 0));
                    e eVar = new e(oVar, mVar, nVar, i23, i24, ac0Var);
                    ac0Var.setOnValueChangedListener(eVar);
                    mVar.setMinValue(0);
                    mVar.setMaxValue(23);
                    linearLayout.addView(mVar, b6.l(0.2f, 0, zs.t4));
                    mVar.setFormatter(new m4.v0(14));
                    mVar.setOnValueChangedListener(eVar);
                    nVar.setMinValue(0);
                    nVar.setMaxValue(11);
                    nVar.setValue(0);
                    nVar.setFormatter(new m4.v0(15));
                    linearLayout.addView(nVar, b6.l(0.3f, 0, zs.t4));
                    nVar.setOnValueChangedListener(eVar);
                    if (j12 > j10) {
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j12);
                        nVar.setValue(calendar.get(12) / 5);
                        mVar.setValue(calendar.get(11));
                        ac0Var.setValue(timeInMillis);
                        ac0Var.getValue();
                        eVar.t(ac0Var, ac0Var.getValue());
                        mVar.getValue();
                        eVar.t(mVar, mVar.getValue());
                    }
                    j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                    j3Var.setGravity(17);
                    j3Var.setTextColor(p4Var.g);
                    j3Var.setTextSize(1, 14.0f);
                    j3Var.setTypeface(org.telegram.messenger.i0.o());
                    j3Var.setBackground(j6.e(p4Var.h, 8.0f));
                    j3Var.setText(cd.L0(2131753543, "BoostingConfirm"));
                    oVar.addView(j3Var, b6.t(-1, 48, 83, 16, 15, 16, 16));
                    j3Var.setOnClickListener(new f(calendar, ac0Var, mVar, nVar, m0Var, fVar, 0));
                    z2 z2Var = (z2) fVar.b;
                    z2Var.N = oVar;
                    z2Var.show();
                    int i25 = p4Var.b;
                    z2Var.v0(i25);
                    z2Var.P(i25);
                    org.telegram.messenger.i0.p3(z2Var, i0.b.h(i25) > 0.699999988079071d);
                    break;
                } else if (view instanceof og.b) {
                    m4.c cVar4 = w0Var.j2;
                    if (cVar4 != null) {
                        ((v1) cVar4.b).h1(2, w0Var.U1);
                        ((v) cVar4.c).i1.E(1);
                        break;
                    }
                } else if (view instanceof og.y) {
                    TL_stars.TL_starsGiveawayOption option = ((og.y) view).getOption();
                    if (option != null) {
                        w0Var.h2 = option.stars;
                        w0Var.k1(true, true);
                        w0Var.j1(true);
                        w0Var.b1();
                        break;
                    }
                } else if (view instanceof r7) {
                    w0Var.c2 = true;
                    w0Var.k1(true, true);
                    break;
                }
                break;
            case 1:
                o1 o1Var = (o1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ArrayList arrayList2 = o1Var.P1;
                if (view instanceof qg.k) {
                    qg.k kVar = (qg.k) view;
                    if (kVar.getBoost().cooldown_until_date > 0) {
                        new cc(o1Var.c, o1Var.I0).G(R.raw.chats_infotip, 5, org.telegram.messenger.i0.W2(cd.G((int) vp.r1(d20.s0).r0, "BoostingWaitWarningPlural", new Object[0]))).k(true);
                        break;
                    } else {
                        if (arrayList2.contains(kVar.getBoost())) {
                            arrayList2.remove(kVar.getBoost());
                        } else {
                            arrayList2.add(kVar.getBoost());
                        }
                        kVar.c(arrayList2.contains(kVar.getBoost()), true);
                        o1Var.d1(true);
                        o1Var.T1.a(arrayList2, chat);
                        break;
                    }
                }
                break;
            case 2:
                t5.z0((t5) obj2, (Context) obj, view, i10);
                break;
            case 3:
                zc.a0((zc) obj2, (TLRPC.ChatFull) obj, view, i10);
                break;
            case 4:
                qc qcVar = (qc) obj;
                zc zcVar = ((lc) obj2).c;
                int i26 = qcVar.d;
                w71 w71Var = qcVar.b;
                lp lpVar = vp.r1(i26).r4;
                if (lpVar != null) {
                    ArrayList arrayList3 = lpVar.c;
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        i11 = ((kp) arrayList3.get(i10)).c;
                        zcVar.f = i11;
                        zcVar.d1(true);
                        zcVar.g1(true);
                        zcVar.h1();
                        if (view.getLeft() >= org.telegram.messenger.i0.L(24.0f) + w71Var.getPaddingLeft()) {
                            w71Var.w0(-((org.telegram.messenger.i0.L(48.0f) + w71Var.getPaddingLeft()) - view.getLeft()), 0, null);
                            break;
                        } else if (view.getWidth() + view.getLeft() > (w71Var.getMeasuredWidth() - w71Var.getPaddingRight()) - org.telegram.messenger.i0.L(24.0f)) {
                            w71Var.w0(m5.B(48.0f, w71Var.getMeasuredWidth() - w71Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                            break;
                        }
                    }
                }
                i11 = 0;
                zcVar.f = i11;
                zcVar.d1(true);
                zcVar.g1(true);
                zcVar.h1();
                if (view.getLeft() >= org.telegram.messenger.i0.L(24.0f) + w71Var.getPaddingLeft()) {
                }
                break;
            case 5:
                un unVar = (un) obj2;
                unVar.getClass();
                TLObject tLObject = (TLObject) ((rg0) obj).c.get(i10);
                if (tLObject != null) {
                    unVar.I7(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 6:
                iq.b0((iq) obj2, (Context) obj, view, i10);
                break;
            case 7:
                org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) obj2;
                p6 p6Var2 = (p6) obj;
                a51 G = zVar.f2.G(i10 - 1);
                if (G != null && G.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zVar.getContext(), p6Var2);
                    String L0 = cd.L0(2131754998, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = cd.L0(2131754997, null);
                    alertDialog$Builder.h(cd.L0(2131752589, null), null);
                    alertDialog$Builder.k(cd.L0(2131751599, null), new org.telegram.ui.Components.t(zVar, 0));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    break;
                }
                break;
            case 8:
                bi biVar = (bi) obj2;
                p6 p6Var3 = (p6) obj;
                bh bhVar = biVar.s3;
                uh[] uhVarArr = biVar.q2;
                k2 k2Var2 = biVar.W1;
                k2 Q = k2Var2 == null ? LaunchActivity.Q() : k2Var2;
                if (Q != null && Q.getParentActivity() != null) {
                    if (view instanceof wh) {
                        Activity parentActivity = Q.getParentActivity();
                        int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
                        if (intValue == 1) {
                            if (biVar.F3 || biVar.G3 || !biVar.N0()) {
                                if (!biVar.F3 && !biVar.G3) {
                                    kn knVar = new kn(1, biVar.getContext(), p6Var3, biVar);
                                    biVar.K1 = knVar;
                                    biVar.E1(knVar);
                                }
                                biVar.E1(biVar.a2);
                            }
                        } else if (intValue == 17) {
                            if (biVar.n2 == null && (k2Var2 instanceof un)) {
                                TLRPC.User j14 = ((un) k2Var2).j();
                                if (bi.f1(j14)) {
                                    kk kkVar = new kk(biVar, biVar.getContext(), biVar.D3, j14, p6Var3);
                                    biVar = biVar;
                                    biVar.n2 = kkVar;
                                    uhVarArr[11] = kkVar;
                                }
                            }
                            kk kkVar2 = biVar.n2;
                            if (kkVar2 != null) {
                                biVar.E1(kkVar2);
                            }
                        } else if (intValue == 3) {
                            if (biVar.H3 || !biVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.i0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                biVar.o1(true);
                            }
                        } else if (intValue == 4) {
                            if (biVar.E3 || !biVar.N0()) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                                        break;
                                    }
                                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                                    org.telegram.messenger.i0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                                    break;
                                }
                                biVar.q1(true);
                            }
                        } else if (intValue == 5) {
                            if (biVar.K3 || !biVar.N0()) {
                                if (biVar.K3 && biVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                                    org.telegram.messenger.i0.W(biVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                                    break;
                                } else {
                                    biVar.p1();
                                }
                            }
                        } else if (intValue == 6) {
                            if ((biVar.K3 || !biVar.N0()) && org.telegram.messenger.i0.J1(k2Var2)) {
                                if (biVar.K3) {
                                    if (biVar.f2 == null) {
                                        bl blVar = new bl(biVar, biVar.getContext(), p6Var3, (biVar.y1 || biVar.L3) ? false : true);
                                        biVar.f2 = blVar;
                                        uhVarArr[5] = blVar;
                                        wk wkVar = biVar.q4;
                                        if (wkVar != null) {
                                            blVar.setDelegate(wkVar);
                                        } else {
                                            blVar.setDelegate(new ig(biVar, 12));
                                        }
                                    }
                                    biVar.E1(biVar.f2);
                                } else {
                                    kn knVar2 = new kn(6, biVar.getContext(), p6Var3, biVar);
                                    biVar.K1 = knVar2;
                                    biVar.E1(knVar2);
                                }
                            }
                        } else if (intValue == 9) {
                            if (biVar.I3 || !biVar.N0()) {
                                if (biVar.I3) {
                                    biVar.G1(true, null);
                                } else {
                                    kn knVar3 = new kn(9, biVar.getContext(), p6Var3, biVar);
                                    biVar.K1 = knVar3;
                                    biVar.E1(knVar3);
                                }
                            }
                        } else if (intValue == 11) {
                            if (biVar.j2 == null) {
                                ag.h1 h1Var = new ag.h1(biVar.getContext(), biVar.I0, biVar);
                                biVar.j2 = h1Var;
                                uhVarArr[7] = h1Var;
                                h1Var.setupBlurredSearchField(biVar.B4);
                            }
                            biVar.E1(biVar.j2);
                        } else if (intValue == 12) {
                            if (biVar.J3 || !biVar.N0()) {
                                if (biVar.J3) {
                                    if (biVar.e2 == null) {
                                        jn jnVar = new jn(biVar, biVar.getContext(), true, p6Var3, null);
                                        biVar.e2 = jnVar;
                                        uhVarArr[1] = jnVar;
                                        jnVar.setDelegate(new ig(biVar, i13));
                                    }
                                    biVar.E1(biVar.e2);
                                } else {
                                    kn knVar4 = new kn(9, biVar.getContext(), p6Var3, biVar);
                                    biVar.K1 = knVar4;
                                    biVar.E1(knVar4);
                                }
                            }
                        } else if (intValue == 13) {
                            if (biVar.l2 == null) {
                                yj yjVar = new yj(biVar, biVar.getContext(), p6Var3, true);
                                biVar.l2 = yjVar;
                                uhVarArr[8] = yjVar;
                                yjVar.setDelegate(biVar.U3);
                            }
                            biVar.E1(biVar.l2);
                        } else if (intValue == 14) {
                            if (biVar.k2 == null) {
                                yj yjVar2 = new yj(biVar, biVar.getContext(), p6Var3, false);
                                biVar.k2 = yjVar2;
                                uhVarArr[9] = yjVar2;
                                yjVar2.setDelegate(biVar.U3);
                            }
                            biVar.E1(biVar.k2);
                        } else if (intValue == 16) {
                            if (biVar.m2 == null) {
                                bi.t tVar = new bi.t(biVar.D3, biVar.getContext(), p6Var3, biVar);
                                biVar.m2 = tVar;
                                uhVarArr[10] = tVar;
                            }
                            biVar.E1(biVar.m2);
                        } else if (view.getTag() instanceof Integer) {
                            biVar.T3.H0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, biVar.e1(), false, 0L);
                        }
                    } else if (view instanceof vh) {
                        vh vhVar = (vh) view;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = vhVar.c;
                        if (tL_attachMenuBot == null) {
                            biVar.T3.v0(vhVar.b);
                            biVar.dismiss();
                        } else if (tL_attachMenuBot.inactive) {
                            te1.a(biVar.getContext(), new vg(0, biVar, vhVar), null);
                        } else {
                            biVar.B1(tL_attachMenuBot.bot_id, null, false, true);
                        }
                    }
                    int left = view.getLeft();
                    int right = view.getRight();
                    int L = org.telegram.messenger.i0.L(70.0f);
                    int i27 = left - L;
                    if (i27 < 0) {
                        bhVar.w0(i27, 0, null);
                        break;
                    } else {
                        int i28 = right + L;
                        if (i28 > bhVar.getMeasuredWidth()) {
                            bhVar.w0(i28 - bhVar.getMeasuredWidth(), 0, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                ej ejVar = (ej) obj2;
                p6 p6Var4 = (p6) obj;
                yi yiVar = ejVar.E;
                s4.g0 adapter = ejVar.s.getAdapter();
                aj ajVar = ejVar.F;
                if (adapter == ajVar) {
                    O = ajVar.E(i10);
                } else {
                    int S = yiVar.S(i10);
                    int Q2 = yiVar.Q(i10);
                    if (Q2 >= 0 && S >= 0) {
                        O = yiVar.O(S, Q2);
                    }
                }
                if (O != null) {
                    if (ejVar.x.isEmpty()) {
                        if (O instanceof f5) {
                            f5 f5Var2 = (f5) O;
                            TLRPC.User user = f5Var2.m;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = f5Var2.i;
                                str4 = f5Var2.j;
                            }
                            f5Var = f5Var2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) O;
                            f5 f5Var3 = new f5();
                            String str5 = user2.first_name;
                            f5Var3.i = str5;
                            String str6 = user2.last_name;
                            f5Var3.j = str6;
                            f5Var3.e.add(user2.phone);
                            f5Var3.m = user2;
                            f5Var = f5Var3;
                            str = str5;
                            str2 = str6;
                        }
                        vd0 vd0Var = new vd0(ejVar.b.W1, f5Var, null, null, null, null, str, str2, p6Var4);
                        vd0Var.B1 = new ri(ejVar);
                        vd0Var.show();
                        break;
                    } else {
                        ejVar.O((dj) view, O);
                        break;
                    }
                }
                break;
            case 10:
                k70 k70Var = (k70) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                g70 g70Var = k70Var.m1;
                ArrayList arrayList4 = k70Var.p1;
                if (!k70Var.x1 && arrayList4.get(i10) != k70Var.t1) {
                    k70Var.t1 = (TLRPC.Peer) arrayList4.get(i10);
                    boolean z12 = view instanceof j4;
                    if (z12) {
                        ((j4) view).c(true, true);
                    } else if (view instanceof h7) {
                        ((h7) view).b(true, true);
                        view.invalidate();
                    }
                    int childCount = g70Var.getChildCount();
                    for (int i29 = 0; i29 < childCount; i29++) {
                        View childAt2 = g70Var.getChildAt(i29);
                        if (childAt2 != view) {
                            if (z12) {
                                ((j4) childAt2).c(false, true);
                            } else if (view instanceof h7) {
                                ((h7) childAt2).b(false, true);
                            }
                        }
                    }
                    if (k70Var.s1 != 0) {
                        k70Var.M0(chat2, true);
                        break;
                    }
                }
                break;
            case 11:
                y90 y90Var2 = (y90) obj2;
                v90 v90Var = (v90) obj;
                if (i10 != 0) {
                    zf.x0 adapter2 = y90Var2.getAdapter();
                    if (adapter2.w0 == null || adapter2.h0) {
                        int i30 = i10 - 1;
                        Object J = y90Var2.getAdapter().J(i30);
                        int i31 = y90Var2.getAdapter().X;
                        int i32 = y90Var2.getAdapter().Y;
                        if (y90Var2.getAdapter().F == null || i30 != 1) {
                            if (y90Var2.getAdapter().F == null || i30 != 0) {
                                if (J instanceof TLRPC.TL_document) {
                                    if (view instanceof b8) {
                                        ((b8) view).getSendAnimationData();
                                    }
                                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                                    v90Var.L(tL_document, jj.U(tL_document), y90Var2.getAdapter().L(i30));
                                } else if (J instanceof TLRPC.Chat) {
                                    String K = w3.K((TLRPC.Chat) J, false);
                                    if (K != null) {
                                        v90Var.N(i31, i32, a1.g.n("@", K, " "), false);
                                    }
                                } else {
                                    if (J instanceof TLRPC.User) {
                                        TLRPC.User user3 = (TLRPC.User) J;
                                        if (h20.n(user3) != null) {
                                            v90Var.N(i31, i32, "@" + h20.n(user3) + " ", false);
                                            y90Var = y90Var2;
                                        } else {
                                            SpannableString spannableString = new SpannableString(sc.e.A(h20.j(user3, false), " "));
                                            StringBuilder sb2 = new StringBuilder("");
                                            y90Var = y90Var2;
                                            sb2.append(user3.id);
                                            spannableString.setSpan(new h51(sb2.toString(), 3, null), 0, spannableString.length(), 33);
                                            v90Var.N(i31, i32, spannableString, false);
                                        }
                                    } else {
                                        y90Var = y90Var2;
                                        if (J instanceof String) {
                                            v90Var.N(i31, i32, J + " ", false);
                                        } else if (J instanceof qi) {
                                            String str7 = ((qi) J).a;
                                            v90Var.X(str7);
                                            if (str7 != null) {
                                                try {
                                                } catch (Exception unused) {
                                                    v90Var.N(i31, i32, str7, true);
                                                }
                                                if (str7.startsWith("animated_")) {
                                                    try {
                                                        fontMetricsInt = v90Var.w();
                                                    } catch (Exception e) {
                                                        f8.g(e, false);
                                                        fontMetricsInt = null;
                                                    }
                                                    long parseLong = Long.parseLong(str7.substring(9));
                                                    TLRPC.Document e7 = org.telegram.ui.Components.f5.e(d20.s0, parseLong);
                                                    SpannableString spannableString2 = new SpannableString(jj.U(e7));
                                                    spannableString2.setSpan(e7 != null ? new org.telegram.ui.Components.o5(e7, fontMetricsInt) : new org.telegram.ui.Components.o5(parseLong, fontMetricsInt), 0, spannableString2.length(), 33);
                                                    v90Var.N(i31, i32, spannableString2, false);
                                                    y90Var2 = y90Var;
                                                    y90Var2.o(false);
                                                }
                                            }
                                            v90Var.N(i31, i32, str7, true);
                                            y90Var2 = y90Var;
                                            y90Var2.o(false);
                                        }
                                    }
                                    y90Var2 = y90Var;
                                }
                                if (J instanceof TLRPC.BotInlineResult) {
                                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                                    if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || botInlineResult.document == null))) {
                                        v90Var.m(botInlineResult, true, 0);
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList(y90Var2.getAdapter().R);
                                        y90Var2.P = arrayList5;
                                        PhotoViewer.v1().N2(null, y90Var2.h, y90Var2.a);
                                        PhotoViewer.v1().j2(arrayList5, y90Var2.getAdapter().M(i30), 3, false, y90Var2.Q, null);
                                        break;
                                    }
                                }
                            } else {
                                v90Var.N(i31, i32, a1.g.r(new StringBuilder(), y90Var2.getAdapter().F, " "), false);
                                break;
                            }
                        } else {
                            TLRPC.Chat chat3 = y90Var2.getAdapter().l0;
                            if (chat3 == null && y90Var2.getAdapter().G0 != null) {
                                chat3 = y90Var2.getAdapter().G0.e;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(y90Var2.getAdapter().F);
                            v90Var.N(i31, i32, a1.g.r(sb3, chat3 != null ? "@" + w3.K(chat3, false) : "", " "), false);
                            break;
                        }
                    }
                } else {
                    y90Var2.getClass();
                    break;
                }
                break;
            case 12:
                a(i10, view);
                break;
            case 13:
                t11 t11Var = (t11) obj2;
                al alVar = (al) obj;
                EditText editText = t11Var.x;
                r11 r11Var = (r11) t11Var.w.c.get(i10);
                fw fwVar = r11Var.b;
                if (fwVar != null) {
                    j11 = fwVar.a;
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic = r11Var.a;
                    if (tL_forumTopic != null) {
                        j11 = r11Var.c.c ? o5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
                    }
                }
                un unVar2 = alVar.a;
                if (unVar2.N9()) {
                    un.J2(j11, unVar2);
                } else {
                    o21 o21Var = unVar2.f2;
                    if (o21Var != null) {
                        o21Var.n(j11, false);
                    }
                }
                if (editText.length() > 0) {
                    editText.setText("");
                }
                editText.clearFocus();
                t11Var.b();
                break;
            case 14:
                x31 x31Var = (x31) obj2;
                p6 p6Var5 = (p6) obj;
                a51 G2 = x31Var.b2.G(i10 - 1);
                if (G2 != null) {
                    int i33 = G2.d;
                    if (i33 == 1) {
                        Spannable spannable = x31Var.U1;
                        if (spannable != null && !x31Var.T1) {
                            org.telegram.messenger.i0.g(spannable);
                            break;
                        }
                    } else if (i33 == 2) {
                        if (d20.i(x31Var.a).q()) {
                            vp.r1(x31Var.a).t7.K(0L, !r0.B(0L));
                            x31Var.dismiss();
                            break;
                        } else if (LaunchActivity.T() != null) {
                            new kg.i1(13, x31Var.getContext(), p6Var5).show();
                            break;
                        }
                    }
                }
                break;
            case 15:
                b(i10, view);
                break;
            case 16:
                c(i10, view);
                break;
            case 17:
                d(i10, view);
                break;
            case 18:
                e(i10, view);
                break;
            case 19:
                g(i10, view);
                break;
            case 20:
                h(i10, view);
                break;
            case 21:
                i(i10, view);
                break;
            case 22:
                j(i10, view);
                break;
            case 23:
                k(i10, view);
                break;
            default:
                xh.z2.B0((xh.z2) obj2, (Context) obj, i10);
                break;
        }
    }
}
