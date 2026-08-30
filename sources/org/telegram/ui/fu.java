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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.ui.Components.tv0, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, org.telegram.ui.Components.yg0, Utilities.Callback5, org.telegram.ui.Components.ud0, org.telegram.ui.ActionBar.n1, org.telegram.ui.Components.fl0, tf.j1, org.telegram.ui.Components.kl0, r0.o, org.telegram.ui.Components.jl0, xt, xd.b, jj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fu(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // tf.j1
    public /* synthetic */ a0.h I() {
        switch (this.a) {
        }
        return null;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        xg0 xg0Var = (xg0) this.b;
        xg0Var.getClass();
        xg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        xg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        ma0 ma0Var = (ma0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ma0Var.a.equals(defaultWindowInsets)) {
            ma0Var.a = defaultWindowInsets;
            ma0Var.requestLayout();
        }
        int childCount = ma0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(ma0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override // tf.j1
    public /* synthetic */ boolean Q(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // tf.j1
    public /* synthetic */ void T(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.jj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.xt
    public void b1(st stVar) {
        mg0 mg0Var = (mg0) this.b;
        mg0Var.F = true;
        String str = stVar.c;
        mg0Var.a.setText(str);
        mg0Var.v(str, stVar);
        mg0Var.y = stVar;
        mg0Var.x = 0;
        mg0Var.F = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + stVar.c, stVar.d).apply();
        AndroidUtilities.runOnUIThread(new cg0(mg0Var, 4), 300L);
        jg0 jg0Var = mg0Var.b;
        jg0Var.requestFocus();
        jg0Var.setSelection(jg0Var.length());
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                ec0 ec0Var = (ec0) this.b;
                ArrayList arrayList = ec0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    yb0 yb0Var = (yb0) arrayList.get(i10);
                    int i11 = yb0Var.a;
                    int i12 = yb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && yb0Var.f == 1) {
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
                        if (yb0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 <= AndroidUtilities.dp(75.0f)) && (U = ec0Var.U(i12)) != -1) {
                            ec0Var.n[U] = !r8[U];
                            ec0Var.Y();
                            ec0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            ec0Var.Y();
                            break;
                        }
                    } else {
                        ec0Var.e = org.telegram.ui.Components.qc.a0(ec0Var).L(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                pg0.U((pg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final aj0 aj0Var = (aj0) this.b;
                if (i10 >= aj0Var.F && i10 < aj0Var.G) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) aj0Var.x.get(i10 - aj0Var.F);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aj0Var.getParentActivity(), 0, aj0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.vi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.p2 p2Var = aj0.this;
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
                    aj0Var.showDialog(d2Var);
                    break;
                }
                break;
            default:
                ok0 ok0Var = (ok0) this.b;
                ok0Var.getClass();
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    ok0Var.Z(nk0Var.e);
                    nk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // tf.j1
    public void g(int i10) {
        switch (this.a) {
            case 11:
                w60 w60Var = (w60) this.b;
                y60 y60Var = w60Var.F;
                y60Var.q0(w60Var.E);
                if (w60Var.h == null && !w60Var.f.e() && w60Var.h() == 0) {
                    y60Var.s.e(false, true);
                }
                w60Var.l();
                break;
            default:
                gk0 gk0Var = (gk0) this.b;
                if (gk0Var.f == null && !gk0Var.h.e()) {
                    gk0Var.n.c.c();
                }
                gk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((gu) this.b).d;
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
            org.telegram.ui.Components.sl0 sl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            f2.l1 K = sl0Var.K(i15 + i19);
            if (K != null) {
                gu guVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                guVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.F = true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
                ((g70) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                yd0 yd0Var = (yd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", yd0Var.F);
                bundle.putString("ephone", yd0Var.G);
                bundle.putString("phoneFormated", yd0Var.I);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = yd0Var.I;
                tL_auth_resetLoginEmail.phone_code_hash = yd0Var.J;
                yd0Var.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new pd0(yd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                he0 he0Var = (he0) obj;
                ng0.n0(he0Var.y, he0Var.s, he0Var.v, he0Var.w);
                break;
            case 19:
                af0 af0Var = (af0) obj;
                ng0 ng0Var = af0Var.B;
                ng0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(af0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.uj) obj).run();
                break;
            case 28:
                ok0 ok0Var = ((kk0) obj).b;
                SparseArray sparseArray = ok0Var.G;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    mk0 mk0Var = (mk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = mk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        gf.e eVar = ok0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = mk0Var.e;
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
                    if (mk0Var.g != null && (fVar = ok0Var.getMediaDataController().ringtoneUploaderHashMap.get(mk0Var.g)) != null) {
                        fVar.c = true;
                        fVar.a();
                        int i16 = fVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = fVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (mk0Var == ok0Var.E) {
                        ok0Var.K = null;
                        ok0Var.E = (mk0) ok0Var.b.get(0);
                        ok0Var.F = true;
                    }
                    ok0Var.a.remove(mk0Var);
                    ok0Var.c.remove(mk0Var);
                }
                ok0Var.getMediaDataController().ringtoneDataStore.h();
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
                    ok0Var.getConnectionsManager().sendRequest(saveringtone, new nh.p5(4));
                }
                ok0.W(ok0Var);
                ok0Var.c0();
                ok0Var.f.l();
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
                            ((org.telegram.ui.Cells.aa) childAt).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false));
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

    @Override // org.telegram.ui.Components.ud0
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        wz wzVar = (wz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && wzVar.x.isShowing()) {
            wzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.fl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // tf.j1
    public /* synthetic */ a0.h t() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                hz hzVar = (hz) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.i51) obj).d == 1 && hzVar.b != null) {
                    boolean z4 = !hzVar.c;
                    hzVar.c = z4;
                    dh.v vVar = hzVar.f;
                    if (vVar != null) {
                        vVar.run(Boolean.valueOf(z4), Boolean.valueOf(hzVar.d));
                    }
                    ((org.telegram.ui.Cells.s8) view).setChecked(hzVar.c);
                    hzVar.e.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.sl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.sl0) this.b).m2);
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

    @Override // org.telegram.ui.Components.tv0
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
