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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, sy, ContactsLoadingObserver.Callback, org.telegram.ui.Components.aw0, org.telegram.ui.Components.cm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, eu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        nd0 nd0Var = (nd0) this.b;
        Context context = (Context) this.c;
        if (nd0Var.G0 == 2) {
            Object J = nd0Var.T.J(i10);
            if (J instanceof hd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, nd0Var.getParentActivity(), nd0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new xv(16, nd0Var, (hd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                fd0 fd0Var = new fd0(nd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                nd0Var.I0 = fd0Var;
                fd0Var.setOutsideTouchable(true);
                nd0Var.I0.setClippingEnabled(true);
                nd0Var.I0.setInputMethodMode(2);
                nd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                nd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                nd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.eu
    public void a1(au auVar) {
        un0 un0Var = (un0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = un0Var.Y[intValue];
        if (intValue == 5) {
            un0Var.s = auVar.d;
        } else {
            un0Var.v = auVar.d;
        }
        editTextBoldCursor.setText(auVar.a);
    }

    @Override // org.telegram.ui.Components.aw0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        nd0 nd0Var = new nd0(2);
        nd0Var.t0(sharingLocationInfo.messageObject);
        nd0Var.F0 = new bi.p1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(nd0Var);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 1:
                break;
            case 4:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 1:
                yy.c0((yy) this.b, (xy) this.c, view, i10);
                break;
            case 4:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        nd0 nd0Var = (nd0) this.b;
        hd0 hd0Var = (hd0) this.c;
        nd0Var.getClass();
        if (!z10 || z11 || hd0Var.e == null || (f02 = nd0Var.f0(hd0Var)) == null) {
            return;
        }
        hd0Var.e.setIcon(f02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.a2 a2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((yy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 1:
            case 2:
            case 4:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 27:
            default:
                cp0 cp0Var = (cp0) obj2;
                cp0Var.b0 = true;
                cp0Var.a0.email_unconfirmed_pattern = (String) obj;
                cp0Var.J0();
                break;
            case 3:
                xw xwVar = (xw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                xwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                yy yyVar = xwVar.b;
                yyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                yyVar.getMessagesController().removeFilter(dialogFilter);
                yyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 5:
                i20 i20Var = (i20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = i20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(filtersSetupActivity.getParentActivity(), 3, null);
                    a2Var3.g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new fa(i20Var, a2Var2, dialogFilter2, 10));
                break;
            case 6:
                n60 n60Var = (n60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = n60Var.d;
                if (!n60Var.p1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(n60Var.j1(), (TLRPC.User) null, chat, false, false);
                        n60Var.l1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(n60Var.j1(), user);
                        n60Var.l1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        n60Var.a1.addKickedUser(user2.id);
                        n60Var.l1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 7:
                j70 j70Var = (j70) obj2;
                j70Var.x.h((TLRPC.User) obj);
                if (j70Var.f.r.length() > 0) {
                    j70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 8:
                j70 j70Var2 = (j70) obj2;
                j70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var4 = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var4 != null && a2Var4.b()) {
                    i12 = 100;
                }
                j70Var2.m0(i12);
                break;
            case 10:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 11:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((bh0) obj);
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 20:
                ((re0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 21:
                ue0 ue0Var = (ue0) obj2;
                ue0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ue0Var.r);
                bundle.putString("requestPhone", ue0Var.s);
                bundle.putString("phoneHash", ue0Var.v);
                bundle.putString("phoneCode", ue0Var.w);
                ue0Var.y.u1(7, true, bundle, false);
                break;
            case 23:
                eg0.o((eg0) obj2, (Context) obj);
                break;
            case 25:
                un0 un0Var = (un0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!un0Var.v0) {
                    un0Var.s1.clear();
                }
                un0Var.t1.clear();
                wm0 wm0Var = (wm0) un0Var.B1;
                wm0Var.d.i1(un0Var.E, un0Var.F, un0Var.G, zArr[0], null, null, wm0Var.b);
                un0Var.finishFragment();
                break;
            case 26:
                int[] iArr = ((un0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 28:
                un0.U((un0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 19:
                le0 le0Var = (le0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.c;
                bh0 bh0Var = le0Var.W;
                if (bh0Var.getParentActivity() != null) {
                    bh0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    break;
                }
                break;
            default:
                qf0 qf0Var = (qf0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.c;
                bh0 bh0Var2 = qf0Var.E;
                if (bh0Var2.getParentActivity() != null && !bh0Var2.getParentActivity().isFinishing()) {
                    bh0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
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

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        t80 t80Var = (t80) this.c;
        yy yyVar2 = (yy) this.b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = t80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        t80Var.d0.saveKeepMediaExceptions(t80Var.c0, t80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, t80Var.c0);
        q80 q80Var = new q80(bundle, yyVar2);
        q80Var.d = t80Var.f0;
        q80Var.U();
        t80Var.g0.presentFragment(q80Var);
        AndroidUtilities.runOnUIThread(new o00(15, q80Var, keepMediaException), 150L);
        return true;
    }

    public /* synthetic */ gw(t80 t80Var, yy yyVar) {
        this.a = 9;
        this.c = t80Var;
        this.b = yyVar;
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
