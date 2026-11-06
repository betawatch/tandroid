package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q10(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i7;
        int i10;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.k2) this.c).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new q10(i11, m4Var, a8.ba.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                ((c40) ((m4) this.b).b).L2.setNewColors((int[]) this.c);
                break;
            case 2:
                m50.a0((m50) this.b, (TLRPC.TL_error) this.c);
                break;
            case 3:
                i50 i50Var = (i50) this.b;
                String str = (String) this.c;
                j50 j50Var = i50Var.a;
                j50Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                j50Var.c = j50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new h50(i12, i50Var, str), 66);
                break;
            case 4:
                i50 i50Var2 = (i50) this.b;
                TLObject tLObject = (TLObject) this.c;
                j50 j50Var2 = i50Var2.a;
                if (tLObject != null) {
                    m50.f0(j50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    m50.f0(j50Var2.h, null);
                    break;
                }
            case 5:
                l50 l50Var = (l50) this.b;
                String str2 = (String) this.c;
                l50Var.h = str2;
                m50 m50Var = l50Var.r;
                if (m50Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                l50Var.n = m50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(l50Var, str2, str2, 14), 66);
                break;
            case 6:
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(11, (a60) this.b, (org.telegram.messenger.s2) this.c), 150L);
                break;
            case 7:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.f();
                break;
            case 8:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str3 = (String) this.c;
                int i13 = 7;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new q10(i13, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) languageSelectActivity2.h.get(i14);
                        if (edVar.a.toLowerCase().startsWith(str3) || edVar.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(edVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) languageSelectActivity2.f.get(i12);
                        if (edVar2.a.toLowerCase().startsWith(str3) || edVar2.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(edVar2);
                        }
                        i12++;
                    }
                    org.telegram.messenger.g0.h3(new q10(i13, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                String str4 = LaunchActivity.B1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.qp.s1(launchActivity.O).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.qp.s1(launchActivity.O).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.yr.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    an anVar = new an(bundle);
                    anVar.Ba = resolvedbusinesschatlinks;
                    launchActivity.u0(anVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.v4.K(launchActivity, org.telegram.messenger.hd.M0(2131752716, null), org.telegram.messenger.hd.M0(2131752712, null)));
                    break;
                }
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity2.O).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 11:
                g gVar = (g) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str6 = LaunchActivity.B1;
                String M0 = org.telegram.messenger.hd.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error.text);
                org.telegram.ui.Components.v4.r0(gVar, M0, sb2.toString(), null);
                break;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str7 = (String) this.c;
                if (!launchActivity3.o0.getFragmentStack().isEmpty()) {
                    launchActivity3.o0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                String str8 = LaunchActivity.B1;
                launchActivity4.k0(password);
                break;
            case 14:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.c;
                if (!launchActivity5.Q && LaunchActivity.F1) {
                    ccVar.j();
                    break;
                }
                break;
            case 15:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity6.o0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity6.p0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity6.p0.getView().getVisibility() == 0) {
                        launchActivity6.p0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity6.q0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity6.q0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                u71 u71Var = (u71) this.c;
                String str9 = LaunchActivity.B1;
                launchActivity7.t0(u71Var);
                break;
            case 17:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                vf.b bVar = (vf.b) this.c;
                launchActivity8.O0 = null;
                launchActivity8.P0 = null;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.U0 = null;
                launchActivity8.S0 = null;
                if (bVar != null) {
                    bVar.b();
                    break;
                }
                break;
            case 18:
                vf.b bVar2 = (vf.b) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                String str10 = LaunchActivity.B1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (u1Var != null) {
                    u1Var.dismiss();
                    break;
                }
                break;
            case 19:
                p90 p90Var = (p90) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                p90Var.c();
                if (tLObject3 != null) {
                    p90Var.a.k0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 20:
                ((FiltersSetupActivity) this.c).d0(((p90) this.b).a.M());
                break;
            case 21:
                pa0 pa0Var = (pa0) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new rp(pa0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 22:
                pa0 pa0Var2 = (pa0) this.b;
                org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) this.c;
                pa0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                pa0Var2.m0(rdVar.f);
                pa0Var2.y = false;
                break;
            case 23:
                ((EditText) this.b).removeTextChangedListener((fi.h7) this.c);
                break;
            case 24:
                ob0 ob0Var = (ob0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                lb0 lb0Var = ob0Var.a;
                int i15 = 0;
                while (true) {
                    br[] brVarArr = lb0Var.f;
                    if (i15 >= brVarArr.length) {
                        runnable2.run();
                        lb0Var.e = false;
                        break;
                    } else {
                        brVarArr[i15].C(0.0f);
                        i15++;
                    }
                }
            case 25:
                xb0 xb0Var = (xb0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ce0 ce0Var = xb0Var.D;
                ce0Var.C1(false, false);
                org.telegram.messenger.g0.v1(xb0Var.a);
                ce0Var.G1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 26:
                xb0 xb0Var2 = (xb0) this.b;
                String str11 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xb0Var2.n.current_algo;
                boolean z9 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c10 = z9 ? org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                vb0 vb0Var = new vb0(xb0Var2, 2);
                if (z9) {
                    TL_account.Password password2 = xb0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(c10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        vb0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i7 = ((org.telegram.ui.ActionBar.f2) xb0Var2.D).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, vb0Var, 10);
                        break;
                    }
                }
                break;
            case 27:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                pc0Var.P.C1(false, false);
                org.telegram.messenger.g0.v1(pc0Var.P.fragmentView.findFocus());
                pc0Var.P.G1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = pc0Var.O;
                if (fileLocation != null) {
                    Utilities.f.c(new q10(28, pc0Var, fileLocation));
                    break;
                }
                break;
            case 28:
                pc0 pc0Var2 = (pc0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.f2) pc0Var2.P).currentAccount;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    s12.N2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    s12.getFileLoader().i0(false, 16777216, s12.N2, true);
                    break;
                }
                break;
            default:
                qc0 qc0Var = (qc0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ce0 ce0Var2 = qc0Var.G;
                ce0Var2.C1(false, true);
                if (tL_error3 == null) {
                    if (qc0Var.r != null && qc0Var.s != null && qc0Var.w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qc0Var.r);
                        bundle2.putString("phoneHash", qc0Var.s);
                        bundle2.putString("code", qc0Var.w);
                        ce0Var2.M1(5, true, bundle2, false);
                        break;
                    } else {
                        ce0Var2.M1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131746116, "ResetAccountCancelledAlert"));
                    break;
                } else {
                    ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error3.text);
                    break;
                }
        }
    }
}
