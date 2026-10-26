package org.telegram.ui.Components;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ vr0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aw0 aw0Var = this.b;
                aw0Var.m2 = (int) aw0Var.R0.c(AndroidUtilities.dp(14.0f));
                if (aw0Var.a0 != null) {
                    aw0Var.B1();
                }
                tu0[] tu0VarArr = aw0Var.m0;
                if (tu0VarArr != null) {
                    for (tu0 tu0Var : tu0VarArr) {
                        if (tu0Var != null) {
                            int paddingTop = tu0Var.h.getPaddingTop();
                            dt0 dt0Var = tu0Var.h;
                            int paddingLeft = dt0Var.getPaddingLeft();
                            int g02 = aw0Var.g0(tu0Var.E);
                            int paddingRight = tu0Var.h.getPaddingRight();
                            dt0 dt0Var2 = tu0Var.h;
                            int f02 = aw0Var.f0(aw0Var.D0());
                            dt0Var2.i3 = f02;
                            dt0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                            AndroidUtilities.doOnLayout(tu0Var.h, new es0(tu0Var, paddingTop - tu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                aw0 aw0Var2 = this.b;
                g5.R(aw0Var2.getContext(), aw0Var2.x1, aw0Var2.H1, new wr0(aw0Var2));
                break;
            case 2:
                aw0 aw0Var3 = this.b;
                aw0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -aw0Var3.f1.id);
                ta0 ta0Var = new ta0(bundle, null);
                ta0Var.c = aw0Var3.f1;
                aw0Var3.x1.presentFragment(ta0Var);
                break;
            case 3:
                aw0 aw0Var4 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var4.x1;
                fi.sb D = fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount());
                long j10 = aw0Var4.l1;
                String currentLang = aw0Var4.W.getCurrentLang();
                D.v0 = j10;
                D.w0 = currentLang;
                D.Q(null);
                D.v0 = j10;
                D.w0 = currentLang;
                break;
            case 4:
                this.b.W.f();
                break;
            case 5:
                us0 us0Var = this.b.W;
                if (us0Var.d()) {
                    us0Var.h();
                    break;
                } else {
                    us0Var.f();
                    break;
                }
            case 6:
                us0 us0Var2 = this.b.W;
                us0Var2.b(us0Var2.getCurrentLang());
                break;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.b.x1;
                r2Var2.getMessagesController().setSavedViewAs(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", r2Var2.getUserConfig().getClientUserId());
                r2Var2.presentFragment(new org.telegram.ui.un(bundle2), true);
                break;
            case 8:
                org.telegram.ui.ActionBar.r2 r2Var3 = this.b.x1;
                try {
                    r2Var3.getMediaDataController().installShortcut(r2Var3.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                aw0 aw0Var5 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var4 = aw0Var5.x1;
                TLRPC.User currentUser = r2Var4.getUserConfig().getCurrentUser();
                g5.r(r2Var4, false, null, currentUser, false, true, false, true, new p1(25, aw0Var5, currentUser));
                break;
            case 10:
                vs0 vs0Var = this.b.a0;
                vs0Var.getClass();
                vs0Var.h(null, new zh.t1(vs0Var, 1));
                break;
            case 11:
                this.b.a0.setReordering(true);
                break;
            case 12:
                aw0 aw0Var6 = this.b;
                aw0Var6.k1(false);
                org.telegram.ui.ActionBar.r5 r5Var = aw0Var6.H;
                if (r5Var != null) {
                    r5Var.f(true);
                } else {
                    aw0Var6.G.g(true);
                }
                aw0Var6.c1 = 0;
                break;
            default:
                this.b.t0();
                break;
        }
    }
}
