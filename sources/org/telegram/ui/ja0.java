package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
