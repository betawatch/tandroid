package org.telegram.ui.Components;

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
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements gj0, ij0, org.telegram.ui.ActionBar.p1, org.telegram.ui.nw, ys0, hj0, org.telegram.messenger.ec, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i41(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        switch (this.a) {
            case 0:
                l41 l41Var = (l41) this.b;
                org.telegram.messenger.s10 s10Var = (org.telegram.messenger.s10) this.c;
                r31 G = l41Var.g3.G(i3);
                if (G != null) {
                    s10Var.j(G, view, Integer.valueOf(i3), Float.valueOf(f10), Float.valueOf(f11));
                    break;
                }
                break;
            case 7:
                DataSettingsActivity.Z((DataSettingsActivity) this.b, (Context) this.c, view, i3, f10);
                break;
            case 11:
                org.telegram.ui.uw.g0((org.telegram.ui.uw) this.b, (org.telegram.ui.tw) this.c, view, i3);
                break;
            default:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.b, (Context) this.c, view, i3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ys0
    public void c(org.telegram.messenger.kd kdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.E1;
        int i3 = kdVar.h.I1;
        iArr[0] = i3;
        launchActivity.O0(i3);
        org.telegram.ui.la0 la0Var = new org.telegram.ui.la0(2);
        la0Var.G0(kdVar.h);
        la0Var.H0 = new ei.c1(iArr, org.telegram.messenger.zi.B0(kdVar.h.k), 10);
        launchActivity.t0(la0Var);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) this.b;
        Context context = (Context) this.c;
        if (la0Var.I0 == 2) {
            Object I = la0Var.Q.I(i3);
            if (I instanceof org.telegram.ui.ha0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, la0Var.getParentActivity(), la0Var.getResourceProvider(), true, true);
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j(org.telegram.messenger.bd.M0(2131750481, null), R.drawable.filled_directions, null);
                y0Var.setOnClickListener(new ux0(29, la0Var, (org.telegram.ui.ha0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ga0 ga0Var = new org.telegram.ui.ga0(la0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                la0Var.K0 = ga0Var;
                ga0Var.setOutsideTouchable(true);
                la0Var.K0.setClippingEnabled(true);
                la0Var.K0.setInputMethodMode(2);
                la0Var.K0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                la0Var.K0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                la0Var.K0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ConferenceCall conferenceCall;
        int i10 = this.a;
        org.telegram.ui.ActionBar.s1 s1Var2 = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 3:
                Context context = (Context) obj2;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj));
                context.startActivity(intent);
                break;
            case 4:
                org.telegram.ui.lr lrVar = (org.telegram.ui.lr) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                lrVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                lrVar.getContactsController().i(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                lrVar.finishFragment();
                break;
            case 5:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.tr trVar = contactsActivity.V;
                if (trVar != null) {
                    trVar.c(user2);
                    contactsActivity.V = null;
                    break;
                }
                break;
            case 6:
                ContactsActivity.Z((ContactsActivity) obj2, (String) obj);
                break;
            case 7:
            case 9:
            case 11:
            case 13:
            case 18:
            default:
                ((org.telegram.ui.qb0) obj2).H.x1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 8:
                org.telegram.ui.yt.Z((org.telegram.ui.yt) obj2, (TLRPC.User) obj);
                break;
            case 10:
                org.telegram.messenger.li mediaDataController = ((org.telegram.ui.uw) obj2).getMediaDataController();
                long j10 = ((TLRPC.User) obj).id;
                for (int i12 = 0; i12 < mediaDataController.m1.size(); i12++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i12)).peer.user_id == j10) {
                        mediaDataController.m1.remove(i12);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j10);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ei.u5(11));
                        mediaDataController.getMessagesStorage().a.c(new ci.i9(mediaDataController, j10, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = moVar.a;
                org.telegram.ui.uw uwVar = ((org.telegram.ui.kw) obj2).b;
                uwVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uwVar.getMessagesController().h4(moVar);
                org.telegram.messenger.qr messagesStorage = uwVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.pq(i11, messagesStorage, moVar));
                break;
            case 14:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj2;
                org.telegram.messenger.mo moVar2 = (org.telegram.messenger.mo) obj;
                FiltersSetupActivity filtersSetupActivity = c00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, filtersSetupActivity.getParentActivity(), null);
                    s1Var3.j0 = false;
                    s1Var3.show();
                    s1Var2 = s1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = moVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new org.telegram.ui.y9(c00Var, s1Var2, moVar2, 10));
                break;
            case 15:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = x30Var.l1;
                if (x30Var.q1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user3.id);
                        org.telegram.messenger.r3 r3Var = x30Var.S2;
                        long j11 = user3.id;
                        ArrayList arrayList2 = r3Var.o;
                        if (!arrayList2.contains(Long.valueOf(j11))) {
                            arrayList2.add(Long.valueOf(j11));
                            r3Var.z();
                            org.telegram.messenger.hs.f(r3Var.C.a).k(org.telegram.messenger.hs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                        }
                        x30Var.m1().k(0L, org.telegram.messenger.hs.n1, user3, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user4 = (TLRPC.User) tLObject;
                    org.telegram.messenger.hp.s1(cVar.a).f0(x30Var.k1(), user4);
                    x30Var.m1().k(0L, 32, user4, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.hp.s1(cVar.a).g0(x30Var.k1(), null, chat, false, false);
                    x30Var.m1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.r40 r40Var = (org.telegram.ui.r40) obj2;
                r40Var.y.e((TLRPC.User) obj);
                if (r40Var.f.r.length() > 0) {
                    r40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.r40 r40Var2 = (org.telegram.ui.r40) obj2;
                r40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i11 = 100;
                }
                r40Var2.r0(i11);
                break;
            case 19:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.yc) obj);
                break;
            case 20:
                String str = LaunchActivity.E1;
                ((LaunchActivity) obj2).t0((org.telegram.ui.xd0) obj);
                break;
            case 21:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.bd.E0().d(((org.telegram.messenger.yc[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) this.b;
        org.telegram.ui.ha0 ha0Var = (org.telegram.ui.ha0) this.c;
        if (!z10 || z11 || ha0Var.e == null || (n02 = la0Var.n0(ha0Var)) == null) {
            return;
        }
        ha0Var.e.a.a(b8.wd.a(n02));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        org.telegram.ui.lb0 lb0Var = (org.telegram.ui.lb0) this.b;
        a9.j0 j0Var = (a9.j0) this.c;
        org.telegram.ui.xd0 xd0Var = lb0Var.a0;
        if (xd0Var.getParentActivity() == null) {
            return;
        }
        xd0Var.getParentActivity().startActivityForResult(j0Var.f(), org.telegram.messenger.hs.e3);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.nw
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        org.telegram.ui.y50 y50Var = (org.telegram.ui.y50) this.b;
        org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) this.c;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = y50Var.g0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.pr) arrayList.get(i11)).a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        y50Var.e0.h(y50Var.d0, y50Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, y50Var.d0);
        org.telegram.ui.u50 u50Var = new org.telegram.ui.u50(bundle, uwVar2);
        u50Var.d = y50Var.g0;
        u50Var.Z();
        y50Var.h0.presentFragment(u50Var);
        org.telegram.messenger.g0.i3(new org.telegram.ui.ly(11, u50Var, s2Var), 150L);
        return true;
    }

    public /* synthetic */ i41(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 5;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        l41 l41Var = (l41) this.b;
        org.telegram.messenger.t10 t10Var = (org.telegram.messenger.t10) this.c;
        r31 G = l41Var.g3.G(i3);
        if (G == null) {
            return false;
        }
        return t10Var.a(G, view, Integer.valueOf(i3), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
