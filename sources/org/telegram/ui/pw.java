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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0, oy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.tv0, org.telegram.ui.Components.ol0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, yt, FileLoader.FileResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean H(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.tv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        gd0 gd0Var = new gd0(2);
        gd0Var.u0(sharingLocationInfo.messageObject);
        gd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(gd0Var);
    }

    @Override // org.telegram.ui.yt
    public void b1(ut utVar) {
        kn0 kn0Var = (kn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = kn0Var.Y[intValue];
        if (intValue == 5) {
            kn0Var.s = utVar.d;
        } else {
            kn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.a);
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 2:
                FiltersSetupActivity.S((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.S((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        gd0 gd0Var = (gd0) this.b;
        Context context = (Context) this.c;
        if (gd0Var.G0 == 2) {
            Object J = gd0Var.T.J(i10);
            if (J instanceof ad0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, gd0Var.getParentActivity(), gd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new tv(16, gd0Var, (ad0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                yc0 yc0Var = new yc0(gd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                gd0Var.I0 = yc0Var;
                yc0Var.setOutsideTouchable(true);
                gd0Var.I0.setClippingEnabled(true);
                gd0Var.I0.setInputMethodMode(2);
                gd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                gd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                gd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        gd0 gd0Var = (gd0) this.b;
        ad0 ad0Var = (ad0) this.c;
        gd0Var.getClass();
        if (!z10 || z11 || ad0Var.e == null || (g02 = gd0Var.g0(ad0Var)) == null) {
            return;
        }
        ad0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 1:
                ly lyVar = (ly) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                lyVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                uy uyVar = lyVar.b;
                uyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uyVar.getMessagesController().removeFilter(dialogFilter);
                uyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 2:
            case 7:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 25:
            default:
                so0 so0Var = (so0) obj2;
                so0Var.b0 = true;
                so0Var.a0.email_unconfirmed_pattern = (String) obj;
                so0Var.J0();
                break;
            case 3:
                d20 d20Var = (d20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = d20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ca(d20Var, b2Var2, dialogFilter2, 10));
                break;
            case 4:
                h60 h60Var = (h60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = h60Var.d;
                if (!h60Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(h60Var.i1(), (TLRPC.User) null, chat, false, false);
                        h60Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(h60Var.i1(), user);
                        h60Var.k1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        h60Var.a1.addKickedUser(user2.id);
                        h60Var.k1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 5:
                d70 d70Var = (d70) obj2;
                d70Var.x.c((TLRPC.User) obj);
                if (d70Var.f.r.length() > 0) {
                    d70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 6:
                d70 d70Var2 = (d70) obj2;
                d70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                d70Var2.m0(i12);
                break;
            case 8:
                LanguageSelectActivity.W((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ug0) obj);
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 18:
                ((ke0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 19:
                ne0 ne0Var = (ne0) obj2;
                ne0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ne0Var.r);
                bundle.putString("requestPhone", ne0Var.s);
                bundle.putString("phoneHash", ne0Var.v);
                bundle.putString("phoneCode", ne0Var.w);
                ne0Var.y.u1(7, true, bundle, false);
                break;
            case 21:
                xf0.o((xf0) obj2, (Context) obj);
                break;
            case 23:
                kn0 kn0Var = (kn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!kn0Var.v0) {
                    kn0Var.s1.clear();
                }
                kn0Var.t1.clear();
                nm0 nm0Var = (nm0) kn0Var.B1;
                nm0Var.d.j1(kn0Var.E, kn0Var.F, kn0Var.G, zArr[0], null, null, nm0Var.b);
                kn0Var.finishFragment();
                break;
            case 24:
                int[] iArr = ((kn0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 26:
                kn0.S((kn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 28:
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
            case 17:
                ee0 ee0Var = (ee0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                ug0 ug0Var = ee0Var.W;
                if (ug0Var.getParentActivity() != null) {
                    ug0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                jf0 jf0Var = (jf0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                ug0 ug0Var2 = jf0Var.E;
                if (ug0Var2.getParentActivity() != null && !ug0Var2.getParentActivity().isFinishing()) {
                    ug0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
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

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        o80 o80Var = (o80) this.c;
        uy uyVar2 = (uy) this.b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = o80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        o80Var.d0.saveKeepMediaExceptions(o80Var.c0, o80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, o80Var.c0);
        l80 l80Var = new l80(bundle, uyVar2);
        l80Var.d = o80Var.f0;
        l80Var.S();
        o80Var.g0.presentFragment(l80Var);
        AndroidUtilities.runOnUIThread(new cu(26, l80Var, keepMediaException), 150L);
        return true;
    }

    public /* synthetic */ pw(o80 o80Var, uy uyVar) {
        this.a = 7;
        this.c = o80Var;
        this.b = uyVar;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
