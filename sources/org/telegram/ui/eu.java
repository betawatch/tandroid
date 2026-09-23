package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements org.telegram.ui.Components.sv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.tg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.xk0, gg.b2, org.telegram.ui.Components.cl0, r0.n, org.telegram.ui.Components.bl0, wt, le.e, nj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        bh0 bh0Var = (bh0) this.b;
        bh0Var.getClass();
        bh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        bh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        switch (this.a) {
        }
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ra0 ra0Var = (ra0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ra0Var.a.equals(defaultWindowInsets)) {
            ra0Var.a = defaultWindowInsets;
            ra0Var.requestLayout();
        }
        int childCount = ra0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ra0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override // org.telegram.ui.nj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.wt
    public void a1(st stVar) {
        qg0 qg0Var = (qg0) this.b;
        qg0Var.I = true;
        String str = stVar.c;
        qg0Var.a.setText(str);
        qg0Var.v(str, stVar);
        qg0Var.y = stVar;
        qg0Var.x = 0;
        qg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + stVar.c, stVar.d).apply();
        AndroidUtilities.runOnUIThread(new gg0(qg0Var, 4), 300L);
        ng0 ng0Var = qg0Var.b;
        ng0Var.requestFocus();
        ng0Var.setSelection(ng0Var.length());
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                ic0 ic0Var = (ic0) this.b;
                ArrayList arrayList = ic0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    cc0 cc0Var = (cc0) arrayList.get(i10);
                    int i11 = cc0Var.a;
                    int i12 = cc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && cc0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (cc0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (U = ic0Var.U(i12)) != -1) {
                            ic0Var.n[U] = !r8[U];
                            ic0Var.Y();
                            ic0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            ic0Var.Y();
                            break;
                        }
                    } else {
                        ic0Var.e = org.telegram.ui.Components.xc.a0(ic0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                tg0.U((tg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final ej0 ej0Var = (ej0) this.b;
                if (i10 >= ej0Var.I && i10 < ej0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ej0Var.x.get(i10 - ej0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ej0Var.getParentActivity(), 0, ej0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        arrayList.add(LocaleController.getString(isUserDialog ? R.string.OpenProfile : R.string.OpenChannel2));
                        arrayList3.add(Integer.valueOf(isUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.zi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = ej0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : xn.R9(j3));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                                n2Var.presentFragment(new xn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.P = charSequenceArr;
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    ej0Var.showDialog(b2Var);
                    break;
                }
                break;
            default:
                sk0 sk0Var = (sk0) this.b;
                sk0Var.getClass();
                if (view instanceof rk0) {
                    rk0 rk0Var = (rk0) view;
                    sk0Var.Z(rk0Var.e);
                    rk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                break;
            case 12:
                ((k70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                be0 be0Var = (be0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", be0Var.I);
                bundle.putString("ephone", be0Var.J);
                bundle.putString("phoneFormated", be0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = be0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = be0Var.M;
                be0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sd0(be0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                ke0 ke0Var = (ke0) obj;
                rg0.n0(ke0Var.y, ke0Var.s, ke0Var.v, ke0Var.w);
                break;
            case 19:
                df0 df0Var = (df0) obj;
                rg0 rg0Var = df0Var.E;
                rg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(df0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.rj) obj).run();
                break;
            case 28:
                sk0 sk0Var = ((ok0) obj).b;
                SparseArray sparseArray = sk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    qk0 qk0Var = (qk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = qk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = sk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = qk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((uf.b) arrayList2.get(i15)).a == null || ((uf.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (qk0Var.g != null && (dVar = sk0Var.getMediaDataController().ringtoneUploaderHashMap.get(qk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (qk0Var == sk0Var.H) {
                        sk0Var.N = null;
                        sk0Var.H = (qk0) sk0Var.b.get(0);
                        sk0Var.I = true;
                    }
                    sk0Var.a.remove(qk0Var);
                    sk0Var.c.remove(qk0Var);
                }
                sk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.id = tL_inputDocument;
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    sk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.u7(8));
                }
                sk0.W(sk0Var);
                sk0Var.c0();
                sk0Var.f.l();
                b2Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.c.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i18);
                        if (childAt instanceof org.telegram.ui.Cells.fa) {
                            ((org.telegram.ui.Cells.fa) childAt).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E6, false));
                        } else {
                            i18++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((fu) this.b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.c.get(i10);
        if (preset == dataAutoDownloadActivity.y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i18 = dataAutoDownloadActivity.f;
        if (i18 == 0) {
            i17 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.ml0 ml0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 K = ml0Var.K(i15 + i19);
            if (K != null) {
                fu fuVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                fuVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // gg.b2
    public void h(int i10) {
        switch (this.a) {
            case 11:
                z60 z60Var = (z60) this.b;
                b70 b70Var = z60Var.I;
                b70Var.q0(z60Var.H);
                if (z60Var.h == null && !z60Var.f.e() && z60Var.h() == 0) {
                    b70Var.s.e(false, true);
                }
                z60Var.l();
                break;
            default:
                kk0 kk0Var = (kk0) this.b;
                if (kk0Var.f == null && !kk0Var.h.e()) {
                    kk0Var.n.c.c();
                }
                kk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rd0
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        xz xzVar = (xz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xzVar.x.isShowing()) {
            xzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.xk0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                jz jzVar = (jz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.h51) obj).d == 1 && jzVar.b != null) {
                    boolean z10 = !jzVar.c;
                    jzVar.c = z10;
                    ai.m0 m0Var = jzVar.f;
                    if (m0Var != null) {
                        m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(jzVar.d));
                    }
                    ((org.telegram.ui.Cells.x8) view).setChecked(jzVar.c);
                    jzVar.e.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ml0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ml0) this.b).p2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.b).run();
        return true;
    }

    private final /* synthetic */ void j(ArrayList arrayList) {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
