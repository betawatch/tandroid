package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class na0 implements sf.c {
    public final ta0 a;
    public final /* synthetic */ LaunchActivity b;

    public na0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.E1;
        this.a = new ta0(launchActivity, false);
    }

    @Override // sf.c
    public final void b() {
        Pattern pattern = LaunchActivity.E1;
        this.b.getWindow();
    }

    @Override // sf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // sf.c
    public final void f() {
        Pattern pattern = LaunchActivity.E1;
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
