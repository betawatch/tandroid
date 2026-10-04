package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu implements org.telegram.ui.Components.nl0, org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fh0, Utilities.Callback5, org.telegram.ui.Components.de0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.jl0, gg.b2, org.telegram.ui.Components.ol0, r0.n, yt, le.d, qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gg.b2
    public /* synthetic */ void C(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        ua0 ua0Var = (ua0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        if (!ua0Var.a.equals(defaultWindowInsets)) {
            ua0Var.a = defaultWindowInsets;
            ua0Var.requestLayout();
        }
        int childCount = ua0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ua0Var.getChildAt(i10), l1Var);
        }
        return l1Var;
    }

    @Override // gg.b2
    public void a(int i10) {
        switch (this.a) {
            case 12:
                b70 b70Var = (b70) this.b;
                d70 d70Var = b70Var.I;
                d70Var.q0(b70Var.H);
                if (b70Var.h == null && !b70Var.f.e() && b70Var.h() == 0) {
                    d70Var.s.e(false, true);
                }
                b70Var.l();
                break;
            default:
                ok0 ok0Var = (ok0) this.b;
                if (ok0Var.f == null && !ok0Var.h.e()) {
                    ok0Var.n.c.c();
                }
                ok0Var.l();
                break;
        }
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        eh0 eh0Var = (eh0) this.b;
        eh0Var.getClass();
        eh0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        eh0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // org.telegram.ui.qj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.yt
    public void b1(ut utVar) {
        tg0 tg0Var = (tg0) this.b;
        tg0Var.I = true;
        String str = utVar.c;
        tg0Var.a.setText(str);
        tg0Var.v(str, utVar);
        tg0Var.y = utVar;
        tg0Var.x = 0;
        tg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + utVar.c, utVar.d).apply();
        AndroidUtilities.runOnUIThread(new jg0(tg0Var, 4), 300L);
        qg0 qg0Var = tg0Var.b;
        qg0Var.requestFocus();
        qg0Var.setSelection(qg0Var.length());
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.g61 G;
        Object obj;
        long j3;
        int S;
        switch (this.a) {
            case 0:
                du duVar = (du) this.b;
                HashSet hashSet = duVar.b0;
                if (!duVar.c0 && (G = duVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof xg.l) {
                        ((xg.l) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
            case 17:
                lc0 lc0Var = (lc0) this.b;
                ArrayList arrayList = lc0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    fc0 fc0Var = (fc0) arrayList.get(i10);
                    int i11 = fc0Var.a;
                    int i12 = fc0Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!LiteMode.isPowerSaverApplied()) {
                            if (fc0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (S = lc0Var.S(i12)) != -1) {
                                lc0Var.n[S] = !r8[S];
                                lc0Var.X();
                                lc0Var.W();
                                break;
                            } else {
                                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                                lc0Var.X();
                            }
                        } else {
                            lc0Var.e = org.telegram.ui.Components.yc.a0(lc0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                            break;
                        }
                    } else if (i11 == 5 && fc0Var.f == 1) {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = globalMainSettings.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("view_animations", z11);
                        SharedConfig.setAnimationsEnabled(z11);
                        edit.commit();
                        ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                    }
                    li.m.f();
                    break;
                }
                break;
            default:
                wg0.S((wg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 14:
                break;
            case 24:
                final hj0 hj0Var = (hj0) this.b;
                if (i10 >= hj0Var.I && i10 < hj0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) hj0Var.x.get(i10 - hj0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hj0Var.getParentActivity(), 0, hj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.cj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = hj0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j3 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j3) : yn.Q9(j3));
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
                                n2Var.presentFragment(new yn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.P = charSequenceArr;
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    hj0Var.showDialog(b2Var);
                    break;
                }
                break;
            default:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.getClass();
                if (view instanceof vk0) {
                    vk0 vk0Var = (vk0) view;
                    wk0Var.Y(vk0Var.e);
                    vk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 17:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        uf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 3:
                ((a3.h0) obj).run();
                break;
            case 13:
                ((m70) obj).S(true);
                break;
            case 15:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 18:
                ee0 ee0Var = (ee0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ee0Var.I);
                bundle.putString("ephone", ee0Var.J);
                bundle.putString("phoneFormated", ee0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ee0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ee0Var.M;
                ee0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new vd0(ee0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 19:
                ne0 ne0Var = (ne0) obj;
                ug0.n0(ne0Var.y, ne0Var.s, ne0Var.v, ne0Var.w);
                break;
            case 20:
                gf0 gf0Var = (gf0) obj;
                ug0 ug0Var = gf0Var.E;
                ug0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(gf0Var, 12), 10);
                break;
            case 27:
                ((org.telegram.messenger.qj) obj).run();
                break;
            default:
                wk0 wk0Var = ((sk0) obj).b;
                SparseArray sparseArray = wk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    uk0 uk0Var = (uk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = uk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        uf.c cVar = wk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = uk0Var.e;
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
                    if (uk0Var.g != null && (dVar = wk0Var.getMediaDataController().ringtoneUploaderHashMap.get(uk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (uk0Var == wk0Var.H) {
                        wk0Var.N = null;
                        wk0Var.H = (uk0) wk0Var.b.get(0);
                        wk0Var.I = true;
                    }
                    wk0Var.a.remove(uk0Var);
                    wk0Var.c.remove(uk0Var);
                }
                wk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    wk0Var.getConnectionsManager().sendRequest(saveringtone, new ai.u7(8));
                }
                wk0.U(wk0Var);
                wk0Var.c0();
                wk0Var.f.l();
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public void j(int i10) {
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
            org.telegram.ui.Components.zl0 zl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 K = zl0Var.K(i15 + i19);
            if (K != null) {
                iu iuVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                iuVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.de0
    public void m(org.telegram.ui.Components.ee0 ee0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ee0Var);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        a00 a00Var = (a00) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && a00Var.x.isShowing()) {
            a00Var.x.d(true);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mz mzVar = (mz) this.b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.g61) obj).d != 1 || mzVar.b == null) {
            return;
        }
        boolean z10 = !mzVar.c;
        mzVar.c = z10;
        ai.m0 m0Var = mzVar.f;
        if (m0Var != null) {
            m0Var.run(Boolean.valueOf(z10), Boolean.valueOf(mzVar.d));
        }
        ((org.telegram.ui.Cells.w8) view).setChecked(mzVar.c);
        mzVar.e.f3.N(true);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        switch (this.a) {
        }
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean z(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.g0) this.b).run();
        return true;
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    private final /* synthetic */ void n(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ow0
    public /* synthetic */ void l() {
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }

    private final /* synthetic */ void h(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i(View view, float f7, float f10) {
    }
}
