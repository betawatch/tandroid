package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i50(int i7, Object obj, Object obj2) {
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
        int i12 = 4;
        int i13 = 0;
        switch (this.a) {
            case 0:
                j50 j50Var = (j50) this.b;
                String str = (String) this.c;
                k50 k50Var = j50Var.a;
                k50Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k50Var.c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new d00(i11, j50Var, str), 66);
                break;
            case 1:
                j50 j50Var2 = (j50) this.b;
                TLObject tLObject = (TLObject) this.c;
                k50 k50Var2 = j50Var2.a;
                if (tLObject != null) {
                    n50.f0(k50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    n50.f0(k50Var2.h, null);
                    break;
                }
            case 2:
                m50 m50Var = (m50) this.b;
                String str2 = (String) this.c;
                m50Var.h = str2;
                n50 n50Var = m50Var.r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str2, str2, 14), 66);
                break;
            case 3:
                org.telegram.messenger.g0.h3(new u5(i13, (b60) this.b, (org.telegram.messenger.t2) this.c), 150L);
                break;
            case 4:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.f();
                break;
            case 5:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str3 = (String) this.c;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new i50(i12, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) languageSelectActivity2.h.get(i14);
                        if (cdVar.a.toLowerCase().startsWith(str3) || cdVar.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(cdVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i13 < size2) {
                        org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) languageSelectActivity2.f.get(i13);
                        if (cdVar2.a.toLowerCase().startsWith(str3) || cdVar2.b.toLowerCase().startsWith(str3)) {
                            arrayList.add(cdVar2);
                        }
                        i13++;
                    }
                    org.telegram.messenger.g0.g3(new i50(i12, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                String str4 = LaunchActivity.C1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.mp.u1(launchActivity.P).f4(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.mp.u1(launchActivity.P).Z3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.tr.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    bn bnVar = new bn(bundle);
                    bnVar.Fa = resolvedbusinesschatlinks;
                    launchActivity.u0(bnVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.b5.K(launchActivity, org.telegram.messenger.gd.N0(2131752704, null), org.telegram.messenger.gd.N0(2131752700, null)));
                    break;
                }
            case 7:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.mp.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 8:
                g gVar = (g) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str6 = LaunchActivity.C1;
                String N0 = org.telegram.messenger.gd.N0(2131753891, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(tL_error.text);
                org.telegram.ui.Components.b5.r0(gVar, N0, sb2.toString(), null);
                break;
            case 9:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str7 = (String) this.c;
                if (!launchActivity3.p0.getFragmentStack().isEmpty()) {
                    launchActivity3.p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                String str8 = LaunchActivity.C1;
                launchActivity4.k0(password);
                break;
            case 11:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.c;
                if (!launchActivity5.R && LaunchActivity.G1) {
                    fcVar.j();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity6.p0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity6.q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity6.q0.getView().getVisibility() == 0) {
                        launchActivity6.q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity6.r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity6.r0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                v71 v71Var = (v71) this.c;
                String str9 = LaunchActivity.C1;
                launchActivity7.t0(v71Var);
                break;
            case 14:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                vf.b bVar = (vf.b) this.c;
                launchActivity8.P0 = null;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.V0 = null;
                launchActivity8.T0 = null;
                if (bVar != null) {
                    bVar.b();
                    break;
                }
                break;
            case 15:
                vf.b bVar2 = (vf.b) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                String str10 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    break;
                }
                break;
            case 16:
                r90 r90Var = (r90) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                r90Var.c();
                if (tLObject3 != null) {
                    r90Var.a.k0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 17:
                ((FiltersSetupActivity) this.c).d0(((r90) this.b).a.M());
                break;
            case 18:
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
                    org.telegram.messenger.g0.g3(new up(pa0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 19:
                pa0 pa0Var2 = (pa0) this.b;
                org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) this.c;
                pa0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                pa0Var2.m0(pdVar.f);
                pa0Var2.y = false;
                break;
            case 20:
                ((EditText) this.b).removeTextChangedListener((bi.v) this.c);
                break;
            case 21:
                ob0 ob0Var = (ob0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                lb0 lb0Var = ob0Var.a;
                int i15 = 0;
                while (true) {
                    er[] erVarArr = lb0Var.f;
                    if (i15 >= erVarArr.length) {
                        runnable2.run();
                        lb0Var.e = false;
                        break;
                    } else {
                        erVarArr[i15].D(0.0f);
                        i15++;
                    }
                }
            case 22:
                wb0 wb0Var = (wb0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                de0 de0Var = wb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(wb0Var.a);
                de0Var.G1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 23:
                wb0 wb0Var2 = (wb0) this.b;
                String str11 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = wb0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c10 = z10 ? org.telegram.messenger.jv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                ub0 ub0Var = new ub0(wb0Var2, i11);
                if (z10) {
                    TL_account.Password password2 = wb0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.jv.d(c10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        ub0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i7 = ((org.telegram.ui.ActionBar.g2) wb0Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, ub0Var, 10);
                        break;
                    }
                }
                break;
            case 24:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                oc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(oc0Var.Q.fragmentView.findFocus());
                oc0Var.Q.G1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = oc0Var.P;
                if (fileLocation != null) {
                    Utilities.f.c(new i50(25, oc0Var, fileLocation));
                    break;
                }
                break;
            case 25:
                oc0 oc0Var2 = (oc0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.g2) oc0Var2.Q).currentAccount;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    u12.Q2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    u12.getFileLoader().h0(false, 16777216, u12.Q2, true);
                    break;
                }
                break;
            case 26:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                de0 de0Var2 = pc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error3 == null) {
                    if (pc0Var.r != null && pc0Var.s != null && pc0Var.w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", pc0Var.r);
                        bundle2.putString("phoneHash", pc0Var.s);
                        bundle2.putString("code", pc0Var.w);
                        de0Var2.M1(5, true, bundle2, false);
                        break;
                    } else {
                        de0Var2.M1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131745919, "ResetAccountCancelledAlert"));
                    break;
                } else {
                    de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error3.text);
                    break;
                }
                break;
            case 27:
                gd0 gd0Var = (gd0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131752567, null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.a0("CancelLinkSuccess", null, 2131752568, org.telegram.messenger.m10.h(new StringBuilder("+"), gd0Var.b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752029, null), null);
                alertDialog$Builder.a.setOnDismissListener(new ad0(gd0Var, i13));
                alertDialog$Builder.p();
                break;
            case 28:
                gd0 gd0Var2 = (gd0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                gd0Var2.getClass();
                gd0Var2.h0 = tL_error4.text;
                break;
            default:
                ((gd0) this.b).v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
        }
    }
}
