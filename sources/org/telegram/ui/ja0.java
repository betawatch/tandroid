package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ja0 implements sf.c {
    public final pa0 a;
    public final /* synthetic */ LaunchActivity b;

    public ja0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.C1;
        this.a = new pa0(launchActivity, false);
    }

    @Override // sf.c
    public final void b() {
        Pattern pattern = LaunchActivity.C1;
        this.b.getWindow();
    }

    @Override // sf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // sf.c
    public final void f() {
        Pattern pattern = LaunchActivity.C1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // sf.c
    public final /* synthetic */ void a() {
    }

    @Override // sf.c
    public final /* synthetic */ void c() {
    }

    @Override // sf.c
    public final /* synthetic */ void e() {
    }
}
