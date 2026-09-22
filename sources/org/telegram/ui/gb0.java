package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gb0 implements qf.c {
    public final mb0 a;
    public final /* synthetic */ LaunchActivity b;

    public gb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new mb0(launchActivity, false);
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
