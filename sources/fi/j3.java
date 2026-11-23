package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.py0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ f9 d;

    public /* synthetic */ j3(r3 r3Var, f9 f9Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = 0;
        this.b = r3Var;
        this.d = f9Var;
        this.c = i6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i7 = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        f9 f9Var = this.d;
        r3 r3Var = this.b;
        switch (i7) {
            case 0:
                z3 z3Var = r3Var.x;
                f9Var.k1 = true;
                f9Var.V();
                int i10 = z3Var.m2;
                Context context = z3Var.getContext();
                TL_stories.StoryItem storyItem = z3Var.y1.a;
                c3 c3Var = z3Var.M0;
                org.telegram.ui.ActionBar.i6 i6Var2 = this.c;
                kc kcVar = new kc(c3Var, i6Var2);
                ai.d0 d0Var = new ai.d0(f9Var, 17);
                int i11 = py0.w1;
                py0.K0(i10, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), kcVar, i6Var2, new byte[0], null, d0Var);
                r3 r3Var2 = z3Var.d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    break;
                }
                break;
            case 1:
                z3 z3Var2 = r3Var.x;
                r3 r3Var3 = z3Var2.d1;
                x3 x3Var = z3Var2.y1;
                if (r3Var3 != null) {
                    r3Var3.a();
                }
                hi.k9 k9Var = new hi.k9(86400, z3Var2.getContext(), i6Var);
                k9Var.V0();
                k9Var.W0(mp.u1(z3Var2.m2).l1(z3Var2.l1));
                k9Var.G1 = true;
                View[] viewPages = k9Var.m1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof hi.f9) {
                    hi.f9 f9Var2 = (hi.f9) view4;
                    f9Var2.b(f9Var2.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof hi.f9) {
                    hi.f9 f9Var3 = (hi.f9) view5;
                    f9Var3.b(f9Var3.a);
                }
                k9Var.M0(false);
                k9Var.T0(1);
                k9Var.R0(false);
                c1 c1Var = f9Var.B0;
                if (c1Var != null) {
                    TLRPC.GroupCall groupCall = c1Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = x3Var.d();
                        TL_stories.StoryItem storyItem2 = x3Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        c1 c1Var2 = f9Var.B0;
                        int j3 = c1Var2 != null ? 0 : (int) c1Var2.j();
                        k9Var.w1 = z10;
                        k9Var.x1 = d;
                        k9Var.y1 = z11;
                        k9Var.C1 = j3;
                        View[] viewPages2 = k9Var.m1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof hi.f9) {
                            hi.f9 f9Var4 = (hi.f9) view2;
                            f9Var4.b(f9Var4.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof hi.f9) {
                            hi.f9 f9Var5 = (hi.f9) view3;
                            f9Var5.b(f9Var5.a);
                        }
                        k9Var.O1 = new ab.g(16, r3Var, k9Var);
                        k9Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d2 = x3Var.d();
                TL_stories.StoryItem storyItem22 = x3Var.a;
                if (storyItem22 == null) {
                }
                c1 c1Var22 = f9Var.B0;
                if (c1Var22 != null) {
                }
                k9Var.w1 = z10;
                k9Var.x1 = d2;
                k9Var.y1 = z11;
                k9Var.C1 = j3;
                View[] viewPages22 = k9Var.m1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof hi.f9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof hi.f9) {
                }
                k9Var.O1 = new ab.g(16, r3Var, k9Var);
                k9Var.show();
            default:
                z3 z3Var3 = r3Var.x;
                r3 r3Var4 = z3Var3.d1;
                if (r3Var4 != null) {
                    r3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z3Var3.getContext(), i6Var);
                String N0 = gd.N0(2131748624, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131748625, null);
                alertDialog$Builder.k(gd.N0(2131748626, null), new ab.g(17, r3Var, f9Var));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ j3(r3 r3Var, org.telegram.ui.ActionBar.i6 i6Var, f9 f9Var, int i7) {
        this.a = i7;
        this.b = r3Var;
        this.c = i6Var;
        this.d = f9Var;
    }
}
