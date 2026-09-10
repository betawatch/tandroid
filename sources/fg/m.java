package fg;

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
import bi.a6;
import bi.l4;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.g7;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import zh.i5;
import zh.s5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class m extends ul0 implements n2 {
    public static final boolean c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public vl0 K;
    public si0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final wy R;
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

    public m(wy wyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.R = wyVar;
        this.h = i10;
        this.r = i11;
        this.w = z10;
        this.y = i11 == 0 && i10 == 0 && !z10;
        this.x = arrayList;
        this.F = i12;
        this.V = wyVar.X2;
        if (i11 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new bi.f0(jVar, 5);
            this.P = jVar;
        }
        this.T = requestPeerType;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int E() {
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

    public final int F(long j3) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((k) this.M.get(i10)).c != null && ((k) this.M.get(i10)).c.id == j3) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.y) {
            i10 = com.google.android.gms.internal.vision.e2.e(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        return (i11 == 11 || i11 == 13) ? i10 - 2 : i11 == 12 ? i10 - 1 : i10;
    }

    public final MessagesController.DialogFilter H() {
        int i10 = this.h;
        if (i10 == 7 || i10 == 8) {
            return MessagesController.getInstance(this.F).selectedDialogFilter[this.h - 7];
        }
        return null;
    }

    public final Object I(int i10) {
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

    public final void M(boolean z10) {
        this.n = z10;
    }

    public final void N(si0 si0Var) {
        this.L = si0Var;
    }

    public final void O(vl0 vl0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < vl0Var.getChildCount(); i10++) {
            if (vl0Var.getChildAt(i10) instanceof r2) {
                ((r2) vl0Var.getChildAt(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < vl0Var.getCachedChildCount(); i11++) {
            if (vl0Var.P(i11) instanceof r2) {
                ((r2) vl0Var.P(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < vl0Var.getHiddenChildCount(); i12++) {
            if (vl0Var.V(i12) instanceof r2) {
                ((r2) vl0Var.V(i12)).f = z10;
            }
        }
        for (int i13 = 0; i13 < vl0Var.getAttachedScrapChildCount(); i13++) {
            if (vl0Var.O(i13) instanceof r2) {
                ((r2) vl0Var.O(i13)).f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.Q = z10;
    }

    public final void Q(long j3) {
        this.s = j3;
    }

    public final void R(sy syVar) {
        this.K = syVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
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

    public final void U() {
        this.y = this.r == 0 && this.h == 0 && !this.w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty();
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
        long j3;
        TLRPC.Dialog dialog;
        boolean z10;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z11;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i14 = this.F;
        long j10 = this.V;
        if (j10 != 0) {
            this.M.clear();
            U();
            MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i14).buildCommunityPeers(j10);
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
        U();
        MessagesController messagesController = MessagesController.getInstance(i14);
        int i18 = this.r;
        wy wyVar = this.R;
        if (j10 != 0) {
            R3 = messagesController.getDialogsByCommunity(j10);
        } else {
            R3 = wyVar.R3(i14, this.h, i18, this.G);
            if (R3 == null) {
                R3 = new ArrayList();
            }
        }
        int size = R3.size();
        this.f = size;
        this.U = false;
        if (size == 0 && wyVar.e4()) {
            com.google.android.gms.internal.vision.e2.r(this, 19, this.M);
            return;
        }
        if (this.y || this.h != 0 || i18 != 0 || !messagesController.isDialogsEndReached(i18) || this.e) {
            j3 = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(i14).doneLoadingContacts || ContactsController.getInstance(i14).contacts.isEmpty()) {
            j3 = 0;
            this.d = null;
        } else {
            j3 = 0;
            this.d = new ArrayList(ContactsController.getInstance(i14).contacts);
            long j11 = UserConfig.getInstance(i14).clientUserId;
            int size2 = this.d.size();
            int i19 = 0;
            while (i19 < size2) {
                long j12 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j12 == j11 || messagesController.dialogs_dict.f(j12) != null) {
                    this.d.remove(i19);
                    i19--;
                    size2--;
                }
                i19++;
            }
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                T(false);
            }
        }
        MessagesController.DialogFilter H = H();
        if ((H == null || H.isDefault()) && wyVar != null && wyVar.N0 && wyVar.P0 != j3) {
            com.google.android.gms.internal.vision.e2.r(this, 20, this.M);
            int i20 = 0;
            while (true) {
                if (i20 >= R3.size()) {
                    dialog = null;
                    break;
                } else {
                    if (R3.get(i20).id == wyVar.P0) {
                        dialog = R3.get(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = wyVar.P0;
            }
            this.M.add(new k(this, 0, dialog));
            com.google.android.gms.internal.vision.e2.r(this, 20, this.M);
        } else if ((H == null || H.isDefault()) && wyVar != null && this.h == 3 && wyVar.Q0 != j3) {
            com.google.android.gms.internal.vision.e2.r(this, 20, this.M);
            int i21 = 0;
            while (true) {
                if (i21 >= R3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (R3.get(i21).id == wyVar.Q0) {
                        dialog3 = R3.get(i21);
                        break;
                    }
                    i21++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = wyVar.Q0;
            }
            z10 = false;
            this.M.add(new k(this, 0, dialog3));
            com.google.android.gms.internal.vision.e2.r(this, 20, this.M);
            this.E = z10;
            i10 = this.h;
            if ((i10 != 7 || i10 == 8) && H != null && H.isChatlist()) {
                messagesController.checkChatlistFolderUpdate(H.id, false);
                chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
                if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                    this.E = true;
                    this.M.add(new k(this, chatlistFolderUpdates));
                }
            }
            requestPeerType = this.T;
            if (requestPeerType != null) {
                com.google.android.gms.internal.vision.e2.r(this, 15, this.M);
            }
            if (!this.J || this.S) {
                for (i11 = 0; i11 < R3.size(); i11++) {
                    if (this.h == 2 && (R3.get(i11) instanceof ry)) {
                        this.M.add(new k(this, 14, R3.get(i11)));
                    } else {
                        this.M.add(new k(this, 0, R3.get(i11)));
                    }
                }
                com.google.android.gms.internal.vision.e2.r(this, 10, this.M);
            }
            if (this.f == 0 && this.e) {
                this.U = true;
                if (requestPeerType != null) {
                    com.google.android.gms.internal.vision.e2.r(this, 16, this.M);
                } else {
                    this.M.add(new k(this, E(), 0));
                }
                com.google.android.gms.internal.vision.e2.r(this, 8, this.M);
                com.google.android.gms.internal.vision.e2.r(this, 7, this.M);
                com.google.android.gms.internal.vision.e2.r(this, 13, this.M);
            } else {
                ArrayList arrayList2 = this.d;
                if (arrayList2 != null && !arrayList2.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                    if (this.f == 0) {
                        this.U = true;
                        if (requestPeerType != null) {
                            com.google.android.gms.internal.vision.e2.r(this, 16, this.M);
                        } else {
                            this.M.add(new k(this, E(), 0));
                        }
                        com.google.android.gms.internal.vision.e2.r(this, 8, this.M);
                        com.google.android.gms.internal.vision.e2.r(this, 7, this.M);
                    } else {
                        for (int i22 = 0; i22 < R3.size(); i22++) {
                            this.M.add(new k(this, 0, R3.get(i22)));
                        }
                        com.google.android.gms.internal.vision.e2.r(this, 8, this.M);
                        com.google.android.gms.internal.vision.e2.r(this, 7, this.M);
                    }
                    for (int i23 = 0; i23 < this.d.size(); i23++) {
                        this.M.add(new k(this, (TLRPC.TL_contact) this.d.get(i23)));
                    }
                    com.google.android.gms.internal.vision.e2.r(this, 10, this.M);
                    z11 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        com.google.android.gms.internal.vision.e2.r(this, 12, this.M);
                    }
                    if (this.n && this.h == 3) {
                        com.google.android.gms.internal.vision.e2.r(this, 21, this.M);
                    }
                    if (!z11) {
                        for (int i24 = 0; i24 < R3.size(); i24++) {
                            if (this.h == 2 && (R3.get(i24) instanceof ry)) {
                                this.M.add(new k(this, 14, R3.get(i24)));
                            } else {
                                this.M.add(new k(this, 0, R3.get(i24)));
                            }
                        }
                        if (j10 != 0 || this.Q || (i13 = this.h) == 7 || i13 == 8 || MessagesController.getInstance(i14).isDialogsEndReached(i18)) {
                            int i25 = this.f;
                            if (i25 == 0) {
                                this.U = true;
                                if (requestPeerType != null) {
                                    com.google.android.gms.internal.vision.e2.r(this, 16, this.M);
                                } else {
                                    this.M.add(new k(this, E(), 0));
                                }
                            } else {
                                if (i18 == 0 && i25 > 10 && this.h == 0) {
                                    com.google.android.gms.internal.vision.e2.r(this, 11, this.M);
                                }
                                com.google.android.gms.internal.vision.e2.r(this, 10, this.M);
                            }
                        } else {
                            if (this.f != 0) {
                                com.google.android.gms.internal.vision.e2.r(this, 1, this.M);
                            }
                            com.google.android.gms.internal.vision.e2.r(this, 10, this.M);
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
                    com.google.android.gms.internal.vision.e2.r(this, 2, this.M);
                    for (int i27 = 0; i27 < size3; i27++) {
                        this.M.add(new k(this, MessagesController.getInstance(i14).hintDialogs.get(i27)));
                    }
                    com.google.android.gms.internal.vision.e2.r(this, 3, this.M);
                } else {
                    int i28 = this.h;
                    if (i28 == 11 || i28 == 13) {
                        com.google.android.gms.internal.vision.e2.r(this, 7, this.M);
                        com.google.android.gms.internal.vision.e2.r(this, 12, this.M);
                    } else if (i28 == 12) {
                        com.google.android.gms.internal.vision.e2.r(this, 7, this.M);
                    }
                }
            }
            z11 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            com.google.android.gms.internal.vision.e2.r(this, 12, this.M);
            if (this.n) {
                com.google.android.gms.internal.vision.e2.r(this, 21, this.M);
            }
            if (!z11) {
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
        }
        z10 = false;
        this.E = z10;
        i10 = this.h;
        if (i10 != 7) {
        }
        messagesController.checkChatlistFolderUpdate(H.id, false);
        chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(H.id);
        if (chatlistFolderUpdates != null) {
            this.E = true;
            this.M.add(new k(this, chatlistFolderUpdates));
        }
        requestPeerType = this.T;
        if (requestPeerType != null) {
        }
        if (this.J) {
        }
        while (i11 < R3.size()) {
        }
        com.google.android.gms.internal.vision.e2.r(this, 10, this.M);
    }

    public final void W(Runnable runnable) {
        if (this.Z) {
            this.a0 = true;
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        V();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && c0) {
            Utilities.searchQueue.postRunnable(new androidx.car.app.utils.b(this, gVar, runnable, arrayList2, 9));
            return;
        }
        s4.k c10 = s4.o.c(gVar, true);
        this.Z = false;
        if (runnable != null) {
            runnable.run();
        }
        this.M = arrayList2;
        c10.b(this);
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return this.x.isEmpty();
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
        i5 storiesController = MessagesController.getInstance(this.F).getStoriesController();
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
        this.R.getOrCreateStoryViewer().F(this.c, null, arrayList2, 0, null, null, new s5(this.K, true), false);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(r2Var.getDialogId())) {
            wy wyVar = this.R;
            wyVar.getOrCreateStoryViewer().getClass();
            wyVar.getOrCreateStoryViewer().D(wyVar.getParentActivity(), r2Var.getDialogId(), s5.a((vl0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
        this.R.H4(r2Var);
    }

    @Override // s4.h0
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return ((k) this.M.get(i10)).k;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((k) this.M.get(i10)).a;
    }

    @Override // s4.h0
    public void l() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        V();
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0600  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String str;
        String str2;
        String userName;
        String formatPluralStringComma;
        TLRPC.Chat chat3;
        int i11;
        String string;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = this.F;
        wy wyVar = this.R;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) I(i10);
            Object I = I(i10 + 1);
            TLRPC.Dialog dialog2 = I instanceof TLRPC.Dialog ? (TLRPC.Dialog) I : null;
            int i14 = this.h;
            ArrayList arrayList = this.x;
            if (i14 == 2 || i14 == 15) {
                j6 j6Var = (j6) view;
                long dialogId = j6Var.getDialogId();
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
                        j6Var.M = dialog2 == null;
                        j6Var.t(chat2, null, str, str2, false, false);
                        j6Var.s(arrayList.contains(Long.valueOf(j6Var.getDialogId())), dialogId == j6Var.getDialogId());
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
                j6Var.M = dialog2 == null;
                j6Var.t(chat2, null, str, str2, false, false);
                j6Var.s(arrayList.contains(Long.valueOf(j6Var.getDialogId())), dialogId == j6Var.getDialogId());
                if (i10 >= this.f + 1) {
                }
            } else {
                r2 r2Var = (r2) view;
                r2Var.Q0 = this.V != 0 && ChatObject.isHiddenInCommunity(i13, dialog.id);
                r2Var.s2 = false;
                r2Var.t2 = false;
                if (this.h == 0 && AndroidUtilities.isTablet()) {
                    r2Var.setDialogSelected(dialog.id == this.s);
                }
                r2Var.V(arrayList.contains(Long.valueOf(dialog.id)), false);
                if (i10 == 1 && wyVar != null && wyVar.N0 && wyVar.P0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H = H();
                    if (H == null || H.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(wyVar.P0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else if (i10 == 1 && wyVar != null && this.h == 3 && wyVar.Q0 != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter H2 = H();
                    if (H2 == null || H2.isDefault()) {
                        r2Var.setCustomMessage(DialogObject.getStatus(wyVar.Q0));
                    } else {
                        r2Var.setCustomMessage(null);
                    }
                } else {
                    r2Var.setCustomMessage(null);
                }
                r2Var.X(dialog, this.h, this.r);
                if (r2Var.getMeasuredHeight() > 0 && r2Var.getMeasuredHeight() != r2Var.y()) {
                    r2Var.requestLayout();
                }
                boolean z10 = r2Var.f;
                boolean z11 = this.J;
                if (z10 != z11) {
                    r2Var.f = z11;
                    r2Var.requestLayout();
                }
                j jVar = this.P;
                if (jVar != null && i10 < 10) {
                    long j3 = dialog.id;
                    ArrayList arrayList2 = jVar.d;
                    if (!jVar.a.contains(Long.valueOf(j3)) && !jVar.b.contains(Long.valueOf(j3)) && !jVar.c.contains(Long.valueOf(j3)) && !arrayList2.contains(Long.valueOf(j3))) {
                        arrayList2.add(Long.valueOf(j3));
                    }
                }
            }
        } else if (i12 == 4) {
            ((s2) view).setRecentMeUrl((TLRPC.RecentMeUrl) I(i10));
        } else if (i12 == 5) {
            x2 x2Var = (x2) view;
            int i17 = this.b0;
            int E = E();
            this.b0 = E;
            d11 d11Var = x2Var.n;
            TextView textView = x2Var.h;
            kj0 kj0Var = x2Var.f;
            if (x2Var.r != E) {
                x2Var.r = E;
                if (E == 0 || E == 1) {
                    i11 = R.raw.utyan_newborn;
                    string = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (E != 2) {
                    kj0Var.setAutoRepeat(true);
                    i11 = R.raw.filter_new;
                    string = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    kj0Var.setAutoRepeat(false);
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
                    kj0Var.setVisibility(0);
                    if (x2Var.r == 1) {
                        if (x2Var.d) {
                            x2Var.a = 1.0f;
                            String string2 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string2 = string2.replace('\n', ' ');
                            }
                            d11Var.a(string2, true, false);
                            x2Var.requestLayout();
                        } else {
                            x2Var.a(true);
                        }
                    }
                    if (x2Var.s != i11) {
                        kj0Var.f(i11, 100, 100, null);
                        kj0Var.d();
                        x2Var.s = i11;
                    }
                } else {
                    kj0Var.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string = string.replace('\n', ' ');
                }
                d11Var.a(string, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                x2Var.setOnUtyanAnimationEndListener(new f(this, r13 ? 1 : 0));
                x2Var.setOnUtyanAnimationUpdateListener(new a6(this, 3));
                if (!x2Var.d && this.f == 0) {
                    wyVar.z4(0.0f);
                    for (vy vyVar : wyVar.e0) {
                        ((s4.c0) vyVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            x2Var.a(false);
                        }
                    } else if (x2Var.d && this.b0 == 0) {
                        ValueAnimator valueAnimator = x2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        x2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(x2Var.a, 0.0f).setDuration(250L);
                        x2Var.e = duration;
                        duration.setInterpolator(pt.d);
                        x2Var.e.addUpdateListener(new v2(x2Var, 1));
                        x2Var.e.addListener(new w2(x2Var, 0));
                        x2Var.e.start();
                    }
                } else if (!x2Var.d) {
                    x2Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((bb) view).d((TLRPC.User) I(i10), null, null, false);
        } else if (i12 == 7) {
            m4 m4Var = (m4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                m4Var.setText(LocaleController.getString((this.f == 0 && this.e) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                m4Var.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.T;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        m4 m4Var2 = (m4) view;
                        m4Var2.setTextSize(14.0f);
                        m4Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
                        m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false));
                        int i20 = ((ry) I(i10)).a;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 == 2) {
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
                        ((t6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((b3) view).set(requestPeerType);
                        break;
                    case 17:
                        z2 z2Var = (z2) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.M.get(i10)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            z2Var.b(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), org.telegram.ui.ActionBar.j6.I6, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                u3 u3Var = (u3) view;
                                if (wyVar == null || !wyVar.N0) {
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
                                r2 r2Var2 = (r2) view;
                                m2 m2Var = new m2();
                                m2Var.a = LocaleController.getString(R.string.StoriesForwardTitle);
                                m2Var.b = LocaleController.getString(R.string.StoriesForwardText);
                                r2Var2.s2 = false;
                                r2Var2.t2 = false;
                                r2Var2.setDialog(m2Var);
                                if (r2Var2.getMeasuredHeight() > 0 && r2Var2.getMeasuredHeight() != r2Var2.y()) {
                                    r2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((m4) view).setText((String) I(i10));
                                break;
                            case 23:
                                Object I2 = I(i10);
                                r2 r2Var3 = (r2) view;
                                if (I2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) I2;
                                    r2Var3.Q0 = ChatObject.isHiddenInCommunity(i13, chat4);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat4.participants_count, new Object[0]));
                                    r2Var3.W(-chat4.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user2 = (TLRPC.User) I2;
                                    r2Var3.Q0 = ChatObject.isHiddenInCommunity(i13, user2);
                                    r2Var3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                    r2Var3.W(user2.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof s8)) {
                    return;
                }
                s8 s8Var = (s8) view;
                int i21 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i21, i21);
                if (requestPeerType == null) {
                    s8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForImport), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    s8Var.m(R.drawable.msg_channel_create, LocaleController.getString(R.string.CreateChannelForThis), true);
                } else {
                    s8Var.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.CreateGroupForThis), true);
                }
                s8Var.x = true;
                s8Var.setOffsetFromImage(75);
            }
        } else {
            f9 f9Var = (f9) view;
            f9Var.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.O == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.O = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            m90 textView2 = f9Var.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (wyVar == null || !wyVar.O3) ? this.O : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 >= this.f + 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.c7] */
    /* JADX WARN: Type inference failed for: r2v12, types: [fg.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View, fg.i] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.t6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [fg.h] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.z2] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.qn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, fg.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.u3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View, org.telegram.ui.Cells.s8] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.a10] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.ViewGroup, org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, android.view.ViewGroup, bi.l4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, org.telegram.ui.Cells.a0, org.telegram.ui.Cells.s2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.telegram.ui.Cells.x2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.bb] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        long j3 = this.V;
        Context context = this.c;
        switch (i10) {
            case 0:
            case 21:
                int i11 = this.h;
                if (i11 == 2 || i11 == 15) {
                    r22 = new j6(context, null);
                } else {
                    r2 r2Var = new r2(this.R, this.c, false, this.F, null);
                    if (S()) {
                        ai.b bVar = new ai.b(this, 13);
                        r2Var.J1 = true;
                        r2Var.K1 = bVar;
                    }
                    r2Var.setArchivedPullAnimation(this.L);
                    r2Var.setPreloader(this.P);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        g7 g7Var = new g7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.F4);
                        r2Var = r2Var;
                        r2Var.G = g7Var;
                        r2Var.F = true;
                    }
                    if (j3 != 0) {
                        r2Var.O0 = true;
                    }
                    r22 = r2Var;
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new a10(context, null);
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
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                r22.addView(textView, w7.a6.d(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ai.u(this, 15));
                break;
            case 3:
                r22 = new l4(context, 1);
                r22.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                r22.addView(view, w7.a6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new s2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new g9((f6) null);
                r22.w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                org.telegram.ui.ActionBar.j6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new bb(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                wy wyVar = this.R;
                if (wyVar == null || !wyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new c7(context, (r6) null);
                vq vqVar = new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                vqVar.w = true;
                r22.setBackgroundDrawable(vqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new s8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                vq vqVar2 = new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                vqVar2.w = true;
                r22.setBackgroundDrawable(vqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.c, org.telegram.ui.ActionBar.j6.f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new t6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new qn(context, 4);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new u6(this.c, this.F, null, new f(this, 1), null), w7.a6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.R, this.c, false, this.F, null);
                if (j3 != 0) {
                    r2Var2.O0 = true;
                    r2Var2.P0 = true;
                }
                r22 = r2Var2;
                break;
        }
        r22.setLayoutParams(new s4.p0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new fl0(r22);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.T(this.H, false);
            r2Var.V(this.x.contains(Long.valueOf(r2Var.getDialogId())), false);
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
