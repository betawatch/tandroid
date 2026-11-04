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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f4(int i3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.qz0 qz0Var = (org.telegram.ui.Components.qz0) this.c;
        String str = (String) this.d;
        int i3 = this.b;
        org.telegram.ui.Components.pz0 pz0Var = qz0Var.r.p1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                qz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(qz0Var, qz0Var.d, new ArrayList(), new ArrayList(), 5));
                return;
            }
            int i10 = 0;
            String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
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
            int size = pz0Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) pz0Var.d.get(i12);
                String c2 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.t6) arrayList3.get(i10)).e);
                String lowerCase2 = c2.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.qz0.E(c2, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(qz0Var, i3, arrayList, arrayList2, 5));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r10;
        org.telegram.ui.Components.z30 z30Var;
        long j10;
        String G;
        ArrayList arrayList;
        int size;
        int i3;
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
        int i13 = 6;
        UndoView undoView2 = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                int i14 = this.b;
                int[] iArr = (int[]) this.d;
                g4Var.L = i14;
                g4Var.K = iArr;
                g4Var.N.d0();
                return;
            case 1:
                String str = (String) this.c;
                int i15 = this.b;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i15, tL_inputGroupCallSlug, false, null, null);
                t2VarArr[0].dismiss();
                return;
            case 2:
                ((wm) this.c).jb(this.b, (ArrayList) this.d, false, false);
                return;
            case 3:
                wm wmVar = (wm) this.c;
                int i16 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i17 = 0;
                wmVar.A0.w0(0, i16, null);
                if (!org.telegram.messenger.g0.K3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.i3(new og(editTextBoldCursor, i17), 100L);
                return;
            case 4:
                al alVar = (al) this.c;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.d;
                int i18 = this.b;
                alVar.getClass();
                org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
                fl flVar = alVar.a;
                flVar.R.l(i18, messageObject.f1(), true, org.telegram.messenger.zi.B0(messageObject.k) == flVar.R.c7 ? 1 : 0, true, 0);
                return;
            case 5:
                org.telegram.ui.Wallet.w5.J0(this.b, ((org.telegram.ui.Components.hk) this.c).getContext(), (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 6:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.c;
                int i19 = this.b;
                View view = (View) this.d;
                anVar.W = 0;
                anVar.V = i19;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    anVar.Z((org.telegram.ui.Cells.l8) view, true);
                    return;
                } else {
                    anVar.r.g(anVar.J0);
                    return;
                }
            case 7:
                org.telegram.ui.Components.eu euVar = (org.telegram.ui.Components.eu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = euVar.S2.k1;
                if (d2Var instanceof wm) {
                    wm wmVar2 = (wm) d2Var;
                    wmVar2.f8();
                    undoView = wmVar2.N3;
                } else {
                    undoView = d2Var instanceof ProfileActivity ? ((ProfileActivity) d2Var).M : null;
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
            case 8:
                org.telegram.ui.Components.bx bxVar = (org.telegram.ui.Components.bx) this.c;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.d;
                int i21 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var == null) {
                    return;
                }
                s1Var.setOnCancelListener(new ci.b0(bxVar, i21, i12));
                s1VarArr[0].show();
                return;
            case 9:
                int i22 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.c;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i22;
                d2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new kg.t(d2Var2, i22, u10Var, i12));
                return;
            case 10:
                org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                kg.v1 v1Var = c20Var.d;
                org.telegram.ui.Components.d20 d20Var = c20Var.x;
                if (i23 != c20Var.n) {
                    return;
                }
                c20Var.h = false;
                TLRPC.Chat chat = d20Var.N1;
                org.telegram.ui.Components.zu0 zu0Var = d20Var.r1;
                if (!org.telegram.messenger.t3.T(chat)) {
                    a0.h hVar2 = v1Var.h;
                    ArrayList arrayList3 = v1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i24);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    v1Var.i();
                }
                int i25 = c20Var.f - 1;
                boolean z10 = zu0Var.getVisibility() == 0;
                c20Var.f();
                if (c20Var.f > i25) {
                    d20Var.O0(i25);
                }
                if (c20Var.h || v1Var.e() || !d20Var.l1.R0()) {
                    return;
                }
                zu0Var.e(false, z10);
                return;
            case 11:
                org.telegram.ui.Components.q20 q20Var = (org.telegram.ui.Components.q20) this.c;
                int i26 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = q20Var.R;
                int i27 = q20Var.Q;
                if (i26 != q20Var.W) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(q20Var.e0[0] ? "$" : "#");
                sb2.append(q20Var.b0);
                String sb3 = sb2.toString();
                ei.l6 l6Var = q20Var.T;
                if (l6Var == null || !TextUtils.equals(l6Var.C, sb3)) {
                    q20Var.T = new ei.l6(i27, null, sb3);
                }
                if (q20Var.T.i.size() <= 0) {
                    r10 = 1;
                    q20Var.T.p(4, true);
                } else {
                    r10 = 1;
                }
                q20Var.S = r10;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r10;
                q20Var.b0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(r10, arrayList4);
                    tL_channels_searchPosts.offset_rate = q20Var.c0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.hp.s1(i27).m1(ziVar.k.peer_id);
                }
                q20Var.X = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new kg.t(q20Var, i26, sb3, i13));
                return;
            case 12:
                org.telegram.ui.Components.k40 k40Var = (org.telegram.ui.Components.k40) this.c;
                int i28 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (k40Var.m0 == null) {
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i28);
                }
                if (k40Var.B0 && i28 == k40Var.A0) {
                    k40Var.p("camera open submitted: surface=" + i28);
                }
                if (!k40Var.s0) {
                    if (i28 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(k40Var.n0[0].getWidth(), k40Var.n0[0].getHeight());
                    k40Var.t0 = new CameraSession(k40Var.I, k40Var.n0[0], k40Var.o0, 256, true);
                    k40Var.v();
                    org.telegram.ui.Components.w30 w30Var = k40Var.m0;
                    CameraSession cameraSession = k40Var.t0;
                    Handler handler = w30Var.getHandler();
                    if (handler != null) {
                        w30Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(k40Var.t0, surfaceTexture, new org.telegram.ui.Components.n30(k40Var, 1), new org.telegram.ui.Components.n30(k40Var, 2));
                    return;
                }
                if (k40Var.u0) {
                    Camera2Session camera2Session = k40Var.v0[i28];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i28 == 1) {
                    return;
                }
                org.telegram.ui.Components.w30 w30Var2 = k40Var.m0;
                Camera2Session camera2Session2 = k40Var.w0;
                Handler handler2 = w30Var2.getHandler();
                if (handler2 != null) {
                    w30Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                k40Var.w0.open(surfaceTexture);
                return;
            case 13:
                org.telegram.ui.Components.c40 c40Var = (org.telegram.ui.Components.c40) this.c;
                int i29 = this.b;
                org.telegram.ui.Components.z30 z30Var2 = (org.telegram.ui.Components.z30) this.d;
                org.telegram.ui.Components.k40 k40Var2 = c40Var.I0;
                org.telegram.messenger.b20 b20Var = k40Var2.S;
                int i30 = k40Var2.e;
                org.telegram.ui.Components.x30 x30Var = k40Var2.h;
                if (b20Var == null) {
                    org.telegram.messenger.b20 b20Var2 = new org.telegram.messenger.b20();
                    k40Var2.S = b20Var2;
                    b20Var2.a = -1L;
                    b20Var2.b = -1L;
                }
                if (k40Var2.S.c()) {
                    k40Var2.M = null;
                    k40Var2.N = null;
                    k40Var2.O = null;
                    k40Var2.P = null;
                    org.telegram.messenger.b20 b20Var3 = k40Var2.S;
                    long j11 = b20Var3.r;
                    j10 = 0;
                    double d = j11;
                    z30Var = z30Var2;
                    long j12 = b20Var3.a;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    long j13 = b20Var3.b;
                    if (j13 >= 0) {
                        j11 = j13;
                    }
                    long j14 = j11 - j12;
                    b20Var3.r = j14;
                    b20Var3.q = Math.max(1L, (long) ((j14 / d) * k40Var2.Q));
                    org.telegram.messenger.b20 b20Var4 = k40Var2.S;
                    b20Var4.m = 1000000;
                    long j15 = b20Var4.a;
                    if (j15 > 0) {
                        b20Var4.a = j15 * 1000;
                    }
                    long j16 = b20Var4.b;
                    if (j16 > 0) {
                        b20Var4.b = j16 * 1000;
                    }
                    org.telegram.messenger.w7.G(i30).b(k40Var2.f0.getAbsolutePath(), false);
                } else {
                    z30Var = z30Var2;
                    j10 = 0;
                    k40Var2.S.q = Math.max(1L, k40Var2.Q);
                }
                org.telegram.messenger.b20 b20Var5 = k40Var2.S;
                b20Var5.s = true;
                b20Var5.w = k40Var2.M;
                b20Var5.x = k40Var2.N;
                b20Var5.y = k40Var2.O;
                b20Var5.z = k40Var2.P;
                b20Var5.n = 25;
                b20Var5.h = 360;
                b20Var5.k = 360;
                b20Var5.i = 360;
                b20Var5.l = 360;
                b20Var5.o = c40Var.a.getAbsolutePath();
                org.telegram.messenger.b20 b20Var6 = k40Var2.S;
                if (i29 != 1) {
                    c40Var.h(c40Var.a);
                    b20Var6.r = k40Var2.k0;
                    org.telegram.messenger.hs.f(i30).k(org.telegram.messenger.hs.s2, Integer.valueOf(k40Var2.V), b20Var6, c40Var.a.getAbsolutePath(), c40Var.B0);
                    return;
                }
                if (x30Var.c()) {
                    Activity parentActivity = x30Var.getParentActivity();
                    long a10 = x30Var.a();
                    org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(c40Var, z30Var, b20Var6, 3);
                    org.telegram.ui.Components.a40 a40Var = new org.telegram.ui.Components.a40(c40Var, 0);
                    org.telegram.ui.ActionBar.e6 e6Var = k40Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.t4.a;
                    org.telegram.ui.Components.t4.J(parentActivity, a10, -1L, 0, false, hrVar, a40Var, new org.telegram.ui.Components.q4(e6Var), e6Var);
                } else {
                    org.telegram.ui.Components.z30 z30Var3 = z30Var;
                    org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, c40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (z30Var3 != null) {
                        yeVar.x = z30Var3.c;
                        yeVar.y = z30Var3.d;
                    }
                    k40Var2.h.u(yeVar, b20Var6, z30Var3 == null || z30Var3.a, z30Var3 != null ? z30Var3.b : 0, 0, false, z30Var3 != null ? z30Var3.e : j10);
                }
                k40Var2.S = null;
                return;
            case 14:
                org.telegram.ui.Components.kh0 kh0Var = (org.telegram.ui.Components.kh0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = kh0Var.f;
                TextView textView = kh0Var.b;
                org.telegram.messenger.zi ziVar2 = kh0Var.s;
                ImageView imageView = kh0Var.d;
                org.telegram.ui.Components.k9 k9Var = kh0Var.e;
                ArrayList arrayList5 = kh0Var.r;
                ArrayList arrayList6 = kh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    G = org.telegram.messenger.bd.G(i31, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.bd.K0(i31, "Reacted"), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (kh0Var.getMeasuredWidth() > 0) {
                    kh0Var.w = kh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = ziVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.li.b0(i32).h;
                    int size5 = arrayList7.size();
                    int i33 = 0;
                    while (i33 < size5) {
                        Object obj = arrayList7.get(i33);
                        i33++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            k9Var.k(org.telegram.messenger.ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            k9Var.setVisibility(0);
                            k9Var.setAlpha(0.0f);
                            k9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i3 = 0;
                            while (i3 < size) {
                                TLRPC.User user = arrayList8.get(i3);
                                i3++;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = ziVar2.k.from_id;
                                if (peer != null && user2.id != peer.user_id) {
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < arrayList.size()) {
                                            int i35 = i34;
                                            if (((org.telegram.ui.Components.jh0) arrayList.get(i34)).b == user2.id) {
                                                break;
                                            } else {
                                                i34 = i35 + 1;
                                            }
                                        } else {
                                            arrayList.add(new org.telegram.ui.Components.jh0(0, user2));
                                        }
                                    }
                                }
                            }
                            ArrayList<TLRPC.Chat> arrayList9 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList9.size();
                            i10 = 0;
                            while (i10 < size2) {
                                TLRPC.Chat chat2 = arrayList9.get(i10);
                                i10++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = ziVar2.k.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.jh0(0, chat3));
                                        } else if (((org.telegram.ui.Components.jh0) arrayList.get(i36)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.iz izVar = kh0Var.a;
                            org.telegram.ui.Components.x8 x8Var = kh0Var.c;
                            kh0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    x8Var.b(i11, i32, ((org.telegram.ui.Components.jh0) arrayList.get(i11)).a);
                                } else {
                                    x8Var.b(i11, i32, null);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.g0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (org.telegram.messenger.bd.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    x8Var.setTranslationX(f10);
                                    x8Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    x8Var.animate().alpha(1.0f).setDuration(220L).start();
                                    izVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.bd.a0) {
                            }
                            x8Var.setTranslationX(f10);
                            x8Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            x8Var.animate().alpha(1.0f).setDuration(220L).start();
                            izVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar)).start();
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
                i3 = 0;
                while (i3 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList92 = tL_messages_messageReactionsList.chats;
                size2 = arrayList92.size();
                i10 = 0;
                while (i10 < size2) {
                }
                org.telegram.ui.Components.iz izVar2 = kh0Var.a;
                org.telegram.ui.Components.x8 x8Var2 = kh0Var.c;
                kh0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.bd.a0) {
                }
                x8Var2.setTranslationX(f10);
                x8Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                x8Var2.animate().alpha(1.0f).setDuration(220L).start();
                izVar2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar2)).start();
                return;
            case 15:
                org.telegram.ui.Components.lo0 lo0Var = (org.telegram.ui.Components.lo0) this.c;
                int i37 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.jo0 jo0Var = lo0Var.e;
                org.telegram.ui.Components.oo0 oo0Var = lo0Var.L;
                if (i37 != lo0Var.r) {
                    return;
                }
                lo0Var.b();
                lo0Var.J = false;
                lo0Var.w = i37;
                if (lo0Var.s != i37) {
                    jo0Var.b();
                }
                org.telegram.ui.Components.qn0 qn0Var = oo0Var.y1;
                org.telegram.ui.Components.lo0 lo0Var2 = oo0Var.F1;
                if (qn0Var.getAdapter() != lo0Var2) {
                    org.telegram.ui.Components.oo0.J0(oo0Var);
                    lo0Var2.f();
                }
                for (int i38 = 0; i38 < arrayList10.size(); i38++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.do0) arrayList10.get(i38)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.hp.s1(oo0Var.a).X3((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.hp.s1(oo0Var.a).Q3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !lo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (lo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.oo0.J0(oo0Var);
                }
                lo0Var.d = arrayList10;
                jo0Var.f(arrayList10, null);
                int i39 = lo0Var.K;
                if (lo0Var.b() != 0 || jo0Var.e() || lo0Var.J) {
                    oo0Var.q2.b(i39);
                } else {
                    oo0Var.J1.e(false, true);
                }
                lo0Var.f();
                oo0Var.K0(true);
                return;
            case 16:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.ws0) this.c).m1, (TL_stories.StoryItem) this.d);
                return;
            case 17:
                org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this.c;
                ws0Var.c0(this.b, (org.telegram.ui.Components.tj0) this.d, false);
                ws0Var.N1 = null;
                return;
            case 18:
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i40 = this.b;
                if (d2Var3 instanceof wm) {
                    wm wmVar3 = (wm) d2Var3;
                    wmVar3.f8();
                    undoView2 = wmVar3.N3;
                } else if (d2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) d2Var3).M;
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
            case 19:
                org.telegram.ui.Components.is0 is0Var = (org.telegram.ui.Components.is0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != is0Var.F) {
                    return;
                }
                is0Var.E = ConnectionsManager.getInstance(is0Var.d).sendRequest(tL_messages_search, new ci.a2(is0Var, i41, i13));
                return;
            case 20:
                org.telegram.ui.Components.is0 is0Var2 = (org.telegram.ui.Components.is0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList11 = is0Var2.h;
                int i43 = is0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == is0Var2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.hp.s1(i43).Y3(messages_messages.users, false);
                    org.telegram.messenger.hp.s1(i43).S3(messages_messages.chats, false);
                    org.telegram.messenger.qr.a0(i43).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(i43, messages_messages.messages.get(i44), false, true);
                        if (ziVar3.A2()) {
                            ziVar3.Q2 = true;
                        }
                        ziVar3.L5(is0Var2.x, true);
                        arrayList11.add(ziVar3);
                    }
                    is0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        is0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        is0Var2.s = true;
                    }
                    is0Var2.G(false);
                    is0Var2.r = false;
                    is0Var2.E = -1;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.yt0 yt0Var = (org.telegram.ui.Components.yt0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                yt0Var.Z0 = false;
                if (!yt0Var.W0 && yt0Var.X0) {
                    yt0Var.C(true);
                    return;
                }
                yt0Var.n0 = yt0Var.g1[0];
                yt0Var.l();
                org.telegram.messenger.z5.q(i45).v(q1Var);
                yt0Var.I();
                yt0Var.x();
                return;
            case 22:
                int i46 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.v2 v2Var = (org.telegram.messenger.v2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.qr.a0(i46).b;
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
            case 23:
                int i47 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.qr.a0(i47).b;
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
            case 24:
                org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var4 = jv0Var.S2.D1;
                if (d2Var4 instanceof wm) {
                    wm wmVar4 = (wm) d2Var4;
                    wmVar4.f8();
                    undoView3 = wmVar4.N3;
                } else if (d2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) d2Var4).M;
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
            case 25:
                org.telegram.ui.Components.ow0 ow0Var = (org.telegram.ui.Components.ow0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.hi hiVar = new org.telegram.messenger.hi();
                hiVar.a = str3;
                hiVar.b = null;
                arrayList12.add(hiVar);
                org.telegram.messenger.li.b0(ow0Var.a).O(arrayList12, 15, false, false, new org.telegram.ui.Components.zo0(ow0Var, i49, str3, arrayList12));
                return;
            case 26:
                a();
                return;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0((org.telegram.ui.Components.yz0) this.c, (org.telegram.ui.Components.uo) this.d, this.b, org.telegram.messenger.kz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 6));
                return;
            case 28:
                org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) this.c;
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
                int i50 = this.b;
                HashMap hashMap = org.telegram.ui.Components.m11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(org.telegram.ui.Components.m11.n(ziVar4)));
                }
                if (l1Var != null) {
                    l1Var.e0(3);
                }
                org.telegram.messenger.hs.f(i50).k(org.telegram.messenger.hs.A1, ziVar4);
                org.telegram.messenger.hs.f(i50).k(org.telegram.messenger.hs.E1, new Object[0]);
                return;
            default:
                yv yvVar = (yv) this.c;
                int i51 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                uw uwVar = yvVar.k0;
                ArrayList arrayList13 = uwVar.S1;
                if (arrayList13 == null || i51 < 0 || i51 >= arrayList13.size()) {
                    return;
                }
                uwVar.S1.add(i51, dialog);
                uwVar.f0[0].q(true);
                return;
        }
    }

    public /* synthetic */ f4(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ f4(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }

    public /* synthetic */ f4(g4 g4Var, int i3, int[] iArr, int[] iArr2) {
        this.a = 0;
        this.c = g4Var;
        this.b = i3;
        this.d = iArr2;
    }
}
