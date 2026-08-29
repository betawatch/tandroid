package lh;

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
import org.telegram.ui.Components.tc;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ i9 d;

    public /* synthetic */ o3(w3 w3Var, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = 0;
        this.b = w3Var;
        this.d = i9Var;
        this.c = c6Var;
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
        boolean z10;
        View view2;
        View view3;
        int i10 = this.a;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        i9 i9Var = this.d;
        w3 w3Var = this.b;
        switch (i10) {
            case 0:
                d4 d4Var = w3Var.l;
                i9Var.g1 = true;
                i9Var.P();
                int i11 = d4Var.y2;
                Context context = d4Var.getContext();
                TL_stories.StoryItem storyItem = d4Var.K1.a;
                h3 h3Var = d4Var.Y0;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.c;
                tc tcVar = new tc(h3Var, c6Var2);
                ag.i0 i0Var = new ag.i0(i9Var, 26);
                int i12 = y21.v;
                y21.J(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), tcVar, c6Var2, new byte[0], null, i0Var);
                w3 w3Var2 = d4Var.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 1:
                d4 d4Var2 = w3Var.l;
                w3 w3Var3 = d4Var2.p1;
                b4 b4Var = d4Var2.K1;
                if (w3Var3 != null) {
                    w3Var3.a();
                }
                nh.e9 e9Var = new nh.e9(d4Var2.getContext(), 86400, c6Var);
                e9Var.o1();
                e9Var.p1(MessagesController.getInstance(d4Var2.y2).getInputPeer(d4Var2.x1));
                e9Var.H = true;
                View[] viewPages = e9Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof nh.y8) {
                    nh.y8 y8Var = (nh.y8) view4;
                    y8Var.b(y8Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof nh.y8) {
                    nh.y8 y8Var2 = (nh.y8) view5;
                    y8Var2.b(y8Var2.a);
                }
                e9Var.e1(false);
                e9Var.m1(1);
                e9Var.k1(false);
                d1 d1Var = i9Var.w0;
                if (d1Var != null) {
                    TLRPC.GroupCall groupCall = d1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = b4Var.d();
                        TL_stories.StoryItem storyItem2 = b4Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        d1 d1Var2 = i9Var.w0;
                        int j10 = d1Var2 != null ? 0 : (int) d1Var2.j();
                        e9Var.w = z10;
                        e9Var.x = d;
                        e9Var.y = z11;
                        e9Var.D = j10;
                        View[] viewPages2 = e9Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof nh.y8) {
                            nh.y8 y8Var3 = (nh.y8) view2;
                            y8Var3.b(y8Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof nh.y8) {
                            nh.y8 y8Var4 = (nh.y8) view3;
                            y8Var4.b(y8Var4.a);
                        }
                        e9Var.P = new kg.w(3, w3Var, e9Var);
                        e9Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d10 = b4Var.d();
                TL_stories.StoryItem storyItem22 = b4Var.a;
                if (storyItem22 == null) {
                }
                d1 d1Var22 = i9Var.w0;
                if (d1Var22 != null) {
                }
                e9Var.w = z10;
                e9Var.x = d10;
                e9Var.y = z11;
                e9Var.D = j10;
                View[] viewPages22 = e9Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof nh.y8) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof nh.y8) {
                }
                e9Var.P = new kg.w(3, w3Var, e9Var);
                e9Var.show();
            default:
                d4 d4Var3 = w3Var.l;
                w3 w3Var4 = d4Var3.p1;
                if (w3Var4 != null) {
                    w3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d4Var3.getContext(), 0, c6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new kg.w(4, w3Var, i9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ o3(w3 w3Var, org.telegram.ui.ActionBar.c6 c6Var, i9 i9Var, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = c6Var;
        this.d = i9Var;
    }
}
