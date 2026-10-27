package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.kd;
import bi.r3;
import fi.lc;
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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r0 implements ji.e {
    public final Context a;
    public final u6 b;
    public final wc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public q0 h;
    public kd i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public e2 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public r0(Context context, u6 u6Var, wc wcVar, int i10, long j10) {
        this.a = context;
        this.b = u6Var;
        this.c = wcVar;
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

    public final void b(s71 s71Var) {
        if (this.m || this.n || s71Var.f3.N0() + 10 <= s71Var.g3.y.size()) {
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
                    int i11 = ji.g.a;
                    u61 K = u61.K(ji.g.class);
                    K.G = new ji.f(peerDialogId, user, z10);
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
        arrayList.add(u61.p(29));
    }

    public final void d() {
        if (this.m || this.n || !ChatObject.canUserDoAdminAction(this.f, 27)) {
            return;
        }
        this.m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.k, new p0(this, 1));
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
                e2 O = g5.O(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new bh.n(11, this, z10));
                O.show();
                if (z10 || (textView = (TextView) O.d(-1)) == null) {
                    return;
                }
                f7.V(textView, y6.q7, null);
                return;
            }
            kd kdVar = this.i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.i = null;
            e2 e2Var = new e2(this.a, 3, this.b);
            this.q = e2Var;
            e2Var.setOnCancelListener(new lc(this, 3));
            this.q.r(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new p0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        this.g.k(null, j10);
        this.l--;
        a();
        q0 q0Var = this.h;
        if (q0Var != null) {
            q0Var.c();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j10)));
        kd kdVar = this.i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.i = new kd(this, j10, z10, 2);
        Context context = this.a;
        u6 u6Var = this.b;
        pc pcVar = new pc(context, u6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        m9 m9Var = pcVar.a;
        if (userOrChat != null) {
            m9Var.setCount(1);
            m9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        m9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        m9Var.setScaleX(1.333f);
        m9Var.setScaleY(1.333f);
        m9Var.a(false);
        aa0 aa0Var = pcVar.b;
        aa0Var.setSingleLine(false);
        aa0Var.setMaxLines(2);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setText(replaceTags);
        if (aa0Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) aa0Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) aa0Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            m9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        oc ocVar = new oc(context, u6Var, true, true);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.b = new r3(this, j10, 12);
        ocVar.c = this.i;
        pcVar.setButton(ocVar);
        this.c.b(pcVar, 5000).j();
    }
}
