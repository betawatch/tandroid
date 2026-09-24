package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0, ky, ContactsLoadingObserver.Callback, org.telegram.ui.Components.mv0, org.telegram.ui.Components.ml0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, vt, FileLoader.FileResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public void a1(qt qtVar) {
        gn0 gn0Var = (gn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = gn0Var.Y[intValue];
        if (intValue == 5) {
            gn0Var.s = qtVar.d;
        } else {
            gn0Var.v = qtVar.d;
        }
        editTextBoldCursor.setText(qtVar.a);
    }

    @Override // org.telegram.ui.Components.mv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        cd0 cd0Var = new cd0(2);
        cd0Var.u0(sharingLocationInfo.messageObject);
        cd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(cd0Var);
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        cd0 cd0Var = (cd0) this.b;
        Context context = (Context) this.c;
        if (cd0Var.G0 == 2) {
            Object J = cd0Var.T.J(i10);
            if (J instanceof wc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, cd0Var.getParentActivity(), cd0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new ov(16, cd0Var, (wc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                uc0 uc0Var = new uc0(cd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                cd0Var.I0 = uc0Var;
                uc0Var.setOutsideTouchable(true);
                cd0Var.I0.setClippingEnabled(true);
                cd0Var.I0.setInputMethodMode(2);
                cd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                cd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                cd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        cd0 cd0Var = (cd0) this.b;
        wc0 wc0Var = (wc0) this.c;
        cd0Var.getClass();
        if (!z10 || z11 || wc0Var.e == null || (g02 = cd0Var.g0(wc0Var)) == null) {
            return;
        }
        wc0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                pw pwVar = (pw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                pwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                qy qyVar = pwVar.b;
                qyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                qyVar.getMessagesController().removeFilter(dialogFilter);
                qyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 1:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 24:
            default:
                PhotoViewer.B(((ks0) obj2).b, (ArrayList) obj);
                break;
            case 2:
                z10 z10Var = (z10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(z10Var, a2Var2, dialogFilter2, 10));
                break;
            case 3:
                d60 d60Var = (d60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = d60Var.d;
                if (!d60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), (TLRPC.User) null, chat, false, false);
                        d60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(d60Var.i1(), user);
                        d60Var.k1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        d60Var.a1.addKickedUser(user2.id);
                        d60Var.k1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 4:
                z60 z60Var = (z60) obj2;
                z60Var.x.g((TLRPC.User) obj);
                if (z60Var.f.r.length() > 0) {
                    z60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 5:
                z60 z60Var2 = (z60) obj2;
                z60Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                z60Var2.m0(i12);
                break;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((qg0) obj);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 17:
                ((ge0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 18:
                je0 je0Var = (je0) obj2;
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", je0Var.r);
                bundle.putString("requestPhone", je0Var.s);
                bundle.putString("phoneHash", je0Var.v);
                bundle.putString("phoneCode", je0Var.w);
                je0Var.y.u1(7, true, bundle, false);
                break;
            case 20:
                tf0.o((tf0) obj2, (Context) obj);
                break;
            case 22:
                gn0 gn0Var = (gn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!gn0Var.v0) {
                    gn0Var.s1.clear();
                }
                gn0Var.t1.clear();
                jm0 jm0Var = (jm0) gn0Var.B1;
                jm0Var.d.j1(gn0Var.E, gn0Var.F, gn0Var.G, zArr[0], null, null, jm0Var.b);
                gn0Var.finishFragment();
                break;
            case 23:
                int[] iArr = ((gn0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 25:
                gn0.U((gn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 26:
                oo0 oo0Var = (oo0) obj2;
                oo0Var.b0 = true;
                oo0Var.a0.email_unconfirmed_pattern = (String) obj;
                oo0Var.J0();
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.T).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.T).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 16:
                ae0 ae0Var = (ae0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                qg0 qg0Var = ae0Var.W;
                if (qg0Var.getParentActivity() != null) {
                    qg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                ff0 ff0Var = (ff0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                qg0 qg0Var2 = ff0Var.E;
                if (qg0Var2.getParentActivity() != null && !qg0Var2.getParentActivity().isFinishing()) {
                    qg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        k80 k80Var = (k80) this.b;
        qy qyVar2 = (qy) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = k80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        k80Var.d0.saveKeepMediaExceptions(k80Var.c0, k80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, k80Var.c0);
        h80 h80Var = new h80(bundle, qyVar2);
        h80Var.d = k80Var.f0;
        h80Var.U();
        k80Var.g0.presentFragment(h80Var);
        AndroidUtilities.runOnUIThread(new tt(29, h80Var, keepMediaException), 150L);
        return true;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
