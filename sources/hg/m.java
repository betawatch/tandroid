package hg;

import ai.r7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.h4;
import ci.h7;
import ci.q7;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class m extends lm0 implements m2 {
    public static final boolean c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public mm0 K;
    public ij0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final ey R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public boolean a0;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int v;
    public final boolean w;
    public final ArrayList x;
    public boolean y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int b0 = -1;

    public m(ey eyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.R = eyVar;
        this.h = i10;
        this.r = i11;
        this.w = z10;
        this.y = i11 == 0 && i10 == 0 && !z10;
        this.x = arrayList;
        this.F = i12;
        this.V = eyVar.Y2;
        if (i11 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new ah.j(jVar, 16);
            this.P = jVar;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                r6.z(view, drawable, k6.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        int i10 = k6.a7;
        fh.b bVar = new fh.b(20);
        fh.b bVar2 = new fh.b(19);
        int R = r6.R(i10, -1, 0, 0.0f, null);
        bVar2.d(R, view);
        l6 y3 = r6.y(101, view);
        y3.c(i10, -1, 0, 0.0f, null);
        y3.n = bVar;
        y3.o = bVar2;
        y3.m = false;
        y3.g = R;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int F() {
        int i10 = this.h;
        int i11 = this.r;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.F).isDialogsEndReached(i11) ? 2 : 3;
        }
        if (i11 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j10) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((k) this.M.get(i10)).c != null && ((k) this.M.get(i10)).c.id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int H(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.y) {
            i10 = k3.g(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        return (i11 == 11 || i11 == 13) ? i10 - 2 : i11 == 12 ? i10 - 1 : i10;
    }

    public final MessagesController.DialogFilter I() {
        int i10 = this.h;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.F).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object J(int i10) {
        if (i10 >= 0 && i10 < this.M.size()) {
            k kVar = (k) this.M.get(i10);
            String str = kVar.l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.F).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.n = z10;
    }

    public final void O(ij0 ij0Var) {
        this.L = ij0Var;
    }

    public final void P(mm0 mm0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
            if (mm0Var.getChildAt(i10) instanceof q2) {
                ((q2) mm0Var.getChildAt(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < mm0Var.getCachedChildCount(); i11++) {
            if (mm0Var.P(i11) instanceof q2) {
                ((q2) mm0Var.P(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < mm0Var.getHiddenChildCount(); i12++) {
            if (mm0Var.V(i12) instanceof q2) {
                ((q2) mm0Var.V(i12)).f = z10;
            }
        }
        for (int i13 = 0; i13 < mm0Var.getAttachedScrapChildCount(); i13++) {
            if (mm0Var.O(i13) instanceof q2) {
                ((q2) mm0Var.O(i13)).f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.Q = z10;
    }

    public final void R(long j10) {
        this.s = j10;
    }

    public final void S(zx zxVar) {
        this.K = zxVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i10 = this.F;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new d(MessagesController.getInstance(i10), currentTime, 1));
                    if (z10) {
                        l();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void V() {
        this.y = this.r == 0 && this.h == 0 && !this.w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        ArrayList P3;
        long j10;
        boolean z10;
        TLRPC.Dialog dialog;
        boolean z11;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z12;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        long j11 = this.V;
        int i14 = this.F;
        boolean z13 = true;
        if (j11 != 0) {
            this.M.clear();
            V();
            MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i14).buildCommunityPeers(j11);
            this.f = buildCommunityPeers.getDialogsCount();
            this.U = false;
            int i15 = this.h == 3 ? 2 : 4;
            for (int i16 = 0; i16 < i15; i16++) {
                if (i16 == 0) {
                    arrayList = buildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i16 == 1) {
                    arrayList = buildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i16 == 2) {
                    arrayList = buildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = buildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.M.add(new k(this, string));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i17);
                        TLRPC.Dialog dialog4 = communityPeerDialog.dialog;
                        if (dialog4 != null) {
                            this.M.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.M.add(new k(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.M.add(new k(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.M.clear();
        V();
        MessagesController messagesController = MessagesController.getInstance(i14);
        int i18 = this.r;
        ey eyVar = this.R;
        if (j11 != 0) {
            P3 = messagesController.getDialogsByCommunity(j11);
        } else {
            P3 = eyVar.P3(i14, this.h, i18, this.G);
            if (P3 == null) {
                P3 = new ArrayList();
            }
        }
        int size = P3.size();
        this.f = size;
        this.U = false;
        if (size == 0 && eyVar.c4()) {
            k3.p(this, 19, this.M);
            return;
        }
        if (this.y || this.h != 0 || i18 != 0 || !messagesController.isDialogsEndReached(i18) || this.e) {
            j10 = 0;
            z10 = true;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i14).doneLoadingContacts || ContactsController.getInstance(i14).contacts.isEmpty()) {
            j10 = 0;
            z10 = true;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(ContactsController.getInstance(i14).contacts);
            long j12 = UserConfig.getInstance(i14).clientUserId;
            int size2 = this.d.size();
            int i19 = 0;
            while (i19 < size2) {
                boolean z14 = z13;
                long j13 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j13 == j12 || messagesController.dialogs_dict.f(j13) != null) {
                    this.d.remove(i19);
                    i19--;
                    size2--;
                }
                i19++;
                z13 = z14;
            }
            z10 = z13;
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                U(false);
            }
        }
        MessagesController.DialogFilter I = I();
        if ((I == null || I.isDefault()) && eyVar != null && eyVar.N0 && eyVar.P0 != j10) {
            k3.p(this, 20, this.M);
            int i20 = 0;
            while (true) {
                if (i20 >= P3.size()) {
                    dialog = null;
                    break;
                } else {
                    if (P3.get(i20).id == eyVar.P0) {
                        dialog = P3.get(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = eyVar.P0;
            }
            this.M.add(new k(this, 0, dialog));
            k3.p(this, 20, this.M);
        } else if ((I == null || I.isDefault()) && eyVar != null && this.h == 3 && eyVar.Q0 != j10) {
            k3.p(this, 20, this.M);
            int i21 = 0;
            while (true) {
                if (i21 >= P3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (P3.get(i21).id == eyVar.Q0) {
                        dialog3 = P3.get(i21);
                        break;
                    }
                    i21++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = eyVar.Q0;
            }
            z11 = false;
            this.M.add(new k(this, 0, dialog3));
            k3.p(this, 20, this.M);
            this.E = z11;
            i10 = this.h;
            if ((i10 != 7 || i10 == 8) && I != null && I.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(I.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(I.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.E = z10;
                    this.M.add(new k(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.T;
            if (requestPeerType != null) {
                k3.p(this, 15, this.M);
            }
            if (!this.J || this.S) {
                for (i11 = 0; i11 < P3.size(); i11++) {
                    if (this.h == 2 && (P3.get(i11) instanceof yx)) {
                        this.M.add(new k(this, 14, P3.get(i11)));
                    } else {
                        this.M.add(new k(this, 0, P3.get(i11)));
                    }
                }
                k3.p(this, 10, this.M);
            }
            if (this.f == 0 && this.e) {
                this.U = true;
                if (requestPeerType != null) {
                    k3.p(this, 16, this.M);
                } else {
                    this.M.add(new k(this, F(), 0));
                }
                k3.p(this, 8, this.M);
                k3.p(this, 7, this.M);
                k3.p(this, 13, this.M);
            } else {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                    if (this.f == 0) {
                        this.U = true;
                        if (requestPeerType != null) {
                            k3.p(this, 16, this.M);
                        } else {
                            this.M.add(new k(this, F(), 0));
                        }
                        k3.p(this, 8, this.M);
                        k3.p(this, 7, this.M);
                    } else {
                        for (int i22 = 0; i22 < P3.size(); i22++) {
                            this.M.add(new k(this, 0, P3.get(i22)));
                        }
                        k3.p(this, 8, this.M);
                        k3.p(this, 7, this.M);
                    }
                    for (int i23 = 0; i23 < this.d.size(); i23++) {
                        this.M.add(new k(this, (TLRPC.TL_contact) this.d.get(i23)));
                    }
                    k3.p(this, 10, this.M);
                    z12 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        k3.p(this, 12, this.M);
                    }
                    if (this.n && this.h == 3) {
                        k3.p(this, 21, this.M);
                    }
                    if (!z12) {
                        for (int i24 = 0; i24 < P3.size(); i24++) {
                            if (this.h == 2 && (P3.get(i24) instanceof yx)) {
                                this.M.add(new k(this, 14, P3.get(i24)));
                            } else {
                                this.M.add(new k(this, 0, P3.get(i24)));
                            }
                        }
                        if (j11 != 0 || this.Q || (i13 = this.h) == 7 || i13 == 8 || MessagesController.getInstance(i14).isDialogsEndReached(i18)) {
                            int i25 = this.f;
                            if (i25 == 0) {
                                this.U = true;
                                if (requestPeerType != null) {
                                    k3.p(this, 16, this.M);
                                } else {
                                    this.M.add(new k(this, F(), 0));
                                }
                            } else {
                                if (i18 == 0 && i25 > 10 && this.h == 0) {
                                    k3.p(this, 11, this.M);
                                }
                                k3.p(this, 10, this.M);
                            }
                        } else {
                            if (this.f != 0) {
                                k3.p(this, 1, this.M);
                            }
                            k3.p(this, 10, this.M);
                        }
                    }
                    if (messagesController.hiddenUndoChats.isEmpty()) {
                        int i26 = 0;
                        while (i26 < this.M.size()) {
                            k kVar = (k) this.M.get(i26);
                            if (kVar.a == 0 && (dialog2 = kVar.c) != null && messagesController.isHiddenByUndo(dialog2.id)) {
                                this.M.remove(i26);
                                i26--;
                            }
                            i26++;
                        }
                        return;
                    }
                    return;
                }
                if (this.y) {
                    int size3 = MessagesController.getInstance(i14).hintDialogs.size();
                    k3.p(this, 2, this.M);
                    for (int i27 = 0; i27 < size3; i27++) {
                        this.M.add(new k(this, MessagesController.getInstance(i14).hintDialogs.get(i27)));
                    }
                    k3.p(this, 3, this.M);
                } else {
                    int i28 = this.h;
                    if (i28 == 11 || i28 == 13) {
                        k3.p(this, 7, this.M);
                        k3.p(this, 12, this.M);
                    } else if (i28 == 12) {
                        k3.p(this, 7, this.M);
                    }
                }
            }
            z12 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            k3.p(this, 12, this.M);
            if (this.n) {
                k3.p(this, 21, this.M);
            }
            if (!z12) {
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
        }
        z11 = false;
        this.E = z11;
        i10 = this.h;
        if (i10 != 7) {
        }
        messagesController.checkChatlistFolderUpdate(I.id, false);
        chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(I.id);
        if (chatlistFolderUpdates != null) {
            this.E = z10;
            this.M.add(new k(this, chatlistFolderUpdates));
        }
        requestPeerType = this.T;
        if (requestPeerType != null) {
        }
        if (this.J) {
        }
        while (i11 < P3.size()) {
        }
        k3.p(this, 10, this.M);
    }

    public final void X(Runnable runnable) {
        if (this.Z) {
            this.a0 = true;
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && c0) {
            Utilities.searchQueue.postRunnable(new ai.y0(this, gVar, runnable, arrayList2, 20));
            return;
        }
        m4.c c10 = s4.o.c(gVar, true);
        this.Z = false;
        if (runnable != null) {
            runnable.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return this.x.isEmpty();
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
        h7 storiesController = MessagesController.getInstance(this.F).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.R.getOrCreateStoryViewer().G(this.c, null, arrayList2, 0, null, null, new q7(this.K, true), false);
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(q2Var.getDialogId())) {
            ey eyVar = this.R;
            eyVar.getOrCreateStoryViewer().getClass();
            eyVar.getOrCreateStoryViewer().D(eyVar.getParentActivity(), q2Var.getDialogId(), q7.a((mm0) q2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
        this.R.F4(q2Var);
    }

    @Override // s4.g0
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return ((k) this.M.get(i10)).k;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((k) this.M.get(i10)).a;
    }

    @Override // s4.g0
    public void l() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0617  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String str;
        String str2;
        String userName;
        String formatPluralStringComma;
        TLRPC.Chat chat3;
        int i11;
        String string;
        int i12 = b1Var.f;
        View view = b1Var.a;
        int i13 = this.F;
        ey eyVar = this.R;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i10);
            Object J = J(i10 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i14 = this.h;
            ArrayList arrayList = this.x;
            if (i14 == 2 || i14 == 15) {
                i6 i6Var = (i6) view;
                long dialogId = i6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (chat3 = MessagesController.getInstance(i13).getChat(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = chat3;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i15 = chat.participants_count;
                        formatPluralStringComma = i15 != 0 ? LocaleController.formatPluralStringComma("Members", i15) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                    } else {
                        int i16 = chat.participants_count;
                        formatPluralStringComma = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    str2 = formatPluralStringComma;
                    chat2 = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(dialog.id));
                    if (user == 0) {
                        chat2 = null;
                        str = null;
                        str2 = "";
                        i6Var.M = dialog2 == null;
                        i6Var.t(chat2, null, str, str2, false, false);
                        i6Var.s(arrayList.contains(Long.valueOf(i6Var.getDialogId())), dialogId == i6Var.getDialogId());
                        if (i10 >= this.f + 1) {
                            view.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    userName = UserObject.getUserName(user);
                    if (UserObject.isReplyUser(user)) {
                        chat2 = user;
                        str2 = "";
                    } else {
                        chat2 = user;
                        str2 = user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(i13, user);
                    }
                }
                str = userName;
                i6Var.M = dialog2 == null;
                i6Var.t(chat2, null, str, str2, false, false);
                i6Var.s(arrayList.contains(Long.valueOf(i6Var.getDialogId())), dialogId == i6Var.getDialogId());
                if (i10 >= this.f + 1) {
                }
            } else {
                q2 q2Var = (q2) view;
                q2Var.Q0 = this.V != 0 && ChatObject.isHiddenInCommunity(i13, dialog.id);
                q2Var.s2 = false;
                q2Var.t2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    q2Var.setDialogSelected(dialog.id == this.s);
                }
                q2Var.U(arrayList.contains(Long.valueOf(dialog.id)), false);
                if (i10 == 1 && eyVar != null && eyVar.N0 && eyVar.P0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter I = I();
                    if (I == null || I.isDefault()) {
                        q2Var.setCustomMessage(DialogObject.getStatus(eyVar.P0));
                    } else {
                        q2Var.setCustomMessage(null);
                    }
                } else if (i10 == 1 && eyVar != null && this.h == 3 && eyVar.Q0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter I2 = I();
                    if (I2 == null || I2.isDefault()) {
                        q2Var.setCustomMessage(DialogObject.getStatus(eyVar.Q0));
                    } else {
                        q2Var.setCustomMessage(null);
                    }
                } else {
                    q2Var.setCustomMessage(null);
                }
                q2Var.W(dialog, this.h, this.r);
                if (q2Var.getMeasuredHeight() > 0 && q2Var.getMeasuredHeight() != q2Var.y()) {
                    q2Var.requestLayout();
                }
                boolean z10 = q2Var.f;
                boolean z11 = this.J;
                if (z10 != z11) {
                    q2Var.f = z11;
                    q2Var.requestLayout();
                }
                j jVar = this.P;
                if (jVar != null && i10 < 10) {
                    long j10 = dialog.id;
                    ArrayList arrayList2 = jVar.d;
                    if (!jVar.a.contains(Long.valueOf(j10)) && !jVar.b.contains(Long.valueOf(j10)) && !jVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
            }
        } else if (i12 == 4) {
            ((r2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i10));
        } else if (i12 == 5) {
            w2 w2Var = (w2) view;
            int i17 = this.b0;
            int F = F();
            this.b0 = F;
            s11 s11Var = w2Var.n;
            TextView textView = w2Var.h;
            bk0 bk0Var = w2Var.f;
            if (w2Var.r != F) {
                w2Var.r = F;
                if (F == 0 || F == 1) {
                    i11 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (F != 2) {
                    bk0Var.setAutoRepeat(true);
                    i11 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    bk0Var.setAutoRepeat(false);
                    i11 = R.raw.filter_no_chats;
                    if (this.w) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                if (i11 != 0) {
                    bk0Var.setVisibility(0);
                    if (w2Var.r == 1) {
                        if (w2Var.d) {
                            w2Var.a = 1.0f;
                            String string2 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string2 = string2.replace('\n', ' ');
                            }
                            s11Var.a(string2, true, false);
                            w2Var.requestLayout();
                        } else {
                            w2Var.a(true);
                        }
                    }
                    if (w2Var.s != i11) {
                        bk0Var.f(i11, 100, 100, null);
                        bk0Var.d();
                        w2Var.s = i11;
                    }
                } else {
                    bk0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string = string.replace('\n', ' ');
                }
                s11Var.a(string, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                w2Var.setOnUtyanAnimationEndListener(new f(this, r13 ? 1 : 0));
                w2Var.setOnUtyanAnimationUpdateListener(new r7(this, 4));
                if (!w2Var.d && this.f == 0) {
                    eyVar.x4(0.0f);
                    for (dy dyVar : eyVar.e0) {
                        ((s4.b0) dyVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            w2Var.a(false);
                        }
                    } else if (w2Var.d && this.b0 == 0) {
                        ValueAnimator valueAnimator = w2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        w2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(w2Var.a, 0.0f).setDuration(250L);
                        w2Var.e = duration;
                        duration.setInterpolator(st.d);
                        w2Var.e.addUpdateListener(new u2(w2Var, 1));
                        w2Var.e.addListener(new v2(w2Var, 0));
                        w2Var.e.start();
                    }
                } else if (!w2Var.d) {
                    w2Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((wa) view).d((TLRPC.User) J(i10), null, null, false);
        } else if (i12 == 7) {
            l4 l4Var = (l4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                l4Var.setText(LocaleController.getString((this.f == 0 && this.e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                l4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.T;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        l4 l4Var2 = (l4) view;
                        l4Var2.setTextSize(14.0f);
                        if (l4Var2.getTextView() != null) {
                            r6.W(l4Var2.getTextView(), k6.y6, null);
                        } else {
                            l4Var2.setTextColor(k6.x0(null, k6.y6, false));
                        }
                        r6.i(k6.e7, l4Var2, null);
                        int i20 = ((yx) J(i10)).a;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 == 2) {
                                    l4Var2.setText(LocaleController.getString(R.string.FilterGroups));
                                    break;
                                }
                            } else {
                                l4Var2.setText(LocaleController.getString(R.string.MyGroups));
                                break;
                            }
                        } else {
                            l4Var2.setText(LocaleController.getString(R.string.MyChannels));
                            break;
                        }
                        break;
                    case 15:
                        ((org.telegram.ui.Cells.r6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((a3) view).set(requestPeerType);
                        break;
                    case 17:
                        y2 y2Var = (y2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.M.get(i10)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            y2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), k6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                u3 u3Var = (u3) view;
                                if (eyVar == null || !eyVar.N0) {
                                    if (this.h == 3) {
                                        if (i10 == 0) {
                                            u3Var.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                            break;
                                        } else {
                                            u3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                            break;
                                        }
                                    }
                                } else if (i10 == 0) {
                                    u3Var.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                    break;
                                } else {
                                    u3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                    break;
                                }
                                break;
                            case 21:
                                q2 q2Var2 = (q2) view;
                                l2 l2Var = new l2();
                                l2Var.a = LocaleController.getString(R.string.StoriesForwardTitle);
                                l2Var.b = LocaleController.getString(R.string.StoriesForwardText);
                                q2Var2.s2 = false;
                                q2Var2.t2 = false;
                                q2Var2.setDialog(l2Var);
                                if (q2Var2.getMeasuredHeight() > 0 && q2Var2.getMeasuredHeight() != q2Var2.y()) {
                                    q2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((l4) view).setText((String) J(i10));
                                break;
                            case 23:
                                Object J2 = J(i10);
                                q2 q2Var3 = (q2) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) J2;
                                    q2Var3.Q0 = ChatObject.isHiddenInCommunity(i13, chat4);
                                    q2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat4.participants_count, new Object[0]));
                                    q2Var3.V(-chat4.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) J2;
                                    q2Var3.Q0 = ChatObject.isHiddenInCommunity(i13, user2);
                                    q2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    q2Var3.V(user2.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof r8)) {
                    return;
                }
                r8 r8Var = (r8) view;
                int i21 = k6.q6;
                r8Var.g(i21, i21);
                if (requestPeerType == null) {
                    r8Var.o(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    r8Var.o(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    r8Var.o(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                r8Var.x = true;
                r8Var.setOffsetFromImage(75);
            }
        } else {
            e9 e9Var = (e9) view;
            e9Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.O == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.O = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            y90 textView2 = e9Var.getTextView();
            if (textView2 != null) {
                r6.z(textView2, this.O, k6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (eyVar == null || !eyVar.O3) ? this.O : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 >= this.f + 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [org.telegram.ui.Cells.q2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [org.telegram.ui.Cells.wa] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.l4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View, org.telegram.ui.Cells.b7] */
    /* JADX WARN: Type inference failed for: r2v13, types: [hg.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View, hg.i] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.r6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [hg.h] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.y2] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.un] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, hg.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.u3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.l4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.view.View, org.telegram.ui.Cells.r8] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.telegram.ui.Components.b10] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup, org.telegram.ui.Cells.l4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, android.view.ViewGroup, ci.h4] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, org.telegram.ui.Cells.r2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.w2] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        l4 l4Var;
        long j10 = this.V;
        Context context = this.c;
        switch (i10) {
            case 0:
            case 21:
                int i11 = this.h;
                if (i11 == 2 || i11 == 15) {
                    r22 = new i6(context, null);
                } else {
                    q2 q2Var = new q2(this.R, this.c, false, this.F, null);
                    if (T()) {
                        ai.r0 r0Var = new ai.r0(this, 25);
                        q2Var.J1 = true;
                        q2Var.K1 = r0Var;
                    }
                    q2Var.setArchivedPullAnimation(this.L);
                    q2Var.setPreloader(this.P);
                    q2Var.setDialogCellDelegate(this);
                    q2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        f7 f7Var = new f7(q2Var.getContext(), q2Var, false, R.drawable.forward_to_stories, q2Var.J4);
                        q2Var = q2Var;
                        q2Var.G = f7Var;
                        q2Var.F = true;
                    }
                    if (j10 != 0) {
                        q2Var.O0 = true;
                    }
                    r22 = q2Var;
                }
                if (this.h == 15) {
                    r6.i(k6.d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new b10(context, null);
                r22.setIsSingleCell(true);
                int i12 = i10 == 13 ? 18 : 7;
                r22.setViewType(i12);
                if (i12 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new l4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                r6.W(textView, k6.L6, null);
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                r22.addView(textView, z5.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ah.g0(this, 28));
                break;
            case 3:
                r22 = new h4(context, 2);
                r6.i(k6.a7, r22, null);
                View view = new View(context);
                r6.b0(R.drawable.greydivider, k6.b7, context, view, null);
                r22.addView(view, z5.c(-1.0f, -1));
                break;
            case 4:
                r22 = new r2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new h9((g6) null);
                r22.w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                k6.S(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new w2(context);
                break;
            case 6:
                r22 = new wa(context, 8, 0, false);
                break;
            case 7:
                r22 = new l4(context);
                ey eyVar = this.R;
                if (eyVar == null || !eyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new b7(context, (org.telegram.ui.Cells.b1) null);
                Drawable X0 = k6.X0(context, R.drawable.greydivider, k6.b7);
                yq yqVar = new yq(new ColorDrawable(k6.x0(null, k6.a7, false)), X0);
                yqVar.w = true;
                r22.setBackgroundDrawable(yqVar);
                E(r22, X0);
                break;
            case 9:
            case 12:
            default:
                r22 = new r8(context);
                if (this.h == 15) {
                    r6.i(k6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable X02 = k6.X0(context, R.drawable.greydivider, k6.b7);
                yq yqVar2 = new yq(new ColorDrawable(k6.x0(null, k6.a7, false)), X02);
                yqVar2.w = true;
                r22.setBackgroundDrawable(yqVar2);
                E(r22, X02);
                break;
            case 14:
                l4 l4Var2 = new l4(this.c, k6.f7, 16, 0, false, null);
                l4Var2.setHeight(32);
                l4Var2.setClickable(false);
                l4Var = l4Var2;
                r22 = l4Var;
                break;
            case 15:
                r22 = new org.telegram.ui.Cells.r6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new y2(context);
                break;
            case 18:
                r22 = new un(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new w6(this.c, this.F, null, new f(this, 1), null), z5.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new l4(context);
                break;
            case 23:
                ?? q2Var2 = new q2(this.R, this.c, false, this.F, null);
                l4Var = q2Var2;
                if (j10 != 0) {
                    q2Var2.O0 = true;
                    q2Var2.P0 = true;
                    l4Var = q2Var2;
                }
                r22 = l4Var;
                break;
        }
        r22.setLayoutParams(new s4.o0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new wl0(r22);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof q2) {
            q2 q2Var = (q2) view;
            q2Var.S(this.H, false);
            q2Var.U(this.x.contains(Long.valueOf(q2Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.m2
    public void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public void d(q2 q2Var) {
    }
}
