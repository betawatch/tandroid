package ih;

import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        wc wcVar;
        wc wcVar2;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                nh.t3[] t3VarArr = (nh.t3[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                nh.t3 t3Var = t3VarArr[0];
                if (t3Var != null) {
                    t3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x4 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y8 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof vc) {
                    Layout layout = ((vc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        wc[] wcVarArr = (wc[]) spanned.getSpans(0, text.length(), wc.class);
                        if (wcVarArr.length > 0 && (wcVar = wcVarArr[0]) != null) {
                            x4 += layout.getPrimaryHorizontal(spanned.getSpanStart(wcVar)) + (wcVarArr[0].a() / 2);
                            y8 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                nh.t3 t3Var2 = new nh.t3(g0Var.getContext(), 3);
                t3VarArr[0] = t3Var2;
                t3Var2.q(true);
                t3Var2.l(11.0f, 8.0f, 11.0f, 7.0f);
                t3Var2.r(10.0f);
                t3Var2.t(replaceTags);
                t3Var2.h0 = new x(t3Var2, 0);
                t3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y8);
                t3Var2.h = AndroidUtilities.dp(300.0f);
                t3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                t3Var2.n(0.0f, x4 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(t3Var2, i7.f6.e(-1, 100, 55));
                t3Var2.v();
                break;
            case 1:
                q5 q5Var = (q5) this.b;
                ye.c cVar = (ye.c) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                cVar.b();
                if (((Boolean) obj).booleanValue()) {
                    jh.n1 n1Var = q5Var.b0;
                    if (n1Var != null) {
                        n1Var.run(tL_starGiftUnique);
                    }
                    q5Var.dismiss();
                    break;
                }
                break;
            case 2:
                jh.n0.R((jh.n0) this.b, (ye.c) this.c, (org.telegram.ui.ActionBar.c2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                jh.h5 h5Var = (jh.h5) this.b;
                nh.t3[] t3VarArr2 = (nh.t3[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                nh.t3 t3Var3 = t3VarArr2[0];
                if (t3Var3 != null) {
                    t3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x10 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y10 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof vc) {
                    Layout layout2 = ((vc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        wc[] wcVarArr2 = (wc[]) spanned2.getSpans(0, text2.length(), wc.class);
                        if (wcVarArr2.length > 0 && (wcVar2 = wcVarArr2[0]) != null) {
                            x10 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(wcVar2)) + (wcVarArr2[0].a() / 2);
                            y10 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                nh.t3 t3Var4 = new nh.t3(h5Var.getContext(), 3);
                t3VarArr2[0] = t3Var4;
                t3Var4.q(true);
                t3Var4.l(11.0f, 8.0f, 11.0f, 7.0f);
                t3Var4.r(10.0f);
                t3Var4.t(replaceTags2);
                t3Var4.h0 = new x(t3Var4, 2);
                t3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                t3Var4.h = AndroidUtilities.dp(300.0f);
                t3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                t3Var4.n(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(t3Var4, i7.f6.e(-1, 100, 55));
                t3Var4.v();
                break;
            case 4:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.g0.W((org.telegram.ui.Components.g0) this.b, (ye.c) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 6:
                org.telegram.ui.Components.s.S((org.telegram.ui.Components.s) this.b, (org.telegram.ui.ActionBar.c6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 7:
                org.telegram.ui.Components.a0.P((org.telegram.ui.Components.a0) this.b, (ye.c) this.c, (org.telegram.ui.ActionBar.c2) this.d);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = z0Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new tc(z0Var, c6Var).c0("UNKNOWN_BUTTON", false);
                        z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                        break;
                    } else {
                        new tc(z0Var, c6Var).d0(tL_error, false);
                        z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(z0Var.I).processUpdates(updates, false);
                    z0Var.v("requested_chat_sent", org.telegram.ui.web.z0.x(str, "req_id"));
                    long j10 = z0Var.Q.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.d0 d0Var = new org.telegram.ui.web.d0(z0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(d0Var);
                    }
                    org.telegram.ui.web.f0 f0Var = z0Var.c;
                    if (f0Var != null) {
                        f0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
