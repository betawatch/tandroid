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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements org.telegram.ui.Components.rw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.th0, Utilities.Callback5, org.telegram.ui.Components.qe0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.xl0, hg.z1, org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.Components.bm0, eu, ne.d, yj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // hg.z1
    public /* synthetic */ boolean E0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void O0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ya0 ya0Var = (ya0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ya0Var.a.equals(defaultWindowInsets)) {
            ya0Var.a = defaultWindowInsets;
            ya0Var.requestLayout();
        }
        int childCount = ya0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ya0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override // org.telegram.ui.eu
    public void Z0(au auVar) {
        zg0 zg0Var = (zg0) this.b;
        zg0Var.I = true;
        String str = auVar.c;
        zg0Var.a.setText(str);
        zg0Var.t(str, auVar);
        zg0Var.y = auVar;
        zg0Var.x = 0;
        zg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + auVar.c, auVar.d).apply();
        AndroidUtilities.runOnUIThread(new pg0(zg0Var, 4), 300L);
        wg0 wg0Var = zg0Var.b;
        wg0Var.requestFocus();
        wg0Var.setSelection(wg0Var.length());
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 22:
                final pj0 pj0Var = (pj0) this.b;
                if (i10 >= pj0Var.I && i10 < pj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) pj0Var.x.get(i10 - pj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pj0Var.getParentActivity(), 0, pj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.jj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.m2 m2Var = pj0.this;
                            m2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                m2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : fo.W9(j10));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                                m2Var.presentFragment(new fo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.P = charSequenceArr;
                    a2Var.Q = intArray;
                    a2Var.M = onClickListener;
                    pj0Var.showDialog(a2Var);
                    break;
                }
                break;
            default:
                el0 el0Var = (el0) this.b;
                el0Var.getClass();
                if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    el0Var.Z(dl0Var.e);
                    dl0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.yj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        int U;
        qc0 qc0Var = (qc0) this.b;
        ArrayList arrayList = qc0Var.s;
        if (view == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        kc0 kc0Var = (kc0) arrayList.get(i10);
        int i11 = kc0Var.a;
        int i12 = kc0Var.e;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5 && kc0Var.f == 1) {
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
            qc0Var.e = org.telegram.ui.Components.zc.a0(qc0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            return;
        }
        if (kc0Var.a != 3 || Integer.bitCount(i12) <= 1 || (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) || (U = qc0Var.U(i12)) == -1) {
            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
            qc0Var.Y();
        } else {
            qc0Var.n[U] = !r8[U];
            qc0Var.Y();
            qc0Var.X();
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        switch (this.a) {
            case 11:
                h70 h70Var = (h70) this.b;
                j70 j70Var = h70Var.I;
                j70Var.q0(h70Var.H);
                if (h70Var.h == null && !h70Var.f.e() && h70Var.h() == 0) {
                    j70Var.s.e(false, true);
                }
                h70Var.l();
                break;
            default:
                vk0 vk0Var = (vk0) this.b;
                if (vk0Var.f == null && !vk0Var.h.e()) {
                    vk0Var.n.c.c();
                }
                vk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                break;
            case 12:
                ((s70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                je0 je0Var = (je0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", je0Var.I);
                bundle.putString("ephone", je0Var.J);
                bundle.putString("phoneFormated", je0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = je0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = je0Var.M;
                je0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ae0(je0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                te0 te0Var = (te0) obj;
                ah0.n0(te0Var.y, te0Var.s, te0Var.v, te0Var.w);
                break;
            case 19:
                mf0 mf0Var = (mf0) obj;
                ah0 ah0Var = mf0Var.E;
                ah0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(mf0Var, 12), 10);
                break;
            case 25:
                ((org.telegram.messenger.ej) obj).run();
                break;
            case 27:
                el0 el0Var = ((al0) obj).b;
                SparseArray sparseArray = el0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    cl0 cl0Var = (cl0) sparseArray.valueAt(i14);
                    TLRPC.Document document = cl0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = el0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = cl0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i15)).a == null || ((wf.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (cl0Var.g != null && (dVar = el0Var.getMediaDataController().ringtoneUploaderHashMap.get(cl0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (cl0Var == el0Var.H) {
                        el0Var.N = null;
                        el0Var.H = (cl0) el0Var.b.get(0);
                        el0Var.I = true;
                    }
                    el0Var.a.remove(cl0Var);
                    el0Var.c.remove(cl0Var);
                }
                el0Var.getMediaDataController().ringtoneDataStore.h();
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
                    el0Var.getConnectionsManager().sendRequest(saveringtone, new bi.g7(8));
                }
                el0.W(el0Var);
                el0Var.c0();
                el0Var.f.l();
                a2Var.dismiss();
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
                            ((org.telegram.ui.Cells.ca) childAt).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E6, false));
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

    @Override // org.telegram.ui.Components.rw0
    public void h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((nu) this.b).d;
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
            i17 = ((org.telegram.ui.ActionBar.m2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.m2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.m2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.m2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.mm0 mm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.b1 K = mm0Var.K(i15 + i19);
            if (K != null) {
                nu nuVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                nuVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.qe0
    public void i(org.telegram.ui.Components.re0 re0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, re0Var);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h k0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        f00 f00Var = (f00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f00Var.x.isShowing()) {
            f00Var.x.d(true);
        }
    }

    @Override // ne.d
    public void p(int i10, float f7, float f10, ne.e eVar) {
        lh0 lh0Var = (lh0) this.b;
        lh0Var.getClass();
        lh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        lh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                qz qzVar = (qz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.m61) obj).d == 1 && qzVar.b != null) {
                    boolean z10 = !qzVar.c;
                    qzVar.c = z10;
                    bi.f0 f0Var = qzVar.f;
                    if (f0Var != null) {
                        f0Var.run(Boolean.valueOf(z10), Boolean.valueOf(qzVar.d));
                    }
                    ((org.telegram.ui.Cells.w8) view).setChecked(qzVar.c);
                    qzVar.e.W2.N(true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.mm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.mm0) this.b).n2);
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.m61) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    private final /* synthetic */ void c(ArrayList arrayList) {
    }

    private final /* synthetic */ void e(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }

    @Override // ne.d
    public /* synthetic */ void A(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
