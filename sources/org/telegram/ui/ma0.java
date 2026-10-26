package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ma0 implements tf.c {
    public final ag.b1 a;
    public final /* synthetic */ LaunchActivity b;

    public ma0(LaunchActivity launchActivity) {
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
