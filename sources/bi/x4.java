package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.zc;
import org.telegram.ui.i41;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ sb d;

    public /* synthetic */ x4(h5 h5Var, sb sbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = 0;
        this.b = h5Var;
        this.d = sbVar;
        this.c = c6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        sb sbVar = this.d;
        h5 h5Var = this.b;
        switch (i10) {
            case 0:
                q5 q5Var = h5Var.l;
                sbVar.k1 = true;
                sbVar.P();
                int i11 = q5Var.C2;
                Context context = q5Var.getContext();
                TL_stories.StoryItem storyItem = q5Var.O1.a;
                o4 o4Var = q5Var.c1;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.c;
                zc zcVar = new zc(o4Var, c6Var2);
                o1 o1Var = new o1(sbVar, 1);
                int i12 = i41.v;
                i41.L(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), zcVar, c6Var2, new byte[0], null, o1Var);
                h5 h5Var2 = q5Var.t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    break;
                }
                break;
            case 1:
                q5 q5Var2 = h5Var.l;
                h5 h5Var3 = q5Var2.t1;
                o5 o5Var = q5Var2.O1;
                if (h5Var3 != null) {
                    h5Var3.a();
                }
                di.ea eaVar = new di.ea(q5Var2.getContext(), 86400, c6Var);
                eaVar.p1();
                eaVar.q1(MessagesController.getInstance(q5Var2.C2).getInputPeer(q5Var2.B1));
                eaVar.L = true;
                View[] viewPages = eaVar.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof di.x9) {
                    di.x9 x9Var = (di.x9) view4;
                    x9Var.b(x9Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof di.x9) {
                    di.x9 x9Var2 = (di.x9) view5;
                    x9Var2.b(x9Var2.a);
                }
                eaVar.f1(false);
                eaVar.n1(1);
                eaVar.l1(false);
                t1 t1Var = sbVar.A0;
                if (t1Var != null) {
                    TLRPC.GroupCall groupCall = t1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = o5Var.d();
                        TL_stories.StoryItem storyItem2 = o5Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        t1 t1Var2 = sbVar.A0;
                        int j10 = t1Var2 != null ? 0 : (int) t1Var2.j();
                        eaVar.w = z10;
                        eaVar.x = d;
                        eaVar.y = z11;
                        eaVar.H = j10;
                        View[] viewPages2 = eaVar.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof di.x9) {
                            di.x9 x9Var3 = (di.x9) view2;
                            x9Var3.b(x9Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof di.x9) {
                            di.x9 x9Var4 = (di.x9) view3;
                            x9Var4.b(x9Var4.a);
                        }
                        eaVar.T = new ah.h0(3, h5Var, eaVar);
                        eaVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = o5Var.d();
                TL_stories.StoryItem storyItem22 = o5Var.a;
                if (storyItem22 == null) {
                }
                t1 t1Var22 = sbVar.A0;
                if (t1Var22 != null) {
                }
                eaVar.w = z10;
                eaVar.x = d10;
                eaVar.y = z11;
                eaVar.H = j10;
                View[] viewPages22 = eaVar.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof di.x9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof di.x9) {
                }
                eaVar.T = new ah.h0(3, h5Var, eaVar);
                eaVar.show();
            default:
                q5 q5Var3 = h5Var.l;
                h5 h5Var4 = q5Var3.t1;
                if (h5Var4 != null) {
                    h5Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q5Var3.getContext(), 0, c6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.h0(4, h5Var, sbVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ x4(h5 h5Var, org.telegram.ui.ActionBar.c6 c6Var, sb sbVar, int i10) {
        this.a = i10;
        this.b = h5Var;
        this.c = c6Var;
        this.d = sbVar;
    }
}
