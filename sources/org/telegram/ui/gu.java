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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.bl0, org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.tg0, Utilities.Callback5, org.telegram.ui.Components.rd0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.xk0, gg.b2, org.telegram.ui.Components.cl0, r0.n, bu, le.d, vj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        ih0 ih0Var = (ih0) this.b;
        ih0Var.getClass();
        ih0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ih0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
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

    @Override // org.telegram.ui.vj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.bu
    public void a1(xt xtVar) {
        xg0 xg0Var = (xg0) this.b;
        xg0Var.I = true;
        String str = xtVar.c;
        xg0Var.a.setText(str);
        xg0Var.v(str, xtVar);
        xg0Var.y = xtVar;
        xg0Var.x = 0;
        xg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + xtVar.c, xtVar.d).apply();
        AndroidUtilities.runOnUIThread(new ng0(xg0Var, 4), 300L);
        ug0 ug0Var = xg0Var.b;
        ug0Var.requestFocus();
        ug0Var.setSelection(ug0Var.length());
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        int U;
        switch (this.a) {
            case 0:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
            case 17:
                pc0 pc0Var = (pc0) this.b;
                ArrayList arrayList = pc0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    jc0 jc0Var = (jc0) arrayList.get(i10);
                    int i11 = jc0Var.a;
                    int i12 = jc0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && jc0Var.f == 1) {
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
                        if (jc0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (U = pc0Var.U(i12)) != -1) {
                            pc0Var.n[U] = !r8[U];
                            pc0Var.Y();
                            pc0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            pc0Var.Y();
                            break;
                        }
                    } else {
                        pc0Var.e = org.telegram.ui.Components.vc.a0(pc0Var).L(new org.telegram.ui.Components.w9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                ah0.U((ah0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 14:
                break;
            case 24:
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
                            org.telegram.ui.ActionBar.o2 o2Var = lj0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                o2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : bo.R9(j3));
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
                            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                                o2Var.presentFragment(new bo(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.P = charSequenceArr;
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    lj0Var.showDialog(c2Var);
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 0:
                break;
            case 17:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 2:
                ((a3.h0) obj).run();
                break;
            case 13:
                ((p70) obj).U(true);
                break;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 18:
                ie0 ie0Var = (ie0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ie0Var.I);
                bundle.putString("ephone", ie0Var.J);
                bundle.putString("phoneFormated", ie0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ie0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ie0Var.M;
                ie0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new zd0(ie0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 19:
                re0 re0Var = (re0) obj;
                yg0.n0(re0Var.y, re0Var.s, re0Var.v, re0Var.w);
                break;
            case 20:
                kf0 kf0Var = (kf0) obj;
                yg0 yg0Var = kf0Var.E;
                yg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(kf0Var, 12), 10);
                break;
            case 27:
                ((org.telegram.messenger.sj) obj).run();
                break;
            default:
                al0 al0Var = ((wk0) obj).b;
                SparseArray sparseArray = al0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    yk0 yk0Var = (yk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = yk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = al0Var.getMediaDataController().ringtoneDataStore;
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
                                    if (((uf.b) arrayList2.get(i15)).a == null || ((uf.b) arrayList2.get(i15)).a.id != document2.id) {
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
                    al0Var.getConnectionsManager().sendRequest(saveringtone, new ai.t7(8));
                }
                al0.W(al0Var);
                al0Var.c0();
                al0Var.f.l();
                c2Var.dismiss();
                break;
        }
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((ku) this.b).d;
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
            i17 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.ml0 ml0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 L = ml0Var.L(i15 + i19);
            if (L != null) {
                ku kuVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                kuVar.v(L, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // gg.b2
    public void h(int i10) {
        switch (this.a) {
            case 12:
                e70 e70Var = (e70) this.b;
                g70 g70Var = e70Var.I;
                g70Var.q0(e70Var.H);
                if (e70Var.h == null && !e70Var.f.e() && e70Var.h() == 0) {
                    g70Var.s.e(false, true);
                }
                e70Var.l();
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

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        c00 c00Var = (c00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && c00Var.x.isShowing()) {
            c00Var.x.d(true);
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
            case 7:
                oz ozVar = (oz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.j51) obj).d == 1 && ozVar.b != null) {
                    boolean z10 = !ozVar.c;
                    ozVar.c = z10;
                    ai.m0 m0Var = ozVar.f;
                    if (m0Var != null) {
                        m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(ozVar.d));
                    }
                    ((org.telegram.ui.Cells.w8) view).setChecked(ozVar.c);
                    ozVar.e.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ml0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.ml0) this.b).p2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.b).run();
        return true;
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    private final /* synthetic */ void m(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void l() {
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }
}
