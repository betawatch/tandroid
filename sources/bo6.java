// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class bo6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    public /* synthetic */ bo6(String str, float f, byte b) {
        this.a = b;
        this.b = str;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
            default:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
        }
    }
}
