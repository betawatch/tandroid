package oh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ i9 d;

    public /* synthetic */ q3(y3 y3Var, i9 i9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 0;
        this.b = y3Var;
        this.d = i9Var;
        this.c = g6Var;
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
        boolean z4;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        i9 i9Var = this.d;
        y3 y3Var = this.b;
        switch (i10) {
            case 0:
                f4 f4Var = y3Var.l;
                i9Var.h1 = true;
                i9Var.P();
                int i11 = f4Var.z2;
                Context context = f4Var.getContext();
                TL_stories.StoryItem storyItem = f4Var.L1.a;
                j3 j3Var = f4Var.Z0;
                org.telegram.ui.ActionBar.g6 g6Var2 = this.c;
                qc qcVar = new qc(j3Var, g6Var2);
                dg.h0 h0Var = new dg.h0(i9Var, 26);
                int i12 = q31.v;
                q31.J(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), qcVar, g6Var2, new byte[0], null, h0Var);
                y3 y3Var2 = f4Var.q1;
                if (y3Var2 != null) {
                    y3Var2.a();
                    break;
                }
                break;
            case 1:
                f4 f4Var2 = y3Var.l;
                y3 y3Var3 = f4Var2.q1;
                d4 d4Var = f4Var2.L1;
                if (y3Var3 != null) {
                    y3Var3.a();
                }
                qh.c8 c8Var = new qh.c8(f4Var2.getContext(), 86400, g6Var);
                c8Var.o1();
                c8Var.p1(MessagesController.getInstance(f4Var2.z2).getInputPeer(f4Var2.y1));
                c8Var.I = true;
                View[] viewPages = c8Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof qh.w7) {
                    qh.w7 w7Var = (qh.w7) view4;
                    w7Var.b(w7Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof qh.w7) {
                    qh.w7 w7Var2 = (qh.w7) view5;
                    w7Var2.b(w7Var2.a);
                }
                c8Var.e1(false);
                c8Var.m1(1);
                c8Var.k1(false);
                e1 e1Var = i9Var.x0;
                if (e1Var != null) {
                    TLRPC.GroupCall groupCall = e1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z4 = true;
                        boolean d = d4Var.d();
                        TL_stories.StoryItem storyItem2 = d4Var.a;
                        boolean z10 = storyItem2 == null && storyItem2.pinned;
                        e1 e1Var2 = i9Var.x0;
                        int j10 = e1Var2 != null ? 0 : (int) e1Var2.j();
                        c8Var.w = z4;
                        c8Var.x = d;
                        c8Var.y = z10;
                        c8Var.E = j10;
                        View[] viewPages2 = c8Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof qh.w7) {
                            qh.w7 w7Var3 = (qh.w7) view2;
                            w7Var3.b(w7Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof qh.w7) {
                            qh.w7 w7Var4 = (qh.w7) view3;
                            w7Var4.b(w7Var4.a);
                        }
                        c8Var.Q = new ng.w(4, y3Var, c8Var);
                        c8Var.show();
                        break;
                    }
                }
                z4 = false;
                boolean d10 = d4Var.d();
                TL_stories.StoryItem storyItem22 = d4Var.a;
                if (storyItem22 == null) {
                }
                e1 e1Var22 = i9Var.x0;
                if (e1Var22 != null) {
                }
                c8Var.w = z4;
                c8Var.x = d10;
                c8Var.y = z10;
                c8Var.E = j10;
                View[] viewPages22 = c8Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof qh.w7) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof qh.w7) {
                }
                c8Var.Q = new ng.w(4, y3Var, c8Var);
                c8Var.show();
            default:
                f4 f4Var3 = y3Var.l;
                y3 y3Var4 = f4Var3.q1;
                if (y3Var4 != null) {
                    y3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f4Var3.getContext(), 0, g6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new ng.w(5, y3Var, i9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ q3(y3 y3Var, org.telegram.ui.ActionBar.g6 g6Var, i9 i9Var, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = g6Var;
        this.d = i9Var;
    }
}
