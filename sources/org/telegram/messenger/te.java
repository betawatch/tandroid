package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    public /* synthetic */ te(String str, int i7, float f10) {
        this.a = i7;
        this.b = str;
        this.c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
            default:
                t0.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
        }
    }
}
