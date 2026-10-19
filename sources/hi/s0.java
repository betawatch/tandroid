package hi;

import ai.td;
import ai.v3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.pc;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class s0 implements ii.d {
    public final Context a;
    public final d6 b;
    public final xc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public r0 h;
    public td i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public b2 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public s0(Context context, d6 d6Var, xc xcVar, int i10, long j10) {
        this.a = context;
        this.b = d6Var;
        this.c = xcVar;
        this.d = i10;
        this.e = j10;
        this.f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.o = MessagesController.getMainSettings(i10).getLong(a1.g.o(j10, "community_requests_last_view_time_"), 0L);
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

    public final void b(b71 b71Var) {
        if (this.m || this.n || b71Var.V2.N0() + 10 <= b71Var.W2.x.size()) {
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
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(peerDialogId)) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i10 < size + (-1);
                    int i11 = ii.f.a;
                    g61 J = g61.J(ii.f.class);
                    J.G = new ii.e(peerDialogId, user, z10);
                    J.H = this;
                    J.j = !z11;
                    arrayList.add(J);
                }
                i10++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(g61.n(29));
    }

    public final void d() {
        if (this.m || this.n || !ChatObject.canUserDoAdminAction(this.f, 27)) {
            return;
        }
        this.m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.k, new q0(this, 1));
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
                b2 O = f5.O(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new ah.t(11, this, z10));
                O.show();
                if (z10 || (textView = (TextView) O.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(h6.x0(null, h6.q7, false));
                return;
            }
            td tdVar = this.i;
            if (tdVar != null) {
                tdVar.run();
            }
            this.i = null;
            b2 b2Var = new b2(this.a, 3, this.b);
            this.q = b2Var;
            b2Var.setOnCancelListener(new pc(this, 3));
            this.q.r(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new q0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        this.g.k(null, j10);
        this.l--;
        a();
        r0 r0Var = this.h;
        if (r0Var != null) {
            r0Var.l();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j10)));
        td tdVar = this.i;
        if (tdVar != null) {
            tdVar.run();
        }
        this.i = new td(this, j10, z10, 2);
        Context context = this.a;
        d6 d6Var = this.b;
        org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(context, d6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        k9 k9Var = pcVar.a;
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
        x90 x90Var = pcVar.b;
        x90Var.setSingleLine(false);
        x90Var.setMaxLines(2);
        x90Var.setTextSize(1, 14.0f);
        x90Var.setText(replaceTags);
        int i13 = 12;
        if (x90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) x90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) x90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            k9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        oc ocVar = new oc(context, d6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.a = new v3(this, j10, i13);
        ocVar.b = this.i;
        pcVar.setButton(ocVar);
        this.c.b(pcVar, 5000).j();
    }
}
