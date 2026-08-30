package nh;

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
import org.telegram.ui.k31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ i9 d;

    public /* synthetic */ p3(w3 w3Var, i9 i9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = 0;
        this.b = w3Var;
        this.d = i9Var;
        this.c = f6Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        i9 i9Var = this.d;
        w3 w3Var = this.b;
        switch (i10) {
            case 0:
                d4 d4Var = w3Var.l;
                i9Var.h1 = true;
                i9Var.P();
                int i11 = d4Var.z2;
                Context context = d4Var.getContext();
                TL_stories.StoryItem storyItem = d4Var.L1.a;
                i3 i3Var = d4Var.Z0;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                qc qcVar = new qc(i3Var, f6Var2);
                cg.h0 h0Var = new cg.h0(i9Var, 26);
                int i12 = k31.v;
                k31.J(i11, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), qcVar, f6Var2, new byte[0], null, h0Var);
                w3 w3Var2 = d4Var.q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 1:
                d4 d4Var2 = w3Var.l;
                w3 w3Var3 = d4Var2.q1;
                b4 b4Var = d4Var2.L1;
                if (w3Var3 != null) {
                    w3Var3.a();
                }
                ph.f8 f8Var = new ph.f8(d4Var2.getContext(), 86400, f6Var);
                f8Var.o1();
                f8Var.p1(MessagesController.getInstance(d4Var2.z2).getInputPeer(d4Var2.y1));
                f8Var.I = true;
                View[] viewPages = f8Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof ph.z7) {
                    ph.z7 z7Var = (ph.z7) view4;
                    z7Var.b(z7Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof ph.z7) {
                    ph.z7 z7Var2 = (ph.z7) view5;
                    z7Var2.b(z7Var2.a);
                }
                f8Var.e1(false);
                f8Var.m1(1);
                f8Var.k1(false);
                e1 e1Var = i9Var.x0;
                if (e1Var != null) {
                    TLRPC.GroupCall groupCall = e1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z4 = true;
                        boolean d = b4Var.d();
                        TL_stories.StoryItem storyItem2 = b4Var.a;
                        boolean z10 = storyItem2 == null && storyItem2.pinned;
                        e1 e1Var2 = i9Var.x0;
                        int j10 = e1Var2 != null ? 0 : (int) e1Var2.j();
                        f8Var.w = z4;
                        f8Var.x = d;
                        f8Var.y = z10;
                        f8Var.E = j10;
                        View[] viewPages2 = f8Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof ph.z7) {
                            ph.z7 z7Var3 = (ph.z7) view2;
                            z7Var3.b(z7Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof ph.z7) {
                            ph.z7 z7Var4 = (ph.z7) view3;
                            z7Var4.b(z7Var4.a);
                        }
                        f8Var.Q = new mg.w(3, w3Var, f8Var);
                        f8Var.show();
                        break;
                    }
                }
                z4 = false;
                boolean d10 = b4Var.d();
                TL_stories.StoryItem storyItem22 = b4Var.a;
                if (storyItem22 == null) {
                }
                e1 e1Var22 = i9Var.x0;
                if (e1Var22 != null) {
                }
                f8Var.w = z4;
                f8Var.x = d10;
                f8Var.y = z10;
                f8Var.E = j10;
                View[] viewPages22 = f8Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof ph.z7) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof ph.z7) {
                }
                f8Var.Q = new mg.w(3, w3Var, f8Var);
                f8Var.show();
            default:
                d4 d4Var3 = w3Var.l;
                w3 w3Var4 = d4Var3.q1;
                if (w3Var4 != null) {
                    w3Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d4Var3.getContext(), 0, f6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new mg.w(4, w3Var, i9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ p3(w3 w3Var, org.telegram.ui.ActionBar.f6 f6Var, i9 i9Var, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = f6Var;
        this.d = i9Var;
    }
}
