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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q8(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.rz0 rz0Var = (org.telegram.ui.Components.rz0) this.d;
        String str = (String) this.c;
        int i7 = this.b;
        org.telegram.ui.Components.qz0 qz0Var = rz0Var.r.o1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                rz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(rz0Var, rz0Var.d, new ArrayList(), new ArrayList(), 4));
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
            int size = qz0Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) qz0Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.t6) arrayList3.get(i10)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.rz0.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(rz0Var, i7, arrayList, arrayList2, 4));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05f3  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r92;
        long j3;
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
                String str = (String) this.c;
                int i15 = this.b;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, i15, tL_inputGroupCallSlug, false, null, null);
                v2VarArr[0].dismiss();
                return;
            case 1:
                ((an) this.c).jb(this.b, (ArrayList) this.d, false, false);
                return;
            case 2:
                an anVar = (an) this.c;
                int i16 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i17 = 0;
                anVar.z0.w0(0, i16, null);
                if (!org.telegram.messenger.g0.K3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.i3(new sg(editTextBoldCursor, i17), 100L);
                return;
            case 3:
                el elVar = (el) this.c;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.d;
                int i18 = this.b;
                elVar.getClass();
                org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                jl jlVar = elVar.a;
                jlVar.Q.l(i18, messageObject.f1(), true, org.telegram.messenger.ij.B0(messageObject.k) == jlVar.Q.b7 ? 1 : 0, true, 0);
                return;
            case 4:
                org.telegram.ui.Wallet.y5.J0(this.b, ((org.telegram.ui.Components.ik) this.c).getContext(), (org.telegram.ui.ActionBar.f6) this.d);
                return;
            case 5:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.c;
                int i19 = this.b;
                View view = (View) this.d;
                bnVar.V = 0;
                bnVar.U = i19;
                if (view instanceof org.telegram.ui.Cells.m8) {
                    bnVar.Z((org.telegram.ui.Cells.m8) view, true);
                    return;
                } else {
                    bnVar.r.g(bnVar.I0);
                    return;
                }
            case 6:
                org.telegram.ui.Components.fu fuVar = (org.telegram.ui.Components.fu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var = fuVar.R2.j1;
                if (f2Var instanceof an) {
                    an anVar2 = (an) f2Var;
                    anVar2.f8();
                    undoView = anVar2.M3;
                } else {
                    undoView = f2Var instanceof ProfileActivity ? ((ProfileActivity) f2Var).L : null;
                }
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i20), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Components.cx cxVar = (org.telegram.ui.Components.cx) this.c;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i21 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var == null) {
                    return;
                }
                u1Var.setOnCancelListener(new bi.g0(cxVar, i21, i14));
                u1VarArr[0].show();
                return;
            case 8:
                int i22 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i22;
                f2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new jg.v(f2Var2, i22, c20Var, i14));
                return;
            case 9:
                org.telegram.ui.Components.g20 g20Var = (org.telegram.ui.Components.g20) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = g20Var.d;
                org.telegram.ui.Components.h20 h20Var = g20Var.x;
                if (i23 != g20Var.n) {
                    return;
                }
                g20Var.h = false;
                TLRPC.Chat chat = h20Var.M1;
                org.telegram.ui.Components.av0 av0Var = h20Var.q1;
                if (!org.telegram.messenger.t3.T(chat)) {
                    a0.h hVar2 = z1Var.h;
                    ArrayList arrayList3 = z1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i24);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i25 = g20Var.f - 1;
                boolean z9 = av0Var.getVisibility() == 0;
                g20Var.f();
                if (g20Var.f > i25) {
                    h20Var.O0(i25);
                }
                if (g20Var.h || z1Var.e() || !h20Var.k1.R0()) {
                    return;
                }
                av0Var.e(false, z9);
                return;
            case 10:
                org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) this.d;
                int i26 = this.b;
                String str2 = (String) this.c;
                ArrayList arrayList4 = u20Var.Q;
                int i27 = u20Var.P;
                if (i26 != u20Var.V) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(u20Var.d0[0] ? "$" : "#");
                sb2.append(u20Var.a0);
                String sb3 = sb2.toString();
                di.k6 k6Var = u20Var.S;
                if (k6Var == null || !TextUtils.equals(k6Var.C, sb3)) {
                    u20Var.S = new di.k6(i27, null, sb3);
                }
                if (u20Var.S.i.size() <= 0) {
                    r92 = 1;
                    u20Var.S.p(4, true);
                } else {
                    r92 = 1;
                }
                u20Var.R = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                u20Var.a0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = u20Var.b0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.qp.s1(i27).m1(ijVar.k.peer_id);
                }
                u20Var.W = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new jg.v(u20Var, i26, sb3, 6));
                return;
            case 11:
                org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) this.c;
                int i28 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (o40Var.l0 == null) {
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i28);
                }
                if (o40Var.A0 && i28 == o40Var.z0) {
                    o40Var.p("camera open submitted: surface=" + i28);
                }
                if (!o40Var.r0) {
                    if (i28 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(o40Var.m0[0].getWidth(), o40Var.m0[0].getHeight());
                    o40Var.s0 = new CameraSession(o40Var.H, o40Var.m0[0], o40Var.n0, 256, true);
                    o40Var.v();
                    org.telegram.ui.Components.a40 a40Var = o40Var.l0;
                    CameraSession cameraSession = o40Var.s0;
                    Handler handler = a40Var.getHandler();
                    if (handler != null) {
                        a40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(o40Var.s0, surfaceTexture, new org.telegram.ui.Components.r30(o40Var, 1), new org.telegram.ui.Components.r30(o40Var, 2));
                    return;
                }
                if (o40Var.t0) {
                    Camera2Session camera2Session = o40Var.u0[i28];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i28 == 1) {
                    return;
                }
                org.telegram.ui.Components.a40 a40Var2 = o40Var.l0;
                Camera2Session camera2Session2 = o40Var.v0;
                Handler handler2 = a40Var2.getHandler();
                if (handler2 != null) {
                    a40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                o40Var.v0.open(surfaceTexture);
                return;
            case 12:
                org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) this.c;
                int i29 = this.b;
                org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) this.d;
                org.telegram.ui.Components.o40 o40Var2 = g40Var.H0;
                org.telegram.messenger.j20 j20Var = o40Var2.R;
                int i30 = o40Var2.e;
                org.telegram.ui.Components.b40 b40Var = o40Var2.h;
                if (j20Var == null) {
                    org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                    o40Var2.R = j20Var2;
                    j20Var2.a = -1L;
                    j20Var2.b = -1L;
                }
                if (o40Var2.R.c()) {
                    o40Var2.L = null;
                    o40Var2.M = null;
                    o40Var2.N = null;
                    o40Var2.O = null;
                    org.telegram.messenger.j20 j20Var3 = o40Var2.R;
                    long j10 = j20Var3.r;
                    j3 = 0;
                    double d = j10;
                    long j11 = j20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = j20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    j20Var3.r = j13;
                    j20Var3.q = Math.max(1L, (long) ((j13 / d) * o40Var2.P));
                    org.telegram.messenger.j20 j20Var4 = o40Var2.R;
                    j20Var4.m = 1000000;
                    long j14 = j20Var4.a;
                    if (j14 > 0) {
                        j20Var4.a = j14 * 1000;
                    }
                    long j15 = j20Var4.b;
                    if (j15 > 0) {
                        j20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i30).b(o40Var2.e0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    o40Var2.R.q = Math.max(1L, o40Var2.P);
                }
                org.telegram.messenger.j20 j20Var5 = o40Var2.R;
                j20Var5.s = true;
                j20Var5.w = o40Var2.L;
                j20Var5.x = o40Var2.M;
                j20Var5.y = o40Var2.N;
                j20Var5.z = o40Var2.O;
                j20Var5.n = 25;
                j20Var5.h = 360;
                j20Var5.k = 360;
                j20Var5.i = 360;
                j20Var5.l = 360;
                j20Var5.o = g40Var.a.getAbsolutePath();
                org.telegram.messenger.j20 j20Var6 = o40Var2.R;
                if (i29 != 1) {
                    g40Var.h(g40Var.a);
                    j20Var6.r = o40Var2.j0;
                    org.telegram.messenger.qs.f(i30).k(org.telegram.messenger.qs.s2, Integer.valueOf(o40Var2.U), j20Var6, g40Var.a.getAbsolutePath(), g40Var.A0);
                    return;
                }
                if (b40Var.c()) {
                    Activity parentActivity = b40Var.getParentActivity();
                    long a10 = b40Var.a();
                    org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(g40Var, d40Var, j20Var6, 3);
                    org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(g40Var, 0);
                    org.telegram.ui.ActionBar.f6 f6Var = o40Var2.Y0;
                    Pattern pattern = org.telegram.ui.Components.v4.a;
                    org.telegram.ui.Components.v4.H(parentActivity, a10, -1L, 0, false, hrVar, e40Var, new org.telegram.ui.Components.s4(f6Var), f6Var);
                } else {
                    org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, g40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (d40Var != null) {
                        gfVar.x = d40Var.c;
                        gfVar.y = d40Var.d;
                    }
                    o40Var2.h.u(gfVar, j20Var6, d40Var == null || d40Var.a, d40Var != null ? d40Var.b : 0, 0, false, d40Var != null ? d40Var.e : j3);
                }
                o40Var2.R = null;
                return;
            case 13:
                org.telegram.ui.Components.hh0 hh0Var = (org.telegram.ui.Components.hh0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = hh0Var.f;
                TextView textView = hh0Var.b;
                org.telegram.messenger.ij ijVar2 = hh0Var.s;
                ImageView imageView = hh0Var.d;
                org.telegram.ui.Components.l9 l9Var = hh0Var.e;
                ArrayList arrayList5 = hh0Var.r;
                ArrayList arrayList6 = hh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    G = org.telegram.messenger.hd.G(i31, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.hd.K0(i31, "Reacted"), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (hh0Var.getMeasuredWidth() > 0) {
                    hh0Var.w = hh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = ijVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.ui.b0(i32).h;
                    int size5 = arrayList7.size();
                    int i33 = 0;
                    while (i33 < size5) {
                        Object obj = arrayList7.get(i33);
                        i33++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            l9Var.k(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            l9Var.setVisibility(0);
                            l9Var.setAlpha(0.0f);
                            l9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i7 = 0;
                            while (i7 < size) {
                                TLRPC.User user = arrayList8.get(i7);
                                int i34 = i7 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = ijVar2.k.from_id;
                                if (peer == null || user2.id == peer.user_id) {
                                    i12 = size;
                                    i13 = i34;
                                } else {
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < arrayList.size()) {
                                            i12 = size;
                                            i13 = i34;
                                            if (((org.telegram.ui.Components.gh0) arrayList.get(i35)).b == user2.id) {
                                                break;
                                            }
                                            i35++;
                                            size = i12;
                                            i34 = i13;
                                        } else {
                                            i12 = size;
                                            i13 = i34;
                                            arrayList.add(new org.telegram.ui.Components.gh0(0, user2));
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
                                TLRPC.Chat chat2 = arrayList9.get(i10);
                                i10++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = ijVar2.k.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.gh0(0, chat3));
                                        } else if (((org.telegram.ui.Components.gh0) arrayList.get(i36)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.lz lzVar = hh0Var.a;
                            org.telegram.ui.Components.z8 z8Var = hh0Var.c;
                            hh0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    z8Var.b(i11, i32, ((org.telegram.ui.Components.gh0) arrayList.get(i11)).a);
                                } else {
                                    z8Var.b(i11, i32, null);
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
                                    z8Var.setTranslationX(f10);
                                    z8Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    z8Var.animate().alpha(1.0f).setDuration(220L).start();
                                    lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.hd.a0) {
                            }
                            z8Var.setTranslationX(f10);
                            z8Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            z8Var.animate().alpha(1.0f).setDuration(220L).start();
                            lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar)).start();
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
                org.telegram.ui.Components.lz lzVar2 = hh0Var.a;
                org.telegram.ui.Components.z8 z8Var2 = hh0Var.c;
                hh0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.hd.a0) {
                }
                z8Var2.setTranslationX(f10);
                z8Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                z8Var2.animate().alpha(1.0f).setDuration(220L).start();
                lzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar2)).start();
                return;
            case 14:
                org.telegram.ui.Components.jo0 jo0Var = (org.telegram.ui.Components.jo0) this.c;
                int i37 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.ho0 ho0Var = jo0Var.e;
                org.telegram.ui.Components.mo0 mo0Var = jo0Var.K;
                if (i37 != jo0Var.r) {
                    return;
                }
                jo0Var.b();
                jo0Var.I = false;
                jo0Var.w = i37;
                if (jo0Var.s != i37) {
                    ho0Var.b();
                }
                org.telegram.ui.Components.on0 on0Var = mo0Var.x1;
                org.telegram.ui.Components.jo0 jo0Var2 = mo0Var.E1;
                if (on0Var.getAdapter() != jo0Var2) {
                    org.telegram.ui.Components.mo0.J0(mo0Var);
                    jo0Var2.f();
                }
                for (int i38 = 0; i38 < arrayList10.size(); i38++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.bo0) arrayList10.get(i38)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.qp.s1(mo0Var.a).X3((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(mo0Var.a).Q3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !jo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (jo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.mo0.J0(mo0Var);
                }
                jo0Var.d = arrayList10;
                ho0Var.f(arrayList10, null);
                int i39 = jo0Var.J;
                if (jo0Var.b() != 0 || ho0Var.e() || jo0Var.I) {
                    mo0Var.p2.b(i39);
                } else {
                    mo0Var.I1.e(false, true);
                }
                jo0Var.f();
                mo0Var.K0(true);
                return;
            case 15:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.xs0) this.c).l1, (TL_stories.StoryItem) this.d);
                return;
            case 16:
                org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this.c;
                xs0Var.c0(this.b, (org.telegram.ui.Components.pj0) this.d, false);
                xs0Var.M1 = null;
                return;
            case 17:
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i40 = this.b;
                if (f2Var3 instanceof an) {
                    an anVar3 = (an) f2Var3;
                    anVar3.f8();
                    undoView2 = anVar3.M3;
                } else if (f2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) f2Var3).L;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (hVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i40), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i40), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.Components.js0 js0Var = (org.telegram.ui.Components.js0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != js0Var.E) {
                    return;
                }
                js0Var.D = ConnectionsManager.getInstance(js0Var.d).sendRequest(tL_messages_search, new bi.j2(js0Var, i41, 7));
                return;
            case 19:
                org.telegram.ui.Components.js0 js0Var2 = (org.telegram.ui.Components.js0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList11 = js0Var2.h;
                int i43 = js0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == js0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.qp.s1(i43).Y3(messages_messages.users, false);
                    org.telegram.messenger.qp.s1(i43).S3(messages_messages.chats, false);
                    org.telegram.messenger.yr.a0(i43).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(i43, messages_messages.messages.get(i44), false, true);
                        if (ijVar3.A2()) {
                            ijVar3.Q2 = true;
                        }
                        ijVar3.L5(js0Var2.x, true);
                        arrayList11.add(ijVar3);
                    }
                    js0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        js0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        js0Var2.s = true;
                    }
                    js0Var2.G(false);
                    js0Var2.r = false;
                    js0Var2.D = -1;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.zt0 zt0Var = (org.telegram.ui.Components.zt0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                zt0Var.Y0 = false;
                if (!zt0Var.V0 && zt0Var.W0) {
                    zt0Var.C(true);
                    return;
                }
                zt0Var.m0 = zt0Var.f1[0];
                zt0Var.l();
                org.telegram.messenger.z5.q(i45).v(q1Var);
                zt0Var.I();
                zt0Var.x();
                return;
            case 21:
                int i46 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.v2 v2Var = (org.telegram.messenger.v2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.yr.a0(i46).b;
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
                                    v2Var.a(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
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
            case 22:
                int i47 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.yr.a0(i47).b;
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
            case 23:
                org.telegram.ui.Components.kv0 kv0Var = (org.telegram.ui.Components.kv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var4 = kv0Var.R2.C1;
                if (f2Var4 instanceof an) {
                    an anVar4 = (an) f2Var4;
                    anVar4.f8();
                    undoView3 = anVar4.M3;
                } else if (f2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) f2Var4).L;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar4.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 24:
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) this.d;
                String str3 = (String) this.c;
                int i49 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.qi qiVar = new org.telegram.messenger.qi();
                qiVar.a = str3;
                qiVar.b = null;
                arrayList12.add(qiVar);
                org.telegram.messenger.ui.b0(ow0Var.a).O(arrayList12, 15, false, false, new org.telegram.ui.Components.pp0(ow0Var, i49, str3, arrayList12, 3));
                return;
            case 25:
                a();
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0((org.telegram.ui.Components.zz0) this.c, (org.telegram.ui.Components.uo) this.d, this.b, org.telegram.messenger.sz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 5));
                return;
            case 27:
                org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) this.c;
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
                int i50 = this.b;
                HashMap hashMap = org.telegram.ui.Components.s11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(org.telegram.ui.Components.s11.n(ijVar4)));
                }
                if (l1Var != null) {
                    l1Var.d0(3);
                }
                org.telegram.messenger.qs.f(i50).k(org.telegram.messenger.qs.A1, ijVar4);
                org.telegram.messenger.qs.f(i50).k(org.telegram.messenger.qs.E1, new Object[0]);
                return;
            case 28:
                bw bwVar = (bw) this.c;
                int i51 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                ww wwVar = bwVar.j0;
                ArrayList arrayList13 = wwVar.R1;
                if (arrayList13 == null || i51 < 0 || i51 >= arrayList13.size()) {
                    return;
                }
                wwVar.R1.add(i51, dialog);
                wwVar.e0[0].q(true);
                return;
            default:
                uw uwVar = (uw) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i52 = this.b;
                vw vwVar = uwVar.g;
                ww wwVar2 = uwVar.h;
                wwVar2.S1 = true;
                wwVar2.getMessagesController().d(0, i52, dialog2.id);
                wwVar2.S1 = false;
                ArrayList W0 = wwVar2.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog2);
                if (indexOf < 0) {
                    vwVar.q(false);
                    return;
                }
                ArrayList W02 = wwVar2.getMessagesController().W0(1);
                if (!W02.isEmpty() || indexOf != 1) {
                    wwVar2.M4(true, true);
                    vwVar.y.D();
                    vwVar.q(true);
                    wwVar2.z3();
                }
                if (W02.isEmpty()) {
                    W0.remove(0);
                    if (indexOf == 1) {
                        wwVar2.M4(true, true);
                        vwVar.q(true);
                        wwVar2.z3();
                        return;
                    } else {
                        if (!wwVar2.R1.isEmpty()) {
                            wwVar2.R1.remove(0);
                        }
                        vwVar.y.D();
                        vwVar.q(true);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ q8(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ q8(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }

    public /* synthetic */ q8(Object obj, String str, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = str;
        this.b = i7;
    }

    public /* synthetic */ q8(org.telegram.ui.Components.u20 u20Var, int i7, String str) {
        this.a = 10;
        this.d = u20Var;
        this.b = i7;
        this.c = str;
    }
}
