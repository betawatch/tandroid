package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ja0 implements ye.c {
    public final ff.t0 a;
    public final /* synthetic */ LaunchActivity b;

    public ja0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.x1;
        this.a = new ff.t0(launchActivity, false);
    }

    @Override // ye.c
    public final void b() {
        Pattern pattern = LaunchActivity.x1;
        this.b.getWindow();
    }

    @Override // ye.c
    public final void d() {
        this.a.a(false);
    }

    @Override // ye.c
    public final void f() {
        Pattern pattern = LaunchActivity.x1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // ye.c
    public final /* synthetic */ void a() {
    }

    @Override // ye.c
    public final /* synthetic */ void c() {
    }

    @Override // ye.c
    public final /* synthetic */ void e() {
    }
}
