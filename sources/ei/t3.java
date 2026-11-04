package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ey0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ r9 d;

    public /* synthetic */ t3(b4 b4Var, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 0;
        this.b = b4Var;
        this.d = r9Var;
        this.c = e6Var;
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
        boolean z10;
        View view2;
        View view3;
        int i3 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        r9 r9Var = this.d;
        b4 b4Var = this.b;
        switch (i3) {
            case 0:
                j4 j4Var = b4Var.x;
                r9Var.l1 = true;
                r9Var.d0();
                int i10 = j4Var.m2;
                Context context = j4Var.getContext();
                TL_stories.StoryItem storyItem = j4Var.y1.a;
                m3 m3Var = j4Var.M0;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                fc fcVar = new fc(m3Var, e6Var2);
                ai.v2 v2Var = new ai.v2(r9Var, 15);
                int i11 = ey0.t1;
                ey0.J0(i10, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), fcVar, e6Var2, new byte[0], null, v2Var);
                b4 b4Var2 = j4Var.d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 1:
                j4 j4Var2 = b4Var.x;
                b4 b4Var3 = j4Var2.d1;
                h4 h4Var = j4Var2.y1;
                if (b4Var3 != null) {
                    b4Var3.a();
                }
                gi.t8 t8Var = new gi.t8(86400, j4Var2.getContext(), e6Var);
                t8Var.U0();
                t8Var.V0(hp.s1(j4Var2.m2).j1(j4Var2.l1));
                t8Var.D1 = true;
                View[] viewPages = t8Var.j1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof gi.o8) {
                    gi.o8 o8Var = (gi.o8) view4;
                    o8Var.b(o8Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof gi.o8) {
                    gi.o8 o8Var2 = (gi.o8) view5;
                    o8Var2.b(o8Var2.a);
                }
                t8Var.L0(false);
                t8Var.S0(1);
                t8Var.Q0(false);
                g1 g1Var = r9Var.B0;
                if (g1Var != null) {
                    TLRPC.GroupCall groupCall = g1Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = h4Var.d();
                        TL_stories.StoryItem storyItem2 = h4Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        g1 g1Var2 = r9Var.B0;
                        int j10 = g1Var2 != null ? 0 : (int) g1Var2.j();
                        t8Var.t1 = z10;
                        t8Var.u1 = d;
                        t8Var.v1 = z11;
                        t8Var.z1 = j10;
                        View[] viewPages2 = t8Var.j1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof gi.o8) {
                            gi.o8 o8Var3 = (gi.o8) view2;
                            o8Var3.b(o8Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof gi.o8) {
                            gi.o8 o8Var4 = (gi.o8) view3;
                            o8Var4.b(o8Var4.a);
                        }
                        t8Var.L1 = new ai.n(15, b4Var, t8Var);
                        t8Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = h4Var.d();
                TL_stories.StoryItem storyItem22 = h4Var.a;
                if (storyItem22 == null) {
                }
                g1 g1Var22 = r9Var.B0;
                if (g1Var22 != null) {
                }
                t8Var.t1 = z10;
                t8Var.u1 = d10;
                t8Var.v1 = z11;
                t8Var.z1 = j10;
                View[] viewPages22 = t8Var.j1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof gi.o8) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof gi.o8) {
                }
                t8Var.L1 = new ai.n(15, b4Var, t8Var);
                t8Var.show();
            default:
                j4 j4Var3 = b4Var.x;
                b4 b4Var4 = j4Var3.d1;
                if (b4Var4 != null) {
                    b4Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j4Var3.getContext(), e6Var);
                String M0 = bd.M0(2131748825, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131748826, null);
                alertDialog$Builder.k(bd.M0(2131748827, null), new ai.n(16, b4Var, r9Var));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ t3(b4 b4Var, org.telegram.ui.ActionBar.e6 e6Var, r9 r9Var, int i3) {
        this.a = i3;
        this.b = b4Var;
        this.c = e6Var;
        this.d = r9Var;
    }
}
