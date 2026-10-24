package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, xx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.aw0, org.telegram.ui.Components.cm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ks(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean J(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
            case 1:
                break;
            case 4:
                break;
            case 7:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.aw0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.E1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.P0(i10);
        sc0 sc0Var = new sc0(2);
        sc0Var.u0(sharingLocationInfo.messageObject);
        sc0Var.F0 = new ci.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.u0(sc0Var);
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 1:
                DataSettingsActivity.U((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
            case 4:
                ey.c0((ey) this.b, (dy) this.c, view, i10);
                break;
            case 7:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        sc0 sc0Var = (sc0) this.b;
        Context context = (Context) this.c;
        if (sc0Var.G0 == 2) {
            Object J = sc0Var.T.J(i10);
            if (J instanceof mc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, sc0Var.getParentActivity(), sc0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.j(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new org.telegram.ui.Components.d51(27, sc0Var, (mc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                kc0 kc0Var = new kc0(sc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                sc0Var.I0 = kc0Var;
                kc0Var.setOutsideTouchable(true);
                sc0Var.I0.setClippingEnabled(true);
                sc0Var.I0.setInputMethodMode(2);
                sc0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                sc0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                sc0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap g02;
        sc0 sc0Var = (sc0) this.b;
        mc0 mc0Var = (mc0) this.c;
        sc0Var.getClass();
        if (!z10 || z11 || mc0Var.e == null || (g02 = sc0Var.g0(mc0Var)) == null) {
            return;
        }
        mc0Var.e.setIcon(g02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ts tsVar = contactsActivity.W;
                if (tsVar != null) {
                    tsVar.b(user);
                    contactsActivity.W = null;
                    break;
                }
                break;
            case 1:
            case 4:
            case 5:
            case 7:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 27:
            default:
                int[] iArr = ((an0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 2:
                cv.U((cv) obj2, (TLRPC.User) obj);
                break;
            case 3:
                ((ey) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 6:
                dw dwVar = (dw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                ey eyVar = dwVar.b;
                eyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                eyVar.getMessagesController().removeFilter(dialogFilter);
                eyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 8:
                p10 p10Var = (p10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.i0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ca(p10Var, c2Var2, dialogFilter2, 10));
                break;
            case 9:
                u50 u50Var = (u50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = u50Var.d;
                if (!u50Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(u50Var.i1(), (TLRPC.User) null, chat, false, false);
                        u50Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(u50Var.i1(), user2);
                        u50Var.k1().k(0L, 32, user2, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user3.id);
                        u50Var.a1.addKickedUser(user3.id);
                        u50Var.k1().k(0L, 102, user3, null, null, null);
                        break;
                    }
                }
                break;
            case 10:
                p60 p60Var = (p60) obj2;
                p60Var.x.h((TLRPC.User) obj);
                if (p60Var.f.r.length() > 0) {
                    p60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 11:
                p60 p60Var2 = (p60) obj2;
                p60Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i12 = 100;
                }
                p60Var2.m0(i12);
                break;
            case 13:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 14:
                Pattern pattern = LaunchActivity.E1;
                ((LaunchActivity) obj2).u0((ig0) obj);
                break;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.E1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.z0(true);
                break;
            case 23:
                ((xd0) obj2).G.s1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 24:
                be0 be0Var = (be0) obj2;
                be0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", be0Var.r);
                bundle.putString("requestPhone", be0Var.s);
                bundle.putString("phoneHash", be0Var.v);
                bundle.putString("phoneCode", be0Var.w);
                be0Var.y.y1(7, true, bundle, false);
                break;
            case 26:
                mf0.n((mf0) obj2, (Context) obj);
                break;
            case 28:
                an0 an0Var = (an0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!an0Var.v0) {
                    an0Var.s1.clear();
                }
                an0Var.t1.clear();
                dm0 dm0Var = (dm0) an0Var.B1;
                dm0Var.d.i1(an0Var.E, an0Var.F, an0Var.G, zArr[0], null, null, dm0Var.b);
                an0Var.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 22:
                rd0 rd0Var = (rd0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                ig0 ig0Var = rd0Var.W;
                if (ig0Var.getParentActivity() != null) {
                    ig0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                ye0 ye0Var = (ye0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                ig0 ig0Var2 = ye0Var.E;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing()) {
                    ig0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.E1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        c80 c80Var = (c80) this.b;
        ey eyVar2 = (ey) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = c80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        c80Var.d0.saveKeepMediaExceptions(c80Var.c0, c80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, c80Var.c0);
        y70 y70Var = new y70(bundle, eyVar2);
        y70Var.d = c80Var.f0;
        y70Var.U();
        c80Var.g0.presentFragment(y70Var);
        AndroidUtilities.runOnUIThread(new ot(28, y70Var, keepMediaException), 150L);
        return true;
    }

    public /* synthetic */ ks(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 0;
        this.b = contactsActivity;
        this.c = user;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }

    private final /* synthetic */ void h(View view, float f7, float f10) {
    }
}
