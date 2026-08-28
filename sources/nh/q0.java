package nh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bg.i2;
import gh.ua;
import java.util.ArrayList;
import kh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q0 implements oh.d {
    public final Context a;
    public final b6 b;
    public final oc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public p0 h;
    public ua i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public c2 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public q0(Context context, b6 b6Var, oc ocVar, int i9, long j10) {
        this.a = context;
        this.b = b6Var;
        this.c = ocVar;
        this.d = i9;
        this.e = j10;
        this.f = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        this.o = MessagesController.getMainSettings(i9).getLong(aa.d.m(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!this.g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.j.get(i9)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(i51 i51Var) {
        if (this.m || this.n || i51Var.T2.N0() + 10 <= i51Var.U2.x.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.j;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i9 = 0;
            while (i9 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i9);
                long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(peerDialogId)) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i9 < size + (-1);
                    int i10 = oh.f.a;
                    l41 J = l41.J(oh.f.class);
                    J.G = new oh.e(peerDialogId, user, z10);
                    J.H = this;
                    J.j = !z11;
                    arrayList.add(J);
                }
                i9++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(l41.n(29));
    }

    public final void d() {
        if (this.m || this.n || !ChatObject.canUserDoAdminAction(this.f, 27)) {
            return;
        }
        this.m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.k, new o0(this, 1));
    }

    public final void e() {
        int i9 = this.d;
        long currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        this.o = currentTime;
        MessagesController.getMainSettings(i9).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            if (z11) {
                c2 P = y4.P(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new eh.f(12, this, z10));
                P.show();
                if (z10 || (textView = (TextView) P.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(f6.w0(null, f6.q7, false));
                return;
            }
            ua uaVar = this.i;
            if (uaVar != null) {
                uaVar.run();
            }
            this.i = null;
            c2 c2Var = new c2(this.a, 3, this.b);
            this.q = c2Var;
            c2Var.setOnCancelListener(new pc(this, 3));
            this.q.q(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new o0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i9;
        this.g.k(null, j10);
        this.l--;
        a();
        p0 p0Var = this.h;
        if (p0Var != null) {
            p0Var.c();
        }
        int i10 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i11 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i11, j10)));
        ua uaVar = this.i;
        if (uaVar != null) {
            uaVar.run();
        }
        this.i = new ua(this, j10, z10, 2);
        Context context = this.a;
        b6 b6Var = this.b;
        fc fcVar = new fc(context, b6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(j10);
        c9 c9Var = fcVar.a;
        if (userOrChat != null) {
            c9Var.setCount(1);
            c9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i9 = 1;
        } else {
            i9 = 0;
        }
        c9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        c9Var.setScaleX(1.333f);
        c9Var.setScaleY(1.333f);
        c9Var.a(false);
        l80 l80Var = fcVar.b;
        l80Var.setSingleLine(false);
        l80Var.setMaxLines(2);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setText(replaceTags);
        if (l80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i9) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) l80Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) l80Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            c9Var.setTranslationX(AndroidUtilities.dp(32 - ((i9 - 1) * 12)));
        }
        ec ecVar = new ec(context, b6Var, true, true);
        ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ecVar.a = new i2(this, j10, 13);
        ecVar.b = this.i;
        fcVar.setButton(ecVar);
        this.c.b(fcVar, 5000).j();
    }
}
