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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.ui.Components.dw0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.ch0, Utilities.Callback5, org.telegram.ui.Components.ae0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.gl0, fg.c2, org.telegram.ui.Components.ll0, r0.n, org.telegram.ui.Components.kl0, au, le.d, uj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i D() {
        switch (this.a) {
        }
        return null;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
        hh0 hh0Var = (hh0) this.b;
        hh0Var.getClass();
        hh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        hh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // fg.c2
    public /* synthetic */ a0.i P() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        va0 va0Var = (va0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!va0Var.a.equals(defaultWindowInsets)) {
            va0Var.a = defaultWindowInsets;
            va0Var.requestLayout();
        }
        int childCount = va0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(va0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override // fg.c2
    public void a(int i10) {
        switch (this.a) {
            case 11:
                c70 c70Var = (c70) this.b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f.e() && c70Var.h() == 0) {
                    e70Var.s.e(false, true);
                }
                c70Var.l();
                break;
            default:
                sk0 sk0Var = (sk0) this.b;
                if (sk0Var.f == null && !sk0Var.h.e()) {
                    sk0Var.n.c.c();
                }
                sk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.au
    public void a1(wt wtVar) {
        wg0 wg0Var = (wg0) this.b;
        wg0Var.I = true;
        String str = wtVar.c;
        wg0Var.a.setText(str);
        wg0Var.v(str, wtVar);
        wg0Var.y = wtVar;
        wg0Var.x = 0;
        wg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + wtVar.c, wtVar.d).apply();
        AndroidUtilities.runOnUIThread(new lg0(wg0Var, 4), 300L);
        tg0 tg0Var = wg0Var.b;
        tg0Var.requestFocus();
        tg0Var.setSelection(tg0Var.length());
    }

    @Override // org.telegram.ui.uj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
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
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
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
                        nc0Var.e = org.telegram.ui.Components.wc.a0(nc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                zg0.U((zg0) this.b, i10);
                break;
        }
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final kj0 kj0Var = (kj0) this.b;
                if (i10 >= kj0Var.I && i10 < kj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) kj0Var.x.get(i10 - kj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kj0Var.getParentActivity(), 0, kj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.fj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.p2 p2Var = kj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                p2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : eo.R9(j3));
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
                            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                                p2Var.presentFragment(new eo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.P = charSequenceArr;
                    d2Var.Q = intArray;
                    d2Var.M = onClickListener;
                    kj0Var.showDialog(d2Var);
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

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        tf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.h0) obj).run();
                break;
            case 12:
                ((m70) obj).U(true);
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
                xg0.n0(pe0Var.y, pe0Var.s, pe0Var.v, pe0Var.w);
                break;
            case 19:
                if0 if0Var = (if0) obj;
                xg0 xg0Var = if0Var.E;
                xg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(if0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.ak) obj).run();
                break;
            case 28:
                al0 al0Var = ((wk0) obj).b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = yk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        tf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
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
                                    if (((tf.b) arrayList2.get(i15)).a == null || ((tf.b) arrayList2.get(i15)).a.id != document2.id) {
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
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new bi.g1(4));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f.l();
                d2Var.dismiss();
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
                        if (childAt instanceof org.telegram.ui.Cells.ga) {
                            ((org.telegram.ui.Cells.ga) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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

    @Override // org.telegram.ui.Components.ae0
    public void g(org.telegram.ui.Components.be0 be0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
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
            i17 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.vl0 vl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 K = vl0Var.K(i15 + i19);
            if (K != null) {
                ju juVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                juVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // fg.c2
    public /* synthetic */ void k0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        c00 c00Var = (c00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && c00Var.x.isShowing()) {
            c00Var.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.gl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                oz ozVar = (oz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.v51) obj).d == 1 && ozVar.b != null) {
                    boolean z10 = !ozVar.c;
                    ozVar.c = z10;
                    bi.k6 k6Var = ozVar.f;
                    if (k6Var != null) {
                        k6Var.run(Boolean.valueOf(z10), Boolean.valueOf(ozVar.d));
                    }
                    ((org.telegram.ui.Cells.x8) view).setChecked(ozVar.c);
                    ozVar.e.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.vl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.vl0) this.b).p2);
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

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }
}
