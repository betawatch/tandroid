package ag;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import bi.c6;
import bi.k6;
import bi.q6;
import bi.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.p4;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.z20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.am;
import org.telegram.ui.ba;
import org.telegram.ui.bh;
import org.telegram.ui.f4;
import org.telegram.ui.fm;
import org.telegram.ui.h4;
import org.telegram.ui.un;
import th.r4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o0(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x03ed  */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, n2.k] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r42;
        UndoView undoView;
        UndoView undoView2;
        ?? r92;
        char c10;
        char c11;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.c;
                s0Var.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                zs.f(s0Var.a).k(zs.J1, new Object[0]);
                break;
            case 1:
                z5 z5Var = (z5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i10 = this.b;
                c6 m10 = z5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    bi.n1 n1Var = m10.a;
                    n1Var.N();
                    n1Var.setSelection(Math.max(0, Math.min(i10, n1Var.length())));
                    break;
                }
                break;
            case 2:
                k6 k6Var = (k6) this.c;
                bi.a aVar = (bi.a) this.d;
                int i11 = this.b;
                q6 q6Var = k6Var.a;
                if (q6Var.D != null) {
                    q6.e(aVar.b, "");
                    ((bi.m3) q6Var.D).c(aVar, i11);
                    break;
                }
                break;
            case 3:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i12 = this.b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.q qVar = (e2.q) it.next();
                    if (!qVar.d) {
                        if (i12 != -1) {
                            qVar.b.b(i12);
                        }
                        qVar.c = true;
                        oVar.invoke(qVar.a);
                    }
                }
                break;
            case 4:
                ((View) this.d).postOnAnimation(new d3((qx) this.c, this.b, 3));
                break;
            case 5:
                i2.i1 i1Var = (i2.i1) this.c;
                Pair pair = (Pair) this.d;
                i1Var.b.h.b(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.b);
                break;
            case 6:
                ig.q0 q0Var = (ig.q0) this.c;
                q0Var.e((ig.f1) this.d, this.b, q0Var.h);
                q0Var.h = null;
                break;
            case 7:
                jg.r0 r0Var = (jg.r0) this.c;
                ig.g gVar = (ig.g) this.d;
                int i13 = this.b;
                if (r0Var.F0.getCurrentBrush() instanceof ig.g) {
                    r42 = 1;
                    r0Var.T0 = true;
                } else {
                    r42 = 1;
                }
                r0Var.z(gVar);
                jg.y1 y1Var = r0Var.c1;
                int i14 = y1Var.d + r42;
                y1Var.a(i14);
                org.telegram.messenger.i0.Q3(y1Var.a[i14], i13);
                y1Var.e = r42;
                break;
            case 8:
                n2.j jVar = (n2.j) this.c;
                this.d.b(jVar.a, jVar.b, this.b);
                break;
            case 9:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 10:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 11:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 12:
                int i15 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.d;
                String str = vp.r1(i15).P6;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                gf.f.r(context, str);
                z2VarArr[0].dismiss();
                break;
            case 13:
                h4 h4Var = (h4) this.c;
                String str2 = (String) this.d;
                int i16 = this.b;
                HashMap hashMap = new HashMap(h4Var.u0[0].c.x);
                ArrayList arrayList = new ArrayList(h4Var.u0[0].c.y);
                h4Var.W0 = null;
                Utilities.g.c(new i2.g1(h4Var, arrayList, hashMap, str2, i16, 4));
                break;
            case 14:
                h4 h4Var2 = (h4) this.c;
                int i17 = this.b;
                gf.e eVar = (gf.e) this.d;
                if (h4Var2.I0 == i17 && h4Var2.G0 != 0) {
                    ConnectionsManager.getInstance(h4Var2.X).cancelRequest(h4Var2.G0, false);
                    h4Var2.G0 = 0;
                }
                if (h4Var2.N0 == eVar) {
                    h4Var2.N0 = null;
                    break;
                }
                break;
            case 15:
                int i18 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                vp.r1(i18).V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2.b(i18).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 16:
                f4 f4Var = (f4) this.c;
                int i19 = this.b;
                int[] iArr = (int[]) this.d;
                f4Var.K = i19;
                f4Var.J = iArr;
                f4Var.M.d0();
                break;
            case 17:
                String str3 = (String) this.c;
                int i20 = this.b;
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str3).getPathSegments().get(r1.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, i20, tL_inputGroupCallSlug, false, null, null);
                z2VarArr2[0].dismiss();
                break;
            case 18:
                ((un) this.c).Za(this.b, (ArrayList) this.d, false, false);
                break;
            case 19:
                un unVar = (un) this.c;
                int i21 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i22 = 0;
                unVar.z0.w0(0, i21, null);
                if (!org.telegram.messenger.i0.J3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.i0.h3(new bh(editTextBoldCursor, i22), 100L);
                break;
            case 20:
                am amVar = (am) this.c;
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.d;
                int i23 = this.b;
                amVar.getClass();
                jj messageObject = s0Var2.getMessageObject();
                fm fmVar = amVar.a;
                fmVar.Q.k(i23, messageObject.f1(), true, jj.B0(messageObject.k) == fmVar.Q.b7 ? 1 : 0, true, 0);
                break;
            case 21:
                b6.I0(this.b, ((kk) this.c).getContext(), (p6) this.d);
                break;
            case 22:
                jn jnVar = (jn) this.c;
                int i24 = this.b;
                View view = (View) this.d;
                jnVar.V = 0;
                jnVar.U = i24;
                if (view instanceof p8) {
                    jnVar.X((p8) view, true);
                    break;
                } else {
                    jnVar.r.g(jnVar.I0);
                    break;
                }
            case 23:
                ru ruVar = (ru) this.c;
                a0.h hVar = (a0.h) this.d;
                int i25 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var = ruVar.R2.j1;
                if (k2Var instanceof un) {
                    un unVar2 = (un) k2Var;
                    unVar2.Y7();
                    undoView2 = unVar2.M3;
                } else if (!(k2Var instanceof ProfileActivity)) {
                    undoView = null;
                    if (undoView == null) {
                        if (hVar.m() == 1) {
                            undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i25), 53);
                            break;
                        } else {
                            undoView.k(0L, 53, Integer.valueOf(i25), Integer.valueOf(hVar.m()), null, null);
                            break;
                        }
                    }
                } else {
                    undoView2 = ((ProfileActivity) k2Var).L;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
                break;
            case 24:
                rx rxVar = (rx) this.c;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.d;
                int i26 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    x1Var.setOnCancelListener(new ba(rxVar, i26, 4));
                    x1VarArr[0].show();
                    break;
                }
                break;
            case 25:
                int i27 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.c;
                q20 q20Var = (q20) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i27;
                k2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new mg.w(k2Var2, i27, q20Var, 5));
                break;
            case 26:
                y20 y20Var = (y20) this.c;
                int i28 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                zf.m1 m1Var = y20Var.d;
                z20 z20Var = y20Var.x;
                if (i28 == y20Var.n) {
                    y20Var.h = false;
                    TLRPC.Chat chat2 = z20Var.M1;
                    dw0 dw0Var = z20Var.q1;
                    if (!w3.T(chat2)) {
                        a0.h hVar2 = m1Var.h;
                        ArrayList arrayList3 = m1Var.g;
                        arrayList3.clear();
                        arrayList3.addAll(arrayList2);
                        int size = arrayList2.size();
                        for (int i29 = 0; i29 < size; i29++) {
                            TLObject tLObject = (TLObject) arrayList2.get(i29);
                            if (tLObject instanceof TLRPC.ChatParticipant) {
                                hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                                hVar2.k(tLObject, jj.C1(((TLRPC.ChannelParticipant) tLObject).peer));
                            }
                        }
                        m1Var.i();
                    }
                    int i30 = y20Var.f - 1;
                    boolean z10 = dw0Var.getVisibility() == 0;
                    y20Var.f();
                    if (y20Var.f > i30) {
                        z20Var.O0(i30);
                    }
                    if (!y20Var.h && !m1Var.e() && z20Var.k1.R0()) {
                        dw0Var.e(false, z10);
                        break;
                    }
                }
                break;
            case 27:
                m30 m30Var = (m30) this.c;
                int i31 = this.b;
                String str4 = (String) this.d;
                ArrayList arrayList4 = m30Var.Q;
                int i32 = m30Var.P;
                if (i31 == m30Var.V) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m30Var.d0[0] ? "$" : "#");
                    sb2.append(m30Var.a0);
                    String sb3 = sb2.toString();
                    r4 r4Var = m30Var.S;
                    if (r4Var == null || !TextUtils.equals(r4Var.C, sb3)) {
                        m30Var.S = new r4(i32, null, sb3);
                    }
                    if (m30Var.S.i.size() <= 0) {
                        r92 = 1;
                        m30Var.S.p(4, true);
                    } else {
                        r92 = 1;
                    }
                    m30Var.R = r92;
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= r92;
                    m30Var.a0 = str4;
                    tL_channels_searchPosts.hashtag = str4;
                    tL_channels_searchPosts.limit = 10;
                    if (arrayList4.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        jj jjVar = (jj) i0.a.g(r92, arrayList4);
                        tL_channels_searchPosts.offset_rate = m30Var.b0;
                        tL_channels_searchPosts.offset_peer = vp.r1(i32).l1(jjVar.k.peer_id);
                    }
                    m30Var.W = ConnectionsManager.getInstance(i32).sendRequest(tL_channels_searchPosts, new mg.w(m30Var, i31, sb3, 6));
                    break;
                }
                break;
            case 28:
                int i33 = 2;
                e50 e50Var = (e50) this.c;
                int i34 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (e50Var.l0 != null) {
                    if (org.telegram.messenger.v2.a) {
                        f8.b("InstantCamera create camera session " + i34);
                    }
                    if (e50Var.A0 && i34 == e50Var.z0) {
                        e50Var.p("camera open submitted: surface=" + i34);
                    }
                    if (e50Var.r0) {
                        if (e50Var.t0) {
                            Camera2Session camera2Session = e50Var.u0[i34];
                            if (camera2Session != null) {
                                camera2Session.open(surfaceTexture);
                                break;
                            }
                        } else if (i34 != 1) {
                            r40 r40Var = e50Var.l0;
                            Camera2Session camera2Session2 = e50Var.v0;
                            Handler handler = r40Var.getHandler();
                            if (handler != null) {
                                r40Var.sendMessage(handler.obtainMessage(3, camera2Session2), 0);
                            }
                            e50Var.v0.open(surfaceTexture);
                            break;
                        }
                    } else if (i34 != 1) {
                        surfaceTexture.setDefaultBufferSize(e50Var.m0[0].getWidth(), e50Var.m0[0].getHeight());
                        e50Var.s0 = new CameraSession(e50Var.H, e50Var.m0[0], e50Var.n0, 256, true);
                        e50Var.v();
                        r40 r40Var2 = e50Var.l0;
                        CameraSession cameraSession = e50Var.s0;
                        Handler handler2 = r40Var2.getHandler();
                        if (handler2 != null) {
                            r40Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                        }
                        CameraController.getInstance().openRound(e50Var.s0, surfaceTexture, new j40(e50Var, 1), new j40(e50Var, i33));
                        break;
                    }
                }
                break;
            default:
                x40 x40Var = (x40) this.c;
                int i35 = this.b;
                u40 u40Var = (u40) this.d;
                e50 e50Var2 = x40Var.H0;
                x20 x20Var = e50Var2.R;
                int i36 = e50Var2.e;
                s40 s40Var = e50Var2.h;
                if (x20Var == null) {
                    x20 x20Var2 = new x20();
                    e50Var2.R = x20Var2;
                    x20Var2.a = -1L;
                    x20Var2.b = -1L;
                }
                if (e50Var2.R.c()) {
                    e50Var2.L = null;
                    e50Var2.M = null;
                    e50Var2.N = null;
                    e50Var2.O = null;
                    x20 x20Var3 = e50Var2.R;
                    c10 = 2;
                    c11 = 3;
                    long j10 = x20Var3.r;
                    double d = j10;
                    long j11 = x20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = x20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    x20Var3.r = j13;
                    x20Var3.q = Math.max(1L, (long) ((j13 / d) * e50Var2.P));
                    x20 x20Var4 = e50Var2.R;
                    x20Var4.m = 1000000;
                    long j14 = x20Var4.a;
                    if (j14 > 0) {
                        x20Var4.a = j14 * 1000;
                    }
                    long j15 = x20Var4.b;
                    if (j15 > 0) {
                        x20Var4.b = j15 * 1000;
                    }
                    b8.G(i36).b(e50Var2.e0.getAbsolutePath(), false);
                } else {
                    c10 = 2;
                    c11 = 3;
                    e50Var2.R.q = Math.max(1L, e50Var2.P);
                }
                x20 x20Var5 = e50Var2.R;
                x20Var5.s = true;
                x20Var5.w = e50Var2.L;
                x20Var5.x = e50Var2.M;
                x20Var5.y = e50Var2.N;
                x20Var5.z = e50Var2.O;
                int i37 = 25;
                x20Var5.n = 25;
                x20Var5.h = 360;
                x20Var5.k = 360;
                x20Var5.i = 360;
                x20Var5.l = 360;
                x20Var5.o = x40Var.a.getAbsolutePath();
                x20 x20Var6 = e50Var2.R;
                if (i35 == 1) {
                    if (s40Var.c()) {
                        Activity parentActivity = s40Var.getParentActivity();
                        long a2 = s40Var.a();
                        androidx.car.app.utils.a aVar2 = new androidx.car.app.utils.a(x40Var, u40Var, x20Var6, i37);
                        v40 v40Var = new v40(x40Var, 0);
                        p6 p6Var = e50Var2.Y0;
                        Pattern pattern = s4.a;
                        s4.J(parentActivity, a2, -1L, 0, false, aVar2, v40Var, new p4(p6Var), p6Var);
                    } else {
                        ef efVar = new ef(0, x40Var.a.getAbsolutePath(), 0, true, 0, 0);
                        if (u40Var != null) {
                            efVar.x = u40Var.c;
                            efVar.y = u40Var.d;
                        }
                        e50Var2.h.t(efVar, x20Var6, u40Var == null || u40Var.a, u40Var != null ? u40Var.b : 0, 0, false, u40Var != null ? u40Var.e : 0L);
                    }
                    e50Var2.R = null;
                    break;
                } else {
                    x40Var.h(x40Var.a);
                    x20Var6.r = e50Var2.j0;
                    zs f7 = zs.f(i36);
                    Integer valueOf = Integer.valueOf(e50Var2.U);
                    String absolutePath = x40Var.a.getAbsolutePath();
                    ArrayList arrayList5 = x40Var.A0;
                    Object[] objArr = new Object[4];
                    objArr[0] = valueOf;
                    objArr[1] = x20Var6;
                    objArr[c10] = absolutePath;
                    objArr[c11] = arrayList5;
                    f7.k(zs.s2, objArr);
                    break;
                }
        }
    }

    public /* synthetic */ o0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ o0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ o0(f4 f4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 16;
        this.c = f4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
