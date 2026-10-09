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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.vw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.vh0, Utilities.Callback5, org.telegram.ui.Components.se0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.bm0, gg.a2, org.telegram.ui.Components.gm0, r0.n, org.telegram.ui.Components.fm0, yt, me.d, uj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ua0 ua0Var = (ua0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ua0Var.a.equals(defaultWindowInsets)) {
            ua0Var.a = defaultWindowInsets;
            ua0Var.requestLayout();
        }
        int childCount = ua0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ua0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override // org.telegram.ui.yt
    public void U0(ut utVar) {
        vg0 vg0Var = (vg0) this.b;
        vg0Var.I = true;
        String str = utVar.c;
        vg0Var.a.setText(str);
        vg0Var.t(str, utVar);
        vg0Var.y = utVar;
        vg0Var.x = 0;
        vg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + utVar.c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(vg0Var, 4), 300L);
        sg0 sg0Var = vg0Var.b;
        sg0Var.requestFocus();
        sg0Var.setSelection(sg0Var.length());
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.uj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        int U;
        mc0 mc0Var = (mc0) this.b;
        ArrayList arrayList = mc0Var.s;
        if (view == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        gc0 gc0Var = (gc0) arrayList.get(i10);
        int i11 = gc0Var.a;
        int i12 = gc0Var.e;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5 && gc0Var.f == 1) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                SharedPreferences.Editor edit = globalMainSettings.edit();
                boolean z11 = !z10;
                edit.putBoolean("view_animations", z11);
                SharedConfig.setAnimationsEnabled(z11);
                edit.commit();
                ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                return;
            }
            return;
        }
        if (LiteMode.isPowerSaverApplied()) {
            mc0Var.e = org.telegram.ui.Components.ad.a0(mc0Var).L(new org.telegram.ui.Components.aa(0.1f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            return;
        }
        if (gc0Var.a != 3 || Integer.bitCount(i12) <= 1 || (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) || (U = mc0Var.U(i12)) == -1) {
            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
            mc0Var.Y();
        } else {
            mc0Var.n[U] = !r8[U];
            mc0Var.Y();
            mc0Var.X();
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 22:
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
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : zn.W9(j3));
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
                                n2Var.presentFragment(new zn(bundle));
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
                al0 al0Var = (al0) this.b;
                al0Var.getClass();
                if (view instanceof zk0) {
                    zk0 zk0Var = (zk0) view;
                    al0Var.Z(zk0Var.e);
                    zk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        vf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                break;
            case 12:
                ((l70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                fe0 fe0Var = (fe0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", fe0Var.I);
                bundle.putString("ephone", fe0Var.J);
                bundle.putString("phoneFormated", fe0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = fe0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = fe0Var.M;
                fe0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new wd0(fe0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                oe0 oe0Var = (oe0) obj;
                wg0.n0(oe0Var.y, oe0Var.s, oe0Var.v, oe0Var.w);
                break;
            case 19:
                hf0 hf0Var = (hf0) obj;
                wg0 wg0Var = hf0Var.E;
                wg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(hf0Var, 12), 10);
                break;
            case 25:
                ((org.telegram.messenger.bj) obj).run();
                break;
            case 27:
                al0 al0Var = ((wk0) obj).b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = yk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        vf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = yk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((vf.b) arrayList2.get(i15)).a == null || ((vf.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (yk0Var.g != null && (dVar = al0Var.getMediaDataController().ringtoneUploaderHashMap.get(yk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (yk0Var == al0Var.H) {
                        al0Var.N = null;
                        al0Var.H = (yk0) al0Var.b.get(0);
                        al0Var.I = true;
                    }
                    al0Var.a.remove(yk0Var);
                    al0Var.c.remove(yk0Var);
                }
                al0Var.getMediaDataController().ringtoneDataStore.h();
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
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new ai.v7(8));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f.l();
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
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            ((org.telegram.ui.Cells.ca) childAt).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E6, false));
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

    @Override // org.telegram.ui.Components.vw0
    public void g(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((hu) this.b).d;
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
            org.telegram.ui.Components.qm0 qm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.d1 K = qm0Var.K(i15 + i19);
            if (K != null) {
                hu huVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                huVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // gg.a2
    public void h(int i10) {
        switch (this.a) {
            case 11:
                a70 a70Var = (a70) this.b;
                c70 c70Var = a70Var.I;
                c70Var.q0(a70Var.H);
                if (a70Var.h == null && !a70Var.f.e() && a70Var.h() == 0) {
                    c70Var.s.e(false, true);
                }
                a70Var.l();
                break;
            default:
                rk0 rk0Var = (rk0) this.b;
                if (rk0Var.f == null && !rk0Var.h.e()) {
                    rk0Var.n.c.c();
                }
                rk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.Components.se0
    public void i(org.telegram.ui.Components.te0 te0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, te0Var);
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        hh0 hh0Var = (hh0) this.b;
        hh0Var.getClass();
        hh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        hh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.x.isShowing()) {
            a00Var.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                lz lzVar = (lz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.p61) obj).d == 1 && lzVar.b != null) {
                    boolean z10 = !lzVar.c;
                    lzVar.c = z10;
                    ai.m0 m0Var = lzVar.f;
                    if (m0Var != null) {
                        m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(lzVar.d));
                    }
                    ((org.telegram.ui.Cells.w8) view).setChecked(lzVar.c);
                    lzVar.e.W2.N(true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.qm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.qm0) this.b).n2);
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.p61) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.b).run();
        return true;
    }

    private final /* synthetic */ void b(ArrayList arrayList) {
    }

    private final /* synthetic */ void e(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vw0
    public /* synthetic */ void l() {
    }

    @Override // me.d
    public /* synthetic */ void A(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
