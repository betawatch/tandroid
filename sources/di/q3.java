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
import org.telegram.ui.Components.hc;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ p9 d;

    public /* synthetic */ q3(z3 z3Var, p9 p9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = z3Var;
        this.d = p9Var;
        this.c = f6Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        p9 p9Var = this.d;
        z3 z3Var = this.b;
        switch (i7) {
            case 0:
                i4 i4Var = z3Var.x;
                p9Var.j1 = true;
                p9Var.V();
                int i10 = i4Var.l2;
                Context context = i4Var.getContext();
                TL_stories.StoryItem storyItem = i4Var.x1.a;
                j3 j3Var = i4Var.L0;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                hc hcVar = new hc(j3Var, f6Var2);
                ai.i iVar = new ai.i(p9Var, 12);
                int i11 = oy0.s1;
                oy0.J0(i10, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), hcVar, f6Var2, new byte[0], null, iVar);
                z3 z3Var2 = i4Var.c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    break;
                }
                break;
            case 1:
                i4 i4Var2 = z3Var.x;
                z3 z3Var3 = i4Var2.c1;
                g4 g4Var = i4Var2.x1;
                if (z3Var3 != null) {
                    z3Var3.a();
                }
                fi.s8 s8Var = new fi.s8(86400, i4Var2.getContext(), f6Var);
                s8Var.U0();
                s8Var.V0(qp.s1(i4Var2.l2).j1(i4Var2.k1));
                s8Var.C1 = true;
                View[] viewPages = s8Var.i1.getViewPages();
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
                g1 g1Var = p9Var.A0;
                if (g1Var != null) {
                    TLRPC.GroupCall groupCall = g1Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z9 = true;
                        boolean d = g4Var.d();
                        TL_stories.StoryItem storyItem2 = g4Var.a;
                        boolean z10 = storyItem2 == null && storyItem2.pinned;
                        g1 g1Var2 = p9Var.A0;
                        int j3 = g1Var2 != null ? 0 : (int) g1Var2.j();
                        s8Var.s1 = z9;
                        s8Var.t1 = d;
                        s8Var.u1 = z10;
                        s8Var.y1 = j3;
                        View[] viewPages2 = s8Var.i1.getViewPages();
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
                        s8Var.K1 = new ab.g(12, z3Var, s8Var);
                        s8Var.show();
                        break;
                    }
                }
                z9 = false;
                boolean d2 = g4Var.d();
                TL_stories.StoryItem storyItem22 = g4Var.a;
                if (storyItem22 == null) {
                }
                g1 g1Var22 = p9Var.A0;
                if (g1Var22 != null) {
                }
                s8Var.s1 = z9;
                s8Var.t1 = d2;
                s8Var.u1 = z10;
                s8Var.y1 = j3;
                View[] viewPages22 = s8Var.i1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof fi.n8) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof fi.n8) {
                }
                s8Var.K1 = new ab.g(12, z3Var, s8Var);
                s8Var.show();
            default:
                i4 i4Var3 = z3Var.x;
                z3 z3Var4 = i4Var3.c1;
                if (z3Var4 != null) {
                    z3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i4Var3.getContext(), f6Var);
                String M0 = id.M0(2131748818, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131748819, null);
                alertDialog$Builder.k(id.M0(2131748820, null), new ab.g(13, z3Var, p9Var));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ q3(z3 z3Var, org.telegram.ui.ActionBar.f6 f6Var, p9 p9Var, int i7) {
        this.a = i7;
        this.b = z3Var;
        this.c = f6Var;
        this.d = p9Var;
    }
}
