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
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.tz0 tz0Var = (org.telegram.ui.Components.tz0) this.c;
        String str = (String) this.d;
        int i7 = this.b;
        org.telegram.ui.Components.sz0 sz0Var = tz0Var.r.s1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                tz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(tz0Var, tz0Var.d, new ArrayList(), new ArrayList(), 4));
                return;
            }
            int i10 = 0;
            String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
            if (lowerCase.equals(S0) || S0.length() == 0) {
                S0 = null;
            }
            int i11 = (S0 != null ? 1 : 0) + 1;
            String[] strArr = new String[i11];
            strArr[0] = lowerCase;
            if (S0 != null) {
                strArr[1] = S0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sz0Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) sz0Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.s4.c(((org.telegram.ui.ActionBar.s6) arrayList3.get(i10)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.tz0.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(tz0Var, i7, arrayList, arrayList2, 4));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r92;
        long j3;
        org.telegram.ui.Components.g40 g40Var;
        String G;
        ArrayList arrayList;
        int size;
        int i7;
        int size2;
        int i10;
        int i11;
        int size3;
        int L;
        float f10;
        int i12;
        int i13;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i14 = 5;
        UndoView undoView2 = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                int i15 = this.b;
                vf.b bVar = (vf.b) this.d;
                if (g4Var.J0 == i15 && g4Var.H0 != 0) {
                    ConnectionsManager.getInstance(g4Var.Y).cancelRequest(g4Var.H0, false);
                    g4Var.H0 = 0;
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    return;
                }
                return;
            case 1:
                int i16 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.messenger.np.s1(i16).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(i16).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 2:
                e4 e4Var = (e4) this.c;
                int i17 = this.b;
                int[] iArr = (int[]) this.d;
                e4Var.L = i17;
                e4Var.K = iArr;
                e4Var.N.d0();
                return;
            case 3:
                String str = (String) this.c;
                int i18 = this.b;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i18, tL_inputGroupCallSlug, false, null, null);
                u2VarArr[0].dismiss();
                return;
            case 4:
                ((an) this.c).nb(this.b, (ArrayList) this.d, false, false);
                return;
            case 5:
                an anVar = (an) this.c;
                int i19 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i20 = 0;
                anVar.A0.w0(0, i19, null);
                if (!org.telegram.messenger.g0.J3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.i3(new og(editTextBoldCursor, i20), 100L);
                return;
            case 6:
                el elVar = (el) this.c;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.d;
                int i21 = this.b;
                elVar.getClass();
                org.telegram.messenger.gj messageObject = t0Var.getMessageObject();
                jl jlVar = elVar.a;
                jlVar.R.l(i21, messageObject.e1(), true, org.telegram.messenger.gj.B0(messageObject.k) == jlVar.R.c7 ? 1 : 0, true, 0);
                return;
            case 7:
                org.telegram.ui.Wallet.y5.J0(this.b, ((org.telegram.ui.Components.qk) this.c).getContext(), (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 8:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) this.c;
                int i22 = this.b;
                View view = (View) this.d;
                jnVar.W = 0;
                jnVar.V = i22;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    jnVar.Z((org.telegram.ui.Cells.l8) view, true);
                    return;
                } else {
                    jnVar.r.g(jnVar.J0);
                    return;
                }
            case 9:
                org.telegram.ui.Components.lu luVar = (org.telegram.ui.Components.lu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i23 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = luVar.V2.n1;
                if (e2Var instanceof an) {
                    an anVar2 = (an) e2Var;
                    anVar2.h8();
                    undoView = anVar2.N3;
                } else {
                    undoView = e2Var instanceof ProfileActivity ? ((ProfileActivity) e2Var).M : null;
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
            case 10:
                org.telegram.ui.Components.ix ixVar = (org.telegram.ui.Components.ix) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                int i24 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var == null) {
                    return;
                }
                t1Var.setOnCancelListener(new di.z(ixVar, i24, i14));
                t1VarArr[0].show();
                return;
            case 11:
                int i25 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                e2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new jg.u(e2Var2, i25, z10Var, i14));
                return;
            case 12:
                org.telegram.ui.Components.j20 j20Var = (org.telegram.ui.Components.j20) this.c;
                int i26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = j20Var.d;
                org.telegram.ui.Components.k20 k20Var = j20Var.x;
                if (i26 != j20Var.n) {
                    return;
                }
                j20Var.h = false;
                TLRPC.Chat chat2 = k20Var.Q1;
                org.telegram.ui.Components.cv0 cv0Var = k20Var.u1;
                if (!org.telegram.messenger.t3.T(chat2)) {
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
                            hVar2.k(tLObject, org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i28 = j20Var.f - 1;
                boolean z10 = cv0Var.getVisibility() == 0;
                j20Var.f();
                if (j20Var.f > i28) {
                    k20Var.O0(i28);
                }
                if (j20Var.h || z1Var.e() || !k20Var.o1.R0()) {
                    return;
                }
                cv0Var.e(false, z10);
                return;
            case 13:
                org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) this.c;
                int i29 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = x20Var.R;
                int i30 = x20Var.Q;
                if (i29 != x20Var.W) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x20Var.e0[0] ? "$" : "#");
                sb2.append(x20Var.b0);
                String sb3 = sb2.toString();
                fi.d6 d6Var = x20Var.T;
                if (d6Var == null || !TextUtils.equals(d6Var.C, sb3)) {
                    x20Var.T = new fi.d6(i30, null, sb3);
                }
                if (x20Var.T.i.size() <= 0) {
                    r92 = 1;
                    x20Var.T.p(4, true);
                } else {
                    r92 = 1;
                }
                x20Var.S = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                x20Var.b0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = x20Var.c0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.np.s1(i30).m1(gjVar.k.peer_id);
                }
                x20Var.X = ConnectionsManager.getInstance(i30).sendRequest(tL_channels_searchPosts, new jg.u(x20Var, i29, sb3, 6));
                return;
            case 14:
                org.telegram.ui.Components.r40 r40Var = (org.telegram.ui.Components.r40) this.c;
                int i31 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (r40Var.m0 == null) {
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i31);
                }
                if (r40Var.B0 && i31 == r40Var.A0) {
                    r40Var.q("camera open submitted: surface=" + i31);
                }
                if (!r40Var.s0) {
                    if (i31 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(r40Var.n0[0].getWidth(), r40Var.n0[0].getHeight());
                    r40Var.t0 = new CameraSession(r40Var.I, r40Var.n0[0], r40Var.o0, 256, true);
                    r40Var.w();
                    org.telegram.ui.Components.d40 d40Var = r40Var.m0;
                    CameraSession cameraSession = r40Var.t0;
                    Handler handler = d40Var.getHandler();
                    if (handler != null) {
                        d40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(r40Var.t0, surfaceTexture, new org.telegram.ui.Components.u30(r40Var, 1), new org.telegram.ui.Components.u30(r40Var, 2));
                    return;
                }
                if (r40Var.u0) {
                    Camera2Session camera2Session = r40Var.v0[i31];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i31 == 1) {
                    return;
                }
                org.telegram.ui.Components.d40 d40Var2 = r40Var.m0;
                Camera2Session camera2Session2 = r40Var.w0;
                Handler handler2 = d40Var2.getHandler();
                if (handler2 != null) {
                    d40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                r40Var.w0.open(surfaceTexture);
                return;
            case 15:
                org.telegram.ui.Components.j40 j40Var = (org.telegram.ui.Components.j40) this.c;
                int i32 = this.b;
                org.telegram.ui.Components.g40 g40Var2 = (org.telegram.ui.Components.g40) this.d;
                org.telegram.ui.Components.r40 r40Var2 = j40Var.I0;
                org.telegram.messenger.g20 g20Var = r40Var2.S;
                int i33 = r40Var2.e;
                org.telegram.ui.Components.e40 e40Var = r40Var2.h;
                if (g20Var == null) {
                    org.telegram.messenger.g20 g20Var2 = new org.telegram.messenger.g20();
                    r40Var2.S = g20Var2;
                    g20Var2.a = -1L;
                    g20Var2.b = -1L;
                }
                if (r40Var2.S.c()) {
                    r40Var2.M = null;
                    r40Var2.N = null;
                    r40Var2.O = null;
                    r40Var2.P = null;
                    org.telegram.messenger.g20 g20Var3 = r40Var2.S;
                    long j10 = g20Var3.r;
                    j3 = 0;
                    double d = j10;
                    g40Var = g40Var2;
                    long j11 = g20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = g20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    g20Var3.r = j13;
                    g20Var3.q = Math.max(1L, (long) ((j13 / d) * r40Var2.Q));
                    org.telegram.messenger.g20 g20Var4 = r40Var2.S;
                    g20Var4.m = 1000000;
                    long j14 = g20Var4.a;
                    if (j14 > 0) {
                        g20Var4.a = j14 * 1000;
                    }
                    long j15 = g20Var4.b;
                    if (j15 > 0) {
                        g20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i33).b(r40Var2.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    g40Var = g40Var2;
                    r40Var2.S.q = Math.max(1L, r40Var2.Q);
                }
                org.telegram.messenger.g20 g20Var5 = r40Var2.S;
                g20Var5.s = true;
                g20Var5.w = r40Var2.M;
                g20Var5.x = r40Var2.N;
                g20Var5.y = r40Var2.O;
                g20Var5.z = r40Var2.P;
                g20Var5.n = 25;
                g20Var5.h = 360;
                g20Var5.k = 360;
                g20Var5.i = 360;
                g20Var5.l = 360;
                g20Var5.o = j40Var.a.getAbsolutePath();
                org.telegram.messenger.g20 g20Var6 = r40Var2.S;
                if (i32 != 1) {
                    j40Var.h(j40Var.a);
                    g20Var6.r = r40Var2.k0;
                    org.telegram.messenger.ns.f(i33).k(org.telegram.messenger.ns.s2, Integer.valueOf(r40Var2.V), g20Var6, j40Var.a.getAbsolutePath(), j40Var.B0);
                    return;
                }
                if (e40Var.c()) {
                    Activity parentActivity = e40Var.getParentActivity();
                    long a10 = e40Var.a();
                    org.telegram.ui.Components.km kmVar = new org.telegram.ui.Components.km(j40Var, g40Var, g20Var6, 4);
                    org.telegram.ui.Components.h40 h40Var = new org.telegram.ui.Components.h40(j40Var, 0);
                    org.telegram.ui.ActionBar.e6 e6Var = r40Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.t4.a;
                    org.telegram.ui.Components.t4.H(parentActivity, a10, -1L, 0, false, kmVar, h40Var, new org.telegram.ui.Components.q4(e6Var), e6Var);
                } else {
                    org.telegram.ui.Components.g40 g40Var3 = g40Var;
                    org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, j40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (g40Var3 != null) {
                        ffVar.x = g40Var3.c;
                        ffVar.y = g40Var3.d;
                    }
                    r40Var2.h.u(ffVar, g20Var6, g40Var3 == null || g40Var3.a, g40Var3 != null ? g40Var3.b : 0, 0, false, g40Var3 != null ? g40Var3.e : j3);
                }
                r40Var2.S = null;
                return;
            case 16:
                org.telegram.ui.Components.lh0 lh0Var = (org.telegram.ui.Components.lh0) this.c;
                int i34 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i35 = lh0Var.f;
                TextView textView = lh0Var.b;
                org.telegram.messenger.gj gjVar2 = lh0Var.s;
                ImageView imageView = lh0Var.d;
                org.telegram.ui.Components.i9 i9Var = lh0Var.e;
                ArrayList arrayList5 = lh0Var.r;
                ArrayList arrayList6 = lh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i34) {
                    G = org.telegram.messenger.hd.G(i34, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.hd.K0(i34, "Reacted"), i34 == arrayList6.size() ? String.valueOf(i34) : i34 + "/" + arrayList6.size());
                }
                if (lh0Var.getMeasuredWidth() > 0) {
                    lh0Var.w = lh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = gjVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.si.b0(i35).h;
                    int size5 = arrayList7.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj = arrayList7.get(i36);
                        i36++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(tL_availableReaction.center_icon);
                            arrayList = arrayList5;
                            i9Var.k(b10, "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            i9Var.setVisibility(0);
                            i9Var.setAlpha(0.0f);
                            i9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i7 = 0;
                            while (i7 < size) {
                                TLRPC.User user = arrayList8.get(i7);
                                int i37 = i7 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = gjVar2.k.from_id;
                                if (peer == null || user2.id == peer.user_id) {
                                    i12 = size;
                                    i13 = i37;
                                } else {
                                    int i38 = 0;
                                    while (true) {
                                        if (i38 < arrayList.size()) {
                                            i12 = size;
                                            i13 = i37;
                                            if (((org.telegram.ui.Components.kh0) arrayList.get(i38)).b == user2.id) {
                                                break;
                                            }
                                            i38++;
                                            size = i12;
                                            i37 = i13;
                                        } else {
                                            i12 = size;
                                            i13 = i37;
                                            arrayList.add(new org.telegram.ui.Components.kh0(0, user2));
                                        }
                                    }
                                }
                                size = i12;
                                i7 = i13;
                            }
                            ArrayList<TLRPC.Chat> arrayList9 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList9.size();
                            i10 = 0;
                            while (i10 < size2) {
                                TLRPC.Chat chat3 = arrayList9.get(i10);
                                i10++;
                                TLRPC.Chat chat4 = chat3;
                                TLRPC.Peer peer2 = gjVar2.k.from_id;
                                if (peer2 != null && chat4.id != peer2.user_id) {
                                    int i39 = 0;
                                    while (true) {
                                        if (i39 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.kh0(0, chat4));
                                        } else if (((org.telegram.ui.Components.kh0) arrayList.get(i39)).b == (-chat4.id)) {
                                            break;
                                        } else {
                                            i39++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.pz pzVar = lh0Var.a;
                            org.telegram.ui.Components.w8 w8Var = lh0Var.c;
                            lh0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    w8Var.b(i11, i35, ((org.telegram.ui.Components.kh0) arrayList.get(i11)).a);
                                } else {
                                    w8Var.b(i11, i35, null);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.g0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (org.telegram.messenger.hd.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    w8Var.setTranslationX(f10);
                                    w8Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    w8Var.animate().alpha(1.0f).setDuration(220L).start();
                                    pzVar.animate().alpha(0.0f).setDuration(220L).setListener(new nn(pzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.hd.a0) {
                            }
                            w8Var.setTranslationX(f10);
                            w8Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            w8Var.animate().alpha(1.0f).setDuration(220L).start();
                            pzVar.animate().alpha(0.0f).setDuration(220L).setListener(new nn(pzVar)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
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
                org.telegram.ui.Components.pz pzVar2 = lh0Var.a;
                org.telegram.ui.Components.w8 w8Var2 = lh0Var.c;
                lh0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.hd.a0) {
                }
                w8Var2.setTranslationX(f10);
                w8Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                w8Var2.animate().alpha(1.0f).setDuration(220L).start();
                pzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new nn(pzVar2)).start();
                return;
            case 17:
                org.telegram.ui.Components.mo0 mo0Var = (org.telegram.ui.Components.mo0) this.c;
                int i40 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.ko0 ko0Var = mo0Var.e;
                org.telegram.ui.Components.po0 po0Var = mo0Var.L;
                if (i40 != mo0Var.r) {
                    return;
                }
                mo0Var.b();
                mo0Var.J = false;
                mo0Var.w = i40;
                if (mo0Var.s != i40) {
                    ko0Var.b();
                }
                org.telegram.ui.Components.rn0 rn0Var = po0Var.B1;
                org.telegram.ui.Components.mo0 mo0Var2 = po0Var.I1;
                if (rn0Var.getAdapter() != mo0Var2) {
                    org.telegram.ui.Components.po0.J0(po0Var);
                    mo0Var2.f();
                }
                for (int i41 = 0; i41 < arrayList10.size(); i41++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.eo0) arrayList10.get(i41)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.np.s1(po0Var.a).X3((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.np.s1(po0Var.a).Q3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !mo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (mo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.po0.J0(po0Var);
                }
                mo0Var.d = arrayList10;
                ko0Var.f(arrayList10, null);
                int i42 = mo0Var.K;
                if (mo0Var.b() != 0 || ko0Var.e() || mo0Var.J) {
                    po0Var.t2.b(i42);
                } else {
                    po0Var.M1.e(false, true);
                }
                mo0Var.f();
                po0Var.K0(true);
                return;
            case 18:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.ys0) this.c).m1, (TL_stories.StoryItem) this.d);
                return;
            case 19:
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) this.c;
                ys0Var.c0(this.b, (org.telegram.ui.Components.uj0) this.d, false);
                ys0Var.N1 = null;
                return;
            case 20:
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i43 = this.b;
                if (e2Var3 instanceof an) {
                    an anVar3 = (an) e2Var3;
                    anVar3.h8();
                    undoView2 = anVar3.N3;
                } else if (e2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) e2Var3).M;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (hVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i43), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i43), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                org.telegram.ui.Components.ks0 ks0Var = (org.telegram.ui.Components.ks0) this.c;
                int i44 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i44 != ks0Var.F) {
                    return;
                }
                ks0Var.E = ConnectionsManager.getInstance(ks0Var.d).sendRequest(tL_messages_search, new di.u1(ks0Var, i44, 7));
                return;
            case 22:
                org.telegram.ui.Components.ks0 ks0Var2 = (org.telegram.ui.Components.ks0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                ArrayList arrayList11 = ks0Var2.h;
                int i46 = ks0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i45 == ks0Var2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.np.s1(i46).Y3(messages_messages.users, false);
                    org.telegram.messenger.np.s1(i46).S3(messages_messages.chats, false);
                    org.telegram.messenger.vr.a0(i46).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i47 = 0; i47 < messages_messages.messages.size(); i47++) {
                        org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(i46, messages_messages.messages.get(i47), false, true);
                        if (gjVar3.z2()) {
                            gjVar3.S2 = true;
                        }
                        gjVar3.K5(ks0Var2.x, true);
                        arrayList11.add(gjVar3);
                    }
                    ks0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ks0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ks0Var2.s = true;
                    }
                    ks0Var2.G(false);
                    ks0Var2.r = false;
                    ks0Var2.E = -1;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.au0 au0Var = (org.telegram.ui.Components.au0) this.c;
                int i48 = this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                au0Var.Z0 = false;
                if (!au0Var.W0 && au0Var.X0) {
                    au0Var.C(true);
                    return;
                }
                au0Var.n0 = au0Var.g1[0];
                au0Var.l();
                org.telegram.messenger.z5.q(i48).v(q1Var);
                au0Var.I();
                au0Var.x();
                return;
            case 24:
                int i49 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.v2 v2Var = (org.telegram.messenger.v2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.vr.a0(i49).b;
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
                                    v2Var.a(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    v2Var.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                v2Var.a(0L, null);
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
            case 25:
                int i50 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.vr.a0(i50).b;
                    if (sQLiteDatabase2 != null) {
                        if (tL_messages_emojiGroups == null) {
                            sQLiteDatabase2.executeFast("DELETE FROM emoji_groups WHERE type = " + num2).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num2.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 26:
                org.telegram.ui.Components.mv0 mv0Var = (org.telegram.ui.Components.mv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i51 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var4 = mv0Var.V2.G1;
                if (e2Var4 instanceof an) {
                    an anVar4 = (an) e2Var4;
                    anVar4.h8();
                    undoView3 = anVar4.N3;
                } else if (e2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) e2Var4).M;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar4.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i51), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i51), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.Components.rw0 rw0Var = (org.telegram.ui.Components.rw0) this.c;
                String str3 = (String) this.d;
                int i52 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.oi oiVar = new org.telegram.messenger.oi();
                oiVar.a = str3;
                oiVar.b = null;
                arrayList12.add(oiVar);
                org.telegram.messenger.si.b0(rw0Var.a).O(arrayList12, 15, false, false, new org.telegram.ui.Components.sp0(rw0Var, i52, str3, arrayList12, 3));
                return;
            case 28:
                a();
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0((org.telegram.ui.Components.b01) this.c, (org.telegram.ui.Components.dp) this.d, this.b, org.telegram.messenger.qz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 5));
                return;
        }
    }

    public /* synthetic */ f0(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ f0(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }

    public /* synthetic */ f0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.a = 2;
        this.c = e4Var;
        this.b = i7;
        this.d = iArr2;
    }
}
