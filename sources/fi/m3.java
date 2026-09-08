package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import bi.fa;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.da;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m3(int i10, org.telegram.ui.ActionBar.f3 f3Var, f6 f6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.b = i10;
        this.d = f3Var;
        this.e = f6Var;
        this.c = linearLayout;
        this.f = jArr;
        this.h = l3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j3;
        Runnable runnable;
        int i10 = this.a;
        JSONObject jSONObject = null;
        int i11 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) callback;
                f6 f6Var = (f6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                zh.o g10 = zh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                n70 F = n70.F(f3Var.getContainerView(), f6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj5;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.id;
                        }
                    }
                    long j10 = j3;
                    F.g(tLObject, j10 == jArr[0], new a3.h0(jArr, j10, l3Var, 9));
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
            case 1:
                z4.g gVar = (z4.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                qj0 qj0Var = (qj0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    qj0 qj0Var2 = (qj0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(pr.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, qj0Var2, qj0Var));
                    duration.start();
                    break;
                }
                break;
            case 2:
                vc0 vc0Var = (vc0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((vc0) callback).getValue();
                tL_birthday.month = ((vc0) obj4).getValue() + 1;
                if (vc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = vc0Var.getValue();
                }
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                break;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (bi.b) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new da((lr) callback, (di.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) callback;
                di.d dVar = (di.d) obj2;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        if (d1Var != null) {
                            boolean z10 = org.telegram.ui.web.d1.P0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            d1Var.z("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new bi.f0(17, zArr, f3Var2));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    f3Var2.dismiss();
                    break;
                }
                break;
            default:
                di.d dVar2 = (di.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i13 = this.b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new fa(dVar2, f3VarArr, i13, tLObject2, str, 13));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m3(di.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.d = dVar;
        this.e = starsSubscription;
        this.b = i10;
        this.c = f3VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ m3(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, di.d dVar, org.telegram.ui.web.d1 d1Var, int i10) {
        this.e = tL_messages_requestUrlAuth;
        this.c = zArr;
        this.d = f3Var;
        this.f = dVar;
        this.h = d1Var;
        this.b = i10;
    }

    public /* synthetic */ m3(lr lrVar, Context context, bi.b bVar, di.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = lrVar;
        this.e = context;
        this.c = bVar;
        this.f = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.b = i10;
    }

    public /* synthetic */ m3(vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.d = vc0Var;
        this.e = vc0Var2;
        this.c = vc0Var3;
        this.b = i10;
        this.f = a3Var;
        this.h = callback;
    }

    public /* synthetic */ m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, qj0 qj0Var) {
        this.d = gVar;
        this.b = i10;
        this.c = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = qj0Var;
    }
}
