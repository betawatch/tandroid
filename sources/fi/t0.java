package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.ed;
import ci.n9;
import java.util.ArrayList;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class t0 implements gi.e {
    public final Context a;
    public final d6 b;
    public final yc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public s0 h;
    public n9 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public b2 q;
    public int r;
    public final a0.i g = new a0.i();
    public ArrayList j = new ArrayList();

    public t0(Context context, d6 d6Var, yc ycVar, int i10, long j3) {
        this.a = context;
        this.b = d6Var;
        this.c = ycVar;
        this.d = i10;
        this.e = j3;
        this.f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.o = MessagesController.getMainSettings(i10).getLong(a4.a.p(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.j.get(i10)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(e71 e71Var) {
        if (this.m || this.n || e71Var.e3.N0() + 10 <= e71Var.f3.x.size()) {
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
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                a0.i iVar = this.g;
                if (iVar == null || !iVar.d(peerDialogId)) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i10 < size + (-1);
                    int i11 = gi.g.a;
                    h61 K = h61.K(gi.g.class);
                    K.G = new gi.f(peerDialogId, user, z10);
                    K.H = this;
                    K.j = !z11;
                    arrayList.add(K);
                }
                i10++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(h61.p(29));
    }

    public final void d() {
        if (this.m || this.n || !ChatObject.canUserDoAdminAction(this.f, 27)) {
            return;
        }
        this.m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.k, new r0(this, 1));
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            if (z11) {
                b2 P = e5.P(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new bi.f(6, this, z10));
                P.show();
                if (z10 || (textView = (TextView) P.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(i6.w0(null, i6.q7, false));
                return;
            }
            n9 n9Var = this.i;
            if (n9Var != null) {
                n9Var.run();
            }
            this.i = null;
            b2 b2Var = new b2(this.a, 3, this.b);
            this.q = b2Var;
            b2Var.setOnCancelListener(new ed(this, 3));
            this.q.q(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new r0(this, 0));
        }
    }

    public final void g(long j3, boolean z10) {
        int i10;
        this.g.k(null, j3);
        this.l--;
        a();
        s0 s0Var = this.h;
        if (s0Var != null) {
            s0Var.l();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j3)));
        n9 n9Var = this.i;
        if (n9Var != null) {
            n9Var.run();
        }
        this.i = new n9(this, j3, z10, 1);
        Context context = this.a;
        d6 d6Var = this.b;
        qc qcVar = new qc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        k9 k9Var = qcVar.a;
        if (userOrChat != null) {
            k9Var.setCount(1);
            k9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        k9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        k9Var.setScaleX(1.333f);
        k9Var.setScaleY(1.333f);
        k9Var.a(false);
        q90 q90Var = qcVar.b;
        q90Var.setSingleLine(false);
        q90Var.setMaxLines(2);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setText(replaceTags);
        if (q90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) q90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) q90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        pc pcVar = new pc(context, d6Var, true, true);
        pcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        pcVar.a = new ai.j(this, j3, 9);
        pcVar.b = this.i;
        qcVar.setButton(pcVar);
        this.c.b(qcVar, 5000).j();
    }
}
