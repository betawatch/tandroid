package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
