// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l28 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s28 b;
    public final /* synthetic */ f53 c;
    public final /* synthetic */ m8b d;

    public /* synthetic */ l28(s28 s28Var, m8b m8bVar, f53 f53Var) {
        this.a = (byte) 0;
        this.b = s28Var;
        this.d = m8bVar;
        this.c = f53Var;
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
        f53 f53Var = this.c;
        m8b m8bVar = this.d;
        s28 s28Var = this.b;
        switch (b) {
            case 0:
                y28 y28Var = s28Var.x;
                m8bVar.k1 = true;
                m8bVar.U();
                int i = y28Var.s2;
                Context context = y28Var.getContext();
                TL_stories.StoryItem storyItem = y28Var.E1.a;
                d28 d28Var = y28Var.S0;
                f53 f53Var2 = this.c;
                u21 u21Var = new u21(d28Var, f53Var2);
                zf7 zf7Var = new zf7(m8bVar, (byte) 12);
                int i2 = b89.v1;
                b89.D0(i, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), u21Var, f53Var2, new byte[0], null, zf7Var);
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                    break;
                }
                break;
            case 1:
                y28 y28Var2 = s28Var.x;
                s28 s28Var3 = y28Var2.j1;
                x28 x28Var = y28Var2.E1;
                if (s28Var3 != null) {
                    s28Var3.a();
                }
                y5b y5bVar = new y5b(y28Var2.getContext(), 86400, f53Var);
                y5bVar.P0();
                y5bVar.Q0(na7.q1(y28Var2.s2).h1(y28Var2.r1));
                y5bVar.F1 = true;
                View[] viewPages = y5bVar.l1.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof t5b) {
                    t5b t5bVar = (t5b) view4;
                    t5bVar.b(t5bVar.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof t5b) {
                    t5b t5bVar2 = (t5b) view5;
                    t5bVar2.b(t5bVar2.a);
                }
                y5bVar.E0(false);
                y5bVar.N0(1);
                y5bVar.L0(false);
                t76 t76Var = m8bVar.B0;
                if (t76Var != null) {
                    TLRPC.GroupCall groupCall = t76Var.s;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z = true;
                        boolean a = x28Var.a();
                        TL_stories.StoryItem storyItem2 = x28Var.a;
                        boolean z2 = storyItem2 == null && storyItem2.pinned;
                        t76 t76Var2 = m8bVar.B0;
                        int m = t76Var2 != null ? 0 : (int) t76Var2.m();
                        y5bVar.v1 = z;
                        y5bVar.w1 = a;
                        y5bVar.x1 = z2;
                        y5bVar.B1 = m;
                        View[] viewPages2 = y5bVar.l1.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof t5b) {
                            t5b t5bVar3 = (t5b) view2;
                            t5bVar3.b(t5bVar3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof t5b) {
                            t5b t5bVar4 = (t5b) view3;
                            t5bVar4.b(t5bVar4.a);
                        }
                        y5bVar.N1 = new dx6(s28Var, y5bVar, (byte) 13);
                        y5bVar.show();
                        break;
                    }
                }
                z = false;
                boolean a2 = x28Var.a();
                TL_stories.StoryItem storyItem22 = x28Var.a;
                if (storyItem22 == null) {
                }
                t76 t76Var22 = m8bVar.B0;
                if (t76Var22 != null) {
                }
                y5bVar.v1 = z;
                y5bVar.w1 = a2;
                y5bVar.x1 = z2;
                y5bVar.B1 = m;
                View[] viewPages22 = y5bVar.l1.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof t5b) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof t5b) {
                }
                y5bVar.N1 = new dx6(s28Var, y5bVar, (byte) 13);
                y5bVar.show();
            default:
                y28 y28Var3 = s28Var.x;
                s28 s28Var4 = y28Var3.j1;
                if (s28Var4 != null) {
                    s28Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f53Var, y28Var3.getContext());
                String M0 = k96.M0(2131748625, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131748626, null);
                alertDialog$Builder.j(k96.M0(2131748627, null), new dx6(s28Var, m8bVar, (byte) 14));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ l28(s28 s28Var, f53 f53Var, m8b m8bVar, byte b) {
        this.a = b;
        this.b = s28Var;
        this.c = f53Var;
        this.d = m8bVar;
    }
}
