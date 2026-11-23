package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1, ww, org.telegram.ui.Components.lt0, org.telegram.ui.Components.sj0, org.telegram.messenger.kc, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.lt0
    public void b(org.telegram.messenger.qd qdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i7 = qdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        qa0 qa0Var = new qa0(2);
        qa0Var.G0(qdVar.h);
        qa0Var.M0 = new ai.d0(iArr, org.telegram.messenger.gj.B0(qdVar.h.k), 10);
        launchActivity.t0(qa0Var);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        qa0 qa0Var = (qa0) this.b;
        Context context = (Context) this.c;
        if (qa0Var.N0 == 2) {
            Object I = qa0Var.Q.I(i7);
            if (I instanceof ma0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, qa0Var.getParentActivity(), qa0Var.getResourceProvider(), true, true);
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j(org.telegram.messenger.hd.N0(2131750456, null), R.drawable.filled_directions, null);
                y0Var.setOnClickListener(new org.telegram.ui.Components.q31(25, qa0Var, (ma0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                la0 la0Var = new la0(qa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qa0Var.P0 = la0Var;
                la0Var.setOutsideTouchable(true);
                qa0Var.P0.setClippingEnabled(true);
                qa0Var.P0.setInputMethodMode(2);
                qa0Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                qa0Var.P0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                qa0Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 0:
                DataSettingsActivity.Z((DataSettingsActivity) this.b, (Context) this.c, view, i7, f10);
                break;
            case 4:
                cx.d0((cx) this.b, (bx) this.c, view, i7);
                break;
            case 6:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.b, (Context) this.c, view, i7);
                break;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i7, f10, f11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.a;
        int i12 = 3;
        org.telegram.ui.ActionBar.t1 t1Var2 = null;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 1:
                eu.Z((eu) obj2, (TLRPC.User) obj);
                break;
            case 2:
            case 4:
            case 6:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                hk0 hk0Var = (hk0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!hk0Var.w0) {
                    hk0Var.t1.clear();
                }
                hk0Var.u1.clear();
                mj0 mj0Var = (mj0) hk0Var.C1;
                mj0Var.d.n1(hk0Var.F, hk0Var.G, hk0Var.H, zArr[0], null, null, mj0Var.b);
                hk0Var.finishFragment();
                break;
            case 3:
                org.telegram.messenger.si mediaDataController = ((cx) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).id;
                for (int i15 = 0; i15 < mediaDataController.m1.size(); i15++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i15)).peer.user_id == j3) {
                        mediaDataController.m1.remove(i15);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().l1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.l5(11));
                        mediaDataController.getMessagesStorage().a.c(new di.c9(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = soVar.a;
                cx cxVar = ((tw) obj2).b;
                cxVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                cxVar.getMessagesController().p4(soVar);
                org.telegram.messenger.ur messagesStorage = cxVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.sq(i12, messagesStorage, soVar));
                break;
            case 7:
                j00 j00Var = (j00) obj2;
                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) obj;
                FiltersSetupActivity filtersSetupActivity = j00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, filtersSetupActivity.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = soVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(j00Var, t1Var2, soVar2, 10));
                break;
            case 8:
                f40 f40Var = (f40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = f40Var.o1;
                if (f40Var.s1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.t3 t3Var = f40Var.V2;
                        long j10 = user.id;
                        ArrayList arrayList = t3Var.o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            t3Var.z();
                            org.telegram.messenger.ls.f(t3Var.C.a).k(org.telegram.messenger.ls.w2, Long.valueOf(t3Var.c), Long.valueOf(t3Var.b.id), Boolean.FALSE);
                        }
                        f40Var.o1().k(0L, org.telegram.messenger.ls.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.u1(cVar.a).f0(f40Var.m1(), user2);
                    f40Var.o1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.np.u1(cVar.a).g0(f40Var.m1(), null, chat, false, false);
                    f40Var.o1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 9:
                z40 z40Var = (z40) obj2;
                z40Var.y.f((TLRPC.User) obj);
                if (z40Var.f.r.length() > 0) {
                    z40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 10:
                z40 z40Var2 = (z40) obj2;
                z40Var2.getClass();
                org.telegram.ui.Cells.d2 d2Var = ((org.telegram.ui.Cells.d2[]) obj)[0];
                z40Var2.r0((d2Var == null || !d2Var.b()) ? 0 : 100);
                break;
            case 12:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.dd) obj);
                break;
            case 13:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((de0) obj);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.hd.E0().d(((org.telegram.messenger.dd[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
            case 22:
                ((ub0) obj2).H.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 23:
                xb0 xb0Var = (xb0) obj2;
                xb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xb0Var.r);
                bundle.putString("requestPhone", xb0Var.s);
                bundle.putString("phoneHash", xb0Var.w);
                bundle.putString("phoneCode", xb0Var.x);
                xb0Var.E.M1(7, true, bundle, false);
                break;
            case 25:
                gd0.n((gd0) obj2, (Context) obj);
                break;
            case 26:
                ce0 ce0Var = (ce0) obj2;
                ((boolean[]) obj)[0] = true;
                if (ce0Var.o()) {
                    d3.b bVar = new d3.b(i13);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    ce0Var.b0 = cancellationTokenSource;
                    Context context = ce0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.g2) ce0Var.h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    h60 h60Var = new h60(29, ce0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    int i16 = 4;
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, i16));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.s2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.s2.e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    while (i14 < i16) {
                        org.telegram.messenger.k10 i17 = org.telegram.messenger.k10.i(i14);
                        if (i17.p()) {
                            arrayList2.add(Long.valueOf(i17.e()));
                        }
                        i14++;
                        i16 = 4;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.f9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(i13), new bi.m4(token, taskCompletionSource, runnableArr, nVar, context, h60Var, i10), 8), 0);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new at(27, ce0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new xd0(ce0Var)).addOnFailureListener(bVar, new xd0(ce0Var));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        qa0 qa0Var = (qa0) this.b;
        ma0 ma0Var = (ma0) this.c;
        if (!z10 || z11 || ma0Var.e == null || (n02 = qa0Var.n0(ma0Var)) == null) {
            return;
        }
        ma0Var.e.a.a(c8.r9.a(n02));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 21:
                pb0 pb0Var = (pb0) this.b;
                b9.k0 k0Var = (b9.k0) this.c;
                de0 de0Var = pb0Var.a0;
                if (de0Var.getParentActivity() != null) {
                    de0Var.getParentActivity().startActivityForResult(k0Var.f(), org.telegram.messenger.ls.e3);
                    break;
                }
                break;
            case 24:
                sc0 sc0Var = (sc0) this.b;
                b9.k0 k0Var2 = (b9.k0) this.c;
                de0 de0Var2 = sc0Var.F;
                if (de0Var2.getParentActivity() != null && !de0Var2.getParentActivity().isFinishing()) {
                    de0Var2.getParentActivity().startActivityForResult(k0Var2.f(), org.telegram.messenger.ls.e3);
                    break;
                }
                break;
            default:
                ce0 ce0Var = (ce0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = ce0Var.c0;
                if (t1Var != null) {
                    t1Var.dismiss();
                    ce0Var.c0 = null;
                }
                if (ce0Var.b0 == cancellationTokenSource) {
                    ce0Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        f60 f60Var = (f60) this.b;
        cx cxVar2 = (cx) this.c;
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = f60Var.g0;
            org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((org.telegram.messenger.tr) arrayList.get(i11)).a, 3);
            arrayList2.add(t2Var2);
            i11++;
            t2Var = t2Var2;
        }
        f60Var.e0.h(f60Var.d0, f60Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, f60Var.d0);
        b60 b60Var = new b60(bundle, cxVar2);
        b60Var.d = f60Var.g0;
        b60Var.Z();
        f60Var.h0.presentFragment(b60Var);
        org.telegram.messenger.g0.h3(new ss(29, b60Var, t2Var), 150L);
        return true;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }
}
