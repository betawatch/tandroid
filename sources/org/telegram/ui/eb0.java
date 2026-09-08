package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class eb0 implements rf.c {
    public final kb0 a;
    public final /* synthetic */ LaunchActivity b;

    public eb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new kb0(launchActivity, false);
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
