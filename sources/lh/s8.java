package lh;

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
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.ov0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ s8(int i10, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, LinearLayout linearLayout, long[] jArr, dg.f3 f3Var) {
        this.a = 5;
        this.b = i10;
        this.c = g3Var;
        this.d = f6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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
                ph.d dVar = (ph.d) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i12 = this.b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new kf.i0(dVar, g3VarArr, i12, tLObject, str, 1));
                    break;
                }
                break;
            case 1:
                m2.h hVar = (m2.h) callback;
                LinearLayout linearLayout = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                zj0 zj0Var = (zj0) obj;
                int currentItem = hVar.getCurrentItem();
                if (i11 != currentItem) {
                    zj0 zj0Var2 = (zj0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    hVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(mr.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, zj0Var2, zj0Var));
                    duration.start();
                    break;
                }
                break;
            case 2:
                xc0 xc0Var = (xc0) obj3;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((xc0) callback).getValue();
                tL_birthday.month = ((xc0) obj4).getValue() + 1;
                if (xc0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = xc0Var.getValue();
                }
                b3Var.a.dismissRunnable.run();
                callback2.run(tL_birthday);
                break;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (nh.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new gg.a0((ir) obj4, (ph.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 4:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                ph.d dVar2 = (ph.d) callback;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar2.K) {
                        dVar2.setLoading(true);
                        if (c1Var != null) {
                            boolean z4 = org.telegram.ui.web.c1.M0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            c1Var.y("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new dh.v(22, zArr, g3Var));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    g3Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) callback;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                dg.f3 f3Var = (dg.f3) obj;
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
                p70 F = p70.F(g3Var2.getContainerView(), f6Var, linearLayout2);
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
                    F.g(tLObject2, j11 == jArr[0], new ov0(jArr, j11, f3Var, 3));
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
        }
    }

    public /* synthetic */ s8(Object obj, Object obj2, Object obj3, ph.d dVar, Object obj4, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = dVar;
        this.h = obj4;
        this.b = i10;
    }

    public /* synthetic */ s8(m2.h hVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, zj0 zj0Var) {
        this.a = 1;
        this.c = hVar;
        this.b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = zj0Var;
    }

    public /* synthetic */ s8(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, int i10, org.telegram.ui.ActionBar.b3 b3Var, Utilities.Callback callback) {
        this.a = 2;
        this.c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.b = i10;
        this.f = b3Var;
        this.h = callback;
    }

    public /* synthetic */ s8(ph.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr, TLObject tLObject, String str) {
        this.a = 0;
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = g3VarArr;
        this.f = tLObject;
        this.h = str;
    }
}
