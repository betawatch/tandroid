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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q90 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean v;

    public /* synthetic */ q90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = r2Var;
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
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.r2 r2Var = this.b;
        if (r2Var == null || !LaunchActivity.E1) {
            return;
        }
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j10 = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z10 = this.f.get();
        int i10 = this.c;
        String str = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        hi.c5 b10 = hi.c5.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
        if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.id, true);
            hi.m3 m3Var = new hi.m3(launchActivity, r2Var.getResourceProvider());
            hi.e3 e3Var = m3Var.y;
            if (e3Var != null) {
                e3Var.setWasOpenedByLinkIntent(this.s);
            }
            m3Var.x(!z11);
            int i11 = 0;
            if (z12) {
                m3Var.y(true, false, m3Var.f0);
            }
            m3Var.B0 = false;
            m3Var.l0 = launchActivity;
            m3Var.t(r2Var, b10);
            m3Var.show();
            if (tL_messages_botApp.inactive || this.v) {
                TLRPC.User user2 = MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(m3Var.H).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i12);
                    i12++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == m3Var.I) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                AndroidUtilities.runOnUIThread(new hi.u2(i11, m3Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name) : z13 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name)), 200L);
            }
        }
    }
}
