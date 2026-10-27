package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oa0 implements tf.c {
    public final ag.b1 a;
    public final /* synthetic */ LaunchActivity b;

    public oa0(LaunchActivity launchActivity) {
        this.b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.a = new ag.b1(launchActivity, false);
    }

    @Override // tf.c
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.b.getWindow();
    }

    @Override // tf.c
    public final void d() {
        this.a.a(false);
    }

    @Override // tf.c
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.b;
        launchActivity.getClass();
        this.a.a(true);
        launchActivity.getWindow();
    }

    @Override // tf.c
    public final /* synthetic */ void a() {
    }

    @Override // tf.c
    public final /* synthetic */ void c() {
    }

    @Override // tf.c
    public final /* synthetic */ void e() {
    }
}
