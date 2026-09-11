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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.ui.Components.rv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.sg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.wk0, hg.a2, org.telegram.ui.Components.bl0, r0.n, org.telegram.ui.Components.al0, au, le.d, vj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        gh0 gh0Var = (gh0) this.b;
        gh0Var.getClass();
        gh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        gh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        switch (this.a) {
        }
        return null;
    }

    @Override // hg.a2
    public /* synthetic */ boolean Q(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        wa0 wa0Var = (wa0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!wa0Var.a.equals(defaultWindowInsets)) {
            wa0Var.a = defaultWindowInsets;
            wa0Var.requestLayout();
        }
        int childCount = wa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(wa0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override // hg.a2
    public /* synthetic */ void Y(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final lj0 lj0Var = (lj0) this.b;
                if (i10 >= lj0Var.I && i10 < lj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) lj0Var.x.get(i10 - lj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lj0Var.getParentActivity(), 0, lj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.gj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = lj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : co.R9(j3));
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
                                n2Var.presentFragment(new co(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.P = charSequenceArr;
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    lj0Var.showDialog(b2Var);
                    break;
                }
                break;
            default:
                bl0 bl0Var = (bl0) this.b;
                bl0Var.getClass();
                if (view instanceof al0) {
                    al0 al0Var = (al0) view;
                    bl0Var.Z(al0Var.e);
                    al0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.au
    public void a1(vt vtVar) {
        vg0 vg0Var = (vg0) this.b;
        vg0Var.I = true;
        String str = vtVar.c;
        vg0Var.a.setText(str);
        vg0Var.v(str, vtVar);
        vg0Var.y = vtVar;
        vg0Var.x = 0;
        vg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + vtVar.c, vtVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(vg0Var, 4), 300L);
        sg0 sg0Var = vg0Var.b;
        sg0Var.requestFocus();
        sg0Var.setSelection(sg0Var.length());
    }

    @Override // org.telegram.ui.vj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                nc0 nc0Var = (nc0) this.b;
                ArrayList arrayList = nc0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    hc0 hc0Var = (hc0) arrayList.get(i10);
                    int i11 = hc0Var.a;
                    int i12 = hc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && hc0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (hc0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (U = nc0Var.U(i12)) != -1) {
                            nc0Var.n[U] = !r8[U];
                            nc0Var.Y();
                            nc0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            nc0Var.Y();
                            break;
                        }
                    } else {
                        nc0Var.e = org.telegram.ui.Components.yc.a0(nc0Var).L(new org.telegram.ui.Components.z9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                yg0.U((yg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // hg.a2
    public void f(int i10) {
        switch (this.a) {
            case 11:
                d70 d70Var = (d70) this.b;
                f70 f70Var = d70Var.I;
                f70Var.q0(d70Var.H);
                if (d70Var.h == null && !d70Var.f.e() && d70Var.h() == 0) {
                    f70Var.s.e(false, true);
                }
                d70Var.l();
                break;
            default:
                tk0 tk0Var = (tk0) this.b;
                if (tk0Var.f == null && !tk0Var.h.e()) {
                    tk0Var.n.c.c();
                }
                tk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.g0) obj).run();
                break;
            case 12:
                ((n70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                ge0 ge0Var = (ge0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ge0Var.I);
                bundle.putString("ephone", ge0Var.J);
                bundle.putString("phoneFormated", ge0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ge0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ge0Var.M;
                ge0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new xd0(ge0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                pe0 pe0Var = (pe0) obj;
                wg0.n0(pe0Var.y, pe0Var.s, pe0Var.v, pe0Var.w);
                break;
            case 19:
                if0 if0Var = (if0) obj;
                wg0 wg0Var = if0Var.E;
                wg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(if0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.rj) obj).run();
                break;
            case 28:
                bl0 bl0Var = ((xk0) obj).b;
                SparseArray sparseArray = bl0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    zk0 zk0Var = (zk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = zk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = bl0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = zk0Var.e;
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
                    if (zk0Var.g != null && (dVar = bl0Var.getMediaDataController().ringtoneUploaderHashMap.get(zk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (zk0Var == bl0Var.H) {
                        bl0Var.N = null;
                        bl0Var.H = (zk0) bl0Var.b.get(0);
                        bl0Var.I = true;
                    }
                    bl0Var.a.remove(zk0Var);
                    bl0Var.c.remove(zk0Var);
                }
                bl0Var.getMediaDataController().ringtoneDataStore.h();
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
                    bl0Var.getConnectionsManager().sendRequest(saveringtone, new bi.c7(8));
                }
                bl0.W(bl0Var);
                bl0Var.c0();
                bl0Var.f.l();
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
                        if (childAt instanceof org.telegram.ui.Cells.ea) {
                            ((org.telegram.ui.Cells.ea) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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

    @Override // org.telegram.ui.Components.rv0
    public void i(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ju) this.b).d;
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
            org.telegram.ui.Components.ll0 ll0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 K = ll0Var.K(i15 + i19);
            if (K != null) {
                ju juVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                juVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.rd0
    public void j(org.telegram.ui.Components.sd0 sd0Var) {
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
    public void n(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.x.isShowing()) {
            a00Var.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                mz mzVar = (mz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.h51) obj).d == 1 && mzVar.b != null) {
                    boolean z10 = !mzVar.c;
                    mzVar.c = z10;
                    bi.f0 f0Var = mzVar.f;
                    if (f0Var != null) {
                        f0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
                    }
                    ((org.telegram.ui.Cells.w8) view).setChecked(mzVar.c);
                    mzVar.e.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ll0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ll0) this.b).p2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.f0) this.b).run();
        return true;
    }

    private final /* synthetic */ void h(ArrayList arrayList) {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rv0
    public /* synthetic */ void l() {
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
