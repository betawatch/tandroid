package androidx.activity;

import android.os.Looper;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.i implements rd.a {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.a = i11;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((w) this.receiver).d();
                return gd.k.a;
            case 1:
                ((w) this.receiver).d();
                return gd.k.a;
            case 2:
                ((ba.d) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                kotlin.jvm.internal.j.d(name, "<get-threadName>(...)");
                return Boolean.valueOf(xd.d.e(name, "Firebase Background Thread #"));
            case 3:
                ((ba.d) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                kotlin.jvm.internal.j.d(name2, "<get-threadName>(...)");
                return Boolean.valueOf(xd.d.e(name2, "Firebase Blocking Thread #"));
            default:
                ((ba.d) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
