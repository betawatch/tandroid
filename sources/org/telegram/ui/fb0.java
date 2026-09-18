package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fb0 implements qf.c {
    public final lb0 a;
    public final /* synthetic */ LaunchActivity b;

    public fb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new lb0(launchActivity, false);
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
