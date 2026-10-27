package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb0(int i10, Object obj, Object obj2) {
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
                ((FiltersSetupActivity) this.c).Z(((ob0) this.b).a.O());
                break;
            case 1:
                rc0 rc0Var = (rc0) this.b;
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
                    AndroidUtilities.runOnUIThread(new pq(rc0Var, createBitmap2, gLSurfaceView, 23));
                    break;
                }
                break;
            case 2:
                rc0 rc0Var2 = (rc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                rc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                rc0Var2.f0(sharingLocationInfo.proximityMeters);
                rc0Var2.G = false;
                break;
            case 3:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.bo) this.c);
                break;
            case 4:
                qd0 qd0Var = (qd0) this.b;
                Runnable runnable = (Runnable) this.c;
                nd0 nd0Var = qd0Var.a;
                int i13 = 0;
                while (true) {
                    zr[] zrVarArr = nd0Var.f;
                    if (i13 >= zrVarArr.length) {
                        runnable.run();
                        nd0Var.e = false;
                        break;
                    } else {
                        zrVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 5:
                ae0 ae0Var = (ae0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ig0 ig0Var = ae0Var.y;
                ig0Var.p1(false, false);
                AndroidUtilities.hideKeyboard(ae0Var.a);
                ig0Var.t1((TLRPC.TL_auth_authorization) tLObject, false);
                break;
            case 6:
                ae0 ae0Var2 = (ae0) this.b;
                String str = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ae0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x9 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                xd0 xd0Var = new xd0(ae0Var2, 2);
                if (z10) {
                    TL_account.Password password = ae0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x9, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.r2) ae0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, xd0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        xd0Var.run(null, tL_error);
                        break;
                    }
                }
                break;
            case 7:
                te0 te0Var = (te0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                te0Var.O.p1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.O.fragmentView.findFocus());
                te0Var.O.t1((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = te0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new kb0(8, te0Var, fileLocation));
                    break;
                }
                break;
            case 8:
                te0 te0Var2 = (te0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.r2) te0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 9:
                ue0 ue0Var = (ue0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ig0 ig0Var2 = ue0Var.G;
                ig0Var2.p1(false, true);
                if (tL_error2 != null) {
                    if (!tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                        break;
                    } else {
                        ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (ue0Var.r != null && ue0Var.s != null && ue0Var.v != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", ue0Var.r);
                    bundle.putString("phoneHash", ue0Var.s);
                    bundle.putString("code", ue0Var.v);
                    ig0Var2.z1(5, true, bundle, false);
                    break;
                } else {
                    ig0Var2.z1(0, true, null, true);
                    break;
                }
                break;
            case 10:
                lf0 lf0Var = (lf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.wh.g(new StringBuilder("+"), lf0Var.b, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new hf0(lf0Var, i12));
                alertDialog$Builder.p();
                break;
            case 11:
                lf0 lf0Var2 = (lf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                lf0Var2.getClass();
                lf0Var2.g0 = tL_error3.text;
                break;
            case 12:
                ((lf0) this.b).u0.t1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 13:
                lf0 lf0Var3 = (lf0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                xr xrVar = lf0Var3.f;
                int i14 = 0;
                while (true) {
                    zr[] zrVarArr2 = xrVar.f;
                    if (i14 >= zrVarArr2.length) {
                        runnable2.run();
                        xrVar.e = false;
                        break;
                    } else {
                        zrVarArr2[i14].l(0.0f);
                        i14++;
                    }
                }
            case 14:
                ((t3) this.b).run((String) this.c);
                break;
            case 15:
                hg0 hg0Var = (hg0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ig0 ig0Var3 = hg0Var.a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ig0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ig0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var3.getParentActivity());
                    int i15 = R.raw.incoming_calls;
                    int i16 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder2.m(i15, 46, org.telegram.ui.ActionBar.y6.x0(null, i16, false), null);
                    alertDialog$Builder2.n(i16, null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.a;
                    e2Var.T = string;
                    ig0Var3.n = ig0Var3.showDialog(e2Var, true, null);
                    ig0Var3.c0 = true;
                    break;
                }
                break;
            case 16:
                lg0.V((lg0) this.b, (org.telegram.ui.ActionBar.e2) this.c);
                break;
            case 17:
                lh0 lh0Var = (lh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                lh0Var.c0 = false;
                if (tL_error4 == null) {
                    ch0 h02 = lh0Var.h0();
                    lh0Var.j0.clear();
                    lh0Var.j0(h02);
                    break;
                }
                break;
            case 18:
                bh0 bh0Var = (bh0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                lh0 lh0Var2 = bh0Var.a;
                ch0 h03 = lh0Var2.h0();
                lh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = lh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    lh0Var2.getMessagesStorage().saveChatLinksCount(lh0Var2.n, lh0Var2.d.invitesCount);
                }
                lh0Var2.j0(h03);
                break;
            case 19:
                xi0 xi0Var = (xi0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (xi0Var.getParentActivity() != null) {
                    Toast.makeText(xi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 20:
                qj0 qj0Var = (qj0) this.b;
                String str2 = (String) this.c;
                qj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                qj0Var.getContext().startActivity(intent);
                break;
            case 21:
                qj0 qj0Var2 = (qj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qj0Var2.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(user.id));
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.oy) this.b).run((TLRPC.User) this.c);
                break;
            case 23:
                zj0 zj0Var = (zj0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList2 = zj0Var.c;
                xj0[] xj0VarArr = zj0Var.b;
                HashSet hashSet = zj0Var.e;
                HashSet hashSet2 = zj0Var.d;
                if (!zj0Var.h) {
                    zj0Var.n = false;
                    if (!(tLObject4 instanceof TL_feed.TL_interestCategories)) {
                        zj0Var.r = true;
                        zj0.o0(xj0VarArr[0]);
                        break;
                    } else {
                        TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject4;
                        arrayList2.clear();
                        arrayList2.addAll(tL_interestCategories.categories);
                        if (!zj0Var.f && hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(tL_interestCategories.selected);
                            hashSet.clear();
                            hashSet.addAll(tL_interestCategories.selected);
                        }
                        zj0Var.p0(false);
                        zj0.o0(xj0VarArr[0]);
                        break;
                    }
                }
                break;
            case 24:
                zj0.W((zj0) this.b, (ImageView) this.c);
                break;
            case 25:
                NotificationsCustomSettingsActivity.X((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 26:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k3VarArr[0] = null;
                fl0.a = null;
                zArr[0] = true;
                break;
            case 27:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable3 = (Runnable) this.c;
                zr[] zrVarArr3 = passcodeActivity.n.f;
                int length = zrVarArr3.length;
                while (i12 < length) {
                    zrVarArr3[i12].l(0.0f);
                    i12++;
                }
                runnable3.run();
                break;
            case 28:
                ml0 ml0Var = (ml0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = ml0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.u0();
                if (passcodeActivity2.o0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            default:
                ((PasskeysActivity) this.b).Z((TL_account.Passkey) this.c);
                break;
        }
    }
}
