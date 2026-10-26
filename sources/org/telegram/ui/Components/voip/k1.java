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
import org.telegram.messenger.o5;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af1;
import org.telegram.ui.ay;
import org.telegram.ui.b80;
import org.telegram.ui.cy;
import org.telegram.ui.ea;
import org.telegram.ui.gg0;
import org.telegram.ui.hc0;
import org.telegram.ui.jc0;
import org.telegram.ui.js;
import org.telegram.ui.od0;
import org.telegram.ui.p10;
import org.telegram.ui.pc0;
import org.telegram.ui.r60;
import org.telegram.ui.rs;
import org.telegram.ui.rx;
import org.telegram.ui.sz;
import org.telegram.ui.ud0;
import org.telegram.ui.ux;
import org.telegram.ui.v50;
import org.telegram.ui.ve0;
import org.telegram.ui.x70;
import org.telegram.ui.yd0;
import org.telegram.ui.zu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements org.telegram.ui.ActionBar.b2, am0, ux, ContactsLoadingObserver.Callback, dw0, bm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean K(cy cyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        pc0 pc0Var = (pc0) this.c;
        Context context = (Context) this.b;
        if (pc0Var.F0 == 2) {
            Object J = pc0Var.T.J(i10);
            if (J instanceof jc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, pc0Var.getParentActivity(), pc0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.j(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new k51(27, pc0Var, (jc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                hc0 hc0Var = new hc0(pc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pc0Var.H0 = hc0Var;
                hc0Var.setOutsideTouchable(true);
                pc0Var.H0.setClippingEnabled(true);
                pc0Var.H0.setInputMethodMode(2);
                pc0Var.H0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pc0Var.H0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                pc0Var.H0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 5:
                break;
            case 8:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dw0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.b;
        Pattern pattern = LaunchActivity.D1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.P0(i10);
        pc0 pc0Var = new pc0(2);
        pc0Var.v0(sharingLocationInfo.messageObject);
        pc0Var.E0 = new di.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.u0(pc0Var);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap h02;
        pc0 pc0Var = (pc0) this.c;
        jc0 jc0Var = (jc0) this.b;
        pc0Var.getClass();
        if (!z10 || z11 || jc0Var.e == null || (h02 = pc0Var.h0(jc0Var)) == null) {
            return;
        }
        jc0Var.e.setIcon(h02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        o5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 5:
                DataSettingsActivity.V((DataSettingsActivity) this.c, (Context) this.b, view, i10, f7);
                break;
            case 8:
                cy.e0((cy) this.c, (ay) this.b, view, i10);
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
                js jsVar = (js) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                jsVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                jsVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                jsVar.finishFragment();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                rs rsVar = contactsActivity.U;
                if (rsVar != null) {
                    rsVar.b(user2);
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
                yd0 yd0Var = (yd0) obj2;
                yd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", yd0Var.r);
                bundle.putString("requestPhone", yd0Var.s);
                bundle.putString("phoneHash", yd0Var.v);
                bundle.putString("phoneCode", yd0Var.w);
                yd0Var.y.z1(7, true, bundle, false);
                break;
            case 6:
                zu.V((zu) obj2, (TLRPC.User) obj);
                break;
            case 7:
                ((cy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 10:
                rx rxVar = (rx) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                rxVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                cy cyVar = rxVar.b;
                cyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cyVar.getMessagesController().removeFilter(dialogFilter);
                cyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 12:
                p10 p10Var = (p10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(filtersSetupActivity.getParentActivity(), 3, null);
                    e2Var3.i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ea(p10Var, e2Var2, dialogFilter2, 10));
                break;
            case 13:
                v50 v50Var = (v50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = v50Var.d;
                if (!v50Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(v50Var.i1(), (TLRPC.User) null, chat, false, false);
                        v50Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(v50Var.i1(), user3);
                        v50Var.k1().k(0L, 32, user3, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user4 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user4.id);
                        v50Var.a1.addKickedUser(user4.id);
                        v50Var.k1().k(0L, 102, user4, null, null, null);
                        break;
                    }
                }
                break;
            case 14:
                r60 r60Var = (r60) obj2;
                r60Var.x.e((TLRPC.User) obj);
                if (r60Var.f.r.length() > 0) {
                    r60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 15:
                r60 r60Var2 = (r60) obj2;
                r60Var2.getClass();
                org.telegram.ui.Cells.y1 y1Var = ((org.telegram.ui.Cells.y1[]) obj)[0];
                if (y1Var != null && y1Var.b()) {
                    i12 = 100;
                }
                r60Var2.n0(i12);
                break;
            case 17:
                LanguageSelectActivity.Y((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 18:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).u0((gg0) obj);
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.z0(true);
                break;
            case 27:
                ((ud0) obj2).G.t1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        o5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 26:
                od0 od0Var = (od0) this.c;
                a6.a aVar = (a6.a) this.b;
                gg0 gg0Var = od0Var.W;
                if (gg0Var.getParentActivity() != null) {
                    gg0Var.getParentActivity().startActivityForResult(aVar.f(), 200);
                    break;
                }
                break;
            default:
                ve0 ve0Var = (ve0) this.c;
                a6.a aVar2 = (a6.a) this.b;
                gg0 gg0Var2 = ve0Var.E;
                if (gg0Var2.getParentActivity() != null && !gg0Var2.getParentActivity().isFinishing()) {
                    gg0Var2.getParentActivity().startActivityForResult(aVar2.f(), 200);
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

    @Override // org.telegram.ui.ux
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        b80 b80Var = (b80) this.c;
        cy cyVar2 = (cy) this.b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = b80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        b80Var.d0.saveKeepMediaExceptions(b80Var.c0, b80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, b80Var.c0);
        x70 x70Var = new x70(bundle, cyVar2);
        x70Var.d = b80Var.f0;
        x70Var.V();
        b80Var.g0.presentFragment(x70Var);
        AndroidUtilities.runOnUIThread(new sz(15, x70Var, keepMediaException), 150L);
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
