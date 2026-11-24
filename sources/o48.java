// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class o48 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v48 b;
    public final /* synthetic */ r63 c;
    public final /* synthetic */ oab d;

    public /* synthetic */ o48(v48 v48Var, oab oabVar, r63 r63Var) {
        this.a = (byte) 0;
        this.b = v48Var;
        this.d = oabVar;
        this.c = r63Var;
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
        boolean z;
        View view2;
        View view3;
        byte b = this.a;
        r63 r63Var = this.c;
        oab oabVar = this.d;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                a58 a58Var = v48Var.x;
                oabVar.k1 = true;
                oabVar.U();
                int i = a58Var.s2;
                Context context = a58Var.getContext();
                TL_stories.StoryItem storyItem = a58Var.E1.a;
                g48 g48Var = a58Var.S0;
                r63 r63Var2 = this.c;
                c41 c41Var = new c41(g48Var, r63Var2);
                ci7 ci7Var = new ci7(oabVar, (byte) 12);
                int i2 = da9.v1;
                da9.D0(i, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), c41Var, r63Var2, new byte[0], null, ci7Var);
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                    break;
                }
                break;
            case 1:
                a58 a58Var2 = v48Var.x;
                v48 v48Var3 = a58Var2.j1;
                z48 z48Var = a58Var2.E1;
                if (v48Var3 != null) {
                    v48Var3.a();
                }
                a8b a8bVar = new a8b(a58Var2.getContext(), 86400, r63Var);
                a8bVar.P0();
                a8bVar.Q0(oc7.r1(a58Var2.s2).i1(a58Var2.r1));
                a8bVar.F1 = true;
                View[] viewPages = a8bVar.l1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof v7b) {
                    v7b v7bVar = (v7b) view4;
                    v7bVar.b(v7bVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof v7b) {
                    v7b v7bVar2 = (v7b) view5;
                    v7bVar2.b(v7bVar2.a);
                }
                a8bVar.E0(false);
                a8bVar.N0(1);
                a8bVar.L0(false);
                s96 s96Var = oabVar.B0;
                if (s96Var != null) {
                    TLRPC.GroupCall groupCall = s96Var.s;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z = true;
                        boolean a = z48Var.a();
                        TL_stories.StoryItem storyItem2 = z48Var.a;
                        boolean z2 = storyItem2 == null && storyItem2.pinned;
                        s96 s96Var2 = oabVar.B0;
                        int m = s96Var2 != null ? 0 : (int) s96Var2.m();
                        a8bVar.v1 = z;
                        a8bVar.w1 = a;
                        a8bVar.x1 = z2;
                        a8bVar.B1 = m;
                        View[] viewPages2 = a8bVar.l1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof v7b) {
                            v7b v7bVar3 = (v7b) view2;
                            v7bVar3.b(v7bVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof v7b) {
                            v7b v7bVar4 = (v7b) view3;
                            v7bVar4.b(v7bVar4.a);
                        }
                        a8bVar.N1 = new cz6(v48Var, a8bVar, (byte) 14);
                        a8bVar.show();
                        break;
                    }
                }
                z = false;
                boolean a2 = z48Var.a();
                TL_stories.StoryItem storyItem22 = z48Var.a;
                if (storyItem22 == null) {
                }
                s96 s96Var22 = oabVar.B0;
                if (s96Var22 != null) {
                }
                a8bVar.v1 = z;
                a8bVar.w1 = a2;
                a8bVar.x1 = z2;
                a8bVar.B1 = m;
                View[] viewPages22 = a8bVar.l1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof v7b) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof v7b) {
                }
                a8bVar.N1 = new cz6(v48Var, a8bVar, (byte) 14);
                a8bVar.show();
            default:
                a58 a58Var3 = v48Var.x;
                v48 v48Var4 = a58Var3.j1;
                if (v48Var4 != null) {
                    v48Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r63Var, a58Var3.getContext());
                String M0 = jb6.M0(2131748574, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131748575, null);
                alertDialog$Builder.j(jb6.M0(2131748576, null), new cz6(v48Var, oabVar, (byte) 15));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ o48(v48 v48Var, r63 r63Var, oab oabVar, byte b) {
        this.a = b;
        this.b = v48Var;
        this.c = r63Var;
        this.d = oabVar;
    }
}
