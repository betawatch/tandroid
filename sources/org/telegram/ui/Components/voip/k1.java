package org.telegram.ui.Components.voip;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.p5;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ae0;
import org.telegram.ui.bv;
import org.telegram.ui.cf1;
import org.telegram.ui.d80;
import org.telegram.ui.dy;
import org.telegram.ui.ea;
import org.telegram.ui.ey;
import org.telegram.ui.ig0;
import org.telegram.ui.jc0;
import org.telegram.ui.kz;
import org.telegram.ui.lc0;
import org.telegram.ui.ls;
import org.telegram.ui.qd0;
import org.telegram.ui.r10;
import org.telegram.ui.rc0;
import org.telegram.ui.t60;
import org.telegram.ui.ts;
import org.telegram.ui.ux;
import org.telegram.ui.wd0;
import org.telegram.ui.x50;
import org.telegram.ui.xe0;
import org.telegram.ui.xx;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements org.telegram.ui.ActionBar.b2, bm0, xx, ContactsLoadingObserver.Callback, ew0, cm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        rc0 rc0Var = (rc0) this.c;
        Context context = (Context) this.b;
        if (rc0Var.F0 == 2) {
            Object J = rc0Var.T.J(i10);
            if (J instanceof lc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, rc0Var.getParentActivity(), rc0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.j(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new l51(27, rc0Var, (lc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                jc0 jc0Var = new jc0(rc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                rc0Var.H0 = jc0Var;
                jc0Var.setOutsideTouchable(true);
                rc0Var.H0.setClippingEnabled(true);
                rc0Var.H0.setInputMethodMode(2);
                rc0Var.H0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                rc0Var.H0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                rc0Var.H0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 5:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ew0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.b;
        Pattern pattern = LaunchActivity.D1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.P0(i10);
        rc0 rc0Var = new rc0(2);
        rc0Var.v0(sharingLocationInfo.messageObject);
        rc0Var.E0 = new di.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.u0(rc0Var);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap h02;
        rc0 rc0Var = (rc0) this.c;
        lc0 lc0Var = (lc0) this.b;
        rc0Var.getClass();
        if (!z10 || z11 || lc0Var.e == null || (h02 = rc0Var.h0(lc0Var)) == null) {
            return;
        }
        lc0Var.e.setIcon(h02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 5:
                DataSettingsActivity.V((DataSettingsActivity) this.c, (Context) this.b, view, i10, f7);
                break;
            case 8:
                ey.e0((ey) this.c, (dy) this.b, view, i10);
                break;
            default:
                FiltersSetupActivity.V((FiltersSetupActivity) this.c, (Context) this.b, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.e2 e2Var2 = null;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 1:
                Context context = (Context) obj;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj2));
                context.startActivity(intent);
                break;
            case 2:
                ls lsVar = (ls) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                lsVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                lsVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                lsVar.finishFragment();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ts tsVar = contactsActivity.U;
                if (tsVar != null) {
                    tsVar.b(user2);
                    contactsActivity.U = null;
                    break;
                }
                break;
            case 4:
                ContactsActivity.V((ContactsActivity) obj2, (String) obj);
                break;
            case 5:
            case 8:
            case 9:
            case 11:
            case 16:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                ae0 ae0Var = (ae0) obj2;
                ae0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ae0Var.r);
                bundle.putString("requestPhone", ae0Var.s);
                bundle.putString("phoneHash", ae0Var.v);
                bundle.putString("phoneCode", ae0Var.w);
                ae0Var.y.z1(7, true, bundle, false);
                break;
            case 6:
                bv.V((bv) obj2, (TLRPC.User) obj);
                break;
            case 7:
                ((ey) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 10:
                ux uxVar = (ux) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                uxVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                ey eyVar = uxVar.b;
                eyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                eyVar.getMessagesController().removeFilter(dialogFilter);
                eyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 12:
                r10 r10Var = (r10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = r10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(filtersSetupActivity.getParentActivity(), 3, null);
                    e2Var3.i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ea(r10Var, e2Var2, dialogFilter2, 10));
                break;
            case 13:
                x50 x50Var = (x50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = x50Var.d;
                if (!x50Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(x50Var.i1(), (TLRPC.User) null, chat, false, false);
                        x50Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(x50Var.i1(), user3);
                        x50Var.k1().k(0L, 32, user3, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user4 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user4.id);
                        x50Var.a1.addKickedUser(user4.id);
                        x50Var.k1().k(0L, 102, user4, null, null, null);
                        break;
                    }
                }
                break;
            case 14:
                t60 t60Var = (t60) obj2;
                t60Var.x.e((TLRPC.User) obj);
                if (t60Var.f.r.length() > 0) {
                    t60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 15:
                t60 t60Var2 = (t60) obj2;
                t60Var2.getClass();
                org.telegram.ui.Cells.y1 y1Var = ((org.telegram.ui.Cells.y1[]) obj)[0];
                if (y1Var != null && y1Var.b()) {
                    i12 = 100;
                }
                t60Var2.n0(i12);
                break;
            case 17:
                LanguageSelectActivity.Y((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 18:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).u0((ig0) obj);
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.z0(true);
                break;
            case 27:
                ((wd0) obj2).G.t1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        p5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 26:
                qd0 qd0Var = (qd0) this.c;
                a6.a aVar = (a6.a) this.b;
                ig0 ig0Var = qd0Var.W;
                if (ig0Var.getParentActivity() != null) {
                    ig0Var.getParentActivity().startActivityForResult(aVar.f(), 200);
                    break;
                }
                break;
            default:
                xe0 xe0Var = (xe0) this.c;
                a6.a aVar2 = (a6.a) this.b;
                ig0 ig0Var2 = xe0Var.E;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing()) {
                    ig0Var2.getParentActivity().startActivityForResult(aVar2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Intent intent = (Intent) this.b;
        Pattern pattern = LaunchActivity.D1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.xx
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        d80 d80Var = (d80) this.c;
        ey eyVar2 = (ey) this.b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = d80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        d80Var.d0.saveKeepMediaExceptions(d80Var.c0, d80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, d80Var.c0);
        z70 z70Var = new z70(bundle, eyVar2);
        z70Var.d = d80Var.f0;
        z70Var.V();
        d80Var.g0.presentFragment(z70Var);
        AndroidUtilities.runOnUIThread(new kz(16, z70Var, keepMediaException), 150L);
        return true;
    }

    public /* synthetic */ k1(Context context, File file) {
        this.a = 1;
        this.b = context;
        this.c = file;
    }

    public /* synthetic */ k1(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 3;
        this.c = contactsActivity;
        this.b = user;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
