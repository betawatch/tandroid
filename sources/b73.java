// default package

import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class b73 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ b73(DataSettingsActivity dataSettingsActivity, byte b) {
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
                z61.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                b73 b73Var = new b73(dataSettingsActivity2, b2);
                hl.d3(b73Var, 100L);
                z61.c0(new p4c((Object) dataSettingsActivity2, (Object) b73Var, System.currentTimeMillis(), (byte) 1));
                break;
        }
    }
}
