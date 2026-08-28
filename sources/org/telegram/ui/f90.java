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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean v;

    public /* synthetic */ f90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = o2Var;
        this.c = i9;
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
        Pattern pattern = LaunchActivity.x1;
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        if (o2Var == null || !LaunchActivity.y1) {
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
        int i9 = this.c;
        String str = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        mh.s4 b10 = mh.s4.b(i9, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
        if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.K, user.id, true);
            mh.c3 c3Var = new mh.c3(launchActivity, o2Var.getResourceProvider());
            mh.u2 u2Var = c3Var.x;
            if (u2Var != null) {
                u2Var.setWasOpenedByLinkIntent(this.s);
            }
            c3Var.w(!z11);
            if (z12) {
                c3Var.x(true, false, c3Var.a0);
            }
            c3Var.w0 = false;
            c3Var.g0 = launchActivity;
            c3Var.s(o2Var, b10);
            c3Var.show();
            if (tL_messages_botApp.inactive || this.v) {
                TLRPC.User user2 = MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(c3Var.C).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                    i10++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == c3Var.D) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                AndroidUtilities.runOnUIThread(new kh.o8(6, c3Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name) : z13 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name)), 200L);
            }
        }
    }
}
