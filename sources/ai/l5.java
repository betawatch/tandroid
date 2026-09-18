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
import org.telegram.ui.Components.vc;
import org.telegram.ui.d41;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ jc d;

    public /* synthetic */ l5(w5 w5Var, jc jcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = w5Var;
        this.d = jcVar;
        this.c = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        int i11 = 2;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        jc jcVar = this.d;
        w5 w5Var = this.b;
        switch (i10) {
            case 0:
                f6 f6Var2 = w5Var.l;
                jcVar.k1 = true;
                jcVar.P();
                int i12 = f6Var2.C2;
                Context context = f6Var2.getContext();
                TL_stories.StoryItem storyItem = f6Var2.O1.a;
                a5 a5Var = f6Var2.c1;
                org.telegram.ui.ActionBar.f6 f6Var3 = this.c;
                vc vcVar = new vc(a5Var, f6Var3);
                y1 y1Var = new y1(jcVar, 2);
                int i13 = d41.v;
                d41.K(i12, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), vcVar, f6Var3, new byte[0], null, y1Var);
                w5 w5Var2 = f6Var2.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 1:
                f6 f6Var4 = w5Var.l;
                w5 w5Var3 = f6Var4.t1;
                d6 d6Var = f6Var4.O1;
                if (w5Var3 != null) {
                    w5Var3.a();
                }
                ci.ia iaVar = new ci.ia(f6Var4.getContext(), 86400, f6Var);
                iaVar.o1();
                iaVar.p1(MessagesController.getInstance(f6Var4.C2).getInputPeer(f6Var4.B1));
                iaVar.L = true;
                View[] viewPages = iaVar.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof ci.ba) {
                    ci.ba baVar = (ci.ba) view4;
                    baVar.b(baVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof ci.ba) {
                    ci.ba baVar2 = (ci.ba) view5;
                    baVar2.b(baVar2.a);
                }
                iaVar.e1(false);
                iaVar.m1(1);
                iaVar.k1(false);
                d2 d2Var = jcVar.A0;
                if (d2Var != null) {
                    TLRPC.GroupCall groupCall = d2Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = d6Var.d();
                        TL_stories.StoryItem storyItem2 = d6Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        d2 d2Var2 = jcVar.A0;
                        int j3 = d2Var2 != null ? 0 : (int) d2Var2.j();
                        iaVar.w = z10;
                        iaVar.x = d;
                        iaVar.y = z11;
                        iaVar.H = j3;
                        View[] viewPages2 = iaVar.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof ci.ba) {
                            ci.ba baVar3 = (ci.ba) view2;
                            baVar3.b(baVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof ci.ba) {
                            ci.ba baVar4 = (ci.ba) view3;
                            baVar4.b(baVar4.a);
                        }
                        iaVar.T = new ah.b(i11, w5Var, iaVar);
                        iaVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = d6Var.d();
                TL_stories.StoryItem storyItem22 = d6Var.a;
                if (storyItem22 == null) {
                }
                d2 d2Var22 = jcVar.A0;
                if (d2Var22 != null) {
                }
                iaVar.w = z10;
                iaVar.x = d10;
                iaVar.y = z11;
                iaVar.H = j3;
                View[] viewPages22 = iaVar.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof ci.ba) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof ci.ba) {
                }
                iaVar.T = new ah.b(i11, w5Var, iaVar);
                iaVar.show();
            default:
                f6 f6Var5 = w5Var.l;
                w5 w5Var4 = f6Var5.t1;
                if (w5Var4 != null) {
                    w5Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f6Var5.getContext(), 0, f6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.b(3, w5Var, jcVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ l5(w5 w5Var, org.telegram.ui.ActionBar.f6 f6Var, jc jcVar, int i10) {
        this.a = i10;
        this.b = w5Var;
        this.c = f6Var;
        this.d = jcVar;
    }
}
