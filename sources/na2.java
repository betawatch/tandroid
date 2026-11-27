// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class na2 extends e implements fn7 {
    public ja2 E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public ka2 a;
    public d79 b;
    public sla c;
    public b34 d;
    public ma2 e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public id r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public final /* synthetic */ void Y(id[] idVarArr) {
        try {
            idVarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        idVarArr[0] = null;
        this.h.linked_chat_id = 0L;
        jn7 f = jn7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(jn7.T, this.h, 0, bool, bool);
        hl.d3(new aa2(this, (byte) 2), 1000L);
        if (this.s) {
            return;
        }
        finishFragment();
    }

    public final /* synthetic */ void Z(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final /* synthetic */ void a0(id[] idVarArr, TLRPC.Chat chat, xc5 xc5Var) {
        id idVar = idVarArr[0];
        if (idVar != null) {
            try {
                idVar.dismiss();
            } catch (Throwable unused) {
            }
            idVarArr[0] = null;
        }
        this.h.linked_chat_id = chat.id;
        jn7 f = jn7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(jn7.T, this.h, 0, bool, bool);
        hl.d3(new aa2(this, (byte) 1), 1000L);
        if (xc5Var == null) {
            finishFragment();
        } else {
            removeSelfFromStack();
            xc5Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final /* synthetic */ void b0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void c0(TLRPC.Chat chat, xc5 xc5Var) {
        if (chat == null) {
            return;
        }
        byte b = 3;
        if (!xc2.T(chat)) {
            getMessagesController().R(getParentActivity(), chat.id, this, new q72(this, xc5Var, b), null);
            return;
        }
        id[] idVarArr = {xc5Var == null ? new id(3, null, getParentActivity()) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = uc7.i1(this.f);
        tL_channels_setDiscussionGroup.group = uc7.i1(chat);
        hl.d3(new ba2(this, idVarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new au0((Object) this, (Object) idVarArr, (Object) chat, (Object) xc5Var, (byte) 3), 64), (byte) 1), 500L);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131751354, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 26));
        sla a = this.simpleActionBar.v().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new r10(this, (byte) 4);
        this.c = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.e = new ma2(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.d = b34Var;
        b34Var.b();
        this.d.setText(ob6.M0(2131747898, null));
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new x46(1, false));
        d79 d79Var2 = this.b;
        ka2 ka2Var = new ka2(this, context);
        this.a = ka2Var;
        d79Var2.setAdapter(ka2Var);
        this.b.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        frameLayout.addView(this.d, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new u(this, (byte) 10));
        f0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.w.add(M0);
            }
            sla slaVar = this.c;
            if (slaVar != null) {
                slaVar.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new ye(this, (byte) 13));
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ja2 ja2Var;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.F) {
                this.h = chatFull;
                d0();
                f0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 == null || chat2.id != j) {
                return;
            }
            try {
                this.r.dismiss();
            } catch (Throwable unused) {
            }
            this.r = null;
            e0(this.n, false);
            this.n = null;
            return;
        }
        if (i != 2) {
            if (i == jn7.y1) {
                if ((-this.F) == ((Long) objArr[0]).longValue()) {
                    wk5 wk5Var = this.parentLayout;
                    if (wk5Var == null || wk5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i3 = uc7.r5;
        if ((intValue & TLObject.FLAG_13) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f.id));
        if (M02 != null) {
            this.f = M02;
        }
        if (this.w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
            this.w.set(0, M0);
        }
        if (!this.s) {
            chat = this.f;
        } else if (this.w.size() > 0) {
            chat = (TLRPC.Chat) this.w.get(0);
        }
        if (chat == null || (ja2Var = this.E) == null) {
            return;
        }
        if (!this.Q) {
            ja2Var.setJoinRequest(chat.join_request);
        }
        if (this.P) {
            return;
        }
        this.E.setJoinToSend(chat.join_to_send);
    }

    public final void e0(TLRPC.Chat chat, boolean z) {
        String a0;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.id);
        byte b = 0;
        if (N0 == null) {
            if (z) {
                getMessagesController().e3(0, chat.id, true);
                this.n = chat;
                this.r = new id(3, null, getParentActivity());
                hl.d3(new aa2(this, b), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        if (xc2.t0(chat)) {
            boolean t0 = xc2.t0(this.f);
            String str = chat.title;
            TLRPC.Chat chat2 = this.f;
            a0 = !t0 ? ob6.a0("DiscussionLinkGroupPrivateAlert", null, 2131751343, str, chat2.title) : ob6.a0("DiscussionLinkGroupPublicAlert", null, 2131751342, str, chat2.title);
        } else {
            a0 = ob6.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751341, chat.title, this.f.title);
        }
        if (N0.hidden_prehistory) {
            StringBuilder l = c00.l(a0, "\n\n");
            l.append(ob6.M0(2131751344, null));
            a0 = l.toString();
        }
        textView.setText(hl.S2(a0));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.s(hl.L(12.0f));
        de0 de0Var = new de0(getParentActivity());
        de0Var.setRoundRadius(hl.L(20.0f));
        frameLayout.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        qd4.w(textView2, aob.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = ob6.a0;
        frameLayout.addView(textView2, tre.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        rb0Var.p(chat);
        de0Var.f(chat, rb0Var);
        alertDialog$Builder.j(ob6.M0(2131751345, null), new ie((Object) this, (Object) N0, (Object) chat, (byte) 28));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(alertDialog$Builder.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        int i;
        TLRPC.Chat chat;
        ka2 ka2Var;
        sla slaVar;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z = this.s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.F));
        this.f = M0;
        if (M0 == null) {
            return;
        }
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        int i2 = 1;
        this.N = 1;
        if (z) {
            if (this.h.linked_chat_id == 0) {
                this.N = 2;
                this.G = 1;
                i2 = 2;
            }
            this.H = i2;
            i = this.w.size() + i2;
            this.N = i;
            this.I = i;
            if (this.h.linked_chat_id != 0) {
                int i3 = i + 1;
                this.N = i3;
                this.G = i;
                i = i3;
            }
        } else {
            this.H = 1;
            int size = this.w.size();
            int i4 = 1 + size;
            this.I = i4;
            i = 2 + size;
            this.N = i;
            this.G = i4;
        }
        this.N = i + 1;
        this.K = i;
        if (z) {
            if (this.w.size() > 0 && this.h.linked_chat_id != 0) {
                chat = (TLRPC.Chat) this.w.get(0);
            }
            ka2Var = this.a;
            if (ka2Var != null) {
                ka2Var.f();
            }
            slaVar = this.c;
            if (slaVar == null) {
                slaVar.setVisibility(this.w.size() <= 10 ? 8 : 0);
                return;
            }
            return;
        }
        chat = this.f;
        if (chat != null && ((!xc2.t0(chat) || z) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
            int i5 = this.N;
            this.N = i5 + 1;
            this.L = i5;
        }
        ka2Var = this.a;
        if (ka2Var != null) {
        }
        slaVar = this.c;
        if (slaVar == null) {
        }
    }

    public final void g0() {
        int hiddenChildCount;
        View X;
        try {
            if (this.b != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                if (this.R && w0 == this.S && w02 == this.T) {
                    return;
                }
                this.R = true;
                this.S = w0;
                this.T = w02;
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.b.getChildCount();
                    } else {
                        d79 d79Var = this.b;
                        hiddenChildCount = i == 1 ? d79Var.getHiddenChildCount() : i == 2 ? d79Var.getCachedChildCount() : d79Var.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            X = this.b.getChildAt(i2);
                        } else {
                            d79 d79Var2 = this.b;
                            X = i == 1 ? d79Var2.X(i2) : i == 2 ? d79Var2.Q(i2) : d79Var2.P(i2);
                        }
                        if (X instanceof lj6) {
                            lj6 lj6Var = (lj6) X;
                            lj6Var.P = true;
                            lj6Var.I = w0;
                            lj6Var.J = w02;
                            if (i != 0) {
                                ((lj6) X).d(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 0);
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, aob.y6));
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.T);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.y1);
        d0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        ka2 ka2Var = this.a;
        if (ka2Var != null) {
            ka2Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
