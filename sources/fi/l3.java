package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.my0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ i9 d;

    public /* synthetic */ l3(t3 t3Var, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 0;
        this.b = t3Var;
        this.d = i9Var;
        this.c = e6Var;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        i9 i9Var = this.d;
        t3 t3Var = this.b;
        switch (i7) {
            case 0:
                b4 b4Var = t3Var.x;
                i9Var.k1 = true;
                i9Var.V();
                int i10 = b4Var.m2;
                Context context = b4Var.getContext();
                TL_stories.StoryItem storyItem = b4Var.y1.a;
                e3 e3Var = b4Var.M0;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.c;
                cc ccVar = new cc(e3Var, e6Var2);
                ai.f0 f0Var = new ai.f0(i9Var, 16);
                int i11 = my0.w1;
                my0.J0(i10, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), ccVar, e6Var2, new byte[0], null, f0Var);
                t3 t3Var2 = b4Var.d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    break;
                }
                break;
            case 1:
                b4 b4Var2 = t3Var.x;
                t3 t3Var3 = b4Var2.d1;
                z3 z3Var = b4Var2.y1;
                if (t3Var3 != null) {
                    t3Var3.a();
                }
                hi.q8 q8Var = new hi.q8(86400, b4Var2.getContext(), e6Var);
                q8Var.U0();
                q8Var.V0(np.s1(b4Var2.m2).j1(b4Var2.l1));
                q8Var.G1 = true;
                View[] viewPages = q8Var.m1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof hi.l8) {
                    hi.l8 l8Var = (hi.l8) view4;
                    l8Var.b(l8Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof hi.l8) {
                    hi.l8 l8Var2 = (hi.l8) view5;
                    l8Var2.b(l8Var2.a);
                }
                q8Var.L0(false);
                q8Var.S0(1);
                q8Var.Q0(false);
                e1 e1Var = i9Var.B0;
                if (e1Var != null) {
                    TLRPC.GroupCall groupCall = e1Var.w;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = z3Var.d();
                        TL_stories.StoryItem storyItem2 = z3Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        e1 e1Var2 = i9Var.B0;
                        int j3 = e1Var2 != null ? 0 : (int) e1Var2.j();
                        q8Var.w1 = z10;
                        q8Var.x1 = d;
                        q8Var.y1 = z11;
                        q8Var.C1 = j3;
                        View[] viewPages2 = q8Var.m1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof hi.l8) {
                            hi.l8 l8Var3 = (hi.l8) view2;
                            l8Var3.b(l8Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof hi.l8) {
                            hi.l8 l8Var4 = (hi.l8) view3;
                            l8Var4.b(l8Var4.a);
                        }
                        q8Var.O1 = new ab.g(18, t3Var, q8Var);
                        q8Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d2 = z3Var.d();
                TL_stories.StoryItem storyItem22 = z3Var.a;
                if (storyItem22 == null) {
                }
                e1 e1Var22 = i9Var.B0;
                if (e1Var22 != null) {
                }
                q8Var.w1 = z10;
                q8Var.x1 = d2;
                q8Var.y1 = z11;
                q8Var.C1 = j3;
                View[] viewPages22 = q8Var.m1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof hi.l8) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof hi.l8) {
                }
                q8Var.O1 = new ab.g(18, t3Var, q8Var);
                q8Var.show();
            default:
                b4 b4Var3 = t3Var.x;
                t3 t3Var4 = b4Var3.d1;
                if (t3Var4 != null) {
                    t3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b4Var3.getContext(), e6Var);
                String M0 = hd.M0(2131748817, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131748818, null);
                alertDialog$Builder.k(hd.M0(2131748819, null), new ab.g(19, t3Var, i9Var));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
        }
    }

    public /* synthetic */ l3(t3 t3Var, org.telegram.ui.ActionBar.e6 e6Var, i9 i9Var, int i7) {
        this.a = i7;
        this.b = t3Var;
        this.c = e6Var;
        this.d = i9Var;
    }
}
