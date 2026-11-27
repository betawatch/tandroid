// default package

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class iob implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ iob(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 0:
                themeActivity.b.g1(new job(themeActivity, b2), 700, true);
                break;
            default:
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, Locale.getDefault()).getFromLocation(aob.x, aob.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                hl.c3(new bcb((Object) themeActivity, (Object) str, (byte) 4));
                break;
        }
    }
}
