package ih;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ m9 d;

    public /* synthetic */ s3(b4 b4Var, m9 m9Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = 0;
        this.b = b4Var;
        this.d = m9Var;
        this.c = b6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        View view2;
        View view3;
        int i9 = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        int i10 = 1;
        m9 m9Var = this.d;
        b4 b4Var = this.b;
        int i11 = 0;
        switch (i9) {
            case 0:
                i4 i4Var = b4Var.l;
                m9Var.g1 = true;
                m9Var.P();
                int i12 = i4Var.y2;
                Context context = i4Var.getContext();
                TL_stories.StoryItem storyItem = i4Var.K1.a;
                l3 l3Var = i4Var.Y0;
                org.telegram.ui.ActionBar.b6 b6Var2 = this.c;
                oc ocVar = new oc(l3Var, b6Var2);
                bg.i iVar = new bg.i(m9Var, 19);
                int i13 = y21.v;
                y21.J(i12, context, storyItem.dialogId, true, false, new ArrayList(Collections.singleton(Integer.valueOf(storyItem.id))), ocVar, b6Var2, new byte[0], null, iVar);
                b4 b4Var2 = i4Var.p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 1:
                i4 i4Var2 = b4Var.l;
                b4 b4Var3 = i4Var2.p1;
                g4 g4Var = i4Var2.K1;
                if (b4Var3 != null) {
                    b4Var3.a();
                }
                kh.t9 t9Var = new kh.t9(i4Var2.getContext(), 86400, b6Var);
                t9Var.o1();
                t9Var.p1(MessagesController.getInstance(i4Var2.y2).getInputPeer(i4Var2.x1));
                t9Var.H = true;
                View[] viewPages = t9Var.b.getViewPages();
                View view4 = viewPages[0];
                if (view4 instanceof kh.n9) {
                    kh.n9 n9Var = (kh.n9) view4;
                    n9Var.b(n9Var.a);
                }
                View view5 = viewPages[1];
                if (view5 instanceof kh.n9) {
                    kh.n9 n9Var2 = (kh.n9) view5;
                    n9Var2.b(n9Var2.a);
                }
                t9Var.e1(false);
                t9Var.m1(1);
                t9Var.k1(false);
                f1 f1Var = m9Var.w0;
                if (f1Var != null) {
                    TLRPC.GroupCall groupCall = f1Var.v;
                    if (groupCall == null ? true : groupCall.messages_enabled) {
                        z10 = true;
                        boolean d = g4Var.d();
                        TL_stories.StoryItem storyItem2 = g4Var.a;
                        boolean z11 = storyItem2 == null && storyItem2.pinned;
                        f1 f1Var2 = m9Var.w0;
                        int j10 = f1Var2 != null ? 0 : (int) f1Var2.j();
                        t9Var.w = z10;
                        t9Var.x = d;
                        t9Var.y = z11;
                        t9Var.D = j10;
                        View[] viewPages2 = t9Var.b.getViewPages();
                        view2 = viewPages2[0];
                        if (view2 instanceof kh.n9) {
                            kh.n9 n9Var3 = (kh.n9) view2;
                            n9Var3.b(n9Var3.a);
                        }
                        view3 = viewPages2[1];
                        if (view3 instanceof kh.n9) {
                            kh.n9 n9Var4 = (kh.n9) view3;
                            n9Var4.b(n9Var4.a);
                        }
                        t9Var.P = new v3(i11, b4Var, t9Var);
                        t9Var.show();
                        break;
                    }
                }
                z10 = false;
                boolean d9 = g4Var.d();
                TL_stories.StoryItem storyItem22 = g4Var.a;
                if (storyItem22 == null) {
                }
                f1 f1Var22 = m9Var.w0;
                if (f1Var22 != null) {
                }
                t9Var.w = z10;
                t9Var.x = d9;
                t9Var.y = z11;
                t9Var.D = j10;
                View[] viewPages22 = t9Var.b.getViewPages();
                view2 = viewPages22[0];
                if (view2 instanceof kh.n9) {
                }
                view3 = viewPages22[1];
                if (view3 instanceof kh.n9) {
                }
                t9Var.P = new v3(i11, b4Var, t9Var);
                t9Var.show();
            default:
                i4 i4Var3 = b4Var.l;
                b4 b4Var4 = i4Var3.p1;
                if (b4Var4 != null) {
                    b4Var4.a();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i4Var3.getContext(), 0, b6Var);
                String string = LocaleController.getString(R.string.LiveStoryEndAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.LiveStoryEndAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.LiveStoryEndAlertButton), new v3(i10, b4Var, m9Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ s3(b4 b4Var, org.telegram.ui.ActionBar.b6 b6Var, m9 m9Var, int i9) {
        this.a = i9;
        this.b = b4Var;
        this.c = b6Var;
        this.d = m9Var;
    }
}
