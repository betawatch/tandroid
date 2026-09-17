package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
