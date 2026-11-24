// default package

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public enum c06 {
    h("DefaultIcon", R.drawable.icon_background_sa, R.mipmap.icon_foreground_sa, 2131754234, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, 2131754230, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("AquaIcon", R.drawable.icon_4_background_sa, R.mipmap.icon_foreground_sa, 2131754236, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, 2131754232, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, 2131754231, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF119("NoxIcon", R.mipmap.icon_2_background_sa, R.mipmap.icon_foreground_sa, 2131754233, true);

    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    c06(String str, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final ComponentName a(Context context) {
        ComponentName componentName = this.f;
        if (componentName != null) {
            return componentName;
        }
        ComponentName componentName2 = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.a);
        this.f = componentName2;
        return componentName2;
    }
}
