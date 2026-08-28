package of;

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
import bg.d2;
import fh.k6;
import g7.e6;
import ih.e7;
import ih.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import kh.i9;
import kh.x8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.xx;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class m extends vk0 implements n2 {
    public static final boolean Y = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public wk0 G;
    public uh0 H;
    public Drawable K;
    public final j L;
    public boolean M;
    public final dy N;
    public boolean O;
    public final TLRPC.RequestPeerType P;
    public boolean Q;
    public final long R;
    public boolean V;
    public boolean W;
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
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public int S = 10;
    public final LongSparseIntArray T = new LongSparseIntArray();
    public final HashMap U = new HashMap();
    public int X = -1;

    public m(dy dyVar, Context context, int i9, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.N = dyVar;
        this.h = i9;
        this.r = i10;
        this.w = z10;
        this.y = i10 == 0 && i9 == 0 && !z10;
        this.x = arrayList;
        this.B = i11;
        this.R = dyVar.T2;
        if (i10 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new d2(jVar, 19);
            this.L = jVar;
        }
        this.P = requestPeerType;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 1 || i9 == 5 || i9 == 3 || i9 == 8 || i9 == 7 || i9 == 10 || i9 == 11 || i9 == 13 || i9 == 15 || i9 == 16 || i9 == 18 || i9 == 19 || i9 == 20) ? false : true;
    }

    public final int E() {
        int i9 = this.h;
        int i10 = this.r;
        if (i9 == 7 || i9 == 8) {
            return MessagesController.getInstance(this.B).isDialogsEndReached(i10) ? 2 : 3;
        }
        if (i10 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int F(long j10) {
        for (int i9 = 0; i9 < this.I.size(); i9++) {
            if (((k) this.I.get(i9)).c != null && ((k) this.I.get(i9)).c.id == j10) {
                return i9;
            }
        }
        return -1;
    }

    public final int G(int i9) {
        if (this.A) {
            i9--;
        }
        if (this.y) {
            i9 = j3.r0.g(2, i9, MessagesController.getInstance(this.B).hintDialogs);
        }
        if (this.n && this.h == 3) {
            i9--;
        }
        int i10 = this.h;
        return (i10 == 11 || i10 == 13) ? i9 - 2 : i10 == 12 ? i9 - 1 : i9;
    }

    public final MessagesController.DialogFilter H() {
        int i9 = this.h;
        if (i9 == 7 || i9 == 8) {
            return MessagesController.getInstance(this.B).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object I(int i9) {
        if (i9 >= 0 && i9 < this.I.size()) {
            k kVar = (k) this.I.get(i9);
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
                return MessagesController.getInstance(this.B).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.n = z10;
    }

    public final void N(uh0 uh0Var) {
        this.H = uh0Var;
    }

    public final void O(wk0 wk0Var, boolean z10) {
        this.F = z10;
        for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
            if (wk0Var.getChildAt(i9) instanceof r2) {
                ((r2) wk0Var.getChildAt(i9)).f = z10;
            }
        }
        for (int i10 = 0; i10 < wk0Var.getCachedChildCount(); i10++) {
            if (wk0Var.P(i10) instanceof r2) {
                ((r2) wk0Var.P(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < wk0Var.getHiddenChildCount(); i11++) {
            if (wk0Var.V(i11) instanceof r2) {
                ((r2) wk0Var.V(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < wk0Var.getAttachedScrapChildCount(); i12++) {
            if (wk0Var.O(i12) instanceof r2) {
                ((r2) wk0Var.O(i12)).f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.M = z10;
    }

    public final void Q(long j10) {
        this.s = j10;
    }

    public final void R(yx yxVar) {
        this.G = yxVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i9 = this.B;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.E >= 2000) {
                this.E = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
                    Collections.sort(this.d, new d(MessagesController.getInstance(i9), currentTime, 1));
                    if (z10) {
                        l();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void U() {
        this.y = this.r == 0 && this.h == 0 && !this.w && !MessagesController.getInstance(this.B).hintDialogs.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        ArrayList R3;
        long j10;
        TLRPC.Dialog dialog;
        boolean z10;
        int i9;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Dialog dialog2;
        int i12;
        TLRPC.Dialog dialog3;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i13 = this.B;
        long j11 = this.R;
        if (j11 != 0) {
            this.I.clear();
            U();
            MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i13).buildCommunityPeers(j11);
            this.f = buildCommunityPeers.getDialogsCount();
            this.Q = false;
            int i14 = this.h == 3 ? 2 : 4;
            for (int i15 = 0; i15 < i14; i15++) {
                if (i15 == 0) {
                    arrayList = buildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i15 == 1) {
                    arrayList = buildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i15 == 2) {
                    arrayList = buildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = buildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.I.add(new k(this, string));
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i16);
                        TLRPC.Dialog dialog4 = communityPeerDialog.dialog;
                        if (dialog4 != null) {
                            this.I.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.I.add(new k(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.I.add(new k(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.I.clear();
        U();
        MessagesController messagesController = MessagesController.getInstance(i13);
        int i17 = this.r;
        dy dyVar = this.N;
        if (j11 != 0) {
            R3 = messagesController.getDialogsByCommunity(j11);
        } else {
            R3 = dyVar.R3(i13, this.h, i17, this.C);
            if (R3 == null) {
                R3 = new ArrayList();
            }
        }
        int size = R3.size();
        this.f = size;
        this.Q = false;
        if (size == 0 && dyVar.e4()) {
            j3.r0.B(this, 19, this.I);
            return;
        }
        if (this.y || this.h != 0 || i17 != 0 || !messagesController.isDialogsEndReached(i17) || this.e) {
            j10 = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i13).doneLoadingContacts || ContactsController.getInstance(i13).contacts.isEmpty()) {
            j10 = 0;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(ContactsController.getInstance(i13).contacts);
            long j12 = UserConfig.getInstance(i13).clientUserId;
            int size2 = this.d.size();
            int i18 = 0;
            while (i18 < size2) {
                long j13 = ((TLRPC.TL_contact) this.d.get(i18)).user_id;
                if (j13 == j12 || messagesController.dialogs_dict.f(j13) != null) {
                    this.d.remove(i18);
                    i18--;
                    size2--;
                }
                i18++;
            }
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                T(false);
            }
        }
        MessagesController.DialogFilter H = H();
        if ((H == null || H.isDefault()) && dyVar != null && dyVar.J0 && dyVar.L0 != j10) {
            j3.r0.B(this, 20, this.I);
            int i19 = 0;
            while (true) {
                if (i19 >= R3.size()) {
                    dialog = null;
                    break;
                } else {
                    if (R3.get(i19).id == dyVar.L0) {
                        dialog = R3.get(i19);
                        break;
                    }
                    i19++;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = dyVar.L0;
            }
            this.I.add(new k(this, 0, dialog));
            j3.r0.B(this, 20, this.I);
        } else if ((H == null || H.isDefault()) && dyVar != null && this.h == 3 && dyVar.M0 != j10) {
            j3.r0.B(this, 20, this.I);
            int i20 = 0;
            while (true) {
                if (i20 >= R3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (R3.get(i20).id == dyVar.M0) {
                        dialog3 = R3.get(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = dyVar.M0;
            }
            z10 = false;
            this.I.add(new k(this, 0, dialog3));
            j3.r0.B(this, 20, this.I);
            this.A = z10;
            i9 = this.h;
            if ((i9 != 7 || i9 == 8) && H != null && H.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(H.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.A = true;
                    this.I.add(new k(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.P;
            if (requestPeerType != null) {
                j3.r0.B(this, 15, this.I);
            }
            if (!this.F || this.O) {
                for (i10 = 0; i10 < R3.size(); i10++) {
                    if (this.h == 2 && (R3.get(i10) instanceof xx)) {
                        this.I.add(new k(this, 14, R3.get(i10)));
                    } else {
                        this.I.add(new k(this, 0, R3.get(i10)));
                    }
                }
                j3.r0.B(this, 10, this.I);
            }
            if (this.f == 0 && this.e) {
                this.Q = true;
                if (requestPeerType != null) {
                    j3.r0.B(this, 16, this.I);
                } else {
                    this.I.add(new k(this, E(), 0));
                }
                j3.r0.B(this, 8, this.I);
                j3.r0.B(this, 7, this.I);
                j3.r0.B(this, 13, this.I);
            } else {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i11 = this.h) != 7 && i11 != 8) {
                    if (this.f == 0) {
                        this.Q = true;
                        if (requestPeerType != null) {
                            j3.r0.B(this, 16, this.I);
                        } else {
                            this.I.add(new k(this, E(), 0));
                        }
                        j3.r0.B(this, 8, this.I);
                        j3.r0.B(this, 7, this.I);
                    } else {
                        for (int i21 = 0; i21 < R3.size(); i21++) {
                            this.I.add(new k(this, 0, R3.get(i21)));
                        }
                        j3.r0.B(this, 8, this.I);
                        j3.r0.B(this, 7, this.I);
                    }
                    for (int i22 = 0; i22 < this.d.size(); i22++) {
                        this.I.add(new k(this, (TLRPC.TL_contact) this.d.get(i22)));
                    }
                    j3.r0.B(this, 10, this.I);
                    z11 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        j3.r0.B(this, 12, this.I);
                    }
                    if (this.n && this.h == 3) {
                        j3.r0.B(this, 21, this.I);
                    }
                    if (!z11) {
                        for (int i23 = 0; i23 < R3.size(); i23++) {
                            if (this.h == 2 && (R3.get(i23) instanceof xx)) {
                                this.I.add(new k(this, 14, R3.get(i23)));
                            } else {
                                this.I.add(new k(this, 0, R3.get(i23)));
                            }
                        }
                        if (j11 != 0 || this.M || (i12 = this.h) == 7 || i12 == 8 || MessagesController.getInstance(i13).isDialogsEndReached(i17)) {
                            int i24 = this.f;
                            if (i24 == 0) {
                                this.Q = true;
                                if (requestPeerType != null) {
                                    j3.r0.B(this, 16, this.I);
                                } else {
                                    this.I.add(new k(this, E(), 0));
                                }
                            } else {
                                if (i17 == 0 && i24 > 10 && this.h == 0) {
                                    j3.r0.B(this, 11, this.I);
                                }
                                j3.r0.B(this, 10, this.I);
                            }
                        } else {
                            if (this.f != 0) {
                                j3.r0.B(this, 1, this.I);
                            }
                            j3.r0.B(this, 10, this.I);
                        }
                    }
                    if (messagesController.hiddenUndoChats.isEmpty()) {
                        int i25 = 0;
                        while (i25 < this.I.size()) {
                            k kVar = (k) this.I.get(i25);
                            if (kVar.a == 0 && (dialog2 = kVar.c) != null && messagesController.isHiddenByUndo(dialog2.id)) {
                                this.I.remove(i25);
                                i25--;
                            }
                            i25++;
                        }
                        return;
                    }
                    return;
                }
                if (this.y) {
                    int size3 = MessagesController.getInstance(i13).hintDialogs.size();
                    j3.r0.B(this, 2, this.I);
                    for (int i26 = 0; i26 < size3; i26++) {
                        this.I.add(new k(this, MessagesController.getInstance(i13).hintDialogs.get(i26)));
                    }
                    j3.r0.B(this, 3, this.I);
                } else {
                    int i27 = this.h;
                    if (i27 == 11 || i27 == 13) {
                        j3.r0.B(this, 7, this.I);
                        j3.r0.B(this, 12, this.I);
                    } else if (i27 == 12) {
                        j3.r0.B(this, 7, this.I);
                    }
                }
            }
            z11 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            j3.r0.B(this, 12, this.I);
            if (this.n) {
                j3.r0.B(this, 21, this.I);
            }
            if (!z11) {
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
        }
        z10 = false;
        this.A = z10;
        i9 = this.h;
        if (i9 != 7) {
        }
        messagesController.checkChatlistFolderUpdate(H.id, false);
        chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
        if (chatlistFolderUpdates != null) {
            this.A = true;
            this.I.add(new k(this, chatlistFolderUpdates));
        }
        requestPeerType = this.P;
        if (requestPeerType != null) {
        }
        if (this.F) {
        }
        while (i10 < R3.size()) {
        }
        j3.r0.B(this, 10, this.I);
    }

    public final void W(Runnable runnable) {
        if (this.V) {
            this.W = true;
            return;
        }
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.addAll(this.I);
        V();
        ArrayList arrayList2 = new ArrayList(this.I);
        ArrayList arrayList3 = this.J;
        this.I = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && Y) {
            Utilities.searchQueue.postRunnable(new androidx.car.app.utils.c(this, gVar, runnable, arrayList2, 23));
            return;
        }
        f2.o c10 = f2.s.c(gVar, true);
        this.V = false;
        if (runnable != null) {
            runnable.run();
        }
        this.I = arrayList2;
        c10.b(this);
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return this.x.isEmpty();
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
        v6 storiesController = MessagesController.getInstance(this.B).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i9)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.N.getOrCreateStoryViewer().G(this.c, null, arrayList2, 0, null, null, new e7(this.G, true), false);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        int i9 = this.B;
        MessagesController.getInstance(i9);
        if (MessagesController.getInstance(i9).getStoriesController().I(r2Var.getDialogId())) {
            dy dyVar = this.N;
            dyVar.getOrCreateStoryViewer().getClass();
            dyVar.getOrCreateStoryViewer().D(dyVar.getParentActivity(), r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
        this.N.H4(r2Var);
    }

    @Override // f2.r0
    public final int h() {
        int size = this.I.size();
        this.v = size;
        return size;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return ((k) this.I.get(i9)).k;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((k) this.I.get(i9)).a;
    }

    @Override // f2.r0
    public void l() {
        if (this.V) {
            this.I = new ArrayList();
        }
        this.V = false;
        V();
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0602  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String str;
        String str2;
        String userName;
        String formatPluralStringComma;
        TLRPC.Chat chat3;
        int i10;
        String string;
        int i11 = q1Var.f;
        View view = q1Var.a;
        int i12 = this.B;
        dy dyVar = this.N;
        if (i11 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) I(i9);
            Object I = I(i9 + 1);
            TLRPC.Dialog dialog2 = I instanceof TLRPC.Dialog ? (TLRPC.Dialog) I : null;
            int i13 = this.h;
            ArrayList arrayList = this.x;
            if (i13 == 2 || i13 == 15) {
                h6 h6Var = (h6) view;
                long dialogId = h6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (chat3 = MessagesController.getInstance(i12).getChat(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = chat3;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i14 = chat.participants_count;
                        formatPluralStringComma = i14 != 0 ? LocaleController.formatPluralStringComma("Members", i14) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                    } else {
                        int i15 = chat.participants_count;
                        formatPluralStringComma = i15 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i15) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    str2 = formatPluralStringComma;
                    chat2 = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(dialog.id));
                    if (user == 0) {
                        chat2 = null;
                        str = null;
                        str2 = "";
                        h6Var.I = dialog2 == null;
                        h6Var.t(chat2, null, str, str2, false, false);
                        h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), dialogId == h6Var.getDialogId());
                        if (i9 >= this.f + 1) {
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
                        str2 = user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(i12, user);
                    }
                }
                str = userName;
                h6Var.I = dialog2 == null;
                h6Var.t(chat2, null, str, str2, false, false);
                h6Var.s(arrayList.contains(Long.valueOf(h6Var.getDialogId())), dialogId == h6Var.getDialogId());
                if (i9 >= this.f + 1) {
                }
            } else {
                r2 r2Var = (r2) view;
                r2Var.M0 = this.R != 0 && ChatObject.isHiddenInCommunity(i12, dialog.id);
                r2Var.o2 = false;
                r2Var.p2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    r2Var.setDialogSelected(dialog.id == this.s);
                }
                r2Var.U(arrayList.contains(Long.valueOf(dialog.id)), false);
                if (i9 == 1 && dyVar != null && dyVar.J0 && dyVar.L0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H = H();
                    if (H == null || H.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(dyVar.L0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else if (i9 == 1 && dyVar != null && this.h == 3 && dyVar.M0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H2 = H();
                    if (H2 == null || H2.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(dyVar.M0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else {
                    r2Var.setCustomMessage(null);
                }
                r2Var.W(dialog, this.h, this.r);
                if (r2Var.getMeasuredHeight() > 0 && r2Var.getMeasuredHeight() != r2Var.y()) {
                    r2Var.requestLayout();
                }
                boolean z10 = r2Var.f;
                boolean z11 = this.F;
                if (z10 != z11) {
                    r2Var.f = z11;
                    r2Var.requestLayout();
                }
                j jVar = this.L;
                if (jVar != null && i9 < 10) {
                    long j10 = dialog.id;
                    ArrayList arrayList2 = jVar.d;
                    if (!jVar.a.contains(Long.valueOf(j10)) && !jVar.b.contains(Long.valueOf(j10)) && !jVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
            }
        } else if (i11 == 4) {
            ((s2) view).setRecentMeUrl((TLRPC.RecentMeUrl) I(i9));
        } else if (i11 == 5) {
            x2 x2Var = (x2) view;
            int i16 = this.X;
            int E = E();
            this.X = E;
            xz0 xz0Var = x2Var.n;
            TextView textView = x2Var.h;
            pi0 pi0Var = x2Var.f;
            if (x2Var.r != E) {
                x2Var.r = E;
                if (E == 0 || E == 1) {
                    i10 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (E != 2) {
                    pi0Var.setAutoRepeat(true);
                    i10 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    pi0Var.setAutoRepeat(false);
                    i10 = R.raw.filter_no_chats;
                    if (this.w) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                if (i10 != 0) {
                    pi0Var.setVisibility(0);
                    if (x2Var.r == 1) {
                        if (x2Var.d) {
                            x2Var.a = 1.0f;
                            String string2 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string2 = string2.replace('\n', ' ');
                            }
                            xz0Var.a(string2, true, false);
                            x2Var.requestLayout();
                        } else {
                            x2Var.a(true);
                        }
                    }
                    if (x2Var.s != i10) {
                        pi0Var.f(i10, 100, 100, null);
                        pi0Var.d();
                        x2Var.s = i10;
                    }
                } else {
                    pi0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string = string.replace('\n', ' ');
                }
                xz0Var.a(string, false, false);
            }
            int i17 = this.h;
            if (i17 != 7 && i17 != 8) {
                x2Var.setOnUtyanAnimationEndListener(new f(this, r13 ? 1 : 0));
                x2Var.setOnUtyanAnimationUpdateListener(new k6(this, 5));
                if (!x2Var.d && this.f == 0) {
                    dyVar.z4(0.0f);
                    for (cy cyVar : dyVar.a0) {
                        ((f2.m0) cyVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i16 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            x2Var.a(false);
                        }
                    } else if (x2Var.d && this.X == 0) {
                        ValueAnimator valueAnimator = x2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        x2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(x2Var.a, 0.0f).setDuration(250L);
                        x2Var.e = duration;
                        duration.setInterpolator(xs.d);
                        x2Var.e.addUpdateListener(new v2(x2Var, 1));
                        x2Var.e.addListener(new w2(x2Var, 0));
                        x2Var.e.start();
                    }
                } else if (!x2Var.d) {
                    x2Var.a(true);
                }
            }
        } else if (i11 == 6) {
            ((va) view).e((TLRPC.User) I(i9), null, null, false);
        } else if (i11 == 7) {
            m4 m4Var = (m4) view;
            int i18 = this.h;
            if (i18 != 11 && i18 != 12 && i18 != 13) {
                m4Var.setText(LocaleController.getString((this.f == 0 && this.e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i9 == 0) {
                m4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                m4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i11 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.P;
            if (i11 != 12) {
                switch (i11) {
                    case 14:
                        m4 m4Var2 = (m4) view;
                        m4Var2.setTextSize(14.0f);
                        m4Var2.setTextColor(f6.w0(null, f6.y6, false));
                        m4Var2.setBackgroundColor(f6.w0(null, f6.e7, false));
                        int i19 = ((xx) I(i9)).a;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 == 2) {
                                    m4Var2.setText(LocaleController.getString(R.string.FilterGroups));
                                    break;
                                }
                            } else {
                                m4Var2.setText(LocaleController.getString(R.string.MyGroups));
                                break;
                            }
                        } else {
                            m4Var2.setText(LocaleController.getString(R.string.MyChannels));
                            break;
                        }
                        break;
                    case 15:
                        ((q6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((b3) view).set(requestPeerType);
                        break;
                    case 17:
                        z2 z2Var = (z2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.I.get(i9)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            z2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), f6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 20:
                                v3 v3Var = (v3) view;
                                if (dyVar == null || !dyVar.J0) {
                                    if (this.h == 3) {
                                        if (i9 == 0) {
                                            v3Var.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                            break;
                                        } else {
                                            v3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                            break;
                                        }
                                    }
                                } else if (i9 == 0) {
                                    v3Var.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                    break;
                                } else {
                                    v3Var.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                    break;
                                }
                                break;
                            case 21:
                                r2 r2Var2 = (r2) view;
                                m2 m2Var = new m2();
                                m2Var.a = LocaleController.getString(R.string.StoriesForwardTitle);
                                m2Var.b = LocaleController.getString(R.string.StoriesForwardText);
                                r2Var2.o2 = false;
                                r2Var2.p2 = false;
                                r2Var2.setDialog(m2Var);
                                if (r2Var2.getMeasuredHeight() > 0 && r2Var2.getMeasuredHeight() != r2Var2.y()) {
                                    r2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((m4) view).setText((String) I(i9));
                                break;
                            case 23:
                                Object I2 = I(i9);
                                r2 r2Var3 = (r2) view;
                                if (I2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) I2;
                                    r2Var3.M0 = ChatObject.isHiddenInCommunity(i12, chat4);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat4.participants_count, new Object[0]));
                                    r2Var3.V(-chat4.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) I2;
                                    r2Var3.M0 = ChatObject.isHiddenInCommunity(i12, user2);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    r2Var3.V(user2.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof p8)) {
                    return;
                }
                p8 p8Var = (p8) view;
                int i20 = f6.q6;
                p8Var.e(i20, i20);
                if (requestPeerType == null) {
                    p8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    p8Var.m(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    p8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                p8Var.x = true;
                p8Var.setOffsetFromImage(75);
            }
        } else {
            b9 b9Var = (b9) view;
            b9Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.K == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.K = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            l80 textView2 = b9Var.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (dyVar == null || !dyVar.K3) ? this.K : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i9 >= this.f + 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.z6] */
    /* JADX WARN: Type inference failed for: r2v12, types: [of.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, of.i] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.q6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [of.h] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.z2] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.an] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, of.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.v3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, org.telegram.ui.Cells.p8] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.e00] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewGroup, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, android.view.ViewGroup, dh.g] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, org.telegram.ui.Cells.a0, org.telegram.ui.Cells.s2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.telegram.ui.Cells.x2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.va] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ?? r22;
        long j10 = this.R;
        Context context = this.c;
        switch (i9) {
            case 0:
            case 21:
                int i10 = this.h;
                if (i10 == 2 || i10 == 15) {
                    r22 = new h6(context, null);
                } else {
                    r2 r2Var = new r2(this.N, this.c, false, this.B, null);
                    if (S()) {
                        i9 i9Var = new i9(this, 4);
                        r2Var.F1 = true;
                        r2Var.G1 = i9Var;
                    }
                    r2Var.setArchivedPullAnimation(this.H);
                    r2Var.setPreloader(this.L);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.O);
                    if (i9 == 21) {
                        d7 d7Var = new d7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.B4);
                        r2Var = r2Var;
                        r2Var.C = d7Var;
                        r2Var.B = true;
                    }
                    if (j10 != 0) {
                        r2Var.K0 = true;
                    }
                    r22 = r2Var;
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(f6.w0(null, f6.d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new e00(context, null);
                r22.setIsSingleCell(true);
                int i11 = i9 == 13 ? 18 : 7;
                r22.setViewType(i11);
                if (i11 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i9 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(f6.w0(null, f6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                r22.addView(textView, e6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new x8(this, 8));
                break;
            case 3:
                r22 = new dh.g(context, 3);
                r22.setBackgroundColor(f6.w0(null, f6.a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(f6.V0(context, R.drawable.greydivider, f6.b7));
                r22.addView(view, e6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new s2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new z8((b6) null);
                r22.w = AndroidUtilities.dp(40.0f);
                r22.B = AndroidUtilities.dp(10.0f);
                r22.D = UserConfig.selectedAccount;
                f6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new va(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                dy dyVar = this.N;
                if (dyVar == null || !dyVar.J0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new z6(context, (j2) null);
                fq fqVar = new fq(new ColorDrawable(f6.w0(null, f6.a7, false)), f6.V0(context, R.drawable.greydivider, f6.b7));
                fqVar.w = true;
                r22.setBackgroundDrawable(fqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new p8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(f6.w0(null, f6.d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                fq fqVar2 = new fq(new ColorDrawable(f6.w0(null, f6.a7, false)), f6.V0(context, R.drawable.greydivider, f6.b7));
                fqVar2.w = true;
                r22.setBackgroundDrawable(fqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.c, f6.f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new q6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(f6.w0(null, f6.a7, false));
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new an(context, 6);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new p6(this.c, this.B, null, new f(this, 1), null), e6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new v3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.N, this.c, false, this.B, null);
                if (j10 != 0) {
                    r2Var2.K0 = true;
                    r2Var2.L0 = true;
                }
                r22 = r2Var2;
                break;
        }
        r22.setLayoutParams(new f2.a1(-1, (i9 == 5 || i9 == 19) ? -1 : -2));
        return new ik0(r22);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.S(this.D, false);
            r2Var.U(this.x.contains(Long.valueOf(r2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.n2
    public void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public void d(r2 r2Var) {
    }
}
