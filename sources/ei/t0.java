package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.va;
import bi.xa;
import bi.xe;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t0 implements fi.e {
    public final Context a;
    public final f6 b;
    public final wc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public s0 h;
    public xa i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public d2 q;
    public int r;
    public final a0.i g = new a0.i();
    public ArrayList j = new ArrayList();

    public t0(Context context, f6 f6Var, wc wcVar, int i10, long j3) {
        this.a = context;
        this.b = f6Var;
        this.c = wcVar;
        this.d = i10;
        this.e = j3;
        this.f = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        this.o = MessagesController.getMainSettings(i10).getLong(a4.a.o(j3, "community_requests_last_view_time_"), 0L);
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

    public final void b(r61 r61Var) {
        if (this.m || this.n || r61Var.X2.N0() + 10 <= r61Var.Y2.x.size()) {
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
                    int i11 = fi.g.a;
                    v51 J = v51.J(fi.g.class);
                    J.G = new fi.f(peerDialogId, user, z10);
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
        arrayList.add(v51.n(29));
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
                d2 P = d5.P(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new ai.j(6, this, z10));
                P.show();
                if (z10 || (textView = (TextView) P.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(j6.w0(null, j6.q7, false));
                return;
            }
            xa xaVar = this.i;
            if (xaVar != null) {
                xaVar.run();
            }
            this.i = null;
            d2 d2Var = new d2(this.a, 3, this.b);
            this.q = d2Var;
            d2Var.setOnCancelListener(new xe(this, 3));
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
            s0Var.F();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j3)));
        xa xaVar = this.i;
        if (xaVar != null) {
            xaVar.run();
        }
        this.i = new xa(this, j3, z10, 1);
        Context context = this.a;
        f6 f6Var = this.b;
        oc ocVar = new oc(context, f6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j3);
        j9 j9Var = ocVar.a;
        if (userOrChat != null) {
            j9Var.setCount(1);
            j9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        j9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        j9Var.setScaleX(1.333f);
        j9Var.setScaleY(1.333f);
        j9Var.a(false);
        m90 m90Var = ocVar.b;
        m90Var.setSingleLine(false);
        m90Var.setMaxLines(2);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setText(replaceTags);
        if (m90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) m90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) m90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            j9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        nc ncVar = new nc(context, f6Var, true, true);
        ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ncVar.a = new va(this, j3, 4);
        ncVar.b = this.i;
        ocVar.setButton(ncVar);
        this.c.b(ocVar, 5000).j();
    }
}
