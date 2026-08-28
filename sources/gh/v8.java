package gh;

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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v8(int i9, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, LinearLayout linearLayout, long[] jArr, fh.g1 g1Var) {
        this.a = 1;
        this.b = i9;
        this.c = f3Var;
        this.d = b6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        int i9 = this.a;
        JSONObject jSONObject = null;
        int i10 = this.b;
        Object obj = this.h;
        KeyEvent.Callback callback = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i9) {
            case 0:
                kh.d dVar = (kh.d) callback;
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
                    int i11 = this.b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new ff.j0(dVar, f3VarArr, i11, tLObject, str, 1));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) callback;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                fh.g1 g1Var = (fh.g1) obj;
                c0 g10 = c0.g(i10);
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
                arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
                x60 F = x60.F(f3Var.getContainerView(), b6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
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
                    F.g(tLObject2, j11 == jArr[0], new e5.w(jArr, j11, g1Var, 12));
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
            case 2:
                m2.g gVar = (m2.g) callback;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                fj0 fj0Var = (fj0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i10 != currentItem) {
                    fj0 fj0Var2 = (fj0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = fj0Var.getX() - ((horizontalScrollView.getWidth() - fj0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(gr.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, fj0Var2, fj0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                bc0 bc0Var = (bc0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((bc0) callback).getValue();
                tL_birthday.month = ((bc0) obj4).getValue() + 1;
                if (bc0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = bc0Var.getValue();
                }
                a3Var.a.dismissRunnable.run();
                callback2.run(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (ih.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bg.d0((cr) obj4, (kh.d) callback, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            default:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                kh.d dVar2 = (kh.d) callback;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    if (!dVar2.J) {
                        dVar2.setLoading(true);
                        if (y0Var != null) {
                            boolean z10 = org.telegram.ui.web.y0.I0;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            y0Var.v("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new bg.y0(23, zArr, f3Var2));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    f3Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v8(Object obj, Object obj2, Object obj3, kh.d dVar, Object obj4, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = dVar;
        this.h = obj4;
        this.b = i9;
    }

    public /* synthetic */ v8(kh.d dVar, TL_stars.StarsSubscription starsSubscription, int i9, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.a = 0;
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i9;
        this.e = f3VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ v8(m2.g gVar, int i9, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, fj0 fj0Var) {
        this.a = 2;
        this.c = gVar;
        this.b = i9;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = fj0Var;
    }

    public /* synthetic */ v8(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, int i9, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.a = 3;
        this.c = bc0Var;
        this.d = bc0Var2;
        this.e = bc0Var3;
        this.b = i9;
        this.f = a3Var;
        this.h = callback;
    }
}
