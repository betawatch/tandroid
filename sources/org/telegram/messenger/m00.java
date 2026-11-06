package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class m00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ m00(f10 f10Var, String str, ij ijVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = f10Var;
        this.c = str;
        this.d = ijVar;
        this.e = j3;
        this.f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f10 f10Var = this.b;
                ij ijVar = this.d;
                long j3 = this.e;
                int i7 = this.f;
                b6.d(this.c, new p00(f10Var, ijVar, j3, i7), new p00(f10Var, ijVar, j3, i7), false);
                break;
            default:
                f10 f10Var2 = this.b;
                f10Var2.getClass();
                String str = this.c;
                if (str == null) {
                    str = "und";
                }
                ij ijVar2 = this.d;
                ijVar2.k.originalLanguage = str;
                f10Var2.getMessagesStorage().X1(this.e, ijVar2.k);
                f10Var2.w.remove(Integer.valueOf(this.f));
                f10Var2.f(ijVar2);
                break;
        }
    }
}
