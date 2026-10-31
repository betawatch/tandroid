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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f70(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
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
                    org.telegram.messenger.i0.g3(new f70(i12, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) languageSelectActivity2.h.get(i13);
                        if (zcVar.a.toLowerCase().startsWith(str) || zcVar.b.toLowerCase().startsWith(str)) {
                            arrayList.add(zcVar);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) languageSelectActivity2.f.get(i14);
                        if (zcVar2.a.toLowerCase().startsWith(str) || zcVar2.b.toLowerCase().startsWith(str)) {
                            arrayList.add(zcVar2);
                        }
                    }
                    org.telegram.messenger.i0.g3(new f70(i12, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.vp.r1(launchActivity.O).V3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.vp.r1(launchActivity.O).P3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.hs.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    un unVar = new un(bundle);
                    unVar.Ba = resolvedbusinesschatlinks;
                    launchActivity.u0(unVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.cd.L0(2131752716, null), org.telegram.messenger.cd.L0(2131752712, null)));
                    break;
                }
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.vp.r1(launchActivity2.O).V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2 b10 = org.telegram.messenger.o2.b(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j10, j10, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 4:
                f fVar = (f) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.D1;
                String L0 = org.telegram.messenger.cd.L0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error.text);
                org.telegram.ui.Components.s4.t0(fVar, L0, sb2.toString(), null);
                break;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str2 = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.D1;
                launchActivity4.k0(password);
                break;
            case 7:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) this.c;
                if (!launchActivity5.Q && LaunchActivity.G1) {
                    wbVar.j();
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity6.q0.getView().setVisibility(4);
                if (org.telegram.messenger.i0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity6.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity6.r0.getView().getVisibility() == 0) {
                        launchActivity6.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity6.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity6.s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                m91 m91Var = (m91) this.c;
                Pattern pattern5 = LaunchActivity.D1;
                launchActivity7.t0(m91Var);
                break;
            case 10:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                gf.e eVar = (gf.e) this.c;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.T0 = null;
                launchActivity8.W0 = null;
                launchActivity8.U0 = null;
                if (eVar != null) {
                    eVar.b();
                    break;
                }
                break;
            case 11:
                gf.e eVar2 = (gf.e) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                Pattern pattern6 = LaunchActivity.D1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (x1Var != null) {
                    x1Var.dismiss();
                    break;
                }
                break;
            case 12:
                ua0 ua0Var = (ua0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ua0Var.c();
                if (tLObject2 != null) {
                    ua0Var.a.k0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 13:
                ((FiltersSetupActivity) this.c).c0(((ua0) this.b).a.M());
                break;
            case 14:
                yb0 yb0Var = (yb0) this.b;
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
                    org.telegram.messenger.i0.g3(new qq(yb0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 15:
                yb0 yb0Var2 = (yb0) this.b;
                org.telegram.messenger.md mdVar = (org.telegram.messenger.md) this.c;
                yb0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                yb0Var2.l0(mdVar.f);
                yb0Var2.E = false;
                break;
            case 16:
                ((EditText) this.b).removeTextChangedListener((ag.u2) this.c);
                break;
            case 17:
                wc0 wc0Var = (wc0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                uc0 uc0Var = wc0Var.a;
                int i15 = 0;
                while (true) {
                    bs[] bsVarArr = uc0Var.f;
                    if (i15 >= bsVarArr.length) {
                        runnable2.run();
                        uc0Var.e = false;
                        break;
                    } else {
                        bsVarArr[i15].C(0.0f);
                        i15++;
                    }
                }
            case 18:
                ed0 ed0Var = (ed0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hf0 hf0Var = ed0Var.D;
                hf0Var.s1(false, false);
                org.telegram.messenger.i0.v1(ed0Var.a);
                hf0Var.w1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 19:
                ed0 ed0Var2 = (ed0) this.b;
                String str3 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ed0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c10 = z10 ? org.telegram.messenger.aw.c(org.telegram.messenger.i0.h1(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                cd0 cd0Var = new cd0(ed0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = ed0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(c10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        cd0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d;
                        i10 = ((org.telegram.ui.ActionBar.k2) ed0Var2.D).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, cd0Var, 10);
                        break;
                    }
                }
                break;
            case 20:
                wd0 wd0Var = (wd0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                wd0Var.O.s1(false, false);
                org.telegram.messenger.i0.v1(wd0Var.O.fragmentView.findFocus());
                wd0Var.O.w1((TLRPC.TL_auth_authorization) tLObject4, true);
                TLRPC.FileLocation fileLocation = wd0Var.N;
                if (fileLocation != null) {
                    Utilities.f.c(new f70(21, wd0Var, fileLocation));
                    break;
                }
                break;
            case 21:
                wd0 wd0Var2 = (wd0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.k2) wd0Var2.O).currentAccount;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.b8.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    r12.N2 = a1.g.p(sb3, fileLocation2.local_id, ".jpg");
                    r12.getFileLoader().i0(false, 16777216, r12.N2, true);
                    break;
                }
                break;
            case 22:
                xd0 xd0Var = (xd0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                hf0 hf0Var2 = xd0Var.G;
                hf0Var2.s1(false, true);
                if (tL_error3 == null) {
                    if (xd0Var.r != null && xd0Var.s != null && xd0Var.w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", xd0Var.r);
                        bundle2.putString("phoneHash", xd0Var.s);
                        bundle2.putString("code", xd0Var.w);
                        hf0Var2.C1(5, true, bundle2, false);
                        break;
                    } else {
                        hf0Var2.C1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131746132, "ResetAccountCancelledAlert"));
                    break;
                } else {
                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error3.text);
                    break;
                }
                break;
            case 23:
                me0 me0Var = (me0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131752579, null);
                alertDialog$Builder.a.T = org.telegram.messenger.cd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.m5.h(new StringBuilder("+"), me0Var.b, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
                alertDialog$Builder.a.setOnDismissListener(new ie0(me0Var, i12));
                alertDialog$Builder.p();
                break;
            case 24:
                me0 me0Var2 = (me0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                me0Var2.getClass();
                me0Var2.g0 = tL_error4.text;
                break;
            case 25:
                ((me0) this.b).u0.w1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 26:
                me0 me0Var3 = (me0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                zr zrVar = me0Var3.f;
                int i16 = 0;
                while (true) {
                    bs[] bsVarArr2 = zrVar.f;
                    if (i16 >= bsVarArr2.length) {
                        runnable3.run();
                        zrVar.e = false;
                        break;
                    } else {
                        bsVarArr2[i16].C(0.0f);
                        i16++;
                    }
                }
            case 27:
                ((s3) this.b).a((String) this.c);
                break;
            case 28:
                gf0 gf0Var = (gf0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                hf0 hf0Var3 = gf0Var.a0;
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                if (!d12.getBoolean("firstloginshow", true) && !hf0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    hf0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    break;
                } else {
                    d12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hf0Var3.getParentActivity());
                    int i17 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.t6.x0(null, i17, false), null);
                    alertDialog$Builder2.n(i17, null);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
                    String L02 = org.telegram.messenger.cd.L0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                    x1Var2.T = L02;
                    hf0Var3.n = hf0Var3.showDialog(x1Var2, true, null);
                    hf0Var3.c0 = true;
                    break;
                }
                break;
            default:
                jf0.Y((jf0) this.b, (org.telegram.ui.ActionBar.x1) this.c);
                break;
        }
    }
}
