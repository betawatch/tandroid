// default package

import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class i63 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ i63(DataSettingsActivity dataSettingsActivity, byte b) {
        this.a = b;
        this.b = dataSettingsActivity;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r9;
        byte b = this.a;
        DataSettingsActivity dataSettingsActivity = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                dataSettingsActivity.getMediaDataController().G(true);
                break;
            case 1:
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.a != null && (r9 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.r0(r9 == true ? 1 : 0);
                    break;
                }
                break;
            default:
                r61.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                i63 i63Var = new i63(dataSettingsActivity2, b2);
                gl.d3(i63Var, 100L);
                r61.c0(new p0c((Object) dataSettingsActivity2, (Object) i63Var, System.currentTimeMillis(), (byte) 1));
                break;
        }
    }
}
