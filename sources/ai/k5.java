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
import org.telegram.ui.Components.xc;
import org.telegram.ui.t31;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ jc d;

    public /* synthetic */ k5(v5 v5Var, jc jcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 0;
        this.b = v5Var;
        this.d = jcVar;
        this.c = d6Var;
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
        org.telegram.ui.ActionBar.d6 d6Var = this.c;
        jc jcVar = this.d;
        v5 v5Var = this.b;
        switch (i10) {
            case 0:
                e6 e6Var = v5Var.l;
                jcVar.k1 = true;
                jcVar.P();
                int i11 = e6Var.C2;
                Context context = e6Var.getContext();
                TL_stories.StoryItem storyItem = e6Var.O1.a;
                a5 a5Var = e6Var.c1;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.c;
                xc xcVar = new xc(a5Var, d6Var2);
                y1 y1Var = new y1(jcVar, 1);
                int i12 = t31.v;
                t31.K(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), xcVar, d6Var2, new byte[0], null, y1Var);
                v5 v5Var2 = e6Var.t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    break;
                }
                break;
            case 1:
                e6 e6Var2 = v5Var.l;
                v5 v5Var3 = e6Var2.t1;
                c6 c6Var = e6Var2.O1;
                if (v5Var3 != null) {
                    v5Var3.a();
                }
                ci.fa faVar = new ci.fa(e6Var2.getContext(), 86400, d6Var);
                faVar.o1();
                faVar.p1(MessagesController.getInstance(e6Var2.C2).getInputPeer(e6Var2.B1));
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
                faVar.e1(false);
                faVar.m1(1);
                faVar.k1(false);
                d2 d2Var = jcVar.A0;
                if (d2Var != null) {
                    TLRPC.GroupCall groupCall = d2Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = c6Var.d();
                        TL_stories.StoryItem storyItem2 = c6Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        d2 d2Var2 = jcVar.A0;
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
                        faVar.T = new ah.b(2, v5Var, faVar);
                        faVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = c6Var.d();
                TL_stories.StoryItem storyItem22 = c6Var.a;
                if (storyItem22 == null) {
                }
                d2 d2Var22 = jcVar.A0;
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
                faVar.T = new ah.b(2, v5Var, faVar);
                faVar.show();
            default:
                e6 e6Var3 = v5Var.l;
                v5 v5Var4 = e6Var3.t1;
                if (v5Var4 != null) {
                    v5Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e6Var3.getContext(), 0, d6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.b(3, v5Var, jcVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ k5(v5 v5Var, org.telegram.ui.ActionBar.d6 d6Var, jc jcVar, int i10) {
        this.a = i10;
        this.b = v5Var;
        this.c = d6Var;
        this.d = jcVar;
    }
}
