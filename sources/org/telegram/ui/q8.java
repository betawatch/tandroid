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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.Components.sz0 sz0Var = (org.telegram.ui.Components.sz0) this.d;
        String str = (String) this.c;
        int i7 = this.b;
        org.telegram.ui.Components.rz0 rz0Var = sz0Var.r.o1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                sz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qp0(sz0Var, sz0Var.d, new ArrayList(), new ArrayList(), 4));
                return;
            }
            int i10 = 0;
            String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
            int size = rz0Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) rz0Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.u6) arrayList3.get(i10)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.sz0.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qp0(sz0Var, i7, arrayList, arrayList2, 4));
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
                ((cn) this.c).mb(this.b, (ArrayList) this.d, false, false);
                return;
            case 2:
                cn cnVar = (cn) this.c;
                int i16 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i17 = 0;
                cnVar.z0.w0(0, i16, null);
                if (!org.telegram.messenger.g0.K3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.i3(new rg(editTextBoldCursor, i17), 100L);
                return;
            case 3:
                gl glVar = (gl) this.c;
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.d;
                int i18 = this.b;
                glVar.getClass();
                org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
                ll llVar = glVar.a;
                llVar.Q.l(i18, messageObject.e1(), true, org.telegram.messenger.ij.B0(messageObject.k) == llVar.Q.b7 ? 1 : 0, true, 0);
                return;
            case 4:
                org.telegram.ui.Wallet.w5.J0(this.b, ((org.telegram.ui.Components.ik) this.c).getContext(), (org.telegram.ui.ActionBar.g6) this.d);
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
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var = guVar.R2.j1;
                if (f2Var instanceof cn) {
                    cn cnVar2 = (cn) f2Var;
                    cnVar2.g8();
                    undoView = cnVar2.M3;
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
                org.telegram.ui.Components.dx dxVar = (org.telegram.ui.Components.dx) this.c;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i21 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var == null) {
                    return;
                }
                u1Var.setOnCancelListener(new bi.g0(dxVar, i21, i14));
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
                org.telegram.ui.Components.h20 h20Var = (org.telegram.ui.Components.h20) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = h20Var.d;
                org.telegram.ui.Components.i20 i20Var = h20Var.x;
                if (i23 != h20Var.n) {
                    return;
                }
                h20Var.h = false;
                TLRPC.Chat chat = i20Var.M1;
                org.telegram.ui.Components.cv0 cv0Var = i20Var.q1;
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
                            hVar2.k(tLObject, org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i25 = h20Var.f - 1;
                boolean z9 = cv0Var.getVisibility() == 0;
                h20Var.f();
                if (h20Var.f > i25) {
                    i20Var.O0(i25);
                }
                if (h20Var.h || z1Var.e() || !i20Var.k1.R0()) {
                    return;
                }
                cv0Var.e(false, z9);
                return;
            case 10:
                org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) this.d;
                int i26 = this.b;
                String str2 = (String) this.c;
                ArrayList arrayList4 = v20Var.Q;
                int i27 = v20Var.P;
                if (i26 != v20Var.V) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v20Var.d0[0] ? "$" : "#");
                sb2.append(v20Var.a0);
                String sb3 = sb2.toString();
                di.l6 l6Var = v20Var.S;
                if (l6Var == null || !TextUtils.equals(l6Var.C, sb3)) {
                    v20Var.S = new di.l6(i27, null, sb3);
                }
                if (v20Var.S.i.size() <= 0) {
                    r92 = 1;
                    v20Var.S.p(4, true);
                } else {
                    r92 = 1;
                }
                v20Var.R = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                v20Var.a0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = v20Var.b0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.qp.s1(i27).m1(ijVar.k.peer_id);
                }
                v20Var.W = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new jg.v(v20Var, i26, sb3, 6));
                return;
            case 11:
                org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) this.c;
                int i28 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (p40Var.l0 == null) {
                    return;
                }
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i28);
                }
                if (p40Var.A0 && i28 == p40Var.z0) {
                    p40Var.q("camera open submitted: surface=" + i28);
                }
                if (!p40Var.r0) {
                    if (i28 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(p40Var.m0[0].getWidth(), p40Var.m0[0].getHeight());
                    p40Var.s0 = new CameraSession(p40Var.H, p40Var.m0[0], p40Var.n0, 256, true);
                    p40Var.w();
                    org.telegram.ui.Components.b40 b40Var = p40Var.l0;
                    CameraSession cameraSession = p40Var.s0;
                    Handler handler = b40Var.getHandler();
                    if (handler != null) {
                        b40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(p40Var.s0, surfaceTexture, new org.telegram.ui.Components.s30(p40Var, 1), new org.telegram.ui.Components.s30(p40Var, 2));
                    return;
                }
                if (p40Var.t0) {
                    Camera2Session camera2Session = p40Var.u0[i28];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i28 == 1) {
                    return;
                }
                org.telegram.ui.Components.b40 b40Var2 = p40Var.l0;
                Camera2Session camera2Session2 = p40Var.v0;
                Handler handler2 = b40Var2.getHandler();
                if (handler2 != null) {
                    b40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                p40Var.v0.open(surfaceTexture);
                return;
            case 12:
                org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) this.c;
                int i29 = this.b;
                org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) this.d;
                org.telegram.ui.Components.p40 p40Var2 = h40Var.H0;
                org.telegram.messenger.j20 j20Var = p40Var2.R;
                int i30 = p40Var2.e;
                org.telegram.ui.Components.c40 c40Var = p40Var2.h;
                if (j20Var == null) {
                    org.telegram.messenger.j20 j20Var2 = new org.telegram.messenger.j20();
                    p40Var2.R = j20Var2;
                    j20Var2.a = -1L;
                    j20Var2.b = -1L;
                }
                if (p40Var2.R.c()) {
                    p40Var2.L = null;
                    p40Var2.M = null;
                    p40Var2.N = null;
                    p40Var2.O = null;
                    org.telegram.messenger.j20 j20Var3 = p40Var2.R;
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
                    j20Var3.q = Math.max(1L, (long) ((j13 / d) * p40Var2.P));
                    org.telegram.messenger.j20 j20Var4 = p40Var2.R;
                    j20Var4.m = 1000000;
                    long j14 = j20Var4.a;
                    if (j14 > 0) {
                        j20Var4.a = j14 * 1000;
                    }
                    long j15 = j20Var4.b;
                    if (j15 > 0) {
                        j20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i30).b(p40Var2.e0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    p40Var2.R.q = Math.max(1L, p40Var2.P);
                }
                org.telegram.messenger.j20 j20Var5 = p40Var2.R;
                j20Var5.s = true;
                j20Var5.w = p40Var2.L;
                j20Var5.x = p40Var2.M;
                j20Var5.y = p40Var2.N;
                j20Var5.z = p40Var2.O;
                j20Var5.n = 25;
                j20Var5.h = 360;
                j20Var5.k = 360;
                j20Var5.i = 360;
                j20Var5.l = 360;
                j20Var5.o = h40Var.a.getAbsolutePath();
                org.telegram.messenger.j20 j20Var6 = p40Var2.R;
                if (i29 != 1) {
                    h40Var.h(h40Var.a);
                    j20Var6.r = p40Var2.j0;
                    org.telegram.messenger.qs.f(i30).k(org.telegram.messenger.qs.s2, Integer.valueOf(p40Var2.U), j20Var6, h40Var.a.getAbsolutePath(), h40Var.A0);
                    return;
                }
                if (c40Var.c()) {
                    Activity parentActivity = c40Var.getParentActivity();
                    long a10 = c40Var.a();
                    org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(h40Var, e40Var, j20Var6, 3);
                    org.telegram.ui.Components.f40 f40Var = new org.telegram.ui.Components.f40(h40Var, 0);
                    org.telegram.ui.ActionBar.g6 g6Var = p40Var2.Y0;
                    Pattern pattern = org.telegram.ui.Components.v4.a;
                    org.telegram.ui.Components.v4.H(parentActivity, a10, -1L, 0, false, hrVar, f40Var, new org.telegram.ui.Components.s4(g6Var), g6Var);
                } else {
                    org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, h40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (e40Var != null) {
                        gfVar.x = e40Var.c;
                        gfVar.y = e40Var.d;
                    }
                    p40Var2.h.u(gfVar, j20Var6, e40Var == null || e40Var.a, e40Var != null ? e40Var.b : 0, 0, false, e40Var != null ? e40Var.e : j3);
                }
                p40Var2.R = null;
                return;
            case 13:
                org.telegram.ui.Components.ih0 ih0Var = (org.telegram.ui.Components.ih0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = ih0Var.f;
                TextView textView = ih0Var.b;
                org.telegram.messenger.ij ijVar2 = ih0Var.s;
                ImageView imageView = ih0Var.d;
                org.telegram.ui.Components.l9 l9Var = ih0Var.e;
                ArrayList arrayList5 = ih0Var.r;
                ArrayList arrayList6 = ih0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    G = org.telegram.messenger.id.G(i31, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.id.K0(i31, "Reacted"), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (ih0Var.getMeasuredWidth() > 0) {
                    ih0Var.w = ih0Var.getMeasuredWidth();
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
                                            if (((org.telegram.ui.Components.hh0) arrayList.get(i35)).b == user2.id) {
                                                break;
                                            }
                                            i35++;
                                            size = i12;
                                            i34 = i13;
                                        } else {
                                            i12 = size;
                                            i13 = i34;
                                            arrayList.add(new org.telegram.ui.Components.hh0(0, user2));
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
                                            arrayList.add(new org.telegram.ui.Components.hh0(0, chat3));
                                        } else if (((org.telegram.ui.Components.hh0) arrayList.get(i36)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.mz mzVar = ih0Var.a;
                            org.telegram.ui.Components.z8 z8Var = ih0Var.c;
                            ih0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    z8Var.b(i11, i32, ((org.telegram.ui.Components.hh0) arrayList.get(i11)).a);
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
                                    if (org.telegram.messenger.id.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    z8Var.setTranslationX(f10);
                                    z8Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    z8Var.animate().alpha(1.0f).setDuration(220L).start();
                                    mzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(mzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.id.a0) {
                            }
                            z8Var.setTranslationX(f10);
                            z8Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            z8Var.animate().alpha(1.0f).setDuration(220L).start();
                            mzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(mzVar)).start();
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
                org.telegram.ui.Components.mz mzVar2 = ih0Var.a;
                org.telegram.ui.Components.z8 z8Var2 = ih0Var.c;
                ih0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.id.a0) {
                }
                z8Var2.setTranslationX(f10);
                z8Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                z8Var2.animate().alpha(1.0f).setDuration(220L).start();
                mzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(mzVar2)).start();
                return;
            case 14:
                org.telegram.ui.Components.ko0 ko0Var = (org.telegram.ui.Components.ko0) this.c;
                int i37 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.io0 io0Var = ko0Var.e;
                org.telegram.ui.Components.no0 no0Var = ko0Var.K;
                if (i37 != ko0Var.r) {
                    return;
                }
                ko0Var.b();
                ko0Var.I = false;
                ko0Var.w = i37;
                if (ko0Var.s != i37) {
                    io0Var.b();
                }
                org.telegram.ui.Components.pn0 pn0Var = no0Var.x1;
                org.telegram.ui.Components.ko0 ko0Var2 = no0Var.E1;
                if (pn0Var.getAdapter() != ko0Var2) {
                    org.telegram.ui.Components.no0.J0(no0Var);
                    ko0Var2.f();
                }
                for (int i38 = 0; i38 < arrayList10.size(); i38++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.co0) arrayList10.get(i38)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.qp.s1(no0Var.a).X3((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(no0Var.a).Q3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !ko0Var.d.isEmpty() && arrayList10.isEmpty();
                if (ko0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.no0.J0(no0Var);
                }
                ko0Var.d = arrayList10;
                io0Var.f(arrayList10, null);
                int i39 = ko0Var.J;
                if (ko0Var.b() != 0 || io0Var.e() || ko0Var.I) {
                    no0Var.p2.b(i39);
                } else {
                    no0Var.I1.e(false, true);
                }
                ko0Var.f();
                no0Var.K0(true);
                return;
            case 15:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.zs0) this.c).l1, (TL_stories.StoryItem) this.d);
                return;
            case 16:
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this.c;
                zs0Var.c0(this.b, (org.telegram.ui.Components.qj0) this.d, false);
                zs0Var.M1 = null;
                return;
            case 17:
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i40 = this.b;
                if (f2Var3 instanceof cn) {
                    cn cnVar3 = (cn) f2Var3;
                    cnVar3.g8();
                    undoView2 = cnVar3.M3;
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
                org.telegram.ui.Components.ls0 ls0Var = (org.telegram.ui.Components.ls0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != ls0Var.E) {
                    return;
                }
                ls0Var.D = ConnectionsManager.getInstance(ls0Var.d).sendRequest(tL_messages_search, new bi.j2(ls0Var, i41, 7));
                return;
            case 19:
                org.telegram.ui.Components.ls0 ls0Var2 = (org.telegram.ui.Components.ls0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList11 = ls0Var2.h;
                int i43 = ls0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == ls0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.qp.s1(i43).Y3(messages_messages.users, false);
                    org.telegram.messenger.qp.s1(i43).S3(messages_messages.chats, false);
                    org.telegram.messenger.yr.a0(i43).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(i43, messages_messages.messages.get(i44), false, true);
                        if (ijVar3.z2()) {
                            ijVar3.Q2 = true;
                        }
                        ijVar3.K5(ls0Var2.x, true);
                        arrayList11.add(ijVar3);
                    }
                    ls0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ls0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ls0Var2.s = true;
                    }
                    ls0Var2.G(false);
                    ls0Var2.r = false;
                    ls0Var2.D = -1;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.bu0 bu0Var = (org.telegram.ui.Components.bu0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                bu0Var.Y0 = false;
                if (!bu0Var.V0 && bu0Var.W0) {
                    bu0Var.C(true);
                    return;
                }
                bu0Var.m0 = bu0Var.f1[0];
                bu0Var.l();
                org.telegram.messenger.z5.q(i45).v(q1Var);
                bu0Var.I();
                bu0Var.x();
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
                org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var4 = lv0Var.R2.C1;
                if (f2Var4 instanceof cn) {
                    cn cnVar4 = (cn) f2Var4;
                    cnVar4.g8();
                    undoView3 = cnVar4.M3;
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
                org.telegram.ui.Components.pw0 pw0Var = (org.telegram.ui.Components.pw0) this.d;
                String str3 = (String) this.c;
                int i49 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.qi qiVar = new org.telegram.messenger.qi();
                qiVar.a = str3;
                qiVar.b = null;
                arrayList12.add(qiVar);
                org.telegram.messenger.ui.b0(pw0Var.a).O(arrayList12, 15, false, false, new org.telegram.ui.Components.qp0(pw0Var, i49, str3, arrayList12, 3));
                return;
            case 25:
                a();
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qp0((org.telegram.ui.Components.a01) this.c, (org.telegram.ui.Components.uo) this.d, this.b, org.telegram.messenger.sz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 5));
                return;
            case 27:
                org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) this.c;
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
                int i50 = this.b;
                HashMap hashMap = org.telegram.ui.Components.t11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(org.telegram.ui.Components.t11.n(ijVar4)));
                }
                if (l1Var != null) {
                    l1Var.d0(3);
                }
                org.telegram.messenger.qs.f(i50).k(org.telegram.messenger.qs.A1, ijVar4);
                org.telegram.messenger.qs.f(i50).k(org.telegram.messenger.qs.E1, new Object[0]);
                return;
            case 28:
                dw dwVar = (dw) this.c;
                int i51 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                yw ywVar = dwVar.j0;
                ArrayList arrayList13 = ywVar.S1;
                if (arrayList13 == null || i51 < 0 || i51 >= arrayList13.size()) {
                    return;
                }
                ywVar.S1.add(i51, dialog);
                ywVar.e0[0].q(true);
                return;
            default:
                ww wwVar = (ww) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i52 = this.b;
                xw xwVar = wwVar.g;
                yw ywVar2 = wwVar.h;
                ywVar2.T1 = true;
                ywVar2.getMessagesController().d(0, i52, dialog2.id);
                ywVar2.T1 = false;
                ArrayList W0 = ywVar2.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog2);
                if (indexOf < 0) {
                    xwVar.q(false);
                    return;
                }
                ArrayList W02 = ywVar2.getMessagesController().W0(1);
                if (!W02.isEmpty() || indexOf != 1) {
                    ywVar2.M4(true, true);
                    xwVar.y.D();
                    xwVar.q(true);
                    ywVar2.z3();
                }
                if (W02.isEmpty()) {
                    W0.remove(0);
                    if (indexOf == 1) {
                        ywVar2.M4(true, true);
                        xwVar.q(true);
                        ywVar2.z3();
                        return;
                    } else {
                        if (!ywVar2.S1.isEmpty()) {
                            ywVar2.S1.remove(0);
                        }
                        xwVar.y.D();
                        xwVar.q(true);
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

    public /* synthetic */ q8(org.telegram.ui.Components.v20 v20Var, int i7, String str) {
        this.a = 10;
        this.d = v20Var;
        this.b = i7;
        this.c = str;
    }
}
