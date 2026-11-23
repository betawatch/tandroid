package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import com.google.android.gms.tasks.CancellationTokenSource;
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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h60(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11 = 4;
        int i12 = 0;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.f();
                break;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str = (String) this.c;
                if (str.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new h60(i12, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) languageSelectActivity2.h.get(i13);
                        if (ddVar.a.toLowerCase().startsWith(str) || ddVar.b.toLowerCase().startsWith(str)) {
                            arrayList.add(ddVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) languageSelectActivity2.f.get(i14);
                        if (ddVar2.a.toLowerCase().startsWith(str) || ddVar2.b.toLowerCase().startsWith(str)) {
                            arrayList.add(ddVar2);
                        }
                    }
                    org.telegram.messenger.g0.g3(new h60(i12, languageSelectActivity2, arrayList));
                    break;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                String str2 = LaunchActivity.C1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.np.u1(launchActivity.P).f4(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.np.u1(launchActivity.P).Z3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.ur.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
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
                    launchActivity.F0(org.telegram.ui.Components.c5.K(launchActivity, org.telegram.messenger.hd.N0(2131752704, null), org.telegram.messenger.hd.N0(2131752700, null)));
                    break;
                }
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.np.u1(launchActivity2.P).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2 b10 = org.telegram.messenger.l2.b(launchActivity2.P);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 4:
                g gVar = (g) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str4 = LaunchActivity.C1;
                String N0 = org.telegram.messenger.hd.N0(2131753891, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                sb2.append(tL_error.text);
                org.telegram.ui.Components.c5.r0(gVar, N0, sb2.toString(), null);
                break;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str5 = (String) this.c;
                if (!launchActivity3.p0.getFragmentStack().isEmpty()) {
                    launchActivity3.p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str5).getQueryParameter("ref")));
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                String str6 = LaunchActivity.C1;
                launchActivity4.k0(password);
                break;
            case 7:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.c;
                if (!launchActivity5.R && LaunchActivity.G1) {
                    gcVar.j();
                    break;
                }
                break;
            case 8:
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
            case 9:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                x71 x71Var = (x71) this.c;
                String str7 = LaunchActivity.C1;
                launchActivity7.t0(x71Var);
                break;
            case 10:
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
            case 11:
                vf.b bVar2 = (vf.b) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                String str8 = LaunchActivity.C1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (t1Var != null) {
                    t1Var.dismiss();
                    break;
                }
                break;
            case 12:
                s90 s90Var = (s90) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                s90Var.c();
                if (tLObject2 != null) {
                    s90Var.a.k0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 13:
                ((FiltersSetupActivity) this.c).d0(((s90) this.b).a.M());
                break;
            case 14:
                qa0 qa0Var = (qa0) this.b;
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
                    org.telegram.messenger.g0.g3(new up(qa0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 15:
                qa0 qa0Var2 = (qa0) this.b;
                org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) this.c;
                qa0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                qa0Var2.m0(qdVar.f);
                qa0Var2.y = false;
                break;
            case 16:
                ((EditText) this.b).removeTextChangedListener((bi.v) this.c);
                break;
            case 17:
                pb0 pb0Var = (pb0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                mb0 mb0Var = pb0Var.a;
                int i15 = 0;
                while (true) {
                    er[] erVarArr = mb0Var.f;
                    if (i15 >= erVarArr.length) {
                        runnable2.run();
                        mb0Var.e = false;
                        break;
                    } else {
                        erVarArr[i15].D(0.0f);
                        i15++;
                    }
                }
            case 18:
                xb0 xb0Var = (xb0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                de0 de0Var = xb0Var.E;
                de0Var.C1(false, false);
                org.telegram.messenger.g0.v1(xb0Var.a);
                de0Var.G1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 19:
                xb0 xb0Var2 = (xb0) this.b;
                String str9 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xb0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c10 = z10 ? org.telegram.messenger.kv.c(org.telegram.messenger.g0.h1(str9), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                vb0 vb0Var = new vb0(xb0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = xb0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.kv.d(c10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        vb0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i7 = ((org.telegram.ui.ActionBar.g2) xb0Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, vb0Var, 10);
                        break;
                    }
                }
                break;
            case 20:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                pc0Var.Q.C1(false, false);
                org.telegram.messenger.g0.v1(pc0Var.Q.fragmentView.findFocus());
                pc0Var.Q.G1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = pc0Var.P;
                if (fileLocation != null) {
                    Utilities.f.c(new h60(21, pc0Var, fileLocation));
                    break;
                }
                break;
            case 21:
                pc0 pc0Var2 = (pc0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i10 = ((org.telegram.ui.ActionBar.g2) pc0Var2.Q).currentAccount;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
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
            case 22:
                qc0 qc0Var = (qc0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                de0 de0Var2 = qc0Var.H;
                de0Var2.C1(false, true);
                if (tL_error3 == null) {
                    if (qc0Var.r != null && qc0Var.s != null && qc0Var.w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qc0Var.r);
                        bundle2.putString("phoneHash", qc0Var.s);
                        bundle2.putString("code", qc0Var.w);
                        de0Var2.M1(5, true, bundle2, false);
                        break;
                    } else {
                        de0Var2.M1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131745919, "ResetAccountCancelledAlert"));
                    break;
                } else {
                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error3.text);
                    break;
                }
            case 23:
                gd0 gd0Var = (gd0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.N0(2131752567, null);
                alertDialog$Builder.a.U = org.telegram.messenger.hd.a0("CancelLinkSuccess", null, 2131752568, org.telegram.messenger.o10.h(new StringBuilder("+"), gd0Var.b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752029, null), null);
                alertDialog$Builder.a.setOnDismissListener(new bd0(gd0Var, i12));
                alertDialog$Builder.p();
                break;
            case 24:
                gd0 gd0Var2 = (gd0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                gd0Var2.getClass();
                gd0Var2.h0 = tL_error4.text;
                break;
            case 25:
                ((gd0) this.b).v0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 26:
                gd0 gd0Var3 = (gd0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                br brVar = gd0Var3.f;
                int i16 = 0;
                while (true) {
                    er[] erVarArr2 = brVar.f;
                    if (i16 >= erVarArr2.length) {
                        runnable3.run();
                        brVar.e = false;
                        break;
                    } else {
                        erVarArr2[i16].D(0.0f);
                        i16++;
                    }
                }
            case 27:
                ((r3) this.b).a((String) this.c);
                break;
            case 28:
                ce0 ce0Var = (ce0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                de0 de0Var3 = ce0Var.h0;
                SharedPreferences g12 = org.telegram.messenger.np.g1();
                if (!g12.getBoolean("firstloginshow", true) && !de0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    de0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    break;
                } else {
                    g12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var3.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.m6.x0(null, i17, false), null);
                    alertDialog$Builder2.n(i17, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131751759, "Continue"), null);
                    String N02 = org.telegram.messenger.hd.N0(2131754275, "AllowFillNumber");
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    t1Var2.U = N02;
                    de0Var3.n = de0Var3.showDialog(t1Var2, true, null);
                    de0Var3.d0 = true;
                    break;
                }
                break;
            default:
                ce0 ce0Var2 = (ce0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (ce0Var2.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, ce0Var2.getContext(), null);
                    t1Var3.setOnCancelListener(new wf(cancellationTokenSource, i11));
                    t1Var3.show();
                    ce0Var2.c0 = t1Var3;
                    break;
                }
                break;
        }
    }
}
