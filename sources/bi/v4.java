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
import org.telegram.ui.Components.yc;
import org.telegram.ui.e41;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ pb d;

    public /* synthetic */ v4(f5 f5Var, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = f5Var;
        this.d = pbVar;
        this.c = f6Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        pb pbVar = this.d;
        f5 f5Var = this.b;
        switch (i10) {
            case 0:
                o5 o5Var = f5Var.l;
                pbVar.k1 = true;
                pbVar.P();
                int i11 = o5Var.C2;
                Context context = o5Var.getContext();
                TL_stories.StoryItem storyItem = o5Var.O1.a;
                l4 l4Var = o5Var.c1;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                yc ycVar = new yc(l4Var, f6Var2);
                o1 o1Var = new o1(pbVar, 2);
                int i12 = e41.v;
                e41.K(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), ycVar, f6Var2, new byte[0], null, o1Var);
                f5 f5Var2 = o5Var.t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    break;
                }
                break;
            case 1:
                o5 o5Var2 = f5Var.l;
                f5 f5Var3 = o5Var2.t1;
                m5 m5Var = o5Var2.O1;
                if (f5Var3 != null) {
                    f5Var3.a();
                }
                di.ia iaVar = new di.ia(o5Var2.getContext(), 86400, f6Var);
                iaVar.o1();
                iaVar.p1(MessagesController.getInstance(o5Var2.C2).getInputPeer(o5Var2.B1));
                iaVar.L = true;
                View[] viewPages = iaVar.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof di.ba) {
                    di.ba baVar = (di.ba) view4;
                    baVar.b(baVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof di.ba) {
                    di.ba baVar2 = (di.ba) view5;
                    baVar2.b(baVar2.a);
                }
                iaVar.e1(false);
                iaVar.m1(1);
                iaVar.k1(false);
                t1 t1Var = pbVar.A0;
                if (t1Var != null) {
                    TLRPC.GroupCall groupCall = t1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = m5Var.d();
                        TL_stories.StoryItem storyItem2 = m5Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        t1 t1Var2 = pbVar.A0;
                        int j3 = t1Var2 != null ? 0 : (int) t1Var2.j();
                        iaVar.w = z10;
                        iaVar.x = d;
                        iaVar.y = z11;
                        iaVar.H = j3;
                        View[] viewPages2 = iaVar.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof di.ba) {
                            di.ba baVar3 = (di.ba) view2;
                            baVar3.b(baVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof di.ba) {
                            di.ba baVar4 = (di.ba) view3;
                            baVar4.b(baVar4.a);
                        }
                        iaVar.T = new ah.i0(3, f5Var, iaVar);
                        iaVar.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = m5Var.d();
                TL_stories.StoryItem storyItem22 = m5Var.a;
                if (storyItem22 == null) {
                }
                t1 t1Var22 = pbVar.A0;
                if (t1Var22 != null) {
                }
                iaVar.w = z10;
                iaVar.x = d10;
                iaVar.y = z11;
                iaVar.H = j3;
                View[] viewPages22 = iaVar.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof di.ba) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof di.ba) {
                }
                iaVar.T = new ah.i0(3, f5Var, iaVar);
                iaVar.show();
            default:
                o5 o5Var3 = f5Var.l;
                f5 f5Var4 = o5Var3.t1;
                if (f5Var4 != null) {
                    f5Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o5Var3.getContext(), 0, f6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.i0(4, f5Var, pbVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ v4(f5 f5Var, org.telegram.ui.ActionBar.f6 f6Var, pb pbVar, int i10) {
        this.a = i10;
        this.b = f5Var;
        this.c = f6Var;
        this.d = pbVar;
    }
}
