package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean v;

    public /* synthetic */ ba0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = n2Var;
        this.c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z10;
        this.r = z11;
        this.s = z12;
        this.v = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        if (n2Var == null || !LaunchActivity.C1) {
            return;
        }
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j3 = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z10 = this.f.get();
        int i10 = this.c;
        String str = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        fi.f5 b10 = fi.f5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
        if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.id, true);
            fi.k3 k3Var = new fi.k3(launchActivity, n2Var.getResourceProvider());
            fi.b3 b3Var = k3Var.x;
            if (b3Var != null) {
                b3Var.setWasOpenedByLinkIntent(this.s);
            }
            k3Var.w(!z11);
            if (z12) {
                k3Var.x(true, false, k3Var.e0);
            }
            k3Var.A0 = false;
            k3Var.k0 = launchActivity;
            k3Var.s(n2Var, b10);
            k3Var.show();
            if (tL_messages_botApp.inactive || this.v) {
                TLRPC.User user2 = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(k3Var.G).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                    i11++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == k3Var.H) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                AndroidUtilities.runOnUIThread(new di.b7(26, k3Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name) : z13 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name)), 200L);
            }
        }
    }
}
