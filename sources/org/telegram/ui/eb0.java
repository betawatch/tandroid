package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
