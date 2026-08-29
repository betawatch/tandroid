package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ma0 implements bf.c {
    public final jf.s0 a;
    public final /* synthetic */ LaunchActivity b;

    public ma0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.x1;
        this.a = new jf.s0(launchActivity, false);
    }

    @Override // bf.c
    public final void b() {
        Pattern pattern = LaunchActivity.x1;
        this.b.getWindow();
    }

    @Override // bf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // bf.c
    public final void f() {
        Pattern pattern = LaunchActivity.x1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // bf.c
    public final /* synthetic */ void a() {
    }

    @Override // bf.c
    public final /* synthetic */ void c() {
    }

    @Override // bf.c
    public final /* synthetic */ void e() {
    }
}
