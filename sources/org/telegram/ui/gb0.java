package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gb0 implements sf.c {
    public final mb0 a;
    public final /* synthetic */ LaunchActivity b;

    public gb0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.a = new mb0(launchActivity, false);
    }

    @Override // sf.c
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.b.getWindow();
    }

    @Override // sf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // sf.c
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
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
