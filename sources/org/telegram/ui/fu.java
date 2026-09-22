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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.ui.Components.nl0, org.telegram.ui.Components.fw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fh0, Utilities.Callback5, org.telegram.ui.Components.ce0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.jl0, gg.b2, org.telegram.ui.Components.ol0, r0.n, au, le.d, wj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i D() {
        switch (this.a) {
        }
        return null;
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
        ih0 ih0Var = (ih0) this.b;
        ih0Var.getClass();
        ih0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        ih0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // gg.b2
    public /* synthetic */ boolean L(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void O(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
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

    @Override // org.telegram.ui.au
    public void Z0(vt vtVar) {
        xg0 xg0Var = (xg0) this.b;
        xg0Var.I = true;
        String str = vtVar.c;
        xg0Var.a.setText(str);
        xg0Var.v(str, vtVar);
        xg0Var.y = vtVar;
        xg0Var.x = 0;
        xg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + vtVar.c, vtVar.d).apply();
        AndroidUtilities.runOnUIThread(new ng0(xg0Var, 4), 300L);
        ug0 ug0Var = xg0Var.b;
        ug0Var.requestFocus();
        ug0Var.setSelection(ug0Var.length());
    }

    @Override // org.telegram.ui.wj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.nl0
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
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
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
                        pc0Var.e = org.telegram.ui.Components.xc.a0(pc0Var).L(new org.telegram.ui.Components.x9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                ah0.U((ah0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 0:
                break;
            case 17:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 14:
                break;
            case 24:
                final mj0 mj0Var = (mj0) this.b;
                if (i10 >= mj0Var.I && i10 < mj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) mj0Var.x.get(i10 - mj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mj0Var.getParentActivity(), 0, mj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.hj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = mj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : zn.R9(j3));
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
                    mj0Var.showDialog(b2Var);
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

    @Override // gg.b2
    public void f(int i10) {
        switch (this.a) {
            case 12:
                c70 c70Var = (c70) this.b;
                e70 e70Var = c70Var.I;
                e70Var.q0(c70Var.H);
                if (c70Var.h == null && !c70Var.f.e() && c70Var.h() == 0) {
                    e70Var.s.e(false, true);
                }
                c70Var.l();
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

    @Override // org.telegram.ui.Components.fw0
    public void g(int i10) {
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
            org.telegram.ui.Components.yl0 yl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 L = yl0Var.L(i15 + i19);
            if (L != null) {
                ju juVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                juVar.v(L, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.ce0
    public void i(org.telegram.ui.Components.de0 de0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, de0Var);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                ((n70) obj).U(true);
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
                i11 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(kf0Var, 12), 10);
                break;
            case 27:
                ((org.telegram.messenger.rj) obj).run();
                break;
            default:
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
                    bl0Var.getConnectionsManager().sendRequest(saveringtone, new ai.t7(8));
                }
                bl0.W(bl0Var);
                bl0Var.c0();
                bl0Var.f.l();
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.x.isShowing()) {
            a00Var.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.jl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 7:
                mz mzVar = (mz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.y51) obj).d == 1 && mzVar.b != null) {
                    boolean z10 = !mzVar.c;
                    mzVar.c = z10;
                    ai.m0 m0Var = mzVar.f;
                    if (m0Var != null) {
                        m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
                    }
                    ((org.telegram.ui.Cells.x8) view).setChecked(mzVar.c);
                    mzVar.e.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.yl0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.yl0) this.b).p2);
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

    private final /* synthetic */ void m(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.fw0
    public /* synthetic */ void l() {
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void h(View view, float f7, float f10) {
    }
}
