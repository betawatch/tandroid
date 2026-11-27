// default package

import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
