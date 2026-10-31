package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    public /* synthetic */ ue(String str, int i10, float f7) {
        this.a = i10;
        this.b = str;
        this.c = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
            default:
                w0.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
        }
    }
}
