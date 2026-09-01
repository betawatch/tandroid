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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.uv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.ah0, Utilities.Callback5, org.telegram.ui.Components.wd0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.gl0, uf.j1, org.telegram.ui.Components.ll0, r0.o, org.telegram.ui.Components.kl0, yt, xd.b, kj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        yg0 yg0Var = (yg0) this.b;
        yg0Var.getClass();
        yg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        yg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        na0 na0Var = (na0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!na0Var.a.equals(defaultWindowInsets)) {
            na0Var.a = defaultWindowInsets;
            na0Var.requestLayout();
        }
        int childCount = na0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(na0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override // uf.j1
    public /* synthetic */ boolean R(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // uf.j1
    public /* synthetic */ void V(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.yt
    public void V0(tt ttVar) {
        ng0 ng0Var = (ng0) this.b;
        ng0Var.F = true;
        String str = ttVar.c;
        ng0Var.a.setText(str);
        ng0Var.v(str, ttVar);
        ng0Var.y = ttVar;
        ng0Var.x = 0;
        ng0Var.F = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ttVar.c, ttVar.d).apply();
        AndroidUtilities.runOnUIThread(new dg0(ng0Var, 4), 300L);
        kg0 kg0Var = ng0Var.b;
        kg0Var.requestFocus();
        kg0Var.setSelection(kg0Var.length());
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.kj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                fc0 fc0Var = (fc0) this.b;
                ArrayList arrayList = fc0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    zb0 zb0Var = (zb0) arrayList.get(i10);
                    int i11 = zb0Var.a;
                    int i12 = zb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && zb0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z4 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z10 = !z4;
                            edit.putBoolean("view_animations", z10);
                            SharedConfig.setAnimationsEnabled(z10);
                            edit.commit();
                            ((org.telegram.ui.Cells.o8) view).setChecked(z10);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (zb0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 <= AndroidUtilities.dp(75.0f)) && (U = fc0Var.U(i12)) != -1) {
                            fc0Var.n[U] = !r8[U];
                            fc0Var.Y();
                            fc0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            fc0Var.Y();
                            break;
                        }
                    } else {
                        fc0Var.e = org.telegram.ui.Components.qc.a0(fc0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                qg0.U((qg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final bj0 bj0Var = (bj0) this.b;
                if (i10 >= bj0Var.F && i10 < bj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) bj0Var.x.get(i10 - bj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bj0Var.getParentActivity(), 0, bj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.wi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.p2 p2Var = bj0.this;
                            p2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z4 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                p2Var.presentFragment(z4 ? ProfileActivity.m4(j10) : xn.R9(j10));
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
                                p2Var.presentFragment(new xn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.M = charSequenceArr;
                    d2Var.N = intArray;
                    d2Var.J = onClickListener;
                    bj0Var.showDialog(d2Var);
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

    @Override // uf.j1
    public void g(int i10) {
        switch (this.a) {
            case 11:
                x60 x60Var = (x60) this.b;
                z60 z60Var = x60Var.F;
                z60Var.q0(x60Var.E);
                if (x60Var.h == null && !x60Var.f.e() && x60Var.h() == 0) {
                    z60Var.s.e(false, true);
                }
                x60Var.l();
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

    @Override // org.telegram.ui.Components.wd0
    public void h(org.telegram.ui.Components.xd0 xd0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xd0Var);
    }

    @Override // org.telegram.ui.Components.uv0
    public void i(int i10) {
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
            org.telegram.ui.Components.tl0 tl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            f2.m1 K = tl0Var.K(i15 + i19);
            if (K != null) {
                hu huVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                huVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        gf.f fVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((i5.v) obj).run();
                break;
            case 12:
                ((h70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                zd0 zd0Var = (zd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", zd0Var.F);
                bundle.putString("ephone", zd0Var.G);
                bundle.putString("phoneFormated", zd0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = zd0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = zd0Var.J;
                zd0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new qd0(zd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                ie0 ie0Var = (ie0) obj;
                og0.n0(ie0Var.y, ie0Var.s, ie0Var.v, ie0Var.w);
                break;
            case 19:
                bf0 bf0Var = (bf0) obj;
                og0 og0Var = bf0Var.B;
                og0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(bf0Var, 12), 10);
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
                        gf.e eVar = qk0Var.getMediaDataController().ringtoneDataStore;
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
                                    if (((gf.d) arrayList2.get(i15)).a == null || ((gf.d) arrayList2.get(i15)).a.id != document2.id) {
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
                    qk0Var.getConnectionsManager().sendRequest(saveringtone, new oh.p5(4));
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
                        if (childAt instanceof org.telegram.ui.Cells.aa) {
                            ((org.telegram.ui.Cells.aa) childAt).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E6, false));
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
        xz xzVar = (xz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xzVar.x.isShowing()) {
            xzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.gl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // uf.j1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                iz izVar = (iz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.j51) obj).d == 1 && izVar.b != null) {
                    boolean z4 = !izVar.c;
                    izVar.c = z4;
                    eh.w wVar = izVar.f;
                    if (wVar != null) {
                        wVar.run(Boolean.valueOf(z4), Boolean.valueOf(izVar.d));
                    }
                    ((org.telegram.ui.Cells.s8) view).setChecked(izVar.c);
                    izVar.e.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.tl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.tl0) this.b).m2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((i5.x) this.b).run();
        return true;
    }

    private final /* synthetic */ void e(ArrayList arrayList) {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.uv0
    public /* synthetic */ void m() {
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }
}
