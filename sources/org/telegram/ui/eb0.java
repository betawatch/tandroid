package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class eb0 implements qf.c {
    public final kb0 a;
    public final /* synthetic */ LaunchActivity b;

    public eb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new kb0(launchActivity, false);
    }

    @Override // qf.c
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.b.getWindow();
    }

    @Override // qf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // qf.c
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // qf.c
    public final /* synthetic */ void a() {
    }

    @Override // qf.c
    public final /* synthetic */ void c() {
    }

    @Override // qf.c
    public final /* synthetic */ void e() {
    }
}
