// default package

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ia9 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public ia9(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
