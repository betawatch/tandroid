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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.zg0, Utilities.Callback5, org.telegram.ui.Components.vd0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.el0, tf.i1, org.telegram.ui.Components.jl0, r0.o, org.telegram.ui.Components.il0, zt, xd.b, lj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // tf.i1
    public /* synthetic */ void J1(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        zg0 zg0Var = (zg0) this.b;
        zg0Var.getClass();
        zg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        zg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        oa0 oa0Var = (oa0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!oa0Var.a.equals(defaultWindowInsets)) {
            oa0Var.a = defaultWindowInsets;
            oa0Var.requestLayout();
        }
        int childCount = oa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(oa0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.zt
    public void Y0(ut utVar) {
        og0 og0Var = (og0) this.b;
        og0Var.F = true;
        String str = utVar.c;
        og0Var.a.setText(str);
        og0Var.v(str, utVar);
        og0Var.y = utVar;
        og0Var.x = 0;
        og0Var.F = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + utVar.c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new eg0(og0Var, 4), 300L);
        lg0 lg0Var = og0Var.b;
        lg0Var.requestFocus();
        lg0Var.setSelection(lg0Var.length());
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.lj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                gc0 gc0Var = (gc0) this.b;
                ArrayList arrayList = gc0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ac0 ac0Var = (ac0) arrayList.get(i10);
                    int i11 = ac0Var.a;
                    int i12 = ac0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ac0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z4 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z10 = !z4;
                            edit.putBoolean("view_animations", z10);
                            SharedConfig.setAnimationsEnabled(z10);
                            edit.commit();
                            ((org.telegram.ui.Cells.n8) view).setChecked(z10);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (ac0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 <= AndroidUtilities.dp(75.0f)) && (U = gc0Var.U(i12)) != -1) {
                            gc0Var.n[U] = !r8[U];
                            gc0Var.Y();
                            gc0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            gc0Var.Y();
                            break;
                        }
                    } else {
                        gc0Var.e = org.telegram.ui.Components.qc.a0(gc0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                rg0.U((rg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final cj0 cj0Var = (cj0) this.b;
                if (i10 >= cj0Var.F && i10 < cj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) cj0Var.x.get(i10 - cj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cj0Var.getParentActivity(), 0, cj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.xi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.p2 p2Var = cj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z4 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                p2Var.presentFragment(z4 ? ProfileActivity.m4(j10) : zn.R9(j10));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z4) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                                p2Var.presentFragment(new zn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.M = charSequenceArr;
                    d2Var.N = intArray;
                    d2Var.J = onClickListener;
                    cj0Var.showDialog(d2Var);
                    break;
                }
                break;
            default:
                qk0 qk0Var = (qk0) this.b;
                qk0Var.getClass();
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    qk0Var.Z(pk0Var.e);
                    pk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((iu) this.b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.c.get(i10);
        if (preset == dataAutoDownloadActivity.y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.C) {
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
        edit.putInt(dataAutoDownloadActivity.H, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.p2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.rl0 rl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            f2.l1 K = rl0Var.K(i15 + i19);
            if (K != null) {
                iu iuVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                iuVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override // org.telegram.ui.Components.vd0
    public void h(org.telegram.ui.Components.wd0 wd0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, wd0Var);
    }

    @Override // tf.i1
    public void k(int i10) {
        switch (this.a) {
            case 11:
                y60 y60Var = (y60) this.b;
                a70 a70Var = y60Var.F;
                a70Var.q0(y60Var.E);
                if (y60Var.h == null && !y60Var.f.e() && y60Var.h() == 0) {
                    a70Var.s.e(false, true);
                }
                y60Var.l();
                break;
            default:
                ik0 ik0Var = (ik0) this.b;
                if (ik0Var.f == null && !ik0Var.h.e()) {
                    ik0Var.n.c.c();
                }
                ik0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        ff.f fVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((i5.v) obj).run();
                break;
            case 12:
                ((i70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                ae0 ae0Var = (ae0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ae0Var.F);
                bundle.putString("ephone", ae0Var.G);
                bundle.putString("phoneFormated", ae0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ae0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = ae0Var.J;
                ae0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(ae0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                je0 je0Var = (je0) obj;
                pg0.n0(je0Var.y, je0Var.s, je0Var.v, je0Var.w);
                break;
            case 19:
                cf0 cf0Var = (cf0) obj;
                pg0 pg0Var = cf0Var.B;
                pg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(cf0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.uj) obj).run();
                break;
            case 28:
                qk0 qk0Var = ((mk0) obj).b;
                SparseArray sparseArray = qk0Var.G;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    ok0 ok0Var = (ok0) sparseArray.valueAt(i14);
                    TLRPC.Document document = ok0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        ff.e eVar = qk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ok0Var.e;
                        ArrayList arrayList2 = eVar.e;
                        if (document2 != null) {
                            if (!eVar.f) {
                                eVar.f(true);
                                eVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((ff.d) arrayList2.get(i15)).a == null || ((ff.d) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (ok0Var.g != null && (fVar = qk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ok0Var.g)) != null) {
                        fVar.c = true;
                        fVar.a();
                        int i16 = fVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = fVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (ok0Var == qk0Var.E) {
                        qk0Var.K = null;
                        qk0Var.E = (ok0) qk0Var.b.get(0);
                        qk0Var.F = true;
                    }
                    qk0Var.a.remove(ok0Var);
                    qk0Var.c.remove(ok0Var);
                }
                qk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    qk0Var.getConnectionsManager().sendRequest(saveringtone, new nh.p5(4));
                }
                qk0.W(qk0Var);
                qk0Var.c0();
                qk0Var.f.l();
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
                        if (childAt instanceof org.telegram.ui.Cells.z9) {
                            ((org.telegram.ui.Cells.z9) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        yz yzVar = (yz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && yzVar.x.isShowing()) {
            yzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.el0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // tf.i1
    public /* synthetic */ boolean t1(int i10) {
        switch (this.a) {
        }
        return true;
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
                if (((org.telegram.ui.Components.i51) obj).d == 1 && jzVar.b != null) {
                    boolean z4 = !jzVar.c;
                    jzVar.c = z4;
                    dh.v vVar = jzVar.f;
                    if (vVar != null) {
                        vVar.run(Boolean.valueOf(z4), Boolean.valueOf(jzVar.d));
                    }
                    ((org.telegram.ui.Cells.r8) view).setChecked(jzVar.c);
                    jzVar.e.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.rl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.rl0) this.b).m2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((i5.x) this.b).run();
        return true;
    }

    private final /* synthetic */ void f(ArrayList arrayList) {
    }

    private final /* synthetic */ void i(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }
}
