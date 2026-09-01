package lh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        tc tcVar;
        tc tcVar2;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                qh.f3[] f3VarArr = (qh.f3[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                qh.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof sc) {
                    Layout layout = ((sc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        tc[] tcVarArr = (tc[]) spanned.getSpans(0, text.length(), tc.class);
                        if (tcVarArr.length > 0 && (tcVar = tcVarArr[0]) != null) {
                            x10 += layout.getPrimaryHorizontal(spanned.getSpanStart(tcVar)) + (tcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(r8));
                        }
                    }
                }
                qh.f3 f3Var2 = new qh.f3(f0Var.getContext(), 3);
                f3VarArr[0] = f3Var2;
                f3Var2.q(true);
                f3Var2.l(11.0f, 8.0f, 11.0f, 7.0f);
                f3Var2.r(10.0f);
                f3Var2.t(replaceTags);
                f3Var2.i0 = new w(f3Var2, 0);
                f3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                f3Var2.h = AndroidUtilities.dp(300.0f);
                f3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f3Var2.n(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(f3Var2, k7.c6.e(-1, 100, 55));
                f3Var2.v();
                break;
            case 1:
                q5 q5Var = (q5) this.b;
                af.f fVar = (af.f) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                fVar.b();
                if (((Boolean) obj).booleanValue()) {
                    mh.m1 m1Var = q5Var.c0;
                    if (m1Var != null) {
                        m1Var.run(tL_starGiftUnique);
                    }
                    q5Var.dismiss();
                    break;
                }
                break;
            case 2:
                mh.m0.R((mh.m0) this.b, (af.f) this.c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                mh.g5 g5Var = (mh.g5) this.b;
                qh.f3[] f3VarArr2 = (qh.f3[]) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                qh.f3 f3Var3 = f3VarArr2[0];
                if (f3Var3 != null) {
                    f3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof sc) {
                    Layout layout2 = ((sc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        tc[] tcVarArr2 = (tc[]) spanned2.getSpans(0, text2.length(), tc.class);
                        if (tcVarArr2.length > 0 && (tcVar2 = tcVarArr2[0]) != null) {
                            x11 += layout2.getPrimaryHorizontal(spanned2.getSpanStart(tcVar2)) + (tcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(r8));
                        }
                    }
                }
                qh.f3 f3Var4 = new qh.f3(g5Var.getContext(), 3);
                f3VarArr2[0] = f3Var4;
                f3Var4.q(true);
                f3Var4.l(11.0f, 8.0f, 11.0f, 7.0f);
                f3Var4.r(10.0f);
                f3Var4.t(replaceTags2);
                f3Var4.i0 = new w(f3Var4, 2);
                f3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                f3Var4.h = AndroidUtilities.dp(300.0f);
                f3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f3Var4.n(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(f3Var4, k7.c6.e(-1, 100, 55));
                f3Var4.v();
                break;
            case 4:
                ((ConnectionsManager) this.b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.f0.W((org.telegram.ui.Components.f0) this.b, (af.f) this.c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 6:
                org.telegram.ui.Components.r.S((org.telegram.ui.Components.r) this.b, (g6) this.c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 7:
                org.telegram.ui.Components.z.P((org.telegram.ui.Components.z) this.b, (af.f) this.c, (org.telegram.ui.ActionBar.d2) this.d);
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g6 g6Var = a1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new qc(a1Var, g6Var).c0("UNKNOWN_BUTTON", false);
                        a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                        break;
                    } else {
                        new qc(a1Var, g6Var).d0(tL_error, false);
                        a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates, false);
                    a1Var.v("requested_chat_sent", org.telegram.ui.web.a1.x(str, "req_id"));
                    long j10 = a1Var.R.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.c0 c0Var = new org.telegram.ui.web.c0(a1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(c0Var);
                    }
                    org.telegram.ui.web.f0 f0Var2 = a1Var.c;
                    if (f0Var2 != null) {
                        f0Var2.b();
                        break;
                    }
                }
                break;
        }
    }
}
