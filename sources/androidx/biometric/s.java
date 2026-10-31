package androidx.biometric;

import a3.l0;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s implements androidx.emoji2.text.k {
    public final Context a;

    public s(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // androidx.emoji2.text.k
    public void a(v7.t tVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new l0(this, tVar, threadPoolExecutor, 11));
    }

    public PackageInfo b(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }
}
