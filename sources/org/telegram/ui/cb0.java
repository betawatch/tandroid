package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cb0 implements rf.c {
    public final ib0 a;
    public final /* synthetic */ LaunchActivity b;

    public cb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new ib0(launchActivity, false);
    }

    @Override // rf.c
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.b.getWindow();
    }

    @Override // rf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // rf.c
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // rf.c
    public final /* synthetic */ void a() {
    }

    @Override // rf.c
    public final /* synthetic */ void c() {
    }

    @Override // rf.c
    public final /* synthetic */ void e() {
    }
}
