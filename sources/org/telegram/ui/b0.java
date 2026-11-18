package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = i7;
        this.b = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7 = this.c;
        TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.b;
        Integer num = (Integer) this.d;
        try {
            SQLiteDatabase sQLiteDatabase = org.telegram.messenger.tr.a0(i7).b;
            if (sQLiteDatabase != null) {
                if (tL_messages_emojiGroups == null) {
                    sQLiteDatabase.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                    return;
                }
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                executeFast.bindInteger(1, num.intValue());
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    private final void b() {
        org.telegram.ui.Components.yw0 yw0Var = (org.telegram.ui.Components.yw0) this.b;
        String str = (String) this.d;
        ArrayList arrayList = new ArrayList(1);
        org.telegram.messenger.ni niVar = new org.telegram.messenger.ni();
        niVar.a = str;
        niVar.b = null;
        arrayList.add(niVar);
        org.telegram.messenger.ri.d0(yw0Var.a).Q(arrayList, 15, false, false, new org.telegram.ui.Components.kp0(yw0Var, this.c, str, arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r82;
        long j3;
        org.telegram.ui.Components.z40 z40Var;
        String G;
        int size;
        int i7;
        int size2;
        int i10;
        int i11;
        int size3;
        int L;
        float f10;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i12 = 5;
        UndoView undoView2 = null;
        r10 = null;
        String str = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        int i13 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                String str2 = (String) this.d;
                int i14 = this.c;
                HashMap hashMap = new HashMap(g4Var.v0[0].c.x);
                ArrayList arrayList = new ArrayList(g4Var.v0[0].c.y);
                g4Var.X0 = null;
                Utilities.g.c(new ai.g1(g4Var, arrayList, hashMap, str2, i14, 10));
                return;
            case 1:
                g4 g4Var2 = (g4) this.b;
                int i15 = this.c;
                vf.b bVar = (vf.b) this.d;
                if (g4Var2.J0 == i15 && g4Var2.H0 != 0) {
                    ConnectionsManager.getInstance(g4Var2.Y).cancelRequest(g4Var2.H0, false);
                    g4Var2.H0 = 0;
                }
                if (g4Var2.O0 == bVar) {
                    g4Var2.O0 = null;
                    return;
                }
                return;
            case 2:
                int i16 = this.c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.messenger.mp.u1(i16).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(i16).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 3:
                e4 e4Var = (e4) this.b;
                int i17 = this.c;
                int[] iArr = (int[]) this.d;
                e4Var.L = i17;
                e4Var.K = iArr;
                e4Var.N.d0();
                return;
            case 4:
                String str3 = (String) this.d;
                int i18 = this.c;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str3).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, i18, tL_inputGroupCallSlug, false, null, null);
                x2VarArr[0].dismiss();
                return;
            case 5:
                ((bn) this.b).nb(this.c, (ArrayList) this.d, false, false);
                return;
            case 6:
                bn bnVar = (bn) this.b;
                int i19 = this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i20 = 0;
                bnVar.A0.w0(0, i19, null);
                if (!org.telegram.messenger.g0.I3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.h3(new qg(editTextBoldCursor, i20), 100L);
                return;
            case 7:
                fl flVar = (fl) this.b;
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.d;
                int i21 = this.c;
                flVar.getClass();
                org.telegram.messenger.fj messageObject = u0Var.getMessageObject();
                kl klVar = flVar.a;
                klVar.R.l(i21, messageObject.e1(), true, org.telegram.messenger.fj.B0(messageObject.k) == klVar.R.d7 ? 1 : 0, true, 0);
                return;
            case 8:
                org.telegram.ui.Wallet.n6.N0(this.c, ((org.telegram.ui.Components.xk) this.b).getContext(), (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 9:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.b;
                int i22 = this.c;
                View view = (View) this.d;
                rnVar.W = 0;
                rnVar.V = i22;
                if (view instanceof org.telegram.ui.Cells.m8) {
                    rnVar.Z((org.telegram.ui.Cells.m8) view, true);
                    return;
                } else {
                    rnVar.r.g(rnVar.J0);
                    return;
                }
            case 10:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.b;
                a0.h hVar = (a0.h) this.d;
                int i23 = this.c;
                org.telegram.ui.ActionBar.h2 h2Var = quVar.V2.n1;
                if (h2Var instanceof bn) {
                    bn bnVar2 = (bn) h2Var;
                    bnVar2.h8();
                    undoView = bnVar2.N3;
                } else {
                    undoView = h2Var instanceof ProfileActivity ? ((ProfileActivity) h2Var).M : null;
                }
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i23), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 11:
                org.telegram.ui.Components.nx nxVar = (org.telegram.ui.Components.nx) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i24 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var == null) {
                    return;
                }
                u1Var.setOnCancelListener(new di.z(nxVar, i24, i12));
                u1VarArr[0].show();
                return;
            case 12:
                int i25 = this.c;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                h2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new jg.u(h2Var2, i25, x10Var, i12));
                return;
            case 13:
                org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) this.b;
                int i26 = this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = r20Var.d;
                org.telegram.ui.Components.s20 s20Var = r20Var.x;
                if (i26 != r20Var.n) {
                    return;
                }
                r20Var.h = false;
                TLRPC.Chat chat2 = s20Var.Q1;
                org.telegram.ui.Components.kv0 kv0Var = s20Var.u1;
                if (!org.telegram.messenger.v3.T(chat2)) {
                    a0.h hVar2 = z1Var.h;
                    ArrayList arrayList3 = z1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i27);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i28 = r20Var.f - 1;
                boolean z10 = kv0Var.getVisibility() == 0;
                r20Var.f();
                if (r20Var.f > i28) {
                    s20Var.P0(i28);
                }
                if (r20Var.h || z1Var.e() || !s20Var.o1.R0()) {
                    return;
                }
                kv0Var.e(false, z10);
                return;
            case 14:
                org.telegram.ui.Components.f30 f30Var = (org.telegram.ui.Components.f30) this.b;
                int i29 = this.c;
                String str4 = (String) this.d;
                ArrayList arrayList4 = f30Var.R;
                int i30 = f30Var.Q;
                if (i29 != f30Var.W) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f30Var.e0[0] ? "$" : "#");
                sb2.append(f30Var.b0);
                String sb3 = sb2.toString();
                fi.b6 b6Var = f30Var.T;
                if (b6Var == null || !TextUtils.equals(b6Var.C, sb3)) {
                    f30Var.T = new fi.b6(i30, null, sb3);
                }
                if (f30Var.T.i.size() <= 0) {
                    r82 = 1;
                    f30Var.T.p(4, true);
                } else {
                    r82 = 1;
                }
                f30Var.S = r82;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r82;
                f30Var.b0 = str4;
                tL_channels_searchPosts.hashtag = str4;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(r82, arrayList4);
                    tL_channels_searchPosts.offset_rate = f30Var.c0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.mp.u1(i30).o1(fjVar.k.peer_id);
                }
                f30Var.X = ConnectionsManager.getInstance(i30).sendRequest(tL_channels_searchPosts, new jg.u(f30Var, i29, sb3, 6));
                return;
            case 15:
                org.telegram.ui.Components.z40 z40Var2 = (org.telegram.ui.Components.z40) this.b;
                int i31 = this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (z40Var2.m0 == null) {
                    return;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i31);
                }
                if (z40Var2.B0 && i31 == z40Var2.A0) {
                    z40Var2.q("camera open submitted: surface=" + i31);
                }
                if (!z40Var2.s0) {
                    if (i31 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(z40Var2.n0[0].getWidth(), z40Var2.n0[0].getHeight());
                    z40Var2.t0 = new CameraSession(z40Var2.I, z40Var2.n0[0], z40Var2.o0, 256, true);
                    z40Var2.w();
                    org.telegram.ui.Components.l40 l40Var = z40Var2.m0;
                    CameraSession cameraSession = z40Var2.t0;
                    Handler handler = l40Var.getHandler();
                    if (handler != null) {
                        l40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(z40Var2.t0, surfaceTexture, new org.telegram.ui.Components.c40(z40Var2, 1), new org.telegram.ui.Components.c40(z40Var2, 2));
                    return;
                }
                if (z40Var2.u0) {
                    Camera2Session camera2Session = z40Var2.v0[i31];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i31 == 1) {
                    return;
                }
                org.telegram.ui.Components.l40 l40Var2 = z40Var2.m0;
                Camera2Session camera2Session2 = z40Var2.w0;
                Handler handler2 = l40Var2.getHandler();
                if (handler2 != null) {
                    l40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                z40Var2.w0.open(surfaceTexture);
                return;
            case 16:
                org.telegram.ui.Components.r40 r40Var = (org.telegram.ui.Components.r40) this.b;
                int i32 = this.c;
                org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) this.d;
                org.telegram.ui.Components.z40 z40Var3 = r40Var.I0;
                org.telegram.messenger.e20 e20Var = z40Var3.S;
                int i33 = z40Var3.e;
                org.telegram.ui.Components.m40 m40Var = z40Var3.h;
                if (e20Var == null) {
                    org.telegram.messenger.e20 e20Var2 = new org.telegram.messenger.e20();
                    z40Var3.S = e20Var2;
                    e20Var2.a = -1L;
                    e20Var2.b = -1L;
                }
                if (z40Var3.S.c()) {
                    z40Var3.M = null;
                    z40Var3.N = null;
                    z40Var3.O = null;
                    z40Var3.P = null;
                    org.telegram.messenger.e20 e20Var3 = z40Var3.S;
                    long j10 = e20Var3.r;
                    j3 = 0;
                    double d = j10;
                    long j11 = e20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = e20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    e20Var3.r = j13;
                    z40Var = z40Var3;
                    e20Var3.q = Math.max(1L, (long) ((j13 / d) * z40Var.Q));
                    org.telegram.messenger.e20 e20Var4 = z40Var.S;
                    e20Var4.m = 1000000;
                    long j14 = e20Var4.a;
                    if (j14 > 0) {
                        e20Var4.a = j14 * 1000;
                    }
                    long j15 = e20Var4.b;
                    if (j15 > 0) {
                        e20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i33).b(z40Var.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    z40Var = z40Var3;
                    z40Var.S.q = Math.max(1L, z40Var.Q);
                }
                org.telegram.messenger.e20 e20Var5 = z40Var.S;
                e20Var5.s = true;
                e20Var5.w = z40Var.M;
                e20Var5.x = z40Var.N;
                e20Var5.y = z40Var.O;
                e20Var5.z = z40Var.P;
                e20Var5.n = 25;
                e20Var5.h = 360;
                e20Var5.k = 360;
                e20Var5.i = 360;
                e20Var5.l = 360;
                e20Var5.o = r40Var.a.getAbsolutePath();
                org.telegram.messenger.e20 e20Var6 = z40Var.S;
                if (i32 != 1) {
                    r40Var.h(r40Var.a);
                    e20Var6.r = z40Var.k0;
                    org.telegram.messenger.ks.f(i33).k(org.telegram.messenger.ks.s2, Integer.valueOf(z40Var.V), e20Var6, r40Var.a.getAbsolutePath(), r40Var.B0);
                    return;
                }
                if (m40Var.c()) {
                    Activity parentActivity = m40Var.getParentActivity();
                    long a10 = m40Var.a();
                    org.telegram.ui.Components.rm rmVar = new org.telegram.ui.Components.rm(r40Var, o40Var, e20Var6, 4);
                    org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(r40Var, 0);
                    org.telegram.ui.ActionBar.i6 i6Var = z40Var.Z0;
                    Pattern pattern = org.telegram.ui.Components.b5.a;
                    org.telegram.ui.Components.b5.H(parentActivity, a10, -1L, 0, false, rmVar, p40Var, new org.telegram.ui.Components.y4(i6Var), i6Var);
                } else {
                    org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (o40Var != null) {
                        efVar.x = o40Var.c;
                        efVar.y = o40Var.d;
                    }
                    z40Var.h.u(efVar, e20Var6, o40Var == null || o40Var.a, o40Var != null ? o40Var.b : 0, 0, false, o40Var != null ? o40Var.e : j3);
                }
                z40Var.S = null;
                return;
            case 17:
                org.telegram.ui.Components.uh0 uh0Var = (org.telegram.ui.Components.uh0) this.b;
                int i34 = this.c;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i35 = uh0Var.f;
                TextView textView = uh0Var.b;
                org.telegram.messenger.fj fjVar2 = uh0Var.s;
                ImageView imageView = uh0Var.d;
                org.telegram.ui.Components.q9 q9Var = uh0Var.e;
                ArrayList arrayList5 = uh0Var.r;
                ArrayList arrayList6 = uh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i34) {
                    G = org.telegram.messenger.gd.G(i34, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.gd.K0(i34, "Reacted"), i34 == arrayList6.size() ? String.valueOf(i34) : i34 + "/" + arrayList6.size());
                }
                if (uh0Var.getMeasuredWidth() > 0) {
                    uh0Var.w = uh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = fjVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i35).h;
                    int size5 = arrayList7.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj = arrayList7.get(i36);
                        i36++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            q9Var.k(org.telegram.messenger.fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            q9Var.setVisibility(0);
                            q9Var.setAlpha(0.0f);
                            q9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i7 = 0;
                            while (i7 < size) {
                                TLRPC.User user = arrayList8.get(i7);
                                i7++;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = fjVar2.k.from_id;
                                if (peer != null && user2.id != peer.user_id) {
                                    int i37 = 0;
                                    while (true) {
                                        if (i37 >= arrayList5.size()) {
                                            arrayList5.add(new org.telegram.ui.Components.th0(0, user2));
                                        } else if (((org.telegram.ui.Components.th0) arrayList5.get(i37)).b == user2.id) {
                                            break;
                                        } else {
                                            i37++;
                                        }
                                    }
                                }
                            }
                            ArrayList<TLRPC.Chat> arrayList9 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList9.size();
                            i10 = 0;
                            while (i10 < size2) {
                                TLRPC.Chat chat3 = arrayList9.get(i10);
                                i10++;
                                TLRPC.Chat chat4 = chat3;
                                TLRPC.Peer peer2 = fjVar2.k.from_id;
                                if (peer2 != null && chat4.id != peer2.user_id) {
                                    int i38 = 0;
                                    while (true) {
                                        if (i38 >= arrayList5.size()) {
                                            arrayList5.add(new org.telegram.ui.Components.th0(0, chat4));
                                        } else if (((org.telegram.ui.Components.th0) arrayList5.get(i38)).b == (-chat4.id)) {
                                            break;
                                        } else {
                                            i38++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.wz wzVar = uh0Var.a;
                            org.telegram.ui.Components.e9 e9Var = uh0Var.c;
                            uh0Var.setEnabled(arrayList5.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList5.size()) {
                                    e9Var.b(i11, i35, ((org.telegram.ui.Components.th0) arrayList5.get(i11)).a);
                                } else {
                                    e9Var.b(i11, i35, null);
                                }
                            }
                            size3 = arrayList5.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.g0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (org.telegram.messenger.gd.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    e9Var.setTranslationX(f10);
                                    e9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    e9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    wzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(wzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.gd.a0) {
                            }
                            e9Var.setTranslationX(f10);
                            e9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            e9Var.animate().alpha(1.0f).setDuration(220L).start();
                            wzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(wzVar)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList82 = tL_messages_messageReactionsList.users;
                size = arrayList82.size();
                i7 = 0;
                while (i7 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList92 = tL_messages_messageReactionsList.chats;
                size2 = arrayList92.size();
                i10 = 0;
                while (i10 < size2) {
                }
                org.telegram.ui.Components.wz wzVar2 = uh0Var.a;
                org.telegram.ui.Components.e9 e9Var2 = uh0Var.c;
                uh0Var.setEnabled(arrayList5.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList5.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.gd.a0) {
                }
                e9Var2.setTranslationX(f10);
                e9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                e9Var2.animate().alpha(1.0f).setDuration(220L).start();
                wzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new on(wzVar2)).start();
                return;
            case 18:
                org.telegram.ui.Components.vo0 vo0Var = (org.telegram.ui.Components.vo0) this.b;
                int i39 = this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.to0 to0Var = vo0Var.e;
                org.telegram.ui.Components.yo0 yo0Var = vo0Var.L;
                if (i39 != vo0Var.r) {
                    return;
                }
                vo0Var.b();
                vo0Var.J = false;
                vo0Var.w = i39;
                if (vo0Var.s != i39) {
                    to0Var.b();
                }
                org.telegram.ui.Components.ao0 ao0Var = yo0Var.B1;
                org.telegram.ui.Components.vo0 vo0Var2 = yo0Var.I1;
                if (ao0Var.getAdapter() != vo0Var2) {
                    org.telegram.ui.Components.yo0.K0(yo0Var);
                    vo0Var2.f();
                }
                for (int i40 = 0; i40 < arrayList10.size(); i40++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.no0) arrayList10.get(i40)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.mp.u1(yo0Var.a).e4((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(yo0Var.a).X3((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !vo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (vo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (z11) {
                    org.telegram.ui.Components.yo0.K0(yo0Var);
                }
                vo0Var.d = arrayList10;
                to0Var.f(arrayList10, null);
                int i41 = vo0Var.K;
                if (vo0Var.b() != 0 || to0Var.e() || vo0Var.J) {
                    yo0Var.t2.b(i41);
                } else {
                    yo0Var.M1.e(false, true);
                }
                vo0Var.f();
                yo0Var.L0(true);
                return;
            case 19:
                r0.getStoriesController().c(this.c, ((org.telegram.ui.Components.gt0) this.b).m1, (TL_stories.StoryItem) this.d);
                return;
            case 20:
                org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) this.b;
                gt0Var.c0(this.c, (org.telegram.ui.Components.ck0) this.d, false);
                gt0Var.N1 = null;
                return;
            case 21:
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) this.b;
                a0.h hVar3 = (a0.h) this.d;
                int i42 = this.c;
                if (h2Var3 instanceof bn) {
                    bn bnVar3 = (bn) h2Var3;
                    bnVar3.h8();
                    undoView2 = bnVar3.N3;
                } else if (h2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) h2Var3).M;
                }
                if (undoView2 != null) {
                    if (hVar3.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i42), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i42), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 22:
                org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this.b;
                int i43 = this.c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i43 != ss0Var.F) {
                    return;
                }
                ss0Var.E = ConnectionsManager.getInstance(ss0Var.d).sendRequest(tL_messages_search, new di.w1(ss0Var, i43, 7));
                return;
            case 23:
                org.telegram.ui.Components.ss0 ss0Var2 = (org.telegram.ui.Components.ss0) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                int i44 = this.c;
                ArrayList arrayList11 = ss0Var2.h;
                int i45 = ss0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i44 == ss0Var2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.mp.u1(i45).f4(messages_messages.users, false);
                    org.telegram.messenger.mp.u1(i45).Z3(messages_messages.chats, false);
                    org.telegram.messenger.tr.a0(i45).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i46 = 0; i46 < messages_messages.messages.size(); i46++) {
                        org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(i45, messages_messages.messages.get(i46), false, true);
                        if (fjVar3.z2()) {
                            fjVar3.S2 = true;
                        }
                        fjVar3.K5(ss0Var2.x, true);
                        arrayList11.add(fjVar3);
                    }
                    ss0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ss0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ss0Var2.s = true;
                    }
                    ss0Var2.G(false);
                    ss0Var2.r = false;
                    ss0Var2.E = -1;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.iu0 iu0Var = (org.telegram.ui.Components.iu0) this.b;
                int i47 = this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                iu0Var.Z0 = false;
                if (!iu0Var.W0 && iu0Var.X0) {
                    iu0Var.C(true);
                    return;
                }
                iu0Var.n0 = iu0Var.g1[0];
                iu0Var.l();
                org.telegram.messenger.a6.q(i47).v(q1Var);
                iu0Var.I();
                iu0Var.x();
                return;
            case 25:
                int i48 = this.c;
                Integer num = (Integer) this.b;
                org.telegram.messenger.w2 w2Var = (org.telegram.messenger.w2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.tr.a0(i48).b;
                        if (sQLiteDatabase != null) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    w2Var.a(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    w2Var.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                w2Var.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = num;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 26:
                a();
                return;
            case 27:
                org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) this.b;
                a0.h hVar4 = (a0.h) this.d;
                int i49 = this.c;
                org.telegram.ui.ActionBar.h2 h2Var4 = uv0Var.V2.G1;
                if (h2Var4 instanceof bn) {
                    bn bnVar4 = (bn) h2Var4;
                    bnVar4.h8();
                    undoView3 = bnVar4.N3;
                } else if (h2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) h2Var4).M;
                }
                if (undoView3 != null) {
                    if (hVar4.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i49), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i49), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 28:
                b();
                return;
            default:
                org.telegram.ui.Components.a01 a01Var = (org.telegram.ui.Components.a01) this.b;
                String str5 = (String) this.d;
                int i50 = this.c;
                org.telegram.ui.Components.zz0 zz0Var = a01Var.r.s1;
                try {
                    String lowerCase = str5.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        a01Var.d = -1;
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(a01Var, a01Var.d, new ArrayList(), new ArrayList(), 5));
                        return;
                    }
                    String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str = S0;
                        break;
                    }
                    int i51 = 0;
                    int i52 = i51 + 1;
                    String[] strArr = new String[i52];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int size6 = zz0Var.d.size();
                    int i53 = 0;
                    while (i53 < size6) {
                        ArrayList arrayList14 = (ArrayList) zz0Var.d.get(i53);
                        String c10 = org.telegram.ui.ActionBar.w4.c(((org.telegram.ui.ActionBar.w6) arrayList14.get(i13)).e);
                        String lowerCase2 = c10.toLowerCase();
                        int i54 = i13;
                        while (true) {
                            if (i54 < i52) {
                                String str6 = strArr[i54];
                                if (lowerCase2.contains(str6)) {
                                    arrayList12.add(arrayList14);
                                    arrayList13.add(org.telegram.ui.Components.a01.E(c10, str6));
                                } else {
                                    i54++;
                                }
                            }
                        }
                        i53++;
                        i13 = 0;
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(a01Var, i50, arrayList12, arrayList13, 5));
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }

    public /* synthetic */ b0(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.d = obj2;
    }

    public /* synthetic */ b0(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i7;
    }

    public /* synthetic */ b0(String str, int i7, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.a = 4;
        this.d = str;
        this.c = i7;
        this.b = x2VarArr;
    }

    public /* synthetic */ b0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.a = 3;
        this.b = e4Var;
        this.c = i7;
        this.d = iArr2;
    }
}
