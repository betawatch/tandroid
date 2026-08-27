package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class na0 implements ze.c {
    public final gf.t0 a;
    public final /* synthetic */ LaunchActivity b;

    public na0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.x1;
        this.a = new gf.t0(launchActivity, false);
    }

    @Override // ze.c
    public final void b() {
        Pattern pattern = LaunchActivity.x1;
        this.b.getWindow();
    }

    @Override // ze.c
    public final void d() {
        this.a.a(false);
    }

    @Override // ze.c
    public final void f() {
        Pattern pattern = LaunchActivity.x1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // ze.c
    public final /* synthetic */ void a() {
    }

    @Override // ze.c
    public final /* synthetic */ void c() {
    }

    @Override // ze.c
    public final /* synthetic */ void e() {
    }
}
