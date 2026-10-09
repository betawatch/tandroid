package ai;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.c41;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ kc d;

    public /* synthetic */ l5(w5 w5Var, kc kcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 0;
        this.b = w5Var;
        this.d = kcVar;
        this.c = e6Var;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        kc kcVar = this.d;
        w5 w5Var = this.b;
        switch (i10) {
            case 0:
                f6 f6Var = w5Var.l;
                kcVar.k1 = true;
                kcVar.P();
                int i11 = f6Var.C2;
                Context context = f6Var.getContext();
                TL_stories.StoryItem storyItem = f6Var.O1.a;
                b5 b5Var = f6Var.c1;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                ad adVar = new ad(b5Var, e6Var2);
                y1 y1Var = new y1(kcVar, 1);
                int i12 = c41.v;
                c41.L(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), adVar, e6Var2, new byte[0], null, y1Var);
                w5 w5Var2 = f6Var.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 1:
                f6 f6Var2 = w5Var.l;
                w5 w5Var3 = f6Var2.t1;
                d6 d6Var = f6Var2.O1;
                if (w5Var3 != null) {
                    w5Var3.a();
                }
                ci.fa faVar = new ci.fa(f6Var2.getContext(), 86400, e6Var);
                faVar.p1();
                faVar.q1(MessagesController.getInstance(f6Var2.C2).getInputPeer(f6Var2.B1));
                faVar.L = true;
                View[] viewPages = faVar.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof ci.y9) {
                    ci.y9 y9Var = (ci.y9) view4;
                    y9Var.b(y9Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof ci.y9) {
                    ci.y9 y9Var2 = (ci.y9) view5;
                    y9Var2.b(y9Var2.a);
                }
                faVar.f1(false);
                faVar.n1(1);
                faVar.l1(false);
                d2 d2Var = kcVar.A0;
                if (d2Var != null) {
                    TLRPC.GroupCall groupCall = d2Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = d6Var.d();
                        TL_stories.StoryItem storyItem2 = d6Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        d2 d2Var2 = kcVar.A0;
                        int j3 = d2Var2 != null ? 0 : (int) d2Var2.j();
                        faVar.w = z10;
                        faVar.x = d;
                        faVar.y = z11;
                        faVar.H = j3;
                        View[] viewPages2 = faVar.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof ci.y9) {
                            ci.y9 y9Var3 = (ci.y9) view2;
                            y9Var3.b(y9Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof ci.y9) {
                            ci.y9 y9Var4 = (ci.y9) view3;
                            y9Var4.b(y9Var4.a);
                        }
                        faVar.T = new ah.b(2, w5Var, faVar);
                        faVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = d6Var.d();
                TL_stories.StoryItem storyItem22 = d6Var.a;
                if (storyItem22 == null) {
                }
                d2 d2Var22 = kcVar.A0;
                if (d2Var22 != null) {
                }
                faVar.w = z10;
                faVar.x = d10;
                faVar.y = z11;
                faVar.H = j3;
                View[] viewPages22 = faVar.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof ci.y9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof ci.y9) {
                }
                faVar.T = new ah.b(2, w5Var, faVar);
                faVar.show();
            default:
                f6 f6Var3 = w5Var.l;
                w5 w5Var4 = f6Var3.t1;
                if (w5Var4 != null) {
                    w5Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f6Var3.getContext(), 0, e6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.b(3, w5Var, kcVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ l5(w5 w5Var, org.telegram.ui.ActionBar.e6 e6Var, kc kcVar, int i10) {
        this.a = i10;
        this.b = w5Var;
        this.c = e6Var;
        this.d = kcVar;
    }
}
