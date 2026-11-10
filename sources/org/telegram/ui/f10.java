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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f10(int i7, Object obj, Object obj2) {
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
        int i11 = 2;
        int i12 = 0;
        switch (this.a) {
            case 0:
                f40 f40Var = (f40) this.b;
                org.telegram.messenger.qs.f(f40Var.n1.a).k(75, 6, ((TLRPC.TL_error) this.c).text);
                f40Var.dismiss();
                break;
            case 1:
                m4 m4Var = (m4) this.b;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.k2) this.c).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new f10(i11, m4Var, a8.ba.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                ((f40) ((m4) this.b).b).O2.setNewColors((int[]) this.c);
                break;
            case 3:
                p50.a0((p50) this.b, (TLRPC.TL_error) this.c);
                break;
            case 4:
                l50 l50Var = (l50) this.b;
                String str = (String) this.c;
                m50 m50Var = l50Var.a;
                m50Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                m50Var.c = m50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new k50(i12, l50Var, str), 66);
                break;
            case 5:
                l50 l50Var2 = (l50) this.b;
                TLObject tLObject = (TLObject) this.c;
                m50 m50Var2 = l50Var2.a;
                if (tLObject != null) {
                    p50.f0(m50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    p50.f0(m50Var2.h, null);
                    break;
                }
            case 6:
                o50 o50Var = (o50) this.b;
                String str2 = (String) this.c;
                o50Var.h = str2;
                p50 p50Var = o50Var.r;
                if (p50Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                o50Var.n = p50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(o50Var, str2, str2, 14), 66);
                break;
            case 7:
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.c(12, (d60) this.b, (org.telegram.messenger.s2) this.c), 150L);
                break;
            case 8:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.f();
                break;
            case 9:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str3 = (String) this.c;
                int i13 = 8;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new f10(i13, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) languageSelectActivity2.h.get(i14);
                        if (fdVar.a.toLowerCase().startsWith(str3) || fdVar.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(fdVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) languageSelectActivity2.f.get(i12);
                        if (fdVar2.a.toLowerCase().startsWith(str3) || fdVar2.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(fdVar2);
                        }
                        i12++;
                    }
                    org.telegram.messenger.g0.h3(new f10(i13, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 10:
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
                    cn cnVar = new cn(bundle);
                    cnVar.Da = resolvedbusinesschatlinks;
                    launchActivity.u0(cnVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.u4.K(launchActivity, org.telegram.messenger.id.M0(2131752716, null), org.telegram.messenger.id.M0(2131752712, null)));
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity2.O).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 12:
                g gVar = (g) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str6 = LaunchActivity.B1;
                String M0 = org.telegram.messenger.id.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                sb2.append(tL_error.text);
                org.telegram.ui.Components.u4.r0(gVar, M0, sb2.toString(), null);
                break;
            case 13:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str7 = (String) this.c;
                if (!launchActivity3.o0.getFragmentStack().isEmpty()) {
                    launchActivity3.o0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    break;
                }
                break;
            case 14:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                String str8 = LaunchActivity.B1;
                launchActivity4.k0(password);
                break;
            case 15:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.bc bcVar = (org.telegram.ui.Components.bc) this.c;
                if (!launchActivity5.Q && LaunchActivity.F1) {
                    bcVar.j();
                    break;
                }
                break;
            case 16:
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
            case 17:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                x71 x71Var = (x71) this.c;
                String str9 = LaunchActivity.B1;
                launchActivity7.t0(x71Var);
                break;
            case 18:
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
            case 19:
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
            case 20:
                s90 s90Var = (s90) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                s90Var.c();
                if (tLObject3 != null) {
                    s90Var.a.k0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 21:
                ((FiltersSetupActivity) this.c).d0(((s90) this.b).a.M());
                break;
            case 22:
                sa0 sa0Var = (sa0) this.b;
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
                    org.telegram.messenger.g0.h3(new tp(sa0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 23:
                sa0 sa0Var2 = (sa0) this.b;
                org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) this.c;
                sa0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                sa0Var2.m0(rdVar.f);
                sa0Var2.y = false;
                break;
            case 24:
                ((EditText) this.b).removeTextChangedListener((fi.h7) this.c);
                break;
            case 25:
                rb0 rb0Var = (rb0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ob0 ob0Var = rb0Var.a;
                int i15 = 0;
                while (true) {
                    er[] erVarArr = ob0Var.f;
                    if (i15 >= erVarArr.length) {
                        runnable2.run();
                        ob0Var.e = false;
                        break;
                    } else {
                        erVarArr[i15].C(0.0f);
                        i15++;
                    }
                }
            case 26:
                ac0 ac0Var = (ac0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                fe0 fe0Var = ac0Var.D;
                fe0Var.C1(false, false);
                org.telegram.messenger.g0.v1(ac0Var.a);
                fe0Var.G1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 27:
                ac0 ac0Var2 = (ac0) this.b;
                String str11 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ac0Var2.n.current_algo;
                boolean z9 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c10 = z9 ? org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                yb0 yb0Var = new yb0(ac0Var2, i11);
                if (z9) {
                    TL_account.Password password2 = ac0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(c10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        yb0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i7 = ((org.telegram.ui.ActionBar.f2) ac0Var2.D).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, yb0Var, 10);
                        break;
                    }
                }
                break;
            case 28:
                sc0 sc0Var = (sc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                sc0Var.P.C1(false, false);
                org.telegram.messenger.g0.v1(sc0Var.P.fragmentView.findFocus());
                sc0Var.P.G1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = sc0Var.O;
                if (fileLocation != null) {
                    Utilities.f.c(new f10(29, sc0Var, fileLocation));
                    break;
                }
                break;
            default:
                sc0 sc0Var2 = (sc0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.f2) sc0Var2.P).currentAccount;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    s12.N2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    s12.getFileLoader().h0(false, 16777216, s12.N2, true);
                    break;
                }
                break;
        }
    }
}
