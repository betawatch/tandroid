package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ o70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = d2Var;
        this.c = i3;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z10;
        this.r = z11;
        this.s = z12;
        this.w = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String str = LaunchActivity.E1;
        org.telegram.ui.ActionBar.d2 d2Var = this.b;
        if (d2Var == null || !LaunchActivity.G1) {
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
        int i3 = this.c;
        String str2 = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        ii.q4 b10 = ii.q4.b(i3, j10, j10, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
        if (launchActivity.O() == null || launchActivity.O().k(b10) == null) {
            org.telegram.messenger.b6.n(launchActivity.P, user.id);
            ii.a3 a3Var = new ii.a3(launchActivity, d2Var.getResourceProvider());
            ii.s2 s2Var = a3Var.E;
            if (s2Var != null) {
                s2Var.setWasOpenedByLinkIntent(this.s);
            }
            a3Var.B(!z11);
            if (z12) {
                a3Var.C(true, false, a3Var.g0);
            }
            a3Var.C0 = false;
            a3Var.m0 = launchActivity;
            a3Var.x(d2Var, b10);
            a3Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.li.b0(a3Var.I).b.bots;
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
                    if (tL_attachMenuBot.bot_id == a3Var.J) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                org.telegram.messenger.g0.i3(new ii.e(3, a3Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.bd.a0(null, null, 2131753138, a22.first_name) : z13 ? org.telegram.messenger.bd.a0(null, null, 2131753137, a22.first_name) : org.telegram.messenger.bd.a0(null, null, 2131753139, a22.first_name)), 200L);
            }
        }
    }
}
