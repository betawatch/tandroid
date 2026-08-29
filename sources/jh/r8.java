package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.dc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r8(int i10, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var, LinearLayout linearLayout, long[] jArr, bg.j3 j3Var) {
        this.a = 5;
        this.b = i10;
        this.c = f3Var;
        this.d = c6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = j3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        long j10;
        int i10 = this.a;
        JSONObject jSONObject = null;
        int i11 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                nh.d dVar = (nh.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i12 = this.b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new jf.i0(dVar, f3VarArr, i12, tLObject, str, 1));
                    break;
                }
                break;
            case 1:
                m2.g gVar = (m2.g) callback;
                LinearLayout linearLayout = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                qj0 qj0Var = (qj0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    qj0 qj0Var2 = (qj0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x4 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(jr.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x4, qj0Var2, qj0Var));
                    duration.start();
                    break;
                }
                break;
            case 2:
                qc0 qc0Var = (qc0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((qc0) callback).getValue();
                tL_birthday.month = ((qc0) obj4).getValue() + 1;
                if (qc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = qc0Var.getValue();
                }
                runnable = a3Var.a.dismissRunnable;
                runnable.run();
                callback2.run(tL_birthday);
                break;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (lh.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new eg.b0((fr) obj4, (nh.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                nh.d dVar2 = (nh.d) callback;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar2.J) {
                        dVar2.setLoading(true);
                        if (z0Var != null) {
                            boolean z10 = org.telegram.ui.web.z0.I0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            z0Var.v("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new bh.v(23, zArr, f3Var));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    f3Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) callback;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                bg.j3 j3Var = (bg.j3) obj;
                b0 g10 = b0.g(i11);
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
                j70 F = j70.F(f3Var2.getContainerView(), c6Var, linearLayout2);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.id;
                        }
                    }
                    long j11 = j10;
                    F.g(tLObject2, j11 == jArr[0], new dc0(jArr, j11, j3Var, 2));
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
        }
    }

    public /* synthetic */ r8(Object obj, Object obj2, Object obj3, nh.d dVar, Object obj4, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = dVar;
        this.h = obj4;
        this.b = i10;
    }

    public /* synthetic */ r8(m2.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, qj0 qj0Var) {
        this.a = 1;
        this.c = gVar;
        this.b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = qj0Var;
    }

    public /* synthetic */ r8(nh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.a = 0;
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = f3VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ r8(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.a = 2;
        this.c = qc0Var;
        this.d = qc0Var2;
        this.e = qc0Var3;
        this.b = i10;
        this.f = a3Var;
        this.h = callback;
    }
}
