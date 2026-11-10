package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.sy0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ q9 d;

    public /* synthetic */ q3(a4 a4Var, q9 q9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = 0;
        this.b = a4Var;
        this.d = q9Var;
        this.c = h6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z9;
        View view2;
        View view3;
        int i7 = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        q9 q9Var = this.d;
        a4 a4Var = this.b;
        switch (i7) {
            case 0:
                j4 j4Var = a4Var.x;
                q9Var.j1 = true;
                q9Var.V();
                int i10 = j4Var.l2;
                Context context = j4Var.getContext();
                TL_stories.StoryItem storyItem = j4Var.x1.a;
                j3 j3Var = j4Var.L0;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.c;
                gc gcVar = new gc(j3Var, h6Var2);
                ai.i iVar = new ai.i(q9Var, 12);
                int i11 = sy0.v1;
                sy0.J0(i10, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), gcVar, h6Var2, new byte[0], null, iVar);
                a4 a4Var2 = j4Var.c1;
                if (a4Var2 != null) {
                    a4Var2.a();
                    break;
                }
                break;
            case 1:
                j4 j4Var2 = a4Var.x;
                a4 a4Var3 = j4Var2.c1;
                h4 h4Var = j4Var2.x1;
                if (a4Var3 != null) {
                    a4Var3.a();
                }
                fi.s8 s8Var = new fi.s8(86400, j4Var2.getContext(), h6Var);
                s8Var.U0();
                s8Var.V0(qp.s1(j4Var2.l2).j1(j4Var2.k1));
                s8Var.F1 = true;
                View[] viewPages = s8Var.l1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof fi.n8) {
                    fi.n8 n8Var = (fi.n8) view4;
                    n8Var.b(n8Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof fi.n8) {
                    fi.n8 n8Var2 = (fi.n8) view5;
                    n8Var2.b(n8Var2.a);
                }
                s8Var.L0(false);
                s8Var.S0(1);
                s8Var.Q0(false);
                g1 g1Var = q9Var.A0;
                if (g1Var != null) {
                    TLRPC.GroupCall groupCall = g1Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z9 = true;
                        boolean d = h4Var.d();
                        TL_stories.StoryItem storyItem2 = h4Var.a;
                        boolean z10 = storyItem2 == null && storyItem2.pinned;
                        g1 g1Var2 = q9Var.A0;
                        int j3 = g1Var2 != null ? 0 : (int) g1Var2.j();
                        s8Var.v1 = z9;
                        s8Var.w1 = d;
                        s8Var.x1 = z10;
                        s8Var.B1 = j3;
                        View[] viewPages2 = s8Var.l1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof fi.n8) {
                            fi.n8 n8Var3 = (fi.n8) view2;
                            n8Var3.b(n8Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof fi.n8) {
                            fi.n8 n8Var4 = (fi.n8) view3;
                            n8Var4.b(n8Var4.a);
                        }
                        s8Var.N1 = new ab.g(12, a4Var, s8Var);
                        s8Var.show();
                        break;
                    }
                }
                z9 = false;
                boolean d2 = h4Var.d();
                TL_stories.StoryItem storyItem22 = h4Var.a;
                if (storyItem22 == null) {
                }
                g1 g1Var22 = q9Var.A0;
                if (g1Var22 != null) {
                }
                s8Var.v1 = z9;
                s8Var.w1 = d2;
                s8Var.x1 = z10;
                s8Var.B1 = j3;
                View[] viewPages22 = s8Var.l1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof fi.n8) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof fi.n8) {
                }
                s8Var.N1 = new ab.g(12, a4Var, s8Var);
                s8Var.show();
            default:
                j4 j4Var3 = a4Var.x;
                a4 a4Var4 = j4Var3.c1;
                if (a4Var4 != null) {
                    a4Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var3.getContext(), h6Var);
                String M0 = id.M0(2131748817, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131748818, null);
                alertDialog$Builder.k(id.M0(2131748819, null), new ab.g(13, a4Var, q9Var));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ q3(a4 a4Var, org.telegram.ui.ActionBar.h6 h6Var, q9 q9Var, int i7) {
        this.a = i7;
        this.b = a4Var;
        this.c = h6Var;
        this.d = q9Var;
    }
}
