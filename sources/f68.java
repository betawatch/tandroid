// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f68 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j68 b;
    public final /* synthetic */ x53 c;
    public final /* synthetic */ lcb d;

    public /* synthetic */ f68(j68 j68Var, lcb lcbVar, x53 x53Var) {
        this.a = (byte) 2;
        this.b = j68Var;
        this.d = lcbVar;
        this.c = x53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        View view2;
        View view3;
        byte b = this.a;
        x53 x53Var = this.c;
        lcb lcbVar = this.d;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                o68 o68Var = j68Var.x;
                j68 j68Var2 = o68Var.d1;
                n68 n68Var = o68Var.y1;
                if (j68Var2 != null) {
                    j68Var2.a();
                }
                w9b w9bVar = new w9b(o68Var.getContext(), 86400, x53Var);
                w9bVar.Q0();
                w9bVar.R0(uc7.s1(o68Var.m2).j1(o68Var.l1));
                w9bVar.F1 = true;
                View[] viewPages = w9bVar.l1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof r9b) {
                    r9b r9bVar = (r9b) view4;
                    r9bVar.b(r9bVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof r9b) {
                    r9b r9bVar2 = (r9b) view5;
                    r9bVar2.b(r9bVar2.a);
                }
                w9bVar.F0(false);
                w9bVar.O0(1);
                w9bVar.M0(false);
                w96 w96Var = lcbVar.B0;
                if (w96Var != null) {
                    TLRPC.GroupCall groupCall = w96Var.s;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z = true;
                        boolean a = n68Var.a();
                        TL_stories.StoryItem storyItem = n68Var.a;
                        boolean z2 = storyItem == null && storyItem.pinned;
                        w96 w96Var2 = lcbVar.B0;
                        int m = w96Var2 != null ? 0 : (int) w96Var2.m();
                        w9bVar.v1 = z;
                        w9bVar.w1 = a;
                        w9bVar.x1 = z2;
                        w9bVar.B1 = m;
                        View[] viewPages2 = w9bVar.l1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof r9b) {
                            r9b r9bVar3 = (r9b) view2;
                            r9bVar3.b(r9bVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof r9b) {
                            r9b r9bVar4 = (r9b) view3;
                            r9bVar4.b(r9bVar4.a);
                        }
                        w9bVar.N1 = new rm6(j68Var, w9bVar, (byte) 28);
                        w9bVar.show();
                        break;
                    }
                }
                z = false;
                boolean a2 = n68Var.a();
                TL_stories.StoryItem storyItem2 = n68Var.a;
                if (storyItem2 == null) {
                }
                w96 w96Var22 = lcbVar.B0;
                if (w96Var22 != null) {
                }
                w9bVar.v1 = z;
                w9bVar.w1 = a2;
                w9bVar.x1 = z2;
                w9bVar.B1 = m;
                View[] viewPages22 = w9bVar.l1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof r9b) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof r9b) {
                }
                w9bVar.N1 = new rm6(j68Var, w9bVar, (byte) 28);
                w9bVar.show();
            case 1:
                o68 o68Var2 = j68Var.x;
                j68 j68Var3 = o68Var2.d1;
                if (j68Var3 != null) {
                    j68Var3.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x53Var, o68Var2.getContext());
                String M0 = ob6.M0(2131748571, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131748572, null);
                alertDialog$Builder.j(ob6.M0(2131748573, null), new rm6(j68Var, lcbVar, (byte) 29));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            default:
                o68 o68Var3 = j68Var.x;
                lcbVar.k1 = true;
                lcbVar.U();
                int i = o68Var3.m2;
                Context context = o68Var3.getContext();
                TL_stories.StoryItem storyItem3 = o68Var3.y1.a;
                t58 t58Var = o68Var3.M0;
                x53 x53Var2 = this.c;
                d31 d31Var = new d31(t58Var, x53Var2);
                ii7 ii7Var = new ii7(lcbVar, (byte) 13);
                int i2 = nb9.v1;
                nb9.E0(i, context, storyItem3.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem3.id))), d31Var, x53Var2, new byte[0], null, ii7Var);
                j68 j68Var4 = o68Var3.d1;
                if (j68Var4 != null) {
                    j68Var4.a();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f68(j68 j68Var, x53 x53Var, lcb lcbVar, byte b) {
        this.a = b;
        this.b = j68Var;
        this.c = x53Var;
        this.d = lcbVar;
    }
}
