package org.telegram.ui.Components;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ wr0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.b;
                bw0Var.m2 = (int) bw0Var.R0.c(AndroidUtilities.dp(14.0f));
                if (bw0Var.a0 != null) {
                    bw0Var.B1();
                }
                uu0[] uu0VarArr = bw0Var.m0;
                if (uu0VarArr != null) {
                    for (uu0 uu0Var : uu0VarArr) {
                        if (uu0Var != null) {
                            int paddingTop = uu0Var.h.getPaddingTop();
                            et0 et0Var = uu0Var.h;
                            int paddingLeft = et0Var.getPaddingLeft();
                            int g02 = bw0Var.g0(uu0Var.E);
                            int paddingRight = uu0Var.h.getPaddingRight();
                            et0 et0Var2 = uu0Var.h;
                            int f02 = bw0Var.f0(bw0Var.D0());
                            et0Var2.i3 = f02;
                            et0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                            AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop - uu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                bw0 bw0Var2 = this.b;
                g5.R(bw0Var2.getContext(), bw0Var2.x1, bw0Var2.H1, new xr0(bw0Var2));
                break;
            case 2:
                bw0 bw0Var3 = this.b;
                bw0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -bw0Var3.f1.id);
                ua0 ua0Var = new ua0(bundle, null);
                ua0Var.c = bw0Var3.f1;
                bw0Var3.x1.presentFragment(ua0Var);
                break;
            case 3:
                bw0 bw0Var4 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var4.x1;
                fi.sb D = fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount());
                long j10 = bw0Var4.l1;
                String currentLang = bw0Var4.W.getCurrentLang();
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
                vs0 vs0Var = this.b.W;
                if (vs0Var.d()) {
                    vs0Var.h();
                    break;
                } else {
                    vs0Var.f();
                    break;
                }
            case 6:
                vs0 vs0Var2 = this.b.W;
                vs0Var2.b(vs0Var2.getCurrentLang());
                break;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.b.x1;
                r2Var2.getMessagesController().setSavedViewAs(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", r2Var2.getUserConfig().getClientUserId());
                r2Var2.presentFragment(new org.telegram.ui.wn(bundle2), true);
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
                bw0 bw0Var5 = this.b;
                org.telegram.ui.ActionBar.r2 r2Var4 = bw0Var5.x1;
                TLRPC.User currentUser = r2Var4.getUserConfig().getCurrentUser();
                g5.r(r2Var4, false, null, currentUser, false, true, false, true, new p1(25, bw0Var5, currentUser));
                break;
            case 10:
                ws0 ws0Var = this.b.a0;
                ws0Var.getClass();
                ws0Var.h(null, new zh.t1(ws0Var, 1));
                break;
            case 11:
                this.b.a0.setReordering(true);
                break;
            case 12:
                bw0 bw0Var6 = this.b;
                bw0Var6.k1(false);
                org.telegram.ui.ActionBar.r5 r5Var = bw0Var6.H;
                if (r5Var != null) {
                    r5Var.f(true);
                } else {
                    bw0Var6.G.g(true);
                }
                bw0Var6.c1 = 0;
                break;
            default:
                this.b.t0();
                break;
        }
    }
}
