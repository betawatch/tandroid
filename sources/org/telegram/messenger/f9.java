package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ f9(int i7, int i10, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        switch (i7) {
            case 0:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
            case 2:
                String[] strArr = MediaController.W1;
                ns.f(i11).k(ns.m2, Integer.valueOf(i10));
                break;
            case 3:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
            case 4:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i11, i10);
                break;
            case 5:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i11, i10);
                break;
            default:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                break;
        }
    }
}
