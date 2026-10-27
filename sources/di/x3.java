package di;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ y9 d;

    public /* synthetic */ x3(h4 h4Var, y9 y9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = 0;
        this.b = h4Var;
        this.d = y9Var;
        this.c = u6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        y9 y9Var = this.d;
        h4 h4Var = this.b;
        switch (i10) {
            case 0:
                q4 q4Var = h4Var.l;
                y9Var.k1 = true;
                y9Var.Q();
                int i11 = q4Var.r2;
                Context context = q4Var.getContext();
                TL_stories.StoryItem storyItem = q4Var.D1.a;
                q3 q3Var = q4Var.R0;
                org.telegram.ui.ActionBar.u6 u6Var2 = this.c;
                wc wcVar = new wc(q3Var, u6Var2);
                ai.i iVar = new ai.i(y9Var, 11);
                int i12 = x21.w;
                x21.N(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), wcVar, u6Var2, new byte[0], null, iVar);
                h4 h4Var2 = q4Var.i1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    break;
                }
                break;
            case 1:
                q4 q4Var2 = h4Var.l;
                h4 h4Var3 = q4Var2.i1;
                o4 o4Var = q4Var2.D1;
                if (h4Var3 != null) {
                    h4Var3.a();
                }
                fi.n9 n9Var = new fi.n9(q4Var2.getContext(), 86400, u6Var);
                n9Var.p1();
                n9Var.q1(MessagesController.getInstance(q4Var2.r2).getInputPeer(q4Var2.q1));
                n9Var.L = true;
                View[] viewPages = n9Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof fi.g9) {
                    fi.g9 g9Var = (fi.g9) view4;
                    g9Var.b(g9Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof fi.g9) {
                    fi.g9 g9Var2 = (fi.g9) view5;
                    g9Var2.b(g9Var2.a);
                }
                n9Var.f1(false);
                n9Var.n1(1);
                n9Var.l1(false);
                h1 h1Var = y9Var.A0;
                if (h1Var != null) {
                    TLRPC.GroupCall groupCall = h1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = o4Var.d();
                        TL_stories.StoryItem storyItem2 = o4Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        h1 h1Var2 = y9Var.A0;
                        int j10 = h1Var2 != null ? 0 : (int) h1Var2.j();
                        n9Var.w = z10;
                        n9Var.x = d;
                        n9Var.y = z11;
                        n9Var.H = j10;
                        View[] viewPages2 = n9Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof fi.g9) {
                            fi.g9 g9Var3 = (fi.g9) view2;
                            g9Var3.b(g9Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof fi.g9) {
                            fi.g9 g9Var4 = (fi.g9) view3;
                            g9Var4.b(g9Var4.a);
                        }
                        n9Var.T = new ai.f0(11, h4Var, n9Var);
                        n9Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = o4Var.d();
                TL_stories.StoryItem storyItem22 = o4Var.a;
                if (storyItem22 == null) {
                }
                h1 h1Var22 = y9Var.A0;
                if (h1Var22 != null) {
                }
                n9Var.w = z10;
                n9Var.x = d10;
                n9Var.y = z11;
                n9Var.H = j10;
                View[] viewPages22 = n9Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof fi.g9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof fi.g9) {
                }
                n9Var.T = new ai.f0(11, h4Var, n9Var);
                n9Var.show();
            default:
                q4 q4Var3 = h4Var.l;
                h4 h4Var4 = q4Var3.i1;
                if (h4Var4 != null) {
                    h4Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var3.getContext(), 0, u6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ai.f0(12, h4Var, y9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ x3(h4 h4Var, org.telegram.ui.ActionBar.u6 u6Var, y9 y9Var, int i10) {
        this.a = i10;
        this.b = h4Var;
        this.c = u6Var;
        this.d = y9Var;
    }
}
