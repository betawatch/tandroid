package ci;

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
import org.telegram.ui.q21;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ z9 d;

    public /* synthetic */ x3(g4 g4Var, z9 z9Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 0;
        this.b = g4Var;
        this.d = z9Var;
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
        int i11 = 7;
        org.telegram.ui.ActionBar.d6 d6Var = this.c;
        z9 z9Var = this.d;
        g4 g4Var = this.b;
        switch (i10) {
            case 0:
                p4 p4Var = g4Var.l;
                z9Var.k1 = true;
                z9Var.P();
                int i12 = p4Var.C2;
                Context context = p4Var.getContext();
                TL_stories.StoryItem storyItem = p4Var.O1.a;
                q3 q3Var = p4Var.c1;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.c;
                xc xcVar = new xc(q3Var, d6Var2);
                ai.r0 r0Var = new ai.r0(z9Var, 7);
                int i13 = q21.v;
                q21.L(i12, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), xcVar, d6Var2, new byte[0], null, r0Var);
                g4 g4Var2 = p4Var.t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    break;
                }
                break;
            case 1:
                p4 p4Var2 = g4Var.l;
                g4 g4Var3 = p4Var2.t1;
                n4 n4Var = p4Var2.O1;
                if (g4Var3 != null) {
                    g4Var3.a();
                }
                ei.r9 r9Var = new ei.r9(p4Var2.getContext(), 86400, d6Var);
                r9Var.p1();
                r9Var.q1(MessagesController.getInstance(p4Var2.C2).getInputPeer(p4Var2.B1));
                r9Var.L = true;
                View[] viewPages = r9Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof ei.k9) {
                    ei.k9 k9Var = (ei.k9) view4;
                    k9Var.b(k9Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof ei.k9) {
                    ei.k9 k9Var2 = (ei.k9) view5;
                    k9Var2.b(k9Var2.a);
                }
                r9Var.f1(false);
                r9Var.n1(1);
                r9Var.l1(false);
                h1 h1Var = z9Var.A0;
                if (h1Var != null) {
                    TLRPC.GroupCall groupCall = h1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = n4Var.d();
                        TL_stories.StoryItem storyItem2 = n4Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        h1 h1Var2 = z9Var.A0;
                        int j10 = h1Var2 != null ? 0 : (int) h1Var2.j();
                        r9Var.w = z10;
                        r9Var.x = d;
                        r9Var.y = z11;
                        r9Var.H = j10;
                        View[] viewPages2 = r9Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof ei.k9) {
                            ei.k9 k9Var3 = (ei.k9) view2;
                            k9Var3.b(k9Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof ei.k9) {
                            ei.k9 k9Var4 = (ei.k9) view3;
                            k9Var4.b(k9Var4.a);
                        }
                        r9Var.T = new ah.h0(6, g4Var, r9Var);
                        r9Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = n4Var.d();
                TL_stories.StoryItem storyItem22 = n4Var.a;
                if (storyItem22 == null) {
                }
                h1 h1Var22 = z9Var.A0;
                if (h1Var22 != null) {
                }
                r9Var.w = z10;
                r9Var.x = d10;
                r9Var.y = z11;
                r9Var.H = j10;
                View[] viewPages22 = r9Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof ei.k9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof ei.k9) {
                }
                r9Var.T = new ah.h0(6, g4Var, r9Var);
                r9Var.show();
            default:
                p4 p4Var3 = g4Var.l;
                g4 g4Var4 = p4Var3.t1;
                if (g4Var4 != null) {
                    g4Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var3.getContext(), 0, d6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ah.h0(i11, g4Var, z9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ x3(g4 g4Var, org.telegram.ui.ActionBar.d6 d6Var, z9 z9Var, int i10) {
        this.a = i10;
        this.b = g4Var;
        this.c = d6Var;
        this.d = z9Var;
    }
}
